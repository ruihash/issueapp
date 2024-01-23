package in.techcamp.issueapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<IssueEntity, Integer> {
}