.class abstract synthetic LY8/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LY8/C;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-interface {p0, p1}, LY8/C;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LY8/n$c;

    if-nez v1, :cond_0

    check-cast v0, Li7/M;

    sget-object p0, LY8/n;->b:LY8/n$b;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {p0, p1}, LY8/n$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LY8/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LY8/r$a;-><init>(LY8/C;Ljava/lang/Object;Lm7/e;)V

    const/4 p0, 0x1

    invoke-static {v1, v0, p0, v1}, LW8/g;->f(Lm7/i;Lx7/p;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LY8/n;

    invoke-virtual {p0}, LY8/n;->l()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
