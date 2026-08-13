package libnpvtunnel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Libnpvtunnel {
    public static final long TLS_10 = 769;
    public static final long TLS_11 = 770;
    public static final long TLS_12 = 771;
    public static final long TLS_13 = 772;

    private static final class proxyExpiryChecker implements go.Seq.Proxy, libnpvtunnel.ExpiryChecker {
        private final int refnum;

        proxyExpiryChecker(int i6) {
            this.refnum = i6;
            go.Seq.trackGoRef(i6, this);
        }

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            go.Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // libnpvtunnel.ExpiryChecker
        public native void onExpired();
    }

    private static final class proxySshTunnelInterface implements go.Seq.Proxy, libnpvtunnel.SshTunnelInterface {
        private final int refnum;

        proxySshTunnelInterface(int i6) {
            this.refnum = i6;
            go.Seq.trackGoRef(i6, this);
        }

        @Override // libnpvtunnel.SshTunnelInterface
        public native void bindToDevice(long j6);

        @Override // libnpvtunnel.SshTunnelInterface
        public native long getFd();

        @Override // libnpvtunnel.SshTunnelInterface
        public native java.lang.String getPrimaryDnsServer();

        @Override // libnpvtunnel.SshTunnelInterface
        public native java.lang.String getSecondaryDnsServer();

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            go.Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // libnpvtunnel.SshTunnelInterface
        public native void onBytesTransferred(long j6, long j10);

        @Override // libnpvtunnel.SshTunnelInterface
        public native void onConfigTimeLeft(java.lang.String str);

        @Override // libnpvtunnel.SshTunnelInterface
        public native void onConfigurationExpired();

        @Override // libnpvtunnel.SshTunnelInterface
        public native void onConfigurationExpiryCheckFailed(java.lang.String str);

        @Override // libnpvtunnel.SshTunnelInterface
        public native void onConnectionFailed(java.lang.String str);

        @Override // libnpvtunnel.SshTunnelInterface
        public native void onExiting();

        @Override // libnpvtunnel.SshTunnelInterface
        public native void onLogMessage(java.lang.String str);

        @Override // libnpvtunnel.SshTunnelInterface
        public native void onReconnecting();

        @Override // libnpvtunnel.SshTunnelInterface
        public native void onSendingPayload(java.lang.String str);

        @Override // libnpvtunnel.SshTunnelInterface
        public native void onServerMessage(java.lang.String str);

        @Override // libnpvtunnel.SshTunnelInterface
        public native void onServerResponse(java.lang.String str);

        @Override // libnpvtunnel.SshTunnelInterface
        public native void onSshConnected();

        @Override // libnpvtunnel.SshTunnelInterface
        public native void onSshConnecting();

        @Override // libnpvtunnel.SshTunnelInterface
        public native void onTotalBytesTransferred(long j6, long j10);
    }

    private static final class proxyXrayTunnelInterface implements go.Seq.Proxy, libnpvtunnel.XrayTunnelInterface {
        private final int refnum;

        proxyXrayTunnelInterface(int i6) {
            this.refnum = i6;
            go.Seq.trackGoRef(i6, this);
        }

        @Override // libnpvtunnel.XrayTunnelInterface
        public native void bindToDevice(long j6);

        @Override // libnpvtunnel.XrayTunnelInterface
        public native long getFd();

        @Override // libnpvtunnel.XrayTunnelInterface
        public native java.lang.String getPrimaryDnsServer();

        @Override // libnpvtunnel.XrayTunnelInterface
        public native java.lang.String getSecondaryDnsServer();

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            go.Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // libnpvtunnel.XrayTunnelInterface
        public native void onConfigTimeLeft(java.lang.String str);

        @Override // libnpvtunnel.XrayTunnelInterface
        public native void onConfigurationExpired();

        @Override // libnpvtunnel.XrayTunnelInterface
        public native void onConfigurationExpiryCheckFailed(java.lang.String str);

        @Override // libnpvtunnel.XrayTunnelInterface
        public native void onExiting();

        @Override // libnpvtunnel.XrayTunnelInterface
        public native void onLogMessage(java.lang.String str);

        @Override // libnpvtunnel.XrayTunnelInterface
        public native void onReceived(long j6);

        @Override // libnpvtunnel.XrayTunnelInterface
        public native void onSent(long j6);
    }

    static {
        go.Seq.touch();
        _init();
    }

    private Libnpvtunnel() {
    }

    private static native void _init();

    public static native java.lang.String checkVersion();

    public static native java.lang.String decodeBase64(java.lang.String str);

    public static native java.lang.String encodeBase64(java.lang.String str);

    public static native long getFreePort(java.lang.String str);

    public static native byte[] hexDecode(byte[] bArr);

    public static native java.lang.String hexEncode(byte[] bArr);

    public static native void initV2Env(java.lang.String str, java.lang.String str2);

    public static native long measureSshDelay(java.lang.String str, java.lang.String str2, long j6);

    public static native long measureXrayOutboundDelay(java.lang.String str, java.lang.String str2, long j6);

    public static native libnpvtunnel.SshTunnel newSshTunnel();

    public static native libnpvtunnel.XrayTunnel newXrayTunnel();

    public static native java.lang.String redactIpsAndDomainNames(java.lang.String str);

    public static native byte[] stripIPAddresses(byte[] bArr);

    public static native java.lang.String stripIPAddressesString(java.lang.String str);

    public static native void testV2rayJsonConfig(byte[] bArr);

    public static void touch() {
    }

    public static native libnpvtunnel.SshConfig validateSshConfig(byte[] bArr);

    public static native void validateV2rayConfig(java.lang.String str);
}
