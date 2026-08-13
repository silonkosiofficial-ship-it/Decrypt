.class public abstract Lg8/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Ljava/lang/StringBuilder;LF8/E;)V
    .locals 0

    invoke-static {p1}, Lg8/y;->g(LF8/E;)Lg8/o;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static final b(LO7/y;ZZ)Ljava/lang/String;
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p2, :cond_1

    instance-of p2, p0, LO7/l;

    if-eqz p2, :cond_0

    const-string p2, "<init>"

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LO7/I;->getName()Ln8/f;

    move-result-object p2

    invoke-virtual {p2}, Ln8/f;->g()Ljava/lang/String;

    move-result-object p2

    const-string v1, "asString(...)"

    invoke-static {p2, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string p2, "("

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, LO7/a;->v0()LO7/X;

    move-result-object p2

    const-string v1, "getType(...)"

    if-eqz p2, :cond_2

    invoke-interface {p2}, LO7/i0;->getType()LF8/E;

    move-result-object p2

    invoke-static {p2, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p2}, Lg8/y;->a(Ljava/lang/StringBuilder;LF8/E;)V

    :cond_2
    invoke-interface {p0}, LO7/a;->n()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/j0;

    invoke-interface {v2}, LO7/i0;->getType()LF8/E;

    move-result-object v2

    invoke-static {v2, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, Lg8/y;->a(Ljava/lang/StringBuilder;LF8/E;)V

    goto :goto_1

    :cond_3
    const-string p2, ")"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_5

    invoke-static {p0}, Lg8/g;->c(LO7/a;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p0, "V"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    invoke-interface {p0}, LO7/a;->l()LF8/E;

    move-result-object p0

    invoke-static {p0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0, p0}, Lg8/y;->a(Ljava/lang/StringBuilder;LF8/E;)V

    :cond_5
    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "toString(...)"

    invoke-static {p0, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic c(LO7/y;ZZILjava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x1

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    :cond_1
    invoke-static {p0, p1, p2}, Lg8/y;->b(LO7/y;ZZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LO7/a;)Ljava/lang/String;
    .locals 5

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg8/A;->a:Lg8/A;

    invoke-static {p0}, Lr8/f;->E(LO7/m;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    invoke-interface {p0}, LO7/n;->b()LO7/m;

    move-result-object v1

    instance-of v3, v1, LO7/e;

    if-eqz v3, :cond_1

    check-cast v1, LO7/e;

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_2

    return-object v2

    :cond_2
    invoke-interface {v1}, LO7/I;->getName()Ln8/f;

    move-result-object v3

    invoke-virtual {v3}, Ln8/f;->q()Z

    move-result v3

    if-eqz v3, :cond_3

    return-object v2

    :cond_3
    invoke-interface {p0}, LO7/a;->a()LO7/a;

    move-result-object p0

    instance-of v3, p0, LO7/Z;

    if-eqz v3, :cond_4

    check-cast p0, LO7/Z;

    goto :goto_1

    :cond_4
    move-object p0, v2

    :goto_1
    if-nez p0, :cond_5

    return-object v2

    :cond_5
    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-static {p0, v4, v4, v3, v2}, Lg8/y;->c(LO7/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, v1, p0}, Lg8/x;->a(Lg8/A;LO7/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final e(LO7/a;)Z
    .locals 7

    .prologue
    const-string v0, "f"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LO7/y;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    move-object v0, p0

    check-cast v0, LO7/y;

    invoke-interface {v0}, LO7/I;->getName()Ln8/f;

    move-result-object v2

    invoke-virtual {v2}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v2

    const-string v3, "remove"

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, LO7/a;->n()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_6

    check-cast p0, LO7/b;

    invoke-static {p0}, LX7/H;->h(LO7/b;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto/16 :goto_1

    :cond_1
    invoke-interface {v0}, LO7/y;->a()LO7/y;

    move-result-object p0

    invoke-interface {p0}, LO7/a;->n()Ljava/util/List;

    move-result-object p0

    const-string v2, "getValueParameters(...)"

    invoke-static {p0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LO7/j0;

    invoke-interface {p0}, LO7/i0;->getType()LF8/E;

    move-result-object p0

    const-string v4, "getType(...)"

    invoke-static {p0, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lg8/y;->g(LF8/E;)Lg8/o;

    move-result-object p0

    instance-of v5, p0, Lg8/o$d;

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    check-cast p0, Lg8/o$d;

    goto :goto_0

    :cond_2
    move-object p0, v6

    :goto_0
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lg8/o$d;->i()Lw8/e;

    move-result-object v6

    :cond_3
    sget-object p0, Lw8/e;->K:Lw8/e;

    if-eq v6, p0, :cond_4

    return v1

    :cond_4
    invoke-static {v0}, LX7/f;->k(LO7/y;)LO7/y;

    move-result-object p0

    if-nez p0, :cond_5

    return v1

    :cond_5
    invoke-interface {p0}, LO7/y;->a()LO7/y;

    move-result-object v0

    invoke-interface {v0}, LO7/a;->n()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/j0;

    invoke-interface {v0}, LO7/i0;->getType()LF8/E;

    move-result-object v0

    invoke-static {v0, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lg8/y;->g(LF8/E;)Lg8/o;

    move-result-object v0

    invoke-interface {p0}, LO7/y;->b()LO7/m;

    move-result-object p0

    const-string v2, "getContainingDeclaration(...)"

    invoke-static {p0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lv8/c;->m(LO7/m;)Ln8/d;

    move-result-object p0

    sget-object v2, LL7/j$a;->d0:Ln8/c;

    invoke-virtual {v2}, Ln8/c;->j()Ln8/d;

    move-result-object v2

    invoke-static {p0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    instance-of p0, v0, Lg8/o$c;

    if-eqz p0, :cond_6

    check-cast v0, Lg8/o$c;

    invoke-virtual {v0}, Lg8/o$c;->i()Ljava/lang/String;

    move-result-object p0

    const-string v0, "java/lang/Object"

    invoke-static {p0, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    move v1, v3

    :cond_6
    :goto_1
    return v1
.end method

.method public static final f(LO7/e;)Ljava/lang/String;
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LN7/c;->a:LN7/c;

    invoke-static {p0}, Lv8/c;->l(LO7/m;)Ln8/c;

    move-result-object v1

    invoke-virtual {v1}, Ln8/c;->j()Ln8/d;

    move-result-object v1

    const-string v2, "toUnsafe(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LN7/c;->n(Ln8/d;)Ln8/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lw8/d;->b(Ln8/b;)Lw8/d;

    move-result-object p0

    invoke-virtual {p0}, Lw8/d;->f()Ljava/lang/String;

    move-result-object p0

    const-string v0, "getInternalName(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1}, Lg8/g;->b(LO7/e;Lg8/B;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final g(LF8/E;)Lg8/o;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lg8/q;->a:Lg8/q;

    sget-object v3, Lg8/D;->o:Lg8/D;

    sget-object v4, Lg8/C;->a:Lg8/C;

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v8}, Lg8/g;->e(LF8/E;Lg8/p;Lg8/D;Lg8/B;Lg8/m;Lx7/q;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg8/o;

    return-object p0
.end method
