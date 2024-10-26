package com.upc.tp_nexthouse.serviceInterface;


import com.upc.tp_nexthouse.Entities.Usuario;

import java.util.List;

public interface UsuarioService {
    public Usuario savedUsuario(Usuario usuario);
    public void eliminarUsuario(Long  id);
    public Usuario modificarUsuario(Usuario usuario);
    public List<Usuario> list();

}
