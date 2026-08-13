package libnpvtunnel;

/* JADX INFO: loaded from: classes2.dex */
public final class SshConfig implements go.Seq.Proxy {
    private final int refnum;

    static {
        libnpvtunnel.Libnpvtunnel.touch();
    }

    public SshConfig() {
        int i__New = __New();
        this.refnum = i__New;
        go.Seq.trackGoRef(i__New, this);
    }

    SshConfig(int i6) {
        this.refnum = i6;
        go.Seq.trackGoRef(i6, this);
    }

    private static native int __New();

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof libnpvtunnel.SshConfig)) {
            return false;
        }
        libnpvtunnel.SshConfig sshConfig = (libnpvtunnel.SshConfig) obj;
        java.lang.String sshAddress = getSshAddress();
        java.lang.String sshAddress2 = sshConfig.getSshAddress();
        if (sshAddress == null) {
            if (sshAddress2 != null) {
                return false;
            }
        } else if (!sshAddress.equals(sshAddress2)) {
            return false;
        }
        java.lang.String sshUsername = getSshUsername();
        java.lang.String sshUsername2 = sshConfig.getSshUsername();
        if (sshUsername == null) {
            if (sshUsername2 != null) {
                return false;
            }
        } else if (!sshUsername.equals(sshUsername2)) {
            return false;
        }
        java.lang.String sshPassword = getSshPassword();
        java.lang.String sshPassword2 = sshConfig.getSshPassword();
        if (sshPassword == null) {
            if (sshPassword2 != null) {
                return false;
            }
        } else if (!sshPassword.equals(sshPassword2)) {
            return false;
        }
        java.lang.String httpProxy = getHttpProxy();
        java.lang.String httpProxy2 = sshConfig.getHttpProxy();
        if (httpProxy == null) {
            if (httpProxy2 != null) {
                return false;
            }
        } else if (!httpProxy.equals(httpProxy2)) {
            return false;
        }
        java.lang.String proxyUsername = getProxyUsername();
        java.lang.String proxyUsername2 = sshConfig.getProxyUsername();
        if (proxyUsername == null) {
            if (proxyUsername2 != null) {
                return false;
            }
        } else if (!proxyUsername.equals(proxyUsername2)) {
            return false;
        }
        java.lang.String proxyPassword = getProxyPassword();
        java.lang.String proxyPassword2 = sshConfig.getProxyPassword();
        if (proxyPassword == null) {
            if (proxyPassword2 != null) {
                return false;
            }
        } else if (!proxyPassword.equals(proxyPassword2)) {
            return false;
        }
        java.lang.String payload = getPayload();
        java.lang.String payload2 = sshConfig.getPayload();
        if (payload == null) {
            if (payload2 != null) {
                return false;
            }
        } else if (!payload.equals(payload2)) {
            return false;
        }
        java.lang.String sni = getSni();
        java.lang.String sni2 = sshConfig.getSni();
        if (sni == null) {
            if (sni2 != null) {
                return false;
            }
        } else if (!sni.equals(sni2)) {
            return false;
        }
        java.lang.String tLSVersion = getTLSVersion();
        java.lang.String tLSVersion2 = sshConfig.getTLSVersion();
        if (tLSVersion == null) {
            if (tLSVersion2 != null) {
                return false;
            }
        } else if (!tLSVersion.equals(tLSVersion2)) {
            return false;
        }
        java.lang.String dnsTTMode = getDnsTTMode();
        java.lang.String dnsTTMode2 = sshConfig.getDnsTTMode();
        if (dnsTTMode == null) {
            if (dnsTTMode2 != null) {
                return false;
            }
        } else if (!dnsTTMode.equals(dnsTTMode2)) {
            return false;
        }
        java.lang.String dnsTTResolver = getDnsTTResolver();
        java.lang.String dnsTTResolver2 = sshConfig.getDnsTTResolver();
        if (dnsTTResolver == null) {
            if (dnsTTResolver2 != null) {
                return false;
            }
        } else if (!dnsTTResolver.equals(dnsTTResolver2)) {
            return false;
        }
        java.lang.String publicKey = getPublicKey();
        java.lang.String publicKey2 = sshConfig.getPublicKey();
        if (publicKey == null) {
            if (publicKey2 != null) {
                return false;
            }
        } else if (!publicKey.equals(publicKey2)) {
            return false;
        }
        java.lang.String nameserver = getNameserver();
        java.lang.String nameserver2 = sshConfig.getNameserver();
        if (nameserver == null) {
            if (nameserver2 != null) {
                return false;
            }
        } else if (!nameserver.equals(nameserver2)) {
            return false;
        }
        if (getUdpgwPort() != sshConfig.getUdpgwPort()) {
            return false;
        }
        java.lang.String tunnelType = getTunnelType();
        java.lang.String tunnelType2 = sshConfig.getTunnelType();
        if (tunnelType == null) {
            if (tunnelType2 != null) {
                return false;
            }
        } else if (!tunnelType.equals(tunnelType2)) {
            return false;
        }
        return getAuthenticateProxy() == sshConfig.getAuthenticateProxy() && getUdpgwTransparentDNS() == sshConfig.getUdpgwTransparentDNS();
    }

    public final native boolean getAuthenticateProxy();

    public final native java.lang.String getDnsTTMode();

    public final native java.lang.String getDnsTTResolver();

    public final native java.lang.String getHttpProxy();

    public final native java.lang.String getNameserver();

    public final native java.lang.String getPayload();

    public final native java.lang.String getProxyPassword();

    public final native java.lang.String getProxyUsername();

    public final native java.lang.String getPublicKey();

    public final native java.lang.String getSni();

    public final native java.lang.String getSshAddress();

    public final native java.lang.String getSshPassword();

    public final native java.lang.String getSshUsername();

    public final native java.lang.String getTLSVersion();

    public final native java.lang.String getTunnelType();

    public final native long getUdpgwPort();

    public final native boolean getUdpgwTransparentDNS();

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{getSshAddress(), getSshUsername(), getSshPassword(), getHttpProxy(), getProxyUsername(), getProxyPassword(), getPayload(), getSni(), getTLSVersion(), getDnsTTMode(), getDnsTTResolver(), getPublicKey(), getNameserver(), java.lang.Long.valueOf(getUdpgwPort()), getTunnelType(), java.lang.Boolean.valueOf(getAuthenticateProxy()), java.lang.Boolean.valueOf(getUdpgwTransparentDNS())});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        go.Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setAuthenticateProxy(boolean z6);

    public final native void setDnsTTMode(java.lang.String str);

    public final native void setDnsTTResolver(java.lang.String str);

    public final native void setHttpProxy(java.lang.String str);

    public final native void setNameserver(java.lang.String str);

    public final native void setPayload(java.lang.String str);

    public final native void setProxyPassword(java.lang.String str);

    public final native void setProxyUsername(java.lang.String str);

    public final native void setPublicKey(java.lang.String str);

    public final native void setSni(java.lang.String str);

    public final native void setSshAddress(java.lang.String str);

    public final native void setSshPassword(java.lang.String str);

    public final native void setSshUsername(java.lang.String str);

    public final native void setTLSVersion(java.lang.String str);

    public final native void setTunnelType(java.lang.String str);

    public final native void setUdpgwPort(long j6);

    public final native void setUdpgwTransparentDNS(boolean z6);

    public java.lang.String toString() {
        return "SshConfig{SshAddress:" + getSshAddress() + ",SshUsername:" + getSshUsername() + ",SshPassword:" + getSshPassword() + ",HttpProxy:" + getHttpProxy() + ",ProxyUsername:" + getProxyUsername() + ",ProxyPassword:" + getProxyPassword() + ",Payload:" + getPayload() + ",Sni:" + getSni() + ",TLSVersion:" + getTLSVersion() + ",DnsTTMode:" + getDnsTTMode() + ",DnsTTResolver:" + getDnsTTResolver() + ",PublicKey:" + getPublicKey() + ",Nameserver:" + getNameserver() + ",UdpgwPort:" + getUdpgwPort() + ",TunnelType:" + getTunnelType() + ",AuthenticateProxy:" + getAuthenticateProxy() + ",UdpgwTransparentDNS:" + getUdpgwTransparentDNS() + ",}";
    }
}
