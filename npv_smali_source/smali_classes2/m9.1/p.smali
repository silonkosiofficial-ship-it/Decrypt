.class public abstract Lm9/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(IILm9/a;Ljava/lang/String;)Lm9/q;
    .locals 18

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    const-string v0, "setter"

    invoke-static {v6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {v7, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Lm9/q;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v9

    new-instance v10, Lm9/q;

    new-instance v0, Lm9/h;

    new-instance v1, Lm9/s;

    move/from16 v2, p0

    move/from16 v3, p1

    invoke-direct {v1, v2, v6, v7, v3}, Lm9/s;-><init>(ILm9/a;Ljava/lang/String;I)V

    invoke-static {v1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lm9/h;-><init>(Ljava/util/List;)V

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    invoke-direct {v10, v0, v1}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    new-instance v11, Lm9/q;

    new-instance v12, Lm9/r;

    const-string v0, "+"

    invoke-direct {v12, v0}, Lm9/r;-><init>(Ljava/lang/String;)V

    new-instance v13, Lm9/h;

    new-instance v14, Lm9/w;

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, v14

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v5}, Lm9/w;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lm9/a;Ljava/lang/String;Z)V

    invoke-static {v14}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v13, v0}, Lm9/h;-><init>(Ljava/util/List;)V

    const/4 v14, 0x2

    new-array v0, v14, [Lm9/o;

    const/4 v15, 0x0

    aput-object v12, v0, v15

    const/4 v12, 0x1

    aput-object v13, v0, v12

    invoke-static {v0}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    invoke-direct {v11, v0, v1}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    new-instance v13, Lm9/q;

    new-instance v5, Lm9/r;

    const-string v0, "-"

    invoke-direct {v5, v0}, Lm9/r;-><init>(Ljava/lang/String;)V

    new-instance v4, Lm9/h;

    new-instance v16, Lm9/w;

    const/16 v17, 0x1

    const/4 v1, 0x0

    move-object/from16 v0, v16

    move-object v6, v4

    move-object/from16 v4, p3

    move-object v7, v5

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lm9/w;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lm9/a;Ljava/lang/String;Z)V

    invoke-static/range {v16 .. v16}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v6, v0}, Lm9/h;-><init>(Ljava/util/List;)V

    new-array v0, v14, [Lm9/o;

    aput-object v7, v0, v15

    aput-object v6, v0, v12

    invoke-static {v0}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    invoke-direct {v13, v0, v1}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    const/4 v0, 0x3

    new-array v0, v0, [Lm9/q;

    aput-object v10, v0, v15

    aput-object v11, v0, v12

    aput-object v13, v0, v14

    invoke-static {v0}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v8, v9, v0}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v8
.end method

.method public static final b(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lm9/a;Ljava/lang/String;Ljava/lang/Integer;)Lm9/q;
    .locals 15

    .prologue
    const-string v0, "setter"

    move-object/from16 v9, p3

    invoke-static {v9, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v10, p4

    invoke-static {v10, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x1

    move-object v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-static/range {v1 .. v6}, Lm9/p;->e(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lm9/a;Ljava/lang/String;Z)Lm9/q;

    move-result-object v0

    const/4 v11, 0x1

    new-array v1, v11, [Lm9/q;

    const/4 v12, 0x0

    aput-object v0, v1, v12

    invoke-static {v1}, Lj7/v;->s([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    if-eqz p5, :cond_0

    move-object/from16 v2, p5

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-static/range {v1 .. v8}, Lm9/p;->f(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lm9/a;Ljava/lang/String;ZILjava/lang/Object;)Lm9/q;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v7, Lm9/q;

    new-instance v8, Lm9/r;

    const-string v1, "+"

    invoke-direct {v8, v1}, Lm9/r;-><init>(Ljava/lang/String;)V

    new-instance v13, Lm9/h;

    new-instance v14, Lm9/w;

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v1, v11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object v1, v14

    move-object/from16 v3, p1

    invoke-direct/range {v1 .. v6}, Lm9/w;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lm9/a;Ljava/lang/String;Z)V

    invoke-static {v14}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v13, v1}, Lm9/h;-><init>(Ljava/util/List;)V

    const/4 v1, 0x2

    new-array v1, v1, [Lm9/o;

    aput-object v8, v1, v12

    aput-object v13, v1, v11

    invoke-static {v1}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v2

    invoke-direct {v7, v1, v2}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-static/range {v1 .. v8}, Lm9/p;->f(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lm9/a;Ljava/lang/String;ZILjava/lang/Object;)Lm9/q;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    new-instance v1, Lm9/q;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public static final synthetic c(Lm9/a;Ljava/lang/Object;Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lm9/p;->d(Lm9/a;Ljava/lang/Object;Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lm9/a;Ljava/lang/Object;Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-interface {p0, p1, p2}, Lm9/a;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p0, Lm9/k;->a:Lm9/k$a;

    invoke-virtual {p0, p4}, Lm9/k$a;->b(I)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p4, Lm9/k;->a:Lm9/k$a;

    new-instance v0, Lm9/p$a;

    invoke-direct {v0, p1, p2, p0}, Lm9/p$a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lm9/a;)V

    invoke-virtual {p4, p3, v0}, Lm9/k$a;->a(ILx7/a;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final e(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lm9/a;Ljava/lang/String;Z)Lm9/q;
    .locals 16

    .prologue
    move-object/from16 v0, p3

    move-object/from16 v1, p4

    move/from16 v2, p5

    const/4 v3, 0x2

    const/4 v4, 0x0

    const-string v5, "setter"

    invoke-static {v0, v5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "name"

    invoke-static {v1, v5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x1

    if-eqz p0, :cond_0

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_0

    :cond_0
    move v6, v5

    :goto_0
    add-int/2addr v6, v2

    if-eqz p1, :cond_1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Number;->intValue()I

    move-result v7

    if-eqz v2, :cond_2

    add-int/2addr v7, v5

    goto :goto_1

    :cond_1
    const v7, 0x7fffffff

    :cond_2
    :goto_1
    if-eqz p2, :cond_3

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_2

    :cond_3
    move v8, v4

    :goto_2
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v9

    if-lt v6, v9, :cond_4

    invoke-static {v2, v0, v1, v6, v7}, Lm9/p;->g(ZLm9/a;Ljava/lang/String;II)Lm9/q;

    move-result-object v0

    return-object v0

    :cond_4
    invoke-static {v2, v0, v1, v6, v6}, Lm9/p;->g(ZLm9/a;Ljava/lang/String;II)Lm9/q;

    move-result-object v10

    :goto_3
    const-string v11, " "

    if-ge v6, v9, :cond_5

    new-instance v12, Lm9/q;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v13

    add-int/2addr v6, v5

    invoke-static {v2, v0, v1, v6, v6}, Lm9/p;->g(ZLm9/a;Ljava/lang/String;II)Lm9/q;

    move-result-object v14

    new-instance v15, Lm9/q;

    new-instance v5, Lm9/r;

    invoke-direct {v5, v11}, Lm9/r;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v11

    invoke-direct {v15, v5, v11}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    new-array v5, v3, [Lm9/q;

    aput-object v15, v5, v4

    const/4 v11, 0x1

    aput-object v10, v5, v11

    invoke-static {v5}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lm9/n;->b(Ljava/util/List;)Lm9/q;

    move-result-object v5

    new-array v10, v3, [Lm9/q;

    aput-object v14, v10, v4

    aput-object v5, v10, v11

    invoke-static {v10}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v12, v13, v5}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    move-object v10, v12

    const/4 v5, 0x1

    goto :goto_3

    :cond_5
    if-le v8, v7, :cond_6

    new-instance v0, Lm9/r;

    sub-int/2addr v8, v7

    invoke-static {v11, v8}, LS8/r;->N(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lm9/r;-><init>(Ljava/lang/String;)V

    new-instance v1, Lm9/q;

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    new-array v0, v3, [Lm9/q;

    aput-object v1, v0, v4

    const/4 v5, 0x1

    aput-object v10, v0, v5

    invoke-static {v0}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm9/n;->b(Ljava/util/List;)Lm9/q;

    move-result-object v10

    goto :goto_4

    :cond_6
    const/4 v5, 0x1

    if-ne v8, v7, :cond_7

    goto :goto_4

    :cond_7
    new-instance v6, Lm9/q;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v9

    add-int/2addr v8, v5

    invoke-static {v2, v0, v1, v8, v7}, Lm9/p;->g(ZLm9/a;Ljava/lang/String;II)Lm9/q;

    move-result-object v0

    new-array v1, v3, [Lm9/q;

    aput-object v0, v1, v4

    aput-object v10, v1, v5

    invoke-static {v1}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v6, v9, v0}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    move-object v10, v6

    :goto_4
    return-object v10
.end method

.method public static synthetic f(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lm9/a;Ljava/lang/String;ZILjava/lang/Object;)Lm9/q;
    .locals 6

    .prologue
    and-int/lit8 p6, p6, 0x20

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-static/range {v0 .. v5}, Lm9/p;->e(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lm9/a;Ljava/lang/String;Z)Lm9/q;

    move-result-object p0

    return-object p0
.end method

.method private static final g(ZLm9/a;Ljava/lang/String;II)Lm9/q;
    .locals 9

    .prologue
    add-int/lit8 v0, p0, 0x1

    if-lt p4, v0, :cond_1

    invoke-static {}, Lj7/v;->c()Ljava/util/List;

    move-result-object v0

    if-eqz p0, :cond_0

    new-instance v1, Lm9/r;

    const-string v2, "-"

    invoke-direct {v1, v2}, Lm9/r;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance v1, Lm9/h;

    new-instance v8, Lm9/w;

    sub-int/2addr p3, p0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sub-int/2addr p4, p0

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object v2, v8

    move-object v5, p1

    move-object v6, p2

    move v7, p0

    invoke-direct/range {v2 .. v7}, Lm9/w;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lm9/a;Ljava/lang/String;Z)V

    invoke-static {v8}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, p0}, Lm9/h;-><init>(Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Lj7/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    new-instance p2, Lm9/q;

    invoke-direct {p2, p0, p1}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Check failed."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
