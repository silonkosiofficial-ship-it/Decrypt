.class abstract synthetic LZ8/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LZ8/f;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    sget-object v0, La9/s;->C:La9/s;

    invoke-interface {p0, v0, p1}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final b(LZ8/f;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-static {p0, p1}, LZ8/h;->C(LZ8/f;Lx7/p;)LZ8/f;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, v0, p1}, LZ8/h;->d(LZ8/f;ILY8/d;ILjava/lang/Object;)LZ8/f;

    move-result-object p0

    invoke-static {p0, p2}, LZ8/h;->i(LZ8/f;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final c(LZ8/g;LZ8/f;Lm7/e;)Ljava/lang/Object;
    .locals 0

    .prologue
    invoke-static {p0}, LZ8/h;->s(LZ8/g;)V

    invoke-interface {p1, p0, p2}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final d(LZ8/f;LW8/N;)LW8/z0;
    .locals 6

    new-instance v3, LZ8/k$a;

    const/4 v0, 0x0

    invoke-direct {v3, p0, v0}, LZ8/k$a;-><init>(LZ8/f;Lm7/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object p0

    return-object p0
.end method
