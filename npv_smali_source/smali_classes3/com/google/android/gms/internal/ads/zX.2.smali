.class public final Lcom/google/android/gms/internal/ads/zX;
.super Ls3/U;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/TD;


# instance fields
.field private final C:Landroid/content/Context;

.field private final D:Lcom/google/android/gms/internal/ads/Z40;

.field private final E:Ljava/lang/String;

.field private final F:Lcom/google/android/gms/internal/ads/UX;

.field private G:Ls3/c2;

.field private final H:Lcom/google/android/gms/internal/ads/l70;

.field private final I:Lw3/a;

.field private final J:Lcom/google/android/gms/internal/ads/eO;

.field private K:Lcom/google/android/gms/internal/ads/Qy;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ls3/c2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Z40;Lcom/google/android/gms/internal/ads/UX;Lw3/a;Lcom/google/android/gms/internal/ads/eO;)V
    .locals 0

    invoke-direct {p0}, Ls3/U;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zX;->C:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zX;->D:Lcom/google/android/gms/internal/ads/Z40;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zX;->G:Ls3/c2;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zX;->E:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zX;->F:Lcom/google/android/gms/internal/ads/UX;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/Z40;->f()Lcom/google/android/gms/internal/ads/l70;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zX;->H:Lcom/google/android/gms/internal/ads/l70;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zX;->I:Lw3/a;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zX;->J:Lcom/google/android/gms/internal/ads/eO;

    invoke-virtual {p4, p0}, Lcom/google/android/gms/internal/ads/Z40;->o(Lcom/google/android/gms/internal/ads/TD;)V

    return-void
.end method

.method static bridge synthetic o6(Lcom/google/android/gms/internal/ads/zX;)Lcom/google/android/gms/internal/ads/Qy;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zX;->K:Lcom/google/android/gms/internal/ads/Qy;

    return-object p0
.end method

