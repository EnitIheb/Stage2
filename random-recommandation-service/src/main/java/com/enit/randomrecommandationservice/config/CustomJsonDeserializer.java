package com.enit.randomrecommandationservice.config;

import org.springframework.kafka.support.serializer.JsonDeserializer;

public class CustomJsonDeserializer<T> extends JsonDeserializer<T> {
	public CustomJsonDeserializer() {
		// defaults from superclass
		super();

		// add our packages
		this.addTrustedPackages("*");
	}
}