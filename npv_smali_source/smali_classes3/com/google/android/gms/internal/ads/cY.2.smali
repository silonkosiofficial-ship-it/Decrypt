.class public final Lcom/google/android/gms/internal/ads/cY;
.super Ls3/U;
.source "SourceFile"


# instance fields
.field private final C:Ls3/c2;

.field private final D:Landroid/content/Context;

.field private final E:Lcom/google/android/gms/internal/ads/R50;

.field private final F:Ljava/lang/String;

.field private final G:Lw3/a;

.field private final H:Lcom/google/android/gms/internal/ads/UX;

.field private final I:Lcom/google/android/gms/internal/ads/t60;

.field private final J:Lcom/google/android/gms/internal/ads/Z9;

.field private final K:Lcom/google/android/gms/internal/ads/eO;

.field private L:Lcom/google/android/gms/internal/ads/lH;

.field private M:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ls3/c2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/R50;Lcom/google/android/gms/internal/ads/UX;Lcom/google/android/gms/internal/ads/t60;Lw3/a;Lcom/google/android/gms/internal/ads/Z9;Lcom/google/android/gms/internal/ads/eO;)V
    .locals 0

    invoke-direct {p0}, Ls3/U;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/cY;->C:Ls3/c2;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/cY;->F:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/cY;->D:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/cY;->E:Lcom/google/android/gms/internal/ads/R50;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/cY;->H:Lcom/google/android/gms/internal/ads/UX;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/cY;->I:Lcom/google/android/gms/internal/ads/t60;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/cY;->G:Lw3/a;

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->O0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/cY;->M:Z

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/cY;->J:Lcom/google/android/gms/internal/ads/Z9;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/cY;->K:Lcom/google/android/gms/internal/ads/eO;

    return-void
.end method

.method static bridge synthetic o6(Lcom/google/android/gms/internal/ads/cY;)Lcom/google/android/gms/internal/ads/lH;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/cY;->L:Lcom/google/android/gms/internal/ads/lH;

    return-object p0
.end method

