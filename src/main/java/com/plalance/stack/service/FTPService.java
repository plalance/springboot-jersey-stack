package com.plalance.stack.service;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface FTPService{
	List<String> getFilesList();
}
