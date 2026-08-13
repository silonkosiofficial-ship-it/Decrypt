.class public abstract Ls3/a1;
.super Lcom/google/android/gms/internal/ads/Eb;
.source "SourceFile"

# interfaces
.implements Ls3/b1;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/Eb;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final n6(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 1

    .prologue
    const/4 p4, 0x1

    if-eq p1, p4, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->g(Landroid/os/Parcel;)Z

    move-result p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Ls3/b1;->F0(Z)V

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Ls3/b1;->d()V

    goto :goto_0

    :cond_2
    invoke-interface {p0}, Ls3/b1;->i()V

    goto :goto_0

    :cond_3
    invoke-interface {p0}, Ls3/b1;->g()V

    goto :goto_0

    :cond_4
    invoke-interface {p0}, Ls3/b1;->h()V

    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return p4
.end method
