.class public final Lcom/google/android/gms/internal/ads/E80;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/x80;

.field private final b:LP4/d;

.field private c:Z

.field private d:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/b80;Lcom/google/android/gms/internal/ads/w80;Lcom/google/android/gms/internal/ads/x80;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/E80;->c:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/E80;->d:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/E80;->a:Lcom/google/android/gms/internal/ads/x80;

    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/w80;->a(Lcom/google/android/gms/internal/ads/x80;)LP4/d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/C80;

    invoke-direct {v1, p0, p2, p1, p3}, Lcom/google/android/gms/internal/ads/C80;-><init>(Lcom/google/android/gms/internal/ads/E80;Lcom/google/android/gms/internal/ads/w80;Lcom/google/android/gms/internal/ads/b80;Lcom/google/android/gms/internal/ads/x80;)V

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/x80;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/D80;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/D80;-><init>(Lcom/google/android/gms/internal/ads/E80;Lcom/google/android/gms/internal/ads/w80;)V

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/x80;->b()Ljava/util/concurrent/Executor;

    move-result-object p2

    const-class p3, Ljava/lang/Exception;

    invoke-static {p1, p3, v0, p2}, Lcom/google/android/gms/internal/ads/Nk0;->f(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/E80;->b:LP4/d;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/x80;)LP4/d;
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/E80;->d:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/E80;->c:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/E80;->a:Lcom/google/android/gms/internal/ads/x80;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/x80;->a()Lcom/google/android/gms/internal/ads/m80;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/x80;->a()Lcom/google/android/gms/internal/ads/m80;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/E80;->a:Lcom/google/android/gms/internal/ads/x80;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/x80;->a()Lcom/google/android/gms/internal/ads/m80;

    move-result-object v0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/x80;->a()Lcom/google/android/gms/internal/ads/m80;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/E80;->c:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/E80;->b:LP4/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method final synthetic b(Lcom/google/android/gms/internal/ads/w80;Lcom/google/android/gms/internal/ads/b80;Lcom/google/android/gms/internal/ads/x80;Lcom/google/android/gms/internal/ads/l80;)LP4/d;
    .locals 1

    .prologue
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/E80;->d:Z

    invoke-interface {p1, p4}, Lcom/google/android/gms/internal/ads/w80;->b(Lcom/google/android/gms/internal/ads/l80;)V

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/E80;->c:Z

    if-nez p1, :cond_0

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/x80;->a()Lcom/google/android/gms/internal/ads/m80;

    move-result-object p1

    invoke-interface {p2, p1, p4}, Lcom/google/android/gms/internal/ads/b80;->e(Lcom/google/android/gms/internal/ads/m80;Lcom/google/android/gms/internal/ads/l80;)Z

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/v80;

    invoke-direct {p1, p4, p3}, Lcom/google/android/gms/internal/ads/v80;-><init>(Lcom/google/android/gms/internal/ads/l80;Lcom/google/android/gms/internal/ads/x80;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    monitor-exit p0

    return-object p1

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method final synthetic c(Lcom/google/android/gms/internal/ads/w80;Ljava/lang/Exception;)LP4/d;
    .locals 0

    .prologue
    monitor-enter p0

    const/4 p1, 0x1

    :try_start_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/E80;->d:Z

    throw p2

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final declared-synchronized d(Lcom/google/android/gms/internal/ads/Jk0;)V
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/B80;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/B80;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/E80;->a:Lcom/google/android/gms/internal/ads/x80;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/x80;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/E80;->b:LP4/d;

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/E80;->a:Lcom/google/android/gms/internal/ads/x80;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/x80;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V
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
