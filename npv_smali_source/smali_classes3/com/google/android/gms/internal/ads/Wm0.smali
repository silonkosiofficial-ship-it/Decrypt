.class public abstract Lcom/google/android/gms/internal/ads/Wm0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/google/android/gms/internal/ads/mq0;

.field private static final b:Lcom/google/android/gms/internal/ads/Np0;

.field private static final c:Lcom/google/android/gms/internal/ads/Qp0;

.field private static final d:Lcom/google/android/gms/internal/ads/Fl0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/Tm0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Tm0;-><init>()V

    const-class v1, Lcom/google/android/gms/internal/ads/Sm0;

    const-class v2, Lcom/google/android/gms/internal/ads/ul0;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/mq0;->b(Lcom/google/android/gms/internal/ads/kq0;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/mq0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/Wm0;->a:Lcom/google/android/gms/internal/ads/mq0;

    new-instance v0, Lcom/google/android/gms/internal/ads/Um0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Um0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Wm0;->b:Lcom/google/android/gms/internal/ads/Np0;

    new-instance v0, Lcom/google/android/gms/internal/ads/Vm0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Vm0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Wm0;->c:Lcom/google/android/gms/internal/ads/Qp0;

    sget-object v0, Lcom/google/android/gms/internal/ads/dt0;->E:Lcom/google/android/gms/internal/ads/dt0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Hs0;->g0()Lcom/google/android/gms/internal/ads/tw0;

    move-result-object v1

    const-string v3, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    invoke-static {v3, v2, v0, v1}, Lcom/google/android/gms/internal/ads/wp0;->d(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/dt0;Lcom/google/android/gms/internal/ads/tw0;)Lcom/google/android/gms/internal/ads/Fl0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/Wm0;->d:Lcom/google/android/gms/internal/ads/Fl0;

    return-void
.end method

.method public static a(Z)V
    .locals 7

    .prologue
    const/4 p0, 0x1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/fp0;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lcom/google/android/gms/internal/ads/zo0;->f:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/Zp0;->c()Lcom/google/android/gms/internal/ads/Zp0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zo0;->e(Lcom/google/android/gms/internal/ads/Zp0;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Wm0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/Wp0;->a()Lcom/google/android/gms/internal/ads/Wp0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Wm0;->a:Lcom/google/android/gms/internal/ads/mq0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Wp0;->e(Lcom/google/android/gms/internal/ads/mq0;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Vp0;->b()Lcom/google/android/gms/internal/ads/Vp0;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/Xm0;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/Xm0;-><init>(Lcom/google/android/gms/internal/ads/Zm0;)V

    const/16 v4, 0x10

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/Xm0;->a(I)Lcom/google/android/gms/internal/ads/Xm0;

    sget-object v5, Lcom/google/android/gms/internal/ads/Ym0;->b:Lcom/google/android/gms/internal/ads/Ym0;

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/Xm0;->b(Lcom/google/android/gms/internal/ads/Ym0;)Lcom/google/android/gms/internal/ads/Xm0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Xm0;->c()Lcom/google/android/gms/internal/ads/an0;

    move-result-object v2

    const-string v6, "AES128_GCM_SIV"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/Xm0;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/Xm0;-><init>(Lcom/google/android/gms/internal/ads/Zm0;)V

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/Xm0;->a(I)Lcom/google/android/gms/internal/ads/Xm0;

    sget-object v4, Lcom/google/android/gms/internal/ads/Ym0;->d:Lcom/google/android/gms/internal/ads/Ym0;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/Xm0;->b(Lcom/google/android/gms/internal/ads/Ym0;)Lcom/google/android/gms/internal/ads/Xm0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Xm0;->c()Lcom/google/android/gms/internal/ads/an0;

    move-result-object v2

    const-string v6, "AES128_GCM_SIV_RAW"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/Xm0;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/Xm0;-><init>(Lcom/google/android/gms/internal/ads/Zm0;)V

    const/16 v6, 0x20

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/Xm0;->a(I)Lcom/google/android/gms/internal/ads/Xm0;

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/Xm0;->b(Lcom/google/android/gms/internal/ads/Ym0;)Lcom/google/android/gms/internal/ads/Xm0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Xm0;->c()Lcom/google/android/gms/internal/ads/an0;

    move-result-object v2

    const-string v5, "AES256_GCM_SIV"

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/Xm0;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/Xm0;-><init>(Lcom/google/android/gms/internal/ads/Zm0;)V

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/Xm0;->a(I)Lcom/google/android/gms/internal/ads/Xm0;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/Xm0;->b(Lcom/google/android/gms/internal/ads/Ym0;)Lcom/google/android/gms/internal/ads/Xm0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Xm0;->c()Lcom/google/android/gms/internal/ads/an0;

    move-result-object v2

    const-string v3, "AES256_GCM_SIV_RAW"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Vp0;->d(Ljava/util/Map;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Rp0;->a()Lcom/google/android/gms/internal/ads/Rp0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Wm0;->c:Lcom/google/android/gms/internal/ads/Qp0;

    const-class v2, Lcom/google/android/gms/internal/ads/an0;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Rp0;->b(Lcom/google/android/gms/internal/ads/Qp0;Ljava/lang/Class;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Pp0;->b()Lcom/google/android/gms/internal/ads/Pp0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Wm0;->b:Lcom/google/android/gms/internal/ads/Np0;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Pp0;->c(Lcom/google/android/gms/internal/ads/Np0;Ljava/lang/Class;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/mp0;->c()Lcom/google/android/gms/internal/ads/mp0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Wm0;->d:Lcom/google/android/gms/internal/ads/Fl0;

    invoke-virtual {v0, v1, p0}, Lcom/google/android/gms/internal/ads/mp0;->d(Lcom/google/android/gms/internal/ads/Fl0;Z)V

    :cond_0
    return-void

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering AES GCM SIV is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static b()Z
    .locals 1

    .prologue
    :try_start_0
    const-string v0, "AES/GCM-SIV/NoPadding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method
