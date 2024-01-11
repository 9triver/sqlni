package com.kekwy.sqlni.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/10 11:05
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Integer eid;

    private String type;

    private String department;

    private String name;

}
