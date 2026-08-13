.class final Lv/N$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/N;->d(Lv/L;Lx7/l;Lm7/e;)Ljava/lang/Object;
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

.field final synthetic L:Lv/L;

.field final synthetic M:Lv/N;

.field final synthetic N:Lx7/l;


# direct methods
.method constructor <init>(Lv/L;Lv/N;Lx7/l;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lv/N$b;->L:Lv/L;

    iput-object p2, p0, Lv/N$b;->M:Lv/N;

    iput-object p3, p0, Lv/N$b;->N:Lx7/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lv/N$b;->J:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lv/N$b;->H:Ljava/lang/Object;

    check-cast v0, Lv/N;

    iget-object v1, p0, Lv/N$b;->G:Ljava/lang/Object;

    check-cast v1, Lf9/a;

    iget-object v2, p0, Lv/N$b;->K:Ljava/lang/Object;

    check-cast v2, Lv/N$a;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lv/N$b;->I:Ljava/lang/Object;

    check-cast v1, Lv/N;

    iget-object v3, p0, Lv/N$b;->H:Ljava/lang/Object;

    check-cast v3, Lx7/l;

    iget-object v5, p0, Lv/N$b;->G:Ljava/lang/Object;

    check-cast v5, Lf9/a;

    iget-object v6, p0, Lv/N$b;->K:Ljava/lang/Object;

    check-cast v6, Lv/N$a;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p1, v5

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lv/N$b;->K:Ljava/lang/Object;

    check-cast p1, LW8/N;

    new-instance v1, Lv/N$a;

    iget-object v5, p0, Lv/N$b;->L:Lv/L;

    invoke-interface {p1}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p1

    sget-object v6, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p1, v6}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p1, LW8/z0;

    invoke-direct {v1, v5, p1}, Lv/N$a;-><init>(Lv/L;LW8/z0;)V

    iget-object p1, p0, Lv/N$b;->M:Lv/N;

    invoke-static {p1, v1}, Lv/N;->c(Lv/N;Lv/N$a;)V

    iget-object p1, p0, Lv/N$b;->M:Lv/N;

    invoke-static {p1}, Lv/N;->b(Lv/N;)Lf9/a;

    move-result-object p1

    iget-object v5, p0, Lv/N$b;->N:Lx7/l;

    iget-object v6, p0, Lv/N$b;->M:Lv/N;

    iput-object v1, p0, Lv/N$b;->K:Ljava/lang/Object;

    iput-object p1, p0, Lv/N$b;->G:Ljava/lang/Object;

    iput-object v5, p0, Lv/N$b;->H:Ljava/lang/Object;

    iput-object v6, p0, Lv/N$b;->I:Ljava/lang/Object;

    iput v3, p0, Lv/N$b;->J:I

    invoke-interface {p1, v4, p0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    move-object v3, v5

    move-object v7, v6

    move-object v6, v1

    move-object v1, v7

    :goto_0
    :try_start_1
    iput-object v6, p0, Lv/N$b;->K:Ljava/lang/Object;

    iput-object p1, p0, Lv/N$b;->G:Ljava/lang/Object;

    iput-object v1, p0, Lv/N$b;->H:Ljava/lang/Object;

    iput-object v4, p0, Lv/N$b;->I:Ljava/lang/Object;

    iput v2, p0, Lv/N$b;->J:I

    invoke-interface {v3, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-ne v2, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, v1

    move-object v1, p1

    move-object p1, v2

    move-object v2, v6

    :goto_1
    :try_start_2
    invoke-static {v0}, Lv/N;->a(Lv/N;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0, v2, v4}, Lu/c0;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-interface {v1, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    return-object p1

    :catchall_1
    move-exception p1

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v2, v6

    move-object v7, v1

    move-object v1, p1

    move-object p1, v0

    move-object v0, v7

    :goto_2
    :try_start_3
    invoke-static {v0}, Lv/N;->a(Lv/N;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0, v2, v4}, Lu/c0;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_3
    invoke-interface {v1, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lv/N$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lv/N$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lv/N$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lv/N$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, Lv/N$b;

    iget-object v1, p0, Lv/N$b;->L:Lv/L;

    iget-object v2, p0, Lv/N$b;->M:Lv/N;

    iget-object v3, p0, Lv/N$b;->N:Lx7/l;

    invoke-direct {v0, v1, v2, v3, p2}, Lv/N$b;-><init>(Lv/L;Lv/N;Lx7/l;Lm7/e;)V

    iput-object p1, v0, Lv/N$b;->K:Ljava/lang/Object;

    return-object v0
.end method
