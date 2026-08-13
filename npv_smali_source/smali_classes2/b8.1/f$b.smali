.class final Lb8/f$b;
.super LF8/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final d:LE8/i;

.field final synthetic e:Lb8/f;


# direct methods
.method public constructor <init>(Lb8/f;)V
    .locals 2

    iput-object p1, p0, Lb8/f$b;->e:Lb8/f;

    invoke-static {p1}, Lb8/f;->U0(Lb8/f;)La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->e()LE8/n;

    move-result-object v0

    invoke-direct {p0, v0}, LF8/b;-><init>(LE8/n;)V

    invoke-static {p1}, Lb8/f;->U0(Lb8/f;)La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->e()LE8/n;

    move-result-object v0

    new-instance v1, Lb8/f$b$a;

    invoke-direct {v1, p1}, Lb8/f$b$a;-><init>(Lb8/f;)V

    invoke-interface {v0, v1}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, Lb8/f$b;->d:LE8/i;

    return-void
.end method

.method private final r()LF8/E;
    .locals 8

    .prologue
    invoke-direct {p0}, Lb8/f$b;->s()Ln8/c;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln8/c;->d()Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, LL7/j;->x:Ln8/f;

    invoke-virtual {v0, v2}, Ln8/c;->i(Ln8/f;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    sget-object v2, LX7/m;->a:LX7/m;

    iget-object v3, p0, Lb8/f$b;->e:Lb8/f;

    invoke-static {v3}, Lv8/c;->l(LO7/m;)Ln8/c;

    move-result-object v3

    invoke-virtual {v2, v3}, LX7/m;->b(Ln8/c;)Ln8/c;

    move-result-object v2

    if-nez v2, :cond_2

    return-object v1

    :cond_1
    move-object v2, v0

    :cond_2
    iget-object v3, p0, Lb8/f$b;->e:Lb8/f;

    invoke-static {v3}, Lb8/f;->U0(Lb8/f;)La8/g;

    move-result-object v3

    invoke-virtual {v3}, La8/g;->d()LO7/G;

    move-result-object v3

    sget-object v4, LW7/d;->U:LW7/d;

    invoke-static {v3, v2, v4}, Lv8/c;->w(LO7/G;Ln8/c;LW7/b;)LO7/e;

    move-result-object v2

    if-nez v2, :cond_3

    return-object v1

    :cond_3
    invoke-interface {v2}, LO7/h;->p()LF8/e0;

    move-result-object v3

    invoke-interface {v3}, LF8/e0;->x()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    iget-object v4, p0, Lb8/f$b;->e:Lb8/f;

    invoke-virtual {v4}, Lb8/f;->p()LF8/e0;

    move-result-object v4

    invoke-interface {v4}, LF8/e0;->x()Ljava/util/List;

    move-result-object v4

    const-string v5, "getParameters(...)"

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    const/16 v6, 0xa

    if-ne v5, v3, :cond_4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v4, v6}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO7/f0;

    new-instance v4, LF8/k0;

    sget-object v5, LF8/u0;->G:LF8/u0;

    invoke-interface {v3}, LO7/h;->w()LF8/M;

    move-result-object v3

    invoke-direct {v4, v5, v3}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    const/4 v7, 0x1

    if-ne v5, v7, :cond_7

    if-le v3, v7, :cond_7

    if-nez v0, :cond_7

    new-instance v0, LF8/k0;

    sget-object v1, LF8/u0;->G:LF8/u0;

    invoke-static {v4}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO7/f0;

    invoke-interface {v4}, LO7/h;->w()LF8/M;

    move-result-object v4

    invoke-direct {v0, v1, v4}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    new-instance v1, LE7/i;

    invoke-direct {v1, v7, v3}, LE7/i;-><init>(II)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    move-object v4, v1

    check-cast v4, Lj7/O;

    invoke-virtual {v4}, Lj7/O;->b()I

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    move-object v0, v3

    :cond_6
    sget-object v1, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {v1}, LF8/a0$a;->i()LF8/a0;

    move-result-object v1

    invoke-static {v1, v2, v0}, LF8/F;->g(LF8/a0;LO7/e;Ljava/util/List;)LF8/M;

    move-result-object v0

    return-object v0

    :cond_7
    return-object v1
.end method

