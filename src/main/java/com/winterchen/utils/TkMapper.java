package com.winterchen.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author Taylor
 * Created by Taylor on 2018/4/28.
 */
public interface TkMapper<T> extends Mapper<T>, MySqlMapper {

}
