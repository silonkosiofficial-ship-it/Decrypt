.class public abstract Lcom/google/android/gms/internal/ads/kR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ3/c$a;
.implements LQ3/c$b;


# instance fields
.field protected final a:Lcom/google/android/gms/internal/ads/mr;

.field protected final b:Ljava/lang/Object;

.field protected c:Z

.field protected d:Z

.field protected e:Lcom/google/android/gms/internal/ads/Po;

.field protected f:Lcom/google/android/gms/internal/ads/to;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/mr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/mr;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/kR;->a:Lcom/google/android/gms/internal/ads/mr;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/kR;->b:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/kR;->c:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/kR;->d:Z

    return-void
.end method

.method static b(Landroid/content/Context;LP4/d;Ljava/util/concurrent/Executor;)V
    .locals 1

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/ug;->j:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ads/ug;->h:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/ads/hR;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/hR;-><init>(Landroid/content/Context;)V

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kR;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/kR;->d:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kR;->f:Lcom/google/android/gms/internal/ads/to;

    invoke-virtual {v1}, LQ3/c;->j()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kR;->f:Lcom/google/android/gms/internal/ads/to;

    invoke-virtual {v1}, LQ3/c;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kR;->f:Lcom/google/android/gms/internal/ads/to;

    invoke-virtual {v1}, LQ3/c;->h()V

    :cond_1
    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public q0(LN3/b;)V
    .locals 1

    const-string p1, "Disconnected from remote ad request service."

    invoke-static {p1}, Lw3/p;->b(Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/AR;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/AR;-><init>(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kR;->a:Lcom/google/android/gms/internal/ads/mr;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final y0(I)V
    .locals 0

    const-string p1, "Cannot connect to remote service, fallback to local instance."

    invoke-static {p1}, Lw3/p;->b(Ljava/lang/String;)V

    return-void
.end method
