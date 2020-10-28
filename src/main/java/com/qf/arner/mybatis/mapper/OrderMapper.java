package com.qf.arner.mybatis.mapper;

import com.qf.arner.mybatis.entity.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    Order selectOrderByNo(@Param("orderNo") int orderNo);
    Order selectOrderByUserId(@Param("userId") int userId);
}
