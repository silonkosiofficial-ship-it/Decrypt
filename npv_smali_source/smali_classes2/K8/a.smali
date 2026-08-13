.class public abstract LK8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF8/E;)LF8/i0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/k0;

    invoke-direct {v0, p0}, LF8/k0;-><init>(LF8/E;)V

    return-object v0
.end method

.method public static final b(LF8/E;Lx7/l;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "predicate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LF8/q0;->c(LF8/E;Lx7/l;)Z

    move-result p0

    return p0
.end method

.method private static final c(LF8/E;LF8/e0;Ljava/util/Set;)Z
    .locals 6

    .prologue
    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->w()LO7/h;

    move-result-object v0

    instance-of v2, v0, LO7/i;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast v0, LO7/i;

    goto :goto_0

    :cond_1
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {v0}, LO7/i;->A()Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v3

    :goto_1
    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lj7/v;->a1(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object p0

    instance-of v2, p0, Ljava/util/Collection;

    const/4 v4, 0x0

    if-eqz v2, :cond_4

    move-object v2, p0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_3
    move v1, v4

    goto :goto_5

    :cond_4
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj7/L;

    invoke-virtual {v2}, Lj7/L;->a()I

    move-result v5

    invoke-virtual {v2}, Lj7/L;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/i0;

    if-eqz v0, :cond_6

    invoke-static {v0, v5}, Lj7/v;->l0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LO7/f0;

    goto :goto_2

    :cond_6
    move-object v5, v3

    :goto_2
    if-eqz v5, :cond_7

    if-eqz p2, :cond_7

    invoke-interface {p2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_3

    :cond_7
    invoke-interface {v2}, LF8/i0;->b()Z

    move-result v5

    if-eqz v5, :cond_8

    :goto_3
    move v2, v4

    goto :goto_4

    :cond_8
    invoke-interface {v2}, LF8/i0;->getType()LF8/E;

    move-result-object v2

    const-string v5, "getType(...)"

    invoke-static {v2, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, p1, p2}, LK8/a;->c(LF8/E;LF8/e0;Ljava/util/Set;)Z

    move-result v2

    :goto_4
    if-eqz v2, :cond_5

    :goto_5
    return v1
.end method

.method public static final d(LF8/E;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LK8/a$a;->D:LK8/a$a;

    invoke-static {p0, v0}, LK8/a;->b(LF8/E;Lx7/l;)Z

    move-result p0

    return p0
.end method

.method public static final e(LF8/E;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LK8/a$b;->D:LK8/a$b;

    invoke-static {p0, v0}, LF8/q0;->c(LF8/E;Lx7/l;)Z

    move-result p0

    return p0
.end method

.method public static final f(LF8/E;LF8/u0;LO7/f0;)LF8/i0;
    .locals 1

    .prologue
    const-string v0, "type"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "projectionKind"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/k0;

    if-eqz p2, :cond_0

    invoke-interface {p2}, LO7/f0;->s()LF8/u0;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-ne p2, p1, :cond_1

    sget-object p1, LF8/u0;->G:LF8/u0;

    :cond_1
    invoke-direct {v0, p1, p0}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    return-object v0
.end method

.method public static final g(LF8/E;Ljava/util/Set;)Ljava/util/Set;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {p0, p0, v0, p1}, LK8/a;->h(LF8/E;LF8/E;Ljava/util/Set;Ljava/util/Set;)V

    return-object v0
.end method

.method private static final h(LF8/E;LF8/E;Ljava/util/Set;Ljava/util/Set;)V
    .locals 6

    .prologue
    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->w()LO7/h;

    move-result-object v0

    instance-of v1, v0, LO7/f0;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object p0

    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object v1

    invoke-static {p0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :cond_0
    check-cast v0, LO7/f0;

    invoke-interface {v0}, LO7/f0;->getUpperBounds()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/E;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0, p1, p2, p3}, LK8/a;->h(LF8/E;LF8/E;Ljava/util/Set;Ljava/util/Set;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->w()LO7/h;

    move-result-object v0

    instance-of v1, v0, LO7/i;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, LO7/i;

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_3

    invoke-interface {v0}, LO7/i;->A()Ljava/util/List;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v2

    :goto_2
    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    add-int/lit8 v3, v1, 0x1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LF8/i0;

    if-eqz v0, :cond_4

    invoke-static {v0, v1}, Lj7/v;->l0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7/f0;

    goto :goto_4

    :cond_4
    move-object v1, v2

    :goto_4
    if-eqz v1, :cond_5

    if-eqz p3, :cond_5

    invoke-interface {p3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-interface {v4}, LF8/i0;->b()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_5

    :cond_6
    move-object v1, p2

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v4}, LF8/i0;->getType()LF8/E;

    move-result-object v5

    invoke-virtual {v5}, LF8/E;->W0()LF8/e0;

    move-result-object v5

    invoke-interface {v5}, LF8/e0;->w()LO7/h;

    move-result-object v5

    invoke-static {v1, v5}, Lj7/v;->Z(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-interface {v4}, LF8/i0;->getType()LF8/E;

    move-result-object v1

    invoke-virtual {v1}, LF8/E;->W0()LF8/e0;

    move-result-object v1

    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object v5

    invoke-static {v1, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_5

    :cond_7
    invoke-interface {v4}, LF8/i0;->getType()LF8/E;

    move-result-object v1

    const-string v4, "getType(...)"

    invoke-static {v1, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, p1, p2, p3}, LK8/a;->h(LF8/E;LF8/E;Ljava/util/Set;Ljava/util/Set;)V

    :cond_8
    :goto_5
    move v1, v3

    goto :goto_3

    :cond_9
    :goto_6
    return-void
.end method

.method public static final i(LF8/E;)LL7/g;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object p0

    invoke-interface {p0}, LF8/e0;->t()LL7/g;

    move-result-object p0

    const-string v0, "getBuiltIns(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final j(LO7/f0;)LF8/E;
    .locals 6

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LO7/f0;->getUpperBounds()Ljava/util/List;

    move-result-object v0

    const-string v1, "getUpperBounds(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    invoke-interface {p0}, LO7/f0;->getUpperBounds()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, LF8/E;

    invoke-virtual {v4}, LF8/E;->W0()LF8/e0;

    move-result-object v4

    invoke-interface {v4}, LF8/e0;->w()LO7/h;

    move-result-object v4

    instance-of v5, v4, LO7/e;

    if-eqz v5, :cond_1

    move-object v3, v4

    check-cast v3, LO7/e;

    :cond_1
    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v3}, LO7/e;->j()LO7/f;

    move-result-object v4

    sget-object v5, LO7/f;->E:LO7/f;

    if-eq v4, v5, :cond_0

    invoke-interface {v3}, LO7/e;->j()LO7/f;

    move-result-object v3

    sget-object v4, LO7/f;->H:LO7/f;

    if-eq v3, v4, :cond_0

    move-object v3, v2

    :cond_3
    check-cast v3, LF8/E;

    if-nez v3, :cond_4

    invoke-interface {p0}, LO7/f0;->getUpperBounds()Ljava/util/List;

    move-result-object p0

    invoke-static {p0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "first(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p0

    check-cast v3, LF8/E;

    :cond_4
    return-object v3
.end method

.method public static final k(LO7/f0;)Z
    .locals 2

    const-string v0, "typeParameter"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p0, v0, v0, v1, v0}, LK8/a;->m(LO7/f0;LF8/e0;Ljava/util/Set;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final l(LO7/f0;LF8/e0;Ljava/util/Set;)Z
    .locals 4

    .prologue
    const-string v0, "typeParameter"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LO7/f0;->getUpperBounds()Ljava/util/List;

    move-result-object v0

    const-string v1, "getUpperBounds(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/E;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p0}, LO7/h;->w()LF8/M;

    move-result-object v3

    invoke-virtual {v3}, LF8/E;->W0()LF8/e0;

    move-result-object v3

    invoke-static {v1, v3, p2}, LK8/a;->c(LF8/E;LF8/e0;Ljava/util/Set;)Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, LF8/E;->W0()LF8/e0;

    move-result-object v1

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    const/4 v2, 0x1

    :cond_3
    :goto_0
    return v2
.end method

.method public static synthetic m(LO7/f0;LF8/e0;Ljava/util/Set;ILjava/lang/Object;)Z
    .locals 1

    .prologue
    and-int/lit8 p4, p3, 0x2

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-static {p0, p1, p2}, LK8/a;->l(LO7/f0;LF8/e0;Ljava/util/Set;)Z

    move-result p0

    return p0
.end method

.method public static final n(LF8/E;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LL7/g;->f0(LF8/E;)Z

    move-result p0

    return p0
.end method

.method public static final o(LF8/E;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LL7/g;->n0(LF8/E;)Z

    move-result p0

    return p0
.end method

.method public static final p(LF8/E;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LF8/o;

    if-eqz v0, :cond_0

    check-cast p0, LF8/o;

    invoke-virtual {p0}, LF8/o;->i1()LF8/M;

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final q(LF8/E;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LF8/o;

    if-eqz v0, :cond_0

    check-cast p0, LF8/o;

    invoke-virtual {p0}, LF8/o;->i1()LF8/M;

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final r(LF8/E;LF8/E;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "superType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LG8/e;->a:LG8/e;

    invoke-interface {v0, p0, p1}, LG8/e;->d(LF8/E;LF8/E;)Z

    move-result p0

    return p0
.end method

.method public static final s(LO7/h;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LO7/f0;

    if-eqz v0, :cond_0

    check-cast p0, LO7/f0;

    invoke-interface {p0}, LO7/n;->b()LO7/m;

    move-result-object p0

    instance-of p0, p0, LO7/e0;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final t(LF8/E;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LF8/q0;->m(LF8/E;)Z

    move-result p0

    return p0
.end method

.method public static final u(LF8/E;)Z
    .locals 1

    .prologue
    const-string v0, "type"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LH8/h;

    if-eqz v0, :cond_0

    check-cast p0, LH8/h;

    invoke-virtual {p0}, LH8/h;->g1()LH8/j;

    move-result-object p0

    invoke-virtual {p0}, LH8/j;->i()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final v(LF8/E;)LF8/E;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LF8/q0;->n(LF8/E;)LF8/E;

    move-result-object p0

    const-string v0, "makeNotNullable(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final w(LF8/E;)LF8/E;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LF8/q0;->o(LF8/E;)LF8/E;

    move-result-object p0

    const-string v0, "makeNullable(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final x(LF8/E;LP7/g;)LF8/E;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newAnnotations"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->k()LP7/g;

    move-result-object v0

    invoke-interface {v0}, LP7/g;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LP7/g;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, LF8/E;->Z0()LF8/t0;

    move-result-object v0

    invoke-virtual {p0}, LF8/E;->V0()LF8/a0;

    move-result-object p0

    invoke-static {p0, p1}, LF8/b0;->a(LF8/a0;LP7/g;)LF8/a0;

    move-result-object p0

    invoke-virtual {v0, p0}, LF8/t0;->c1(LF8/a0;)LF8/t0;

    move-result-object p0

    return-object p0
.end method

.method public static final y(LF8/E;)LF8/E;
    .locals 10

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->Z0()LF8/t0;

    move-result-object p0

    instance-of v0, p0, LF8/y;

    const/4 v1, 0x2

    const/16 v2, 0xa

    const-string v3, "getParameters(...)"

    const/4 v4, 0x0

    if-eqz v0, :cond_6

    move-object v0, p0

    check-cast v0, LF8/y;

    invoke-virtual {v0}, LF8/y;->e1()LF8/M;

    move-result-object v5

    invoke-virtual {v5}, LF8/E;->W0()LF8/e0;

    move-result-object v6

    invoke-interface {v6}, LF8/e0;->x()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v5}, LF8/E;->W0()LF8/e0;

    move-result-object v6

    invoke-interface {v6}, LF8/e0;->w()LO7/h;

    move-result-object v6

    if-nez v6, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v5}, LF8/E;->W0()LF8/e0;

    move-result-object v6

    invoke-interface {v6}, LF8/e0;->x()Ljava/util/List;

    move-result-object v6

    invoke-static {v6, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v6, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LO7/f0;

    new-instance v9, LF8/T;

    invoke-direct {v9, v8}, LF8/T;-><init>(LO7/f0;)V

    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v5, v7, v4, v1, v4}, LF8/m0;->f(LF8/M;Ljava/util/List;LF8/a0;ILjava/lang/Object;)LF8/M;

    move-result-object v5

    :cond_2
    :goto_1
    invoke-virtual {v0}, LF8/y;->f1()LF8/M;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v6

    invoke-interface {v6}, LF8/e0;->x()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v6

    invoke-interface {v6}, LF8/e0;->w()LO7/h;

    move-result-object v6

    if-nez v6, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v6

    invoke-interface {v6}, LF8/e0;->x()Ljava/util/List;

    move-result-object v6

    invoke-static {v6, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v6, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LO7/f0;

    new-instance v7, LF8/T;

    invoke-direct {v7, v6}, LF8/T;-><init>(LO7/f0;)V

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-static {v0, v3, v4, v1, v4}, LF8/m0;->f(LF8/M;Ljava/util/List;LF8/a0;ILjava/lang/Object;)LF8/M;

    move-result-object v0

    :cond_5
    :goto_3
    invoke-static {v5, v0}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object v0

    goto :goto_5

    :cond_6
    instance-of v0, p0, LF8/M;

    if-eqz v0, :cond_a

    move-object v0, p0

    check-cast v0, LF8/M;

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v5

    invoke-interface {v5}, LF8/e0;->x()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v5

    invoke-interface {v5}, LF8/e0;->w()LO7/h;

    move-result-object v5

    if-nez v5, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v5

    invoke-interface {v5}, LF8/e0;->x()Ljava/util/List;

    move-result-object v5

    invoke-static {v5, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v5, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LO7/f0;

    new-instance v6, LF8/T;

    invoke-direct {v6, v5}, LF8/T;-><init>(LO7/f0;)V

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    invoke-static {v0, v3, v4, v1, v4}, LF8/m0;->f(LF8/M;Ljava/util/List;LF8/a0;ILjava/lang/Object;)LF8/M;

    move-result-object v0

    :cond_9
    :goto_5
    invoke-static {v0, p0}, LF8/s0;->b(LF8/t0;LF8/E;)LF8/t0;

    move-result-object p0

    return-object p0

    :cond_a
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0
.end method

.method public static final z(LF8/E;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LK8/a$c;->D:LK8/a$c;

    invoke-static {p0, v0}, LK8/a;->b(LF8/E;Lx7/l;)Z

    move-result p0

    return p0
.end method
