.class public abstract LC9/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic A(LV/G1;)LC9/g;
    .locals 0

    invoke-static {p0}, LC9/p;->o(LV/G1;)LC9/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B(LV/G1;)LC9/g;
    .locals 0

    invoke-static {p0}, LC9/p;->p(LV/G1;)LC9/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C(LV/G1;)LC9/g;
    .locals 0

    invoke-static {p0}, LC9/p;->q(LV/G1;)LC9/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic D(Lt/b;Le0/d;LC9/g;LV/n;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LC9/p;->r(Lt/b;Le0/d;LC9/g;LV/n;I)V

    return-void
.end method

.method public static synthetic a(LC9/v;Ljava/lang/String;Landroidx/compose/ui/d;LE9/a;LC9/O;Lx7/l;IILV/n;I)Li7/M;
    .locals 0

    invoke-static/range {p0 .. p9}, LC9/p;->l(LC9/v;Ljava/lang/String;Landroidx/compose/ui/d;LE9/a;LC9/O;Lx7/l;IILV/n;I)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lt/b;Le0/d;LC9/g;ILV/n;I)Li7/M;
    .locals 0

    invoke-static/range {p0 .. p5}, LC9/p;->t(Lt/b;Le0/d;LC9/g;ILV/n;I)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LC9/g;LV/N;)LV/M;
    .locals 0

    invoke-static {p0, p1}, LC9/p;->s(LC9/g;LV/N;)LV/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LC9/g;Lt/b;ILV/n;I)Li7/M;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LC9/p;->f(LC9/g;Lt/b;ILV/n;I)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LC9/g;Lt/b;LV/n;I)V
    .locals 4

    .prologue
    const v0, -0x691d3df4

    invoke-interface {p2, v0}, LV/n;->r(I)LV/n;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-interface {p2, p1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {p2}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LV/n;->A()V

    goto :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "moe.tlaster.precompose.navigation.ComposeContent (NavHost.kt:298)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_6
    invoke-virtual {p0}, LC9/g;->k()LD9/c;

    invoke-virtual {p0}, LC9/g;->k()LD9/c;

    move-result-object v0

    instance-of v2, v0, LD9/a;

    const/4 v3, 0x0

    if-eqz v2, :cond_7

    check-cast v0, LD9/a;

    goto :goto_4

    :cond_7
    move-object v0, v3

    :goto_4
    if-eqz v0, :cond_8

    invoke-interface {v0}, LD9/a;->a()Lx7/r;

    move-result-object v3

    :cond_8
    if-eqz v3, :cond_9

    shr-int/lit8 v0, v1, 0x3

    and-int/lit8 v0, v0, 0xe

    shl-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, p1, p0, p2, v0}, Lx7/r;->o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LV/q;->P()V

    :cond_a
    :goto_5
    invoke-interface {p2}, LV/n;->x()LV/e1;

    move-result-object p2

    if-eqz p2, :cond_b

    new-instance v0, LC9/o;

    invoke-direct {v0, p0, p1, p3}, LC9/o;-><init>(LC9/g;Lt/b;I)V

    invoke-interface {p2, v0}, LV/e1;->a(Lx7/p;)V

    :cond_b
    return-void
.end method

