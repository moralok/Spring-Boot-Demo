package com.moralok.pojotransform;

import com.beust.jcommander.JCommander;
import com.moralok.pojotransform.pojo.ServerStartupParameter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PojoTransformApplication {

    public static void main(String[] args) {
        transformByJcommander(args);
        SpringApplication.run(PojoTransformApplication.class, args);
    }

    private static void transformByJcommander(String[] args) {
        ServerStartupParameter param = new ServerStartupParameter();
        JCommander.newBuilder()
                .addObject(param)
                .build()
                .parse(args);

        int mode = param.getMode() == null ? 0 : param.getMode();
        int serverPort = param.getServerPort() == null ? 0 : param.getServerPort();

        System.out.println(mode);
        System.out.println(serverPort);
    }

}
