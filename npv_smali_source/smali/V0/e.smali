.class public abstract LV0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(JLY0/e;)Landroid/text/style/MetricAffectingSpan;
    .locals 5

    .prologue
    invoke-static {p0, p1}, LY0/x;->g(J)J

    move-result-wide v0

    sget-object v2, LY0/z;->b:LY0/z$a;

    invoke-virtual {v2}, LY0/z$a;->b()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LY0/z;->g(JJ)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v0, LP0/f;

    invoke-interface {p2, p0, p1}, LY0/e;->g1(J)F

    move-result p0

    invoke-direct {v0, p0}, LP0/f;-><init>(F)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, LY0/z$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/z;->g(JJ)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance v0, LP0/e;

    invoke-static {p0, p1}, LY0/x;->h(J)F

    move-result p0

    invoke-direct {v0, p0}, LP0/e;-><init>(F)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static final b(LM0/C;Ljava/util/List;Lx7/q;)V
    .locals 13

    .prologue
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v2

    if-eqz v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/d$c;

    invoke-virtual {v0}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/C;

    invoke-static {p0, v0}, LV0/e;->f(LM0/C;LM0/C;)LM0/C;

    move-result-object p0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/d$c;

    invoke-virtual {v0}, LM0/d$c;->f()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LM0/d$c;

    invoke-virtual {p1}, LM0/d$c;->d()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p0, v0, p1}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v2, v0, 0x2

    new-array v3, v2, [Ljava/lang/Integer;

    move v4, v1

    :goto_0
    if-ge v4, v2, :cond_2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    move v5, v1

    :goto_1
    if-ge v5, v4, :cond_3

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LM0/d$c;

    invoke-virtual {v6}, LM0/d$c;->f()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v3, v5

    add-int v7, v5, v0

    invoke-virtual {v6}, LM0/d$c;->d()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    move-object v0, v3

    check-cast v0, [Ljava/lang/Comparable;

    invoke-static {v0}, Lj7/n;->J([Ljava/lang/Object;)V

    invoke-static {v3}, Lj7/n;->Y([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    move v4, v1

    :goto_2
    if-ge v4, v2, :cond_8

    aget-object v5, v3, v4

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v7

    move-object v9, p0

    move v8, v1

    :goto_3
    if-ge v8, v7, :cond_6

    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LM0/d$c;

    invoke-virtual {v10}, LM0/d$c;->f()I

    move-result v11

    invoke-virtual {v10}, LM0/d$c;->d()I

    move-result v12

    if-eq v11, v12, :cond_5

    invoke-virtual {v10}, LM0/d$c;->f()I

    move-result v11

    invoke-virtual {v10}, LM0/d$c;->d()I

    move-result v12

    invoke-static {v0, v6, v11, v12}, LM0/e;->l(IIII)Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-virtual {v10}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LM0/C;

    invoke-static {v9, v10}, LV0/e;->f(LM0/C;LM0/C;)LM0/C;

    move-result-object v9

    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_6
    if-eqz v9, :cond_7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, v9, v0, v5}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    move v0, v6

    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_8
    return-void
.end method

.method private static final c(LM0/C;)Z
    .locals 5

    .prologue
    invoke-virtual {p0}, LM0/C;->o()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/x;->g(J)J

    move-result-wide v0

    sget-object v2, LY0/z;->b:LY0/z$a;

    invoke-virtual {v2}, LY0/z$a;->b()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LY0/z;->g(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LM0/C;->o()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/x;->g(J)J

    move-result-wide v0

    invoke-virtual {v2}, LY0/z$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/z;->g(JJ)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static final d(LM0/P;)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LM0/P;->M()LM0/C;

    move-result-object v0

    invoke-static {v0}, LV0/f;->d(LM0/C;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LM0/P;->n()LR0/p;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static final e(LY0/e;)Z
    .locals 4

    .prologue
    invoke-interface {p0}, LY0/n;->v0()F

    move-result p0

    float-to-double v0, p0

    const-wide v2, 0x3ff0cccccccccccdL    # 1.05

    cmpl-double p0, v0, v2

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final f(LM0/C;LM0/C;)LM0/C;
    .locals 0

    .prologue
    if-nez p0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, LM0/C;->x(LM0/C;)LM0/C;

    move-result-object p0

    return-object p0
.end method

.method private static final g(JFLY0/e;)F
    .locals 5

    .prologue
    invoke-static {p0, p1}, LY0/x;->g(J)J

    move-result-wide v0

    sget-object v2, LY0/z;->b:LY0/z$a;

    invoke-virtual {v2}, LY0/z$a;->b()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LY0/z;->g(JJ)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p3}, LV0/e;->e(LY0/e;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p3, p0, p1}, LY0/e;->g1(J)F

    move-result p0

    goto :goto_1

    :cond_0
    invoke-interface {p3, p2}, LY0/e;->k0(F)J

    move-result-wide v0

    invoke-static {p0, p1}, LY0/x;->h(J)F

    move-result p0

    invoke-static {v0, v1}, LY0/x;->h(J)F

    move-result p1

    div-float/2addr p0, p1

    :goto_0
    mul-float/2addr p0, p2

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, LY0/z$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/z;->g(JJ)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {p0, p1}, LY0/x;->h(J)F

    move-result p0

    goto :goto_0

    :cond_2
    const/high16 p0, 0x7fc00000    # Float.NaN

    :goto_1
    return p0
.end method

.method public static final h(Landroid/text/Spannable;JII)V
    .locals 2

    .prologue
    const-wide/16 v0, 0x10

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/text/style/BackgroundColorSpan;

    invoke-static {p1, p2}, Lo0/A0;->k(J)I

    move-result p1

    invoke-direct {v0, p1}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    invoke-static {p0, v0, p3, p4}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_0
    return-void
.end method

.method private static final i(Landroid/text/Spannable;LX0/a;II)V
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    invoke-virtual {p1}, LX0/a;->h()F

    move-result p1

    new-instance v0, LP0/a;

    invoke-direct {v0, p1}, LP0/a;-><init>(F)V

    invoke-static {p0, v0, p2, p3}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_0
    return-void
.end method

.method private static final j(Landroid/text/Spannable;Lo0/n0;FII)V
    .locals 1

    .prologue
    if-eqz p1, :cond_1

    instance-of v0, p1, Lo0/f2;

    if-eqz v0, :cond_0

    check-cast p1, Lo0/f2;

    invoke-virtual {p1}, Lo0/f2;->b()J

    move-result-wide p1

    invoke-static {p0, p1, p2, p3, p4}, LV0/e;->k(Landroid/text/Spannable;JII)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lo0/a2;

    if-eqz v0, :cond_1

    new-instance v0, LW0/b;

    check-cast p1, Lo0/a2;

    invoke-direct {v0, p1, p2}, LW0/b;-><init>(Lo0/a2;F)V

    invoke-static {p0, v0, p3, p4}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static final k(Landroid/text/Spannable;JII)V
    .locals 2

    .prologue
    const-wide/16 v0, 0x10

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-static {p1, p2}, Lo0/A0;->k(J)I

    move-result p1

    invoke-direct {v0, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-static {p0, v0, p3, p4}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_0
    return-void
.end method

.method private static final l(Landroid/text/Spannable;Lq0/h;II)V
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    new-instance v0, LW0/a;

    invoke-direct {v0, p1}, LW0/a;-><init>(Lq0/h;)V

    invoke-static {p0, v0, p2, p3}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_0
    return-void
.end method

.method private static final m(Landroid/text/Spannable;LM0/P;Ljava/util/List;Lx7/r;)V
    .locals 25

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    move-object/from16 v3, p2

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LM0/d$c;

    invoke-virtual {v5}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LM0/C;

    invoke-static {v6}, LV0/f;->d(LM0/C;)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual {v5}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LM0/C;

    invoke-virtual {v5}, LM0/C;->m()LR0/p;

    move-result-object v5

    if-eqz v5, :cond_1

    :cond_0
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, LV0/e;->d(LM0/P;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual/range {p1 .. p1}, LM0/P;->j()LR0/h;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, LM0/P;->o()LR0/q;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, LM0/P;->m()LR0/o;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, LM0/P;->n()LR0/p;

    move-result-object v9

    new-instance v1, LM0/C;

    move-object v2, v1

    const v23, 0xffc3

    const/16 v24, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v2 .. v24}, LM0/C;-><init>(JJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;LM0/z;Lq0/h;ILy7/k;)V

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    new-instance v2, LV0/e$a;

    move-object/from16 v3, p0

    move-object/from16 v4, p3

    invoke-direct {v2, v3, v4}, LV0/e$a;-><init>(Landroid/text/Spannable;Lx7/r;)V

    invoke-static {v1, v0, v2}, LV0/e;->b(LM0/C;Ljava/util/List;Lx7/q;)V

    return-void
.end method

.method private static final n(Landroid/text/Spannable;Ljava/lang/String;II)V
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    new-instance v0, LP0/b;

    invoke-direct {v0, p1}, LP0/b;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v0, p2, p3}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_0
    return-void
.end method

.method public static final o(Landroid/text/Spannable;JLY0/e;II)V
    .locals 5

    .prologue
    invoke-static {p1, p2}, LY0/x;->g(J)J

    move-result-wide v0

    sget-object v2, LY0/z;->b:LY0/z$a;

    invoke-virtual {v2}, LY0/z$a;->b()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LY0/z;->g(JJ)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    invoke-interface {p3, p1, p2}, LY0/e;->g1(J)F

    move-result p1

    invoke-static {p1}, LA7/a;->d(F)I

    move-result p1

    const/4 p2, 0x0

    invoke-direct {v0, p1, p2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-static {p0, v0, p4, p5}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, LY0/z$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/z;->g(JJ)Z

    move-result p3

    if-eqz p3, :cond_1

    new-instance p3, Landroid/text/style/RelativeSizeSpan;

    invoke-static {p1, p2}, LY0/x;->h(J)F

    move-result p1

    invoke-direct {p3, p1}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-static {p0, p3, p4, p5}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_1
    :goto_0
    return-void
.end method

.method private static final p(Landroid/text/Spannable;LX0/p;II)V
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    new-instance v0, Landroid/text/style/ScaleXSpan;

    invoke-virtual {p1}, LX0/p;->b()F

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    invoke-static {p0, v0, p2, p3}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    new-instance v0, LP0/m;

    invoke-virtual {p1}, LX0/p;->c()F

    move-result p1

    invoke-direct {v0, p1}, LP0/m;-><init>(F)V

    invoke-static {p0, v0, p2, p3}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_0
    return-void
.end method

.method public static final q(Landroid/text/Spannable;JFLY0/e;LX0/h;)V
    .locals 7

    .prologue
    invoke-static {p1, p2, p3, p4}, LV0/e;->g(JFLY0/e;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LS8/r;->z1(Ljava/lang/CharSequence;)C

    move-result p1

    const/16 p2, 0xa

    if-ne p1, p2, :cond_1

    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    :goto_1
    move v3, p1

    goto :goto_2

    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p1

    goto :goto_1

    :goto_2
    new-instance p1, LP0/h;

    invoke-virtual {p5}, LX0/h;->c()I

    move-result p2

    invoke-static {p2}, LX0/h$c;->f(I)Z

    move-result v4

    invoke-virtual {p5}, LX0/h;->c()I

    move-result p2

    invoke-static {p2}, LX0/h$c;->g(I)Z

    move-result v5

    invoke-virtual {p5}, LX0/h;->b()F

    move-result v6

    const/4 v2, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, LP0/h;-><init>(FIIZZF)V

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p2

    const/4 p3, 0x0

    invoke-static {p0, p1, p3, p2}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_2
    return-void
.end method

.method public static final r(Landroid/text/Spannable;JFLY0/e;)V
    .locals 0

    .prologue
    invoke-static {p1, p2, p3, p4}, LV0/e;->g(JFLY0/e;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-nez p2, :cond_0

    new-instance p2, LP0/g;

    invoke-direct {p2, p1}, LP0/g;-><init>(F)V

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 p3, 0x0

    invoke-static {p0, p2, p3, p1}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_0
    return-void
.end method

.method public static final s(Landroid/text/Spannable;LT0/h;II)V
    .locals 2

    .prologue
    if-eqz p1, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    sget-object v0, LV0/c;->a:LV0/c;

    invoke-virtual {v0, p1}, LV0/c;->a(LT0/h;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, LT0/h;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, LT0/g;->b:LT0/g$a;

    invoke-virtual {p1}, LT0/g$a;->a()LT0/g;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LT0/h;->f(I)LT0/g;

    move-result-object p1

    :goto_0
    new-instance v0, Landroid/text/style/LocaleSpan;

    invoke-virtual {p1}, LT0/g;->b()Ljava/util/Locale;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/text/style/LocaleSpan;-><init>(Ljava/util/Locale;)V

    move-object p1, v0

    :goto_1
    invoke-static {p0, p1, p2, p3}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_2
    return-void
.end method

.method private static final t(Landroid/text/Spannable;Lo0/c2;II)V
    .locals 5

    .prologue
    if-eqz p1, :cond_0

    new-instance v0, LP0/l;

    invoke-virtual {p1}, Lo0/c2;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo0/A0;->k(J)I

    move-result v1

    invoke-virtual {p1}, Lo0/c2;->d()J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/g;->m(J)F

    move-result v2

    invoke-virtual {p1}, Lo0/c2;->d()J

    move-result-wide v3

    invoke-static {v3, v4}, Ln0/g;->n(J)F

    move-result v3

    invoke-virtual {p1}, Lo0/c2;->b()F

    move-result p1

    invoke-static {p1}, LV0/f;->b(F)F

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, LP0/l;-><init>(IFFF)V

    invoke-static {p0, v0, p2, p3}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_0
    return-void
.end method

.method public static final u(Landroid/text/Spannable;Ljava/lang/Object;II)V
    .locals 1

    const/16 v0, 0x21

    invoke-interface {p0, p1, p2, p3, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method private static final v(Landroid/text/Spannable;LM0/d$c;LY0/e;)V
    .locals 8

    invoke-virtual {p1}, LM0/d$c;->f()I

    move-result v6

    invoke-virtual {p1}, LM0/d$c;->d()I

    move-result v7

    invoke-virtual {p1}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LM0/C;

    invoke-virtual {p1}, LM0/C;->e()LX0/a;

    move-result-object v0

    invoke-static {p0, v0, v6, v7}, LV0/e;->i(Landroid/text/Spannable;LX0/a;II)V

    invoke-virtual {p1}, LM0/C;->g()J

    move-result-wide v0

    invoke-static {p0, v0, v1, v6, v7}, LV0/e;->k(Landroid/text/Spannable;JII)V

    invoke-virtual {p1}, LM0/C;->f()Lo0/n0;

    move-result-object v0

    invoke-virtual {p1}, LM0/C;->c()F

    move-result v1

    invoke-static {p0, v0, v1, v6, v7}, LV0/e;->j(Landroid/text/Spannable;Lo0/n0;FII)V

    invoke-virtual {p1}, LM0/C;->s()LX0/k;

    move-result-object v0

    invoke-static {p0, v0, v6, v7}, LV0/e;->x(Landroid/text/Spannable;LX0/k;II)V

    invoke-virtual {p1}, LM0/C;->k()J

    move-result-wide v1

    move-object v0, p0

    move-object v3, p2

    move v4, v6

    move v5, v7

    invoke-static/range {v0 .. v5}, LV0/e;->o(Landroid/text/Spannable;JLY0/e;II)V

    invoke-virtual {p1}, LM0/C;->j()Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p2, v6, v7}, LV0/e;->n(Landroid/text/Spannable;Ljava/lang/String;II)V

    invoke-virtual {p1}, LM0/C;->u()LX0/p;

    move-result-object p2

    invoke-static {p0, p2, v6, v7}, LV0/e;->p(Landroid/text/Spannable;LX0/p;II)V

    invoke-virtual {p1}, LM0/C;->p()LT0/h;

    move-result-object p2

    invoke-static {p0, p2, v6, v7}, LV0/e;->s(Landroid/text/Spannable;LT0/h;II)V

    invoke-virtual {p1}, LM0/C;->d()J

    move-result-wide v0

    invoke-static {p0, v0, v1, v6, v7}, LV0/e;->h(Landroid/text/Spannable;JII)V

    invoke-virtual {p1}, LM0/C;->r()Lo0/c2;

    move-result-object p2

    invoke-static {p0, p2, v6, v7}, LV0/e;->t(Landroid/text/Spannable;Lo0/c2;II)V

    invoke-virtual {p1}, LM0/C;->h()Lq0/h;

    move-result-object p1

    invoke-static {p0, p1, v6, v7}, LV0/e;->l(Landroid/text/Spannable;Lq0/h;II)V

    return-void
.end method

.method public static final w(Landroid/text/Spannable;LM0/P;Ljava/util/List;LY0/e;Lx7/r;)V
    .locals 6

    .prologue
    invoke-static {p0, p1, p2, p4}, LV0/e;->m(Landroid/text/Spannable;LM0/P;Ljava/util/List;Lx7/r;)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 p4, 0x0

    move v0, p4

    move v1, v0

    :goto_0
    if-ge v0, p1, :cond_2

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LM0/d$c;

    invoke-virtual {v2}, LM0/d$c;->f()I

    move-result v3

    invoke-virtual {v2}, LM0/d$c;->d()I

    move-result v4

    if-ltz v3, :cond_1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v3, v5, :cond_1

    if-le v4, v3, :cond_1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-le v4, v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0, v2, p3}, LV0/e;->v(Landroid/text/Spannable;LM0/d$c;LY0/e;)V

    invoke-virtual {v2}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LM0/C;

    invoke-static {v2}, LV0/e;->c(LM0/C;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_5

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    :goto_2
    if-ge p4, p1, :cond_5

    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/d$c;

    invoke-virtual {v0}, LM0/d$c;->f()I

    move-result v1

    invoke-virtual {v0}, LM0/d$c;->d()I

    move-result v2

    invoke-virtual {v0}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/C;

    if-ltz v1, :cond_4

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v1, v3, :cond_4

    if-le v2, v1, :cond_4

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-le v2, v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, LM0/C;->o()J

    move-result-wide v3

    invoke-static {v3, v4, p3}, LV0/e;->a(JLY0/e;)Landroid/text/style/MetricAffectingSpan;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {p0, v0, v1, v2}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_4
    :goto_3
    add-int/lit8 p4, p4, 0x1

    goto :goto_2

    :cond_5
    return-void
.end method

.method public static final x(Landroid/text/Spannable;LX0/k;II)V
    .locals 3

    .prologue
    if-eqz p1, :cond_0

    new-instance v0, LP0/n;

    sget-object v1, LX0/k;->b:LX0/k$a;

    invoke-virtual {v1}, LX0/k$a;->d()LX0/k;

    move-result-object v2

    invoke-virtual {p1, v2}, LX0/k;->d(LX0/k;)Z

    move-result v2

    invoke-virtual {v1}, LX0/k$a;->b()LX0/k;

    move-result-object v1

    invoke-virtual {p1, v1}, LX0/k;->d(LX0/k;)Z

    move-result p1

    invoke-direct {v0, v2, p1}, LP0/n;-><init>(ZZ)V

    invoke-static {p0, v0, p2, p3}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_0
    return-void
.end method

.method public static final y(Landroid/text/Spannable;LX0/r;FLY0/e;)V
    .locals 10

    .prologue
    if-eqz p1, :cond_6

    invoke-virtual {p1}, LX0/r;->b()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-static {v2}, LY0/y;->f(I)J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LY0/x;->e(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LX0/r;->c()J

    move-result-wide v0

    invoke-static {v2}, LY0/y;->f(I)J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LY0/x;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_6

    :cond_0
    invoke-virtual {p1}, LX0/r;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/y;->g(J)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p1}, LX0/r;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/y;->g(J)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p1}, LX0/r;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/x;->g(J)J

    move-result-wide v0

    sget-object v3, LY0/z;->b:LY0/z$a;

    invoke-virtual {v3}, LY0/z$a;->b()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, LY0/z;->g(JJ)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-virtual {p1}, LX0/r;->b()J

    move-result-wide v0

    invoke-interface {p3, v0, v1}, LY0/e;->g1(J)F

    move-result v0

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, LY0/z$a;->a()J

    move-result-wide v6

    invoke-static {v0, v1, v6, v7}, LY0/z;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LX0/r;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/x;->h(J)F

    move-result v0

    mul-float/2addr v0, p2

    goto :goto_0

    :cond_3
    move v0, v5

    :goto_0
    invoke-virtual {p1}, LX0/r;->c()J

    move-result-wide v6

    invoke-static {v6, v7}, LY0/x;->g(J)J

    move-result-wide v6

    invoke-virtual {v3}, LY0/z$a;->b()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, LY0/z;->g(JJ)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, LX0/r;->c()J

    move-result-wide p1

    invoke-interface {p3, p1, p2}, LY0/e;->g1(J)F

    move-result v5

    goto :goto_1

    :cond_4
    invoke-virtual {v3}, LY0/z$a;->a()J

    move-result-wide v3

    invoke-static {v6, v7, v3, v4}, LY0/z;->g(JJ)Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-virtual {p1}, LX0/r;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/x;->h(J)F

    move-result p1

    mul-float v5, p1, p2

    :cond_5
    :goto_1
    new-instance p1, Landroid/text/style/LeadingMarginSpan$Standard;

    float-to-double p2, v0

    invoke-static {p2, p3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p2

    double-to-float p2, p2

    float-to-int p2, p2

    float-to-double v0, v5

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float p3, v0

    float-to-int p3, p3

    invoke-direct {p1, p2, p3}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-static {p0, p1, v2, p2}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_6
    :goto_2
    return-void
.end method
