package com.company.springcourse.RestApiConcumer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
    public static void main( String[] args ) throws JsonProcessingException  {
//    	//test api (www.reqres.in). get request
    	
//    	RestTemplate template = new RestTemplate();
//    	String url = "https://reqres.in/api/users?page=2";
//    	String response = template.getForObject(url, String.class);
//    	System.out.println(response);
    	
//    	nlp translation api
    	
       Scanner scanner = new Scanner(System.in);
       String sentenceToTranslate = scanner.nextLine();
       String url = "https://nlp-translation.p.rapidapi.com/v1/translate";
       HttpHeaders headers = new HttpHeaders();
       //from doc of api
       headers.setContentType(MediaType.APPLICATION_JSON);
       headers.add("X-RapidAPI-Key","0d4f5b5ac8msh02304d0d3206ef0p1b362djsndf344187bccb");
       headers.add("X-RapidAPI-Host","nlp-translation.p.rapidapi.com");
       Map<String, String> jsonData = new HashMap<>();
       //from doc of api
       jsonData.put("text",sentenceToTranslate);
       jsonData.put("to","en");
       
       HttpEntity<Map<String,String>> request = new HttpEntity<>(jsonData, headers);
       RestTemplate restTemplate = new RestTemplate();
//       for single parse
       
//       String response = restTemplate.postForObject(url, request, String.class);
//       System.out.println(response);
//       ObjectMapper mapper = new ObjectMapper();
//       JsonNode  obj = mapper.readTree(response);
//       JsonNode result = obj.get("translated_text").get("en");
//       System.out.println(result);
       Translate response = restTemplate.postForObject(url, request, Translate.class);
       System.out.println(response.getOriginal_text() + "--" + response.getTranslated_text().getEn()
    		   + ",   char_count--" + response.getTranslated_characters());
    
      
    }
    
}
