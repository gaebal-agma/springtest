package com.testserver.testserver.repository;

import com.testserver.testserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // 사용자 정의 쿼리 메소드를 여기에 추가할 수 있습니다.
}
