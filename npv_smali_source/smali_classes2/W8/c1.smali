.class public final LW8/c1;
.super Lb9/z;
.source "SourceFile"


# instance fields
.field private final G:Ljava/lang/ThreadLocal;

.field private volatile threadLocalIsSet:Z


# direct methods
.method public constructor <init>(Lm7/i;Lm7/e;)V
    .locals 2

    .prologue
    sget-object v0, LW8/d1;->C:LW8/d1;

    invoke-interface {p1, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-interface {p1, v0}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {p0, v0, p2}, Lb9/z;-><init>(Lm7/i;Lm7/e;)V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, LW8/c1;->G:Ljava/lang/ThreadLocal;

    invoke-interface {p2}, Lm7/e;->getContext()Lm7/i;

    move-result-object p2

    sget-object v0, Lm7/f;->A:Lm7/f$b;

    invoke-interface {p2, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p2

    instance-of p2, p2, LW8/J;

    if-nez p2, :cond_1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lb9/K;->i(Lm7/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, LW8/c1;->n1(Lm7/i;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method protected g1(Ljava/lang/Object;)V
    .locals 5

    .prologue
    iget-boolean v0, p0, LW8/c1;->threadLocalIsSet:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LW8/c1;->G:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li7/u;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm7/i;

    invoke-virtual {v0}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, LW8/c1;->G:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    :cond_1
    iget-object v0, p0, Lb9/z;->F:Lm7/e;

    invoke-static {p1, v0}, LW8/C;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lb9/z;->F:Lm7/e;

    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lb9/K;->i(Lm7/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lb9/K;->a:Lb9/D;

    if-eq v3, v4, :cond_2

    invoke-static {v0, v1, v3}, LW8/H;->m(Lm7/e;Lm7/i;Ljava/lang/Object;)LW8/c1;

    move-result-object v2

    :cond_2
    :try_start_0
    iget-object v0, p0, Lb9/z;->F:Lm7/e;

    invoke-interface {v0, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    invoke-virtual {v2}, LW8/c1;->k1()Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    invoke-static {v1, v3}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_5

    invoke-virtual {v2}, LW8/c1;->k1()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    invoke-static {v1, v3}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V

    :cond_6
    throw p1
.end method

.method public final k1()Z
    .locals 3

    .prologue
    iget-boolean v0, p0, LW8/c1;->threadLocalIsSet:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LW8/c1;->G:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, LW8/c1;->G:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    xor-int/2addr v0, v1

    return v0
.end method

.method public final n1(Lm7/i;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LW8/c1;->threadLocalIsSet:Z

    iget-object v0, p0, LW8/c1;->G:Ljava/lang/ThreadLocal;

    invoke-static {p1, p2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
