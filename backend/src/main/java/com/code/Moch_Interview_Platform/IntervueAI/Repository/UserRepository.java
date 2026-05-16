package com.code.Moch_Interview_Platform.IntervueAI.Repository;

import com.code.Moch_Interview_Platform.IntervueAI.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}