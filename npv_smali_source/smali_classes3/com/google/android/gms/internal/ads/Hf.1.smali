.class public abstract Lcom/google/android/gms/internal/ads/Hf;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static varargs a(Lcom/google/android/gms/internal/ads/Qf;Lcom/google/android/gms/internal/ads/Mf;[Ljava/lang/String;)Z
    .locals 2

    .prologue
    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v0

    invoke-interface {v0}, LV3/f;->c()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/google/android/gms/internal/ads/Qf;->e(Lcom/google/android/gms/internal/ads/Mf;J[Ljava/lang/String;)Z

    const/4 p0, 0x1

    return p0
.end method
