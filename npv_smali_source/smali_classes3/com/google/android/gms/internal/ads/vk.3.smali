.class public abstract Lcom/google/android/gms/internal/ads/vk;
.super Lcom/google/android/gms/internal/ads/Eb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/wk;


# direct methods
.method public static o6(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/wk;
    .locals 2

    .prologue
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/wk;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/ads/wk;

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/uk;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/uk;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
