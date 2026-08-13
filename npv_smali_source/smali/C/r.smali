.class public abstract LC/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/d;LC/K;LC/H;LA/B;ZZLx/p;ZLA/b$m;LA/b$e;Lx7/l;LV/n;III)V
    .locals 30

    .prologue
    move-object/from16 v12, p1

    move-object/from16 v13, p2

    move/from16 v14, p5

    move-object/from16 v15, p10

    move/from16 v11, p12

    move/from16 v10, p14

    const v0, -0x26b96c2e

    move-object/from16 v1, p11

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v9

    and-int/lit8 v1, v10, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v4, v11, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v11, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v9, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v11

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v11

    :goto_1
    and-int/lit8 v6, v10, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v5, v5, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v11, 0x30

    if-nez v6, :cond_5

    invoke-interface {v9, v12}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_5
    :goto_3
    and-int/lit8 v6, v10, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v5, v5, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v6, v11, 0x180

    if-nez v6, :cond_9

    and-int/lit16 v6, v11, 0x200

    if-nez v6, :cond_7

    invoke-interface {v9, v13}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_4

    :cond_7
    invoke-interface {v9, v13}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v6

    :goto_4
    if-eqz v6, :cond_8

    const/16 v6, 0x100

    goto :goto_5

    :cond_8
    const/16 v6, 0x80

    :goto_5
    or-int/2addr v5, v6

    :cond_9
    :goto_6
    and-int/lit8 v6, v10, 0x8

    if-eqz v6, :cond_b

    or-int/lit16 v5, v5, 0xc00

    :cond_a
    move-object/from16 v7, p3

    goto :goto_8

    :cond_b
    and-int/lit16 v7, v11, 0xc00

    if-nez v7, :cond_a

    move-object/from16 v7, p3

    invoke-interface {v9, v7}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    const/16 v8, 0x800

    goto :goto_7

    :cond_c
    const/16 v8, 0x400

    :goto_7
    or-int/2addr v5, v8

    :goto_8
    and-int/lit8 v8, v10, 0x10

    if-eqz v8, :cond_e

    or-int/lit16 v5, v5, 0x6000

    :cond_d
    move/from16 v2, p4

    goto :goto_a

    :cond_e
    and-int/lit16 v2, v11, 0x6000

    if-nez v2, :cond_d

    move/from16 v2, p4

    invoke-interface {v9, v2}, LV/n;->d(Z)Z

    move-result v16

    if-eqz v16, :cond_f

    const/16 v16, 0x4000

    goto :goto_9

    :cond_f
    const/16 v16, 0x2000

    :goto_9
    or-int v5, v5, v16

    :goto_a
    and-int/lit8 v16, v10, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_10

    or-int v5, v5, v17

    goto :goto_c

    :cond_10
    and-int v16, v11, v17

    if-nez v16, :cond_12

    invoke-interface {v9, v14}, LV/n;->d(Z)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x20000

    goto :goto_b

    :cond_11
    const/high16 v16, 0x10000

    :goto_b
    or-int v5, v5, v16

    :cond_12
    :goto_c
    const/high16 v16, 0x180000

    and-int v16, v11, v16

    if-nez v16, :cond_14

    and-int/lit8 v16, v10, 0x40

    move-object/from16 v0, p6

    if-nez v16, :cond_13

    invoke-interface {v9, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x100000

    goto :goto_d

    :cond_13
    const/high16 v17, 0x80000

    :goto_d
    or-int v5, v5, v17

    goto :goto_e

    :cond_14
    move-object/from16 v0, p6

    :goto_e
    and-int/lit16 v3, v10, 0x80

    const/high16 v18, 0xc00000

    if-eqz v3, :cond_16

    or-int v5, v5, v18

    :cond_15
    move/from16 v3, p7

    goto :goto_10

    :cond_16
    and-int v3, v11, v18

    if-nez v3, :cond_15

    move/from16 v3, p7

    invoke-interface {v9, v3}, LV/n;->d(Z)Z

    move-result v18

    if-eqz v18, :cond_17

    const/high16 v18, 0x800000

    goto :goto_f

    :cond_17
    const/high16 v18, 0x400000

    :goto_f
    or-int v5, v5, v18

    :goto_10
    and-int/lit16 v0, v10, 0x100

    const/high16 v18, 0x6000000

    if-eqz v0, :cond_19

    or-int v5, v5, v18

    :cond_18
    move-object/from16 v0, p8

    goto :goto_12

    :cond_19
    and-int v0, v11, v18

    if-nez v0, :cond_18

    move-object/from16 v0, p8

    invoke-interface {v9, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1a

    const/high16 v18, 0x4000000

    goto :goto_11

    :cond_1a
    const/high16 v18, 0x2000000

    :goto_11
    or-int v5, v5, v18

    :goto_12
    and-int/lit16 v0, v10, 0x200

    const/high16 v18, 0x30000000

    if-eqz v0, :cond_1c

    or-int v5, v5, v18

    :cond_1b
    move-object/from16 v0, p9

    goto :goto_14

    :cond_1c
    and-int v0, v11, v18

    if-nez v0, :cond_1b

    move-object/from16 v0, p9

    invoke-interface {v9, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1d

    const/high16 v18, 0x20000000

    goto :goto_13

    :cond_1d
    const/high16 v18, 0x10000000

    :goto_13
    or-int v5, v5, v18

    :goto_14
    and-int/lit16 v0, v10, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v0, p13, 0x6

    goto :goto_16

    :cond_1e
    and-int/lit8 v0, p13, 0x6

    if-nez v0, :cond_20

    invoke-interface {v9, v15}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    const/4 v0, 0x4

    goto :goto_15

    :cond_1f
    const/4 v0, 0x2

    :goto_15
    or-int v0, p13, v0

    goto :goto_16

    :cond_20
    move/from16 v0, p13

    :goto_16
    const v18, 0x12492493

    and-int v2, v5, v18

    const v3, 0x12492492

    if-ne v2, v3, :cond_22

    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_22

    invoke-interface {v9}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_21

    goto :goto_17

    :cond_21
    invoke-interface {v9}, LV/n;->A()V

    move/from16 v5, p4

    move-object v1, v4

    move-object v4, v7

    move-object/from16 v19, v9

    move-object/from16 v7, p6

    goto/16 :goto_20

    :cond_22
    :goto_17
    invoke-interface {v9}, LV/n;->q()V

    and-int/lit8 v2, v11, 0x1

    const/4 v3, 0x6

    if-eqz v2, :cond_25

    invoke-interface {v9}, LV/n;->G()Z

    move-result v2

    if-eqz v2, :cond_23

    goto :goto_18

    :cond_23
    invoke-interface {v9}, LV/n;->A()V

    and-int/lit8 v1, v10, 0x40

    if-eqz v1, :cond_24

    const v1, -0x380001

    and-int/2addr v5, v1

    :cond_24
    move-object/from16 v18, p6

    move-object v8, v4

    move v6, v5

    move-object/from16 v17, v7

    move/from16 v7, p4

    goto :goto_1d

    :cond_25
    :goto_18
    if-eqz v1, :cond_26

    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_19

    :cond_26
    move-object v1, v4

    :goto_19
    if-eqz v6, :cond_27

    const/4 v2, 0x0

    int-to-float v2, v2

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v2

    invoke-static {v2}, Landroidx/compose/foundation/layout/m;->a(F)LA/B;

    move-result-object v2

    goto :goto_1a

    :cond_27
    move-object v2, v7

    :goto_1a
    if-eqz v8, :cond_28

    const/4 v4, 0x0

    goto :goto_1b

    :cond_28
    move/from16 v4, p4

    :goto_1b
    and-int/lit8 v6, v10, 0x40

    if-eqz v6, :cond_29

    sget-object v6, Lx/y;->a:Lx/y;

    invoke-virtual {v6, v9, v3}, Lx/y;->a(LV/n;I)Lx/p;

    move-result-object v6

    const v7, -0x380001

    and-int/2addr v5, v7

    move-object v8, v1

    move-object/from16 v17, v2

    move v7, v4

    move-object/from16 v18, v6

    :goto_1c
    move v6, v5

    goto :goto_1d

    :cond_29
    move-object/from16 v18, p6

    move-object v8, v1

    move-object/from16 v17, v2

    move v7, v4

    goto :goto_1c

    :goto_1d
    invoke-interface {v9}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_2a

    const-string v1, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)"

    const v2, -0x26b96c2e

    invoke-static {v2, v6, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2a
    shr-int/lit8 v5, v6, 0x3

    and-int/lit8 v4, v5, 0xe

    shl-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v4

    invoke-static {v12, v15, v9, v0}, LC/n;->a(LC/K;Lx7/l;LV/n;I)Lx7/a;

    move-result-object v16

    shr-int/lit8 v19, v6, 0x9

    and-int/lit8 v0, v19, 0x70

    or-int/2addr v0, v4

    invoke-static {v12, v7, v9, v0}, LC/M;->a(LC/K;ZLV/n;I)LD/E;

    move-result-object v20

    invoke-interface {v9}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2b

    sget-object v0, Lm7/j;->C:Lm7/j;

    invoke-static {v0, v9}, LV/Q;->h(Lm7/i;LV/n;)LW8/N;

    move-result-object v0

    new-instance v1, LV/C;

    invoke-direct {v1, v0}, LV/C;-><init>(LW8/N;)V

    invoke-interface {v9, v1}, LV/n;->K(Ljava/lang/Object;)V

    move-object v0, v1

    :cond_2b
    check-cast v0, LV/C;

    invoke-virtual {v0}, LV/C;->a()LW8/N;

    move-result-object v21

    invoke-static {}, Landroidx/compose/ui/platform/p0;->h()LV/O0;

    move-result-object v0

    invoke-interface {v9, v0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lo0/C1;

    and-int/lit8 v23, v6, 0x70

    const v0, 0xe000

    and-int v24, v6, v0

    const v0, 0x7fff0

    and-int/2addr v0, v6

    const/high16 v1, 0x380000

    and-int v1, v19, v1

    or-int/2addr v0, v1

    const/high16 v1, 0x1c00000

    and-int/2addr v1, v5

    or-int v25, v0, v1

    move-object/from16 v0, v16

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v26, v3

    move-object/from16 v3, v17

    move v13, v4

    move v4, v7

    move v15, v5

    move/from16 v5, p5

    move/from16 v27, v6

    move-object/from16 v6, p9

    move/from16 v28, v7

    move-object/from16 v7, p8

    move/from16 p0, v15

    move-object v15, v8

    move-object/from16 v8, v21

    move-object/from16 p3, v9

    move-object/from16 v9, v22

    move-object/from16 v10, p3

    move/from16 v11, v25

    invoke-static/range {v0 .. v11}, LC/r;->b(Lx7/a;LC/K;LC/H;LA/B;ZZLA/b$e;LA/b$m;LW8/N;Lo0/C1;LV/n;I)Lx7/p;

    move-result-object v11

    if-eqz v14, :cond_2c

    sget-object v0, Lx/s;->C:Lx/s;

    :goto_1e
    move-object v10, v0

    goto :goto_1f

    :cond_2c
    sget-object v0, Lx/s;->D:Lx/s;

    goto :goto_1e

    :goto_1f
    invoke-virtual/range {p1 .. p1}, LC/K;->y()LD0/a0;

    move-result-object v0

    invoke-interface {v15, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, LC/K;->l()LD/b;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    const v0, 0xe000

    and-int v0, v19, v0

    shl-int/lit8 v2, v27, 0x3

    const/high16 v3, 0x70000

    and-int/2addr v2, v3

    or-int v8, v0, v2

    move-object/from16 v2, v16

    move-object/from16 v3, v20

    move-object v4, v10

    move/from16 v5, p7

    move/from16 v6, v28

    move-object/from16 v7, p3

    invoke-static/range {v1 .. v8}, Landroidx/compose/foundation/lazy/layout/f;->c(Landroidx/compose/ui/d;Lx7/a;LD/E;Lx/s;ZZLV/n;I)Landroidx/compose/ui/d;

    move-result-object v1

    move-object/from16 v0, p3

    invoke-static {v12, v0, v13}, LC/f;->a(LC/K;LV/n;I)LD/m;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LC/K;->m()LD/j;

    move-result-object v3

    invoke-static {}, Landroidx/compose/ui/platform/p0;->k()LV/O0;

    move-result-object v4

    invoke-interface {v0, v4}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LY0/v;

    sget v4, LX/b;->F:I

    shl-int/lit8 v4, v4, 0x6

    move/from16 v13, p0

    and-int/lit16 v6, v13, 0x1c00

    or-int/2addr v4, v6

    const/high16 v6, 0x380000

    and-int/2addr v6, v13

    or-int v9, v4, v6

    move/from16 v4, v28

    move-object v6, v10

    move/from16 v7, p7

    move-object v8, v0

    invoke-static/range {v1 .. v9}, LD/l;->b(Landroidx/compose/ui/d;LD/m;LD/j;ZLY0/v;Lx/s;ZLV/n;I)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LC/K;->q()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->i()Landroidx/compose/ui/d;

    move-result-object v2

    invoke-interface {v1, v2}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LC/K;->p()Lz/l;

    move-result-object v6

    shr-int/lit8 v2, v27, 0xc

    and-int/lit16 v2, v2, 0x1c00

    or-int v2, v23, v2

    or-int v2, v2, v24

    const/high16 v3, 0x70000

    and-int/2addr v3, v13

    or-int v9, v2, v3

    const/16 v13, 0x40

    const/4 v7, 0x0

    move-object/from16 v19, v0

    move-object v0, v1

    move-object/from16 v1, p1

    move-object v2, v10

    move/from16 v3, p7

    move-object/from16 v5, v18

    move-object/from16 v8, v19

    move v10, v13

    invoke-static/range {v0 .. v10}, Lv/a0;->a(Landroidx/compose/ui/d;Lx/A;Lx/s;ZZLx/p;Lz/l;Lx/f;LV/n;II)Landroidx/compose/ui/d;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LC/K;->w()Landroidx/compose/foundation/lazy/layout/d;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v1, v16

    move-object v4, v11

    move-object/from16 v5, v19

    invoke-static/range {v1 .. v7}, LD/v;->a(Lx7/a;Landroidx/compose/ui/d;Landroidx/compose/foundation/lazy/layout/d;Lx7/p;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-static {}, LV/q;->P()V

    :cond_2d
    move-object v1, v15

    move-object/from16 v4, v17

    move-object/from16 v7, v18

    move/from16 v5, v28

    :goto_20
    invoke-interface/range {v19 .. v19}, LV/n;->x()LV/e1;

    move-result-object v15

    if-eqz v15, :cond_2e

    new-instance v13, LC/r$a;

    move-object v0, v13

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p12

    move-object v14, v13

    move/from16 v13, p13

    move-object/from16 v29, v14

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, LC/r$a;-><init>(Landroidx/compose/ui/d;LC/K;LC/H;LA/B;ZZLx/p;ZLA/b$m;LA/b$e;Lx7/l;III)V

    move-object/from16 v0, v29

    invoke-interface {v15, v0}, LV/e1;->a(Lx7/p;)V

    :cond_2e
    return-void
.end method

.method private static final b(Lx7/a;LC/K;LC/H;LA/B;ZZLA/b$e;LA/b$m;LW8/N;Lo0/C1;LV/n;I)Lx7/p;
    .locals 17

    .prologue
    move-object/from16 v0, p10

    move/from16 v1, p11

    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:161)"

    const v4, -0x5e7a3ec5

    invoke-static {v4, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 v2, v1, 0x70

    xor-int/lit8 v2, v2, 0x30

    const/16 v3, 0x20

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-le v2, v3, :cond_1

    move-object/from16 v2, p1

    invoke-interface {v0, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_0

    :cond_1
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v6, v1, 0x30

    if-ne v6, v3, :cond_3

    :cond_2
    move v3, v5

    goto :goto_1

    :cond_3
    move v3, v4

    :goto_1
    and-int/lit16 v6, v1, 0x380

    xor-int/lit16 v6, v6, 0x180

    const/16 v7, 0x100

    move-object/from16 v12, p2

    if-le v6, v7, :cond_4

    invoke-interface {v0, v12}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_4
    and-int/lit16 v6, v1, 0x180

    if-ne v6, v7, :cond_6

    :cond_5
    move v6, v5

    goto :goto_2

    :cond_6
    move v6, v4

    :goto_2
    or-int/2addr v3, v6

    and-int/lit16 v6, v1, 0x1c00

    xor-int/lit16 v6, v6, 0xc00

    const/16 v7, 0x800

    move-object/from16 v9, p3

    if-le v6, v7, :cond_7

    invoke-interface {v0, v9}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    :cond_7
    and-int/lit16 v6, v1, 0xc00

    if-ne v6, v7, :cond_9

    :cond_8
    move v6, v5

    goto :goto_3

    :cond_9
    move v6, v4

    :goto_3
    or-int/2addr v3, v6

    const v6, 0xe000

    and-int/2addr v6, v1

    xor-int/lit16 v6, v6, 0x6000

    const/16 v7, 0x4000

    move/from16 v10, p4

    if-le v6, v7, :cond_a

    invoke-interface {v0, v10}, LV/n;->d(Z)Z

    move-result v6

    if-nez v6, :cond_b

    :cond_a
    and-int/lit16 v6, v1, 0x6000

    if-ne v6, v7, :cond_c

    :cond_b
    move v6, v5

    goto :goto_4

    :cond_c
    move v6, v4

    :goto_4
    or-int/2addr v3, v6

    const/high16 v6, 0x70000

    and-int/2addr v6, v1

    const/high16 v7, 0x30000

    xor-int/2addr v6, v7

    const/high16 v8, 0x20000

    move/from16 v11, p5

    if-le v6, v8, :cond_d

    invoke-interface {v0, v11}, LV/n;->d(Z)Z

    move-result v6

    if-nez v6, :cond_e

    :cond_d
    and-int v6, v1, v7

    if-ne v6, v8, :cond_f

    :cond_e
    move v6, v5

    goto :goto_5

    :cond_f
    move v6, v4

    :goto_5
    or-int/2addr v3, v6

    const/high16 v6, 0x380000

    and-int/2addr v6, v1

    const/high16 v7, 0x180000

    xor-int/2addr v6, v7

    const/high16 v8, 0x100000

    move-object/from16 v14, p6

    if-le v6, v8, :cond_10

    invoke-interface {v0, v14}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    :cond_10
    and-int v6, v1, v7

    if-ne v6, v8, :cond_12

    :cond_11
    move v6, v5

    goto :goto_6

    :cond_12
    move v6, v4

    :goto_6
    or-int/2addr v3, v6

    const/high16 v6, 0x1c00000

    and-int/2addr v6, v1

    const/high16 v7, 0xc00000

    xor-int/2addr v6, v7

    const/high16 v8, 0x800000

    move-object/from16 v13, p7

    if-le v6, v8, :cond_13

    invoke-interface {v0, v13}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    :cond_13
    and-int/2addr v1, v7

    if-ne v1, v8, :cond_15

    :cond_14
    move v4, v5

    :cond_15
    or-int v1, v3, v4

    move-object/from16 v3, p9

    invoke-interface {v0, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-interface/range {p10 .. p10}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_16

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_17

    :cond_16
    new-instance v4, LC/r$b;

    move-object v6, v4

    move-object/from16 v7, p1

    move/from16 v8, p5

    move-object/from16 v9, p3

    move/from16 v10, p4

    move-object/from16 v11, p0

    move-object/from16 v12, p2

    move-object/from16 v13, p7

    move-object/from16 v14, p6

    move-object/from16 v15, p8

    move-object/from16 v16, p9

    invoke-direct/range {v6 .. v16}, LC/r$b;-><init>(LC/K;ZLA/B;ZLx7/a;LC/H;LA/b$m;LA/b$e;LW8/N;Lo0/C1;)V

    invoke-interface {v0, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_17
    check-cast v4, Lx7/p;

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, LV/q;->P()V

    :cond_18
    return-object v4
.end method
