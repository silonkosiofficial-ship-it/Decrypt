.class public final Lb8/n;
.super LR7/b;
.source "SourceFile"


# instance fields
.field private final M:La8/g;

.field private final N:Le8/y;


# direct methods
.method public constructor <init>(La8/g;Le8/y;ILO7/m;)V
    .locals 11

    const-string v0, "c"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaTypeParameter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object v2

    new-instance v0, La8/d;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, v0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v3 .. v8}, La8/d;-><init>(La8/g;Le8/d;ZILy7/k;)V

    invoke-interface {p2}, Le8/t;->getName()Ln8/f;

    move-result-object v5

    sget-object v6, LF8/u0;->G:LF8/u0;

    sget-object v9, LO7/a0;->a:LO7/a0;

    invoke-virtual {p1}, La8/g;->a()La8/b;

    move-result-object v1

    invoke-virtual {v1}, La8/b;->v()LO7/d0;

    move-result-object v10

    const/4 v7, 0x0

    move-object v1, p0

    move-object v3, p4

    move-object v4, v0

    move v8, p3

    invoke-direct/range {v1 .. v10}, LR7/b;-><init>(LE8/n;LO7/m;LP7/g;Ln8/f;LF8/u0;ZILO7/a0;LO7/d0;)V

    iput-object p1, p0, Lb8/n;->M:La8/g;

    iput-object p2, p0, Lb8/n;->N:Le8/y;

    return-void
.end method

.method private final V0()Ljava/util/List;
    .locals 10

    .prologue
    iget-object v0, p0, Lb8/n;->N:Le8/y;

    invoke-interface {v0}, Le8/y;->getUpperBounds()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lb8/n;->M:La8/g;

    invoke-virtual {v0}, La8/g;->d()LO7/G;

    move-result-object v0

    invoke-interface {v0}, LO7/G;->t()LL7/g;

    move-result-object v0

    invoke-virtual {v0}, LL7/g;->i()LF8/M;

    move-result-object v0

    const-string v1, "getAnyType(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lb8/n;->M:La8/g;

    invoke-virtual {v1}, La8/g;->d()LO7/G;

    move-result-object v1

    invoke-interface {v1}, LO7/G;->t()LL7/g;

    move-result-object v1

    invoke-virtual {v1}, LL7/g;->I()LF8/M;

    move-result-object v1

    const-string v2, "getNullableAnyType(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le8/j;

    iget-object v3, p0, Lb8/n;->M:La8/g;

    invoke-virtual {v3}, La8/g;->g()Lc8/d;

    move-result-object v3

    sget-object v4, LF8/p0;->D:LF8/p0;

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p0

    invoke-static/range {v4 .. v9}, Lc8/b;->b(LF8/p0;ZZLO7/f0;ILjava/lang/Object;)Lc8/a;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Lc8/d;->o(Le8/x;Lc8/a;)LF8/E;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method


# virtual methods
.method protected O0(Ljava/util/List;)Ljava/util/List;
    .locals 2

    const-string v0, "bounds"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb8/n;->M:La8/g;

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->r()Lf8/l;

    move-result-object v0

    iget-object v1, p0, Lb8/n;->M:La8/g;

    invoke-virtual {v0, p0, p1, v1}, Lf8/l;->i(LO7/f0;Ljava/util/List;La8/g;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected T0(LF8/E;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected U0()Ljava/util/List;
    .locals 1

    invoke-direct {p0}, Lb8/n;->V0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
