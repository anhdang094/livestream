package vn.bongda.livestream.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.bongda.livestream.domain.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
