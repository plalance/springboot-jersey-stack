package com.plalance.stack.serviceImpl;

import org.springframework.stereotype.Service;

import com.plalance.stack.service.FTPService;

@Service
public class FTPServiceImpl implements FTPService{

	@Override
	public boolean getList() {
		return true;
	}
}
