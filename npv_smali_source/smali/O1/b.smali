.class public LO1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM1/r;


# instance fields
.field private final a:LX9/k;

.field private final b:LX9/Q;

.field private final c:LO1/c;

.field private final d:LO1/a;


# direct methods
.method public constructor <init>(LX9/k;LX9/Q;LO1/c;)V
    .locals 1

    const-string v0, "fileSystem"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO1/b;->a:LX9/k;

    iput-object p2, p0, LO1/b;->b:LX9/Q;

    iput-object p3, p0, LO1/b;->c:LO1/c;

    new-instance p1, LO1/a;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, LO1/a;-><init>(Z)V

    iput-object p1, p0, LO1/b;->d:LO1/a;

    return-void
.end method

.method static synthetic j(LO1/b;Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    instance-of v0, p1, LO1/b$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LO1/b$a;

    iget v1, v0, LO1/b$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LO1/b$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, LO1/b$a;

    invoke-direct {v0, p0, p1}, LO1/b$a;-><init>(LO1/b;Lm7/e;)V

    :goto_0
    iget-object p1, v0, LO1/b$a;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LO1/b$a;->J:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LO1/b$a;->G:Ljava/lang/Object;

    check-cast p0, Ljava/io/Closeable;

    iget-object v0, v0, LO1/b$a;->F:Ljava/lang/Object;

    check-cast v0, LO1/b;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, LO1/b;->f()V

    :try_start_1
    iget-object p1, p0, LO1/b;->a:LX9/k;

    iget-object v2, p0, LO1/b;->b:LX9/Q;

    invoke-virtual {p1, v2}, LX9/k;->l(LX9/Q;)LX9/Z;

    move-result-object p1

    invoke-static {p1}, LX9/K;->b(LX9/Z;)LX9/f;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    iget-object v2, p0, LO1/b;->c:LO1/c;

    iput-object p0, v0, LO1/b$a;->F:Ljava/lang/Object;

    iput-object p1, v0, LO1/b$a;->G:Ljava/lang/Object;

    iput v3, v0, LO1/b$a;->J:I

    invoke-interface {v2, p1, v0}, LO1/c;->c(LX9/f;Lm7/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v5, v0

    move-object v0, p0

    move-object p0, p1

    move-object p1, v5

    :goto_1
    if-eqz p0, :cond_4

    :try_start_3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v4

    :cond_4
    :goto_2
    move-object p0, v0

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object v5, v0

    move-object v0, p0

    move-object p0, p1

    move-object p1, v5

    :goto_3
    if-eqz p0, :cond_5

    :try_start_4
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception p0

    :try_start_5
    invoke-static {p1, p0}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_4

    :catch_0
    move-exception p0

    goto :goto_6

    :cond_5
    :goto_4
    move-object p0, v0

    move-object v5, v4

    move-object v4, p1

    move-object p1, v5

    :goto_5
    if-nez v4, :cond_6

    :try_start_6
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_7

    :catch_1
    move-exception p1

    move-object v0, p0

    move-object p0, p1

    goto :goto_6

    :cond_6
    throw v4
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_1

    :goto_6
    iget-object p1, v0, LO1/b;->a:LX9/k;

    iget-object v1, v0, LO1/b;->b:LX9/Q;

    invoke-virtual {p1, v1}, LX9/k;->g(LX9/Q;)Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p0, v0, LO1/b;->c:LO1/c;

    invoke-interface {p0}, LO1/c;->a()Ljava/lang/Object;

    move-result-object p1

    :goto_7
    return-object p1

    :cond_7
    throw p0
.end method


# virtual methods
.method public b(Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LO1/b;->j(LO1/b;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, LO1/b;->d:LO1/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LO1/a;->b(Z)V

    return-void
.end method

.method protected final f()V
    .locals 2

    .prologue
    iget-object v0, p0, LO1/b;->d:LO1/a;

    invoke-virtual {v0}, LO1/a;->a()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This scope has already been closed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected final g()LX9/k;
    .locals 1

    iget-object v0, p0, LO1/b;->a:LX9/k;

    return-object v0
.end method

.method protected final h()LX9/Q;
    .locals 1

    iget-object v0, p0, LO1/b;->b:LX9/Q;

    return-object v0
.end method

.method protected final i()LO1/c;
    .locals 1

    iget-object v0, p0, LO1/b;->c:LO1/c;

    return-object v0
.end method
