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

    public final String ENV_SERVER_TYPE = "NCB_SERVER_TYPE";
    public final String ENV_SERVICE_PORT = "NCB_SERVICE_PORT";
    public final String ENV_TCP_PORT = "NCB_TCP_PORT";
    public final String ENV_UDP_PORT = "NCB_UDP_PORT";
    public final String ENV_SSL = "NCB_SSL";
    public final String ENV_SERVICE_HOST = "NCB_SERVICE_HOST";
    public final String ENV_TCP_HOST = "NCB_TCP_HOST";
    public final String ENV_UDP_HOST = "NCB_UDP_HOST";
    public final String ENV_INITIAL_ANONYMOUS_PORT = "NCB_INITIAL_ANONYMOUS_PORT";
    public final String ENV_FINAL_ANONYMOUS_PORT = "NCB_FINAL_ANONYMOUS_PORT";

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
    @Parameter(names = "--initial-anonymous-port", required = false, description = "initiail anonymous port")
    private Integer initialAnonymousPort;
    @Parameter(names = "--final-anonymous-port", required = false, description = "final anonymous port")
    private Integer finalAnonymousPort;

    public NcOptions() {
        parameters = new ArrayList<>();
        servicePort = 0;
        tcpPort = 0;
        udpPort = 0;
        initialAnonymousPort = 0;
        loadFromEnvironment();
    }

    private void loadFromEnvironment() {
        parameters.add(loadString(ENV_SERVER_TYPE));
        servicePort = loadInteger(ENV_SERVICE_PORT);
        tcpPort = loadInteger(ENV_TCP_PORT);
        udpPort = loadInteger(ENV_UDP_PORT);
        ssl = loadBoolean(ENV_SSL);
        serviceHost = loadString(ENV_SERVICE_HOST);
        tcpHost = loadString(ENV_TCP_HOST);
        udpHost = loadString(ENV_UDP_HOST);
        initialAnonymousPort = loadInteger(ENV_INITIAL_ANONYMOUS_PORT);
        finalAnonymousPort = loadInteger(ENV_FINAL_ANONYMOUS_PORT);
    }

    private String loadString(String name) {
        String result = System.getenv(name);
        return result != null ? result : "";
    }

    private boolean loadBoolean(String name) {
        String s = System.getenv(name);
        if (s != null) {
           return !s.equalsIgnoreCase("TRUE") && !s.equals("1");
        }
        return false;
    }

    private Integer loadInteger(String name) {
        String s = System.getenv(name);
        if (s != null) {
            try {
                Integer i = Integer.valueOf(s);
                return i;
            } catch (NumberFormatException e) {

            }
        }
        return 0;
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

    public Integer getInitialAnonymousPort() {
        return initialAnonymousPort;
    }

    public void setInitialAnonymousPort(Integer initialAnonymousPort) {
        this.initialAnonymousPort = initialAnonymousPort;
    }

    public Integer getFinalAnonymousPort() {
        return finalAnonymousPort;
    }

    public void setFinalAnonymousPort(Integer finalAnonymousPort) {
        this.finalAnonymousPort = finalAnonymousPort;
    }

}
