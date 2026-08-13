.class public abstract LN/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LN/w;LN/c;)LN/k;
    .locals 0

    invoke-static {p0, p1}, LN/r;->e(LN/w;LN/c;)LN/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LN/j;IIIZZ)LN/k$a;
    .locals 0

    invoke-static/range {p0 .. p5}, LN/r;->k(LN/j;IIIZZ)LN/k$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LN/w;LN/j;LN/k$a;)LN/k$a;
    .locals 0

    invoke-static {p0, p1, p2}, LN/r;->l(LN/w;LN/j;LN/k$a;)LN/k$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Li7/n;)I
    .locals 0

    invoke-static {p0}, LN/r;->m(Li7/n;)I

    move-result p0

    return p0
.end method

.method private static final e(LN/w;LN/c;)LN/k;
    .locals 6

    .prologue
    invoke-interface {p0}, LN/w;->i()LN/e;

    move-result-object v0

    sget-object v1, LN/e;->C:LN/e;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    new-instance v1, LN/k;

    invoke-interface {p0}, LN/w;->k()LN/j;

    move-result-object v4

    invoke-interface {p0}, LN/w;->l()I

    move-result v5

    invoke-static {v4, v0, v3, v5, p1}, LN/r;->f(LN/j;ZZILN/c;)LN/k$a;

    move-result-object v3

    invoke-interface {p0}, LN/w;->h()LN/j;

    move-result-object v4

    invoke-interface {p0}, LN/w;->g()I

    move-result p0

    invoke-static {v4, v0, v2, p0, p1}, LN/r;->f(LN/j;ZZILN/c;)LN/k$a;

    move-result-object p0

    invoke-direct {v1, v3, p0, v0}, LN/k;-><init>(LN/k$a;LN/k$a;Z)V

    return-object v1
.end method

.method private static final f(LN/j;ZZILN/c;)LN/k$a;
    .locals 2

    .prologue
    if-eqz p2, :cond_0

    invoke-virtual {p0}, LN/j;->g()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LN/j;->e()I

    move-result v0

    :goto_0
    invoke-virtual {p0}, LN/j;->i()I

    move-result v1

    if-eq p3, v1, :cond_1

    invoke-virtual {p0, v0}, LN/j;->a(I)LN/k$a;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-interface {p4, p0, v0}, LN/c;->a(LN/j;I)J

    move-result-wide p3

    xor-int/2addr p1, p2

    if-eqz p1, :cond_2

    invoke-static {p3, p4}, LM0/N;->n(J)I

    move-result p1

    goto :goto_1

    :cond_2
    invoke-static {p3, p4}, LM0/N;->i(J)I

    move-result p1

    :goto_1
    invoke-virtual {p0, p1}, LN/j;->a(I)LN/k$a;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LN/k$a;LN/j;I)LN/k$a;
    .locals 7

    invoke-virtual {p1}, LN/j;->k()LM0/K;

    move-result-object p1

    invoke-virtual {p1, p2}, LM0/K;->c(I)LX0/i;

    move-result-object v1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    move-object v0, p0

    move v2, p2

    invoke-static/range {v0 .. v6}, LN/k$a;->b(LN/k$a;LX0/i;IJILjava/lang/Object;)LN/k$a;

    move-result-object p0

    return-object p0
.end method

.method public static final h(LN/k;LN/w;)LN/k;
    .locals 3

    .prologue
    invoke-static {p0, p1}, LN/x;->d(LN/k;LN/w;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p1}, LN/w;->c()LN/j;

    move-result-object v0

    invoke-virtual {v0}, LN/j;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, LN/w;->a()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_2

    invoke-interface {p1}, LN/w;->d()LN/k;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, LN/r;->i(LN/k;LN/w;)LN/k;

    move-result-object p0

    :cond_2
    :goto_0
    return-object p0
.end method

