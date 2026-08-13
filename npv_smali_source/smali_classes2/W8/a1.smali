.class public abstract LW8/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JLW8/X;LW8/z0;)LW8/Y0;
    .locals 1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Timed out waiting for "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ms"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, LW8/Y0;

    invoke-direct {p1, p0, p3}, LW8/Y0;-><init>(Ljava/lang/String;LW8/z0;)V

    return-object p1
.end method

.method private static final b(LW8/Z0;Lx7/p;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lb9/z;->F:Lm7/e;

    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    invoke-static {v0}, LW8/Y;->b(Lm7/i;)LW8/X;

    move-result-object v0

    iget-wide v1, p0, LW8/Z0;->G:J

    invoke-virtual {p0}, LW8/a;->getContext()Lm7/i;

    move-result-object v3

    invoke-interface {v0, v1, v2, p0, v3}, LW8/X;->m1(JLjava/lang/Runnable;Lm7/i;)LW8/f0;

    move-result-object v0

    invoke-static {p0, v0}, LW8/C0;->j(LW8/z0;LW8/f0;)LW8/f0;

    invoke-static {p0, p0, p1}, Lc9/b;->c(Lb9/z;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(JLx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-lez v0, :cond_1

    new-instance v0, LW8/Z0;

    invoke-direct {v0, p0, p1, p3}, LW8/Z0;-><init>(JLm7/e;)V

    invoke-static {v0, p2}, LW8/a1;->b(LW8/Z0;Lx7/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p3}, Lo7/h;->c(Lm7/e;)V

    :cond_0
    return-object p0

    :cond_1
    new-instance p0, LW8/Y0;

    const-string p1, "Timed out immediately"

    invoke-direct {p0, p1}, LW8/Y0;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final d(JLx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LW8/Y;->c(J)J

    move-result-wide p0

    invoke-static {p0, p1, p2, p3}, LW8/a1;->c(JLx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final e(JLx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    instance-of v0, p3, LW8/a1$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LW8/a1$a;

    iget v1, v0, LW8/a1$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LW8/a1$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, LW8/a1$a;

    invoke-direct {v0, p3}, LW8/a1$a;-><init>(Lm7/e;)V

    :goto_0
    iget-object p3, v0, LW8/a1$a;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LW8/a1$a;->J:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, LW8/a1$a;->H:Ljava/lang/Object;

    check-cast p0, Ly7/O;

    iget-object p1, v0, LW8/a1$a;->G:Ljava/lang/Object;

    check-cast p1, Lx7/p;

    :try_start_0
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch LW8/Y0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    const-wide/16 v5, 0x0

    cmp-long p3, p0, v5

    if-gtz p3, :cond_3

    return-object v3

    :cond_3
    new-instance p3, Ly7/O;

    invoke-direct {p3}, Ly7/O;-><init>()V

    :try_start_1
    iput-object p2, v0, LW8/a1$a;->G:Ljava/lang/Object;

    iput-object p3, v0, LW8/a1$a;->H:Ljava/lang/Object;

    iput-wide p0, v0, LW8/a1$a;->F:J

    iput v4, v0, LW8/a1$a;->J:I

    new-instance v2, LW8/Z0;

    invoke-direct {v2, p0, p1, v0}, LW8/Z0;-><init>(JLm7/e;)V

    iput-object v2, p3, Ly7/O;->C:Ljava/lang/Object;

    invoke-static {v2, p2}, LW8/a1;->b(LW8/Z0;Lx7/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4

    invoke-static {v0}, Lo7/h;->c(Lm7/e;)V
    :try_end_1
    .catch LW8/Y0; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    move-object p0, p3

    goto :goto_3

    :cond_4
    :goto_1
    if-ne p0, v1, :cond_5

    return-object v1

    :cond_5
    move-object p3, p0

    :goto_2
    return-object p3

    :goto_3
    iget-object p2, p1, LW8/Y0;->C:LW8/z0;

    iget-object p0, p0, Ly7/O;->C:Ljava/lang/Object;

    if-ne p2, p0, :cond_6

    return-object v3

    :cond_6
    throw p1
.end method

.method public static final f(JLx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LW8/Y;->c(J)J

    move-result-wide p0

    invoke-static {p0, p1, p2, p3}, LW8/a1;->e(JLx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
