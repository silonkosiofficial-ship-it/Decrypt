.class final Ll4/P;
.super Ll4/l;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Ll4/L;

.field private c:Z

.field private volatile d:Z

.field private e:Ljava/lang/Object;

.field private f:Ljava/lang/Exception;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ll4/l;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll4/P;->a:Ljava/lang/Object;

    new-instance v0, Ll4/L;

    invoke-direct {v0}, Ll4/L;-><init>()V

    iput-object v0, p0, Ll4/P;->b:Ll4/L;

    return-void
.end method

.method private final w()V
    .locals 2

    iget-boolean v0, p0, Ll4/P;->c:Z

    const-string v1, "Task is not yet complete"

    invoke-static {v0, v1}, LQ3/p;->p(ZLjava/lang/Object;)V

    return-void
.end method

.method private final x()V
    .locals 2

    .prologue
    iget-boolean v0, p0, Ll4/P;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Task is already canceled."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final y()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Ll4/P;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Ll4/d;->a(Ll4/l;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method private final z()V
    .locals 2

    .prologue
    iget-object v0, p0, Ll4/P;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ll4/P;->c:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Ll4/P;->b:Ll4/L;

    invoke-virtual {v0, p0}, Ll4/L;->b(Ll4/l;)V

    return-void

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/Executor;Ll4/e;)Ll4/l;
    .locals 1

    new-instance v0, Ll4/B;

    invoke-direct {v0, p1, p2}, Ll4/B;-><init>(Ljava/util/concurrent/Executor;Ll4/e;)V

    iget-object p1, p0, Ll4/P;->b:Ll4/L;

    invoke-virtual {p1, v0}, Ll4/L;->a(Ll4/K;)V

    invoke-direct {p0}, Ll4/P;->z()V

    return-object p0
.end method

.method public final b(Ljava/util/concurrent/Executor;Ll4/f;)Ll4/l;
    .locals 1

    new-instance v0, Ll4/D;

    invoke-direct {v0, p1, p2}, Ll4/D;-><init>(Ljava/util/concurrent/Executor;Ll4/f;)V

    iget-object p1, p0, Ll4/P;->b:Ll4/L;

    invoke-virtual {p1, v0}, Ll4/L;->a(Ll4/K;)V

    invoke-direct {p0}, Ll4/P;->z()V

    return-object p0
.end method

.method public final c(Ll4/f;)Ll4/l;
    .locals 2

    sget-object v0, Ll4/n;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Ll4/D;

    invoke-direct {v1, v0, p1}, Ll4/D;-><init>(Ljava/util/concurrent/Executor;Ll4/f;)V

    iget-object p1, p0, Ll4/P;->b:Ll4/L;

    invoke-virtual {p1, v1}, Ll4/L;->a(Ll4/K;)V

    invoke-direct {p0}, Ll4/P;->z()V

    return-object p0
.end method

.method public final d(Ljava/util/concurrent/Executor;Ll4/g;)Ll4/l;
    .locals 1

    new-instance v0, Ll4/F;

    invoke-direct {v0, p1, p2}, Ll4/F;-><init>(Ljava/util/concurrent/Executor;Ll4/g;)V

    iget-object p1, p0, Ll4/P;->b:Ll4/L;

    invoke-virtual {p1, v0}, Ll4/L;->a(Ll4/K;)V

    invoke-direct {p0}, Ll4/P;->z()V

    return-object p0
.end method

.method public final e(Ll4/g;)Ll4/l;
    .locals 1

    sget-object v0, Ll4/n;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Ll4/P;->d(Ljava/util/concurrent/Executor;Ll4/g;)Ll4/l;

    return-object p0
.end method

.method public final f(Ljava/util/concurrent/Executor;Ll4/h;)Ll4/l;
    .locals 1

    new-instance v0, Ll4/H;

    invoke-direct {v0, p1, p2}, Ll4/H;-><init>(Ljava/util/concurrent/Executor;Ll4/h;)V

    iget-object p1, p0, Ll4/P;->b:Ll4/L;

    invoke-virtual {p1, v0}, Ll4/L;->a(Ll4/K;)V

    invoke-direct {p0}, Ll4/P;->z()V

    return-object p0
.end method

.method public final g(Ll4/h;)Ll4/l;
    .locals 1

    sget-object v0, Ll4/n;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Ll4/P;->f(Ljava/util/concurrent/Executor;Ll4/h;)Ll4/l;

    return-object p0
.end method

.method public final h(Ljava/util/concurrent/Executor;Ll4/c;)Ll4/l;
    .locals 2

    new-instance v0, Ll4/P;

    invoke-direct {v0}, Ll4/P;-><init>()V

    new-instance v1, Ll4/x;

    invoke-direct {v1, p1, p2, v0}, Ll4/x;-><init>(Ljava/util/concurrent/Executor;Ll4/c;Ll4/P;)V

    iget-object p1, p0, Ll4/P;->b:Ll4/L;

    invoke-virtual {p1, v1}, Ll4/L;->a(Ll4/K;)V

    invoke-direct {p0}, Ll4/P;->z()V

    return-object v0
