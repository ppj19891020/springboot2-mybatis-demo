package com.winterchen;

import com.winterchen.dao.TravelRecordMapper;
import com.winterchen.model.TravelRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot2MybatisDemoApplicationTests {

	@Autowired
	private TravelRecordMapper travelRecordMapper;

	@Test
	public void mycatMulinsert() {
		List<TravelRecord> list = new ArrayList<>(100000);
		for(int i=0;i<100000;i++){
			TravelRecord travelRecord = new TravelRecord();
			Integer ramdomInt = new Random().nextInt(10000000);
			travelRecord.setName(ramdomInt.toString());
			list.add(travelRecord);
		}
		travelRecordMapper.insertTravelBatch(list);
	}

}
