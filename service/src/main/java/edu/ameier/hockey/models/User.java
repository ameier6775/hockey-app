package edu.ameier.hockey.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
    @Size(min=3, max=15)
    @Column(name = "user_name")
    private String userName;

    @NotNull
    @Size(min=5)
    @Column(name = "password")
    private String password;

    @OneToMany
    private List<HockeyTeam> teamIds;

    @OneToMany
    private List<Player> playerIds;
}
