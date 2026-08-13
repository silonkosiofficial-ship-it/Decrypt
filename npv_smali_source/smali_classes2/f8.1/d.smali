.class public final Lf8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/d$a;,
        Lf8/d$b;
    }
.end annotation


# instance fields
.field private final a:La8/c;


# direct methods
.method public constructor <init>(La8/c;)V
    .locals 1

    const-string v0, "javaResolverSettings"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf8/d;->a:La8/c;

    return-void
.end method

.method private final b(LF8/M;Lx7/l;ILf8/o;ZZ)Lf8/d$b;
    .locals 18

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    move/from16 v3, p6

    invoke-static/range {p4 .. p4}, Lf8/p;->a(Lf8/o;)Z

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v3, :cond_1

    if-nez p5, :cond_0

    goto :goto_0

    :cond_0
    move v7, v5

    goto :goto_1

    :cond_1
    :goto_0
    move v7, v6

    :goto_1
    const/4 v8, 0x0

    if-nez v4, :cond_2

    invoke-virtual/range {p1 .. p1}, LF8/E;->U0()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    new-instance v1, Lf8/d$b;

    invoke-direct {v1, v8, v6, v5}, Lf8/d$b;-><init>(LF8/M;IZ)V

    return-object v1

    :cond_2
    invoke-virtual/range {p1 .. p1}, LF8/E;->W0()LF8/e0;

    move-result-object v4

    invoke-interface {v4}, LF8/e0;->w()LO7/h;

    move-result-object v4

    if-nez v4, :cond_3

    new-instance v1, Lf8/d$b;

    invoke-direct {v1, v8, v6, v5}, Lf8/d$b;-><init>(LF8/M;IZ)V

    return-object v1

    :cond_3
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v1, v9}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lf8/e;

    invoke-static {v4, v9, v2}, Lf8/r;->b(LO7/h;Lf8/e;Lf8/o;)LO7/h;

    move-result-object v4

    invoke-static {v9, v2}, Lf8/r;->d(Lf8/e;Lf8/o;)Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v4, :cond_5

    invoke-interface {v4}, LO7/h;->p()LF8/e0;

    move-result-object v10

    if-nez v10, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    move-object v12, v10

    goto :goto_4

    :cond_5
    :goto_3
    invoke-virtual/range {p1 .. p1}, LF8/E;->W0()LF8/e0;

    move-result-object v10

    goto :goto_2

    :goto_4
    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    add-int/lit8 v10, p3, 0x1

    invoke-virtual/range {p1 .. p1}, LF8/E;->U0()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    invoke-interface {v12}, LF8/e0;->x()Ljava/util/List;

    move-result-object v13

    const-string v14, "getParameters(...)"

    invoke-static {v13, v14}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Ljava/lang/Iterable;

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    new-instance v6, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v11, v5}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-static {v13, v5}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-static {v11, v13}, Ljava/lang/Math;->min(II)I

    move-result v11

    invoke-direct {v6, v11}, Ljava/util/ArrayList;-><init>(I)V

    :goto_5
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LO7/f0;

    check-cast v11, LF8/i0;

    if-nez v7, :cond_6

    new-instance v5, Lf8/d$a;

    move/from16 p5, v7

    const/4 v7, 0x0

    invoke-direct {v5, v8, v7}, Lf8/d$a;-><init>(LF8/E;I)V

    goto :goto_6

    :cond_6
    move/from16 p5, v7

    invoke-interface {v11}, LF8/i0;->b()Z

    move-result v5

    if-nez v5, :cond_7

    invoke-interface {v11}, LF8/i0;->getType()LF8/E;

    move-result-object v5

    invoke-virtual {v5}, LF8/E;->Z0()LF8/t0;

    move-result-object v5

    invoke-direct {v0, v5, v1, v10, v3}, Lf8/d;->d(LF8/t0;Lx7/l;IZ)Lf8/d$a;

    move-result-object v5

    goto :goto_6

    :cond_7
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v5}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf8/e;

    invoke-virtual {v5}, Lf8/e;->d()Lf8/h;

    move-result-object v5

    sget-object v7, Lf8/h;->C:Lf8/h;

    if-ne v5, v7, :cond_8

    invoke-interface {v11}, LF8/i0;->getType()LF8/E;

    move-result-object v5

    invoke-virtual {v5}, LF8/E;->Z0()LF8/t0;

    move-result-object v5

    new-instance v7, Lf8/d$a;

    invoke-static {v5}, LF8/B;->c(LF8/E;)LF8/M;

    move-result-object v8

    const/4 v1, 0x0

    invoke-virtual {v8, v1}, LF8/M;->d1(Z)LF8/M;

    move-result-object v8

    invoke-static {v5}, LF8/B;->d(LF8/E;)LF8/M;

    move-result-object v1

    const/4 v5, 0x1

    invoke-virtual {v1, v5}, LF8/M;->d1(Z)LF8/M;

    move-result-object v1

    invoke-static {v8, v1}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object v1

    invoke-direct {v7, v1, v5}, Lf8/d$a;-><init>(LF8/E;I)V

    move-object v5, v7

    goto :goto_6

    :cond_8
    const/4 v5, 0x1

    new-instance v1, Lf8/d$a;

    const/4 v7, 0x0

    invoke-direct {v1, v7, v5}, Lf8/d$a;-><init>(LF8/E;I)V

    move-object v5, v1

    :goto_6
    invoke-virtual {v5}, Lf8/d$a;->a()I

    move-result v1

    add-int/2addr v10, v1

    invoke-virtual {v5}, Lf8/d$a;->b()LF8/E;

    move-result-object v1

    const-string v7, "getProjectionKind(...)"

    if-eqz v1, :cond_9

    invoke-virtual {v5}, Lf8/d$a;->b()LF8/E;

    move-result-object v1

    :goto_7
    invoke-interface {v11}, LF8/i0;->a()LF8/u0;

    move-result-object v5

    invoke-static {v5, v7}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5, v13}, LK8/a;->f(LF8/E;LF8/u0;LO7/f0;)LF8/i0;

    move-result-object v7

    goto :goto_8

    :cond_9
    if-eqz v4, :cond_a

    invoke-interface {v11}, LF8/i0;->b()Z

    move-result v1

    if-nez v1, :cond_a

    invoke-interface {v11}, LF8/i0;->getType()LF8/E;

    move-result-object v1

    const-string v5, "getType(...)"

    invoke-static {v1, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_7

    :cond_a
    if-eqz v4, :cond_b

    invoke-static {v13}, LF8/q0;->s(LO7/f0;)LF8/i0;

    move-result-object v7

    goto :goto_8

    :cond_b
    const/4 v7, 0x0

    :goto_8
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p2

    move/from16 v7, p5

    const/16 v5, 0xa

    const/4 v8, 0x0

    goto/16 :goto_5

    :cond_c
    sub-int v10, v10, p3

    if-nez v4, :cond_e

    if-nez v2, :cond_e

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_a

    :cond_d
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LF8/i0;

    if-nez v3, :cond_e

    goto :goto_9

    :cond_e
    const/4 v7, 0x0

    goto :goto_b

    :cond_f
    :goto_a
    new-instance v1, Lf8/d$b;

    const/4 v2, 0x0

    const/4 v7, 0x0

    invoke-direct {v1, v7, v10, v2}, Lf8/d$b;-><init>(LF8/M;IZ)V

    return-object v1

    :goto_b
    invoke-virtual/range {p1 .. p1}, LF8/E;->k()LP7/g;

    move-result-object v1

    invoke-static {}, Lf8/r;->c()Lf8/c;

    move-result-object v3

    if-eqz v4, :cond_10

    goto :goto_c

    :cond_10
    move-object v3, v7

    :goto_c
    invoke-static {}, Lf8/r;->g()LP7/g;

    move-result-object v4

    if-eqz v2, :cond_11

    move-object v8, v4

    goto :goto_d

    :cond_11
    move-object v8, v7

    :goto_d
    const/4 v4, 0x3

    new-array v4, v4, [LP7/g;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v1, 0x1

    aput-object v3, v4, v1

    const/4 v3, 0x2

    aput-object v8, v4, v3

    invoke-static {v4}, Lj7/v;->r([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lf8/r;->a(Ljava/util/List;)LP7/g;

    move-result-object v3

    invoke-static {v3}, LF8/b0;->b(LP7/g;)LF8/a0;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, LF8/E;->U0()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    new-instance v13, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v6, v8}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-static {v3, v8}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v6, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(I)V

    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LF8/i0;

    check-cast v3, LF8/i0;

    if-nez v3, :cond_12

    goto :goto_f

    :cond_12
    move-object v6, v3

    :goto_f
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_13
    if-eqz v2, :cond_14

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_10
    move v14, v3

    goto :goto_11

    :cond_14
    invoke-virtual/range {p1 .. p1}, LF8/E;->X0()Z

    move-result v3

    goto :goto_10

    :goto_11
    const/16 v16, 0x10

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-static/range {v11 .. v17}, LF8/F;->l(LF8/a0;LF8/e0;Ljava/util/List;ZLG8/g;ILjava/lang/Object;)LF8/M;

    move-result-object v3

    invoke-virtual {v9}, Lf8/e;->b()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-direct {v0, v3}, Lf8/d;->e(LF8/M;)LF8/M;

    move-result-object v3

    :cond_15
    if-eqz v2, :cond_16

    invoke-virtual {v9}, Lf8/e;->e()Z

    move-result v2

    if-eqz v2, :cond_16

    move v5, v1

    :cond_16
    new-instance v1, Lf8/d$b;

    invoke-direct {v1, v3, v10, v5}, Lf8/d$b;-><init>(LF8/M;IZ)V

    return-object v1
.end method

.method static synthetic c(Lf8/d;LF8/M;Lx7/l;ILf8/o;ZZILjava/lang/Object;)Lf8/d$b;
    .locals 9

    .prologue
    and-int/lit8 v0, p7, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v7, v1

    goto :goto_0

    :cond_0
    move v7, p5

    :goto_0
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_1

    move v8, v1

    goto :goto_1

    :cond_1
    move v8, p6

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v2 .. v8}, Lf8/d;->b(LF8/M;Lx7/l;ILf8/o;ZZ)Lf8/d$b;

    move-result-object v0

    return-object v0
.end method

.method private final d(LF8/t0;Lx7/l;IZ)Lf8/d$a;
    .locals 11

    .prologue
    invoke-static {p1}, LF8/G;->a(LF8/E;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Lf8/d$a;

    const/4 p2, 0x1

    invoke-direct {p1, v1, p2}, Lf8/d$a;-><init>(LF8/E;I)V

    return-object p1

    :cond_0
    instance-of v0, p1, LF8/y;

    if-eqz v0, :cond_c

    instance-of v0, p1, LF8/L;

    move-object v9, p1

    check-cast v9, LF8/y;

    invoke-virtual {v9}, LF8/y;->e1()LF8/M;

    move-result-object v3

    sget-object v6, Lf8/o;->C:Lf8/o;

    move-object v2, p0

    move-object v4, p2

    move v5, p3

    move v7, v0

    move v8, p4

    invoke-direct/range {v2 .. v8}, Lf8/d;->b(LF8/M;Lx7/l;ILf8/o;ZZ)Lf8/d$b;

    move-result-object v10

    invoke-virtual {v9}, LF8/y;->f1()LF8/M;

    move-result-object v3

    sget-object v6, Lf8/o;->D:Lf8/o;

    invoke-direct/range {v2 .. v8}, Lf8/d;->b(LF8/M;Lx7/l;ILf8/o;ZZ)Lf8/d$b;

    move-result-object p2

    invoke-virtual {v10}, Lf8/d$b;->b()I

    invoke-virtual {p2}, Lf8/d$b;->b()I

    invoke-virtual {v10}, Lf8/d$b;->c()LF8/M;

    move-result-object p3

    if-nez p3, :cond_1

    invoke-virtual {p2}, Lf8/d$b;->c()LF8/M;

    move-result-object p3

    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lf8/d$b;->a()Z

    move-result p3

    if-nez p3, :cond_8

    invoke-virtual {p2}, Lf8/d$b;->a()Z

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_5

    new-instance v1, Lc8/h;

    invoke-virtual {v10}, Lf8/d$b;->c()LF8/M;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-virtual {v9}, LF8/y;->e1()LF8/M;

    move-result-object p1

    :cond_3
    invoke-virtual {p2}, Lf8/d$b;->c()LF8/M;

    move-result-object p2

    if-nez p2, :cond_4

    invoke-virtual {v9}, LF8/y;->f1()LF8/M;

    move-result-object p2

    :cond_4
    invoke-direct {v1, p1, p2}, Lc8/h;-><init>(LF8/M;LF8/M;)V

    goto :goto_1

    :cond_5
    invoke-virtual {v10}, Lf8/d$b;->c()LF8/M;

    move-result-object p1

    if-nez p1, :cond_6

    invoke-virtual {v9}, LF8/y;->e1()LF8/M;

    move-result-object p1

    :cond_6
    invoke-virtual {p2}, Lf8/d$b;->c()LF8/M;

    move-result-object p2

    if-nez p2, :cond_7

    invoke-virtual {v9}, LF8/y;->f1()LF8/M;

    move-result-object p2

    :cond_7
    invoke-static {p1, p2}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object v1

    goto :goto_1

    :cond_8
    :goto_0
    invoke-virtual {p2}, Lf8/d$b;->c()LF8/M;

    move-result-object p2

    if-eqz p2, :cond_a

    invoke-virtual {v10}, Lf8/d$b;->c()LF8/M;

    move-result-object p3

    if-nez p3, :cond_9

    move-object p3, p2

    :cond_9
    invoke-static {p3, p2}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object p2

    if-nez p2, :cond_b

    :cond_a
    invoke-virtual {v10}, Lf8/d$b;->c()LF8/M;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    :cond_b
    invoke-static {p1, p2}, LF8/s0;->d(LF8/t0;LF8/E;)LF8/t0;

    move-result-object v1

    :goto_1
    new-instance p1, Lf8/d$a;

    invoke-virtual {v10}, Lf8/d$b;->b()I

    move-result p2

    invoke-direct {p1, v1, p2}, Lf8/d$a;-><init>(LF8/E;I)V

    goto :goto_3

    :cond_c
    instance-of v0, p1, LF8/M;

    if-eqz v0, :cond_e

    move-object v2, p1

    check-cast v2, LF8/M;

    sget-object v5, Lf8/o;->E:Lf8/o;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p2

    move v4, p3

    move v7, p4

    invoke-static/range {v1 .. v9}, Lf8/d;->c(Lf8/d;LF8/M;Lx7/l;ILf8/o;ZZILjava/lang/Object;)Lf8/d$b;

    move-result-object p2

    new-instance p3, Lf8/d$a;

    invoke-virtual {p2}, Lf8/d$b;->a()Z

    move-result p4

    if-eqz p4, :cond_d

    invoke-virtual {p2}, Lf8/d$b;->c()LF8/M;

    move-result-object p4

    invoke-static {p1, p4}, LF8/s0;->d(LF8/t0;LF8/E;)LF8/t0;

    move-result-object p1

    goto :goto_2

    :cond_d
    invoke-virtual {p2}, Lf8/d$b;->c()LF8/M;

    move-result-object p1

    :goto_2
    invoke-virtual {p2}, Lf8/d$b;->b()I

    move-result p2

    invoke-direct {p3, p1, p2}, Lf8/d$a;-><init>(LF8/E;I)V

    move-object p1, p3

    :goto_3
    return-object p1

    :cond_e
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1
.end method

.method private final e(LF8/M;)LF8/M;
    .locals 1

    .prologue
    iget-object v0, p0, Lf8/d;->a:La8/c;

    invoke-interface {v0}, La8/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p1, v0}, LF8/Q;->h(LF8/M;Z)LF8/M;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v0, Lf8/g;

    invoke-direct {v0, p1}, Lf8/g;-><init>(LF8/M;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final a(LF8/E;Lx7/l;Z)LF8/E;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "qualifiers"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF8/E;->Z0()LF8/t0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lf8/d;->d(LF8/t0;Lx7/l;IZ)Lf8/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lf8/d$a;->b()LF8/E;

    move-result-object p1

    return-object p1
.end method
