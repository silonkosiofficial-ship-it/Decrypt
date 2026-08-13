.class public abstract LS/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, LU/r;->a:LU/r;

    invoke-virtual {v0}, LU/r;->g()F

    move-result v1

    sput v1, LS/w0;->a:F

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LS/w0;->b:F

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LS/w0;->c:F

    invoke-virtual {v0}, LU/r;->e()F

    move-result v1

    invoke-virtual {v0}, LU/r;->h()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LS/w0;->d:F

    invoke-virtual {v0}, LU/r;->c()F

    move-result v1

    invoke-virtual {v0}, LU/r;->h()F

    move-result v0

    sub-float/2addr v1, v0

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v0

    div-float/2addr v0, v2

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/w0;->e:F

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/w0;->f:F

    return-void
.end method

.method public static final a(LA/L;ZLx7/a;Lx7/p;Landroidx/compose/ui/d;ZLx7/p;ZLS/u0;Lz/l;LV/n;II)V
    .locals 28

    .prologue
    move/from16 v2, p1

    move/from16 v11, p11

    move/from16 v12, p12

    const/16 v1, 0x10

    const/16 v3, 0x20

    const/4 v4, 0x4

    const/4 v5, 0x1

    const/4 v6, 0x6

    const/16 v7, 0x80

    const v8, -0x278c5fbe

    move-object/from16 v9, p10

    invoke-interface {v9, v8}, LV/n;->r(I)LV/n;

    move-result-object v9

    const/high16 v10, -0x80000000

    and-int/2addr v10, v12

    const/4 v15, 0x2

    if-eqz v10, :cond_0

    or-int/lit8 v10, v11, 0x6

    move v13, v10

    move-object/from16 v10, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v10, v11, 0x6

    if-nez v10, :cond_2

    move-object/from16 v10, p0

    invoke-interface {v9, v10}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1

    move v13, v4

    goto :goto_0

    :cond_1
    move v13, v15

    :goto_0
    or-int/2addr v13, v11

    goto :goto_1

    :cond_2
    move-object/from16 v10, p0

    move v13, v11

    :goto_1
    and-int/lit8 v14, v12, 0x1

    if-eqz v14, :cond_3

    or-int/lit8 v13, v13, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v14, v11, 0x30

    if-nez v14, :cond_5

    invoke-interface {v9, v2}, LV/n;->d(Z)Z

    move-result v14

    if-eqz v14, :cond_4

    move v14, v3

    goto :goto_2

    :cond_4
    move v14, v1

    :goto_2
    or-int/2addr v13, v14

    :cond_5
    :goto_3
    and-int/lit8 v14, v12, 0x2

    if-eqz v14, :cond_7

    or-int/lit16 v13, v13, 0x180

    :cond_6
    move-object/from16 v14, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v14, v11, 0x180

    if-nez v14, :cond_6

    move-object/from16 v14, p2

    invoke-interface {v9, v14}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/16 v16, 0x100

    goto :goto_4

    :cond_8
    move/from16 v16, v7

    :goto_4
    or-int v13, v13, v16

    :goto_5
    and-int/2addr v4, v12

    if-eqz v4, :cond_a

    or-int/lit16 v13, v13, 0xc00

    :cond_9
    move-object/from16 v4, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v4, v11, 0xc00

    if-nez v4, :cond_9

    move-object/from16 v4, p3

    invoke-interface {v9, v4}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_b

    const/16 v16, 0x800

    goto :goto_6

    :cond_b
    const/16 v16, 0x400

    :goto_6
    or-int v13, v13, v16

    :goto_7
    and-int/lit8 v16, v12, 0x8

    if-eqz v16, :cond_d

    or-int/lit16 v13, v13, 0x6000

    :cond_c
    move-object/from16 v15, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v15, v11, 0x6000

    if-nez v15, :cond_c

    move-object/from16 v15, p4

    invoke-interface {v9, v15}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_e

    const/16 v18, 0x4000

    goto :goto_8

    :cond_e
    const/16 v18, 0x2000

    :goto_8
    or-int v13, v13, v18

    :goto_9
    and-int/2addr v1, v12

    const/high16 v18, 0x30000

    if-eqz v1, :cond_f

    or-int v13, v13, v18

    move/from16 v8, p5

    goto :goto_b

    :cond_f
    and-int v18, v11, v18

    move/from16 v8, p5

    if-nez v18, :cond_11

    invoke-interface {v9, v8}, LV/n;->d(Z)Z

    move-result v19

    if-eqz v19, :cond_10

    const/high16 v19, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v19, 0x10000

    :goto_a
    or-int v13, v13, v19

    :cond_11
    :goto_b
    and-int/2addr v3, v12

    const/high16 v19, 0x180000

    if-eqz v3, :cond_12

    or-int v13, v13, v19

    move-object/from16 v6, p6

    goto :goto_d

    :cond_12
    and-int v19, v11, v19

    move-object/from16 v6, p6

    if-nez v19, :cond_14

    invoke-interface {v9, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_13

    const/high16 v20, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v20, 0x80000

    :goto_c
    or-int v13, v13, v20

    :cond_14
    :goto_d
    and-int/lit8 v20, v12, 0x40

    const/high16 v21, 0xc00000

    if-eqz v20, :cond_15

    or-int v13, v13, v21

    move/from16 v5, p7

    goto :goto_f

    :cond_15
    and-int v21, v11, v21

    move/from16 v5, p7

    if-nez v21, :cond_17

    invoke-interface {v9, v5}, LV/n;->d(Z)Z

    move-result v22

    if-eqz v22, :cond_16

    const/high16 v22, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v22, 0x400000

    :goto_e
    or-int v13, v13, v22

    :cond_17
    :goto_f
    const/high16 v22, 0x6000000

    and-int v22, v11, v22

    if-nez v22, :cond_1a

    and-int/lit16 v0, v12, 0x80

    if-nez v0, :cond_18

    move-object/from16 v0, p8

    invoke-interface {v9, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_19

    const/high16 v23, 0x4000000

    goto :goto_10

    :cond_18
    move-object/from16 v0, p8

    :cond_19
    const/high16 v23, 0x2000000

    :goto_10
    or-int v13, v13, v23

    :goto_11
    const/16 v7, 0x100

    goto :goto_12

    :cond_1a
    move-object/from16 v0, p8

    goto :goto_11

    :goto_12
    and-int/2addr v7, v12

    const/high16 v23, 0x30000000

    if-eqz v7, :cond_1b

    or-int v13, v13, v23

    move-object/from16 v0, p9

    goto :goto_14

    :cond_1b
    and-int v23, v11, v23

    move-object/from16 v0, p9

    if-nez v23, :cond_1d

    invoke-interface {v9, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_1c

    const/high16 v23, 0x20000000

    goto :goto_13

    :cond_1c
    const/high16 v23, 0x10000000

    :goto_13
    or-int v13, v13, v23

    :cond_1d
    :goto_14
    const v23, 0x12492493

    and-int v0, v13, v23

    const v4, 0x12492492

    if-ne v0, v4, :cond_1f

    invoke-interface {v9}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_15

    :cond_1e
    invoke-interface {v9}, LV/n;->A()V

    move-object/from16 v10, p8

    move-object/from16 v22, p9

    move-object v7, v6

    move v6, v8

    move v8, v5

    move-object v5, v15

    goto/16 :goto_1e

    :cond_1f
    :goto_15
    invoke-interface {v9}, LV/n;->q()V

    const/4 v0, 0x1

    and-int/lit8 v4, v11, 0x1

    const v0, -0xe000001

    if-eqz v4, :cond_23

    invoke-interface {v9}, LV/n;->G()Z

    move-result v4

    if-eqz v4, :cond_20

    goto :goto_16

    :cond_20
    invoke-interface {v9}, LV/n;->A()V

    const/16 v1, 0x80

    and-int/2addr v1, v12

    if-eqz v1, :cond_21

    and-int/2addr v13, v0

    :cond_21
    move-object/from16 v4, p4

    move-object/from16 v1, p8

    :cond_22
    move-object/from16 v0, p9

    move v3, v13

    goto :goto_19

    :cond_23
    :goto_16
    if-eqz v16, :cond_24

    sget-object v4, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_17

    :cond_24
    move-object/from16 v4, p4

    :goto_17
    if-eqz v1, :cond_25

    const/4 v8, 0x1

    :cond_25
    if-eqz v3, :cond_26

    const/4 v6, 0x0

    :cond_26
    const/16 v1, 0x80

    if-eqz v20, :cond_27

    const/4 v5, 0x1

    :cond_27
    and-int/2addr v1, v12

    if-eqz v1, :cond_28

    sget-object v1, LS/v0;->a:LS/v0;

    const/4 v3, 0x6

    invoke-virtual {v1, v9, v3}, LS/v0;->a(LV/n;I)LS/u0;

    move-result-object v1

    and-int/2addr v13, v0

    goto :goto_18

    :cond_28
    move-object/from16 v1, p8

    :goto_18
    if-eqz v7, :cond_22

    move v3, v13

    const/4 v0, 0x0

    :goto_19
    invoke-interface {v9}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v7

    if-eqz v7, :cond_29

    const/4 v7, -0x1

    const-string v13, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)"

    const v15, -0x278c5fbe

    invoke-static {v15, v3, v7, v13}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_29
    const v7, -0x6273eb5

    invoke-interface {v9, v7}, LV/n;->T(I)V

    if-nez v0, :cond_2b

    invoke-interface {v9}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    sget-object v13, LV/n;->a:LV/n$a;

    invoke-virtual {v13}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v13

    if-ne v7, v13, :cond_2a

    invoke-static {}, Lz/k;->a()Lz/l;

    move-result-object v7

    invoke-interface {v9, v7}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2a
    check-cast v7, Lz/l;

    goto :goto_1a

    :cond_2b
    move-object v7, v0

    :goto_1a
    invoke-interface {v9}, LV/n;->J()V

    new-instance v13, LS/w0$f;

    move-object/from16 p4, v13

    move-object/from16 p5, v1

    move/from16 p6, p1

    move/from16 p7, v8

    move-object/from16 p8, v6

    move/from16 p9, v5

    move-object/from16 p10, p3

    invoke-direct/range {p4 .. p10}, LS/w0$f;-><init>(LS/u0;ZZLx7/p;ZLx7/p;)V

    const v15, -0x549d0324

    move-object/from16 v22, v0

    const/16 v0, 0x36

    const/4 v10, 0x1

    invoke-static {v15, v10, v13, v9, v0}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v23

    const v13, -0x626d892

    invoke-interface {v9, v13}, LV/n;->T(I)V

    if-nez v6, :cond_2c

    const/4 v10, 0x0

    goto :goto_1b

    :cond_2c
    new-instance v13, LS/w0$g;

    invoke-direct {v13, v1, v2, v8, v6}, LS/w0$g;-><init>(LS/u0;ZZLx7/p;)V

    const v15, 0x620c84c8

    invoke-static {v15, v10, v13, v9, v0}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v13

    move-object v10, v13

    :goto_1b
    invoke-interface {v9}, LV/n;->J()V

    invoke-interface {v9}, LV/n;->g()Ljava/lang/Object;

    move-result-object v13

    sget-object v24, LV/n;->a:LV/n$a;

    invoke-virtual/range {v24 .. v24}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v15

    const/4 v0, 0x0

    if-ne v13, v15, :cond_2d

    invoke-static {v0}, LV/l1;->a(I)LV/s0;

    move-result-object v13

    invoke-interface {v9, v13}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2d
    move-object v15, v13

    check-cast v15, LV/s0;

    sget-object v13, LK0/h;->b:LK0/h$a;

    invoke-virtual {v13}, LK0/h$a;->g()I

    move-result v13

    const/16 v18, 0x0

    invoke-static {v13}, LK0/h;->h(I)LK0/h;

    move-result-object v13

    move-object/from16 p4, v4

    move/from16 p5, p1

    move-object/from16 p6, v7

    move-object/from16 p7, v18

    move/from16 p8, v8

    move-object/from16 p9, v13

    move-object/from16 p10, p2

    invoke-static/range {p4 .. p10}, Landroidx/compose/foundation/selection/a;->a(Landroidx/compose/ui/d;ZLz/l;Lv/G;ZLK0/h;Lx7/a;)Landroidx/compose/ui/d;

    move-result-object v13

    sget v0, LS/w0;->a:F

    move-object/from16 v25, v4

    const/4 v4, 0x0

    move-object/from16 v26, v6

    move/from16 v27, v8

    const/4 v6, 0x0

    const/4 v8, 0x1

    invoke-static {v13, v4, v0, v8, v6}, Landroidx/compose/foundation/layout/p;->b(Landroidx/compose/ui/d;FFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    const/4 v6, 0x2

    const/4 v8, 0x0

    const/high16 v13, 0x3f800000    # 1.0f

    const/16 v18, 0x0

    move-object/from16 p4, p0

    move-object/from16 p5, v0

    move/from16 p6, v13

    move/from16 p7, v18

    move/from16 p8, v6

    move-object/from16 p9, v8

    invoke-static/range {p4 .. p9}, LA/K;->a(LA/L;Landroidx/compose/ui/d;FZILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-interface {v9}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual/range {v24 .. v24}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_2e

    new-instance v6, LS/w0$a;

    invoke-direct {v6, v15}, LS/w0$a;-><init>(LV/s0;)V

    invoke-interface {v9, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2e
    check-cast v6, Lx7/l;

    invoke-static {v0, v6}, Landroidx/compose/ui/layout/e;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object v0

    sget-object v6, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v6}, Lh0/c$a;->e()Lh0/c;

    move-result-object v6

    const/4 v8, 0x1

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v6

    const/4 v8, 0x0

    invoke-static {v9, v8}, LV/k;->a(LV/n;I)I

    move-result v13

    invoke-interface {v9}, LV/n;->F()LV/z;

    move-result-object v8

    invoke-static {v9, v0}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    sget-object v18, LF0/g;->a:LF0/g$a;

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->a()Lx7/a;

    move-result-object v4

    invoke-interface {v9}, LV/n;->v()LV/g;

    move-result-object v11

    instance-of v11, v11, LV/g;

    if-nez v11, :cond_2f

    invoke-static {}, LV/k;->c()V

    :cond_2f
    invoke-interface {v9}, LV/n;->t()V

    invoke-interface {v9}, LV/n;->o()Z

    move-result v11

    if-eqz v11, :cond_30

    invoke-interface {v9, v4}, LV/n;->B(Lx7/a;)V

    goto :goto_1c

    :cond_30
    invoke-interface {v9}, LV/n;->H()V

    :goto_1c
    invoke-static {v9}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v4

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->c()Lx7/p;

    move-result-object v11

    invoke-static {v4, v6, v11}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->e()Lx7/p;

    move-result-object v6

    invoke-static {v4, v8, v6}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->b()Lx7/p;

    move-result-object v6

    invoke-interface {v4}, LV/n;->o()Z

    move-result v8

    if-nez v8, :cond_31

    invoke-interface {v4}, LV/n;->g()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_32

    :cond_31
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v4, v8}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v4, v8, v6}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_32
    invoke-virtual/range {v18 .. v18}, LF0/g$a;->d()Lx7/p;

    move-result-object v6

    invoke-static {v4, v0, v6}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    if-eqz v2, :cond_33

    const/high16 v0, 0x3f800000    # 1.0f

    move v13, v0

    goto :goto_1d

    :cond_33
    const/4 v13, 0x0

    :goto_1d
    const/16 v0, 0x64

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x6

    invoke-static {v0, v6, v4, v8, v4}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v0

    const/16 v19, 0x30

    const/16 v20, 0x1c

    const/4 v6, 0x0

    const/16 v16, 0x0

    const/4 v8, 0x0

    move-object v14, v0

    move-object v11, v15

    const/4 v0, 0x2

    move v15, v6

    move-object/from16 v17, v8

    move-object/from16 v18, v9

    invoke-static/range {v13 .. v20}, Lu/c;->d(FLu/j;FLjava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object v6

    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object v8

    invoke-interface {v9, v8}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LY0/e;

    sget-object v13, LU/r;->a:LU/r;

    invoke-virtual {v13}, LU/r;->e()F

    move-result v13

    invoke-interface {v8, v13}, LY0/e;->S0(F)I

    move-result v13

    invoke-static {v11}, LS/w0;->b(LV/s0;)I

    move-result v11

    sub-int/2addr v11, v13

    int-to-float v11, v11

    int-to-float v0, v0

    div-float/2addr v11, v0

    sget v0, LS/w0;->f:F

    invoke-interface {v8, v0}, LY0/e;->B0(F)F

    move-result v0

    invoke-static {v11, v0}, Ln0/h;->a(FF)J

    move-result-wide v13

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-interface {v9, v7}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v9, v13, v14}, LV/n;->j(J)Z

    move-result v8

    or-int/2addr v0, v8

    invoke-interface {v9}, LV/n;->g()Ljava/lang/Object;

    move-result-object v8

    if-nez v0, :cond_34

    invoke-virtual/range {v24 .. v24}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v8, v0, :cond_35

    :cond_34
    new-instance v8, LT/t;

    invoke-direct {v8, v7, v13, v14, v4}, LT/t;-><init>(Lz/j;JLy7/k;)V

    invoke-interface {v9, v8}, LV/n;->K(Ljava/lang/Object;)V

    :cond_35
    check-cast v8, LT/t;

    new-instance v0, LS/w0$d;

    invoke-direct {v0, v8}, LS/w0$d;-><init>(LT/t;)V

    const v4, 0x293afa35

    const/16 v7, 0x36

    const/4 v8, 0x1

    invoke-static {v4, v8, v0, v9, v7}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v13

    new-instance v0, LS/w0$c;

    invoke-direct {v0, v6, v1}, LS/w0$c;-><init>(LV/G1;LS/u0;)V

    const v4, -0x1c472dfb

    invoke-static {v4, v8, v0, v9, v7}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v14

    invoke-interface {v9, v6}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v9}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_36

    invoke-virtual/range {v24 .. v24}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_37

    :cond_36
    new-instance v4, LS/w0$b;

    invoke-direct {v4, v6}, LS/w0$b;-><init>(LV/G1;)V

    invoke-interface {v9, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_37
    move-object/from16 v18, v4

    check-cast v18, Lx7/a;

    shr-int/lit8 v0, v3, 0x9

    const v3, 0xe000

    and-int/2addr v0, v3

    or-int/lit16 v0, v0, 0x1b6

    move-object/from16 v15, v23

    move-object/from16 v16, v10

    move/from16 v17, v5

    move-object/from16 v19, v9

    move/from16 v20, v0

    invoke-static/range {v13 .. v20}, LS/w0;->d(Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZLx7/a;LV/n;I)V

    invoke-interface {v9}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_38

    invoke-static {}, LV/q;->P()V

    :cond_38
    move-object v10, v1

    move v8, v5

    move-object/from16 v5, v25

    move-object/from16 v7, v26

    move/from16 v6, v27

    :goto_1e
    invoke-interface {v9}, LV/n;->x()LV/e1;

    move-result-object v13

    if-eqz v13, :cond_39

    new-instance v14, LS/w0$e;

    move-object v0, v14

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object v9, v10

    move-object/from16 v10, v22

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, LS/w0$e;-><init>(LA/L;ZLx7/a;Lx7/p;Landroidx/compose/ui/d;ZLx7/p;ZLS/u0;Lz/l;II)V

    invoke-interface {v13, v14}, LV/e1;->a(Lx7/p;)V

    :cond_39
    return-void
.end method

.method private static final b(LV/s0;)I
    .locals 0

    invoke-interface {p0}, LV/Y;->d()I

    move-result p0

    return p0
.end method

.method private static final c(LV/s0;I)V
    .locals 0

    invoke-interface {p0, p1}, LV/s0;->i(I)V

    return-void
.end method

.method private static final d(Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZLx7/a;LV/n;I)V
    .locals 19

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    const v0, -0x550f732e

    move-object/from16 v8, p6

    invoke-interface {v8, v0}, LV/n;->r(I)LV/n;

    move-result-object v8

    and-int/lit8 v9, v7, 0x6

    if-nez v9, :cond_1

    invoke-interface {v8, v1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    const/4 v9, 0x4

    goto :goto_0

    :cond_0
    const/4 v9, 0x2

    :goto_0
    or-int/2addr v9, v7

    goto :goto_1

    :cond_1
    move v9, v7

    :goto_1
    and-int/lit8 v11, v7, 0x30

    if-nez v11, :cond_3

    invoke-interface {v8, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    const/16 v11, 0x20

    goto :goto_2

    :cond_2
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v9, v11

    :cond_3
    and-int/lit16 v11, v7, 0x180

    if-nez v11, :cond_5

    invoke-interface {v8, v3}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x100

    goto :goto_3

    :cond_4
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v9, v11

    :cond_5
    and-int/lit16 v11, v7, 0xc00

    const/16 v12, 0x800

    if-nez v11, :cond_7

    invoke-interface {v8, v4}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    move v11, v12

    goto :goto_4

    :cond_6
    const/16 v11, 0x400

    :goto_4
    or-int/2addr v9, v11

    :cond_7
    and-int/lit16 v11, v7, 0x6000

    const/16 v13, 0x4000

    if-nez v11, :cond_9

    invoke-interface {v8, v5}, LV/n;->d(Z)Z

    move-result v11

    if-eqz v11, :cond_8

    move v11, v13

    goto :goto_5

    :cond_8
    const/16 v11, 0x2000

    :goto_5
    or-int/2addr v9, v11

    :cond_9
    const/high16 v11, 0x30000

    and-int/2addr v11, v7

    const/high16 v14, 0x20000

    if-nez v11, :cond_b

    invoke-interface {v8, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    move v11, v14

    goto :goto_6

    :cond_a
    const/high16 v11, 0x10000

    :goto_6
    or-int/2addr v9, v11

    :cond_b
    const v11, 0x12493

    and-int/2addr v11, v9

    const v15, 0x12492

    if-ne v11, v15, :cond_d

    invoke-interface {v8}, LV/n;->u()Z

    move-result v11

    if-nez v11, :cond_c

    goto :goto_7

    :cond_c
    invoke-interface {v8}, LV/n;->A()V

    goto/16 :goto_10

    :cond_d
    :goto_7
    invoke-static {}, LV/q;->H()Z

    move-result v11

    if-eqz v11, :cond_e

    const/4 v11, -0x1

    const-string v15, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:516)"

    invoke-static {v0, v9, v11, v15}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_e
    const/high16 v0, 0x70000

    and-int/2addr v0, v9

    const/4 v15, 0x0

    if-ne v0, v14, :cond_f

    const/16 v16, 0x1

    goto :goto_8

    :cond_f
    move/from16 v16, v15

    :goto_8
    and-int/lit16 v11, v9, 0x1c00

    if-ne v11, v12, :cond_10

    const/4 v11, 0x1

    goto :goto_9

    :cond_10
    move v11, v15

    :goto_9
    or-int v11, v16, v11

    const v12, 0xe000

    and-int/2addr v12, v9

    if-ne v12, v13, :cond_11

    const/16 v16, 0x1

    goto :goto_a

    :cond_11
    move/from16 v16, v15

    :goto_a
    or-int v11, v11, v16

    invoke-interface {v8}, LV/n;->g()Ljava/lang/Object;

    move-result-object v10

    if-nez v11, :cond_12

    sget-object v11, LV/n;->a:LV/n$a;

    invoke-virtual {v11}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v10, v11, :cond_13

    :cond_12
    new-instance v10, LS/w0$i;

    invoke-direct {v10, v6, v4, v5}, LS/w0$i;-><init>(Lx7/a;Lx7/p;Z)V

    invoke-interface {v8, v10}, LV/n;->K(Ljava/lang/Object;)V

    :cond_13
    check-cast v10, LD0/I;

    sget-object v11, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-static {v8, v15}, LV/k;->a(LV/n;I)I

    move-result v17

    invoke-interface {v8}, LV/n;->F()LV/z;

    move-result-object v14

    invoke-static {v8, v11}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v13

    sget-object v18, LF0/g;->a:LF0/g$a;

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->a()Lx7/a;

    move-result-object v15

    invoke-interface {v8}, LV/n;->v()LV/g;

    move-result-object v7

    instance-of v7, v7, LV/g;

    if-nez v7, :cond_14

    invoke-static {}, LV/k;->c()V

    :cond_14
    invoke-interface {v8}, LV/n;->t()V

    invoke-interface {v8}, LV/n;->o()Z

    move-result v7

    if-eqz v7, :cond_15

    invoke-interface {v8, v15}, LV/n;->B(Lx7/a;)V

    goto :goto_b

    :cond_15
    invoke-interface {v8}, LV/n;->H()V

    :goto_b
    invoke-static {v8}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v7

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->c()Lx7/p;

    move-result-object v15

    invoke-static {v7, v10, v15}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->e()Lx7/p;

    move-result-object v10

    invoke-static {v7, v14, v10}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->b()Lx7/p;

    move-result-object v10

    invoke-interface {v7}, LV/n;->o()Z

    move-result v14

    if-nez v14, :cond_16

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v14

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_17

    :cond_16
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v7, v14}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v7, v14, v10}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_17
    invoke-virtual/range {v18 .. v18}, LF0/g$a;->d()Lx7/p;

    move-result-object v10

    invoke-static {v7, v13, v10}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    and-int/lit8 v7, v9, 0xe

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v1, v8, v7}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    shr-int/lit8 v7, v9, 0x3

    and-int/lit8 v7, v7, 0xe

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v8, v7}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "icon"

    invoke-static {v11, v7}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v7

    sget-object v10, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v10}, Lh0/c$a;->o()Lh0/c;

    move-result-object v13

    const/4 v14, 0x0

    invoke-static {v13, v14}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v13

    invoke-static {v8, v14}, LV/k;->a(LV/n;I)I

    move-result v15

    invoke-interface {v8}, LV/n;->F()LV/z;

    move-result-object v14

    invoke-static {v8, v7}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v7

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->a()Lx7/a;

    move-result-object v1

    invoke-interface {v8}, LV/n;->v()LV/g;

    move-result-object v2

    instance-of v2, v2, LV/g;

    if-nez v2, :cond_18

    invoke-static {}, LV/k;->c()V

    :cond_18
    invoke-interface {v8}, LV/n;->t()V

    invoke-interface {v8}, LV/n;->o()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-interface {v8, v1}, LV/n;->B(Lx7/a;)V

    goto :goto_c

    :cond_19
    invoke-interface {v8}, LV/n;->H()V

    :goto_c
    invoke-static {v8}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->c()Lx7/p;

    move-result-object v2

    invoke-static {v1, v13, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->e()Lx7/p;

    move-result-object v2

    invoke-static {v1, v14, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->b()Lx7/p;

    move-result-object v2

    invoke-interface {v1}, LV/n;->o()Z

    move-result v13

    if-nez v13, :cond_1a

    invoke-interface {v1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1b

    :cond_1a
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v1, v13}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v1, v13, v2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_1b
    invoke-virtual/range {v18 .. v18}, LF0/g$a;->d()Lx7/p;

    move-result-object v2

    invoke-static {v1, v7, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    shr-int/lit8 v1, v9, 0x6

    and-int/lit8 v1, v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v8, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v8}, LV/n;->Q()V

    const v1, 0x40cd5423

    invoke-interface {v8, v1}, LV/n;->T(I)V

    if-eqz v4, :cond_24

    const-string v1, "label"

    invoke-static {v11, v1}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v1

    const/16 v2, 0x4000

    if-ne v12, v2, :cond_1c

    const/high16 v2, 0x20000

    const/4 v14, 0x1

    goto :goto_d

    :cond_1c
    const/high16 v2, 0x20000

    const/4 v14, 0x0

    :goto_d
    if-ne v0, v2, :cond_1d

    const/4 v11, 0x1

    goto :goto_e

    :cond_1d
    const/4 v11, 0x0

    :goto_e
    or-int v0, v14, v11

    invoke-interface {v8}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1e

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_1f

    :cond_1e
    new-instance v2, LS/w0$h;

    invoke-direct {v2, v5, v6}, LS/w0$h;-><init>(ZLx7/a;)V

    invoke-interface {v8, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1f
    check-cast v2, Lx7/l;

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/b;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object v0

    sget v1, LS/w0;->b:F

    const/4 v2, 0x2

    int-to-float v7, v2

    div-float/2addr v1, v7

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    const/4 v7, 0x0

    const/4 v11, 0x0

    invoke-static {v0, v1, v7, v2, v11}, Landroidx/compose/foundation/layout/m;->k(Landroidx/compose/ui/d;FFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-virtual {v10}, Lh0/c$a;->o()Lh0/c;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v1

    invoke-static {v8, v2}, LV/k;->a(LV/n;I)I

    move-result v2

    invoke-interface {v8}, LV/n;->F()LV/z;

    move-result-object v7

    invoke-static {v8, v0}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->a()Lx7/a;

    move-result-object v10

    invoke-interface {v8}, LV/n;->v()LV/g;

    move-result-object v11

    instance-of v11, v11, LV/g;

    if-nez v11, :cond_20

    invoke-static {}, LV/k;->c()V

    :cond_20
    invoke-interface {v8}, LV/n;->t()V

    invoke-interface {v8}, LV/n;->o()Z

    move-result v11

    if-eqz v11, :cond_21

    invoke-interface {v8, v10}, LV/n;->B(Lx7/a;)V

    goto :goto_f

    :cond_21
    invoke-interface {v8}, LV/n;->H()V

    :goto_f
    invoke-static {v8}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v10

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->c()Lx7/p;

    move-result-object v11

    invoke-static {v10, v1, v11}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->e()Lx7/p;

    move-result-object v1

    invoke-static {v10, v7, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v18 .. v18}, LF0/g$a;->b()Lx7/p;

    move-result-object v1

    invoke-interface {v10}, LV/n;->o()Z

    move-result v7

    if-nez v7, :cond_22

    invoke-interface {v10}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_23

    :cond_22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v10, v2, v1}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_23
    invoke-virtual/range {v18 .. v18}, LF0/g$a;->d()Lx7/p;

    move-result-object v1

    invoke-static {v10, v0, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    shr-int/lit8 v0, v9, 0x9

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v8, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v8}, LV/n;->Q()V

    :cond_24
    invoke-interface {v8}, LV/n;->J()V

    invoke-interface {v8}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-static {}, LV/q;->P()V

    :cond_25
    :goto_10
    invoke-interface {v8}, LV/n;->x()LV/e1;

    move-result-object v8

    if-eqz v8, :cond_26

    new-instance v9, LS/w0$j;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LS/w0$j;-><init>(Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZLx7/a;I)V

    invoke-interface {v8, v9}, LV/e1;->a(Lx7/p;)V

    :cond_26
    return-void
.end method

.method public static final synthetic e(LV/s0;I)V
    .locals 0

    invoke-static {p0, p1}, LS/w0;->c(LV/s0;I)V

    return-void
.end method

.method public static final synthetic f(Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZLx7/a;LV/n;I)V
    .locals 0

    invoke-static/range {p0 .. p7}, LS/w0;->d(Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZLx7/a;LV/n;I)V

    return-void
.end method

.method public static final synthetic g()F
    .locals 1

    sget v0, LS/w0;->d:F

    return v0
.end method

.method public static final synthetic h(LD0/M;LD0/X;LD0/X;LD0/X;J)LD0/K;
    .locals 0

    invoke-static/range {p0 .. p5}, LS/w0;->k(LD0/M;LD0/X;LD0/X;LD0/X;J)LD0/K;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(LD0/M;LD0/X;LD0/X;LD0/X;LD0/X;JZF)LD0/K;
    .locals 0

    invoke-static/range {p0 .. p8}, LS/w0;->l(LD0/M;LD0/X;LD0/X;LD0/X;LD0/X;JZF)LD0/K;

    move-result-object p0

    return-object p0
.end method

.method public static final j()F
    .locals 1

    sget v0, LS/w0;->e:F

    return v0
.end method

.method private static final k(LD0/M;LD0/X;LD0/X;LD0/X;J)LD0/K;
    .locals 14

    invoke-static/range {p4 .. p5}, LY0/b;->l(J)I

    move-result v10

    sget v0, LS/w0;->a:F

    move-object v11, p0

    invoke-interface {p0, v0}, LY0/e;->S0(F)I

    move-result v0

    move-wide/from16 v1, p4

    invoke-static {v1, v2, v0}, LY0/c;->h(JI)I

    move-result v12

    invoke-virtual {p1}, LD0/X;->I0()I

    move-result v0

    sub-int v0, v10, v0

    div-int/lit8 v3, v0, 0x2

    invoke-virtual {p1}, LD0/X;->w0()I

    move-result v0

    sub-int v0, v12, v0

    div-int/lit8 v4, v0, 0x2

    invoke-virtual/range {p2 .. p2}, LD0/X;->I0()I

    move-result v0

    sub-int v0, v10, v0

    div-int/lit8 v6, v0, 0x2

    invoke-virtual/range {p2 .. p2}, LD0/X;->w0()I

    move-result v0

    sub-int v0, v12, v0

    div-int/lit8 v7, v0, 0x2

    new-instance v13, LS/w0$k;

    move-object v0, v13

    move-object/from16 v1, p3

    move-object v2, p1

    move-object/from16 v5, p2

    move v8, v10

    move v9, v12

    invoke-direct/range {v0 .. v9}, LS/w0$k;-><init>(LD0/X;LD0/X;IILD0/X;IIII)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move v1, v10

    move v2, v12

    move-object v4, v13

    invoke-static/range {v0 .. v6}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object v0

    return-object v0
.end method

.method private static final l(LD0/M;LD0/X;LD0/X;LD0/X;LD0/X;JZF)LD0/K;
    .locals 19

    .prologue
    move-object/from16 v15, p0

    invoke-virtual/range {p2 .. p2}, LD0/X;->w0()I

    move-result v0

    int-to-float v0, v0

    sget v1, LS/w0;->e:F

    invoke-interface {v15, v1}, LY0/e;->B0(F)F

    move-result v2

    add-float/2addr v0, v2

    sget v2, LS/w0;->c:F

    invoke-interface {v15, v2}, LY0/e;->B0(F)F

    move-result v3

    add-float/2addr v0, v3

    invoke-virtual/range {p1 .. p1}, LD0/X;->w0()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v0, v3

    invoke-static/range {p5 .. p6}, LY0/b;->m(J)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v3, v0

    const/4 v4, 0x2

    int-to-float v5, v4

    div-float/2addr v3, v5

    invoke-interface {v15, v1}, LY0/e;->B0(F)F

    move-result v6

    invoke-static {v3, v6}, LE7/j;->c(FF)F

    move-result v10

    mul-float v3, v10, v5

    add-float/2addr v0, v3

    if-eqz p7, :cond_0

    move v3, v10

    goto :goto_0

    :cond_0
    invoke-virtual/range {p2 .. p2}, LD0/X;->w0()I

    move-result v3

    int-to-float v3, v3

    sub-float v3, v0, v3

    div-float/2addr v3, v5

    :goto_0
    sub-float/2addr v3, v10

    const/4 v5, 0x1

    int-to-float v5, v5

    sub-float v5, v5, p8

    mul-float v7, v3, v5

    invoke-virtual/range {p2 .. p2}, LD0/X;->w0()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v3, v10

    invoke-interface {v15, v1}, LY0/e;->B0(F)F

    move-result v5

    add-float/2addr v3, v5

    invoke-interface {v15, v2}, LY0/e;->B0(F)F

    move-result v2

    add-float v6, v3, v2

    invoke-static/range {p5 .. p6}, LY0/b;->l(J)I

    move-result v16

    invoke-virtual/range {p1 .. p1}, LD0/X;->I0()I

    move-result v2

    sub-int v2, v16, v2

    div-int/lit8 v5, v2, 0x2

    invoke-virtual/range {p2 .. p2}, LD0/X;->I0()I

    move-result v2

    sub-int v2, v16, v2

    div-int/lit8 v9, v2, 0x2

    invoke-virtual/range {p3 .. p3}, LD0/X;->I0()I

    move-result v2

    sub-int v2, v16, v2

    div-int/lit8 v12, v2, 0x2

    invoke-interface {v15, v1}, LY0/e;->B0(F)F

    move-result v1

    sub-float v13, v10, v1

    invoke-static {v0}, LA7/a;->d(F)I

    move-result v17

    new-instance v18, LS/w0$l;

    move-object/from16 v0, v18

    move-object/from16 v1, p4

    move/from16 v2, p7

    move/from16 v3, p8

    move-object/from16 v4, p1

    move-object/from16 v8, p2

    move-object/from16 v11, p3

    move/from16 v14, v16

    move-object/from16 v15, p0

    invoke-direct/range {v0 .. v15}, LS/w0$l;-><init>(LD0/X;ZFLD0/X;IFFLD0/X;IFLD0/X;IFILD0/M;)V

    const/4 v0, 0x4

    const/4 v1, 0x0

    const/4 v2, 0x0

    move/from16 p1, v16

    move/from16 p2, v17

    move-object/from16 p3, v2

    move-object/from16 p4, v18

    move/from16 p5, v0

    move-object/from16 p6, v1

    invoke-static/range {p0 .. p6}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object v0

    return-object v0
.end method
