.class public abstract LL7/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF8/E;)I
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->k()LP7/g;

    move-result-object p0

    sget-object v0, LL7/j$a;->D:Ln8/c;

    invoke-interface {p0, v0}, LP7/g;->j(Ln8/c;)LP7/c;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-interface {p0}, LP7/c;->a()Ljava/util/Map;

    move-result-object p0

    sget-object v0, LL7/j;->o:Ln8/f;

    invoke-static {p0, v0}, Lj7/S;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt8/g;

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lt8/m;

    invoke-virtual {p0}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public static final b(LL7/g;LP7/g;LF8/E;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;Z)LF8/M;
    .locals 6

    .prologue
    const-string v0, "builtIns"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextReceiverTypes"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameterTypes"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "returnType"

    invoke-static {p6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    move-object v1, p3

    move-object v2, p4

    move-object v3, p5

    move-object v4, p6

    move-object v5, p0

    invoke-static/range {v0 .. v5}, LL7/f;->g(LF8/E;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LL7/g;)Ljava/util/List;

    move-result-object p5

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p4

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p6

    add-int/2addr p4, p6

    const/4 p6, 0x1

    if-nez p2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move v0, p6

    :goto_0
    add-int/2addr p4, v0

    invoke-static {p0, p4, p7}, LL7/f;->f(LL7/g;IZ)LO7/e;

    move-result-object p4

    if-eqz p2, :cond_1

    invoke-static {p1, p0}, LL7/f;->u(LP7/g;LL7/g;)LP7/g;

    move-result-object p1

    :cond_1
    move-object p2, p3

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    xor-int/2addr p2, p6

    if-eqz p2, :cond_2

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    invoke-static {p1, p0, p2}, LL7/f;->t(LP7/g;LL7/g;I)LP7/g;

    move-result-object p1

    :cond_2
    invoke-static {p1}, LF8/b0;->b(LP7/g;)LF8/a0;

    move-result-object p0

    invoke-static {p0, p4, p5}, LF8/F;->g(LF8/a0;LO7/e;Ljava/util/List;)LF8/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LL7/g;LP7/g;LF8/E;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;ZILjava/lang/Object;)LF8/M;
    .locals 9

    .prologue
    move/from16 v0, p8

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v8, v0

    goto :goto_0

    :cond_0
    move/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-static/range {v1 .. v8}, LL7/f;->b(LL7/g;LP7/g;LF8/E;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;Z)LF8/M;

    move-result-object v0

    return-object v0
.end method

