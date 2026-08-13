.class public abstract LS/X0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS/X0$f;
    }
.end annotation


# direct methods
.method private static final a(LS/U0;Landroidx/compose/ui/d;Lx7/q;LV/n;II)V
    .locals 16

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    const/4 v0, 0x2

    const/4 v2, 0x4

    const/4 v5, 0x6

    const v6, -0x4e7a54a0

    move-object/from16 v7, p3

    invoke-interface {v7, v6}, LV/n;->r(I)LV/n;

    move-result-object v7

    const/4 v8, 0x1

    and-int/lit8 v9, p5, 0x1

    if-eqz v9, :cond_0

    or-int/lit8 v9, v4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v9, v4, 0x6

    if-nez v9, :cond_2

    invoke-interface {v7, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    move v9, v2

    goto :goto_0

    :cond_1
    move v9, v0

    :goto_0
    or-int/2addr v9, v4

    goto :goto_1

    :cond_2
    move v9, v4

    :goto_1
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_4

    or-int/lit8 v9, v9, 0x30

    :cond_3
    move-object/from16 v10, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v10, v4, 0x30

    if-nez v10, :cond_3

    move-object/from16 v10, p1

    invoke-interface {v7, v10}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    const/16 v11, 0x20

    goto :goto_2

    :cond_5
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v9, v11

    :goto_3
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v9, v9, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v2, v4, 0x180

    if-nez v2, :cond_8

    invoke-interface {v7, v3}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/16 v2, 0x100

    goto :goto_4

    :cond_7
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v9, v2

    :cond_8
    :goto_5
    and-int/lit16 v2, v9, 0x93

    const/16 v11, 0x92

    if-ne v2, v11, :cond_b

    invoke-interface {v7}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {v7}, LV/n;->A()V

    :cond_a
    :goto_6
    move-object v2, v10

    goto/16 :goto_c

    :cond_b
    :goto_7
    if-eqz v0, :cond_c

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    move-object v10, v0

    :cond_c
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    const/4 v0, -0x1

    const-string v2, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:327)"

    invoke-static {v6, v9, v0, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_d
    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_e

    new-instance v0, LS/e0;

    invoke-direct {v0}, LS/e0;-><init>()V

    invoke-interface {v7, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_e
    check-cast v0, LS/e0;

    const v2, -0x4ae96be3

    invoke-interface {v7, v2}, LV/n;->T(I)V

    invoke-virtual {v0}, LS/e0;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/16 v6, 0x36

    if-nez v2, :cond_12

    invoke-virtual {v0, v1}, LS/e0;->d(Ljava/lang/Object;)V

    invoke-virtual {v0}, LS/e0;->b()Ljava/util/List;

    move-result-object v2

    new-instance v11, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v12

    const/4 v13, 0x0

    :goto_8
    if-ge v13, v12, :cond_f

    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LS/d0;

    invoke-virtual {v14}, LS/d0;->c()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LS/U0;

    invoke-interface {v11, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/2addr v13, v8

    goto :goto_8

    :cond_f
    invoke-static {v11}, Lj7/v;->W0(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_10

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_10
    invoke-virtual {v0}, LS/e0;->b()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->clear()V

    invoke-static {v2}, La1/a;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v11

    invoke-virtual {v0}, LS/e0;->b()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v13

    const/4 v14, 0x0

    :goto_9
    if-ge v14, v13, :cond_11

    invoke-interface {v11, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LS/U0;

    new-instance v5, LS/d0;

    new-instance v9, LS/X0$a;

    invoke-direct {v9, v15, v1, v2, v0}, LS/X0$a;-><init>(LS/U0;LS/U0;Ljava/util/List;LS/e0;)V

    const v1, -0x62a075c5

    invoke-static {v1, v8, v9, v7, v6}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v1

    invoke-direct {v5, v15, v1}, LS/d0;-><init>(Ljava/lang/Object;Lx7/q;)V

    invoke-interface {v12, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/2addr v14, v8

    const/4 v5, 0x6

    move-object/from16 v1, p0

    goto :goto_9

    :cond_11
    check-cast v12, Ljava/util/List;

    :cond_12
    invoke-interface {v7}, LV/n;->J()V

    sget-object v1, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v1}, Lh0/c$a;->o()Lh0/c;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v1

    invoke-static {v7, v2}, LV/k;->a(LV/n;I)I

    move-result v5

    invoke-interface {v7}, LV/n;->F()LV/z;

    move-result-object v2

    invoke-static {v7, v10}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v9

    sget-object v11, LF0/g;->a:LF0/g$a;

    invoke-virtual {v11}, LF0/g$a;->a()Lx7/a;

    move-result-object v12

    invoke-interface {v7}, LV/n;->v()LV/g;

    move-result-object v13

    instance-of v13, v13, LV/g;

    if-nez v13, :cond_13

    invoke-static {}, LV/k;->c()V

    :cond_13
    invoke-interface {v7}, LV/n;->t()V

    invoke-interface {v7}, LV/n;->o()Z

    move-result v13

    if-eqz v13, :cond_14

    invoke-interface {v7, v12}, LV/n;->B(Lx7/a;)V

    goto :goto_a

    :cond_14
    invoke-interface {v7}, LV/n;->H()V

    :goto_a
    invoke-static {v7}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v12

    invoke-virtual {v11}, LF0/g$a;->c()Lx7/p;

    move-result-object v13

    invoke-static {v12, v1, v13}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v11}, LF0/g$a;->e()Lx7/p;

    move-result-object v1

    invoke-static {v12, v2, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v11}, LF0/g$a;->b()Lx7/p;

    move-result-object v1

    invoke-interface {v12}, LV/n;->o()Z

    move-result v2

    if-nez v2, :cond_15

    invoke-interface {v12}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v2, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    :cond_15
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v12, v2}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v12, v2, v1}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_16
    invoke-virtual {v11}, LF0/g$a;->d()Lx7/p;

    move-result-object v1

    invoke-static {v12, v9, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    const/4 v1, 0x0

    invoke-static {v7, v1}, LV/k;->b(LV/n;I)LV/Q0;

    move-result-object v2

    invoke-virtual {v0, v2}, LS/e0;->e(LV/Q0;)V

    const v2, 0x6831aac1

    invoke-interface {v7, v2}, LV/n;->T(I)V

    invoke-virtual {v0}, LS/e0;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    move v9, v1

    :goto_b
    if-ge v9, v2, :cond_17

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LS/d0;

    invoke-virtual {v1}, LS/d0;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LS/U0;

    invoke-virtual {v1}, LS/d0;->b()Lx7/q;

    move-result-object v1

    const v11, 0x4796f93d

    invoke-interface {v7, v11, v5}, LV/n;->s(ILjava/lang/Object;)V

    new-instance v11, LS/X0$b;

    invoke-direct {v11, v3, v5}, LS/X0$b;-><init>(Lx7/q;LS/U0;)V

    const v5, -0x43ac567f

    invoke-static {v5, v8, v11, v7, v6}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v5

    const/4 v11, 0x6

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v1, v5, v7, v12}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v7}, LV/n;->N()V

    add-int/2addr v9, v8

    goto :goto_b

    :cond_17
    invoke-interface {v7}, LV/n;->J()V

    invoke-interface {v7}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LV/q;->P()V

    goto/16 :goto_6

    :goto_c
    invoke-interface {v7}, LV/n;->x()LV/e1;

    move-result-object v6

    if-eqz v6, :cond_18

    new-instance v7, LS/X0$c;

    move-object v0, v7

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LS/X0$c;-><init>(LS/U0;Landroidx/compose/ui/d;Lx7/q;II)V

    invoke-interface {v6, v7}, LV/e1;->a(Lx7/p;)V

    :cond_18
    return-void
.end method

.method public static final b(LS/Y0;Landroidx/compose/ui/d;Lx7/q;LV/n;II)V
    .locals 7

    .prologue
    const v0, 0x1baacc01

    invoke-interface {p3, v0}, LV/n;->r(I)LV/n;

    move-result-object p3

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_2

    invoke-interface {p3, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_2
    move v1, p4

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_5

    invoke-interface {p3, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v4, p4, 0x180

    if-nez v4, :cond_8

    invoke-interface {p3, p2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    :cond_8
    :goto_5
    and-int/lit16 v4, v1, 0x93

    const/16 v5, 0x92

    if-ne v4, v5, :cond_b

    invoke-interface {p3}, LV/n;->u()Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {p3}, LV/n;->A()V

    :cond_a
    :goto_6
    move-object v3, p1

    move-object v4, p2

    goto :goto_8

    :cond_b
    :goto_7
    if-eqz v2, :cond_c

    sget-object p1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    :cond_c
    if-eqz v3, :cond_d

    sget-object p2, LS/F;->a:LS/F;

    invoke-virtual {p2}, LS/F;->a()Lx7/q;

    move-result-object p2

    :cond_d
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_e

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:221)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_e
    invoke-virtual {p0}, LS/Y0;->b()LS/U0;

    move-result-object v0

    invoke-static {}, Landroidx/compose/ui/platform/p0;->c()LV/O0;

    move-result-object v2

    invoke-interface {p3, v2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/platform/i;

    invoke-interface {p3, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p3, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_f

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_10

    :cond_f
    new-instance v4, LS/X0$d;

    const/4 v3, 0x0

    invoke-direct {v4, v0, v2, v3}, LS/X0$d;-><init>(LS/U0;Landroidx/compose/ui/platform/i;Lm7/e;)V

    invoke-interface {p3, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v4, Lx7/p;

    const/4 v2, 0x0

    invoke-static {v0, v4, p3, v2}, LV/Q;->e(Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-virtual {p0}, LS/Y0;->b()LS/U0;

    move-result-object v0

    and-int/lit16 v5, v1, 0x3f0

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v6}, LS/X0;->a(LS/U0;Landroidx/compose/ui/d;Lx7/q;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LV/q;->P()V

    goto :goto_6

    :goto_8
    invoke-interface {p3}, LV/n;->x()LV/e1;

    move-result-object p1

    if-eqz p1, :cond_11

    new-instance p2, LS/X0$e;

    move-object v1, p2

    move-object v2, p0

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, LS/X0$e;-><init>(LS/Y0;Landroidx/compose/ui/d;Lx7/q;II)V

    invoke-interface {p1, p2}, LV/e1;->a(Lx7/p;)V

    :cond_11
    return-void
.end method

.method public static final synthetic c(LS/U0;Landroidx/compose/ui/d;Lx7/q;LV/n;II)V
    .locals 0

    invoke-static/range {p0 .. p5}, LS/X0;->a(LS/U0;Landroidx/compose/ui/d;Lx7/q;LV/n;II)V

    return-void
.end method

.method public static final synthetic d(Lu/j;ZLx7/a;LV/n;II)LV/G1;
    .locals 0

    invoke-static/range {p0 .. p5}, LS/X0;->f(Lu/j;ZLx7/a;LV/n;II)LV/G1;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lu/j;ZLV/n;I)LV/G1;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LS/X0;->g(Lu/j;ZLV/n;I)LV/G1;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lu/j;ZLx7/a;LV/n;II)LV/G1;
    .locals 7

    .prologue
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    sget-object p2, LS/X0$g;->D:LS/X0$g;

    :cond_0
    move-object v4, p2

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, -0x1

    const-string p5, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:418)"

    const v0, 0x5558e4ee

    invoke-static {v0, p4, p2, p5}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1
    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object p2

    sget-object p5, LV/n;->a:LV/n$a;

    invoke-virtual {p5}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_3

    const/4 p2, 0x0

    if-nez p1, :cond_2

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_2
    move v0, p2

    :goto_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p2, v1, v2}, Lu/b;->b(FFILjava/lang/Object;)Lu/a;

    move-result-object p2

    invoke-interface {p3, p2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast p2, Lu/a;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-interface {p3, p2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit8 v1, p4, 0x70

    xor-int/lit8 v1, v1, 0x30

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/16 v5, 0x20

    if-le v1, v5, :cond_4

    invoke-interface {p3, p1}, LV/n;->d(Z)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    and-int/lit8 v1, p4, 0x30

    if-ne v1, v5, :cond_6

    :cond_5
    move v1, v3

    goto :goto_1

    :cond_6
    move v1, v2

    :goto_1
    or-int/2addr v0, v1

    invoke-interface {p3, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    and-int/lit16 v1, p4, 0x380

    xor-int/lit16 v1, v1, 0x180

    const/16 v5, 0x100

    if-le v1, v5, :cond_7

    invoke-interface {p3, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    and-int/lit16 v1, p4, 0x180

    if-ne v1, v5, :cond_9

    :cond_8
    move v2, v3

    :cond_9
    or-int/2addr v0, v2

    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_a

    invoke-virtual {p5}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p5

    if-ne v1, p5, :cond_b

    :cond_a
    new-instance p5, LS/X0$h;

    const/4 v5, 0x0

    move-object v0, p5

    move-object v1, p2

    move v2, p1

    move-object v3, p0

    invoke-direct/range {v0 .. v5}, LS/X0$h;-><init>(Lu/a;ZLu/j;Lx7/a;Lm7/e;)V

    invoke-interface {p3, p5}, LV/n;->K(Ljava/lang/Object;)V

    move-object v1, p5

    :cond_b
    check-cast v1, Lx7/p;

    shr-int/lit8 p0, p4, 0x3

    and-int/lit8 p0, p0, 0xe

    invoke-static {v6, v1, p3, p0}, LV/Q;->e(Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-virtual {p2}, Lu/a;->g()LV/G1;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-static {}, LV/q;->P()V

    :cond_c
    return-object p0
.end method

.method private static final g(Lu/j;ZLV/n;I)LV/G1;
    .locals 7

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:428)"

    const v2, 0x753b22a1

    invoke-static {v2, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v0, v2, :cond_2

    if-nez p1, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_1
    const v0, 0x3f4ccccd    # 0.8f

    :goto_0
    const/4 v2, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v2, v4, v3}, Lu/b;->b(FFILjava/lang/Object;)Lu/a;

    move-result-object v0

    invoke-interface {p2, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lu/a;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p2, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v5, p3, 0x70

    xor-int/lit8 v5, v5, 0x30

    const/16 v6, 0x20

    if-le v5, v6, :cond_3

    invoke-interface {p2, p1}, LV/n;->d(Z)Z

    move-result v5

    if-nez v5, :cond_4

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-ne v5, v6, :cond_5

    :cond_4
    const/4 v5, 0x1

    goto :goto_1

    :cond_5
    const/4 v5, 0x0

    :goto_1
    or-int/2addr v4, v5

    invoke-interface {p2, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_6

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v5, v1, :cond_7

    :cond_6
    new-instance v5, LS/X0$i;

    invoke-direct {v5, v0, p1, p0, v3}, LS/X0$i;-><init>(Lu/a;ZLu/j;Lm7/e;)V

    invoke-interface {p2, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Lx7/p;

    shr-int/lit8 p0, p3, 0x3

    and-int/lit8 p0, p0, 0xe

    invoke-static {v2, v5, p2, p0}, LV/Q;->e(Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-virtual {v0}, Lu/a;->g()LV/G1;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LV/q;->P()V

    :cond_8
    return-object p0
.end method

.method public static final h(LS/W0;ZLandroidx/compose/ui/platform/i;)J
    .locals 8

    .prologue
    sget-object v0, LS/X0$f;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    const-wide/16 v0, 0xfa0

    :goto_0
    move-wide v3, v0

    goto :goto_1

    :cond_0
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0

    :cond_1
    const-wide/16 v0, 0x2710

    goto :goto_0

    :cond_2
    const-wide v0, 0x7fffffffffffffffL

    goto :goto_0

    :goto_1
    if-nez p2, :cond_3

    return-wide v3

    :cond_3
    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v2, p2

    move v7, p1

    invoke-interface/range {v2 .. v7}, Landroidx/compose/ui/platform/i;->a(JZZZ)J

    move-result-wide p0

    return-wide p0
.end method
