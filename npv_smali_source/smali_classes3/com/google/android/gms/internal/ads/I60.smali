.class public final Lcom/google/android/gms/internal/ads/I60;
.super Lcom/google/android/gms/internal/ads/up;
.source "SourceFile"


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/E60;

.field private final D:Lcom/google/android/gms/internal/ads/t60;

.field private final E:Ljava/lang/String;

.field private final F:Lcom/google/android/gms/internal/ads/f70;

.field private final G:Landroid/content/Context;

.field private final H:Lw3/a;

.field private final I:Lcom/google/android/gms/internal/ads/Z9;

.field private final J:Lcom/google/android/gms/internal/ads/eO;

.field private K:Lcom/google/android/gms/internal/ads/fM;

.field private L:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/E60;Landroid/content/Context;Lcom/google/android/gms/internal/ads/t60;Lcom/google/android/gms/internal/ads/f70;Lw3/a;Lcom/google/android/gms/internal/ads/Z9;Lcom/google/android/gms/internal/ads/eO;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/up;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/I60;->E:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/I60;->C:Lcom/google/android/gms/internal/ads/E60;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/I60;->D:Lcom/google/android/gms/internal/ads/t60;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/I60;->F:Lcom/google/android/gms/internal/ads/f70;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/I60;->G:Landroid/content/Context;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/I60;->H:Lw3/a;

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->O0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/I60;->L:Z

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/I60;->I:Lcom/google/android/gms/internal/ads/Z9;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/I60;->J:Lcom/google/android/gms/internal/ads/eO;

    return-void
.end method

.method static bridge synthetic p6(Lcom/google/android/gms/internal/ads/I60;)Lcom/google/android/gms/internal/ads/fM;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/I60;->K:Lcom/google/android/gms/internal/ads/fM;

    return-object p0
.end method

.method static bridge synthetic q6(Lcom/google/android/gms/internal/ads/I60;)Lcom/google/android/gms/internal/ads/f70;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/I60;->F:Lcom/google/android/gms/internal/ads/f70;

    return-object p0
.end method