.method static bridge synthetic p6(Lcom/google/android/gms/internal/ads/cY;Lcom/google/android/gms/internal/ads/lH;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/cY;->L:Lcom/google/android/gms/internal/ads/lH;

    return-void
.end method

.method private final declared-synchronized q6()Z
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->L:Lcom/google/android/gms/internal/ads/lH;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lH;->i()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public final declared-synchronized C()V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->L:Lcom/google/android/gms/internal/ads/lH;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->d()Lcom/google/android/gms/internal/ads/eD;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/eD;->q1(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final F1(Ls3/p0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->H:Lcom/google/android/gms/internal/ads/UX;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/UX;->E(Ls3/p0;)V

    return-void
.end method

.method public final declared-synchronized F2(Lcom/google/android/gms/internal/ads/Wf;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "setOnCustomRenderedAdLoadedListener must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->E:Lcom/google/android/gms/internal/ads/R50;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/R50;->i(Lcom/google/android/gms/internal/ads/Wf;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized H0()Z
    .locals 1

    monitor-enter p0

    monitor-exit p0

    const/4 v0, 0x0

    return v0
.end method

.method public final I5(Lcom/google/android/gms/internal/ads/Kc;)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized J()V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "pause must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->L:Lcom/google/android/gms/internal/ads/lH;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->d()Lcom/google/android/gms/internal/ads/eD;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/eD;->r1(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized K3(Ls3/X1;)Z
    .locals 5

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Ls3/X1;->f()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Ag;->i:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->bb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/cY;->G:Lw3/a;

    iget v2, v2, Lw3/a;->E:I

    sget-object v3, Lcom/google/android/gms/internal/ads/Af;->cb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lt v2, v3, :cond_2

    if-nez v0, :cond_3

    :cond_2
    const-string v0, "loadAd must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    :cond_3
    :goto_1
    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->D:Landroid/content/Context;

    invoke-static {v0}, Lv3/E0;->i(Landroid/content/Context;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p1, Ls3/X1;->U:Ls3/X;

    if-nez v0, :cond_4

    const-string p1, "Failed to load the ad because app ID is missing."

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/cY;->H:Lcom/google/android/gms/internal/ads/UX;

    if-eqz p1, :cond_5

    const/4 v0, 0x4

    invoke-static {v0, v2, v2}, Lcom/google/android/gms/internal/ads/P70;->d(ILjava/lang/String;Ls3/W0;)Ls3/W0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/UX;->u0(Ls3/W0;)V

    goto :goto_2

    :cond_4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/cY;->q6()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->D:Landroid/content/Context;

    iget-boolean v1, p1, Ls3/X1;->H:Z

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/L70;->a(Landroid/content/Context;Z)V

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/cY;->L:Lcom/google/android/gms/internal/ads/lH;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->E:Lcom/google/android/gms/internal/ads/R50;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cY;->F:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/cY;->C:Ls3/c2;

    new-instance v3, Lcom/google/android/gms/internal/ads/K50;

    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/ads/K50;-><init>(Ls3/c2;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/bY;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/bY;-><init>(Lcom/google/android/gms/internal/ads/cY;)V

    invoke-virtual {v0, p1, v1, v3, v2}, Lcom/google/android/gms/internal/ads/R50;->b(Ls3/X1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/jY;Lcom/google/android/gms/internal/ads/kY;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :cond_5
    :goto_2
    monitor-exit p0

    return v1

    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized P5()Z
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->E:Lcom/google/android/gms/internal/ads/R50;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/R50;->a()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final T1(Ls3/c2;)V
    .locals 0

    return-void
.end method

.method public final V0(Ls3/i2;)V
    .locals 0

    return-void
.end method

.method public final V5(Ls3/E;)V
    .locals 0

    return-void
.end method

.method public final W0(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final W2(Lcom/google/android/gms/internal/ads/Vn;)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized X()V
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "showInterstitial must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->L:Lcom/google/android/gms/internal/ads/lH;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "Interstitial can not be shown before loaded."

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->H:Lcom/google/android/gms/internal/ads/UX;

    const/16 v2, 0x9

    invoke-static {v2, v1, v1}, Lcom/google/android/gms/internal/ads/P70;->d(ILjava/lang/String;Ls3/W0;)Ls3/W0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/UX;->p(Ls3/W0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->T2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->J:Lcom/google/android/gms/internal/ads/Z9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Z9;->c()Lcom/google/android/gms/internal/ads/T9;

    move-result-object v0

    new-instance v2, Ljava/lang/Throwable;

    invoke-direct {v2}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/T9;->c([Ljava/lang/StackTraceElement;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->L:Lcom/google/android/gms/internal/ads/lH;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/cY;->M:Z

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/ads/lH;->j(ZLandroid/app/Activity;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final X1(Lcom/google/android/gms/internal/ads/Yn;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized Y()V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "resume must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->L:Lcom/google/android/gms/internal/ads/lH;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->d()Lcom/google/android/gms/internal/ads/eD;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/eD;->s1(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final Y1(Lcom/google/android/gms/internal/ads/ip;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->I:Lcom/google/android/gms/internal/ads/t60;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/t60;->z(Lcom/google/android/gms/internal/ads/ip;)V

    return-void
.end method

.method public final declared-synchronized Y4(Z)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "setImmersiveMode must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/cY;->M:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final e6(Z)V
    .locals 0

    return-void
.end method

.method public final f()Landroid/os/Bundle;
    .locals 1

    const-string v0, "getAdMetadata must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final declared-synchronized f0()Z
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "isLoaded must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/cY;->q6()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final g3(Ls3/c1;)V
    .locals 0

    return-void
.end method

.method public final h()Ls3/H;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->H:Lcom/google/android/gms/internal/ads/UX;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/UX;->g()Ls3/H;

    move-result-object v0

    return-object v0
.end method

.method public final h0()V
    .locals 0

    return-void
.end method

.method public final i()Ls3/c2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final i2(Ls3/i0;)V
    .locals 1

    const-string v0, "setAppEventListener must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->H:Lcom/google/android/gms/internal/ads/UX;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/UX;->C(Ls3/i0;)V

    return-void
.end method

.method public final j()Ls3/i0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->H:Lcom/google/android/gms/internal/ads/UX;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/UX;->i()Ls3/i0;

    move-result-object v0

    return-object v0
.end method

.method public final j4(Ls3/Q1;)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized k()Ls3/U0;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->C6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->L:Lcom/google/android/gms/internal/ads/lH;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->c()Lcom/google/android/gms/internal/ads/xC;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final l()Ls3/Y0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final l1(Ls3/N0;)V
    .locals 2

    .prologue
    const-string v0, "setPaidEventListener must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p1}, Ls3/N0;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->K:Lcom/google/android/gms/internal/ads/eO;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eO;->e()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Error in making CSI ping for reporting paid event callback"

    invoke-static {v1, v0}, Lw3/p;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->H:Lcom/google/android/gms/internal/ads/UX;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/UX;->z(Ls3/N0;)V

    return-void
.end method

.method public final declared-synchronized m6(LX3/a;)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->L:Lcom/google/android/gms/internal/ads/lH;

    if-nez v0, :cond_0

    const-string p1, "Interstitial can not be shown before loaded."

    invoke-static {p1}, Lw3/p;->g(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/cY;->H:Lcom/google/android/gms/internal/ads/UX;

    const/16 v0, 0x9

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lcom/google/android/gms/internal/ads/P70;->d(ILjava/lang/String;Ls3/W0;)Ls3/W0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/UX;->p(Ls3/W0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->T2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->J:Lcom/google/android/gms/internal/ads/Z9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Z9;->c()Lcom/google/android/gms/internal/ads/T9;

    move-result-object v0

    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/T9;->c([Ljava/lang/StackTraceElement;)V

    :cond_1
    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->L:Lcom/google/android/gms/internal/ads/lH;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/cY;->M:Z

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/lH;->j(ZLandroid/app/Activity;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final n()LX3/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final o3(Ls3/X1;Ls3/K;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->H:Lcom/google/android/gms/internal/ads/UX;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/UX;->w(Ls3/K;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/cY;->K3(Ls3/X1;)Z

    return-void
.end method

.method public final r2(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized t()Ljava/lang/String;
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->F:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized u()Ljava/lang/String;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->L:Lcom/google/android/gms/internal/ads/lH;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->c()Lcom/google/android/gms/internal/ads/xC;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->c()Lcom/google/android/gms/internal/ads/xC;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xC;->i()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final u3(Ls3/H;)V
    .locals 1

    const-string v0, "setAdListener must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->H:Lcom/google/android/gms/internal/ads/UX;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/UX;->k(Ls3/H;)V

    return-void
.end method

.method public final v3(Ls3/m0;)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized w()Ljava/lang/String;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cY;->L:Lcom/google/android/gms/internal/ads/lH;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->c()Lcom/google/android/gms/internal/ads/xC;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->c()Lcom/google/android/gms/internal/ads/xC;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xC;->i()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final x4(Ls3/a0;)V
    .locals 0

    const-string p1, "setAdMetadataListener must be called on the main UI thread."

    invoke-static {p1}, LQ3/p;->e(Ljava/lang/String;)V

    return-void
.end method
