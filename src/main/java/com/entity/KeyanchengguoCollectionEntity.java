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
 * 科研成果收藏
 *
 * @author 
 * @email
 */
@TableName("keyanchengguo_collection")
public class KeyanchengguoCollectionEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KeyanchengguoCollectionEntity() {

	}

	public KeyanchengguoCollectionEntity(T t) {
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
     * 科研成果
     */
    @TableField(value = "keyanchengguo_id")

    private Integer keyanchengguoId;


    /**
     * 学生
     */
    @TableField(value = "xuesheng_id")

    private Integer xueshengId;


    /**
     * 类型
     */
    @TableField(value = "keyanchengguo_collection_types")

    private Integer keyanchengguoCollectionTypes;


    /**
     * 收藏时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：科研成果
	 */
    public Integer getKeyanchengguoId() {
        return keyanchengguoId;
    }
    /**
	 * 获取：科研成果
	 */

    public void setKeyanchengguoId(Integer keyanchengguoId) {
        this.keyanchengguoId = keyanchengguoId;
    }
    /**
	 * 设置：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }
    /**
	 * 获取：学生
	 */

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 设置：类型
	 */
    public Integer getKeyanchengguoCollectionTypes() {
        return keyanchengguoCollectionTypes;
    }
    /**
	 * 获取：类型
	 */

    public void setKeyanchengguoCollectionTypes(Integer keyanchengguoCollectionTypes) {
        this.keyanchengguoCollectionTypes = keyanchengguoCollectionTypes;
    }
    /**
	 * 设置：收藏时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：收藏时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "KeyanchengguoCollection{" +
            "id=" + id +
            ", keyanchengguoId=" + keyanchengguoId +
            ", xueshengId=" + xueshengId +
            ", keyanchengguoCollectionTypes=" + keyanchengguoCollectionTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
