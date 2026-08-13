.class public final Lf0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/y;
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;
.implements Lz7/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf0/r$a;
    }
.end annotation


# instance fields
.field private C:Lf0/A;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LY/a;->a()LY/f;

    move-result-object v0

    new-instance v1, Lf0/r$a;

    invoke-direct {v1, v0}, Lf0/r$a;-><init>(LY/f;)V

    sget-object v2, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v2}, Lf0/k$a;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Lf0/r$a;

    invoke-direct {v2, v0}, Lf0/r$a;-><init>(LY/f;)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lf0/A;->h(I)V

    invoke-virtual {v1, v2}, Lf0/A;->g(Lf0/A;)V

    :cond_0
    iput-object v1, p0, Lf0/r;->C:Lf0/A;

    return-void
.end method

.method private final o(Lx7/l;)Z
    .locals 8

    .prologue
    :cond_0
    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf0/r$a;

    invoke-static {v1}, Lf0/p;->F(Lf0/A;)Lf0/A;

    move-result-object v1

    check-cast v1, Lf0/r$a;

    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v2

    invoke-virtual {v1}, Lf0/r$a;->i()LY/f;

    move-result-object v1

    sget-object v3, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v1}, LY/f;->builder()LY/f$a;

    move-result-object v0

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, LY/f$a;->i()LY/f;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf0/r$a;

    invoke-static {}, Lf0/p;->J()Lf0/k;

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v5}, Lf0/k$a;->c()Lf0/k;

    move-result-object v5

    invoke-static {v1, p0, v5}, Lf0/p;->h0(Lf0/A;Lf0/y;Lf0/k;)Lf0/A;

    move-result-object v1

    check-cast v1, Lf0/r$a;

    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v7

    if-ne v7, v2, :cond_1

    invoke-virtual {v1, v0}, Lf0/r$a;->l(LY/f;)V

    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v0

    const/4 v2, 0x1

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Lf0/r$a;->m(I)V

    invoke-virtual {v1}, Lf0/r$a;->k()I

    move-result v0

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Lf0/r$a;->n(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, Lf0/p;->Q(Lf0/k;Lf0/y;)V

    if-eqz v2, :cond_0

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_2

    :goto_1
    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_2
    monitor-exit v4

    throw p1

    :cond_2
    :goto_3
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method


# virtual methods
.method public C(Lf0/A;)V
    .locals 1

    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v0

    invoke-virtual {p1, v0}, Lf0/A;->g(Lf0/A;)V

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lf0/r$a;

    iput-object p1, p0, Lf0/r;->C:Lf0/A;

    return-void
.end method

.method public D(I)Ljava/lang/Object;
    .locals 8

    .prologue
    invoke-virtual {p0, p1}, Lf0/r;->get(I)Ljava/lang/Object;

    move-result-object v0

    :cond_0
    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lf0/r$a;

    invoke-static {v2}, Lf0/p;->F(Lf0/A;)Lf0/A;

    move-result-object v2

    check-cast v2, Lf0/r$a;

    invoke-virtual {v2}, Lf0/r$a;->j()I

    move-result v3

    invoke-virtual {v2}, Lf0/r$a;->i()LY/f;

    move-result-object v2

    sget-object v4, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v1

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v2, p1}, LY/f;->y(I)LY/f;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lf0/r$a;

    invoke-static {}, Lf0/p;->J()Lf0/k;

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v5}, Lf0/k$a;->c()Lf0/k;

    move-result-object v5

    invoke-static {v2, p0, v5}, Lf0/p;->h0(Lf0/A;Lf0/y;Lf0/k;)Lf0/A;

    move-result-object v2

    check-cast v2, Lf0/r$a;

    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2}, Lf0/r$a;->j()I

    move-result v7

    if-ne v7, v3, :cond_2

    invoke-virtual {v2, v1}, Lf0/r$a;->l(LY/f;)V

    invoke-virtual {v2}, Lf0/r$a;->k()I

    move-result v1

    const/4 v3, 0x1

    add-int/2addr v1, v3

    invoke-virtual {v2, v1}, Lf0/r$a;->n(I)V

    invoke-virtual {v2}, Lf0/r$a;->j()I

    move-result v1

    add-int/2addr v1, v3

    invoke-virtual {v2, v1}, Lf0/r$a;->m(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, Lf0/p;->Q(Lf0/k;Lf0/y;)V

    if-eqz v3, :cond_0

    :goto_1
    return-object v0

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final E(II)V
    .locals 7

    .prologue
    :cond_0
    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf0/r$a;

    invoke-static {v1}, Lf0/p;->F(Lf0/A;)Lf0/A;

    move-result-object v1

    check-cast v1, Lf0/r$a;

    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v2

    invoke-virtual {v1}, Lf0/r$a;->i()LY/f;

    move-result-object v1

    sget-object v3, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v1}, LY/f;->builder()LY/f$a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->clear()V

    invoke-interface {v0}, LY/f$a;->i()LY/f;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf0/r$a;

    invoke-static {}, Lf0/p;->J()Lf0/k;

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    :try_start_1
    sget-object v4, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v4}, Lf0/k$a;->c()Lf0/k;

    move-result-object v4

    invoke-static {v1, p0, v4}, Lf0/p;->h0(Lf0/A;Lf0/y;Lf0/k;)Lf0/A;

    move-result-object v1

    check-cast v1, Lf0/r$a;

    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v6

    if-ne v6, v2, :cond_1

    invoke-virtual {v1, v0}, Lf0/r$a;->l(LY/f;)V

    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v0

    const/4 v2, 0x1

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Lf0/r$a;->m(I)V

    invoke-virtual {v1}, Lf0/r$a;->k()I

    move-result v0

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Lf0/r$a;->n(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_0
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v3

    invoke-static {v4, p0}, Lf0/p;->Q(Lf0/k;Lf0/y;)V

    if-eqz v2, :cond_0

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_2

    :goto_1
    :try_start_4
    monitor-exit v5

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_2
    monitor-exit v3

    throw p1

    :cond_2
    :goto_3
    return-void

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final M(Ljava/util/Collection;II)I
    .locals 8

    .prologue
    invoke-virtual {p0}, Lf0/r;->size()I

    move-result v0

    :cond_0
    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lf0/r$a;

    invoke-static {v2}, Lf0/p;->F(Lf0/A;)Lf0/A;

    move-result-object v2

    check-cast v2, Lf0/r$a;

    invoke-virtual {v2}, Lf0/r$a;->j()I

    move-result v3

    invoke-virtual {v2}, Lf0/r$a;->i()LY/f;

    move-result-object v2

    sget-object v4, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v1

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v2}, LY/f;->builder()LY/f$a;

    move-result-object v1

    invoke-interface {v1, p2, p3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, p1}, Ljava/util/List;->retainAll(Ljava/util/Collection;)Z

    invoke-interface {v1}, LY/f$a;->i()LY/f;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lf0/r$a;

    invoke-static {}, Lf0/p;->J()Lf0/k;

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v5}, Lf0/k$a;->c()Lf0/k;

    move-result-object v5

    invoke-static {v2, p0, v5}, Lf0/p;->h0(Lf0/A;Lf0/y;Lf0/k;)Lf0/A;

    move-result-object v2

    check-cast v2, Lf0/r$a;

    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2}, Lf0/r$a;->j()I

    move-result v7

    if-ne v7, v3, :cond_1

    invoke-virtual {v2, v1}, Lf0/r$a;->l(LY/f;)V

    invoke-virtual {v2}, Lf0/r$a;->j()I

    move-result v1

    const/4 v3, 0x1

    add-int/2addr v1, v3

    invoke-virtual {v2, v1}, Lf0/r$a;->m(I)V

    invoke-virtual {v2}, Lf0/r$a;->k()I

    move-result v1

    add-int/2addr v1, v3

    invoke-virtual {v2, v1}, Lf0/r$a;->n(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, Lf0/p;->Q(Lf0/k;Lf0/y;)V

    if-eqz v3, :cond_0

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_2

    :goto_1
    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_2
    monitor-exit v4

    throw p1

    :cond_2
    :goto_3
    invoke-virtual {p0}, Lf0/r;->size()I

    move-result p1

    sub-int/2addr v0, p1

    return v0

    :catchall_2
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final N()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Lf0/r;->d()Lf0/r$a;

    move-result-object v0

    invoke-virtual {v0}, Lf0/r$a;->i()LY/f;

    move-result-object v0

    return-object v0
.end method

.method public add(ILjava/lang/Object;)V
    .locals 7

    .prologue
    :cond_0
    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf0/r$a;

    invoke-static {v1}, Lf0/p;->F(Lf0/A;)Lf0/A;

    move-result-object v1

    check-cast v1, Lf0/r$a;

    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v2

    invoke-virtual {v1}, Lf0/r$a;->i()LY/f;

    move-result-object v1

    sget-object v3, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v1, p1, p2}, LY/f;->add(ILjava/lang/Object;)LY/f;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf0/r$a;

    invoke-static {}, Lf0/p;->J()Lf0/k;

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    :try_start_1
    sget-object v4, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v4}, Lf0/k$a;->c()Lf0/k;

    move-result-object v4

    invoke-static {v1, p0, v4}, Lf0/p;->h0(Lf0/A;Lf0/y;Lf0/k;)Lf0/A;

    move-result-object v1

    check-cast v1, Lf0/r$a;

    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v6

    if-ne v6, v2, :cond_2

    invoke-virtual {v1, v0}, Lf0/r$a;->l(LY/f;)V

    invoke-virtual {v1}, Lf0/r$a;->k()I

    move-result v0

    const/4 v2, 0x1

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Lf0/r$a;->n(I)V

    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v0

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Lf0/r$a;->m(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_0
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v3

    invoke-static {v4, p0}, Lf0/p;->Q(Lf0/k;Lf0/y;)V

    if-eqz v2, :cond_0

    :goto_1
    return-void

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    monitor-exit v5

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v3

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 9

    .prologue
    :cond_0
    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf0/r$a;

    invoke-static {v1}, Lf0/p;->F(Lf0/A;)Lf0/A;

    move-result-object v1

    check-cast v1, Lf0/r$a;

    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v2

    invoke-virtual {v1}, Lf0/r$a;->i()LY/f;

    move-result-object v1

    sget-object v3, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v1, p1}, LY/f;->add(Ljava/lang/Object;)LY/f;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf0/r$a;

    invoke-static {}, Lf0/p;->J()Lf0/k;

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v5}, Lf0/k$a;->c()Lf0/k;

    move-result-object v5

    invoke-static {v1, p0, v5}, Lf0/p;->h0(Lf0/A;Lf0/y;Lf0/k;)Lf0/A;

    move-result-object v1

    check-cast v1, Lf0/r$a;

    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    invoke-virtual {v1, v0}, Lf0/r$a;->l(LY/f;)V

    invoke-virtual {v1}, Lf0/r$a;->k()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, Lf0/r$a;->n(I)V

    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, Lf0/r$a;->m(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v3, v8

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, Lf0/p;->Q(Lf0/k;Lf0/y;)V

    if-eqz v3, :cond_0

    move v3, v8

    :goto_1
    return v3

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 1

    new-instance v0, Lf0/r$b;

    invoke-direct {v0, p1, p2}, Lf0/r$b;-><init>(ILjava/util/Collection;)V

    invoke-direct {p0, v0}, Lf0/r;->o(Lx7/l;)Z

    move-result p1

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 9

    .prologue
    :cond_0
    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf0/r$a;

    invoke-static {v1}, Lf0/p;->F(Lf0/A;)Lf0/A;

    move-result-object v1

    check-cast v1, Lf0/r$a;

    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v2

    invoke-virtual {v1}, Lf0/r$a;->i()LY/f;

    move-result-object v1

    sget-object v3, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v1, p1}, LY/f;->addAll(Ljava/util/Collection;)LY/f;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf0/r$a;

    invoke-static {}, Lf0/p;->J()Lf0/k;

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v5}, Lf0/k$a;->c()Lf0/k;

    move-result-object v5

    invoke-static {v1, p0, v5}, Lf0/p;->h0(Lf0/A;Lf0/y;Lf0/k;)Lf0/A;

    move-result-object v1

    check-cast v1, Lf0/r$a;

    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    invoke-virtual {v1, v0}, Lf0/r$a;->l(LY/f;)V

    invoke-virtual {v1}, Lf0/r$a;->k()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, Lf0/r$a;->n(I)V

    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, Lf0/r$a;->m(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v3, v8

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, Lf0/p;->Q(Lf0/k;Lf0/y;)V

    if-eqz v3, :cond_0

    move v3, v8

    :goto_1
    return v3

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public clear()V
    .locals 5

    .prologue
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lf0/r$a;

    invoke-static {}, Lf0/p;->J()Lf0/k;

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    sget-object v2, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v2}, Lf0/k$a;->c()Lf0/k;

    move-result-object v2

    invoke-static {v0, p0, v2}, Lf0/p;->h0(Lf0/A;Lf0/y;Lf0/k;)Lf0/A;

    move-result-object v0

    check-cast v0, Lf0/r$a;

    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {}, LY/a;->a()LY/f;

    move-result-object v4

    invoke-virtual {v0, v4}, Lf0/r$a;->l(LY/f;)V

    invoke-virtual {v0}, Lf0/r$a;->j()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v4}, Lf0/r$a;->m(I)V

    invoke-virtual {v0}, Lf0/r$a;->k()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v4}, Lf0/r$a;->n(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    invoke-static {v2, p0}, Lf0/p;->Q(Lf0/k;Lf0/y;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v3

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    monitor-exit v1

    throw v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, Lf0/r;->d()Lf0/r$a;

    move-result-object v0

    invoke-virtual {v0}, Lf0/r$a;->i()LY/f;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1

    invoke-virtual {p0}, Lf0/r;->d()Lf0/r$a;

    move-result-object v0

    invoke-virtual {v0}, Lf0/r$a;->i()LY/f;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final d()Lf0/r$a;
    .locals 2

    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lf0/r$a;

    invoke-static {v0, p0}, Lf0/p;->X(Lf0/A;Lf0/y;)Lf0/A;

    move-result-object v0

    check-cast v0, Lf0/r$a;

    return-object v0
.end method

.method public e()Lf0/A;
    .locals 1

    iget-object v0, p0, Lf0/r;->C:Lf0/A;

    return-object v0
.end method

.method public f()I
    .locals 1

    invoke-virtual {p0}, Lf0/r;->d()Lf0/r$a;

    move-result-object v0

    invoke-virtual {v0}, Lf0/r$a;->i()LY/f;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final g()I
    .locals 2

    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lf0/r$a;

    invoke-static {v0}, Lf0/p;->F(Lf0/A;)Lf0/A;

    move-result-object v0

    check-cast v0, Lf0/r$a;

    invoke-virtual {v0}, Lf0/r$a;->k()I

    move-result v0

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf0/r;->d()Lf0/r$a;

    move-result-object v0

    invoke-virtual {v0}, Lf0/r$a;->i()LY/f;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Lf0/r;->d()Lf0/r$a;

    move-result-object v0

    invoke-virtual {v0}, Lf0/r$a;->i()LY/f;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lf0/r;->d()Lf0/r$a;

    move-result-object v0

    invoke-virtual {v0}, Lf0/r$a;->i()LY/f;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lf0/r;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Lf0/r;->d()Lf0/r$a;

    move-result-object v0

    invoke-virtual {v0}, Lf0/r$a;->i()LY/f;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 2

    new-instance v0, Lf0/w;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lf0/w;-><init>(Lf0/r;I)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Lf0/w;

    invoke-direct {v0, p0, p1}, Lf0/w;-><init>(Lf0/r;I)V

    return-object v0
.end method

.method public final bridge remove(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lf0/r;->D(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 9

    .prologue
    :cond_0
    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf0/r$a;

    invoke-static {v1}, Lf0/p;->F(Lf0/A;)Lf0/A;

    move-result-object v1

    check-cast v1, Lf0/r$a;

    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v2

    invoke-virtual {v1}, Lf0/r$a;->i()LY/f;

    move-result-object v1

    sget-object v3, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v1, p1}, LY/f;->remove(Ljava/lang/Object;)LY/f;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf0/r$a;

    invoke-static {}, Lf0/p;->J()Lf0/k;

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v5}, Lf0/k$a;->c()Lf0/k;

    move-result-object v5

    invoke-static {v1, p0, v5}, Lf0/p;->h0(Lf0/A;Lf0/y;Lf0/k;)Lf0/A;

    move-result-object v1

    check-cast v1, Lf0/r$a;

    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    invoke-virtual {v1, v0}, Lf0/r$a;->l(LY/f;)V

    invoke-virtual {v1}, Lf0/r$a;->k()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, Lf0/r$a;->n(I)V

    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, Lf0/r$a;->m(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v3, v8

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, Lf0/p;->Q(Lf0/k;Lf0/y;)V

    if-eqz v3, :cond_0

    move v3, v8

    :goto_1
    return v3

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 9

    .prologue
    :cond_0
    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf0/r$a;

    invoke-static {v1}, Lf0/p;->F(Lf0/A;)Lf0/A;

    move-result-object v1

    check-cast v1, Lf0/r$a;

    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v2

    invoke-virtual {v1}, Lf0/r$a;->i()LY/f;

    move-result-object v1

    sget-object v3, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v1, p1}, LY/f;->removeAll(Ljava/util/Collection;)LY/f;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v1, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lf0/r$a;

    invoke-static {}, Lf0/p;->J()Lf0/k;

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v5}, Lf0/k$a;->c()Lf0/k;

    move-result-object v5

    invoke-static {v1, p0, v5}, Lf0/p;->h0(Lf0/A;Lf0/y;Lf0/k;)Lf0/A;

    move-result-object v1

    check-cast v1, Lf0/r$a;

    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v2, :cond_2

    invoke-virtual {v1, v0}, Lf0/r$a;->l(LY/f;)V

    invoke-virtual {v1}, Lf0/r$a;->k()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, Lf0/r$a;->n(I)V

    invoke-virtual {v1}, Lf0/r$a;->j()I

    move-result v0

    add-int/2addr v0, v8

    invoke-virtual {v1, v0}, Lf0/r$a;->m(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v3, v8

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, Lf0/p;->Q(Lf0/k;Lf0/y;)V

    if-eqz v3, :cond_0

    move v3, v8

    :goto_1
    return v3

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1

    new-instance v0, Lf0/r$c;

    invoke-direct {v0, p1}, Lf0/r$c;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, v0}, Lf0/r;->o(Lx7/l;)Z

    move-result p1

    return p1
.end method

.method public synthetic s(Lf0/A;Lf0/A;Lf0/A;)Lf0/A;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lf0/x;->a(Lf0/y;Lf0/A;Lf0/A;Lf0/A;)Lf0/A;

    move-result-object p1

    return-object p1
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .prologue
    invoke-virtual {p0, p1}, Lf0/r;->get(I)Ljava/lang/Object;

    move-result-object v0

    :cond_0
    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lf0/r$a;

    invoke-static {v2}, Lf0/p;->F(Lf0/A;)Lf0/A;

    move-result-object v2

    check-cast v2, Lf0/r$a;

    invoke-virtual {v2}, Lf0/r$a;->j()I

    move-result v3

    invoke-virtual {v2}, Lf0/r$a;->i()LY/f;

    move-result-object v2

    sget-object v4, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v1

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v2, p1, p2}, LY/f;->set(ILjava/lang/Object;)LY/f;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v2, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lf0/r$a;

    invoke-static {}, Lf0/p;->J()Lf0/k;

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v5}, Lf0/k$a;->c()Lf0/k;

    move-result-object v5

    invoke-static {v2, p0, v5}, Lf0/p;->h0(Lf0/A;Lf0/y;Lf0/k;)Lf0/A;

    move-result-object v2

    check-cast v2, Lf0/r$a;

    invoke-static {}, Lf0/s;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2}, Lf0/r$a;->j()I

    move-result v7

    if-ne v7, v3, :cond_2

    invoke-virtual {v2, v1}, Lf0/r$a;->l(LY/f;)V

    invoke-virtual {v2}, Lf0/r$a;->j()I

    move-result v1

    const/4 v3, 0x1

    add-int/2addr v1, v3

    invoke-virtual {v2, v1}, Lf0/r$a;->m(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, Lf0/p;->Q(Lf0/k;Lf0/y;)V

    if-eqz v3, :cond_0

    :goto_1
    return-object v0

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v4

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, Lf0/r;->f()I

    move-result v0

    return v0
.end method

.method public subList(II)Ljava/util/List;
    .locals 1

    .prologue
    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    invoke-virtual {p0}, Lf0/r;->size()I

    move-result v0

    if-gt p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "fromIndex or toIndex are out of bounds"

    invoke-static {v0}, LV/I0;->a(Ljava/lang/String;)V

    :cond_1
    new-instance v0, Lf0/B;

    invoke-direct {v0, p0, p1, p2}, Lf0/B;-><init>(Lf0/r;II)V

    return-object v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    invoke-static {p0}, Ly7/j;->a(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Ly7/j;->b(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lf0/r;->e()Lf0/A;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lf0/r$a;

    invoke-static {v0}, Lf0/p;->F(Lf0/A;)Lf0/A;

    move-result-object v0

    check-cast v0, Lf0/r$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SnapshotStateList(value="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lf0/r$a;->i()LY/f;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")@"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
