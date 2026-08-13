.class public abstract Lcom/google/android/gms/internal/ads/ei;
.super Lcom/google/android/gms/internal/ads/Eb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/fi;


# direct methods
.method public static o6(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/fi;
    .locals 2

    .prologue
    const-string v0, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/fi;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/ads/fi;

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/di;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/di;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
