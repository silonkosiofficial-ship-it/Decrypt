.class public abstract Lcom/google/android/gms/internal/ads/t40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/lY;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/concurrent/Executor;

.field protected final c:Lcom/google/android/gms/internal/ads/Su;

.field private final d:Lcom/google/android/gms/internal/ads/K40;

.field private final e:Lcom/google/android/gms/internal/ads/F50;

.field private final f:Lw3/a;

.field private final g:Landroid/view/ViewGroup;

.field private final h:Lcom/google/android/gms/internal/ads/T90;

.field private final i:Lcom/google/android/gms/internal/ads/l70;

.field private j:LP4/d;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/Su;Lcom/google/android/gms/internal/ads/F50;Lcom/google/android/gms/internal/ads/K40;Lcom/google/android/gms/internal/ads/l70;Lw3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t40;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/t40;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/t40;->c:Lcom/google/android/gms/internal/ads/Su;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/t40;->e:Lcom/google/android/gms/internal/ads/F50;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/t40;->d:Lcom/google/android/gms/internal/ads/K40;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/t40;->i:Lcom/google/android/gms/internal/ads/l70;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/t40;->f:Lw3/a;

    new-instance p2, Landroid/widget/FrameLayout;

    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/t40;->g:Landroid/view/ViewGroup;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/Su;->F()Lcom/google/android/gms/internal/ads/T90;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t40;->h:Lcom/google/android/gms/internal/ads/T90;

    return-void
.end method

.method public static synthetic c(Lcom/google/android/gms/internal/ads/t40;Lcom/google/android/gms/internal/ads/D50;)Lcom/google/android/gms/internal/ads/iC;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/t40;->m(Lcom/google/android/gms/internal/ads/D50;)Lcom/google/android/gms/internal/ads/iC;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/t40;Lcom/google/android/gms/internal/ads/D50;)Lcom/google/android/gms/internal/ads/iC;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/t40;->m(Lcom/google/android/gms/internal/ads/D50;)Lcom/google/android/gms/internal/ads/iC;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic f(Lcom/google/android/gms/internal/ads/t40;)Lcom/google/android/gms/internal/ads/K40;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/t40;->d:Lcom/google/android/gms/internal/ads/K40;

    return-object p0
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/ads/t40;)Lcom/google/android/gms/internal/ads/F50;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/t40;->e:Lcom/google/android/gms/internal/ads/F50;

    return-object p0
.end method

.method static bridge synthetic h(Lcom/google/android/gms/internal/ads/t40;)Lcom/google/android/gms/internal/ads/T90;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/t40;->h:Lcom/google/android/gms/internal/ads/T90;

    return-object p0
.end method

