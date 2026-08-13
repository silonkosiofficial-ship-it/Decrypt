.class public abstract Landroidx/compose/ui/platform/r1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Ln0/k;)Z
    .locals 3

    .prologue
    invoke-virtual {p0}, Ln0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/a;->d(J)F

    move-result v0

    invoke-virtual {p0}, Ln0/k;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/a;->d(J)F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {p0}, Ln0/k;->j()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Ln0/k;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/a;->d(J)F

    move-result v0

    invoke-virtual {p0}, Ln0/k;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/a;->d(J)F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {p0}, Ln0/k;->j()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Ln0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/a;->e(J)F

    move-result v0

    invoke-virtual {p0}, Ln0/k;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/a;->e(J)F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {p0}, Ln0/k;->d()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Ln0/k;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/a;->e(J)F

    move-result v0

    invoke-virtual {p0}, Ln0/k;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/a;->e(J)F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {p0}, Ln0/k;->d()F

    move-result p0

    cmpg-float p0, v0, p0

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b(Lo0/L1;FFLo0/Q1;Lo0/Q1;)Z
    .locals 1

    .prologue
    instance-of v0, p0, Lo0/L1$b;

    if-eqz v0, :cond_0

    check-cast p0, Lo0/L1$b;

    invoke-virtual {p0}, Lo0/L1$b;->b()Ln0/i;

    move-result-object p0

    invoke-static {p0, p1, p2}, Landroidx/compose/ui/platform/r1;->e(Ln0/i;FF)Z

    move-result p0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lo0/L1$c;

    if-eqz v0, :cond_1

    check-cast p0, Lo0/L1$c;

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/platform/r1;->f(Lo0/L1$c;FFLo0/Q1;Lo0/Q1;)Z

    move-result p0

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lo0/L1$a;

    if-eqz v0, :cond_2

    check-cast p0, Lo0/L1$a;

    invoke-virtual {p0}, Lo0/L1$a;->b()Lo0/Q1;

    move-result-object p0

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/platform/r1;->d(Lo0/Q1;FFLo0/Q1;Lo0/Q1;)Z

    move-result p0

    :goto_0
    return p0

    :cond_2
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0
.end method

.method public static synthetic c(Lo0/L1;FFLo0/Q1;Lo0/Q1;ILjava/lang/Object;)Z
    .locals 1

    .prologue
    and-int/lit8 p6, p5, 0x8

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x10

    if-eqz p5, :cond_1

    move-object p4, v0

    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/platform/r1;->b(Lo0/L1;FFLo0/Q1;Lo0/Q1;)Z

    move-result p0

    return p0
.end method

