package com.moralok.pojotransform.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/base-config.properties"})
public interface BaseConfig extends Config {

    @DefaultValue("io.bitchat")
    String basePackage();

    @DefaultValue("8864000")
    String serverPort();
}
