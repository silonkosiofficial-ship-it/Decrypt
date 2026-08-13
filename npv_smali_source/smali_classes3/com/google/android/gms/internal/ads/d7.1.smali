.class public abstract Lcom/google/android/gms/internal/ads/d7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/m7;

.field private final D:I

.field private final E:Ljava/lang/String;

.field private final F:I

.field private final G:Ljava/lang/Object;

.field private final H:Lcom/google/android/gms/internal/ads/f7;

.field private I:Ljava/lang/Integer;

.field private J:Lcom/google/android/gms/internal/ads/e7;

.field private K:Z

.field private L:Lcom/google/android/gms/internal/ads/M6;

.field private M:Lcom/google/android/gms/internal/ads/c7;

.field private final N:Lcom/google/android/gms/internal/ads/R6;


# direct methods
.method public constructor <init>(ILjava/lang/String;Lcom/google/android/gms/internal/ads/f7;)V
    .locals 2

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-boolean v0, Lcom/google/android/gms/internal/ads/m7;->c:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/m7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/m7;-><init>()V

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->C:Lcom/google/android/gms/internal/ads/m7;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->G:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/d7;->K:Z

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/d7;->L:Lcom/google/android/gms/internal/ads/M6;

    iput p1, p0, Lcom/google/android/gms/internal/ads/d7;->D:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/d7;->E:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/d7;->H:Lcom/google/android/gms/internal/ads/f7;

    new-instance p1, Lcom/google/android/gms/internal/ads/R6;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/R6;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d7;->N:Lcom/google/android/gms/internal/ads/R6;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    :cond_1
    iput v0, p0, Lcom/google/android/gms/internal/ads/d7;->F:I

    return-void
.end method

.method static bridge synthetic r(Lcom/google/android/gms/internal/ads/d7;)Lcom/google/android/gms/internal/ads/m7;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/d7;->C:Lcom/google/android/gms/internal/ads/m7;

    return-object p0
.end method


# virtual methods
.method final A()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->G:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/d7;->M:Lcom/google/android/gms/internal/ads/c7;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v1, p0}, Lcom/google/android/gms/internal/ads/c7;->a(Lcom/google/android/gms/internal/ads/d7;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method final B(Lcom/google/android/gms/internal/ads/h7;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->G:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/d7;->M:Lcom/google/android/gms/internal/ads/c7;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v1, p0, p1}, Lcom/google/android/gms/internal/ads/c7;->b(Lcom/google/android/gms/internal/ads/d7;Lcom/google/android/gms/internal/ads/h7;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method final C(I)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->J:Lcom/google/android/gms/internal/ads/e7;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/internal/ads/e7;->c(Lcom/google/android/gms/internal/ads/d7;I)V

    :cond_0
    return-void
.end method

.method final D(Lcom/google/android/gms/internal/ads/c7;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->G:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d7;->M:Lcom/google/android/gms/internal/ads/c7;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final E()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->G:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/d7;->K:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final F()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->G:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public G()[B
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final H()Lcom/google/android/gms/internal/ads/R6;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->N:Lcom/google/android/gms/internal/ads/R6;

    return-object v0
.end method

.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/d7;->D:I

    return v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/d7;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->I:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/d7;->I:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public final e()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->N:Lcom/google/android/gms/internal/ads/R6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/R6;->b()I

    move-result v0

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/d7;->F:I

    return v0
.end method

.method public final i()Lcom/google/android/gms/internal/ads/M6;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->L:Lcom/google/android/gms/internal/ads/M6;

    return-object v0
.end method

.method public final m(Lcom/google/android/gms/internal/ads/M6;)Lcom/google/android/gms/internal/ads/d7;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d7;->L:Lcom/google/android/gms/internal/ads/M6;

    return-object p0
.end method

.method public final n(Lcom/google/android/gms/internal/ads/e7;)Lcom/google/android/gms/internal/ads/d7;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d7;->J:Lcom/google/android/gms/internal/ads/e7;

    return-object p0
.end method

.method public final o(I)Lcom/google/android/gms/internal/ads/d7;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d7;->I:Ljava/lang/Integer;

    return-object p0
.end method

.method protected abstract q(Lcom/google/android/gms/internal/ads/Z6;)Lcom/google/android/gms/internal/ads/h7;
.end method

.method public final s()Ljava/lang/String;
    .locals 3

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/d7;->D:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/d7;->E:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v1
.end method

.method public final t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->E:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcom/google/android/gms/internal/ads/d7;->F:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/d7;->F()Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/d7;->I:Ljava/lang/Integer;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "[ ] "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/d7;->E:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "0x"

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " NORMAL "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/util/Map;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final v(Ljava/lang/String;)V
    .locals 3

    .prologue
    sget-boolean v0, Lcom/google/android/gms/internal/ads/m7;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->C:Lcom/google/android/gms/internal/ads/m7;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/m7;->a(Ljava/lang/String;J)V

    :cond_0
    return-void
.end method

.method public final w(Lcom/google/android/gms/internal/ads/k7;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->G:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/d7;->H:Lcom/google/android/gms/internal/ads/f7;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/f7;->a(Lcom/google/android/gms/internal/ads/k7;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method protected abstract x(Ljava/lang/Object;)V
.end method

.method final y(Ljava/lang/String;)V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->J:Lcom/google/android/gms/internal/ads/e7;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/e7;->b(Lcom/google/android/gms/internal/ads/d7;)V

    :cond_0
    sget-boolean v0, Lcom/google/android/gms/internal/ads/m7;->c:Z

    if-eqz v0, :cond_2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    if-eq v2, v3, :cond_1

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lcom/google/android/gms/internal/ads/b7;

    invoke-direct {v3, p0, p1, v0, v1}, Lcom/google/android/gms/internal/ads/b7;-><init>(Lcom/google/android/gms/internal/ads/d7;Ljava/lang/String;J)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/d7;->C:Lcom/google/android/gms/internal/ads/m7;

    invoke-virtual {v2, p1, v0, v1}, Lcom/google/android/gms/internal/ads/m7;->a(Ljava/lang/String;J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/d7;->C:Lcom/google/android/gms/internal/ads/m7;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/d7;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/m7;->b(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final z()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d7;->G:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/d7;->K:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
