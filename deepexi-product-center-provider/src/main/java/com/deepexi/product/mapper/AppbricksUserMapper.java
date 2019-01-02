package com.deepexi.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.product.domain.eo.AppbricksUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  AppbricksUserMapper extends BaseMapper<AppbricksUser> {

    List<AppbricksUser> findList(@Param("eo")  AppbricksUser eo);

    int deleteByIds(@Param("ids") List<String> ids);

}