.method private static final i(LN/k;LN/w;)LN/k;
    .locals 12

    .prologue
    invoke-interface {p1}, LN/w;->c()LN/j;

    move-result-object v0

    invoke-virtual {v0}, LN/j;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, LN/j;->g()I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    if-nez v2, :cond_1

    invoke-static {v1, v4}, LH/A;->a(Ljava/lang/String;I)I

    move-result v1

    invoke-interface {p1}, LN/w;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LN/k;->e()LN/k$a;

    move-result-object p1

    invoke-static {p1, v0, v1}, LN/r;->g(LN/k$a;LN/j;I)LN/k$a;

    move-result-object v3

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x1

    :goto_1
    move-object v2, p0

    invoke-static/range {v2 .. v7}, LN/k;->b(LN/k;LN/k$a;LN/k$a;ZILjava/lang/Object;)LN/k;

    move-result-object p0

    goto/16 :goto_6

    :cond_0
    invoke-virtual {p0}, LN/k;->c()LN/k$a;

    move-result-object p1

    invoke-static {p1, v0, v1}, LN/r;->g(LN/k$a;LN/j;I)LN/k$a;

    move-result-object v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    :goto_2
    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    if-ne v2, v3, :cond_3

    invoke-static {v1, v3}, LH/A;->b(Ljava/lang/String;I)I

    move-result v1

    invoke-interface {p1}, LN/w;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LN/k;->e()LN/k$a;

    move-result-object p1

    invoke-static {p1, v0, v1}, LN/r;->g(LN/k$a;LN/j;I)LN/k$a;

    move-result-object v3

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, LN/k;->c()LN/k$a;

    move-result-object p1

    invoke-static {p1, v0, v1}, LN/r;->g(LN/k$a;LN/j;I)LN/k$a;

    move-result-object v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    goto :goto_0

    :cond_3
    invoke-interface {p1}, LN/w;->d()LN/k;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, LN/k;->d()Z

    move-result v3

    const/4 v5, 0x1

    if-ne v3, v5, :cond_4

    move v9, v5

    goto :goto_3

    :cond_4
    move v9, v4

    :goto_3
    invoke-interface {p1}, LN/w;->b()Z

    move-result v3

    xor-int/2addr v3, v9

    if-eqz v3, :cond_5

    invoke-static {v1, v2}, LH/A;->b(Ljava/lang/String;I)I

    move-result v1

    goto :goto_4

    :cond_5
    invoke-static {v1, v2}, LH/A;->a(Ljava/lang/String;I)I

    move-result v1

    :goto_4
    invoke-interface {p1}, LN/w;->b()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, LN/k;->e()LN/k$a;

    move-result-object p1

    invoke-static {p1, v0, v1}, LN/r;->g(LN/k$a;LN/j;I)LN/k$a;

    move-result-object v7

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v8, 0x0

    :goto_5
    move-object v6, p0

    invoke-static/range {v6 .. v11}, LN/k;->b(LN/k;LN/k$a;LN/k$a;ZILjava/lang/Object;)LN/k;

    move-result-object p0

    goto :goto_6

    :cond_6
    invoke-virtual {p0}, LN/k;->c()LN/k$a;

    move-result-object p1

    invoke-static {p1, v0, v1}, LN/r;->g(LN/k$a;LN/j;I)LN/k$a;

    move-result-object v8

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v7, 0x0

    goto :goto_5

    :goto_6
    return-object p0
.end method

.method private static final j(LN/j;IZ)Z
    .locals 4

    .prologue
    invoke-virtual {p0}, LN/j;->f()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, LN/j;->f()I

    move-result v0

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, LN/j;->d()LN/e;

    move-result-object v0

    sget-object v3, LN/e;->C:LN/e;

    if-ne v0, v3, :cond_2

    move v0, v2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    xor-int/2addr p2, v0

    invoke-virtual {p0}, LN/j;->f()I

    move-result p0

    if-eqz p2, :cond_4

    if-ge p1, p0, :cond_3

    goto :goto_1

    :cond_3
    move v2, v1

    goto :goto_1

    :cond_4
    if-le p1, p0, :cond_3

    :goto_1
    return v2
.end method

.method private static final k(LN/j;IIIZZ)LN/k$a;
    .locals 5

    .prologue
    invoke-virtual {p0}, LN/j;->k()LM0/K;

    move-result-object v0

    invoke-virtual {v0, p2}, LM0/K;->C(I)J

    move-result-wide v0

    invoke-virtual {p0}, LN/j;->k()LM0/K;

    move-result-object v2

    invoke-static {v0, v1}, LM0/N;->n(J)I

    move-result v3

    invoke-virtual {v2, v3}, LM0/K;->q(I)I

    move-result v2

    if-ne v2, p1, :cond_0

    invoke-static {v0, v1}, LM0/N;->n(J)I

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LN/j;->k()LM0/K;

    move-result-object v2

    invoke-virtual {v2}, LM0/K;->n()I

    move-result v2

    if-lt p1, v2, :cond_1

    invoke-virtual {p0}, LN/j;->k()LM0/K;

    move-result-object v2

    invoke-virtual {p0}, LN/j;->k()LM0/K;

    move-result-object v3

    invoke-virtual {v3}, LM0/K;->n()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v3}, LM0/K;->u(I)I

    move-result v2

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LN/j;->k()LM0/K;

    move-result-object v2

    invoke-virtual {v2, p1}, LM0/K;->u(I)I

    move-result v2

    :goto_0
    invoke-virtual {p0}, LN/j;->k()LM0/K;

    move-result-object v3

    invoke-static {v0, v1}, LM0/N;->i(J)I

    move-result v4

    invoke-virtual {v3, v4}, LM0/K;->q(I)I

    move-result v3

    if-ne v3, p1, :cond_2

    invoke-static {v0, v1}, LM0/N;->i(J)I

    move-result p1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, LN/j;->k()LM0/K;

    move-result-object v0

    invoke-virtual {v0}, LM0/K;->n()I

    move-result v0

    const/4 v1, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-lt p1, v0, :cond_3

    invoke-virtual {p0}, LN/j;->k()LM0/K;

    move-result-object p1

    invoke-virtual {p0}, LN/j;->k()LM0/K;

    move-result-object v0

    invoke-virtual {v0}, LM0/K;->n()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0, v4, v3, v1}, LM0/K;->p(LM0/K;IZILjava/lang/Object;)I

    move-result p1

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, LN/j;->k()LM0/K;

    move-result-object v0

    invoke-static {v0, p1, v4, v3, v1}, LM0/K;->p(LM0/K;IZILjava/lang/Object;)I

    move-result p1

    :goto_1
    if-ne v2, p3, :cond_4

    invoke-virtual {p0, p1}, LN/j;->a(I)LN/k$a;

    move-result-object p0

    return-object p0

    :cond_4
    if-ne p1, p3, :cond_5

    invoke-virtual {p0, v2}, LN/j;->a(I)LN/k$a;

    move-result-object p0

    return-object p0

    :cond_5
    xor-int p3, p4, p5

    if-eqz p3, :cond_6

    if-gt p2, p1, :cond_7

    goto :goto_2

    :cond_6
    if-lt p2, v2, :cond_8

    :cond_7
    move v2, p1

    :cond_8
    :goto_2
    invoke-virtual {p0, v2}, LN/j;->a(I)LN/k$a;

    move-result-object p0

    return-object p0
