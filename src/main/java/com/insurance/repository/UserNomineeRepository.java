package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.UserNominee;

@Repository
public interface UserNomineeRepository extends JpaRepository<UserNominee, Serializable> {

}
