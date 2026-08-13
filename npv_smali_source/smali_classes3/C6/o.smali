.class public abstract LC6/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LF6/b;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    invoke-static {p0, p1}, LC6/o;->c(LF6/b;Ljava/lang/Throwable;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LF6/k;Lx7/l;)LC6/c;
    .locals 2

    const-string v0, "engineFactory"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LC6/j;

    invoke-direct {v0}, LC6/j;-><init>()V

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, LC6/j;->j()Lx7/l;

    move-result-object p1

    invoke-interface {p0, p1}, LF6/k;->a(Lx7/l;)LF6/b;

    move-result-object p0

    new-instance p1, LC6/c;

    const/4 v1, 0x1

    invoke-direct {p1, p0, v0, v1}, LC6/c;-><init>(LF6/b;LC6/j;Z)V

    invoke-virtual {p1}, LC6/c;->getCoroutineContext()Lm7/i;

    move-result-object v0

    sget-object v1, LW8/z0;->h:LW8/z0$b;

    invoke-interface {v0, v1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v0, LW8/z0;

    new-instance v1, LC6/n;

    invoke-direct {v1, p0}, LC6/n;-><init>(LF6/b;)V

    invoke-interface {v0, v1}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    return-object p1
.end method

.method private static final c(LF6/b;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method
