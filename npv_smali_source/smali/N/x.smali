.class public abstract LN/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LM0/K;I)LX0/i;
    .locals 0

    invoke-static {p0, p1}, LN/x;->b(LM0/K;I)LX0/i;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LM0/K;I)LX0/i;
    .locals 1

    .prologue
    invoke-static {p0, p1}, LN/x;->e(LM0/K;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LM0/K;->y(I)LX0/i;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LM0/K;->c(I)LX0/i;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final c(LM0/K;IIIJZZ)LN/w;
    .locals 11

    .prologue
    move-object v7, p0

    new-instance v8, LN/D;

    if-eqz p6, :cond_0

    const/4 v0, 0x0

    :goto_0
    move-object v9, v0

    goto :goto_1

    :cond_0
    new-instance v0, LN/k;

    new-instance v1, LN/k$a;

    invoke-static/range {p4 .. p5}, LM0/N;->n(J)I

    move-result v2

    invoke-static {p0, v2}, LN/x;->b(LM0/K;I)LX0/i;

    move-result-object v2

    invoke-static/range {p4 .. p5}, LM0/N;->n(J)I

    move-result v3

    const-wide/16 v4, 0x1

    invoke-direct {v1, v2, v3, v4, v5}, LN/k$a;-><init>(LX0/i;IJ)V

    new-instance v2, LN/k$a;

    invoke-static/range {p4 .. p5}, LM0/N;->i(J)I

    move-result v3

    invoke-static {p0, v3}, LN/x;->b(LM0/K;I)LX0/i;

    move-result-object v3

    invoke-static/range {p4 .. p5}, LM0/N;->i(J)I

    move-result v6

    invoke-direct {v2, v3, v6, v4, v5}, LN/k$a;-><init>(LX0/i;IJ)V

    invoke-static/range {p4 .. p5}, LM0/N;->m(J)Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, LN/k;-><init>(LN/k$a;LN/k$a;Z)V

    goto :goto_0

    :goto_1
    new-instance v10, LN/j;

    const-wide/16 v1, 0x1

    const/4 v3, 0x1

    move-object v0, v10

    move v4, p1

    move v5, p2

    move v6, p3

    move-object v7, p0

    invoke-direct/range {v0 .. v7}, LN/j;-><init>(JIIIILM0/K;)V

    const/4 v0, 0x1

    const/4 v1, 0x1

    move-object p0, v8

    move/from16 p1, p7

    move p2, v0

    move p3, v1

    move-object p4, v9

    move-object/from16 p5, v10

    invoke-direct/range {p0 .. p5}, LN/D;-><init>(ZIILN/k;LN/j;)V

    return-object v8
.end method

.method public static final d(LN/k;LN/w;)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, LN/k;->e()LN/k$a;

    move-result-object v1

    invoke-virtual {v1}, LN/k$a;->d()J

    move-result-wide v1

    invoke-virtual {p0}, LN/k;->c()LN/k$a;

    move-result-object v3

    invoke-virtual {v3}, LN/k$a;->d()J

    move-result-wide v3

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    if-nez v1, :cond_3

    invoke-virtual {p0}, LN/k;->e()LN/k$a;

    move-result-object p1

    invoke-virtual {p1}, LN/k$a;->c()I

    move-result p1

    invoke-virtual {p0}, LN/k;->c()LN/k$a;

    move-result-object p0

    invoke-virtual {p0}, LN/k$a;->c()I

    move-result p0

    if-ne p1, p0, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0

    :cond_3
    invoke-virtual {p0}, LN/k;->d()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, LN/k;->e()LN/k$a;

    move-result-object v1

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, LN/k;->c()LN/k$a;

    move-result-object v1

    :goto_1
    invoke-virtual {v1}, LN/k$a;->c()I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    invoke-virtual {p0}, LN/k;->d()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p0}, LN/k;->c()LN/k$a;

    move-result-object p0

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, LN/k;->e()LN/k$a;

    move-result-object p0

    :goto_2
    invoke-interface {p1}, LN/w;->e()LN/j;

    move-result-object v1

    invoke-virtual {v1}, LN/j;->l()I

    move-result v1

    invoke-virtual {p0}, LN/k$a;->c()I

    move-result p0

    if-eq v1, p0, :cond_7

    return v2

    :cond_7
    new-instance p0, Ly7/K;

    invoke-direct {p0}, Ly7/K;-><init>()V

    iput-boolean v0, p0, Ly7/K;->C:Z

    new-instance v0, LN/x$a;

    invoke-direct {v0, p0}, LN/x$a;-><init>(Ly7/K;)V

    invoke-interface {p1, v0}, LN/w;->j(Lx7/l;)V

    iget-boolean p0, p0, Ly7/K;->C:Z

    return p0
.end method

.method private static final e(LM0/K;I)Z
    .locals 3

    .prologue
    invoke-virtual {p0}, LM0/K;->l()LM0/J;

    move-result-object v0

    invoke-virtual {v0}, LM0/J;->j()LM0/d;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LM0/K;->q(I)I

    move-result v0

    if-eqz p1, :cond_1

    add-int/lit8 v2, p1, -0x1

    invoke-virtual {p0, v2}, LM0/K;->q(I)I

    move-result v2

    if-eq v0, v2, :cond_2

    :cond_1
    invoke-virtual {p0}, LM0/K;->l()LM0/J;

    move-result-object v2

    invoke-virtual {v2}, LM0/J;->j()LM0/d;

    move-result-object v2

    invoke-virtual {v2}, LM0/d;->length()I

    move-result v2

    if-eq p1, v2, :cond_3

    add-int/2addr p1, v1

    invoke-virtual {p0, p1}, LM0/K;->q(I)I

    move-result p0

    if-eq v0, p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1
.end method
