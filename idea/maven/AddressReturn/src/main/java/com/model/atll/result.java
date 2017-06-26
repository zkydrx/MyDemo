package com.model.atll;

import com.model.baidu.llta.location;

public class result {
	private location location;
	private String precise;
	private String confidence;
	private String level;
	public location getLocation() {
		return location;
	}
	public void setLocation(location location) {
		this.location = location;
	}
	public String getPrecise() {
		return precise;
	}
	public void setPrecise(String precise) {
		this.precise = precise;
	}
	public String getConfidence() {
		return confidence;
	}
	public void setConfidence(String confidence) {
		this.confidence = confidence;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
}
