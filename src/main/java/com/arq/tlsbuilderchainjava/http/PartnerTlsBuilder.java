
package com.arq.tlsbuilderchainjava.http;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class PartnerTlsBuilder {
    public HostnameVerifier buildHostnameVerifier() {
        return new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
    }
}
