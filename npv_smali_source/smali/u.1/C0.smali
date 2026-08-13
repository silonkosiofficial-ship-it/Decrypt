.class public abstract Lu/C0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lu/r;FF)Lu/t;
    .locals 0

    invoke-static {p0, p1, p2}, Lu/C0;->c(Lu/r;FF)Lu/t;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lu/F0;J)J
    .locals 8

    invoke-interface {p0}, Lu/F0;->d()I

    move-result v0

    int-to-long v0, v0

    sub-long v2, p1, v0

    invoke-interface {p0}, Lu/F0;->f()I

    move-result p0

    int-to-long v6, p0

    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v7}, LE7/j;->l(JJJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final c(Lu/r;FF)Lu/t;
    .locals 1

    .prologue
    if-eqz p0, :cond_0

    new-instance v0, Lu/C0$a;

    invoke-direct {v0, p0, p1, p2}, Lu/C0$a;-><init>(Lu/r;FF)V

    return-object v0

    :cond_0
    new-instance p0, Lu/C0$b;

    invoke-direct {p0, p1, p2}, Lu/C0$b;-><init>(FF)V

    return-object p0
.end method

.method public static final d(Lu/B0;JLu/r;Lu/r;Lu/r;)Lu/r;
    .locals 8

    const-wide/32 v0, 0xf4240

    mul-long v3, p1, v0

    move-object v2, p0

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-interface/range {v2 .. v7}, Lu/B0;->c(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p0

    return-object p0
.end method
