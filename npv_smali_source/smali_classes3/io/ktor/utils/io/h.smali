.class public abstract Lio/ktor/utils/io/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lio/ktor/utils/io/g;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-static {p0}, Lio/ktor/utils/io/f;->i(Lio/ktor/utils/io/g;)V

    instance-of v0, p0, Lio/ktor/utils/io/a;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lio/ktor/utils/io/a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/ktor/utils/io/a;->n()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p0}, Lio/ktor/utils/io/g;->c()Lo9/p;

    move-result-object v0

    invoke-static {v0}, Ld7/c;->c(Lo9/p;)I

    move-result v0

    const/high16 v1, 0x100000

    if-lt v0, v1, :cond_3

    :goto_1
    invoke-interface {p0, p1}, Lio/ktor/utils/io/g;->g(Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    return-object p0

    :cond_2
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0

    :cond_3
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method
