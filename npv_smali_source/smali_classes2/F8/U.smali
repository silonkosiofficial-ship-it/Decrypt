.class public abstract LF8/U;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Ljava/util/List;Ljava/util/List;LL7/g;)LF8/E;
    .locals 1

    .prologue
    new-instance v0, LF8/U$a;

    invoke-direct {v0, p0}, LF8/U$a;-><init>(Ljava/util/List;)V

    invoke-static {v0}, LF8/n0;->g(LF8/l0;)LF8/n0;

    move-result-object p0

    invoke-static {p1}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF8/E;

    sget-object v0, LF8/u0;->I:LF8/u0;

    invoke-virtual {p0, p1, v0}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-virtual {p2}, LL7/g;->y()LF8/M;

    move-result-object p0

    :cond_0
    invoke-static {p0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final b(LO7/f0;)LF8/E;
    .locals 5

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LO7/n;->b()LO7/m;

    move-result-object v0

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, LO7/i;

    const-string v2, "getUpperBounds(...)"

    const-string v3, "getTypeConstructor(...)"

    const/16 v4, 0xa

    if-eqz v1, :cond_1

    check-cast v0, LO7/i;

    invoke-interface {v0}, LO7/h;->p()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->x()Ljava/util/List;

    move-result-object v0

    const-string v1, "getParameters(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO7/f0;

    invoke-interface {v4}, LO7/f0;->p()LF8/e0;

    move-result-object v4

    invoke-static {v4, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LO7/f0;->getUpperBounds()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lv8/c;->j(LO7/m;)LL7/g;

    move-result-object p0

    invoke-static {v1, v0, p0}, LF8/U;->a(Ljava/util/List;Ljava/util/List;LL7/g;)LF8/E;

    move-result-object p0

    goto :goto_2

    :cond_1
    instance-of v1, v0, LO7/y;

    if-eqz v1, :cond_2

    check-cast v0, LO7/y;

    invoke-interface {v0}, LO7/a;->g()Ljava/util/List;

    move-result-object v0

    const-string v1, "getTypeParameters(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO7/f0;

    invoke-interface {v4}, LO7/f0;->p()LF8/e0;

    move-result-object v4

    invoke-static {v4, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :goto_2
    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported descriptor type to build star projection type based on type parameters of it"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
