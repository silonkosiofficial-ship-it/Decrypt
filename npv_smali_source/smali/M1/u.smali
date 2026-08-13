.class public final LM1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM1/n;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lf9/a;

.field private final c:LM1/a;

.field private final d:LZ8/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const-string v0, "filePath"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM1/u;->a:Ljava/lang/String;

    const/4 p1, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lf9/g;->b(ZILjava/lang/Object;)Lf9/a;

    move-result-object v0

    iput-object v0, p0, LM1/u;->b:Lf9/a;

    new-instance v0, LM1/a;

    invoke-direct {v0, p1}, LM1/a;-><init>(I)V

    iput-object v0, p0, LM1/u;->c:LM1/a;

    new-instance p1, LM1/u$c;

    invoke-direct {p1, v1}, LM1/u$c;-><init>(Lm7/e;)V

    invoke-static {p1}, LZ8/h;->x(Lx7/p;)LZ8/f;

    move-result-object p1

    iput-object p1, p0, LM1/u;->d:LZ8/f;

    return-void
.end method


# virtual methods
.method public a(Lm7/e;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, LM1/u;->c:LM1/a;

    invoke-virtual {p1}, LM1/a;->b()I

    move-result p1

    invoke-static {p1}, Lo7/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public b(Lm7/e;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, LM1/u;->c:LM1/a;

    invoke-virtual {p1}, LM1/a;->d()I

    move-result p1

    invoke-static {p1}, Lo7/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public c(Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    instance-of v0, p2, LM1/u$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LM1/u$b;

    iget v1, v0, LM1/u$b;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LM1/u$b;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, LM1/u$b;

    invoke-direct {v0, p0, p2}, LM1/u$b;-><init>(LM1/u;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LM1/u$b;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LM1/u$b;->J:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p1, v0, LM1/u$b;->G:Z

    iget-object v0, v0, LM1/u$b;->F:Ljava/lang/Object;

    check-cast v0, Lf9/a;

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

    iget-object p2, p0, LM1/u;->b:Lf9/a;

    invoke-interface {p2, v4}, Lf9/a;->a(Ljava/lang/Object;)Z

    move-result v2

    :try_start_1
    invoke-static {v2}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v5

    iput-object p2, v0, LM1/u$b;->F:Ljava/lang/Object;

    iput-boolean v2, v0, LM1/u$b;->G:Z

    iput v3, v0, LM1/u$b;->J:I

    invoke-interface {p1, v5, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p2

    move-object p2, p1

    move p1, v2

    :goto_1
    if-eqz p1, :cond_4

    invoke-interface {v0, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    :cond_4
    return-object p2

    :catchall_1
    move-exception p1

    move-object v0, p2

    move-object p2, p1

    move p1, v2

    :goto_2
    if-eqz p1, :cond_5

    invoke-interface {v0, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    :cond_5
    throw p2
.end method

.method public d(Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    instance-of v0, p2, LM1/u$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LM1/u$a;

    iget v1, v0, LM1/u$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LM1/u$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, LM1/u$a;

    invoke-direct {v0, p0, p2}, LM1/u$a;-><init>(LM1/u;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LM1/u$a;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LM1/u$a;->J:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LM1/u$a;->F:Ljava/lang/Object;

    check-cast p1, Lf9/a;

    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LM1/u$a;->G:Ljava/lang/Object;

    check-cast p1, Lf9/a;

    iget-object v2, v0, LM1/u$a;->F:Ljava/lang/Object;

    check-cast v2, Lx7/l;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v2

    goto :goto_1

    :cond_3
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LM1/u;->b:Lf9/a;

    iput-object p1, v0, LM1/u$a;->F:Ljava/lang/Object;

    iput-object p2, v0, LM1/u$a;->G:Ljava/lang/Object;

    iput v4, v0, LM1/u$a;->J:I

    invoke-interface {p2, v5, v0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    :try_start_1
    iput-object p2, v0, LM1/u$a;->F:Ljava/lang/Object;

    iput-object v5, v0, LM1/u$a;->G:Ljava/lang/Object;

    iput v3, v0, LM1/u$a;->J:I

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    :goto_2
    invoke-interface {p1, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    return-object p2

    :catchall_1
    move-exception p1

    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    :goto_3
    invoke-interface {p1, v5}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p2
.end method

.method public e()LZ8/f;
    .locals 1

    iget-object v0, p0, LM1/u;->d:LZ8/f;

    return-object v0
.end method
