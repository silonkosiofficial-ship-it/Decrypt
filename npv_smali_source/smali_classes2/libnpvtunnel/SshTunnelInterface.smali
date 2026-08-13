.class public interface abstract Llibnpvtunnel/SshTunnelInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract bindToDevice(J)V
.end method

.method public abstract getFd()J
.end method

.method public abstract getPrimaryDnsServer()Ljava/lang/String;
.end method

.method public abstract getSecondaryDnsServer()Ljava/lang/String;
.end method

.method public abstract onBytesTransferred(JJ)V
.end method

.method public abstract onConfigTimeLeft(Ljava/lang/String;)V
.end method

.method public abstract onConfigurationExpired()V
.end method

.method public abstract onConfigurationExpiryCheckFailed(Ljava/lang/String;)V
.end method

.method public abstract onConnectionFailed(Ljava/lang/String;)V
.end method

.method public abstract onExiting()V
.end method

.method public abstract onLogMessage(Ljava/lang/String;)V
.end method

.method public abstract onReconnecting()V
.end method

.method public abstract onSendingPayload(Ljava/lang/String;)V
.end method

.method public abstract onServerMessage(Ljava/lang/String;)V
.end method

.method public abstract onServerResponse(Ljava/lang/String;)V
.end method

.method public abstract onSshConnected()V
.end method

.method public abstract onSshConnecting()V
.end method

.method public abstract onTotalBytesTransferred(JJ)V
.end method
