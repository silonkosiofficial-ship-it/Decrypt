.class public abstract LH/U;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LM0/K;LM0/d;LM0/P;Ljava/util/List;IZILY0/e;LY0/v;LR0/h$b;J)Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LM0/K;->l()LM0/J;

    move-result-object v0

    invoke-virtual {p0}, LM0/K;->w()LM0/j;

    move-result-object p0

    invoke-virtual {p0}, LM0/j;->j()LM0/k;

    move-result-object p0

    invoke-virtual {p0}, LM0/k;->c()Z

    move-result p0

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, LM0/J;->j()LM0/d;

    move-result-object p0

    invoke-static {p0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {v0}, LM0/J;->i()LM0/P;

    move-result-object p0

    invoke-virtual {p0, p2}, LM0/P;->G(LM0/P;)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {v0}, LM0/J;->g()Ljava/util/List;

    move-result-object p0

    invoke-static {p0, p3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {v0}, LM0/J;->e()I

    move-result p0

    if-ne p0, p4, :cond_4

    invoke-virtual {v0}, LM0/J;->h()Z

    move-result p0

    if-ne p0, p5, :cond_4

    invoke-virtual {v0}, LM0/J;->f()I

    move-result p0

    invoke-static {p0, p6}, LX0/u;->e(II)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {v0}, LM0/J;->b()LY0/e;

    move-result-object p0

    invoke-static {p0, p7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {v0}, LM0/J;->d()LY0/v;

    move-result-object p0

    if-ne p0, p8, :cond_4

    invoke-virtual {v0}, LM0/J;->c()LR0/h$b;

    move-result-object p0

    invoke-static {p0, p9}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p10, p11}, LY0/b;->n(J)I

    move-result p0

    invoke-virtual {v0}, LM0/J;->a()J

    move-result-wide p1

    invoke-static {p1, p2}, LY0/b;->n(J)I

    move-result p1

    if-eq p0, p1, :cond_2

    return v1

    :cond_2
    const/4 p0, 0x1

    if-nez p5, :cond_3

    sget-object p1, LX0/u;->a:LX0/u$a;

    invoke-virtual {p1}, LX0/u$a;->b()I

    move-result p1

    invoke-static {p6, p1}, LX0/u;->e(II)Z

    move-result p1

    if-nez p1, :cond_3

    return p0

    :cond_3
    invoke-static {p10, p11}, LY0/b;->l(J)I

    move-result p1

    invoke-virtual {v0}, LM0/J;->a()J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/b;->l(J)I

    move-result p2

    if-ne p1, p2, :cond_4

    invoke-static {p10, p11}, LY0/b;->k(J)I

    move-result p1

    invoke-virtual {v0}, LM0/J;->a()J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/b;->k(J)I

    move-result p2

    if-ne p1, p2, :cond_4

    move v1, p0

    :cond_4
    :goto_0
    return v1
.end method
