package com.winterchen.dao;

import com.winterchen.model.TravelRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TravelRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TravelRecord record);

    int insertSelective(TravelRecord record);

    TravelRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TravelRecord record);

    int updateByPrimaryKey(TravelRecord record);

    void insertTravelBatch(@Param("list") List<TravelRecord> list);
}