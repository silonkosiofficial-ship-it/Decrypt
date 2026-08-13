.class public abstract LW6/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LW8/z0;)Lm7/i;
    .locals 2

    invoke-static {p0}, LW8/U0;->a(LW8/z0;)LW8/y;

    move-result-object p0

    sget-object v0, LW8/K;->g:LW8/K$a;

    new-instance v1, LW6/q$a;

    invoke-direct {v1, v0}, LW6/q$a;-><init>(LW8/K$a;)V

    invoke-interface {p0, v1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LW8/z0;ILjava/lang/Object;)Lm7/i;
    .locals 0

    .prologue
    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LW6/q;->a(LW8/z0;)Lm7/i;

    move-result-object p0

    return-object p0
.end method
