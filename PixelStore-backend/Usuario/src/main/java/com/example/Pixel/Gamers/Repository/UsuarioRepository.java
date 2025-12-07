package com.example.Pixel.Gamers.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Pixel.Gamers.Model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
    List<Usuario> findByActivo(Boolean activo);
    List<Usuario> findByNombreContainingIgnoreCase(String nombre);
}
