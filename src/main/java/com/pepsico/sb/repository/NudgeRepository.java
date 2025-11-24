package com.pepsico.sb.repository;


import com.pepsico.sb.entity.Nudge;
import com.pepsico.sb.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NudgeRepository extends JpaRepository<Nudge, Long> {
    List<Nudge> findByUserEmail(String userEmail);
}