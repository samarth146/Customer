package com.pms.service;

import java.util.UUID;

import com.pms.model.CustomerDto;

public class CustomerServiceImpl implements CustomerService{

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Samarth shah")
                .build();
	}

}
