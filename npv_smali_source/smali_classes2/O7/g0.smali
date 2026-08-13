.class public abstract LO7/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF8/E;)LO7/S;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->w()LO7/h;

    move-result-object v0

    instance-of v1, v0, LO7/i;

    if-eqz v1, :cond_0

    check-cast v0, LO7/i;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LO7/g0;->b(LF8/E;LO7/i;I)LO7/S;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LF8/E;LO7/i;I)LO7/S;
    .locals 5

    .prologue
    const/4 v0, 0x0

    if-eqz p1, :cond_4

    invoke-static {p1}, LH8/k;->m(LO7/m;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LO7/i;->A()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, p2

    invoke-interface {p1}, LO7/i;->S()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-eq v1, v2, :cond_1

    invoke-static {p1}, Lr8/f;->E(LO7/m;)Z

    move-result v1

    :cond_1
    new-instance v1, LO7/S;

    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-interface {v2, p2, p0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, p1, p0, v0}, LO7/S;-><init>(LO7/i;Ljava/util/List;LO7/S;)V

    return-object v1

    :cond_2
    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p2, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p2

    new-instance v2, LO7/S;

    invoke-interface {p1}, LO7/n;->b()LO7/m;

    move-result-object v3

    instance-of v4, v3, LO7/i;

    if-eqz v4, :cond_3

    move-object v0, v3

    check-cast v0, LO7/i;

    :cond_3
    invoke-static {p0, v0, v1}, LO7/g0;->b(LF8/E;LO7/i;I)LO7/S;

    move-result-object p0

    invoke-direct {v2, p1, p2, p0}, LO7/S;-><init>(LO7/i;Ljava/util/List;LO7/S;)V

    return-object v2

    :cond_4
    :goto_0
    return-object v0
.end method

.method private static final c(LO7/f0;LO7/m;I)LO7/c;
    .locals 1

    new-instance v0, LO7/c;

    invoke-direct {v0, p0, p1, p2}, LO7/c;-><init>(LO7/f0;LO7/m;I)V

    return-object v0
.end method

.method public static final d(LO7/i;)Ljava/util/List;
    .locals 7

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LO7/i;->A()Ljava/util/List;

    move-result-object v0

    const-string v1, "getDeclaredTypeParameters(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LO7/i;->S()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {p0}, LO7/n;->b()LO7/m;

    move-result-object v2

    instance-of v2, v2, LO7/a;

    if-nez v2, :cond_0

    return-object v0

    :cond_0
    invoke-static {p0}, Lv8/c;->r(LO7/m;)LR8/h;

    move-result-object v2

    sget-object v3, LO7/g0$a;->D:LO7/g0$a;

    invoke-static {v2, v3}, LR8/k;->K(LR8/h;Lx7/l;)LR8/h;

    move-result-object v2

    sget-object v3, LO7/g0$b;->D:LO7/g0$b;

    invoke-static {v2, v3}, LR8/k;->w(LR8/h;Lx7/l;)LR8/h;

    move-result-object v2

    sget-object v3, LO7/g0$c;->D:LO7/g0$c;

    invoke-static {v2, v3}, LR8/k;->B(LR8/h;Lx7/l;)LR8/h;

    move-result-object v2

    invoke-static {v2}, LR8/k;->M(LR8/h;)Ljava/util/List;

    move-result-object v2

    invoke-static {p0}, Lv8/c;->r(LO7/m;)LR8/h;

    move-result-object v3

    invoke-interface {v3}, LR8/h;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, LO7/e;

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_2
    move-object v4, v5

    :goto_0
    check-cast v4, LO7/e;

    if-eqz v4, :cond_3

    invoke-interface {v4}, LO7/h;->p()LF8/e0;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-interface {v3}, LF8/e0;->x()Ljava/util/List;

    move-result-object v5

    :cond_3
    if-nez v5, :cond_4

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v5

    :cond_4
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p0}, LO7/i;->A()Ljava/util/List;

    move-result-object p0

    invoke-static {p0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_5
    check-cast v2, Ljava/util/Collection;

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v2, v5}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO7/f0;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v3, p0, v4}, LO7/g0;->c(LO7/f0;LO7/m;I)LO7/c;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, v2}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
