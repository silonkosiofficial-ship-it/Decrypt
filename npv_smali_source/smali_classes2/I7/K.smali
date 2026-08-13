.class public abstract LI7/K;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF7/o;)LF7/o;
    .locals 11

    .prologue
    const-string v0, "type"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, LI7/A;

    invoke-virtual {v0}, LI7/A;->f()LF8/E;

    move-result-object v0

    instance-of v1, v0, LF8/M;

    if-eqz v1, :cond_2

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v1

    invoke-interface {v1}, LF8/e0;->w()LO7/h;

    move-result-object v1

    instance-of v2, v1, LO7/e;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, LO7/e;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_1

    new-instance p0, LI7/A;

    move-object v4, v0

    check-cast v4, LF8/M;

    invoke-static {v1}, LI7/K;->b(LO7/e;)LO7/e;

    move-result-object v0

    invoke-interface {v0}, LO7/h;->p()LF8/e0;

    move-result-object v6

    const-string v0, "getTypeConstructor(...)"

    invoke-static {v6, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x1a

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, LF8/F;->k(LF8/M;LF8/a0;LF8/e0;Ljava/util/List;ZILjava/lang/Object;)LF8/M;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p0, v0, v3, v1, v3}, LI7/A;-><init>(LF8/E;Lx7/a;ILy7/k;)V

    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Non-class type cannot be a mutable collection type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Non-simple type cannot be a mutable collection type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final b(LO7/e;)LO7/e;
    .locals 3

    .prologue
    sget-object v0, LN7/c;->a:LN7/c;

    invoke-static {p0}, Lv8/c;->m(LO7/m;)Ln8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, LN7/c;->p(Ln8/d;)Ln8/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lv8/c;->j(LO7/m;)LL7/g;

    move-result-object p0

    invoke-virtual {p0, v0}, LL7/g;->o(Ln8/c;)LO7/e;

    move-result-object p0

    const-string v0, "getBuiltInClassByFqName(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Not a readonly collection: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
