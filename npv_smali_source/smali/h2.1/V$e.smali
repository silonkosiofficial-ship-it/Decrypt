.class final Lh2/V$e;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/V;->b(ILx7/l;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lh2/V;

.field final synthetic J:I

.field final synthetic K:Lx7/l;


# direct methods
.method constructor <init>(Lh2/V;ILx7/l;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/V$e;->I:Lh2/V;

    iput p2, p0, Lh2/V$e;->J:I

    iput-object p3, p0, Lh2/V$e;->K:Lx7/l;

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

    iget v1, p0, Lh2/V$e;->G:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lh2/V$e;->H:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    iget-object v1, p0, Lh2/V$e;->H:Ljava/lang/Object;

    check-cast v1, LW8/z0;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lh2/V$e;->H:Ljava/lang/Object;

    check-cast v1, LW8/z0;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/V$e;->H:Ljava/lang/Object;

    check-cast p1, LW8/N;

    invoke-interface {p1}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p1

    sget-object v1, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p1, v1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    if-eqz p1, :cond_9

    check-cast p1, LW8/z0;

    iget-object v1, p0, Lh2/V$e;->I:Lh2/V;

    invoke-static {v1}, Lh2/V;->a(Lh2/V;)Lh2/V$c;

    move-result-object v1

    iget v6, p0, Lh2/V$e;->J:I

    iput-object p1, p0, Lh2/V$e;->H:Ljava/lang/Object;

    iput v5, p0, Lh2/V$e;->G:I

    invoke-virtual {v1, v6, p1, p0}, Lh2/V$c;->b(ILW8/z0;Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    return-object v0

    :cond_5
    move-object v7, v1

    move-object v1, p1

    move-object p1, v7

    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    :try_start_1
    iget-object p1, p0, Lh2/V$e;->K:Lx7/l;

    iput-object v1, p0, Lh2/V$e;->H:Ljava/lang/Object;

    iput v4, p0, Lh2/V$e;->G:I

    invoke-interface {p1, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_1
    iget-object p1, p0, Lh2/V$e;->I:Lh2/V;

    invoke-static {p1}, Lh2/V;->a(Lh2/V;)Lh2/V$c;

    move-result-object p1

    const/4 v2, 0x0

    iput-object v2, p0, Lh2/V$e;->H:Ljava/lang/Object;

    iput v3, p0, Lh2/V$e;->G:I

    invoke-virtual {p1, v1, p0}, Lh2/V$c;->a(LW8/z0;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :goto_2
    iget-object v3, p0, Lh2/V$e;->I:Lh2/V;

    invoke-static {v3}, Lh2/V;->a(Lh2/V;)Lh2/V$c;

    move-result-object v3

    iput-object p1, p0, Lh2/V$e;->H:Ljava/lang/Object;

    iput v2, p0, Lh2/V$e;->G:I

    invoke-virtual {v3, v1, p0}, Lh2/V$c;->a(LW8/z0;Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_7

    return-object v0

    :cond_7
    move-object v0, p1

    :goto_3
    throw v0

    :cond_8
    :goto_4
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Internal error. coroutineScope should\'ve created a job."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lh2/V$e;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh2/V$e;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lh2/V$e;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lh2/V$e;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, Lh2/V$e;

    iget-object v1, p0, Lh2/V$e;->I:Lh2/V;

    iget v2, p0, Lh2/V$e;->J:I

    iget-object v3, p0, Lh2/V$e;->K:Lx7/l;

    invoke-direct {v0, v1, v2, v3, p2}, Lh2/V$e;-><init>(Lh2/V;ILx7/l;Lm7/e;)V

    iput-object p1, v0, Lh2/V$e;->H:Ljava/lang/Object;

    return-object v0
.end method
