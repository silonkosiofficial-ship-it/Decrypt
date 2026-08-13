.class public final Lc8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:La8/g;

.field private final b:La8/k;

.field private final c:Lc8/f;

.field private final d:LF8/h0;


# direct methods
.method public constructor <init>(La8/g;La8/k;)V
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameterResolver"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc8/d;->a:La8/g;

    iput-object p2, p0, Lc8/d;->b:La8/k;

    new-instance p1, Lc8/f;

    invoke-direct {p1}, Lc8/f;-><init>()V

    iput-object p1, p0, Lc8/d;->c:Lc8/f;

    new-instance p2, LF8/h0;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p2, p1, v0, v1, v0}, LF8/h0;-><init>(LF8/v;LF8/g0;ILy7/k;)V

    iput-object p2, p0, Lc8/d;->d:LF8/h0;

    return-void
.end method

.method public static final synthetic a(Lc8/d;)LF8/h0;
    .locals 0

    iget-object p0, p0, Lc8/d;->d:LF8/h0;

    return-object p0
.end method

.method private final b(Le8/j;LO7/e;)Z
    .locals 1

    .prologue
    invoke-interface {p1}, Le8/j;->K()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le8/x;

    invoke-static {p1}, Le8/A;->a(Le8/x;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    sget-object p1, LN7/d;->a:LN7/d;

    invoke-virtual {p1, p2}, LN7/d;->b(LO7/e;)LO7/e;

    move-result-object p1

    invoke-interface {p1}, LO7/h;->p()LF8/e0;

    move-result-object p1

    invoke-interface {p1}, LF8/e0;->x()Ljava/util/List;

    move-result-object p1

    const-string p2, "getParameters(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/f0;

    if-eqz p1, :cond_2

    invoke-interface {p1}, LO7/f0;->s()LF8/u0;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p2, LF8/u0;->I:LF8/u0;

    if-eq p1, p2, :cond_2

    const/4 v0, 0x1

    :cond_2
    :goto_0
    return v0
.end method

.method private final c(Le8/j;Lc8/a;LF8/e0;)Ljava/util/List;
    .locals 8

    .prologue
    invoke-interface {p1}, Le8/j;->B()Z

    move-result v0

    const/4 v1, 0x1

    const-string v2, "getParameters(...)"

    if-nez v0, :cond_1

    invoke-interface {p1}, Le8/j;->K()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, LF8/e0;->x()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {p3}, LF8/e0;->x()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v1, :cond_2

    invoke-direct {p0, p1, v0, p3, p2}, Lc8/d;->d(Le8/j;Ljava/util/List;LF8/e0;Lc8/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    invoke-interface {p1}, Le8/j;->K()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    const/16 v1, 0xa

    if-eq p2, p3, :cond_4

    check-cast v0, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LO7/f0;

    new-instance v0, LF8/k0;

    sget-object v1, LH8/j;->y0:LH8/j;

    invoke-interface {p3}, LO7/I;->getName()Ln8/f;

    move-result-object p3

    invoke-virtual {p3}, Ln8/f;->g()Ljava/lang/String;

    move-result-object p3

    const-string v2, "asString(...)"

    invoke-static {p3, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {p3}, [Ljava/lang/String;

    move-result-object p3

    invoke-static {v1, p3}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object p3

    invoke-direct {v0, p3}, LF8/k0;-><init>(LF8/E;)V

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-interface {p1}, Le8/j;->K()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->a1(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lj7/L;

    invoke-virtual {p3}, Lj7/L;->a()I

    move-result v1

    invoke-virtual {p3}, Lj7/L;->b()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Le8/x;

    invoke-interface {v0}, Ljava/util/List;->size()I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7/f0;

    sget-object v2, LF8/p0;->D:LF8/p0;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lc8/b;->b(LF8/p0;ZZLO7/f0;ILjava/lang/Object;)Lc8/a;

    move-result-object v2

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, p3, v2, v1}, Lc8/d;->p(Le8/x;Lc8/a;LO7/f0;)LF8/i0;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-static {p2}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final d(Le8/j;Ljava/util/List;LF8/e0;Lc8/a;)Ljava/util/List;
    .locals 11

    .prologue
    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7/f0;

    invoke-virtual {p4}, Lc8/a;->c()Ljava/util/Set;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, LK8/a;->l(LO7/f0;LF8/e0;Ljava/util/Set;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1, p4}, LF8/q0;->t(LO7/f0;LF8/w;)LF8/i0;

    move-result-object v1

    goto :goto_1

    :cond_0
    new-instance v8, LF8/H;

    iget-object v2, p0, Lc8/d;->a:La8/g;

    invoke-virtual {v2}, La8/g;->e()LE8/n;

    move-result-object v9

    new-instance v10, Lc8/d$a;

    move-object v2, v10

    move-object v3, p0

    move-object v4, v1

    move-object v5, p4

    move-object v6, p3

    move-object v7, p1

    invoke-direct/range {v2 .. v7}, Lc8/d$a;-><init>(Lc8/d;LO7/f0;Lc8/a;LF8/e0;Le8/j;)V

    invoke-direct {v8, v9, v10}, LF8/H;-><init>(LE8/n;Lx7/a;)V

    iget-object v2, p0, Lc8/d;->c:Lc8/f;

    invoke-interface {p1}, Le8/j;->B()Z

    move-result v3

    invoke-virtual {p4, v3}, Lc8/a;->j(Z)Lc8/a;

    move-result-object v3

    iget-object v4, p0, Lc8/d;->d:LF8/h0;

    invoke-virtual {v2, v1, v3, v4, v8}, Lc8/f;->a(LO7/f0;LF8/w;LF8/h0;LF8/E;)LF8/i0;

    move-result-object v1

    :goto_1
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private final e(Le8/j;Lc8/a;LF8/M;)LF8/M;
    .locals 8

    .prologue
    if-eqz p3, :cond_1

    invoke-virtual {p3}, LF8/E;->V0()LF8/a0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v1, v0

    goto :goto_2

    :cond_1
    :goto_1
    new-instance v0, La8/d;

    iget-object v2, p0, Lc8/d;->a:La8/g;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, La8/d;-><init>(La8/g;Le8/d;ZILy7/k;)V

    invoke-static {v0}, LF8/b0;->b(LP7/g;)LF8/a0;

    move-result-object v0

    goto :goto_0

    :goto_2
    invoke-direct {p0, p1, p2}, Lc8/d;->f(Le8/j;Lc8/a;)LF8/e0;

    move-result-object v2

    const/4 v0, 0x0

    if-nez v2, :cond_2

    return-object v0

    :cond_2
    invoke-direct {p0, p2}, Lc8/d;->i(Lc8/a;)Z

    move-result v4

    if-eqz p3, :cond_3

    invoke-virtual {p3}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    :cond_3
    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Le8/j;->B()Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz v4, :cond_4

    const/4 p1, 0x1

    invoke-virtual {p3, p1}, LF8/M;->d1(Z)LF8/M;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-direct {p0, p1, p2, v2}, Lc8/d;->c(Le8/j;Lc8/a;LF8/e0;)Ljava/util/List;

    move-result-object v3

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, LF8/F;->l(LF8/a0;LF8/e0;Ljava/util/List;ZLG8/g;ILjava/lang/Object;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method private final f(Le8/j;Lc8/a;)LF8/e0;
    .locals 3

    .prologue
    invoke-interface {p1}, Le8/j;->b()Le8/i;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lc8/d;->g(Le8/j;)LF8/e0;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v1, v0, Le8/g;

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Le8/g;

    invoke-interface {v1}, Le8/g;->e()Ln8/c;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-direct {p0, p1, p2, v2}, Lc8/d;->j(Le8/j;Lc8/a;Ln8/c;)LO7/e;

    move-result-object p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lc8/d;->a:La8/g;

    invoke-virtual {p2}, La8/g;->a()La8/b;

    move-result-object p2

    invoke-virtual {p2}, La8/b;->n()La8/i;

    move-result-object p2

    invoke-interface {p2, v1}, La8/i;->a(Le8/g;)LO7/e;

    move-result-object p2

    :cond_1
    if-eqz p2, :cond_2

    invoke-interface {p2}, LO7/h;->p()LF8/e0;

    move-result-object p2

    if-nez p2, :cond_6

    :cond_2
    invoke-direct {p0, p1}, Lc8/d;->g(Le8/j;)LF8/e0;

    move-result-object p2

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Class type should have a FQ name: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2

    :cond_4
    instance-of p1, v0, Le8/y;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lc8/d;->b:La8/k;

    check-cast v0, Le8/y;

    invoke-interface {p1, v0}, La8/k;->a(Le8/y;)LO7/f0;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1}, LO7/f0;->p()LF8/e0;

    move-result-object p2

    goto :goto_0

    :cond_5
    const/4 p2, 0x0

    :cond_6
    :goto_0
    return-object p2

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown classifier kind: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final g(Le8/j;)LF8/e0;
    .locals 2

    new-instance v0, Ln8/c;

    invoke-interface {p1}, Le8/j;->C()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object p1

    const-string v0, "topLevel(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc8/d;->a:La8/g;

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->b()Lg8/j;

    move-result-object v0

    invoke-virtual {v0}, Lg8/j;->d()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->r()LO7/J;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LO7/J;->d(Ln8/b;Ljava/util/List;)LO7/e;

    move-result-object p1

    invoke-interface {p1}, LO7/h;->p()LF8/e0;

    move-result-object p1

    const-string v0, "getTypeConstructor(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final h(LF8/u0;LO7/f0;)Z
    .locals 3

    .prologue
    invoke-interface {p2}, LO7/f0;->s()LF8/u0;

    move-result-object v0

    sget-object v1, LF8/u0;->G:LF8/u0;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-interface {p2}, LO7/f0;->s()LF8/u0;

    move-result-object p2

    if-eq p1, p2, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method

.method private final i(Lc8/a;)Z
    .locals 3

    .prologue
    invoke-virtual {p1}, Lc8/a;->g()Lc8/c;

    move-result-object v0

    sget-object v1, Lc8/c;->E:Lc8/c;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p1}, Lc8/a;->h()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lc8/a;->b()LF8/p0;

    move-result-object p1

    sget-object v0, LF8/p0;->C:LF8/p0;

    if-eq p1, v0, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method

.method private final j(Le8/j;Lc8/a;Ln8/c;)LO7/e;
    .locals 7

    .prologue
    invoke-virtual {p2}, Lc8/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lc8/e;->a()Ln8/c;

    move-result-object v0

    invoke-static {p3, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lc8/d;->a:La8/g;

    invoke-virtual {p1}, La8/g;->a()La8/b;

    move-result-object p1

    invoke-virtual {p1}, La8/b;->p()LL7/i;

    move-result-object p1

    invoke-virtual {p1}, LL7/i;->c()LO7/e;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v6, LN7/d;->a:LN7/d;

    iget-object v0, p0, Lc8/d;->a:La8/g;

    invoke-virtual {v0}, La8/g;->d()LO7/G;

    move-result-object v0

    invoke-interface {v0}, LO7/G;->t()LL7/g;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p3

    invoke-static/range {v0 .. v5}, LN7/d;->f(LN7/d;Ln8/c;LL7/g;Ljava/lang/Integer;ILjava/lang/Object;)LO7/e;

    move-result-object p3

    if-nez p3, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {v6, p3}, LN7/d;->d(LO7/e;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lc8/a;->g()Lc8/c;

    move-result-object v0

    sget-object v1, Lc8/c;->E:Lc8/c;

    if-eq v0, v1, :cond_2

    invoke-virtual {p2}, Lc8/a;->b()LF8/p0;

    move-result-object p2

    sget-object v0, LF8/p0;->C:LF8/p0;

    if-eq p2, v0, :cond_2

    invoke-direct {p0, p1, p3}, Lc8/d;->b(Le8/j;LO7/e;)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    invoke-virtual {v6, p3}, LN7/d;->b(LO7/e;)LO7/e;

    move-result-object p1

    return-object p1

    :cond_3
    return-object p3
.end method

.method public static synthetic l(Lc8/d;Le8/f;Lc8/a;ZILjava/lang/Object;)LF8/E;
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lc8/d;->k(Le8/f;Lc8/a;Z)LF8/E;

    move-result-object p0

    return-object p0
.end method

.method private final m(Le8/j;Lc8/a;)LF8/E;
    .locals 3

    .prologue
    invoke-virtual {p2}, Lc8/a;->h()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lc8/a;->b()LF8/p0;

    move-result-object v0

    sget-object v1, LF8/p0;->C:LF8/p0;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Le8/j;->B()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    if-nez v0, :cond_2

    invoke-direct {p0, p1, p2, v2}, Lc8/d;->e(Le8/j;Lc8/a;LF8/M;)LF8/M;

    move-result-object p2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lc8/d;->n(Le8/j;)LH8/h;

    move-result-object p2

    :goto_1
    return-object p2

    :cond_2
    sget-object v0, Lc8/c;->E:Lc8/c;

    invoke-virtual {p2, v0}, Lc8/a;->l(Lc8/c;)Lc8/a;

    move-result-object v0

    invoke-direct {p0, p1, v0, v2}, Lc8/d;->e(Le8/j;Lc8/a;LF8/M;)LF8/M;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-static {p1}, Lc8/d;->n(Le8/j;)LH8/h;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object v2, Lc8/c;->D:Lc8/c;

    invoke-virtual {p2, v2}, Lc8/a;->l(Lc8/c;)Lc8/a;

    move-result-object p2

    invoke-direct {p0, p1, p2, v0}, Lc8/d;->e(Le8/j;Lc8/a;LF8/M;)LF8/M;

    move-result-object p2

    if-nez p2, :cond_4

    invoke-static {p1}, Lc8/d;->n(Le8/j;)LH8/h;

    move-result-object p1

    return-object p1

    :cond_4
    if-eqz v1, :cond_5

    new-instance p1, Lc8/h;

    invoke-direct {p1, v0, p2}, Lc8/h;-><init>(LF8/M;LF8/M;)V

    goto :goto_2

    :cond_5
    invoke-static {v0, p2}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method private static final n(Le8/j;)LH8/h;
    .locals 1

    sget-object v0, LH8/j;->H:LH8/j;

    invoke-interface {p0}, Le8/j;->s()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object p0

    return-object p0
.end method

.method private final p(Le8/x;Lc8/a;LO7/f0;)LF8/i0;
    .locals 8

    .prologue
    instance-of v0, p1, Le8/C;

    if-eqz v0, :cond_4

    check-cast p1, Le8/C;

    invoke-interface {p1}, Le8/C;->G()Le8/x;

    move-result-object v0

    invoke-interface {p1}, Le8/C;->P()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LF8/u0;->I:LF8/u0;

    goto :goto_0

    :cond_0
    sget-object v1, LF8/u0;->H:LF8/u0;

    :goto_0
    if-eqz v0, :cond_3

    invoke-direct {p0, v1, p3}, Lc8/d;->h(LF8/u0;LO7/f0;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lc8/d;->a:La8/g;

    invoke-static {p2, p1}, LX7/J;->a(La8/g;Le8/C;)LP7/c;

    move-result-object p1

    sget-object v2, LF8/p0;->D:LF8/p0;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lc8/b;->b(LF8/p0;ZZLO7/f0;ILjava/lang/Object;)Lc8/a;

    move-result-object p2

    invoke-virtual {p0, v0, p2}, Lc8/d;->o(Le8/x;Lc8/a;)LF8/E;

    move-result-object p2

    if-eqz p1, :cond_2

    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {p2}, LF8/E;->k()LP7/g;

    move-result-object v2

    invoke-static {v2, p1}, Lj7/v;->B0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, LP7/g$a;->a(Ljava/util/List;)LP7/g;

    move-result-object p1

    invoke-static {p2, p1}, LK8/a;->x(LF8/E;LP7/g;)LF8/E;

    move-result-object p2

    :cond_2
    invoke-static {p2, v1, p3}, LK8/a;->f(LF8/E;LF8/u0;LO7/f0;)LF8/i0;

    move-result-object p1

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {p3, p2}, LF8/q0;->t(LO7/f0;LF8/w;)LF8/i0;

    move-result-object p1

    :goto_2
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    new-instance p3, LF8/k0;

    sget-object v0, LF8/u0;->G:LF8/u0;

    invoke-virtual {p0, p1, p2}, Lc8/d;->o(Le8/x;Lc8/a;)LF8/E;

    move-result-object p1

    invoke-direct {p3, v0, p1}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    move-object p1, p3

    :goto_3
    return-object p1
.end method


# virtual methods
.method public final k(Le8/f;Lc8/a;Z)LF8/E;
    .locals 9

    .prologue
    const/4 v0, 0x1

    const-string v1, "arrayType"

    invoke-static {p1, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attr"

    invoke-static {p2, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Le8/f;->p()Le8/x;

    move-result-object v1

    instance-of v2, v1, Le8/v;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Le8/v;

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_1

    invoke-interface {v2}, Le8/v;->getType()LL7/h;

    move-result-object v3

    :cond_1
    new-instance v2, La8/d;

    iget-object v4, p0, Lc8/d;->a:La8/g;

    invoke-direct {v2, v4, p1, v0}, La8/d;-><init>(La8/g;Le8/d;Z)V

    if-eqz v3, :cond_3

    iget-object p1, p0, Lc8/d;->a:La8/g;

    invoke-virtual {p1}, La8/g;->d()LO7/G;

    move-result-object p1

    invoke-interface {p1}, LO7/G;->t()LL7/g;

    move-result-object p1

    invoke-virtual {p1, v3}, LL7/g;->O(LL7/h;)LF8/M;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance p3, LP7/k;

    invoke-virtual {p1}, LF8/E;->k()LP7/g;

    move-result-object v1

    const/4 v3, 0x2

    new-array v3, v3, [LP7/g;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    aput-object v2, v3, v0

    invoke-direct {p3, v3}, LP7/k;-><init>([LP7/g;)V

    invoke-static {p1, p3}, LK8/a;->x(LF8/E;LP7/g;)LF8/E;

    move-result-object p1

    const-string p3, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {p1, p3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/M;

    invoke-virtual {p2}, Lc8/a;->h()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v0}, LF8/M;->d1(Z)LF8/M;

    move-result-object p2

    invoke-static {p1, p2}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_3
    sget-object v3, LF8/p0;->D:LF8/p0;

    invoke-virtual {p2}, Lc8/a;->h()Z

    move-result v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lc8/b;->b(LF8/p0;ZZLO7/f0;ILjava/lang/Object;)Lc8/a;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Lc8/d;->o(Le8/x;Lc8/a;)LF8/E;

    move-result-object p1

    invoke-virtual {p2}, Lc8/a;->h()Z

    move-result p2

    const-string v1, "getArrayType(...)"

    if-eqz p2, :cond_5

    if-eqz p3, :cond_4

    sget-object p2, LF8/u0;->I:LF8/u0;

    goto :goto_2

    :cond_4
    sget-object p2, LF8/u0;->G:LF8/u0;

    :goto_2
    iget-object p3, p0, Lc8/d;->a:La8/g;

    invoke-virtual {p3}, La8/g;->d()LO7/G;

    move-result-object p3

    invoke-interface {p3}, LO7/G;->t()LL7/g;

    move-result-object p3

    invoke-virtual {p3, p2, p1, v2}, LL7/g;->m(LF8/u0;LF8/E;LP7/g;)LF8/M;

    move-result-object p1

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_5
    iget-object p2, p0, Lc8/d;->a:La8/g;

    invoke-virtual {p2}, La8/g;->d()LO7/G;

    move-result-object p2

    invoke-interface {p2}, LO7/G;->t()LL7/g;

    move-result-object p2

    sget-object p3, LF8/u0;->G:LF8/u0;

    invoke-virtual {p2, p3, p1, v2}, LL7/g;->m(LF8/u0;LF8/E;LP7/g;)LF8/M;

    move-result-object p2

    invoke-static {p2, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Lc8/d;->a:La8/g;

    invoke-virtual {p3}, La8/g;->d()LO7/G;

    move-result-object p3

    invoke-interface {p3}, LO7/G;->t()LL7/g;

    move-result-object p3

    sget-object v1, LF8/u0;->I:LF8/u0;

    invoke-virtual {p3, v1, p1, v2}, LL7/g;->m(LF8/u0;LF8/E;LP7/g;)LF8/M;

    move-result-object p1

    invoke-virtual {p1, v0}, LF8/M;->d1(Z)LF8/M;

    move-result-object p1

    invoke-static {p2, p1}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object p1

    return-object p1
.end method

.method public final o(Le8/x;Lc8/a;)LF8/E;
    .locals 7

    .prologue
    const-string v0, "attr"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Le8/v;

    if-eqz v0, :cond_1

    check-cast p1, Le8/v;

    invoke-interface {p1}, Le8/v;->getType()LL7/h;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lc8/d;->a:La8/g;

    invoke-virtual {p2}, La8/g;->d()LO7/G;

    move-result-object p2

    invoke-interface {p2}, LO7/G;->t()LL7/g;

    move-result-object p2

    invoke-virtual {p2, p1}, LL7/g;->R(LL7/h;)LF8/M;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lc8/d;->a:La8/g;

    invoke-virtual {p1}, La8/g;->d()LO7/G;

    move-result-object p1

    invoke-interface {p1}, LO7/G;->t()LL7/g;

    move-result-object p1

    invoke-virtual {p1}, LL7/g;->Z()LF8/M;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    instance-of v0, p1, Le8/j;

    if-eqz v0, :cond_2

    check-cast p1, Le8/j;

    invoke-direct {p0, p1, p2}, Lc8/d;->m(Le8/j;Lc8/a;)LF8/E;

    move-result-object p1

    goto :goto_2

    :cond_2
    instance-of v0, p1, Le8/f;

    if-eqz v0, :cond_3

    move-object v2, p1

    check-cast v2, Le8/f;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lc8/d;->l(Lc8/d;Le8/f;Lc8/a;ZILjava/lang/Object;)LF8/E;

    move-result-object p1

    goto :goto_2

    :cond_3
    instance-of v0, p1, Le8/C;

    const-string v1, "getDefaultBound(...)"

    if-eqz v0, :cond_5

    check-cast p1, Le8/C;

    invoke-interface {p1}, Le8/C;->G()Le8/x;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p0, p1, p2}, Lc8/d;->o(Le8/x;Lc8/a;)LF8/E;

    move-result-object p1

    if-nez p1, :cond_6

    :cond_4
    :goto_1
    iget-object p1, p0, Lc8/d;->a:La8/g;

    invoke-virtual {p1}, La8/g;->d()LO7/G;

    move-result-object p1

    invoke-interface {p1}, LO7/G;->t()LL7/g;

    move-result-object p1

    invoke-virtual {p1}, LL7/g;->y()LF8/M;

    move-result-object p1

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    if-nez p1, :cond_7

    goto :goto_1

    :cond_6
    :goto_2
    return-object p1

    :cond_7
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
