.class public abstract LF0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LX/b;Landroidx/compose/ui/d$c;)V
    .locals 0

    invoke-static {p0, p1}, LF0/k;->c(LX/b;Landroidx/compose/ui/d$c;)V

    return-void
.end method

.method public static final synthetic b(LX/b;)Landroidx/compose/ui/d$c;
    .locals 0

    invoke-static {p0}, LF0/k;->g(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LX/b;Landroidx/compose/ui/d$c;)V
    .locals 2

    .prologue
    invoke-static {p1}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object p1

    invoke-virtual {p1}, LF0/J;->w0()LX/b;

    move-result-object p1

    invoke-virtual {p1}, LX/b;->t()I

    move-result v0

    if-lez v0, :cond_1

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1}, LX/b;->s()[Ljava/lang/Object;

    move-result-object p1

    :cond_0
    aget-object v1, p1, v0

    check-cast v1, LF0/J;

    invoke-virtual {v1}, LF0/J;->k0()LF0/b0;

    move-result-object v1

    invoke-virtual {v1}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-virtual {p0, v1}, LX/b;->d(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, -0x1

    if-gez v0, :cond_0

    :cond_1
    return-void
.end method

.method public static final d(Landroidx/compose/ui/d$c;)LF0/E;
    .locals 4

    .prologue
    const/4 v0, 0x2

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v2

    and-int/2addr v1, v2

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    instance-of v1, p0, LF0/E;

    if-eqz v1, :cond_0

    check-cast p0, LF0/E;

    return-object p0

    :cond_0
    instance-of v1, p0, LF0/m;

    if-eqz v1, :cond_3

    :goto_0
    check-cast p0, LF0/m;

    invoke-virtual {p0}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object p0

    :goto_1
    if-eqz p0, :cond_3

    instance-of v1, p0, LF0/E;

    if-eqz v1, :cond_1

    check-cast p0, LF0/E;

    return-object p0

    :cond_1
    instance-of v1, p0, LF0/m;

    if-eqz v1, :cond_2

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v3

    and-int/2addr v1, v3

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object p0

    goto :goto_1

    :cond_3
    return-object v2
.end method

.method public static final e(LF0/j;I)Z
    .locals 0

    .prologue
    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->q1()I

    move-result p0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final f(LF0/j;)Z
    .locals 1

    .prologue
    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final g(LX/b;)Landroidx/compose/ui/d$c;
    .locals 1

    .prologue
    if-eqz p0, :cond_1

    invoke-virtual {p0}, LX/b;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LX/b;->t()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, LX/b;->D(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/d$c;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    :goto_1
    return-object p0
.end method

.method public static final h(LF0/j;I)LF0/d0;
    .locals 2

    .prologue
    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->s1()LF0/d0;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LF0/d0;->n2()Landroidx/compose/ui/d$c;

    move-result-object v1

    if-eq v1, p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, LF0/g0;->i(I)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {v0}, LF0/d0;->o2()LF0/d0;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static final i(LF0/j;)LY0/e;
    .locals 0

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object p0

    invoke-virtual {p0}, LF0/J;->K()LY0/e;

    move-result-object p0

    return-object p0
.end method

.method public static final j(LF0/j;)Lo0/C1;
    .locals 0

    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object p0

    invoke-interface {p0}, LF0/o0;->getGraphicsContext()Lo0/C1;

    move-result-object p0

    return-object p0
.end method

.method public static final k(LF0/j;)LD0/t;
    .locals 1

    .prologue
    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Cannot get LayoutCoordinates, Modifier.Node is not attached."

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-static {p0, v0}, LF0/k;->h(LF0/j;I)LF0/d0;

    move-result-object p0

    invoke-virtual {p0}, LF0/d0;->m1()LD0/t;

    move-result-object p0

    invoke-interface {p0}, LD0/t;->K()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "LayoutCoordinates is not attached."

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    return-object p0
.end method

.method public static final l(LF0/j;)LY0/v;
    .locals 0

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object p0

    invoke-virtual {p0}, LF0/J;->getLayoutDirection()LY0/v;

    move-result-object p0

    return-object p0
.end method

.method public static final m(LF0/j;)LF0/J;
    .locals 0

    .prologue
    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->s1()LF0/d0;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LF0/d0;->o1()LF0/J;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "Cannot obtain node coordinator. Is the Modifier.Node attached?"

    invoke-static {p0}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p0, Li7/k;

    invoke-direct {p0}, Li7/k;-><init>()V

    throw p0
.end method

.method public static final n(LF0/j;)LF0/o0;
    .locals 0

    .prologue
    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object p0

    invoke-virtual {p0}, LF0/J;->n0()LF0/o0;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "This node does not have an owner."

    invoke-static {p0}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p0, Li7/k;

    invoke-direct {p0}, Li7/k;-><init>()V

    throw p0
.end method
