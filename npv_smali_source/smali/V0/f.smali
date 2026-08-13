.class public abstract LV0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LU0/g;LM0/C;Lx7/r;LY0/e;Z)LM0/C;
    .locals 6

    .prologue
    invoke-virtual {p1}, LM0/C;->k()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/x;->g(J)J

    move-result-wide v0

    sget-object v2, LY0/z;->b:LY0/z$a;

    invoke-virtual {v2}, LY0/z$a;->b()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LY0/z;->g(JJ)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1}, LM0/C;->k()J

    move-result-wide v0

    invoke-interface {p3, v0, v1}, LY0/e;->g1(J)F

    move-result v0

    :goto_0
    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, LY0/z$a;->a()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LY0/z;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    invoke-virtual {p1}, LM0/C;->k()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/x;->h(J)F

    move-result v1

    mul-float/2addr v0, v1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-static {p1}, LV0/f;->d(LM0/C;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, LM0/C;->i()LR0/h;

    move-result-object v0

    invoke-virtual {p1}, LM0/C;->n()LR0/q;

    move-result-object v1

    if-nez v1, :cond_2

    sget-object v1, LR0/q;->D:LR0/q$a;

    invoke-virtual {v1}, LR0/q$a;->d()LR0/q;

    move-result-object v1

    :cond_2
    invoke-virtual {p1}, LM0/C;->l()LR0/o;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, LR0/o;->i()I

    move-result v3

    goto :goto_2

    :cond_3
    sget-object v3, LR0/o;->b:LR0/o$a;

    invoke-virtual {v3}, LR0/o$a;->b()I

    move-result v3

    :goto_2
    invoke-static {v3}, LR0/o;->c(I)LR0/o;

    move-result-object v3

    invoke-virtual {p1}, LM0/C;->m()LR0/p;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, LR0/p;->k()I

    move-result v4

    goto :goto_3

    :cond_4
    sget-object v4, LR0/p;->b:LR0/p$a;

    invoke-virtual {v4}, LR0/p$a;->a()I

    move-result v4

    :goto_3
    invoke-static {v4}, LR0/p;->e(I)LR0/p;

    move-result-object v4

    invoke-interface {p2, v0, v1, v3, v4}, Lx7/r;->o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/Typeface;

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :cond_5
    invoke-virtual {p1}, LM0/C;->p()LT0/h;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-virtual {p1}, LM0/C;->p()LT0/h;

    move-result-object p2

    sget-object v0, LT0/h;->E:LT0/h$a;

    invoke-virtual {v0}, LT0/h$a;->a()LT0/h;

    move-result-object v0

    invoke-static {p2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x18

    if-lt p2, v0, :cond_6

    sget-object p2, LV0/c;->a:LV0/c;

    invoke-virtual {p1}, LM0/C;->p()LT0/h;

    move-result-object v0

    invoke-virtual {p2, p0, v0}, LV0/c;->b(LU0/g;LT0/h;)V

    goto :goto_5

    :cond_6
    invoke-virtual {p1}, LM0/C;->p()LT0/h;

    move-result-object p2

    invoke-virtual {p2}, LT0/h;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_7

    sget-object p2, LT0/g;->b:LT0/g$a;

    invoke-virtual {p2}, LT0/g$a;->a()LT0/g;

    move-result-object p2

    goto :goto_4

    :cond_7
    invoke-virtual {p1}, LM0/C;->p()LT0/h;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, LT0/h;->f(I)LT0/g;

    move-result-object p2

    :goto_4
    invoke-virtual {p2}, LT0/g;->b()Ljava/util/Locale;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setTextLocale(Ljava/util/Locale;)V

    :cond_8
    :goto_5
    invoke-virtual {p1}, LM0/C;->j()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_9

    invoke-virtual {p1}, LM0/C;->j()Ljava/lang/String;

    move-result-object p2

    const-string v0, ""

    invoke-static {p2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    invoke-virtual {p1}, LM0/C;->j()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    :cond_9
    invoke-virtual {p1}, LM0/C;->u()LX0/p;

    move-result-object p2

    if-eqz p2, :cond_a

    invoke-virtual {p1}, LM0/C;->u()LX0/p;

    move-result-object p2

    sget-object v0, LX0/p;->c:LX0/p$a;

    invoke-virtual {v0}, LX0/p$a;->a()LX0/p;

    move-result-object v0

    invoke-static {p2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    invoke-virtual {p0}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result p2

    invoke-virtual {p1}, LM0/C;->u()LX0/p;

    move-result-object v0

    invoke-virtual {v0}, LX0/p;->b()F

    move-result v0

    mul-float/2addr p2, v0

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setTextScaleX(F)V

    invoke-virtual {p0}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result p2

    invoke-virtual {p1}, LM0/C;->u()LX0/p;

    move-result-object v0

    invoke-virtual {v0}, LX0/p;->c()F

    move-result v0

    add-float/2addr p2, v0

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setTextSkewX(F)V

    :cond_a
    invoke-virtual {p1}, LM0/C;->g()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LU0/g;->f(J)V

    invoke-virtual {p1}, LM0/C;->f()Lo0/n0;

    move-result-object p2

    sget-object v0, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {v0}, Ln0/m$a;->a()J

    move-result-wide v0

    invoke-virtual {p1}, LM0/C;->c()F

    move-result v3

    invoke-virtual {p0, p2, v0, v1, v3}, LU0/g;->e(Lo0/n0;JF)V

    invoke-virtual {p1}, LM0/C;->r()Lo0/c2;

    move-result-object p2

    invoke-virtual {p0, p2}, LU0/g;->h(Lo0/c2;)V

    invoke-virtual {p1}, LM0/C;->s()LX0/k;

    move-result-object p2

    invoke-virtual {p0, p2}, LU0/g;->i(LX0/k;)V

    invoke-virtual {p1}, LM0/C;->h()Lq0/h;

    move-result-object p2

    invoke-virtual {p0, p2}, LU0/g;->g(Lq0/h;)V

    invoke-virtual {p1}, LM0/C;->o()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/x;->g(J)J

    move-result-wide v0

    invoke-virtual {v2}, LY0/z$a;->b()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LY0/z;->g(JJ)Z

    move-result p2

    if-eqz p2, :cond_d

    invoke-virtual {p1}, LM0/C;->o()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/x;->h(J)F

    move-result p2

    const/4 v0, 0x0

    cmpg-float p2, p2, v0

    if-nez p2, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual {p0}, Landroid/graphics/Paint;->getTextSize()F

    move-result p2

    invoke-virtual {p0}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v1

    mul-float/2addr p2, v1

    invoke-virtual {p1}, LM0/C;->o()J

    move-result-wide v1

    invoke-interface {p3, v1, v2}, LY0/e;->g1(J)F

    move-result p3

    cmpg-float v0, p2, v0

    if-nez v0, :cond_c

    goto :goto_7

    :cond_c
    div-float/2addr p3, p2

    invoke-virtual {p0, p3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    goto :goto_7

    :cond_d
    :goto_6
    invoke-virtual {p1}, LM0/C;->o()J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/x;->g(J)J

    move-result-wide p2

    invoke-virtual {v2}, LY0/z$a;->a()J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, LY0/z;->g(JJ)Z

    move-result p2

    if-eqz p2, :cond_e

    invoke-virtual {p1}, LM0/C;->o()J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/x;->h(J)F

    move-result p2

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    :cond_e
    :goto_7
    invoke-virtual {p1}, LM0/C;->o()J

    move-result-wide v0

    invoke-virtual {p1}, LM0/C;->d()J

    move-result-wide v3

    invoke-virtual {p1}, LM0/C;->e()LX0/a;

    move-result-object v5

    move v2, p4

    invoke-static/range {v0 .. v5}, LV0/f;->c(JZJLX0/a;)LM0/C;

    move-result-object p0

    return-object p0
.end method

.method public static final b(F)F
    .locals 1

    .prologue
    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-nez v0, :cond_0

    const/4 p0, 0x1

    :cond_0
    return p0
.end method

.method private static final c(JZJLX0/a;)LM0/C;
    .locals 32

    .prologue
    move-wide/from16 v0, p3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p2, :cond_1

    invoke-static/range {p0 .. p1}, LY0/x;->g(J)J

    move-result-wide v4

    sget-object v6, LY0/z;->b:LY0/z$a;

    invoke-virtual {v6}, LY0/z$a;->b()J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, LY0/z;->g(JJ)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static/range {p0 .. p1}, LY0/x;->h(J)F

    move-result v4

    const/4 v5, 0x0

    cmpg-float v4, v4, v5

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    move v4, v3

    goto :goto_1

    :cond_1
    :goto_0
    move v4, v2

    :goto_1
    sget-object v5, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v5}, Lo0/y0$a;->g()J

    move-result-wide v6

    invoke-static {v0, v1, v6, v7}, Lo0/y0;->o(JJ)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v5}, Lo0/y0$a;->f()J

    move-result-wide v6

    invoke-static {v0, v1, v6, v7}, Lo0/y0;->o(JJ)Z

    move-result v6

    if-nez v6, :cond_2

    move v6, v3

    goto :goto_2

    :cond_2
    move v6, v2

    :goto_2
    if-eqz p5, :cond_3

    sget-object v7, LX0/a;->b:LX0/a$a;

    invoke-virtual {v7}, LX0/a$a;->a()F

    move-result v7

    invoke-virtual/range {p5 .. p5}, LX0/a;->h()F

    move-result v8

    invoke-static {v8, v7}, LX0/a;->e(FF)Z

    move-result v7

    if-nez v7, :cond_3

    move v2, v3

    :cond_3
    const/4 v3, 0x0

    if-nez v4, :cond_4

    if-nez v6, :cond_4

    if-nez v2, :cond_4

    goto :goto_7

    :cond_4
    if-eqz v4, :cond_5

    move-wide/from16 v19, p0

    goto :goto_3

    :cond_5
    sget-object v4, LY0/x;->b:LY0/x$a;

    invoke-virtual {v4}, LY0/x$a;->a()J

    move-result-wide v7

    move-wide/from16 v19, v7

    :goto_3
    if-eqz v6, :cond_6

    :goto_4
    move-wide/from16 v24, v0

    goto :goto_5

    :cond_6
    invoke-virtual {v5}, Lo0/y0$a;->g()J

    move-result-wide v0

    goto :goto_4

    :goto_5
    if-eqz v2, :cond_7

    move-object/from16 v21, p5

    goto :goto_6

    :cond_7
    move-object/from16 v21, v3

    :goto_6
    new-instance v3, LM0/C;

    move-object v9, v3

    const v30, 0xf67f

    const/16 v31, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v9 .. v31}, LM0/C;-><init>(JJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;LM0/z;Lq0/h;ILy7/k;)V

    :goto_7
    return-object v3
.end method

.method public static final d(LM0/C;)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LM0/C;->i()LR0/h;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LM0/C;->l()LR0/o;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LM0/C;->n()LR0/q;

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

.method public static final e(LU0/g;LX0/t;)V
    .locals 3

    .prologue
    if-nez p1, :cond_0

    sget-object p1, LX0/t;->c:LX0/t$a;

    invoke-virtual {p1}, LX0/t$a;->a()LX0/t;

    move-result-object p1

    :cond_0
    invoke-virtual {p1}, LX0/t;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Paint;->getFlags()I

    move-result v0

    or-int/lit16 v0, v0, 0x80

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/graphics/Paint;->getFlags()I

    move-result v0

    and-int/lit16 v0, v0, -0x81

    :goto_0
    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setFlags(I)V

    invoke-virtual {p1}, LX0/t;->b()I

    move-result p1

    sget-object v0, LX0/t$b;->a:LX0/t$b$a;

    invoke-virtual {v0}, LX0/t$b$a;->b()I

    move-result v1

    invoke-static {p1, v1}, LX0/t$b;->e(II)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroid/graphics/Paint;->getFlags()I

    move-result p1

    or-int/lit8 p1, p1, 0x40

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setFlags(I)V

    :goto_1
    invoke-virtual {p0, v2}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, LX0/t$b$a;->a()I

    move-result v1

    invoke-static {p1, v1}, LX0/t$b;->e(II)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Landroid/graphics/Paint;->getFlags()I

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, LX0/t$b$a;->c()I

    move-result v0

    invoke-static {p1, v0}, LX0/t$b;->e(II)Z

    move-result p1

    invoke-virtual {p0}, Landroid/graphics/Paint;->getFlags()I

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    :goto_2
    return-void
.end method
