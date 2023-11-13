//package com.nt.niranjana.orderservice.consumer;
//
//import java.net.URI;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//
//Component
//public class CartServiceConsumerUsingDiscoveryClient 
//{
//	@Autowired
//	private DiscoveryClient client;
//	
//	public String getCartResponse()
//	{
//		//get serviceID from Eureka Server
//		List<ServiceInstance> listOfsi= client.getInstances("CART-SERVICE");
//		
//		//read at index#0 ==>returns SI
//		ServiceInstance si = listOfsi.get(0);
//		
//		//read URI
//		URI uri = si.getUri();
//		
//		//add path ===>returns URL
//		String url = uri + "/cart/wish";
//		System.out.println("URL "+url);
//		
//		//use RestTempalte and call
//		RestTemplate rt = new RestTemplate();
//		
//		//make HTTP request and get response
//		ResponseEntity<String> response = rt.getForEntity(url, String.class);
//		
//		//return response body
//		return response.getBody();
//		
//	}
//
//}
package com.nt.niranjana.orderservice.consumer;


