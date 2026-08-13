.class public abstract Lcom/google/android/gms/internal/ads/ho0;
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

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Kq0;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Lu0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/ho0;->a:Lcom/google/android/gms/internal/ads/Lu0;

    new-instance v1, Lcom/google/android/gms/internal/ads/do0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/do0;-><init>()V

    const-class v2, Lcom/google/android/gms/internal/ads/tm0;

    const-class v3, Lcom/google/android/gms/internal/ads/yq0;

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/iq0;->b(Lcom/google/android/gms/internal/ads/gq0;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/iq0;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/ho0;->b:Lcom/google/android/gms/internal/ads/iq0;

    new-instance v1, Lcom/google/android/gms/internal/ads/eo0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/eo0;-><init>()V

    invoke-static {v1, v0, v3}, Lcom/google/android/gms/internal/ads/eq0;->b(Lcom/google/android/gms/internal/ads/cq0;Lcom/google/android/gms/internal/ads/Lu0;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/eq0;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/ho0;->c:Lcom/google/android/gms/internal/ads/eq0;

    new-instance v1, Lcom/google/android/gms/internal/ads/fo0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/fo0;-><init>()V

    const-class v2, Lcom/google/android/gms/internal/ads/km0;

    const-class v3, Lcom/google/android/gms/internal/ads/xq0;

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/vp0;->b(Lcom/google/android/gms/internal/ads/tp0;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/vp0;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/ho0;->d:Lcom/google/android/gms/internal/ads/vp0;

    new-instance v1, Lcom/google/android/gms/internal/ads/go0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/go0;-><init>()V

    invoke-static {v1, v0, v3}, Lcom/google/android/gms/internal/ads/rp0;->b(Lcom/google/android/gms/internal/ads/pp0;Lcom/google/android/gms/internal/ads/Lu0;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/rp0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/ho0;->e:Lcom/google/android/gms/internal/ads/rp0;

    return-void
.end method

.method public static synthetic a(Lcom/google/android/gms/internal/ads/xq0;Lcom/google/android/gms/internal/ads/Wl0;)Lcom/google/android/gms/internal/ads/km0;
    .locals 3

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/xq0;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/xq0;->d()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/xv0;->a()Lcom/google/android/gms/internal/ads/xv0;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cs0;->e0(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/cs0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/cs0;->b0()I

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/cs0;->f0()Lcom/google/android/gms/internal/ads/is0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/is0;->b0()I

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/cs0;->g0()Lcom/google/android/gms/internal/ads/Vs0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Vs0;->b0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/tm0;->f()Lcom/google/android/gms/internal/ads/pm0;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/cs0;->f0()Lcom/google/android/gms/internal/ads/is0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/is0;->g0()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/pm0;->a(I)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/cs0;->g0()Lcom/google/android/gms/internal/ads/Vs0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Vs0;->h0()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/pm0;->c(I)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/cs0;->f0()Lcom/google/android/gms/internal/ads/is0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/is0;->f0()Lcom/google/android/gms/internal/ads/os0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/os0;->b0()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/pm0;->d(I)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/cs0;->g0()Lcom/google/android/gms/internal/ads/Vs0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Vs0;->g0()Lcom/google/android/gms/internal/ads/bt0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bt0;->b0()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/pm0;->e(I)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/cs0;->g0()Lcom/google/android/gms/internal/ads/Vs0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Vs0;->g0()Lcom/google/android/gms/internal/ads/bt0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bt0;->c0()Lcom/google/android/gms/internal/ads/Rs0;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/ho0;->f(Lcom/google/android/gms/internal/ads/Rs0;)Lcom/google/android/gms/internal/ads/qm0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/pm0;->b(Lcom/google/android/gms/internal/ads/qm0;)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/xq0;->c()Lcom/google/android/gms/internal/ads/Kt0;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/ho0;->g(Lcom/google/android/gms/internal/ads/Kt0;)Lcom/google/android/gms/internal/ads/rm0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/pm0;->f(Lcom/google/android/gms/internal/ads/rm0;)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/pm0;->g()Lcom/google/android/gms/internal/ads/tm0;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/km0;->a()Lcom/google/android/gms/internal/ads/hm0;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/hm0;->d(Lcom/google/android/gms/internal/ads/tm0;)Lcom/google/android/gms/internal/ads/hm0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/cs0;->f0()Lcom/google/android/gms/internal/ads/is0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/is0;->g0()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/fv0;->d()[B

    move-result-object v1

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/Mu0;->b([BLcom/google/android/gms/internal/ads/Wl0;)Lcom/google/android/gms/internal/ads/Mu0;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/hm0;->a(Lcom/google/android/gms/internal/ads/Mu0;)Lcom/google/android/gms/internal/ads/hm0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/cs0;->g0()Lcom/google/android/gms/internal/ads/Vs0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Vs0;->h0()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fv0;->d()[B

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/Mu0;->b([BLcom/google/android/gms/internal/ads/Wl0;)Lcom/google/android/gms/internal/ads/Mu0;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/hm0;->b(Lcom/google/android/gms/internal/ads/Mu0;)Lcom/google/android/gms/internal/ads/hm0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/xq0;->e()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v2, p0}, Lcom/google/android/gms/internal/ads/hm0;->c(Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/hm0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/hm0;->e()Lcom/google/android/gms/internal/ads/km0;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Only version 0 keys inner HMAC keys are accepted"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Only version 0 keys inner AES CTR keys are accepted"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Only version 0 keys are accepted"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Vv0; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Parsing AesCtrHmacAeadKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic b(Lcom/google/android/gms/internal/ads/yq0;)Lcom/google/android/gms/internal/ads/tm0;
    .locals 3

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/yq0;->c()Lcom/google/android/gms/internal/ads/jt0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/jt0;->h0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/yq0;->c()Lcom/google/android/gms/internal/ads/jt0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/jt0;->g0()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/xv0;->a()Lcom/google/android/gms/internal/ads/xv0;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/fs0;->d0(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/fs0;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Vv0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fs0;->f0()Lcom/google/android/gms/internal/ads/Ys0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Ys0;->c0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/tm0;->f()Lcom/google/android/gms/internal/ads/pm0;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fs0;->e0()Lcom/google/android/gms/internal/ads/ls0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/ls0;->b0()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/pm0;->a(I)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fs0;->f0()Lcom/google/android/gms/internal/ads/Ys0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Ys0;->b0()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/pm0;->c(I)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fs0;->e0()Lcom/google/android/gms/internal/ads/ls0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/ls0;->f0()Lcom/google/android/gms/internal/ads/os0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/os0;->b0()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/pm0;->d(I)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fs0;->f0()Lcom/google/android/gms/internal/ads/Ys0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Ys0;->h0()Lcom/google/android/gms/internal/ads/bt0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/bt0;->b0()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/pm0;->e(I)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fs0;->f0()Lcom/google/android/gms/internal/ads/Ys0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ys0;->h0()Lcom/google/android/gms/internal/ads/bt0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bt0;->c0()Lcom/google/android/gms/internal/ads/Rs0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ho0;->f(Lcom/google/android/gms/internal/ads/Rs0;)Lcom/google/android/gms/internal/ads/qm0;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/pm0;->b(Lcom/google/android/gms/internal/ads/qm0;)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/yq0;->c()Lcom/google/android/gms/internal/ads/jt0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/jt0;->f0()Lcom/google/android/gms/internal/ads/Kt0;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/ho0;->g(Lcom/google/android/gms/internal/ads/Kt0;)Lcom/google/android/gms/internal/ads/rm0;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/pm0;->f(Lcom/google/android/gms/internal/ads/rm0;)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/pm0;->g()Lcom/google/android/gms/internal/ads/tm0;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing AesCtrHmacAeadParameters failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/yq0;->c()Lcom/google/android/gms/internal/ads/jt0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/jt0;->h0()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic c(Lcom/google/android/gms/internal/ads/km0;Lcom/google/android/gms/internal/ads/Wl0;)Lcom/google/android/gms/internal/ads/xq0;
    .locals 5

    invoke-static {}, Lcom/google/android/gms/internal/ads/cs0;->c0()Lcom/google/android/gms/internal/ads/as0;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/is0;->c0()Lcom/google/android/gms/internal/ads/gs0;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/os0;->c0()Lcom/google/android/gms/internal/ads/ms0;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/km0;->b()Lcom/google/android/gms/internal/ads/tm0;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/tm0;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/ms0;->z(I)Lcom/google/android/gms/internal/ads/ms0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/os0;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/gs0;->A(Lcom/google/android/gms/internal/ads/os0;)Lcom/google/android/gms/internal/ads/gs0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/km0;->d()Lcom/google/android/gms/internal/ads/Mu0;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/Mu0;->d(Lcom/google/android/gms/internal/ads/Wl0;)[B

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    invoke-static {v2, v4, v3}, Lcom/google/android/gms/internal/ads/fv0;->T([BII)Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/gs0;->z(Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/gs0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/is0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/as0;->z(Lcom/google/android/gms/internal/ads/is0;)Lcom/google/android/gms/internal/ads/as0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Vs0;->c0()Lcom/google/android/gms/internal/ads/Ss0;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/km0;->b()Lcom/google/android/gms/internal/ads/tm0;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/ho0;->h(Lcom/google/android/gms/internal/ads/tm0;)Lcom/google/android/gms/internal/ads/bt0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/Ss0;->A(Lcom/google/android/gms/internal/ads/bt0;)Lcom/google/android/gms/internal/ads/Ss0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/km0;->e()Lcom/google/android/gms/internal/ads/Mu0;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/Mu0;->d(Lcom/google/android/gms/internal/ads/Wl0;)[B

    move-result-object p1

    array-length v2, p1

    invoke-static {p1, v4, v2}, Lcom/google/android/gms/internal/ads/fv0;->T([BII)Lcom/google/android/gms/internal/ads/fv0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/Ss0;->z(Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/Ss0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Vs0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/as0;->A(Lcom/google/android/gms/internal/ads/Vs0;)Lcom/google/android/gms/internal/ads/as0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/cs0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ou0;->g()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/ads/dt0;->E:Lcom/google/android/gms/internal/ads/dt0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/km0;->b()Lcom/google/android/gms/internal/ads/tm0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/tm0;->h()Lcom/google/android/gms/internal/ads/rm0;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ho0;->i(Lcom/google/android/gms/internal/ads/rm0;)Lcom/google/android/gms/internal/ads/Kt0;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/km0;->f()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-static {v2, p1, v0, v1, p0}, Lcom/google/android/gms/internal/ads/xq0;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/dt0;Lcom/google/android/gms/internal/ads/Kt0;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/xq0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/google/android/gms/internal/ads/tm0;)Lcom/google/android/gms/internal/ads/yq0;
    .locals 5

    invoke-static {}, Lcom/google/android/gms/internal/ads/jt0;->b0()Lcom/google/android/gms/internal/ads/ht0;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ht0;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ht0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/fs0;->b0()Lcom/google/android/gms/internal/ads/ds0;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ls0;->c0()Lcom/google/android/gms/internal/ads/js0;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/ads/os0;->c0()Lcom/google/android/gms/internal/ads/ms0;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/tm0;->d()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/ms0;->z(I)Lcom/google/android/gms/internal/ads/ms0;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/os0;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/js0;->A(Lcom/google/android/gms/internal/ads/os0;)Lcom/google/android/gms/internal/ads/js0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/tm0;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/js0;->z(I)Lcom/google/android/gms/internal/ads/js0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/ls0;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/ds0;->z(Lcom/google/android/gms/internal/ads/ls0;)Lcom/google/android/gms/internal/ads/ds0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ys0;->d0()Lcom/google/android/gms/internal/ads/Ws0;

    move-result-object v2

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/ho0;->h(Lcom/google/android/gms/internal/ads/tm0;)Lcom/google/android/gms/internal/ads/bt0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/Ws0;->A(Lcom/google/android/gms/internal/ads/bt0;)Lcom/google/android/gms/internal/ads/Ws0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/tm0;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/Ws0;->z(I)Lcom/google/android/gms/internal/ads/Ws0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/Ys0;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/ds0;->A(Lcom/google/android/gms/internal/ads/Ys0;)Lcom/google/android/gms/internal/ads/ds0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/fs0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Ou0;->g()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ht0;->B(Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/ht0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/tm0;->h()Lcom/google/android/gms/internal/ads/rm0;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/ho0;->i(Lcom/google/android/gms/internal/ads/rm0;)Lcom/google/android/gms/internal/ads/Kt0;

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

    sget-object v0, Lcom/google/android/gms/internal/ads/ho0;->b:Lcom/google/android/gms/internal/ads/iq0;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/Zp0;->i(Lcom/google/android/gms/internal/ads/iq0;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/ho0;->c:Lcom/google/android/gms/internal/ads/eq0;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/Zp0;->h(Lcom/google/android/gms/internal/ads/eq0;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/ho0;->d:Lcom/google/android/gms/internal/ads/vp0;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/Zp0;->g(Lcom/google/android/gms/internal/ads/vp0;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/ho0;->e:Lcom/google/android/gms/internal/ads/rp0;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/Zp0;->f(Lcom/google/android/gms/internal/ads/rp0;)V

    return-void
.end method

.method private static f(Lcom/google/android/gms/internal/ads/Rs0;)Lcom/google/android/gms/internal/ads/qm0;
    .locals 3

    .prologue
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/ads/qm0;->c:Lcom/google/android/gms/internal/ads/qm0;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Rs0;->a()I

    move-result p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to parse HashType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/ads/qm0;->f:Lcom/google/android/gms/internal/ads/qm0;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/ads/qm0;->d:Lcom/google/android/gms/internal/ads/qm0;

    return-object p0

    :cond_3
    sget-object p0, Lcom/google/android/gms/internal/ads/qm0;->e:Lcom/google/android/gms/internal/ads/qm0;

    return-object p0

    :cond_4
    sget-object p0, Lcom/google/android/gms/internal/ads/qm0;->b:Lcom/google/android/gms/internal/ads/qm0;

    return-object p0
.end method

.method private static g(Lcom/google/android/gms/internal/ads/Kt0;)Lcom/google/android/gms/internal/ads/rm0;
    .locals 3

    .prologue
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Kt0;->a()I

    move-result p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to parse OutputPrefixType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/ads/rm0;->d:Lcom/google/android/gms/internal/ads/rm0;

    return-object p0

    :cond_2
    :goto_0
    sget-object p0, Lcom/google/android/gms/internal/ads/rm0;->c:Lcom/google/android/gms/internal/ads/rm0;

    return-object p0

    :cond_3
    sget-object p0, Lcom/google/android/gms/internal/ads/rm0;->b:Lcom/google/android/gms/internal/ads/rm0;

    return-object p0
.end method

.method private static h(Lcom/google/android/gms/internal/ads/tm0;)Lcom/google/android/gms/internal/ads/bt0;
    .locals 2

    .prologue
    invoke-static {}, Lcom/google/android/gms/internal/ads/bt0;->d0()Lcom/google/android/gms/internal/ads/Zs0;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/tm0;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Zs0;->A(I)Lcom/google/android/gms/internal/ads/Zs0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/tm0;->g()Lcom/google/android/gms/internal/ads/qm0;

    move-result-object p0

    sget-object v1, Lcom/google/android/gms/internal/ads/qm0;->b:Lcom/google/android/gms/internal/ads/qm0;

    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/ads/Rs0;->E:Lcom/google/android/gms/internal/ads/Rs0;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/qm0;->c:Lcom/google/android/gms/internal/ads/qm0;

    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p0, Lcom/google/android/gms/internal/ads/Rs0;->I:Lcom/google/android/gms/internal/ads/Rs0;

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/ads/qm0;->d:Lcom/google/android/gms/internal/ads/qm0;

    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p0, Lcom/google/android/gms/internal/ads/Rs0;->G:Lcom/google/android/gms/internal/ads/Rs0;

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/google/android/gms/internal/ads/qm0;->e:Lcom/google/android/gms/internal/ads/qm0;

    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object p0, Lcom/google/android/gms/internal/ads/Rs0;->F:Lcom/google/android/gms/internal/ads/Rs0;

    goto :goto_0

    :cond_3
    sget-object v1, Lcom/google/android/gms/internal/ads/qm0;->f:Lcom/google/android/gms/internal/ads/qm0;

    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object p0, Lcom/google/android/gms/internal/ads/Rs0;->H:Lcom/google/android/gms/internal/ads/Rs0;

    :goto_0
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/Zs0;->z(Lcom/google/android/gms/internal/ads/Rs0;)Lcom/google/android/gms/internal/ads/Zs0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/bt0;

    return-object p0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Unable to serialize HashType "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static i(Lcom/google/android/gms/internal/ads/rm0;)Lcom/google/android/gms/internal/ads/Kt0;
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/rm0;->b:Lcom/google/android/gms/internal/ads/rm0;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/ads/Kt0;->E:Lcom/google/android/gms/internal/ads/Kt0;

    return-object p0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/rm0;->c:Lcom/google/android/gms/internal/ads/rm0;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcom/google/android/gms/internal/ads/Kt0;->H:Lcom/google/android/gms/internal/ads/Kt0;

    return-object p0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/rm0;->d:Lcom/google/android/gms/internal/ads/rm0;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lcom/google/android/gms/internal/ads/Kt0;->G:Lcom/google/android/gms/internal/ads/Kt0;

    return-object p0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Unable to serialize variant: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
