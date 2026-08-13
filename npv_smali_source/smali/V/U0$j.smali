.class final LV/U0$j;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/U0;->t0(Lx7/q;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:LV/U0;

.field final synthetic K:Lx7/q;

.field final synthetic L:LV/j0;


# direct methods
.method constructor <init>(LV/U0;Lx7/q;LV/j0;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LV/U0$j;->J:LV/U0;

    iput-object p2, p0, LV/U0$j;->K:Lx7/q;

    iput-object p3, p0, LV/U0$j;->L:LV/j0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LV/U0$j;->H:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, LV/U0$j;->G:Ljava/lang/Object;

    check-cast v0, Lf0/f;

    iget-object v1, p0, LV/U0$j;->I:Ljava/lang/Object;

    check-cast v1, LW8/z0;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LV/U0$j;->I:Ljava/lang/Object;

    check-cast p1, LW8/N;

    invoke-interface {p1}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p1

    invoke-static {p1}, LW8/C0;->m(Lm7/i;)LW8/z0;

    move-result-object v1

    iget-object p1, p0, LV/U0$j;->J:LV/U0;

    invoke-static {p1, v1}, LV/U0;->P(LV/U0;LW8/z0;)V

    sget-object p1, Lf0/k;->e:Lf0/k$a;

    new-instance v4, LV/U0$j$b;

    iget-object v5, p0, LV/U0$j;->J:LV/U0;

    invoke-direct {v4, v5}, LV/U0$j$b;-><init>(LV/U0;)V

    invoke-virtual {p1, v4}, Lf0/k$a;->i(Lx7/p;)Lf0/f;

    move-result-object p1

    sget-object v4, LV/U0;->y:LV/U0$a;

    iget-object v5, p0, LV/U0$j;->J:LV/U0;

    invoke-static {v5}, LV/U0;->C(LV/U0;)LV/U0$c;

    move-result-object v5

    invoke-static {v4, v5}, LV/U0$a;->a(LV/U0$a;LV/U0$c;)V

    :try_start_1
    iget-object v4, p0, LV/U0$j;->J:LV/U0;

    invoke-static {v4}, LV/U0;->G(LV/U0;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, LV/U0$j;->J:LV/U0;

    monitor-enter v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v5}, LV/U0;->B(LV/U0;)Ljava/util/List;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    monitor-exit v4

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_2

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LV/G;

    invoke-interface {v7}, LV/G;->x()V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v8, v0

    move-object v0, p1

    move-object p1, v8

    goto :goto_4

    :cond_2
    new-instance v4, LV/U0$j$a;

    iget-object v5, p0, LV/U0$j;->K:Lx7/q;

    iget-object v6, p0, LV/U0$j;->L:LV/j0;

    invoke-direct {v4, v5, v6, v2}, LV/U0$j$a;-><init>(Lx7/q;LV/j0;Lm7/e;)V

    iput-object v1, p0, LV/U0$j;->I:Ljava/lang/Object;

    iput-object p1, p0, LV/U0$j;->G:Ljava/lang/Object;

    iput v3, p0, LV/U0$j;->H:I

    invoke-static {v4, p0}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, p1

    :goto_1
    invoke-interface {v0}, Lf0/f;->e()V

    iget-object p1, p0, LV/U0$j;->J:LV/U0;

    invoke-static {p1}, LV/U0;->G(LV/U0;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LV/U0$j;->J:LV/U0;

    monitor-enter p1

    :try_start_4
    invoke-static {v0}, LV/U0;->D(LV/U0;)LW8/z0;

    move-result-object v3

    if-ne v3, v1, :cond_4

    invoke-static {v0, v2}, LV/U0;->T(LV/U0;LW8/z0;)V

    goto :goto_2

    :catchall_2
    move-exception v0

    goto :goto_3

    :cond_4
    :goto_2
    invoke-static {v0}, LV/U0;->t(LV/U0;)LW8/l;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit p1

    sget-object p1, LV/U0;->y:LV/U0$a;

    iget-object v0, p0, LV/U0$j;->J:LV/U0;

    invoke-static {v0}, LV/U0;->C(LV/U0;)LV/U0$c;

    move-result-object v0

    invoke-static {p1, v0}, LV/U0$a;->b(LV/U0$a;LV/U0$c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :goto_3
    monitor-exit p1

    throw v0

    :catchall_3
    move-exception v0

    :try_start_5
    monitor-exit v4

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_4
    invoke-interface {v0}, Lf0/f;->e()V

    iget-object v0, p0, LV/U0$j;->J:LV/U0;

    invoke-static {v0}, LV/U0;->G(LV/U0;)Ljava/lang/Object;

    move-result-object v0

    iget-object v3, p0, LV/U0$j;->J:LV/U0;

    monitor-enter v0

    :try_start_6
    invoke-static {v3}, LV/U0;->D(LV/U0;)LW8/z0;

    move-result-object v4

    if-ne v4, v1, :cond_5

    invoke-static {v3, v2}, LV/U0;->T(LV/U0;LW8/z0;)V

    goto :goto_5

    :catchall_4
    move-exception p1

    goto :goto_6

    :cond_5
    :goto_5
    invoke-static {v3}, LV/U0;->t(LV/U0;)LW8/l;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    monitor-exit v0

    sget-object v0, LV/U0;->y:LV/U0$a;

    iget-object v1, p0, LV/U0$j;->J:LV/U0;

    invoke-static {v1}, LV/U0;->C(LV/U0;)LV/U0$c;

    move-result-object v1

    invoke-static {v0, v1}, LV/U0$a;->b(LV/U0$a;LV/U0$c;)V

    throw p1

    :goto_6
    monitor-exit v0

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LV/U0$j;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LV/U0$j;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LV/U0$j;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LV/U0$j;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, LV/U0$j;

    iget-object v1, p0, LV/U0$j;->J:LV/U0;

    iget-object v2, p0, LV/U0$j;->K:Lx7/q;

    iget-object v3, p0, LV/U0$j;->L:LV/j0;

    invoke-direct {v0, v1, v2, v3, p2}, LV/U0$j;-><init>(LV/U0;Lx7/q;LV/j0;Lm7/e;)V

    iput-object p1, v0, LV/U0$j;->I:Ljava/lang/Object;

    return-object v0
.end method
