package com.lixuan.ggkt.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author z7
 * @version 2023/03/26/15:39
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GgktException extends RuntimeException {

    private Integer code;

    private String msg;

}
