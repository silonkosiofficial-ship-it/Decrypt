.class final Lio/ktor/utils/io/k$c;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/ktor/utils/io/k;->k(LW8/N;Lm7/i;Lio/ktor/utils/io/a;Lx7/p;)Lio/ktor/utils/io/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:Lx7/p;

.field final synthetic K:Lio/ktor/utils/io/a;


# direct methods
.method constructor <init>(Lx7/p;Lio/ktor/utils/io/a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lio/ktor/utils/io/k$c;->J:Lx7/p;

    iput-object p2, p0, Lio/ktor/utils/io/k$c;->K:Lio/ktor/utils/io/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lio/ktor/utils/io/k$c;->H:I

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lio/ktor/utils/io/k$c;->I:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_9

    :catchall_0
    move-exception p1

    goto/16 :goto_a

    :pswitch_1
    iget-object v1, p0, Lio/ktor/utils/io/k$c;->G:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    iget-object v3, p0, Lio/ktor/utils/io/k$c;->I:Ljava/lang/Object;

    check-cast v3, LW8/N;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p1, v1

    goto/16 :goto_8

    :pswitch_2
    :try_start_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_6

    :pswitch_3
    iget-object v1, p0, Lio/ktor/utils/io/k$c;->I:Ljava/lang/Object;

    check-cast v1, LW8/N;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_4
    :try_start_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto/16 :goto_2

    :catchall_1
    move-exception p1

    goto/16 :goto_3

    :pswitch_5
    iget-object v1, p0, Lio/ktor/utils/io/k$c;->I:Ljava/lang/Object;

    check-cast v1, LW8/N;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    iget-object v1, p0, Lio/ktor/utils/io/k$c;->G:Ljava/lang/Object;

    check-cast v1, LW8/y;

    iget-object v3, p0, Lio/ktor/utils/io/k$c;->I:Ljava/lang/Object;

    check-cast v3, LW8/N;

    :try_start_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception p1

    goto/16 :goto_4

    :pswitch_7
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/ktor/utils/io/k$c;->I:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, LW8/N;

    invoke-interface {v3}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p1

    invoke-static {p1}, LW8/C0;->m(Lm7/i;)LW8/z0;

    move-result-object p1

    invoke-static {p1}, LW8/C0;->a(LW8/z0;)LW8/y;

    move-result-object v1

    :try_start_4
    iget-object p1, p0, Lio/ktor/utils/io/k$c;->J:Lx7/p;

    new-instance v4, Lio/ktor/utils/io/t;

    iget-object v5, p0, Lio/ktor/utils/io/k$c;->K:Lio/ktor/utils/io/a;

    invoke-interface {v3}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v6

    invoke-interface {v6, v1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lio/ktor/utils/io/t;-><init>(Lio/ktor/utils/io/g;Lm7/i;)V

    iput-object v3, p0, Lio/ktor/utils/io/k$c;->I:Ljava/lang/Object;

    iput-object v1, p0, Lio/ktor/utils/io/k$c;->G:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, p0, Lio/ktor/utils/io/k$c;->H:I

    invoke-interface {p1, v4, p0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_0

    return-object v0

    :cond_0
    :goto_0
    invoke-interface {v1}, LW8/y;->K0()Z

    invoke-interface {v3}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p1

    invoke-static {p1}, LW8/C0;->m(Lm7/i;)LW8/z0;

    move-result-object p1

    invoke-interface {p1}, LW8/z0;->isCancelled()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/ktor/utils/io/k$c;->K:Lio/ktor/utils/io/a;

    invoke-interface {v3}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v4

    invoke-static {v4}, LW8/C0;->m(Lm7/i;)LW8/z0;

    move-result-object v4

    invoke-interface {v4}, LW8/z0;->e0()Ljava/util/concurrent/CancellationException;

    move-result-object v4

    invoke-virtual {p1, v4}, Lio/ktor/utils/io/a;->k(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_1
    iput-object v3, p0, Lio/ktor/utils/io/k$c;->I:Ljava/lang/Object;

    iput-object v2, p0, Lio/ktor/utils/io/k$c;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lio/ktor/utils/io/k$c;->H:I

    invoke-interface {v1, p0}, LW8/z0;->g0(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_1
    iget-object p1, p0, Lio/ktor/utils/io/k$c;->K:Lio/ktor/utils/io/a;

    :try_start_5
    sget-object v1, Li7/w;->D:Li7/w$a;

    iput-object v2, p0, Lio/ktor/utils/io/k$c;->I:Ljava/lang/Object;

    const/4 v1, 0x3

    iput v1, p0, Lio/ktor/utils/io/k$c;->H:I

    invoke-virtual {p1, p0}, Lio/ktor/utils/io/a;->e(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_7

    :goto_3
    sget-object v0, Li7/w;->D:Li7/w$a;

    invoke-static {p1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :goto_4
    :try_start_6
    const-string v4, "Exception thrown while writing to channel"

    invoke-static {v1, v4, p1}, LW8/C0;->c(LW8/z0;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v4, p0, Lio/ktor/utils/io/k$c;->K:Lio/ktor/utils/io/a;

    invoke-virtual {v4, p1}, Lio/ktor/utils/io/a;->k(Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    iput-object v3, p0, Lio/ktor/utils/io/k$c;->I:Ljava/lang/Object;

    iput-object v2, p0, Lio/ktor/utils/io/k$c;->G:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, p0, Lio/ktor/utils/io/k$c;->H:I

    invoke-interface {v1, p0}, LW8/z0;->g0(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_5
    iget-object p1, p0, Lio/ktor/utils/io/k$c;->K:Lio/ktor/utils/io/a;

    :try_start_7
    sget-object v1, Li7/w;->D:Li7/w$a;

    iput-object v2, p0, Lio/ktor/utils/io/k$c;->I:Ljava/lang/Object;

    const/4 v1, 0x5

    iput v1, p0, Lio/ktor/utils/io/k$c;->H:I

    invoke-virtual {p1, p0}, Lio/ktor/utils/io/a;->e(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_6
    sget-object p1, Li7/M;->a:Li7/M;

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :goto_7
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_3
    move-exception p1

    iput-object v3, p0, Lio/ktor/utils/io/k$c;->I:Ljava/lang/Object;

    iput-object p1, p0, Lio/ktor/utils/io/k$c;->G:Ljava/lang/Object;

    const/4 v3, 0x6

    iput v3, p0, Lio/ktor/utils/io/k$c;->H:I

    invoke-interface {v1, p0}, LW8/z0;->g0(Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_8
    iget-object v1, p0, Lio/ktor/utils/io/k$c;->K:Lio/ktor/utils/io/a;

    :try_start_8
    sget-object v3, Li7/w;->D:Li7/w$a;

    iput-object p1, p0, Lio/ktor/utils/io/k$c;->I:Ljava/lang/Object;

    iput-object v2, p0, Lio/ktor/utils/io/k$c;->G:Ljava/lang/Object;

    const/4 v2, 0x7

    iput v2, p0, Lio/ktor/utils/io/k$c;->H:I

    invoke-virtual {v1, p0}, Lio/ktor/utils/io/a;->e(Lm7/e;)Ljava/lang/Object;

    move-result-object v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    if-ne v1, v0, :cond_7

    return-object v0

    :cond_7
    move-object v0, p1

    :goto_9
    :try_start_9
    sget-object p1, Li7/M;->a:Li7/M;

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_b

    :catchall_4
    move-exception v0

    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    :goto_a
    sget-object v1, Li7/w;->D:Li7/w$a;

    invoke-static {p1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_b
    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lio/ktor/utils/io/k$c;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lio/ktor/utils/io/k$c;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lio/ktor/utils/io/k$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lio/ktor/utils/io/k$c;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, Lio/ktor/utils/io/k$c;

    iget-object v1, p0, Lio/ktor/utils/io/k$c;->J:Lx7/p;

    iget-object v2, p0, Lio/ktor/utils/io/k$c;->K:Lio/ktor/utils/io/a;

    invoke-direct {v0, v1, v2, p2}, Lio/ktor/utils/io/k$c;-><init>(Lx7/p;Lio/ktor/utils/io/a;Lm7/e;)V

    iput-object p1, v0, Lio/ktor/utils/io/k$c;->I:Ljava/lang/Object;

    return-object v0
.end method
