package com.arq.tlsbuilderchainjava.http;
import javax.net.ssl.HostnameVerifier; import javax.net.ssl.SSLSession; public class SafePartnerTlsBuilder { public HostnameVerifier build() { return new HostnameVerifier() { @Override public boolean verify(String hostname, SSLSession session) { return hostname != null && !hostname.isBlank(); } }; } }
