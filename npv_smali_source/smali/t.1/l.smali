.class public abstract Lt/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/Object;Landroidx/compose/ui/d;Lu/I;Ljava/lang/String;Lx7/q;LV/n;II)V
    .locals 17

    .prologue
    move-object/from16 v1, p0

    move/from16 v6, p6

    const v0, -0x1284b420

    move-object/from16 v2, p5

    invoke-interface {v2, v0}, LV/n;->r(I)LV/n;

    move-result-object v2

    and-int/lit8 v3, p7, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v6, 0x6

    goto :goto_2

    :cond_0
    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_3

    and-int/lit8 v3, v6, 0x8

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
    or-int/2addr v3, v6

    goto :goto_2

    :cond_3
    move v3, v6

    :goto_2
    and-int/lit8 v4, p7, 0x2

    if-eqz v4, :cond_5

    or-int/lit8 v3, v3, 0x30

    :cond_4
    move-object/from16 v5, p1

    goto :goto_4

    :cond_5
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_4

    move-object/from16 v5, p1

    invoke-interface {v2, v5}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x20

    goto :goto_3

    :cond_6
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v3, v7

    :goto_4
    and-int/lit8 v7, p7, 0x4

    if-eqz v7, :cond_8

    or-int/lit16 v3, v3, 0x180

    :cond_7
    move-object/from16 v8, p2

    goto :goto_6

    :cond_8
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_7

    move-object/from16 v8, p2

    invoke-interface {v2, v8}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    const/16 v9, 0x100

    goto :goto_5

    :cond_9
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v3, v9

    :goto_6
    and-int/lit8 v9, p7, 0x8

    if-eqz v9, :cond_b

    or-int/lit16 v3, v3, 0xc00

    :cond_a
    move-object/from16 v10, p3

    goto :goto_8

    :cond_b
    and-int/lit16 v10, v6, 0xc00

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
    and-int/lit8 v11, p7, 0x10

    if-eqz v11, :cond_d

    or-int/lit16 v3, v3, 0x6000

    move-object/from16 v15, p4

    goto :goto_a

    :cond_d
    and-int/lit16 v11, v6, 0x6000

    move-object/from16 v15, p4

    if-nez v11, :cond_f

    invoke-interface {v2, v15}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    const/16 v11, 0x4000

    goto :goto_9

    :cond_e
    const/16 v11, 0x2000

    :goto_9
    or-int/2addr v3, v11

    :cond_f
    :goto_a
    and-int/lit16 v11, v3, 0x2493

    const/16 v12, 0x2492

    if-ne v11, v12, :cond_11

    invoke-interface {v2}, LV/n;->u()Z

    move-result v11

    if-nez v11, :cond_10

    goto :goto_b

    :cond_10
    invoke-interface {v2}, LV/n;->A()V

    move-object v4, v5

    move-object v3, v8

    goto :goto_f

    :cond_11
    :goto_b
    if-eqz v4, :cond_12

    sget-object v4, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_c

    :cond_12
    move-object v4, v5

    :goto_c
    const/4 v5, 0x0

    if-eqz v7, :cond_13

    const/4 v7, 0x7

    const/4 v8, 0x0

    invoke-static {v5, v5, v8, v7, v8}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v7

    move-object/from16 v16, v7

    goto :goto_d

    :cond_13
    move-object/from16 v16, v8

    :goto_d
    if-eqz v9, :cond_14

    const-string v7, "Crossfade"

    move-object v14, v7

    goto :goto_e

    :cond_14
    move-object v14, v10

    :goto_e
    invoke-static {}, LV/q;->H()Z

    move-result v7

    if-eqz v7, :cond_15

    const/4 v7, -0x1

    const-string v8, "androidx.compose.animation.Crossfade (Crossfade.kt:55)"

    invoke-static {v0, v3, v7, v8}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_15
    and-int/lit8 v0, v3, 0xe

    shr-int/lit8 v7, v3, 0x6

    and-int/lit8 v7, v7, 0x70

    or-int/2addr v0, v7

    invoke-static {v1, v14, v2, v0, v5}, Lu/u0;->g(Ljava/lang/Object;Ljava/lang/String;LV/n;II)Lu/s0;

    move-result-object v7

    const v0, 0xe3f0

    and-int v13, v3, v0

    const/4 v0, 0x4

    const/4 v10, 0x0

    move-object v8, v4

    move-object/from16 v9, v16

    move-object/from16 v11, p4

    move-object v12, v2

    move-object v3, v14

    move v14, v0

    invoke-static/range {v7 .. v14}, Lt/l;->b(Lu/s0;Landroidx/compose/ui/d;Lu/I;Lx7/l;Lx7/q;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, LV/q;->P()V

    :cond_16
    move-object v10, v3

    move-object/from16 v3, v16

    :goto_f
    invoke-interface {v2}, LV/n;->x()LV/e1;

    move-result-object v8

    if-eqz v8, :cond_17

    new-instance v9, Lt/l$a;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object v2, v4

    move-object v4, v10

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lt/l$a;-><init>(Ljava/lang/Object;Landroidx/compose/ui/d;Lu/I;Ljava/lang/String;Lx7/q;II)V

    invoke-interface {v8, v9}, LV/e1;->a(Lx7/p;)V

    :cond_17
    return-void
.end method

.method public static final b(Lu/s0;Landroidx/compose/ui/d;Lu/I;Lx7/l;Lx7/q;LV/n;II)V
    .locals 16

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v5, p4

    move/from16 v6, p6

    const/4 v0, 0x2

    const/4 v2, 0x1

    const v3, 0x2878cc2f

    move-object/from16 v4, p5

    invoke-interface {v4, v3}, LV/n;->r(I)LV/n;

    move-result-object v4

    const/high16 v7, -0x80000000

    and-int v7, p7, v7

    const/4 v8, 0x4

    if-eqz v7, :cond_0

    or-int/lit8 v7, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v6, 0x6

    if-nez v7, :cond_2

    invoke-interface {v4, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v8

    goto :goto_0

    :cond_1
    move v7, v0

    :goto_0
    or-int/2addr v7, v6

    goto :goto_1

    :cond_2
    move v7, v6

    :goto_1
    and-int/lit8 v9, p7, 0x1

    if-eqz v9, :cond_4

    or-int/lit8 v7, v7, 0x30

    :cond_3
    move-object/from16 v10, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v10, v6, 0x30

    if-nez v10, :cond_3

    move-object/from16 v10, p1

    invoke-interface {v4, v10}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    const/16 v11, 0x20

    goto :goto_2

    :cond_5
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v7, v11

    :goto_3
    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_7

    or-int/lit16 v7, v7, 0x180

    :cond_6
    move-object/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v6, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-interface {v4, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v7, v12

    :goto_5
    and-int/lit8 v12, p7, 0x4

    if-eqz v12, :cond_a

    or-int/lit16 v7, v7, 0xc00

    :cond_9
    move-object/from16 v13, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v13, v6, 0xc00

    if-nez v13, :cond_9

    move-object/from16 v13, p3

    invoke-interface {v4, v13}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    const/16 v14, 0x800

    goto :goto_6

    :cond_b
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v7, v14

    :goto_7
    and-int/lit8 v14, p7, 0x8

    if-eqz v14, :cond_c

    or-int/lit16 v7, v7, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v14, v6, 0x6000

    if-nez v14, :cond_e

    invoke-interface {v4, v5}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    const/16 v14, 0x4000

    goto :goto_8

    :cond_d
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v7, v14

    :cond_e
    :goto_9
    and-int/lit16 v14, v7, 0x2493

    const/16 v15, 0x2492

    if-ne v14, v15, :cond_10

    invoke-interface {v4}, LV/n;->u()Z

    move-result v14

    if-nez v14, :cond_f

    goto :goto_b

    :cond_f
    invoke-interface {v4}, LV/n;->A()V

    move-object v2, v10

    :goto_a
    move-object v3, v11

    goto/16 :goto_1b

    :cond_10
    :goto_b
    if-eqz v9, :cond_11

    sget-object v9, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_c

    :cond_11
    move-object v9, v10

    :goto_c
    const/4 v10, 0x0

    if-eqz v0, :cond_12

    const/4 v0, 0x7

    const/4 v11, 0x0

    invoke-static {v10, v10, v11, v0, v11}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v0

    move-object v11, v0

    :cond_12
    if-eqz v12, :cond_13

    sget-object v0, Lt/l$b;->D:Lt/l$b;

    move-object v13, v0

    :cond_13
    invoke-static {}, LV/q;->H()Z

    move-result v0

    const/4 v12, -0x1

    if-eqz v0, :cond_14

    const-string v0, "androidx.compose.animation.Crossfade (Crossfade.kt:103)"

    invoke-static {v3, v7, v12, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_14
    invoke-interface {v4}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v14

    if-ne v0, v14, :cond_15

    invoke-static {}, LV/v1;->f()Lf0/r;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v0, v14}, Lf0/r;->add(Ljava/lang/Object;)Z

    invoke-interface {v4, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_15
    check-cast v0, Lf0/r;

    invoke-interface {v4}, LV/n;->g()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v15

    if-ne v14, v15, :cond_16

    invoke-static {}, Lr/V;->d()Lr/K;

    move-result-object v14

    invoke-interface {v4, v14}, LV/n;->K(Ljava/lang/Object;)V

    :cond_16
    check-cast v14, Lr/K;

    invoke-virtual/range {p0 .. p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v15, v12}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1c

    const v12, 0x334ca259

    invoke-interface {v4, v12}, LV/n;->T(I)V

    invoke-virtual {v0}, Lf0/r;->size()I

    move-result v12

    if-ne v12, v2, :cond_18

    invoke-virtual {v0, v10}, Lf0/r;->get(I)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v12, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_17

    goto :goto_e

    :cond_17
    const v3, 0x33519671

    invoke-interface {v4, v3}, LV/n;->T(I)V

    :goto_d
    invoke-interface {v4}, LV/n;->J()V

    goto :goto_10

    :cond_18
    :goto_e
    const v12, 0x334eaf2b

    invoke-interface {v4, v12}, LV/n;->T(I)V

    and-int/lit8 v7, v7, 0xe

    if-ne v7, v8, :cond_19

    move v7, v2

    goto :goto_f

    :cond_19
    move v7, v10

    :goto_f
    invoke-interface {v4}, LV/n;->g()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_1a

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v8, v3, :cond_1b

    :cond_1a
    new-instance v8, Lt/l$c;

    invoke-direct {v8, v1}, Lt/l$c;-><init>(Lu/s0;)V

    invoke-interface {v4, v8}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1b
    check-cast v8, Lx7/l;

    invoke-static {v0, v8}, Lj7/v;->I(Ljava/util/List;Lx7/l;)Z

    invoke-virtual {v14}, Lr/K;->i()V

    goto :goto_d

    :goto_10
    invoke-interface {v4}, LV/n;->J()V

    goto :goto_11

    :cond_1c
    const v3, 0x3351adb1

    invoke-interface {v4, v3}, LV/n;->T(I)V

    goto :goto_10

    :goto_11
    invoke-virtual/range {p0 .. p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v14, v3}, Lr/U;->a(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_21

    const v3, 0x33529cda

    invoke-interface {v4, v3}, LV/n;->T(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v7, v10

    :goto_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v13, v8}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v12

    invoke-interface {v13, v12}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v8, v12}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1d

    const/4 v3, -0x1

    goto :goto_13

    :cond_1d
    add-int/2addr v7, v2

    goto :goto_12

    :cond_1e
    const/4 v3, -0x1

    const/4 v7, -0x1

    :goto_13
    if-ne v7, v3, :cond_1f

    invoke-virtual/range {p0 .. p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Lf0/r;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_1f
    invoke-virtual/range {p0 .. p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v7, v3}, Lf0/r;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :goto_14
    invoke-virtual {v14}, Lr/K;->i()V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    move v7, v10

    :goto_15
    if-ge v7, v3, :cond_20

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    new-instance v12, Lt/l$d;

    invoke-direct {v12, v1, v11, v8, v5}, Lt/l$d;-><init>(Lu/s0;Lu/I;Ljava/lang/Object;Lx7/q;)V

    const/16 v15, 0x36

    const v10, -0x55057628

    invoke-static {v10, v2, v12, v4, v15}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v10

    invoke-virtual {v14, v8, v10}, Lr/K;->s(Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/2addr v7, v2

    const/4 v10, 0x0

    goto :goto_15

    :cond_20
    :goto_16
    invoke-interface {v4}, LV/n;->J()V

    goto :goto_17

    :cond_21
    const v3, 0x335e3631

    invoke-interface {v4, v3}, LV/n;->T(I)V

    goto :goto_16

    :goto_17
    sget-object v3, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v3}, Lh0/c$a;->o()Lh0/c;

    move-result-object v3

    const/4 v7, 0x0

    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v3

    invoke-static {v4, v7}, LV/k;->a(LV/n;I)I

    move-result v8

    invoke-interface {v4}, LV/n;->F()LV/z;

    move-result-object v7

    invoke-static {v4, v9}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v10

    sget-object v12, LF0/g;->a:LF0/g$a;

    invoke-virtual {v12}, LF0/g$a;->a()Lx7/a;

    move-result-object v15

    invoke-interface {v4}, LV/n;->v()LV/g;

    move-result-object v2

    instance-of v2, v2, LV/g;

    if-nez v2, :cond_22

    invoke-static {}, LV/k;->c()V

    :cond_22
    invoke-interface {v4}, LV/n;->t()V

    invoke-interface {v4}, LV/n;->o()Z

    move-result v2

    if-eqz v2, :cond_23

    invoke-interface {v4, v15}, LV/n;->B(Lx7/a;)V

    goto :goto_18

    :cond_23
    invoke-interface {v4}, LV/n;->H()V

    :goto_18
    invoke-static {v4}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v2

    invoke-virtual {v12}, LF0/g$a;->c()Lx7/p;

    move-result-object v15

    invoke-static {v2, v3, v15}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v12}, LF0/g$a;->e()Lx7/p;

    move-result-object v3

    invoke-static {v2, v7, v3}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v12}, LF0/g$a;->b()Lx7/p;

    move-result-object v3

    invoke-interface {v2}, LV/n;->o()Z

    move-result v7

    if-nez v7, :cond_24

    invoke-interface {v2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v7, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_25

    :cond_24
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v7}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v7, v3}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_25
    invoke-virtual {v12}, LF0/g$a;->d()Lx7/p;

    move-result-object v3

    invoke-static {v2, v10, v3}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    const v2, -0xb2cc140

    invoke-interface {v4, v2}, LV/n;->T(I)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v7, 0x0

    :goto_19
    if-ge v7, v2, :cond_27

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    const v8, -0x407c1425

    invoke-interface {v13, v3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v4, v8, v10}, LV/n;->s(ILjava/lang/Object;)V

    invoke-virtual {v14, v3}, Lr/U;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx7/p;

    if-nez v3, :cond_26

    const v3, 0x30fa588a

    invoke-interface {v4, v3}, LV/n;->T(I)V

    invoke-interface {v4}, LV/n;->J()V

    const/4 v8, 0x0

    goto :goto_1a

    :cond_26
    const v8, -0x407c0da9

    invoke-interface {v4, v8}, LV/n;->T(I)V

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v3, v4, v10}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v4}, LV/n;->J()V

    :goto_1a
    invoke-interface {v4}, LV/n;->N()V

    const/4 v3, 0x1

    add-int/2addr v7, v3

    goto :goto_19

    :cond_27
    invoke-interface {v4}, LV/n;->J()V

    invoke-interface {v4}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-static {}, LV/q;->P()V

    :cond_28
    move-object v2, v9

    goto/16 :goto_a

    :goto_1b
    invoke-interface {v4}, LV/n;->x()LV/e1;

    move-result-object v8

    if-eqz v8, :cond_29

    new-instance v9, Lt/l$e;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object v4, v13

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lt/l$e;-><init>(Lu/s0;Landroidx/compose/ui/d;Lu/I;Lx7/l;Lx7/q;II)V

    invoke-interface {v8, v9}, LV/e1;->a(Lx7/p;)V

    :cond_29
    return-void
.end method
