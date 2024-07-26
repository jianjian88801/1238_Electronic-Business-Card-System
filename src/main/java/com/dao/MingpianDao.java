package com.dao;

import com.entity.MingpianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MingpianView;

/**
 * 名片 Dao 接口
 *
 * @author 
 */
public interface MingpianDao extends BaseMapper<MingpianEntity> {

   List<MingpianView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
