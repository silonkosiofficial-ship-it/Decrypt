.class public abstract LY8/k;
.super LW8/a;
.source "SourceFile"

# interfaces
.implements LY8/j;


# instance fields
.field private final F:LY8/j;


# direct methods
.method public constructor <init>(Lm7/i;LY8/j;ZZ)V
    .locals 0

    invoke-direct {p0, p1, p3, p4}, LW8/a;-><init>(Lm7/i;ZZ)V

    iput-object p2, p0, LY8/k;->F:LY8/j;

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Throwable;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, p1, v0, v1, v0}, LW8/F0;->T0(LW8/F0;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    iget-object v0, p0, LY8/k;->F:LY8/j;

    invoke-interface {v0, p1}, LY8/B;->o(Ljava/util/concurrent/CancellationException;)V

    invoke-virtual {p0, p1}, LW8/F0;->x(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LY8/k;->F:LY8/j;

    invoke-interface {v0}, LY8/B;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public b(Lm7/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LY8/k;->F:LY8/j;

    invoke-interface {v0, p1}, LY8/B;->b(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, LY8/k;->F:LY8/j;

    invoke-interface {v0, p1}, LY8/C;->c(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public d(Lx7/l;)V
    .locals 1

    iget-object v0, p0, LY8/k;->F:LY8/j;

    invoke-interface {v0, p1}, LY8/C;->d(Lx7/l;)V

    return-void
.end method

.method public h(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LY8/k;->F:LY8/j;

    invoke-interface {v0, p1, p2}, LY8/C;->h(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public iterator()LY8/l;
    .locals 1

    iget-object v0, p0, LY8/k;->F:LY8/j;

    invoke-interface {v0}, LY8/B;->iterator()LY8/l;

    move-result-object v0

    return-object v0
.end method

.method public j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LY8/k;->F:LY8/j;

    invoke-interface {v0, p1}, LY8/C;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected final k1()LY8/j;
    .locals 1

    iget-object v0, p0, LY8/k;->F:LY8/j;

    return-object v0
.end method

.method public l(Lm7/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LY8/k;->F:LY8/j;

    invoke-interface {v0, p1}, LY8/B;->l(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    return-object p1
.end method

.method public m()Z
    .locals 1

    iget-object v0, p0, LY8/k;->F:LY8/j;

    invoke-interface {v0}, LY8/C;->m()Z

    move-result v0

    return v0
.end method

.method public final o(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, LW8/F0;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    new-instance p1, LW8/A0;

    invoke-static {p0}, LW8/F0;->n(LW8/F0;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, LW8/A0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LW8/z0;)V

    :cond_1
    invoke-virtual {p0, p1}, LY8/k;->A(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final s0()LY8/j;
    .locals 0

    return-object p0
.end method
