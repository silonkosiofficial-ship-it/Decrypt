.class public final Lb8/g;
.super Lb8/j;
.source "SourceFile"


# instance fields
.field private final n:LO7/e;

.field private final o:Le8/g;

.field private final p:Z

.field private final q:LE8/i;

.field private final r:LE8/i;

.field private final s:LE8/i;

.field private final t:LE8/i;

.field private final u:LE8/h;


# direct methods
.method public constructor <init>(La8/g;LO7/e;Le8/g;ZLb8/g;)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownerDescriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jClass"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p5}, Lb8/j;-><init>(La8/g;Lb8/j;)V

    iput-object p2, p0, Lb8/g;->n:LO7/e;

    iput-object p3, p0, Lb8/g;->o:Le8/g;

    iput-boolean p4, p0, Lb8/g;->p:Z

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p2

    new-instance p3, Lb8/g$f;

    invoke-direct {p3, p0, p1}, Lb8/g$f;-><init>(Lb8/g;La8/g;)V

    invoke-interface {p2, p3}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, Lb8/g;->q:LE8/i;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p2

    new-instance p3, Lb8/g$j;

    invoke-direct {p3, p0}, Lb8/g$j;-><init>(Lb8/g;)V

    invoke-interface {p2, p3}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, Lb8/g;->r:LE8/i;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p2

    new-instance p3, Lb8/g$h;

    invoke-direct {p3, p1, p0}, Lb8/g$h;-><init>(La8/g;Lb8/g;)V

    invoke-interface {p2, p3}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, Lb8/g;->s:LE8/i;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p2

    new-instance p3, Lb8/g$g;

    invoke-direct {p3, p0}, Lb8/g$g;-><init>(Lb8/g;)V

    invoke-interface {p2, p3}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, Lb8/g;->t:LE8/i;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p2

    new-instance p3, Lb8/g$k;

    invoke-direct {p3, p0, p1}, Lb8/g$k;-><init>(Lb8/g;La8/g;)V

    invoke-interface {p2, p3}, LE8/n;->h(Lx7/l;)LE8/h;

    move-result-object p1

    iput-object p1, p0, Lb8/g;->u:LE8/h;

    return-void
.end method

.method public synthetic constructor <init>(La8/g;LO7/e;Le8/g;ZLb8/g;ILy7/k;)V
    .locals 6

    .prologue
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lb8/g;-><init>(La8/g;LO7/e;Le8/g;ZLb8/g;)V

    return-void
.end method

