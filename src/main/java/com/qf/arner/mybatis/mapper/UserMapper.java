package com.qf.arner.mybatis.mapper;

import com.qf.arner.mybatis.entity.Address;
import com.qf.arner.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User selectAddressByUserId(@Param("userId") int id);
}
