.class public abstract Llibnpvtunnel/Libnpvtunnel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llibnpvtunnel/Libnpvtunnel$proxyXrayTunnelInterface;,
        Llibnpvtunnel/Libnpvtunnel$proxySshTunnelInterface;,
        Llibnpvtunnel/Libnpvtunnel$proxyExpiryChecker;
    }
.end annotation


# static fields
.field public static final TLS_10:J = 0x301L

.field public static final TLS_11:J = 0x302L

.field public static final TLS_12:J = 0x303L

.field public static final TLS_13:J = 0x304L


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lgo/Seq;->touch()V

    invoke-static {}, Llibnpvtunnel/Libnpvtunnel;->_init()V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native _init()V
.end method

.method public static native checkVersion()Ljava/lang/String;
.end method

.method public static native decodeBase64(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native encodeBase64(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native getFreePort(Ljava/lang/String;)J
.end method

.method public static native hexDecode([B)[B
.end method

.method public static native hexEncode([B)Ljava/lang/String;
.end method

.method public static native initV2Env(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native measureSshDelay(Ljava/lang/String;Ljava/lang/String;J)J
.end method

.method public static native measureXrayOutboundDelay(Ljava/lang/String;Ljava/lang/String;J)J
.end method

.method public static native newSshTunnel()Llibnpvtunnel/SshTunnel;
.end method

.method public static native newXrayTunnel()Llibnpvtunnel/XrayTunnel;
.end method

.method public static native redactIpsAndDomainNames(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native stripIPAddresses([B)[B
.end method

.method public static native stripIPAddressesString(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native testV2rayJsonConfig([B)V
.end method

.method public static touch()V
    .locals 0

    return-void
.end method

.method public static native validateSshConfig([B)Llibnpvtunnel/SshConfig;
.end method

.method public static native validateV2rayConfig(Ljava/lang/String;)V
.end method
