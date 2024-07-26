package com.entity.view;

import com.entity.KeyanchengguoCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 科研成果收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("keyanchengguo_collection")
public class KeyanchengguoCollectionView extends KeyanchengguoCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String keyanchengguoCollectionValue;



		//级联表 keyanchengguo
			/**
			* 科研成果 的 教师
			*/
			private Integer keyanchengguoJiaoshiId;
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
				* 科研成果类型的值
				*/
				private String keyanchengguoValue;
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
				* 是否展示的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer keyanchengguoDelete;

		//级联表 xuesheng
			/**
			* 学号
			*/
			private String xueshengUuidNumber;
			/**
			* 学生姓名
			*/
			private String xueshengName;
			/**
			* 学生手机号
			*/
			private String xueshengPhone;
			/**
			* 学生身份证号
			*/
			private String xueshengIdNumber;
			/**
			* 学生头像
			*/
			private String xueshengPhoto;
			/**
			* 电子邮箱
			*/
			private String xueshengEmail;

	public KeyanchengguoCollectionView() {

	}

	public KeyanchengguoCollectionView(KeyanchengguoCollectionEntity keyanchengguoCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, keyanchengguoCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getKeyanchengguoCollectionValue() {
				return keyanchengguoCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setKeyanchengguoCollectionValue(String keyanchengguoCollectionValue) {
				this.keyanchengguoCollectionValue = keyanchengguoCollectionValue;
			}










				//级联表的get和set keyanchengguo

					/**
					* 获取：科研成果 的 教师
					*/
					public Integer getKeyanchengguoJiaoshiId() {
						return keyanchengguoJiaoshiId;
					}
					/**
					* 设置：科研成果 的 教师
					*/
					public void setKeyanchengguoJiaoshiId(Integer keyanchengguoJiaoshiId) {
						this.keyanchengguoJiaoshiId = keyanchengguoJiaoshiId;
					}


					/**
					* 获取： 科研成果名称
					*/
					public String getKeyanchengguoName() {
						return keyanchengguoName;
					}
					/**
					* 设置： 科研成果名称
					*/
					public void setKeyanchengguoName(String keyanchengguoName) {
						this.keyanchengguoName = keyanchengguoName;
					}

					/**
					* 获取： 科研成果编号
					*/
					public String getKeyanchengguoUuidNumber() {
						return keyanchengguoUuidNumber;
					}
					/**
					* 设置： 科研成果编号
					*/
					public void setKeyanchengguoUuidNumber(String keyanchengguoUuidNumber) {
						this.keyanchengguoUuidNumber = keyanchengguoUuidNumber;
					}

					/**
					* 获取： 科研成果相关文件
					*/
					public String getKeyanchengguoFile() {
						return keyanchengguoFile;
					}
					/**
					* 设置： 科研成果相关文件
					*/
					public void setKeyanchengguoFile(String keyanchengguoFile) {
						this.keyanchengguoFile = keyanchengguoFile;
					}

					/**
					* 获取： 科研成果照片
					*/
					public String getKeyanchengguoPhoto() {
						return keyanchengguoPhoto;
					}
					/**
					* 设置： 科研成果照片
					*/
					public void setKeyanchengguoPhoto(String keyanchengguoPhoto) {
						this.keyanchengguoPhoto = keyanchengguoPhoto;
					}

					/**
					* 获取： 科研成果类型
					*/
					public Integer getKeyanchengguoTypes() {
						return keyanchengguoTypes;
					}
					/**
					* 设置： 科研成果类型
					*/
					public void setKeyanchengguoTypes(Integer keyanchengguoTypes) {
						this.keyanchengguoTypes = keyanchengguoTypes;
					}


						/**
						* 获取： 科研成果类型的值
						*/
						public String getKeyanchengguoValue() {
							return keyanchengguoValue;
						}
						/**
						* 设置： 科研成果类型的值
						*/
						public void setKeyanchengguoValue(String keyanchengguoValue) {
							this.keyanchengguoValue = keyanchengguoValue;
						}

					/**
					* 获取： 科研成果热度
					*/
					public Integer getKeyanchengguoClicknum() {
						return keyanchengguoClicknum;
					}
					/**
					* 设置： 科研成果热度
					*/
					public void setKeyanchengguoClicknum(Integer keyanchengguoClicknum) {
						this.keyanchengguoClicknum = keyanchengguoClicknum;
					}

					/**
					* 获取： 科研成果详细介绍
					*/
					public String getKeyanchengguoContent() {
						return keyanchengguoContent;
					}
					/**
					* 设置： 科研成果详细介绍
					*/
					public void setKeyanchengguoContent(String keyanchengguoContent) {
						this.keyanchengguoContent = keyanchengguoContent;
					}

					/**
					* 获取： 是否展示
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否展示
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否展示的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否展示的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getKeyanchengguoDelete() {
						return keyanchengguoDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setKeyanchengguoDelete(Integer keyanchengguoDelete) {
						this.keyanchengguoDelete = keyanchengguoDelete;
					}













				//级联表的get和set xuesheng

					/**
					* 获取： 学号
					*/
					public String getXueshengUuidNumber() {
						return xueshengUuidNumber;
					}
					/**
					* 设置： 学号
					*/
					public void setXueshengUuidNumber(String xueshengUuidNumber) {
						this.xueshengUuidNumber = xueshengUuidNumber;
					}

					/**
					* 获取： 学生姓名
					*/
					public String getXueshengName() {
						return xueshengName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setXueshengName(String xueshengName) {
						this.xueshengName = xueshengName;
					}

					/**
					* 获取： 学生手机号
					*/
					public String getXueshengPhone() {
						return xueshengPhone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setXueshengPhone(String xueshengPhone) {
						this.xueshengPhone = xueshengPhone;
					}

					/**
					* 获取： 学生身份证号
					*/
					public String getXueshengIdNumber() {
						return xueshengIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setXueshengIdNumber(String xueshengIdNumber) {
						this.xueshengIdNumber = xueshengIdNumber;
					}

					/**
					* 获取： 学生头像
					*/
					public String getXueshengPhoto() {
						return xueshengPhoto;
					}
					/**
					* 设置： 学生头像
					*/
					public void setXueshengPhoto(String xueshengPhoto) {
						this.xueshengPhoto = xueshengPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getXueshengEmail() {
						return xueshengEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setXueshengEmail(String xueshengEmail) {
						this.xueshengEmail = xueshengEmail;
					}






}
