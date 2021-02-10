package mari.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id @GeneratedValue
    private int id;

    @Column(nullable = false,length = 30)
    private String username;

    @Column(nullable = false,length = 100)
    private String password;

    @Column(nullable = false,length = 50)
    private String email;

    private LocalDateTime createDate;

    @Enumerated(EnumType.STRING)
    private RoleType role;

    @OneToMany(mappedBy = "user")
    private List<Board> board;

    @OneToMany(mappedBy = "user")
    private List<Reply> reply;
}
