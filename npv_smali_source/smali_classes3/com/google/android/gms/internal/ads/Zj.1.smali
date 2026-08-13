.class public final Lcom/google/android/gms/internal/ads/Zj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/W6;


# instance fields
.field private volatile a:Lcom/google/android/gms/internal/ads/Lj;

.field private final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Zj;->b:Landroid/content/Context;

    return-void
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/Zj;)Lcom/google/android/gms/internal/ads/Lj;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Zj;->a:Lcom/google/android/gms/internal/ads/Lj;

    return-object p0
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/Zj;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zj;->a:Lcom/google/android/gms/internal/ads/Lj;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Zj;->a:Lcom/google/android/gms/internal/ads/Lj;

    invoke-virtual {p0}, LQ3/c;->h()V

    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/d7;)Lcom/google/android/gms/internal/ads/Z6;
    .locals 13

    .prologue
    const-string v0, "ms"

    const-string v1, "Http assets remote cache took "

    sget-object v2, Lcom/google/android/gms/internal/ads/Nj;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/d7;->u()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v3

    new-array v4, v3, [Ljava/lang/String;

    new-array v3, v3, [Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    aput-object v8, v4, v6

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    aput-object v7, v3, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/google/android/gms/internal/ads/Nj;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/d7;->t()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v4, v3}, Lcom/google/android/gms/internal/ads/Nj;-><init>(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object p1

    invoke-interface {p1}, LV3/f;->c()J

    move-result-wide v3

    const/4 p1, 0x0

    :try_start_0
    new-instance v6, Lcom/google/android/gms/internal/ads/mr;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/mr;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/ads/Xj;

    invoke-direct {v7, p0, v6}, Lcom/google/android/gms/internal/ads/Xj;-><init>(Lcom/google/android/gms/internal/ads/Zj;Lcom/google/android/gms/internal/ads/mr;)V

    new-instance v8, Lcom/google/android/gms/internal/ads/Yj;

    invoke-direct {v8, p0, v6}, Lcom/google/android/gms/internal/ads/Yj;-><init>(Lcom/google/android/gms/internal/ads/Zj;Lcom/google/android/gms/internal/ads/mr;)V

    new-instance v9, Lcom/google/android/gms/internal/ads/Lj;

    iget-object v10, p0, Lcom/google/android/gms/internal/ads/Zj;->b:Landroid/content/Context;

    invoke-static {}, Lr3/v;->x()Lv3/W;

    move-result-object v11

    invoke-virtual {v11}, Lv3/W;->b()Landroid/os/Looper;

    move-result-object v11

    invoke-direct {v9, v10, v11, v7, v8}, Lcom/google/android/gms/internal/ads/Lj;-><init>(Landroid/content/Context;Landroid/os/Looper;LQ3/c$a;LQ3/c$b;)V

    iput-object v9, p0, Lcom/google/android/gms/internal/ads/Zj;->a:Lcom/google/android/gms/internal/ads/Lj;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/Zj;->a:Lcom/google/android/gms/internal/ads/Lj;

    invoke-virtual {v7}, LQ3/c;->q()V

    new-instance v7, Lcom/google/android/gms/internal/ads/Vj;

    invoke-direct {v7, p0, v2}, Lcom/google/android/gms/internal/ads/Vj;-><init>(Lcom/google/android/gms/internal/ads/Zj;Lcom/google/android/gms/internal/ads/Nj;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v6, v7, v2}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v6

    sget-object v7, Lcom/google/android/gms/internal/ads/Af;->y4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v8

    invoke-virtual {v8, v7}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    int-to-long v7, v7

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v10, Lcom/google/android/gms/internal/ads/dr;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v6, v7, v8, v9, v10}, Lcom/google/android/gms/internal/ads/Nk0;->o(LP4/d;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)LP4/d;

    move-result-object v6

    new-instance v7, Lcom/google/android/gms/internal/ads/Wj;

    invoke-direct {v7, p0}, Lcom/google/android/gms/internal/ads/Wj;-><init>(Lcom/google/android/gms/internal/ads/Zj;)V

    invoke-interface {v6, v7, v2}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-interface {v6}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/ParcelFileDescriptor;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v6

    invoke-interface {v6}, LV3/f;->c()J

    move-result-wide v6

    sub-long/2addr v6, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/No;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/No;-><init>(Landroid/os/ParcelFileDescriptor;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/Pj;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/No;->e(Landroid/os/Parcelable$Creator;)LR3/d;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Pj;

    if-nez v0, :cond_1

    return-object p1

    :cond_1
    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/Pj;->C:Z

    if-nez v1, :cond_4

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/Pj;->G:[Ljava/lang/String;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/Pj;->H:[Ljava/lang/String;

    array-length v1, v1

    array-length v2, v2

    if-eq v1, v2, :cond_2

    goto :goto_2

    :cond_2
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    :goto_1
    iget-object p1, v0, Lcom/google/android/gms/internal/ads/Pj;->G:[Ljava/lang/String;

    array-length v1, p1

    if-ge v5, v1, :cond_3

    aget-object p1, p1, v5

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/Pj;->H:[Ljava/lang/String;

    aget-object v1, v1, v5

    invoke-virtual {v9, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    iget v7, v0, Lcom/google/android/gms/internal/ads/Pj;->E:I

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/Pj;->F:[B

    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/Pj;->I:Z

    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/Pj;->J:J

    new-instance p1, Lcom/google/android/gms/internal/ads/Z6;

    move-object v6, p1

    invoke-direct/range {v6 .. v12}, Lcom/google/android/gms/internal/ads/Z6;-><init>(I[BLjava/util/Map;ZJ)V

    :goto_2
    return-object p1

    :cond_4
    iget-object p1, v0, Lcom/google/android/gms/internal/ads/Pj;->D:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/ads/k7;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/k7;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception p1

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v2

    invoke-interface {v2}, LV3/f;->c()J

    move-result-wide v5

    sub-long/2addr v5, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    throw p1

    :catch_0
    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v2

    invoke-interface {v2}, LV3/f;->c()J

    move-result-wide v5

    sub-long/2addr v5, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    return-object p1
.end method
