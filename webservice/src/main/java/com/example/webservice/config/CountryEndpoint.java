package com.example.webservice.config;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.webservice.interfaces.Country;
import com.example.webservice.interfaces.GetCountryRequest;
import com.example.webservice.interfaces.GetCountryResponse;


@Endpoint
public class CountryEndpoint {
    private static final String NAMESPACE_URI = "http://www.yourcompany.com/webservice";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
    	System.out.println("执行webservice开始");
        GetCountryResponse response = new GetCountryResponse();
        Country country = new Country();
        country.setName(request.getName());
        response.setCountry(country);
        System.out.println("执行webservice结束");
        return response;
    }
}