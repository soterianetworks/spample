package com.icwind.spample.rest.mock;

import com.icwind.spample.rest.enums.support.EnumRestSupport;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 *
 */
@Component
public class EnumRestSupportImpl implements EnumRestSupport {

    @Override
    public Map<String, Map<String, Map<String, String>>> listEnums() {
        return null;
    }
}