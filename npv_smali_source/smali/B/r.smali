.class public abstract LB/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLA/b$m;LA/b$e;ZLY0/e;)Ljava/util/List;
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

    const-string v1, "non-zero itemsScrollOffset"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_2
    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v9

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v10

    add-int/2addr v9, v10

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v10

    add-int/2addr v9, v10

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz v5, :cond_e

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v5

    new-array v9, v5, [I

    move v10, v7

    :goto_3
    if-ge v10, v5, :cond_4

    invoke-static {v10, v4, v5}, LB/r;->b(IZI)I

    move-result v11

    invoke-interface {p0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LB/t;

    invoke-virtual {v11}, LB/t;->a()I

    move-result v11

    aput v11, v9, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_4
    new-array v10, v5, [I

    move v11, v7

    :goto_4
    if-ge v11, v5, :cond_5

    aput v7, v10, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    :cond_5
    if-eqz p8, :cond_7

    if-eqz v3, :cond_6

    move-object/from16 v7, p12

    invoke-interface {v3, v7, v6, v9, v10}, LA/b$m;->b(LY0/e;I[I[I)V

    goto :goto_5

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null verticalArrangement when isVertical == true"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    move-object/from16 v7, p12

    if-eqz p10, :cond_c

    sget-object v3, LY0/v;->C:LY0/v;

    move-object/from16 p5, p10

    move-object/from16 p6, p12

    move/from16 p7, v6

    move-object/from16 p8, v9

    move-object/from16 p9, v3

    move-object/from16 p10, v10

    invoke-interface/range {p5 .. p10}, LA/b$e;->c(LY0/e;I[ILY0/v;[I)V

    :goto_5
    invoke-static {v10}, Lj7/n;->a0([I)LE7/i;

    move-result-object v3

    if-nez v4, :cond_8

    goto :goto_6

    :cond_8
    invoke-static {v3}, LE7/j;->o(LE7/g;)LE7/g;

    move-result-object v3

    :goto_6
    invoke-virtual {v3}, LE7/g;->f()I

    move-result v7

    invoke-virtual {v3}, LE7/g;->g()I

    move-result v9

    invoke-virtual {v3}, LE7/g;->o()I

    move-result v3

    if-lez v3, :cond_9

    if-le v7, v9, :cond_a

    :cond_9
    if-gez v3, :cond_11

    if-gt v9, v7, :cond_11

    :cond_a
    :goto_7
    aget v11, v10, v7

    invoke-static {v7, v4, v5}, LB/r;->b(IZI)I

    move-result v12

    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LB/t;

    if-eqz v4, :cond_b

    sub-int v11, v6, v11

    invoke-virtual {v12}, LB/t;->a()I

    move-result v13

    sub-int/2addr v11, v13

    :cond_b
    invoke-virtual {v12, v11, v1, v2}, LB/t;->s(III)V

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eq v7, v9, :cond_11

    add-int/2addr v7, v3

    goto :goto_7

    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null horizontalArrangement when isVertical == false"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "no extra items"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    move/from16 v5, p7

    move v4, v7

    :goto_8
    if-ge v4, v3, :cond_f

    move-object v6, p1

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LB/t;

    invoke-virtual {v9}, LB/t;->e()I

    move-result v10

    sub-int/2addr v5, v10

    invoke-virtual {v9, v5, v1, v2}, LB/t;->s(III)V

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_f
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    move/from16 v4, p7

    move v5, v7

    :goto_9
    if-ge v5, v3, :cond_10

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LB/t;

    invoke-virtual {v6, v4, v1, v2}, LB/t;->s(III)V

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, LB/t;->e()I

    move-result v6

    add-int/2addr v4, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_10
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    :goto_a
    if-ge v7, v0, :cond_11

    move-object/from16 v3, p2

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LB/t;

    invoke-virtual {v5, v4, v1, v2}, LB/t;->s(III)V

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, LB/t;->e()I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v7, v7, 0x1

    goto :goto_a

    :cond_11
    return-object v8
.end method

.method private static final b(IZI)I
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

.method private static final c(Ljava/util/List;LB/u;IILjava/util/List;FZLB/q;)Ljava/util/List;
    .locals 18

    .prologue
    move/from16 v0, p2

    invoke-static/range {p0 .. p0}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB/t;

    invoke-virtual {v1}, LB/t;->getIndex()I

    move-result v1

    add-int v1, v1, p3

    add-int/lit8 v2, v0, -0x1

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static/range {p0 .. p0}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LB/t;

    invoke-virtual {v3}, LB/t;->getIndex()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    const/4 v4, 0x0

    if-gt v3, v1, :cond_1

    move-object v5, v4

    :goto_0
    if-nez v5, :cond_0

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    move-object v11, v5

    const/4 v9, 0x2

    const/4 v10, 0x0

    const-wide/16 v7, 0x0

    move-object/from16 v5, p1

    move v6, v3

    invoke-static/range {v5 .. v10}, LB/u;->e(LB/u;IJILjava/lang/Object;)LB/t;

    move-result-object v5

    invoke-interface {v11, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v3, v1, :cond_2

    add-int/lit8 v3, v3, 0x1

    move-object v5, v11

    goto :goto_0

    :cond_1
    move-object v11, v4

    :cond_2
    const/4 v3, 0x0

    if-eqz p6, :cond_13

    if-eqz p7, :cond_13

    invoke-interface/range {p7 .. p7}, LB/q;->j()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_13

    invoke-interface/range {p7 .. p7}, LB/q;->j()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    :goto_1
    const/4 v7, -0x1

    if-ge v7, v6, :cond_5

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LB/l;

    invoke-interface {v7}, LB/l;->getIndex()I

    move-result v7

    if-le v7, v1, :cond_4

    if-eqz v6, :cond_3

    add-int/lit8 v7, v6, -0x1

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LB/l;

    invoke-interface {v7}, LB/l;->getIndex()I

    move-result v7

    if-gt v7, v1, :cond_4

    :cond_3
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LB/l;

    goto :goto_2

    :cond_4
    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    :cond_5
    move-object v5, v4

    :goto_2
    invoke-interface/range {p7 .. p7}, LB/q;->j()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LB/l;

    if-eqz v5, :cond_b

    invoke-interface {v5}, LB/l;->getIndex()I

    move-result v5

    invoke-interface {v6}, LB/l;->getIndex()I

    move-result v7

    invoke-static {v7, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-gt v5, v2, :cond_b

    :goto_3
    if-eqz v11, :cond_8

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v7

    move v8, v3

    :goto_4
    if-ge v8, v7, :cond_7

    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, LB/t;

    invoke-virtual {v10}, LB/t;->getIndex()I

    move-result v10

    if-ne v10, v5, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_7
    move-object v9, v4

    :goto_5
    check-cast v9, LB/t;

    goto :goto_6

    :cond_8
    move-object v9, v4

    :goto_6
    if-nez v9, :cond_a

    if-nez v11, :cond_9

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    :cond_9
    const/16 v16, 0x2

    const/16 v17, 0x0

    const-wide/16 v14, 0x0

    move-object/from16 v12, p1

    move v13, v5

    invoke-static/range {v12 .. v17}, LB/u;->e(LB/u;IJILjava/lang/Object;)LB/t;

    move-result-object v7

    invoke-interface {v11, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_a
    if-eq v5, v2, :cond_b

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_b
    invoke-interface/range {p7 .. p7}, LB/q;->c()I

    move-result v2

    invoke-interface {v6}, LB/l;->c()I

    move-result v5

    sub-int/2addr v2, v5

    invoke-interface {v6}, LB/l;->a()I

    move-result v5

    sub-int/2addr v2, v5

    int-to-float v2, v2

    sub-float v2, v2, p5

    const/4 v5, 0x0

    cmpl-float v5, v2, v5

    if-lez v5, :cond_13

    invoke-interface {v6}, LB/l;->getIndex()I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    move v6, v3

    :goto_7
    if-ge v5, v0, :cond_13

    int-to-float v7, v6

    cmpg-float v7, v7, v2

    if-gez v7, :cond_13

    if-gt v5, v1, :cond_e

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v7

    move v8, v3

    :goto_8
    move-object/from16 v9, p0

    if-ge v8, v7, :cond_d

    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, LB/t;

    invoke-virtual {v12}, LB/t;->getIndex()I

    move-result v12

    if-ne v12, v5, :cond_c

    goto :goto_9

    :cond_c
    add-int/lit8 v8, v8, 0x1

    goto :goto_8

    :cond_d
    move-object v10, v4

    :goto_9
    check-cast v10, LB/t;

    goto :goto_b

    :cond_e
    move-object/from16 v9, p0

    if-eqz v11, :cond_10

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v7

    move v8, v3

    :goto_a
    if-ge v8, v7, :cond_d

    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, LB/t;

    invoke-virtual {v12}, LB/t;->getIndex()I

    move-result v12

    if-ne v12, v5, :cond_f

    goto :goto_9

    :cond_f
    add-int/lit8 v8, v8, 0x1

    goto :goto_a

    :cond_10
    move-object v10, v4

    :goto_b
    if-eqz v10, :cond_11

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v10}, LB/t;->e()I

    move-result v7

    :goto_c
    add-int/2addr v6, v7

    goto :goto_7

    :cond_11
    if-nez v11, :cond_12

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    :cond_12
    const/16 v16, 0x2

    const/16 v17, 0x0

    const-wide/16 v14, 0x0

    move-object/from16 v12, p1

    move v13, v5

    invoke-static/range {v12 .. v17}, LB/u;->e(LB/u;IJILjava/lang/Object;)LB/t;

    move-result-object v7

    invoke-interface {v11, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    invoke-static {v11}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LB/t;

    invoke-virtual {v7}, LB/t;->e()I

    move-result v7

    goto :goto_c

    :cond_13
    if-eqz v11, :cond_14

    invoke-static {v11}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LB/t;

    invoke-virtual {v0}, LB/t;->getIndex()I

    move-result v0

    if-le v0, v1, :cond_14

    invoke-static {v11}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LB/t;

    invoke-virtual {v0}, LB/t;->getIndex()I

    move-result v1

    :cond_14
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    move-result v0

    :goto_d
    if-ge v3, v0, :cond_17

    move-object/from16 v2, p4

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v6

    if-le v6, v1, :cond_16

    if-nez v11, :cond_15

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    :cond_15
    const/4 v9, 0x2

    const/4 v10, 0x0

    const-wide/16 v7, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v10}, LB/u;->e(LB/u;IJILjava/lang/Object;)LB/t;

    move-result-object v4

    invoke-interface {v11, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_16
    add-int/lit8 v3, v3, 0x1

    goto :goto_d

    :cond_17
    if-nez v11, :cond_18

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v11

    :cond_18
    return-object v11
.end method

.method private static final d(ILB/u;ILjava/util/List;)Ljava/util/List;
    .locals 8

    .prologue
    const/4 v0, 0x0

    sub-int p2, p0, p2

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    add-int/lit8 p0, p0, -0x1

    const/4 v0, 0x0

    if-gt p2, p0, :cond_1

    :goto_0
    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    move-object v1, p1

    move v2, p0

    invoke-static/range {v1 .. v6}, LB/u;->e(LB/u;IJILjava/lang/Object;)LB/t;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq p0, p2, :cond_1

    add-int/lit8 p0, p0, -0x1

    goto :goto_0

    :cond_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    if-ltz p0, :cond_5

    :goto_1
    add-int/lit8 v1, p0, -0x1

    invoke-interface {p3, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-ge v3, p2, :cond_3

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    const/4 v6, 0x2

    const/4 v7, 0x0

    const-wide/16 v4, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, LB/u;->e(LB/u;IJILjava/lang/Object;)LB/t;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    if-gez v1, :cond_4

    goto :goto_2

    :cond_4
    move p0, v1

    goto :goto_1

    :cond_5
    :goto_2
    if-nez v0, :cond_6

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    :cond_6
    return-object v0
.end method

.method public static final e(ILB/u;IIIIIIFJZLjava/util/List;LA/b$m;LA/b$e;ZLY0/e;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLB/q;LW8/N;LV/w0;Lo0/C1;Lx7/q;)LB/s;
    .locals 40

    .prologue
    move/from16 v15, p0

    move/from16 v13, p2

    move/from16 v14, p3

    move-wide/from16 v11, p9

    move/from16 v10, p21

    move-object/from16 v9, p26

    if-ltz v14, :cond_2b

    if-ltz p4, :cond_2a

    if-gtz v15, :cond_2

    invoke-static/range {p9 .. p10}, LY0/b;->n(J)I

    move-result v0

    invoke-static/range {p9 .. p10}, LY0/b;->m(J)I

    move-result v1

    new-instance v19, Ljava/util/ArrayList;

    invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p1 .. p1}, LB/u;->g()Landroidx/compose/foundation/lazy/layout/c;

    move-result-object v20

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v16, 0x0

    const/16 v24, 0x1

    move-object/from16 v15, p17

    move/from16 v17, v0

    move/from16 v18, v1

    move-object/from16 v21, p1

    move/from16 v22, p11

    move/from16 v23, p21

    move/from16 v25, p20

    move-object/from16 v28, p23

    move-object/from16 v29, p25

    invoke-virtual/range {v15 .. v29}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->l(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/c;LD/z;ZZIZIILW8/N;Lo0/C1;)V

    if-nez v10, :cond_0

    invoke-virtual/range {p17 .. p17}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h()J

    move-result-wide v2

    sget-object v4, LY0/t;->b:LY0/t$a;

    invoke-virtual {v4}, LY0/t$a;->a()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LY0/t;->e(JJ)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v2, v3}, LY0/t;->g(J)I

    move-result v0

    invoke-static {v11, v12, v0}, LY0/c;->i(JI)I

    move-result v0

    invoke-static {v2, v3}, LY0/t;->f(J)I

    move-result v1

    invoke-static {v11, v12, v1}, LY0/c;->h(JI)I

    move-result v1

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, LB/r$a;->D:LB/r$a;

    invoke-interface {v9, v0, v1, v2}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LD0/K;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v12

    neg-int v14, v14

    add-int v16, v13, p4

    if-eqz p11, :cond_1

    sget-object v0, Lx/s;->C:Lx/s;

    :goto_0
    move-object/from16 v17, v0

    goto :goto_1

    :cond_1
    sget-object v0, Lx/s;->D:Lx/s;

    goto :goto_0

    :goto_1
    invoke-virtual/range {p1 .. p1}, LB/u;->f()J

    move-result-wide v10

    new-instance v21, LB/s;

    move-object/from16 v0, v21

    const/4 v15, 0x0

    const/16 v20, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, p23

    move-object/from16 v9, p16

    move v13, v14

    move/from16 v14, v16

    move/from16 v16, p15

    move/from16 v18, p4

    move/from16 v19, p5

    invoke-direct/range {v0 .. v20}, LB/s;-><init>(LB/t;IZFLD0/K;FZLW8/N;LY0/e;JLjava/util/List;IIIZLx/s;IILy7/k;)V

    return-object v21

    :cond_2
    const/4 v8, 0x0

    move/from16 v0, p6

    if-lt v0, v15, :cond_3

    add-int/lit8 v0, v15, -0x1

    move v1, v8

    goto :goto_2

    :cond_3
    move/from16 v1, p7

    :goto_2
    invoke-static/range {p8 .. p8}, Ljava/lang/Math;->round(F)I

    move-result v2

    sub-int/2addr v1, v2

    if-nez v0, :cond_4

    if-gez v1, :cond_4

    add-int/2addr v2, v1

    move v1, v8

    :cond_4
    new-instance v7, Lj7/m;

    invoke-direct {v7}, Lj7/m;-><init>()V

    neg-int v6, v14

    if-gez p5, :cond_5

    move/from16 v3, p5

    goto :goto_3

    :cond_5
    move v3, v8

    :goto_3
    add-int/2addr v3, v6

    add-int/2addr v1, v3

    move v4, v8

    :goto_4
    if-gez v1, :cond_6

    if-lez v0, :cond_6

    add-int/lit8 v0, v0, -0x1

    const/16 v20, 0x2

    const/16 v21, 0x0

    const-wide/16 v18, 0x0

    move-object/from16 v16, p1

    move/from16 v17, v0

    invoke-static/range {v16 .. v21}, LB/u;->e(LB/u;IJILjava/lang/Object;)LB/t;

    move-result-object v5

    invoke-virtual {v7, v8, v5}, Lj7/m;->add(ILjava/lang/Object;)V

    invoke-virtual {v5}, LB/t;->m()I

    move-result v8

    invoke-static {v4, v8}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {v5}, LB/t;->e()I

    move-result v5

    add-int/2addr v1, v5

    const/4 v8, 0x0

    goto :goto_4

    :cond_6
    if-ge v1, v3, :cond_7

    add-int/2addr v2, v1

    move v1, v3

    :cond_7
    sub-int/2addr v1, v3

    add-int v8, v13, p4

    move/from16 p6, v0

    const/4 v5, 0x0

    invoke-static {v8, v5}, LE7/j;->d(II)I

    move-result v0

    neg-int v5, v1

    move/from16 v18, p6

    move/from16 p7, v1

    move/from16 v19, v4

    move v1, v5

    const/4 v5, 0x0

    const/16 v17, 0x0

    :goto_5
    invoke-virtual {v7}, Lj7/h;->size()I

    move-result v4

    const/16 v31, 0x1

    if-ge v5, v4, :cond_9

    if-lt v1, v0, :cond_8

    invoke-virtual {v7, v5}, Lj7/h;->remove(I)Ljava/lang/Object;

    move/from16 v17, v31

    goto :goto_5

    :cond_8
    add-int/lit8 v18, v18, 0x1

    invoke-virtual {v7, v5}, Lj7/m;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LB/t;

    invoke-virtual {v4}, LB/t;->e()I

    move-result v4

    add-int/2addr v1, v4

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_9
    move/from16 v5, p7

    move v4, v1

    move/from16 v32, v17

    move/from16 v9, v18

    move/from16 v1, v19

    :goto_6
    if-ge v9, v15, :cond_d

    if-lt v4, v0, :cond_a

    if-lez v4, :cond_a

    invoke-virtual {v7}, Lj7/m;->isEmpty()Z

    move-result v17

    if-eqz v17, :cond_d

    :cond_a
    const/16 v21, 0x2

    const/16 v22, 0x0

    const-wide/16 v19, 0x0

    move-object/from16 v17, p1

    move/from16 v18, v9

    move/from16 p7, v0

    invoke-static/range {v17 .. v22}, LB/u;->e(LB/u;IJILjava/lang/Object;)LB/t;

    move-result-object v0

    invoke-virtual {v0}, LB/t;->e()I

    move-result v17

    add-int v4, v4, v17

    if-gt v4, v3, :cond_b

    move/from16 v17, v3

    add-int/lit8 v3, v15, -0x1

    if-eq v9, v3, :cond_c

    add-int/lit8 v3, v9, 0x1

    invoke-virtual {v0}, LB/t;->e()I

    move-result v0

    sub-int/2addr v5, v0

    move/from16 v32, v31

    goto :goto_7

    :cond_b
    move/from16 v17, v3

    :cond_c
    invoke-virtual {v0}, LB/t;->m()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v7, v0}, Lj7/m;->add(Ljava/lang/Object;)Z

    move/from16 v3, p6

    :goto_7
    add-int/lit8 v9, v9, 0x1

    move/from16 v0, p7

    move/from16 p6, v3

    move/from16 v3, v17

    goto :goto_6

    :cond_d
    if-ge v4, v13, :cond_10

    sub-int v0, v13, v4

    sub-int/2addr v5, v0

    add-int/2addr v4, v0

    move v3, v1

    move/from16 v1, p6

    :goto_8
    if-ge v5, v14, :cond_e

    if-lez v1, :cond_e

    add-int/lit8 v1, v1, -0x1

    const/16 v21, 0x2

    const/16 v22, 0x0

    const-wide/16 v19, 0x0

    move-object/from16 v17, p1

    move/from16 v18, v1

    move/from16 p6, v1

    invoke-static/range {v17 .. v22}, LB/u;->e(LB/u;IJILjava/lang/Object;)LB/t;

    move-result-object v1

    move/from16 p7, v8

    const/4 v8, 0x0

    invoke-virtual {v7, v8, v1}, Lj7/m;->add(ILjava/lang/Object;)V

    invoke-virtual {v1}, LB/t;->m()I

    move-result v8

    invoke-static {v3, v8}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {v1}, LB/t;->e()I

    move-result v1

    add-int/2addr v5, v1

    move/from16 v1, p6

    move/from16 v8, p7

    goto :goto_8

    :cond_e
    move/from16 p7, v8

    add-int/2addr v0, v2

    if-gez v5, :cond_f

    add-int/2addr v0, v5

    add-int/2addr v4, v5

    move v8, v4

    const/4 v5, 0x0

    goto :goto_9

    :cond_f
    move v8, v4

    goto :goto_9

    :cond_10
    move/from16 p7, v8

    move v3, v1

    move v0, v2

    move v8, v4

    move/from16 v1, p6

    :goto_9
    invoke-static/range {p8 .. p8}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-static {v4}, LA7/a;->a(I)I

    move-result v4

    move/from16 p6, v3

    invoke-static {v0}, LA7/a;->a(I)I

    move-result v3

    if-ne v4, v3, :cond_11

    invoke-static/range {p8 .. p8}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v4

    if-lt v3, v4, :cond_11

    int-to-float v3, v0

    move v4, v3

    goto :goto_a

    :cond_11
    move/from16 v4, p8

    :goto_a
    sub-float v3, p8, v4

    const/16 v17, 0x0

    if-eqz v10, :cond_12

    if-le v0, v2, :cond_12

    cmpg-float v18, v3, v17

    if-gtz v18, :cond_12

    sub-int/2addr v0, v2

    int-to-float v0, v0

    add-float/2addr v0, v3

    move/from16 v33, v0

    goto :goto_b

    :cond_12
    move/from16 v33, v17

    :goto_b
    if-ltz v5, :cond_29

    neg-int v3, v5

    invoke-virtual {v7}, Lj7/m;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LB/t;

    if-gtz v14, :cond_14

    if-gez p5, :cond_13

    goto :goto_d

    :cond_13
    move/from16 v2, p18

    move/from16 v17, v3

    move/from16 v34, v5

    move-object/from16 v3, p1

    move-object v5, v0

    :goto_c
    move-object/from16 v0, p19

    goto :goto_f

    :cond_14
    :goto_d
    invoke-virtual {v7}, Lj7/h;->size()I

    move-result v2

    move-object/from16 p8, v0

    move v0, v5

    const/4 v5, 0x0

    :goto_e
    if-ge v5, v2, :cond_15

    invoke-virtual {v7, v5}, Lj7/m;->get(I)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, LB/t;

    move/from16 v18, v2

    invoke-virtual/range {v17 .. v17}, LB/t;->e()I

    move-result v2

    if-eqz v0, :cond_15

    if-gt v2, v0, :cond_15

    move/from16 v17, v3

    invoke-static {v7}, Lj7/v;->o(Ljava/util/List;)I

    move-result v3

    if-eq v5, v3, :cond_16

    sub-int/2addr v0, v2

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v7, v5}, Lj7/m;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LB/t;

    move-object/from16 p8, v2

    move/from16 v3, v17

    move/from16 v2, v18

    goto :goto_e

    :cond_15
    move/from16 v17, v3

    :cond_16
    move-object/from16 v3, p1

    move-object/from16 v5, p8

    move/from16 v2, p18

    move/from16 v34, v0

    goto :goto_c

    :goto_f
    invoke-static {v1, v3, v2, v0}, LB/r;->d(ILB/u;ILjava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v18, v9

    const/4 v2, 0x0

    move/from16 v9, p6

    :goto_10
    if-ge v2, v0, :cond_17

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, LB/t;

    move/from16 p6, v0

    invoke-virtual/range {v19 .. v19}, LB/t;->m()I

    move-result v0

    invoke-static {v9, v0}, Ljava/lang/Math;->max(II)I

    move-result v9

    add-int/lit8 v2, v2, 0x1

    move/from16 v0, p6

    goto :goto_10

    :cond_17
    move-object v0, v7

    move-object/from16 v19, v1

    move-object/from16 v1, p1

    move/from16 v2, p0

    move/from16 v3, p18

    move/from16 p6, v4

    move-object/from16 v4, p19

    move-object v14, v5

    move/from16 v5, p6

    move/from16 v35, v6

    move/from16 v6, p21

    move-object/from16 v36, v7

    move-object/from16 v7, p22

    invoke-static/range {v0 .. v7}, LB/r;->c(Ljava/util/List;LB/u;IILjava/util/List;FZLB/q;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v5, 0x0

    :goto_11
    if-ge v5, v0, :cond_18

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB/t;

    invoke-virtual {v1}, LB/t;->m()I

    move-result v1

    invoke-static {v9, v1}, Ljava/lang/Math;->max(II)I

    move-result v9

    add-int/lit8 v5, v5, 0x1

    goto :goto_11

    :cond_18
    invoke-virtual/range {v36 .. v36}, Lj7/m;->first()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v14, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-interface/range {v19 .. v19}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_19

    move/from16 v37, v31

    goto :goto_12

    :cond_19
    const/16 v37, 0x0

    :goto_12
    if-eqz p11, :cond_1a

    move v0, v9

    goto :goto_13

    :cond_1a
    move v0, v8

    :goto_13
    invoke-static {v11, v12, v0}, LY0/c;->i(JI)I

    move-result v7

    if-eqz p11, :cond_1b

    move v9, v8

    :cond_1b
    invoke-static {v11, v12, v9}, LY0/c;->h(JI)I

    move-result v9

    move-object/from16 v0, v36

    move-object/from16 v1, v19

    move v3, v7

    move v4, v9

    move v5, v8

    move/from16 v6, p2

    move/from16 p8, v7

    move/from16 v7, v17

    move/from16 v39, p7

    move/from16 p7, v8

    const/16 v38, 0x0

    move/from16 v8, p11

    move/from16 p18, v9

    move-object/from16 p19, v14

    move/from16 v14, v18

    move-object/from16 v9, p13

    move v13, v10

    move-object/from16 v10, p14

    move/from16 p22, v14

    move-wide v14, v11

    move/from16 v11, p15

    move-object/from16 v12, p16

    invoke-static/range {v0 .. v12}, LB/r;->a(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLA/b$m;LA/b$e;ZLY0/e;)Ljava/util/List;

    move-result-object v6

    move/from16 v7, p6

    float-to-int v0, v7

    invoke-virtual/range {p1 .. p1}, LB/u;->g()Landroidx/compose/foundation/lazy/layout/c;

    move-result-object v21

    const/16 v25, 0x1

    move-object/from16 v16, p17

    move/from16 v17, v0

    move/from16 v18, p8

    move/from16 v19, p18

    move-object/from16 v20, v6

    move-object/from16 v22, p1

    move/from16 v23, p11

    move/from16 v24, p21

    move/from16 v26, p20

    move/from16 v27, v34

    move/from16 v28, p7

    move-object/from16 v29, p23

    move-object/from16 v30, p25

    invoke-virtual/range {v16 .. v30}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->l(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/c;LD/z;ZZIZIILW8/N;Lo0/C1;)V

    if-nez v13, :cond_1f

    invoke-virtual/range {p17 .. p17}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h()J

    move-result-wide v0

    sget-object v2, LY0/t;->b:LY0/t$a;

    invoke-virtual {v2}, LY0/t$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/t;->e(JJ)Z

    move-result v2

    if-nez v2, :cond_1f

    if-eqz p11, :cond_1c

    move/from16 v2, p18

    goto :goto_14

    :cond_1c
    move/from16 v2, p8

    :goto_14
    invoke-static {v0, v1}, LY0/t;->g(J)I

    move-result v3

    move/from16 v4, p8

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v14, v15, v3}, LY0/c;->i(JI)I

    move-result v3

    invoke-static {v0, v1}, LY0/t;->f(J)I

    move-result v0

    move/from16 v1, p18

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v14, v15, v0}, LY0/c;->h(JI)I

    move-result v9

    if-eqz p11, :cond_1d

    move v0, v9

    goto :goto_15

    :cond_1d
    move v0, v3

    :goto_15
    if-eq v0, v2, :cond_1e

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    move/from16 v8, v38

    :goto_16
    if-ge v8, v1, :cond_1e

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LB/t;

    invoke-virtual {v2, v0}, LB/t;->t(I)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_16

    :cond_1e
    move v8, v3

    goto :goto_17

    :cond_1f
    move/from16 v4, p8

    move/from16 v1, p18

    move v9, v1

    move v8, v4

    :goto_17
    move-object/from16 v0, p12

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_20

    move-object v0, v6

    move-object/from16 v1, p1

    move-object/from16 v2, p12

    move/from16 v3, p3

    move v4, v8

    move v5, v9

    invoke-static/range {v0 .. v5}, LB/i;->a(Ljava/util/List;LB/u;Ljava/util/List;III)LB/t;

    move-result-object v0

    :goto_18
    move/from16 v15, p0

    move/from16 v1, p22

    goto :goto_19

    :cond_20
    const/4 v0, 0x0

    goto :goto_18

    :goto_19
    if-lt v1, v15, :cond_22

    move/from16 v1, p2

    move/from16 v4, p7

    move v2, v13

    if-le v4, v1, :cond_21

    goto :goto_1a

    :cond_21
    move/from16 v3, v38

    goto :goto_1b

    :cond_22
    move v2, v13

    :goto_1a
    move/from16 v3, v31

    :goto_1b
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, LB/r$b;

    move-object/from16 v8, p24

    invoke-direct {v5, v6, v0, v2, v8}, LB/r$b;-><init>(Ljava/util/List;LB/t;ZLV/w0;)V

    move-object/from16 v2, p26

    invoke-interface {v2, v1, v4, v5}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, LD0/K;

    if-eqz v37, :cond_23

    move-object v12, v6

    goto :goto_1d

    :cond_23
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    move/from16 v8, v38

    :goto_1c
    if-ge v8, v2, :cond_27

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, LB/t;

    invoke-virtual {v9}, LB/t;->getIndex()I

    move-result v10

    invoke-virtual/range {v36 .. v36}, Lj7/m;->first()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LB/t;

    invoke-virtual {v11}, LB/t;->getIndex()I

    move-result v11

    if-lt v10, v11, :cond_24

    invoke-virtual {v9}, LB/t;->getIndex()I

    move-result v10

    invoke-virtual/range {v36 .. v36}, Lj7/m;->last()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LB/t;

    invoke-virtual {v11}, LB/t;->getIndex()I

    move-result v11

    if-le v10, v11, :cond_25

    :cond_24
    if-ne v9, v0, :cond_26

    :cond_25
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_26
    add-int/lit8 v8, v8, 0x1

    goto :goto_1c

    :cond_27
    move-object v12, v1

    :goto_1d
    if-eqz p11, :cond_28

    sget-object v0, Lx/s;->C:Lx/s;

    :goto_1e
    move-object/from16 v17, v0

    goto :goto_1f

    :cond_28
    sget-object v0, Lx/s;->D:Lx/s;

    goto :goto_1e

    :goto_1f
    invoke-virtual/range {p1 .. p1}, LB/u;->f()J

    move-result-wide v10

    new-instance v21, LB/s;

    move-object/from16 v0, v21

    const/16 v20, 0x0

    move-object/from16 v1, p19

    move/from16 v2, v34

    move v4, v7

    move/from16 v6, v33

    move/from16 v7, v32

    move-object/from16 v8, p23

    move-object/from16 v9, p16

    move/from16 v13, v35

    move/from16 v14, v39

    move/from16 v15, p0

    move/from16 v16, p15

    move/from16 v18, p4

    move/from16 v19, p5

    invoke-direct/range {v0 .. v20}, LB/s;-><init>(LB/t;IZFLD0/K;FZLW8/N;LY0/e;JLjava/util/List;IIIZLx/s;IILy7/k;)V

    return-object v21

    :cond_29
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "negative currentFirstItemScrollOffset"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid afterContentPadding"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid beforeContentPadding"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
