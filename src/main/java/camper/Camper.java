package com.backend.springproject.camper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Camper {

    @Id
    private String id;
    private String name;
    private String email;
    private String username;
    private String password;
}