.method static bridge synthetic r6(Lcom/google/android/gms/internal/ads/I60;Lcom/google/android/gms/internal/ads/fM;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/I60;->K:Lcom/google/android/gms/internal/ads/fM;

    return-void
.end method

.method private final declared-synchronized s6(Ls3/X1;Lcom/google/android/gms/internal/ads/Cp;I)V
    .locals 4

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Ls3/X1;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Ag;->k:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

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

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->H:Lw3/a;

    iget v0, v0, Lw3/a;->E:I

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->cb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lt v0, v2, :cond_2

    if-nez v1, :cond_3

    :cond_2
    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->D:Lcom/google/android/gms/internal/ads/t60;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/t60;->w(Lcom/google/android/gms/internal/ads/Cp;)V

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/I60;->G:Landroid/content/Context;

    invoke-static {p2}, Lv3/E0;->i(Landroid/content/Context;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_5

    iget-object p2, p1, Ls3/X1;->U:Ls3/X;

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    const-string p1, "Failed to load the ad because app ID is missing."

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/I60;->D:Lcom/google/android/gms/internal/ads/t60;

    const/4 p2, 0x4

    invoke-static {p2, v0, v0}, Lcom/google/android/gms/internal/ads/P70;->d(ILjava/lang/String;Ls3/W0;)Ls3/W0;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/t60;->u0(Ls3/W0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_5
    :goto_2
    :try_start_1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/I60;->K:Lcom/google/android/gms/internal/ads/fM;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_6

    monitor-exit p0

    return-void

    :cond_6
    :try_start_2
    new-instance p2, Lcom/google/android/gms/internal/ads/v60;

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/ads/v60;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->C:Lcom/google/android/gms/internal/ads/E60;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ads/E60;->j(I)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/I60;->C:Lcom/google/android/gms/internal/ads/E60;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->E:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/ads/H60;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/H60;-><init>(Lcom/google/android/gms/internal/ads/I60;)V

    invoke-virtual {p3, p1, v0, p2, v1}, Lcom/google/android/gms/internal/ads/E60;->b(Ls3/X1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/jY;Lcom/google/android/gms/internal/ads/kY;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :goto_3
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method


# virtual methods
.method public final A2(Lcom/google/android/gms/internal/ads/Dp;)V
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->D:Lcom/google/android/gms/internal/ads/t60;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/t60;->C(Lcom/google/android/gms/internal/ads/Dp;)V

    return-void
.end method

.method public final declared-synchronized K4(Ls3/X1;Lcom/google/android/gms/internal/ads/Cp;)V
    .locals 1

    .prologue
    monitor-enter p0

    const/4 v0, 0x2

    :try_start_0
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/I60;->s6(Ls3/X1;Lcom/google/android/gms/internal/ads/Cp;I)V
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

.method public final L2(Ls3/K0;)V
    .locals 2

    .prologue
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/I60;->D:Lcom/google/android/gms/internal/ads/t60;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/t60;->i(LE3/a;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->D:Lcom/google/android/gms/internal/ads/t60;

    new-instance v1, Lcom/google/android/gms/internal/ads/G60;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/G60;-><init>(Lcom/google/android/gms/internal/ads/I60;Ls3/K0;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/t60;->i(LE3/a;)V

    return-void
.end method

.method public final N5(Ls3/N0;)V
    .locals 2

    .prologue
    const-string v0, "setOnPaidEventListener must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p1}, Ls3/N0;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->J:Lcom/google/android/gms/internal/ads/eO;

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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->D:Lcom/google/android/gms/internal/ads/t60;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/t60;->o(Ls3/N0;)V

    return-void
.end method

.method public final declared-synchronized S2(LX3/a;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/I60;->L:Z

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/I60;->p2(LX3/a;Z)V
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

.method public final declared-synchronized T3(Z)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "setImmersiveMode must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/I60;->L:Z
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

.method public final b()Landroid/os/Bundle;
    .locals 1

    .prologue
    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->K:Lcom/google/android/gms/internal/ads/fM;

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

.method public final declared-synchronized b3(Lcom/google/android/gms/internal/ads/Kp;)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->F:Lcom/google/android/gms/internal/ads/f70;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/Kp;->C:Ljava/lang/String;

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/f70;->a:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/Kp;->D:Ljava/lang/String;

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

.method public final c()Ls3/U0;
    .locals 2

    .prologue
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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->K:Lcom/google/android/gms/internal/ads/fM;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->c()Lcom/google/android/gms/internal/ads/xC;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final declared-synchronized d()Ljava/lang/String;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->K:Lcom/google/android/gms/internal/ads/fM;

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

.method public final d3(Lcom/google/android/gms/internal/ads/yp;)V
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->D:Lcom/google/android/gms/internal/ads/t60;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/t60;->t(Lcom/google/android/gms/internal/ads/yp;)V

    return-void
.end method

.method public final f()Lcom/google/android/gms/internal/ads/sp;
    .locals 1

    .prologue
    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->K:Lcom/google/android/gms/internal/ads/fM;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fM;->j()Lcom/google/android/gms/internal/ads/sp;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final declared-synchronized m5(Ls3/X1;Lcom/google/android/gms/internal/ads/Cp;)V
    .locals 1

    .prologue
    monitor-enter p0

    const/4 v0, 0x3

    :try_start_0
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/I60;->s6(Ls3/X1;Lcom/google/android/gms/internal/ads/Cp;I)V
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

.method public final p()Z
    .locals 1

    .prologue
    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->K:Lcom/google/android/gms/internal/ads/fM;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fM;->m()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final declared-synchronized p2(LX3/a;Z)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->K:Lcom/google/android/gms/internal/ads/fM;

    if-nez v0, :cond_0

    const-string p1, "Rewarded can not be shown before loaded"

    invoke-static {p1}, Lw3/p;->g(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/I60;->D:Lcom/google/android/gms/internal/ads/t60;

    const/16 p2, 0x9

    const/4 v0, 0x0

    invoke-static {p2, v0, v0}, Lcom/google/android/gms/internal/ads/P70;->d(ILjava/lang/String;Ls3/W0;)Ls3/W0;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/t60;->p(Ls3/W0;)V
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

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->I:Lcom/google/android/gms/internal/ads/Z9;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/I60;->K:Lcom/google/android/gms/internal/ads/fM;

    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/ads/fM;->o(ZLandroid/app/Activity;)Z
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
