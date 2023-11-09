package org.example._2023_11_9.mockito.stub;

public class SimpleCustomerService implements CustomerService {

	CustomerRepository customerRepository;

	public SimpleCustomerService(CustomerRepository customerRepository){
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer getCustomerById(long id) {
		return customerRepository.getCustomerById(id);
		
	}
}