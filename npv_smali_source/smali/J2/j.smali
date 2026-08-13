.class public LJ2/j;
.super LI2/t;
.source "SourceFile"


# static fields
.field private static final j:Ljava/lang/String;

.field private static k:LJ2/j;

.field private static l:LJ2/j;

.field private static final m:Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroidx/work/a;

.field private c:Landroidx/work/impl/WorkDatabase;

.field private d:LS2/a;

.field private e:Ljava/util/List;

.field private f:LJ2/d;

.field private g:LR2/h;

.field private h:Z

.field private i:Landroid/content/BroadcastReceiver$PendingResult;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkManagerImpl"

    invoke-static {v0}, LI2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LJ2/j;->j:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, LJ2/j;->k:LJ2/j;

    sput-object v0, LJ2/j;->l:LJ2/j;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LJ2/j;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;LS2/a;)V
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LI2/p;->a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    invoke-direct {p0, p1, p2, p3, v0}, LJ2/j;-><init>(Landroid/content/Context;Landroidx/work/a;LS2/a;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;LS2/a;Landroidx/work/impl/WorkDatabase;)V
    .locals 10

    invoke-direct {p0}, LI2/t;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, LI2/j$a;

    invoke-virtual {p2}, Landroidx/work/a;->j()I

    move-result v2

    invoke-direct {v1, v2}, LI2/j$a;-><init>(I)V

    invoke-static {v1}, LI2/j;->e(LI2/j;)V

    invoke-virtual {p0, v0, p2, p3}, LJ2/j;->g(Landroid/content/Context;Landroidx/work/a;LS2/a;)Ljava/util/List;

    move-result-object v0

    new-instance v9, LJ2/d;

    move-object v3, v9

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object v8, v0

    invoke-direct/range {v3 .. v8}, LJ2/d;-><init>(Landroid/content/Context;Landroidx/work/a;LS2/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    move-object v3, p0

    invoke-direct/range {v3 .. v9}, LJ2/j;->q(Landroid/content/Context;Landroidx/work/a;LS2/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;LJ2/d;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;LS2/a;Z)V
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-interface {p3}, LS2/a;->c()LR2/k;

    move-result-object v1

    invoke-static {v0, v1, p4}, Landroidx/work/impl/WorkDatabase;->P(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Landroidx/work/impl/WorkDatabase;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, LJ2/j;-><init>(Landroid/content/Context;Landroidx/work/a;LS2/a;Landroidx/work/impl/WorkDatabase;)V

    return-void
.end method

.method public static e(Landroid/content/Context;Landroidx/work/a;)V
    .locals 4

    .prologue
    sget-object v0, LJ2/j;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LJ2/j;->k:LJ2/j;

    if-eqz v1, :cond_1

    sget-object v2, LJ2/j;->l:LJ2/j;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    if-nez v1, :cond_3

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sget-object v1, LJ2/j;->l:LJ2/j;

    if-nez v1, :cond_2

    new-instance v1, LJ2/j;

    new-instance v2, LS2/b;

    invoke-virtual {p1}, Landroidx/work/a;->l()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-direct {v2, v3}, LS2/b;-><init>(Ljava/util/concurrent/Executor;)V

    invoke-direct {v1, p0, p1, v2}, LJ2/j;-><init>(Landroid/content/Context;Landroidx/work/a;LS2/a;)V

    sput-object v1, LJ2/j;->l:LJ2/j;

    :cond_2
    sget-object p0, LJ2/j;->l:LJ2/j;

    sput-object p0, LJ2/j;->k:LJ2/j;

    :cond_3
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static j()LJ2/j;
    .locals 2

    .prologue
    sget-object v0, LJ2/j;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LJ2/j;->k:LJ2/j;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    sget-object v1, LJ2/j;->l:LJ2/j;

    monitor-exit v0

    return-object v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static k(Landroid/content/Context;)LJ2/j;
    .locals 2

    .prologue
    sget-object v0, LJ2/j;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, LJ2/j;->j()LJ2/j;

    move-result-object v1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private q(Landroid/content/Context;Landroidx/work/a;LS2/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;LJ2/d;)V
    .locals 0

    .prologue
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LJ2/j;->a:Landroid/content/Context;

    iput-object p2, p0, LJ2/j;->b:Landroidx/work/a;

    iput-object p3, p0, LJ2/j;->d:LS2/a;

    iput-object p4, p0, LJ2/j;->c:Landroidx/work/impl/WorkDatabase;

    iput-object p5, p0, LJ2/j;->e:Ljava/util/List;

    iput-object p6, p0, LJ2/j;->f:LJ2/d;

    new-instance p2, LR2/h;

    invoke-direct {p2, p4}, LR2/h;-><init>(Landroidx/work/impl/WorkDatabase;)V

    iput-object p2, p0, LJ2/j;->g:LR2/h;

    const/4 p2, 0x0

    iput-boolean p2, p0, LJ2/j;->h:Z

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x18

    if-lt p2, p3, :cond_1

    invoke-static {p1}, LJ2/i;->a(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot initialize WorkManager in direct boot mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object p2, p0, LJ2/j;->d:LS2/a;

    new-instance p3, Landroidx/work/impl/utils/ForceStopRunnable;

    invoke-direct {p3, p1, p0}, Landroidx/work/impl/utils/ForceStopRunnable;-><init>(Landroid/content/Context;LJ2/j;)V

    invoke-interface {p2, p3}, LS2/a;->b(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)LI2/m;
    .locals 1

    invoke-static {p1, p0}, LR2/a;->d(Ljava/lang/String;LJ2/j;)LR2/a;

    move-result-object p1

    iget-object v0, p0, LJ2/j;->d:LS2/a;

    invoke-interface {v0, p1}, LS2/a;->b(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, LR2/a;->e()LI2/m;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/util/List;)LI2/m;
    .locals 1

    .prologue
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LJ2/g;

    invoke-direct {v0, p0, p1}, LJ2/g;-><init>(LJ2/j;Ljava/util/List;)V

    invoke-virtual {v0}, LJ2/g;->a()LI2/m;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "enqueue needs at least one WorkRequest."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Ljava/util/UUID;)LI2/m;
    .locals 1

    invoke-static {p1, p0}, LR2/a;->b(Ljava/util/UUID;LJ2/j;)LR2/a;

    move-result-object p1

    iget-object v0, p0, LJ2/j;->d:LS2/a;

    invoke-interface {v0, p1}, LS2/a;->b(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, LR2/a;->e()LI2/m;

    move-result-object p1

    return-object p1
.end method

.method public g(Landroid/content/Context;Landroidx/work/a;LS2/a;)Ljava/util/List;
    .locals 2

    invoke-static {p1, p0}, LJ2/f;->a(Landroid/content/Context;LJ2/j;)LJ2/e;

    move-result-object v0

    new-instance v1, LK2/b;

    invoke-direct {v1, p1, p2, p3, p0}, LK2/b;-><init>(Landroid/content/Context;Landroidx/work/a;LS2/a;LJ2/j;)V

    const/4 p1, 0x2

    new-array p1, p1, [LJ2/e;

    const/4 p2, 0x0

    aput-object v0, p1, p2

    const/4 p2, 0x1

    aput-object v1, p1, p2

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public h()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, LJ2/j;->a:Landroid/content/Context;

    return-object v0
.end method

.method public i()Landroidx/work/a;
    .locals 1

    iget-object v0, p0, LJ2/j;->b:Landroidx/work/a;

    return-object v0
.end method

.method public l()LR2/h;
    .locals 1

    iget-object v0, p0, LJ2/j;->g:LR2/h;

    return-object v0
.end method

.method public m()LJ2/d;
    .locals 1

    iget-object v0, p0, LJ2/j;->f:LJ2/d;

    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LJ2/j;->e:Ljava/util/List;

    return-object v0
.end method

.method public o()Landroidx/work/impl/WorkDatabase;
    .locals 1

    iget-object v0, p0, LJ2/j;->c:Landroidx/work/impl/WorkDatabase;

    return-object v0
.end method

.method public p()LS2/a;
    .locals 1

    iget-object v0, p0, LJ2/j;->d:LS2/a;

    return-object v0
.end method

.method public r()V
    .locals 2

    .prologue
    sget-object v0, LJ2/j;->m:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, LJ2/j;->h:Z

    iget-object v1, p0, LJ2/j;->i:Landroid/content/BroadcastReceiver$PendingResult;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 v1, 0x0

    iput-object v1, p0, LJ2/j;->i:Landroid/content/BroadcastReceiver$PendingResult;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public s()V
    .locals 3

    invoke-virtual {p0}, LJ2/j;->h()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LL2/l;->b(Landroid/content/Context;)V

    invoke-virtual {p0}, LJ2/j;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->Y()LQ2/q;

    move-result-object v0

    invoke-interface {v0}, LQ2/q;->u()I

    invoke-virtual {p0}, LJ2/j;->i()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {p0}, LJ2/j;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {p0}, LJ2/j;->n()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v1, v2}, LJ2/f;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void
.end method

.method public t(Landroid/content/BroadcastReceiver$PendingResult;)V
    .locals 2

    .prologue
    sget-object v0, LJ2/j;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, LJ2/j;->i:Landroid/content/BroadcastReceiver$PendingResult;

    iget-boolean v1, p0, LJ2/j;->h:Z

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 p1, 0x0

    iput-object p1, p0, LJ2/j;->i:Landroid/content/BroadcastReceiver$PendingResult;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public u(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LJ2/j;->v(Ljava/lang/String;Landroidx/work/WorkerParameters$a;)V

    return-void
.end method

.method public v(Ljava/lang/String;Landroidx/work/WorkerParameters$a;)V
    .locals 2

    iget-object v0, p0, LJ2/j;->d:LS2/a;

    new-instance v1, LR2/l;

    invoke-direct {v1, p0, p1, p2}, LR2/l;-><init>(LJ2/j;Ljava/lang/String;Landroidx/work/WorkerParameters$a;)V

    invoke-interface {v0, v1}, LS2/a;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public w(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LJ2/j;->d:LS2/a;

    new-instance v1, LR2/m;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, LR2/m;-><init>(LJ2/j;Ljava/lang/String;Z)V

    invoke-interface {v0, v1}, LS2/a;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public x(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LJ2/j;->d:LS2/a;

    new-instance v1, LR2/m;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, LR2/m;-><init>(LJ2/j;Ljava/lang/String;Z)V

    invoke-interface {v0, v1}, LS2/a;->b(Ljava/lang/Runnable;)V

    return-void
.end method
