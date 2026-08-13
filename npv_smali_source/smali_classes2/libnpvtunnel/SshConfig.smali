.class public final Llibnpvtunnel/SshConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgo/Seq$Proxy;


# instance fields
.field private final refnum:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Llibnpvtunnel/Libnpvtunnel;->touch()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Llibnpvtunnel/SshConfig;->__New()I

    move-result v0

    iput v0, p0, Llibnpvtunnel/SshConfig;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Llibnpvtunnel/SshConfig;->refnum:I

    invoke-static {p1, p0}, Lgo/Seq;->trackGoRef(ILgo/Seq$GoObject;)V

    return-void
.end method

.method private static native __New()I
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    if-eqz p1, :cond_20

    instance-of v1, p1, Llibnpvtunnel/SshConfig;

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    check-cast p1, Llibnpvtunnel/SshConfig;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getSshAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibnpvtunnel/SshConfig;->getSshAddress()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_1

    if-eqz v2, :cond_2

    return v0

    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getSshUsername()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibnpvtunnel/SshConfig;->getSshUsername()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_3

    if-eqz v2, :cond_4

    return v0

    :cond_3
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v0

    :cond_4
    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getSshPassword()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibnpvtunnel/SshConfig;->getSshPassword()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_5

    if-eqz v2, :cond_6

    return v0

    :cond_5
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v0

    :cond_6
    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getHttpProxy()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibnpvtunnel/SshConfig;->getHttpProxy()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_7

    if-eqz v2, :cond_8

    return v0

    :cond_7
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v0

    :cond_8
    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getProxyUsername()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibnpvtunnel/SshConfig;->getProxyUsername()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_9

    if-eqz v2, :cond_a

    return v0

    :cond_9
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v0

    :cond_a
    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getProxyPassword()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibnpvtunnel/SshConfig;->getProxyPassword()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_b

    if-eqz v2, :cond_c

    return v0

    :cond_b
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v0

    :cond_c
    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getPayload()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibnpvtunnel/SshConfig;->getPayload()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_d

    if-eqz v2, :cond_e

    return v0

    :cond_d
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v0

    :cond_e
    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getSni()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibnpvtunnel/SshConfig;->getSni()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_f

    if-eqz v2, :cond_10

    return v0

    :cond_f
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v0

    :cond_10
    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getTLSVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibnpvtunnel/SshConfig;->getTLSVersion()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_11

    if-eqz v2, :cond_12

    return v0

    :cond_11
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v0

    :cond_12
    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getDnsTTMode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibnpvtunnel/SshConfig;->getDnsTTMode()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_13

    if-eqz v2, :cond_14

    return v0

    :cond_13
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v0

    :cond_14
    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getDnsTTResolver()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibnpvtunnel/SshConfig;->getDnsTTResolver()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_15

    if-eqz v2, :cond_16

    return v0

    :cond_15
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v0

    :cond_16
    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getPublicKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibnpvtunnel/SshConfig;->getPublicKey()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_17

    if-eqz v2, :cond_18

    return v0

    :cond_17
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v0

    :cond_18
    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getNameserver()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibnpvtunnel/SshConfig;->getNameserver()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_19

    if-eqz v2, :cond_1a

    return v0

    :cond_19
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v0

    :cond_1a
    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getUdpgwPort()J

    move-result-wide v1

    invoke-virtual {p1}, Llibnpvtunnel/SshConfig;->getUdpgwPort()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-eqz v1, :cond_1b

    return v0

    :cond_1b
    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getTunnelType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llibnpvtunnel/SshConfig;->getTunnelType()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_1c

    if-eqz v2, :cond_1d

    return v0

    :cond_1c
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v0

    :cond_1d
    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getAuthenticateProxy()Z

    move-result v1

    invoke-virtual {p1}, Llibnpvtunnel/SshConfig;->getAuthenticateProxy()Z

    move-result v2

    if-eq v1, v2, :cond_1e

    return v0

    :cond_1e
    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getUdpgwTransparentDNS()Z

    move-result v1

    invoke-virtual {p1}, Llibnpvtunnel/SshConfig;->getUdpgwTransparentDNS()Z

    move-result p1

    if-eq v1, p1, :cond_1f

    return v0

    :cond_1f
    const/4 p1, 0x1

    return p1

    :cond_20
    :goto_0
    return v0
.end method

.method public final native getAuthenticateProxy()Z
.end method

.method public final native getDnsTTMode()Ljava/lang/String;
.end method

.method public final native getDnsTTResolver()Ljava/lang/String;
.end method

.method public final native getHttpProxy()Ljava/lang/String;
.end method

.method public final native getNameserver()Ljava/lang/String;
.end method

.method public final native getPayload()Ljava/lang/String;
.end method

.method public final native getProxyPassword()Ljava/lang/String;
.end method

.method public final native getProxyUsername()Ljava/lang/String;
.end method

.method public final native getPublicKey()Ljava/lang/String;
.end method

.method public final native getSni()Ljava/lang/String;
.end method

.method public final native getSshAddress()Ljava/lang/String;
.end method

.method public final native getSshPassword()Ljava/lang/String;
.end method

.method public final native getSshUsername()Ljava/lang/String;
.end method

