.class public abstract LC/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Ljava/util/List;[Ljava/lang/Object;)V
    .locals 3

    .prologue
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static final b(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLA/b$m;LA/b$e;ZLY0/e;)Ljava/util/List;
    .locals 14

    .prologue
    move-object v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    move-object/from16 v3, p9

    move/from16 v4, p11

    move/from16 v5, p6

    if-eqz p8, :cond_0

    move v6, v2

    goto :goto_0

    :cond_0
    move v6, v1

    :goto_0
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    const/4 v7, 0x0

    move/from16 v8, p5

    if-ge v8, v5, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    move v5, v7

    :goto_1
    if-eqz v5, :cond_3

    if-nez p7, :cond_2

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "non-zero firstLineScrollOffset"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v8

    move v9, v7

    move v10, v9

    :goto_3
    if-ge v9, v8, :cond_4

    invoke-interface {p0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LC/x;

    invoke-virtual {v11}, LC/x;->b()[LC/v;

    move-result-object v11

    array-length v11, v11

    add-int/2addr v10, v11

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_4
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz v5, :cond_f

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v5

    new-array v9, v5, [I

    move v10, v7

    :goto_4
    if-ge v10, v5, :cond_5

    invoke-static {v10, v4, v5}, LC/t;->c(IZI)I

    move-result v11

    invoke-interface {p0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LC/x;

    invoke-virtual {v11}, LC/x;->c()I

    move-result v11

    aput v11, v9, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_5
    new-array v10, v5, [I

    move v11, v7

    :goto_5
    if-ge v11, v5, :cond_6

    aput v7, v10, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_5

    :cond_6
    if-eqz p8, :cond_8

    if-eqz v3, :cond_7

    move-object/from16 v7, p12

    invoke-interface {v3, v7, v6, v9, v10}, LA/b$m;->b(LY0/e;I[I[I)V

    goto :goto_6

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null verticalArrangement"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    move-object/from16 v7, p12

    if-eqz p10, :cond_d

    sget-object v3, LY0/v;->C:LY0/v;

    move-object/from16 p5, p10

    move-object/from16 p6, p12

    move/from16 p7, v6

    move-object/from16 p8, v9

    move-object/from16 p9, v3

    move-object/from16 p10, v10

    invoke-interface/range {p5 .. p10}, LA/b$e;->c(LY0/e;I[ILY0/v;[I)V

    :goto_6
    invoke-static {v10}, Lj7/n;->a0([I)LE7/i;

    move-result-object v3

    if-eqz v4, :cond_9

    invoke-static {v3}, LE7/j;->o(LE7/g;)LE7/g;

    move-result-object v3

    :cond_9
    invoke-virtual {v3}, LE7/g;->f()I

    move-result v7

    invoke-virtual {v3}, LE7/g;->g()I

    move-result v9

    invoke-virtual {v3}, LE7/g;->o()I

    move-result v3

    if-lez v3, :cond_a

    if-le v7, v9, :cond_b

    :cond_a
    if-gez v3, :cond_13

    if-gt v9, v7, :cond_13

    :cond_b
    :goto_7
    aget v11, v10, v7

    invoke-static {v7, v4, v5}, LC/t;->c(IZI)I

    move-result v12

    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LC/x;

    if-eqz v4, :cond_c

    sub-int v11, v6, v11

    invoke-virtual {v12}, LC/x;->c()I

    move-result v13

    sub-int/2addr v11, v13

    :cond_c
    invoke-virtual {v12, v11, v1, v2}, LC/x;->f(III)[LC/v;

    move-result-object v11

    invoke-static {v8, v11}, LC/t;->a(Ljava/util/List;[Ljava/lang/Object;)V

    if-eq v7, v9, :cond_13

    add-int/2addr v7, v3

    goto :goto_7

    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null horizontalArrangement"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "no items"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_11

    move/from16 v4, p7

    :goto_8
    add-int/lit8 v5, v3, -0x1

    move-object v6, p1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC/v;

    invoke-virtual {v3}, LC/v;->e()I

    move-result v9

    sub-int/2addr v4, v9

    invoke-virtual {v3, v4, v7, v1, v2}, LC/v;->n(IIII)V

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-gez v5, :cond_10

    goto :goto_9

    :cond_10
    move v3, v5

    goto :goto_8

    :cond_11
    :goto_9
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    move/from16 v4, p7

    move v5, v7

    :goto_a
    if-ge v5, v3, :cond_12

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LC/x;

    invoke-virtual {v6, v4, v1, v2}, LC/x;->f(III)[LC/v;

    move-result-object v9

    invoke-static {v8, v9}, LC/t;->a(Ljava/util/List;[Ljava/lang/Object;)V

    invoke-virtual {v6}, LC/x;->d()I

    move-result v6

    add-int/2addr v4, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_a

    :cond_12
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    move v3, v7

    :goto_b
    if-ge v3, v0, :cond_13

    move-object/from16 v5, p2

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LC/v;

    invoke-virtual {v6, v4, v7, v1, v2}, LC/v;->n(IIII)V

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, LC/v;->e()I

    move-result v6

    add-int/2addr v4, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    :cond_13
    return-object v8
.end method

.method private static final c(IZI)I
    .locals 0

    .prologue
    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sub-int/2addr p2, p0

    add-int/lit8 p0, p2, -0x1

    :goto_0
    return p0
.end method

.method public static final d(ILC/y;LC/w;IIIIIIFJZLA/b$m;LA/b$e;ZLY0/e;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;LW8/N;LV/w0;Lo0/C1;Lx7/l;Lx7/q;)LC/u;
    .locals 38

    .prologue
    move/from16 v14, p0

    move-object/from16 v0, p1

    move/from16 v13, p3

    move/from16 v1, p4

    move-wide/from16 v11, p10

    move-object/from16 v2, p19

    move-object/from16 v10, p24

    if-ltz v1, :cond_2d

    if-ltz p5, :cond_2c

    if-gtz v14, :cond_2

    invoke-static/range {p10 .. p11}, LY0/b;->n(J)I

    move-result v0

    invoke-static/range {p10 .. p11}, LY0/b;->m(J)I

    move-result v2

    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p2 .. p2}, LC/w;->e()Landroidx/compose/foundation/lazy/layout/c;

    move-result-object v19

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/4 v15, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move-object/from16 v14, p17

    move/from16 v16, v0

    move/from16 v17, v2

    move-object/from16 v20, p2

    move/from16 v21, p12

    move/from16 v23, p18

    move-object/from16 v27, p20

    move-object/from16 v28, p22

    invoke-virtual/range {v14 .. v28}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->l(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/c;LD/z;ZZIZIILW8/N;Lo0/C1;)V

    invoke-virtual/range {p17 .. p17}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h()J

    move-result-wide v3

    sget-object v5, LY0/t;->b:LY0/t$a;

    invoke-virtual {v5}, LY0/t$a;->a()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, LY0/t;->e(JJ)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-static {v3, v4}, LY0/t;->g(J)I

    move-result v0

    invoke-static {v11, v12, v0}, LY0/c;->i(JI)I

    move-result v0

    invoke-static {v3, v4}, LY0/t;->f(J)I

    move-result v2

    invoke-static {v11, v12, v2}, LY0/c;->h(JI)I

    move-result v2

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, LC/t$a;->D:LC/t$a;

    invoke-interface {v10, v0, v2, v3}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LD0/K;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v11

    neg-int v12, v1

    add-int v13, v13, p5

    if-eqz p12, :cond_1

    sget-object v0, Lx/s;->C:Lx/s;

    :goto_0
    move-object/from16 v16, v0

    goto :goto_1

    :cond_1
    sget-object v0, Lx/s;->D:Lx/s;

    goto :goto_0

    :goto_1
    new-instance v19, LC/u;

    move-object/from16 v0, v19

    const/4 v6, 0x0

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v7, p20

    move-object/from16 v8, p16

    move/from16 v9, p18

    move-object/from16 v10, p23

    move/from16 v15, p15

    move/from16 v17, p5

    move/from16 v18, p6

    invoke-direct/range {v0 .. v18}, LC/u;-><init>(LC/x;IZFLD0/K;ZLW8/N;LY0/e;ILx7/l;Ljava/util/List;IIIZLx/s;II)V

    return-object v19

    :cond_2
    invoke-static/range {p9 .. p9}, Ljava/lang/Math;->round(F)I

    move-result v3

    sub-int v4, p8, v3

    const/4 v15, 0x0

    if-nez p7, :cond_3

    if-gez v4, :cond_3

    add-int/2addr v3, v4

    move v4, v15

    :cond_3
    new-instance v5, Lj7/m;

    invoke-direct {v5}, Lj7/m;-><init>()V

    neg-int v9, v1

    if-gez p6, :cond_4

    move/from16 v6, p6

    goto :goto_2

    :cond_4
    move v6, v15

    :goto_2
    add-int/2addr v6, v9

    add-int/2addr v4, v6

    move v7, v4

    move/from16 v4, p7

    :goto_3
    if-gez v7, :cond_5

    if-lez v4, :cond_5

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v0, v4}, LC/y;->c(I)LC/x;

    move-result-object v8

    invoke-virtual {v5, v15, v8}, Lj7/m;->add(ILjava/lang/Object;)V

    invoke-virtual {v8}, LC/x;->d()I

    move-result v8

    add-int/2addr v7, v8

    goto :goto_3

    :cond_5
    if-ge v7, v6, :cond_6

    add-int/2addr v3, v7

    move v7, v6

    :cond_6
    sub-int/2addr v7, v6

    add-int v8, v13, p5

    move/from16 p7, v4

    invoke-static {v8, v15}, LE7/j;->d(II)I

    move-result v4

    neg-int v15, v7

    move/from16 v18, p7

    move/from16 v17, v7

    move/from16 v19, v8

    move v7, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    :goto_4
    invoke-virtual {v5}, Lj7/h;->size()I

    move-result v8

    const/16 v30, 0x1

    if-ge v15, v8, :cond_8

    if-lt v7, v4, :cond_7

    invoke-virtual {v5, v15}, Lj7/h;->remove(I)Ljava/lang/Object;

    move/from16 v16, v30

    goto :goto_4

    :cond_7
    add-int/lit8 v18, v18, 0x1

    invoke-virtual {v5, v15}, Lj7/m;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LC/x;

    invoke-virtual {v8}, LC/x;->d()I

    move-result v8

    add-int/2addr v7, v8

    add-int/lit8 v15, v15, 0x1

    goto :goto_4

    :cond_8
    move v8, v7

    move/from16 v31, v16

    move/from16 v15, v18

    move/from16 v7, p7

    :goto_5
    if-ge v15, v14, :cond_a

    if-lt v8, v4, :cond_9

    if-lez v8, :cond_9

    invoke-virtual {v5}, Lj7/m;->isEmpty()Z

    move-result v16

    if-eqz v16, :cond_a

    :cond_9
    move/from16 p7, v4

    goto :goto_7

    :cond_a
    :goto_6
    move/from16 v16, v7

    goto :goto_9

    :goto_7
    invoke-virtual {v0, v15}, LC/y;->c(I)LC/x;

    move-result-object v4

    invoke-virtual {v4}, LC/x;->e()Z

    move-result v16

    if-eqz v16, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual {v4}, LC/x;->d()I

    move-result v16

    add-int v8, v8, v16

    if-gt v8, v6, :cond_c

    invoke-virtual {v4}, LC/x;->b()[LC/v;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lj7/n;->x0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, LC/v;

    move/from16 v18, v6

    invoke-virtual/range {v16 .. v16}, LC/v;->getIndex()I

    move-result v6

    move/from16 v16, v7

    add-int/lit8 v7, v14, -0x1

    if-eq v6, v7, :cond_d

    add-int/lit8 v6, v15, 0x1

    invoke-virtual {v4}, LC/x;->d()I

    move-result v4

    sub-int v17, v17, v4

    move v7, v6

    move/from16 v31, v30

    goto :goto_8

    :cond_c
    move/from16 v18, v6

    move/from16 v16, v7

    :cond_d
    invoke-virtual {v5, v4}, Lj7/m;->add(Ljava/lang/Object;)Z

    move/from16 v7, v16

    :goto_8
    add-int/lit8 v15, v15, 0x1

    move/from16 v4, p7

    move/from16 v6, v18

    goto :goto_5

    :goto_9
    if-ge v8, v13, :cond_10

    sub-int v4, v13, v8

    sub-int v17, v17, v4

    add-int/2addr v8, v4

    move/from16 v7, v16

    move/from16 v6, v17

    :goto_a
    if-ge v6, v1, :cond_e

    if-lez v7, :cond_e

    add-int/lit8 v7, v7, -0x1

    invoke-virtual {v0, v7}, LC/y;->c(I)LC/x;

    move-result-object v15

    move/from16 p7, v7

    const/4 v7, 0x0

    invoke-virtual {v5, v7, v15}, Lj7/m;->add(ILjava/lang/Object;)V

    invoke-virtual {v15}, LC/x;->d()I

    move-result v7

    add-int/2addr v6, v7

    move/from16 v7, p7

    goto :goto_a

    :cond_e
    add-int/2addr v3, v4

    if-gez v6, :cond_f

    add-int/2addr v3, v6

    add-int/2addr v8, v6

    move v15, v8

    const/4 v6, 0x0

    goto :goto_b

    :cond_f
    move v15, v8

    goto :goto_b

    :cond_10
    move v15, v8

    move/from16 v6, v17

    :goto_b
    invoke-static/range {p9 .. p9}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-static {v4}, LA7/a;->a(I)I

    move-result v4

    invoke-static {v3}, LA7/a;->a(I)I

    move-result v7

    if-ne v4, v7, :cond_11

    invoke-static/range {p9 .. p9}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v7

    if-lt v4, v7, :cond_11

    int-to-float v3, v3

    move v8, v3

    goto :goto_c

    :cond_11
    move/from16 v8, p9

    :goto_c
    if-ltz v6, :cond_2b

    neg-int v7, v6

    invoke-virtual {v5}, Lj7/m;->first()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC/x;

    invoke-virtual {v3}, LC/x;->b()[LC/v;

    move-result-object v4

    invoke-static {v4}, Lj7/n;->Z([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC/v;

    if-eqz v4, :cond_12

    invoke-virtual {v4}, LC/v;->getIndex()I

    move-result v4

    goto :goto_d

    :cond_12
    const/4 v4, 0x0

    :goto_d
    invoke-virtual {v5}, Lj7/m;->M()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, LC/x;

    if-eqz v16, :cond_13

    invoke-virtual/range {v16 .. v16}, LC/x;->b()[LC/v;

    move-result-object v16

    if-eqz v16, :cond_13

    invoke-static/range {v16 .. v16}, Lj7/n;->A0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, LC/v;

    if-eqz v16, :cond_13

    invoke-virtual/range {v16 .. v16}, LC/v;->getIndex()I

    move-result v16

    move-object/from16 p7, v3

    move/from16 v13, v16

    goto :goto_e

    :cond_13
    move-object/from16 p7, v3

    const/4 v13, 0x0

    :goto_e
    invoke-interface/range {p19 .. p19}, Ljava/util/List;->size()I

    move-result v3

    const/16 v16, 0x0

    move/from16 v17, v6

    move-object/from16 v18, v16

    const/4 v6, 0x0

    :goto_f
    if-ge v6, v3, :cond_16

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Ljava/lang/Number;

    move/from16 p9, v3

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-ltz v3, :cond_15

    if-ge v3, v4, :cond_15

    move/from16 v20, v4

    invoke-virtual {v0, v3}, LC/y;->d(I)I

    move-result v4

    move/from16 v27, v8

    const/4 v8, 0x0

    invoke-virtual {v0, v8, v4}, LC/y;->a(II)J

    move-result-wide v25

    const/16 v23, 0x0

    move-object/from16 v21, p2

    move/from16 v22, v3

    move/from16 v24, v4

    invoke-virtual/range {v21 .. v26}, LC/w;->c(IIIJ)LC/v;

    move-result-object v3

    if-nez v18, :cond_14

    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    :cond_14
    move-object/from16 v4, v18

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v18, v4

    goto :goto_10

    :cond_15
    move/from16 v20, v4

    move/from16 v27, v8

    :goto_10
    add-int/lit8 v6, v6, 0x1

    move/from16 v3, p9

    move/from16 v4, v20

    move/from16 v8, v27

    goto :goto_f

    :cond_16
    move/from16 v20, v4

    move/from16 v27, v8

    if-nez v18, :cond_17

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v18

    :cond_17
    move-object/from16 v32, v18

    invoke-interface/range {p19 .. p19}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_11
    if-ge v4, v3, :cond_1a

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    add-int/lit8 v8, v13, 0x1

    if-gt v8, v6, :cond_19

    if-ge v6, v14, :cond_19

    invoke-virtual {v0, v6}, LC/y;->d(I)I

    move-result v8

    move/from16 p9, v13

    const/4 v13, 0x0

    invoke-virtual {v0, v13, v8}, LC/y;->a(II)J

    move-result-wide v25

    const/16 v23, 0x0

    move-object/from16 v21, p2

    move/from16 v22, v6

    move/from16 v24, v8

    invoke-virtual/range {v21 .. v26}, LC/w;->c(IIIJ)LC/v;

    move-result-object v6

    if-nez v16, :cond_18

    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    :cond_18
    move-object/from16 v8, v16

    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v16, v8

    goto :goto_12

    :cond_19
    move/from16 p9, v13

    const/4 v13, 0x0

    :goto_12
    add-int/lit8 v4, v4, 0x1

    move/from16 v13, p9

    goto :goto_11

    :cond_1a
    move/from16 p9, v13

    const/4 v13, 0x0

    if-nez v16, :cond_1b

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v16

    :cond_1b
    move-object/from16 v33, v16

    if-gtz v1, :cond_1d

    if-gez p6, :cond_1c

    goto :goto_13

    :cond_1c
    move-object/from16 v34, p7

    move/from16 v35, v17

    goto :goto_15

    :cond_1d
    :goto_13
    invoke-virtual {v5}, Lj7/h;->size()I

    move-result v0

    move-object/from16 v3, p7

    move v1, v13

    move/from16 v6, v17

    :goto_14
    if-ge v1, v0, :cond_1e

    invoke-virtual {v5, v1}, Lj7/m;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LC/x;

    invoke-virtual {v2}, LC/x;->d()I

    move-result v2

    if-eqz v6, :cond_1e

    if-gt v2, v6, :cond_1e

    invoke-static {v5}, Lj7/v;->o(Ljava/util/List;)I

    move-result v4

    if-eq v1, v4, :cond_1e

    sub-int/2addr v6, v2

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v5, v1}, Lj7/m;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LC/x;

    goto :goto_14

    :cond_1e
    move-object/from16 v34, v3

    move/from16 v35, v6

    :goto_15
    if-eqz p12, :cond_1f

    invoke-static/range {p10 .. p11}, LY0/b;->l(J)I

    move-result v0

    :goto_16
    move v8, v0

    goto :goto_17

    :cond_1f
    invoke-static {v11, v12, v15}, LY0/c;->i(JI)I

    move-result v0

    goto :goto_16

    :goto_17
    if-eqz p12, :cond_20

    invoke-static {v11, v12, v15}, LY0/c;->h(JI)I

    move-result v0

    :goto_18
    move v6, v0

    goto :goto_19

    :cond_20
    invoke-static/range {p10 .. p11}, LY0/b;->k(J)I

    move-result v0

    goto :goto_18

    :goto_19
    move-object v0, v5

    move-object/from16 v1, v32

    move-object/from16 v2, v33

    move v3, v8

    move/from16 v5, v20

    move v4, v6

    move v13, v5

    move v5, v15

    move/from16 p1, v6

    move/from16 v6, p3

    move/from16 p4, v8

    move/from16 p7, v13

    move/from16 v36, v19

    move/from16 v13, v27

    move/from16 v8, p12

    move/from16 v37, v9

    move-object/from16 v9, p13

    move-object/from16 v10, p14

    move/from16 v11, p15

    move-object/from16 v12, p16

    invoke-static/range {v0 .. v12}, LC/t;->b(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLA/b$m;LA/b$e;ZLY0/e;)Ljava/util/List;

    move-result-object v0

    float-to-int v1, v13

    invoke-virtual/range {p2 .. p2}, LC/w;->e()Landroidx/compose/foundation/lazy/layout/c;

    move-result-object v20

    const/16 v23, 0x0

    const/16 v25, 0x0

    move v8, v15

    const/4 v2, 0x0

    move-object/from16 v15, p17

    move/from16 v16, v1

    move/from16 v17, p4

    move/from16 v18, p1

    move-object/from16 v19, v0

    move-object/from16 v21, p2

    move/from16 v22, p12

    move/from16 v24, p18

    move/from16 v26, v35

    move/from16 v27, v8

    move-object/from16 v28, p20

    move-object/from16 v29, p22

    invoke-virtual/range {v15 .. v29}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->l(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/c;LD/z;ZZIZIILW8/N;Lo0/C1;)V

    invoke-virtual/range {p17 .. p17}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h()J

    move-result-wide v3

    sget-object v1, LY0/t;->b:LY0/t$a;

    invoke-virtual {v1}, LY0/t$a;->a()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, LY0/t;->e(JJ)Z

    move-result v1

    if-nez v1, :cond_23

    if-eqz p12, :cond_21

    move/from16 v1, p1

    goto :goto_1a

    :cond_21
    move/from16 v1, p4

    :goto_1a
    invoke-static {v3, v4}, LY0/t;->g(J)I

    move-result v5

    move/from16 v6, p4

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    move-wide/from16 v6, p10

    invoke-static {v6, v7, v5}, LY0/c;->i(JI)I

    move-result v5

    invoke-static {v3, v4}, LY0/t;->f(J)I

    move-result v3

    move/from16 v4, p1

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v6, v7, v3}, LY0/c;->h(JI)I

    move-result v6

    if-eqz p12, :cond_22

    move v3, v6

    goto :goto_1b

    :cond_22
    move v3, v5

    :goto_1b
    if-eq v3, v1, :cond_24

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    move v15, v2

    :goto_1c
    if-ge v15, v1, :cond_24

    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC/v;

    invoke-virtual {v4, v3}, LC/v;->v(I)V

    add-int/lit8 v15, v15, 0x1

    goto :goto_1c

    :cond_23
    move/from16 v4, p1

    move/from16 v6, p4

    move v5, v6

    move v6, v4

    :cond_24
    add-int/lit8 v1, v14, -0x1

    move/from16 v3, p9

    if-ne v3, v1, :cond_26

    move/from16 v1, p3

    if-le v8, v1, :cond_25

    goto :goto_1d

    :cond_25
    move/from16 v30, v2

    :cond_26
    :goto_1d
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, LC/t$b;

    move-object/from16 v6, p21

    invoke-direct {v5, v0, v6}, LC/t$b;-><init>(Ljava/util/List;LV/w0;)V

    move-object/from16 v6, p24

    invoke-interface {v6, v1, v4, v5}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, LD0/K;

    invoke-interface/range {v32 .. v32}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_27

    invoke-interface/range {v33 .. v33}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_27

    move-object v11, v0

    goto :goto_1f

    :cond_27
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    move v15, v2

    :goto_1e
    if-ge v15, v4, :cond_29

    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, LC/v;

    invoke-virtual {v6}, LC/v;->getIndex()I

    move-result v6

    move/from16 v7, p7

    if-gt v7, v6, :cond_28

    if-gt v6, v3, :cond_28

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_28
    add-int/lit8 v15, v15, 0x1

    move/from16 p7, v7

    goto :goto_1e

    :cond_29
    move-object v11, v1

    :goto_1f
    if-eqz p12, :cond_2a

    sget-object v0, Lx/s;->C:Lx/s;

    :goto_20
    move-object/from16 v16, v0

    goto :goto_21

    :cond_2a
    sget-object v0, Lx/s;->D:Lx/s;

    goto :goto_20

    :goto_21
    new-instance v19, LC/u;

    move-object/from16 v0, v19

    move-object/from16 v1, v34

    move/from16 v2, v35

    move/from16 v3, v30

    move v4, v13

    move/from16 v6, v31

    move-object/from16 v7, p20

    move-object/from16 v8, p16

    move/from16 v9, p18

    move-object/from16 v10, p23

    move/from16 v12, v37

    move/from16 v13, v36

    move/from16 v14, p0

    move/from16 v15, p15

    move/from16 v17, p5

    move/from16 v18, p6

    invoke-direct/range {v0 .. v18}, LC/u;-><init>(LC/x;IZFLD0/K;ZLW8/N;LY0/e;ILx7/l;Ljava/util/List;IIIZLx/s;II)V

    return-object v19

    :cond_2b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "negative initial offset"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "negative afterContentPadding"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "negative beforeContentPadding"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
