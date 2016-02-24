/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sourceforge.netcallback.options;

import com.beust.jcommander.Parameter;

/**
 *
 * @author moscac
 */
public class BaseOptions {

    @Parameter(names = "--service-port", required = true, description = "port used to receive private server communications")
    private Integer servicePort;
    @Parameter(names = "--tcp-port", required = false, description = "clients use this TCP port to use tunnel")
    private Integer tcpPort;
    @Parameter(names = "--udp-port", required = false, description = "clients use this UDP port to use tunnel")
    private Integer udpPort;
    @Parameter(names = "--ssl", required = false, description = "otional flag to enable SSL communication between servers")
    protected Boolean ssl = Boolean.FALSE;

    public Integer getServicePort() {
        return servicePort;
    }

    public void setServicePort(Integer servicePort) {
        this.servicePort = servicePort;
    }

    public Integer getTcpPort() {
        return tcpPort;
    }

    public void setTcpPort(Integer tcpPort) {
        this.tcpPort = tcpPort;
    }

    public Integer getUdpPort() {
        return udpPort;
    }

    public void setUdpPort(Integer udpPort) {
        this.udpPort = udpPort;
    }

    public Boolean getSsl() {
        return ssl;
    }

    public void setSsl(Boolean ssl) {
        this.ssl = ssl;
    }

}
