.class public abstract Lw/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lz0/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lw/c;->b(Lz0/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lz0/c;Lm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    instance-of v0, p1, Lw/c$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lw/c$a;

    iget v1, v0, Lw/c$a;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw/c$a;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw/c$a;

    invoke-direct {v0, p1}, Lw/c$a;-><init>(Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lw/c$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lw/c$a;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lw/c$a;->F:Ljava/lang/Object;

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

    :cond_3
    :goto_1
    iput-object p0, v0, Lw/c$a;->F:Ljava/lang/Object;

    iput v3, v0, Lw/c$a;->H:I

    const/4 p1, 0x0

    invoke-static {p0, p1, v0, v3, p1}, Lz0/b;->a(Lz0/c;Lz0/r;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    check-cast p1, Lz0/p;

    invoke-virtual {p1}, Lz0/p;->b()I

    move-result v2

    invoke-static {v2}, Lz0/u;->c(I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Lz0/p;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_3
    if-ge v6, v4, :cond_6

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lz0/B;

    invoke-static {v7}, Lz0/q;->a(Lz0/B;)Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_6
    invoke-virtual {p1}, Lz0/p;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/d;Lw/i;)Landroidx/compose/ui/d;
    .locals 3

    sget-object v0, Lw/d;->a:Lw/d;

    new-instance v1, Lw/c$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lw/c$b;-><init>(Lw/i;Lm7/e;)V

    invoke-static {p0, v0, v1}, Lz0/U;->d(Landroidx/compose/ui/d;Ljava/lang/Object;Lx7/p;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lz0/K;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    new-instance v0, Lw/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lw/c$c;-><init>(Lx7/l;Lm7/e;)V

    invoke-static {p0, v0, p2}, Lx/q;->c(Lz0/K;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method
