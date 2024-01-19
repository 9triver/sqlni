package com.kekwy.sqlni.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/11 16:31
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Integer eid;

    private String department;

    private String name;

    private String type;

}
