package com.testserver.testserver.repository;

import com.testserver.testserver.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    // 여기에 추가적인 쿼리 메소드를 정의할 수 있습니다.
}
