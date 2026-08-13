.class public abstract Lu0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lu0/q;JJLjava/lang/String;Lo0/z0;Z)Lu0/q;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu0/q;->u(J)V

    invoke-virtual {p0, p7}, Lu0/q;->q(Z)V

    invoke-virtual {p0, p6}, Lu0/q;->r(Lo0/z0;)V

    invoke-virtual {p0, p3, p4}, Lu0/q;->v(J)V

    invoke-virtual {p0, p5}, Lu0/q;->t(Ljava/lang/String;)V

    return-object p0
.end method

.method private static final b(JI)Lo0/z0;
    .locals 2

    .prologue
    const-wide/16 v0, 0x10

    cmp-long v0, p0, v0

    if-eqz v0, :cond_0

    sget-object v0, Lo0/z0;->b:Lo0/z0$a;

    invoke-virtual {v0, p0, p1, p2}, Lo0/z0$a;->a(JI)Lo0/z0;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final c(Lu0/c;Lu0/n;)Lu0/c;
    .locals 5

    .prologue
    invoke-virtual {p1}, Lu0/n;->M()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Lu0/n;->e(I)Lu0/p;

    move-result-object v2

    instance-of v3, v2, Lu0/s;

    if-eqz v3, :cond_0

    new-instance v3, Lu0/g;

    invoke-direct {v3}, Lu0/g;-><init>()V

    check-cast v2, Lu0/s;

    invoke-virtual {v2}, Lu0/s;->g()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Lu0/g;->k(Ljava/util/List;)V

    invoke-virtual {v2}, Lu0/s;->o()I

    move-result v4

    invoke-virtual {v3, v4}, Lu0/g;->l(I)V

    invoke-virtual {v2}, Lu0/s;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lu0/g;->j(Ljava/lang/String;)V

    invoke-virtual {v2}, Lu0/s;->d()Lo0/n0;

    move-result-object v4

    invoke-virtual {v3, v4}, Lu0/g;->h(Lo0/n0;)V

    invoke-virtual {v2}, Lu0/s;->e()F

    move-result v4

    invoke-virtual {v3, v4}, Lu0/g;->i(F)V

    invoke-virtual {v2}, Lu0/s;->s()Lo0/n0;

    move-result-object v4

    invoke-virtual {v3, v4}, Lu0/g;->m(Lo0/n0;)V

    invoke-virtual {v2}, Lu0/s;->C()F

    move-result v4

    invoke-virtual {v3, v4}, Lu0/g;->n(F)V

    invoke-virtual {v2}, Lu0/s;->N()F

    move-result v4

    invoke-virtual {v3, v4}, Lu0/g;->r(F)V

    invoke-virtual {v2}, Lu0/s;->D()I

    move-result v4

    invoke-virtual {v3, v4}, Lu0/g;->o(I)V

    invoke-virtual {v2}, Lu0/s;->E()I

    move-result v4

    invoke-virtual {v3, v4}, Lu0/g;->p(I)V

    invoke-virtual {v2}, Lu0/s;->M()F

    move-result v4

    invoke-virtual {v3, v4}, Lu0/g;->q(F)V

    invoke-virtual {v2}, Lu0/s;->Q()F

    move-result v4

    invoke-virtual {v3, v4}, Lu0/g;->u(F)V

    invoke-virtual {v2}, Lu0/s;->O()F

    move-result v4

    invoke-virtual {v3, v4}, Lu0/g;->s(F)V

    invoke-virtual {v2}, Lu0/s;->P()F

    move-result v2

    invoke-virtual {v3, v2}, Lu0/g;->t(F)V

    :goto_1
    invoke-virtual {p0, v1, v3}, Lu0/c;->i(ILu0/l;)V

    goto :goto_2

    :cond_0
    instance-of v3, v2, Lu0/n;

    if-eqz v3, :cond_1

    new-instance v3, Lu0/c;

    invoke-direct {v3}, Lu0/c;-><init>()V

    check-cast v2, Lu0/n;

    invoke-virtual {v2}, Lu0/n;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lu0/c;->p(Ljava/lang/String;)V

    invoke-virtual {v2}, Lu0/n;->C()F

    move-result v4

    invoke-virtual {v3, v4}, Lu0/c;->s(F)V

    invoke-virtual {v2}, Lu0/n;->D()F

    move-result v4

    invoke-virtual {v3, v4}, Lu0/c;->t(F)V

    invoke-virtual {v2}, Lu0/n;->E()F

    move-result v4

    invoke-virtual {v3, v4}, Lu0/c;->u(F)V

    invoke-virtual {v2}, Lu0/n;->N()F

    move-result v4

    invoke-virtual {v3, v4}, Lu0/c;->v(F)V

    invoke-virtual {v2}, Lu0/n;->O()F

    move-result v4

    invoke-virtual {v3, v4}, Lu0/c;->w(F)V

    invoke-virtual {v2}, Lu0/n;->o()F

    move-result v4

    invoke-virtual {v3, v4}, Lu0/c;->q(F)V

    invoke-virtual {v2}, Lu0/n;->s()F

    move-result v4

    invoke-virtual {v3, v4}, Lu0/c;->r(F)V

    invoke-virtual {v2}, Lu0/n;->f()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Lu0/c;->o(Ljava/util/List;)V

    invoke-static {v3, v2}, Lu0/r;->c(Lu0/c;Lu0/n;)Lu0/c;

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_2
    return-object p0
