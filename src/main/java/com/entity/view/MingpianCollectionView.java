package com.entity.view;

import com.entity.MingpianCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 名片收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("mingpian_collection")
public class MingpianCollectionView extends MingpianCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String mingpianCollectionValue;



		//级联表 mingpian
			/**
			* 名片 的 教师
			*/
			private Integer mingpianJiaoshiId;
			/**
			* 名片名称
			*/
			private String mingpianName;
			/**
			* 名片编号
			*/
			private String mingpianUuidNumber;
			/**
			* 姓名
			*/
			private String mingpianXingming;
			/**
			* 联系电话
			*/
			private String mingpianPhone;
			/**
			* 名片文件
			*/
			private String mingpianFile;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 职务
			*/
			private Integer zhiwuTypes;
				/**
				* 职务的值
				*/
				private String zhiwuValue;
			/**
			* 名片照片
			*/
			private String mingpianPhoto;
			/**
			* 名片类型
			*/
			private Integer mingpianTypes;
				/**
				* 名片类型的值
				*/
				private String mingpianValue;
			/**
			* 学院
			*/
			private Integer xueyuanTypes;
				/**
				* 学院的值
				*/
				private String xueyuanValue;
			/**
			* 办公室
			*/
			private Integer bangongshiTypes;
				/**
				* 办公室的值
				*/
				private String bangongshiValue;
			/**
			* 主修课程
			*/
			private Integer kechengTypes;
				/**
				* 主修课程的值
				*/
				private String kechengValue;
			/**
			* 名片热度
			*/
			private Integer mingpianClicknum;
			/**
			* 名片详细介绍
			*/
			private String mingpianContent;
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
			private Integer mingpianDelete;

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

	public MingpianCollectionView() {

	}

	public MingpianCollectionView(MingpianCollectionEntity mingpianCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, mingpianCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getMingpianCollectionValue() {
				return mingpianCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setMingpianCollectionValue(String mingpianCollectionValue) {
				this.mingpianCollectionValue = mingpianCollectionValue;
			}
















				//级联表的get和set mingpian

					/**
					* 获取：名片 的 教师
					*/
					public Integer getMingpianJiaoshiId() {
						return mingpianJiaoshiId;
					}
					/**
					* 设置：名片 的 教师
					*/
					public void setMingpianJiaoshiId(Integer mingpianJiaoshiId) {
						this.mingpianJiaoshiId = mingpianJiaoshiId;
					}


					/**
					* 获取： 名片名称
					*/
					public String getMingpianName() {
						return mingpianName;
					}
					/**
					* 设置： 名片名称
					*/
					public void setMingpianName(String mingpianName) {
						this.mingpianName = mingpianName;
					}

					/**
					* 获取： 名片编号
					*/
					public String getMingpianUuidNumber() {
						return mingpianUuidNumber;
					}
					/**
					* 设置： 名片编号
					*/
					public void setMingpianUuidNumber(String mingpianUuidNumber) {
						this.mingpianUuidNumber = mingpianUuidNumber;
					}

					/**
					* 获取： 姓名
					*/
					public String getMingpianXingming() {
						return mingpianXingming;
					}
					/**
					* 设置： 姓名
					*/
					public void setMingpianXingming(String mingpianXingming) {
						this.mingpianXingming = mingpianXingming;
					}

					/**
					* 获取： 联系电话
					*/
					public String getMingpianPhone() {
						return mingpianPhone;
					}
					/**
					* 设置： 联系电话
					*/
					public void setMingpianPhone(String mingpianPhone) {
						this.mingpianPhone = mingpianPhone;
					}

					/**
					* 获取： 名片文件
					*/
					public String getMingpianFile() {
						return mingpianFile;
					}
					/**
					* 设置： 名片文件
					*/
					public void setMingpianFile(String mingpianFile) {
						this.mingpianFile = mingpianFile;
					}

					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}

					/**
					* 获取： 职务
					*/
					public Integer getZhiwuTypes() {
						return zhiwuTypes;
					}
					/**
					* 设置： 职务
					*/
					public void setZhiwuTypes(Integer zhiwuTypes) {
						this.zhiwuTypes = zhiwuTypes;
					}


						/**
						* 获取： 职务的值
						*/
						public String getZhiwuValue() {
							return zhiwuValue;
						}
						/**
						* 设置： 职务的值
						*/
						public void setZhiwuValue(String zhiwuValue) {
							this.zhiwuValue = zhiwuValue;
						}

					/**
					* 获取： 名片照片
					*/
					public String getMingpianPhoto() {
						return mingpianPhoto;
					}
					/**
					* 设置： 名片照片
					*/
					public void setMingpianPhoto(String mingpianPhoto) {
						this.mingpianPhoto = mingpianPhoto;
					}

					/**
					* 获取： 名片类型
					*/
					public Integer getMingpianTypes() {
						return mingpianTypes;
					}
					/**
					* 设置： 名片类型
					*/
					public void setMingpianTypes(Integer mingpianTypes) {
						this.mingpianTypes = mingpianTypes;
					}


						/**
						* 获取： 名片类型的值
						*/
						public String getMingpianValue() {
							return mingpianValue;
						}
						/**
						* 设置： 名片类型的值
						*/
						public void setMingpianValue(String mingpianValue) {
							this.mingpianValue = mingpianValue;
						}

					/**
					* 获取： 学院
					*/
					public Integer getXueyuanTypes() {
						return xueyuanTypes;
					}
					/**
					* 设置： 学院
					*/
					public void setXueyuanTypes(Integer xueyuanTypes) {
						this.xueyuanTypes = xueyuanTypes;
					}


						/**
						* 获取： 学院的值
						*/
						public String getXueyuanValue() {
							return xueyuanValue;
						}
						/**
						* 设置： 学院的值
						*/
						public void setXueyuanValue(String xueyuanValue) {
							this.xueyuanValue = xueyuanValue;
						}

					/**
					* 获取： 办公室
					*/
					public Integer getBangongshiTypes() {
						return bangongshiTypes;
					}
					/**
					* 设置： 办公室
					*/
					public void setBangongshiTypes(Integer bangongshiTypes) {
						this.bangongshiTypes = bangongshiTypes;
					}


						/**
						* 获取： 办公室的值
						*/
						public String getBangongshiValue() {
							return bangongshiValue;
						}
						/**
						* 设置： 办公室的值
						*/
						public void setBangongshiValue(String bangongshiValue) {
							this.bangongshiValue = bangongshiValue;
						}

					/**
					* 获取： 主修课程
					*/
					public Integer getKechengTypes() {
						return kechengTypes;
					}
					/**
					* 设置： 主修课程
					*/
					public void setKechengTypes(Integer kechengTypes) {
						this.kechengTypes = kechengTypes;
					}


						/**
						* 获取： 主修课程的值
						*/
						public String getKechengValue() {
							return kechengValue;
						}
						/**
						* 设置： 主修课程的值
						*/
						public void setKechengValue(String kechengValue) {
							this.kechengValue = kechengValue;
						}

					/**
					* 获取： 名片热度
					*/
					public Integer getMingpianClicknum() {
						return mingpianClicknum;
					}
					/**
					* 设置： 名片热度
					*/
					public void setMingpianClicknum(Integer mingpianClicknum) {
						this.mingpianClicknum = mingpianClicknum;
					}

					/**
					* 获取： 名片详细介绍
					*/
					public String getMingpianContent() {
						return mingpianContent;
					}
					/**
					* 设置： 名片详细介绍
					*/
					public void setMingpianContent(String mingpianContent) {
						this.mingpianContent = mingpianContent;
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
					public Integer getMingpianDelete() {
						return mingpianDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setMingpianDelete(Integer mingpianDelete) {
						this.mingpianDelete = mingpianDelete;
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
