package mojammil.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mojammil.hotel.entity.Role;

@Repository
public interface RoleRep extends JpaRepository<Role, Integer> {

	Role findByName(String roleName);
}
