package com.krupa.joshi.registration.RegistrationForm.repository;

import com.krupa.joshi.registration.RegistrationForm.model.RegistrationForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RegisterRepository extends JpaRepository<RegistrationForm, String> {

    List<RegistrationForm> findAllByOrderByCreationDateDesc() ;

}
