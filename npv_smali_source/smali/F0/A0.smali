.class public abstract LF0/A0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LK0/k;)Z
    .locals 1

    .prologue
    sget-object v0, LK0/j;->a:LK0/j;

    invoke-virtual {v0}, LK0/j;->k()LK0/v;

    move-result-object v0

    invoke-static {p0, v0}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b(LF0/z0;)V
    .locals 0

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object p0

    invoke-virtual {p0}, LF0/J;->I0()V

    return-void
.end method

.method public static final c(Landroidx/compose/ui/d$c;Z)Ln0/i;
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, Ln0/i;->e:Ln0/i$a;

    invoke-virtual {p0}, Ln0/i$a;->a()Ln0/i;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 v0, 0x8

    if-nez p1, :cond_1

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result p1

    invoke-static {p0, p1}, LF0/k;->h(LF0/j;I)LF0/d0;

    move-result-object p0

    invoke-static {p0}, LD0/u;->b(LD0/t;)Ln0/i;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {v0}, LF0/f0;->a(I)I

    move-result p1

    invoke-static {p0, p1}, LF0/k;->h(LF0/j;I)LF0/d0;

    move-result-object p0

    invoke-virtual {p0}, LF0/d0;->Z2()Ln0/i;

    move-result-object p0

    return-object p0
.end method
