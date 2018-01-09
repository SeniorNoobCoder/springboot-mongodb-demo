package com.test.lp;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import lombok.Data;

/**
 * 
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -3258839839160856613L;
    
    @Id
    private Long id;
    private String userName;
    private String passWord;
    
    @Override
    public String toString() {
        return "UserTest [id=" + id + ", userName=" + userName + ", passWord=" + passWord + "]";
    }
    
    
}
