.class public abstract Lx/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lz0/c;)Z
    .locals 5

    .prologue
    invoke-interface {p0}, Lz0/c;->L()Lz0/p;

    move-result-object p0

    invoke-virtual {p0}, Lz0/p;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x1

    if-ge v2, v0, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lz0/B;

    invoke-virtual {v4}, Lz0/B;->i()Z

    move-result v4

    if-eqz v4, :cond_0

    move v1, v3

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    xor-int/lit8 p0, v1, 0x1

    return p0
.end method

.method public static final b(Lz0/c;Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    instance-of v0, p1, Lx/q$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lx/q$a;

    iget v1, v0, Lx/q$a;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx/q$a;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx/q$a;

    invoke-direct {v0, p1}, Lx/q$a;-><init>(Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lx/q$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lx/q$a;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lx/q$a;->F:Ljava/lang/Object;

    check-cast p0, Lz0/c;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-static {p0}, Lx/q;->a(Lz0/c;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_1
    sget-object p1, Lz0/r;->E:Lz0/r;

    iput-object p0, v0, Lx/q$a;->F:Ljava/lang/Object;

    iput v3, v0, Lx/q$a;->H:I

    invoke-interface {p0, p1, v0}, Lz0/c;->X0(Lz0/r;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    check-cast p1, Lz0/p;

    invoke-virtual {p1}, Lz0/p;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v2, :cond_5

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lz0/B;

    invoke-virtual {v5}, Lz0/B;->i()Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_1

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_5
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final c(Lz0/K;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-interface {p2}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    new-instance v1, Lx/q$b;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p1, v2}, Lx/q$b;-><init>(Lm7/i;Lx7/p;Lm7/e;)V

    invoke-interface {p0, v1, p2}, Lz0/K;->V(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method
