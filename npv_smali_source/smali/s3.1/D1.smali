.class public final Ls3/D1;
.super Ls3/u0;
.source "SourceFile"


# instance fields
.field private C:Lcom/google/android/gms/internal/ads/hk;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ls3/u0;-><init>()V

    return-void
.end method


# virtual methods
.method public final B5(Ls3/K1;)V
    .locals 0

    return-void
.end method

.method public final P4(Ljava/lang/String;LX3/a;)V
    .locals 0

    return-void
.end method

.method public final R0(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final W4(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final Y0(Lcom/google/android/gms/internal/ads/Vl;)V
    .locals 0

    return-void
.end method

.method public final a0(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method final synthetic b()V
    .locals 2

    .prologue
    iget-object v0, p0, Ls3/D1;->C:Lcom/google/android/gms/internal/ads/hk;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/hk;->L4(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not notify onComplete event."

    invoke-static {v1, v0}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final d()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public final e2(Ls3/H0;)V
    .locals 0

    return-void
.end method

.method public final h()V
    .locals 0

    return-void
.end method

.method public final i()Ljava/util/List;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final j6(Z)V
    .locals 0

    return-void
.end method

.method public final k()V
    .locals 2

    const-string v0, "The initialization is not processed because MobileAdsSettingsManager is not created successfully."

    invoke-static {v0}, Lw3/p;->d(Ljava/lang/String;)V

    sget-object v0, Lw3/g;->b:Landroid/os/Handler;

    new-instance v1, Ls3/C1;

    invoke-direct {v1, p0}, Ls3/C1;-><init>(Ls3/D1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final l0(Z)V
    .locals 0

    return-void
.end method

.method public final p5(LX3/a;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final v()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final w0(F)V
    .locals 0

    return-void
.end method

.method public final y2(Lcom/google/android/gms/internal/ads/hk;)V
    .locals 0

    iput-object p1, p0, Ls3/D1;->C:Lcom/google/android/gms/internal/ads/hk;

    return-void
.end method
