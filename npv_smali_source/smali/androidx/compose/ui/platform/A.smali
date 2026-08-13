.class public abstract Landroidx/compose/ui/platform/A;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LK0/a;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/ui/platform/A;->g(LK0/a;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(LK0/o;)Z
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/A;->h(LK0/o;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(LK0/o;)Z
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/A;->i(LK0/o;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic d(LF0/J;Lx7/l;)LF0/J;
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/ui/platform/A;->j(LF0/J;Lx7/l;)LF0/J;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(LK0/o;)Z
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/A;->k(LK0/o;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic f(LK0/o;LK0/k;)Z
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/ui/platform/A;->l(LK0/o;LK0/k;)Z

    move-result p0

    return p0
.end method

.method private static final g(LK0/a;Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LK0/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, LK0/a;->b()Ljava/lang/String;

    move-result-object v1

    check-cast p1, LK0/a;

    invoke-virtual {p1}, LK0/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, LK0/a;->a()Li7/i;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-virtual {p1}, LK0/a;->a()Li7/i;

    move-result-object v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, LK0/a;->a()Li7/i;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p1}, LK0/a;->a()Li7/i;

    move-result-object p0

    if-nez p0, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method private static final h(LK0/o;)Z
    .locals 1

    invoke-virtual {p0}, LK0/o;->n()LK0/k;

    move-result-object p0

    sget-object v0, LK0/r;->a:LK0/r;

    invoke-virtual {v0}, LK0/r;->f()LK0/v;

    move-result-object v0

    invoke-virtual {p0, v0}, LK0/k;->f(LK0/v;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final i(LK0/o;)Z
    .locals 4

    .prologue
    invoke-virtual {p0}, LK0/o;->w()LK0/k;

    move-result-object v0

    sget-object v1, LK0/r;->a:LK0/r;

    invoke-virtual {v1}, LK0/r;->g()LK0/v;

    move-result-object v2

    invoke-virtual {v0, v2}, LK0/k;->f(LK0/v;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LK0/o;->w()LK0/k;

    move-result-object v0

    invoke-virtual {v1}, LK0/r;->i()LK0/v;

    move-result-object v3

    invoke-static {v0, v3}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, LK0/o;->q()LF0/J;

    move-result-object p0

    sget-object v0, Landroidx/compose/ui/platform/A$a;->D:Landroidx/compose/ui/platform/A$a;

    invoke-static {p0, v0}, Landroidx/compose/ui/platform/A;->j(LF0/J;Lx7/l;)LF0/J;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, LF0/J;->I()LK0/k;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {v1}, LK0/r;->i()LK0/v;

    move-result-object v1

    invoke-static {p0, v1}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object p0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    goto :goto_0

    :cond_1
    move p0, v0

    :goto_0
    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    move v2, v0

    :goto_1
    return v2
.end method

.method private static final j(LF0/J;Lx7/l;)LF0/J;
    .locals 1

    .prologue
    :cond_0
    invoke-virtual {p0}, LF0/J;->o0()LF0/J;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p1, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final k(LK0/o;)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LK0/o;->p()LD0/x;

    move-result-object p0

    invoke-interface {p0}, LD0/x;->getLayoutDirection()LY0/v;

    move-result-object p0

    sget-object v0, LY0/v;->D:LY0/v;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final l(LK0/o;LK0/k;)Z
    .locals 2

    .prologue
    invoke-virtual {p1}, LK0/k;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p0}, LK0/o;->n()LK0/k;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK0/v;

    invoke-virtual {v1, v0}, LK0/k;->f(LK0/v;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
