package com.rays.service;

import java.util.List;

import com.rays.dto.RoleDTO;

public interface RoleServiceInt {

	public long add(RoleDTO dto);

	public void update(RoleDTO dto);

	public void delete(long id);

	public RoleDTO findById(long pk);

	public long save(RoleDTO dto);
	
	public List search(RoleDTO dto, int pageNo, int pageSize);

}