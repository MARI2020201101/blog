package mari.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {

    @Id @GeneratedValue
    private int id;

    @Column(nullable = false,length = 100)
    private String title;

    @Lob
    private String content;

    @ColumnDefault("0")
    private int count; //조회수

    @OneToMany(mappedBy = "board" , fetch = FetchType.EAGER)
    private List<Reply> reply;

    @ManyToOne
    @JoinColumn(name= "userid")
    private User user;
}
