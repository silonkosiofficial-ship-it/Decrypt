.class public abstract LA/D;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LA/H;)LA/n;
    .locals 0

    .prologue
    if-eqz p0, :cond_0

    invoke-virtual {p0}, LA/H;->a()LA/n;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final b(LA/H;)Z
    .locals 0

    .prologue
    if-eqz p0, :cond_0

    invoke-virtual {p0}, LA/H;->b()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method

.method public static final c(LD0/n;)LA/H;
    .locals 1

    .prologue
    invoke-interface {p0}, LD0/n;->Z()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LA/H;

    if-eqz v0, :cond_0

    check-cast p0, LA/H;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final d(LD0/X;)LA/H;
    .locals 1

    .prologue
    invoke-virtual {p0}, LD0/X;->Z()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LA/H;

    if-eqz v0, :cond_0

    check-cast p0, LA/H;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final e(LA/H;)F
    .locals 0

    .prologue
    if-eqz p0, :cond_0

    invoke-virtual {p0}, LA/H;->d()F

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final f(LA/H;)Z
    .locals 0

    .prologue
    invoke-static {p0}, LA/D;->a(LA/H;)LA/n;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LA/n;->c()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
