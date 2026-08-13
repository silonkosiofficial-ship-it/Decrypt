package libnpvtunnel;

/* JADX INFO: loaded from: classes2.dex */
public interface SshTunnelInterface {
    void bindToDevice(long j6);

    long getFd();

    java.lang.String getPrimaryDnsServer();

    java.lang.String getSecondaryDnsServer();

    void onBytesTransferred(long j6, long j10);

    void onConfigTimeLeft(java.lang.String str);

    void onConfigurationExpired();

    void onConfigurationExpiryCheckFailed(java.lang.String str);

    void onConnectionFailed(java.lang.String str);

    void onExiting();

    void onLogMessage(java.lang.String str);

    void onReconnecting();

    void onSendingPayload(java.lang.String str);

    void onServerMessage(java.lang.String str);

    void onServerResponse(java.lang.String str);

    void onSshConnected();

    void onSshConnecting();

    void onTotalBytesTransferred(long j6, long j10);
}
