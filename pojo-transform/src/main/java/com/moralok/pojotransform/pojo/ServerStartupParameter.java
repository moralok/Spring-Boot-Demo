package com.moralok.pojotransform.pojo;

import com.beust.jcommander.Parameter;
import lombok.Data;

@Data
public class ServerStartupParameter {

    @Parameter(names = "-mode", description = "Server mode. 1 : standalone mode 2 : cluster mode.")
    private Integer mode;

    @Parameter(names = "-serverPort", description = "Server port. If null will use default port: 8864")
    private Integer serverPort;
}
