.class public final LH8/a;
.super LR7/h;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ln8/f;)V
    .locals 12

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LH8/k;->a:LH8/k;

    invoke-virtual {v0}, LH8/k;->i()LO7/G;

    move-result-object v2

    sget-object v4, LO7/D;->F:LO7/D;

    sget-object v5, LO7/f;->D:LO7/f;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/util/Collection;

    sget-object v10, LO7/a0;->a:LO7/a0;

    const/4 v8, 0x0

    sget-object v9, LE8/f;->e:LE8/n;

    move-object v1, p0

    move-object v3, p1

    move-object v7, v10

    invoke-direct/range {v1 .. v9}, LR7/h;-><init>(LO7/m;Ln8/f;LO7/D;LO7/f;Ljava/util/Collection;LO7/a0;ZLE8/n;)V

    sget-object p1, LP7/g;->d:LP7/g$a;

    invoke-virtual {p1}, LP7/g$a;->b()LP7/g;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p0, p1, v1, v10}, LR7/f;->w1(LO7/e;LP7/g;ZLO7/a0;)LR7/f;

    move-result-object p1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    sget-object v2, LO7/t;->d:LO7/u;

    invoke-virtual {p1, v1, v2}, LR7/f;->z1(Ljava/util/List;LO7/u;)LR7/f;

    const-string v1, "apply(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LH8/g;->L:LH8/g;

    invoke-virtual {p1}, LR7/j;->getName()Ln8/f;

    move-result-object v2

    invoke-virtual {v2}, Ln8/f;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "toString(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, ""

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, LH8/k;->b(LH8/g;[Ljava/lang/String;)LH8/f;

    move-result-object v1

    new-instance v2, LH8/h;

    sget-object v6, LH8/j;->V0:LH8/j;

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/String;

    invoke-virtual {v0, v6, v4}, LH8/k;->e(LH8/j;[Ljava/lang/String;)LH8/i;

    move-result-object v4

    new-array v9, v3, [Ljava/lang/String;

    const/16 v10, 0x18

    const/4 v11, 0x0

    const/4 v7, 0x0

    move-object v3, v2

    move-object v5, v1

    invoke-direct/range {v3 .. v11}, LH8/h;-><init>(LF8/e0;Ly8/h;LH8/j;Ljava/util/List;Z[Ljava/lang/String;ILy7/k;)V

    invoke-virtual {p1, v2}, LR7/p;->p1(LF8/E;)V

    invoke-static {p1}, Lj7/Z;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0, v1, v0, p1}, LR7/h;->T0(Ly8/h;Ljava/util/Set;LO7/d;)V

    return-void
.end method


# virtual methods
.method public M(LF8/l0;LG8/g;)Ly8/h;
    .locals 2

    const-string v0, "typeSubstitution"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, LH8/g;->L:LH8/g;

    invoke-virtual {p0}, LR7/a;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, LH8/k;->b(LH8/g;[Ljava/lang/String;)LH8/f;

    move-result-object p1

    return-object p1
.end method

.method public O0(LF8/n0;)LO7/e;
    .locals 1

    const-string v0, "substitutor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public bridge synthetic c(LF8/n0;)LO7/n;
    .locals 0

    invoke-virtual {p0, p1}, LH8/a;->O0(LF8/n0;)LO7/e;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LR7/a;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
