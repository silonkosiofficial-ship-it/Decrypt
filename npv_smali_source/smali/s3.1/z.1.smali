.class public abstract Ls3/z;
.super Lk3/d;
.source "SourceFile"


# instance fields
.field private final C:Ljava/lang/Object;

.field private D:Lk3/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lk3/d;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ls3/z;->C:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e()V
    .locals 2

    .prologue
    iget-object v0, p0, Ls3/z;->C:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls3/z;->D:Lk3/d;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lk3/d;->e()V

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

.method public final e0()V
    .locals 2

    .prologue
    iget-object v0, p0, Ls3/z;->C:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls3/z;->D:Lk3/d;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lk3/d;->e0()V

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

.method public g(Lk3/m;)V
    .locals 2

    .prologue
    iget-object v0, p0, Ls3/z;->C:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls3/z;->D:Lk3/d;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lk3/d;->g(Lk3/m;)V

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

.method public final i()V
    .locals 2

    .prologue
    iget-object v0, p0, Ls3/z;->C:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls3/z;->D:Lk3/d;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lk3/d;->i()V

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

.method public k()V
    .locals 2

    .prologue
    iget-object v0, p0, Ls3/z;->C:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls3/z;->D:Lk3/d;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lk3/d;->k()V

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

.method public final p()V
    .locals 2

    .prologue
    iget-object v0, p0, Ls3/z;->C:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls3/z;->D:Lk3/d;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lk3/d;->p()V

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

.method public final r(Lk3/d;)V
    .locals 1

    .prologue
    iget-object v0, p0, Ls3/z;->C:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Ls3/z;->D:Lk3/d;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
