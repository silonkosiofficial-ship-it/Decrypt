.class public abstract LF0/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/d$c;Lx7/a;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->w1()LF0/k0;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LF0/k0;

    move-object v1, p0

    check-cast v1, LF0/i0;

    invoke-direct {v0, v1}, LF0/k0;-><init>(LF0/i0;)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/d$c;->O1(LF0/k0;)V

    :cond_0
    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object p0

    invoke-interface {p0}, LF0/o0;->getSnapshotObserver()LF0/q0;

    move-result-object p0

    sget-object v1, LF0/k0;->D:LF0/k0$b;

    invoke-virtual {v1}, LF0/k0$b;->a()Lx7/l;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, LF0/q0;->i(LF0/p0;Lx7/l;Lx7/a;)V

    return-void
.end method