.method private static final d(Lo0/Q1;FFLo0/Q1;Lo0/Q1;)Z
    .locals 4

    .prologue
    new-instance v0, Ln0/i;

    const v1, 0x3ba3d70a    # 0.005f

    sub-float v2, p1, v1

    sub-float v3, p2, v1

    add-float/2addr p1, v1

    add-float/2addr p2, v1

    invoke-direct {v0, v2, v3, p1, p2}, Ln0/i;-><init>(FFFF)V

    if-nez p3, :cond_0

    invoke-static {}, Lo0/Y;->a()Lo0/Q1;

    move-result-object p3

    :cond_0
    const/4 p1, 0x2

    const/4 p2, 0x0

    invoke-static {p3, v0, p2, p1, p2}, Lo0/P1;->b(Lo0/Q1;Ln0/i;Lo0/Q1$b;ILjava/lang/Object;)V

    if-nez p4, :cond_1

    invoke-static {}, Lo0/Y;->a()Lo0/Q1;

    move-result-object p4

    :cond_1
    sget-object p1, Lo0/U1;->a:Lo0/U1$a;

    invoke-virtual {p1}, Lo0/U1$a;->b()I

    move-result p1

    invoke-interface {p4, p0, p3, p1}, Lo0/Q1;->j(Lo0/Q1;Lo0/Q1;I)Z

    invoke-interface {p4}, Lo0/Q1;->isEmpty()Z

    move-result p0

    invoke-interface {p4}, Lo0/Q1;->a()V

    invoke-interface {p3}, Lo0/Q1;->a()V

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final e(Ln0/i;FF)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, Ln0/i;->i()F

    move-result v0

    cmpg-float v0, v0, p1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Ln0/i;->j()F

    move-result v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    invoke-virtual {p0}, Ln0/i;->l()F

    move-result p1

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_0

    invoke-virtual {p0}, Ln0/i;->e()F

    move-result p0

    cmpg-float p0, p2, p0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final f(Lo0/L1$c;FFLo0/Q1;Lo0/Q1;)Z
    .locals 13

    .prologue
    move v0, p1

    move v1, p2

    move-object/from16 v2, p4

    invoke-virtual {p0}, Lo0/L1$c;->b()Ln0/k;

    move-result-object v3

    invoke-virtual {v3}, Ln0/k;->e()F

    move-result v4

    cmpg-float v4, v0, v4

    if-ltz v4, :cond_7

    invoke-virtual {v3}, Ln0/k;->f()F

    move-result v4

    cmpl-float v4, v0, v4

    if-gez v4, :cond_7

    invoke-virtual {v3}, Ln0/k;->g()F

    move-result v4

    cmpg-float v4, v1, v4

    if-ltz v4, :cond_7

    invoke-virtual {v3}, Ln0/k;->a()F

    move-result v4

    cmpl-float v4, v1, v4

    if-ltz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-static {v3}, Landroidx/compose/ui/platform/r1;->a(Ln0/k;)Z

    move-result v4

    if-nez v4, :cond_2

    if-nez v2, :cond_1

    invoke-static {}, Lo0/Y;->a()Lo0/Q1;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v2

    :goto_0
    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v4, v3, v6, v5, v6}, Lo0/P1;->c(Lo0/Q1;Ln0/k;Lo0/Q1$b;ILjava/lang/Object;)V

    move-object/from16 v3, p3

    invoke-static {v4, p1, p2, v3, v2}, Landroidx/compose/ui/platform/r1;->d(Lo0/Q1;FFLo0/Q1;Lo0/Q1;)Z

    move-result v0

    return v0

    :cond_2
    invoke-virtual {v3}, Ln0/k;->e()F

    move-result v2

    invoke-virtual {v3}, Ln0/k;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, Ln0/a;->d(J)F

    move-result v4

    add-float/2addr v4, v2

    invoke-virtual {v3}, Ln0/k;->g()F

    move-result v2

    invoke-virtual {v3}, Ln0/k;->h()J

    move-result-wide v5

    invoke-static {v5, v6}, Ln0/a;->e(J)F

    move-result v5

    add-float/2addr v5, v2

    invoke-virtual {v3}, Ln0/k;->f()F

    move-result v2

    invoke-virtual {v3}, Ln0/k;->i()J

    move-result-wide v6

    invoke-static {v6, v7}, Ln0/a;->d(J)F

    move-result v6

    sub-float v6, v2, v6

    invoke-virtual {v3}, Ln0/k;->g()F

    move-result v2

    invoke-virtual {v3}, Ln0/k;->i()J

    move-result-wide v7

    invoke-static {v7, v8}, Ln0/a;->e(J)F

    move-result v7

    add-float/2addr v7, v2

    invoke-virtual {v3}, Ln0/k;->f()F

    move-result v2

    invoke-virtual {v3}, Ln0/k;->c()J

    move-result-wide v8

    invoke-static {v8, v9}, Ln0/a;->d(J)F

    move-result v8

    sub-float v8, v2, v8

    invoke-virtual {v3}, Ln0/k;->a()F

    move-result v2

    invoke-virtual {v3}, Ln0/k;->c()J

    move-result-wide v9

    invoke-static {v9, v10}, Ln0/a;->e(J)F

    move-result v9

    sub-float v9, v2, v9

    invoke-virtual {v3}, Ln0/k;->a()F

    move-result v2

    invoke-virtual {v3}, Ln0/k;->b()J

    move-result-wide v10

    invoke-static {v10, v11}, Ln0/a;->e(J)F

    move-result v10

    sub-float v10, v2, v10

    invoke-virtual {v3}, Ln0/k;->e()F

    move-result v2

    invoke-virtual {v3}, Ln0/k;->b()J

    move-result-wide v11

    invoke-static {v11, v12}, Ln0/a;->d(J)F

    move-result v11

    add-float/2addr v11, v2

    cmpg-float v2, v0, v4

    if-gez v2, :cond_3

    cmpg-float v2, v1, v5

    if-gez v2, :cond_3

    invoke-virtual {v3}, Ln0/k;->h()J

    move-result-wide v2

    move v0, p1

    move v1, p2

    :goto_1
    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/platform/r1;->g(FFJFF)Z

    move-result v0

    goto :goto_2

    :cond_3
    cmpg-float v2, v0, v11

    if-gez v2, :cond_4

    cmpl-float v2, v1, v10

    if-lez v2, :cond_4

    invoke-virtual {v3}, Ln0/k;->b()J

    move-result-wide v2

    move v0, p1

    move v1, p2

    move v4, v11

    move v5, v10

    goto :goto_1

    :cond_4
    cmpl-float v2, v0, v6

    if-lez v2, :cond_5

    cmpg-float v2, v1, v7

    if-gez v2, :cond_5

    invoke-virtual {v3}, Ln0/k;->i()J

    move-result-wide v2

    move v0, p1

    move v1, p2

    move v4, v6

    move v5, v7

    goto :goto_1

    :cond_5
    cmpl-float v2, v0, v8

    if-lez v2, :cond_6

    cmpl-float v2, v1, v9

    if-lez v2, :cond_6

    invoke-virtual {v3}, Ln0/k;->c()J

    move-result-wide v2

    move v0, p1

    move v1, p2

    move v4, v8

    move v5, v9

    goto :goto_1

    :cond_6
    const/4 v0, 0x1

    :goto_2
    return v0

    :cond_7
    :goto_3
    const/4 v0, 0x0

    return v0
.end method

.method private static final g(FFJFF)Z
    .locals 0

    .prologue
    sub-float/2addr p0, p4

    sub-float/2addr p1, p5

    invoke-static {p2, p3}, Ln0/a;->d(J)F

    move-result p4

    invoke-static {p2, p3}, Ln0/a;->e(J)F

    move-result p2

    mul-float/2addr p0, p0

    mul-float/2addr p4, p4

    div-float/2addr p0, p4

    mul-float/2addr p1, p1

    mul-float/2addr p2, p2

    div-float/2addr p1, p2

    add-float/2addr p0, p1

    const/high16 p1, 0x3f800000    # 1.0f

    cmpg-float p0, p0, p1

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
