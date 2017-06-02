package com.project.dao;

import com.project.model.CheckPayment;
import com.project.model.CheckPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckPaymentMapper {
    int countByExample(CheckPaymentExample example);

    int deleteByPrimaryKey(Integer checkid);

    int insert(CheckPayment record);

    int insertSelective(CheckPayment record);

    List<CheckPayment> selectByExample(CheckPaymentExample example);

    CheckPayment selectByPrimaryKey(Integer checkid);

    int updateByExampleSelective(@Param("record") CheckPayment record, @Param("example") CheckPaymentExample example);

    int updateByExample(@Param("record") CheckPayment record, @Param("example") CheckPaymentExample example);

    int updateByPrimaryKeySelective(CheckPayment record);

    int updateByPrimaryKey(CheckPayment record);
}