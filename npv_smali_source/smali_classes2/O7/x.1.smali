.class public abstract LO7/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LO7/G;Ln8/b;)LO7/e;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LO7/x;->b(LO7/G;Ln8/b;)LO7/h;

    move-result-object p0

    instance-of p1, p0, LO7/e;

    if-eqz p1, :cond_0

    check-cast p0, LO7/e;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final b(LO7/G;Ln8/b;)LO7/h;
    .locals 9

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lr8/o;->a(LO7/G;)LO7/G;

    move-result-object v0

    const/4 v1, 0x1

    const-string v2, "first(...)"

    const-string v3, "pathSegments(...)"

    const-string v4, "getPackageFqName(...)"

    const/4 v5, 0x0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Ln8/b;->h()Ln8/c;

    move-result-object v0

    invoke-static {v0, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0}, LO7/G;->s0(Ln8/c;)LO7/P;

    move-result-object p0

    invoke-virtual {p1}, Ln8/b;->i()Ln8/c;

    move-result-object p1

    invoke-virtual {p1}, Ln8/c;->f()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LO7/P;->u()Ly8/h;

    move-result-object p0

    invoke-static {p1}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ln8/f;

    sget-object v2, LW7/d;->T:LW7/d;

    invoke-interface {p0, v0, v2}, Ly8/k;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object p0

    if-nez p0, :cond_0

    goto/16 :goto_8

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln8/f;

    instance-of v1, p0, LO7/e;

    if-nez v1, :cond_1

    goto/16 :goto_8

    :cond_1
    check-cast p0, LO7/e;

    invoke-interface {p0}, LO7/e;->H0()Ly8/h;

    move-result-object p0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v1, LW7/d;->T:LW7/d;

    invoke-interface {p0, v0, v1}, Ly8/k;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object p0

    instance-of v0, p0, LO7/e;

    if-eqz v0, :cond_2

    check-cast p0, LO7/e;

    goto :goto_1

    :cond_2
    move-object p0, v5

    :goto_1
    if-eqz p0, :cond_e

    goto :goto_0

    :cond_3
    move-object v5, p0

    goto/16 :goto_8

    :cond_4
    invoke-virtual {p1}, Ln8/b;->h()Ln8/c;

    move-result-object v6

    invoke-static {v6, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v6}, LO7/G;->s0(Ln8/c;)LO7/P;

    move-result-object v0

    invoke-virtual {p1}, Ln8/b;->i()Ln8/c;

    move-result-object v6

    invoke-virtual {v6}, Ln8/c;->f()Ljava/util/List;

    move-result-object v6

    invoke-static {v6, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, LO7/P;->u()Ly8/h;

    move-result-object v0

    invoke-static {v6}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ln8/f;

    sget-object v8, LW7/d;->T:LW7/d;

    invoke-interface {v0, v7, v8}, Ly8/k;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object v0

    if-nez v0, :cond_6

    :cond_5
    :goto_2
    move-object v0, v5

    goto :goto_5

    :cond_6
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    invoke-interface {v6, v1, v7}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ln8/f;

    instance-of v8, v0, LO7/e;

    if-nez v8, :cond_7

    goto :goto_2

    :cond_7
    check-cast v0, LO7/e;

    invoke-interface {v0}, LO7/e;->H0()Ly8/h;

    move-result-object v0

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v8, LW7/d;->T:LW7/d;

    invoke-interface {v0, v7, v8}, Ly8/k;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object v0

    instance-of v7, v0, LO7/e;

    if-eqz v7, :cond_8

    check-cast v0, LO7/e;

    goto :goto_4

    :cond_8
    move-object v0, v5

    :goto_4
    if-eqz v0, :cond_5

    goto :goto_3

    :cond_9
    :goto_5
    if-nez v0, :cond_d

    invoke-virtual {p1}, Ln8/b;->h()Ln8/c;

    move-result-object v0

    invoke-static {v0, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0}, LO7/G;->s0(Ln8/c;)LO7/P;

    move-result-object p0

    invoke-virtual {p1}, Ln8/b;->i()Ln8/c;

    move-result-object p1

    invoke-virtual {p1}, Ln8/c;->f()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LO7/P;->u()Ly8/h;

    move-result-object p0

    invoke-static {p1}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ln8/f;

    sget-object v2, LW7/d;->T:LW7/d;

    invoke-interface {p0, v0, v2}, Ly8/k;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object p0

    if-nez p0, :cond_a

    goto :goto_8

    :cond_a
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln8/f;

    instance-of v1, p0, LO7/e;

    if-nez v1, :cond_b

    goto :goto_8

    :cond_b
    check-cast p0, LO7/e;

    invoke-interface {p0}, LO7/e;->H0()Ly8/h;

    move-result-object p0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v1, LW7/d;->T:LW7/d;

    invoke-interface {p0, v0, v1}, Ly8/k;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object p0

    instance-of v0, p0, LO7/e;

    if-eqz v0, :cond_c

    check-cast p0, LO7/e;

    goto :goto_7

    :cond_c
    move-object p0, v5

    :goto_7
    if-eqz p0, :cond_e

    goto :goto_6

    :cond_d
    move-object v5, v0

    :cond_e
    :goto_8
    return-object v5
.end method

.method public static final c(LO7/G;Ln8/b;LO7/J;)LO7/e;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LO7/x;->a(LO7/G;Ln8/b;)LO7/e;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LO7/x$a;->L:LO7/x$a;

    invoke-static {p1, p0}, LR8/k;->n(Ljava/lang/Object;Lx7/l;)LR8/h;

    move-result-object p0

    sget-object v0, LO7/x$b;->D:LO7/x$b;

    invoke-static {p0, v0}, LR8/k;->G(LR8/h;Lx7/l;)LR8/h;

    move-result-object p0

    invoke-static {p0}, LR8/k;->M(LR8/h;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p2, p1, p0}, LO7/J;->d(Ln8/b;Ljava/util/List;)LO7/e;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LO7/G;Ln8/b;)LO7/e0;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LO7/x;->b(LO7/G;Ln8/b;)LO7/h;

    move-result-object p0

    instance-of p1, p0, LO7/e0;

    if-eqz p1, :cond_0

    check-cast p0, LO7/e0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
