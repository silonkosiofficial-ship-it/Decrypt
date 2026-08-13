.class public abstract Lu/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(F)Lu/n;
    .locals 1

    new-instance v0, Lu/n;

    invoke-direct {v0, p0}, Lu/n;-><init>(F)V

    return-object v0
.end method

.method public static final b(FF)Lu/o;
    .locals 1

    new-instance v0, Lu/o;

    invoke-direct {v0, p0, p1}, Lu/o;-><init>(FF)V

    return-object v0
.end method

.method public static final c(FFF)Lu/p;
    .locals 1

    new-instance v0, Lu/p;

    invoke-direct {v0, p0, p1, p2}, Lu/p;-><init>(FFF)V

    return-object v0
.end method

.method public static final d(FFFF)Lu/q;
    .locals 1

    new-instance v0, Lu/q;

    invoke-direct {v0, p0, p1, p2, p3}, Lu/q;-><init>(FFFF)V

    return-object v0
.end method

.method public static final e(Lu/r;)Lu/r;
    .locals 4

    .prologue
    invoke-static {p0}, Lu/s;->g(Lu/r;)Lu/r;

    move-result-object v0

    invoke-virtual {v0}, Lu/r;->b()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {p0, v2}, Lu/r;->a(I)F

    move-result v3

    invoke-virtual {v0, v2, v3}, Lu/r;->e(IF)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final f(Lu/r;Lu/r;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Lu/r;->b()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p1, v1}, Lu/r;->a(I)F

    move-result v2

    invoke-virtual {p0, v1, v2}, Lu/r;->e(IF)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final g(Lu/r;)Lu/r;
    .locals 1

    invoke-virtual {p0}, Lu/r;->c()Lu/r;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