.method public static final d(LF8/E;)Ln8/f;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->k()LP7/g;

    move-result-object p0

    sget-object v0, LL7/j$a;->E:Ln8/c;

    invoke-interface {p0, v0}, LP7/g;->j(Ln8/c;)LP7/c;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p0}, LP7/c;->a()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lj7/v;->H0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    instance-of v1, p0, Lt8/u;

    if-eqz v1, :cond_1

    check-cast p0, Lt8/u;

    goto :goto_0

    :cond_1
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_3

    invoke-static {p0}, Ln8/f;->r(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move-object p0, v0

    :goto_1
    if-eqz p0, :cond_3

    invoke-static {p0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p0

    return-object p0

    :cond_3
    return-object v0
.end method

.method public static final e(LF8/E;)Ljava/util/List;
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LL7/f;->p(LF8/E;)Z

    invoke-static {p0}, LL7/f;->a(LF8/E;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    invoke-interface {p0, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/i0;

    invoke-interface {v1}, LF8/i0;->getType()LF8/E;

    move-result-object v1

    const-string v2, "getType(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object p0, v0

    :goto_1
    return-object p0
.end method

.method public static final f(LL7/g;IZ)LO7/e;
    .locals 1

    .prologue
    const-string v0, "builtIns"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, LL7/g;->X(I)LO7/e;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LL7/g;->C(I)LO7/e;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final g(LF8/E;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LL7/g;)Ljava/util/List;
    .locals 16

    .prologue
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "contextReceiverTypes"

    invoke-static {v0, v3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "parameterTypes"

    invoke-static {v1, v3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "returnType"

    move-object/from16 v4, p4

    invoke-static {v4, v3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "builtIns"

    move-object/from16 v12, p5

    invoke-static {v12, v3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v5

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v6

    add-int/2addr v5, v6

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz p0, :cond_0

    move v8, v7

    goto :goto_0

    :cond_0
    move v8, v6

    :goto_0
    add-int/2addr v5, v8

    add-int/2addr v5, v7

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v0, v7}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LF8/E;

    invoke-static {v7}, LK8/a;->a(LF8/E;)LF8/i0;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-static/range {p0 .. p0}, LK8/a;->a(LF8/E;)LF8/i0;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object v5, v0

    :goto_2
    invoke-static {v3, v5}, LP8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v13, v6, 0x1

    if-gez v6, :cond_3

    invoke-static {}, Lj7/v;->w()V

    :cond_3
    move-object v14, v5

    check-cast v14, LF8/E;

    if-eqz v2, :cond_4

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln8/f;

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ln8/f;->q()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_4

    :cond_4
    move-object v5, v0

    :goto_4
    if-eqz v5, :cond_5

    new-instance v15, LP7/j;

    sget-object v7, LL7/j$a;->E:Ln8/c;

    sget-object v6, LL7/j;->k:Ln8/f;

    new-instance v8, Lt8/u;

    invoke-virtual {v5}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v5

    const-string v9, "asString(...)"

    invoke-static {v5, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v5}, Lt8/u;-><init>(Ljava/lang/String;)V

    invoke-static {v6, v8}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v5

    invoke-static {v5}, Lj7/S;->e(Li7/u;)Ljava/util/Map;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v5, v15

    move-object/from16 v6, p5

    invoke-direct/range {v5 .. v11}, LP7/j;-><init>(LL7/g;Ln8/c;Ljava/util/Map;ZILy7/k;)V

    sget-object v5, LP7/g;->d:LP7/g$a;

    invoke-virtual {v14}, LF8/E;->k()LP7/g;

    move-result-object v6

    invoke-static {v6, v15}, Lj7/v;->B0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v5, v6}, LP7/g$a;->a(Ljava/util/List;)LP7/g;

    move-result-object v5

    invoke-static {v14, v5}, LK8/a;->x(LF8/E;LP7/g;)LF8/E;

    move-result-object v14

    :cond_5
    invoke-static {v14}, LK8/a;->a(LF8/E;)LF8/i0;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v6, v13

    goto :goto_3

    :cond_6
    invoke-static/range {p4 .. p4}, LK8/a;->a(LF8/E;)LF8/i0;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v3
.end method

.method public static final h(LF8/E;)LM7/f;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object p0

    invoke-interface {p0}, LF8/e0;->w()LO7/h;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, LL7/f;->i(LO7/m;)LM7/f;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final i(LO7/m;)LM7/f;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LO7/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {p0}, LL7/g;->B0(LO7/m;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-static {p0}, Lv8/c;->m(LO7/m;)Ln8/d;

    move-result-object p0

    invoke-static {p0}, LL7/f;->j(Ln8/d;)LM7/f;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Ln8/d;)LM7/f;
    .locals 3

    .prologue
    invoke-virtual {p0}, Ln8/d;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ln8/d;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, LM7/g;->c:LM7/g$a;

    invoke-virtual {v0}, LM7/g$a;->a()LM7/g;

    move-result-object v0

    invoke-virtual {p0}, Ln8/d;->l()Ln8/c;

    move-result-object v1

    invoke-virtual {v1}, Ln8/c;->e()Ln8/c;

    move-result-object v1

    const-string v2, "parent(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ln8/d;->i()Ln8/f;

    move-result-object p0

    invoke-virtual {p0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object p0

    const-string v2, "asString(...)"

    invoke-static {p0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, LM7/g;->b(Ln8/c;Ljava/lang/String;)LM7/f;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final k(LF8/E;)LF8/E;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LL7/f;->p(LF8/E;)Z

    invoke-static {p0}, LL7/f;->s(LF8/E;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p0}, LL7/f;->a(LF8/E;)I

    move-result v0

    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF8/i0;

    invoke-interface {p0}, LF8/i0;->getType()LF8/E;

    move-result-object p0

    return-object p0
.end method

.method public static final l(LF8/E;)LF8/E;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LL7/f;->p(LF8/E;)Z

    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF8/i0;

    invoke-interface {p0}, LF8/i0;->getType()LF8/E;

    move-result-object p0

    const-string v0, "getType(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final m(LF8/E;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LL7/f;->p(LF8/E;)Z

    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v0

    invoke-static {p0}, LL7/f;->a(LF8/E;)I

    move-result v1

    invoke-static {p0}, LL7/f;->n(LF8/E;)Z

    move-result p0

    add-int/2addr v1, p0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-interface {v0, v1, p0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final n(LF8/E;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LL7/f;->p(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LL7/f;->s(LF8/E;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final o(LO7/m;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LL7/f;->i(LO7/m;)LM7/f;

    move-result-object p0

    sget-object v0, LM7/f$a;->e:LM7/f$a;

    invoke-static {p0, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, LM7/f$d;->e:LM7/f$d;

    invoke-static {p0, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final p(LF8/E;)Z
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object p0

    invoke-interface {p0}, LF8/e0;->w()LO7/h;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-static {p0}, LL7/f;->o(LO7/m;)Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_0

    move v0, v1

    :cond_0
    return v0
.end method

.method public static final q(LF8/E;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LL7/f;->h(LF8/E;)LM7/f;

    move-result-object p0

    sget-object v0, LM7/f$a;->e:LM7/f$a;

    invoke-static {p0, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final r(LF8/E;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LL7/f;->h(LF8/E;)LM7/f;

    move-result-object p0

    sget-object v0, LM7/f$d;->e:LM7/f$d;

    invoke-static {p0, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final s(LF8/E;)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LF8/E;->k()LP7/g;

    move-result-object p0

    sget-object v0, LL7/j$a;->C:Ln8/c;

    invoke-interface {p0, v0}, LP7/g;->j(Ln8/c;)LP7/c;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final t(LP7/g;LL7/g;I)LP7/g;
    .locals 9

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builtIns"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, LL7/j$a;->D:Ln8/c;

    invoke-interface {p0, v3}, LP7/g;->H(Ln8/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, LP7/g;->d:LP7/g$a;

    new-instance v8, LP7/j;

    sget-object v1, LL7/j;->o:Ln8/f;

    new-instance v2, Lt8/m;

    invoke-direct {v2, p2}, Lt8/m;-><init>(I)V

    invoke-static {v1, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p2

    invoke-static {p2}, Lj7/S;->e(Li7/u;)Ljava/util/Map;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, v8

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, LP7/j;-><init>(LL7/g;Ln8/c;Ljava/util/Map;ZILy7/k;)V

    invoke-static {p0, v8}, Lj7/v;->B0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, LP7/g$a;->a(Ljava/util/List;)LP7/g;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final u(LP7/g;LL7/g;)LP7/g;
    .locals 9

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builtIns"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, LL7/j$a;->C:Ln8/c;

    invoke-interface {p0, v3}, LP7/g;->H(Ln8/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, LP7/g;->d:LP7/g$a;

    new-instance v8, LP7/j;

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, v8

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, LP7/j;-><init>(LL7/g;Ln8/c;Ljava/util/Map;ZILy7/k;)V

    invoke-static {p0, v8}, Lj7/v;->B0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, LP7/g$a;->a(Ljava/util/List;)LP7/g;

    move-result-object p0

    :goto_0
    return-object p0
.end method
