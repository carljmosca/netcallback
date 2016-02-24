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
public class PrivateServerOptions extends BaseOptions {

    @Parameter(names = "--service-host", required = true, description = "port used to receive private server communications")
    private String serviceHost;
    @Parameter(names = "--tcp-host", required = false, description = "clients use this TCP host to use tunnel")
    private String tcpHost;
    @Parameter(names = "--udp-host", required = false, description = "clients use this UDP host to use tunnel")
    private String udpHost;

    public String getServiceHost() {
        return serviceHost;
    }

    public void setServiceHost(String serviceHost) {
        this.serviceHost = serviceHost;
    }

    public String getTcpHost() {
        return tcpHost;
    }

    public void setTcpHost(String tcpHost) {
        this.tcpHost = tcpHost;
    }

    public String getUdpHost() {
        return udpHost;
    }

    public void setUdpHost(String udpHost) {
        this.udpHost = udpHost;
    }

}
