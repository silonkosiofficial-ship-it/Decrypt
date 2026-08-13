.class public abstract LG8/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(LF8/t0;LJ8/b;)Ljava/util/List;
    .locals 11

    .prologue
    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object v1

    invoke-interface {v1}, LF8/e0;->x()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_1

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_6

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LF8/i0;

    invoke-interface {v4}, LF8/i0;->a()LF8/u0;

    move-result-object v4

    sget-object v5, LF8/u0;->G:LF8/u0;

    if-ne v4, v5, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object v3

    invoke-interface {v3}, LF8/e0;->x()Ljava/util/List;

    move-result-object v3

    const-string v4, "getParameters(...)"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v1, v3}, Lj7/v;->c1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li7/u;

    invoke-virtual {v4}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LF8/i0;

    invoke-virtual {v4}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO7/f0;

    invoke-interface {v5}, LF8/i0;->a()LF8/u0;

    move-result-object v6

    sget-object v7, LF8/u0;->G:LF8/u0;

    if-ne v6, v7, :cond_3

    goto :goto_3

    :cond_3
    invoke-interface {v5}, LF8/i0;->b()Z

    move-result v6

    if-nez v6, :cond_4

    invoke-interface {v5}, LF8/i0;->a()LF8/u0;

    move-result-object v6

    sget-object v7, LF8/u0;->H:LF8/u0;

    if-ne v6, v7, :cond_4

    invoke-interface {v5}, LF8/i0;->getType()LF8/E;

    move-result-object v6

    invoke-virtual {v6}, LF8/E;->Z0()LF8/t0;

    move-result-object v6

    goto :goto_2

    :cond_4
    move-object v6, v2

    :goto_2
    new-instance v7, LG8/i;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {v7, p1, v6, v5, v4}, LG8/i;-><init>(LJ8/b;LF8/t0;LF8/i0;LO7/f0;)V

    invoke-static {v7}, LK8/a;->a(LF8/E;)LF8/i0;

    move-result-object v5

    :goto_3
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    sget-object p1, LF8/f0;->c:LF8/f0$a;

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object v1

    invoke-virtual {p1, v1, v3}, LF8/f0$a;->b(LF8/e0;Ljava/util/List;)LF8/l0;

    move-result-object p1

    invoke-virtual {p1}, LF8/l0;->c()LF8/n0;

    move-result-object p1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_9

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LF8/i0;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LF8/i0;

    invoke-interface {v4}, LF8/i0;->a()LF8/u0;

    move-result-object v6

    sget-object v7, LF8/u0;->G:LF8/u0;

    if-eq v6, v7, :cond_8

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object v6

    invoke-interface {v6}, LF8/e0;->x()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LO7/f0;

    invoke-interface {v6}, LO7/f0;->getUpperBounds()Ljava/util/List;

    move-result-object v6

    const-string v7, "getUpperBounds(...)"

    invoke-static {v6, v7}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LF8/E;

    sget-object v9, LG8/f$a;->a:LG8/f$a;

    sget-object v10, LF8/u0;->G:LF8/u0;

    invoke-virtual {p1, v8, v10}, LF8/n0;->n(LF8/E;LF8/u0;)LF8/E;

    move-result-object v8

    invoke-virtual {v8}, LF8/E;->Z0()LF8/t0;

    move-result-object v8

    invoke-virtual {v9, v8}, LG8/f;->b(LJ8/i;)LF8/t0;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_6
    invoke-interface {v4}, LF8/i0;->b()Z

    move-result v6

    if-nez v6, :cond_7

    invoke-interface {v4}, LF8/i0;->a()LF8/u0;

    move-result-object v6

    sget-object v8, LF8/u0;->I:LF8/u0;

    if-ne v6, v8, :cond_7

    sget-object v6, LG8/f$a;->a:LG8/f$a;

    invoke-interface {v4}, LF8/i0;->getType()LF8/E;

    move-result-object v4

    invoke-virtual {v4}, LF8/E;->Z0()LF8/t0;

    move-result-object v4

    invoke-virtual {v6, v4}, LG8/f;->b(LJ8/i;)LF8/t0;

    move-result-object v4

    invoke-interface {v7, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_7
    invoke-interface {v5}, LF8/i0;->getType()LF8/E;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType"

    invoke-static {v4, v5}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, LG8/i;

    invoke-virtual {v4}, LG8/i;->g1()LG8/j;

    move-result-object v4

    invoke-virtual {v4, v7}, LG8/j;->e(Ljava/util/List;)V

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_4

    :cond_9
    return-object v3

    :cond_a
    :goto_6
    return-object v2
.end method

.method public static final b(LF8/M;LJ8/b;)LF8/M;
    .locals 1

    .prologue
    const-string v0, "type"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LG8/k;->a(LF8/t0;LJ8/b;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p0, p1}, LG8/k;->c(LF8/t0;Ljava/util/List;)LF8/M;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final c(LF8/t0;Ljava/util/List;)LF8/M;
    .locals 7

    invoke-virtual {p0}, LF8/E;->V0()LF8/a0;

    move-result-object v0

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object v1

    invoke-virtual {p0}, LF8/E;->X0()Z

    move-result v3

    const/16 v5, 0x10

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v0 .. v6}, LF8/F;->l(LF8/a0;LF8/e0;Ljava/util/List;ZLG8/g;ILjava/lang/Object;)LF8/M;

    move-result-object p0

    return-object p0
.end method
