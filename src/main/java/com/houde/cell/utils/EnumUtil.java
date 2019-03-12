package com.houde.cell.utils;

import com.houde.cell.enums.CodeEnum;

/**
 * Created by houde
 * 2019-03-06 17:18
 */
public class EnumUtil {

    /**
     * 通过code 找到对应枚举的值
     *
     * @param code
     * @param enumClass
     * @param <T>
     * @return
     */
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
