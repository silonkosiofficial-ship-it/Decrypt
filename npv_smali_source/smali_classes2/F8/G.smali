.class public abstract LF8/G;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF8/E;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->Z0()LF8/t0;

    move-result-object p0

    instance-of v0, p0, LH8/h;

    if-nez v0, :cond_1

    instance-of v0, p0, LF8/y;

    if-eqz v0, :cond_0

    check-cast p0, LF8/y;

    invoke-virtual {p0}, LF8/y;->d1()LF8/M;

    move-result-object p0

    instance-of p0, p0, LH8/h;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final b(LF8/E;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LF8/q0;->l(LF8/E;)Z

    move-result p0

    return p0
.end method
