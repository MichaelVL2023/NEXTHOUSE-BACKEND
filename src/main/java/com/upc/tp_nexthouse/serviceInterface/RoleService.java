package com.upc.tp_nexthouse.serviceInterface;



import com.upc.tp_nexthouse.Entities.Role;

import java.util.List;

public interface RoleService {
    public Role savedRol(Role rol);
    public void eliminarRol(Long  id);
    public Role modificarRol(Role rol);
    public List<Role> list();
}
