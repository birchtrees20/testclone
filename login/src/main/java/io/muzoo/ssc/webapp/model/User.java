package io.muzoo.ssc.webapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private long id;
    private String username;
    private String password;
    private String displayName;
}
