.class public abstract Lcom/google/android/gms/internal/ads/Hj;
.super Lcom/google/android/gms/internal/ads/Eb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Ij;


# direct methods
.method public static o6(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/Ij;
    .locals 2

    .prologue
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/Ij;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/ads/Ij;

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/Gj;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/Gj;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
