.class public final Lcom/google/android/gms/internal/ads/O60;
.super Lcom/google/android/gms/internal/ads/dp;
.source "SourceFile"


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/E60;

.field private final D:Lcom/google/android/gms/internal/ads/t60;

.field private final E:Lcom/google/android/gms/internal/ads/f70;

.field private F:Lcom/google/android/gms/internal/ads/fM;

.field private G:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/E60;Lcom/google/android/gms/internal/ads/t60;Lcom/google/android/gms/internal/ads/f70;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/dp;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/O60;->G:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/O60;->C:Lcom/google/android/gms/internal/ads/E60;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/O60;->D:Lcom/google/android/gms/internal/ads/t60;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/O60;->E:Lcom/google/android/gms/internal/ads/f70;

    return-void
.end method

.method static bridge synthetic o6(Lcom/google/android/gms/internal/ads/O60;)Lcom/google/android/gms/internal/ads/fM;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/O60;->F:Lcom/google/android/gms/internal/ads/fM;

    return-object p0
.end method

.method static bridge synthetic p6(Lcom/google/android/gms/internal/ads/O60;)Lcom/google/android/gms/internal/ads/f70;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/O60;->E:Lcom/google/android/gms/internal/ads/f70;

    return-object p0
.end method

.method static bridge synthetic q6(Lcom/google/android/gms/internal/ads/O60;Lcom/google/android/gms/internal/ads/fM;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/O60;->F:Lcom/google/android/gms/internal/ads/fM;

    return-void
.end method

.method private final declared-synchronized r6()Z
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O60;->F:Lcom/google/android/gms/internal/ads/fM;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fM;->l()Z

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
.method public final declared-synchronized I0(LX3/a;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "pause must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O60;->F:Lcom/google/android/gms/internal/ads/fM;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O60;->F:Lcom/google/android/gms/internal/ads/fM;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->d()Lcom/google/android/gms/internal/ads/eD;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/eD;->r1(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final J1(Ls3/a0;)V
    .locals 2

    .prologue
    const-string v0, "setAdMetadataListener can only be called from the UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/O60;->D:Lcom/google/android/gms/internal/ads/t60;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/t60;->i(LE3/a;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O60;->D:Lcom/google/android/gms/internal/ads/t60;

    new-instance v1, Lcom/google/android/gms/internal/ads/N60;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/N60;-><init>(Lcom/google/android/gms/internal/ads/O60;Ls3/a0;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/t60;->i(LE3/a;)V

    return-void
.end method

.method public final declared-synchronized O(Z)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "setImmersiveMode must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/O60;->G:Z
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

.method public final Z5(Lcom/google/android/gms/internal/ads/ip;)V
    .locals 1

    const-string v0, "setRewardedVideoAdListener can only be called from the UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O60;->D:Lcom/google/android/gms/internal/ads/t60;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/t60;->z(Lcom/google/android/gms/internal/ads/ip;)V

    return-void
.end method

.method public final b()Landroid/os/Bundle;
    .locals 1

    .prologue
    const-string v0, "getAdMetadata can only be called from the UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O60;->F:Lcom/google/android/gms/internal/ads/fM;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fM;->i()Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :goto_0
    return-object v0
.end method

.method public final declared-synchronized b0(LX3/a;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "resume must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O60;->F:Lcom/google/android/gms/internal/ads/fM;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O60;->F:Lcom/google/android/gms/internal/ads/fM;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->d()Lcom/google/android/gms/internal/ads/eD;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/eD;->s1(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized c()Ls3/U0;
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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O60;->F:Lcom/google/android/gms/internal/ads/fM;

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

.method public final d()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/O60;->k0(LX3/a;)V

    return-void
.end method

.method public final declared-synchronized f()Ljava/lang/String;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O60;->F:Lcom/google/android/gms/internal/ads/fM;

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

.method public final g()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/O60;->I0(LX3/a;)V

    return-void
.end method

.method public final declared-synchronized g0(LX3/a;)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "showAd must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O60;->F:Lcom/google/android/gms/internal/ads/fM;

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Landroid/app/Activity;

    if-eqz v1, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/O60;->F:Lcom/google/android/gms/internal/ads/fM;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/O60;->G:Z

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/fM;->o(ZLandroid/app/Activity;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final j()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/O60;->b0(LX3/a;)V

    return-void
.end method

.method public final declared-synchronized k0(LX3/a;)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O60;->D:Lcom/google/android/gms/internal/ads/t60;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/t60;->i(LE3/a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O60;->F:Lcom/google/android/gms/internal/ads/fM;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/O60;->F:Lcom/google/android/gms/internal/ads/fM;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->d()Lcom/google/android/gms/internal/ads/eD;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/eD;->q1(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized n4(Lcom/google/android/gms/internal/ads/jp;)V
    .locals 4

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "loadAd must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/jp;->D:Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->r5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-static {v1, v0}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_2
    const-string v1, "NonagonUtil.isPatternMatched"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/O60;->r6()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->t5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v0, :cond_2

    :goto_1
    monitor-exit p0

    return-void

    :cond_2
    :try_start_3
    new-instance v0, Lcom/google/android/gms/internal/ads/v60;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/v60;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/O60;->F:Lcom/google/android/gms/internal/ads/fM;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/O60;->C:Lcom/google/android/gms/internal/ads/E60;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/E60;->j(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/O60;->C:Lcom/google/android/gms/internal/ads/E60;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/jp;->C:Ls3/X1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/jp;->D:Ljava/lang/String;

    new-instance v3, Lcom/google/android/gms/internal/ads/M60;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/ads/M60;-><init>(Lcom/google/android/gms/internal/ads/O60;)V

    invoke-virtual {v1, v2, p1, v0, v3}, Lcom/google/android/gms/internal/ads/E60;->b(Ls3/X1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/jY;Lcom/google/android/gms/internal/ads/kY;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final o2(Lcom/google/android/gms/internal/ads/cp;)V
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread.: setRewardedAdSkuListener"

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O60;->D:Lcom/google/android/gms/internal/ads/t60;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/t60;->B(Lcom/google/android/gms/internal/ads/cp;)V

    return-void
.end method

.method public final declared-synchronized s()V
    .locals 1

    .prologue
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/O60;->g0(LX3/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final u()Z
    .locals 1

    const-string v0, "isLoaded must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/O60;->r6()Z

    move-result v0

    return v0
.end method

.method public final declared-synchronized u0(Ljava/lang/String;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "#008 Must be called on the main UI thread.: setCustomData"

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O60;->E:Lcom/google/android/gms/internal/ads/f70;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/f70;->b:Ljava/lang/String;
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

.method public final declared-synchronized v0(Ljava/lang/String;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "setUserId must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O60;->E:Lcom/google/android/gms/internal/ads/f70;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/f70;->a:Ljava/lang/String;
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

.method public final w()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O60;->F:Lcom/google/android/gms/internal/ads/fM;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fM;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
