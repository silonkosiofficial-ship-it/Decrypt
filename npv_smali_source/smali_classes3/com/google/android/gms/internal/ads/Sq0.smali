.class public abstract Lcom/google/android/gms/internal/ads/Sq0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/google/android/gms/internal/ads/Np0;

.field private static final b:Lcom/google/android/gms/internal/ads/mq0;

.field private static final c:Lcom/google/android/gms/internal/ads/mq0;

.field private static final d:Lcom/google/android/gms/internal/ads/Fl0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/Oq0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Oq0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Sq0;->a:Lcom/google/android/gms/internal/ads/Np0;

    new-instance v0, Lcom/google/android/gms/internal/ads/Pq0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Pq0;-><init>()V

    const-class v1, Lcom/google/android/gms/internal/ads/Xq0;

    const-class v2, Lcom/google/android/gms/internal/ads/Nq0;

    invoke-static {v0, v2, v1}, Lcom/google/android/gms/internal/ads/mq0;->b(Lcom/google/android/gms/internal/ads/kq0;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/mq0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/Sq0;->b:Lcom/google/android/gms/internal/ads/mq0;

    new-instance v0, Lcom/google/android/gms/internal/ads/Rq0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Rq0;-><init>()V

    const-class v1, Lcom/google/android/gms/internal/ads/Rl0;

    invoke-static {v0, v2, v1}, Lcom/google/android/gms/internal/ads/mq0;->b(Lcom/google/android/gms/internal/ads/kq0;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/mq0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/Sq0;->c:Lcom/google/android/gms/internal/ads/mq0;

    sget-object v0, Lcom/google/android/gms/internal/ads/dt0;->E:Lcom/google/android/gms/internal/ads/dt0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Tr0;->h0()Lcom/google/android/gms/internal/ads/tw0;

    move-result-object v2

    const-string v3, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-static {v3, v1, v0, v2}, Lcom/google/android/gms/internal/ads/wp0;->d(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/dt0;Lcom/google/android/gms/internal/ads/tw0;)Lcom/google/android/gms/internal/ads/Fl0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/Sq0;->d:Lcom/google/android/gms/internal/ads/Fl0;

    return-void
.end method

.method public static synthetic a(Lcom/google/android/gms/internal/ads/Nq0;)Lcom/google/android/gms/internal/ads/Rl0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Nq0;->b()Lcom/google/android/gms/internal/ads/Wq0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Sq0;->e(Lcom/google/android/gms/internal/ads/Wq0;)V

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Iu0;->a(Lcom/google/android/gms/internal/ads/Nq0;)Lcom/google/android/gms/internal/ads/Rl0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/google/android/gms/internal/ads/Wq0;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/Nq0;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Sq0;->e(Lcom/google/android/gms/internal/ads/Wq0;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/Lq0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/Lq0;-><init>(Lcom/google/android/gms/internal/ads/Mq0;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/Lq0;->c(Lcom/google/android/gms/internal/ads/Wq0;)Lcom/google/android/gms/internal/ads/Lq0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Wq0;->c()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Mu0;->c(I)Lcom/google/android/gms/internal/ads/Mu0;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/Lq0;->a(Lcom/google/android/gms/internal/ads/Mu0;)Lcom/google/android/gms/internal/ads/Lq0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Lq0;->b(Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/Lq0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Lq0;->d()Lcom/google/android/gms/internal/ads/Nq0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/google/android/gms/internal/ads/Nq0;)Lcom/google/android/gms/internal/ads/Xq0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Nq0;->b()Lcom/google/android/gms/internal/ads/Wq0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Sq0;->e(Lcom/google/android/gms/internal/ads/Wq0;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/Ir0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/Ir0;-><init>(Lcom/google/android/gms/internal/ads/Nq0;)V

    return-object v0
.end method

.method public static d(Z)V
    .locals 4

    .prologue
    const/4 p0, 0x1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/fp0;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lcom/google/android/gms/internal/ads/Gr0;->f:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/Zp0;->c()Lcom/google/android/gms/internal/ads/Zp0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Gr0;->e(Lcom/google/android/gms/internal/ads/Zp0;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Pp0;->b()Lcom/google/android/gms/internal/ads/Pp0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Sq0;->a:Lcom/google/android/gms/internal/ads/Np0;

    const-class v2, Lcom/google/android/gms/internal/ads/Wq0;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Pp0;->c(Lcom/google/android/gms/internal/ads/Np0;Ljava/lang/Class;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Wp0;->a()Lcom/google/android/gms/internal/ads/Wp0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Sq0;->b:Lcom/google/android/gms/internal/ads/mq0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Wp0;->e(Lcom/google/android/gms/internal/ads/mq0;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Wp0;->a()Lcom/google/android/gms/internal/ads/Wp0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Sq0;->c:Lcom/google/android/gms/internal/ads/mq0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Wp0;->e(Lcom/google/android/gms/internal/ads/mq0;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Vp0;->b()Lcom/google/android/gms/internal/ads/Vp0;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sget-object v2, Lcom/google/android/gms/internal/ads/Br0;->c:Lcom/google/android/gms/internal/ads/Wq0;

    const-string v3, "AES_CMAC"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "AES256_CMAC"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/Tq0;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/Tq0;-><init>(Lcom/google/android/gms/internal/ads/Vq0;)V

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/Tq0;->a(I)Lcom/google/android/gms/internal/ads/Tq0;

    const/16 v3, 0x10

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/Tq0;->b(I)Lcom/google/android/gms/internal/ads/Tq0;

    sget-object v3, Lcom/google/android/gms/internal/ads/Uq0;->e:Lcom/google/android/gms/internal/ads/Uq0;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/Tq0;->c(Lcom/google/android/gms/internal/ads/Uq0;)Lcom/google/android/gms/internal/ads/Tq0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Tq0;->d()Lcom/google/android/gms/internal/ads/Wq0;

    move-result-object v2

    const-string v3, "AES256_CMAC_RAW"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Vp0;->d(Ljava/util/Map;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/mp0;->c()Lcom/google/android/gms/internal/ads/mp0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Sq0;->d:Lcom/google/android/gms/internal/ads/Fl0;

    invoke-virtual {v0, v1, p0}, Lcom/google/android/gms/internal/ads/mp0;->d(Lcom/google/android/gms/internal/ads/Fl0;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering AES CMAC is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static e(Lcom/google/android/gms/internal/ads/Wq0;)V
    .locals 1

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Wq0;->c()I

    move-result p0

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "AesCmacKey size wrong, must be 32 bytes"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
