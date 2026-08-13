.class public abstract LF8/B;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF8/E;)LF8/y;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->Z0()LF8/t0;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, LF8/y;

    return-object p0
.end method

.method public static final b(LF8/E;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->Z0()LF8/t0;

    move-result-object p0

    instance-of p0, p0, LF8/y;

    return p0
.end method

.method public static final c(LF8/E;)LF8/M;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->Z0()LF8/t0;

    move-result-object p0

    instance-of v0, p0, LF8/y;

    if-eqz v0, :cond_0

    check-cast p0, LF8/y;

    invoke-virtual {p0}, LF8/y;->e1()LF8/M;

    move-result-object p0

    goto :goto_0

    :cond_0
    instance-of v0, p0, LF8/M;

    if-eqz v0, :cond_1

    check-cast p0, LF8/M;

    :goto_0
    return-object p0

    :cond_1
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0
.end method

.method public static final d(LF8/E;)LF8/M;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->Z0()LF8/t0;

    move-result-object p0

    instance-of v0, p0, LF8/y;

    if-eqz v0, :cond_0

    check-cast p0, LF8/y;

    invoke-virtual {p0}, LF8/y;->f1()LF8/M;

    move-result-object p0

    goto :goto_0

    :cond_0
    instance-of v0, p0, LF8/M;

    if-eqz v0, :cond_1

    check-cast p0, LF8/M;

    :goto_0
    return-object p0

    :cond_1
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0
.end method
