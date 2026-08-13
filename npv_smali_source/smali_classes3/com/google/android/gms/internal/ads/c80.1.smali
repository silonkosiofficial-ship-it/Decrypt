.class final Lcom/google/android/gms/internal/ads/c80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/b80;


# instance fields
.field private final a:Lj$/util/concurrent/ConcurrentHashMap;

.field private final b:Lcom/google/android/gms/internal/ads/j80;

.field private final c:Lcom/google/android/gms/internal/ads/e80;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/j80;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    iget v1, p1, Lcom/google/android/gms/internal/ads/j80;->H:I

    invoke-direct {v0, v1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/c80;->a:Lj$/util/concurrent/ConcurrentHashMap;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/c80;->b:Lcom/google/android/gms/internal/ads/j80;

    new-instance p1, Lcom/google/android/gms/internal/ads/e80;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/e80;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/c80;->c:Lcom/google/android/gms/internal/ads/e80;

    return-void
.end method

.method private final f()V
    .locals 7

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/j80;->CREATOR:Landroid/os/Parcelable$Creator;

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->h6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/c80;->b:Lcom/google/android/gms/internal/ads/j80;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/j80;->F:Lcom/google/android/gms/internal/ads/g80;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " PoolCollection"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/c80;->c:Lcom/google/android/gms/internal/ads/e80;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/e80;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/c80;->a:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Lj$/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ". "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "#"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/m80;

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "    "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v5, v2

    :goto_1
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/a80;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/a80;->b()I

    move-result v6

    if-ge v5, v6, :cond_0

    const-string v6, "[O]"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/a80;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/a80;->b()I

    move-result v5

    :goto_2
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/c80;->b:Lcom/google/android/gms/internal/ads/j80;

    iget v6, v6, Lcom/google/android/gms/internal/ads/j80;->H:I

    if-ge v5, v6, :cond_1

    const-string v6, "[ ]"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_1
    const-string v5, "\n"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/a80;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/a80;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    :goto_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/c80;->b:Lcom/google/android/gms/internal/ads/j80;

    iget v1, v1, Lcom/google/android/gms/internal/ads/j80;->G:I

    if-ge v3, v1, :cond_3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ".\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw3/p;->b(Ljava/lang/String;)V

    :cond_4
    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/j80;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c80;->b:Lcom/google/android/gms/internal/ads/j80;

    return-object v0
.end method

.method public final declared-synchronized b(Lcom/google/android/gms/internal/ads/m80;)Z
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c80;->a:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/a80;

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/c80;->b:Lcom/google/android/gms/internal/ads/j80;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/a80;->b()I

    move-result p1

    iget v1, v1, Lcom/google/android/gms/internal/ads/j80;->H:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-ge p1, v1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    monitor-exit p0

    return v0

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized c(Lcom/google/android/gms/internal/ads/m80;)Lcom/google/android/gms/internal/ads/l80;
    .locals 5

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c80;->a:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/a80;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/a80;->e()Lcom/google/android/gms/internal/ads/l80;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/c80;->c:Lcom/google/android/gms/internal/ads/e80;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/e80;->e()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/a80;->f()Lcom/google/android/gms/internal/ads/z80;

    move-result-object p1

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/se;->d0()Lcom/google/android/gms/internal/ads/le;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ke;->h0()Lcom/google/android/gms/internal/ads/je;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/ads/me;->E:Lcom/google/android/gms/internal/ads/me;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/je;->z(Lcom/google/android/gms/internal/ads/me;)Lcom/google/android/gms/internal/ads/je;

    invoke-static {}, Lcom/google/android/gms/internal/ads/pe;->d0()Lcom/google/android/gms/internal/ads/oe;

    move-result-object v3

    iget-boolean v4, p1, Lcom/google/android/gms/internal/ads/z80;->C:Z

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/oe;->z(Z)Lcom/google/android/gms/internal/ads/oe;

    iget p1, p1, Lcom/google/android/gms/internal/ads/z80;->D:I

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/ads/oe;->A(I)Lcom/google/android/gms/internal/ads/oe;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/je;->A(Lcom/google/android/gms/internal/ads/oe;)Lcom/google/android/gms/internal/ads/je;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/le;->z(Lcom/google/android/gms/internal/ads/je;)Lcom/google/android/gms/internal/ads/le;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/se;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/l80;->a:Lcom/google/android/gms/internal/ads/jC;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/jC;->b()Lcom/google/android/gms/internal/ads/LA;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/LA;->c()Lcom/google/android/gms/internal/ads/sF;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/sF;->a0(Lcom/google/android/gms/internal/ads/se;)V

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/c80;->f()V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/c80;->c:Lcom/google/android/gms/internal/ads/e80;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/e80;->f()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/c80;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    :goto_1
    monitor-exit p0

    return-object v0

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final d(Ls3/X1;Ljava/lang/String;Ls3/i2;)Lcom/google/android/gms/internal/ads/m80;
    .locals 7

    new-instance v0, Lcom/google/android/gms/internal/ads/So;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/c80;->b:Lcom/google/android/gms/internal/ads/j80;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/j80;->D:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/So;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/So;->a()Lcom/google/android/gms/internal/ads/To;

    move-result-object v0

    iget v4, v0, Lcom/google/android/gms/internal/ads/To;->j:I

    new-instance v0, Lcom/google/android/gms/internal/ads/n80;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/c80;->b:Lcom/google/android/gms/internal/ads/j80;

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/j80;->J:Ljava/lang/String;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/n80;-><init>(Ls3/X1;Ljava/lang/String;ILjava/lang/String;Ls3/i2;)V

    return-object v0
.end method

.method public final declared-synchronized e(Lcom/google/android/gms/internal/ads/m80;Lcom/google/android/gms/internal/ads/l80;)Z
    .locals 8

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c80;->a:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/a80;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v1

    invoke-interface {v1}, LV3/f;->a()J

    move-result-wide v1

    iput-wide v1, p2, Lcom/google/android/gms/internal/ads/l80;->d:J

    if-nez v0, :cond_c

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c80;->b:Lcom/google/android/gms/internal/ads/j80;

    new-instance v1, Lcom/google/android/gms/internal/ads/a80;

    iget v2, v0, Lcom/google/android/gms/internal/ads/j80;->H:I

    iget v0, v0, Lcom/google/android/gms/internal/ads/j80;->I:I

    mul-int/lit16 v0, v0, 0x3e8

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/ads/a80;-><init>(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c80;->a:Lj$/util/concurrent/ConcurrentHashMap;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/c80;->b:Lcom/google/android/gms/internal/ads/j80;

    invoke-virtual {v0}, Lj$/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    iget v2, v2, Lcom/google/android/gms/internal/ads/j80;->G:I

    if-ne v0, v2, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c80;->b:Lcom/google/android/gms/internal/ads/j80;

    iget v0, v0, Lcom/google/android/gms/internal/ads/j80;->O:I

    add-int/lit8 v2, v0, -0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_a

    const-wide v4, 0x7fffffffffffffffL

    if-eqz v2, :cond_6

    const/4 v0, 0x1

    if-eq v2, v0, :cond_3

    const/4 v0, 0x2

    if-eq v2, v0, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c80;->a:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lj$/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const v2, 0x7fffffff

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/a80;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/a80;->a()I

    move-result v5

    if-ge v5, v2, :cond_1

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/a80;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/a80;->a()I

    move-result v2

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/m80;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_2
    if-eqz v3, :cond_9

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c80;->a:Lj$/util/concurrent/ConcurrentHashMap;

    :goto_1
    invoke-virtual {v0, v3}, Lj$/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_4

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c80;->a:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lj$/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/a80;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/a80;->d()J

    move-result-wide v6

    cmp-long v6, v6, v4

    if-gez v6, :cond_4

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/a80;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/a80;->d()J

    move-result-wide v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/m80;

    move-wide v4, v3

    move-object v3, v2

    goto :goto_2

    :cond_5
    if-eqz v3, :cond_9

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c80;->a:Lj$/util/concurrent/ConcurrentHashMap;

    goto :goto_1

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c80;->a:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lj$/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/a80;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/a80;->c()J

    move-result-wide v6

    cmp-long v6, v6, v4

    if-gez v6, :cond_7

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/a80;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/a80;->c()J

    move-result-wide v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/m80;

    move-wide v4, v3

    move-object v3, v2

    goto :goto_3

    :cond_8
    if-eqz v3, :cond_9

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c80;->a:Lj$/util/concurrent/ConcurrentHashMap;

    goto :goto_1

    :cond_9
    :goto_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c80;->c:Lcom/google/android/gms/internal/ads/e80;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/e80;->g()V

    goto :goto_5

    :cond_a
    throw v3

    :cond_b
    :goto_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/c80;->a:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, v1}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/c80;->c:Lcom/google/android/gms/internal/ads/e80;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/e80;->d()V

    move-object v0, v1

    :cond_c
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/a80;->h(Lcom/google/android/gms/internal/ads/l80;)Z

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/c80;->c:Lcom/google/android/gms/internal/ads/e80;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/e80;->c()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/c80;->c:Lcom/google/android/gms/internal/ads/e80;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/e80;->a()Lcom/google/android/gms/internal/ads/d80;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/a80;->f()Lcom/google/android/gms/internal/ads/z80;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/se;->d0()Lcom/google/android/gms/internal/ads/le;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/ads/ke;->h0()Lcom/google/android/gms/internal/ads/je;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/ads/me;->E:Lcom/google/android/gms/internal/ads/me;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/je;->z(Lcom/google/android/gms/internal/ads/me;)Lcom/google/android/gms/internal/ads/je;

    invoke-static {}, Lcom/google/android/gms/internal/ads/re;->h0()Lcom/google/android/gms/internal/ads/qe;

    move-result-object v4

    iget-boolean v5, v1, Lcom/google/android/gms/internal/ads/d80;->C:Z

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/qe;->z(Z)Lcom/google/android/gms/internal/ads/qe;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ads/d80;->D:Z

    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/qe;->A(Z)Lcom/google/android/gms/internal/ads/qe;

    iget v0, v0, Lcom/google/android/gms/internal/ads/z80;->D:I

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/qe;->B(I)Lcom/google/android/gms/internal/ads/qe;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/je;->C(Lcom/google/android/gms/internal/ads/qe;)Lcom/google/android/gms/internal/ads/je;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/le;->z(Lcom/google/android/gms/internal/ads/je;)Lcom/google/android/gms/internal/ads/le;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/se;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/l80;->a:Lcom/google/android/gms/internal/ads/jC;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/jC;->b()Lcom/google/android/gms/internal/ads/LA;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/LA;->c()Lcom/google/android/gms/internal/ads/sF;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/sF;->S(Lcom/google/android/gms/internal/ads/se;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/c80;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :goto_6
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
