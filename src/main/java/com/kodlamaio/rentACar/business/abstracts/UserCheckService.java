package com.kodlamaio.rentACar.business.abstracts;

import com.kodlamaio.rentACar.entities.concretes.User;

public interface UserCheckService {
	public boolean CheckIfRealPerson(User user);
}
