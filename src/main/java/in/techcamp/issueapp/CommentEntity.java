package in.techcamp.issueapp;

import java.util.List;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;


@Entity
@Table(name = "comments")
@Data
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String message;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.EAGER)
    private UserEntity user;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.EAGER)
    private IssueEntity issue;
}
