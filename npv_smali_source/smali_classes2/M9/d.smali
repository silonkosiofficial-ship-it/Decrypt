.class public final LM9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LM9/g;

.field private final b:LH9/a;

.field private final c:LM9/e;

.field private final d:LH9/r;

.field private e:LM9/j$b;

.field private f:LM9/j;

.field private g:I

.field private h:I

.field private i:I

.field private j:LH9/D;


# direct methods
.method public constructor <init>(LM9/g;LH9/a;LM9/e;LH9/r;)V
    .locals 1

    const-string v0, "connectionPool"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "address"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM9/d;->a:LM9/g;

    iput-object p2, p0, LM9/d;->b:LH9/a;

    iput-object p3, p0, LM9/d;->c:LM9/e;

    iput-object p4, p0, LM9/d;->d:LH9/r;

    return-void
.end method

.method private final b(IIIIZ)LM9/f;
    .locals 14

    .prologue
    move-object v1, p0

    iget-object v0, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v0}, LM9/e;->D()Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v0}, LM9/e;->n()LM9/f;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    monitor-enter v2

    :try_start_0
    invoke-virtual {v2}, LM9/f;->p()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v2}, LM9/f;->A()LH9/D;

    move-result-object v0

    invoke-virtual {v0}, LH9/D;->a()LH9/a;

    move-result-object v0

    invoke-virtual {v0}, LH9/a;->l()LH9/u;

    move-result-object v0

    invoke-virtual {p0, v0}, LM9/d;->g(LH9/u;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v3

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_0
    iget-object v0, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v0}, LM9/e;->z()Ljava/net/Socket;

    move-result-object v0

    :goto_1
    sget-object v4, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    iget-object v4, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v4}, LM9/e;->n()LM9/f;

    move-result-object v4

    if-eqz v4, :cond_3

    if-nez v0, :cond_2

    return-object v2

    :cond_2
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    if-eqz v0, :cond_4

    invoke-static {v0}, LI9/d;->n(Ljava/net/Socket;)V

    :cond_4
    iget-object v0, v1, LM9/d;->d:LH9/r;

    iget-object v4, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v0, v4, v2}, LH9/r;->k(LH9/e;LH9/j;)V

    goto :goto_3

    :goto_2
    monitor-exit v2

    throw v0

    :cond_5
    :goto_3
    const/4 v0, 0x0

    iput v0, v1, LM9/d;->g:I

    iput v0, v1, LM9/d;->h:I

    iput v0, v1, LM9/d;->i:I

    iget-object v2, v1, LM9/d;->a:LM9/g;

    iget-object v4, v1, LM9/d;->b:LH9/a;

    iget-object v5, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v2, v4, v5, v3, v0}, LM9/g;->a(LH9/a;LM9/e;Ljava/util/List;Z)Z

    move-result v2

    if-eqz v2, :cond_6

    :goto_4
    iget-object v0, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v0}, LM9/e;->n()LM9/f;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    :goto_5
    iget-object v2, v1, LM9/d;->d:LH9/r;

    iget-object v3, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v2, v3, v0}, LH9/r;->j(LH9/e;LH9/j;)V

    return-object v0

    :cond_6
    iget-object v2, v1, LM9/d;->j:LH9/D;

    if-eqz v2, :cond_7

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    iput-object v3, v1, LM9/d;->j:LH9/D;

    :goto_6
    move-object v4, v3

    goto :goto_7

    :cond_7
    iget-object v2, v1, LM9/d;->e:LM9/j$b;

    if-eqz v2, :cond_8

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, LM9/j$b;->b()Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v0, v1, LM9/d;->e:LM9/j$b;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LM9/j$b;->c()LH9/D;

    move-result-object v2

    goto :goto_6

    :cond_8
    iget-object v2, v1, LM9/d;->f:LM9/j;

    if-nez v2, :cond_9

    new-instance v2, LM9/j;

    iget-object v4, v1, LM9/d;->b:LH9/a;

    iget-object v5, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v5}, LM9/e;->m()LH9/x;

    move-result-object v5

    invoke-virtual {v5}, LH9/x;->x()LM9/h;

    move-result-object v5

    iget-object v6, v1, LM9/d;->c:LM9/e;

    iget-object v7, v1, LM9/d;->d:LH9/r;

    invoke-direct {v2, v4, v5, v6, v7}, LM9/j;-><init>(LH9/a;LM9/h;LH9/e;LH9/r;)V

    iput-object v2, v1, LM9/d;->f:LM9/j;

    :cond_9
    invoke-virtual {v2}, LM9/j;->c()LM9/j$b;

    move-result-object v2

    iput-object v2, v1, LM9/d;->e:LM9/j$b;

    invoke-virtual {v2}, LM9/j$b;->a()Ljava/util/List;

    move-result-object v4

    iget-object v5, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v5}, LM9/e;->D()Z

    move-result v5

    if-nez v5, :cond_c

    iget-object v5, v1, LM9/d;->a:LM9/g;

    iget-object v6, v1, LM9/d;->b:LH9/a;

    iget-object v7, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v5, v6, v7, v4, v0}, LM9/g;->a(LH9/a;LM9/e;Ljava/util/List;Z)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual {v2}, LM9/j$b;->c()LH9/D;

    move-result-object v2

    :goto_7
    new-instance v13, LM9/f;

    iget-object v0, v1, LM9/d;->a:LM9/g;

    invoke-direct {v13, v0, v2}, LM9/f;-><init>(LM9/g;LH9/D;)V

    iget-object v0, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v0, v13}, LM9/e;->B(LM9/f;)V

    :try_start_1
    iget-object v11, v1, LM9/d;->c:LM9/e;

    iget-object v12, v1, LM9/d;->d:LH9/r;

    move-object v5, v13

    move v6, p1

    move/from16 v7, p2

    move/from16 v8, p3

    move/from16 v9, p4

    move/from16 v10, p5

    invoke-virtual/range {v5 .. v12}, LM9/f;->f(IIIIZLH9/e;LH9/r;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    iget-object v0, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v0, v3}, LM9/e;->B(LM9/f;)V

    iget-object v0, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v0}, LM9/e;->m()LH9/x;

    move-result-object v0

    invoke-virtual {v0}, LH9/x;->x()LM9/h;

    move-result-object v0

    invoke-virtual {v13}, LM9/f;->A()LH9/D;

    move-result-object v3

    invoke-virtual {v0, v3}, LM9/h;->a(LH9/D;)V

    iget-object v0, v1, LM9/d;->a:LM9/g;

    iget-object v3, v1, LM9/d;->b:LH9/a;

    iget-object v5, v1, LM9/d;->c:LM9/e;

    const/4 v6, 0x1

    invoke-virtual {v0, v3, v5, v4, v6}, LM9/g;->a(LH9/a;LM9/e;Ljava/util/List;Z)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v0}, LM9/e;->n()LM9/f;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iput-object v2, v1, LM9/d;->j:LH9/D;

    invoke-virtual {v13}, LM9/f;->E()Ljava/net/Socket;

    move-result-object v2

    invoke-static {v2}, LI9/d;->n(Ljava/net/Socket;)V

    goto/16 :goto_5

    :cond_b
    monitor-enter v13

    :try_start_2
    iget-object v0, v1, LM9/d;->a:LM9/g;

    invoke-virtual {v0, v13}, LM9/g;->f(LM9/f;)V

    iget-object v0, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v0, v13}, LM9/e;->c(LM9/f;)V

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v13

    iget-object v0, v1, LM9/d;->d:LH9/r;

    iget-object v2, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v0, v2, v13}, LH9/r;->j(LH9/e;LH9/j;)V

    return-object v13

    :catchall_1
    move-exception v0

    monitor-exit v13

    throw v0

    :catchall_2
    move-exception v0

    iget-object v2, v1, LM9/d;->c:LM9/e;

    invoke-virtual {v2, v3}, LM9/e;->B(LM9/f;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final c(IIIIZZ)LM9/f;
    .locals 2

    .prologue
    :cond_0
    :goto_0
    invoke-direct/range {p0 .. p5}, LM9/d;->b(IIIIZ)LM9/f;

    move-result-object v0

    invoke-virtual {v0, p6}, LM9/f;->u(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {v0}, LM9/f;->z()V

    iget-object v0, p0, LM9/d;->j:LH9/D;

    if-nez v0, :cond_0

    iget-object v0, p0, LM9/d;->e:LM9/j$b;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LM9/j$b;->b()Z

    move-result v0

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    if-nez v0, :cond_0

    iget-object v0, p0, LM9/d;->f:LM9/j;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LM9/j;->a()Z

    move-result v1

    :cond_3
    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "exhausted all routes"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final f()LH9/D;
    .locals 4

    .prologue
    iget v0, p0, LM9/d;->g:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_4

    iget v0, p0, LM9/d;->h:I

    if-gt v0, v2, :cond_4

    iget v0, p0, LM9/d;->i:I

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LM9/d;->c:LM9/e;

    invoke-virtual {v0}, LM9/e;->n()LM9/f;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, LM9/f;->q()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    monitor-exit v0

    return-object v1

    :cond_2
    :try_start_1
    invoke-virtual {v0}, LM9/f;->A()LH9/D;

    move-result-object v2

    invoke-virtual {v2}, LH9/D;->a()LH9/a;

    move-result-object v2

    invoke-virtual {v2}, LH9/a;->l()LH9/u;

    move-result-object v2

    iget-object v3, p0, LM9/d;->b:LH9/a;

    invoke-virtual {v3}, LH9/a;->l()LH9/u;

    move-result-object v3

    invoke-static {v2, v3}, LI9/d;->j(LH9/u;LH9/u;)Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_3

    monitor-exit v0

    return-object v1

    :cond_3
    :try_start_2
    invoke-virtual {v0}, LM9/f;->A()LH9/D;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_4
    :goto_0
    return-object v1
.end method


# virtual methods
.method public final a(LH9/x;LN9/g;)LN9/d;
    .locals 8

    .prologue
    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chain"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p2}, LN9/g;->f()I

    move-result v2

    invoke-virtual {p2}, LN9/g;->h()I

    move-result v3

    invoke-virtual {p2}, LN9/g;->j()I

    move-result v4

    invoke-virtual {p1}, LH9/x;->F()I

    move-result v5

    invoke-virtual {p1}, LH9/x;->L()Z

    move-result v6

    invoke-virtual {p2}, LN9/g;->i()LH9/z;

    move-result-object v0

    invoke-virtual {v0}, LH9/z;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GET"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v7, v0, 0x1

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, LM9/d;->c(IIIIZZ)LM9/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LM9/f;->w(LH9/x;LN9/g;)LN9/d;

    move-result-object p1
    :try_end_0
    .catch LM9/i; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    invoke-virtual {p0, p1}, LM9/d;->h(Ljava/io/IOException;)V

    new-instance p2, LM9/i;

    invoke-direct {p2, p1}, LM9/i;-><init>(Ljava/io/IOException;)V

    throw p2

    :goto_1
    invoke-virtual {p1}, LM9/i;->c()Ljava/io/IOException;

    move-result-object p2

    invoke-virtual {p0, p2}, LM9/d;->h(Ljava/io/IOException;)V

    throw p1
.end method

.method public final d()LH9/a;
    .locals 1

    iget-object v0, p0, LM9/d;->b:LH9/a;

    return-object v0
.end method

.method public final e()Z
    .locals 2

    .prologue
    iget v0, p0, LM9/d;->g:I

    if-nez v0, :cond_0

    iget v0, p0, LM9/d;->h:I

    if-nez v0, :cond_0

    iget v0, p0, LM9/d;->i:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, LM9/d;->j:LH9/D;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    return v1

    :cond_1
    invoke-direct {p0}, LM9/d;->f()LH9/D;

    move-result-object v0

    if-eqz v0, :cond_2

    iput-object v0, p0, LM9/d;->j:LH9/D;

    return v1

    :cond_2
    iget-object v0, p0, LM9/d;->e:LM9/j$b;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LM9/j$b;->b()Z

    move-result v0

    if-ne v0, v1, :cond_3

    return v1

    :cond_3
    iget-object v0, p0, LM9/d;->f:LM9/j;

    if-nez v0, :cond_4

    return v1

    :cond_4
    invoke-virtual {v0}, LM9/j;->a()Z

    move-result v0

    return v0
.end method

.method public final g(LH9/u;)Z
    .locals 3

    .prologue
    const-string v0, "url"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM9/d;->b:LH9/a;

    invoke-virtual {v0}, LH9/a;->l()LH9/u;

    move-result-object v0

    invoke-virtual {p1}, LH9/u;->l()I

    move-result v1

    invoke-virtual {v0}, LH9/u;->l()I

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, LH9/u;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, LH9/u;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final h(Ljava/io/IOException;)V
    .locals 2

    .prologue
    const-string v0, "e"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, LM9/d;->j:LH9/D;

    instance-of v0, p1, LP9/n;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LP9/n;

    iget-object v0, v0, LP9/n;->C:LP9/b;

    sget-object v1, LP9/b;->L:LP9/b;

    if-ne v0, v1, :cond_0

    iget p1, p0, LM9/d;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LM9/d;->g:I

    goto :goto_0

    :cond_0
    instance-of p1, p1, LP9/a;

    if-eqz p1, :cond_1

    iget p1, p0, LM9/d;->h:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LM9/d;->h:I

    goto :goto_0

    :cond_1
    iget p1, p0, LM9/d;->i:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LM9/d;->i:I

    :goto_0
    return-void
.end method
