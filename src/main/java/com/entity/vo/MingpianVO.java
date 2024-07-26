package com.entity.vo;

import com.entity.MingpianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 名片
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("mingpian")
public class MingpianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 教师
     */

    @TableField(value = "jiaoshi_id")
    private Integer jiaoshiId;


    /**
     * 名片名称
     */

    @TableField(value = "mingpian_name")
    private String mingpianName;


    /**
     * 名片编号
     */

    @TableField(value = "mingpian_uuid_number")
    private String mingpianUuidNumber;


    /**
     * 姓名
     */

    @TableField(value = "mingpian_xingming")
    private String mingpianXingming;


    /**
     * 联系电话
     */

    @TableField(value = "mingpian_phone")
    private String mingpianPhone;


    /**
     * 名片文件
     */

    @TableField(value = "mingpian_file")
    private String mingpianFile;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 职务
     */

    @TableField(value = "zhiwu_types")
    private Integer zhiwuTypes;


    /**
     * 名片照片
     */

    @TableField(value = "mingpian_photo")
    private String mingpianPhoto;


    /**
     * 名片类型
     */

    @TableField(value = "mingpian_types")
    private Integer mingpianTypes;


    /**
     * 学院
     */

    @TableField(value = "xueyuan_types")
    private Integer xueyuanTypes;


    /**
     * 办公室
     */

    @TableField(value = "bangongshi_types")
    private Integer bangongshiTypes;


    /**
     * 主修课程
     */

    @TableField(value = "kecheng_types")
    private Integer kechengTypes;


    /**
     * 名片热度
     */

    @TableField(value = "mingpian_clicknum")
    private Integer mingpianClicknum;


    /**
     * 名片详细介绍
     */

    @TableField(value = "mingpian_content")
    private String mingpianContent;


    /**
     * 是否展示
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "mingpian_delete")
    private Integer mingpianDelete;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：名片名称
	 */
    public String getMingpianName() {
        return mingpianName;
    }


    /**
	 * 获取：名片名称
	 */

    public void setMingpianName(String mingpianName) {
        this.mingpianName = mingpianName;
    }
    /**
	 * 设置：名片编号
	 */
    public String getMingpianUuidNumber() {
        return mingpianUuidNumber;
    }


    /**
	 * 获取：名片编号
	 */

    public void setMingpianUuidNumber(String mingpianUuidNumber) {
        this.mingpianUuidNumber = mingpianUuidNumber;
    }
    /**
	 * 设置：姓名
	 */
    public String getMingpianXingming() {
        return mingpianXingming;
    }


    /**
	 * 获取：姓名
	 */

    public void setMingpianXingming(String mingpianXingming) {
        this.mingpianXingming = mingpianXingming;
    }
    /**
	 * 设置：联系电话
	 */
    public String getMingpianPhone() {
        return mingpianPhone;
    }


    /**
	 * 获取：联系电话
	 */

    public void setMingpianPhone(String mingpianPhone) {
        this.mingpianPhone = mingpianPhone;
    }
    /**
	 * 设置：名片文件
	 */
    public String getMingpianFile() {
        return mingpianFile;
    }


    /**
	 * 获取：名片文件
	 */

    public void setMingpianFile(String mingpianFile) {
        this.mingpianFile = mingpianFile;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：职务
	 */
    public Integer getZhiwuTypes() {
        return zhiwuTypes;
    }


    /**
	 * 获取：职务
	 */

    public void setZhiwuTypes(Integer zhiwuTypes) {
        this.zhiwuTypes = zhiwuTypes;
    }
    /**
	 * 设置：名片照片
	 */
    public String getMingpianPhoto() {
        return mingpianPhoto;
    }


    /**
	 * 获取：名片照片
	 */

    public void setMingpianPhoto(String mingpianPhoto) {
        this.mingpianPhoto = mingpianPhoto;
    }
    /**
	 * 设置：名片类型
	 */
    public Integer getMingpianTypes() {
        return mingpianTypes;
    }


    /**
	 * 获取：名片类型
	 */

    public void setMingpianTypes(Integer mingpianTypes) {
        this.mingpianTypes = mingpianTypes;
    }
    /**
	 * 设置：学院
	 */
    public Integer getXueyuanTypes() {
        return xueyuanTypes;
    }


    /**
	 * 获取：学院
	 */

    public void setXueyuanTypes(Integer xueyuanTypes) {
        this.xueyuanTypes = xueyuanTypes;
    }
    /**
	 * 设置：办公室
	 */
    public Integer getBangongshiTypes() {
        return bangongshiTypes;
    }


    /**
	 * 获取：办公室
	 */

    public void setBangongshiTypes(Integer bangongshiTypes) {
        this.bangongshiTypes = bangongshiTypes;
    }
    /**
	 * 设置：主修课程
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 获取：主修课程
	 */

    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 设置：名片热度
	 */
    public Integer getMingpianClicknum() {
        return mingpianClicknum;
    }


    /**
	 * 获取：名片热度
	 */

    public void setMingpianClicknum(Integer mingpianClicknum) {
        this.mingpianClicknum = mingpianClicknum;
    }
    /**
	 * 设置：名片详细介绍
	 */
    public String getMingpianContent() {
        return mingpianContent;
    }


    /**
	 * 获取：名片详细介绍
	 */

    public void setMingpianContent(String mingpianContent) {
        this.mingpianContent = mingpianContent;
    }
    /**
	 * 设置：是否展示
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否展示
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getMingpianDelete() {
        return mingpianDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setMingpianDelete(Integer mingpianDelete) {
        this.mingpianDelete = mingpianDelete;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