.end method

.method private static final l(LN/w;LN/j;LN/k$a;)LN/k$a;
    .locals 10

    .prologue
    invoke-interface {p0}, LN/w;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LN/j;->g()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LN/j;->e()I

    move-result v0

    :goto_0
    invoke-interface {p0}, LN/w;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, LN/w;->l()I

    move-result v1

    goto :goto_1

    :cond_1
    invoke-interface {p0}, LN/w;->g()I

    move-result v1

    :goto_1
    invoke-virtual {p1}, LN/j;->i()I

    move-result v2

    if-eq v1, v2, :cond_2

    invoke-virtual {p1, v0}, LN/j;->a(I)LN/k$a;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object v7, Li7/r;->E:Li7/r;

    new-instance v1, LN/r$b;

    invoke-direct {v1, p1, v0}, LN/r$b;-><init>(LN/j;I)V

    invoke-static {v7, v1}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v8

    invoke-interface {p0}, LN/w;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, LN/j;->e()I

    move-result v1

    :goto_2
    move v4, v1

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, LN/j;->g()I

    move-result v1

    goto :goto_2

    :goto_3
    new-instance v9, LN/r$a;

    move-object v1, v9

    move-object v2, p1

    move v3, v0

    move-object v5, p0

    move-object v6, v8

    invoke-direct/range {v1 .. v6}, LN/r$a;-><init>(LN/j;IILN/w;Li7/n;)V

    invoke-static {v7, v9}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v1

    invoke-virtual {p1}, LN/j;->h()J

    move-result-wide v2

    invoke-virtual {p2}, LN/k$a;->d()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_4

    invoke-static {v1}, LN/r;->n(Li7/n;)LN/k$a;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-virtual {p1}, LN/j;->f()I

    move-result v2

    if-ne v0, v2, :cond_5

    return-object p2

    :cond_5
    invoke-virtual {p1}, LN/j;->k()LM0/K;

    move-result-object v3

    invoke-virtual {v3, v2}, LM0/K;->q(I)I

    move-result v2

    invoke-static {v8}, LN/r;->m(Li7/n;)I

    move-result v3

    if-eq v3, v2, :cond_6

    invoke-static {v1}, LN/r;->n(Li7/n;)LN/k$a;

    move-result-object p0

    return-object p0

    :cond_6
    invoke-virtual {p2}, LN/k$a;->c()I

    move-result p2

    invoke-virtual {p1}, LN/j;->k()LM0/K;

    move-result-object v2

    invoke-virtual {v2, p2}, LM0/K;->C(I)J

    move-result-wide v2

    invoke-interface {p0}, LN/w;->b()Z

    move-result p0

    invoke-static {p1, v0, p0}, LN/r;->j(LN/j;IZ)Z

    move-result p0

    if-nez p0, :cond_7

    invoke-virtual {p1, v0}, LN/j;->a(I)LN/k$a;

    move-result-object p0

    return-object p0

    :cond_7
    invoke-static {v2, v3}, LM0/N;->n(J)I

    move-result p0

    if-eq p2, p0, :cond_9

    invoke-static {v2, v3}, LM0/N;->i(J)I

    move-result p0

    if-ne p2, p0, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p1, v0}, LN/j;->a(I)LN/k$a;

    move-result-object p0

    return-object p0

    :cond_9
    :goto_4
    invoke-static {v1}, LN/r;->n(Li7/n;)LN/k$a;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Li7/n;)I
    .locals 0

    invoke-interface {p0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final n(Li7/n;)LN/k$a;
    .locals 0

    invoke-interface {p0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LN/k$a;

    return-object p0
.end method
