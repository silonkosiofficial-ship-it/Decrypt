.class public abstract LD6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LD6/b;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p1, LD6/d$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LD6/d$a;

    iget v1, v0, LD6/d$a;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LD6/d$a;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, LD6/d$a;

    invoke-direct {v0, p1}, LD6/d$a;-><init>(Lm7/e;)V

    :goto_0
    iget-object p1, v0, LD6/d$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LD6/d$a;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LD6/d$a;->F:Ljava/lang/Object;

    check-cast p0, LD6/b;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, LD6/b;->e()LQ6/c;

    move-result-object p1

    invoke-virtual {p1}, LQ6/c;->b()Lio/ktor/utils/io/d;

    move-result-object p1

    iput-object p0, v0, LD6/d$a;->F:Ljava/lang/Object;

    iput v3, v0, LD6/d$a;->H:I

    invoke-static {p1, v0}, Lio/ktor/utils/io/f;->f(Lio/ktor/utils/io/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lo9/q;

    invoke-static {p1}, Lo9/r;->a(Lo9/q;)[B

    move-result-object p1

    new-instance v0, LD6/e;

    invoke-virtual {p0}, LD6/b;->c()LC6/c;

    move-result-object v1

    invoke-virtual {p0}, LD6/b;->d()LO6/b;

    move-result-object v2

    invoke-virtual {p0}, LD6/b;->e()LQ6/c;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0, p1}, LD6/e;-><init>(LC6/c;LO6/b;LQ6/c;[B)V

    return-object v0
.end method
