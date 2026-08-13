.class public final Lcom/google/android/gms/internal/ads/Nq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LV3/f;

.field private final b:Lcom/google/android/gms/internal/ads/Xq;

.field private final c:Ljava/util/LinkedList;

.field private final d:Ljava/lang/Object;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private g:J

.field private h:J

.field private i:J

.field private j:J

.field private k:J


# direct methods
.method constructor <init>(LV3/f;Lcom/google/android/gms/internal/ads/Xq;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Nq;->d:Ljava/lang/Object;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/Nq;->g:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/Nq;->h:J

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/Nq;->i:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/Nq;->j:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/Nq;->k:J

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Nq;->a:LV3/f;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Nq;->b:Lcom/google/android/gms/internal/ads/Xq;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Nq;->e:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Nq;->f:Ljava/lang/String;

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Nq;->c:Ljava/util/LinkedList;

    return-void
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/Nq;)LV3/f;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Nq;->a:LV3/f;

    return-object p0
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nq;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "seq_num"

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Nq;->e:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "slotid"

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Nq;->f:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ismediation"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "treq"

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/Nq;->j:J

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v2, "tresponse"

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/Nq;->k:J

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v2, "timp"

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/Nq;->g:J

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v2, "tload"

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/Nq;->h:J

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v2, "pcc"

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/Nq;->i:J

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v2, "tfetch"

    const-wide/16 v3, -0x1

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Nq;->c:Ljava/util/LinkedList;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/Mq;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/Mq;->b()Landroid/os/Bundle;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    const-string v3, "tclick"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nq;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final d()V
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nq;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/Nq;->k:J

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/Mq;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/Mq;-><init>(Lcom/google/android/gms/internal/ads/Nq;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Mq;->d()V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Nq;->c:Ljava/util/LinkedList;

    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/Nq;->i:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/Nq;->i:J

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Nq;->b:Lcom/google/android/gms/internal/ads/Xq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Xq;->f()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Nq;->b:Lcom/google/android/gms/internal/ads/Xq;

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/Xq;->e(Lcom/google/android/gms/internal/ads/Nq;)V

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

.method public final e()V
    .locals 7

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nq;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/Nq;->k:J

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Nq;->c:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Nq;->c:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/Mq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Mq;->a()J

    move-result-wide v5

    cmp-long v2, v5, v3

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Mq;->c()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Nq;->b:Lcom/google/android/gms/internal/ads/Xq;

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/Xq;->e(Lcom/google/android/gms/internal/ads/Nq;)V

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

.method public final f()V
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nq;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/Nq;->k:J

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/Nq;->g:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Nq;->a:LV3/f;

    invoke-interface {v1}, LV3/f;->c()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/Nq;->g:J

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Nq;->b:Lcom/google/android/gms/internal/ads/Xq;

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/Xq;->e(Lcom/google/android/gms/internal/ads/Nq;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Nq;->b:Lcom/google/android/gms/internal/ads/Xq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Xq;->g()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final g()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nq;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Nq;->b:Lcom/google/android/gms/internal/ads/Xq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Xq;->h()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final h(Z)V
    .locals 4

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Nq;->d:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/Nq;->k:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nq;->a:LV3/f;

    invoke-interface {v0}, LV3/f;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/Nq;->h:J

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final i()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nq;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Nq;->b:Lcom/google/android/gms/internal/ads/Xq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Xq;->i()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j(Ls3/X1;)V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nq;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Nq;->a:LV3/f;

    invoke-interface {v1}, LV3/f;->c()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/Nq;->j:J

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Nq;->b:Lcom/google/android/gms/internal/ads/Xq;

    invoke-virtual {v3, p1, v1, v2}, Lcom/google/android/gms/internal/ads/Xq;->j(Ls3/X1;J)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final k(J)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Nq;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/Nq;->k:J

    const-wide/16 v1, -0x1

    cmp-long p1, p1, v1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Nq;->b:Lcom/google/android/gms/internal/ads/Xq;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/ads/Xq;->e(Lcom/google/android/gms/internal/ads/Nq;)V

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