.method static bridge synthetic i(Lcom/google/android/gms/internal/ads/t40;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/t40;->b:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static bridge synthetic j(Lcom/google/android/gms/internal/ads/t40;LP4/d;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t40;->j:LP4/d;

    return-void
.end method

.method private final declared-synchronized m(Lcom/google/android/gms/internal/ads/D50;)Lcom/google/android/gms/internal/ads/iC;
    .locals 4

    .prologue
    monitor-enter p0

    :try_start_0
    check-cast p1, Lcom/google/android/gms/internal/ads/r40;

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->b8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t40;->g:Landroid/view/ViewGroup;

    new-instance v1, Lcom/google/android/gms/internal/ads/Ny;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/Ny;-><init>(Landroid/view/ViewGroup;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/lC;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/lC;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/t40;->a:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/lC;->f(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/lC;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/r40;->a:Lcom/google/android/gms/internal/ads/n70;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/lC;->k(Lcom/google/android/gms/internal/ads/n70;)Lcom/google/android/gms/internal/ads/lC;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lC;->l()Lcom/google/android/gms/internal/ads/nC;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/CF;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/CF;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/t40;->d:Lcom/google/android/gms/internal/ads/K40;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/t40;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/CF;->f(Lcom/google/android/gms/internal/ads/VC;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/t40;->d:Lcom/google/android/gms/internal/ads/K40;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/t40;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/CF;->o(Lcom/google/android/gms/internal/ads/MG;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/CF;->q()Lcom/google/android/gms/internal/ads/EF;

    move-result-object v0

    invoke-virtual {p0, v1, p1, v0}, Lcom/google/android/gms/internal/ads/t40;->e(Lcom/google/android/gms/internal/ads/Ny;Lcom/google/android/gms/internal/ads/nC;Lcom/google/android/gms/internal/ads/EF;)Lcom/google/android/gms/internal/ads/iC;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t40;->d:Lcom/google/android/gms/internal/ads/K40;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/K40;->a(Lcom/google/android/gms/internal/ads/K40;)Lcom/google/android/gms/internal/ads/K40;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/CF;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/CF;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/t40;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/CF;->e(Lcom/google/android/gms/internal/ads/HC;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/t40;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/CF;->j(Lcom/google/android/gms/internal/ads/FD;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/t40;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/CF;->k(Lu3/z;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/t40;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/CF;->l(Lcom/google/android/gms/internal/ads/SD;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/t40;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/CF;->f(Lcom/google/android/gms/internal/ads/VC;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/t40;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/CF;->o(Lcom/google/android/gms/internal/ads/MG;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/CF;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/CF;->p(Lcom/google/android/gms/internal/ads/C50;)Lcom/google/android/gms/internal/ads/CF;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t40;->g:Landroid/view/ViewGroup;

    new-instance v2, Lcom/google/android/gms/internal/ads/Ny;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/Ny;-><init>(Landroid/view/ViewGroup;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/lC;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/lC;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/t40;->a:Landroid/content/Context;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/lC;->f(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/lC;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/r40;->a:Lcom/google/android/gms/internal/ads/n70;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/lC;->k(Lcom/google/android/gms/internal/ads/n70;)Lcom/google/android/gms/internal/ads/lC;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lC;->l()Lcom/google/android/gms/internal/ads/nC;

    move-result-object p1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/CF;->q()Lcom/google/android/gms/internal/ads/EF;

    move-result-object v0

    invoke-virtual {p0, v2, p1, v0}, Lcom/google/android/gms/internal/ads/t40;->e(Lcom/google/android/gms/internal/ads/Ny;Lcom/google/android/gms/internal/ads/nC;Lcom/google/android/gms/internal/ads/EF;)Lcom/google/android/gms/internal/ads/iC;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t40;->j:LP4/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final declared-synchronized b(Ls3/X1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/jY;Lcom/google/android/gms/internal/ads/kY;)Z
    .locals 9

    .prologue
    const/4 p3, 0x0

    const/4 v0, 0x1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Ls3/X1;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/Ag;->d:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->bb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    move v1, v0

    goto :goto_0

    :cond_1
    move v1, p3

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/t40;->f:Lw3/a;

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

    if-nez v1, :cond_3

    :cond_2
    const-string v1, "loadAd must be called on the main UI thread."

    invoke-static {v1}, LQ3/p;->e(Ljava/lang/String;)V

    :cond_3
    :goto_1
    if-nez p2, :cond_4

    const-string p1, "Ad unit ID should not be null for app open ad."

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/t40;->b:Ljava/util/concurrent/Executor;

    new-instance p2, Lcom/google/android/gms/internal/ads/n40;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/n40;-><init>(Lcom/google/android/gms/internal/ads/t40;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p3

    :cond_4
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/t40;->j:LP4/d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_5

    monitor-exit p0

    return p3

    :cond_5
    :try_start_2
    sget-object v1, Lcom/google/android/gms/internal/ads/vg;->c:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x7

    const/4 v3, 0x0

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/t40;->e:Lcom/google/android/gms/internal/ads/F50;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/F50;->f()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zy;

    if-eqz v1, :cond_6

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/jC;->g()Lcom/google/android/gms/internal/ads/Q90;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/Q90;->i(I)Lcom/google/android/gms/internal/ads/Q90;

    iget-object v4, p1, Ls3/X1;->R:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/Q90;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Q90;

    iget-object v4, p1, Ls3/X1;->O:Landroid/os/Bundle;

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/Q90;->f(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/Q90;

    move-object v4, v1

    goto :goto_2

    :cond_6
    move-object v4, v3

    :goto_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/t40;->a:Landroid/content/Context;

    iget-boolean v5, p1, Ls3/X1;->H:Z

    invoke-static {v1, v5}, Lcom/google/android/gms/internal/ads/L70;->a(Landroid/content/Context;Z)V

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->O8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v5

    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-boolean v1, p1, Ls3/X1;->H:Z

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/t40;->c:Lcom/google/android/gms/internal/ads/Su;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Su;->s()Lcom/google/android/gms/internal/ads/KP;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/KP;->p(Z)V

    :cond_7
    new-instance v1, Landroid/util/Pair;

    sget-object v5, Lcom/google/android/gms/internal/ads/MN;->D:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v5

    iget-wide v6, p1, Ls3/X1;->b0:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-direct {v1, v5, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/util/Pair;

    sget-object v6, Lcom/google/android/gms/internal/ads/MN;->E:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v7

    invoke-interface {v7}, LV3/f;->a()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v6, 0x2

    new-array v6, v6, [Landroid/util/Pair;

    aput-object v1, v6, p3

    aput-object v5, v6, v0

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/ON;->a([Landroid/util/Pair;)Landroid/os/Bundle;

    move-result-object p3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/t40;->i:Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/l70;->P(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/l70;

    invoke-static {}, Ls3/c2;->f()Ls3/c2;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/l70;->O(Ls3/c2;)Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/l70;->h(Ls3/X1;)Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v1, p3}, Lcom/google/android/gms/internal/ads/l70;->a(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/l70;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/t40;->a:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/l70;->j()Lcom/google/android/gms/internal/ads/n70;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/P90;->f(Lcom/google/android/gms/internal/ads/n70;)I

    move-result v1

    invoke-static {p2, v1, v2, p1}, Lcom/google/android/gms/internal/ads/D90;->b(Landroid/content/Context;IILs3/X1;)Lcom/google/android/gms/internal/ads/E90;

    move-result-object v5

    new-instance v6, Lcom/google/android/gms/internal/ads/r40;

    invoke-direct {v6, v3}, Lcom/google/android/gms/internal/ads/r40;-><init>(Lcom/google/android/gms/internal/ads/s40;)V

    iput-object p3, v6, Lcom/google/android/gms/internal/ads/r40;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/t40;->e:Lcom/google/android/gms/internal/ads/F50;

    new-instance p2, Lcom/google/android/gms/internal/ads/G50;

    invoke-direct {p2, v6, v3}, Lcom/google/android/gms/internal/ads/G50;-><init>(Lcom/google/android/gms/internal/ads/D50;Lcom/google/android/gms/internal/ads/Po;)V

    new-instance p3, Lcom/google/android/gms/internal/ads/o40;

    invoke-direct {p3, p0}, Lcom/google/android/gms/internal/ads/o40;-><init>(Lcom/google/android/gms/internal/ads/t40;)V

    invoke-interface {p1, p2, p3, v3}, Lcom/google/android/gms/internal/ads/F50;->a(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Ljava/lang/Object;)LP4/d;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t40;->j:LP4/d;

    new-instance p2, Lcom/google/android/gms/internal/ads/q40;

    move-object v1, p2

    move-object v2, p0

    move-object v3, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/q40;-><init>(Lcom/google/android/gms/internal/ads/t40;Lcom/google/android/gms/internal/ads/kY;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;Lcom/google/android/gms/internal/ads/r40;)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/t40;->b:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return v0

    :goto_3
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method protected abstract e(Lcom/google/android/gms/internal/ads/Ny;Lcom/google/android/gms/internal/ads/nC;Lcom/google/android/gms/internal/ads/EF;)Lcom/google/android/gms/internal/ads/iC;
.end method

.method final synthetic k()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t40;->d:Lcom/google/android/gms/internal/ads/K40;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lcom/google/android/gms/internal/ads/P70;->d(ILjava/lang/String;Ls3/W0;)Ls3/W0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/K40;->u0(Ls3/W0;)V

    return-void
.end method

.method public final l(Ls3/i2;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t40;->i:Lcom/google/android/gms/internal/ads/l70;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/l70;->Q(Ls3/i2;)Lcom/google/android/gms/internal/ads/l70;

    return-void
.end method
