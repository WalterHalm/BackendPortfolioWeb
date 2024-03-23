
package com.miportfoliowalter.SpringBoot.Security.Repository;

import com.miportfoliowalter.SpringBoot.Security.Entity.Rol;
import com.miportfoliowalter.SpringBoot.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre (RolNombre rolNombre);
}
