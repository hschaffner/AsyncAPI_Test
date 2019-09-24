package com.spring.cloud.streams.test.schema;

public class BusGeoSchemaSer {
	
	/*
	private final String busSchema = "{\n" + 
			" \"type\": \"struct\",\n" + 
			" \"fields\": [{\n" + 
			" \"type\": \"int32\",\n" + 
			" \"optional\": false,\n" + 
			" \"field\": \"vehicleNum\"\n" + 
			" }, {\n" + 
			" \"type\": \"int32\",\n" + 
			" \"optional\": true,\n" + 
			" \"field\": \"routeNum\"\n" + 
			" }, {\n" + 
			" \"type\": \"float64\",\n" + 
			" \"optional\": false,\n" + 
			" \"field\": \"lat\"\n" + 
			" }, {\n" + 
			" \"type\": \"float64\",\n" + 
			" \"optional\": false,\n" + 
			" \"field\": \"long\"\n" + 
			" } {\n" + 
			" \"type\": \"string\",\n" + 
			" \"optional\": \"false\",\n" + 
			" \"field\": \"status\"\n" + 
			" }, {\n" + 
			" \"type\": \"int32\",\n" + 
			" \"optional\": \"false\",\n" + 
			" \"field\": \"speed\"\n" + 
			"  }],\n" + 
			" \"optional\": true,\n" + 
			" \"name\": \"foobar\"\n" + 
			" }";
			*/
	

	private final String busSchema = "{\n" + 
			"  \"definitions\": {},\n" + 
			"  \"$schema\": \"http://json-schema.org/draft-07/schema#\",\n" + 
			"  \"$id\": \"http://example.com/root.json\",\n" + 
			"  \"type\": \"object\",\n" + 
			"  \"title\": \"The Root Schema\",\n" + 
			"  \"required\": [\n" + 
			"    \"vehicleNum\",\n" + 
			"    \"routeNum\",\n" + 
			"    \"lat\",\n" + 
			"    \"lon\",\n" + 
			"    \"status\",\n" + 
			"    \"speed\"\n" + 
			"  ],\n" + 
			"  \"properties\": {\n" + 
			"    \"vehicleNum\": {\n" + 
			"      \"$id\": \"#/properties/vehicleNum\",\n" + 
			"      \"type\": \"integer\",\n" + 
			"      \"title\": \"The Vehiclenum Schema\",\n" + 
			"      \"default\": 0,\n" + 
			"      \"minimum\": 0,\n" + 
			"      \"maximum\": 1000,\n" + 
			"      \"examples\": [\n" + 
			"        1091\n" + 
			"      ]\n" + 
			"    },\n" + 
			"    \"routeNum\": {\n" + 
			"      \"$id\": \"#/properties/routeNum\",\n" + 
			"      \"type\": \"integer\",\n" + 
			"      \"title\": \"The Routenum Schema\",\n" + 
			"      \"default\": 0,\n" + 
			"      \"maximum\": 2000,\n" + 
			"      \"minimum\": 0,\n" + 
			"      \"examples\": [\n" + 
			"        5\n" + 
			"      ]\n" + 
			"    },\n" + 
			"    \"lat\": {\n" + 
			"      \"$id\": \"#/properties/lat\",\n" + 
			"      \"type\": \"number\",\n" + 
			"      \"title\": \"The Lat Schema\",\n" + 
			"      \"default\": 0,\n" + 
			"      \"maximum\": 180,\n" + 
			"      \"minimum\": -180,\n" + 
			"      \"examples\": [\n" + 
			"        1.27281\n" + 
			"      ]\n" + 
			"    },\n" + 
			"    \"lon\": {\n" + 
			"      \"$id\": \"#/properties/lon\",\n" + 
			"      \"type\": \"number\",\n" + 
			"      \"title\": \"The Lon Schema\",\n" + 
			"      \"default\": 0,\n" + 
			"      \"maximum\": 180,\n" + 
			"      \"minimum\": -180,\n" + 
			"      \"examples\": [\n" + 
			"        103.85372\n" + 
			"      ]\n" + 
			"    },\n" + 
			"    \"status\": {\n" + 
			"      \"$id\": \"#/properties/status\",\n" + 
			"      \"type\": \"string\",\n" + 
			"      \"enum\": [\n" + 
			"        \"OK\",\n" + 
			"        \"STOP\",\n" + 
			"        \"FAIL\",\n" + 
			"        \"START\",\n" + 
			"        \"STOPPED\",\n" + 
			"        \"FLAT_TIRE\",\n" + 
			"        \"ENGINE_PROBLEM\"\n" + 
			"      ],\n" + 
			"      \"title\": \"The Status Schema\",\n" + 
			"      \"default\": \"OK\",\n" + 
			"      \"examples\": [\n" + 
			"        \"OK\"\n" + 
			"      ],\n" + 
			"      \"pattern\": \"^(.*)$\"\n" + 
			"    },\n" + 
			"    \"speed\": {\n" + 
			"      \"$id\": \"#/properties/speed\",\n" + 
			"      \"type\": \"integer\",\n" + 
			"      \"title\": \"The Speed Schema\",\n" + 
			"      \"default\": 0,\n" + 
			"      \"examples\": [\n" + 
			"        43\n" + 
			"      ]\n" + 
			"    }\n" + 
			"  }\n" + 
			"}";

	public String getBusSchemaSer() {
		return busSchema;
	}
	

}
