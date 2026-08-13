.class public final LQ6/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LO6/d;

.field private final b:LC6/c;


# direct methods
.method public constructor <init>(LO6/d;LC6/c;)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "client"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ6/g;->a:LO6/d;

    iput-object p2, p0, LQ6/g;->b:LC6/c;

    return-void
.end method


# virtual methods
.method public final a(LQ6/c;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p2, LQ6/g$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LQ6/g$a;

    iget v1, v0, LQ6/g$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LQ6/g$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, LQ6/g$a;

    invoke-direct {v0, p0, p2}, LQ6/g$a;-><init>(LQ6/g;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LQ6/g$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LQ6/g$a;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LQ6/g$a;->F:Ljava/lang/Object;

    check-cast p1, LW8/y;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-interface {p1}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p2

    sget-object v2, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p2, v2}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p2, LW8/y;

    invoke-interface {p2}, LW8/y;->K0()Z

    :try_start_0
    invoke-virtual {p1}, LQ6/c;->b()Lio/ktor/utils/io/d;

    move-result-object p1

    invoke-static {p1}, Lio/ktor/utils/io/e;->a(Lio/ktor/utils/io/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    iput-object p2, v0, LQ6/g$a;->F:Ljava/lang/Object;

    iput v3, v0, LQ6/g$a;->I:I

    invoke-interface {p2, v0}, LW8/z0;->g0(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final b(Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LQ6/g;->c(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    instance-of v0, p1, LQ6/g$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LQ6/g$b;

    iget v1, v0, LQ6/g$b;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LQ6/g$b;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, LQ6/g$b;

    invoke-direct {v0, p0, p1}, LQ6/g$b;-><init>(LQ6/g;Lm7/e;)V

    :goto_0
    iget-object p1, v0, LQ6/g$b;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LQ6/g$b;->J:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, LQ6/g$b;->F:Ljava/lang/Object;

    check-cast v0, LQ6/c;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, LQ6/g$b;->G:Ljava/lang/Object;

    check-cast v2, LD6/b;

    iget-object v4, v0, LQ6/g$b;->F:Ljava/lang/Object;

    check-cast v4, LQ6/g;

    :try_start_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_3
    iget-object v2, v0, LQ6/g$b;->F:Ljava/lang/Object;

    check-cast v2, LQ6/g;

    :try_start_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :cond_4
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_3
    new-instance p1, LO6/d;

    invoke-direct {p1}, LO6/d;-><init>()V

    iget-object v2, p0, LQ6/g;->a:LO6/d;

    invoke-virtual {p1, v2}, LO6/d;->r(LO6/d;)LO6/d;

    move-result-object p1

    iget-object v2, p0, LQ6/g;->b:LC6/c;

    iput-object p0, v0, LQ6/g$b;->F:Ljava/lang/Object;

    iput v5, v0, LQ6/g$b;->J:I

    invoke-virtual {v2, p1, v0}, LC6/c;->i(LO6/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object v2, p0

    :goto_1
    check-cast p1, LD6/b;

    iput-object v2, v0, LQ6/g$b;->F:Ljava/lang/Object;

    iput-object p1, v0, LQ6/g$b;->G:Ljava/lang/Object;

    iput v4, v0, LQ6/g$b;->J:I

    invoke-static {p1, v0}, LD6/d;->a(LD6/b;Lm7/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_6

    return-object v1

    :cond_6
    move-object v6, v2

    move-object v2, p1

    move-object p1, v4

    move-object v4, v6

    :goto_2
    check-cast p1, LD6/b;

    invoke-virtual {p1}, LD6/b;->e()LQ6/c;

    move-result-object p1

    invoke-virtual {v2}, LD6/b;->e()LQ6/c;

    move-result-object v2

    iput-object p1, v0, LQ6/g$b;->F:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v0, LQ6/g$b;->G:Ljava/lang/Object;

    iput v3, v0, LQ6/g$b;->J:I

    invoke-virtual {v4, v2, v0}, LQ6/g;->a(LQ6/c;Lm7/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    if-ne v0, v1, :cond_7

    return-object v1

    :cond_7
    move-object v0, p1

    :goto_3
    return-object v0

    :goto_4
    invoke-static {p1}, LR6/c;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HttpStatement["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LQ6/g;->a:LO6/d;

    invoke-virtual {v1}, LO6/d;->j()LT6/M;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
