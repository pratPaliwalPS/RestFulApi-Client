package com.example.restConsumer;

import java.util.HashMap;
import java.util.Map.Entry;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/OrderIntakeToolConsumer/accrualrule")
class SchoolService   {

	@RequestMapping(value="/id/{accrualRuleSeqNumber}")
	public ResponseEntity<AccrualRule> getStudent(@PathVariable String accrualRuleSeqNumber){

		String URL="http://localhost:9090/OrderIntakeTool/accrualrule/"+accrualRuleSeqNumber;
       
		 /*For Single header
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("device", "Hp Laptop"); 
		HttpEntity <Object> httpEntity = new HttpEntity <Object> (httpHeaders);
		RestTemplate template=new RestTemplate();
		ResponseEntity<AccrualRule> result = template.exchange(URL, HttpMethod.POST, httpEntity, AccrualRule.class);
		return result;
		
		For more then one Header*/
		HttpHeaders headers = new HttpHeaders();
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("device1", "Iphone");
		map.add("device2", "Sony");
		map.add("device3", "1233333");
		map.add("device4", "pratiksha");
	    RestTemplate template=new RestTemplate();
		headers.putAll(map);
		@SuppressWarnings("rawtypes")
		HttpEntity<MultiValueMap> request = new HttpEntity<MultiValueMap>(headers);
		ResponseEntity<AccrualRule> result = template.exchange(URL, HttpMethod.POST, request, AccrualRule.class);
		System.out.println("pratiksha"+ request);
		return result;
	}
	

	
	@RequestMapping(value="/")
	public  HashMap<String, Object>  getALLValue() {
		String URL="http://localhost:9090/OrderIntakeTool/accrualrule";
		RestTemplate restTemplate = new RestTemplate();
		@SuppressWarnings("unchecked")
		HashMap<String, Object> usersMap =  (HashMap<String, Object>) restTemplate.getForObject(URL,HashMap.class);
		/*for each loop	*/
		for (Entry<String, Object> entry : usersMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		return usersMap;
	}

}
