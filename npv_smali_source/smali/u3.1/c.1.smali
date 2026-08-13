.class public final Lu3/c;
.super Lcom/google/android/gms/internal/ads/Ln;
.source "SourceFile"


# instance fields
.field private final C:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

.field private final D:Landroid/app/Activity;

.field private E:Z

.field private F:Z

.field private G:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Ln;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu3/c;->E:Z

    iput-boolean v0, p0, Lu3/c;->F:Z

    iput-boolean v0, p0, Lu3/c;->G:Z

    iput-object p2, p0, Lu3/c;->C:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iput-object p1, p0, Lu3/c;->D:Landroid/app/Activity;

    return-void
.end method

.method private final declared-synchronized b()V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lu3/c;->F:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lu3/c;->C:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->E:Lu3/z;

    if-eqz v0, :cond_0

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Lu3/z;->p4(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lu3/c;->F:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public final A()V
    .locals 1

    .prologue
    iget-object v0, p0, Lu3/c;->D:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lu3/c;->b()V

    :cond_0
    return-void
.end method

.method public final C()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu3/c;->G:Z

    return-void
.end method

.method public final N2(I[Ljava/lang/String;[I)V
    .locals 0

    return-void
.end method

.method public final T()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final W3(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->M8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lu3/c;->G:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lu3/c;->D:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->requestWindowFeature(I)Z

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const-string v2, "com.google.android.gms.ads.internal.overlay.hasResumed"

    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    move v0, v1

    :cond_1
    iget-object v2, p0, Lu3/c;->C:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    if-nez v2, :cond_2

    :goto_0
    iget-object p1, p0, Lu3/c;->D:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void

    :cond_2
    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    if-nez p1, :cond_6

    iget-object p1, v2, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->D:Ls3/a;

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ls3/a;->e0()V

    :cond_4
    iget-object p1, p0, Lu3/c;->C:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->W:Lcom/google/android/gms/internal/ads/MG;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/MG;->p0()V

    :cond_5
    iget-object p1, p0, Lu3/c;->D:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lu3/c;->D:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "shouldCallOnOverlayOpened"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lu3/c;->C:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->E:Lu3/z;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Lu3/z;->T2()V

    :cond_6
    iget-object v0, p0, Lu3/c;->D:Landroid/app/Activity;

    iget-object p1, p0, Lu3/c;->C:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    invoke-static {}, Lr3/v;->l()Lu3/a;

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->C:Lu3/l;

    iget-object v2, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->K:Lu3/d;

    iget-object v3, v1, Lu3/l;->K:Lu3/b;

    const/4 v4, 0x0

    const-string v5, ""

    invoke-static/range {v0 .. v5}, Lu3/a;->b(Landroid/content/Context;Lu3/l;Lu3/d;Lu3/b;Lcom/google/android/gms/internal/ads/eO;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    return-void
.end method

.method public final b0(LX3/a;)V
    .locals 0

    return-void
.end method

.method public final h()V
    .locals 0

    return-void
.end method

.method public final j2(IILandroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public final m()V
    .locals 1

    .prologue
    iget-object v0, p0, Lu3/c;->D:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lu3/c;->b()V

    :cond_0
    return-void
.end method

.method public final p()V
    .locals 1

    .prologue
    iget-object v0, p0, Lu3/c;->C:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->E:Lu3/z;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lu3/z;->y0()V

    :cond_0
    iget-object v0, p0, Lu3/c;->D:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lu3/c;->b()V

    :cond_1
    return-void
.end method

.method public final s()V
    .locals 0

    return-void
.end method

.method public final t()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lu3/c;->E:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu3/c;->D:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lu3/c;->E:Z

    iget-object v0, p0, Lu3/c;->C:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->E:Lu3/z;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lu3/z;->f3()V

    :cond_1
    return-void
.end method

.method public final v()V
    .locals 1

    .prologue
    iget-object v0, p0, Lu3/c;->C:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->E:Lu3/z;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lu3/z;->q0()V

    :cond_0
    return-void
.end method

.method public final w()V
    .locals 0

    return-void
.end method

.method public final z0(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "com.google.android.gms.ads.internal.overlay.hasResumed"

    iget-boolean v1, p0, Lu3/c;->E:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method
