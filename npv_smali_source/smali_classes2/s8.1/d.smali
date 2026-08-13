.class public abstract Ls8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LF8/i0;LO7/f0;)LF8/i0;
    .locals 0

    invoke-static {p0, p1}, Ls8/d;->b(LF8/i0;LO7/f0;)LF8/i0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LF8/i0;LO7/f0;)LF8/i0;
    .locals 3

    .prologue
    if-eqz p1, :cond_3

    invoke-interface {p0}, LF8/i0;->a()LF8/u0;

    move-result-object v0

    sget-object v1, LF8/u0;->G:LF8/u0;

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, LO7/f0;->s()LF8/u0;

    move-result-object p1

    invoke-interface {p0}, LF8/i0;->a()LF8/u0;

    move-result-object v0

    if-ne p1, v0, :cond_2

    invoke-interface {p0}, LF8/i0;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, LF8/k0;

    new-instance v0, LF8/H;

    sget-object v1, LE8/f;->e:LE8/n;

    const-string v2, "NO_LOCKS"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ls8/d$a;

    invoke-direct {v2, p0}, Ls8/d$a;-><init>(LF8/i0;)V

    invoke-direct {v0, v1, v2}, LF8/H;-><init>(LE8/n;Lx7/a;)V

    invoke-direct {p1, v0}, LF8/k0;-><init>(LF8/E;)V

    goto :goto_0

    :cond_1
    new-instance p1, LF8/k0;

    invoke-interface {p0}, LF8/i0;->getType()LF8/E;

    move-result-object p0

    invoke-direct {p1, p0}, LF8/k0;-><init>(LF8/E;)V

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, LF8/k0;

    invoke-static {p0}, Ls8/d;->c(LF8/i0;)LF8/E;

    move-result-object p0

    invoke-direct {p1, p0}, LF8/k0;-><init>(LF8/E;)V

    return-object p1

    :cond_3
    :goto_1
    return-object p0
.end method

.method public static final c(LF8/i0;)LF8/E;
    .locals 8

    const-string v0, "typeProjection"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls8/a;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Ls8/a;-><init>(LF8/i0;Ls8/b;ZLF8/a0;ILy7/k;)V

    return-object v0
.end method

.method public static final d(LF8/E;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object p0

    instance-of p0, p0, Ls8/b;

    return p0
.end method

.method public static final e(LF8/l0;Z)LF8/l0;
    .locals 4

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LF8/C;

    if-eqz v0, :cond_1

    check-cast p0, LF8/C;

    invoke-virtual {p0}, LF8/C;->j()[LO7/f0;

    move-result-object v0

    invoke-virtual {p0}, LF8/C;->i()[LF8/i0;

    move-result-object v1

    invoke-virtual {p0}, LF8/C;->j()[LO7/f0;

    move-result-object p0

    invoke-static {v1, p0}, Lj7/n;->h1([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li7/u;

    invoke-virtual {v2}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LF8/i0;

    invoke-virtual {v2}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/f0;

    invoke-static {v3, v2}, Ls8/d;->b(LF8/i0;LO7/f0;)LF8/i0;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    new-array p0, p0, [LF8/i0;

    invoke-interface {v1, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [LF8/i0;

    new-instance v1, LF8/C;

    invoke-direct {v1, v0, p0, p1}, LF8/C;-><init>([LO7/f0;[LF8/i0;Z)V

    goto :goto_1

    :cond_1
    new-instance v1, Ls8/d$b;

    invoke-direct {v1, p0, p1}, Ls8/d$b;-><init>(LF8/l0;Z)V

    :goto_1
    return-object v1
.end method

.method public static synthetic f(LF8/l0;ZILjava/lang/Object;)LF8/l0;
    .locals 0

    .prologue
    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-static {p0, p1}, Ls8/d;->e(LF8/l0;Z)LF8/l0;

    move-result-object p0

    return-object p0
.end method
