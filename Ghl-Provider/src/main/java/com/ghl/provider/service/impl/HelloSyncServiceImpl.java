package com.ghl.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ghl.provider.service.HelloSyncService;

@Service
public class HelloSyncServiceImpl implements HelloSyncService {

	@Override
	public String saySync(String string) {
		System.out.println(string + "你好!!");
		return string + "你好!!";
	}
}
