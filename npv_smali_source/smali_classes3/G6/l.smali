.class public abstract LG6/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lm7/i;LU6/b;)Lio/ktor/utils/io/d;
    .locals 0

    invoke-static {p0, p1}, LG6/l;->j(Lm7/i;LU6/b;)Lio/ktor/utils/io/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LH9/z$a;Ljava/lang/String;Ljava/lang/String;)Li7/M;
    .locals 0

    invoke-static {p0, p1, p2}, LG6/l;->l(LH9/z$a;Ljava/lang/String;Ljava/lang/String;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LU6/b;)Lio/ktor/utils/io/d;
    .locals 0

    invoke-static {p0}, LG6/l;->i(LU6/b;)Lio/ktor/utils/io/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(LO6/e;Lm7/i;)LH9/z;
    .locals 0

    invoke-static {p0, p1}, LG6/l;->k(LO6/e;Lm7/i;)LH9/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Ljava/lang/Throwable;LO6/e;)Ljava/lang/Throwable;
    .locals 0

    invoke-static {p0, p1}, LG6/l;->m(Ljava/lang/Throwable;LO6/e;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(LH9/x$a;LI6/G;)LH9/x$a;
    .locals 0

    invoke-static {p0, p1}, LG6/l;->n(LH9/x$a;LI6/G;)LH9/x$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(LX9/f;Lm7/i;LO6/e;)Lio/ktor/utils/io/d;
    .locals 0

    invoke-static {p0, p1, p2}, LG6/l;->o(LX9/f;Lm7/i;LO6/e;)Lio/ktor/utils/io/d;

    move-result-object p0

    return-object p0
.end method

.method public static final h(LU6/b;Lm7/i;)LH9/A;
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callContext"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LU6/b$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p1, p0

    check-cast p1, LU6/b$a;

    invoke-virtual {p1}, LU6/b$a;->d()[B

    move-result-object p1

    sget-object v0, LH9/A;->a:LH9/A$a;

    sget-object v2, LH9/w;->e:LH9/w$a;

    invoke-virtual {p0}, LU6/b;->b()LT6/h;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, LH9/w$a;->b(Ljava/lang/String;)LH9/w;

    move-result-object p0

    array-length v2, p1

    invoke-virtual {v0, p1, p0, v1, v2}, LH9/A$a;->a([BLH9/w;II)LH9/A;

    move-result-object p0

    goto :goto_0

    :cond_0
    instance-of v0, p0, LU6/b$c;

    if-eqz v0, :cond_1

    new-instance p1, LG6/s;

    invoke-virtual {p0}, LU6/b;->a()Ljava/lang/Long;

    move-result-object v0

    new-instance v1, LG6/j;

    invoke-direct {v1, p0}, LG6/j;-><init>(LU6/b;)V

    invoke-direct {p1, v0, v1}, LG6/s;-><init>(Ljava/lang/Long;Lx7/a;)V

    move-object p0, p1

    goto :goto_0

    :cond_1
    instance-of v0, p0, LU6/b$d;

    if-eqz v0, :cond_2

    new-instance v0, LG6/s;

    invoke-virtual {p0}, LU6/b;->a()Ljava/lang/Long;

    move-result-object v1

    new-instance v2, LG6/k;

    invoke-direct {v2, p1, p0}, LG6/k;-><init>(Lm7/i;LU6/b;)V

    invoke-direct {v0, v1, v2}, LG6/s;-><init>(Ljava/lang/Long;Lx7/a;)V

    move-object p0, v0

    goto :goto_0

    :cond_2
    instance-of p0, p0, LU6/b$b;

    if-eqz p0, :cond_3

    sget-object p0, LH9/A;->a:LH9/A$a;

    new-array p1, v1, [B

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v1, v1}, LH9/A$a;->a([BLH9/w;II)LH9/A;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_3
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0
.end method

.method private static final i(LU6/b;)Lio/ktor/utils/io/d;
    .locals 0

    check-cast p0, LU6/b$c;

    invoke-virtual {p0}, LU6/b$c;->d()Lio/ktor/utils/io/d;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lm7/i;LU6/b;)Lio/ktor/utils/io/d;
    .locals 6

    sget-object v0, LW8/t0;->C:LW8/t0;

    new-instance v3, LG6/l$a;

    const/4 v1, 0x0

    invoke-direct {v3, p1, v1}, LG6/l$a;-><init>(LU6/b;Lm7/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lio/ktor/utils/io/k;->m(LW8/N;Lm7/i;ZLx7/p;ILjava/lang/Object;)Lio/ktor/utils/io/s;

    move-result-object p0

    invoke-virtual {p0}, Lio/ktor/utils/io/s;->b()Lio/ktor/utils/io/d;

    move-result-object p0

    return-object p0
.end method

.method private static final k(LO6/e;Lm7/i;)LH9/z;
    .locals 4

    .prologue
    new-instance v0, LH9/z$a;

    invoke-direct {v0}, LH9/z$a;-><init>()V

    invoke-virtual {p0}, LO6/e;->h()LT6/g0;

    move-result-object v1

    invoke-virtual {v1}, LT6/g0;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LH9/z$a;->h(Ljava/lang/String;)LH9/z$a;

    invoke-virtual {p0}, LO6/e;->e()LT6/p;

    move-result-object v1

    invoke-virtual {p0}, LO6/e;->b()LU6/b;

    move-result-object v2

    new-instance v3, LG6/i;

    invoke-direct {v3, v0}, LG6/i;-><init>(LH9/z$a;)V

    invoke-static {v1, v2, v3}, LF6/t;->d(LT6/p;LU6/b;Lx7/p;)V

    invoke-virtual {p0}, LO6/e;->f()LT6/A;

    move-result-object v1

    invoke-virtual {v1}, LT6/A;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LN9/f;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LO6/e;->b()LU6/b;

    move-result-object v1

    invoke-static {v1, p1}, LG6/l;->h(LU6/b;Lm7/i;)LH9/A;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, LO6/e;->f()LT6/A;

    move-result-object p0

    invoke-virtual {p0}, LT6/A;->d()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, LH9/z$a;->e(Ljava/lang/String;LH9/A;)LH9/z$a;

    invoke-virtual {v0}, LH9/z$a;->b()LH9/z;

    move-result-object p0

    return-object p0
.end method

.method private static final l(LH9/z$a;Ljava/lang/String;Ljava/lang/String;)Li7/M;
    .locals 1

    .prologue
    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LT6/v;->a:LT6/v;

    invoke-virtual {v0}, LT6/v;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0

    :cond_0
    invoke-virtual {p0, p1, p2}, LH9/z$a;->a(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final m(Ljava/lang/Throwable;LO6/e;)Ljava/lang/Throwable;
    .locals 1

    .prologue
    instance-of v0, p0, Ljava/net/SocketTimeoutException;

    if-eqz v0, :cond_0

    invoke-static {p1, p0}, LI6/I;->e(LO6/e;Ljava/lang/Throwable;)Ljava/net/SocketTimeoutException;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method private static final n(LH9/x$a;LI6/G;)LH9/x$a;
    .locals 4

    .prologue
    invoke-virtual {p1}, LI6/G;->b()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, LI6/I;->h(J)J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v0, v1, v2}, LH9/x$a;->b(JLjava/util/concurrent/TimeUnit;)LH9/x$a;

    :cond_0
    invoke-virtual {p1}, LI6/G;->d()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, LI6/I;->h(J)J

    move-result-wide v2

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v2, v3, p1}, LH9/x$a;->M(JLjava/util/concurrent/TimeUnit;)LH9/x$a;

    invoke-static {v0, v1}, LI6/I;->h(J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p1}, LH9/x$a;->O(JLjava/util/concurrent/TimeUnit;)LH9/x$a;

    :cond_1
    return-object p0
.end method

.method private static final o(LX9/f;Lm7/i;LO6/e;)Lio/ktor/utils/io/d;
    .locals 6

    sget-object v0, LW8/t0;->C:LW8/t0;

    new-instance v3, LG6/l$b;

    const/4 v1, 0x0

    invoke-direct {v3, p0, p1, p2, v1}, LG6/l$b;-><init>(LX9/f;Lm7/i;LO6/e;Lm7/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lio/ktor/utils/io/k;->m(LW8/N;Lm7/i;ZLx7/p;ILjava/lang/Object;)Lio/ktor/utils/io/s;

    move-result-object p0

    invoke-virtual {p0}, Lio/ktor/utils/io/s;->b()Lio/ktor/utils/io/d;

    move-result-object p0

    return-object p0
.end method
