.class public LJ2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ2/b;
.implements LP2/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ2/d$a;
    }
.end annotation


# static fields
.field private static final N:Ljava/lang/String;


# instance fields
.field private C:Landroid/os/PowerManager$WakeLock;

.field private D:Landroid/content/Context;

.field private E:Landroidx/work/a;

.field private F:LS2/a;

.field private G:Landroidx/work/impl/WorkDatabase;

.field private H:Ljava/util/Map;

.field private I:Ljava/util/Map;

.field private J:Ljava/util/List;

.field private K:Ljava/util/Set;

.field private final L:Ljava/util/List;

.field private final M:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "Processor"

    invoke-static {v0}, LI2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LJ2/d;->N:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;LS2/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ2/d;->D:Landroid/content/Context;

    iput-object p2, p0, LJ2/d;->E:Landroidx/work/a;

    iput-object p3, p0, LJ2/d;->F:LS2/a;

    iput-object p4, p0, LJ2/d;->G:Landroidx/work/impl/WorkDatabase;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LJ2/d;->I:Ljava/util/Map;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LJ2/d;->H:Ljava/util/Map;

    iput-object p5, p0, LJ2/d;->J:Ljava/util/List;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, LJ2/d;->K:Ljava/util/Set;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LJ2/d;->L:Ljava/util/List;

    const/4 p1, 0x0

    iput-object p1, p0, LJ2/d;->C:Landroid/os/PowerManager$WakeLock;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ2/d;->M:Ljava/lang/Object;

    return-void
.end method

