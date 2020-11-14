package com.harish.msscbrewery.web.mappers;

import com.harish.msscbrewery.domain.Customer;
import com.harish.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
