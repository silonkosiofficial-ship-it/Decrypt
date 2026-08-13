.class public abstract Lg8/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LO7/e;Lg8/B;)Ljava/lang/String;
    .locals 8

    .prologue
    const-string v0, "klass"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeMappingConfiguration"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lg8/B;->a(LO7/e;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p0}, LO7/e;->b()LO7/m;

    move-result-object v0

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LO7/I;->getName()Ln8/f;

    move-result-object v1

    invoke-static {v1}, Ln8/h;->b(Ln8/f;)Ln8/f;

    move-result-object v1

    invoke-virtual {v1}, Ln8/f;->m()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getIdentifier(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v0, LO7/K;

    if-eqz v2, :cond_2

    check-cast v0, LO7/K;

    invoke-interface {v0}, LO7/K;->e()Ln8/c;

    move-result-object p0

    invoke-virtual {p0}, Ln8/c;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ln8/c;->b()Ljava/lang/String;

    move-result-object v2

    const-string p0, "asString(...)"

    invoke-static {v2, p0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/16 v3, 0x2e

    const/16 v4, 0x2f

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LS8/r;->Q(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x2f

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    return-object v1

    :cond_2
    instance-of v2, v0, LO7/e;

    if-eqz v2, :cond_3

    move-object v2, v0

    check-cast v2, LO7/e;

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_5

    invoke-interface {p1, v2}, Lg8/B;->f(LO7/e;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_4

    invoke-static {v2, p1}, Lg8/g;->a(LO7/e;Lg8/B;)Ljava/lang/String;

    move-result-object p0

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x24

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected container: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic b(LO7/e;Lg8/B;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    sget-object p1, Lg8/C;->a:Lg8/C;

    :cond_0
    invoke-static {p0, p1}, Lg8/g;->a(LO7/e;Lg8/B;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LO7/a;)Z
    .locals 2

    .prologue
    const-string v0, "descriptor"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LO7/l;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, LO7/a;->l()LF8/E;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0}, LL7/g;->C0(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, LO7/a;->l()LF8/E;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0}, LF8/q0;->l(LF8/E;)Z

    move-result v0

    if-nez v0, :cond_1

    instance-of p0, p0, LO7/V;

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static final d(LF8/E;Lg8/p;Lg8/D;Lg8/B;Lg8/m;Lx7/q;)Ljava/lang/Object;
    .locals 8

    .prologue
    const-string v0, "kotlinType"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeMappingConfiguration"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "writeGenericType"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, p0}, Lg8/B;->e(LF8/E;)LF8/E;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-static/range {v1 .. v6}, Lg8/g;->d(LF8/E;Lg8/p;Lg8/D;Lg8/B;Lg8/m;Lx7/q;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, LL7/f;->r(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, LL7/k;->a(LF8/E;)LF8/M;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-static/range {v1 .. v6}, Lg8/g;->d(LF8/E;Lg8/p;Lg8/D;Lg8/B;Lg8/m;Lx7/q;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object v0, LG8/o;->a:LG8/o;

    invoke-static {v0, p0, p1, p2}, Lg8/E;->b(LF8/o0;LJ8/i;Lg8/p;Lg8/D;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p2}, Lg8/D;->d()Z

    move-result p3

    invoke-static {p1, v1, p3}, Lg8/E;->a(Lg8/p;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p5, p0, p1, p2}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    :cond_2
    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object v1

    instance-of v2, v1, LF8/D;

    if-eqz v2, :cond_4

    check-cast v1, LF8/D;

    invoke-virtual {v1}, LF8/D;->d()LF8/E;

    move-result-object p0

    if-nez p0, :cond_3

    invoke-virtual {v1}, LF8/D;->u()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p3, p0}, Lg8/B;->d(Ljava/util/Collection;)LF8/E;

    move-result-object p0

    :cond_3
    invoke-static {p0}, LK8/a;->y(LF8/E;)LF8/E;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lg8/g;->d(LF8/E;Lg8/p;Lg8/D;Lg8/B;Lg8/m;Lx7/q;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-interface {v1}, LF8/e0;->w()LO7/h;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-static {v1}, LH8/k;->m(LO7/m;)Z

    move-result v2

    if-eqz v2, :cond_5

    const-string p2, "error/NonExistentClass"

    invoke-interface {p1, p2}, Lg8/p;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast v1, LO7/e;

    invoke-interface {p3, p0, v1}, Lg8/B;->b(LF8/E;LO7/e;)V

    return-object p1

    :cond_5
    instance-of v2, v1, LO7/e;

    if-eqz v2, :cond_8

    invoke-static {p0}, LL7/g;->c0(LF8/E;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF8/i0;

    invoke-interface {p0}, LF8/i0;->getType()LF8/E;

    move-result-object v2

    const-string v0, "getType(...)"

    invoke-static {v2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LF8/i0;->a()LF8/u0;

    move-result-object v0

    sget-object v3, LF8/u0;->H:LF8/u0;

    if-ne v0, v3, :cond_6

    const-string p0, "java/lang/Object"

    invoke-interface {p1, p0}, Lg8/p;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_6
    invoke-interface {p0}, LF8/i0;->a()LF8/u0;

    move-result-object p0

    const-string v0, "getProjectionKind(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p0, v1}, Lg8/D;->f(LF8/u0;Z)Lg8/D;

    move-result-object v4

    move-object v3, p1

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-static/range {v2 .. v7}, Lg8/g;->d(LF8/E;Lg8/p;Lg8/D;Lg8/B;Lg8/m;Lx7/q;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 p3, 0x5b

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p1, p0}, Lg8/p;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lg8/p;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_7
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "arrays must have one type argument"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    if-eqz v2, :cond_d

    invoke-static {v1}, Lr8/h;->b(LO7/m;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {p2}, Lg8/D;->c()Z

    move-result v2

    if-nez v2, :cond_9

    invoke-static {v0, p0}, LF8/x;->a(LF8/o0;LJ8/i;)LJ8/i;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LF8/E;

    if-eqz v2, :cond_9

    invoke-virtual {p2}, Lg8/D;->g()Lg8/D;

    move-result-object v4

    move-object v3, p1

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-static/range {v2 .. v7}, Lg8/g;->d(LF8/E;Lg8/p;Lg8/D;Lg8/B;Lg8/m;Lx7/q;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_9
    invoke-virtual {p2}, Lg8/D;->e()Z

    move-result p4

    if-eqz p4, :cond_a

    move-object p4, v1

    check-cast p4, LO7/e;

    invoke-static {p4}, LL7/g;->l0(LO7/e;)Z

    move-result p4

    if-eqz p4, :cond_a

    invoke-interface {p1}, Lg8/p;->f()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_a
    check-cast v1, LO7/e;

    invoke-interface {v1}, LO7/e;->a()LO7/e;

    move-result-object p4

    const-string v0, "getOriginal(...)"

    invoke-static {p4, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, p4}, Lg8/B;->c(LO7/e;)Ljava/lang/Object;

    move-result-object p4

    if-nez p4, :cond_c

    invoke-interface {v1}, LO7/e;->j()LO7/f;

    move-result-object p4

    sget-object v2, LO7/f;->G:LO7/f;

    if-ne p4, v2, :cond_b

    invoke-interface {v1}, LO7/e;->b()LO7/m;

    move-result-object p4

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {p4, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p4

    check-cast v1, LO7/e;

    :cond_b
    invoke-interface {v1}, LO7/e;->a()LO7/e;

    move-result-object p4

    invoke-static {p4, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p3}, Lg8/g;->a(LO7/e;Lg8/B;)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p3}, Lg8/p;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_c
    move-object p1, p4

    :goto_1
    invoke-interface {p5, p0, p1, p2}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    :cond_d
    instance-of v0, v1, LO7/f0;

    if-eqz v0, :cond_f

    check-cast v1, LO7/f0;

    invoke-static {v1}, LK8/a;->j(LO7/f0;)LF8/E;

    move-result-object p4

    invoke-virtual {p0}, LF8/E;->X0()Z

    move-result p0

    if-eqz p0, :cond_e

    invoke-static {p4}, LK8/a;->w(LF8/E;)LF8/E;

    move-result-object p4

    :cond_e
    move-object v0, p4

    invoke-static {}, LP8/e;->b()Lx7/q;

    move-result-object v5

    const/4 v4, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Lg8/g;->d(LF8/E;Lg8/p;Lg8/D;Lg8/B;Lg8/m;Lx7/q;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_f
    instance-of v0, v1, LO7/e0;

    if-eqz v0, :cond_10

    invoke-virtual {p2}, Lg8/D;->b()Z

    move-result v0

    if-eqz v0, :cond_10

    check-cast v1, LO7/e0;

    invoke-interface {v1}, LO7/e0;->c0()LF8/M;

    move-result-object v2

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    :try_start_0
    invoke-static/range {v2 .. v7}, Lg8/g;->d(LF8/E;Lg8/p;Lg8/D;Lg8/B;Lg8/m;Lx7/q;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    throw p0

    :cond_10
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unknown type "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "no descriptor for type constructor of "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic e(LF8/E;Lg8/p;Lg8/D;Lg8/B;Lg8/m;Lx7/q;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    and-int/lit8 p6, p6, 0x20

    if-eqz p6, :cond_0

    invoke-static {}, LP8/e;->b()Lx7/q;

    move-result-object p5

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-static/range {v0 .. v5}, Lg8/g;->d(LF8/E;Lg8/p;Lg8/D;Lg8/B;Lg8/m;Lx7/q;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
