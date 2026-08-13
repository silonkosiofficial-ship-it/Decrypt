.class public abstract LN/L;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LM0/K;IZZ)F
    .locals 1

    .prologue
    const/4 v0, 0x0

    if-eqz p2, :cond_0

    if-eqz p3, :cond_1

    :cond_0
    if-nez p2, :cond_2

    if-eqz p3, :cond_2

    :cond_1
    move p2, p1

    goto :goto_0

    :cond_2
    add-int/lit8 p2, p1, -0x1

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    :goto_0
    invoke-virtual {p0, p2}, LM0/K;->c(I)LX0/i;

    move-result-object p2

    invoke-virtual {p0, p1}, LM0/K;->y(I)LX0/i;

    move-result-object p3

    if-ne p2, p3, :cond_3

    const/4 v0, 0x1

    :cond_3
    invoke-virtual {p0, p1, v0}, LM0/K;->j(IZ)F

    move-result p0

    return p0
.end method

.method public static final b(LM0/K;IZZ)J
    .locals 2

    .prologue
    invoke-virtual {p0, p1}, LM0/K;->q(I)I

    move-result v0

    invoke-virtual {p0}, LM0/K;->n()I

    move-result v1

    if-lt v0, v1, :cond_0

    sget-object p0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p0}, Ln0/g$a;->b()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-static {p0, p1, p2, p3}, LN/L;->a(LM0/K;IZZ)F

    move-result p1

    invoke-virtual {p0}, LM0/K;->B()J

    move-result-wide p2

    invoke-static {p2, p3}, LY0/t;->g(J)I

    move-result p2

    int-to-float p2, p2

    const/4 p3, 0x0

    invoke-static {p1, p3, p2}, LE7/j;->j(FFF)F

    move-result p1

    invoke-virtual {p0, v0}, LM0/K;->m(I)F

    move-result p2

    invoke-virtual {p0}, LM0/K;->B()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/t;->f(J)I

    move-result p0

    int-to-float p0, p0

    invoke-static {p2, p3, p0}, LE7/j;->j(FFF)F

    move-result p0

    invoke-static {p1, p0}, Ln0/h;->a(FF)J

    move-result-wide p0

    return-wide p0
.end method
