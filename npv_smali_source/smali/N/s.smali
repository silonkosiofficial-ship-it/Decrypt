.class public abstract LN/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lz0/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LN/s;->e(Lz0/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Landroidx/compose/ui/platform/A1;Lz0/B;Lz0/B;)Z
    .locals 0

    invoke-static {p0, p1, p2}, LN/s;->f(Landroidx/compose/ui/platform/A1;Lz0/B;Lz0/B;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(Lz0/c;LN/h;LN/d;Lz0/p;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LN/s;->h(Lz0/c;LN/h;LN/d;Lz0/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lz0/c;LH/F;Lz0/p;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LN/s;->j(Lz0/c;LH/F;Lz0/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lz0/c;Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    instance-of v0, p1, LN/s$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LN/s$a;

    iget v1, v0, LN/s$a;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LN/s$a;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, LN/s$a;

    invoke-direct {v0, p1}, LN/s$a;-><init>(Lm7/e;)V

    :goto_0
    iget-object p1, v0, LN/s$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LN/s$a;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LN/s$a;->F:Ljava/lang/Object;

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

    :goto_1
    sget-object p1, Lz0/r;->D:Lz0/r;

    iput-object p0, v0, LN/s$a;->F:Ljava/lang/Object;

    iput v3, v0, LN/s$a;->H:I

    invoke-interface {p0, p1, v0}, Lz0/c;->X0(Lz0/r;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    check-cast p1, Lz0/p;

    invoke-virtual {p1}, Lz0/p;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v4, :cond_5

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lz0/B;

    invoke-static {v6}, Lz0/q;->b(Lz0/B;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_1

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_5
    return-object p1
.end method

.method private static final f(Landroidx/compose/ui/platform/A1;Lz0/B;Lz0/B;)Z
    .locals 2

    .prologue
    invoke-virtual {p1}, Lz0/B;->n()I

    move-result v0

    invoke-static {p0, v0}, Lx/l;->i(Landroidx/compose/ui/platform/A1;I)F

    move-result p0

    invoke-virtual {p1}, Lz0/B;->h()J

    move-result-wide v0

    invoke-virtual {p2}, Lz0/B;->h()J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Ln0/g;->q(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, Ln0/g;->k(J)F

    move-result p1

    cmpg-float p0, p1, p0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final g(Lz0/p;)Z
    .locals 5

    .prologue
    invoke-virtual {p0}, Lz0/p;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz0/B;

    invoke-virtual {v3}, Lz0/B;->n()I

    move-result v3

    sget-object v4, Lz0/P;->a:Lz0/P$a;

    invoke-virtual {v4}, Lz0/P$a;->b()I

    move-result v4

    invoke-static {v3, v4}, Lz0/P;->g(II)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    :goto_1
    return v1
.end method

.method private static final h(Lz0/c;LN/h;LN/d;Lz0/p;Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    instance-of v0, p4, LN/s$b;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, LN/s$b;

    iget v1, v0, LN/s$b;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LN/s$b;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, LN/s$b;

    invoke-direct {v0, p4}, LN/s$b;-><init>(Lm7/e;)V

    :goto_0
    iget-object p4, v0, LN/s$b;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LN/s$b;->I:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, LN/s$b;->G:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LN/h;

    iget-object p0, v0, LN/s$b;->F:Ljava/lang/Object;

    check-cast p0, Lz0/c;

    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, LN/s$b;->G:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LN/h;

    iget-object p0, v0, LN/s$b;->F:Ljava/lang/Object;

    check-cast p0, Lz0/c;

    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-virtual {p2, p3}, LN/d;->d(Lz0/p;)V

    invoke-virtual {p3}, Lz0/p;->c()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lz0/B;

    invoke-static {p3}, LN/H;->b(Lz0/p;)Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-virtual {p4}, Lz0/B;->h()J

    move-result-wide p2

    invoke-interface {p1, p2, p3}, LN/h;->e(J)Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-virtual {p4}, Lz0/B;->f()J

    move-result-wide p2

    new-instance p4, LN/s$c;

    invoke-direct {p4, p1}, LN/s$c;-><init>(LN/h;)V

    iput-object p0, v0, LN/s$b;->F:Ljava/lang/Object;

    iput-object p1, v0, LN/s$b;->G:Ljava/lang/Object;

    iput v5, v0, LN/s$b;->I:I

    invoke-static {p0, p2, p3, p4, v0}, Lx/l;->g(Lz0/c;JLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p0}, Lz0/c;->L()Lz0/p;

    move-result-object p0

    invoke-virtual {p0}, Lz0/p;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    :goto_2
    if-ge v3, p2, :cond_6

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lz0/B;

    invoke-static {p3}, Lz0/q;->c(Lz0/B;)Z

    move-result p4

    if-eqz p4, :cond_5

    invoke-virtual {p3}, Lz0/B;->a()V

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    invoke-interface {p1}, LN/h;->d()V

    goto :goto_6

    :cond_7
    invoke-virtual {p2}, LN/d;->a()I

    move-result p2

    if-eq p2, v5, :cond_9

    if-eq p2, v4, :cond_8

    sget-object p2, LN/q;->a:LN/q$a;

    invoke-virtual {p2}, LN/q$a;->m()LN/q;

    move-result-object p2

    goto :goto_3

    :cond_8
    sget-object p2, LN/q;->a:LN/q$a;

    invoke-virtual {p2}, LN/q$a;->n()LN/q;

    move-result-object p2

    goto :goto_3

    :cond_9
    sget-object p2, LN/q;->a:LN/q$a;

    invoke-virtual {p2}, LN/q$a;->l()LN/q;

    move-result-object p2

    :goto_3
    invoke-virtual {p4}, Lz0/B;->h()J

    move-result-wide v5

    invoke-interface {p1, v5, v6, p2}, LN/h;->a(JLN/q;)Z

    move-result p3

    if-eqz p3, :cond_c

    invoke-virtual {p4}, Lz0/B;->f()J

    move-result-wide p3

    new-instance v2, LN/s$d;

    invoke-direct {v2, p1, p2}, LN/s$d;-><init>(LN/h;LN/q;)V

    iput-object p0, v0, LN/s$b;->F:Ljava/lang/Object;

    iput-object p1, v0, LN/s$b;->G:Ljava/lang/Object;

    iput v4, v0, LN/s$b;->I:I

    invoke-static {p0, p3, p4, v2, v0}, Lx/l;->g(Lz0/c;JLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_a

    return-object v1

    :cond_a
    :goto_4
    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p0}, Lz0/c;->L()Lz0/p;

    move-result-object p0

    invoke-virtual {p0}, Lz0/p;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    :goto_5
    if-ge v3, p2, :cond_6

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lz0/B;

    invoke-static {p3}, Lz0/q;->c(Lz0/B;)Z

    move-result p4

    if-eqz p4, :cond_b

    invoke-virtual {p3}, Lz0/B;->a()V

    :cond_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_c
    :goto_6
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/d;LN/h;LH/F;)Landroidx/compose/ui/d;
    .locals 2

    new-instance v0, LN/s$e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, LN/s$e;-><init>(LN/h;LH/F;Lm7/e;)V

    invoke-static {p0, p1, p2, v0}, Lz0/U;->c(Landroidx/compose/ui/d;Ljava/lang/Object;Ljava/lang/Object;Lx7/p;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lz0/c;LH/F;Lz0/p;Lm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    instance-of v0, p3, LN/s$f;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LN/s$f;

    iget v1, v0, LN/s$f;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LN/s$f;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, LN/s$f;

    invoke-direct {v0, p3}, LN/s$f;-><init>(Lm7/e;)V

    :goto_0
    iget-object p3, v0, LN/s$f;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LN/s$f;->J:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LN/s$f;->G:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LH/F;

    iget-object p0, v0, LN/s$f;->F:Ljava/lang/Object;

    check-cast p0, Lz0/c;

    :try_start_0
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p0

    goto/16 :goto_5

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, LN/s$f;->H:Ljava/lang/Object;

    check-cast p0, Lz0/B;

    iget-object p1, v0, LN/s$f;->G:Ljava/lang/Object;

    check-cast p1, LH/F;

    iget-object p2, v0, LN/s$f;->F:Ljava/lang/Object;

    check-cast p2, Lz0/c;

    :try_start_1
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v7, p2

    move-object p2, p0

    move-object p0, v7

    goto :goto_1

    :cond_3
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_2
    invoke-virtual {p2}, Lz0/p;->c()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lz0/B;

    invoke-virtual {p2}, Lz0/B;->f()J

    move-result-wide v5

    iput-object p0, v0, LN/s$f;->F:Ljava/lang/Object;

    iput-object p1, v0, LN/s$f;->G:Ljava/lang/Object;

    iput-object p2, v0, LN/s$f;->H:Ljava/lang/Object;

    iput v4, v0, LN/s$f;->J:I

    invoke-static {p0, v5, v6, v0}, Lx/l;->c(Lz0/c;JLm7/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p3, Lz0/B;

    if-eqz p3, :cond_9

    invoke-interface {p0}, Lz0/c;->getViewConfiguration()Landroidx/compose/ui/platform/A1;

    move-result-object v2

    invoke-static {v2, p2, p3}, LN/s;->f(Landroidx/compose/ui/platform/A1;Lz0/B;Lz0/B;)Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-virtual {p3}, Lz0/B;->h()J

    move-result-wide v4

    invoke-interface {p1, v4, v5}, LH/F;->b(J)V

    invoke-virtual {p3}, Lz0/B;->f()J

    move-result-wide p2

    new-instance v2, LN/s$g;

    invoke-direct {v2, p1}, LN/s$g;-><init>(LH/F;)V

    iput-object p0, v0, LN/s$f;->F:Ljava/lang/Object;

    iput-object p1, v0, LN/s$f;->G:Ljava/lang/Object;

    const/4 v4, 0x0

    iput-object v4, v0, LN/s$f;->H:Ljava/lang/Object;

    iput v3, v0, LN/s$f;->J:I

    invoke-static {p0, p2, p3, v2, v0}, Lx/l;->g(Lz0/c;JLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-interface {p0}, Lz0/c;->L()Lz0/p;

    move-result-object p0

    invoke-virtual {p0}, Lz0/p;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    const/4 p3, 0x0

    :goto_3
    if-ge p3, p2, :cond_7

    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz0/B;

    invoke-static {v0}, Lz0/q;->c(Lz0/B;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lz0/B;->a()V

    :cond_6
    add-int/lit8 p3, p3, 0x1

    goto :goto_3

    :cond_7
    invoke-interface {p1}, LH/F;->c()V

    goto :goto_4

    :cond_8
    invoke-interface {p1}, LH/F;->onCancel()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_9
    :goto_4
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0

    :goto_5
    invoke-interface {p1}, LH/F;->onCancel()V

    throw p0
.end method

.method public static final k(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;
    .locals 3

    const v0, 0x845fed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LN/s$h;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, LN/s$h;-><init>(Lx7/l;Lm7/e;)V

    invoke-static {p0, v0, v1}, Lz0/U;->d(Landroidx/compose/ui/d;Ljava/lang/Object;Lx7/p;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
