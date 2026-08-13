.class public abstract LO7/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LO7/m;)LO7/h;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LO7/m;->b()LO7/m;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    instance-of p0, p0, LO7/K;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, LO7/s;->b(LO7/m;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-static {v0}, LO7/s;->a(LO7/m;)LO7/h;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of p0, v0, LO7/h;

    if-eqz p0, :cond_2

    move-object v1, v0

    check-cast v1, LO7/h;

    :cond_2
    :goto_0
    return-object v1
.end method

.method public static final b(LO7/m;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LO7/m;->b()LO7/m;

    move-result-object p0

    instance-of p0, p0, LO7/K;

    return p0
.end method

.method public static final c(LO7/y;)Z
    .locals 5

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LO7/y;->b()LO7/m;

    move-result-object v0

    instance-of v1, v0, LO7/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, LO7/e;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-static {v0}, Lr8/h;->g(LO7/m;)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v2, v0

    :cond_1
    if-eqz v2, :cond_5

    invoke-interface {v2}, LO7/e;->w()LF8/M;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0}, LK8/a;->y(LF8/E;)LF8/E;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p0}, LO7/a;->l()LF8/E;

    move-result-object v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    invoke-interface {p0}, LO7/I;->getName()Ln8/f;

    move-result-object v3

    sget-object v4, LM8/q;->e:Ln8/f;

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v2}, LK8/a;->n(LF8/E;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v2}, LK8/a;->o(LF8/E;)Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    invoke-interface {p0}, LO7/a;->n()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_5

    invoke-interface {p0}, LO7/a;->n()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/j0;

    invoke-interface {v2}, LO7/i0;->getType()LF8/E;

    move-result-object v2

    const-string v4, "getType(...)"

    invoke-static {v2, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, LK8/a;->y(LF8/E;)LF8/E;

    move-result-object v2

    invoke-static {v2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, LO7/a;->A0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, LO7/a;->v0()LO7/X;

    move-result-object p0

    if-nez p0, :cond_5

    move v1, v3

    :cond_5
    :goto_1
    return v1
.end method

.method public static final d(LO7/G;Ln8/c;LW7/b;)LO7/e;
    .locals 5

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupLocation"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ln8/c;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Ln8/c;->e()Ln8/c;

    move-result-object v0

    const-string v2, "parent(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0}, LO7/G;->s0(Ln8/c;)LO7/P;

    move-result-object v0

    invoke-interface {v0}, LO7/P;->u()Ly8/h;

    move-result-object v0

    invoke-virtual {p1}, Ln8/c;->g()Ln8/f;

    move-result-object v3

    const-string v4, "shortName(...)"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v3, p2}, Ly8/k;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object v0

    instance-of v3, v0, LO7/e;

    if-eqz v3, :cond_1

    check-cast v0, LO7/e;

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    invoke-virtual {p1}, Ln8/c;->e()Ln8/c;

    move-result-object v0

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v0, p2}, LO7/s;->d(LO7/G;Ln8/c;LW7/b;)LO7/e;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-interface {p0}, LO7/e;->H0()Ly8/h;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p1}, Ln8/c;->g()Ln8/f;

    move-result-object p1

    invoke-static {p1, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Ly8/k;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object p0

    goto :goto_1

    :cond_3
    move-object p0, v1

    :goto_1
    instance-of p1, p0, LO7/e;

    if-eqz p1, :cond_4

    move-object v1, p0

    check-cast v1, LO7/e;

    :cond_4
    return-object v1
.end method
