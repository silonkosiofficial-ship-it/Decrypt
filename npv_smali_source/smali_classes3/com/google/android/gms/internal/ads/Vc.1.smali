.class public final Lcom/google/android/gms/internal/ads/Vc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/concurrent/ScheduledFuture;

.field private final b:Ljava/lang/Runnable;

.field private final c:Ljava/lang/Object;

.field private d:Lcom/google/android/gms/internal/ads/Yc;

.field private e:Landroid/content/Context;

.field private f:Lcom/google/android/gms/internal/ads/bd;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Vc;->a:Ljava/util/concurrent/ScheduledFuture;

    new-instance v0, Lcom/google/android/gms/internal/ads/Rc;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/Rc;-><init>(Lcom/google/android/gms/internal/ads/Vc;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Vc;->b:Ljava/lang/Runnable;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Vc;->c:Ljava/lang/Object;

    return-void
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/Vc;)Lcom/google/android/gms/internal/ads/Yc;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Vc;->d:Lcom/google/android/gms/internal/ads/Yc;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/Vc;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Vc;->c:Ljava/lang/Object;

    return-object p0
.end method

.method static bridge synthetic f(Lcom/google/android/gms/internal/ads/Vc;Lcom/google/android/gms/internal/ads/Yc;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Vc;->d:Lcom/google/android/gms/internal/ads/Yc;

    return-void
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/ads/Vc;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Vc;->l()V

    return-void
.end method

.method static bridge synthetic h(Lcom/google/android/gms/internal/ads/Vc;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Vc;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->d:Lcom/google/android/gms/internal/ads/Yc;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, LQ3/c;->j()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->d:Lcom/google/android/gms/internal/ads/Yc;

    invoke-virtual {v1}, LQ3/c;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->d:Lcom/google/android/gms/internal/ads/Yc;

    invoke-virtual {v1}, LQ3/c;->h()V

    :cond_2
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->d:Lcom/google/android/gms/internal/ads/Yc;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->f:Lcom/google/android/gms/internal/ads/bd;

    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method static bridge synthetic k(Lcom/google/android/gms/internal/ads/Vc;Lcom/google/android/gms/internal/ads/bd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Vc;->f:Lcom/google/android/gms/internal/ads/bd;

    return-void
.end method

.method private final l()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Vc;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->e:Landroid/content/Context;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->d:Lcom/google/android/gms/internal/ads/Yc;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/Tc;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/Tc;-><init>(Lcom/google/android/gms/internal/ads/Vc;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/Uc;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/Uc;-><init>(Lcom/google/android/gms/internal/ads/Vc;)V

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/ads/Vc;->d(LQ3/c$a;LQ3/c$b;)Lcom/google/android/gms/internal/ads/Yc;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->d:Lcom/google/android/gms/internal/ads/Yc;

    invoke-virtual {v1}, LQ3/c;->q()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/Zc;)J
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Vc;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->f:Lcom/google/android/gms/internal/ads/bd;

    const-wide/16 v2, -0x2

    if-nez v1, :cond_0

    monitor-exit v0

    return-wide v2

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->d:Lcom/google/android/gms/internal/ads/Yc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Yc;->j0()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->f:Lcom/google/android/gms/internal/ads/bd;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/bd;->d2(Lcom/google/android/gms/internal/ads/Zc;)J

    move-result-wide v1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    return-wide v1

    :catch_0
    move-exception p1

    const-string v1, "Unable to call into cache service."

    invoke-static {v1, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    monitor-exit v0

    return-wide v2

    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/Zc;)Lcom/google/android/gms/internal/ads/Wc;
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Vc;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->f:Lcom/google/android/gms/internal/ads/bd;

    if-nez v1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/Wc;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/Wc;-><init>()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->d:Lcom/google/android/gms/internal/ads/Yc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Yc;->j0()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->f:Lcom/google/android/gms/internal/ads/bd;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/bd;->f3(Lcom/google/android/gms/internal/ads/Zc;)Lcom/google/android/gms/internal/ads/Wc;

    move-result-object p1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->f:Lcom/google/android/gms/internal/ads/bd;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/bd;->T2(Lcom/google/android/gms/internal/ads/Zc;)Lcom/google/android/gms/internal/ads/Wc;

    move-result-object p1
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit v0

    return-object p1

    :goto_0
    const-string v1, "Unable to call into cache service."

    invoke-static {v1, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/Wc;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/Wc;-><init>()V

    monitor-exit v0

    return-object p1

    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method protected final declared-synchronized d(LQ3/c$a;LQ3/c$b;)Lcom/google/android/gms/internal/ads/Yc;
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/Yc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->e:Landroid/content/Context;

    invoke-static {}, Lr3/v;->x()Lv3/W;

    move-result-object v2

    invoke-virtual {v2}, Lv3/W;->b()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/google/android/gms/internal/ads/Yc;-><init>(Landroid/content/Context;Landroid/os/Looper;LQ3/c$a;LQ3/c$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final i(Landroid/content/Context;)V
    .locals 2

    .prologue
    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Vc;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->e:Landroid/content/Context;

    if-eqz v1, :cond_1

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Vc;->e:Landroid/content/Context;

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->m4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Vc;->l()V

    goto :goto_0

    :cond_2
    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->l4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lcom/google/android/gms/internal/ads/Sc;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/Sc;-><init>(Lcom/google/android/gms/internal/ads/Vc;)V

    invoke-static {}, Lr3/v;->e()Lcom/google/android/gms/internal/ads/hc;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/hc;->c(Lcom/google/android/gms/internal/ads/gc;)V

    :cond_3
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final j()V
    .locals 6

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->n4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Vc;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Vc;->l()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->a:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/ads/dr;->d:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Vc;->b:Ljava/lang/Runnable;

    sget-object v3, Lcom/google/android/gms/internal/ads/Af;->o4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/Vc;->a:Ljava/util/concurrent/ScheduledFuture;

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    return-void
.end method
