package com.menemen.app.rest.Repo;

import com.menemen.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository  <User, Long> {
}
