package com.example.demo.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FrequencyBlock;
import com.example.demo.repo.IFrequencyBlockRepo;
import com.example.demo.service.IFrequencyBlockService;

@Service
public class FrequencyBlockServiceImpl implements IFrequencyBlockService {

	
	@Autowired
	IFrequencyBlockRepo freqRepo;
	
	@Override
	public FrequencyBlock selectOneFrequencyBlockById(int id) throws Exception {
		if(id > 0)
		{
			if(freqRepo.existsById(id)) {
				return freqRepo.findById(id).get();
			}
		}
		throw new Exception("ID NOT CORRECT");
	}
	
	

	@Override
	public ArrayList<FrequencyBlock> selectAllFrequencyBlock() {
		return (ArrayList<FrequencyBlock>) freqRepo.findAll();
	}
	
	

	@Override
	public boolean insertNewFrequencyBlock(float startingFrequency, String bandName, float bandWidth,
			int numOfChannels) {
		FrequencyBlock frequencyBlock = new FrequencyBlock(startingFrequency,bandName,bandWidth,numOfChannels);
		freqRepo.save(frequencyBlock);
		return true;
	}

	@Override
	public boolean insertNewFrequencyBlockByObject(FrequencyBlock frequencyBlock) {
		FrequencyBlock freqBlock = new FrequencyBlock(frequencyBlock.getStartingFrequency(), frequencyBlock.getBandName(), frequencyBlock.getBandWidth(), frequencyBlock.getNumOfChannels());
		freqRepo.save(freqBlock);
		return true;
	}

	@Override
	public boolean updateFrequencyBlock(int id, FrequencyBlock frequencyBlock) {
		if(!freqRepo.existsById(id)) {
			return false;
		}
		
		FrequencyBlock updateFreqBlock = freqRepo.findById(id).get();
		updateFreqBlock.setStartingFrequency(frequencyBlock.getStartingFrequency());
		updateFreqBlock.setBandName(frequencyBlock.getBandName());
		updateFreqBlock.setBandWidth(frequencyBlock.getBandWidth());
		updateFreqBlock.setNumOfChannels(frequencyBlock.getNumOfChannels());
		freqRepo.save(updateFreqBlock);
		return true;
	}

	@Override
	public boolean deleteFrequencyBlock(int id) {
		if(freqRepo.existsById(id)) {
			freqRepo.deleteById(id);
			return true;
		}
		return false;
	}

}
