package com.norelax.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wusong
 * @date 2023年02月07日 16:58
 */
@Data
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
