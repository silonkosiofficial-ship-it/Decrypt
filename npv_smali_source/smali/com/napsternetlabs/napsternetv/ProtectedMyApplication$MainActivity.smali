.class public Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity;
.super Ljava/lang/Thread;


# instance fields
.field a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    :goto_0
    sget-object v0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$a;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$a;->d:Ljava/util/ArrayList;

    monitor-enter v1

    :goto_1
    :try_start_0
    sget-object v0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    :try_start_1
    sget-object v0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_2
    sget-object v0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$a;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    monitor-exit v1

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity;->a:Ljava/util/ArrayList;

    sget-object v2, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget-object v0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    new-instance v3, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity$f;

    sget-object v0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$a;->h:Landroid/content/Context;

    invoke-direct {v3, v0}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity$f;-><init>(Landroid/content/Context;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2

    const/4 v2, 0x0

    :try_start_4
    invoke-static {v3}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$a;->a(Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity$f;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity;->a:Ljava/util/ArrayList;

    invoke-static {}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$a;->b()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_2
    sget-object v0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$a;->h:Landroid/content/Context;

    iget-object v1, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity;->a:Ljava/util/ArrayList;

    invoke-static {v0, v3, v1}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$a$a;->a(Landroid/content/Context;Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity$f;Ljava/util/ArrayList;)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-virtual {v3}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity$f;->close()V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2

    :goto_2
    iget-object v0, p0, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v0

    :catch_1
    move-exception v0

    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception v1

    move-object v2, v0

    :goto_3
    if-eqz v2, :cond_3

    :try_start_8
    invoke-virtual {v3}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity$f;->close()V
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_3

    :goto_4
    :try_start_9
    throw v1

    :catch_2
    move-exception v0

    goto :goto_2

    :catch_3
    move-exception v0

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_3
    invoke-virtual {v3}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MainActivity$f;->close()V
    :try_end_9
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_2

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object v1, v0

    goto :goto_3
.end method
