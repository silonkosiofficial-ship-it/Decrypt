.class public abstract Lcom/google/android/gms/internal/ads/Tn0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/google/android/gms/internal/ads/Np0;

.field private static final b:Lcom/google/android/gms/internal/ads/mq0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/Rn0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Rn0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Tn0;->a:Lcom/google/android/gms/internal/ads/Np0;

    new-instance v0, Lcom/google/android/gms/internal/ads/Sn0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Sn0;-><init>()V

    const-class v1, Lcom/google/android/gms/internal/ads/Qn0;

    const-class v2, Lcom/google/android/gms/internal/ads/ul0;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/mq0;->b(Lcom/google/android/gms/internal/ads/kq0;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/mq0;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/Tn0;->b:Lcom/google/android/gms/internal/ads/mq0;

    return-void
.end method

.method public static a(Z)V
    .locals 3

    sget p0, Lcom/google/android/gms/internal/ads/Wo0;->f:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/Zp0;->c()Lcom/google/android/gms/internal/ads/Zp0;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Wo0;->e(Lcom/google/android/gms/internal/ads/Zp0;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Vp0;->b()Lcom/google/android/gms/internal/ads/Vp0;

    move-result-object p0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "X_AES_GCM_8_BYTE_SALT_NO_PREFIX"

    sget-object v2, Lcom/google/android/gms/internal/ads/Pn0;->g:Lcom/google/android/gms/internal/ads/Vn0;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/Vp0;->d(Ljava/util/Map;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Wp0;->a()Lcom/google/android/gms/internal/ads/Wp0;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/ads/Tn0;->b:Lcom/google/android/gms/internal/ads/mq0;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/Wp0;->e(Lcom/google/android/gms/internal/ads/mq0;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Pp0;->b()Lcom/google/android/gms/internal/ads/Pp0;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/ads/Tn0;->a:Lcom/google/android/gms/internal/ads/Np0;

    const-class v1, Lcom/google/android/gms/internal/ads/Vn0;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/Pp0;->c(Lcom/google/android/gms/internal/ads/Np0;Ljava/lang/Class;)V

    return-void
.end method
