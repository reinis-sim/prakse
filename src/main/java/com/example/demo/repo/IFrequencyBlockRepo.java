package com.example.demo.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.example.demo.model.FrequencyBlock;


public interface IFrequencyBlockRepo extends CrudRepository<FrequencyBlock, Integer>{
	

	

}
