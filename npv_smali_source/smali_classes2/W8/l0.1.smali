.class public abstract LW8/l0;
.super LW8/j0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LW8/j0;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract L1()Ljava/lang/Thread;
.end method

.method protected M1(JLW8/k0$c;)V
    .locals 1

    sget-object v0, LW8/T;->K:LW8/T;

    invoke-virtual {v0, p1, p2, p3}, LW8/k0;->a2(JLW8/k0$c;)V

    return-void
.end method

.method protected final N1()V
    .locals 2

    .prologue
    invoke-virtual {p0}, LW8/l0;->L1()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v1, v0, :cond_0

    invoke-static {}, LW8/c;->a()LW8/b;

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
