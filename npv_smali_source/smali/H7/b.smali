.class public abstract LH7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF7/d;)LF7/c;
    .locals 5

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LF7/c;

    if-eqz v0, :cond_0

    check-cast p0, LF7/c;

    goto :goto_0

    :cond_0
    instance-of v0, p0, LF7/p;

    if-eqz v0, :cond_7

    check-cast p0, LF7/p;

    invoke-interface {p0}, LF7/p;->getUpperBounds()Ljava/util/List;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LF7/o;

    const-string v4, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl"

    invoke-static {v3, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, LI7/A;

    invoke-virtual {v3}, LI7/A;->f()LF8/E;

    move-result-object v3

    invoke-virtual {v3}, LF8/E;->W0()LF8/e0;

    move-result-object v3

    invoke-interface {v3}, LF8/e0;->w()LO7/h;

    move-result-object v3

    instance-of v4, v3, LO7/e;

    if-eqz v4, :cond_2

    move-object v2, v3

    check-cast v2, LO7/e;

    :cond_2
    if-eqz v2, :cond_1

    invoke-interface {v2}, LO7/e;->j()LO7/f;

    move-result-object v3

    sget-object v4, LO7/f;->E:LO7/f;

    if-eq v3, v4, :cond_1

    invoke-interface {v2}, LO7/e;->j()LO7/f;

    move-result-object v2

    sget-object v3, LO7/f;->H:LO7/f;

    if-eq v2, v3, :cond_1

    move-object v2, v1

    :cond_3
    check-cast v2, LF7/o;

    if-nez v2, :cond_4

    invoke-static {p0}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, LF7/o;

    :cond_4
    if-eqz v2, :cond_5

    invoke-static {v2}, LH7/b;->b(LF7/o;)LF7/c;

    move-result-object p0

    if-nez p0, :cond_6

    :cond_5
    const-class p0, Ljava/lang/Object;

    invoke-static {p0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p0

    :cond_6
    :goto_0
    return-object p0

    :cond_7
    new-instance v0, LI7/D;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot calculate JVM erasure for type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, LI7/D;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final b(LF7/o;)LF7/c;
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LF7/o;->b()LF7/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LH7/b;->a(LF7/d;)LF7/c;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, LI7/D;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot calculate JVM erasure for type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, LI7/D;-><init>(Ljava/lang/String;)V

    throw v0
.end method
