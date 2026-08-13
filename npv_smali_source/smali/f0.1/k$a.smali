.class public final Lf0/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lf0/k$a;-><init>()V

    return-void
.end method

.method public static synthetic a(Lx7/l;)V
    .locals 0

    invoke-static {p0}, Lf0/k$a;->l(Lx7/l;)V

    return-void
.end method

.method public static synthetic b(Lx7/p;)V
    .locals 0

    invoke-static {p0}, Lf0/k$a;->j(Lx7/p;)V

    return-void
.end method

.method private static final j(Lx7/p;)V
    .locals 2

    .prologue
    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lf0/p;->e()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1, p0}, Lj7/v;->z0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lf0/p;->s(Ljava/util/List;)V

    sget-object p0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static final l(Lx7/l;)V
    .locals 2

    .prologue
    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lf0/p;->h()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1, p0}, Lj7/v;->z0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lf0/p;->t(Ljava/util/List;)V

    sget-object p0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-static {}, Lf0/p;->b()V

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final c()Lf0/k;
    .locals 1

    invoke-static {}, Lf0/p;->H()Lf0/k;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lf0/k;
    .locals 1

    invoke-static {}, Lf0/p;->k()LV/B1;

    move-result-object v0

    invoke-virtual {v0}, LV/B1;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/k;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    .prologue
    invoke-static {}, Lf0/p;->k()LV/B1;

    move-result-object v0

    invoke-virtual {v0}, LV/B1;->a()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final f(Lf0/k;)Lf0/k;
    .locals 6

    .prologue
    instance-of v0, p1, Lf0/C;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf0/C;

    invoke-virtual {v0}, Lf0/C;->U()J

    move-result-wide v2

    invoke-static {}, LV/c;->a()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lf0/C;->X(Lx7/l;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lf0/D;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lf0/D;

    invoke-virtual {v0}, Lf0/D;->C()J

    move-result-wide v2

    invoke-static {}, LV/c;->a()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lf0/D;->F(Lx7/l;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    const/4 v2, 0x6

    invoke-static {p1, v1, v0, v2, v1}, Lf0/p;->E(Lf0/k;Lx7/l;ZILjava/lang/Object;)Lf0/k;

    move-result-object p1

    invoke-virtual {p1}, Lf0/k;->l()Lf0/k;

    :goto_0
    return-object p1
.end method

.method public final g()V
    .locals 1

    invoke-static {}, Lf0/p;->H()Lf0/k;

    move-result-object v0

    invoke-virtual {v0}, Lf0/k;->o()V

    return-void
.end method

.method public final h(Lx7/l;Lx7/l;Lx7/a;)Ljava/lang/Object;
    .locals 8

    .prologue
    if-nez p1, :cond_0

    if-nez p2, :cond_0

    invoke-interface {p3}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lf0/p;->k()LV/B1;

    move-result-object v0

    invoke-virtual {v0}, LV/B1;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/k;

    instance-of v1, v0, Lf0/C;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lf0/C;

    invoke-virtual {v1}, Lf0/C;->U()J

    move-result-wide v3

    invoke-static {}, LV/c;->a()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_1

    invoke-virtual {v1}, Lf0/C;->H()Lx7/l;

    move-result-object v3

    invoke-virtual {v1}, Lf0/C;->k()Lx7/l;

    move-result-object v4

    :try_start_0
    move-object v5, v0

    check-cast v5, Lf0/C;

    const/4 v6, 0x0

    const/4 v7, 0x4

    invoke-static {p1, v3, v6, v7, v2}, Lf0/p;->L(Lx7/l;Lx7/l;ZILjava/lang/Object;)Lx7/l;

    move-result-object p1

    invoke-virtual {v5, p1}, Lf0/C;->X(Lx7/l;)V

    check-cast v0, Lf0/C;

    invoke-static {p2, v4}, Lf0/p;->m(Lx7/l;Lx7/l;)Lx7/l;

    move-result-object p1

    invoke-virtual {v0, p1}, Lf0/C;->Y(Lx7/l;)V

    invoke-interface {p3}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1, v3}, Lf0/C;->X(Lx7/l;)V

    invoke-virtual {v1, v4}, Lf0/C;->Y(Lx7/l;)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v1, v3}, Lf0/C;->X(Lx7/l;)V

    invoke-virtual {v1, v4}, Lf0/C;->Y(Lx7/l;)V

    throw p1

    :cond_1
    if-eqz v0, :cond_4

    instance-of v1, v0, Lf0/c;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    if-nez p1, :cond_3

    invoke-interface {p3}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {v0, p1}, Lf0/k;->x(Lx7/l;)Lf0/k;

    move-result-object p1

    goto :goto_1

    :cond_4
    :goto_0
    new-instance v6, Lf0/C;

    instance-of v1, v0, Lf0/c;

    if-eqz v1, :cond_5

    move-object v2, v0

    check-cast v2, Lf0/c;

    :cond_5
    move-object v1, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, v6

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lf0/C;-><init>(Lf0/c;Lx7/l;Lx7/l;ZZ)V

    move-object p1, v6

    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lf0/k;->l()Lf0/k;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {p3}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {p1, p2}, Lf0/k;->s(Lf0/k;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-virtual {p1}, Lf0/k;->d()V

    return-object p3

    :catchall_1
    move-exception p2

    goto :goto_2

    :catchall_2
    move-exception p3

    :try_start_4
    invoke-virtual {p1, p2}, Lf0/k;->s(Lf0/k;)V

    throw p3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_2
    invoke-virtual {p1}, Lf0/k;->d()V

    throw p2
.end method

.method public final i(Lx7/p;)Lf0/f;
    .locals 2

    .prologue
    invoke-static {}, Lf0/p;->g()Lx7/l;

    move-result-object v0

    invoke-static {v0}, Lf0/p;->a(Lx7/l;)Ljava/lang/Object;

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lf0/p;->e()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1, p1}, Lj7/v;->D0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lf0/p;->s(Ljava/util/List;)V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    new-instance v0, Lf0/j;

    invoke-direct {v0, p1}, Lf0/j;-><init>(Lx7/p;)V

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final k(Lx7/l;)Lf0/f;
    .locals 2

    .prologue
    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lf0/p;->h()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1, p1}, Lj7/v;->D0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lf0/p;->t(Ljava/util/List;)V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-static {}, Lf0/p;->b()V

    new-instance v0, Lf0/i;

    invoke-direct {v0, p1}, Lf0/i;-><init>(Lx7/l;)V

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final m(Lf0/k;Lf0/k;Lx7/l;)V
    .locals 1

    .prologue
    if-ne p1, p2, :cond_2

    instance-of p2, p1, Lf0/C;

    if-eqz p2, :cond_0

    check-cast p1, Lf0/C;

    invoke-virtual {p1, p3}, Lf0/C;->X(Lx7/l;)V

    goto :goto_0

    :cond_0
    instance-of p2, p1, Lf0/D;

    if-eqz p2, :cond_1

    check-cast p1, Lf0/D;

    invoke-virtual {p1, p3}, Lf0/D;->F(Lx7/l;)V

    goto :goto_0

    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Non-transparent snapshot was reused: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    invoke-virtual {p2, p1}, Lf0/k;->s(Lf0/k;)V

    invoke-virtual {p2}, Lf0/k;->d()V

    :goto_0
    return-void
.end method

.method public final n()V
    .locals 4

    .prologue
    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lf0/p;->f()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf0/a;

    invoke-virtual {v1}, Lf0/c;->E()Lr/L;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lr/W;->e()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    move v2, v3

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    if-eqz v2, :cond_1

    invoke-static {}, Lf0/p;->b()V

    :cond_1
    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final o(Lx7/l;Lx7/l;)Lf0/c;
    .locals 2

    .prologue
    invoke-static {}, Lf0/p;->H()Lf0/k;

    move-result-object v0

    instance-of v1, v0, Lf0/c;

    if-eqz v1, :cond_0

    check-cast v0, Lf0/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Lf0/c;->Q(Lx7/l;Lx7/l;)Lf0/c;

    move-result-object p1

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot create a mutable snapshot of an read-only snapshot"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final p(Lx7/l;)Lf0/k;
    .locals 1

    invoke-static {}, Lf0/p;->H()Lf0/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf0/k;->x(Lx7/l;)Lf0/k;

    move-result-object p1

    return-object p1
.end method
