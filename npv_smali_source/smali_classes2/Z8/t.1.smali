.class abstract synthetic LZ8/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LZ8/f;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p1, LZ8/t$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LZ8/t$c;

    iget v1, v0, LZ8/t$c;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/t$c;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/t$c;

    invoke-direct {v0, p1}, LZ8/t$c;-><init>(Lm7/e;)V

    :goto_0
    iget-object p1, v0, LZ8/t$c;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/t$c;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LZ8/t$c;->G:Ljava/lang/Object;

    check-cast p0, LZ8/t$a;

    iget-object v0, v0, LZ8/t$c;->F:Ljava/lang/Object;

    check-cast v0, Ly7/O;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch La9/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    new-instance p1, Ly7/O;

    invoke-direct {p1}, Ly7/O;-><init>()V

    sget-object v2, La9/t;->a:Lb9/D;

    iput-object v2, p1, Ly7/O;->C:Ljava/lang/Object;

    new-instance v2, LZ8/t$a;

    invoke-direct {v2, p1}, LZ8/t$a;-><init>(Ly7/O;)V

    :try_start_1
    iput-object p1, v0, LZ8/t$c;->F:Ljava/lang/Object;

    iput-object v2, v0, LZ8/t$c;->G:Ljava/lang/Object;

    iput v3, v0, LZ8/t$c;->I:I

    invoke-interface {p0, v2, v0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch La9/a; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v0, p1

    move-object p1, p0

    move-object p0, v2

    :goto_1
    invoke-static {p1, p0}, La9/p;->a(La9/a;Ljava/lang/Object;)V

    :goto_2
    iget-object p0, v0, Ly7/O;->C:Ljava/lang/Object;

    sget-object p1, La9/t;->a:Lb9/D;

    if-eq p0, p1, :cond_4

    return-object p0

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Expected at least one element"

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(LZ8/f;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p2, LZ8/t$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LZ8/t$d;

    iget v1, v0, LZ8/t$d;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/t$d;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/t$d;

    invoke-direct {v0, p2}, LZ8/t$d;-><init>(Lm7/e;)V

    :goto_0
    iget-object p2, v0, LZ8/t$d;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/t$d;->J:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LZ8/t$d;->H:Ljava/lang/Object;

    check-cast p0, LZ8/t$b;

    iget-object p1, v0, LZ8/t$d;->G:Ljava/lang/Object;

    check-cast p1, Ly7/O;

    iget-object v0, v0, LZ8/t$d;->F:Ljava/lang/Object;

    check-cast v0, Lx7/p;

    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch La9/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    new-instance p2, Ly7/O;

    invoke-direct {p2}, Ly7/O;-><init>()V

    sget-object v2, La9/t;->a:Lb9/D;

    iput-object v2, p2, Ly7/O;->C:Ljava/lang/Object;

    new-instance v2, LZ8/t$b;

    invoke-direct {v2, p1, p2}, LZ8/t$b;-><init>(Lx7/p;Ly7/O;)V

    :try_start_1
    iput-object p1, v0, LZ8/t$d;->F:Ljava/lang/Object;

    iput-object p2, v0, LZ8/t$d;->G:Ljava/lang/Object;

    iput-object v2, v0, LZ8/t$d;->H:Ljava/lang/Object;

    iput v3, v0, LZ8/t$d;->J:I

    invoke-interface {p0, v2, v0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch La9/a; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    move-object p1, p2

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v0, p1

    move-object p1, p2

    move-object p2, p0

    move-object p0, v2

    :goto_1
    invoke-static {p2, p0}, La9/p;->a(La9/a;Ljava/lang/Object;)V

    :goto_2
    iget-object p0, p1, Ly7/O;->C:Ljava/lang/Object;

    sget-object p1, La9/t;->a:Lb9/D;

    if-eq p0, p1, :cond_4

    return-object p0

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Expected at least one element matching the predicate "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(LZ8/f;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p2, LZ8/t$f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LZ8/t$f;

    iget v1, v0, LZ8/t$f;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/t$f;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/t$f;

    invoke-direct {v0, p2}, LZ8/t$f;-><init>(Lm7/e;)V

    :goto_0
    iget-object p2, v0, LZ8/t$f;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/t$f;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LZ8/t$f;->G:Ljava/lang/Object;

    check-cast p0, LZ8/t$e;

    iget-object p1, v0, LZ8/t$f;->F:Ljava/lang/Object;

    check-cast p1, Ly7/O;

    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch La9/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    new-instance p2, Ly7/O;

    invoke-direct {p2}, Ly7/O;-><init>()V

    new-instance v2, LZ8/t$e;

    invoke-direct {v2, p1, p2}, LZ8/t$e;-><init>(Lx7/p;Ly7/O;)V

    :try_start_1
    iput-object p2, v0, LZ8/t$f;->F:Ljava/lang/Object;

    iput-object v2, v0, LZ8/t$f;->G:Ljava/lang/Object;

    iput v3, v0, LZ8/t$f;->I:I

    invoke-interface {p0, v2, v0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch La9/a; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p2

    goto :goto_2

    :catch_1
    move-exception p0

    move-object p1, p2

    move-object p2, p0

    move-object p0, v2

    :goto_1
    invoke-static {p2, p0}, La9/p;->a(La9/a;Ljava/lang/Object;)V

    :goto_2
    iget-object p0, p1, Ly7/O;->C:Ljava/lang/Object;

    return-object p0
.end method
