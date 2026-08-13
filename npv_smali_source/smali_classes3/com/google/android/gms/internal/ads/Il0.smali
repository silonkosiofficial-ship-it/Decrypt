.class public abstract Lcom/google/android/gms/internal/ads/Il0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/google/android/gms/internal/ads/Sl0;)Lcom/google/android/gms/internal/ads/Sl0;
    .locals 0

    .prologue
    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Il0;->b(Lcom/google/android/gms/internal/ads/Sl0;)Lcom/google/android/gms/internal/ads/jt0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Ou0;->l()[B

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Yl0;->a([B)Lcom/google/android/gms/internal/ads/Sl0;

    move-result-object p0

    return-object p0
.end method

.method static final b(Lcom/google/android/gms/internal/ads/Sl0;)Lcom/google/android/gms/internal/ads/jt0;
    .locals 3

    .prologue
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/Zp0;->c()Lcom/google/android/gms/internal/ads/Zp0;

    move-result-object p0

    const-class v0, Lcom/google/android/gms/internal/ads/yq0;

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/ads/Zp0;->e(Lcom/google/android/gms/internal/ads/Sl0;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/Cq0;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/yq0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/yq0;->c()Lcom/google/android/gms/internal/ads/jt0;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Lcom/google/android/gms/internal/ads/Jq0;

    const-string v1, "Parsing parameters failed in getProto(). You probably want to call some Tink register function for "

    const-string v2, "null"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/google/android/gms/internal/ads/Jq0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
