.class public abstract Lcom/google/android/gms/internal/ads/zm0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/google/android/gms/internal/ads/mq0;

.field private static final b:Lcom/google/android/gms/internal/ads/Fl0;

.field private static final c:Lcom/google/android/gms/internal/ads/Np0;

.field public static final synthetic d:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/xm0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/xm0;-><init>()V

    const-class v1, Lcom/google/android/gms/internal/ads/wm0;

    const-class v2, Lcom/google/android/gms/internal/ads/ul0;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/mq0;->b(Lcom/google/android/gms/internal/ads/kq0;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/mq0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zm0;->a:Lcom/google/android/gms/internal/ads/mq0;

    sget-object v0, Lcom/google/android/gms/internal/ads/dt0;->E:Lcom/google/android/gms/internal/ads/dt0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/rs0;->h0()Lcom/google/android/gms/internal/ads/tw0;

    move-result-object v1

    const-string v3, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-static {v3, v2, v0, v1}, Lcom/google/android/gms/internal/ads/wp0;->d(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/dt0;Lcom/google/android/gms/internal/ads/tw0;)Lcom/google/android/gms/internal/ads/Fl0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zm0;->b:Lcom/google/android/gms/internal/ads/Fl0;

    new-instance v0, Lcom/google/android/gms/internal/ads/ym0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ym0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zm0;->c:Lcom/google/android/gms/internal/ads/Np0;

    return-void
.end method

.method public static a(Z)V
    .locals 7

    .prologue
    const/4 p0, 0x1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/fp0;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lcom/google/android/gms/internal/ads/no0;->f:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/Zp0;->c()Lcom/google/android/gms/internal/ads/Zp0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/no0;->e(Lcom/google/android/gms/internal/ads/Zp0;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Wp0;->a()Lcom/google/android/gms/internal/ads/Wp0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zm0;->a:Lcom/google/android/gms/internal/ads/mq0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Wp0;->e(Lcom/google/android/gms/internal/ads/mq0;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Vp0;->b()Lcom/google/android/gms/internal/ads/Vp0;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "AES128_EAX"

    sget-object v3, Lcom/google/android/gms/internal/ads/Pn0;->c:Lcom/google/android/gms/internal/ads/Dm0;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/Am0;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/Am0;-><init>(Lcom/google/android/gms/internal/ads/Cm0;)V

    const/16 v4, 0x10

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/Am0;->a(I)Lcom/google/android/gms/internal/ads/Am0;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/Am0;->b(I)Lcom/google/android/gms/internal/ads/Am0;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/Am0;->c(I)Lcom/google/android/gms/internal/ads/Am0;

    sget-object v5, Lcom/google/android/gms/internal/ads/Bm0;->d:Lcom/google/android/gms/internal/ads/Bm0;

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/Am0;->d(Lcom/google/android/gms/internal/ads/Bm0;)Lcom/google/android/gms/internal/ads/Am0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Am0;->e()Lcom/google/android/gms/internal/ads/Dm0;

    move-result-object v2

    const-string v6, "AES128_EAX_RAW"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "AES256_EAX"

    sget-object v6, Lcom/google/android/gms/internal/ads/Pn0;->d:Lcom/google/android/gms/internal/ads/Dm0;

    invoke-interface {v1, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/Am0;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/Am0;-><init>(Lcom/google/android/gms/internal/ads/Cm0;)V

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/Am0;->a(I)Lcom/google/android/gms/internal/ads/Am0;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/Am0;->b(I)Lcom/google/android/gms/internal/ads/Am0;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/Am0;->c(I)Lcom/google/android/gms/internal/ads/Am0;

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/Am0;->d(Lcom/google/android/gms/internal/ads/Bm0;)Lcom/google/android/gms/internal/ads/Am0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Am0;->e()Lcom/google/android/gms/internal/ads/Dm0;

    move-result-object v2

    const-string v3, "AES256_EAX_RAW"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Vp0;->d(Ljava/util/Map;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Pp0;->b()Lcom/google/android/gms/internal/ads/Pp0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zm0;->c:Lcom/google/android/gms/internal/ads/Np0;

    const-class v2, Lcom/google/android/gms/internal/ads/Dm0;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Pp0;->c(Lcom/google/android/gms/internal/ads/Np0;Ljava/lang/Class;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/mp0;->c()Lcom/google/android/gms/internal/ads/mp0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zm0;->b:Lcom/google/android/gms/internal/ads/Fl0;

    invoke-virtual {v0, v1, p0}, Lcom/google/android/gms/internal/ads/mp0;->d(Lcom/google/android/gms/internal/ads/Fl0;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Registering AES EAX is not supported in FIPS mode"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
