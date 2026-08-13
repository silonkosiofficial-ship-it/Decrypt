.class public abstract Ll4/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ll4/l;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-static {}, LQ3/p;->j()V

    invoke-static {}, LQ3/p;->h()V

    const-string v0, "Task must not be null"

    invoke-static {p0, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ll4/l;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Ll4/o;->k(Ll4/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ll4/s;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll4/s;-><init>(Ll4/r;)V

    invoke-static {p0, v0}, Ll4/o;->l(Ll4/l;Ll4/t;)V

    invoke-virtual {v0}, Ll4/s;->c()V

    invoke-static {p0}, Ll4/o;->k(Ll4/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ll4/l;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-static {}, LQ3/p;->j()V

    invoke-static {}, LQ3/p;->h()V

    const-string v0, "Task must not be null"

    invoke-static {p0, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "TimeUnit must not be null"

    invoke-static {p3, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ll4/l;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Ll4/o;->k(Ll4/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ll4/s;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll4/s;-><init>(Ll4/r;)V

    invoke-static {p0, v0}, Ll4/o;->l(Ll4/l;Ll4/t;)V

    invoke-virtual {v0, p1, p2, p3}, Ll4/s;->e(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Ll4/o;->k(Ll4/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/util/concurrent/TimeoutException;

    const-string p1, "Timed out waiting for Task"

    invoke-direct {p0, p1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Ll4/l;
    .locals 2

    const-string v0, "Executor must not be null"

    invoke-static {p0, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Callback must not be null"

    invoke-static {p1, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll4/P;

    invoke-direct {v0}, Ll4/P;-><init>()V

    new-instance v1, Ll4/Q;

    invoke-direct {v1, v0, p1}, Ll4/Q;-><init>(Ll4/P;Ljava/util/concurrent/Callable;)V

    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static d(Ljava/lang/Exception;)Ll4/l;
    .locals 1

    new-instance v0, Ll4/P;

    invoke-direct {v0}, Ll4/P;-><init>()V

    invoke-virtual {v0, p0}, Ll4/P;->r(Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static e(Ljava/lang/Object;)Ll4/l;
    .locals 1

    new-instance v0, Ll4/P;

    invoke-direct {v0}, Ll4/P;-><init>()V

    invoke-virtual {v0, p0}, Ll4/P;->s(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static f(Ljava/util/Collection;)Ll4/l;
    .locals 3

    .prologue
    if-eqz p0, :cond_4

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll4/l;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "null tasks are not accepted"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance v0, Ll4/P;

    invoke-direct {v0}, Ll4/P;-><init>()V

    new-instance v1, Ll4/u;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2, v0}, Ll4/u;-><init>(ILl4/P;)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll4/l;

    invoke-static {v2, v1}, Ll4/o;->l(Ll4/l;Ll4/t;)V

    goto :goto_1

    :cond_3
    return-object v0

    :cond_4
    :goto_2
    const/4 p0, 0x0

    invoke-static {p0}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static varargs g([Ll4/l;)Ll4/l;
    .locals 1

    .prologue
    if-eqz p0, :cond_1

    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ll4/o;->f(Ljava/util/Collection;)Ll4/l;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    invoke-static {p0}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static h(Ljava/util/Collection;)Ll4/l;
    .locals 1

    sget-object v0, Ll4/n;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, p0}, Ll4/o;->i(Ljava/util/concurrent/Executor;Ljava/util/Collection;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/util/concurrent/Executor;Ljava/util/Collection;)Ll4/l;
    .locals 2

    .prologue
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll4/o;->f(Ljava/util/Collection;)Ll4/l;

    move-result-object v0

    new-instance v1, Ll4/q;

    invoke-direct {v1, p1}, Ll4/q;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, p0, v1}, Ll4/l;->i(Ljava/util/concurrent/Executor;Ll4/c;)Ll4/l;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static varargs j([Ll4/l;)Ll4/l;
    .locals 1

    .prologue
    if-eqz p0, :cond_1

    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ll4/o;->h(Ljava/util/Collection;)Ll4/l;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method private static k(Ll4/l;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-virtual {p0}, Ll4/l;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll4/l;->l()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ll4/l;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Task is already canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p0}, Ll4/l;->k()Ljava/lang/Exception;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static l(Ll4/l;Ll4/t;)V
    .locals 1

    sget-object v0, Ll4/n;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Ll4/l;->f(Ljava/util/concurrent/Executor;Ll4/h;)Ll4/l;

    invoke-virtual {p0, v0, p1}, Ll4/l;->d(Ljava/util/concurrent/Executor;Ll4/g;)Ll4/l;

    invoke-virtual {p0, v0, p1}, Ll4/l;->a(Ljava/util/concurrent/Executor;Ll4/e;)Ll4/l;

    return-void
.end method
