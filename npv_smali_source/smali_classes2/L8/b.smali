.class public abstract LL8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL8/b$a;
    }
.end annotation


# direct methods
.method public static final a(LF8/E;)LL8/a;
    .locals 7

    .prologue
    const-string v0, "type"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LF8/B;->b(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LF8/B;->c(LF8/E;)LF8/M;

    move-result-object v0

    invoke-static {v0}, LL8/b;->a(LF8/E;)LL8/a;

    move-result-object v0

    invoke-static {p0}, LF8/B;->d(LF8/E;)LF8/M;

    move-result-object v1

    invoke-static {v1}, LL8/b;->a(LF8/E;)LL8/a;

    move-result-object v1

    new-instance v2, LL8/a;

    invoke-virtual {v0}, LL8/a;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LF8/E;

    invoke-static {v3}, LF8/B;->c(LF8/E;)LF8/M;

    move-result-object v3

    invoke-virtual {v1}, LL8/a;->c()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LF8/E;

    invoke-static {v4}, LF8/B;->d(LF8/E;)LF8/M;

    move-result-object v4

    invoke-static {v3, v4}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object v3

    invoke-static {v3, p0}, LF8/s0;->b(LF8/t0;LF8/E;)LF8/t0;

    move-result-object v3

    invoke-virtual {v0}, LL8/a;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/E;

    invoke-static {v0}, LF8/B;->c(LF8/E;)LF8/M;

    move-result-object v0

    invoke-virtual {v1}, LL8/a;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/E;

    invoke-static {v1}, LF8/B;->d(LF8/E;)LF8/M;

    move-result-object v1

    invoke-static {v0, v1}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object v0

    invoke-static {v0, p0}, LF8/s0;->b(LF8/t0;LF8/E;)LF8/t0;

    move-result-object p0

    invoke-direct {v2, v3, p0}, LL8/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    :cond_0
    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-static {p0}, Ls8/d;->d(LF8/E;)Z

    move-result v1

    const-string v2, "getNothingType(...)"

    if-eqz v1, :cond_3

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ls8/b;

    invoke-interface {v0}, Ls8/b;->a()LF8/i0;

    move-result-object v0

    invoke-interface {v0}, LF8/i0;->getType()LF8/E;

    move-result-object v1

    const-string v3, "getType(...)"

    invoke-static {v1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, p0}, LL8/b;->b(LF8/E;LF8/E;)LF8/E;

    move-result-object v1

    invoke-interface {v0}, LF8/i0;->a()LF8/u0;

    move-result-object v3

    sget-object v4, LL8/b$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x3

    if-ne v3, v4, :cond_1

    new-instance v0, LL8/a;

    invoke-static {p0}, LK8/a;->i(LF8/E;)LL7/g;

    move-result-object v3

    invoke-virtual {v3}, LL7/g;->H()LF8/M;

    move-result-object v3

    invoke-static {v3, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, p0}, LL8/b;->b(LF8/E;LF8/E;)LF8/E;

    move-result-object p0

    invoke-direct {v0, p0, v1}, LL8/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Only nontrivial projections should have been captured, not: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_2
    new-instance v0, LL8/a;

    invoke-static {p0}, LK8/a;->i(LF8/E;)LL7/g;

    move-result-object p0

    invoke-virtual {p0}, LL7/g;->I()LF8/M;

    move-result-object p0

    const-string v2, "getNullableAnyType(...)"

    invoke-static {p0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p0}, LL8/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :cond_3
    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b

    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0}, LF8/e0;->x()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-eq v1, v3, :cond_4

    goto/16 :goto_5

    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v0}, LF8/e0;->x()Ljava/util/List;

    move-result-object v0

    const-string v5, "getParameters(...)"

    invoke-static {v0, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v4, v0}, Lj7/v;->c1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li7/u;

    invoke-virtual {v4}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LF8/i0;

    invoke-virtual {v4}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO7/f0;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v5, v4}, LL8/b;->g(LF8/i0;LO7/f0;)LL8/c;

    move-result-object v4

    invoke-interface {v5}, LF8/i0;->b()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-static {v4}, LL8/b;->d(LL8/c;)LL8/a;

    move-result-object v4

    invoke-virtual {v4}, LL8/a;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LL8/c;

    invoke-virtual {v4}, LL8/a;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LL8/c;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LL8/c;

    invoke-virtual {v5}, LL8/c;->d()Z

    move-result v5

    const/4 v6, 0x1

    xor-int/2addr v5, v6

    if-eqz v5, :cond_8

    move v4, v6

    :cond_9
    :goto_3
    new-instance v0, LL8/a;

    if-eqz v4, :cond_a

    invoke-static {p0}, LK8/a;->i(LF8/E;)LL7/g;

    move-result-object v1

    invoke-virtual {v1}, LL7/g;->H()LF8/M;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_4

    :cond_a
    invoke-static {p0, v1}, LL8/b;->e(LF8/E;Ljava/util/List;)LF8/E;

    move-result-object v1

    :goto_4
    invoke-static {p0, v3}, LL8/b;->e(LF8/E;Ljava/util/List;)LF8/E;

    move-result-object p0

    invoke-direct {v0, v1, p0}, LL8/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_b
    :goto_5
    new-instance v0, LL8/a;

    invoke-direct {v0, p0, p0}, LL8/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final b(LF8/E;LF8/E;)LF8/E;
    .locals 0

    invoke-virtual {p1}, LF8/E;->X0()Z

    move-result p1

    invoke-static {p0, p1}, LF8/q0;->q(LF8/E;Z)LF8/E;

    move-result-object p0

    const-string p1, "makeNullableIfNeeded(...)"

    invoke-static {p0, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final c(LF8/i0;Z)LF8/i0;
    .locals 3

    .prologue
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {p0}, LF8/i0;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    invoke-interface {p0}, LF8/i0;->getType()LF8/E;

    move-result-object v0

    const-string v1, "getType(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LL8/b$b;->D:LL8/b$b;

    invoke-static {v0, v1}, LF8/q0;->c(LF8/E;Lx7/l;)Z

    move-result v1

    if-nez v1, :cond_2

    return-object p0

    :cond_2
    invoke-interface {p0}, LF8/i0;->a()LF8/u0;

    move-result-object v1

    const-string v2, "getProjectionKind(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, LF8/u0;->I:LF8/u0;

    if-ne v1, v2, :cond_3

    invoke-static {v0}, LL8/b;->a(LF8/E;)LL8/a;

    move-result-object p0

    new-instance p1, LF8/k0;

    invoke-virtual {p0}, LL8/a;->d()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF8/E;

    invoke-direct {p1, v1, p0}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    return-object p1

    :cond_3
    if-eqz p1, :cond_4

    invoke-static {v0}, LL8/b;->a(LF8/E;)LL8/a;

    move-result-object p0

    invoke-virtual {p0}, LL8/a;->c()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF8/E;

    new-instance p1, LF8/k0;

    invoke-direct {p1, v1, p0}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    return-object p1

    :cond_4
    invoke-static {p0}, LL8/b;->f(LF8/i0;)LF8/i0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LL8/c;)LL8/a;
    .locals 7

    invoke-virtual {p0}, LL8/c;->a()LF8/E;

    move-result-object v0

    invoke-static {v0}, LL8/b;->a(LF8/E;)LL8/a;

    move-result-object v0

    invoke-virtual {v0}, LL8/a;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/E;

    invoke-virtual {v0}, LL8/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/E;

    invoke-virtual {p0}, LL8/c;->b()LF8/E;

    move-result-object v2

    invoke-static {v2}, LL8/b;->a(LF8/E;)LL8/a;

    move-result-object v2

    invoke-virtual {v2}, LL8/a;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LF8/E;

    invoke-virtual {v2}, LL8/a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/E;

    new-instance v4, LL8/a;

    new-instance v5, LL8/c;

    invoke-virtual {p0}, LL8/c;->c()LO7/f0;

    move-result-object v6

    invoke-direct {v5, v6, v0, v3}, LL8/c;-><init>(LO7/f0;LF8/E;LF8/E;)V

    new-instance v0, LL8/c;

    invoke-virtual {p0}, LL8/c;->c()LO7/f0;

    move-result-object p0

    invoke-direct {v0, p0, v1, v2}, LL8/c;-><init>(LO7/f0;LF8/E;LF8/E;)V

    invoke-direct {v4, v5, v0}, LL8/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v4
