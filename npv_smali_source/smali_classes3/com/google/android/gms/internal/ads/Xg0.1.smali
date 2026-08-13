.class public abstract Lcom/google/android/gms/internal/ads/Xg0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/google/android/gms/internal/ads/Tg0;)Lcom/google/android/gms/internal/ads/Tg0;
    .locals 1

    .prologue
    instance-of v0, p0, Lcom/google/android/gms/internal/ads/Wg0;

    if-nez v0, :cond_2

    instance-of v0, p0, Lcom/google/android/gms/internal/ads/Ug0;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Ljava/io/Serializable;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/Ug0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/Ug0;-><init>(Lcom/google/android/gms/internal/ads/Tg0;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/Wg0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/Wg0;-><init>(Lcom/google/android/gms/internal/ads/Tg0;)V

    :goto_0
    return-object v0

    :cond_2
    :goto_1
    return-object p0
.end method
