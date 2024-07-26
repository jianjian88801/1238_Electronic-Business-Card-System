
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 科研成果
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/keyanchengguo")
public class KeyanchengguoController {
    private static final Logger logger = LoggerFactory.getLogger(KeyanchengguoController.class);

    @Autowired
    private KeyanchengguoService keyanchengguoService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private JiaoshiService jiaoshiService;

    @Autowired
    private XueshengService xueshengService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("学生".equals(role))
            params.put("xueshengId",request.getSession().getAttribute("userId"));
        else if("教师".equals(role))
            params.put("jiaoshiId",request.getSession().getAttribute("userId"));
        params.put("keyanchengguoDeleteStart",1);params.put("keyanchengguoDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = keyanchengguoService.queryPage(params);

        //字典表数据转换
        List<KeyanchengguoView> list =(List<KeyanchengguoView>)page.getList();
        for(KeyanchengguoView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        KeyanchengguoEntity keyanchengguo = keyanchengguoService.selectById(id);
        if(keyanchengguo !=null){
            //entity转view
            KeyanchengguoView view = new KeyanchengguoView();
            BeanUtils.copyProperties( keyanchengguo , view );//把实体数据重构到view中

                //级联表
                JiaoshiEntity jiaoshi = jiaoshiService.selectById(keyanchengguo.getJiaoshiId());
                if(jiaoshi != null){
                    BeanUtils.copyProperties( jiaoshi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setJiaoshiId(jiaoshi.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody KeyanchengguoEntity keyanchengguo, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,keyanchengguo:{}",this.getClass().getName(),keyanchengguo.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("教师".equals(role))
            keyanchengguo.setJiaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<KeyanchengguoEntity> queryWrapper = new EntityWrapper<KeyanchengguoEntity>()
            .eq("jiaoshi_id", keyanchengguo.getJiaoshiId())
            .eq("keyanchengguo_name", keyanchengguo.getKeyanchengguoName())
            .eq("keyanchengguo_uuid_number", keyanchengguo.getKeyanchengguoUuidNumber())
            .eq("keyanchengguo_types", keyanchengguo.getKeyanchengguoTypes())
            .eq("keyanchengguo_clicknum", keyanchengguo.getKeyanchengguoClicknum())
            .eq("shangxia_types", keyanchengguo.getShangxiaTypes())
            .eq("keyanchengguo_delete", keyanchengguo.getKeyanchengguoDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        KeyanchengguoEntity keyanchengguoEntity = keyanchengguoService.selectOne(queryWrapper);
        if(keyanchengguoEntity==null){
            keyanchengguo.setKeyanchengguoClicknum(1);
            keyanchengguo.setShangxiaTypes(1);
            keyanchengguo.setKeyanchengguoDelete(1);
            keyanchengguo.setCreateTime(new Date());
            keyanchengguoService.insert(keyanchengguo);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody KeyanchengguoEntity keyanchengguo, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,keyanchengguo:{}",this.getClass().getName(),keyanchengguo.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("教师".equals(role))
//            keyanchengguo.setJiaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<KeyanchengguoEntity> queryWrapper = new EntityWrapper<KeyanchengguoEntity>()
            .notIn("id",keyanchengguo.getId())
            .andNew()
            .eq("jiaoshi_id", keyanchengguo.getJiaoshiId())
            .eq("keyanchengguo_name", keyanchengguo.getKeyanchengguoName())
            .eq("keyanchengguo_uuid_number", keyanchengguo.getKeyanchengguoUuidNumber())
            .eq("keyanchengguo_types", keyanchengguo.getKeyanchengguoTypes())
            .eq("keyanchengguo_clicknum", keyanchengguo.getKeyanchengguoClicknum())
            .eq("shangxia_types", keyanchengguo.getShangxiaTypes())
            .eq("keyanchengguo_delete", keyanchengguo.getKeyanchengguoDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        KeyanchengguoEntity keyanchengguoEntity = keyanchengguoService.selectOne(queryWrapper);
        if("".equals(keyanchengguo.getKeyanchengguoFile()) || "null".equals(keyanchengguo.getKeyanchengguoFile())){
                keyanchengguo.setKeyanchengguoFile(null);
        }
        if("".equals(keyanchengguo.getKeyanchengguoPhoto()) || "null".equals(keyanchengguo.getKeyanchengguoPhoto())){
                keyanchengguo.setKeyanchengguoPhoto(null);
        }
        if(keyanchengguoEntity==null){
            keyanchengguoService.updateById(keyanchengguo);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<KeyanchengguoEntity> list = new ArrayList<>();
        for(Integer id:ids){
            KeyanchengguoEntity keyanchengguoEntity = new KeyanchengguoEntity();
            keyanchengguoEntity.setId(id);
            keyanchengguoEntity.setKeyanchengguoDelete(2);
            list.add(keyanchengguoEntity);
        }
        if(list != null && list.size() >0){
            keyanchengguoService.updateBatchById(list);
        }
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<KeyanchengguoEntity> keyanchengguoList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            KeyanchengguoEntity keyanchengguoEntity = new KeyanchengguoEntity();
//                            keyanchengguoEntity.setJiaoshiId(Integer.valueOf(data.get(0)));   //教师 要改的
//                            keyanchengguoEntity.setKeyanchengguoName(data.get(0));                    //科研成果名称 要改的
//                            keyanchengguoEntity.setKeyanchengguoUuidNumber(data.get(0));                    //科研成果编号 要改的
//                            keyanchengguoEntity.setKeyanchengguoFile(data.get(0));                    //科研成果相关文件 要改的
//                            keyanchengguoEntity.setKeyanchengguoPhoto("");//详情和图片
//                            keyanchengguoEntity.setKeyanchengguoTypes(Integer.valueOf(data.get(0)));   //科研成果类型 要改的
//                            keyanchengguoEntity.setKeyanchengguoClicknum(Integer.valueOf(data.get(0)));   //科研成果热度 要改的
//                            keyanchengguoEntity.setKeyanchengguoContent("");//详情和图片
//                            keyanchengguoEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否展示 要改的
//                            keyanchengguoEntity.setKeyanchengguoDelete(1);//逻辑删除字段
//                            keyanchengguoEntity.setCreateTime(date);//时间
                            keyanchengguoList.add(keyanchengguoEntity);


                            //把要查询是否重复的字段放入map中
                                //科研成果编号
                                if(seachFields.containsKey("keyanchengguoUuidNumber")){
                                    List<String> keyanchengguoUuidNumber = seachFields.get("keyanchengguoUuidNumber");
                                    keyanchengguoUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> keyanchengguoUuidNumber = new ArrayList<>();
                                    keyanchengguoUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("keyanchengguoUuidNumber",keyanchengguoUuidNumber);
                                }
                        }

                        //查询是否重复
                         //科研成果编号
                        List<KeyanchengguoEntity> keyanchengguoEntities_keyanchengguoUuidNumber = keyanchengguoService.selectList(new EntityWrapper<KeyanchengguoEntity>().in("keyanchengguo_uuid_number", seachFields.get("keyanchengguoUuidNumber")).eq("keyanchengguo_delete", 1));
                        if(keyanchengguoEntities_keyanchengguoUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(KeyanchengguoEntity s:keyanchengguoEntities_keyanchengguoUuidNumber){
                                repeatFields.add(s.getKeyanchengguoUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [科研成果编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        keyanchengguoService.insertBatch(keyanchengguoList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = keyanchengguoService.queryPage(params);

        //字典表数据转换
        List<KeyanchengguoView> list =(List<KeyanchengguoView>)page.getList();
        for(KeyanchengguoView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        KeyanchengguoEntity keyanchengguo = keyanchengguoService.selectById(id);
            if(keyanchengguo !=null){

                //点击数量加1
                keyanchengguo.setKeyanchengguoClicknum(keyanchengguo.getKeyanchengguoClicknum()+1);
                keyanchengguoService.updateById(keyanchengguo);

                //entity转view
                KeyanchengguoView view = new KeyanchengguoView();
                BeanUtils.copyProperties( keyanchengguo , view );//把实体数据重构到view中

                //级联表
                    JiaoshiEntity jiaoshi = jiaoshiService.selectById(keyanchengguo.getJiaoshiId());
                if(jiaoshi != null){
                    BeanUtils.copyProperties( jiaoshi , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setJiaoshiId(jiaoshi.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody KeyanchengguoEntity keyanchengguo, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,keyanchengguo:{}",this.getClass().getName(),keyanchengguo.toString());
        Wrapper<KeyanchengguoEntity> queryWrapper = new EntityWrapper<KeyanchengguoEntity>()
            .eq("jiaoshi_id", keyanchengguo.getJiaoshiId())
            .eq("keyanchengguo_name", keyanchengguo.getKeyanchengguoName())
            .eq("keyanchengguo_uuid_number", keyanchengguo.getKeyanchengguoUuidNumber())
            .eq("keyanchengguo_types", keyanchengguo.getKeyanchengguoTypes())
            .eq("keyanchengguo_clicknum", keyanchengguo.getKeyanchengguoClicknum())
            .eq("shangxia_types", keyanchengguo.getShangxiaTypes())
            .eq("keyanchengguo_delete", keyanchengguo.getKeyanchengguoDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        KeyanchengguoEntity keyanchengguoEntity = keyanchengguoService.selectOne(queryWrapper);
        if(keyanchengguoEntity==null){
            keyanchengguo.setKeyanchengguoDelete(1);
            keyanchengguo.setCreateTime(new Date());
        keyanchengguoService.insert(keyanchengguo);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
