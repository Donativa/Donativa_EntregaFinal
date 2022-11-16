package com.cadastro.service;

import com.cadastro.model.Admin;

public interface AdminService {

	Admin saveAdmin(Admin admin);
	Admin updateAdmin(Admin amind, long id_adm);
	Admin getAdminById(long id_adm);
	void deleteAdmin(long id_adm);
}
