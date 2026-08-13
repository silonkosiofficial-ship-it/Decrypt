.class public abstract Ly/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LC/k;Lx/s;)I
    .locals 1

    .prologue
    sget-object v0, Lx/s;->C:Lx/s;

    if-ne p1, v0, :cond_0

    invoke-interface {p0}, LC/k;->l()J

    move-result-wide p0

    invoke-static {p0, p1}, LY0/p;->i(J)I

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LC/k;->l()J

    move-result-wide p0

    invoke-static {p0, p1}, LY0/p;->h(J)I

    move-result p0

    :goto_0
    return p0
.end method

.method public static final b(LC/k;Lx/s;)I
    .locals 1

    .prologue
    sget-object v0, Lx/s;->C:Lx/s;

    if-ne p1, v0, :cond_0

    invoke-interface {p0}, LC/k;->a()J

    move-result-wide p0

    invoke-static {p0, p1}, LY0/t;->f(J)I

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LC/k;->a()J

    move-result-wide p0

    invoke-static {p0, p1}, LY0/t;->g(J)I

    move-result p0

    :goto_0
    return p0
.end method