.end method

.method public static final d(LY0/e;Lu0/d;Lu0/c;)Lu0/q;
    .locals 10

    invoke-virtual {p1}, Lu0/d;->e()F

    move-result v0

    invoke-virtual {p1}, Lu0/d;->d()F

    move-result v1

    invoke-static {p0, v0, v1}, Lu0/r;->e(LY0/e;FF)J

    move-result-wide v3

    invoke-virtual {p1}, Lu0/d;->l()F

    move-result p0

    invoke-virtual {p1}, Lu0/d;->k()F

    move-result v0

    invoke-static {v3, v4, p0, v0}, Lu0/r;->f(JFF)J

    move-result-wide v5

    new-instance v2, Lu0/q;

    invoke-direct {v2, p2}, Lu0/q;-><init>(Lu0/c;)V

    invoke-virtual {p1}, Lu0/d;->g()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lu0/d;->j()J

    move-result-wide v0

    invoke-virtual {p1}, Lu0/d;->i()I

    move-result p0

    invoke-static {v0, v1, p0}, Lu0/r;->b(JI)Lo0/z0;

    move-result-object v8

    invoke-virtual {p1}, Lu0/d;->c()Z

    move-result v9

    invoke-static/range {v2 .. v9}, Lu0/r;->a(Lu0/q;JJLjava/lang/String;Lo0/z0;Z)Lu0/q;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LY0/e;FF)J
    .locals 0

    invoke-interface {p0, p1}, LY0/e;->B0(F)F

    move-result p1

    invoke-interface {p0, p2}, LY0/e;->B0(F)F

    move-result p0

    invoke-static {p1, p0}, Ln0/n;->a(FF)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final f(JFF)J
    .locals 1

    .prologue
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Ln0/m;->i(J)F

    move-result p2

    :cond_0
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0, p1}, Ln0/m;->g(J)F

    move-result p3

    :cond_1
    invoke-static {p2, p3}, Ln0/n;->a(FF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final g(Lu0/d;LV/n;I)Lu0/q;
    .locals 6

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:171)"

    const v2, 0x544566b0

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object p2

    invoke-interface {p1, p2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LY0/e;

    invoke-virtual {p0}, Lu0/d;->f()I

    move-result v0

    int-to-float v0, v0

    invoke-interface {p2}, LY0/e;->getDensity()F

    move-result v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v2, v0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    invoke-interface {p1, v0, v1}, LV/n;->j(J)Z

    move-result v0

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v0, Lu0/c;

    invoke-direct {v0}, Lu0/c;-><init>()V

    invoke-virtual {p0}, Lu0/d;->h()Lu0/n;

    move-result-object v1

    invoke-static {v0, v1}, Lu0/r;->c(Lu0/c;Lu0/n;)Lu0/c;

    sget-object v1, Li7/M;->a:Li7/M;

    invoke-static {p2, p0, v0}, Lu0/r;->d(LY0/e;Lu0/d;Lu0/c;)Lu0/q;

    move-result-object v1

    invoke-interface {p1, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lu0/q;

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    return-object v1
.end method
