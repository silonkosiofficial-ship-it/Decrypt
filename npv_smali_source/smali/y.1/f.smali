.class public abstract Ly/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LB/D;Ly/j;)Ly/i;
    .locals 1

    new-instance v0, Ly/f$a;

    invoke-direct {v0, p0, p1}, Ly/f$a;-><init>(LB/D;Ly/j;)V

    return-object v0
.end method

.method public static synthetic b(LB/D;Ly/j;ILjava/lang/Object;)Ly/i;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    sget-object p1, Ly/j$a;->a:Ly/j$a;

    :cond_0
    invoke-static {p0, p1}, Ly/f;->a(LB/D;Ly/j;)Ly/i;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LY0/e;F)I
    .locals 2

    .prologue
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {}, Ly/h;->m()F

    move-result v1

    invoke-interface {p0, v1}, LY0/e;->B0(F)F

    move-result p0

    cmpg-float p0, v0, p0

    if-gez p0, :cond_0

    sget-object p0, Ly/d;->a:Ly/d$a;

    invoke-virtual {p0}, Ly/d$a;->a()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    cmpl-float p0, p1, p0

    if-lez p0, :cond_1

    sget-object p0, Ly/d;->a:Ly/d$a;

    invoke-virtual {p0}, Ly/d$a;->b()I

    move-result p0

    goto :goto_0

    :cond_1
    sget-object p0, Ly/d;->a:Ly/d$a;

    invoke-virtual {p0}, Ly/d$a;->c()I

    move-result p0

    :goto_0
    return p0
.end method

.method public static final d(LB/q;)I
    .locals 2

    .prologue
    invoke-interface {p0}, LB/q;->e()Lx/s;

    move-result-object v0

    sget-object v1, Lx/s;->C:Lx/s;

    if-ne v0, v1, :cond_0

    invoke-interface {p0}, LB/q;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/t;->f(J)I

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LB/q;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/t;->g(J)I

    move-result p0

    :goto_0
    return p0
.end method
