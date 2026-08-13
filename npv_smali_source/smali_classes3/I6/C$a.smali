.class final LI6/C$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI6/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:LJ6/d;


# direct methods
.method constructor <init>(LJ6/d;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LI6/C$a;->J:LJ6/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI6/C$a;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, LI6/C$a;->H:Ljava/lang/Object;

    check-cast v0, LW8/y;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI6/C$a;->H:Ljava/lang/Object;

    check-cast p1, LO6/d;

    iget-object v1, p0, LI6/C$a;->I:Ljava/lang/Object;

    check-cast v1, Lx7/l;

    invoke-virtual {p1}, LO6/d;->h()LW8/z0;

    move-result-object v3

    invoke-static {v3}, LW8/U0;->a(LW8/z0;)LW8/y;

    move-result-object v3

    iget-object v4, p0, LI6/C$a;->J:LJ6/d;

    invoke-virtual {v4}, LJ6/d;->b()LC6/c;

    move-result-object v4

    invoke-virtual {v4}, LC6/c;->getCoroutineContext()Lm7/i;

    move-result-object v4

    sget-object v5, LW8/z0;->h:LW8/z0$b;

    invoke-interface {v4, v5}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v4, LW8/z0;

    invoke-static {v3, v4}, LI6/C;->e(LW8/y;LW8/z0;)V

    :try_start_1
    invoke-virtual {p1, v3}, LO6/d;->o(LW8/z0;)V

    iput-object v3, p0, LI6/C$a;->H:Ljava/lang/Object;

    iput v2, p0, LI6/C$a;->G:I

    invoke-interface {v1, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, v3

    :goto_0
    invoke-interface {v0}, LW8/y;->K0()Z

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_1
    move-exception p1

    move-object v0, v3

    :goto_1
    :try_start_2
    invoke-interface {v0, p1}, LW8/y;->g(Ljava/lang/Throwable;)Z

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    move-exception p1

    invoke-interface {v0}, LW8/y;->K0()Z

    throw p1
.end method

.method public final H(LO6/d;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LI6/C$a;

    iget-object v1, p0, LI6/C$a;->J:LJ6/d;

    invoke-direct {v0, v1, p3}, LI6/C$a;-><init>(LJ6/d;Lm7/e;)V

    iput-object p1, v0, LI6/C$a;->H:Ljava/lang/Object;

    iput-object p2, v0, LI6/C$a;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, LI6/C$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO6/d;

    check-cast p2, Lx7/l;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LI6/C$a;->H(LO6/d;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
