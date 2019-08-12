package edu.ameier.hockey.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private Long id;

    @NotNull
    @Column(name = "username", unique = true)
    private String userName;

    @NotNull
    @Column(name = "password")
    private String password;

    private Boolean signedIn;

    @OneToMany
    private List<HockeyTeam> teamIds;

    @OneToMany
    private List<Player> playerIds;

    public User (String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public <T> User(String userName, String password, List<T> emptyList) {
    }
}
