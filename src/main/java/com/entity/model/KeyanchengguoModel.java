package com.entity.model;

import com.entity.KeyanchengguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 科研成果
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KeyanchengguoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 教师
     */
    private Integer jiaoshiId;


    /**
     * 科研成果名称
     */
    private String keyanchengguoName;


    /**
     * 科研成果编号
     */
    private String keyanchengguoUuidNumber;


    /**
     * 科研成果相关文件
     */
    private String keyanchengguoFile;


    /**
     * 科研成果照片
     */
    private String keyanchengguoPhoto;


    /**
     * 科研成果类型
     */
    private Integer keyanchengguoTypes;


    /**
     * 科研成果热度
     */
    private Integer keyanchengguoClicknum;


    /**
     * 科研成果详细介绍
     */
    private String keyanchengguoContent;


    /**
     * 是否展示
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer keyanchengguoDelete;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 设置：教师
	 */
    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：科研成果名称
	 */
    public String getKeyanchengguoName() {
        return keyanchengguoName;
    }


    /**
	 * 设置：科研成果名称
	 */
    public void setKeyanchengguoName(String keyanchengguoName) {
        this.keyanchengguoName = keyanchengguoName;
    }
    /**
	 * 获取：科研成果编号
	 */
    public String getKeyanchengguoUuidNumber() {
        return keyanchengguoUuidNumber;
    }


    /**
	 * 设置：科研成果编号
	 */
    public void setKeyanchengguoUuidNumber(String keyanchengguoUuidNumber) {
        this.keyanchengguoUuidNumber = keyanchengguoUuidNumber;
    }
    /**
	 * 获取：科研成果相关文件
	 */
    public String getKeyanchengguoFile() {
        return keyanchengguoFile;
    }


    /**
	 * 设置：科研成果相关文件
	 */
    public void setKeyanchengguoFile(String keyanchengguoFile) {
        this.keyanchengguoFile = keyanchengguoFile;
    }
    /**
	 * 获取：科研成果照片
	 */
    public String getKeyanchengguoPhoto() {
        return keyanchengguoPhoto;
    }


    /**
	 * 设置：科研成果照片
	 */
    public void setKeyanchengguoPhoto(String keyanchengguoPhoto) {
        this.keyanchengguoPhoto = keyanchengguoPhoto;
    }
    /**
	 * 获取：科研成果类型
	 */
    public Integer getKeyanchengguoTypes() {
        return keyanchengguoTypes;
    }


    /**
	 * 设置：科研成果类型
	 */
    public void setKeyanchengguoTypes(Integer keyanchengguoTypes) {
        this.keyanchengguoTypes = keyanchengguoTypes;
    }
    /**
	 * 获取：科研成果热度
	 */
    public Integer getKeyanchengguoClicknum() {
        return keyanchengguoClicknum;
    }


    /**
	 * 设置：科研成果热度
	 */
    public void setKeyanchengguoClicknum(Integer keyanchengguoClicknum) {
        this.keyanchengguoClicknum = keyanchengguoClicknum;
    }
    /**
	 * 获取：科研成果详细介绍
	 */
    public String getKeyanchengguoContent() {
        return keyanchengguoContent;
    }


    /**
	 * 设置：科研成果详细介绍
	 */
    public void setKeyanchengguoContent(String keyanchengguoContent) {
        this.keyanchengguoContent = keyanchengguoContent;
    }
    /**
	 * 获取：是否展示
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否展示
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getKeyanchengguoDelete() {
        return keyanchengguoDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setKeyanchengguoDelete(Integer keyanchengguoDelete) {
        this.keyanchengguoDelete = keyanchengguoDelete;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
