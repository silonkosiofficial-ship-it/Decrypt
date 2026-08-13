.class public abstract Lcom/google/android/gms/internal/ads/qf0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/pf0;
    .locals 3

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/ads/rf0;

    new-instance v1, Lcom/google/android/gms/internal/ads/Hf0;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_0

    move-object p0, v2

    :cond_0
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/Hf0;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/rf0;-><init>(Lcom/google/android/gms/internal/ads/Hf0;)V

    return-object v0
.end method
