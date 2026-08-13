.class public abstract LF8/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF8/E;)LF8/M;
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/E;->Z0()LF8/t0;

    move-result-object v0

    instance-of v1, v0, LF8/M;

    if-eqz v1, :cond_0

    check-cast v0, LF8/M;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "This is should be simple type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final b(LF8/E;Ljava/util/List;LP7/g;)LF8/E;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newArguments"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newAnnotations"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, LF8/m0;->e(LF8/E;Ljava/util/List;LP7/g;Ljava/util/List;ILjava/lang/Object;)LF8/E;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LF8/E;Ljava/util/List;LP7/g;Ljava/util/List;)LF8/E;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newArguments"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newAnnotations"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newArgumentsForUpperBound"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v0

    if-ne p1, v0, :cond_1

    :cond_0
    invoke-virtual {p0}, LF8/E;->k()LP7/g;

    move-result-object v0

    if-ne p2, v0, :cond_1

    return-object p0

    :cond_1
    invoke-virtual {p0}, LF8/E;->V0()LF8/a0;

    move-result-object v0

    instance-of v1, p2, LP7/l;

    if-eqz v1, :cond_2

    invoke-interface {p2}, LP7/g;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p2, LP7/g;->d:LP7/g$a;

    invoke-virtual {p2}, LP7/g$a;->b()LP7/g;

    move-result-object p2

    :cond_2
    invoke-static {v0, p2}, LF8/b0;->a(LF8/a0;LP7/g;)LF8/a0;

    move-result-object p2

    invoke-virtual {p0}, LF8/E;->Z0()LF8/t0;

    move-result-object p0

    instance-of v0, p0, LF8/y;

    if-eqz v0, :cond_3

    check-cast p0, LF8/y;

    invoke-virtual {p0}, LF8/y;->e1()LF8/M;

    move-result-object v0

    invoke-static {v0, p1, p2}, LF8/m0;->d(LF8/M;Ljava/util/List;LF8/a0;)LF8/M;

    move-result-object p1

    invoke-virtual {p0}, LF8/y;->f1()LF8/M;

    move-result-object p0

    invoke-static {p0, p3, p2}, LF8/m0;->d(LF8/M;Ljava/util/List;LF8/a0;)LF8/M;

    move-result-object p0

    invoke-static {p1, p0}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object p0

    goto :goto_0

    :cond_3
    instance-of p3, p0, LF8/M;

    if-eqz p3, :cond_4

    check-cast p0, LF8/M;

    invoke-static {p0, p1, p2}, LF8/m0;->d(LF8/M;Ljava/util/List;LF8/a0;)LF8/M;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_4
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0
.end method

.method public static final d(LF8/M;Ljava/util/List;LF8/a0;)LF8/M;
    .locals 7

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newArguments"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newAttributes"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LF8/E;->V0()LF8/a0;

    move-result-object v0

    if-ne p2, v0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p2}, LF8/M;->e1(LF8/a0;)LF8/M;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, LH8/h;

    if-eqz v0, :cond_2

    check-cast p0, LH8/h;

    invoke-virtual {p0, p1}, LH8/h;->i1(Ljava/util/List;)LH8/h;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object v1

    invoke-virtual {p0}, LF8/E;->X0()Z

    move-result v3

    const/16 v5, 0x10

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p2

    move-object v2, p1

    invoke-static/range {v0 .. v6}, LF8/F;->l(LF8/a0;LF8/e0;Ljava/util/List;ZLG8/g;ILjava/lang/Object;)LF8/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LF8/E;Ljava/util/List;LP7/g;Ljava/util/List;ILjava/lang/Object;)LF8/E;
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    invoke-virtual {p0}, LF8/E;->k()LP7/g;

    move-result-object p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, p1

    :cond_2
    invoke-static {p0, p1, p2, p3}, LF8/m0;->c(LF8/E;Ljava/util/List;LP7/g;Ljava/util/List;)LF8/E;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LF8/M;Ljava/util/List;LF8/a0;ILjava/lang/Object;)LF8/M;
    .locals 0

    .prologue
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-virtual {p0}, LF8/E;->V0()LF8/a0;

    move-result-object p2

    :cond_1
    invoke-static {p0, p1, p2}, LF8/m0;->d(LF8/M;Ljava/util/List;LF8/a0;)LF8/M;

    move-result-object p0

    return-object p0
.end method
