.class public abstract LF8/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF8/E;)LF8/E;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LF8/r0;

    if-eqz v0, :cond_0

    check-cast p0, LF8/r0;

    invoke-interface {p0}, LF8/r0;->M()LF8/E;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final b(LF8/t0;LF8/E;)LF8/t0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "origin"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LF8/s0;->a(LF8/E;)LF8/E;

    move-result-object p1

    invoke-static {p0, p1}, LF8/s0;->d(LF8/t0;LF8/E;)LF8/t0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LF8/t0;LF8/E;Lx7/l;)LF8/t0;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "origin"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LF8/s0;->a(LF8/E;)LF8/E;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF8/E;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p0, p1}, LF8/s0;->d(LF8/t0;LF8/E;)LF8/t0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LF8/t0;LF8/E;)LF8/t0;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LF8/r0;

    if-eqz v0, :cond_0

    check-cast p0, LF8/r0;

    invoke-interface {p0}, LF8/r0;->O0()LF8/t0;

    move-result-object p0

    invoke-static {p0, p1}, LF8/s0;->d(LF8/t0;LF8/E;)LF8/t0;

    move-result-object p0

    return-object p0

    :cond_0
    if-eqz p1, :cond_4

    invoke-static {p1, p0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    instance-of v0, p0, LF8/M;

    if-eqz v0, :cond_2

    new-instance v0, LF8/P;

    check-cast p0, LF8/M;

    invoke-direct {v0, p0, p1}, LF8/P;-><init>(LF8/M;LF8/E;)V

    goto :goto_0

    :cond_2
    instance-of v0, p0, LF8/y;

    if-eqz v0, :cond_3

    new-instance v0, LF8/A;

    check-cast p0, LF8/y;

    invoke-direct {v0, p0, p1}, LF8/A;-><init>(LF8/y;LF8/E;)V

    :goto_0
    return-object v0

    :cond_3
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0

    :cond_4
    :goto_1
    return-object p0
.end method
