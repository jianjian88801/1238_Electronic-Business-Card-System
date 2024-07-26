package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 科研成果
 *
 * @author 
 * @email
 */
@TableName("keyanchengguo")
public class KeyanchengguoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KeyanchengguoEntity() {

	}

	public KeyanchengguoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 科研成果名称
     */
    @TableField(value = "keyanchengguo_name")

    private String keyanchengguoName;


    /**
     * 科研成果编号
     */
    @TableField(value = "keyanchengguo_uuid_number")

    private String keyanchengguoUuidNumber;


    /**
     * 科研成果相关文件
     */
    @TableField(value = "keyanchengguo_file")

    private String keyanchengguoFile;


    /**
     * 科研成果照片
     */
    @TableField(value = "keyanchengguo_photo")

    private String keyanchengguoPhoto;


    /**
     * 科研成果类型
     */
    @TableField(value = "keyanchengguo_types")

    private Integer keyanchengguoTypes;


    /**
     * 科研成果热度
     */
    @TableField(value = "keyanchengguo_clicknum")

    private Integer keyanchengguoClicknum;


    /**
     * 科研成果详细介绍
     */
    @TableField(value = "keyanchengguo_content")

    private String keyanchengguoContent;


    /**
     * 是否展示
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "keyanchengguo_delete")

    private Integer keyanchengguoDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：科研成果名称
	 */
    public String getKeyanchengguoName() {
        return keyanchengguoName;
    }
    /**
	 * 获取：科研成果名称
	 */

    public void setKeyanchengguoName(String keyanchengguoName) {
        this.keyanchengguoName = keyanchengguoName;
    }
    /**
	 * 设置：科研成果编号
	 */
    public String getKeyanchengguoUuidNumber() {
        return keyanchengguoUuidNumber;
    }
    /**
	 * 获取：科研成果编号
	 */

    public void setKeyanchengguoUuidNumber(String keyanchengguoUuidNumber) {
        this.keyanchengguoUuidNumber = keyanchengguoUuidNumber;
    }
    /**
	 * 设置：科研成果相关文件
	 */
    public String getKeyanchengguoFile() {
        return keyanchengguoFile;
    }
    /**
	 * 获取：科研成果相关文件
	 */

    public void setKeyanchengguoFile(String keyanchengguoFile) {
        this.keyanchengguoFile = keyanchengguoFile;
    }
    /**
	 * 设置：科研成果照片
	 */
    public String getKeyanchengguoPhoto() {
        return keyanchengguoPhoto;
    }
    /**
	 * 获取：科研成果照片
	 */

    public void setKeyanchengguoPhoto(String keyanchengguoPhoto) {
        this.keyanchengguoPhoto = keyanchengguoPhoto;
    }
    /**
	 * 设置：科研成果类型
	 */
    public Integer getKeyanchengguoTypes() {
        return keyanchengguoTypes;
    }
    /**
	 * 获取：科研成果类型
	 */

    public void setKeyanchengguoTypes(Integer keyanchengguoTypes) {
        this.keyanchengguoTypes = keyanchengguoTypes;
    }
    /**
	 * 设置：科研成果热度
	 */
    public Integer getKeyanchengguoClicknum() {
        return keyanchengguoClicknum;
    }
    /**
	 * 获取：科研成果热度
	 */

    public void setKeyanchengguoClicknum(Integer keyanchengguoClicknum) {
        this.keyanchengguoClicknum = keyanchengguoClicknum;
    }
    /**
	 * 设置：科研成果详细介绍
	 */
    public String getKeyanchengguoContent() {
        return keyanchengguoContent;
    }
    /**
	 * 获取：科研成果详细介绍
	 */

    public void setKeyanchengguoContent(String keyanchengguoContent) {
        this.keyanchengguoContent = keyanchengguoContent;
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
    public Integer getKeyanchengguoDelete() {
        return keyanchengguoDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setKeyanchengguoDelete(Integer keyanchengguoDelete) {
        this.keyanchengguoDelete = keyanchengguoDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Keyanchengguo{" +
            "id=" + id +
            ", jiaoshiId=" + jiaoshiId +
            ", keyanchengguoName=" + keyanchengguoName +
            ", keyanchengguoUuidNumber=" + keyanchengguoUuidNumber +
            ", keyanchengguoFile=" + keyanchengguoFile +
            ", keyanchengguoPhoto=" + keyanchengguoPhoto +
            ", keyanchengguoTypes=" + keyanchengguoTypes +
            ", keyanchengguoClicknum=" + keyanchengguoClicknum +
            ", keyanchengguoContent=" + keyanchengguoContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", keyanchengguoDelete=" + keyanchengguoDelete +
            ", createTime=" + createTime +
        "}";
    }
}
