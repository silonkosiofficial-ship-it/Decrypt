.class public final LT9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW9/a;
.implements LT9/b$a;
.implements LH9/f;


# instance fields
.field private final a:LH9/z;

.field private final b:LW9/b;

.field private c:LM9/e;


# direct methods
.method public constructor <init>(LH9/z;LW9/b;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT9/a;->a:LH9/z;

    iput-object p2, p0, LT9/a;->b:LW9/b;

    return-void
.end method

.method private final f(LH9/C;)Z
    .locals 3

    .prologue
    invoke-virtual {p1}, LH9/C;->f()LH9/w;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, LH9/w;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, "text"

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, LH9/w;->c()Ljava/lang/String;

    move-result-object p1

    const-string v1, "event-stream"

    invoke-static {p1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method


# virtual methods
.method public a(J)V
    .locals 0

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "data"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LT9/a;->b:LW9/b;

    invoke-virtual {v0, p0, p1, p2, p3}, LW9/b;->b(LW9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c(LH9/e;LH9/B;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "response"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, LT9/a;->g(LH9/B;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    .prologue
    iget-object v0, p0, LT9/a;->c:LM9/e;

    if-nez v0, :cond_0

    const-string v0, "call"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, LM9/e;->cancel()V

    return-void
.end method

.method public d(LH9/e;Ljava/io/IOException;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LT9/a;->b:LW9/b;

    const/4 v0, 0x0

    invoke-virtual {p1, p0, p2, v0}, LW9/b;->c(LW9/a;Ljava/lang/Throwable;LH9/B;)V

    return-void
.end method

.method public final e(LH9/x;)V
    .locals 1

    .prologue
    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LH9/x;->C()LH9/x$a;

    move-result-object p1

    sget-object v0, LH9/r;->b:LH9/r;

    invoke-virtual {p1, v0}, LH9/x$a;->d(LH9/r;)LH9/x$a;

    move-result-object p1

    invoke-virtual {p1}, LH9/x$a;->a()LH9/x;

    move-result-object p1

    iget-object v0, p0, LT9/a;->a:LH9/z;

    invoke-virtual {p1, v0}, LH9/x;->E(LH9/z;)LH9/e;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LM9/e;

    iput-object p1, p0, LT9/a;->c:LM9/e;

    if-nez p1, :cond_0

    const-string p1, "call"

    invoke-static {p1}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1, p0}, LM9/e;->N(LH9/f;)V

    return-void
.end method

.method public final g(LH9/B;)V
    .locals 6

    .prologue
    const-string v0, "response"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, LH9/B;->N()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, LT9/a;->b:LW9/b;

    invoke-virtual {v0, p0, v1, p1}, LW9/b;->c(LW9/a;Ljava/lang/Throwable;LH9/B;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1, v1}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :try_start_1
    invoke-virtual {p1}, LH9/B;->a()LH9/C;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, LT9/a;->f(LH9/C;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, LT9/a;->b:LW9/b;

    new-instance v3, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Invalid content-type: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LH9/C;->f()LH9/w;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0, v3, p1}, LW9/b;->c(LW9/a;Ljava/lang/Throwable;LH9/B;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {p1, v1}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    :try_start_2
    iget-object v2, p0, LT9/a;->c:LM9/e;

    if-nez v2, :cond_2

    const-string v2, "call"

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v2, v1

    :cond_2
    invoke-virtual {v2}, LM9/e;->C()V

    invoke-virtual {p1}, LH9/B;->g0()LH9/B$a;

    move-result-object v2

    sget-object v3, LI9/d;->c:LH9/C;

    invoke-virtual {v2, v3}, LH9/B$a;->b(LH9/C;)LH9/B$a;

    move-result-object v2

    invoke-virtual {v2}, LH9/B$a;->c()LH9/B;

    move-result-object v2

    new-instance v3, LT9/b;

    invoke-virtual {v0}, LH9/C;->g()LX9/f;

    move-result-object v0

    invoke-direct {v3, v0, p0}, LT9/b;-><init>(LX9/f;LT9/b$a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v0, p0, LT9/a;->b:LW9/b;

    invoke-virtual {v0, p0, v2}, LW9/b;->d(LW9/a;LH9/B;)V

    :goto_0
    invoke-virtual {v3}, LT9/b;->d()Z

    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    :try_start_4
    iget-object v0, p0, LT9/a;->b:LW9/b;

    invoke-virtual {v0, p0}, LW9/b;->a(LW9/a;)V

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-static {p1, v1}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :catch_0
    move-exception v0

    :try_start_5
    iget-object v3, p0, LT9/a;->b:LW9/b;

    invoke-virtual {v3, p0, v0, v2}, LW9/b;->c(LW9/a;Ljava/lang/Throwable;LH9/B;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-static {p1, v1}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :goto_1
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p1, v0}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method
