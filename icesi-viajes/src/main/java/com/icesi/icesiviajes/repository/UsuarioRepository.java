package com.icesi.icesiviajes.repository;

import com.icesi.icesiviajes.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>
{
}
