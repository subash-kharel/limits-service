package com.subash.springcloudpoc.limitsservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LimitsConfiguration {
	
	int maximum;
	int minimum;

}
