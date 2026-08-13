.class public final Ls3/G1;
.super Lcom/google/android/gms/internal/ads/up;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/up;-><init>()V

    return-void
.end method

.method private static p6(Lcom/google/android/gms/internal/ads/Cp;)V
    .locals 2

    const-string v0, "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date."

    invoke-static {v0}, Lw3/p;->d(Ljava/lang/String;)V

    sget-object v0, Lw3/g;->b:Landroid/os/Handler;

    new-instance v1, Ls3/F1;

    invoke-direct {v1, p0}, Ls3/F1;-><init>(Lcom/google/android/gms/internal/ads/Cp;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public final A2(Lcom/google/android/gms/internal/ads/Dp;)V
    .locals 0

    return-void
.end method

.method public final K4(Ls3/X1;Lcom/google/android/gms/internal/ads/Cp;)V
    .locals 0

    invoke-static {p2}, Ls3/G1;->p6(Lcom/google/android/gms/internal/ads/Cp;)V

    return-void
.end method

.method public final L2(Ls3/K0;)V
    .locals 0

    return-void
.end method

.method public final N5(Ls3/N0;)V
    .locals 0

    return-void
.end method

.method public final S2(LX3/a;)V
    .locals 0

    return-void
.end method

.method public final T3(Z)V
    .locals 0

    return-void
.end method

.method public final b()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final b3(Lcom/google/android/gms/internal/ads/Kp;)V
    .locals 0

    return-void
.end method

.method public final c()Ls3/U0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public final d3(Lcom/google/android/gms/internal/ads/yp;)V
    .locals 0

    return-void
.end method

.method public final f()Lcom/google/android/gms/internal/ads/sp;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final m5(Ls3/X1;Lcom/google/android/gms/internal/ads/Cp;)V
    .locals 0

    invoke-static {p2}, Ls3/G1;->p6(Lcom/google/android/gms/internal/ads/Cp;)V

    return-void
.end method

.method public final p()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final p2(LX3/a;Z)V
    .locals 0

    return-void
.end method
