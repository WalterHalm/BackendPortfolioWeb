
package com.miportfoliowalter.SpringBoot.Security.Service;

import com.miportfoliowalter.SpringBoot.Security.Entity.Usuario;
import com.miportfoliowalter.SpringBoot.Security.Repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional  
public class UsuarioService {
@Autowired
IUsuarioRepository isuarioRepository;

public Optional <Usuario> getByNombreUsuario (String nombreUsuario){
    return isuarioRepository.findByNombreUsuario(nombreUsuario);
}

public boolean existsByNombreUsuario (String nombreUsuario){
    return isuarioRepository.existsByNombreUsuario(nombreUsuario);
}
    public boolean existsByEmail (String email){
    return isuarioRepository.existsByEmail(email);

}
    
    public void save (Usuario usuario){
        isuarioRepository.save(usuario);
    }
}