.method private static e(Ljava/lang/String;LJ2/k;)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LJ2/k;->d()V

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object p1

    sget-object v2, LJ2/d;->N:Ljava/lang/String;

    const-string v3, "WorkerWrapper interrupted for %s"

    new-array v4, v0, [Ljava/lang/Object;

    aput-object p0, v4, v1

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-array v1, v1, [Ljava/lang/Throwable;

    invoke-virtual {p1, v2, p0, v1}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    return v0

    :cond_0
    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object p1

    sget-object v2, LJ2/d;->N:Ljava/lang/String;

    const-string v3, "WorkerWrapper could not be found for %s"

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p0, v0, v1

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-array v0, v1, [Ljava/lang/Throwable;

    invoke-virtual {p1, v2, p0, v0}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    return v1
.end method

.method private m()V
    .locals 7

    .prologue
    const/4 v0, 0x1

    iget-object v1, p0, LJ2/d;->M:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, LJ2/d;->H:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v0

    if-nez v2, :cond_0

    iget-object v2, p0, LJ2/d;->D:Landroid/content/Context;

    invoke-static {v2}, Landroidx/work/impl/foreground/a;->e(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v3, p0, LJ2/d;->D:Landroid/content/Context;

    invoke-virtual {v3, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    :try_start_2
    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v3

    sget-object v4, LJ2/d;->N:Ljava/lang/String;

    const-string v5, "Unable to stop foreground service"

    new-array v0, v0, [Ljava/lang/Throwable;

    const/4 v6, 0x0

    aput-object v2, v0, v6

    invoke-virtual {v3, v4, v5, v0}, LI2/j;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, p0, LJ2/d;->C:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, LJ2/d;->C:Landroid/os/PowerManager$WakeLock;

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_1
    monitor-exit v1

    return-void

    :goto_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method


# virtual methods
.method public a(Ljava/lang/String;LI2/e;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    iget-object v1, p0, LJ2/d;->M:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v2

    sget-object v3, LJ2/d;->N:Ljava/lang/String;

    const-string v4, "Moving WorkSpec (%s) to the foreground"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p1, v5, v0

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-array v0, v0, [Ljava/lang/Throwable;

    invoke-virtual {v2, v3, v4, v0}, LI2/j;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v0, p0, LJ2/d;->I:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ2/k;

    if-eqz v0, :cond_1

    iget-object v2, p0, LJ2/d;->C:Landroid/os/PowerManager$WakeLock;

    if-nez v2, :cond_0

    iget-object v2, p0, LJ2/d;->D:Landroid/content/Context;

    const-string v3, "ProcessorForegroundLck"

    invoke-static {v2, v3}, LR2/n;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v2

    iput-object v2, p0, LJ2/d;->C:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->acquire()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v2, p0, LJ2/d;->H:Ljava/util/Map;

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LJ2/d;->D:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Landroidx/work/impl/foreground/a;->d(Landroid/content/Context;Ljava/lang/String;LI2/e;)Landroid/content/Intent;

    move-result-object p1

    iget-object p2, p0, LJ2/d;->D:Landroid/content/Context;

    invoke-static {p2, p1}, Landroidx/core/content/a;->k(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_1
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .prologue
    iget-object v0, p0, LJ2/d;->M:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LJ2/d;->H:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, LJ2/d;->m()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c(Ljava/lang/String;Z)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    iget-object v1, p0, LJ2/d;->M:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, LJ2/d;->I:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v2

    sget-object v3, LJ2/d;->N:Ljava/lang/String;

    const-string v4, "%s %s executed; reschedule = %s"

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v5, v7, v0

    const/4 v5, 0x1

    aput-object p1, v7, v5

    const/4 v5, 0x2

    aput-object v6, v7, v5

    invoke-static {v4, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-array v0, v0, [Ljava/lang/Throwable;

    invoke-virtual {v2, v3, v4, v0}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v0, p0, LJ2/d;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJ2/b;

    invoke-interface {v2, p1, p2}, LJ2/b;->c(Ljava/lang/String;Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public d(LJ2/b;)V
    .locals 2

    .prologue
    iget-object v0, p0, LJ2/d;->M:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LJ2/d;->L:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public f(Ljava/lang/String;)Z
    .locals 2

    .prologue
    iget-object v0, p0, LJ2/d;->M:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LJ2/d;->K:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public g(Ljava/lang/String;)Z
    .locals 2

    .prologue
    iget-object v0, p0, LJ2/d;->M:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LJ2/d;->I:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, LJ2/d;->H:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    monitor-exit v0

    return p1

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public h(Ljava/lang/String;)Z
    .locals 2

    .prologue
    iget-object v0, p0, LJ2/d;->M:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LJ2/d;->H:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public i(LJ2/b;)V
    .locals 2

    .prologue
    iget-object v0, p0, LJ2/d;->M:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LJ2/d;->L:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public j(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LJ2/d;->k(Ljava/lang/String;Landroidx/work/WorkerParameters$a;)Z

    move-result p1

    return p1
.end method

.method public k(Ljava/lang/String;Landroidx/work/WorkerParameters$a;)Z
    .locals 11

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, LJ2/d;->M:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    invoke-virtual {p0, p1}, LJ2/d;->g(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object p2

    sget-object v3, LJ2/d;->N:Ljava/lang/String;

    const-string v4, "Work %s is already enqueued for processing"

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Throwable;

    invoke-virtual {p2, v3, p1, v0}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    monitor-exit v2

    return v1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance v10, LJ2/k$c;

    iget-object v4, p0, LJ2/d;->D:Landroid/content/Context;

    iget-object v5, p0, LJ2/d;->E:Landroidx/work/a;

    iget-object v6, p0, LJ2/d;->F:LS2/a;

    iget-object v8, p0, LJ2/d;->G:Landroidx/work/impl/WorkDatabase;

    move-object v3, v10

    move-object v7, p0

    move-object v9, p1

    invoke-direct/range {v3 .. v9}, LJ2/k$c;-><init>(Landroid/content/Context;Landroidx/work/a;LS2/a;LP2/a;Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V

    iget-object v3, p0, LJ2/d;->J:Ljava/util/List;

    invoke-virtual {v10, v3}, LJ2/k$c;->c(Ljava/util/List;)LJ2/k$c;

    move-result-object v3

    invoke-virtual {v3, p2}, LJ2/k$c;->b(Landroidx/work/WorkerParameters$a;)LJ2/k$c;

    move-result-object p2

    invoke-virtual {p2}, LJ2/k$c;->a()LJ2/k;

    move-result-object p2

    invoke-virtual {p2}, LJ2/k;->b()LP4/d;

    move-result-object v3

    new-instance v4, LJ2/d$a;

    invoke-direct {v4, p0, p1, v3}, LJ2/d$a;-><init>(LJ2/b;Ljava/lang/String;LP4/d;)V

    iget-object v5, p0, LJ2/d;->F:LS2/a;

    invoke-interface {v5}, LS2/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v5

    invoke-interface {v3, v4, v5}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object v3, p0, LJ2/d;->I:Ljava/util/Map;

    invoke-interface {v3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, LJ2/d;->F:LS2/a;

    invoke-interface {v2}, LS2/a;->c()LR2/k;

    move-result-object v2

    invoke-virtual {v2, p2}, LR2/k;->execute(Ljava/lang/Runnable;)V

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object p2

    sget-object v2, LJ2/d;->N:Ljava/lang/String;

    const-string v3, "%s: processing %s"

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v4, v5, v1

    aput-object p1, v5, v0

    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Ljava/lang/Throwable;

    invoke-virtual {p2, v2, p1, v1}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    return v0

    :goto_0
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public l(Ljava/lang/String;)Z
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p0, LJ2/d;->M:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v3

    sget-object v4, LJ2/d;->N:Ljava/lang/String;

    const-string v5, "Processor cancelling %s"

    new-array v6, v1, [Ljava/lang/Object;

    aput-object p1, v6, v0

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-array v6, v0, [Ljava/lang/Throwable;

    invoke-virtual {v3, v4, v5, v6}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v3, p0, LJ2/d;->K:Ljava/util/Set;

    invoke-interface {v3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, LJ2/d;->H:Ljava/util/Map;

    invoke-interface {v3, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJ2/k;

    if-eqz v3, :cond_0

    move v0, v1

    :cond_0
    if-nez v3, :cond_1

    iget-object v1, p0, LJ2/d;->I:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LJ2/k;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {p1, v3}, LJ2/d;->e(Ljava/lang/String;LJ2/k;)Z

    move-result p1

    if-eqz v0, :cond_2

    invoke-direct {p0}, LJ2/d;->m()V

    :cond_2
    monitor-exit v2

    return p1

    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public n(Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    iget-object v1, p0, LJ2/d;->M:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v2

    sget-object v3, LJ2/d;->N:Ljava/lang/String;

    const-string v4, "Processor stopping foreground work %s"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p1, v5, v0

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-array v0, v0, [Ljava/lang/Throwable;

    invoke-virtual {v2, v3, v4, v0}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v0, p0, LJ2/d;->H:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ2/k;

    invoke-static {p1, v0}, LJ2/d;->e(Ljava/lang/String;LJ2/k;)Z

    move-result p1

    monitor-exit v1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public o(Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    iget-object v1, p0, LJ2/d;->M:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object v2

    sget-object v3, LJ2/d;->N:Ljava/lang/String;

    const-string v4, "Processor stopping background work %s"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p1, v5, v0

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-array v0, v0, [Ljava/lang/Throwable;

    invoke-virtual {v2, v3, v4, v0}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v0, p0, LJ2/d;->I:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ2/k;

    invoke-static {p1, v0}, LJ2/d;->e(Ljava/lang/String;LJ2/k;)Z

    move-result p1

    monitor-exit v1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
