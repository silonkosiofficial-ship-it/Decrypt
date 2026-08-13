.class public abstract synthetic LY0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LY0/n;J)F
    .locals 4

    .prologue
    invoke-static {p1, p2}, LY0/x;->g(J)J

    move-result-wide v0

    sget-object v2, LY0/z;->b:LY0/z$a;

    invoke-virtual {v2}, LY0/z$a;->b()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/z;->g(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Only Sp can convert to Px"

    invoke-static {v0}, LY0/o;->b(Ljava/lang/String;)V

    :cond_0
    sget-object v0, LZ0/b;->a:LZ0/b;

    invoke-interface {p0}, LY0/n;->v0()F

    move-result v1

    invoke-virtual {v0, v1}, LZ0/b;->f(F)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p1, p2}, LY0/x;->h(J)F

    move-result p1

    invoke-interface {p0}, LY0/n;->v0()F

    move-result p0

    mul-float/2addr p1, p0

    invoke-static {p1}, LY0/i;->q(F)F

    move-result p0

    return p0

    :cond_1
    invoke-interface {p0}, LY0/n;->v0()F

    move-result v1

    invoke-virtual {v0, v1}, LZ0/b;->b(F)LZ0/a;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {p1, p2}, LY0/x;->h(J)F

    move-result p1

    invoke-interface {p0}, LY0/n;->v0()F

    move-result p0

    mul-float/2addr p1, p0

    invoke-static {p1}, LY0/i;->q(F)F

    move-result p0

    goto :goto_0

    :cond_2
    invoke-static {p1, p2}, LY0/x;->h(J)F

    move-result p0

    invoke-interface {v0, p0}, LZ0/a;->b(F)F

    move-result p0

    invoke-static {p0}, LY0/i;->q(F)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static b(LY0/n;F)J
    .locals 2

    .prologue
    sget-object v0, LZ0/b;->a:LZ0/b;

    invoke-interface {p0}, LY0/n;->v0()F

    move-result v1

    invoke-virtual {v0, v1}, LZ0/b;->f(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, LY0/n;->v0()F

    move-result p0

    div-float/2addr p1, p0

    invoke-static {p1}, LY0/y;->e(F)J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-interface {p0}, LY0/n;->v0()F

    move-result v1

    invoke-virtual {v0, v1}, LZ0/b;->b(F)LZ0/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, LZ0/a;->a(F)F

    move-result p0

    goto :goto_0

    :cond_1
    invoke-interface {p0}, LY0/n;->v0()F

    move-result p0

    div-float p0, p1, p0

    :goto_0
    invoke-static {p0}, LY0/y;->e(F)J

    move-result-wide p0

    return-wide p0
.end method