.method static bridge synthetic p6(Lcom/google/android/gms/internal/ads/zX;Lcom/google/android/gms/internal/ads/Qy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zX;->K:Lcom/google/android/gms/internal/ads/Qy;

    return-void
.end method

.method private final declared-synchronized q6(Ls3/c2;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->H:Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/l70;->O(Ls3/c2;)Lcom/google/android/gms/internal/ads/l70;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zX;->G:Ls3/c2;

    iget-boolean p1, p1, Ls3/c2;->P:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->H:Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/l70;->U(Z)Lcom/google/android/gms/internal/ads/l70;
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

.method private final declared-synchronized r6(Ls3/X1;)Z
    .locals 4

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zX;->s6()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "loadAd must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->C:Landroid/content/Context;

    invoke-static {v0}, Lv3/E0;->i(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p1, Ls3/X1;->U:Ls3/X;

    if-nez v0, :cond_2

    const-string p1, "Failed to load the ad because app ID is missing."

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zX;->F:Lcom/google/android/gms/internal/ads/UX;

    if-eqz p1, :cond_1

    const/4 v0, 0x4

    invoke-static {v0, v1, v1}, Lcom/google/android/gms/internal/ads/P70;->d(ILjava/lang/String;Ls3/W0;)Ls3/W0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/UX;->u0(Ls3/W0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->C:Landroid/content/Context;

    iget-boolean v2, p1, Ls3/X1;->H:Z

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/L70;->a(Landroid/content/Context;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->D:Lcom/google/android/gms/internal/ads/Z40;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zX;->E:Ljava/lang/String;

    new-instance v3, Lcom/google/android/gms/internal/ads/yX;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/ads/yX;-><init>(Lcom/google/android/gms/internal/ads/zX;)V

    invoke-virtual {v0, p1, v2, v1, v3}, Lcom/google/android/gms/internal/ads/Z40;->b(Ls3/X1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/jY;Lcom/google/android/gms/internal/ads/kY;)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return p1

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private final s6()Z
    .locals 6

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Ag;->f:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->bb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zX;->I:Lw3/a;

    iget v3, v3, Lw3/a;->E:I

    sget-object v4, Lcom/google/android/gms/internal/ads/Af;->cb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-lt v3, v4, :cond_2

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return v2

    :cond_2
    :goto_1
    return v1
.end method


# virtual methods
.method public final declared-synchronized C()V
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Ag;->e:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Ya:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->I:Lw3/a;

    iget v0, v0, Lw3/a;->E:I

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->db:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v0, v1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->K:Lcom/google/android/gms/internal/ads/Qy;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->a()V
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

    throw v0
.end method

.method public final F1(Ls3/p0;)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized F2(Lcom/google/android/gms/internal/ads/Wf;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "setOnCustomRenderedAdLoadedListener must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->D:Lcom/google/android/gms/internal/ads/Z40;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Z40;->p(Lcom/google/android/gms/internal/ads/Wf;)V
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

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->K:Lcom/google/android/gms/internal/ads/Qy;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->h()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

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

.method public final I5(Lcom/google/android/gms/internal/ads/Kc;)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized J()V
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Ag;->g:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Za:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->I:Lw3/a;

    iget v0, v0, Lw3/a;->E:I

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->db:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v0, v1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    const-string v0, "pause must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->K:Lcom/google/android/gms/internal/ads/Qy;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->d()Lcom/google/android/gms/internal/ads/eD;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/eD;->r1(Landroid/content/Context;)V
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

    throw v0
.end method

.method public final declared-synchronized K3(Ls3/X1;)Z
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->G:Ls3/c2;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zX;->q6(Ls3/c2;)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zX;->r6(Ls3/X1;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->D:Lcom/google/android/gms/internal/ads/Z40;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Z40;->a()Z

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

.method public final declared-synchronized T1(Ls3/c2;)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "setAdSize must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->H:Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/l70;->O(Ls3/c2;)Lcom/google/android/gms/internal/ads/l70;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zX;->G:Ls3/c2;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->K:Lcom/google/android/gms/internal/ads/Qy;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zX;->D:Lcom/google/android/gms/internal/ads/Z40;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Z40;->c()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Qy;->p(Landroid/view/ViewGroup;Ls3/c2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final V0(Ls3/i2;)V
    .locals 0

    return-void
.end method

.method public final V5(Ls3/E;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zX;->s6()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "setAdListener must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->D:Lcom/google/android/gms/internal/ads/Z40;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Z40;->n(Ls3/E;)V

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

.method public final X()V
    .locals 0

    return-void
.end method

.method public final X1(Lcom/google/android/gms/internal/ads/Yn;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized Y()V
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Ag;->h:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Xa:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->I:Lw3/a;

    iget v0, v0, Lw3/a;->E:I

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->db:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v0, v1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    const-string v0, "resume must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->K:Lcom/google/android/gms/internal/ads/Qy;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->d()Lcom/google/android/gms/internal/ads/eD;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/eD;->s1(Landroid/content/Context;)V
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

    throw v0
.end method

.method public final Y1(Lcom/google/android/gms/internal/ads/ip;)V
    .locals 0

    return-void
.end method

.method public final Y4(Z)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized a()V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->D:Lcom/google/android/gms/internal/ads/Z40;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Z40;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->H:Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/l70;->D()Ls3/c2;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zX;->K:Lcom/google/android/gms/internal/ads/Qy;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Qy;->n()Lcom/google/android/gms/internal/ads/S60;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zX;->H:Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/l70;->t()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->C:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zX;->K:Lcom/google/android/gms/internal/ads/Qy;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Qy;->n()Lcom/google/android/gms/internal/ads/S60;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/t70;->a(Landroid/content/Context;Ljava/util/List;)Ls3/c2;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zX;->q6(Ls3/c2;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->H:Lcom/google/android/gms/internal/ads/l70;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/l70;->T(Z)Lcom/google/android/gms/internal/ads/l70;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->H:Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/l70;->B()Ls3/X1;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zX;->r6(Ls3/X1;)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    :try_start_2
    const-string v0, "Failed to refresh the banner ad."

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->H:Lcom/google/android/gms/internal/ads/l70;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/l70;->T(Z)Lcom/google/android/gms/internal/ads/l70;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->D:Lcom/google/android/gms/internal/ads/Z40;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Z40;->l()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0
.end method

.method public final declared-synchronized b()V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->D:Lcom/google/android/gms/internal/ads/Z40;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Z40;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->D:Lcom/google/android/gms/internal/ads/Z40;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Z40;->q()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->D:Lcom/google/android/gms/internal/ads/Z40;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Z40;->m()V
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

.method public final declared-synchronized e6(Z)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zX;->s6()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "setManualImpressionsEnabled must be called from the main thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->H:Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/l70;->b(Z)Lcom/google/android/gms/internal/ads/l70;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final f()Landroid/os/Bundle;
    .locals 1

    const-string v0, "getAdMetadata must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final f0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final g3(Ls3/c1;)V
    .locals 0

    return-void
.end method

.method public final h()Ls3/H;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->F:Lcom/google/android/gms/internal/ads/UX;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/UX;->g()Ls3/H;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized h0()V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "recordManualImpression must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->K:Lcom/google/android/gms/internal/ads/Qy;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Qy;->o()V
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

.method public final declared-synchronized i()Ls3/c2;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "getAdSize must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->K:Lcom/google/android/gms/internal/ads/Qy;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zX;->C:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Qy;->m()Lcom/google/android/gms/internal/ads/S60;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/t70;->a(Landroid/content/Context;Ljava/util/List;)Ls3/c2;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->H:Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/l70;->D()Ls3/c2;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final i2(Ls3/i0;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zX;->s6()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "setAppEventListener must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->F:Lcom/google/android/gms/internal/ads/UX;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/UX;->C(Ls3/i0;)V

    return-void
.end method

.method public final j()Ls3/i0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->F:Lcom/google/android/gms/internal/ads/UX;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/UX;->i()Ls3/i0;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized j4(Ls3/Q1;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zX;->s6()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "setVideoOptions must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->H:Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/l70;->i(Ls3/Q1;)Lcom/google/android/gms/internal/ads/l70;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->K:Lcom/google/android/gms/internal/ads/Qy;

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

.method public final declared-synchronized l()Ls3/Y0;
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "getVideoController must be called from the main thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->K:Lcom/google/android/gms/internal/ads/Qy;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Qy;->l()Ls3/Y0;

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

.method public final l1(Ls3/N0;)V
    .locals 2

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zX;->s6()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "setPaidEventListener must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    :cond_0
    :try_start_0
    invoke-interface {p1}, Ls3/N0;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->J:Lcom/google/android/gms/internal/ads/eO;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eO;->e()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Error in making CSI ping for reporting paid event callback"

    invoke-static {v1, v0}, Lw3/p;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->F:Lcom/google/android/gms/internal/ads/UX;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/UX;->z(Ls3/N0;)V

    return-void
.end method

.method public final m6(LX3/a;)V
    .locals 0

    return-void
.end method

.method public final n()LX3/a;
    .locals 1

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zX;->s6()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "getAdFrame must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->D:Lcom/google/android/gms/internal/ads/Z40;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Z40;->c()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v0

    return-object v0
.end method

.method public final o3(Ls3/X1;Ls3/K;)V
    .locals 0

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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->E:Ljava/lang/String;
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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->K:Lcom/google/android/gms/internal/ads/Qy;

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

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zX;->s6()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "setAdListener must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->F:Lcom/google/android/gms/internal/ads/UX;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/UX;->k(Ls3/H;)V

    return-void
.end method

.method public final declared-synchronized v3(Ls3/m0;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "setCorrelationIdProvider must be called on the main UI thread"

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->H:Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/l70;->v(Ls3/m0;)Lcom/google/android/gms/internal/ads/l70;
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

.method public final declared-synchronized w()Ljava/lang/String;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zX;->K:Lcom/google/android/gms/internal/ads/Qy;

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
