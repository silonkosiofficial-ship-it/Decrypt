.class public abstract LX0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(FLx7/a;)F
    .locals 0

    invoke-static {p0, p1}, LX0/m;->d(FLx7/a;)F

    move-result p0

    return p0
.end method

.method public static final b(LX0/o;LX0/o;F)LX0/o;
    .locals 3

    .prologue
    instance-of v0, p0, LX0/c;

    if-nez v0, :cond_0

    instance-of v1, p1, LX0/c;

    if-nez v1, :cond_0

    sget-object v0, LX0/o;->a:LX0/o$a;

    invoke-interface {p0}, LX0/o;->c()J

    move-result-wide v1

    invoke-interface {p1}, LX0/o;->c()J

    move-result-wide p0

    invoke-static {v1, v2, p0, p1, p2}, Lo0/A0;->i(JJF)J

    move-result-wide p0

    invoke-virtual {v0, p0, p1}, LX0/o$a;->b(J)LX0/o;

    move-result-object p0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    instance-of v0, p1, LX0/c;

    if-eqz v0, :cond_1

    sget-object v0, LX0/o;->a:LX0/o$a;

    move-object v1, p0

    check-cast v1, LX0/c;

    invoke-virtual {v1}, LX0/c;->f()Lo0/n0;

    move-result-object v1

    move-object v2, p1

    check-cast v2, LX0/c;

    invoke-virtual {v2}, LX0/c;->f()Lo0/n0;

    move-result-object v2

    invoke-static {v1, v2, p2}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/n0;

    invoke-interface {p0}, LX0/o;->a()F

    move-result p0

    invoke-interface {p1}, LX0/o;->a()F

    move-result p1

    invoke-static {p0, p1, p2}, La1/b;->b(FFF)F

    move-result p0

    invoke-virtual {v0, v1, p0}, LX0/o$a;->a(Lo0/n0;F)LX0/o;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-static {p0, p1, p2}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LX0/o;

    :goto_0
    return-object p0
.end method

.method public static final c(JF)J
    .locals 9

    .prologue
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lo0/y0;->p(J)F

    move-result v0

    mul-float v3, v0, p2

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-wide v1, p0

    invoke-static/range {v1 .. v8}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide p0

    :cond_1
    :goto_0
    return-wide p0
.end method

.method private static final d(FLx7/a;)F
    .locals 1

    .prologue
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    :cond_0
    return p0
.end method
