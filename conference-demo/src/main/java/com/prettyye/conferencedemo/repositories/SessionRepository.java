package com.prettyye.conferencedemo.repositories;

import com.prettyye.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Speaker, Long> {
}
