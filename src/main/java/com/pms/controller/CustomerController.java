package com.pms.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pms.model.CustomerDto;
import com.pms.service.CustomerService;

@RequestMapping("/v1/customer")
@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerservice;
	
	@RequestMapping(value="/getCustomer/{customerId}", method=RequestMethod.POST)
	public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerId") UUID customerId){
		return new ResponseEntity<>(customerservice.getCustomerById(customerId),HttpStatus.OK);
		
	}
}
