package com.ns.cloud.mapper;

import com.ns.cloud.entities.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: xns
 * @Date: 20-2-1 下午6:54
 */
@Mapper
public interface UserMapper {

    public boolean insert(User user);

    public User findById(String userId);

    public User findByName(String userName);
}
