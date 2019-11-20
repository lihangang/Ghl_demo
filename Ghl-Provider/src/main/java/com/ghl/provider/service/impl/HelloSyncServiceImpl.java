package com.ghl.provider.service.impl;

import org.springframework.stereotype.Service;

import com.ghl.provider.service.HelloSyncService;

@Service("helloSyncService")
public class HelloSyncServiceImpl implements HelloSyncService {

	@Override
	public String saySync(String string) {
		System.out.println(" hello service " + string);
		return string + "你好!!";
	}
}