.end method

.method public final i(Ljava/util/concurrent/Executor;Ll4/c;)Ll4/l;
    .locals 2

    new-instance v0, Ll4/P;

    invoke-direct {v0}, Ll4/P;-><init>()V

    new-instance v1, Ll4/z;

    invoke-direct {v1, p1, p2, v0}, Ll4/z;-><init>(Ljava/util/concurrent/Executor;Ll4/c;Ll4/P;)V

    iget-object p1, p0, Ll4/P;->b:Ll4/L;

    invoke-virtual {p1, v1}, Ll4/L;->a(Ll4/K;)V

    invoke-direct {p0}, Ll4/P;->z()V

    return-object v0
.end method

.method public final j(Ll4/c;)Ll4/l;
    .locals 1

    sget-object v0, Ll4/n;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Ll4/l;->i(Ljava/util/concurrent/Executor;Ll4/c;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method public final k()Ljava/lang/Exception;
    .locals 2

    .prologue
    iget-object v0, p0, Ll4/P;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll4/P;->f:Ljava/lang/Exception;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final l()Ljava/lang/Object;
    .locals 3

    .prologue
    iget-object v0, p0, Ll4/P;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Ll4/P;->w()V

    invoke-direct {p0}, Ll4/P;->x()V

    iget-object v1, p0, Ll4/P;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    iget-object v1, p0, Ll4/P;->e:Ljava/lang/Object;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    new-instance v2, Ll4/j;

    invoke-direct {v2, v1}, Ll4/j;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Ll4/P;->d:Z

    return v0
.end method

.method public final n()Z
    .locals 2

    .prologue
    iget-object v0, p0, Ll4/P;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ll4/P;->c:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final o()Z
    .locals 3

    .prologue
    iget-object v0, p0, Ll4/P;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ll4/P;->c:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Ll4/P;->d:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Ll4/P;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return v2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final p(Ljava/util/concurrent/Executor;Ll4/k;)Ll4/l;
    .locals 2

    new-instance v0, Ll4/P;

    invoke-direct {v0}, Ll4/P;-><init>()V

    new-instance v1, Ll4/J;

    invoke-direct {v1, p1, p2, v0}, Ll4/J;-><init>(Ljava/util/concurrent/Executor;Ll4/k;Ll4/P;)V

    iget-object p1, p0, Ll4/P;->b:Ll4/L;

    invoke-virtual {p1, v1}, Ll4/L;->a(Ll4/K;)V

    invoke-direct {p0}, Ll4/P;->z()V

    return-object v0
.end method

.method public final q(Ll4/k;)Ll4/l;
    .locals 3

    sget-object v0, Ll4/n;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Ll4/P;

    invoke-direct {v1}, Ll4/P;-><init>()V

    new-instance v2, Ll4/J;

    invoke-direct {v2, v0, p1, v1}, Ll4/J;-><init>(Ljava/util/concurrent/Executor;Ll4/k;Ll4/P;)V

    iget-object p1, p0, Ll4/P;->b:Ll4/L;

    invoke-virtual {p1, v2}, Ll4/L;->a(Ll4/K;)V

    invoke-direct {p0}, Ll4/P;->z()V

    return-object v1
.end method

.method public final r(Ljava/lang/Exception;)V
    .locals 2

    .prologue
    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ll4/P;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Ll4/P;->y()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Ll4/P;->c:Z

    iput-object p1, p0, Ll4/P;->f:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Ll4/P;->b:Ll4/L;

    invoke-virtual {p1, p0}, Ll4/L;->b(Ll4/l;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final s(Ljava/lang/Object;)V
    .locals 2

    .prologue
    iget-object v0, p0, Ll4/P;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Ll4/P;->y()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Ll4/P;->c:Z

    iput-object p1, p0, Ll4/P;->e:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Ll4/P;->b:Ll4/L;

    invoke-virtual {p1, p0}, Ll4/L;->b(Ll4/l;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final t()Z
    .locals 2

    .prologue
    iget-object v0, p0, Ll4/P;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ll4/P;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Ll4/P;->c:Z

    iput-boolean v1, p0, Ll4/P;->d:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Ll4/P;->b:Ll4/L;

    invoke-virtual {v0, p0}, Ll4/L;->b(Ll4/l;)V

    return v1

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final u(Ljava/lang/Exception;)Z
    .locals 2

    .prologue
    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ll4/P;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ll4/P;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Ll4/P;->c:Z

    iput-object p1, p0, Ll4/P;->f:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Ll4/P;->b:Ll4/L;

    invoke-virtual {p1, p0}, Ll4/L;->b(Ll4/l;)V

    return v1

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final v(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    iget-object v0, p0, Ll4/P;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ll4/P;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Ll4/P;->c:Z

    iput-object p1, p0, Ll4/P;->e:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Ll4/P;->b:Ll4/L;

    invoke-virtual {p1, p0}, Ll4/L;->b(Ll4/l;)V

    return v1

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
