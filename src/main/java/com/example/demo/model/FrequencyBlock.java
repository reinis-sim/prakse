package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Table(name = "FrequencyBlock")
@Entity
public class FrequencyBlock {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_Freq")
	private int ID_Freq;

	@Min(0)
	private float StartingFrequency;
	
	
	private String BandName;
	
	@Min(1)
	private float BandWidth;
	
	@Min(1)
	private int NumOfChannels;
//	private String StationName;

	public float getStartingFrequency() {
		return StartingFrequency;
	}

	public void setStartingFrequency(float startingFrequency) {
		StartingFrequency = startingFrequency;
	}

	public String getBandName() {
		return BandName;
	}

	public void setBandName(String bandName) {
		BandName = bandName;
	}

	public float getBandWidth() {
		return BandWidth;
	}

	public void setBandWidth(float bandWidth) {
		BandWidth = bandWidth;
	}

	public int getNumOfChannels() {
		return NumOfChannels;
	}

	public void setNumOfChannels(int numOfChannels) {
		NumOfChannels = numOfChannels;
	}

	/*
	 * public String getStationName() { return StationName; } public void
	 * setStationName(String stationName) { StationName = stationName; }
	 */
	public FrequencyBlock(float startingFrequency, String bandName, float bandWidth,
			int numOfChannels/*
								 * , String stationName
								 */) {
		super();
		StartingFrequency = startingFrequency;
		BandName = bandName;
		BandWidth = bandWidth;
		NumOfChannels = numOfChannels;
//		StationName = stationName;
	}

	public FrequencyBlock() {

	}

	@Override
	public String toString() {
		return "(FrequencyBlock [ID_Freq=" + ID_Freq + ", StartingFrequency=" + StartingFrequency + ", BandName="
				+ BandName + ", BandWidth=" + BandWidth + ", NumOfChannels=" + NumOfChannels + "]";
	}
	
	


	

}
