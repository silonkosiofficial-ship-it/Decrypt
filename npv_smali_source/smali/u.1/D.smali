.class public abstract Lu/D;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lu/B;FF)F
    .locals 1

    sget-object v0, Ly7/m;->a:Ly7/m;

    invoke-static {v0}, Lu/z0;->i(Ly7/m;)Lu/x0;

    move-result-object v0

    invoke-interface {p0, v0}, Lu/B;->a(Lu/x0;)Lu/D0;

    move-result-object p0

    invoke-static {p1}, Lu/s;->a(F)Lu/n;

    move-result-object p1

    invoke-static {p2}, Lu/s;->a(F)Lu/n;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lu/D0;->b(Lu/r;Lu/r;)Lu/r;

    move-result-object p0

    check-cast p0, Lu/n;

    invoke-virtual {p0}, Lu/n;->f()F

    move-result p0

    return p0
.end method

.method public static final b(FF)Lu/B;
    .locals 1

    new-instance v0, Lu/M;

    invoke-direct {v0, p0, p1}, Lu/M;-><init>(FF)V

    invoke-static {v0}, Lu/D;->d(Lu/L;)Lu/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(FFILjava/lang/Object;)Lu/B;
    .locals 0

    .prologue
    and-int/lit8 p3, p2, 0x1

    if-eqz p3, :cond_0

    const/high16 p0, 0x3f800000    # 1.0f

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    const p1, 0x3dcccccd    # 0.1f

    :cond_1
    invoke-static {p0, p1}, Lu/D;->b(FF)Lu/B;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lu/L;)Lu/B;
    .locals 1

    new-instance v0, Lu/C;

    invoke-direct {v0, p0}, Lu/C;-><init>(Lu/L;)V

    return-object v0
.end method
