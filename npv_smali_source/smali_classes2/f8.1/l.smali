.class public final Lf8/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lf8/d;


# direct methods
.method public constructor <init>(Lf8/d;)V
    .locals 1

    const-string v0, "typeEnhancement"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf8/l;->a:Lf8/d;

    return-void
.end method

.method private final a(LF8/E;)Z
    .locals 1

    sget-object v0, Lf8/l$a;->D:Lf8/l$a;

    invoke-static {p1, v0}, LF8/q0;->c(LF8/E;Lx7/l;)Z

    move-result p1

    return p1
.end method

.method private final b(LO7/b;LP7/a;ZLa8/g;LX7/b;Lf8/q;ZLx7/l;)LF8/E;
    .locals 10

    .prologue
    move-object/from16 v0, p8

    new-instance v9, Lf8/n;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, v9

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v1 .. v8}, Lf8/n;-><init>(LP7/a;ZLa8/g;LX7/b;ZILy7/k;)V

    move-object v1, p1

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/E;

    invoke-interface {p1}, LO7/b;->f()Ljava/util/Collection;

    move-result-object v1

    const-string v3, "getOverriddenDescriptors(...)"

    invoke-static {v1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO7/b;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, v4}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LF8/E;

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object v0, p0

    move-object v1, v9

    move-object/from16 v4, p6

    move/from16 v5, p7

    invoke-direct/range {v0 .. v5}, Lf8/l;->c(Lf8/n;LF8/E;Ljava/util/List;Lf8/q;Z)LF8/E;

    move-result-object v0

    return-object v0
.end method

.method private final c(Lf8/n;LF8/E;Ljava/util/List;Lf8/q;Z)LF8/E;
    .locals 1

    iget-object v0, p0, Lf8/l;->a:Lf8/d;

    check-cast p3, Ljava/lang/Iterable;

    invoke-virtual {p1, p2, p3, p4, p5}, Lf8/a;->b(LJ8/i;Ljava/lang/Iterable;Lf8/q;Z)Lx7/l;

    move-result-object p3

    invoke-virtual {p1}, Lf8/n;->u()Z

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, Lf8/d;->a(LF8/E;Lx7/l;Z)LF8/E;

    move-result-object p1

    return-object p1
.end method

.method static synthetic d(Lf8/l;LO7/b;LP7/a;ZLa8/g;LX7/b;Lf8/q;ZLx7/l;ILjava/lang/Object;)LF8/E;
    .locals 10

    .prologue
    and-int/lit8 v0, p9, 0x20

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

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lf8/l;->b(LO7/b;LP7/a;ZLa8/g;LX7/b;Lf8/q;ZLx7/l;)LF8/E;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lf8/l;Lf8/n;LF8/E;Ljava/util/List;Lf8/q;ZILjava/lang/Object;)LF8/E;
    .locals 6

    .prologue
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lf8/l;->c(Lf8/n;LF8/E;Ljava/util/List;Lf8/q;Z)LF8/E;

    move-result-object p0

    return-object p0
.end method

