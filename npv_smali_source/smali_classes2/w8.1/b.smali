.class public abstract Lw8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(LO7/e;)Z
    .locals 1

    invoke-static {p0}, Lv8/c;->l(LO7/m;)Ln8/c;

    move-result-object p0

    sget-object v0, LL7/j;->u:Ln8/c;

    invoke-static {p0, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final b(LF8/E;Z)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object p0

    invoke-interface {p0}, LF8/e0;->w()LO7/h;

    move-result-object p0

    instance-of v0, p0, LO7/f0;

    if-eqz v0, :cond_0

    check-cast p0, LO7/f0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p0, :cond_1

    return v0

    :cond_1
    if-nez p1, :cond_2

    invoke-static {p0}, Lr8/h;->d(LO7/m;)Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    invoke-static {p0}, LK8/a;->j(LO7/f0;)LF8/E;

    move-result-object p0

    invoke-static {p0}, Lw8/b;->e(LF8/E;)Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    :cond_3
    return v0
.end method

.method public static final c(LF8/E;)Z
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->w()LO7/h;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lr8/h;->b(LO7/m;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0}, Lw8/b;->d(LO7/m;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {p0}, Lr8/h;->i(LF8/E;)Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public static final d(LO7/m;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lr8/h;->g(LO7/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p0, LO7/e;

    invoke-static {p0}, Lw8/b;->a(LO7/e;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final e(LF8/E;)Z
    .locals 2

    .prologue
    invoke-static {p0}, Lw8/b;->c(LF8/E;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-static {p0, v1}, Lw8/b;->b(LF8/E;Z)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public static final f(LO7/b;)Z
    .locals 3

    .prologue
    const-string v0, "descriptor"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LO7/d;

    if-eqz v0, :cond_0

    check-cast p0, LO7/d;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p0, :cond_1

    return v0

    :cond_1
    invoke-interface {p0}, LO7/C;->h()LO7/u;

    move-result-object v1

    invoke-static {v1}, LO7/t;->g(LO7/u;)Z

    move-result v1

    if-eqz v1, :cond_2

    return v0

    :cond_2
    invoke-interface {p0}, LO7/l;->H()LO7/e;

    move-result-object v1

    const-string v2, "getConstructedClass(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lr8/h;->g(LO7/m;)Z

    move-result v1

    if-eqz v1, :cond_3

    return v0

    :cond_3
    invoke-interface {p0}, LO7/l;->H()LO7/e;

    move-result-object v1

    invoke-static {v1}, Lr8/f;->G(LO7/m;)Z

    move-result v1

    if-eqz v1, :cond_4

    return v0

    :cond_4
    invoke-interface {p0}, LO7/a;->n()Ljava/util/List;

    move-result-object p0

    const-string v1, "getValueParameters(...)"

    invoke-static {p0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    instance-of v1, p0, Ljava/util/Collection;

    if-eqz v1, :cond_5

    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_1

    :cond_5
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7/j0;

    invoke-interface {v1}, LO7/i0;->getType()LF8/E;

    move-result-object v1

    const-string v2, "getType(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lw8/b;->e(LF8/E;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v0, 0x1

    :cond_7
    :goto_1
    return v0
.end method
