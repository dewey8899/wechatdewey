package spring.cloud.ykf.eureka.provide.main.entry;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Author: Administrator
 * Date 2018/12/18 0018 下午 10:30
 */

@Data
@NoArgsConstructor
@Entity
@Table(name = "s_user")
public class User {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "pswd")
    private String pswd;
}
