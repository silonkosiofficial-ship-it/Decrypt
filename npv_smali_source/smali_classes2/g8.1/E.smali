.class public abstract Lg8/E;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lg8/p;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "possiblyPrimitiveType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-interface {p0, p1}, Lg8/p;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public static final b(LF8/o0;LJ8/i;Lg8/p;Lg8/D;)Ljava/lang/Object;
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeFactory"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LJ8/o;->u0(LJ8/i;)LJ8/m;

    move-result-object v0

    invoke-interface {p0, v0}, LJ8/o;->X(LJ8/m;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    invoke-interface {p0, v0}, LF8/o0;->o(LJ8/m;)LL7/h;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-interface {p2, v1}, Lg8/p;->a(LL7/h;)Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p0, p1}, LJ8/o;->p(LJ8/i;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p0, p1}, Lf8/s;->c(LF8/o0;LJ8/i;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    invoke-static {p2, p3, p0}, Lg8/E;->a(Lg8/p;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-interface {p0, v0}, LF8/o0;->N(LJ8/m;)LL7/h;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 p3, 0x5b

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lw8/e;->g(LL7/h;)Lw8/e;

    move-result-object p1

    invoke-virtual {p1}, Lw8/e;->m()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p2, p0}, Lg8/p;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-interface {p0, v0}, LF8/o0;->C(LJ8/m;)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-interface {p0, v0}, LF8/o0;->K(LJ8/m;)Ln8/d;

    move-result-object p0

    if-eqz p0, :cond_5

    sget-object p1, LN7/c;->a:LN7/c;

    invoke-virtual {p1, p0}, LN7/c;->n(Ln8/d;)Ln8/b;

    move-result-object p0

    goto :goto_2

    :cond_5
    move-object p0, v2

    :goto_2
    if-eqz p0, :cond_9

    invoke-virtual {p3}, Lg8/D;->a()Z

    move-result p1

    if-nez p1, :cond_8

    sget-object p1, LN7/c;->a:LN7/c;

    invoke-virtual {p1}, LN7/c;->i()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of p3, p1, Ljava/util/Collection;

    if-eqz p3, :cond_6

    move-object p3, p1

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_6

    goto :goto_3

    :cond_6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LN7/c$a;

    invoke-virtual {p3}, LN7/c$a;->d()Ln8/b;

    move-result-object p3

    invoke-static {p3, p0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_7

    return-object v2

    :cond_8
    :goto_3
    invoke-static {p0}, Lw8/d;->b(Ln8/b;)Lw8/d;

    move-result-object p0

    invoke-virtual {p0}, Lw8/d;->f()Ljava/lang/String;

    move-result-object p0

    const-string p1, "getInternalName(...)"

    invoke-static {p0, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p0}, Lg8/p;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_9
    return-object v2
.end method
