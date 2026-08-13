.class public final Lcom/google/android/gms/internal/ads/ky;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Nb;
.implements Lcom/google/android/gms/internal/ads/aD;
.implements Lu3/z;
.implements Lcom/google/android/gms/internal/ads/ZC;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/fy;

.field private final D:Lcom/google/android/gms/internal/ads/gy;

.field private final E:Ljava/util/Set;

.field private final F:Lcom/google/android/gms/internal/ads/Il;

.field private final G:Ljava/util/concurrent/Executor;

.field private final H:LV3/f;

.field private final I:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final J:Lcom/google/android/gms/internal/ads/jy;

.field private K:Z

.field private L:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Fl;Lcom/google/android/gms/internal/ads/gy;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/fy;LV3/f;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->E:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Lcom/google/android/gms/internal/ads/jy;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/jy;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->J:Lcom/google/android/gms/internal/ads/jy;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/ky;->K:Z

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->L:Ljava/lang/ref/WeakReference;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/ky;->C:Lcom/google/android/gms/internal/ads/fy;

    const-string p4, "google.afma.activeView.handleUpdate"

    sget-object v0, Lcom/google/android/gms/internal/ads/tl;->b:Lcom/google/android/gms/internal/ads/ql;

    invoke-virtual {p1, p4, v0, v0}, Lcom/google/android/gms/internal/ads/Fl;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/ol;Lcom/google/android/gms/internal/ads/nl;)Lcom/google/android/gms/internal/ads/Il;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ky;->F:Lcom/google/android/gms/internal/ads/Il;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ky;->D:Lcom/google/android/gms/internal/ads/gy;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ky;->G:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/ky;->H:LV3/f;

    return-void
.end method

.method private final e()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->E:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/Ot;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ky;->C:Lcom/google/android/gms/internal/ads/fy;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/fy;->f(Lcom/google/android/gms/internal/ads/Ot;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->C:Lcom/google/android/gms/internal/ads/fy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fy;->e()V

    return-void
.end method


# virtual methods
.method public final declared-synchronized L(Lcom/google/android/gms/internal/ads/Mb;)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->J:Lcom/google/android/gms/internal/ads/jy;

    iget-boolean v1, p1, Lcom/google/android/gms/internal/ads/Mb;->j:Z

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/jy;->a:Z

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/jy;->f:Lcom/google/android/gms/internal/ads/Mb;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ky;->a()V
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

.method public final T2()V
    .locals 0

    return-void
.end method

.method public final declared-synchronized a()V
    .locals 5

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->L:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ky;->K:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->J:Lcom/google/android/gms/internal/ads/jy;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ky;->H:LV3/f;

    invoke-interface {v1}, LV3/f;->c()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/jy;->d:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->D:Lcom/google/android/gms/internal/ads/gy;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ky;->J:Lcom/google/android/gms/internal/ads/jy;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/gy;->a(Lcom/google/android/gms/internal/ads/jy;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ky;->E:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/Ot;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ky;->G:Ljava/util/concurrent/Executor;

    new-instance v4, Lcom/google/android/gms/internal/ads/iy;

    invoke-direct {v4, v2, v0}, Lcom/google/android/gms/internal/ads/iy;-><init>(Lcom/google/android/gms/internal/ads/Ot;Lorg/json/JSONObject;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ky;->F:Lcom/google/android/gms/internal/ads/Il;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/Il;->c(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    const-string v1, "ActiveViewListener.callActiveViewJs"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/gr;->b(LP4/d;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    const-string v1, "Failed to call ActiveViewJS"

    invoke-static {v1, v0}, Lv3/q0;->l(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    monitor-exit p0

    return-void

    :cond_2
    :try_start_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ky;->d()V
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

.method public final declared-synchronized b(Lcom/google/android/gms/internal/ads/Ot;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->E:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->C:Lcom/google/android/gms/internal/ads/fy;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/fy;->d(Lcom/google/android/gms/internal/ads/Ot;)V
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

.method public final c(Ljava/lang/Object;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->L:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final declared-synchronized d()V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ky;->e()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ky;->K:Z
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

.method public final d2()V
    .locals 0

    return-void
.end method

.method public final declared-synchronized f3()V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->J:Lcom/google/android/gms/internal/ads/jy;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/jy;->b:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ky;->a()V
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

.method public final declared-synchronized g(Landroid/content/Context;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ky;->J:Lcom/google/android/gms/internal/ads/jy;

    const-string v0, "u"

    iput-object v0, p1, Lcom/google/android/gms/internal/ads/jy;->e:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ky;->a()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ky;->e()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/ky;->K:Z
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

.method public final declared-synchronized k(Landroid/content/Context;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ky;->J:Lcom/google/android/gms/internal/ads/jy;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/google/android/gms/internal/ads/jy;->b:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ky;->a()V
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

.method public final p4(I)V
    .locals 0

    return-void
.end method

.method public final q0()V
    .locals 0

    return-void
.end method

.method public final declared-synchronized r(Landroid/content/Context;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ky;->J:Lcom/google/android/gms/internal/ads/jy;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lcom/google/android/gms/internal/ads/jy;->b:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ky;->a()V
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

.method public final declared-synchronized t()V
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->C:Lcom/google/android/gms/internal/ads/fy;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/fy;->c(Lcom/google/android/gms/internal/ads/ky;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ky;->a()V
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

.method public final declared-synchronized y0()V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ky;->J:Lcom/google/android/gms/internal/ads/jy;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/jy;->b:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ky;->a()V
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
