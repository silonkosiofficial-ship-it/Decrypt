.class public abstract Lcom/google/android/gms/internal/ads/om0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/google/android/gms/internal/ads/mq0;

.field private static final b:Lcom/google/android/gms/internal/ads/Fl0;

.field private static final c:Lcom/google/android/gms/internal/ads/Qp0;

.field private static final d:Lcom/google/android/gms/internal/ads/Np0;

.field private static final e:I

.field public static final synthetic f:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/lm0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/lm0;-><init>()V

    const-class v1, Lcom/google/android/gms/internal/ads/km0;

    const-class v2, Lcom/google/android/gms/internal/ads/ul0;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/mq0;->b(Lcom/google/android/gms/internal/ads/kq0;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/mq0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/om0;->a:Lcom/google/android/gms/internal/ads/mq0;

    sget-object v0, Lcom/google/android/gms/internal/ads/dt0;->E:Lcom/google/android/gms/internal/ads/dt0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/cs0;->h0()Lcom/google/android/gms/internal/ads/tw0;

    move-result-object v1

    const-string v3, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-static {v3, v2, v0, v1}, Lcom/google/android/gms/internal/ads/wp0;->d(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/dt0;Lcom/google/android/gms/internal/ads/tw0;)Lcom/google/android/gms/internal/ads/Fl0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/om0;->b:Lcom/google/android/gms/internal/ads/Fl0;

    new-instance v0, Lcom/google/android/gms/internal/ads/mm0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/mm0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/om0;->c:Lcom/google/android/gms/internal/ads/Qp0;

    new-instance v0, Lcom/google/android/gms/internal/ads/nm0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/nm0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/om0;->d:Lcom/google/android/gms/internal/ads/Np0;

    const/4 v0, 0x2

    sput v0, Lcom/google/android/gms/internal/ads/om0;->e:I

    return-void
.end method

.method public static a(Z)V
    .locals 9

    .prologue
    sget p0, Lcom/google/android/gms/internal/ads/om0;->e:I

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/fp0;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lcom/google/android/gms/internal/ads/ho0;->f:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/Zp0;->c()Lcom/google/android/gms/internal/ads/Zp0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ho0;->e(Lcom/google/android/gms/internal/ads/Zp0;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Wp0;->a()Lcom/google/android/gms/internal/ads/Wp0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/om0;->a:Lcom/google/android/gms/internal/ads/mq0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Wp0;->e(Lcom/google/android/gms/internal/ads/mq0;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Vp0;->b()Lcom/google/android/gms/internal/ads/Vp0;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "AES128_CTR_HMAC_SHA256"

    sget-object v3, Lcom/google/android/gms/internal/ads/Pn0;->e:Lcom/google/android/gms/internal/ads/tm0;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/pm0;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/pm0;-><init>(Lcom/google/android/gms/internal/ads/sm0;)V

    const/16 v4, 0x10

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/pm0;->a(I)Lcom/google/android/gms/internal/ads/pm0;

    const/16 v5, 0x20

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/pm0;->c(I)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/pm0;->e(I)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/pm0;->d(I)Lcom/google/android/gms/internal/ads/pm0;

    sget-object v6, Lcom/google/android/gms/internal/ads/qm0;->d:Lcom/google/android/gms/internal/ads/qm0;

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/pm0;->b(Lcom/google/android/gms/internal/ads/qm0;)Lcom/google/android/gms/internal/ads/pm0;

    sget-object v7, Lcom/google/android/gms/internal/ads/rm0;->d:Lcom/google/android/gms/internal/ads/rm0;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/ads/pm0;->f(Lcom/google/android/gms/internal/ads/rm0;)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/pm0;->g()Lcom/google/android/gms/internal/ads/tm0;

    move-result-object v2

    const-string v8, "AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v1, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "AES256_CTR_HMAC_SHA256"

    sget-object v8, Lcom/google/android/gms/internal/ads/Pn0;->f:Lcom/google/android/gms/internal/ads/tm0;

    invoke-interface {v1, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/pm0;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/pm0;-><init>(Lcom/google/android/gms/internal/ads/sm0;)V

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/pm0;->a(I)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/pm0;->c(I)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/pm0;->e(I)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/pm0;->d(I)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/pm0;->b(Lcom/google/android/gms/internal/ads/qm0;)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/ads/pm0;->f(Lcom/google/android/gms/internal/ads/rm0;)Lcom/google/android/gms/internal/ads/pm0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/pm0;->g()Lcom/google/android/gms/internal/ads/tm0;

    move-result-object v2

    const-string v3, "AES256_CTR_HMAC_SHA256_RAW"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Vp0;->d(Ljava/util/Map;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Rp0;->a()Lcom/google/android/gms/internal/ads/Rp0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/om0;->c:Lcom/google/android/gms/internal/ads/Qp0;

    const-class v2, Lcom/google/android/gms/internal/ads/tm0;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Rp0;->b(Lcom/google/android/gms/internal/ads/Qp0;Ljava/lang/Class;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Pp0;->b()Lcom/google/android/gms/internal/ads/Pp0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/om0;->d:Lcom/google/android/gms/internal/ads/Np0;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Pp0;->c(Lcom/google/android/gms/internal/ads/Np0;Ljava/lang/Class;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/mp0;->c()Lcom/google/android/gms/internal/ads/mp0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/om0;->b:Lcom/google/android/gms/internal/ads/Fl0;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Lcom/google/android/gms/internal/ads/mp0;->f(Lcom/google/android/gms/internal/ads/Fl0;IZ)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
