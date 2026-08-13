.class public final Lh2/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/T;
.implements LW8/N;
.implements LY8/C;


# instance fields
.field private final C:LY8/C;

.field private final synthetic D:LW8/N;


# direct methods
.method public constructor <init>(LW8/N;LY8/C;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lh2/U;->C:LY8/C;

    iput-object p1, p0, Lh2/U;->D:LW8/N;

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lh2/U;->C:LY8/C;

    invoke-interface {v0, p1}, LY8/C;->c(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, Lh2/U;->D:LW8/N;

    invoke-interface {v0}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v0

    return-object v0
.end method

.method public h(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lh2/U;->C:LY8/C;

    invoke-interface {v0, p1, p2}, LY8/C;->h(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lh2/U;->C:LY8/C;

    invoke-interface {v0, p1}, LY8/C;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public m1(Lx7/a;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, Lh2/U$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh2/U$a;

    iget v1, v0, Lh2/U$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/U$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh2/U$a;

    invoke-direct {v0, p0, p2}, Lh2/U$a;-><init>(Lh2/U;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Lh2/U$a;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lh2/U$a;->J:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lh2/U$a;->G:Ljava/lang/Object;

    check-cast p1, LW8/z0;

    iget-object p1, v0, Lh2/U$a;->F:Ljava/lang/Object;

    check-cast p1, Lx7/a;

    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_1
    invoke-virtual {p0}, Lh2/U;->getCoroutineContext()Lm7/i;

    move-result-object p2

    sget-object v2, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p2, v2}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p2

    if-eqz p2, :cond_5

    check-cast p2, LW8/z0;

    iput-object p1, v0, Lh2/U$a;->F:Ljava/lang/Object;

    iput-object p2, v0, Lh2/U$a;->G:Ljava/lang/Object;

    iput v3, v0, Lh2/U$a;->J:I

    new-instance v2, LW8/n;

    invoke-static {v0}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v4

    invoke-direct {v2, v4, v3}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v2}, LW8/n;->E()V

    new-instance v3, Lh2/U$b;

    invoke-direct {v3, v2}, Lh2/U$b;-><init>(LW8/l;)V

    invoke-interface {p2, v3}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    invoke-virtual {v2}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p2

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v2

    if-ne p2, v2, :cond_3

    invoke-static {v0}, Lo7/h;->c(Lm7/e;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_5
    :try_start_2
    const-string p2, "Internal error, context should have a job."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    throw p2
.end method
