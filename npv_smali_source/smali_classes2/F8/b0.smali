.class public abstract LF8/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF8/a0;LP7/g;)LF8/a0;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newAnnotations"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LF8/j;->a(LF8/a0;)LP7/g;

    move-result-object v0

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    invoke-static {p0}, LF8/j;->b(LF8/a0;)LF8/i;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, LF8/a0;->M(LF8/Y;)LF8/a0;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p1}, LP7/g;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    return-object p0

    :cond_3
    new-instance v0, LF8/i;

    invoke-direct {v0, p1}, LF8/i;-><init>(LP7/g;)V

    invoke-virtual {p0, v0}, LF8/a0;->E(LF8/Y;)LF8/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LP7/g;)LF8/a0;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LF8/n;->a:LF8/n;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v6}, LF8/Z$a;->a(LF8/Z;LP7/g;LF8/e0;LO7/m;ILjava/lang/Object;)LF8/a0;

    move-result-object p0

    return-object p0
.end method
