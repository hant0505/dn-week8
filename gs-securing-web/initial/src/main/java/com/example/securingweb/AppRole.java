package com.example.securingweb;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
public class AppRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;  // ví dụ: ROLE_USER, ROLE_ADMIN

    @ManyToMany(mappedBy = "roles")
    private Set<AppUser> users;

    // getter/setter
}
