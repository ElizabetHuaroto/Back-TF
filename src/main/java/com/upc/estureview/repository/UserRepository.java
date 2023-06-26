package com.upc.estureview.repository;

import com.upc.estureview.entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public User findUserByNameUser(String username);
	
	//BUSCAR POR NOMBRE
	@Query("select count(u.nameUser) from User u where u.nameUser =:username")
	public int buscarUsername(@Param("username") String nombre);
	
	
	//INSERTAR ROLES
	@Transactional
	@Modifying
	@Query(value = "insert into roles (rol, user_id) VALUES (:rol, :user_id)", nativeQuery = true)
	public void insRol(@Param("rol") String authority, @Param("user_id") Long user_id);
	@Transactional
	@Modifying
		@Query(value = "INSERT INTO users_roles (user_id, role_id ) VALUES (:user_id, :rol_id)", nativeQuery = true)
	public Integer insertUserRol(@Param("user_id") Long user_id, @Param("rol_id") Long rol_id);

}