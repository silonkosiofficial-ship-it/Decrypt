.class public abstract Lcom/google/android/gms/internal/ads/Gn0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/google/android/gms/internal/ads/Lu0;

.field private static final b:Lcom/google/android/gms/internal/ads/iq0;

.field private static final c:Lcom/google/android/gms/internal/ads/eq0;

.field private static final d:Lcom/google/android/gms/internal/ads/vp0;

.field private static final e:Lcom/google/android/gms/internal/ads/rp0;

.field public static final synthetic f:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Kq0;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Lu0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/Gn0;->a:Lcom/google/android/gms/internal/ads/Lu0;

    new-instance v1, Lcom/google/android/gms/internal/ads/Cn0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/Cn0;-><init>()V

    const-class v2, Lcom/google/android/gms/internal/ads/Bn0;

    const-class v3, Lcom/google/android/gms/internal/ads/yq0;

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/iq0;->b(Lcom/google/android/gms/internal/ads/gq0;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/iq0;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/Gn0;->b:Lcom/google/android/gms/internal/ads/iq0;

    new-instance v1, Lcom/google/android/gms/internal/ads/Dn0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/Dn0;-><init>()V

    invoke-static {v1, v0, v3}, Lcom/google/android/gms/internal/ads/eq0;->b(Lcom/google/android/gms/internal/ads/cq0;Lcom/google/android/gms/internal/ads/Lu0;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/eq0;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/Gn0;->c:Lcom/google/android/gms/internal/ads/eq0;

    new-instance v1, Lcom/google/android/gms/internal/ads/En0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/En0;-><init>()V

    const-class v2, Lcom/google/android/gms/internal/ads/wn0;

    const-class v3, Lcom/google/android/gms/internal/ads/xq0;

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/vp0;->b(Lcom/google/android/gms/internal/ads/tp0;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/vp0;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/Gn0;->d:Lcom/google/android/gms/internal/ads/vp0;

    new-instance v1, Lcom/google/android/gms/internal/ads/Fn0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/Fn0;-><init>()V

    invoke-static {v1, v0, v3}, Lcom/google/android/gms/internal/ads/rp0;->b(Lcom/google/android/gms/internal/ads/pp0;Lcom/google/android/gms/internal/ads/Lu0;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/rp0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/Gn0;->e:Lcom/google/android/gms/internal/ads/rp0;

    return-void
.end method

.method public static synthetic a(Lcom/google/android/gms/internal/ads/xq0;Lcom/google/android/gms/internal/ads/Wl0;)Lcom/google/android/gms/internal/ads/wn0;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/xq0;->g()Ljava/lang/String;

    move-result-object p1

    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/xq0;->d()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/ads/xv0;->a()Lcom/google/android/gms/internal/ads/xv0;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/Gt0;->e0(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Gt0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Gt0;->b0()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Gt0;->f0()Lcom/google/android/gms/internal/ads/Jt0;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/xq0;->c()Lcom/google/android/gms/internal/ads/Kt0;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/Gn0;->f(Lcom/google/android/gms/internal/ads/Jt0;Lcom/google/android/gms/internal/ads/Kt0;)Lcom/google/android/gms/internal/ads/Bn0;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/xq0;->e()Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/wn0;->a(Lcom/google/android/gms/internal/ads/Bn0;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/wn0;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "KmsEnvelopeAeadKeys are only accepted with version 0, got "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Vv0; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing KmsEnvelopeAeadKey failed: "

    invoke-direct {p1, v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic b(Lcom/google/android/gms/internal/ads/yq0;)Lcom/google/android/gms/internal/ads/Bn0;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/yq0;->c()Lcom/google/android/gms/internal/ads/jt0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/jt0;->h0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/yq0;->c()Lcom/google/android/gms/internal/ads/jt0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/jt0;->g0()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/xv0;->a()Lcom/google/android/gms/internal/ads/xv0;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/Jt0;->f0(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Jt0;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Vv0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/yq0;->c()Lcom/google/android/gms/internal/ads/jt0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/jt0;->f0()Lcom/google/android/gms/internal/ads/Kt0;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/Gn0;->f(Lcom/google/android/gms/internal/ads/Jt0;Lcom/google/android/gms/internal/ads/Kt0;)Lcom/google/android/gms/internal/ads/Bn0;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing KmsEnvelopeAeadKeyFormat failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/yq0;->c()Lcom/google/android/gms/internal/ads/jt0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/jt0;->h0()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic c(Lcom/google/android/gms/internal/ads/wn0;Lcom/google/android/gms/internal/ads/Wl0;)Lcom/google/android/gms/internal/ads/xq0;
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/ads/Gt0;->c0()Lcom/google/android/gms/internal/ads/Et0;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wn0;->b()Lcom/google/android/gms/internal/ads/Bn0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Gn0;->g(Lcom/google/android/gms/internal/ads/Bn0;)Lcom/google/android/gms/internal/ads/Jt0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/Et0;->z(Lcom/google/android/gms/internal/ads/Jt0;)Lcom/google/android/gms/internal/ads/Et0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Gt0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ou0;->g()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/ads/dt0;->H:Lcom/google/android/gms/internal/ads/dt0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wn0;->b()Lcom/google/android/gms/internal/ads/Bn0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Bn0;->c()Lcom/google/android/gms/internal/ads/zn0;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Gn0;->h(Lcom/google/android/gms/internal/ads/zn0;)Lcom/google/android/gms/internal/ads/Kt0;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/wn0;->c()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-static {v2, p1, v0, v1, p0}, Lcom/google/android/gms/internal/ads/xq0;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/dt0;Lcom/google/android/gms/internal/ads/Kt0;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/xq0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/google/android/gms/internal/ads/Bn0;)Lcom/google/android/gms/internal/ads/yq0;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/ads/jt0;->b0()Lcom/google/android/gms/internal/ads/ht0;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ht0;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ht0;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Gn0;->g(Lcom/google/android/gms/internal/ads/Bn0;)Lcom/google/android/gms/internal/ads/Jt0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Ou0;->g()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ht0;->B(Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/ht0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Bn0;->c()Lcom/google/android/gms/internal/ads/zn0;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Gn0;->h(Lcom/google/android/gms/internal/ads/zn0;)Lcom/google/android/gms/internal/ads/Kt0;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/ht0;->z(Lcom/google/android/gms/internal/ads/Kt0;)Lcom/google/android/gms/internal/ads/ht0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/jt0;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/yq0;->b(Lcom/google/android/gms/internal/ads/jt0;)Lcom/google/android/gms/internal/ads/yq0;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lcom/google/android/gms/internal/ads/Zp0;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Gn0;->b:Lcom/google/android/gms/internal/ads/iq0;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/Zp0;->i(Lcom/google/android/gms/internal/ads/iq0;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Gn0;->c:Lcom/google/android/gms/internal/ads/eq0;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/Zp0;->h(Lcom/google/android/gms/internal/ads/eq0;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Gn0;->d:Lcom/google/android/gms/internal/ads/vp0;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/Zp0;->g(Lcom/google/android/gms/internal/ads/vp0;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Gn0;->e:Lcom/google/android/gms/internal/ads/rp0;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/Zp0;->f(Lcom/google/android/gms/internal/ads/rp0;)V

    return-void
.end method

.method private static f(Lcom/google/android/gms/internal/ads/Jt0;Lcom/google/android/gms/internal/ads/Kt0;)Lcom/google/android/gms/internal/ads/Bn0;
    .locals 5

    .prologue
    invoke-static {}, Lcom/google/android/gms/internal/ads/jt0;->b0()Lcom/google/android/gms/internal/ads/ht0;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Jt0;->b0()Lcom/google/android/gms/internal/ads/jt0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/jt0;->h0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ht0;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ht0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Jt0;->b0()Lcom/google/android/gms/internal/ads/jt0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/jt0;->g0()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ht0;->B(Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/ht0;

    sget-object v1, Lcom/google/android/gms/internal/ads/Kt0;->G:Lcom/google/android/gms/internal/ads/Kt0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ht0;->z(Lcom/google/android/gms/internal/ads/Kt0;)Lcom/google/android/gms/internal/ads/ht0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/jt0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ou0;->l()[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Yl0;->a([B)Lcom/google/android/gms/internal/ads/Sl0;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/Pm0;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/ads/yn0;->b:Lcom/google/android/gms/internal/ads/yn0;

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/gn0;

    if-eqz v1, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/ads/yn0;->d:Lcom/google/android/gms/internal/ads/yn0;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/co0;

    if-eqz v1, :cond_2

    sget-object v1, Lcom/google/android/gms/internal/ads/yn0;->c:Lcom/google/android/gms/internal/ads/yn0;

    goto :goto_0

    :cond_2
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/tm0;

    if-eqz v1, :cond_3

    sget-object v1, Lcom/google/android/gms/internal/ads/yn0;->e:Lcom/google/android/gms/internal/ads/yn0;

    goto :goto_0

    :cond_3
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/Dm0;

    if-eqz v1, :cond_4

    sget-object v1, Lcom/google/android/gms/internal/ads/yn0;->f:Lcom/google/android/gms/internal/ads/yn0;

    goto :goto_0

    :cond_4
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/an0;

    if-eqz v1, :cond_7

    sget-object v1, Lcom/google/android/gms/internal/ads/yn0;->g:Lcom/google/android/gms/internal/ads/yn0;

    :goto_0
    new-instance v2, Lcom/google/android/gms/internal/ads/xn0;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/xn0;-><init>(Lcom/google/android/gms/internal/ads/An0;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_6

    const/4 v4, 0x3

    if-ne v3, v4, :cond_5

    sget-object p1, Lcom/google/android/gms/internal/ads/zn0;->c:Lcom/google/android/gms/internal/ads/zn0;

    goto :goto_1

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Kt0;->a()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to parse OutputPrefixType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    sget-object p1, Lcom/google/android/gms/internal/ads/zn0;->b:Lcom/google/android/gms/internal/ads/zn0;

    :goto_1
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/xn0;->d(Lcom/google/android/gms/internal/ads/zn0;)Lcom/google/android/gms/internal/ads/xn0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Jt0;->g0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lcom/google/android/gms/internal/ads/xn0;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/xn0;

    check-cast v0, Lcom/google/android/gms/internal/ads/cm0;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/xn0;->a(Lcom/google/android/gms/internal/ads/cm0;)Lcom/google/android/gms/internal/ads/xn0;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/xn0;->b(Lcom/google/android/gms/internal/ads/yn0;)Lcom/google/android/gms/internal/ads/xn0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/xn0;->e()Lcom/google/android/gms/internal/ads/Bn0;

    move-result-object p0

    return-object p0

    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Unsupported DEK parameters when parsing "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static g(Lcom/google/android/gms/internal/ads/Bn0;)Lcom/google/android/gms/internal/ads/Jt0;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Bn0;->b()Lcom/google/android/gms/internal/ads/cm0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Yl0;->b(Lcom/google/android/gms/internal/ads/Sl0;)[B

    move-result-object v0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/xv0;->a()Lcom/google/android/gms/internal/ads/xv0;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/jt0;->e0([BLcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/jt0;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/Jt0;->c0()Lcom/google/android/gms/internal/ads/Ht0;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Bn0;->d()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/Ht0;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Ht0;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/Ht0;->z(Lcom/google/android/gms/internal/ads/jt0;)Lcom/google/android/gms/internal/ads/Ht0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/Jt0;
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Vv0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing KmsEnvelopeAeadKeyFormat failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static h(Lcom/google/android/gms/internal/ads/zn0;)Lcom/google/android/gms/internal/ads/Kt0;
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/zn0;->b:Lcom/google/android/gms/internal/ads/zn0;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/ads/Kt0;->E:Lcom/google/android/gms/internal/ads/Kt0;

    return-object p0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zn0;->c:Lcom/google/android/gms/internal/ads/zn0;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcom/google/android/gms/internal/ads/Kt0;->G:Lcom/google/android/gms/internal/ads/Kt0;

    return-object p0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Unable to serialize variant: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