.method public final native getTLSVersion()Ljava/lang/String;
.end method

.method public final native getTunnelType()Ljava/lang/String;
.end method

.method public final native getUdpgwPort()J
.end method

.method public final native getUdpgwTransparentDNS()Z
.end method

.method public hashCode()I
    .locals 19

    invoke-virtual/range {p0 .. p0}, Llibnpvtunnel/SshConfig;->getSshAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Llibnpvtunnel/SshConfig;->getSshUsername()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Llibnpvtunnel/SshConfig;->getSshPassword()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Llibnpvtunnel/SshConfig;->getHttpProxy()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Llibnpvtunnel/SshConfig;->getProxyUsername()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Llibnpvtunnel/SshConfig;->getProxyPassword()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Llibnpvtunnel/SshConfig;->getPayload()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Llibnpvtunnel/SshConfig;->getSni()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Llibnpvtunnel/SshConfig;->getTLSVersion()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Llibnpvtunnel/SshConfig;->getDnsTTMode()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Llibnpvtunnel/SshConfig;->getDnsTTResolver()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Llibnpvtunnel/SshConfig;->getPublicKey()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Llibnpvtunnel/SshConfig;->getNameserver()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Llibnpvtunnel/SshConfig;->getUdpgwPort()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Llibnpvtunnel/SshConfig;->getTunnelType()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Llibnpvtunnel/SshConfig;->getAuthenticateProxy()Z

    move-result v15

    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Llibnpvtunnel/SshConfig;->getUdpgwTransparentDNS()Z

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v16

    move-object/from16 v17, v15

    const/16 v15, 0x11

    new-array v15, v15, [Ljava/lang/Object;

    const/16 v18, 0x0

    aput-object v0, v15, v18

    const/4 v0, 0x1

    aput-object v1, v15, v0

    const/4 v0, 0x2

    aput-object v2, v15, v0

    const/4 v0, 0x3

    aput-object v3, v15, v0

    const/4 v0, 0x4

    aput-object v4, v15, v0

    const/4 v0, 0x5

    aput-object v5, v15, v0

    const/4 v0, 0x6

    aput-object v6, v15, v0

    const/4 v0, 0x7

    aput-object v7, v15, v0

    const/16 v0, 0x8

    aput-object v8, v15, v0

    const/16 v0, 0x9

    aput-object v9, v15, v0

    const/16 v0, 0xa

    aput-object v10, v15, v0

    const/16 v0, 0xb

    aput-object v11, v15, v0

    const/16 v0, 0xc

    aput-object v12, v15, v0

    const/16 v0, 0xd

    aput-object v13, v15, v0

    const/16 v0, 0xe

    aput-object v14, v15, v0

    const/16 v0, 0xf

    aput-object v17, v15, v0

    const/16 v0, 0x10

    aput-object v16, v15, v0

    invoke-static {v15}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final incRefnum()I
    .locals 1

    iget v0, p0, Llibnpvtunnel/SshConfig;->refnum:I

    invoke-static {v0, p0}, Lgo/Seq;->incGoRef(ILgo/Seq$GoObject;)V

    iget v0, p0, Llibnpvtunnel/SshConfig;->refnum:I

    return v0
.end method

.method public final native setAuthenticateProxy(Z)V
.end method

.method public final native setDnsTTMode(Ljava/lang/String;)V
.end method

.method public final native setDnsTTResolver(Ljava/lang/String;)V
.end method

.method public final native setHttpProxy(Ljava/lang/String;)V
.end method

.method public final native setNameserver(Ljava/lang/String;)V
.end method

.method public final native setPayload(Ljava/lang/String;)V
.end method

.method public final native setProxyPassword(Ljava/lang/String;)V
.end method

.method public final native setProxyUsername(Ljava/lang/String;)V
.end method

.method public final native setPublicKey(Ljava/lang/String;)V
.end method

.method public final native setSni(Ljava/lang/String;)V
.end method

.method public final native setSshAddress(Ljava/lang/String;)V
.end method

.method public final native setSshPassword(Ljava/lang/String;)V
.end method

.method public final native setSshUsername(Ljava/lang/String;)V
.end method

.method public final native setTLSVersion(Ljava/lang/String;)V
.end method

.method public final native setTunnelType(Ljava/lang/String;)V
.end method

.method public final native setUdpgwPort(J)V
.end method

.method public final native setUdpgwTransparentDNS(Z)V
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SshConfig"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "SshAddress:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getSshAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "SshUsername:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getSshUsername()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "SshPassword:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getSshPassword()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "HttpProxy:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getHttpProxy()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "ProxyUsername:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getProxyUsername()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "ProxyPassword:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getProxyPassword()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Payload:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getPayload()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Sni:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getSni()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "TLSVersion:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getTLSVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "DnsTTMode:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getDnsTTMode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "DnsTTResolver:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getDnsTTResolver()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "PublicKey:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getPublicKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Nameserver:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getNameserver()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "UdpgwPort:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getUdpgwPort()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "TunnelType:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getTunnelType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "AuthenticateProxy:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getAuthenticateProxy()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "UdpgwTransparentDNS:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llibnpvtunnel/SshConfig;->getUdpgwTransparentDNS()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
