.class public abstract LF8/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF8/E;)LF8/a;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->Z0()LF8/t0;

    move-result-object p0

    instance-of v0, p0, LF8/a;

    if-eqz v0, :cond_0

    check-cast p0, LF8/a;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final b(LF8/E;)LF8/M;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LF8/Q;->a(LF8/E;)LF8/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LF8/a;->i1()LF8/M;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final c(LF8/E;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->Z0()LF8/t0;

    move-result-object p0

    instance-of p0, p0, LF8/o;

    return p0
.end method

.method private static final d(LF8/D;)LF8/D;
    .locals 8

    .prologue
    invoke-virtual {p0}, LF8/D;->u()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LF8/E;

    invoke-static {v4}, LF8/q0;->l(LF8/E;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v4}, LF8/E;->Z0()LF8/t0;

    move-result-object v3

    invoke-static {v3, v2, v5, v6}, LF8/Q;->f(LF8/t0;ZILjava/lang/Object;)LF8/t0;

    move-result-object v4

    move v3, v5

    :cond_0
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, LF8/D;->d()LF8/E;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-static {p0}, LF8/q0;->l(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LF8/E;->Z0()LF8/t0;

    move-result-object p0

    invoke-static {p0, v2, v5, v6}, LF8/Q;->f(LF8/t0;ZILjava/lang/Object;)LF8/t0;

    move-result-object p0

    :cond_3
    move-object v6, p0

    :cond_4
    new-instance p0, LF8/D;

    invoke-direct {p0, v1}, LF8/D;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v6}, LF8/D;->h(LF8/E;)LF8/D;

    move-result-object v6

    :goto_1
    return-object v6
.end method

.method public static final e(LF8/t0;Z)LF8/t0;
    .locals 7

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LF8/o;->F:LF8/o$a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    move v3, p1

    invoke-static/range {v1 .. v6}, LF8/o$a;->c(LF8/o$a;LF8/t0;ZZILjava/lang/Object;)LF8/o;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LF8/Q;->g(LF8/E;)LF8/M;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LF8/t0;->a1(Z)LF8/t0;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public static synthetic f(LF8/t0;ZILjava/lang/Object;)LF8/t0;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LF8/Q;->e(LF8/t0;Z)LF8/t0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LF8/E;)LF8/M;
    .locals 2

    .prologue
    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object p0

    instance-of v0, p0, LF8/D;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, LF8/D;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-nez p0, :cond_1

    return-object v1

    :cond_1
    invoke-static {p0}, LF8/Q;->d(LF8/D;)LF8/D;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {p0}, LF8/D;->c()LF8/M;

    move-result-object p0

    return-object p0
.end method

.method public static final h(LF8/M;Z)LF8/M;
    .locals 7

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LF8/o;->F:LF8/o$a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    move v3, p1

    invoke-static/range {v1 .. v6}, LF8/o$a;->c(LF8/o$a;LF8/t0;ZZILjava/lang/Object;)LF8/o;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LF8/Q;->g(LF8/E;)LF8/M;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LF8/M;->d1(Z)LF8/M;

    move-result-object p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method public static synthetic i(LF8/M;ZILjava/lang/Object;)LF8/M;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LF8/Q;->h(LF8/M;Z)LF8/M;

    move-result-object p0

    return-object p0
.end method

.method public static final j(LF8/M;LF8/M;)LF8/M;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "abbreviatedType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LF8/G;->a(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, LF8/a;

    invoke-direct {v0, p0, p1}, LF8/a;-><init>(LF8/M;LF8/M;)V

    return-object v0
.end method

.method public static final k(LG8/i;)LG8/i;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LG8/i;

    invoke-virtual {p0}, LG8/i;->f1()LJ8/b;

    move-result-object v2

    invoke-virtual {p0}, LG8/i;->g1()LG8/j;

    move-result-object v3

    invoke-virtual {p0}, LG8/i;->h1()LF8/t0;

    move-result-object v4

    invoke-virtual {p0}, LG8/i;->V0()LF8/a0;

    move-result-object v5

    invoke-virtual {p0}, LG8/i;->X0()Z

    move-result v6

    const/4 v7, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LG8/i;-><init>(LJ8/b;LG8/j;LF8/t0;LF8/a0;ZZ)V

    return-object v0
.end method
