package libnpvtunnel;

/* JADX INFO: loaded from: classes2.dex */
public interface XrayTunnelInterface {
    void bindToDevice(long j6);

    long getFd();

    java.lang.String getPrimaryDnsServer();

    java.lang.String getSecondaryDnsServer();

    void onConfigTimeLeft(java.lang.String str);

    void onConfigurationExpired();

    void onConfigurationExpiryCheckFailed(java.lang.String str);

    void onExiting();

    void onLogMessage(java.lang.String str);

    void onReceived(long j6);

    void onSent(long j6);
}
