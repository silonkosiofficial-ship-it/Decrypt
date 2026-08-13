.class final Lh2/z$i;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/z;-><init>(Ljava/lang/Object;Lh2/L;Lh2/E;LZ8/f;Lh2/Q;Lh2/M;Lx7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:I

.field private synthetic K:Ljava/lang/Object;

.field final synthetic L:Lh2/z;


# direct methods
.method constructor <init>(Lh2/z;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/z$i;->L:Lh2/z;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh2/z$i;->J:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lh2/z$i;->H:Ljava/lang/Object;

    check-cast v0, Lf9/a;

    iget-object v1, p0, Lh2/z$i;->G:Ljava/lang/Object;

    check-cast v1, Lh2/B$a;

    iget-object v2, p0, Lh2/z$i;->K:Ljava/lang/Object;

    check-cast v2, Lh2/T;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lh2/z$i;->K:Ljava/lang/Object;

    check-cast v1, Lh2/T;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p1, v1

    goto/16 :goto_2

    :cond_2
    iget-object v1, p0, Lh2/z$i;->I:Ljava/lang/Object;

    check-cast v1, Lf9/a;

    iget-object v4, p0, Lh2/z$i;->H:Ljava/lang/Object;

    check-cast v4, Lh2/B$a;

    iget-object v6, p0, Lh2/z$i;->G:Ljava/lang/Object;

    check-cast v6, Lh2/Q;

    iget-object v7, p0, Lh2/z$i;->K:Ljava/lang/Object;

    check-cast v7, Lh2/T;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/z$i;->K:Ljava/lang/Object;

    check-cast p1, Lh2/T;

    iget-object v1, p0, Lh2/z$i;->L:Lh2/z;

    invoke-static {v1}, Lh2/z;->h(Lh2/z;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    const/4 v12, 0x0

    invoke-virtual {v1, v12, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_a

    new-instance v9, Lh2/z$i$a;

    iget-object v1, p0, Lh2/z$i;->L:Lh2/z;

    invoke-direct {v9, v1, p1, v5}, Lh2/z$i$a;-><init>(Lh2/z;Lh2/T;Lm7/e;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, p1

    invoke-static/range {v6 .. v11}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    const/4 v1, 0x6

    invoke-static {v12, v5, v5, v1, v5}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object v1

    new-instance v9, Lh2/z$i$b;

    iget-object v6, p0, Lh2/z$i;->L:Lh2/z;

    invoke-direct {v9, v6, v1, v5}, Lh2/z$i$b;-><init>(Lh2/z;LY8/j;Lm7/e;)V

    move-object v6, p1

    invoke-static/range {v6 .. v11}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    new-instance v9, Lh2/z$i$c;

    iget-object v6, p0, Lh2/z$i;->L:Lh2/z;

    invoke-direct {v9, v1, v6, v5}, Lh2/z$i$c;-><init>(LY8/j;Lh2/z;Lm7/e;)V

    move-object v6, p1

    invoke-static/range {v6 .. v11}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    iget-object v1, p0, Lh2/z$i;->L:Lh2/z;

    invoke-virtual {v1}, Lh2/z;->w()Lh2/Q;

    move-result-object v6

    if-eqz v6, :cond_6

    iget-object v1, p0, Lh2/z$i;->L:Lh2/z;

    invoke-static {v1}, Lh2/z;->i(Lh2/z;)Lh2/M;

    move-result-object v7

    if-nez v7, :cond_5

    invoke-static {v1}, Lh2/z;->k(Lh2/z;)Lh2/B$a;

    move-result-object v1

    invoke-static {v1}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v7

    iput-object p1, p0, Lh2/z$i;->K:Ljava/lang/Object;

    iput-object v6, p0, Lh2/z$i;->G:Ljava/lang/Object;

    iput-object v1, p0, Lh2/z$i;->H:Ljava/lang/Object;

    iput-object v7, p0, Lh2/z$i;->I:Ljava/lang/Object;

    iput v4, p0, Lh2/z$i;->J:I

    invoke-interface {v7, v5, p0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_4

    return-object v0

    :cond_4
    move-object v4, v1

    move-object v1, v7

    move-object v7, p1

    :goto_0
    :try_start_0
    invoke-static {v4}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p1

    invoke-virtual {p1, v5}, Lh2/B;->g(Lh2/Z$a;)Lh2/M;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    move-object v13, v7

    move-object v7, p1

    move-object p1, v13

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-interface {v1, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    :cond_5
    :goto_1
    invoke-interface {v6, v7}, Lh2/Q;->d(Lh2/M;)V

    :cond_6
    iget-object v1, p0, Lh2/z$i;->L:Lh2/z;

    iput-object p1, p0, Lh2/z$i;->K:Ljava/lang/Object;

    iput-object v5, p0, Lh2/z$i;->G:Ljava/lang/Object;

    iput-object v5, p0, Lh2/z$i;->H:Ljava/lang/Object;

    iput-object v5, p0, Lh2/z$i;->I:Ljava/lang/Object;

    iput v3, p0, Lh2/z$i;->J:I

    invoke-static {v1, p0}, Lh2/z;->b(Lh2/z;Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_2
    iget-object v1, p0, Lh2/z$i;->L:Lh2/z;

    invoke-static {v1}, Lh2/z;->k(Lh2/z;)Lh2/B$a;

    move-result-object v1

    invoke-static {v1}, Lh2/B$a;->a(Lh2/B$a;)Lf9/a;

    move-result-object v3

    iput-object p1, p0, Lh2/z$i;->K:Ljava/lang/Object;

    iput-object v1, p0, Lh2/z$i;->G:Ljava/lang/Object;

    iput-object v3, p0, Lh2/z$i;->H:Ljava/lang/Object;

    iput v2, p0, Lh2/z$i;->J:I

    invoke-interface {v3, v5, p0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_8

    return-object v0

    :cond_8
    move-object v2, p1

    move-object v0, v3

    :goto_3
    :try_start_1
    invoke-static {v1}, Lh2/B$a;->b(Lh2/B$a;)Lh2/B;

    move-result-object p1

    invoke-virtual {p1}, Lh2/B;->p()Lh2/w;

    move-result-object p1

    sget-object v1, Lh2/t;->C:Lh2/t;

    invoke-virtual {p1, v1}, Lh2/w;->a(Lh2/t;)Lh2/r;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface {v0, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    instance-of p1, p1, Lh2/r$a;

    if-nez p1, :cond_9

    iget-object p1, p0, Lh2/z$i;->L:Lh2/z;

    invoke-static {p1, v2}, Lh2/z;->n(Lh2/z;LW8/N;)V

    :cond_9
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_1
    move-exception p1

    invoke-interface {v0, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(Lh2/T;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lh2/z$i;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh2/z$i;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lh2/z$i;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh2/T;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lh2/z$i;->H(Lh2/T;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, Lh2/z$i;

    iget-object v1, p0, Lh2/z$i;->L:Lh2/z;

    invoke-direct {v0, v1, p2}, Lh2/z$i;-><init>(Lh2/z;Lm7/e;)V

    iput-object p1, v0, Lh2/z$i;->K:Ljava/lang/Object;

    return-object v0
.end method
