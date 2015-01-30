package com.kuroshfarsimadan.demonstration.service;

import org.springframework.stereotype.Service;

@Service
public class MiscServiceImpl implements MiscService {

	public void serviceForAdmins() {
		System.out.println("misc admineille");
	}

	public void serviceForLoggedInUsers() {
		System.out.println("misc sisaankirjautuneille");
	}

	public void serviceForAll() {
		System.out.println("misc kaikille");
	}

}