.method private final s()Ln8/c;
    .locals 3

    .prologue
    iget-object v0, p0, Lb8/f$b;->e:Lb8/f;

    invoke-virtual {v0}, Lb8/f;->k()LP7/g;

    move-result-object v0

    sget-object v1, LX7/B;->r:Ln8/c;

    const-string v2, "PURELY_IMPLEMENTS_ANNOTATION"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, LP7/g;->j(Ln8/c;)LP7/c;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {v0}, LP7/c;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->H0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lt8/u;

    if-eqz v2, :cond_1

    check-cast v0, Lt8/u;

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v0}, Ln8/e;->e(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    return-object v1

    :cond_3
    new-instance v1, Ln8/c;

    invoke-direct {v1, v0}, Ln8/c;-><init>(Ljava/lang/String;)V

    :cond_4
    :goto_1
    return-object v1
.end method


# virtual methods
.method protected g()Ljava/util/Collection;
    .locals 13

    .prologue
    iget-object v0, p0, Lb8/f$b;->e:Lb8/f;

    invoke-virtual {v0}, Lb8/f;->Y0()Le8/g;

    move-result-object v0

    invoke-interface {v0}, Le8/g;->u()Ljava/util/Collection;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p0}, Lb8/f$b;->r()LF8/E;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le8/j;

    iget-object v6, p0, Lb8/f$b;->e:Lb8/f;

    invoke-static {v6}, Lb8/f;->U0(Lb8/f;)La8/g;

    move-result-object v6

    invoke-virtual {v6}, La8/g;->g()Lc8/d;

    move-result-object v6

    sget-object v7, LF8/p0;->C:LF8/p0;

    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lc8/b;->b(LF8/p0;ZZLO7/f0;ILjava/lang/Object;)Lc8/a;

    move-result-object v7

    invoke-virtual {v6, v4, v7}, Lc8/d;->o(Le8/x;Lc8/a;)LF8/E;

    move-result-object v6

    iget-object v7, p0, Lb8/f$b;->e:Lb8/f;

    invoke-static {v7}, Lb8/f;->U0(Lb8/f;)La8/g;

    move-result-object v7

    invoke-virtual {v7}, La8/g;->a()La8/b;

    move-result-object v7

    invoke-virtual {v7}, La8/b;->r()Lf8/l;

    move-result-object v7

    iget-object v8, p0, Lb8/f$b;->e:Lb8/f;

    invoke-static {v8}, Lb8/f;->U0(Lb8/f;)La8/g;

    move-result-object v8

    invoke-virtual {v7, v6, v8}, Lf8/l;->h(LF8/E;La8/g;)LF8/E;

    move-result-object v6

    invoke-virtual {v6}, LF8/E;->W0()LF8/e0;

    move-result-object v7

    invoke-interface {v7}, LF8/e0;->w()LO7/h;

    move-result-object v7

    instance-of v7, v7, LO7/J$b;

    if-eqz v7, :cond_1

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {v6}, LF8/E;->W0()LF8/e0;

    move-result-object v4

    if-eqz v3, :cond_2

    invoke-virtual {v3}, LF8/E;->W0()LF8/e0;

    move-result-object v5

    :cond_2
    invoke-static {v4, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {v6}, LL7/g;->b0(LF8/E;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lb8/f$b;->e:Lb8/f;

    invoke-static {v0}, Lb8/f;->T0(Lb8/f;)LO7/e;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v4, p0, Lb8/f$b;->e:Lb8/f;

    invoke-static {v0, v4}, LN7/m;->a(LO7/e;LO7/e;)LF8/f0;

    move-result-object v4

    invoke-virtual {v4}, LF8/l0;->c()LF8/n0;

    move-result-object v4

    invoke-interface {v0}, LO7/e;->w()LF8/M;

    move-result-object v0

    sget-object v5, LF8/u0;->G:LF8/u0;

    invoke-virtual {v4, v0, v5}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object v5

    :cond_5
    invoke-static {v1, v5}, LP8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    invoke-static {v1, v3}, LP8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_7

    iget-object v0, p0, Lb8/f$b;->e:Lb8/f;

    invoke-static {v0}, Lb8/f;->U0(Lb8/f;)La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->c()LB8/r;

    move-result-object v0

    invoke-virtual {p0}, Lb8/f$b;->q()LO7/e;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le8/x;

    const-string v6, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType"

    invoke-static {v5, v6}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Le8/j;

    invoke-interface {v5}, Le8/j;->s()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-interface {v0, v3, v4}, LB8/r;->b(LO7/e;Ljava/util/List;)V

    :cond_7
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_8

    invoke-static {v1}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    :goto_2
    check-cast v0, Ljava/util/Collection;

    goto :goto_3

    :cond_8
    iget-object v0, p0, Lb8/f$b;->e:Lb8/f;

    invoke-static {v0}, Lb8/f;->U0(Lb8/f;)La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->d()LO7/G;

    move-result-object v0

    invoke-interface {v0}, LO7/G;->t()LL7/g;

    move-result-object v0

    invoke-virtual {v0}, LL7/g;->i()LF8/M;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_2

    :goto_3
    return-object v0
.end method

.method protected k()LO7/d0;
    .locals 1

    iget-object v0, p0, Lb8/f$b;->e:Lb8/f;

    invoke-static {v0}, Lb8/f;->U0(Lb8/f;)La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->v()LO7/d0;

    move-result-object v0

    return-object v0
.end method

.method public q()LO7/e;
    .locals 1

    iget-object v0, p0, Lb8/f$b;->e:Lb8/f;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lb8/f$b;->e:Lb8/f;

    invoke-virtual {v0}, LR7/a;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic w()LO7/h;
    .locals 1

    invoke-virtual {p0}, Lb8/f$b;->q()LO7/e;

    move-result-object v0

    return-object v0
.end method

.method public x()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lb8/f$b;->d:LE8/i;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public y()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
