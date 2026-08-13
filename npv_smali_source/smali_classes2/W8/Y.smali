.class public abstract LW8/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JLm7/e;)Ljava/lang/Object;
    .locals 3

    .prologue
    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gtz v0, :cond_0

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0

    :cond_0
    new-instance v0, LW8/n;

    invoke-static {p2}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v0}, LW8/n;->E()V

    const-wide v1, 0x7fffffffffffffffL

    cmp-long v1, p0, v1

    if-gez v1, :cond_1

    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object v1

    invoke-static {v1}, LW8/Y;->b(Lm7/i;)LW8/X;

    move-result-object v1

    invoke-interface {v1, p0, p1, v0}, LW8/X;->x0(JLW8/l;)V

    :cond_1
    invoke-virtual {v0}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    invoke-static {p2}, Lo7/h;->c(Lm7/e;)V

    :cond_2
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    return-object p0

    :cond_3
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final b(Lm7/i;)LW8/X;
    .locals 1

    .prologue
    sget-object v0, Lm7/f;->A:Lm7/f$b;

    invoke-interface {p0, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p0

    instance-of v0, p0, LW8/X;

    if-eqz v0, :cond_0

    check-cast p0, LW8/X;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    invoke-static {}, LW8/U;->a()LW8/X;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static final c(J)J
    .locals 3

    .prologue
    invoke-static {p0, p1}, LT8/a;->N(J)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-wide/32 v0, 0xf423f

    sget-object v2, LT8/d;->D:LT8/d;

    invoke-static {v0, v1, v2}, LT8/c;->t(JLT8/d;)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, LT8/a;->O(JJ)J

    move-result-wide p0

    invoke-static {p0, p1}, LT8/a;->z(J)J

    move-result-wide p0

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    const-wide/16 p0, 0x0

    :goto_0
    return-wide p0

    :cond_1
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0
.end method
