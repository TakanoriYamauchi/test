package controller;

import org.springframework.stereotype.Service;

@Service
public class App implements AppInterface {

	public String getJson() {

		String json = "{" +
				"    \"person\": {" +
				"        \"firstName\": \"John\"," +
				"        \"lastName\": \"Doe\"," +
				"        \"address\": \"NewYork\"," +
				"        \"pets\": [" +
				"            {\"type\": \"Dog\", \"name\": \"Jolly\"}," +
				"            {\"type\": \"Cat\", \"name\": \"Grizabella\"}," +
				"            {\"type\": \"Fish\", \"name\": \"Nimo\"}" +
				"        ]" +
				"    }" +
				"}";

		return json;
	}

	public String TestJson() {

		return "Autowired成功";
	}
}
