package nl.ccs.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserDTO {

    private final String username;
    private final String password;

}
