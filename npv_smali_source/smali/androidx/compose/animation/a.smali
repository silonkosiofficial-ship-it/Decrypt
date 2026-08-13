.class public abstract Landroidx/compose/animation/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/Object;Landroidx/compose/ui/d;Lx7/l;Lh0/c;Ljava/lang/String;Lx7/l;Lx7/r;LV/n;II)V
    .locals 18

    .prologue
    move-object/from16 v1, p0

    move/from16 v8, p8

    const v0, 0x7f1ebc6d

    move-object/from16 v2, p7

    invoke-interface {v2, v0}, LV/n;->r(I)LV/n;

    move-result-object v2

    and-int/lit8 v3, p9, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v8, 0x6

    goto :goto_2

    :cond_0
    and-int/lit8 v3, v8, 0x6

    if-nez v3, :cond_3

    and-int/lit8 v3, v8, 0x8

    if-nez v3, :cond_1

    invoke-interface {v2, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_1
    invoke-interface {v2, v1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_2

    const/4 v3, 0x4

    goto :goto_1

    :cond_2
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v8

    goto :goto_2

    :cond_3
    move v3, v8

    :goto_2
    and-int/lit8 v4, p9, 0x2

    if-eqz v4, :cond_5

    or-int/lit8 v3, v3, 0x30

    :cond_4
    move-object/from16 v5, p1

    goto :goto_4

    :cond_5
    and-int/lit8 v5, v8, 0x30

    if-nez v5, :cond_4

    move-object/from16 v5, p1

    invoke-interface {v2, v5}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x20

    goto :goto_3

    :cond_6
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v3, v6

    :goto_4
    and-int/lit8 v6, p9, 0x4

    if-eqz v6, :cond_8

    or-int/lit16 v3, v3, 0x180

    :cond_7
    move-object/from16 v7, p2

    goto :goto_6

    :cond_8
    and-int/lit16 v7, v8, 0x180

    if-nez v7, :cond_7

    move-object/from16 v7, p2

    invoke-interface {v2, v7}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    const/16 v9, 0x100

    goto :goto_5

    :cond_9
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v3, v9

    :goto_6
    and-int/lit8 v9, p9, 0x8

    if-eqz v9, :cond_b

    or-int/lit16 v3, v3, 0xc00

    :cond_a
    move-object/from16 v10, p3

    goto :goto_8

    :cond_b
    and-int/lit16 v10, v8, 0xc00

    if-nez v10, :cond_a

    move-object/from16 v10, p3

    invoke-interface {v2, v10}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/16 v11, 0x800

    goto :goto_7

    :cond_c
    const/16 v11, 0x400

    :goto_7
    or-int/2addr v3, v11

    :goto_8
    and-int/lit8 v11, p9, 0x10

    if-eqz v11, :cond_e

    or-int/lit16 v3, v3, 0x6000

    :cond_d
    move-object/from16 v12, p4

    goto :goto_a

    :cond_e
    and-int/lit16 v12, v8, 0x6000

    if-nez v12, :cond_d

    move-object/from16 v12, p4

    invoke-interface {v2, v12}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_f

    const/16 v13, 0x4000

    goto :goto_9

    :cond_f
    const/16 v13, 0x2000

    :goto_9
    or-int/2addr v3, v13

    :goto_a
    and-int/lit8 v13, p9, 0x20

    const/high16 v14, 0x30000

    if-eqz v13, :cond_11

    or-int/2addr v3, v14

    :cond_10
    move-object/from16 v14, p5

    goto :goto_c

    :cond_11
    and-int/2addr v14, v8

    if-nez v14, :cond_10

    move-object/from16 v14, p5

    invoke-interface {v2, v14}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_12

    const/high16 v15, 0x20000

    goto :goto_b

    :cond_12
    const/high16 v15, 0x10000

    :goto_b
    or-int/2addr v3, v15

    :goto_c
    and-int/lit8 v15, p9, 0x40

    const/high16 v16, 0x180000

    if-eqz v15, :cond_14

    or-int v3, v3, v16

    :cond_13
    move-object/from16 v15, p6

    goto :goto_e

    :cond_14
    and-int v15, v8, v16

    if-nez v15, :cond_13

    move-object/from16 v15, p6

    invoke-interface {v2, v15}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_15

    const/high16 v16, 0x100000

    goto :goto_d

    :cond_15
    const/high16 v16, 0x80000

    :goto_d
    or-int v3, v3, v16

    :goto_e
    const v16, 0x92493

    and-int v0, v3, v16

    const v5, 0x92492

    if-ne v0, v5, :cond_17

    invoke-interface {v2}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_f

    :cond_16
    invoke-interface {v2}, LV/n;->A()V

    move-object/from16 v3, p1

    move-object v4, v10

    move-object v5, v12

    move-object v6, v14

    goto/16 :goto_14

    :cond_17
    :goto_f
    if-eqz v4, :cond_18

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_10

    :cond_18
    move-object/from16 v0, p1

    :goto_10
    if-eqz v6, :cond_19

    sget-object v4, Landroidx/compose/animation/a$a;->D:Landroidx/compose/animation/a$a;

    move-object v7, v4

    :cond_19
    if-eqz v9, :cond_1a

    sget-object v4, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v4}, Lh0/c$a;->o()Lh0/c;

    move-result-object v4

    goto :goto_11

    :cond_1a
    move-object v4, v10

    :goto_11
    if-eqz v11, :cond_1b

    const-string v5, "AnimatedContent"

    goto :goto_12

    :cond_1b
    move-object v5, v12

    :goto_12
    if-eqz v13, :cond_1c

    sget-object v6, Landroidx/compose/animation/a$b;->D:Landroidx/compose/animation/a$b;

    goto :goto_13

    :cond_1c
    move-object v6, v14

    :goto_13
    invoke-static {}, LV/q;->H()Z

    move-result v9

    if-eqz v9, :cond_1d

    const/4 v9, -0x1

    const-string v10, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)"

    const v11, 0x7f1ebc6d

    invoke-static {v11, v3, v9, v10}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1d
    and-int/lit8 v9, v3, 0xe

    shr-int/lit8 v10, v3, 0x9

    and-int/lit8 v10, v10, 0x70

    or-int/2addr v9, v10

    const/4 v10, 0x0

    invoke-static {v1, v5, v2, v9, v10}, Lu/u0;->g(Ljava/lang/Object;Ljava/lang/String;LV/n;II)Lu/s0;

    move-result-object v9

    and-int/lit16 v10, v3, 0x1ff0

    shr-int/lit8 v3, v3, 0x3

    const v11, 0xe000

    and-int/2addr v11, v3

    or-int/2addr v10, v11

    const/high16 v11, 0x70000

    and-int/2addr v3, v11

    or-int v16, v10, v3

    const/16 v17, 0x0

    move-object v10, v0

    move-object v11, v7

    move-object v12, v4

    move-object v13, v6

    move-object/from16 v14, p6

    move-object v15, v2

    invoke-static/range {v9 .. v17}, Landroidx/compose/animation/a;->b(Lu/s0;Landroidx/compose/ui/d;Lx7/l;Lh0/c;Lx7/l;Lx7/r;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_1e

    invoke-static {}, LV/q;->P()V

    :cond_1e
    move-object v3, v0

    :goto_14
    invoke-interface {v2}, LV/n;->x()LV/e1;

    move-result-object v10

    if-eqz v10, :cond_1f

    new-instance v11, Landroidx/compose/animation/a$c;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object v2, v3

    move-object v3, v7

    move-object/from16 v7, p6

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Landroidx/compose/animation/a$c;-><init>(Ljava/lang/Object;Landroidx/compose/ui/d;Lx7/l;Lh0/c;Ljava/lang/String;Lx7/l;Lx7/r;II)V

    invoke-interface {v10, v11}, LV/e1;->a(Lx7/p;)V

    :cond_1f
    return-void
.end method

.method public static final b(Lu/s0;Landroidx/compose/ui/d;Lx7/l;Lh0/c;Lx7/l;Lx7/r;LV/n;II)V
    .locals 18

    .prologue
    move-object/from16 v7, p0

    move/from16 v8, p7

    const/16 v0, 0x10

    const/4 v1, 0x2

    const/4 v10, 0x1

    const v2, -0x6d60584

    move-object/from16 v3, p6

    invoke-interface {v3, v2}, LV/n;->r(I)LV/n;

    move-result-object v11

    const/high16 v3, -0x80000000

    and-int v3, p8, v3

    const/4 v4, 0x4

    if-eqz v3, :cond_0

    or-int/lit8 v3, v8, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v8, 0x6

    if-nez v3, :cond_2

    invoke-interface {v11, v7}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    or-int/2addr v3, v8

    goto :goto_1

    :cond_2
    move v3, v8

    :goto_1
    and-int/lit8 v5, p8, 0x1

    if-eqz v5, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v8, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v11, v6}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    const/16 v12, 0x20

    goto :goto_2

    :cond_5
    move v12, v0

    :goto_2
    or-int/2addr v3, v12

    :goto_3
    and-int/lit8 v1, p8, 0x2

    if-eqz v1, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v12, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v12, v8, 0x180

    if-nez v12, :cond_6

    move-object/from16 v12, p2

    invoke-interface {v11, v12}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    const/16 v13, 0x100

    goto :goto_4

    :cond_8
    const/16 v13, 0x80

    :goto_4
    or-int/2addr v3, v13

    :goto_5
    and-int/lit8 v13, p8, 0x4

    if-eqz v13, :cond_a

    or-int/lit16 v3, v3, 0xc00

    :cond_9
    move-object/from16 v14, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v14, v8, 0xc00

    if-nez v14, :cond_9

    move-object/from16 v14, p3

    invoke-interface {v11, v14}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_b

    const/16 v15, 0x800

    goto :goto_6

    :cond_b
    const/16 v15, 0x400

    :goto_6
    or-int/2addr v3, v15

    :goto_7
    and-int/lit8 v15, p8, 0x8

    if-eqz v15, :cond_d

    or-int/lit16 v3, v3, 0x6000

    :cond_c
    move-object/from16 v9, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v9, v8, 0x6000

    if-nez v9, :cond_c

    move-object/from16 v9, p4

    invoke-interface {v11, v9}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v16, 0x4000

    goto :goto_8

    :cond_e
    const/16 v16, 0x2000

    :goto_8
    or-int v3, v3, v16

    :goto_9
    and-int/lit8 v0, p8, 0x10

    const/high16 v16, 0x30000

    if-eqz v0, :cond_10

    or-int v3, v3, v16

    :cond_f
    move-object/from16 v0, p5

    goto :goto_b

    :cond_10
    and-int v0, v8, v16

    if-nez v0, :cond_f

    move-object/from16 v0, p5

    invoke-interface {v11, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v16, 0x10000

    :goto_a
    or-int v3, v3, v16

    :goto_b
    const v16, 0x12493

    and-int v10, v3, v16

    const v4, 0x12492

    if-ne v10, v4, :cond_13

    invoke-interface {v11}, LV/n;->u()Z

    move-result v4

    if-nez v4, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v11}, LV/n;->A()V

    move-object v2, v6

    move-object v5, v9

    move-object v3, v12

    move-object v4, v14

    goto/16 :goto_1a

    :cond_13
    :goto_c
    if-eqz v5, :cond_14

    sget-object v4, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    move-object v10, v4

    goto :goto_d

    :cond_14
    move-object v10, v6

    :goto_d
    if-eqz v1, :cond_15

    sget-object v1, Landroidx/compose/animation/a$d;->D:Landroidx/compose/animation/a$d;

    move-object v12, v1

    :cond_15
    if-eqz v13, :cond_16

    sget-object v1, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v1}, Lh0/c$a;->o()Lh0/c;

    move-result-object v1

    move-object v14, v1

    :cond_16
    if-eqz v15, :cond_17

    sget-object v1, Landroidx/compose/animation/a$e;->D:Landroidx/compose/animation/a$e;

    move-object v9, v1

    :cond_17
    invoke-static {}, LV/q;->H()Z

    move-result v1

    const/4 v4, -0x1

    if-eqz v1, :cond_18

    const-string v1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:713)"

    invoke-static {v2, v3, v4, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_18
    invoke-static {}, Landroidx/compose/ui/platform/p0;->k()LV/O0;

    move-result-object v1

    invoke-interface {v11, v1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/v;

    and-int/lit8 v2, v3, 0xe

    const/4 v3, 0x4

    if-ne v2, v3, :cond_19

    const/4 v3, 0x1

    goto :goto_e

    :cond_19
    const/4 v3, 0x0

    :goto_e
    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_1a

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_1b

    :cond_1a
    new-instance v5, Landroidx/compose/animation/e;

    invoke-direct {v5, v7, v14, v1}, Landroidx/compose/animation/e;-><init>(Lu/s0;Lh0/c;LY0/v;)V

    invoke-interface {v11, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1b
    move-object v13, v5

    check-cast v13, Landroidx/compose/animation/e;

    const/4 v3, 0x4

    if-ne v2, v3, :cond_1c

    const/4 v3, 0x1

    goto :goto_f

    :cond_1c
    const/4 v3, 0x0

    :goto_f
    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_1d

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_1e

    :cond_1d
    invoke-virtual/range {p0 .. p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v3

    const/4 v5, 0x1

    new-array v6, v5, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v6, v5

    invoke-static {v6}, LV/v1;->g([Ljava/lang/Object;)Lf0/r;

    move-result-object v5

    invoke-interface {v11, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1e
    move-object v15, v5

    check-cast v15, Lf0/r;

    const/4 v3, 0x4

    if-ne v2, v3, :cond_1f

    const/4 v2, 0x1

    goto :goto_10

    :cond_1f
    const/4 v2, 0x0

    :goto_10
    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_20

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_21

    :cond_20
    invoke-static {}, Lr/V;->d()Lr/K;

    move-result-object v3

    invoke-interface {v11, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_21
    move-object v6, v3

    check-cast v6, Lr/K;

    invoke-virtual/range {p0 .. p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v15, v2}, Lf0/r;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_22

    invoke-virtual {v15}, Lf0/r;->clear()V

    invoke-virtual/range {p0 .. p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v15, v2}, Lf0/r;->add(Ljava/lang/Object;)Z

    :cond_22
    invoke-virtual/range {p0 .. p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_27

    invoke-virtual {v15}, Lf0/r;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_23

    const/4 v2, 0x0

    invoke-virtual {v15, v2}, Lf0/r;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_24

    :cond_23
    invoke-virtual {v15}, Lf0/r;->clear()V

    invoke-virtual/range {p0 .. p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v15, v2}, Lf0/r;->add(Ljava/lang/Object;)Z

    :cond_24
    invoke-virtual {v6}, Lr/U;->e()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_25

    invoke-virtual/range {p0 .. p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v6, v2}, Lr/U;->b(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_26

    :cond_25
    invoke-virtual {v6}, Lr/K;->i()V

    :cond_26
    invoke-virtual {v13, v14}, Landroidx/compose/animation/e;->k(Lh0/c;)V

    invoke-virtual {v13, v1}, Landroidx/compose/animation/e;->l(LY0/v;)V

    :cond_27
    invoke-virtual/range {p0 .. p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    invoke-virtual/range {p0 .. p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v15, v1}, Lf0/r;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_29

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v9, v3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v9, v5}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_28

    goto :goto_12

    :cond_28
    const/4 v3, 0x1

    add-int/2addr v2, v3

    goto :goto_11

    :cond_29
    move v2, v4

    :goto_12
    invoke-virtual/range {p0 .. p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v4, :cond_2a

    invoke-virtual {v15, v1}, Lf0/r;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_2a
    invoke-virtual {v15, v2, v1}, Lf0/r;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2b
    :goto_13
    invoke-virtual/range {p0 .. p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v6, v1}, Lr/U;->b(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2d

    invoke-virtual/range {p0 .. p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v6, v1}, Lr/U;->b(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    goto :goto_14

    :cond_2c
    const v1, 0x3691f797    # 4.35016E-6f

    invoke-interface {v11, v1}, LV/n;->T(I)V

    invoke-interface {v11}, LV/n;->J()V

    move-object/from16 p1, v14

    move-object v14, v6

    goto :goto_16

    :cond_2d
    :goto_14
    const v1, 0x366a3a81

    invoke-interface {v11, v1}, LV/n;->T(I)V

    invoke-virtual {v6}, Lr/K;->i()V

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v5

    const/4 v4, 0x0

    :goto_15
    if-ge v4, v5, :cond_2e

    invoke-interface {v15, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    new-instance v2, Landroidx/compose/animation/a$f;

    move-object v0, v2

    move-object/from16 v1, p0

    move-object v7, v2

    move-object v2, v3

    move-object v8, v3

    move-object v3, v12

    move/from16 v16, v4

    move-object v4, v13

    move/from16 v17, v5

    move-object v5, v15

    move-object/from16 p1, v14

    move-object v14, v6

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v6}, Landroidx/compose/animation/a$f;-><init>(Lu/s0;Ljava/lang/Object;Lx7/l;Landroidx/compose/animation/e;Lf0/r;Lx7/r;)V

    const/16 v0, 0x36

    const v1, 0x34c9ce26

    const/4 v2, 0x1

    invoke-static {v1, v2, v7, v11, v0}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v0

    invoke-virtual {v14, v8, v0}, Lr/K;->s(Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v4, v16, 0x1

    move-object/from16 v7, p0

    move-object/from16 v0, p5

    move/from16 v8, p7

    move-object v6, v14

    move/from16 v5, v17

    move-object/from16 v14, p1

    goto :goto_15

    :cond_2e
    move-object/from16 p1, v14

    move-object v14, v6

    invoke-interface {v11}, LV/n;->J()V

    :goto_16
    invoke-virtual/range {p0 .. p0}, Lu/s0;->n()Lu/s0$b;

    move-result-object v0

    invoke-interface {v11, v13}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v11, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v1

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_2f

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_30

    :cond_2f
    invoke-interface {v12, v13}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lt/k;

    invoke-interface {v11, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_30
    check-cast v1, Lt/k;

    const/4 v0, 0x0

    invoke-virtual {v13, v1, v11, v0}, Landroidx/compose/animation/e;->e(Lt/k;LV/n;I)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-interface {v10, v1}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_31

    new-instance v1, Landroidx/compose/animation/b;

    invoke-direct {v1, v13}, Landroidx/compose/animation/b;-><init>(Landroidx/compose/animation/e;)V

    invoke-interface {v11, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_31
    check-cast v1, Landroidx/compose/animation/b;

    const/4 v2, 0x0

    invoke-static {v11, v2}, LV/k;->a(LV/n;I)I

    move-result v3

    invoke-interface {v11}, LV/n;->F()LV/z;

    move-result-object v2

    invoke-static {v11, v0}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    sget-object v4, LF0/g;->a:LF0/g$a;

    invoke-virtual {v4}, LF0/g$a;->a()Lx7/a;

    move-result-object v5

    invoke-interface {v11}, LV/n;->v()LV/g;

    move-result-object v6

    instance-of v6, v6, LV/g;

    if-nez v6, :cond_32

    invoke-static {}, LV/k;->c()V

    :cond_32
    invoke-interface {v11}, LV/n;->t()V

    invoke-interface {v11}, LV/n;->o()Z

    move-result v6

    if-eqz v6, :cond_33

    invoke-interface {v11, v5}, LV/n;->B(Lx7/a;)V

    goto :goto_17

    :cond_33
    invoke-interface {v11}, LV/n;->H()V

    :goto_17
    invoke-static {v11}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v5

    invoke-virtual {v4}, LF0/g$a;->c()Lx7/p;

    move-result-object v6

    invoke-static {v5, v1, v6}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v4}, LF0/g$a;->e()Lx7/p;

    move-result-object v1

    invoke-static {v5, v2, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v4}, LF0/g$a;->b()Lx7/p;

    move-result-object v1

    invoke-interface {v5}, LV/n;->o()Z

    move-result v2

    if-nez v2, :cond_34

    invoke-interface {v5}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_35

    :cond_34
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2, v1}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_35
    invoke-virtual {v4}, LF0/g$a;->d()Lx7/p;

    move-result-object v1

    invoke-static {v5, v0, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    const v0, -0x58dee1d6

    invoke-interface {v11, v0}, LV/n;->T(I)V

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v0

    const/4 v5, 0x0

    :goto_18
    if-ge v5, v0, :cond_37

    invoke-interface {v15, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const v2, 0x71be94bd

    invoke-interface {v9, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v11, v2, v3}, LV/n;->s(ILjava/lang/Object;)V

    invoke-virtual {v14, v1}, Lr/U;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx7/p;

    if-nez v1, :cond_36

    const v1, -0x39eb2590

    invoke-interface {v11, v1}, LV/n;->T(I)V

    invoke-interface {v11}, LV/n;->J()V

    const/4 v2, 0x0

    goto :goto_19

    :cond_36
    const v2, 0x71be9bb1

    invoke-interface {v11, v2}, LV/n;->T(I)V

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v11, v3}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v11}, LV/n;->J()V

    :goto_19
    invoke-interface {v11}, LV/n;->N()V

    const/4 v1, 0x1

    add-int/2addr v5, v1

    goto :goto_18

    :cond_37
    invoke-interface {v11}, LV/n;->J()V

    invoke-interface {v11}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_38

    invoke-static {}, LV/q;->P()V

    :cond_38
    move-object/from16 v4, p1

    move-object v5, v9

    move-object v2, v10

    move-object v3, v12

    :goto_1a
    invoke-interface {v11}, LV/n;->x()LV/e1;

    move-result-object v9

    if-eqz v9, :cond_39

    new-instance v10, Landroidx/compose/animation/a$g;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Landroidx/compose/animation/a$g;-><init>(Lu/s0;Landroidx/compose/ui/d;Lx7/l;Lh0/c;Lx7/l;Lx7/r;II)V

    invoke-interface {v9, v10}, LV/e1;->a(Lx7/p;)V

    :cond_39
    return-void
.end method

.method public static final c(ZLx7/p;)Lt/x;
    .locals 1

    new-instance v0, Landroidx/compose/animation/l;

    invoke-direct {v0, p0, p1}, Landroidx/compose/animation/l;-><init>(ZLx7/p;)V

    return-object v0
.end method

.method public static synthetic d(ZLx7/p;ILjava/lang/Object;)Lt/x;
    .locals 0

    .prologue
    and-int/lit8 p3, p2, 0x1

    if-eqz p3, :cond_0

    const/4 p0, 0x1

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    sget-object p1, Landroidx/compose/animation/a$h;->D:Landroidx/compose/animation/a$h;

    :cond_1
    invoke-static {p0, p1}, Landroidx/compose/animation/a;->c(ZLx7/p;)Lt/x;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/animation/h;Landroidx/compose/animation/j;)Lt/k;
    .locals 8

    new-instance v7, Lt/k;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lt/k;-><init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;FLt/x;ILy7/k;)V

    return-object v7
.end method
