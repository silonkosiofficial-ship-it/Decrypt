.class public abstract LZ7/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/Collection;Ljava/util/Collection;LO7/a;)Ljava/util/List;
    .locals 16

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "newValueParameterTypes"

    invoke-static {v0, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "oldValueParameters"

    invoke-static {v1, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "newOwner"

    move-object/from16 v15, p2

    invoke-static {v15, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p0 .. p0}, Ljava/util/Collection;->size()I

    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->size()I

    check-cast v0, Ljava/lang/Iterable;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lj7/v;->c1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li7/u;

    invoke-virtual {v2}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, LF8/E;

    invoke-virtual {v2}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/j0;

    new-instance v14, LR7/L;

    invoke-interface {v2}, LO7/j0;->getIndex()I

    move-result v6

    invoke-interface {v2}, LP7/a;->k()LP7/g;

    move-result-object v7

    invoke-interface {v2}, LO7/I;->getName()Ln8/f;

    move-result-object v8

    const-string v3, "getName(...)"

    invoke-static {v8, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, LO7/j0;->D0()Z

    move-result v10

    invoke-interface {v2}, LO7/j0;->j0()Z

    move-result v11

    invoke-interface {v2}, LO7/j0;->e0()Z

    move-result v12

    invoke-interface {v2}, LO7/j0;->u0()LF8/E;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static/range {p2 .. p2}, Lv8/c;->p(LO7/m;)LO7/G;

    move-result-object v3

    invoke-interface {v3}, LO7/G;->t()LL7/g;

    move-result-object v3

    invoke-virtual {v3, v9}, LL7/g;->k(LF8/E;)LF8/E;

    move-result-object v3

    :goto_1
    move-object v13, v3

    goto :goto_2

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :goto_2
    invoke-interface {v2}, LO7/p;->o()LO7/a0;

    move-result-object v2

    const-string v3, "getSource(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v3, v14

    move-object/from16 v4, p2

    move-object/from16 p0, v0

    move-object v0, v14

    move-object v14, v2

    invoke-direct/range {v3 .. v14}, LR7/L;-><init>(LO7/a;LO7/j0;ILP7/g;Ln8/f;LF8/E;ZZZLF8/E;LO7/a0;)V

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public static final b(LO7/e;)Lb8/l;
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lv8/c;->u(LO7/e;)LO7/e;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p0}, LO7/e;->Y()Ly8/h;

    move-result-object v1

    instance-of v2, v1, Lb8/l;

    if-eqz v2, :cond_1

    move-object v0, v1

    check-cast v0, Lb8/l;

    :cond_1
    if-nez v0, :cond_2

    invoke-static {p0}, LZ7/h;->b(LO7/e;)Lb8/l;

    move-result-object v0

    :cond_2
    return-object v0
.end method
