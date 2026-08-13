.class public abstract Lk9/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lk9/o;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lk9/p;->b(Lk9/o;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lk9/o;)Ljava/util/List;
    .locals 1

    invoke-static {}, Lj7/v;->c()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p0}, Lk9/p;->c(Ljava/util/List;Lk9/o;)V

    invoke-static {v0}, Lj7/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/util/List;Lk9/o;)V
    .locals 1

    .prologue
    instance-of v0, p1, Lk9/e;

    if-eqz v0, :cond_0

    check-cast p1, Lk9/e;

    invoke-virtual {p1}, Lk9/e;->c()Lk9/l;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_0
    instance-of v0, p1, Lk9/h;

    if-eqz v0, :cond_1

    check-cast p1, Lk9/h;

    invoke-virtual {p1}, Lk9/h;->c()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk9/s;

    invoke-static {p0, v0}, Lk9/p;->c(Ljava/util/List;Lk9/o;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lk9/j;

    if-nez v0, :cond_4

    instance-of v0, p1, Lk9/z;

    if-eqz v0, :cond_2

    check-cast p1, Lk9/z;

    invoke-virtual {p1}, Lk9/z;->f()Lk9/o;

    move-result-object p1

    invoke-static {p0, p1}, Lk9/p;->c(Ljava/util/List;Lk9/o;)V

    goto :goto_2

    :cond_2
    instance-of v0, p1, Lk9/c;

    if-eqz v0, :cond_3

    check-cast p1, Lk9/c;

    invoke-virtual {p1}, Lk9/c;->d()Lk9/o;

    move-result-object v0

    invoke-static {p0, v0}, Lk9/p;->c(Ljava/util/List;Lk9/o;)V

    invoke-virtual {p1}, Lk9/c;->c()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk9/o;

    invoke-static {p0, v0}, Lk9/p;->c(Ljava/util/List;Lk9/o;)V

    goto :goto_1

    :cond_3
    instance-of v0, p1, Lk9/t;

    if-eqz v0, :cond_4

    check-cast p1, Lk9/t;

    invoke-virtual {p1}, Lk9/t;->d()Lk9/o;

    move-result-object p1

    :try_start_0
    invoke-static {p0, p1}, Lk9/p;->c(Ljava/util/List;Lk9/o;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    throw p0

    :cond_4
    :goto_2
    return-void
.end method
