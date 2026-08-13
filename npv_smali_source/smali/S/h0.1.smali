.class public abstract LS/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx7/a;Landroidx/compose/ui/d;ZLS/f0;Lz/l;Lx7/p;LV/n;II)V
    .locals 22

    .prologue
    move-object/from16 v6, p5

    move/from16 v7, p7

    const/16 v0, 0x10

    const/16 v1, 0x20

    const/4 v2, 0x4

    const/4 v3, 0x6

    const v4, -0x441f35f2

    move-object/from16 v5, p6

    invoke-interface {v5, v4}, LV/n;->r(I)LV/n;

    move-result-object v5

    const/4 v8, 0x1

    and-int/lit8 v9, p8, 0x1

    const/4 v10, 0x2

    if-eqz v9, :cond_0

    or-int/lit8 v9, v7, 0x6

    move-object/from16 v15, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v9, v7, 0x6

    move-object/from16 v15, p0

    if-nez v9, :cond_2

    invoke-interface {v5, v15}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    move v9, v2

    goto :goto_0

    :cond_1
    move v9, v10

    :goto_0
    or-int/2addr v9, v7

    goto :goto_1

    :cond_2
    move v9, v7

    :goto_1
    and-int/lit8 v11, p8, 0x2

    if-eqz v11, :cond_4

    or-int/lit8 v9, v9, 0x30

    :cond_3
    move-object/from16 v12, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v12, v7, 0x30

    if-nez v12, :cond_3

    move-object/from16 v12, p1

    invoke-interface {v5, v12}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    move v13, v1

    goto :goto_2

    :cond_5
    move v13, v0

    :goto_2
    or-int/2addr v9, v13

    :goto_3
    and-int/lit8 v2, p8, 0x4

    if-eqz v2, :cond_7

    or-int/lit16 v9, v9, 0x180

    :cond_6
    move/from16 v13, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v13, v7, 0x180

    if-nez v13, :cond_6

    move/from16 v13, p2

    invoke-interface {v5, v13}, LV/n;->d(Z)Z

    move-result v14

    if-eqz v14, :cond_8

    const/16 v14, 0x100

    goto :goto_4

    :cond_8
    const/16 v14, 0x80

    :goto_4
    or-int/2addr v9, v14

    :goto_5
    and-int/lit16 v14, v7, 0xc00

    if-nez v14, :cond_b

    and-int/lit8 v14, p8, 0x8

    if-nez v14, :cond_9

    move-object/from16 v14, p3

    invoke-interface {v5, v14}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_a

    const/16 v16, 0x800

    goto :goto_6

    :cond_9
    move-object/from16 v14, p3

    :cond_a
    const/16 v16, 0x400

    :goto_6
    or-int v9, v9, v16

    goto :goto_7

    :cond_b
    move-object/from16 v14, p3

    :goto_7
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_d

    or-int/lit16 v9, v9, 0x6000

    :cond_c
    move-object/from16 v10, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v10, v7, 0x6000

    if-nez v10, :cond_c

    move-object/from16 v10, p4

    invoke-interface {v5, v10}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v16, 0x4000

    goto :goto_8

    :cond_e
    const/16 v16, 0x2000

    :goto_8
    or-int v9, v9, v16

    :goto_9
    and-int/lit8 v1, p8, 0x20

    const/high16 v16, 0x30000

    if-eqz v1, :cond_f

    or-int v9, v9, v16

    goto :goto_b

    :cond_f
    and-int v1, v7, v16

    if-nez v1, :cond_11

    invoke-interface {v5, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    const/high16 v1, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v1, 0x10000

    :goto_a
    or-int/2addr v9, v1

    :cond_11
    :goto_b
    const v1, 0x12493

    and-int/2addr v1, v9

    const v4, 0x12492

    if-ne v1, v4, :cond_13

    invoke-interface {v5}, LV/n;->u()Z

    move-result v1

    if-nez v1, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v5}, LV/n;->A()V

    move-object v2, v12

    move v3, v13

    move-object v4, v14

    goto/16 :goto_13

    :cond_13
    :goto_c
    invoke-interface {v5}, LV/n;->q()V

    and-int/lit8 v1, v7, 0x1

    if-eqz v1, :cond_16

    invoke-interface {v5}, LV/n;->G()Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_e

    :cond_14
    invoke-interface {v5}, LV/n;->A()V

    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_15

    and-int/lit16 v9, v9, -0x1c01

    :cond_15
    move-object v4, v10

    move-object v0, v12

    move v1, v13

    :goto_d
    move-object v2, v14

    move v14, v9

    goto :goto_11

    :cond_16
    :goto_e
    if-eqz v11, :cond_17

    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    move-object v12, v1

    :cond_17
    if-eqz v2, :cond_18

    goto :goto_f

    :cond_18
    move v8, v13

    :goto_f
    and-int/lit8 v1, p8, 0x8

    if-eqz v1, :cond_19

    sget-object v1, LS/g0;->a:LS/g0;

    invoke-virtual {v1, v5, v3}, LS/g0;->b(LV/n;I)LS/f0;

    move-result-object v1

    and-int/lit16 v9, v9, -0x1c01

    move-object v14, v1

    :cond_19
    if-eqz v0, :cond_1a

    const/4 v0, 0x0

    move-object v4, v0

    move v1, v8

    :goto_10
    move-object v0, v12

    goto :goto_d

    :cond_1a
    move v1, v8

    move-object v4, v10

    goto :goto_10

    :goto_11
    invoke-interface {v5}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v8

    if-eqz v8, :cond_1b

    const/4 v8, -0x1

    const-string v9, "androidx.compose.material3.IconButton (IconButton.kt:88)"

    const v10, -0x441f35f2

    invoke-static {v10, v14, v8, v9}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1b
    invoke-static {v0}, LS/k0;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v8

    sget-object v9, LU/n;->a:LU/n;

    invoke-virtual {v9}, LU/n;->c()F

    move-result v10

    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/p;->p(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object v8

    invoke-virtual {v9}, LU/n;->b()LU/z;

    move-result-object v10

    invoke-static {v10, v5, v3}, LS/T0;->e(LU/z;LV/n;I)Lo0/e2;

    move-result-object v3

    invoke-static {v8, v3}, Ll0/e;->a(Landroidx/compose/ui/d;Lo0/e2;)Landroidx/compose/ui/d;

    move-result-object v16

    invoke-virtual {v2, v1}, LS/f0;->a(Z)J

    move-result-wide v17

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/b;->b(Landroidx/compose/ui/d;JLo0/e2;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v3

    sget-object v8, LK0/h;->b:LK0/h$a;

    invoke-virtual {v8}, LK0/h$a;->a()I

    move-result v16

    invoke-virtual {v9}, LU/n;->c()F

    move-result v8

    const/4 v9, 0x2

    int-to-float v9, v9

    div-float/2addr v8, v9

    invoke-static {v8}, LY0/i;->q(F)F

    move-result v9

    const/16 v13, 0x36

    const/16 v17, 0x4

    const/4 v8, 0x0

    const-wide/16 v10, 0x0

    move-object v12, v5

    move/from16 v20, v14

    move/from16 v14, v17

    invoke-static/range {v8 .. v14}, LS/I0;->c(ZFJLV/n;II)Lv/G;

    move-result-object v13

    invoke-static/range {v16 .. v16}, LK0/h;->h(I)LK0/h;

    move-result-object v16

    const/16 v18, 0x8

    const/4 v8, 0x0

    move-object v11, v3

    move-object v12, v4

    move v14, v1

    move-object v15, v8

    move-object/from16 v17, p0

    invoke-static/range {v11 .. v19}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/d;Lz/l;Lv/G;ZLjava/lang/String;LK0/h;Lx7/a;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v3

    sget-object v8, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v8}, Lh0/c$a;->e()Lh0/c;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v8

    invoke-static {v5, v9}, LV/k;->a(LV/n;I)I

    move-result v9

    invoke-interface {v5}, LV/n;->F()LV/z;

    move-result-object v10

    invoke-static {v5, v3}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v3

    sget-object v11, LF0/g;->a:LF0/g$a;

    invoke-virtual {v11}, LF0/g$a;->a()Lx7/a;

    move-result-object v12

    invoke-interface {v5}, LV/n;->v()LV/g;

    move-result-object v13

    instance-of v13, v13, LV/g;

    if-nez v13, :cond_1c

    invoke-static {}, LV/k;->c()V

    :cond_1c
    invoke-interface {v5}, LV/n;->t()V

    invoke-interface {v5}, LV/n;->o()Z

    move-result v13

    if-eqz v13, :cond_1d

    invoke-interface {v5, v12}, LV/n;->B(Lx7/a;)V

    goto :goto_12

    :cond_1d
    invoke-interface {v5}, LV/n;->H()V

    :goto_12
    invoke-static {v5}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v12

    invoke-virtual {v11}, LF0/g$a;->c()Lx7/p;

    move-result-object v13

    invoke-static {v12, v8, v13}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v11}, LF0/g$a;->e()Lx7/p;

    move-result-object v8

    invoke-static {v12, v10, v8}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v11}, LF0/g$a;->b()Lx7/p;

    move-result-object v8

    invoke-interface {v12}, LV/n;->o()Z

    move-result v10

    if-nez v10, :cond_1e

    invoke-interface {v12}, LV/n;->g()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1f

    :cond_1e
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v12, v10}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v12, v9, v8}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_1f
    invoke-virtual {v11}, LF0/g$a;->d()Lx7/p;

    move-result-object v8

    invoke-static {v12, v3, v8}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v3, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-virtual {v2, v1}, LS/f0;->b(Z)J

    move-result-wide v8

    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object v3

    invoke-static {v8, v9}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v8

    invoke-virtual {v3, v8}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v3

    sget v8, LV/P0;->i:I

    shr-int/lit8 v9, v20, 0xc

    and-int/lit8 v9, v9, 0x70

    or-int/2addr v8, v9

    invoke-static {v3, v6, v5, v8}, LV/y;->a(LV/P0;Lx7/p;LV/n;I)V

    invoke-interface {v5}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_20

    invoke-static {}, LV/q;->P()V

    :cond_20
    move v3, v1

    move-object v10, v4

    move-object v4, v2

    move-object v2, v0

    :goto_13
    invoke-interface {v5}, LV/n;->x()LV/e1;

    move-result-object v9

    if-eqz v9, :cond_21

    new-instance v11, LS/h0$a;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object v5, v10

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LS/h0$a;-><init>(Lx7/a;Landroidx/compose/ui/d;ZLS/f0;Lz/l;Lx7/p;II)V

    invoke-interface {v9, v11}, LV/e1;->a(Lx7/p;)V

    :cond_21
    return-void
.end method
