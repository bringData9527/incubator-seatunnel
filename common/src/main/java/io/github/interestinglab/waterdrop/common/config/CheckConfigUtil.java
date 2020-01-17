package io.github.interestinglab.waterdrop.common.config;

import com.typesafe.config.waterdrop.Config;

/**
 * @author mr_xiong
 * @date 2019-09-25 16:00
 * @description
 */
public class CheckConfigUtil {

    public static CheckResult check(Config config, String... params) {
        for (String param : params) {
            if (!config.hasPath(param) || config.getAnyRef(param) == null) {
                return new CheckResult(false, "please specify [" + param + "] as non-empty");
            }
        }
        return new CheckResult(true,"");
    }
}
