package com.jr.webapp.models.services;

import com.jr.webapp.models.entity.Usuario;

public interface IUsuarioService {

    public Usuario findByUsername(String username);
}
