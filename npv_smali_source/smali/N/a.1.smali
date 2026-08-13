.class public abstract LN/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LN/i;Lh0/c;Lx7/p;LV/n;I)V
    .locals 21

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v9, p2

    move/from16 v10, p4

    const v2, 0x1c5fd74b

    move-object/from16 v3, p3

    invoke-interface {v3, v2}, LV/n;->r(I)LV/n;

    move-result-object v11

    and-int/lit8 v3, v10, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v10, 0x8

    if-nez v3, :cond_0

    invoke-interface {v11, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-interface {v11, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v10

    goto :goto_2

    :cond_2
    move v3, v10

    :goto_2
    and-int/lit8 v5, v10, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_4

    invoke-interface {v11, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit16 v5, v10, 0x180

    if-nez v5, :cond_6

    invoke-interface {v11, v9}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_4

    :cond_5
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v3, v5

    :cond_6
    and-int/lit16 v5, v3, 0x93

    const/16 v7, 0x92

    if-ne v5, v7, :cond_8

    invoke-interface {v11}, LV/n;->u()Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_5

    :cond_7
    invoke-interface {v11}, LV/n;->A()V

    goto/16 :goto_7

    :cond_8
    :goto_5
    invoke-static {}, LV/q;->H()Z

    move-result v5

    if-eqz v5, :cond_9

    const/4 v5, -0x1

    const-string v7, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:247)"

    invoke-static {v2, v3, v5, v7}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_9
    and-int/lit8 v2, v3, 0x70

    const/4 v5, 0x0

    const/4 v7, 0x1

    if-ne v2, v6, :cond_a

    move v2, v7

    goto :goto_6

    :cond_a
    move v2, v5

    :goto_6
    and-int/lit8 v6, v3, 0xe

    if-eq v6, v4, :cond_b

    and-int/lit8 v4, v3, 0x8

    if-eqz v4, :cond_c

    invoke-interface {v11, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    :cond_b
    move v5, v7

    :cond_c
    or-int/2addr v2, v5

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_d

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_e

    :cond_d
    new-instance v4, LN/g;

    invoke-direct {v4, v1, v0}, LN/g;-><init>(Lh0/c;LN/i;)V

    invoke-interface {v11, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_e
    move-object v2, v4

    check-cast v2, LN/g;

    new-instance v4, Landroidx/compose/ui/window/s;

    const/16 v19, 0xf

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    move-object v12, v4

    invoke-direct/range {v12 .. v20}, Landroidx/compose/ui/window/s;-><init>(ZZZLandroidx/compose/ui/window/t;ZZILy7/k;)V

    shl-int/lit8 v3, v3, 0x3

    and-int/lit16 v3, v3, 0x1c00

    or-int/lit16 v7, v3, 0x180

    const/4 v8, 0x2

    const/4 v3, 0x0

    move-object/from16 v5, p2

    move-object v6, v11

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/r;Lx7/a;Landroidx/compose/ui/window/s;Lx7/p;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-static {}, LV/q;->P()V

    :cond_f
    :goto_7
    invoke-interface {v11}, LV/n;->x()LV/e1;

    move-result-object v2

    if-eqz v2, :cond_10

    new-instance v3, LN/a$a;

    invoke-direct {v3, v0, v1, v9, v10}, LN/a$a;-><init>(LN/i;Lh0/c;Lx7/p;I)V

    invoke-interface {v2, v3}, LV/e1;->a(Lx7/p;)V

    :cond_10
    return-void
.end method

.method public static final b(LN/i;ZLX0/i;ZJLandroidx/compose/ui/d;LV/n;II)V
    .locals 18

    .prologue
    move-object/from16 v7, p0

    move/from16 v8, p1

    move-object/from16 v9, p6

    move/from16 v10, p8

    const v0, -0x324ab118

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v11

    and-int/lit8 v1, p9, 0x1

    const/4 v2, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v1, v10, 0x6

    goto :goto_2

    :cond_0
    and-int/lit8 v1, v10, 0x6

    if-nez v1, :cond_3

    and-int/lit8 v1, v10, 0x8

    if-nez v1, :cond_1

    invoke-interface {v11, v7}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_1
    invoke-interface {v11, v7}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v10

    goto :goto_2

    :cond_3
    move v1, v10

    :goto_2
    and-int/lit8 v3, p9, 0x2

    const/16 v4, 0x20

    if-eqz v3, :cond_4

    or-int/lit8 v1, v1, 0x30

    goto :goto_4

    :cond_4
    and-int/lit8 v3, v10, 0x30

    if-nez v3, :cond_6

    invoke-interface {v11, v8}, LV/n;->d(Z)Z

    move-result v3

    if-eqz v3, :cond_5

    move v3, v4

    goto :goto_3

    :cond_5
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v1, v3

    :cond_6
    :goto_4
    and-int/lit8 v3, p9, 0x4

    if-eqz v3, :cond_7

    or-int/lit16 v1, v1, 0x180

    move-object/from16 v12, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v3, v10, 0x180

    move-object/from16 v12, p2

    if-nez v3, :cond_9

    invoke-interface {v11, v12}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x100

    goto :goto_5

    :cond_8
    const/16 v3, 0x80

    :goto_5
    or-int/2addr v1, v3

    :cond_9
    :goto_6
    and-int/lit8 v3, p9, 0x8

    if-eqz v3, :cond_a

    or-int/lit16 v1, v1, 0xc00

    move/from16 v13, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v3, v10, 0xc00

    move/from16 v13, p3

    if-nez v3, :cond_c

    invoke-interface {v11, v13}, LV/n;->d(Z)Z

    move-result v3

    if-eqz v3, :cond_b

    const/16 v3, 0x800

    goto :goto_7

    :cond_b
    const/16 v3, 0x400

    :goto_7
    or-int/2addr v1, v3

    :cond_c
    :goto_8
    and-int/lit16 v3, v10, 0x6000

    if-nez v3, :cond_e

    and-int/lit8 v3, p9, 0x10

    move-wide/from16 v5, p4

    if-nez v3, :cond_d

    invoke-interface {v11, v5, v6}, LV/n;->j(J)Z

    move-result v3

    if-eqz v3, :cond_d

    const/16 v3, 0x4000

    goto :goto_9

    :cond_d
    const/16 v3, 0x2000

    :goto_9
    or-int/2addr v1, v3

    goto :goto_a

    :cond_e
    move-wide/from16 v5, p4

    :goto_a
    and-int/lit8 v3, p9, 0x20

    const/high16 v14, 0x30000

    if-eqz v3, :cond_f

    or-int/2addr v1, v14

    goto :goto_c

    :cond_f
    and-int v3, v10, v14

    if-nez v3, :cond_11

    invoke-interface {v11, v9}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    const/high16 v3, 0x20000

    goto :goto_b

    :cond_10
    const/high16 v3, 0x10000

    :goto_b
    or-int/2addr v1, v3

    :cond_11
    :goto_c
    const v3, 0x12493

    and-int/2addr v3, v1

    const v14, 0x12492

    if-ne v3, v14, :cond_13

    invoke-interface {v11}, LV/n;->u()Z

    move-result v3

    if-nez v3, :cond_12

    goto :goto_d

    :cond_12
    invoke-interface {v11}, LV/n;->A()V

    goto/16 :goto_16

    :cond_13
    :goto_d
    invoke-interface {v11}, LV/n;->q()V

    and-int/lit8 v3, v10, 0x1

    const v14, -0xe001

    if-eqz v3, :cond_16

    invoke-interface {v11}, LV/n;->G()Z

    move-result v3

    if-eqz v3, :cond_14

    goto :goto_f

    :cond_14
    invoke-interface {v11}, LV/n;->A()V

    and-int/lit8 v3, p9, 0x10

    if-eqz v3, :cond_15

    :goto_e
    and-int/2addr v1, v14

    :cond_15
    move-wide v14, v5

    goto :goto_10

    :cond_16
    :goto_f
    and-int/lit8 v3, p9, 0x10

    if-eqz v3, :cond_15

    sget-object v3, LY0/l;->b:LY0/l$a;

    invoke-virtual {v3}, LY0/l$a;->a()J

    move-result-wide v5

    goto :goto_e

    :goto_10
    invoke-interface {v11}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_17

    const/4 v3, -0x1

    const-string v5, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:64)"

    invoke-static {v0, v1, v3, v5}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_17
    invoke-static/range {p1 .. p3}, LN/v;->f(ZLX0/i;Z)Z

    move-result v5

    sget-object v0, Lh0/a;->a:Lh0/a;

    if-eqz v5, :cond_18

    invoke-virtual {v0}, Lh0/a;->d()Lh0/c;

    move-result-object v0

    :goto_11
    move-object v6, v0

    goto :goto_12

    :cond_18
    invoke-virtual {v0}, Lh0/a;->c()Lh0/c;

    move-result-object v0

    goto :goto_11

    :goto_12
    and-int/lit8 v3, v1, 0xe

    const/4 v0, 0x1

    if-eq v3, v2, :cond_1a

    and-int/lit8 v2, v1, 0x8

    if-eqz v2, :cond_19

    invoke-interface {v11, v7}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_19

    goto :goto_13

    :cond_19
    const/4 v2, 0x0

    goto :goto_14

    :cond_1a
    :goto_13
    move v2, v0

    :goto_14
    and-int/lit8 v1, v1, 0x70

    if-ne v1, v4, :cond_1b

    move v1, v0

    goto :goto_15

    :cond_1b
    const/4 v1, 0x0

    :goto_15
    or-int/2addr v1, v2

    invoke-interface {v11, v5}, LV/n;->d(Z)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1c

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_1d

    :cond_1c
    new-instance v2, LN/a$d;

    invoke-direct {v2, v7, v8, v5}, LN/a$d;-><init>(LN/i;ZZ)V

    invoke-interface {v11, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1d
    check-cast v2, Lx7/l;

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static {v9, v4, v2, v0, v1}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v16

    invoke-static {}, Landroidx/compose/ui/platform/p0;->r()LV/O0;

    move-result-object v1

    invoke-interface {v11, v1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/platform/A1;

    new-instance v4, LN/a$b;

    move v2, v0

    move-object v0, v4

    move v9, v2

    move v8, v3

    move-wide v2, v14

    move-object v10, v4

    move v4, v5

    move-object/from16 v5, v16

    move-object/from16 v17, v6

    move-object/from16 v6, p0

    invoke-direct/range {v0 .. v6}, LN/a$b;-><init>(Landroidx/compose/ui/platform/A1;JZLandroidx/compose/ui/d;LN/i;)V

    const/16 v0, 0x36

    const v1, 0x10b320d1

    invoke-static {v1, v9, v10, v11, v0}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v0

    or-int/lit16 v1, v8, 0x180

    move-object/from16 v2, v17

    invoke-static {v7, v2, v0, v11, v1}, LN/a;->a(LN/i;Lh0/c;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-static {}, LV/q;->P()V

    :cond_1e
    move-wide v5, v14

    :goto_16
    invoke-interface {v11}, LV/n;->x()LV/e1;

    move-result-object v10

    if-eqz v10, :cond_1f

    new-instance v11, LN/a$c;

    move-object v0, v11

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v7, p6

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, LN/a$c;-><init>(LN/i;ZLX0/i;ZJLandroidx/compose/ui/d;II)V

    invoke-interface {v10, v11}, LV/e1;->a(Lx7/p;)V

    :cond_1f
    return-void
.end method

.method public static final c(Landroidx/compose/ui/d;Lx7/a;ZLV/n;I)V
    .locals 4

    .prologue
    const v0, 0x7ddd909a

    invoke-interface {p3, v0}, LV/n;->r(I)LV/n;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LV/n;->S(Ljava/lang/Object;)Z

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

    invoke-interface {p3, p2}, LV/n;->d(Z)Z

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

    const-string v3, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:122)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_8
    invoke-static {}, LN/v;->c()F

    move-result v0

    invoke-static {}, LN/v;->b()F

    move-result v1

    invoke-static {p0, v0, v1}, Landroidx/compose/foundation/layout/p;->q(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-static {v0, p1, p2}, LN/a;->e(Landroidx/compose/ui/d;Lx7/a;Z)Landroidx/compose/ui/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p3, v1}, LA/N;->a(Landroidx/compose/ui/d;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    :goto_5
    invoke-interface {p3}, LV/n;->x()LV/e1;

    move-result-object p3

    if-eqz p3, :cond_a

    new-instance v0, LN/a$e;

    invoke-direct {v0, p0, p1, p2, p4}, LN/a$e;-><init>(Landroidx/compose/ui/d;Lx7/a;ZI)V

    invoke-interface {p3, v0}, LV/e1;->a(Lx7/p;)V

    :cond_a
    return-void
.end method

.method public static final d(Ll0/d;F)Lo0/E1;
    .locals 32

    .prologue
    move/from16 v3, p1

    float-to-double v0, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-int v0, v0

    mul-int/lit8 v5, v0, 0x2

    sget-object v0, LN/f;->a:LN/f;

    invoke-virtual {v0}, LN/f;->c()Lo0/E1;

    move-result-object v1

    invoke-virtual {v0}, LN/f;->a()Lo0/q0;

    move-result-object v2

    invoke-virtual {v0}, LN/f;->b()Lq0/a;

    move-result-object v11

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    invoke-interface {v1}, Lo0/E1;->getWidth()I

    move-result v4

    if-gt v5, v4, :cond_1

    invoke-interface {v1}, Lo0/E1;->getHeight()I

    move-result v4

    if-le v5, v4, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v12, v1

    move-object v13, v2

    goto :goto_2

    :cond_1
    :goto_1
    sget-object v1, Lo0/F1;->b:Lo0/F1$a;

    invoke-virtual {v1}, Lo0/F1$a;->a()I

    move-result v6

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v4, v5

    invoke-static/range {v4 .. v10}, Lo0/G1;->b(IIIZLp0/c;ILjava/lang/Object;)Lo0/E1;

    move-result-object v1

    invoke-virtual {v0, v1}, LN/f;->f(Lo0/E1;)V

    invoke-static {v1}, Lo0/s0;->a(Lo0/E1;)Lo0/q0;

    move-result-object v2

    invoke-virtual {v0, v2}, LN/f;->d(Lo0/q0;)V

    goto :goto_0

    :goto_2
    if-nez v11, :cond_2

    new-instance v11, Lq0/a;

    invoke-direct {v11}, Lq0/a;-><init>()V

    invoke-virtual {v0, v11}, LN/f;->e(Lq0/a;)V

    :cond_2
    move-object/from16 v27, v11

    invoke-virtual/range {p0 .. p0}, Ll0/d;->getLayoutDirection()LY0/v;

    move-result-object v0

    invoke-interface {v12}, Lo0/E1;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-interface {v12}, Lo0/E1;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-static {v1, v2}, Ln0/n;->a(FF)J

    move-result-wide v1

    invoke-virtual/range {v27 .. v27}, Lq0/a;->H()Lq0/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lq0/a$a;->a()LY0/e;

    move-result-object v11

    invoke-virtual {v4}, Lq0/a$a;->b()LY0/v;

    move-result-object v10

    invoke-virtual {v4}, Lq0/a$a;->c()Lo0/q0;

    move-result-object v9

    invoke-virtual {v4}, Lq0/a$a;->d()J

    move-result-wide v7

    invoke-virtual/range {v27 .. v27}, Lq0/a;->H()Lq0/a$a;

    move-result-object v4

    move-object/from16 v5, p0

    invoke-virtual {v4, v5}, Lq0/a$a;->j(LY0/e;)V

    invoke-virtual {v4, v0}, Lq0/a$a;->k(LY0/v;)V

    invoke-virtual {v4, v13}, Lq0/a$a;->i(Lo0/q0;)V

    invoke-virtual {v4, v1, v2}, Lq0/a$a;->l(J)V

    invoke-interface {v13}, Lo0/q0;->m()V

    sget-object v0, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v0}, Lo0/y0$a;->a()J

    move-result-wide v15

    invoke-interface/range {v27 .. v27}, Lq0/g;->i()J

    move-result-wide v19

    sget-object v0, Lo0/f0;->a:Lo0/f0$a;

    invoke-virtual {v0}, Lo0/f0$a;->a()I

    move-result v24

    const/16 v25, 0x3a

    const/16 v26, 0x0

    const-wide/16 v17, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v14, v27

    invoke-static/range {v14 .. v26}, Lq0/f;->m(Lq0/g;JJJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    const-wide v0, 0xff000000L

    invoke-static {v0, v1}, Lo0/A0;->d(J)J

    move-result-wide v15

    sget-object v2, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v2}, Ln0/g$a;->c()J

    move-result-wide v17

    invoke-static {v3, v3}, Ln0/n;->a(FF)J

    move-result-wide v19

    const/16 v25, 0x78

    const/16 v24, 0x0

    invoke-static/range {v14 .. v26}, Lq0/f;->m(Lq0/g;JJJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    invoke-static {v0, v1}, Lo0/A0;->d(J)J

    move-result-wide v1

    invoke-static {v3, v3}, Ln0/h;->a(FF)J

    move-result-wide v4

    const/16 v14, 0x78

    const/4 v15, 0x0

    const/4 v6, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v0, v27

    move/from16 v3, p1

    move-wide/from16 v28, v7

    move-object/from16 v7, v16

    move-object/from16 v8, v17

    move-object/from16 v30, v9

    move/from16 v9, v18

    move-object/from16 v31, v10

    move v10, v14

    move-object v14, v11

    move-object v11, v15

    invoke-static/range {v0 .. v11}, Lq0/f;->e(Lq0/g;JFJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    invoke-interface {v13}, Lo0/q0;->s()V

    invoke-virtual/range {v27 .. v27}, Lq0/a;->H()Lq0/a$a;

    move-result-object v0

    invoke-virtual {v0, v14}, Lq0/a$a;->j(LY0/e;)V

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Lq0/a$a;->k(LY0/v;)V

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lq0/a$a;->i(Lo0/q0;)V

    move-wide/from16 v1, v28

    invoke-virtual {v0, v1, v2}, Lq0/a$a;->l(J)V

    return-object v12
.end method

.method public static final e(Landroidx/compose/ui/d;Lx7/a;Z)Landroidx/compose/ui/d;
    .locals 1

    new-instance v0, LN/a$f;

    invoke-direct {v0, p1, p2}, LN/a$f;-><init>(Lx7/a;Z)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, v0, p1, p2}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/d;Lx7/l;Lx7/q;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