.method private static final f(LC9/g;Lt/b;ILV/n;I)Li7/M;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LC9/p;->e(LC9/g;Lt/b;LV/n;I)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final g(LC9/v;Ljava/lang/String;Landroidx/compose/ui/d;LE9/a;LC9/O;Lx7/l;LV/n;II)V
    .locals 24

    .prologue
    move-object/from16 v11, p0

    move-object/from16 v12, p1

    move-object/from16 v0, p3

    move-object/from16 v13, p5

    move/from16 v14, p7

    const-string v1, "navigator"

    invoke-static {v11, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "initialRoute"

    invoke-static {v12, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "builder"

    invoke-static {v13, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x17d72130

    move-object/from16 v2, p6

    invoke-interface {v2, v1}, LV/n;->r(I)LV/n;

    move-result-object v15

    and-int/lit8 v2, p8, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v14, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v14, 0x6

    if-nez v2, :cond_2

    invoke-interface {v15, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_2
    move v2, v14

    :goto_1
    and-int/lit8 v3, p8, 0x2

    const/16 v4, 0x20

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v14, 0x30

    if-nez v3, :cond_5

    invoke-interface {v15, v12}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v4

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p8, 0x4

    if-eqz v3, :cond_7

    or-int/lit16 v2, v2, 0x180

    :cond_6
    move-object/from16 v5, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v5, v14, 0x180

    if-nez v5, :cond_6

    move-object/from16 v5, p2

    invoke-interface {v15, v5}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x100

    goto :goto_4

    :cond_8
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v2, v6

    :goto_5
    and-int/lit16 v6, v14, 0xc00

    if-nez v6, :cond_b

    and-int/lit8 v6, p8, 0x8

    if-nez v6, :cond_a

    and-int/lit16 v6, v14, 0x1000

    if-nez v6, :cond_9

    invoke-interface {v15, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_6

    :cond_9
    invoke-interface {v15, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v6

    :goto_6
    if-eqz v6, :cond_a

    const/16 v6, 0x800

    goto :goto_7

    :cond_a
    const/16 v6, 0x400

    :goto_7
    or-int/2addr v2, v6

    :cond_b
    and-int/lit8 v6, p8, 0x10

    if-eqz v6, :cond_d

    or-int/lit16 v2, v2, 0x6000

    :cond_c
    move-object/from16 v7, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v7, v14, 0x6000

    if-nez v7, :cond_c

    move-object/from16 v7, p4

    invoke-interface {v15, v7}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_e

    const/16 v9, 0x4000

    goto :goto_8

    :cond_e
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v2, v9

    :goto_9
    and-int/lit8 v9, p8, 0x20

    const/high16 v10, 0x20000

    const/high16 v16, 0x30000

    if-eqz v9, :cond_f

    or-int v2, v2, v16

    goto :goto_b

    :cond_f
    and-int v9, v14, v16

    if-nez v9, :cond_11

    invoke-interface {v15, v13}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_10

    move v9, v10

    goto :goto_a

    :cond_10
    const/high16 v9, 0x10000

    :goto_a
    or-int/2addr v2, v9

    :cond_11
    :goto_b
    const v9, 0x12493

    and-int/2addr v9, v2

    const v8, 0x12492

    if-ne v9, v8, :cond_13

    invoke-interface {v15}, LV/n;->u()Z

    move-result v8

    if-nez v8, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v15}, LV/n;->A()V

    move-object v4, v0

    move-object v3, v5

    move-object v5, v7

    goto/16 :goto_12

    :cond_13
    :goto_c
    invoke-interface {v15}, LV/n;->q()V

    and-int/lit8 v8, v14, 0x1

    const/4 v9, 0x0

    if-eqz v8, :cond_17

    invoke-interface {v15}, LV/n;->G()Z

    move-result v8

    if-eqz v8, :cond_14

    goto :goto_d

    :cond_14
    invoke-interface {v15}, LV/n;->A()V

    and-int/lit8 v3, p8, 0x8

    if-eqz v3, :cond_15

    and-int/lit16 v2, v2, -0x1c01

    :cond_15
    move-object/from16 v17, v0

    move v8, v2

    move-object/from16 v16, v5

    :cond_16
    move-object/from16 v18, v7

    goto :goto_f

    :cond_17
    :goto_d
    if-eqz v3, :cond_18

    sget-object v3, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_e

    :cond_18
    move-object v3, v5

    :goto_e
    and-int/lit8 v5, p8, 0x8

    if-eqz v5, :cond_1a

    const v0, 0x73d01ca

    invoke-interface {v15, v0}, LV/n;->T(I)V

    invoke-interface {v15}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v5, LV/n;->a:LV/n$a;

    invoke-virtual {v5}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v0, v5, :cond_19

    const/16 v22, 0x3f

    const/16 v23, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v16 .. v23}, LE9/b;->b(Landroidx/compose/animation/h;Landroidx/compose/animation/j;Landroidx/compose/animation/j;Landroidx/compose/animation/h;FFILjava/lang/Object;)LE9/a;

    move-result-object v0

    invoke-interface {v15, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_19
    check-cast v0, LE9/a;

    invoke-interface {v15}, LV/n;->J()V

    and-int/lit16 v2, v2, -0x1c01

    :cond_1a
    move-object/from16 v17, v0

    move v8, v2

    move-object/from16 v16, v3

    if-eqz v6, :cond_16

    move-object/from16 v18, v9

    :goto_f
    invoke-interface {v15}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1b

    const/4 v0, -0x1

    const-string v2, "moe.tlaster.precompose.navigation.NavHost (NavHost.kt:71)"

    invoke-static {v1, v8, v0, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1b
    invoke-static {}, La2/a;->a()LV/O0;

    move-result-object v0

    invoke-interface {v15, v0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/r;

    const/4 v1, 0x0

    invoke-static {v15, v1}, Le0/f;->a(LV/n;I)Le0/d;

    move-result-object v7

    sget-object v2, Ld2/a;->a:Ld2/a;

    sget v3, Ld2/a;->c:I

    invoke-virtual {v2, v15, v3}, Ld2/a;->a(LV/n;I)Landroidx/lifecycle/Y;

    move-result-object v2

    if-eqz v2, :cond_2b

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const v5, 0x73d46db

    invoke-interface {v15, v5}, LV/n;->T(I)V

    invoke-interface {v15, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v15, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface {v15, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface {v15}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_1c

    sget-object v5, LV/n;->a:LV/n$a;

    invoke-virtual {v5}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_1d

    :cond_1c
    new-instance v6, LC9/p$a;

    invoke-direct {v6, v11, v0, v2, v9}, LC9/p$a;-><init>(LC9/v;Landroidx/lifecycle/r;Landroidx/lifecycle/Y;Lm7/e;)V

    invoke-interface {v15, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1d
    check-cast v6, Lx7/p;

    invoke-interface {v15}, LV/n;->J()V

    const/4 v0, 0x6

    invoke-static {v3, v6, v15, v0}, LV/Q;->e(Ljava/lang/Object;Lx7/p;LV/n;I)V

    const v2, 0x73d5ddf

    invoke-interface {v15, v2}, LV/n;->T(I)V

    invoke-interface {v15, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 v3, v8, 0x70

    const/4 v6, 0x1

    if-ne v3, v4, :cond_1e

    move v4, v6

    goto :goto_10

    :cond_1e
    move v4, v1

    :goto_10
    or-int/2addr v2, v4

    const/high16 v4, 0x70000

    and-int/2addr v4, v8

    if-ne v4, v10, :cond_1f

    move v4, v6

    goto :goto_11

    :cond_1f
    move v4, v1

    :goto_11
    or-int/2addr v2, v4

    invoke-interface {v15}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_20

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_21

    :cond_20
    new-instance v4, LC9/p$b;

    invoke-direct {v4, v11, v12, v13, v9}, LC9/p$b;-><init>(LC9/v;Ljava/lang/String;Lx7/l;Lm7/e;)V

    invoke-interface {v15, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_21
    check-cast v4, Lx7/p;

    invoke-interface {v15}, LV/n;->J()V

    shr-int/lit8 v2, v8, 0xf

    and-int/lit8 v2, v2, 0xe

    or-int/2addr v2, v3

    invoke-static {v13, v12, v4, v15, v2}, LV/Q;->d(Ljava/lang/Object;Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-virtual/range {p0 .. p0}, LC9/v;->b()LC9/i;

    move-result-object v2

    invoke-virtual {v2}, LC9/i;->c()LZ8/f;

    move-result-object v2

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v19, 0x30

    const/16 v20, 0x2

    const/4 v4, 0x0

    move-object v3, v10

    move-object v5, v15

    move/from16 v6, v19

    move-object v1, v7

    move/from16 v7, v20

    invoke-static/range {v2 .. v7}, LV/v1;->a(LZ8/f;Ljava/lang/Object;Lm7/i;LV/n;II)LV/G1;

    move-result-object v19

    invoke-virtual/range {p0 .. p0}, LC9/v;->b()LC9/i;

    move-result-object v2

    invoke-virtual {v2}, LC9/i;->d()LZ8/f;

    move-result-object v2

    const/16 v6, 0x30

    const/4 v7, 0x2

    const/4 v3, 0x0

    invoke-static/range {v2 .. v7}, LV/v1;->a(LZ8/f;Ljava/lang/Object;Lm7/i;LV/n;II)LV/G1;

    move-result-object v7

    invoke-static {v7}, LC9/p;->n(LV/G1;)LC9/g;

    move-result-object v2

    const v3, 0x73d8929

    invoke-interface {v15, v3}, LV/n;->T(I)V

    invoke-interface {v15, v7}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v15, v1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {v15}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_22

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_23

    :cond_22
    new-instance v4, LC9/p$c;

    invoke-direct {v4, v1, v7, v9}, LC9/p$c;-><init>(Le0/d;LV/G1;Lm7/e;)V

    invoke-interface {v15, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_23
    check-cast v4, Lx7/p;

    invoke-interface {v15}, LV/n;->J()V

    const/4 v3, 0x0

    invoke-static {v2, v1, v4, v15, v3}, LV/Q;->d(Ljava/lang/Object;Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-virtual/range {p0 .. p0}, LC9/v;->b()LC9/i;

    move-result-object v2

    invoke-virtual {v2}, LC9/i;->h()LZ8/f;

    move-result-object v2

    const/16 v6, 0x30

    const/16 v20, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v15

    move-object/from16 v21, v7

    move/from16 v7, v20

    invoke-static/range {v2 .. v7}, LV/v1;->a(LZ8/f;Ljava/lang/Object;Lm7/i;LV/n;II)LV/G1;

    move-result-object v20

    invoke-virtual/range {p0 .. p0}, LC9/v;->b()LC9/i;

    move-result-object v2

    invoke-virtual {v2}, LC9/i;->k()LZ8/f;

    move-result-object v2

    const/4 v7, 0x2

    invoke-static/range {v2 .. v7}, LV/v1;->a(LZ8/f;Ljava/lang/Object;Lm7/i;LV/n;II)LV/G1;

    move-result-object v22

    invoke-virtual/range {p0 .. p0}, LC9/v;->b()LC9/i;

    move-result-object v2

    invoke-virtual {v2}, LC9/i;->e()LZ8/f;

    move-result-object v2

    invoke-static/range {v2 .. v7}, LV/v1;->a(LZ8/f;Ljava/lang/Object;Lm7/i;LV/n;II)LV/G1;

    move-result-object v23

    const v2, 0x73dea92

    invoke-interface {v15, v2}, LV/n;->T(I)V

    invoke-interface {v15}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_24

    const/4 v2, 0x0

    invoke-static {v2}, LV/J0;->a(F)LV/q0;

    move-result-object v2

    invoke-interface {v15, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_24
    move-object v6, v2

    check-cast v6, LV/q0;

    invoke-interface {v15}, LV/n;->J()V

    const v2, 0x73df2b0

    invoke-interface {v15, v2}, LV/n;->T(I)V

    invoke-interface {v15}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_25

    const/4 v4, 0x2

    invoke-static {v10, v9, v4, v9}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v2

    invoke-interface {v15, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_25
    move-object v7, v2

    check-cast v7, LV/w0;

    invoke-interface {v15}, LV/n;->J()V

    invoke-static/range {v19 .. v19}, LC9/p;->m(LV/G1;)Z

    move-result v2

    const v4, 0x73dfd0d

    invoke-interface {v15, v4}, LV/n;->T(I)V

    invoke-interface {v15}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_26

    new-instance v4, LC9/p$d;

    invoke-direct {v4, v7, v6, v9}, LC9/p$d;-><init>(LV/w0;LV/q0;Lm7/e;)V

    invoke-interface {v15, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_26
    check-cast v4, Lx7/p;

    invoke-interface {v15}, LV/n;->J()V

    const/4 v3, 0x0

    invoke-static {v2, v4, v15, v3, v3}, LC9/d;->d(ZLx7/p;LV/n;II)V

    invoke-static/range {v20 .. v20}, LC9/p;->o(LV/G1;)LC9/g;

    move-result-object v2

    if-nez v2, :cond_27

    invoke-static/range {v23 .. v23}, LC9/p;->q(LV/G1;)LC9/g;

    move-result-object v2

    if-eqz v2, :cond_28

    :cond_27
    new-instance v10, LC9/p$e;

    move/from16 v19, v0

    move-object v0, v10

    move-object v9, v1

    move-object/from16 v1, v20

    move-object/from16 v2, v18

    move-object/from16 v3, v22

    move-object/from16 v4, p0

    move-object/from16 v5, v17

    move/from16 v20, v8

    move-object/from16 v8, v21

    move-object v11, v10

    move-object/from16 v10, v23

    invoke-direct/range {v0 .. v10}, LC9/p$e;-><init>(LV/G1;LC9/O;LV/G1;LC9/v;LE9/a;LV/q0;LV/w0;LV/G1;Le0/d;LV/G1;)V

    const/16 v0, 0x36

    const v1, -0x6a73f5a1

    const/4 v2, 0x1

    invoke-static {v1, v2, v11, v15, v0}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v5

    shr-int/lit8 v0, v20, 0x6

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v7, v0, 0xc00

    const/4 v8, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v2, v16

    move-object v6, v15

    invoke-static/range {v2 .. v8}, LA/f;->a(Landroidx/compose/ui/d;Lh0/c;ZLx7/q;LV/n;II)V

    :cond_28
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_29

    invoke-static {}, LV/q;->P()V

    :cond_29
    move-object/from16 v3, v16

    move-object/from16 v4, v17

    move-object/from16 v5, v18

    :goto_12
    invoke-interface {v15}, LV/n;->x()LV/e1;

    move-result-object v9

    if-eqz v9, :cond_2a

    new-instance v10, LC9/l;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LC9/l;-><init>(LC9/v;Ljava/lang/String;Landroidx/compose/ui/d;LE9/a;LC9/O;Lx7/l;II)V

    invoke-interface {v9, v10}, LV/e1;->a(Lx7/p;)V

    :cond_2a
    return-void

    :cond_2b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final h(LV/q0;)F
    .locals 0

    invoke-interface {p0}, LV/S;->b()F

    move-result p0

    return p0
.end method

.method private static final i(LV/q0;F)V
    .locals 0

    invoke-interface {p0, p1}, LV/q0;->h(F)V

    return-void
.end method

.method private static final j(LV/w0;)Z
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final k(LV/w0;Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final l(LC9/v;Ljava/lang/String;Landroidx/compose/ui/d;LE9/a;LC9/O;Lx7/l;IILV/n;I)Li7/M;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, LV/S0;->a(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p8

    move/from16 v9, p7

    invoke-static/range {v1 .. v9}, LC9/p;->g(LC9/v;Ljava/lang/String;Landroidx/compose/ui/d;LE9/a;LC9/O;Lx7/l;LV/n;II)V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method

.method private static final m(LV/G1;)Z
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final n(LV/G1;)LC9/g;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LC9/g;

    return-object p0
.end method

.method private static final o(LV/G1;)LC9/g;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LC9/g;

    return-object p0
.end method

.method private static final p(LV/G1;)LC9/g;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LC9/g;

    return-object p0
.end method

.method private static final q(LV/G1;)LC9/g;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LC9/g;

    return-object p0
.end method

.method private static final r(Lt/b;Le0/d;LC9/g;LV/n;I)V
    .locals 6

    .prologue
    const v0, 0x85ce78d

    invoke-interface {p3, v0}, LV/n;->r(I)LV/n;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    invoke-interface {p3, p1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_5

    invoke-interface {p3, p2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_7

    invoke-interface {p3}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LV/n;->A()V

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v3, "moe.tlaster.precompose.navigation.NavHostContent (NavHost.kt:271)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_8
    invoke-virtual {p2}, LC9/g;->m()Ljava/lang/String;

    move-result-object v0

    new-instance v2, LC9/p$f;

    invoke-direct {v2, p2, p0}, LC9/p$f;-><init>(LC9/g;Lt/b;)V

    const/16 v3, 0x36

    const v4, -0x687c1bf4

    const/4 v5, 0x1

    invoke-static {v4, v5, v2, p3, v3}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v2

    shl-int/lit8 v3, v1, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/lit8 v3, v3, 0x30

    invoke-interface {p1, v0, v2, p3, v3}, Le0/d;->d(Ljava/lang/Object;Lx7/p;LV/n;I)V

    const v0, -0x6a57799c

    invoke-interface {p3, v0}, LV/n;->T(I)V

    invoke-interface {p3, p2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_9

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_a

    :cond_9
    new-instance v2, LC9/m;

    invoke-direct {v2, p2}, LC9/m;-><init>(LC9/g;)V

    invoke-interface {p3, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v2, Lx7/l;

    invoke-interface {p3}, LV/n;->J()V

    shr-int/lit8 v0, v1, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {p2, v2, p3, v0}, LV/Q;->b(Ljava/lang/Object;Lx7/l;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LV/q;->P()V

    :cond_b
    :goto_5
    invoke-interface {p3}, LV/n;->x()LV/e1;

    move-result-object p3

    if-eqz p3, :cond_c

    new-instance v0, LC9/n;

    invoke-direct {v0, p0, p1, p2, p4}, LC9/n;-><init>(Lt/b;Le0/d;LC9/g;I)V

    invoke-interface {p3, v0}, LV/e1;->a(Lx7/p;)V

    :cond_c
    return-void
.end method

.method private static final s(LC9/g;LV/N;)LV/M;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LC9/g;->d()V

    new-instance p1, LC9/p$g;

    invoke-direct {p1, p0}, LC9/p$g;-><init>(LC9/g;)V

    return-object p1
.end method

.method private static final t(Lt/b;Le0/d;LC9/g;ILV/n;I)Li7/M;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LV/S0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, LC9/p;->r(Lt/b;Le0/d;LC9/g;LV/n;I)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final synthetic u(LC9/g;Lt/b;LV/n;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LC9/p;->e(LC9/g;Lt/b;LV/n;I)V

    return-void
.end method

.method public static final synthetic v(LV/q0;)F
    .locals 0

    invoke-static {p0}, LC9/p;->h(LV/q0;)F

    move-result p0

    return p0
.end method

.method public static final synthetic w(LV/q0;F)V
    .locals 0

    invoke-static {p0, p1}, LC9/p;->i(LV/q0;F)V

    return-void
.end method

.method public static final synthetic x(LV/w0;)Z
    .locals 0

    invoke-static {p0}, LC9/p;->j(LV/w0;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic y(LV/w0;Z)V
    .locals 0

    invoke-static {p0, p1}, LC9/p;->k(LV/w0;Z)V

    return-void
.end method

.method public static final synthetic z(LV/G1;)LC9/g;
    .locals 0

    invoke-static {p0}, LC9/p;->n(LV/G1;)LC9/g;

    move-result-object p0

    return-object p0
.end method
