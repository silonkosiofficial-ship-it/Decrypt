.class public abstract Lcom/google/android/gms/internal/ads/Dk0;
.super Lcom/google/android/gms/internal/ads/Ok0;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Ok0;-><init>()V

    return-void
.end method

.method public static D(LP4/d;)Lcom/google/android/gms/internal/ads/Dk0;
    .locals 1

    .prologue
    instance-of v0, p0, Lcom/google/android/gms/internal/ads/Dk0;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/ads/Dk0;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/Ek0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/Ek0;-><init>(LP4/d;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
