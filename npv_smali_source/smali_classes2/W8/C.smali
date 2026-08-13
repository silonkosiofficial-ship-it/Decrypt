.class public abstract LW8/C;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    .prologue
    instance-of p1, p0, LW8/A;

    if-eqz p1, :cond_0

    sget-object p1, Li7/w;->D:Li7/w$a;

    check-cast p0, LW8/A;

    iget-object p0, p0, LW8/A;->a:Ljava/lang/Throwable;

    invoke-static {p0}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    :cond_0
    invoke-static {p0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-static {p0}, Li7/w;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, LW8/A;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v0, v3, v1, v2}, LW8/A;-><init>(Ljava/lang/Throwable;ZILy7/k;)V

    :goto_0
    return-object p0
.end method

.method public static final c(Ljava/lang/Object;LW8/l;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {p0}, Li7/w;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, LW8/A;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2, v0, v1}, LW8/A;-><init>(Ljava/lang/Throwable;ZILy7/k;)V

    :goto_0
    return-object p0
.end method
