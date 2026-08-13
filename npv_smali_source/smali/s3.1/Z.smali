.class public abstract Ls3/Z;
.super Lcom/google/android/gms/internal/ads/Eb;
.source "SourceFile"

# interfaces
.implements Ls3/a0;


# direct methods
.method public static o6(Landroid/os/IBinder;)Ls3/a0;
    .locals 2

    .prologue
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.client.IAdMetadataListener"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Ls3/a0;

    if-eqz v1, :cond_1

    check-cast v0, Ls3/a0;

    return-object v0

    :cond_1
    new-instance v0, Ls3/Y;

    invoke-direct {v0, p0}, Ls3/Y;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
