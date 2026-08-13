.class public abstract synthetic LY0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LY0/e;J)I
    .locals 0

    invoke-interface {p0, p1, p2}, LY0/e;->g1(J)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0
.end method

.method public static b(LY0/e;F)I
    .locals 0

    .prologue
    invoke-interface {p0, p1}, LY0/e;->B0(F)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result p1

    if-eqz p1, :cond_0

    const p0, 0x7fffffff

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    :goto_0
    return p0
.end method

.method public static c(LY0/e;F)F
    .locals 0

    invoke-interface {p0}, LY0/e;->getDensity()F

    move-result p0

    div-float/2addr p1, p0

    invoke-static {p1}, LY0/i;->q(F)F

    move-result p0

    return p0
.end method

.method public static d(LY0/e;I)F
    .locals 0

    int-to-float p1, p1

    invoke-interface {p0}, LY0/e;->getDensity()F

    move-result p0

    div-float/2addr p1, p0

    invoke-static {p1}, LY0/i;->q(F)F

    move-result p0

    return p0
.end method

.method public static e(LY0/e;J)J
    .locals 2

    .prologue
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Ln0/m;->i(J)F

    move-result v0

    invoke-interface {p0, v0}, LY0/e;->q0(F)F

    move-result v0

    invoke-static {p1, p2}, Ln0/m;->g(J)F

    move-result p1

    invoke-interface {p0, p1}, LY0/e;->q0(F)F

    move-result p0

    invoke-static {v0, p0}, LY0/j;->b(FF)J

    move-result-wide p0

    goto :goto_0

    :cond_0
    sget-object p0, LY0/l;->b:LY0/l$a;

    invoke-virtual {p0}, LY0/l$a;->a()J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method public static f(LY0/e;J)F
    .locals 4

    .prologue
    invoke-static {p1, p2}, LY0/x;->g(J)J

    move-result-wide v0

    sget-object v2, LY0/z;->b:LY0/z$a;

    invoke-virtual {v2}, LY0/z$a;->b()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/z;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p1, p2}, LY0/n;->X(J)F

    move-result p1

    invoke-interface {p0, p1}, LY0/e;->B0(F)F

    move-result p0

    return p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Only Sp can convert to Px"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g(LY0/e;F)F
    .locals 0

    invoke-interface {p0}, LY0/e;->getDensity()F

    move-result p0

    mul-float/2addr p1, p0

    return p1
.end method

.method public static h(LY0/e;J)J
    .locals 2

    .prologue
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, LY0/l;->h(J)F

    move-result v0

    invoke-interface {p0, v0}, LY0/e;->B0(F)F

    move-result v0

    invoke-static {p1, p2}, LY0/l;->g(J)F

    move-result p1

    invoke-interface {p0, p1}, LY0/e;->B0(F)F

    move-result p0

    invoke-static {v0, p0}, Ln0/n;->a(FF)J

    move-result-wide p0

    goto :goto_0

    :cond_0
    sget-object p0, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {p0}, Ln0/m$a;->a()J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method public static i(LY0/e;F)J
    .locals 0

    invoke-interface {p0, p1}, LY0/e;->q0(F)F

    move-result p1

    invoke-interface {p0, p1}, LY0/n;->O(F)J

    move-result-wide p0

    return-wide p0
.end method
