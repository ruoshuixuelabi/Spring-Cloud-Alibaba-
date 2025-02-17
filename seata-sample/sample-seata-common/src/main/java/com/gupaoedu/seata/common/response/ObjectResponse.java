package com.gupaoedu.seata.common.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@Data
@EqualsAndHashCode(callSuper=false)
public class ObjectResponse<T> extends AbstractResonse implements Serializable {
    private T data;
}