.end method

.method private static final e(LF8/E;Ljava/util/List;)LF8/E;
    .locals 6

    .prologue
    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    invoke-interface {p1}, Ljava/util/List;->size()I

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LL8/c;

    invoke-static {v0}, LL8/b;->h(LL8/c;)LF8/i0;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LF8/m0;->e(LF8/E;Ljava/util/List;LP7/g;Ljava/util/List;ILjava/lang/Object;)LF8/E;

    move-result-object p0

    return-object p0
.end method

.method private static final f(LF8/i0;)LF8/i0;
    .locals 2

    new-instance v0, LL8/b$c;

    invoke-direct {v0}, LL8/b$c;-><init>()V

    invoke-static {v0}, LF8/n0;->g(LF8/l0;)LF8/n0;

    move-result-object v0

    const-string v1, "create(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, LF8/n0;->t(LF8/i0;)LF8/i0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LF8/i0;LO7/f0;)LL8/c;
    .locals 4

    .prologue
    invoke-interface {p1}, LO7/f0;->s()LF8/u0;

    move-result-object v0

    invoke-static {v0, p0}, LF8/n0;->c(LF8/u0;LF8/i0;)LF8/u0;

    move-result-object v0

    sget-object v1, LL8/b$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const-string v2, "getType(...)"

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    new-instance v0, LL8/c;

    invoke-static {p1}, Lv8/c;->j(LO7/m;)LL7/g;

    move-result-object v1

    invoke-virtual {v1}, LL7/g;->H()LF8/M;

    move-result-object v1

    const-string v3, "getNothingType(...)"

    invoke-static {v1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LF8/i0;->getType()LF8/E;

    move-result-object p0

    invoke-static {p0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1, v1, p0}, LL8/c;-><init>(LO7/f0;LF8/E;LF8/E;)V

    goto :goto_0

    :cond_0
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0

    :cond_1
    new-instance v0, LL8/c;

    invoke-interface {p0}, LF8/i0;->getType()LF8/E;

    move-result-object p0

    invoke-static {p0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lv8/c;->j(LO7/m;)LL7/g;

    move-result-object v1

    invoke-virtual {v1}, LL7/g;->I()LF8/M;

    move-result-object v1

    const-string v2, "getNullableAnyType(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1, p0, v1}, LL8/c;-><init>(LO7/f0;LF8/E;LF8/E;)V

    goto :goto_0

    :cond_2
    new-instance v0, LL8/c;

    invoke-interface {p0}, LF8/i0;->getType()LF8/E;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LF8/i0;->getType()LF8/E;

    move-result-object p0

    invoke-static {p0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1, v1, p0}, LL8/c;-><init>(LO7/f0;LF8/E;LF8/E;)V

    :goto_0
    return-object v0
.end method

.method private static final h(LL8/c;)LF8/i0;
    .locals 2

    .prologue
    invoke-virtual {p0}, LL8/c;->d()Z

    invoke-virtual {p0}, LL8/c;->a()LF8/E;

    move-result-object v0

    invoke-virtual {p0}, LL8/c;->b()LF8/E;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, LL8/c;->c()LO7/f0;

    move-result-object v0

    invoke-interface {v0}, LO7/f0;->s()LF8/u0;

    move-result-object v0

    sget-object v1, LF8/u0;->H:LF8/u0;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LL8/c;->a()LF8/E;

    move-result-object v0

    invoke-static {v0}, LL7/g;->n0(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LL8/c;->c()LO7/f0;

    move-result-object v0

    invoke-interface {v0}, LO7/f0;->s()LF8/u0;

    move-result-object v0

    if-eq v0, v1, :cond_1

    new-instance v0, LF8/k0;

    sget-object v1, LF8/u0;->I:LF8/u0;

    invoke-static {p0, v1}, LL8/b;->i(LL8/c;LF8/u0;)LF8/u0;

    move-result-object v1

    invoke-virtual {p0}, LL8/c;->b()LF8/E;

    move-result-object p0

    invoke-direct {v0, v1, p0}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LL8/c;->b()LF8/E;

    move-result-object v0

    invoke-static {v0}, LL7/g;->p0(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, LF8/k0;

    invoke-static {p0, v1}, LL8/b;->i(LL8/c;LF8/u0;)LF8/u0;

    move-result-object v1

    invoke-virtual {p0}, LL8/c;->a()LF8/E;

    move-result-object p0

    invoke-direct {v0, v1, p0}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    goto :goto_1

    :cond_2
    new-instance v0, LF8/k0;

    sget-object v1, LF8/u0;->I:LF8/u0;

    invoke-static {p0, v1}, LL8/b;->i(LL8/c;LF8/u0;)LF8/u0;

    move-result-object v1

    invoke-virtual {p0}, LL8/c;->b()LF8/E;

    move-result-object p0

    invoke-direct {v0, v1, p0}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    goto :goto_1

    :cond_3
    :goto_0
    new-instance v0, LF8/k0;

    invoke-virtual {p0}, LL8/c;->a()LF8/E;

    move-result-object p0

    invoke-direct {v0, p0}, LF8/k0;-><init>(LF8/E;)V

    :goto_1
    return-object v0
.end method

.method private static final i(LL8/c;LF8/u0;)LF8/u0;
    .locals 0

    .prologue
    invoke-virtual {p0}, LL8/c;->c()LO7/f0;

    move-result-object p0

    invoke-interface {p0}, LO7/f0;->s()LF8/u0;

    move-result-object p0

    if-ne p1, p0, :cond_0

    sget-object p1, LF8/u0;->G:LF8/u0;

    :cond_0
    return-object p1
.end method
