.class public abstract Landroidx/lifecycle/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/lifecycle/k;)Landroidx/lifecycle/l;
    .locals 4

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/lifecycle/k;->c()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/m;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Landroidx/lifecycle/m;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v1, v2}, LW8/U0;->b(LW8/z0;ILjava/lang/Object;)LW8/y;

    move-result-object v1

    invoke-static {}, LW8/d0;->c()LW8/J0;

    move-result-object v3

    invoke-virtual {v3}, LW8/J0;->z1()LW8/J0;

    move-result-object v3

    invoke-interface {v1, v3}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/m;-><init>(Landroidx/lifecycle/k;Lm7/i;)V

    invoke-virtual {p0}, Landroidx/lifecycle/k;->c()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-static {v1, v2, v0}, Lu/c0;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/lifecycle/m;->b()V

    return-object v0
.end method
