package com.dao;

import com.entity.KeyanchengguoCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KeyanchengguoCollectionView;

/**
 * 科研成果收藏 Dao 接口
 *
 * @author 
 */
public interface KeyanchengguoCollectionDao extends BaseMapper<KeyanchengguoCollectionEntity> {

   List<KeyanchengguoCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
