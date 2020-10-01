package com.krupa.joshi.registration.RegistrationForm.repository;

import com.krupa.joshi.registration.RegistrationForm.model.RegistrationForm;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RegisterRepository extends JpaRepository<RegistrationForm, String> {

    @Override
    public default List<RegistrationForm> findAll() {
        return null;
    }

}
