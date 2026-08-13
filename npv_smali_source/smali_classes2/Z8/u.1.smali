.class abstract synthetic LZ8/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LZ8/x;)LZ8/C;
    .locals 2

    new-instance v0, LZ8/z;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LZ8/z;-><init>(LZ8/C;LW8/z0;)V

    return-object v0
.end method

.method public static final b(LZ8/y;)LZ8/N;
    .locals 2

    new-instance v0, LZ8/A;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LZ8/A;-><init>(LZ8/N;LW8/z0;)V

    return-object v0
.end method

.method private static final c(LZ8/f;I)LZ8/H;
    .locals 7

    .prologue
    sget-object v0, LY8/j;->i:LY8/j$a;

    invoke-virtual {v0}, LY8/j$a;->a()I

    move-result v0

    invoke-static {p1, v0}, LE7/j;->d(II)I

    move-result v0

    sub-int/2addr v0, p1

    instance-of v1, p0, La9/e;

    if-eqz v1, :cond_4

    move-object v1, p0

    check-cast v1, La9/e;

    invoke-virtual {v1}, La9/e;->j()LZ8/f;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance p0, LZ8/H;

    iget v3, v1, La9/e;->D:I

    const/4 v4, -0x3

    if-eq v3, v4, :cond_0

    const/4 v4, -0x2

    if-eq v3, v4, :cond_0

    if-eqz v3, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    iget-object v4, v1, La9/e;->E:LY8/d;

    sget-object v5, LY8/d;->C:LY8/d;

    const/4 v6, 0x0

    if-ne v4, v5, :cond_2

    if-nez v3, :cond_3

    :cond_1
    move v0, v6

    goto :goto_0

    :cond_2
    if-nez p1, :cond_1

    const/4 v0, 0x1

    :cond_3
    :goto_0
    iget-object p1, v1, La9/e;->E:LY8/d;

    iget-object v1, v1, La9/e;->C:Lm7/i;

    invoke-direct {p0, v2, v0, p1, v1}, LZ8/H;-><init>(LZ8/f;ILY8/d;Lm7/i;)V

    return-object p0

    :cond_4
    new-instance p1, LZ8/H;

    sget-object v1, LY8/d;->C:LY8/d;

    sget-object v2, Lm7/j;->C:Lm7/j;

    invoke-direct {p1, p0, v0, v1, v2}, LZ8/H;-><init>(LZ8/f;ILY8/d;Lm7/i;)V

    return-object p1
.end method

.method private static final d(LW8/N;Lm7/i;LZ8/f;LZ8/x;LZ8/I;Ljava/lang/Object;)LW8/z0;
    .locals 8

    .prologue
    sget-object v0, LZ8/I;->a:LZ8/I$a;

    invoke-virtual {v0}, LZ8/I$a;->c()LZ8/I;

    move-result-object v0

    invoke-static {p4, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LW8/P;->C:LW8/P;

    goto :goto_0

    :cond_0
    sget-object v0, LW8/P;->F:LW8/P;

    :goto_0
    new-instance v7, LZ8/u$a;

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p4

    move-object v3, p2

    move-object v4, p3

    move-object v5, p5

    invoke-direct/range {v1 .. v6}, LZ8/u$a;-><init>(LZ8/I;LZ8/f;LZ8/x;Ljava/lang/Object;Lm7/e;)V

    invoke-static {p0, p1, v0, v7}, LW8/g;->c(LW8/N;Lm7/i;LW8/P;Lx7/p;)LW8/z0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(LZ8/C;Lx7/p;)LZ8/C;
    .locals 1

    new-instance v0, LZ8/T;

    invoke-direct {v0, p0, p1}, LZ8/T;-><init>(LZ8/C;Lx7/p;)V

    return-object v0
.end method

.method public static final f(LZ8/f;LW8/N;LZ8/I;I)LZ8/C;
    .locals 8

    invoke-static {p0, p3}, LZ8/u;->c(LZ8/f;I)LZ8/H;

    move-result-object p0

    iget v0, p0, LZ8/H;->b:I

    iget-object v1, p0, LZ8/H;->c:LY8/d;

    invoke-static {p3, v0, v1}, LZ8/E;->a(IILY8/d;)LZ8/x;

    move-result-object p3

    iget-object v3, p0, LZ8/H;->d:Lm7/i;

    iget-object v4, p0, LZ8/H;->a:LZ8/f;

    sget-object v7, LZ8/E;->a:Lb9/D;

    move-object v2, p1

    move-object v5, p3

    move-object v6, p2

    invoke-static/range {v2 .. v7}, LZ8/u;->d(LW8/N;Lm7/i;LZ8/f;LZ8/x;LZ8/I;Ljava/lang/Object;)LW8/z0;

    move-result-object p0

    new-instance p1, LZ8/z;

    invoke-direct {p1, p3, p0}, LZ8/z;-><init>(LZ8/C;LW8/z0;)V

    return-object p1
.end method

.method public static final g(LZ8/f;LW8/N;LZ8/I;Ljava/lang/Object;)LZ8/N;
    .locals 7

    const/4 v0, 0x1

    invoke-static {p0, v0}, LZ8/u;->c(LZ8/f;I)LZ8/H;

    move-result-object p0

    invoke-static {p3}, LZ8/P;->a(Ljava/lang/Object;)LZ8/y;

    move-result-object v6

    iget-object v1, p0, LZ8/H;->d:Lm7/i;

    iget-object v2, p0, LZ8/H;->a:LZ8/f;

    move-object v0, p1

    move-object v3, v6

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, LZ8/u;->d(LW8/N;Lm7/i;LZ8/f;LZ8/x;LZ8/I;Ljava/lang/Object;)LW8/z0;

    move-result-object p0

    new-instance p1, LZ8/A;

    invoke-direct {p1, v6, p0}, LZ8/A;-><init>(LZ8/N;LW8/z0;)V

    return-object p1
.end method
