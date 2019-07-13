package com.example.helloworld.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Entity;
//import javax.persistence.Table;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Entity
//@Table
public class Profile {
    private Long id;

    private String userName;

    private List<Long> teamIds;

    private List<Long> statIds;
}
