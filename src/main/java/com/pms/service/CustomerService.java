package com.pms.service;

import java.util.UUID;

import com.pms.model.CustomerDto;

public interface CustomerService {

	CustomerDto  getCustomerById(UUID customerId);

}
