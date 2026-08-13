.class public abstract Landroidx/compose/ui/window/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx7/a;Landroidx/compose/ui/window/i;Lx7/p;LV/n;II)V
    .locals 23

    .prologue
    move-object/from16 v7, p0

    move-object/from16 v8, p2

    move/from16 v9, p4

    const v0, -0x792b3ec6

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v6

    and-int/lit8 v1, p5, 0x1

    const/4 v5, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v1, v9, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v9, 0x6

    if-nez v1, :cond_2

    invoke-interface {v6, v7}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move v1, v5

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_2
    move v1, v9

    :goto_1
    and-int/lit8 v2, p5, 0x2

    const/16 v4, 0x20

    if-eqz v2, :cond_4

    or-int/lit8 v1, v1, 0x30

    :cond_3
    move-object/from16 v3, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v3, v9, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p1

    invoke-interface {v6, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    move v10, v4

    goto :goto_2

    :cond_5
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v1, v10

    :goto_3
    and-int/lit8 v10, p5, 0x4

    if-eqz v10, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v10, v9, 0x180

    if-nez v10, :cond_8

    invoke-interface {v6, v8}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v1, v10

    :cond_8
    :goto_5
    and-int/lit16 v10, v1, 0x93

    const/16 v11, 0x92

    if-ne v10, v11, :cond_a

    invoke-interface {v6}, LV/n;->u()Z

    move-result v10

    if-nez v10, :cond_9

    goto :goto_6

    :cond_9
    invoke-interface {v6}, LV/n;->A()V

    move-object v2, v3

    move-object v11, v6

    goto/16 :goto_d

    :cond_a
    :goto_6
    if-eqz v2, :cond_b

    new-instance v2, Landroidx/compose/ui/window/i;

    const/4 v15, 0x7

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v11, v2

    invoke-direct/range {v11 .. v16}, Landroidx/compose/ui/window/i;-><init>(ZZZILy7/k;)V

    move-object v3, v2

    :cond_b
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_c

    const/4 v2, -0x1

    const-string v10, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:166)"

    invoke-static {v0, v1, v2, v10}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_c
    invoke-static {}, Landroidx/compose/ui/platform/T;->i()LV/O0;

    move-result-object v0

    invoke-interface {v6, v0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/View;

    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object v0

    invoke-interface {v6, v0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/e;

    invoke-static {}, Landroidx/compose/ui/platform/p0;->k()LV/O0;

    move-result-object v10

    invoke-interface {v6, v10}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v10

    move-object v15, v10

    check-cast v15, LY0/v;

    const/4 v14, 0x0

    invoke-static {v6, v14}, LV/k;->d(LV/n;I)LV/s;

    move-result-object v13

    shr-int/lit8 v10, v1, 0x6

    and-int/lit8 v10, v10, 0xe

    invoke-static {v8, v6, v10}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object v12

    new-array v10, v14, [Ljava/lang/Object;

    sget-object v16, Landroidx/compose/ui/window/a$e;->D:Landroidx/compose/ui/window/a$e;

    const/16 v17, 0xc00

    const/16 v18, 0x6

    const/4 v11, 0x0

    const/16 v19, 0x0

    move-object/from16 v20, v12

    move-object/from16 v12, v19

    move-object/from16 v21, v13

    move-object/from16 v13, v16

    move-object v14, v6

    move-object/from16 p1, v15

    move/from16 v15, v17

    move/from16 v16, v18

    invoke-static/range {v10 .. v16}, Le0/b;->e([Ljava/lang/Object;Le0/j;Ljava/lang/String;Lx7/a;LV/n;II)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/UUID;

    invoke-interface {v6, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v11

    invoke-interface {v6, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-interface {v6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v12

    const/4 v14, 0x1

    if-nez v11, :cond_e

    sget-object v11, LV/n;->a:LV/n$a;

    invoke-virtual {v11}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v12, v11, :cond_d

    goto :goto_7

    :cond_d
    move v13, v1

    move-object/from16 v22, v3

    move v15, v5

    move-object v11, v6

    goto :goto_8

    :cond_e
    :goto_7
    new-instance v12, Landroidx/compose/ui/window/k;

    move-object v11, v0

    move-object v0, v12

    move v13, v1

    move-object/from16 v1, p0

    move-object v15, v2

    move-object v2, v3

    move-object/from16 v22, v3

    move-object v3, v15

    move v15, v4

    move-object/from16 v4, p1

    move v15, v5

    move-object v5, v11

    move-object v11, v6

    move-object v6, v10

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/window/k;-><init>(Lx7/a;Landroidx/compose/ui/window/i;Landroid/view/View;LY0/v;LY0/e;Ljava/util/UUID;)V

    new-instance v0, Landroidx/compose/ui/window/a$d;

    move-object/from16 v1, v20

    invoke-direct {v0, v1}, Landroidx/compose/ui/window/a$d;-><init>(LV/G1;)V

    const v1, 0x1d1a4619

    invoke-static {v1, v14, v0}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v12, v1, v0}, Landroidx/compose/ui/window/k;->l(LV/s;Lx7/p;)V

    invoke-interface {v11, v12}, LV/n;->K(Ljava/lang/Object;)V

    :goto_8
    check-cast v12, Landroidx/compose/ui/window/k;

    invoke-interface {v11, v12}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_f

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_10

    :cond_f
    new-instance v1, Landroidx/compose/ui/window/a$a;

    invoke-direct {v1, v12}, Landroidx/compose/ui/window/a$a;-><init>(Landroidx/compose/ui/window/k;)V

    invoke-interface {v11, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v1, Lx7/l;

    const/4 v0, 0x0

    invoke-static {v12, v1, v11, v0}, LV/Q;->b(Ljava/lang/Object;Lx7/l;LV/n;I)V

    invoke-interface {v11, v12}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit8 v2, v13, 0xe

    if-ne v2, v15, :cond_11

    move v2, v14

    goto :goto_9

    :cond_11
    move v2, v0

    :goto_9
    or-int/2addr v1, v2

    and-int/lit8 v2, v13, 0x70

    const/16 v3, 0x20

    if-ne v2, v3, :cond_12

    goto :goto_a

    :cond_12
    move v14, v0

    :goto_a
    or-int/2addr v1, v14

    move-object/from16 v10, p1

    invoke-interface {v11, v10}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_14

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_13

    goto :goto_b

    :cond_13
    move-object/from16 v3, v22

    goto :goto_c

    :cond_14
    :goto_b
    new-instance v2, Landroidx/compose/ui/window/a$b;

    move-object/from16 v3, v22

    invoke-direct {v2, v12, v7, v3, v10}, Landroidx/compose/ui/window/a$b;-><init>(Landroidx/compose/ui/window/k;Lx7/a;Landroidx/compose/ui/window/i;LY0/v;)V

    invoke-interface {v11, v2}, LV/n;->K(Ljava/lang/Object;)V

    :goto_c
    check-cast v2, Lx7/a;

    invoke-static {v2, v11, v0}, LV/Q;->f(Lx7/a;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {}, LV/q;->P()V

    :cond_15
    move-object v2, v3

    :goto_d
    invoke-interface {v11}, LV/n;->x()LV/e1;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v10, Landroidx/compose/ui/window/a$c;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/window/a$c;-><init>(Lx7/a;Landroidx/compose/ui/window/i;Lx7/p;II)V

    invoke-interface {v6, v10}, LV/e1;->a(Lx7/p;)V

    :cond_16
    return-void
.end method

.method private static final b(LV/G1;)Lx7/p;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lx7/p;

    return-object p0
.end method

.method private static final c(Landroidx/compose/ui/d;Lx7/p;LV/n;II)V
    .locals 8

    .prologue
    const v0, -0x4634f888

    invoke-interface {p2, v0}, LV/n;->r(I)LV/n;

    move-result-object p2

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    invoke-interface {p2, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_5

    invoke-interface {p2, p1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_7

    invoke-interface {p2}, LV/n;->u()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p2}, LV/n;->A()V

    goto/16 :goto_6

    :cond_7
    :goto_4
    if-eqz v1, :cond_8

    sget-object p0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    :cond_8
    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, -0x1

    const-string v3, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:464)"

    invoke-static {v0, v2, v1, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v0, Landroidx/compose/ui/window/a$f;->a:Landroidx/compose/ui/window/a$f;

    shr-int/lit8 v1, v2, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v1, v1, 0x180

    shl-int/lit8 v2, v2, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {p2, v2}, LV/k;->a(LV/n;I)I

    move-result v2

    invoke-interface {p2}, LV/n;->F()LV/z;

    move-result-object v3

    invoke-static {p2, p0}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v4

    sget-object v5, LF0/g;->a:LF0/g$a;

    invoke-virtual {v5}, LF0/g$a;->a()Lx7/a;

    move-result-object v6

    shl-int/lit8 v1, v1, 0x6

    and-int/lit16 v1, v1, 0x380

    or-int/lit8 v1, v1, 0x6

    invoke-interface {p2}, LV/n;->v()LV/g;

    move-result-object v7

    instance-of v7, v7, LV/g;

    if-nez v7, :cond_a

    invoke-static {}, LV/k;->c()V

    :cond_a
    invoke-interface {p2}, LV/n;->t()V

    invoke-interface {p2}, LV/n;->o()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {p2, v6}, LV/n;->B(Lx7/a;)V

    goto :goto_5

    :cond_b
    invoke-interface {p2}, LV/n;->H()V

    :goto_5
    invoke-static {p2}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v6

    invoke-virtual {v5}, LF0/g$a;->c()Lx7/p;

    move-result-object v7

    invoke-static {v6, v0, v7}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->e()Lx7/p;

    move-result-object v0

    invoke-static {v6, v3, v0}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->b()Lx7/p;

    move-result-object v0

    invoke-interface {v6}, LV/n;->o()Z

    move-result v3

    if-nez v3, :cond_c

    invoke-interface {v6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    :cond_c
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v6, v2, v0}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_d
    invoke-virtual {v5}, LF0/g$a;->d()Lx7/p;

    move-result-object v0

    invoke-static {v6, v4, v0}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    shr-int/lit8 v0, v1, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, LV/q;->P()V

    :cond_e
    :goto_6
    invoke-interface {p2}, LV/n;->x()LV/e1;

    move-result-object p2

    if-eqz p2, :cond_f

    new-instance v0, Landroidx/compose/ui/window/a$g;

    invoke-direct {v0, p0, p1, p3, p4}, Landroidx/compose/ui/window/a$g;-><init>(Landroidx/compose/ui/d;Lx7/p;II)V

    invoke-interface {p2, v0}, LV/e1;->a(Lx7/p;)V

    :cond_f
    return-void
.end method

.method public static final synthetic d(LV/G1;)Lx7/p;
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/window/a;->b(LV/G1;)Lx7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Landroidx/compose/ui/d;Lx7/p;LV/n;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/window/a;->c(Landroidx/compose/ui/d;Lx7/p;LV/n;II)V

    return-void
.end method
