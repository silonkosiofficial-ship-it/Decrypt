.class public abstract LN/G;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN/G$d;
    }
.end annotation


# direct methods
.method public static final a(ZLX0/i;LN/F;LV/n;I)V
    .locals 11

    .prologue
    const v0, -0x50245748

    invoke-interface {p3, v0}, LV/n;->r(I)LV/n;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LV/n;->d(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_3

    invoke-interface {p3, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit16 v3, p4, 0x180

    if-nez v3, :cond_5

    invoke-interface {p3, p2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v1, v3

    :cond_5
    and-int/lit16 v3, v1, 0x93

    const/16 v4, 0x92

    if-ne v3, v4, :cond_7

    invoke-interface {p3}, LV/n;->u()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LV/n;->A()V

    goto/16 :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_8

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1000)"

    invoke-static {v0, v1, v3, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_8
    and-int/lit8 v0, v1, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v0, v2, :cond_9

    move v5, v4

    goto :goto_5

    :cond_9
    move v5, v3

    :goto_5
    invoke-interface {p3, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_a

    sget-object v5, LV/n;->a:LV/n$a;

    invoke-virtual {v5}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_b

    :cond_a
    invoke-virtual {p2, p0}, LN/F;->Q(Z)LH/F;

    move-result-object v6

    invoke-interface {p3, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, LH/F;

    invoke-interface {p3, p2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v5

    if-ne v0, v2, :cond_c

    move v3, v4

    :cond_c
    or-int v0, v5, v3

    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_d

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_e

    :cond_d
    new-instance v2, LN/G$a;

    invoke-direct {v2, p2, p0}, LN/G$a;-><init>(LN/F;Z)V

    invoke-interface {p3, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_e
    move-object v0, v2

    check-cast v0, LN/i;

    invoke-virtual {p2}, LN/F;->O()LS0/V;

    move-result-object v2

    invoke-virtual {v2}, LS0/V;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LM0/N;->m(J)Z

    move-result v4

    sget-object v2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-interface {p3, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_f

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_10

    :cond_f
    new-instance v5, LN/G$b;

    const/4 v3, 0x0

    invoke-direct {v5, v6, v3}, LN/G$b;-><init>(LH/F;Lm7/e;)V

    invoke-interface {p3, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v5, Lx7/p;

    invoke-static {v2, v6, v5}, Lz0/U;->d(Landroidx/compose/ui/d;Ljava/lang/Object;Lx7/p;)Landroidx/compose/ui/d;

    move-result-object v7

    shl-int/lit8 v1, v1, 0x3

    and-int/lit16 v9, v1, 0x3f0

    const/16 v10, 0x10

    const-wide/16 v5, 0x0

    move-object v1, v0

    move v2, p0

    move-object v3, p1

    move-object v8, p3

    invoke-static/range {v1 .. v10}, LN/a;->b(LN/i;ZLX0/i;ZJLandroidx/compose/ui/d;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {}, LV/q;->P()V

    :cond_11
    :goto_6
    invoke-interface {p3}, LV/n;->x()LV/e1;

    move-result-object p3

    if-eqz p3, :cond_12

    new-instance v0, LN/G$c;

    invoke-direct {v0, p0, p1, p2, p4}, LN/G$c;-><init>(ZLX0/i;LN/F;I)V

    invoke-interface {p3, v0}, LV/e1;->a(Lx7/p;)V

    :cond_12
    return-void
.end method

.method public static final b(LN/F;J)J
    .locals 7

    .prologue
    invoke-virtual {p0}, LN/F;->A()Ln0/g;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ln0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0}, LN/F;->N()LM0/d;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p0}, LN/F;->C()LH/k;

    move-result-object v2

    const/4 v3, -0x1

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    sget-object v4, LN/G$d;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    :goto_0
    if-eq v2, v3, :cond_9

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v2, v3, :cond_3

    if-eq v2, v4, :cond_3

    const/4 v3, 0x3

    if-ne v2, v3, :cond_2

    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v2

    invoke-virtual {v2}, LS0/V;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LM0/N;->i(J)I

    move-result v2

    goto :goto_1

    :cond_2
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0

    :cond_3
    invoke-virtual {p0}, LN/F;->O()LS0/V;

    move-result-object v2

    invoke-virtual {v2}, LS0/V;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LM0/N;->n(J)I

    move-result v2

    :goto_1
    invoke-virtual {p0}, LN/F;->L()LH/w;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v3}, LH/w;->j()LH/V;

    move-result-object v3

    if-nez v3, :cond_4

    goto/16 :goto_3

    :cond_4
    invoke-virtual {p0}, LN/F;->L()LH/w;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5}, LH/w;->v()LH/D;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5}, LH/D;->k()LM0/d;

    move-result-object v5

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, LN/F;->J()LS0/L;

    move-result-object p0

    invoke-interface {p0, v2}, LS0/L;->b(I)I

    move-result p0

    const/4 v2, 0x0

    invoke-virtual {v5}, LM0/d;->length()I

    move-result v5

    invoke-static {p0, v2, v5}, LE7/j;->k(III)I

    move-result p0

    invoke-virtual {v3, v0, v1}, LH/V;->j(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->m(J)F

    move-result v0

    invoke-virtual {v3}, LH/V;->f()LM0/K;

    move-result-object v1

    invoke-virtual {v1, p0}, LM0/K;->q(I)I

    move-result p0

    invoke-virtual {v1, p0}, LM0/K;->s(I)F

    move-result v2

    invoke-virtual {v1, p0}, LM0/K;->t(I)F

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v5

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-static {v0, v5, v2}, LE7/j;->j(FFF)F

    move-result v2

    sget-object v3, LY0/t;->b:LY0/t$a;

    invoke-virtual {v3}, LY0/t$a;->a()J

    move-result-wide v5

    invoke-static {p1, p2, v5, v6}, LY0/t;->e(JJ)Z

    move-result v3

    if-nez v3, :cond_6

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {p1, p2}, LY0/t;->g(J)I

    move-result p1

    div-int/2addr p1, v4

    int-to-float p1, p1

    cmpl-float p1, v0, p1

    if-lez p1, :cond_6

    sget-object p0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p0}, Ln0/g$a;->b()J

    move-result-wide p0

    return-wide p0

    :cond_6
    invoke-virtual {v1, p0}, LM0/K;->v(I)F

    move-result p1

    invoke-virtual {v1, p0}, LM0/K;->m(I)F

    move-result p0

    sub-float/2addr p0, p1

    int-to-float p2, v4

    div-float/2addr p0, p2

    add-float/2addr p0, p1

    invoke-static {v2, p0}, Ln0/h;->a(FF)J

    move-result-wide p0

    return-wide p0

    :cond_7
    :goto_2
    sget-object p0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p0}, Ln0/g$a;->b()J

    move-result-wide p0

    return-wide p0

    :cond_8
    :goto_3
    sget-object p0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p0}, Ln0/g$a;->b()J

    move-result-wide p0

    return-wide p0

    :cond_9
    sget-object p0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p0}, Ln0/g$a;->b()J

    move-result-wide p0

    return-wide p0

    :cond_a
    :goto_4
    sget-object p0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p0}, Ln0/g$a;->b()J

    move-result-wide p0

    return-wide p0

    :cond_b
    sget-object p0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p0}, Ln0/g$a;->b()J

    move-result-wide p0

    return-wide p0
.end method

.method public static final c(LN/F;Z)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LN/F;->L()LH/w;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LH/w;->i()LD0/t;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LN/z;->b(LD0/t;)Ln0/i;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LN/F;->G(Z)J

    move-result-wide p0

    invoke-static {v0, p0, p1}, LN/z;->a(Ln0/i;J)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
