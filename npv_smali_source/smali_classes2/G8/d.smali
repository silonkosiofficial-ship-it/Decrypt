.class public abstract LG8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/List;)LF8/t0;
    .locals 10

    .prologue
    const-string v0, "types"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_a

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    move v6, v5

    move v7, v6

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LF8/t0;

    if-nez v6, :cond_1

    invoke-static {v8}, LF8/G;->a(LF8/E;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    move v6, v5

    goto :goto_2

    :cond_1
    :goto_1
    move v6, v1

    :goto_2
    instance-of v9, v8, LF8/M;

    if-eqz v9, :cond_2

    check-cast v8, LF8/M;

    goto :goto_3

    :cond_2
    instance-of v7, v8, LF8/y;

    if-eqz v7, :cond_4

    invoke-static {v8}, LF8/u;->a(LF8/E;)Z

    move-result v7

    if-eqz v7, :cond_3

    return-object v8

    :cond_3
    check-cast v8, LF8/y;

    invoke-virtual {v8}, LF8/y;->e1()LF8/M;

    move-result-object v8

    move v7, v1

    :goto_3
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0

    :cond_5
    if-eqz v6, :cond_6

    sget-object v0, LH8/j;->X0:LH8/j;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object p0

    return-object p0

    :cond_6
    if-nez v7, :cond_7

    sget-object p0, LG8/u;->a:LG8/u;

    invoke-virtual {p0, v2}, LG8/u;->c(Ljava/util/List;)LF8/M;

    move-result-object p0

    return-object p0

    :cond_7
    new-instance p0, Ljava/util/ArrayList;

    invoke-static {v0, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/t0;

    invoke-static {v1}, LF8/B;->d(LF8/E;)LF8/M;

    move-result-object v1

    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    sget-object v0, LG8/u;->a:LG8/u;

    invoke-virtual {v0, v2}, LG8/u;->c(Ljava/util/List;)LF8/M;

    move-result-object v1

    invoke-virtual {v0, p0}, LG8/u;->c(Ljava/util/List;)LF8/M;

    move-result-object p0

    invoke-static {v1, p0}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object p0

    return-object p0

    :cond_9
    invoke-static {p0}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF8/t0;

    return-object p0

    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Expected some types"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