.method private final f(LO7/b;La8/g;)LO7/b;
    .locals 22

    .prologue
    move-object/from16 v11, p0

    move-object/from16 v12, p1

    instance-of v0, v12, LZ7/a;

    if-nez v0, :cond_0

    return-object v12

    :cond_0
    move-object v13, v12

    check-cast v13, LZ7/a;

    invoke-interface {v13}, LO7/b;->j()LO7/b$a;

    move-result-object v0

    sget-object v1, LO7/b$a;->D:LO7/b$a;

    const/4 v14, 0x1

    if-ne v0, v1, :cond_1

    invoke-interface {v13}, LO7/b;->a()LO7/b;

    move-result-object v0

    invoke-interface {v0}, LO7/b;->f()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-ne v0, v14, :cond_1

    return-object v12

    :cond_1
    invoke-direct/range {p0 .. p2}, Lf8/l;->k(LO7/b;La8/g;)LP7/g;

    move-result-object v0

    move-object/from16 v7, p2

    invoke-static {v7, v0}, La8/a;->h(La8/g;LP7/g;)La8/g;

    move-result-object v8

    instance-of v0, v12, LZ7/f;

    if-eqz v0, :cond_2

    move-object v0, v12

    check-cast v0, LZ7/f;

    invoke-virtual {v0}, LR7/C;->a1()LR7/D;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LR7/B;->b0()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, LR7/C;->a1()LR7/D;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object v9, v0

    goto :goto_0

    :cond_2
    move-object v9, v12

    :goto_0
    invoke-interface {v13}, LO7/a;->v0()LO7/X;

    move-result-object v0

    const/4 v15, 0x0

    if-eqz v0, :cond_5

    instance-of v0, v9, LO7/y;

    if-eqz v0, :cond_3

    move-object v0, v9

    check-cast v0, LO7/y;

    goto :goto_1

    :cond_3
    move-object v0, v15

    :goto_1
    if-eqz v0, :cond_4

    sget-object v1, LZ7/e;->i0:LO7/a$a;

    invoke-interface {v0, v1}, LO7/a;->D(LO7/a$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/j0;

    move-object v2, v0

    goto :goto_2

    :cond_4
    move-object v2, v15

    :goto_2
    const/4 v5, 0x0

    sget-object v6, Lf8/l$b;->D:Lf8/l$b;

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v3, v8

    invoke-direct/range {v0 .. v6}, Lf8/l;->j(LO7/b;LO7/j0;La8/g;Lf8/q;ZLx7/l;)LF8/E;

    move-result-object v0

    move-object/from16 v16, v0

    goto :goto_3

    :cond_5
    move-object/from16 v16, v15

    :goto_3
    instance-of v0, v12, LZ7/e;

    if-eqz v0, :cond_6

    move-object v0, v12

    check-cast v0, LZ7/e;

    goto :goto_4

    :cond_6
    move-object v0, v15

    :goto_4
    const/4 v10, 0x0

    if-eqz v0, :cond_7

    sget-object v1, Lg8/A;->a:Lg8/A;

    invoke-virtual {v0}, LR7/k;->b()LO7/m;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v2, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LO7/e;

    const/4 v3, 0x3

    invoke-static {v0, v10, v10, v3, v15}, Lg8/y;->c(LO7/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lg8/x;->a(Lg8/A;LO7/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {}, Lf8/j;->d()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf8/k;

    move-object/from16 v17, v0

    goto :goto_5

    :cond_7
    move-object/from16 v17, v15

    :goto_5
    if-eqz v17, :cond_8

    invoke-virtual/range {v17 .. v17}, Lf8/k;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    invoke-interface {v13}, LO7/a;->n()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    :cond_8
    invoke-virtual/range {p2 .. p2}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->i()LX7/x;

    move-result-object v0

    invoke-static {v0}, LX7/J;->c(LX7/x;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {v8}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->q()La8/c;

    move-result-object v0

    invoke-interface {v0}, La8/c;->b()Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_9
    invoke-static/range {p1 .. p1}, LX7/J;->b(LO7/b;)Z

    move-result v0

    if-eqz v0, :cond_a

    move v7, v14

    goto :goto_6

    :cond_a
    move v7, v10

    :goto_6
    invoke-interface {v9}, LO7/a;->n()Ljava/util/List;

    move-result-object v0

    const-string v6, "getValueParameters(...)"

    invoke-static {v0, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_7
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LO7/j0;

    if-eqz v17, :cond_b

    invoke-virtual/range {v17 .. v17}, Lf8/k;->a()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-interface {v2}, LO7/j0;->getIndex()I

    move-result v1

    invoke-static {v0, v1}, Lj7/v;->l0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf8/q;

    move-object/from16 v19, v0

    goto :goto_8

    :cond_b
    move-object/from16 v19, v15

    :goto_8
    new-instance v3, Lf8/l$d;

    invoke-direct {v3, v2}, Lf8/l$d;-><init>(LO7/j0;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v20, v3

    move-object v3, v8

    move v15, v4

    move-object/from16 v4, v19

    move-object v15, v5

    move v5, v7

    move-object/from16 v21, v6

    move-object/from16 v6, v20

    invoke-direct/range {v0 .. v6}, Lf8/l;->j(LO7/b;LO7/j0;La8/g;Lf8/q;ZLx7/l;)LF8/E;

    move-result-object v0

    invoke-interface {v15, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v5, v15

    move-object/from16 v6, v21

    const/16 v4, 0xa

    const/4 v15, 0x0

    goto :goto_7

    :cond_c
    move-object v15, v5

    move-object/from16 v21, v6

    instance-of v0, v12, LO7/U;

    if-eqz v0, :cond_d

    move-object v0, v12

    check-cast v0, LO7/U;

    goto :goto_9

    :cond_d
    const/4 v0, 0x0

    :goto_9
    if-eqz v0, :cond_e

    invoke-static {v0}, Lb8/c;->a(LO7/U;)Z

    move-result v0

    if-ne v0, v14, :cond_e

    sget-object v0, LX7/b;->F:LX7/b;

    :goto_a
    move-object v5, v0

    goto :goto_b

    :cond_e
    sget-object v0, LX7/b;->D:LX7/b;

    goto :goto_a

    :goto_b
    if-eqz v17, :cond_f

    invoke-virtual/range {v17 .. v17}, Lf8/k;->b()Lf8/q;

    move-result-object v0

    move-object v6, v0

    goto :goto_c

    :cond_f
    const/4 v6, 0x0

    :goto_c
    sget-object v17, Lf8/l$c;->D:Lf8/l$c;

    const/16 v18, 0x20

    const/16 v20, 0x0

    const/4 v3, 0x1

    const/4 v7, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v9

    move-object v4, v8

    move-object/from16 v8, v17

    move/from16 v9, v18

    move/from16 v17, v10

    move-object/from16 v10, v20

    invoke-static/range {v0 .. v10}, Lf8/l;->d(Lf8/l;LO7/b;LP7/a;ZLa8/g;LX7/b;Lf8/q;ZLx7/l;ILjava/lang/Object;)LF8/E;

    move-result-object v0

    invoke-interface {v13}, LO7/a;->l()LF8/E;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {v11, v1}, Lf8/l;->a(LF8/E;)Z

    move-result v1

    const-string v2, "getType(...)"

    if-nez v1, :cond_15

    invoke-interface {v13}, LO7/a;->v0()LO7/X;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-interface {v1}, LO7/i0;->getType()LF8/E;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-direct {v11, v1}, Lf8/l;->a(LF8/E;)Z

    move-result v10

    goto :goto_d

    :cond_10
    move/from16 v10, v17

    :goto_d
    if-nez v10, :cond_15

    invoke-interface {v13}, LO7/a;->n()Ljava/util/List;

    move-result-object v1

    move-object/from16 v3, v21

    invoke-static {v1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_12

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_12

    :cond_11
    move/from16 v10, v17

    goto :goto_e

    :cond_12
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO7/j0;

    invoke-interface {v3}, LO7/i0;->getType()LF8/E;

    move-result-object v3

    invoke-static {v3, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v11, v3}, Lf8/l;->a(LF8/E;)Z

    move-result v3

    if-eqz v3, :cond_13

    move v10, v14

    :goto_e
    if-eqz v10, :cond_14

    goto :goto_f

    :cond_14
    move/from16 v10, v17

    goto :goto_10

    :cond_15
    :goto_f
    move v10, v14

    :goto_10
    if-eqz v10, :cond_16

    invoke-static {}, Lu8/d;->a()LO7/a$a;

    move-result-object v1

    new-instance v3, LX7/j;

    invoke-direct {v3, v12}, LX7/j;-><init>(LO7/m;)V

    invoke-static {v1, v3}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    goto :goto_11

    :cond_16
    const/4 v1, 0x0

    :goto_11
    if-nez v16, :cond_1c

    if-nez v0, :cond_1c

    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_18

    :cond_17
    move/from16 v14, v17

    goto :goto_13

    :cond_18
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_19
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LF8/E;

    if-eqz v4, :cond_1a

    move v10, v14

    goto :goto_12

    :cond_1a
    move/from16 v10, v17

    :goto_12
    if-eqz v10, :cond_19

    :goto_13
    if-nez v14, :cond_1c

    if-eqz v1, :cond_1b

    goto :goto_14

    :cond_1b
    return-object v12

    :cond_1c
    :goto_14
    if-nez v16, :cond_1e

    invoke-interface {v13}, LO7/a;->v0()LO7/X;

    move-result-object v3

    if-eqz v3, :cond_1d

    invoke-interface {v3}, LO7/i0;->getType()LF8/E;

    move-result-object v3

    goto :goto_15

    :cond_1d
    const/4 v3, 0x0

    goto :goto_15

    :cond_1e
    move-object/from16 v3, v16

    :goto_15
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v15, v5}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move/from16 v10, v17

    :goto_16
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_21

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v10, 0x1

    if-gez v10, :cond_1f

    invoke-static {}, Lj7/v;->w()V

    :cond_1f
    check-cast v6, LF8/E;

    if-nez v6, :cond_20

    invoke-interface {v13}, LO7/a;->n()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LO7/j0;

    invoke-interface {v6}, LO7/i0;->getType()LF8/E;

    move-result-object v6

    invoke-static {v6, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_20
    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v10, v7

    goto :goto_16

    :cond_21
    if-nez v0, :cond_22

    invoke-interface {v13}, LO7/a;->l()LF8/E;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    :cond_22
    invoke-interface {v13, v3, v4, v0, v1}, LZ7/a;->n0(LF8/E;Ljava/util/List;LF8/E;Li7/u;)LZ7/a;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final j(LO7/b;LO7/j0;La8/g;Lf8/q;ZLx7/l;)LF8/E;
    .locals 9

    .prologue
    if-eqz p2, :cond_1

    invoke-interface {p2}, LP7/a;->k()LP7/g;

    move-result-object v0

    invoke-static {p3, v0}, La8/a;->h(La8/g;LP7/g;)La8/g;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v4, v0

    goto :goto_1

    :cond_1
    :goto_0
    move-object v4, p3

    :goto_1
    sget-object v5, LX7/b;->E:LX7/b;

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p4

    move v7, p5

    move-object v8, p6

    invoke-direct/range {v0 .. v8}, Lf8/l;->b(LO7/b;LP7/a;ZLa8/g;LX7/b;Lf8/q;ZLx7/l;)LF8/E;

    move-result-object v0

    return-object v0
.end method

.method private final k(LO7/b;La8/g;)LP7/g;
    .locals 5

    .prologue
    invoke-static {p1}, LO7/s;->a(LO7/m;)LO7/h;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p1}, LP7/a;->k()LP7/g;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v1, v0, Lb8/f;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Lb8/f;

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lb8/f;->Z0()Ljava/util/List;

    move-result-object v2

    :cond_2
    move-object v0, v2

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    check-cast v2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v2, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le8/a;

    new-instance v3, Lb8/e;

    const/4 v4, 0x1

    invoke-direct {v3, p2, v2, v4}, Lb8/e;-><init>(La8/g;Le8/a;Z)V

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    sget-object p2, LP7/g;->d:LP7/g$a;

    invoke-interface {p1}, LP7/a;->k()LP7/g;

    move-result-object p1

    invoke-static {p1, v0}, Lj7/v;->A0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p1}, LP7/g$a;->a(Ljava/util/List;)LP7/g;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_2
    invoke-interface {p1}, LP7/a;->k()LP7/g;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final g(La8/g;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 2

    .prologue
    const-string v0, "c"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "platformSignatures"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7/b;

    invoke-direct {p0, v1, p1}, Lf8/l;->f(LO7/b;La8/g;)LO7/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final h(LF8/E;La8/g;)LF8/E;
    .locals 9

    .prologue
    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf8/n;

    sget-object v5, LX7/b;->G:LX7/b;

    const/4 v6, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, v0

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lf8/n;-><init>(LP7/a;ZLa8/g;LX7/b;Z)V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v4

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, v0

    move-object v3, p1

    invoke-static/range {v1 .. v8}, Lf8/l;->e(Lf8/l;Lf8/n;LF8/E;Ljava/util/List;Lf8/q;ZILjava/lang/Object;)LF8/E;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    return-object p1
.end method

.method public final i(LO7/f0;Ljava/util/List;La8/g;)Ljava/util/List;
    .locals 12

    .prologue
    const-string v0, "typeParameter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bounds"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/E;

    sget-object v2, Lf8/l$e;->D:Lf8/l$e;

    invoke-static {v1, v2}, LK8/a;->b(LF8/E;Lx7/l;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    new-instance v11, Lf8/n;

    sget-object v7, LX7/b;->H:LX7/b;

    const/16 v9, 0x10

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    move-object v3, v11

    move-object v4, p1

    move-object v6, p3

    invoke-direct/range {v3 .. v10}, Lf8/n;-><init>(LP7/a;ZLa8/g;LX7/b;ZILy7/k;)V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v5

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, v1

    invoke-static/range {v2 .. v9}, Lf8/l;->e(Lf8/l;Lf8/n;LF8/E;Ljava/util/List;Lf8/q;ZILjava/lang/Object;)LF8/E;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method
