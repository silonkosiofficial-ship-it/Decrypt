.class public abstract LW8/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LW8/z0;)LW8/v;
    .locals 1

    new-instance v0, LW8/w;

    invoke-direct {v0, p0}, LW8/w;-><init>(LW8/z0;)V

    return-object v0
.end method

.method public static synthetic b(LW8/z0;ILjava/lang/Object;)LW8/v;
    .locals 0

    .prologue
    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LW8/x;->a(LW8/z0;)LW8/v;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LW8/v;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    invoke-static {p1}, Li7/w;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, LW8/v;->R0(Ljava/lang/Object;)Z

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0, v0}, LW8/v;->g(Ljava/lang/Throwable;)Z

    move-result p0

    :goto_0
    return p0
.end method
