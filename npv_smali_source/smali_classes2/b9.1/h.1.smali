.class public final Lb9/h;
.super LW8/a0;
.source "SourceFile"

# interfaces
.implements Lo7/e;
.implements Lm7/e;


# static fields
.field private static final synthetic J:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public final F:LW8/J;

.field public final G:Lm7/e;

.field public H:Ljava/lang/Object;

.field public final I:Ljava/lang/Object;

.field private volatile synthetic _reusableCancellableContinuation$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_reusableCancellableContinuation$volatile"

    const-class v2, Lb9/h;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lb9/h;->J:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(LW8/J;Lm7/e;)V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0, v0}, LW8/a0;-><init>(I)V

    iput-object p1, p0, Lb9/h;->F:LW8/J;

    iput-object p2, p0, Lb9/h;->G:Lm7/e;

    invoke-static {}, Lb9/i;->a()Lb9/D;

    move-result-object p1

    iput-object p1, p0, Lb9/h;->H:Ljava/lang/Object;

    invoke-virtual {p0}, Lb9/h;->getContext()Lm7/i;

    move-result-object p1

    invoke-static {p1}, Lb9/K;->g(Lm7/i;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lb9/h;->I:Ljava/lang/Object;

    return-void
.end method

.method private final n()LW8/n;
    .locals 2

    .prologue
    invoke-static {}, Lb9/h;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LW8/n;

    if-eqz v1, :cond_0

    check-cast v0, LW8/n;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private static final synthetic o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, Lb9/h;->J:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method


# virtual methods
.method public c()Lm7/e;
    .locals 0

    return-object p0
.end method

.method public e()Lo7/e;
    .locals 2

    .prologue
    iget-object v0, p0, Lb9/h;->G:Lm7/e;

    instance-of v1, v0, Lo7/e;

    if-eqz v1, :cond_0

    check-cast v0, Lo7/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getContext()Lm7/i;
    .locals 1

    iget-object v0, p0, Lb9/h;->G:Lm7/e;

    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lb9/h;->H:Ljava/lang/Object;

    invoke-static {}, Lb9/i;->a()Lb9/D;

    move-result-object v1

    iput-object v1, p0, Lb9/h;->H:Ljava/lang/Object;

    return-object v0
.end method

.method public final j()V
    .locals 3

    .prologue
    invoke-static {}, Lb9/h;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lb9/i;->b:Lb9/D;

    if-eq v1, v2, :cond_0

    return-void
.end method

.method public final l()LW8/n;
    .locals 4

    .prologue
    invoke-static {}, Lb9/h;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {}, Lb9/h;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sget-object v1, Lb9/i;->b:Lb9/D;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0

    :cond_1
    instance-of v2, v1, LW8/n;

    if-eqz v2, :cond_2

    invoke-static {}, Lb9/h;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    sget-object v3, Lb9/i;->b:Lb9/D;

    invoke-static {v2, p0, v1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    check-cast v1, LW8/n;

    return-object v1

    :cond_2
    sget-object v2, Lb9/i;->b:Lb9/D;

    if-eq v1, v2, :cond_0

    instance-of v2, v1, Ljava/lang/Throwable;

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Inconsistent state "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m(Lm7/i;Ljava/lang/Object;)V
    .locals 0

    iput-object p2, p0, Lb9/h;->H:Ljava/lang/Object;

    const/4 p2, 0x1

    iput p2, p0, LW8/a0;->E:I

    iget-object p2, p0, Lb9/h;->F:LW8/J;

    invoke-virtual {p2, p1, p0}, LW8/J;->u1(Lm7/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final p()Z
    .locals 1

    .prologue
    invoke-static {}, Lb9/h;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final q(Ljava/lang/Throwable;)Z
    .locals 5

    .prologue
    invoke-static {}, Lb9/h;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lb9/i;->b:Lb9/D;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    invoke-static {}, Lb9/h;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {v1, p0, v2, p1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v4

    :cond_1
    instance-of v2, v1, Ljava/lang/Throwable;

    if-eqz v2, :cond_2

    return v4

    :cond_2
    invoke-static {}, Lb9/h;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, p0, v1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method public final r()V
    .locals 1

    .prologue
    invoke-virtual {p0}, Lb9/h;->j()V

    invoke-direct {p0}, Lb9/h;->n()LW8/n;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LW8/n;->q()V

    :cond_0
    return-void
.end method

.method public t(Ljava/lang/Object;)V
    .locals 5

    .prologue
    invoke-static {p1}, LW8/C;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lb9/h;->F:LW8/J;

    invoke-virtual {p0}, Lb9/h;->getContext()Lm7/i;

    move-result-object v2

    invoke-virtual {v1, v2}, LW8/J;->v1(Lm7/i;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iput-object v0, p0, Lb9/h;->H:Ljava/lang/Object;

    iput v2, p0, LW8/a0;->E:I

    iget-object p1, p0, Lb9/h;->F:LW8/J;

    invoke-virtual {p0}, Lb9/h;->getContext()Lm7/i;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, LW8/J;->t1(Lm7/i;Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_0
    sget-object v1, LW8/X0;->a:LW8/X0;

    invoke-virtual {v1}, LW8/X0;->b()LW8/j0;

    move-result-object v1

    invoke-virtual {v1}, LW8/j0;->G1()Z

    move-result v3

    if-eqz v3, :cond_1

    iput-object v0, p0, Lb9/h;->H:Ljava/lang/Object;

    iput v2, p0, LW8/a0;->E:I

    invoke-virtual {v1, p0}, LW8/j0;->C1(LW8/a0;)V

    goto :goto_2

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, LW8/j0;->E1(Z)V

    :try_start_0
    invoke-virtual {p0}, Lb9/h;->getContext()Lm7/i;

    move-result-object v2

    iget-object v3, p0, Lb9/h;->I:Ljava/lang/Object;

    invoke-static {v2, v3}, Lb9/K;->i(Lm7/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v4, p0, Lb9/h;->G:Lm7/e;

    invoke-interface {v4, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v2, v3}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v1}, LW8/j0;->J1()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p1, :cond_2

    :goto_0
    invoke-virtual {v1, v0}, LW8/j0;->z1(Z)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-static {v2, v3}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    :try_start_4
    invoke-virtual {p0, p1}, LW8/a0;->h(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_0

    :goto_2
    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v1, v0}, LW8/j0;->z1(Z)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DispatchedContinuation["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb9/h;->F:LW8/J;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb9/h;->G:Lm7/e;

    invoke-static {v1}, LW8/S;->c(Lm7/e;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(LW8/l;)Ljava/lang/Throwable;
    .locals 4

    .prologue
    invoke-static {}, Lb9/h;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lb9/i;->b:Lb9/D;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_1

    invoke-static {}, Lb9/h;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {v1, p0, v2, p1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v3

    :cond_1
    instance-of p1, v1, Ljava/lang/Throwable;

    if-eqz p1, :cond_3

    invoke-static {}, Lb9/h;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-static {p1, p0, v1, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    check-cast v1, Ljava/lang/Throwable;

    return-object v1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Inconsistent state "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