.method private final A0(Ln8/f;)Ljava/util/Set;
    .locals 5

    .prologue
    invoke-direct {p0}, Lb8/g;->c0()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/E;

    invoke-virtual {v2}, LF8/E;->u()Ly8/h;

    move-result-object v2

    sget-object v3, LW7/d;->Q:LW7/d;

    invoke-interface {v2, p1, v3}, Ly8/h;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO7/U;

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-static {v1, v3}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lj7/v;->Y0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method private final B0(LO7/Z;LO7/y;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, v0, v1, v2}, Lg8/y;->c(LO7/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2}, LO7/y;->a()LO7/y;

    move-result-object v4

    const-string v5, "getOriginal(...)"

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v0, v0, v1, v2}, Lg8/y;->c(LO7/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1, p2}, Lb8/g;->p0(LO7/a;LO7/a;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private final C0(LO7/Z;)Z
    .locals 5

    .prologue
    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LX7/F;->a(Ln8/f;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln8/f;

    invoke-direct {p0, v1}, Lb8/g;->A0(Ln8/f;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_2

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO7/U;

    new-instance v4, Lb8/g$i;

    invoke-direct {v4, p1, p0}, Lb8/g$i;-><init>(LO7/Z;Lb8/g;)V

    invoke-direct {p0, v3, v4}, Lb8/g;->o0(LO7/U;Lx7/l;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, LO7/k0;->t0()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v3

    invoke-virtual {v3}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v3

    const-string v4, "asString(...)"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, LX7/A;->d(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_4
    return v2

    :cond_5
    :goto_1
    invoke-direct {p0, p1}, Lb8/g;->q0(LO7/Z;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-direct {p0, p1}, Lb8/g;->L0(LO7/Z;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-direct {p0, p1}, Lb8/g;->s0(LO7/Z;)Z

    move-result p1

    if-nez p1, :cond_6

    const/4 v2, 0x1

    :cond_6
    return v2
.end method

.method private final D0(LO7/Z;Lx7/l;Ljava/util/Collection;)LO7/Z;
    .locals 2

    .prologue
    invoke-static {p1}, LX7/f;->k(LO7/y;)LO7/y;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0, p1, p2}, Lb8/g;->h0(LO7/y;Lx7/l;)LO7/Z;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-direct {p0, p2}, Lb8/g;->C0(LO7/Z;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move-object p2, v0

    :goto_0
    if-eqz p2, :cond_2

    invoke-direct {p0, p2, p1, p3}, Lb8/g;->g0(LO7/Z;LO7/a;Ljava/util/Collection;)LO7/Z;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method private final E0(LO7/Z;Lx7/l;Ln8/f;Ljava/util/Collection;)LO7/Z;
    .locals 3

    .prologue
    invoke-static {p1}, LX7/H;->d(LO7/b;)LO7/b;

    move-result-object p1

    check-cast p1, LO7/Z;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-static {p1}, LX7/H;->b(LO7/b;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v1}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v1

    const-string v2, "identifier(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7/Z;

    invoke-direct {p0, v1, p3}, Lb8/g;->m0(LO7/Z;Ln8/f;)LO7/Z;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lb8/g;->r0(LO7/Z;LO7/y;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-direct {p0, v1, p1, p4}, Lb8/g;->g0(LO7/Z;LO7/a;Ljava/util/Collection;)LO7/Z;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v0
.end method

.method private final F0(LO7/Z;Lx7/l;)LO7/Z;
    .locals 3

    .prologue
    invoke-interface {p1}, LO7/y;->y()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    const-string v2, "getName(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/Z;

    invoke-direct {p0, v0}, Lb8/g;->n0(LO7/Z;)LO7/Z;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-direct {p0, v0, p1}, Lb8/g;->p0(LO7/a;LO7/a;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    move-object v1, v0

    :cond_3
    return-object v1
.end method

.method private final H0(Le8/k;)LZ7/b;
    .locals 10

    .prologue
    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v0

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v1

    invoke-static {v1, p1}, La8/e;->a(La8/g;Le8/d;)LP7/g;

    move-result-object v1

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v2

    invoke-virtual {v2}, La8/g;->a()La8/b;

    move-result-object v2

    invoke-virtual {v2}, La8/b;->t()Ld8/b;

    move-result-object v2

    invoke-interface {v2, p1}, Ld8/b;->a(Le8/l;)Ld8/a;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2}, LZ7/b;->C1(LO7/e;LP7/g;ZLO7/a0;)LZ7/b;

    move-result-object v1

    const-string v2, "createJavaConstructor(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v2

    invoke-interface {v0}, LO7/e;->A()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v2, v1, p1, v4}, La8/a;->e(La8/g;LO7/m;Le8/z;I)La8/g;

    move-result-object v2

    invoke-interface {p1}, Le8/k;->n()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0, v2, v1, v4}, Lb8/j;->K(La8/g;LO7/y;Ljava/util/List;)Lb8/j$b;

    move-result-object v4

    invoke-interface {v0}, LO7/e;->A()Ljava/util/List;

    move-result-object v5

    const-string v6, "getDeclaredTypeParameters(...)"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/util/Collection;

    invoke-interface {p1}, Le8/z;->g()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v6, v8}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Le8/y;

    invoke-virtual {v2}, La8/g;->f()La8/k;

    move-result-object v9

    invoke-interface {v9, v8}, La8/k;->a(Le8/y;)LO7/f0;

    move-result-object v8

    invoke-static {v8}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v5, v7}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v4}, Lb8/j$b;->a()Ljava/util/List;

    move-result-object v6

    invoke-interface {p1}, Le8/s;->h()LO7/n0;

    move-result-object v7

    invoke-static {v7}, LX7/J;->d(LO7/n0;)LO7/u;

    move-result-object v7

    invoke-virtual {v1, v6, v7, v5}, LR7/f;->A1(Ljava/util/List;LO7/u;Ljava/util/List;)LR7/f;

    invoke-virtual {v1, v3}, LZ7/b;->h1(Z)V

    invoke-virtual {v4}, Lb8/j$b;->b()Z

    move-result v3

    invoke-virtual {v1, v3}, LZ7/b;->i1(Z)V

    invoke-interface {v0}, LO7/e;->w()LF8/M;

    move-result-object v0

    invoke-virtual {v1, v0}, LR7/p;->p1(LF8/E;)V

    invoke-virtual {v2}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->h()LY7/g;

    move-result-object v0

    invoke-interface {v0, p1, v1}, LY7/g;->a(Le8/l;LO7/l;)V

    return-object v1
.end method

.method private final I0(Le8/w;)LZ7/e;
    .locals 16

    move-object/from16 v0, p1

    invoke-virtual/range {p0 .. p0}, Lb8/j;->w()La8/g;

    move-result-object v1

    invoke-static {v1, v0}, La8/e;->a(La8/g;Le8/d;)LP7/g;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lb8/g;->z0()LO7/e;

    move-result-object v2

    invoke-interface/range {p1 .. p1}, Le8/t;->getName()Ln8/f;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lb8/j;->w()La8/g;

    move-result-object v4

    invoke-virtual {v4}, La8/g;->a()La8/b;

    move-result-object v4

    invoke-virtual {v4}, La8/b;->t()Ld8/b;

    move-result-object v4

    invoke-interface {v4, v0}, Ld8/b;->a(Le8/l;)Ld8/a;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v2, v1, v3, v4, v5}, LZ7/e;->y1(LO7/m;LP7/g;Ln8/f;LO7/a0;Z)LZ7/e;

    move-result-object v1

    const-string v2, "createJavaMethod(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LF8/p0;->D:LF8/p0;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lc8/b;->b(LF8/p0;ZZLO7/f0;ILjava/lang/Object;)Lc8/a;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lb8/j;->w()La8/g;

    move-result-object v3

    invoke-virtual {v3}, La8/g;->g()Lc8/d;

    move-result-object v3

    invoke-interface/range {p1 .. p1}, Le8/w;->getType()Le8/x;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Lc8/d;->o(Le8/x;Lc8/a;)LF8/E;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lb8/g;->z()LO7/X;

    move-result-object v8

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v9

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v10

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v11

    sget-object v2, LO7/D;->C:LO7/D$a;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v3, v5}, LO7/D$a;->a(ZZZ)LO7/D;

    move-result-object v13

    sget-object v14, LO7/t;->e:LO7/u;

    const/4 v15, 0x0

    const/4 v7, 0x0

    move-object v6, v1

    invoke-virtual/range {v6 .. v15}, LZ7/e;->x1(LO7/X;LO7/X;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LO7/D;LO7/u;Ljava/util/Map;)LR7/G;

    invoke-virtual {v1, v3, v3}, LZ7/e;->B1(ZZ)V

    invoke-virtual/range {p0 .. p0}, Lb8/j;->w()La8/g;

    move-result-object v2

    invoke-virtual {v2}, La8/g;->a()La8/b;

    move-result-object v2

    invoke-virtual {v2}, La8/b;->h()LY7/g;

    move-result-object v2

    invoke-interface {v2, v0, v1}, LY7/g;->b(Le8/q;LO7/Z;)V

    return-object v1
.end method

.method private final J0(Ln8/f;)Ljava/util/Collection;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lb8/j;->y()LE8/i;

    move-result-object v0

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb8/b;

    invoke-interface {v0, p1}, Lb8/b;->d(Ln8/f;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le8/r;

    invoke-virtual {p0, v1}, Lb8/j;->I(Le8/r;)LZ7/e;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final K0(Ln8/f;)Ljava/util/Collection;
    .locals 4

    .prologue
    invoke-direct {p0, p1}, Lb8/g;->y0(Ln8/f;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LO7/Z;

    invoke-static {v2}, LX7/H;->a(LO7/b;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v2}, LX7/f;->k(LO7/y;)LO7/y;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private final L0(LO7/Z;)Z
    .locals 4

    .prologue
    sget-object v0, LX7/f;->o:LX7/f;

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v1

    const-string v2, "getName(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LX7/f;->l(Ln8/f;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lb8/g;->y0(Ln8/f;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO7/Z;

    invoke-static {v3}, LX7/f;->k(LO7/y;)LO7/y;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/y;

    invoke-direct {p0, p1, v2}, Lb8/g;->B0(LO7/Z;LO7/y;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v1, 0x1

    :cond_5
    :goto_1
    return v1
.end method

.method public static final synthetic M(Lb8/g;)LO7/d;
    .locals 0

    invoke-direct {p0}, Lb8/g;->e0()LO7/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic N(Lb8/g;)LO7/d;
    .locals 0

    invoke-direct {p0}, Lb8/g;->f0()LO7/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic O(Lb8/g;)LE8/i;
    .locals 0

    iget-object p0, p0, Lb8/g;->t:LE8/i;

    return-object p0
.end method

.method public static final synthetic P(Lb8/g;)LE8/i;
    .locals 0

    iget-object p0, p0, Lb8/g;->s:LE8/i;

    return-object p0
.end method

.method public static final synthetic Q(Lb8/g;)Le8/g;
    .locals 0

    iget-object p0, p0, Lb8/g;->o:Le8/g;

    return-object p0
.end method

.method public static final synthetic R(Lb8/g;)LE8/i;
    .locals 0

    iget-object p0, p0, Lb8/g;->r:LE8/i;

    return-object p0
.end method

.method public static final synthetic S(Lb8/g;Le8/k;)LZ7/b;
    .locals 0

    invoke-direct {p0, p1}, Lb8/g;->H0(Le8/k;)LZ7/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic T(Lb8/g;Ln8/f;)Ljava/util/Collection;
    .locals 0

    invoke-direct {p0, p1}, Lb8/g;->J0(Ln8/f;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic U(Lb8/g;Ln8/f;)Ljava/util/Collection;
    .locals 0

    invoke-direct {p0, p1}, Lb8/g;->K0(Ln8/f;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private final V(Ljava/util/List;LO7/l;ILe8/r;LF8/E;LF8/E;)V
    .locals 13

    .prologue
    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v5

    invoke-interface/range {p4 .. p4}, Le8/t;->getName()Ln8/f;

    move-result-object v6

    invoke-static/range {p5 .. p5}, LF8/q0;->n(LF8/E;)LF8/E;

    move-result-object v7

    const-string v0, "makeNotNullable(...)"

    invoke-static {v7, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p4 .. p4}, Le8/r;->R()Z

    move-result v8

    if-eqz p6, :cond_0

    invoke-static/range {p6 .. p6}, LF8/q0;->n(LF8/E;)LF8/E;

    move-result-object v0

    :goto_0
    move-object v11, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->t()Ld8/b;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-interface {v0, v1}, Ld8/b;->a(Le8/l;)Ld8/a;

    move-result-object v12

    new-instance v0, LR7/L;

    const/4 v3, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, v0

    move-object v2, p2

    move/from16 v4, p3

    invoke-direct/range {v1 .. v12}, LR7/L;-><init>(LO7/a;LO7/j0;ILP7/g;Ln8/f;LF8/E;ZZZLF8/E;LO7/a0;)V

    move-object v1, p1

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private final W(Ljava/util/Collection;Ln8/f;Ljava/util/Collection;Z)V
    .locals 6

    .prologue
    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v3

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->c()LB8/r;

    move-result-object v4

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->k()LG8/l;

    move-result-object v0

    invoke-interface {v0}, LG8/l;->a()Lr8/l;

    move-result-object v5

    move-object v0, p2

    move-object v1, p3

    move-object v2, p1

    invoke-static/range {v0 .. v5}, LY7/a;->d(Ln8/f;Ljava/util/Collection;Ljava/util/Collection;LO7/e;LB8/r;Lr8/l;)Ljava/util/Collection;

    move-result-object p2

    const-string p3, "resolveOverridesForNonStaticMembers(...)"

    invoke-static {p2, p3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p4, :cond_0

    invoke-interface {p1, p2}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p1, p2}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p3

    new-instance p4, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p4, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/Z;

    invoke-static {v0}, LX7/H;->e(LO7/b;)LO7/b;

    move-result-object v1

    check-cast v1, LO7/Z;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, p3

    check-cast v2, Ljava/util/Collection;

    invoke-direct {p0, v0, v1, v2}, Lb8/g;->g0(LO7/Z;LO7/a;Ljava/util/Collection;)LO7/Z;

    move-result-object v0

    :goto_1
    invoke-interface {p4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {p1, p4}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    :goto_2
    return-void
.end method

.method private final X(Ln8/f;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lx7/l;)V
    .locals 2

    .prologue
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/Z;

    invoke-direct {p0, v0, p5, p1, p2}, Lb8/g;->E0(LO7/Z;Lx7/l;Ln8/f;Ljava/util/Collection;)LO7/Z;

    move-result-object v1

    invoke-static {p4, v1}, LP8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    invoke-direct {p0, v0, p5, p2}, Lb8/g;->D0(LO7/Z;Lx7/l;Ljava/util/Collection;)LO7/Z;

    move-result-object v1

    invoke-static {p4, v1}, LP8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    invoke-direct {p0, v0, p5}, Lb8/g;->F0(LO7/Z;Lx7/l;)LO7/Z;

    move-result-object v0

    invoke-static {p4, v0}, LP8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final Y(Ljava/util/Set;Ljava/util/Collection;Ljava/util/Set;Lx7/l;)V
    .locals 2

    .prologue
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/U;

    invoke-direct {p0, v0, p4}, Lb8/g;->i0(LO7/U;Lx7/l;)LZ7/f;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_1

    invoke-interface {p3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method private final Z(Ln8/f;Ljava/util/Collection;)V
    .locals 6

    .prologue
    invoke-virtual {p0}, Lb8/j;->y()LE8/i;

    move-result-object v0

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb8/b;

    invoke-interface {v0, p1}, Lb8/b;->d(Ln8/f;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->H0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Le8/r;

    if-nez v1, :cond_0

    return-void

    :cond_0
    sget-object v3, LO7/D;->D:LO7/D;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lb8/g;->k0(Lb8/g;Le8/r;LF8/E;LO7/D;ILjava/lang/Object;)LZ7/f;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private final c0()Ljava/util/Collection;
    .locals 2

    .prologue
    iget-boolean v0, p0, Lb8/g;->p:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v0

    invoke-interface {v0}, LO7/h;->p()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->u()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getSupertypes(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->k()LG8/l;

    move-result-object v0

    invoke-interface {v0}, LG8/l;->c()LG8/g;

    move-result-object v0

    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v1

    invoke-virtual {v0, v1}, LG8/g;->g(LO7/e;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method private final d0(LR7/f;)Ljava/util/List;
    .locals 12

    .prologue
    iget-object v0, p0, Lb8/g;->o:Le8/g;

    invoke-interface {v0}, Le8/g;->S()Ljava/util/Collection;

    move-result-object v0

    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v8, v1}, Ljava/util/ArrayList;-><init>(I)V

    sget-object v2, LF8/p0;->D:LF8/p0;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lc8/b;->b(LF8/p0;ZZLO7/f0;ILjava/lang/Object;)Lc8/a;

    move-result-object v9

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Le8/r;

    invoke-interface {v4}, Le8/t;->getName()Ln8/f;

    move-result-object v4

    sget-object v5, LX7/B;->c:Ln8/f;

    invoke-static {v4, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Li7/u;

    invoke-direct {v0, v1, v2}, Li7/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v0}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    invoke-static {v1}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Le8/r;

    const/4 v11, 0x1

    if-eqz v10, :cond_3

    invoke-interface {v10}, Le8/r;->l()Le8/x;

    move-result-object v1

    instance-of v2, v1, Le8/f;

    if-eqz v2, :cond_2

    new-instance v2, Li7/u;

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v3

    invoke-virtual {v3}, La8/g;->g()Lc8/d;

    move-result-object v3

    check-cast v1, Le8/f;

    invoke-virtual {v3, v1, v9, v11}, Lc8/d;->k(Le8/f;Lc8/a;Z)LF8/E;

    move-result-object v3

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v4

    invoke-virtual {v4}, La8/g;->g()Lc8/d;

    move-result-object v4

    invoke-interface {v1}, Le8/f;->p()Le8/x;

    move-result-object v1

    invoke-virtual {v4, v1, v9}, Lc8/d;->o(Le8/x;Lc8/a;)LF8/E;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Li7/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-instance v2, Li7/u;

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v3

    invoke-virtual {v3}, La8/g;->g()Lc8/d;

    move-result-object v3

    invoke-virtual {v3, v1, v9}, Lc8/d;->o(Le8/x;Lc8/a;)LF8/E;

    move-result-object v1

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Li7/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {v2}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, LF8/E;

    invoke-virtual {v2}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, LF8/E;

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, v8

    move-object v3, p1

    move-object v5, v10

    invoke-direct/range {v1 .. v7}, Lb8/g;->V(Ljava/util/List;LO7/l;ILe8/r;LF8/E;LF8/E;)V

    :cond_3
    const/4 v1, 0x0

    if-eqz v10, :cond_4

    goto :goto_2

    :cond_4
    move v11, v1

    :goto_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    add-int/lit8 v10, v1, 0x1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Le8/r;

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v2

    invoke-virtual {v2}, La8/g;->g()Lc8/d;

    move-result-object v2

    invoke-interface {v5}, Le8/r;->l()Le8/x;

    move-result-object v3

    invoke-virtual {v2, v3, v9}, Lc8/d;->o(Le8/x;Lc8/a;)LF8/E;

    move-result-object v6

    add-int v4, v1, v11

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, v8

    move-object v3, p1

    invoke-direct/range {v1 .. v7}, Lb8/g;->V(Ljava/util/List;LO7/l;ILe8/r;LF8/E;LF8/E;)V

    move v1, v10

    goto :goto_3

    :cond_5
    return-object v8
.end method

.method private final e0()LO7/d;
    .locals 5

    .prologue
    iget-object v0, p0, Lb8/g;->o:Le8/g;

    invoke-interface {v0}, Le8/g;->t()Z

    move-result v0

    iget-object v1, p0, Lb8/g;->o:Le8/g;

    invoke-interface {v1}, Le8/g;->M()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lb8/g;->o:Le8/g;

    invoke-interface {v1}, Le8/g;->y()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v1

    sget-object v2, LP7/g;->d:LP7/g$a;

    invoke-virtual {v2}, LP7/g$a;->b()LP7/g;

    move-result-object v2

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v3

    invoke-virtual {v3}, La8/g;->a()La8/b;

    move-result-object v3

    invoke-virtual {v3}, La8/b;->t()Ld8/b;

    move-result-object v3

    iget-object v4, p0, Lb8/g;->o:Le8/g;

    invoke-interface {v3, v4}, Ld8/b;->a(Le8/l;)Ld8/a;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v1, v2, v4, v3}, LZ7/b;->C1(LO7/e;LP7/g;ZLO7/a0;)LZ7/b;

    move-result-object v2

    const-string v3, "createJavaConstructor(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_2

    invoke-direct {p0, v2}, Lb8/g;->d0(LR7/f;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_0
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, LZ7/b;->i1(Z)V

    invoke-direct {p0, v1}, Lb8/g;->w0(LO7/e;)LO7/u;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, LR7/f;->z1(Ljava/util/List;LO7/u;)LR7/f;

    invoke-virtual {v2, v4}, LZ7/b;->h1(Z)V

    invoke-interface {v1}, LO7/e;->w()LF8/M;

    move-result-object v0

    invoke-virtual {v2, v0}, LR7/p;->p1(LF8/E;)V

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->h()LY7/g;

    move-result-object v0

    iget-object v1, p0, Lb8/g;->o:Le8/g;

    invoke-interface {v0, v1, v2}, LY7/g;->a(Le8/l;LO7/l;)V

    return-object v2
.end method

.method private final f0()LO7/d;
    .locals 5

    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v0

    sget-object v1, LP7/g;->d:LP7/g$a;

    invoke-virtual {v1}, LP7/g$a;->b()LP7/g;

    move-result-object v1

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v2

    invoke-virtual {v2}, La8/g;->a()La8/b;

    move-result-object v2

    invoke-virtual {v2}, La8/b;->t()Ld8/b;

    move-result-object v2

    iget-object v3, p0, Lb8/g;->o:Le8/g;

    invoke-interface {v2, v3}, Ld8/b;->a(Le8/l;)Ld8/a;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, LZ7/b;->C1(LO7/e;LP7/g;ZLO7/a0;)LZ7/b;

    move-result-object v1

    const-string v2, "createJavaConstructor(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lb8/g;->l0(LR7/f;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, LZ7/b;->i1(Z)V

    invoke-direct {p0, v0}, Lb8/g;->w0(LO7/e;)LO7/u;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, LR7/f;->z1(Ljava/util/List;LO7/u;)LR7/f;

    invoke-virtual {v1, v3}, LZ7/b;->h1(Z)V

    invoke-interface {v0}, LO7/e;->w()LF8/M;

    move-result-object v0

    invoke-virtual {v1, v0}, LR7/p;->p1(LF8/E;)V

    return-object v1
.end method

.method private final g0(LO7/Z;LO7/a;Ljava/util/Collection;)LO7/Z;
    .locals 2

    .prologue
    check-cast p3, Ljava/lang/Iterable;

    instance-of v0, p3, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/Z;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, LO7/y;->l0()LO7/y;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-direct {p0, v0, p2}, Lb8/g;->p0(LO7/a;LO7/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, LO7/Z;->z()LO7/y$a;

    move-result-object p1

    invoke-interface {p1}, LO7/y$a;->A()LO7/y$a;

    move-result-object p1

    invoke-interface {p1}, LO7/y$a;->i()LO7/y;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p1, LO7/Z;

    :cond_2
    :goto_0
    return-object p1
.end method

.method private final h0(LO7/y;Lx7/l;)LO7/Z;
    .locals 5

    .prologue
    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LO7/Z;

    invoke-direct {p0, v2, p1}, Lb8/g;->B0(LO7/Z;LO7/y;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, LO7/Z;

    if-eqz v0, :cond_3

    invoke-interface {v0}, LO7/Z;->z()LO7/y$a;

    move-result-object p2

    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object v1

    const-string v2, "getValueParameters(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO7/j0;

    invoke-interface {v4}, LO7/i0;->getType()LF8/E;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-interface {v0}, LO7/a;->n()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    invoke-static {v3, v0, p1}, LZ7/h;->a(Ljava/util/Collection;Ljava/util/Collection;LO7/a;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, p1}, LO7/y$a;->m(Ljava/util/List;)LO7/y$a;

    invoke-interface {p2}, LO7/y$a;->C()LO7/y$a;

    invoke-interface {p2}, LO7/y$a;->n()LO7/y$a;

    sget-object p1, LZ7/e;->j0:LO7/a$a;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1, v0}, LO7/y$a;->t(LO7/a$a;Ljava/lang/Object;)LO7/y$a;

    invoke-interface {p2}, LO7/y$a;->i()LO7/y;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LO7/Z;

    :cond_3
    return-object v1
.end method

.method private final i0(LO7/U;Lx7/l;)LZ7/f;
    .locals 11

    .prologue
    invoke-direct {p0, p1, p2}, Lb8/g;->o0(LO7/U;Lx7/l;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-direct {p0, p1, p2}, Lb8/g;->u0(LO7/U;Lx7/l;)LO7/Z;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1}, LO7/k0;->t0()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-direct {p0, p1, p2}, Lb8/g;->v0(LO7/U;Lx7/l;)LO7/Z;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    invoke-interface {p2}, LO7/C;->q()LO7/D;

    invoke-interface {v0}, LO7/C;->q()LO7/D;

    :cond_2
    new-instance v10, LZ7/d;

    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v2

    invoke-direct {v10, v2, v0, p2, p1}, LZ7/d;-><init>(LO7/e;LO7/Z;LO7/Z;LO7/U;)V

    invoke-interface {v0}, LO7/a;->l()LF8/E;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0}, Lb8/g;->z()LO7/X;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v7

    move-object v2, v10

    invoke-virtual/range {v2 .. v7}, LR7/C;->k1(LF8/E;Ljava/util/List;LO7/X;LO7/X;Ljava/util/List;)V

    invoke-interface {v0}, LP7/a;->k()LP7/g;

    move-result-object v3

    const/4 v6, 0x0

    invoke-interface {v0}, LO7/p;->o()LO7/a0;

    move-result-object v7

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lr8/e;->k(LO7/U;LP7/g;ZZZLO7/a0;)LR7/D;

    move-result-object p1

    invoke-virtual {p1, v0}, LR7/B;->V0(LO7/y;)V

    invoke-virtual {v10}, LR7/M;->getType()LF8/E;

    move-result-object v0

    invoke-virtual {p1, v0}, LR7/D;->Y0(LF8/E;)V

    const-string v0, "apply(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_4

    invoke-interface {p2}, LO7/a;->n()Ljava/util/List;

    move-result-object v0

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/j0;

    if-eqz v0, :cond_3

    invoke-interface {p2}, LP7/a;->k()LP7/g;

    move-result-object v3

    invoke-interface {v0}, LP7/a;->k()LP7/g;

    move-result-object v4

    invoke-interface {p2}, LO7/C;->h()LO7/u;

    move-result-object v8

    invoke-interface {p2}, LO7/p;->o()LO7/a0;

    move-result-object v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v10

    invoke-static/range {v2 .. v9}, Lr8/e;->m(LO7/U;LP7/g;LP7/g;ZZZLO7/u;LO7/a0;)LR7/E;

    move-result-object v1

    invoke-virtual {v1, p2}, LR7/B;->V0(LO7/y;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No parameter found for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_4
    :goto_1
    invoke-virtual {v10, p1, v1}, LR7/C;->d1(LR7/D;LO7/W;)V

    return-object v10
.end method

.method private final j0(Le8/r;LF8/E;LO7/D;)LZ7/f;
    .locals 15

    .prologue
    move-object/from16 v6, p1

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-static {v0, v6}, La8/e;->a(La8/g;Le8/d;)LP7/g;

    move-result-object v8

    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v7

    invoke-interface/range {p1 .. p1}, Le8/s;->h()LO7/n0;

    move-result-object v0

    invoke-static {v0}, LX7/J;->d(LO7/n0;)LO7/u;

    move-result-object v10

    invoke-interface/range {p1 .. p1}, Le8/t;->getName()Ln8/f;

    move-result-object v12

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->t()Ld8/b;

    move-result-object v0

    invoke-interface {v0, v6}, Ld8/b;->a(Le8/l;)Ld8/a;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v11, 0x0

    move-object/from16 v9, p3

    invoke-static/range {v7 .. v14}, LZ7/f;->o1(LO7/m;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/a0;Z)LZ7/f;

    move-result-object v7

    const-string v0, "create(...)"

    invoke-static {v7, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v0

    invoke-static {v7, v0}, Lr8/e;->d(LO7/U;LP7/g;)LR7/D;

    move-result-object v8

    const-string v0, "createDefaultGetter(...)"

    invoke-static {v8, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {v7, v8, v0}, LR7/C;->d1(LR7/D;LO7/W;)V

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, v7

    move-object/from16 v2, p1

    invoke-static/range {v0 .. v5}, La8/a;->f(La8/g;LO7/m;Le8/z;IILjava/lang/Object;)La8/g;

    move-result-object v0

    move-object v9, p0

    invoke-virtual {p0, v6, v0}, Lb8/j;->q(Le8/r;La8/g;)LF8/E;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object v9, p0

    move-object/from16 v6, p2

    :goto_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lb8/g;->z()LO7/X;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v5

    move-object v0, v7

    move-object v1, v6

    invoke-virtual/range {v0 .. v5}, LR7/C;->k1(LF8/E;Ljava/util/List;LO7/X;LO7/X;Ljava/util/List;)V

    invoke-virtual {v8, v6}, LR7/D;->Y0(LF8/E;)V

    return-object v7
.end method

.method static synthetic k0(Lb8/g;Le8/r;LF8/E;LO7/D;ILjava/lang/Object;)LZ7/f;
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lb8/g;->j0(Le8/r;LF8/E;LO7/D;)LZ7/f;

    move-result-object p0

    return-object p0
.end method

.method private final l0(LR7/f;)Ljava/util/List;
    .locals 19

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Lb8/g;->o:Le8/g;

    invoke-interface {v1}, Le8/g;->i()Ljava/util/Collection;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    sget-object v4, LF8/p0;->D:LF8/p0;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lc8/b;->b(LF8/p0;ZZLO7/f0;ILjava/lang/Object;)Lc8/a;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v4, 0x0

    :goto_0
    move v8, v4

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    add-int/lit8 v4, v8, 0x1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le8/w;

    invoke-virtual/range {p0 .. p0}, Lb8/j;->w()La8/g;

    move-result-object v6

    invoke-virtual {v6}, La8/g;->g()Lc8/d;

    move-result-object v6

    invoke-interface {v5}, Le8/w;->getType()Le8/x;

    move-result-object v7

    invoke-virtual {v6, v7, v3}, Lc8/d;->o(Le8/x;Lc8/a;)LF8/E;

    move-result-object v11

    invoke-interface {v5}, Le8/w;->m()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual/range {p0 .. p0}, Lb8/j;->w()La8/g;

    move-result-object v6

    invoke-virtual {v6}, La8/g;->a()La8/b;

    move-result-object v6

    invoke-virtual {v6}, La8/b;->m()LO7/G;

    move-result-object v6

    invoke-interface {v6}, LO7/G;->t()LL7/g;

    move-result-object v6

    invoke-virtual {v6, v11}, LL7/g;->k(LF8/E;)LF8/E;

    move-result-object v6

    :goto_1
    move-object v15, v6

    goto :goto_2

    :cond_0
    const/4 v6, 0x0

    goto :goto_1

    :goto_2
    new-instance v14, LR7/L;

    sget-object v6, LP7/g;->d:LP7/g$a;

    invoke-virtual {v6}, LP7/g$a;->b()LP7/g;

    move-result-object v9

    invoke-interface {v5}, Le8/t;->getName()Ln8/f;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lb8/j;->w()La8/g;

    move-result-object v6

    invoke-virtual {v6}, La8/g;->a()La8/b;

    move-result-object v6

    invoke-virtual {v6}, La8/b;->t()Ld8/b;

    move-result-object v6

    invoke-interface {v6, v5}, Ld8/b;->a(Le8/l;)Ld8/a;

    move-result-object v16

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    move-object v5, v14

    move-object/from16 v6, p1

    move-object/from16 v18, v14

    move/from16 v14, v17

    invoke-direct/range {v5 .. v16}, LR7/L;-><init>(LO7/a;LO7/j0;ILP7/g;Ln8/f;LF8/E;ZZZLF8/E;LO7/a0;)V

    move-object/from16 v5, v18

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method private final m0(LO7/Z;Ln8/f;)LO7/Z;
    .locals 0

    invoke-interface {p1}, LO7/Z;->z()LO7/y$a;

    move-result-object p1

    invoke-interface {p1, p2}, LO7/y$a;->s(Ln8/f;)LO7/y$a;

    invoke-interface {p1}, LO7/y$a;->C()LO7/y$a;

    invoke-interface {p1}, LO7/y$a;->n()LO7/y$a;

    invoke-interface {p1}, LO7/y$a;->i()LO7/y;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p1, LO7/Z;

    return-object p1
.end method

.method private final n0(LO7/Z;)LO7/Z;
    .locals 5

    .prologue
    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object v0

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/j0;

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    invoke-interface {v0}, LO7/i0;->getType()LF8/E;

    move-result-object v3

    invoke-virtual {v3}, LF8/E;->W0()LF8/e0;

    move-result-object v3

    invoke-interface {v3}, LF8/e0;->w()LO7/h;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v3}, Lv8/c;->m(LO7/m;)Ln8/d;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ln8/d;->f()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ln8/d;->l()Ln8/c;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v2

    :goto_1
    sget-object v4, LL7/j;->t:Ln8/c;

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v2

    :goto_2
    if-nez v0, :cond_3

    goto :goto_4

    :cond_3
    invoke-interface {p1}, LO7/Z;->z()LO7/y$a;

    move-result-object v2

    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lj7/v;->d0(Ljava/util/List;I)Ljava/util/List;

    move-result-object p1

    invoke-interface {v2, p1}, LO7/y$a;->m(Ljava/util/List;)LO7/y$a;

    move-result-object p1

    invoke-interface {v0}, LO7/i0;->getType()LF8/E;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/i0;

    invoke-interface {v0}, LF8/i0;->getType()LF8/E;

    move-result-object v0

    invoke-interface {p1, v0}, LO7/y$a;->q(LF8/E;)LO7/y$a;

    move-result-object p1

    invoke-interface {p1}, LO7/y$a;->i()LO7/y;

    move-result-object p1

    check-cast p1, LO7/Z;

    move-object v0, p1

    check-cast v0, LR7/G;

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v0, v1}, LR7/p;->q1(Z)V

    :goto_3
    return-object p1

    :cond_5
    :goto_4
    return-object v2
.end method

.method private final o0(LO7/U;Lx7/l;)Z
    .locals 3

    .prologue
    invoke-static {p1}, Lb8/c;->a(LO7/U;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, p1, p2}, Lb8/g;->u0(LO7/U;Lx7/l;)LO7/Z;

    move-result-object v0

    invoke-direct {p0, p1, p2}, Lb8/g;->v0(LO7/U;Lx7/l;)LO7/Z;

    move-result-object p2

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-interface {p1}, LO7/k0;->t0()Z

    move-result p1

    const/4 v2, 0x1

    if-nez p1, :cond_2

    return v2

    :cond_2
    if-eqz p2, :cond_3

    invoke-interface {p2}, LO7/C;->q()LO7/D;

    move-result-object p1

    invoke-interface {v0}, LO7/C;->q()LO7/D;

    move-result-object p2

    if-ne p1, p2, :cond_3

    move v1, v2

    :cond_3
    return v1
.end method

.method private final p0(LO7/a;LO7/a;)Z
    .locals 3

    .prologue
    sget-object v0, Lr8/l;->f:Lr8/l;

    const/4 v1, 0x1

    invoke-virtual {v0, p2, p1, v1}, Lr8/l;->F(LO7/a;LO7/a;Z)Lr8/l$i;

    move-result-object v0

    invoke-virtual {v0}, Lr8/l$i;->c()Lr8/l$i$a;

    move-result-object v0

    const-string v2, "getResult(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lr8/l$i$a;->C:Lr8/l$i$a;

    if-ne v0, v2, :cond_0

    sget-object v0, LX7/t;->a:LX7/t$a;

    invoke-virtual {v0, p2, p1}, LX7/t$a;->a(LO7/a;LO7/a;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private final q0(LO7/Z;)Z
    .locals 6

    .prologue
    sget-object v0, LX7/I;->a:LX7/I$a;

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v1

    const-string v2, "getName(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LX7/I$a;->b(Ln8/f;)Ln8/f;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, v0}, Lb8/g;->y0(Ln8/f;)Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LO7/Z;

    invoke-static {v5}, LX7/H;->a(LO7/b;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    return v1

    :cond_3
    invoke-direct {p0, p1, v0}, Lb8/g;->m0(LO7/Z;Ln8/f;)LO7/Z;

    move-result-object p1

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/Z;

    invoke-direct {p0, v2, p1}, Lb8/g;->r0(LO7/Z;LO7/y;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v1, 0x1

    :cond_6
    :goto_1
    return v1
.end method

.method private final r0(LO7/Z;LO7/y;)Z
    .locals 1

    .prologue
    sget-object v0, LX7/e;->o:LX7/e;

    invoke-virtual {v0, p1}, LX7/e;->k(LO7/Z;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, LO7/y;->a()LO7/y;

    move-result-object p2

    :cond_0
    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, p2, p1}, Lb8/g;->p0(LO7/a;LO7/a;)Z

    move-result p1

    return p1
.end method

.method private final s0(LO7/Z;)Z
    .locals 4

    .prologue
    invoke-direct {p0, p1}, Lb8/g;->n0(LO7/Z;)LO7/Z;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object p1

    const-string v2, "getName(...)"

    invoke-static {p1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lb8/g;->y0(Ln8/f;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v2, p1, Ljava/util/Collection;

    if-eqz v2, :cond_1

    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/Z;

    invoke-interface {v2}, LO7/y;->y()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-direct {p0, v0, v2}, Lb8/g;->p0(LO7/a;LO7/a;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v1, 0x1

    :cond_3
    :goto_0
    return v1
.end method

.method private final t0(LO7/U;Ljava/lang/String;Lx7/l;)LO7/Z;
    .locals 4

    .prologue
    invoke-static {p2}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p2

    const-string v0, "identifier(...)"

    invoke-static {p2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, p2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LO7/Z;

    invoke-interface {p3}, LO7/a;->n()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    sget-object v1, LG8/e;->a:LG8/e;

    invoke-interface {p3}, LO7/a;->l()LF8/E;

    move-result-object v2

    if-nez v2, :cond_2

    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    invoke-interface {p1}, LO7/i0;->getType()LF8/E;

    move-result-object v3

    invoke-interface {v1, v2, v3}, LG8/e;->d(LF8/E;LF8/E;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_3

    move-object v0, p3

    :cond_3
    :goto_1
    if-eqz v0, :cond_0

    :cond_4
    return-object v0
.end method

.method private final u0(LO7/U;Lx7/l;)LO7/Z;
    .locals 3

    .prologue
    invoke-interface {p1}, LO7/U;->d()LO7/V;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, LX7/H;->d(LO7/b;)LO7/b;

    move-result-object v0

    check-cast v0, LO7/V;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    sget-object v1, LX7/i;->a:LX7/i;

    invoke-virtual {v1, v0}, LX7/i;->a(LO7/b;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v2

    invoke-static {v2, v0}, LX7/H;->f(LO7/e;LO7/a;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0, p1, v1, p2}, Lb8/g;->t0(LO7/U;Ljava/lang/String;Lx7/l;)LO7/Z;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LX7/A;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lb8/g;->t0(LO7/U;Ljava/lang/String;Lx7/l;)LO7/Z;

    move-result-object p1

    return-object p1
.end method

.method private final v0(LO7/U;Lx7/l;)LO7/Z;
    .locals 5

    .prologue
    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LX7/A;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    const-string v1, "identifier(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/Z;

    invoke-interface {v0}, LO7/a;->n()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, LO7/a;->l()LF8/E;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v2}, LL7/g;->C0(LF8/E;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    sget-object v2, LG8/e;->a:LG8/e;

    invoke-interface {v0}, LO7/a;->n()Ljava/util/List;

    move-result-object v3

    const-string v4, "getValueParameters(...)"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO7/j0;

    invoke-interface {v3}, LO7/i0;->getType()LF8/E;

    move-result-object v3

    invoke-interface {p1}, LO7/i0;->getType()LF8/E;

    move-result-object v4

    invoke-interface {v2, v3, v4}, LG8/e;->b(LF8/E;LF8/E;)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object v1, v0

    :cond_4
    :goto_0
    if-eqz v1, :cond_0

    :cond_5
    return-object v1
.end method

.method private final w0(LO7/e;)LO7/u;
    .locals 1

    .prologue
    invoke-interface {p1}, LO7/e;->h()LO7/u;

    move-result-object p1

    const-string v0, "getVisibility(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LX7/s;->b:LO7/u;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LX7/s;->c:LO7/u;

    const-string v0, "PROTECTED_AND_PACKAGE"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method private final y0(Ln8/f;)Ljava/util/Set;
    .locals 4

    .prologue
    invoke-direct {p0}, Lb8/g;->c0()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/E;

    invoke-virtual {v2}, LF8/E;->u()Ly8/h;

    move-result-object v2

    sget-object v3, LW7/d;->Q:LW7/d;

    invoke-interface {v2, p1, v3}, Ly8/h;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method


# virtual methods
.method public bridge synthetic C()LO7/m;
    .locals 1

    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v0

    return-object v0
.end method

.method protected G(LZ7/e;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb8/g;->o:Le8/g;

    invoke-interface {v0}, Le8/g;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-direct {p0, p1}, Lb8/g;->C0(LO7/Z;)Z

    move-result p1

    return p1
.end method

.method public G0(Ln8/f;LW7/b;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->l()LW7/c;

    move-result-object v0

    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v1

    invoke-static {v0, p2, v1, p1}, LV7/a;->a(LW7/c;LW7/b;LO7/e;Ln8/f;)V

    return-void
.end method

.method protected H(Le8/r;Ljava/util/List;LF8/E;Ljava/util/List;)Lb8/j$a;
    .locals 8

    const-string v0, "method"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "methodTypeParameters"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "returnType"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueParameters"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->s()LY7/j;

    move-result-object v1

    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v3

    const/4 v5, 0x0

    move-object v2, p1

    move-object v4, p3

    move-object v6, p4

    move-object v7, p2

    invoke-interface/range {v1 .. v7}, LY7/j;->b(Le8/r;LO7/e;LF8/E;LF8/E;Ljava/util/List;Ljava/util/List;)LY7/j$b;

    move-result-object p1

    const-string p2, "resolvePropagatedSignature(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lb8/j$a;

    invoke-virtual {p1}, LY7/j$b;->d()LF8/E;

    move-result-object v1

    const-string p3, "getReturnType(...)"

    invoke-static {v1, p3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LY7/j$b;->c()LF8/E;

    move-result-object v2

    invoke-virtual {p1}, LY7/j$b;->f()Ljava/util/List;

    move-result-object v3

    const-string p3, "getValueParameters(...)"

    invoke-static {v3, p3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LY7/j$b;->e()Ljava/util/List;

    move-result-object v4

    const-string p3, "getTypeParameters(...)"

    invoke-static {v4, p3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LY7/j$b;->g()Z

    move-result v5

    invoke-virtual {p1}, LY7/j$b;->b()Ljava/util/List;

    move-result-object v6

    const-string p1, "getErrors(...)"

    invoke-static {v6, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    invoke-direct/range {v0 .. v6}, Lb8/j$a;-><init>(LF8/E;LF8/E;Ljava/util/List;Ljava/util/List;ZLjava/util/List;)V

    return-object p2
.end method

.method protected a0(Ly8/d;Lx7/l;)Ljava/util/LinkedHashSet;
    .locals 3

    .prologue
    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v0

    invoke-interface {v0}, LO7/h;->p()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->u()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getSupertypes(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/E;

    invoke-virtual {v2}, LF8/E;->u()Ly8/h;

    move-result-object v2

    invoke-interface {v2}, Ly8/h;->a()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lb8/j;->y()LE8/i;

    move-result-object v0

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb8/b;

    invoke-interface {v0}, Lb8/b;->a()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lb8/j;->y()LE8/i;

    move-result-object v0

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb8/b;

    invoke-interface {v0}, Lb8/b;->e()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0, p1, p2}, Lb8/g;->l(Ly8/d;Lx7/l;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object p1

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object p2

    invoke-virtual {p2}, La8/g;->a()La8/b;

    move-result-object p2

    invoke-virtual {p2}, La8/b;->w()Lw8/f;

    move-result-object p2

    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v0

    invoke-interface {p2, p1, v0}, Lw8/f;->f(La8/g;LO7/e;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    return-object v1
.end method

.method public b(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lb8/g;->G0(Ln8/f;LW7/b;)V

    invoke-super {p0, p1, p2}, Lb8/j;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method protected b0()Lb8/a;
    .locals 3

    new-instance v0, Lb8/a;

    iget-object v1, p0, Lb8/g;->o:Le8/g;

    sget-object v2, Lb8/g$a;->D:Lb8/g$a;

    invoke-direct {v0, v1, v2}, Lb8/a;-><init>(Le8/g;Lx7/l;)V

    return-object v0
.end method

.method public c(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lb8/g;->G0(Ln8/f;LW7/b;)V

    invoke-super {p0, p1, p2}, Lb8/j;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public g(Ln8/f;LW7/b;)LO7/h;
    .locals 1

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lb8/g;->G0(Ln8/f;LW7/b;)V

    invoke-virtual {p0}, Lb8/j;->B()Lb8/j;

    move-result-object p2

    check-cast p2, Lb8/g;

    if-eqz p2, :cond_0

    iget-object p2, p2, Lb8/g;->u:LE8/h;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LO7/e;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lb8/g;->u:LE8/h;

    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    check-cast p2, LO7/h;

    :goto_0
    return-object p2
.end method

.method protected l(Ly8/d;Lx7/l;)Ljava/util/Set;
    .locals 0

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lb8/g;->r:LE8/i;

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    iget-object p2, p0, Lb8/g;->t:LE8/i;

    invoke-interface {p2}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p1, p2}, Lj7/Z;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic n(Ly8/d;Lx7/l;)Ljava/util/Set;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lb8/g;->a0(Ly8/d;Lx7/l;)Ljava/util/LinkedHashSet;

    move-result-object p1

    return-object p1
.end method

.method protected o(Ljava/util/Collection;Ln8/f;)V
    .locals 3

    .prologue
    const-string v0, "result"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb8/g;->o:Le8/g;

    invoke-interface {v0}, Le8/g;->w()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lb8/j;->y()LE8/i;

    move-result-object v0

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb8/b;

    invoke-interface {v0, p2}, Lb8/b;->b(Ln8/f;)Le8/w;

    move-result-object v0

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7/Z;

    invoke-interface {v1}, LO7/a;->n()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lb8/j;->y()LE8/i;

    move-result-object v0

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb8/b;

    invoke-interface {v0, p2}, Lb8/b;->b(Ln8/f;)Le8/w;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lb8/g;->I0(Le8/w;)LZ7/e;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v1

    invoke-virtual {v1}, La8/g;->a()La8/b;

    move-result-object v1

    invoke-virtual {v1}, La8/b;->w()Lw8/f;

    move-result-object v1

    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v2

    invoke-interface {v1, v0, v2, p2, p1}, Lw8/f;->a(La8/g;LO7/e;Ln8/f;Ljava/util/Collection;)V

    return-void
.end method

.method public bridge synthetic p()Lb8/b;
    .locals 1

    invoke-virtual {p0}, Lb8/g;->b0()Lb8/a;

    move-result-object v0

    return-object v0
.end method

.method protected r(Ljava/util/Collection;Ln8/f;)V
    .locals 9

    .prologue
    const-string v0, "result"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lb8/g;->y0(Ln8/f;)Ljava/util/Set;

    move-result-object v6

    sget-object v0, LX7/I;->a:LX7/I$a;

    invoke-virtual {v0, p2}, LX7/I$a;->k(Ln8/f;)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, LX7/f;->o:LX7/f;

    invoke-virtual {v0, p2}, LX7/f;->l(Ln8/f;)Z

    move-result v0

    if-nez v0, :cond_5

    move-object v0, v6

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/y;

    invoke-interface {v2}, LO7/y;->y()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_2
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LO7/Z;

    invoke-direct {p0, v3}, Lb8/g;->C0(LO7/Z;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v1, v0}, Lb8/g;->W(Ljava/util/Collection;Ln8/f;Ljava/util/Collection;Z)V

    return-void

    :cond_5
    :goto_2
    sget-object v0, LP8/g;->E:LP8/g$b;

    invoke-virtual {v0}, LP8/g$b;->a()LP8/g;

    move-result-object v7

    move-object v1, v6

    check-cast v1, Ljava/util/Collection;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v3

    sget-object v4, LB8/r;->a:LB8/r;

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->k()LG8/l;

    move-result-object v0

    invoke-interface {v0}, LG8/l;->a()Lr8/l;

    move-result-object v5

    move-object v0, p2

    invoke-static/range {v0 .. v5}, LY7/a;->d(Ln8/f;Ljava/util/Collection;Ljava/util/Collection;LO7/e;LB8/r;Lr8/l;)Ljava/util/Collection;

    move-result-object v8

    const-string v0, "resolveOverridesForNonStaticMembers(...)"

    invoke-static {v8, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lb8/g$b;

    invoke-direct {v5, p0}, Lb8/g$b;-><init>(Ljava/lang/Object;)V

    move-object v0, p0

    move-object v1, p2

    move-object v2, p1

    move-object v3, v8

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lb8/g;->X(Ln8/f;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lx7/l;)V

    new-instance v5, Lb8/g$c;

    invoke-direct {v5, p0}, Lb8/g$c;-><init>(Ljava/lang/Object;)V

    move-object v4, v7

    invoke-direct/range {v0 .. v5}, Lb8/g;->X(Ln8/f;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lx7/l;)V

    check-cast v6, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LO7/Z;

    invoke-direct {p0, v3}, Lb8/g;->C0(LO7/Z;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-static {v0, v7}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x1

    invoke-direct {p0, p1, p2, v0, v1}, Lb8/g;->W(Ljava/util/Collection;Ln8/f;Ljava/util/Collection;Z)V

    return-void
.end method

.method protected s(Ln8/f;Ljava/util/Collection;)V
    .locals 7

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb8/g;->o:Le8/g;

    invoke-interface {v0}, Le8/g;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lb8/g;->Z(Ln8/f;Ljava/util/Collection;)V

    :cond_0
    invoke-direct {p0, p1}, Lb8/g;->A0(Ln8/f;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    sget-object v1, LP8/g;->E:LP8/g$b;

    invoke-virtual {v1}, LP8/g$b;->a()LP8/g;

    move-result-object v2

    invoke-virtual {v1}, LP8/g$b;->a()LP8/g;

    move-result-object v1

    new-instance v3, Lb8/g$d;

    invoke-direct {v3, p0}, Lb8/g$d;-><init>(Lb8/g;)V

    invoke-direct {p0, v0, p2, v2, v3}, Lb8/g;->Y(Ljava/util/Set;Ljava/util/Collection;Ljava/util/Set;Lx7/l;)V

    invoke-static {v0, v2}, Lj7/Z;->h(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    new-instance v3, Lb8/g$e;

    invoke-direct {v3, p0}, Lb8/g$e;-><init>(Lb8/g;)V

    const/4 v4, 0x0

    invoke-direct {p0, v2, v1, v4, v3}, Lb8/g;->Y(Ljava/util/Set;Ljava/util/Collection;Ljava/util/Set;Lx7/l;)V

    invoke-static {v0, v1}, Lj7/Z;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v4

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->c()LB8/r;

    move-result-object v5

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->k()LG8/l;

    move-result-object v0

    invoke-interface {v0}, LG8/l;->a()Lr8/l;

    move-result-object v6

    move-object v1, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, LY7/a;->d(Ln8/f;Ljava/util/Collection;Ljava/util/Collection;LO7/e;LB8/r;Lr8/l;)Ljava/util/Collection;

    move-result-object p1

    const-string v0, "resolveOverridesForNonStaticMembers(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method protected t(Ly8/d;Lx7/l;)Ljava/util/Set;
    .locals 1

    .prologue
    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lb8/g;->o:Le8/g;

    invoke-interface {p1}, Le8/g;->t()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lb8/j;->a()Ljava/util/Set;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-virtual {p0}, Lb8/j;->y()LE8/i;

    move-result-object p2

    invoke-interface {p2}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lb8/b;

    invoke-interface {p2}, Lb8/b;->f()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-direct {p1, p2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object p2

    invoke-interface {p2}, LO7/h;->p()LF8/e0;

    move-result-object p2

    invoke-interface {p2}, LF8/e0;->u()Ljava/util/Collection;

    move-result-object p2

    const-string v0, "getSupertypes(...)"

    invoke-static {p2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/E;

    invoke-virtual {v0}, LF8/E;->u()Ly8/h;

    move-result-object v0

    invoke-interface {v0}, Ly8/h;->d()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1, v0}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Lazy Java member scope for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb8/g;->o:Le8/g;

    invoke-interface {v1}, Le8/g;->e()Ln8/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x0()LE8/i;
    .locals 1

    iget-object v0, p0, Lb8/g;->q:LE8/i;

    return-object v0
.end method

.method protected z()LO7/X;
    .locals 1

    invoke-virtual {p0}, Lb8/g;->z0()LO7/e;

    move-result-object v0

    invoke-static {v0}, Lr8/f;->l(LO7/m;)LO7/X;

    move-result-object v0

    return-object v0
.end method

.method protected z0()LO7/e;
    .locals 1

    iget-object v0, p0, Lb8/g;->n:LO7/e;

    return-object v0
.end method
