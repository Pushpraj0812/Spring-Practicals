package com.rays.service;

import com.rays.dto.RoleDTO;

public interface RoleServiceInt {

	public long add(RoleDTO dto);

	public void update(RoleDTO dto);

	public void delete(long id);

	public RoleDTO findById(long pk);

	public long save(RoleDTO dto);

}