.class public abstract LK/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final A(I)Z
    .locals 2

    .prologue
    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result v0

    const/16 v1, 0xe

    if-eq v0, v1, :cond_1

    const/16 v1, 0xd

    if-eq v0, v1, :cond_1

    const/16 v0, 0xa

    if-ne p0, v0, :cond_0

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

.method private static final B(I)Z
    .locals 1

    .prologue
    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result p0

    const/16 v0, 0x17

    if-eq p0, v0, :cond_1

    const/16 v0, 0x14

    if-eq p0, v0, :cond_1

    const/16 v0, 0x16

    if-eq p0, v0, :cond_1

    const/16 v0, 0x1e

    if-eq p0, v0, :cond_1

    const/16 v0, 0x1d

    if-eq p0, v0, :cond_1

    const/16 v0, 0x18

    if-eq p0, v0, :cond_1

    const/16 v0, 0x15

    if-ne p0, v0, :cond_0

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

.method private static final C(I)Z
    .locals 1

    .prologue
    invoke-static {p0}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0xa0

    if-ne p0, v0, :cond_0

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

.method private static final D(I)Z
    .locals 1

    .prologue
    invoke-static {p0}, LK/j0;->C(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LK/j0;->A(I)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final E(Ljava/lang/CharSequence;I)J
    .locals 3

    .prologue
    move v0, p1

    :goto_0
    if-lez v0, :cond_1

    invoke-static {p0, v0}, LK/f;->c(Ljava/lang/CharSequence;I)I

    move-result v1

    invoke-static {v1}, LK/j0;->C(I)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge p1, v1, :cond_3

    invoke-static {p0, p1}, LK/f;->b(Ljava/lang/CharSequence;I)I

    move-result v1

    invoke-static {v1}, LK/j0;->C(I)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {v1}, LK/f;->a(I)I

    move-result v1

    add-int/2addr p1, v1

    goto :goto_1

    :cond_3
    :goto_2
    invoke-static {v0, p1}, LM0/O;->b(II)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final F(Landroid/graphics/PointF;)J
    .locals 2

    iget v0, p0, Landroid/graphics/PointF;->x:F

    iget p0, p0, Landroid/graphics/PointF;->y:F

    invoke-static {v0, p0}, Ln0/h;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic a(JLjava/lang/CharSequence;)J
    .locals 0

    invoke-static {p0, p1, p2}, LK/j0;->m(JLjava/lang/CharSequence;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final varargs synthetic b([LS0/i;)LS0/i;
    .locals 0

    invoke-static {p0}, LK/j0;->n([LS0/i;)LS0/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LH/w;JLandroidx/compose/ui/platform/A1;)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LK/j0;->q(LH/w;JLandroidx/compose/ui/platform/A1;)I

    move-result p0

    return p0
.end method

.method public static final synthetic d(LK/y0;JLandroidx/compose/ui/platform/A1;)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LK/j0;->r(LK/y0;JLandroidx/compose/ui/platform/A1;)I

    move-result p0

    return p0
.end method

.method public static final synthetic e(LM0/K;JJLD0/t;Landroidx/compose/ui/platform/A1;)J
    .locals 0

    invoke-static/range {p0 .. p6}, LK/j0;->t(LM0/K;JJLD0/t;Landroidx/compose/ui/platform/A1;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic f(LH/w;Ln0/i;ILM0/I;)J
    .locals 0

    invoke-static {p0, p1, p2, p3}, LK/j0;->v(LH/w;Ln0/i;ILM0/I;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic g(LK/y0;Ln0/i;ILM0/I;)J
    .locals 0

    invoke-static {p0, p1, p2, p3}, LK/j0;->w(LK/y0;Ln0/i;ILM0/I;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic h(LH/w;Ln0/i;Ln0/i;ILM0/I;)J
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LK/j0;->x(LH/w;Ln0/i;Ln0/i;ILM0/I;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic i(LK/y0;Ln0/i;Ln0/i;ILM0/I;)J
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LK/j0;->y(LK/y0;Ln0/i;Ln0/i;ILM0/I;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic j(LM0/K;I)Z
    .locals 0

    invoke-static {p0, p1}, LK/j0;->z(LM0/K;I)Z

    move-result p0

    return p0
.end method

.method public static final synthetic k(Ljava/lang/CharSequence;I)J
    .locals 0

    invoke-static {p0, p1}, LK/j0;->E(Ljava/lang/CharSequence;I)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic l(Landroid/graphics/PointF;)J
    .locals 2

    invoke-static {p0}, LK/j0;->F(Landroid/graphics/PointF;)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final m(JLjava/lang/CharSequence;)J
    .locals 5

    .prologue
    invoke-static {p0, p1}, LM0/N;->n(J)I

    move-result v0

    invoke-static {p0, p1}, LM0/N;->i(J)I

    move-result v1

    const/16 v2, 0xa

    if-lez v0, :cond_0

    invoke-static {p2, v0}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v1, v4, :cond_1

    invoke-static {p2, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v2

    :cond_1
    invoke-static {v3}, LK/j0;->D(I)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-static {v2}, LK/j0;->C(I)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v2}, LK/j0;->B(I)Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_2
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result p0

    sub-int/2addr v0, p0

    if-eqz v0, :cond_3

    invoke-static {p2, v0}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v3

    invoke-static {v3}, LK/j0;->D(I)Z

    move-result p0

    if-nez p0, :cond_2

    :cond_3
    invoke-static {v0, v1}, LM0/O;->b(II)J

    move-result-wide p0

    return-wide p0

    :cond_4
    invoke-static {v2}, LK/j0;->D(I)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-static {v3}, LK/j0;->C(I)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-static {v3}, LK/j0;->B(I)Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_5
    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result p0

    add-int/2addr v1, p0

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-eq v1, p0, :cond_6

    invoke-static {p2, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v2

    invoke-static {v2}, LK/j0;->D(I)Z

    move-result p0

    if-nez p0, :cond_5

    :cond_6
    invoke-static {v0, v1}, LM0/O;->b(II)J

    move-result-wide p0

    :cond_7
    return-wide p0
.end method

.method private static final varargs n([LS0/i;)LS0/i;
    .locals 1

    new-instance v0, LK/j0$a;

    invoke-direct {v0, p0}, LK/j0$a;-><init>([LS0/i;)V

    return-object v0
.end method

.method private static final o(JJ)J
    .locals 1

    invoke-static {p0, p1}, LM0/N;->n(J)I

    move-result v0

    invoke-static {p0, p1}, LM0/N;->n(J)I

    move-result p0

    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    invoke-static {p2, p3}, LM0/N;->i(J)I

    move-result p1

    invoke-static {p2, p3}, LM0/N;->i(J)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, LM0/O;->b(II)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final p(LM0/j;JLandroidx/compose/ui/platform/A1;)I
    .locals 4

    .prologue
    if-eqz p3, :cond_0

    invoke-interface {p3}, Landroidx/compose/ui/platform/A1;->h()F

    move-result p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result v0

    invoke-virtual {p0, v0}, LM0/j;->p(F)I

    move-result v0

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result v1

    invoke-virtual {p0, v0}, LM0/j;->t(I)F

    move-result v2

    sub-float/2addr v2, p3

    cmpg-float v1, v1, v2

    const/4 v2, -0x1

    if-ltz v1, :cond_3

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result v1

    invoke-virtual {p0, v0}, LM0/j;->l(I)F

    move-result v3

    add-float/2addr v3, p3

    cmpl-float v1, v1, v3

    if-lez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v1

    neg-float v3, p3

    cmpg-float v1, v1, v3

    if-ltz v1, :cond_3

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result p1

    invoke-virtual {p0}, LM0/j;->A()F

    move-result p0

    add-float/2addr p0, p3

    cmpl-float p0, p1, p0

    if-lez p0, :cond_2

    goto :goto_1

    :cond_2
    return v0

    :cond_3
    :goto_1
    return v2
.end method

.method private static final q(LH/w;JLandroidx/compose/ui/platform/A1;)I
    .locals 1

    .prologue
    invoke-virtual {p0}, LH/w;->j()LH/V;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LH/V;->f()LM0/K;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LM0/K;->w()LM0/j;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LH/w;->i()LD0/t;

    move-result-object p0

    invoke-static {v0, p1, p2, p0, p3}, LK/j0;->s(LM0/j;JLD0/t;Landroidx/compose/ui/platform/A1;)I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, -0x1

    :goto_0
    return p0
.end method

.method private static final r(LK/y0;JLandroidx/compose/ui/platform/A1;)I
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method private static final s(LM0/j;JLD0/t;Landroidx/compose/ui/platform/A1;)I
    .locals 7

    .prologue
    const/4 v0, -0x1

    if-eqz p3, :cond_1

    invoke-interface {p3, p1, p2}, LD0/t;->s(J)J

    move-result-wide v1

    invoke-static {p0, v1, v2, p4}, LK/j0;->p(LM0/j;JLandroidx/compose/ui/platform/A1;)I

    move-result p1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p1}, LM0/j;->t(I)F

    move-result p2

    invoke-virtual {p0, p1}, LM0/j;->l(I)F

    move-result p1

    add-float/2addr p2, p1

    const/high16 p1, 0x40000000    # 2.0f

    div-float v4, p2, p1

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Ln0/g;->g(JFFILjava/lang/Object;)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LM0/j;->u(J)I

    move-result p0

    return p0

    :cond_1
    return v0
.end method

.method private static final t(LM0/K;JJLD0/t;Landroidx/compose/ui/platform/A1;)J
    .locals 3

    .prologue
    if-eqz p0, :cond_4

    if-nez p5, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p5, p1, p2}, LD0/t;->s(J)J

    move-result-wide p1

    invoke-interface {p5, p3, p4}, LD0/t;->s(J)J

    move-result-wide p3

    invoke-virtual {p0}, LM0/K;->w()LM0/j;

    move-result-object p5

    invoke-static {p5, p1, p2, p6}, LK/j0;->p(LM0/j;JLandroidx/compose/ui/platform/A1;)I

    move-result p5

    invoke-virtual {p0}, LM0/K;->w()LM0/j;

    move-result-object v0

    invoke-static {v0, p3, p4, p6}, LK/j0;->p(LM0/j;JLandroidx/compose/ui/platform/A1;)I

    move-result p6

    const/4 v0, -0x1

    if-ne p5, v0, :cond_1

    if-ne p6, v0, :cond_3

    sget-object p0, LM0/N;->b:LM0/N$a;

    invoke-virtual {p0}, LM0/N$a;->a()J

    move-result-wide p0

    return-wide p0

    :cond_1
    if-ne p6, v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p5, p6}, Ljava/lang/Math;->min(II)I

    move-result p5

    :goto_0
    move p6, p5

    :cond_3
    invoke-virtual {p0, p6}, LM0/K;->v(I)F

    move-result p5

    invoke-virtual {p0, p6}, LM0/K;->m(I)F

    move-result p6

    add-float/2addr p5, p6

    const/4 p6, 0x2

    int-to-float p6, p6

    div-float/2addr p5, p6

    new-instance p6, Ln0/i;

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v0

    invoke-static {p3, p4}, Ln0/g;->m(J)F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    const v1, 0x3dcccccd    # 0.1f

    sub-float v2, p5, v1

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result p1

    invoke-static {p3, p4}, Ln0/g;->m(J)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    add-float/2addr p5, v1

    invoke-direct {p6, v0, v2, p1, p5}, Ln0/i;-><init>(FFFF)V

    invoke-virtual {p0}, LM0/K;->w()LM0/j;

    move-result-object p0

    sget-object p1, LM0/E;->a:LM0/E$a;

    invoke-virtual {p1}, LM0/E$a;->a()I

    move-result p1

    sget-object p2, LM0/I;->a:LM0/I$a;

    invoke-virtual {p2}, LM0/I$a;->g()LM0/I;

    move-result-object p2

    invoke-virtual {p0, p6, p1, p2}, LM0/j;->z(Ln0/i;ILM0/I;)J

    move-result-wide p0

    return-wide p0

    :cond_4
    :goto_1
    sget-object p0, LM0/N;->b:LM0/N$a;

    invoke-virtual {p0}, LM0/N$a;->a()J

    move-result-wide p0

    return-wide p0
.end method

.method private static final u(LM0/j;Ln0/i;LD0/t;ILM0/I;)J
    .locals 2

    .prologue
    if-eqz p0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v0}, Ln0/g$a;->c()J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, LD0/t;->s(J)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ln0/i;->t(J)Ln0/i;

    move-result-object p1

    invoke-virtual {p0, p1, p3, p4}, LM0/j;->z(Ln0/i;ILM0/I;)J

    move-result-wide p0

    return-wide p0

    :cond_1
    :goto_0
    sget-object p0, LM0/N;->b:LM0/N$a;

    invoke-virtual {p0}, LM0/N$a;->a()J

    move-result-wide p0

    return-wide p0
.end method

.method private static final v(LH/w;Ln0/i;ILM0/I;)J
    .locals 1

    .prologue
    invoke-virtual {p0}, LH/w;->j()LH/V;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LH/V;->f()LM0/K;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LM0/K;->w()LM0/j;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, LH/w;->i()LD0/t;

    move-result-object p0

    invoke-static {v0, p1, p0, p2, p3}, LK/j0;->u(LM0/j;Ln0/i;LD0/t;ILM0/I;)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final w(LK/y0;Ln0/i;ILM0/I;)J
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method private static final x(LH/w;Ln0/i;Ln0/i;ILM0/I;)J
    .locals 2

    .prologue
    invoke-static {p0, p1, p3, p4}, LK/j0;->v(LH/w;Ln0/i;ILM0/I;)J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->h(J)Z

    move-result p1

    if-eqz p1, :cond_0

    :goto_0
    sget-object p0, LM0/N;->b:LM0/N$a;

    invoke-virtual {p0}, LM0/N$a;->a()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-static {p0, p2, p3, p4}, LK/j0;->v(LH/w;Ln0/i;ILM0/I;)J

    move-result-wide p0

    invoke-static {p0, p1}, LM0/N;->h(J)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v0, v1, p0, p1}, LK/j0;->o(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final y(LK/y0;Ln0/i;Ln0/i;ILM0/I;)J
    .locals 2

    .prologue
    invoke-static {p0, p1, p3, p4}, LK/j0;->w(LK/y0;Ln0/i;ILM0/I;)J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->h(J)Z

    move-result p1

    if-eqz p1, :cond_0

    :goto_0
    sget-object p0, LM0/N;->b:LM0/N$a;

    invoke-virtual {p0}, LM0/N$a;->a()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-static {p0, p2, p3, p4}, LK/j0;->w(LK/y0;Ln0/i;ILM0/I;)J

    move-result-wide p0

    invoke-static {p0, p1}, LM0/N;->h(J)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v0, v1, p0, p1}, LK/j0;->o(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final z(LM0/K;I)Z
    .locals 5

    .prologue
    invoke-virtual {p0, p1}, LM0/K;->q(I)I

    move-result v0

    invoke-virtual {p0, v0}, LM0/K;->u(I)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq p1, v1, :cond_2

    const/4 v1, 0x2

    const/4 v4, 0x0

    invoke-static {p0, v0, v3, v1, v4}, LM0/K;->p(LM0/K;IZILjava/lang/Object;)I

    move-result v0

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p1}, LM0/K;->c(I)LX0/i;

    move-result-object v0

    sub-int/2addr p1, v2

    invoke-virtual {p0, p1}, LM0/K;->c(I)LX0/i;

    move-result-object p0

    if-eq v0, p0, :cond_1

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    return v2

    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, LM0/K;->y(I)LX0/i;

    move-result-object v0

    invoke-virtual {p0, p1}, LM0/K;->c(I)LX0/i;

    move-result-object p0

    if-eq v0, p0, :cond_3

    goto :goto_2

    :cond_3
    move v2, v3

    :goto_2
    return v2
.end method
