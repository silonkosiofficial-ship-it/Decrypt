.class public LW8/F0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW8/z0;
.implements LW8/u;
.implements LW8/O0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW8/F0$a;,
        LW8/F0$b;,
        LW8/F0$c;
    }
.end annotation


# static fields
.field private static final synthetic C:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic D:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _parentHandle$volatile:Ljava/lang/Object;

.field private volatile synthetic _state$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_state$volatile"

    const-class v1, LW8/F0;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LW8/F0;->C:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_parentHandle$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LW8/F0;->D:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    invoke-static {}, LW8/G0;->c()LW8/i0;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, LW8/G0;->d()LW8/i0;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LW8/F0;->_state$volatile:Ljava/lang/Object;

    return-void
.end method

.method private final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    :cond_0
    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LW8/v0;

    if-eqz v1, :cond_2

    instance-of v1, v0, LW8/F0$c;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, LW8/F0$c;

    invoke-virtual {v1}, LW8/F0$c;->k()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, LW8/A;

    invoke-direct {p0, p1}, LW8/F0;->O(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v1, v2, v5, v3, v4}, LW8/A;-><init>(Ljava/lang/Throwable;ZILy7/k;)V

    invoke-direct {p0, v0, v1}, LW8/F0;->Z0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LW8/G0;->b()Lb9/D;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_2
    :goto_0
    invoke-static {}, LW8/G0;->a()Lb9/D;

    move-result-object p1

    return-object p1
.end method

.method private final B0(Lb9/o;)LW8/t;
    .locals 1

    .prologue
    :goto_0
    invoke-virtual {p1}, Lb9/o;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lb9/o;->n()Lb9/o;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lb9/o;->m()Lb9/o;

    move-result-object p1

    invoke-virtual {p1}, Lb9/o;->r()Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, p1, LW8/t;

    if-eqz v0, :cond_1

    check-cast p1, LW8/t;

    return-object p1

    :cond_1
    instance-of v0, p1, LW8/K0;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1
.end method

