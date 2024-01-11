package com.kekwy.sqlni.dynamicTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/10 13:46
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String username;
    private String email;

}

