.class public final Lcom/google/android/gms/internal/ads/qR;
.super Lcom/google/android/gms/internal/ads/kR;
.source "SourceFile"


# instance fields
.field private g:Ljava/lang/String;

.field private h:I


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/kR;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/qR;->h:I

    invoke-static {}, Lr3/v;->x()Lv3/W;

    move-result-object v0

    invoke-virtual {v0}, Lv3/W;->b()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/to;

    invoke-direct {v1, p1, v0, p0, p0}, Lcom/google/android/gms/internal/ads/to;-><init>(Landroid/content/Context;Landroid/os/Looper;LQ3/c$a;LQ3/c$b;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/kR;->f:Lcom/google/android/gms/internal/ads/to;

    return-void
.end method


# virtual methods
.method public final L0(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/kR;->b:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/kR;->d:Z

    if-nez v0, :cond_4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/kR;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget v1, p0, Lcom/google/android/gms/internal/ads/qR;->h:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kR;->f:Lcom/google/android/gms/internal/ads/to;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/to;->j0()Lcom/google/android/gms/internal/ads/Co;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kR;->e:Lcom/google/android/gms/internal/ads/Po;

    sget-object v3, Lcom/google/android/gms/internal/ads/Af;->Nc:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Lcom/google/android/gms/internal/ads/jR;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/kR;->a:Lcom/google/android/gms/internal/ads/mr;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/kR;->e:Lcom/google/android/gms/internal/ads/Po;

    invoke-direct {v3, v4, v5}, Lcom/google/android/gms/internal/ads/jR;-><init>(Lcom/google/android/gms/internal/ads/mr;Lcom/google/android/gms/internal/ads/Po;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    new-instance v3, Lcom/google/android/gms/internal/ads/iR;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/ads/iR;-><init>(Lcom/google/android/gms/internal/ads/kR;)V

    :goto_0
    invoke-interface {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Co;->j1(Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/Ho;)V

    goto :goto_4

    :cond_1
    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kR;->f:Lcom/google/android/gms/internal/ads/to;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/to;->j0()Lcom/google/android/gms/internal/ads/Co;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/qR;->g:Ljava/lang/String;

    sget-object v3, Lcom/google/android/gms/internal/ads/Af;->Nc:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    new-instance v3, Lcom/google/android/gms/internal/ads/jR;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/kR;->a:Lcom/google/android/gms/internal/ads/mr;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/kR;->e:Lcom/google/android/gms/internal/ads/Po;

    invoke-direct {v3, v4, v5}, Lcom/google/android/gms/internal/ads/jR;-><init>(Lcom/google/android/gms/internal/ads/mr;Lcom/google/android/gms/internal/ads/Po;)V

    goto :goto_1

    :cond_2
    new-instance v3, Lcom/google/android/gms/internal/ads/iR;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/ads/iR;-><init>(Lcom/google/android/gms/internal/ads/kR;)V

    :goto_1
    invoke-interface {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Co;->R3(Ljava/lang/String;Lcom/google/android/gms/internal/ads/Ho;)V

    goto :goto_4

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kR;->a:Lcom/google/android/gms/internal/ads/mr;

    new-instance v2, Lcom/google/android/gms/internal/ads/AR;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/AR;-><init>(I)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :goto_2
    :try_start_2
    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v2

    const-string v3, "RemoteUrlAndCacheKeyClientTask.onConnected"

    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kR;->a:Lcom/google/android/gms/internal/ads/mr;

    new-instance v2, Lcom/google/android/gms/internal/ads/AR;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/AR;-><init>(I)V

    :goto_3
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_5

    :catch_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kR;->a:Lcom/google/android/gms/internal/ads/mr;

    new-instance v2, Lcom/google/android/gms/internal/ads/AR;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/AR;-><init>(I)V

    goto :goto_3

    :cond_4
    :goto_4
    monitor-exit p1

    return-void

    :goto_5
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public final c(Lcom/google/android/gms/internal/ads/Po;)LP4/d;
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kR;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/qR;->h:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v1, v2, :cond_0

    if-eq v1, v3, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/AR;

    invoke-direct {p1, v3}, Lcom/google/android/gms/internal/ads/AR;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/kR;->c:Z

    if-eqz v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/kR;->a:Lcom/google/android/gms/internal/ads/mr;

    monitor-exit v0

    return-object p1

    :cond_1
    iput v3, p0, Lcom/google/android/gms/internal/ads/qR;->h:I

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/kR;->c:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kR;->e:Lcom/google/android/gms/internal/ads/Po;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/kR;->f:Lcom/google/android/gms/internal/ads/to;

    invoke-virtual {p1}, LQ3/c;->q()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/kR;->a:Lcom/google/android/gms/internal/ads/mr;

    new-instance v1, Lcom/google/android/gms/internal/ads/oR;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/oR;-><init>(Lcom/google/android/gms/internal/ads/qR;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/mr;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/kR;->a:Lcom/google/android/gms/internal/ads/mr;

    monitor-exit v0

    return-object p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final d(Ljava/lang/String;)LP4/d;
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kR;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/qR;->h:I

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eq v1, v3, :cond_0

    if-eq v1, v2, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/AR;

    const/4 v1, 0x2

    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/ads/AR;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/kR;->c:Z

    if-eqz v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/kR;->a:Lcom/google/android/gms/internal/ads/mr;

    monitor-exit v0

    return-object p1

    :cond_1
    iput v2, p0, Lcom/google/android/gms/internal/ads/qR;->h:I

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/kR;->c:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qR;->g:Ljava/lang/String;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/kR;->f:Lcom/google/android/gms/internal/ads/to;

    invoke-virtual {p1}, LQ3/c;->q()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/kR;->a:Lcom/google/android/gms/internal/ads/mr;

    new-instance v1, Lcom/google/android/gms/internal/ads/pR;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/pR;-><init>(Lcom/google/android/gms/internal/ads/qR;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/mr;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/kR;->a:Lcom/google/android/gms/internal/ads/mr;

    monitor-exit v0

    return-object p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final q0(LN3/b;)V
    .locals 1

    const-string p1, "Cannot connect to remote service, fallback to local instance."

    invoke-static {p1}, Lw3/p;->b(Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/AR;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/AR;-><init>(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kR;->a:Lcom/google/android/gms/internal/ads/mr;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    return-void
.end method