.method private final C0(LW8/K0;Ljava/lang/Throwable;)V
    .locals 5

    .prologue
    invoke-virtual {p0, p2}, LW8/F0;->F0(Ljava/lang/Throwable;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lb9/o;->h(I)V

    invoke-virtual {p1}, Lb9/o;->l()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lb9/o;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, LW8/E0;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, LW8/E0;

    invoke-virtual {v2}, LW8/E0;->w()Z

    move-result v2

    if-eqz v2, :cond_1

    :try_start_0
    move-object v2, v0

    check-cast v2, LW8/E0;

    invoke-virtual {v2, p2}, LW8/E0;->x(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_0

    invoke-static {v1, v2}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, LW8/B;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Exception in completion handler "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3, v2}, LW8/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Li7/M;->a:Li7/M;

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lb9/o;->m()Lb9/o;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, LW8/F0;->h0(Ljava/lang/Throwable;)V

    :cond_3
    invoke-direct {p0, p2}, LW8/F0;->E(Ljava/lang/Throwable;)Z

    return-void
.end method

.method private final D0(LW8/K0;Ljava/lang/Throwable;)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lb9/o;->h(I)V

    invoke-virtual {p1}, Lb9/o;->l()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lb9/o;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, LW8/E0;

    if-eqz v2, :cond_1

    :try_start_0
    move-object v2, v0

    check-cast v2, LW8/E0;

    invoke-virtual {v2, p2}, LW8/E0;->x(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_0

    invoke-static {v1, v2}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, LW8/B;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Exception in completion handler "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3, v2}, LW8/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Li7/M;->a:Li7/M;

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lb9/o;->m()Lb9/o;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, LW8/F0;->h0(Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method private final E(Ljava/lang/Throwable;)Z
    .locals 4

    .prologue
    invoke-virtual {p0}, LW8/F0;->k0()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    invoke-virtual {p0}, LW8/F0;->a0()LW8/s;

    move-result-object v2

    if-eqz v2, :cond_4

    sget-object v3, LW8/M0;->C:LW8/M0;

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2, p1}, LW8/s;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    return v0
.end method

.method private final J0(LW8/i0;)V
    .locals 2

    .prologue
    new-instance v0, LW8/K0;

    invoke-direct {v0}, LW8/K0;-><init>()V

    invoke-virtual {p1}, LW8/i0;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, LW8/u0;

    invoke-direct {v1, v0}, LW8/u0;-><init>(LW8/K0;)V

    move-object v0, v1

    :goto_0
    invoke-static {}, LW8/F0;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {v1, p0, p1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private final L(LW8/v0;Ljava/lang/Object;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, LW8/F0;->a0()LW8/s;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LW8/f0;->e()V

    sget-object v0, LW8/M0;->C:LW8/M0;

    invoke-virtual {p0, v0}, LW8/F0;->N0(LW8/s;)V

    :cond_0
    instance-of v0, p2, LW8/A;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, LW8/A;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    iget-object v1, p2, LW8/A;->a:Ljava/lang/Throwable;

    :cond_2
    instance-of p2, p1, LW8/E0;

    if-eqz p2, :cond_3

    :try_start_0
    move-object p2, p1

    check-cast p2, LW8/E0;

    invoke-virtual {p2, v1}, LW8/E0;->x(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    new-instance v0, LW8/B;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in completion handler "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, LW8/B;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, LW8/F0;->h0(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_3
    invoke-interface {p1}, LW8/v0;->a()LW8/K0;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-direct {p0, p1, v1}, LW8/F0;->D0(LW8/K0;Ljava/lang/Throwable;)V

    :cond_4
    :goto_1
    return-void
.end method

.method private final L0(LW8/E0;)V
    .locals 2

    new-instance v0, LW8/K0;

    invoke-direct {v0}, LW8/K0;-><init>()V

    invoke-virtual {p1, v0}, Lb9/o;->d(Lb9/o;)Z

    invoke-virtual {p1}, Lb9/o;->m()Lb9/o;

    move-result-object v0

    invoke-static {}, LW8/F0;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {v1, p0, p1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private final M(LW8/F0$c;LW8/t;Ljava/lang/Object;)V
    .locals 2

    .prologue
    invoke-direct {p0, p2}, LW8/F0;->B0(Lb9/o;)LW8/t;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, v0, p3}, LW8/F0;->b1(LW8/F0$c;LW8/t;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LW8/F0$c;->a()LW8/K0;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lb9/o;->h(I)V

    invoke-direct {p0, p2}, LW8/F0;->B0(Lb9/o;)LW8/t;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-direct {p0, p1, p2, p3}, LW8/F0;->b1(LW8/F0$c;LW8/t;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-void

    :cond_1
    invoke-direct {p0, p1, p3}, LW8/F0;->P(LW8/F0$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LW8/F0;->u(Ljava/lang/Object;)V

    return-void
.end method

.method private final O(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/Throwable;

    :goto_0
    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_2

    new-instance p1, LW8/A0;

    invoke-static {p0}, LW8/F0;->n(LW8/F0;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, LW8/A0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LW8/z0;)V

    goto :goto_1

    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LW8/O0;

    invoke-interface {p1}, LW8/O0;->Y0()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    :cond_2
    :goto_1
    return-object p1
.end method

.method private final O0(Ljava/lang/Object;)I
    .locals 4

    .prologue
    instance-of v0, p1, LW8/i0;

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, LW8/i0;

    invoke-virtual {v0}, LW8/i0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_0
    invoke-static {}, LW8/F0;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {}, LW8/G0;->c()LW8/i0;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, LW8/F0;->I0()V

    return v1

    :cond_2
    instance-of v0, p1, LW8/u0;

    if-eqz v0, :cond_4

    invoke-static {}, LW8/F0;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    move-object v3, p1

    check-cast v3, LW8/u0;

    invoke-virtual {v3}, LW8/u0;->a()LW8/K0;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, LW8/F0;->I0()V

    return v1

    :cond_4
    return v3
.end method

.method private final P(LW8/F0$c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, LW8/A;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LW8/A;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, LW8/A;->a:Ljava/lang/Throwable;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, LW8/F0$c;->j()Z

    move-result v2

    invoke-virtual {p1, v0}, LW8/F0$c;->m(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object v3

    invoke-direct {p0, p1, v3}, LW8/F0;->U(LW8/F0$c;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-direct {p0, v4, v3}, LW8/F0;->q(Ljava/lang/Throwable;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_4

    :cond_2
    :goto_2
    monitor-exit p1

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    if-ne v4, v0, :cond_4

    goto :goto_3

    :cond_4
    new-instance p2, LW8/A;

    const/4 v0, 0x0

    const/4 v3, 0x2

    invoke-direct {p2, v4, v0, v3, v1}, LW8/A;-><init>(Ljava/lang/Throwable;ZILy7/k;)V

    :goto_3
    if-eqz v4, :cond_6

    invoke-direct {p0, v4}, LW8/F0;->E(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0, v4}, LW8/F0;->f0(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    invoke-static {p2, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    check-cast v0, LW8/A;

    invoke-virtual {v0}, LW8/A;->c()Z

    :cond_6
    if-nez v2, :cond_7

    invoke-virtual {p0, v4}, LW8/F0;->F0(Ljava/lang/Throwable;)V

    :cond_7
    invoke-virtual {p0, p2}, LW8/F0;->G0(Ljava/lang/Object;)V

    invoke-static {}, LW8/F0;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {p2}, LW8/G0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-direct {p0, p1, p2}, LW8/F0;->L(LW8/v0;Ljava/lang/Object;)V

    return-object p2

    :goto_4
    monitor-exit p1

    throw p2
.end method

.method private final Q0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .prologue
    instance-of v0, p1, LW8/F0$c;

    const-string v1, "Active"

    if-eqz v0, :cond_1

    check-cast p1, LW8/F0$c;

    invoke-virtual {p1}, LW8/F0$c;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "Cancelling"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LW8/F0$c;->k()Z

    move-result p1

    if-eqz p1, :cond_5

    const-string v1, "Completing"

    goto :goto_0

    :cond_1
    instance-of v0, p1, LW8/v0;

    if-eqz v0, :cond_3

    check-cast p1, LW8/v0;

    invoke-interface {p1}, LW8/v0;->f()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "New"

    goto :goto_0

    :cond_3
    instance-of p1, p1, LW8/A;

    if-eqz p1, :cond_4

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_4
    const-string v1, "Completed"

    :cond_5
    :goto_0
    return-object v1
.end method

.method private final T(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    .prologue
    instance-of v0, p1, LW8/A;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LW8/A;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object v1, p1, LW8/A;->a:Ljava/lang/Throwable;

    :cond_1
    return-object v1
.end method

.method public static synthetic T0(LW8/F0;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;
    .locals 0

    .prologue
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LW8/F0;->S0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: toCancellationException"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final U(LW8/F0$c;Ljava/util/List;)Ljava/lang/Throwable;
    .locals 4

    .prologue
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LW8/F0$c;->j()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, LW8/A0;

    invoke-static {p0}, LW8/F0;->n(LW8/F0;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v1, p0}, LW8/A0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LW8/z0;)V

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    move-object p1, p2

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/Throwable;

    instance-of v3, v3, Ljava/util/concurrent/CancellationException;

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_3
    move-object v2, v1

    :goto_0
    check-cast v2, Ljava/lang/Throwable;

    if-eqz v2, :cond_4

    return-object v2

    :cond_4
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Throwable;

    instance-of v0, p2, LW8/Y0;

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Throwable;

    if-eq v2, p2, :cond_5

    instance-of v2, v2, LW8/Y0;

    if-eqz v2, :cond_5

    move-object v1, v0

    :cond_6
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_7

    return-object v1

    :cond_7
    return-object p2
.end method

.method private final V0(LW8/v0;Ljava/lang/Object;)Z
    .locals 2

    .prologue
    invoke-static {}, LW8/F0;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {p2}, LW8/G0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LW8/F0;->F0(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p2}, LW8/F0;->G0(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, LW8/F0;->L(LW8/v0;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final X0(LW8/v0;Ljava/lang/Throwable;)Z
    .locals 4

    .prologue
    invoke-direct {p0, p1}, LW8/F0;->Y(LW8/v0;)LW8/K0;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    new-instance v2, LW8/F0$c;

    invoke-direct {v2, v0, v1, p2}, LW8/F0$c;-><init>(LW8/K0;ZLjava/lang/Throwable;)V

    invoke-static {}, LW8/F0;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-static {v3, p0, p1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-direct {p0, v0, p2}, LW8/F0;->C0(LW8/K0;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final Y(LW8/v0;)LW8/K0;
    .locals 3

    .prologue
    invoke-interface {p1}, LW8/v0;->a()LW8/K0;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, LW8/i0;

    if-eqz v0, :cond_0

    new-instance v0, LW8/K0;

    invoke-direct {v0}, LW8/K0;-><init>()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LW8/E0;

    if-eqz v0, :cond_1

    check-cast p1, LW8/E0;

    invoke-direct {p0, p1}, LW8/F0;->L0(LW8/E0;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "State should have list: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method private final Z0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    instance-of v0, p1, LW8/v0;

    if-nez v0, :cond_0

    invoke-static {}, LW8/G0;->a()Lb9/D;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, LW8/i0;

    if-nez v0, :cond_1

    instance-of v0, p1, LW8/E0;

    if-eqz v0, :cond_3

    :cond_1
    instance-of v0, p1, LW8/t;

    if-nez v0, :cond_3

    instance-of v0, p2, LW8/A;

    if-nez v0, :cond_3

    check-cast p1, LW8/v0;

    invoke-direct {p0, p1, p2}, LW8/F0;->V0(LW8/v0;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return-object p2

    :cond_2
    invoke-static {}, LW8/G0;->b()Lb9/D;

    move-result-object p1

    return-object p1

    :cond_3
    check-cast p1, LW8/v0;

    invoke-direct {p0, p1, p2}, LW8/F0;->a1(LW8/v0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final a1(LW8/v0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-direct {p0, p1}, LW8/F0;->Y(LW8/v0;)LW8/K0;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, LW8/G0;->b()Lb9/D;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v1, p1, LW8/F0$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, LW8/F0$c;

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    const/4 v3, 0x0

    if-nez v1, :cond_2

    new-instance v1, LW8/F0$c;

    invoke-direct {v1, v0, v3, v2}, LW8/F0$c;-><init>(LW8/K0;ZLjava/lang/Throwable;)V

    :cond_2
    new-instance v3, Ly7/O;

    invoke-direct {v3}, Ly7/O;-><init>()V

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, LW8/F0$c;->k()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {}, LW8/G0;->a()Lb9/D;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_3
    const/4 v4, 0x1

    :try_start_1
    invoke-virtual {v1, v4}, LW8/F0$c;->n(Z)V

    if-eq v1, p1, :cond_4

    invoke-static {}, LW8/F0;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v5

    invoke-static {v5, p0, p1, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-static {}, LW8/G0;->b()Lb9/D;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_4
    :try_start_2
    invoke-virtual {v1}, LW8/F0$c;->j()Z

    move-result p1

    instance-of v5, p2, LW8/A;

    if-eqz v5, :cond_5

    move-object v5, p2

    check-cast v5, LW8/A;

    goto :goto_1

    :cond_5
    move-object v5, v2

    :goto_1
    if-eqz v5, :cond_6

    iget-object v5, v5, LW8/A;->a:Ljava/lang/Throwable;

    invoke-virtual {v1, v5}, LW8/F0$c;->b(Ljava/lang/Throwable;)V

    :cond_6
    invoke-virtual {v1}, LW8/F0$c;->e()Ljava/lang/Throwable;

    move-result-object v5

    xor-int/2addr p1, v4

    if-eqz p1, :cond_7

    move-object v2, v5

    :cond_7
    iput-object v2, v3, Ly7/O;->C:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    if-eqz v2, :cond_8

    invoke-direct {p0, v0, v2}, LW8/F0;->C0(LW8/K0;Ljava/lang/Throwable;)V

    :cond_8
    invoke-direct {p0, v0}, LW8/F0;->B0(Lb9/o;)LW8/t;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-direct {p0, v1, p1, p2}, LW8/F0;->b1(LW8/F0$c;LW8/t;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    sget-object p1, LW8/G0;->b:Lb9/D;

    return-object p1

    :cond_9
    const/4 p1, 0x2

    invoke-virtual {v0, p1}, Lb9/o;->h(I)V

    invoke-direct {p0, v0}, LW8/F0;->B0(Lb9/o;)LW8/t;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-direct {p0, v1, p1, p2}, LW8/F0;->b1(LW8/F0$c;LW8/t;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    sget-object p1, LW8/G0;->b:Lb9/D;

    return-object p1

    :cond_a
    invoke-direct {p0, v1, p2}, LW8/F0;->P(LW8/F0$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :goto_2
    monitor-exit v1

    throw p1
.end method

.method private final b1(LW8/F0$c;LW8/t;Ljava/lang/Object;)Z
    .locals 3

    .prologue
    :cond_0
    iget-object v0, p2, LW8/t;->G:LW8/u;

    new-instance v1, LW8/F0$b;

    invoke-direct {v1, p0, p1, p2, p3}, LW8/F0$b;-><init>(LW8/F0;LW8/F0$c;LW8/t;Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, LW8/C0;->n(LW8/z0;ZLW8/E0;)LW8/f0;

    move-result-object v0

    sget-object v1, LW8/M0;->C:LW8/M0;

    if-eq v0, v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-direct {p0, p2}, LW8/F0;->B0(Lb9/o;)LW8/t;

    move-result-object p2

    if-nez p2, :cond_0

    return v2
.end method

.method private static final synthetic c0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LW8/F0;->D:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private static final synthetic d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LW8/F0;->C:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final l0()Z
    .locals 2

    .prologue
    :cond_0
    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LW8/v0;

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-direct {p0, v0}, LW8/F0;->O0(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0
.end method

.method private final m0(Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    new-instance v0, LW8/n;

    invoke-static {p1}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v0}, LW8/n;->E()V

    new-instance v1, LW8/Q0;

    invoke-direct {v1, v0}, LW8/Q0;-><init>(Lm7/e;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {p0, v4, v1, v2, v3}, LW8/C0;->o(LW8/z0;ZLW8/E0;ILjava/lang/Object;)LW8/f0;

    move-result-object v1

    invoke-static {v0, v1}, LW8/p;->a(LW8/l;LW8/f0;)V

    invoke-virtual {v0}, LW8/n;->x()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lo7/h;->c(Lm7/e;)V

    :cond_0
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_1

    return-object v0

    :cond_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public static final synthetic n(LW8/F0;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, LW8/F0;->I()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(LW8/F0;LW8/F0$c;LW8/t;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LW8/F0;->M(LW8/F0$c;LW8/t;Ljava/lang/Object;)V

    return-void
.end method

.method private final p0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    const/4 v0, 0x0

    move-object v1, v0

    :cond_0
    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, LW8/F0$c;

    if-eqz v3, :cond_7

    monitor-enter v2

    :try_start_0
    move-object v3, v2

    check-cast v3, LW8/F0$c;

    invoke-virtual {v3}, LW8/F0$c;->l()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, LW8/G0;->f()Lb9/D;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_1
    move-object v3, v2

    check-cast v3, LW8/F0$c;

    invoke-virtual {v3}, LW8/F0$c;->j()Z

    move-result v3

    if-nez p1, :cond_2

    if-nez v3, :cond_4

    :cond_2
    if-nez v1, :cond_3

    invoke-direct {p0, p1}, LW8/F0;->O(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_3
    move-object p1, v2

    check-cast p1, LW8/F0$c;

    invoke-virtual {p1, v1}, LW8/F0$c;->b(Ljava/lang/Throwable;)V

    :cond_4
    move-object p1, v2

    check-cast p1, LW8/F0$c;

    invoke-virtual {p1}, LW8/F0$c;->e()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    xor-int/lit8 v1, v3, 0x1

    if-eqz v1, :cond_5

    move-object v0, p1

    :cond_5
    monitor-exit v2

    if-eqz v0, :cond_6

    check-cast v2, LW8/F0$c;

    invoke-virtual {v2}, LW8/F0$c;->a()LW8/K0;

    move-result-object p1

    invoke-direct {p0, p1, v0}, LW8/F0;->C0(LW8/K0;Ljava/lang/Throwable;)V

    :cond_6
    invoke-static {}, LW8/G0;->a()Lb9/D;

    move-result-object p1

    return-object p1

    :goto_0
    monitor-exit v2

    throw p1

    :cond_7
    instance-of v3, v2, LW8/v0;

    if-eqz v3, :cond_b

    if-nez v1, :cond_8

    invoke-direct {p0, p1}, LW8/F0;->O(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_8
    move-object v3, v2

    check-cast v3, LW8/v0;

    invoke-interface {v3}, LW8/v0;->f()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-direct {p0, v3, v1}, LW8/F0;->X0(LW8/v0;Ljava/lang/Throwable;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, LW8/G0;->a()Lb9/D;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance v3, LW8/A;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v3, v1, v4, v5, v0}, LW8/A;-><init>(Ljava/lang/Throwable;ZILy7/k;)V

    invoke-direct {p0, v2, v3}, LW8/F0;->Z0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, LW8/G0;->a()Lb9/D;

    move-result-object v4

    if-eq v3, v4, :cond_a

    invoke-static {}, LW8/G0;->b()Lb9/D;

    move-result-object v2

    if-eq v3, v2, :cond_0

    return-object v3

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot happen in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {}, LW8/G0;->f()Lb9/D;

    move-result-object p1

    return-object p1
.end method

.method private final q(Ljava/lang/Throwable;Ljava/util/List;)V
    .locals 3

    .prologue
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1, v0}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    if-eq v1, p1, :cond_1

    if-eq v1, p1, :cond_1

    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    if-nez v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v1}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private final w(Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    new-instance v0, LW8/F0$a;

    invoke-static {p1}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v1

    invoke-direct {v0, v1, p0}, LW8/F0$a;-><init>(Lm7/e;LW8/F0;)V

    invoke-virtual {v0}, LW8/n;->E()V

    new-instance v1, LW8/P0;

    invoke-direct {v1, v0}, LW8/P0;-><init>(LW8/n;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {p0, v4, v1, v2, v3}, LW8/C0;->o(LW8/z0;ZLW8/E0;ILjava/lang/Object;)LW8/f0;

    move-result-object v1

    invoke-static {v0, v1}, LW8/p;->a(LW8/l;LW8/f0;)V

    invoke-virtual {v0}, LW8/n;->x()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lo7/h;->c(Lm7/e;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public A(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1}, LW8/F0;->z(Ljava/lang/Object;)Z

    return-void
.end method

.method public D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LW8/z0$a;->b(LW8/z0;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final E0(ZZLx7/l;)LW8/f0;
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    new-instance p1, LW8/x0;

    invoke-direct {p1, p3}, LW8/x0;-><init>(Lx7/l;)V

    goto :goto_0

    :cond_0
    new-instance p1, LW8/y0;

    invoke-direct {p1, p3}, LW8/y0;-><init>(Lx7/l;)V

    :goto_0
    invoke-virtual {p0, p2, p1}, LW8/F0;->j0(ZLW8/E0;)LW8/f0;

    move-result-object p1

    return-object p1
.end method

.method protected F0(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method protected G0(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method protected I()Ljava/lang/String;
    .locals 1

    const-string v0, "Job was cancelled"

    return-object v0
.end method

.method protected I0()V
    .locals 0

    return-void
.end method

.method public K(Ljava/lang/Throwable;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, LW8/F0;->z(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LW8/F0;->V()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final M0(LW8/E0;)V
    .locals 3

    .prologue
    :cond_0
    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LW8/E0;

    if-eqz v1, :cond_2

    if-eq v0, p1, :cond_1

    return-void

    :cond_1
    invoke-static {}, LW8/F0;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {}, LW8/G0;->c()LW8/i0;

    move-result-object v2

    invoke-static {v1, p0, v0, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_2
    instance-of v1, v0, LW8/v0;

    if-eqz v1, :cond_3

    check-cast v0, LW8/v0;

    invoke-interface {v0}, LW8/v0;->a()LW8/K0;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lb9/o;->s()Z

    :cond_3
    return-void
.end method

.method public final N()LR8/h;
    .locals 2

    new-instance v0, LW8/F0$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LW8/F0$d;-><init>(LW8/F0;Lm7/e;)V

    invoke-static {v0}, LR8/k;->b(Lx7/p;)LR8/h;

    move-result-object v0

    return-object v0
.end method

.method public final N0(LW8/s;)V
    .locals 1

    invoke-static {}, LW8/F0;->c0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final S()Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LW8/v0;

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    instance-of v1, v0, LW8/A;

    if-nez v1, :cond_0

    invoke-static {v0}, LW8/G0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, LW8/A;

    iget-object v0, v0, LW8/A;->a:Ljava/lang/Throwable;

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job has not completed yet"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected final S0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;
    .locals 1

    .prologue
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    new-instance v0, LW8/A0;

    if-nez p2, :cond_1

    invoke-static {p0}, LW8/F0;->n(LW8/F0;)Ljava/lang/String;

    move-result-object p2

    :cond_1
    invoke-direct {v0, p2, p1, p0}, LW8/A0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LW8/z0;)V

    :cond_2
    return-object v0
.end method

.method public final U0()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LW8/F0;->w0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1}, LW8/F0;->Q0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public V()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public X()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public Y0()Ljava/util/concurrent/CancellationException;
    .locals 5

    .prologue
    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LW8/F0$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, LW8/F0$c;

    invoke-virtual {v1}, LW8/F0$c;->e()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v1, v0, LW8/A;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, LW8/A;

    iget-object v1, v1, LW8/A;->a:Ljava/lang/Throwable;

    goto :goto_0

    :cond_1
    instance-of v1, v0, LW8/v0;

    if-nez v1, :cond_4

    move-object v1, v2

    :goto_0
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_2

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_2
    if-nez v2, :cond_3

    new-instance v2, LW8/A0;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Parent job is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, LW8/F0;->Q0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p0}, LW8/A0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LW8/z0;)V

    :cond_3
    return-object v2

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot be cancelling child in this state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public Z()LW8/z0;
    .locals 1

    .prologue
    invoke-virtual {p0}, LW8/F0;->a0()LW8/s;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LW8/s;->getParent()LW8/z0;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final a0()LW8/s;
    .locals 1

    invoke-static {}, LW8/F0;->c0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW8/s;

    return-object v0
.end method

.method public final b0()Ljava/lang/Object;
    .locals 1

    invoke-static {}, LW8/F0;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final e0()Ljava/util/concurrent/CancellationException;
    .locals 4

    .prologue
    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LW8/F0$c;

    const-string v2, "Job is still new or active: "

    if-eqz v1, :cond_1

    check-cast v0, LW8/F0$c;

    invoke-virtual {v0}, LW8/F0$c;->e()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LW8/S;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is cancelling"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, LW8/F0;->S0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    instance-of v1, v0, LW8/v0;

    if-nez v1, :cond_3

    instance-of v1, v0, LW8/A;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, LW8/A;

    iget-object v0, v0, LW8/A;->a:Ljava/lang/Throwable;

    const/4 v1, 0x1

    invoke-static {p0, v0, v2, v1, v2}, LW8/F0;->T0(LW8/F0;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, LW8/A0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LW8/S;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " has completed normally"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, LW8/A0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LW8/z0;)V

    :goto_0
    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e1(Lx7/l;)LW8/f0;
    .locals 1

    new-instance v0, LW8/y0;

    invoke-direct {v0, p1}, LW8/y0;-><init>(Lx7/l;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, LW8/F0;->j0(ZLW8/E0;)LW8/f0;

    move-result-object p1

    return-object p1
.end method

.method public f()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LW8/v0;

    if-eqz v1, :cond_0

    check-cast v0, LW8/v0;

    invoke-interface {v0}, LW8/v0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected f0(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final f1()Z
    .locals 1

    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, LW8/v0;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final g0(Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-direct {p0}, LW8/F0;->l0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lm7/e;->getContext()Lm7/i;

    move-result-object p1

    invoke-static {p1}, LW8/C0;->l(Lm7/i;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, LW8/F0;->m0(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final getKey()Lm7/i$c;
    .locals 1

    sget-object v0, LW8/z0;->h:LW8/z0$b;

    return-object v0
.end method

.method public h0(Ljava/lang/Throwable;)V
    .locals 0

    throw p1
.end method

.method public i(Lm7/i$c;)Lm7/i$b;
    .locals 0

    invoke-static {p0, p1}, LW8/z0$a;->c(LW8/z0;Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    return-object p1
.end method

.method protected final i0(LW8/z0;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    sget-object p1, LW8/M0;->C:LW8/M0;

    invoke-virtual {p0, p1}, LW8/F0;->N0(LW8/s;)V

    return-void

    :cond_0
    invoke-interface {p1}, LW8/z0;->start()Z

    invoke-interface {p1, p0}, LW8/z0;->l1(LW8/u;)LW8/s;

    move-result-object p1

    invoke-virtual {p0, p1}, LW8/F0;->N0(LW8/s;)V

    invoke-virtual {p0}, LW8/F0;->f1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, LW8/f0;->e()V

    sget-object p1, LW8/M0;->C:LW8/M0;

    invoke-virtual {p0, p1}, LW8/F0;->N0(LW8/s;)V

    :cond_1
    return-void
.end method

.method public final isCancelled()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LW8/A;

    if-nez v1, :cond_1

    instance-of v1, v0, LW8/F0$c;

    if-eqz v1, :cond_0

    check-cast v0, LW8/F0$c;

    invoke-virtual {v0}, LW8/F0$c;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final j0(ZLW8/E0;)LW8/f0;
    .locals 5

    .prologue
    invoke-virtual {p2, p0}, LW8/E0;->y(LW8/F0;)V

    :cond_0
    :goto_0
    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LW8/i0;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, LW8/i0;

    invoke-virtual {v1}, LW8/i0;->f()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {}, LW8/F0;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {v1, p0, v0, p2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    :cond_1
    invoke-direct {p0, v1}, LW8/F0;->J0(LW8/i0;)V

    goto :goto_0

    :cond_2
    instance-of v1, v0, LW8/v0;

    if-eqz v1, :cond_9

    move-object v1, v0

    check-cast v1, LW8/v0;

    invoke-interface {v1}, LW8/v0;->a()LW8/K0;

    move-result-object v4

    if-nez v4, :cond_3

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LW8/E0;

    invoke-direct {p0, v0}, LW8/F0;->L0(LW8/E0;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, LW8/E0;->w()Z

    move-result v0

    if-eqz v0, :cond_8

    instance-of v0, v1, LW8/F0$c;

    if-eqz v0, :cond_4

    check-cast v1, LW8/F0$c;

    goto :goto_1

    :cond_4
    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_5

    invoke-virtual {v1}, LW8/F0$c;->e()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_2

    :cond_5
    move-object v0, v3

    :goto_2
    if-nez v0, :cond_6

    const/4 v0, 0x5

    invoke-virtual {v4, p2, v0}, Lb9/o;->b(Lb9/o;I)Z

    move-result v0

    goto :goto_3

    :cond_6
    if-eqz p1, :cond_7

    invoke-virtual {p2, v0}, LW8/E0;->x(Ljava/lang/Throwable;)V

    :cond_7
    sget-object p1, LW8/M0;->C:LW8/M0;

    return-object p1

    :cond_8
    invoke-virtual {v4, p2, v2}, Lb9/o;->b(Lb9/o;I)Z

    move-result v0

    :goto_3
    if-eqz v0, :cond_0

    goto :goto_4

    :cond_9
    const/4 v2, 0x0

    :goto_4
    if-eqz v2, :cond_a

    return-object p2

    :cond_a
    if-eqz p1, :cond_d

    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LW8/A;

    if-eqz v0, :cond_b

    check-cast p1, LW8/A;

    goto :goto_5

    :cond_b
    move-object p1, v3

    :goto_5
    if-eqz p1, :cond_c

    iget-object v3, p1, LW8/A;->a:Ljava/lang/Throwable;

    :cond_c
    invoke-virtual {p2, v3}, LW8/E0;->x(Ljava/lang/Throwable;)V

    :cond_d
    sget-object p1, LW8/M0;->C:LW8/M0;

    return-object p1
.end method

.method protected k0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final l1(LW8/u;)LW8/s;
    .locals 4

    .prologue
    new-instance v0, LW8/t;

    invoke-direct {v0, p1}, LW8/t;-><init>(LW8/u;)V

    invoke-virtual {v0, p0}, LW8/E0;->y(LW8/F0;)V

    :cond_0
    :goto_0
    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, LW8/i0;

    if-eqz v1, :cond_2

    move-object v1, p1

    check-cast v1, LW8/i0;

    invoke-virtual {v1}, LW8/i0;->f()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, LW8/F0;->d0()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {v1, p0, p1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_3

    :cond_1
    invoke-direct {p0, v1}, LW8/F0;->J0(LW8/i0;)V

    goto :goto_0

    :cond_2
    instance-of v1, p1, LW8/v0;

    const/4 v2, 0x0

    if-eqz v1, :cond_9

    move-object v1, p1

    check-cast v1, LW8/v0;

    invoke-interface {v1}, LW8/v0;->a()LW8/K0;

    move-result-object v1

    if-nez v1, :cond_3

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    invoke-static {p1, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LW8/E0;

    invoke-direct {p0, p1}, LW8/F0;->L0(LW8/E0;)V

    goto :goto_0

    :cond_3
    const/4 p1, 0x7

    invoke-virtual {v1, v0, p1}, Lb9/o;->b(Lb9/o;I)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_3

    :cond_4
    const/4 p1, 0x3

    invoke-virtual {v1, v0, p1}, Lb9/o;->b(Lb9/o;I)Z

    move-result p1

    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, LW8/F0$c;

    if-eqz v3, :cond_5

    check-cast v1, LW8/F0$c;

    invoke-virtual {v1}, LW8/F0$c;->e()Ljava/lang/Throwable;

    move-result-object v2

    goto :goto_2

    :cond_5
    instance-of v3, v1, LW8/A;

    if-eqz v3, :cond_6

    check-cast v1, LW8/A;

    goto :goto_1

    :cond_6
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_7

    iget-object v2, v1, LW8/A;->a:Ljava/lang/Throwable;

    :cond_7
    :goto_2
    invoke-virtual {v0, v2}, LW8/t;->x(Ljava/lang/Throwable;)V

    if-eqz p1, :cond_8

    :goto_3
    return-object v0

    :cond_8
    sget-object p1, LW8/M0;->C:LW8/M0;

    return-object p1

    :cond_9
    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, LW8/A;

    if-eqz v1, :cond_a

    check-cast p1, LW8/A;

    goto :goto_4

    :cond_a
    move-object p1, v2

    :goto_4
    if-eqz p1, :cond_b

    iget-object v2, p1, LW8/A;->a:Ljava/lang/Throwable;

    :cond_b
    invoke-virtual {v0, v2}, LW8/t;->x(Ljava/lang/Throwable;)V

    sget-object p1, LW8/M0;->C:LW8/M0;

    return-object p1
.end method

.method public o(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .prologue
    if-nez p1, :cond_0

    new-instance p1, LW8/A0;

    invoke-static {p0}, LW8/F0;->n(LW8/F0;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, LW8/A0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LW8/z0;)V

    :cond_0
    invoke-virtual {p0, p1}, LW8/F0;->A(Ljava/lang/Throwable;)V

    return-void
.end method

.method public o0(Lm7/i;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, LW8/z0$a;->f(LW8/z0;Lm7/i;)Lm7/i;

    move-result-object p1

    return-object p1
.end method

.method public final r0(LW8/O0;)V
    .locals 0

    invoke-virtual {p0, p1}, LW8/F0;->z(Ljava/lang/Object;)Z

    return-void
.end method

.method public final start()Z
    .locals 2

    .prologue
    :goto_0
    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, LW8/F0;->O0(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final t0(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    :cond_0
    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0, p1}, LW8/F0;->Z0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LW8/G0;->a()Lb9/D;

    move-result-object v1

    if-ne v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    sget-object v1, LW8/G0;->b:Lb9/D;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_2

    return v2

    :cond_2
    invoke-static {}, LW8/G0;->b()Lb9/D;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, LW8/F0;->u(Ljava/lang/Object;)V

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LW8/F0;->U0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LW8/S;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected u(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method protected final v(Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    :cond_0
    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LW8/v0;

    if-nez v1, :cond_2

    instance-of p1, v0, LW8/A;

    if-nez p1, :cond_1

    invoke-static {v0}, LW8/G0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    check-cast v0, LW8/A;

    iget-object p1, v0, LW8/A;->a:Ljava/lang/Throwable;

    throw p1

    :cond_2
    invoke-direct {p0, v0}, LW8/F0;->O0(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    invoke-direct {p0, p1}, LW8/F0;->w(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final v0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    :cond_0
    invoke-virtual {p0}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0, p1}, LW8/F0;->Z0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LW8/G0;->a()Lb9/D;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-static {}, LW8/G0;->b()Lb9/D;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Job "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already complete or completing, but is being completed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, LW8/F0;->T(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public w0()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LW8/S;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-virtual {p0, p1}, LW8/F0;->z(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public y0(Lm7/i$c;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, LW8/z0$a;->e(LW8/z0;Lm7/i$c;)Lm7/i;

    move-result-object p1

    return-object p1
.end method

.method public final z(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    invoke-static {}, LW8/G0;->a()Lb9/D;

    move-result-object v0

    invoke-virtual {p0}, LW8/F0;->X()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, LW8/F0;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LW8/G0;->b:Lb9/D;

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-static {}, LW8/G0;->a()Lb9/D;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-direct {p0, p1}, LW8/F0;->p0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_1
    invoke-static {}, LW8/G0;->a()Lb9/D;

    move-result-object p1

    if-ne v0, p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, LW8/G0;->b:Lb9/D;

    if-ne v0, p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, LW8/G0;->f()Lb9/D;

    move-result-object p1

    if-ne v0, p1, :cond_4

    const/4 v2, 0x0

    goto :goto_0

    :cond_4
    invoke-virtual {p0, v0}, LW8/F0;->u(Ljava/lang/Object;)V

    :goto_0
    return v2
.end method
