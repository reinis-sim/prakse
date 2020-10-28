package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.FrequencyBlock;

public interface IFrequencyBlockService {

	//SELECT
	FrequencyBlock selectOneFrequencyBlockById(int id) throws Exception;
	ArrayList<FrequencyBlock> selectAllFrequencyBlock();
	
	
	//CREATE
	boolean insertNewFrequencyBlock(float startingFrequency, String bandName, float bandWidth, int numOfChannels );
	boolean insertNewFrequencyBlockByObject(FrequencyBlock frequencyBlock);
	
	
	//UPDATE
	boolean updateFrequencyBlock(int id, FrequencyBlock frequencyBlock);
	
	//DELETE
	boolean deleteFrequencyBlock(int id);
	
	
}
