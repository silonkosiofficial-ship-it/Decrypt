.class public final Ls3/O0;
.super Lcom/google/android/gms/internal/ads/Db;
.source "SourceFile"

# interfaces
.implements Ls3/Q0;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.client.IOutOfContextTester"

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/Db;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final s5(Ljava/lang/String;LX3/a;LX3/a;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Db;->q0()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p2}, Lcom/google/android/gms/internal/ads/Fb;->f(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p3}, Lcom/google/android/gms/internal/ads/Fb;->f(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/Db;->L0(ILandroid/os/Parcel;)V

    return-void
.end method
