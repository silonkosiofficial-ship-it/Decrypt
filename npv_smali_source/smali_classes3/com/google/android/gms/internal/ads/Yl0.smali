.class public abstract Lcom/google/android/gms/internal/ads/Yl0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a([B)Lcom/google/android/gms/internal/ads/Sl0;
    .locals 2

    .prologue
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/xv0;->a()Lcom/google/android/gms/internal/ads/xv0;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/jt0;->e0([BLcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/jt0;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/Zp0;->c()Lcom/google/android/gms/internal/ads/Zp0;

    move-result-object v0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/yq0;->a(Lcom/google/android/gms/internal/ads/jt0;)Lcom/google/android/gms/internal/ads/yq0;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/Zp0;->k(Lcom/google/android/gms/internal/ads/Cq0;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/zp0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zp0;-><init>(Lcom/google/android/gms/internal/ads/yq0;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/Zp0;->b(Lcom/google/android/gms/internal/ads/Cq0;)Lcom/google/android/gms/internal/ads/Sl0;

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Failed to parse proto"

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static b(Lcom/google/android/gms/internal/ads/Sl0;)[B
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/ads/yq0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Zp0;->c()Lcom/google/android/gms/internal/ads/Zp0;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Lcom/google/android/gms/internal/ads/Zp0;->e(Lcom/google/android/gms/internal/ads/Sl0;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/Cq0;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/yq0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/yq0;->c()Lcom/google/android/gms/internal/ads/jt0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Ou0;->l()[B

    move-result-object p0

    return-object p0
.end method
