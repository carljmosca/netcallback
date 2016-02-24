/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sourceforge.netcallback.options;

import com.beust.jcommander.Parameter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moscac
 */
public class NcOptions {

    @Parameter(description = "server type (private, public)")
    private List<String> parameters;
    @Parameter(names = "--service-port", required = false, description = "port used to receive private server communications")
    private Integer servicePort;
    @Parameter(names = "--tcp-port", required = false, description = "clients use this TCP port to use tunnel")
    private Integer tcpPort;
    @Parameter(names = "--udp-port", required = false, description = "clients use this UDP port to use tunnel")
    private Integer udpPort;
    @Parameter(names = "--ssl", required = false, description = "otional flag to enable SSL communication between servers")
    protected boolean ssl;
    @Parameter(names = "--service-host", required = false, description = "host used to receive private server communications")
    private String serviceHost;
    @Parameter(names = "--tcp-host", required = false, description = "clients use this TCP host to use tunnel")
    private String tcpHost;
    @Parameter(names = "--udp-host", required = false, description = "clients use this UDP host to use tunnel")
    private String udpHost;
    
    public NcOptions() {
        parameters = new ArrayList<>();
        servicePort = 0;
        tcpPort = 0;
        udpPort = 0;
    }

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

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

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

    public boolean isSsl() {
        return ssl;
    }

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }

}
