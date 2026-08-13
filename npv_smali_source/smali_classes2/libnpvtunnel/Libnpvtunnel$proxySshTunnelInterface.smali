.class final Llibnpvtunnel/Libnpvtunnel$proxySshTunnelInterface;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgo/Seq$Proxy;
.implements Llibnpvtunnel/SshTunnelInterface;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llibnpvtunnel/Libnpvtunnel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "proxySshTunnelInterface"
.end annotation


# instance fields
.field private final refnum:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Llibnpvtunnel/Libnpvtunnel$proxySshTunnelInterface;->refnum:I

    invoke-static {p1, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method


# virtual methods
.method public native bindToDevice(J)V
.end method

.method public native getFd()J
.end method

.method public native getPrimaryDnsServer()Ljava/lang/String;
.end method

.method public native getSecondaryDnsServer()Ljava/lang/String;
.end method

.method public final incRefnum()I
    .locals 1

    iget v0, p0, Llibnpvtunnel/Libnpvtunnel$proxySshTunnelInterface;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->incGoRef(ILgo/Seq$GoObject;)V

    iget v0, p0, Llibnpvtunnel/Libnpvtunnel$proxySshTunnelInterface;->refnum:I

    return v0
.end method

.method public native onBytesTransferred(JJ)V
.end method

.method public native onConfigTimeLeft(Ljava/lang/String;)V
.end method

.method public native onConfigurationExpired()V
.end method

.method public native onConfigurationExpiryCheckFailed(Ljava/lang/String;)V
.end method

.method public native onConnectionFailed(Ljava/lang/String;)V
.end method

.method public native onExiting()V
.end method

.method public native onLogMessage(Ljava/lang/String;)V
.end method

.method public native onReconnecting()V
.end method

.method public native onSendingPayload(Ljava/lang/String;)V
.end method

.method public native onServerMessage(Ljava/lang/String;)V
.end method

.method public native onServerResponse(Ljava/lang/String;)V
.end method

.method public native onSshConnected()V
.end method

.method public native onSshConnecting()V
.end method

.method public native onTotalBytesTransferred(JJ)V
.end method
