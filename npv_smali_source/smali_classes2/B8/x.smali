.class public final LB8/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LB8/m;

.field private final b:LB8/e;


# direct methods
.method public constructor <init>(LB8/m;)V
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB8/x;->a:LB8/m;

    new-instance v0, LB8/e;

    invoke-virtual {p1}, LB8/m;->c()LB8/k;

    move-result-object v1

    invoke-virtual {v1}, LB8/k;->q()LO7/G;

    move-result-object v1

    invoke-virtual {p1}, LB8/m;->c()LB8/k;

    move-result-object p1

    invoke-virtual {p1}, LB8/k;->r()LO7/J;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LB8/e;-><init>(LO7/G;LO7/J;)V

    iput-object v0, p0, LB8/x;->b:LB8/e;

    return-void
.end method

.method public static final synthetic a(LB8/x;LO7/m;)LB8/A;
    .locals 0

    invoke-direct {p0, p1}, LB8/x;->c(LO7/m;)LB8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LB8/x;)LB8/m;
    .locals 0

    iget-object p0, p0, LB8/x;->a:LB8/m;

    return-object p0
.end method

.method private final c(LO7/m;)LB8/A;
    .locals 4

    .prologue
    instance-of v0, p1, LO7/K;

    if-eqz v0, :cond_0

    new-instance v0, LB8/A$b;

    check-cast p1, LO7/K;

    invoke-interface {p1}, LO7/K;->e()Ln8/c;

    move-result-object p1

    iget-object v1, p0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->g()Lk8/c;

    move-result-object v1

    iget-object v2, p0, LB8/x;->a:LB8/m;

    invoke-virtual {v2}, LB8/m;->j()Lk8/g;

    move-result-object v2

    iget-object v3, p0, LB8/x;->a:LB8/m;

    invoke-virtual {v3}, LB8/m;->d()LD8/f;

    move-result-object v3

    invoke-direct {v0, p1, v1, v2, v3}, LB8/A$b;-><init>(Ln8/c;Lk8/c;Lk8/g;LO7/a0;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LD8/d;

    if-eqz v0, :cond_1

    check-cast p1, LD8/d;

    invoke-virtual {p1}, LD8/d;->n1()LB8/A$a;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private final d(Lp8/p;ILB8/b;)LP7/g;
    .locals 2

    .prologue
    sget-object v0, Lk8/b;->c:Lk8/b$b;

    invoke-virtual {v0, p2}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    sget-object p1, LP7/g;->d:LP7/g$a;

    invoke-virtual {p1}, LP7/g$a;->b()LP7/g;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p2, LD8/n;

    iget-object v0, p0, LB8/x;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->h()LE8/n;

    move-result-object v0

    new-instance v1, LB8/x$a;

    invoke-direct {v1, p0, p1, p3}, LB8/x$a;-><init>(LB8/x;Lp8/p;LB8/b;)V

    invoke-direct {p2, v0, v1}, LD8/n;-><init>(LE8/n;Lx7/a;)V

    return-object p2
.end method

.method private final e()LO7/X;
    .locals 3

    .prologue
    iget-object v0, p0, LB8/x;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->e()LO7/m;

    move-result-object v0

    instance-of v1, v0, LO7/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, LO7/e;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, LO7/e;->S0()LO7/X;

    move-result-object v2

    :cond_1
    return-object v2
.end method

.method private final f(Li8/n;Z)LP7/g;
    .locals 3

    .prologue
    sget-object v0, Lk8/b;->c:Lk8/b$b;

    invoke-virtual {p1}, Li8/n;->a0()I

    move-result v1

    invoke-virtual {v0, v1}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, LP7/g;->d:LP7/g$a;

    invoke-virtual {p1}, LP7/g$a;->b()LP7/g;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, LD8/n;

    iget-object v1, p0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->h()LE8/n;

    move-result-object v1

    new-instance v2, LB8/x$b;

    invoke-direct {v2, p0, p2, p1}, LB8/x$b;-><init>(LB8/x;ZLi8/n;)V

    invoke-direct {v0, v1, v2}, LD8/n;-><init>(LE8/n;Lx7/a;)V

    return-object v0
.end method

.method private final g(Lp8/p;LB8/b;)LP7/g;
    .locals 3

    new-instance v0, LD8/a;

    iget-object v1, p0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->h()LE8/n;

    move-result-object v1

    new-instance v2, LB8/x$c;

    invoke-direct {v2, p0, p1, p2}, LB8/x$c;-><init>(LB8/x;Lp8/p;LB8/b;)V

    invoke-direct {v0, v1, v2}, LD8/a;-><init>(LE8/n;Lx7/a;)V

    return-object v0
.end method

.method private final h(LD8/k;LO7/X;LO7/X;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LO7/D;LO7/u;Ljava/util/Map;)V
    .locals 0

    invoke-virtual/range {p1 .. p10}, LR7/G;->x1(LO7/X;LO7/X;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LO7/D;LO7/u;Ljava/util/Map;)LR7/G;

    return-void
.end method

.method private final k(I)I
    .locals 1

    and-int/lit8 v0, p1, 0x3f

    shr-int/lit8 p1, p1, 0x8

    shl-int/lit8 p1, p1, 0x6

    add-int/2addr v0, p1

    return v0
.end method

.method private final n(Li8/q;LB8/m;LO7/a;I)LO7/X;
    .locals 1

    invoke-virtual {p2}, LB8/m;->i()LB8/E;

    move-result-object p2

    invoke-virtual {p2, p1}, LB8/E;->q(Li8/q;)LF8/E;

    move-result-object p1

    sget-object p2, LP7/g;->d:LP7/g$a;

    invoke-virtual {p2}, LP7/g$a;->b()LP7/g;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p3, p1, v0, p2, p4}, Lr8/e;->b(LO7/a;LF8/E;Ln8/f;LP7/g;I)LO7/X;

    move-result-object p1

    return-object p1
.end method

.method private final o(Ljava/util/List;Lp8/p;LB8/b;)Ljava/util/List;
    .locals 25

    .prologue
    move-object/from16 v7, p0

    iget-object v0, v7, LB8/x;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->e()LO7/m;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v20, v0

    check-cast v20, LO7/a;

    invoke-interface/range {v20 .. v20}, LO7/n;->b()LO7/m;

    move-result-object v0

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v0}, LB8/x;->c(LO7/m;)LB8/A;

    move-result-object v21

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v22

    const/16 v23, 0x0

    move/from16 v11, v23

    :goto_0
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v24, v11, 0x1

    if-gez v11, :cond_0

    invoke-static {}, Lj7/v;->w()V

    :cond_0
    move-object v8, v0

    check-cast v8, Li8/u;

    invoke-virtual {v8}, Li8/u;->Q()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v8}, Li8/u;->K()I

    move-result v0

    move v9, v0

    goto :goto_1

    :cond_1
    move/from16 v9, v23

    :goto_1
    const-string v10, "get(...)"

    if-eqz v21, :cond_2

    sget-object v0, Lk8/b;->c:Lk8/b$b;

    invoke-virtual {v0, v9}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0, v10}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v12, LD8/n;

    iget-object v0, v7, LB8/x;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->h()LE8/n;

    move-result-object v13

    new-instance v14, LB8/x$f;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, v21

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move v5, v11

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, LB8/x$f;-><init>(LB8/x;LB8/A;Lp8/p;LB8/b;ILi8/u;)V

    invoke-direct {v12, v13, v14}, LD8/n;-><init>(LE8/n;Lx7/a;)V

    goto :goto_2

    :cond_2
    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v0

    move-object v12, v0

    :goto_2
    iget-object v0, v7, LB8/x;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->g()Lk8/c;

    move-result-object v0

    invoke-virtual {v8}, Li8/u;->L()I

    move-result v1

    invoke-static {v0, v1}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v13

    iget-object v0, v7, LB8/x;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->i()LB8/E;

    move-result-object v0

    iget-object v1, v7, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->j()Lk8/g;

    move-result-object v1

    invoke-static {v8, v1}, Lk8/f;->q(Li8/u;Lk8/g;)Li8/q;

    move-result-object v1

    invoke-virtual {v0, v1}, LB8/E;->q(Li8/q;)LF8/E;

    move-result-object v14

    sget-object v0, Lk8/b;->H:Lk8/b$b;

    invoke-virtual {v0, v9}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0, v10}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sget-object v1, Lk8/b;->I:Lk8/b$b;

    invoke-virtual {v1, v9}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1, v10}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v16

    sget-object v1, Lk8/b;->J:Lk8/b$b;

    invoke-virtual {v1, v9}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1, v10}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v17

    iget-object v1, v7, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->j()Lk8/g;

    move-result-object v1

    invoke-static {v8, v1}, Lk8/f;->t(Li8/u;Lk8/g;)Li8/q;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v2, v7, LB8/x;->a:LB8/m;

    invoke-virtual {v2}, LB8/m;->i()LB8/E;

    move-result-object v2

    invoke-virtual {v2, v1}, LB8/E;->q(Li8/q;)LF8/E;

    move-result-object v1

    :goto_3
    move-object/from16 v18, v1

    goto :goto_4

    :cond_3
    const/4 v1, 0x0

    goto :goto_3

    :goto_4
    sget-object v1, LO7/a0;->a:LO7/a0;

    const-string v2, "NO_SOURCE"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LR7/L;

    const/4 v10, 0x0

    move-object v8, v2

    move-object/from16 v9, v20

    move-object v3, v15

    move v15, v0

    move-object/from16 v19, v1

    invoke-direct/range {v8 .. v19}, LR7/L;-><init>(LO7/a;LO7/j0;ILP7/g;Ln8/f;LF8/E;ZZZLF8/E;LO7/a0;)V

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v15, v3

    move/from16 v11, v24

    goto/16 :goto_0

    :cond_4
    move-object v3, v15

    invoke-static {v3}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final i(Li8/d;Z)LO7/d;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    const-string v1, "proto"

    invoke-static {v15, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->e()LO7/m;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v1

    check-cast v16, LO7/e;

    new-instance v14, LD8/c;

    invoke-virtual/range {p1 .. p1}, Li8/d;->J()I

    move-result v1

    sget-object v13, LB8/b;->C:LB8/b;

    invoke-direct {v0, v15, v1, v13}, LB8/x;->d(Lp8/p;ILB8/b;)LP7/g;

    move-result-object v4

    sget-object v6, LO7/b$a;->C:LO7/b$a;

    iget-object v1, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->g()Lk8/c;

    move-result-object v8

    iget-object v1, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->j()Lk8/g;

    move-result-object v9

    iget-object v1, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->k()Lk8/h;

    move-result-object v10

    iget-object v1, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->d()LD8/f;

    move-result-object v11

    const/16 v17, 0x400

    const/16 v18, 0x0

    const/4 v3, 0x0

    const/4 v12, 0x0

    move-object v1, v14

    move-object/from16 v2, v16

    move/from16 v5, p2

    move-object/from16 v7, p1

    move-object/from16 v19, v13

    move/from16 v13, v17

    move-object/from16 p2, v14

    move-object/from16 v14, v18

    invoke-direct/range {v1 .. v14}, LD8/c;-><init>(LO7/e;LO7/l;LP7/g;ZLO7/b$a;Li8/d;Lk8/c;Lk8/g;Lk8/h;LD8/f;LO7/a0;ILy7/k;)V

    iget-object v1, v0, LB8/x;->a:LB8/m;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v3

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v2, p2

    invoke-static/range {v1 .. v9}, LB8/m;->b(LB8/m;LO7/m;Ljava/util/List;Lk8/c;Lk8/g;Lk8/h;Lk8/a;ILjava/lang/Object;)LB8/m;

    move-result-object v1

    invoke-virtual {v1}, LB8/m;->f()LB8/x;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Li8/d;->M()Ljava/util/List;

    move-result-object v2

    const-string v3, "getValueParameterList(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, v19

    invoke-direct {v1, v2, v15, v3}, LB8/x;->o(Ljava/util/List;Lp8/p;LB8/b;)Ljava/util/List;

    move-result-object v1

    sget-object v2, LB8/B;->a:LB8/B;

    sget-object v3, Lk8/b;->d:Lk8/b$d;

    invoke-virtual/range {p1 .. p1}, Li8/d;->J()I

    move-result v4

    invoke-virtual {v3, v4}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li8/x;

    invoke-static {v2, v3}, LB8/C;->a(LB8/B;Li8/x;)LO7/u;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v3, v1, v2}, LR7/f;->z1(Ljava/util/List;LO7/u;)LR7/f;

    invoke-interface/range {v16 .. v16}, LO7/e;->w()LF8/M;

    move-result-object v1

    invoke-virtual {v3, v1}, LR7/p;->p1(LF8/E;)V

    invoke-interface/range {v16 .. v16}, LO7/C;->R()Z

    move-result v1

    invoke-virtual {v3, v1}, LR7/p;->f1(Z)V

    sget-object v1, Lk8/b;->o:Lk8/b$b;

    invoke-virtual/range {p1 .. p1}, Li8/d;->J()I

    move-result v2

    invoke-virtual {v1, v2}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v3, v1}, LR7/p;->h1(Z)V

    return-object v3
.end method

.method public final j(Li8/i;)LO7/Z;
    .locals 31

    .prologue
    move-object/from16 v11, p0

    move-object/from16 v10, p1

    const-string v0, "proto"

    invoke-static {v10, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Li8/i;->t0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual/range {p1 .. p1}, Li8/i;->c0()I

    move-result v0

    :goto_0
    move v9, v0

    goto :goto_1

    :cond_0
    invoke-virtual/range {p1 .. p1}, Li8/i;->e0()I

    move-result v0

    invoke-direct {v11, v0}, LB8/x;->k(I)I

    move-result v0

    goto :goto_0

    :goto_1
    sget-object v0, LB8/b;->C:LB8/b;

    invoke-direct {v11, v10, v9, v0}, LB8/x;->d(Lp8/p;ILB8/b;)LP7/g;

    move-result-object v15

    invoke-static/range {p1 .. p1}, Lk8/f;->g(Li8/i;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {v11, v10, v0}, LB8/x;->g(Lp8/p;LB8/b;)LP7/g;

    move-result-object v0

    goto :goto_2

    :cond_1
    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v0

    :goto_2
    iget-object v1, v11, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->e()LO7/m;

    move-result-object v1

    invoke-static {v1}, Lv8/c;->l(LO7/m;)Ln8/c;

    move-result-object v1

    iget-object v2, v11, LB8/x;->a:LB8/m;

    invoke-virtual {v2}, LB8/m;->g()Lk8/c;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Li8/i;->d0()I

    move-result v3

    invoke-static {v2, v3}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object v1

    sget-object v2, LB8/D;->a:Ln8/c;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lk8/h;->b:Lk8/h$a;

    invoke-virtual {v1}, Lk8/h$a;->b()Lk8/h;

    move-result-object v1

    :goto_3
    move-object/from16 v21, v1

    goto :goto_4

    :cond_2
    iget-object v1, v11, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->k()Lk8/h;

    move-result-object v1

    goto :goto_3

    :goto_4
    new-instance v8, LD8/k;

    iget-object v1, v11, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->e()LO7/m;

    move-result-object v13

    iget-object v1, v11, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->g()Lk8/c;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Li8/i;->d0()I

    move-result v2

    invoke-static {v1, v2}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v16

    sget-object v1, LB8/B;->a:LB8/B;

    sget-object v2, Lk8/b;->p:Lk8/b$d;

    invoke-virtual {v2, v9}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li8/j;

    invoke-static {v1, v2}, LB8/C;->b(LB8/B;Li8/j;)LO7/b$a;

    move-result-object v17

    iget-object v1, v11, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->g()Lk8/c;

    move-result-object v19

    iget-object v1, v11, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->j()Lk8/g;

    move-result-object v20

    iget-object v1, v11, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->d()LD8/f;

    move-result-object v22

    const/16 v24, 0x400

    const/16 v25, 0x0

    const/4 v14, 0x0

    const/16 v23, 0x0

    move-object v12, v8

    move-object/from16 v18, p1

    invoke-direct/range {v12 .. v25}, LD8/k;-><init>(LO7/m;LO7/Z;LP7/g;Ln8/f;LO7/b$a;Li8/i;Lk8/c;Lk8/g;Lk8/h;LD8/f;LO7/a0;ILy7/k;)V

    iget-object v1, v11, LB8/x;->a:LB8/m;

    invoke-virtual/range {p1 .. p1}, Li8/i;->m0()Ljava/util/List;

    move-result-object v2

    const-string v3, "getTypeParameterList(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v29, 0x3c

    const/16 v30, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v22, v1

    move-object/from16 v23, v8

    move-object/from16 v24, v2

    invoke-static/range {v22 .. v30}, LB8/m;->b(LB8/m;LO7/m;Ljava/util/List;Lk8/c;Lk8/g;Lk8/h;Lk8/a;ILjava/lang/Object;)LB8/m;

    move-result-object v12

    iget-object v1, v11, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->j()Lk8/g;

    move-result-object v1

    invoke-static {v10, v1}, Lk8/f;->k(Li8/i;Lk8/g;)Li8/q;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v12}, LB8/m;->i()LB8/E;

    move-result-object v2

    invoke-virtual {v2, v1}, LB8/E;->q(Li8/q;)LF8/E;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v8, v1, v0}, Lr8/e;->i(LO7/a;LF8/E;LP7/g;)LO7/X;

    move-result-object v0

    :goto_5
    move-object v2, v0

    goto :goto_6

    :cond_3
    const/4 v0, 0x0

    goto :goto_5

    :goto_6
    invoke-direct/range {p0 .. p0}, LB8/x;->e()LO7/X;

    move-result-object v3

    iget-object v0, v11, LB8/x;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->j()Lk8/g;

    move-result-object v0

    invoke-static {v10, v0}, Lk8/f;->c(Li8/i;Lk8/g;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v1, 0x1

    if-gez v1, :cond_4

    invoke-static {}, Lj7/v;->w()V

    :cond_4
    check-cast v5, Li8/q;

    invoke-direct {v11, v5, v12, v8, v1}, LB8/x;->n(Li8/q;LB8/m;LO7/a;I)LO7/X;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-interface {v4, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_5
    move v1, v6

    goto :goto_7

    :cond_6
    invoke-virtual {v12}, LB8/m;->i()LB8/E;

    move-result-object v0

    invoke-virtual {v0}, LB8/E;->j()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v12}, LB8/m;->f()LB8/x;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Li8/i;->q0()Ljava/util/List;

    move-result-object v1

    const-string v6, "getValueParameterList(...)"

    invoke-static {v1, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LB8/b;->C:LB8/b;

    invoke-direct {v0, v1, v10, v6}, LB8/x;->o(Ljava/util/List;Lp8/p;LB8/b;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v12}, LB8/m;->i()LB8/E;

    move-result-object v0

    iget-object v1, v11, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->j()Lk8/g;

    move-result-object v1

    invoke-static {v10, v1}, Lk8/f;->m(Li8/i;Lk8/g;)Li8/q;

    move-result-object v1

    invoke-virtual {v0, v1}, LB8/E;->q(Li8/q;)LF8/E;

    move-result-object v7

    sget-object v0, LB8/B;->a:LB8/B;

    sget-object v1, Lk8/b;->e:Lk8/b$d;

    invoke-virtual {v1, v9}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/k;

    invoke-virtual {v0, v1}, LB8/B;->b(Li8/k;)LO7/D;

    move-result-object v13

    sget-object v1, Lk8/b;->d:Lk8/b$d;

    invoke-virtual {v1, v9}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/x;

    invoke-static {v0, v1}, LB8/C;->a(LB8/B;Li8/x;)LO7/u;

    move-result-object v14

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v15

    move-object/from16 v0, p0

    move-object v1, v8

    move-object/from16 v16, v12

    move-object v12, v8

    move-object v8, v13

    move v13, v9

    move-object v9, v14

    move-object v14, v10

    move-object v10, v15

    invoke-direct/range {v0 .. v10}, LB8/x;->h(LD8/k;LO7/X;LO7/X;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LO7/D;LO7/u;Ljava/util/Map;)V

    sget-object v0, Lk8/b;->q:Lk8/b$b;

    invoke-virtual {v0, v13}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v12, v0}, LR7/p;->o1(Z)V

    sget-object v0, Lk8/b;->r:Lk8/b$b;

    invoke-virtual {v0, v13}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v12, v0}, LR7/p;->l1(Z)V

    sget-object v0, Lk8/b;->u:Lk8/b$b;

    invoke-virtual {v0, v13}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v12, v0}, LR7/p;->g1(Z)V

    sget-object v0, Lk8/b;->s:Lk8/b$b;

    invoke-virtual {v0, v13}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v12, v0}, LR7/p;->n1(Z)V

    sget-object v0, Lk8/b;->t:Lk8/b$b;

    invoke-virtual {v0, v13}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v12, v0}, LR7/p;->r1(Z)V

    sget-object v0, Lk8/b;->v:Lk8/b$b;

    invoke-virtual {v0, v13}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v12, v0}, LR7/p;->q1(Z)V

    sget-object v0, Lk8/b;->w:Lk8/b$b;

    invoke-virtual {v0, v13}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v12, v0}, LR7/p;->f1(Z)V

    sget-object v0, Lk8/b;->x:Lk8/b$b;

    invoke-virtual {v0, v13}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {v12, v0}, LR7/p;->h1(Z)V

    iget-object v0, v11, LB8/x;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->c()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->h()LB8/j;

    move-result-object v0

    iget-object v1, v11, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->j()Lk8/g;

    move-result-object v1

    invoke-virtual/range {v16 .. v16}, LB8/m;->i()LB8/E;

    move-result-object v2

    invoke-interface {v0, v14, v12, v1, v2}, LB8/j;->a(Li8/i;LO7/y;Lk8/g;LB8/E;)Li7/u;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7/a$a;

    invoke-virtual {v0}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v12, v1, v0}, LR7/p;->d1(LO7/a$a;Ljava/lang/Object;)V

    :cond_7
    return-object v12
.end method

.method public final l(Li8/n;)LO7/U;
    .locals 36

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v15, p1

    const-string v1, "proto"

    invoke-static {v15, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Li8/n;->p0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Li8/n;->a0()I

    move-result v1

    :goto_0
    move v3, v1

    goto :goto_1

    :cond_0
    invoke-virtual/range {p1 .. p1}, Li8/n;->d0()I

    move-result v1

    invoke-direct {v0, v1}, LB8/x;->k(I)I

    move-result v1

    goto :goto_0

    :goto_1
    new-instance v14, LD8/j;

    move-object v1, v14

    iget-object v2, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v2}, LB8/m;->e()LO7/m;

    move-result-object v2

    sget-object v4, LB8/b;->D:LB8/b;

    invoke-direct {v0, v15, v3, v4}, LB8/x;->d(Lp8/p;ILB8/b;)LP7/g;

    move-result-object v4

    sget-object v9, LB8/B;->a:LB8/B;

    sget-object v5, Lk8/b;->e:Lk8/b$d;

    invoke-virtual {v5, v3}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li8/k;

    invoke-virtual {v9, v5}, LB8/B;->b(Li8/k;)LO7/D;

    move-result-object v5

    sget-object v6, Lk8/b;->d:Lk8/b$d;

    invoke-virtual {v6, v3}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Li8/x;

    invoke-static {v9, v6}, LB8/C;->a(LB8/B;Li8/x;)LO7/u;

    move-result-object v6

    sget-object v7, Lk8/b;->y:Lk8/b$b;

    invoke-virtual {v7, v3}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v7

    const-string v13, "get(...)"

    invoke-static {v7, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    iget-object v8, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v8}, LB8/m;->g()Lk8/c;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Li8/n;->c0()I

    move-result v10

    invoke-static {v8, v10}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v8

    sget-object v10, Lk8/b;->p:Lk8/b$d;

    invoke-virtual {v10, v3}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Li8/j;

    invoke-static {v9, v10}, LB8/C;->b(LB8/B;Li8/j;)LO7/b$a;

    move-result-object v9

    sget-object v10, Lk8/b;->C:Lk8/b$b;

    invoke-virtual {v10, v3}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v10

    invoke-static {v10, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    sget-object v11, Lk8/b;->B:Lk8/b$b;

    invoke-virtual {v11, v3}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v11

    invoke-static {v11, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    sget-object v12, Lk8/b;->E:Lk8/b$b;

    invoke-virtual {v12, v3}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v12

    invoke-static {v12, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    move-object/from16 v16, v14

    sget-object v14, Lk8/b;->F:Lk8/b$b;

    invoke-virtual {v14, v3}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v14

    invoke-static {v14, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    move-object/from16 v20, v1

    move-object v1, v13

    move v13, v14

    sget-object v14, Lk8/b;->G:Lk8/b$b;

    invoke-virtual {v14, v3}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v14

    invoke-static {v14, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    move-object/from16 v21, v16

    move-object/from16 v22, v1

    iget-object v1, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->g()Lk8/c;

    move-result-object v16

    iget-object v1, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->j()Lk8/g;

    move-result-object v17

    iget-object v1, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->k()Lk8/h;

    move-result-object v18

    iget-object v1, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->d()LD8/f;

    move-result-object v19

    const/4 v1, 0x0

    move/from16 v23, v3

    move-object v3, v1

    move-object v1, v15

    move-object/from16 v15, p1

    move-object/from16 v1, v20

    move-object/from16 v24, v22

    invoke-direct/range {v1 .. v19}, LD8/j;-><init>(LO7/m;LO7/U;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/b$a;ZZZZZLi8/n;Lk8/c;Lk8/g;Lk8/h;LD8/f;)V

    iget-object v4, v0, LB8/x;->a:LB8/m;

    invoke-virtual/range {p1 .. p1}, Li8/n;->n0()Ljava/util/List;

    move-result-object v6

    const-string v1, "getTypeParameterList(...)"

    invoke-static {v6, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x3c

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v5, v21

    invoke-static/range {v4 .. v12}, LB8/m;->b(LB8/m;LO7/m;Ljava/util/List;Lk8/c;Lk8/g;Lk8/h;Lk8/a;ILjava/lang/Object;)LB8/m;

    move-result-object v1

    sget-object v2, Lk8/b;->z:Lk8/b$b;

    move/from16 v3, v23

    invoke-virtual {v2, v3}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v2

    move-object/from16 v15, v24

    invoke-static {v2, v15}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static/range {p1 .. p1}, Lk8/f;->h(Li8/n;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, LB8/b;->E:LB8/b;

    move-object/from16 v14, p1

    invoke-direct {v0, v14, v4}, LB8/x;->g(Lp8/p;LB8/b;)LP7/g;

    move-result-object v4

    goto :goto_2

    :cond_1
    move-object/from16 v14, p1

    sget-object v4, LP7/g;->d:LP7/g$a;

    invoke-virtual {v4}, LP7/g$a;->b()LP7/g;

    move-result-object v4

    :goto_2
    invoke-virtual {v1}, LB8/m;->i()LB8/E;

    move-result-object v5

    iget-object v6, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v6}, LB8/m;->j()Lk8/g;

    move-result-object v6

    invoke-static {v14, v6}, Lk8/f;->n(Li8/n;Lk8/g;)Li8/q;

    move-result-object v6

    invoke-virtual {v5, v6}, LB8/E;->q(Li8/q;)LF8/E;

    move-result-object v5

    invoke-virtual {v1}, LB8/m;->i()LB8/E;

    move-result-object v6

    invoke-virtual {v6}, LB8/E;->j()Ljava/util/List;

    move-result-object v6

    invoke-direct/range {p0 .. p0}, LB8/x;->e()LO7/X;

    move-result-object v7

    iget-object v8, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v8}, LB8/m;->j()Lk8/g;

    move-result-object v8

    invoke-static {v14, v8}, Lk8/f;->l(Li8/n;Lk8/g;)Li8/q;

    move-result-object v8

    const/16 v16, 0x0

    if-eqz v8, :cond_2

    invoke-virtual {v1}, LB8/m;->i()LB8/E;

    move-result-object v9

    invoke-virtual {v9, v8}, LB8/E;->q(Li8/q;)LF8/E;

    move-result-object v8

    if-eqz v8, :cond_2

    move-object/from16 v13, v21

    invoke-static {v13, v8, v4}, Lr8/e;->i(LO7/a;LF8/E;LP7/g;)LO7/X;

    move-result-object v4

    move-object v8, v4

    goto :goto_3

    :cond_2
    move-object/from16 v13, v21

    move-object/from16 v8, v16

    :goto_3
    iget-object v4, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v4}, LB8/m;->j()Lk8/g;

    move-result-object v4

    invoke-static {v14, v4}, Lk8/f;->d(Li8/n;Lk8/g;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v4, v10}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v12, 0x0

    move v10, v12

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v17, v10, 0x1

    if-gez v10, :cond_3

    invoke-static {}, Lj7/v;->w()V

    :cond_3
    check-cast v11, Li8/q;

    invoke-direct {v0, v11, v1, v13, v10}, LB8/x;->n(Li8/q;LB8/m;LO7/a;I)LO7/X;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v10, v17

    goto :goto_4

    :cond_4
    move-object v4, v13

    invoke-virtual/range {v4 .. v9}, LR7/C;->k1(LF8/E;Ljava/util/List;LO7/X;LO7/X;Ljava/util/List;)V

    sget-object v4, Lk8/b;->c:Lk8/b$b;

    invoke-virtual {v4, v3}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4, v15}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    sget-object v11, Lk8/b;->d:Lk8/b$d;

    invoke-virtual {v11, v3}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Li8/x;

    sget-object v4, Lk8/b;->e:Lk8/b$d;

    invoke-virtual {v4, v3}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li8/k;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lk8/b;->b(ZLi8/x;Li8/k;ZZZ)I

    move-result v17

    const/4 v10, 0x1

    if-eqz v2, :cond_7

    invoke-virtual/range {p1 .. p1}, Li8/n;->q0()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual/range {p1 .. p1}, Li8/n;->b0()I

    move-result v2

    goto :goto_5

    :cond_5
    move/from16 v2, v17

    :goto_5
    sget-object v5, Lk8/b;->K:Lk8/b$b;

    invoke-virtual {v5, v2}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v5, v15}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    sget-object v6, Lk8/b;->L:Lk8/b$b;

    invoke-virtual {v6, v2}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v6, v15}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v18

    sget-object v6, Lk8/b;->M:Lk8/b$b;

    invoke-virtual {v6, v2}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v6, v15}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v19

    sget-object v6, LB8/b;->E:LB8/b;

    invoke-direct {v0, v14, v2, v6}, LB8/x;->d(Lp8/p;ILB8/b;)LP7/g;

    move-result-object v6

    if-eqz v5, :cond_6

    new-instance v20, LR7/D;

    sget-object v7, LB8/B;->a:LB8/B;

    invoke-virtual {v4, v2}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Li8/k;

    invoke-virtual {v7, v8}, LB8/B;->b(Li8/k;)LO7/D;

    move-result-object v8

    invoke-virtual {v11, v2}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li8/x;

    invoke-static {v7, v2}, LB8/C;->a(LB8/B;Li8/x;)LO7/u;

    move-result-object v2

    xor-int/lit8 v9, v5, 0x1

    invoke-virtual {v13}, LR7/C;->j()LO7/b$a;

    move-result-object v21

    const/16 v22, 0x0

    sget-object v23, LO7/a0;->a:LO7/a0;

    move-object v7, v4

    move-object/from16 v4, v20

    move-object v5, v13

    move-object/from16 v34, v7

    move-object v7, v8

    move-object v8, v2

    move v2, v10

    move/from16 v10, v18

    move-object v2, v11

    move/from16 v11, v19

    move-object/from16 v12, v21

    move-object/from16 v19, v1

    move-object v1, v13

    move-object/from16 v13, v22

    move-object/from16 v21, v2

    move-object v2, v14

    move-object/from16 v14, v23

    invoke-direct/range {v4 .. v14}, LR7/D;-><init>(LO7/U;LP7/g;LO7/D;LO7/u;ZZZLO7/b$a;LO7/V;LO7/a0;)V

    goto :goto_6

    :cond_6
    move-object/from16 v19, v1

    move-object/from16 v34, v4

    move-object/from16 v21, v11

    move-object v1, v13

    move-object v2, v14

    invoke-static {v1, v6}, Lr8/e;->d(LO7/U;LP7/g;)LR7/D;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object/from16 v4, v20

    :goto_6
    invoke-virtual {v1}, LR7/C;->l()LF8/E;

    move-result-object v5

    invoke-virtual {v4, v5}, LR7/D;->Y0(LF8/E;)V

    move-object v14, v4

    goto :goto_7

    :cond_7
    move-object/from16 v19, v1

    move-object/from16 v34, v4

    move-object/from16 v21, v11

    move-object v1, v13

    move-object v2, v14

    move-object/from16 v14, v16

    :goto_7
    sget-object v4, Lk8/b;->A:Lk8/b$b;

    invoke-virtual {v4, v3}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4, v15}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual/range {p1 .. p1}, Li8/n;->x0()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual/range {p1 .. p1}, Li8/n;->j0()I

    move-result v17

    :cond_8
    move/from16 v4, v17

    sget-object v5, Lk8/b;->K:Lk8/b$b;

    invoke-virtual {v5, v4}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v5, v15}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    sget-object v6, Lk8/b;->L:Lk8/b$b;

    invoke-virtual {v6, v4}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v6, v15}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    sget-object v6, Lk8/b;->M:Lk8/b$b;

    invoke-virtual {v6, v4}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v6, v15}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    sget-object v13, LB8/b;->F:LB8/b;

    invoke-direct {v0, v2, v4, v13}, LB8/x;->d(Lp8/p;ILB8/b;)LP7/g;

    move-result-object v6

    if-eqz v5, :cond_9

    new-instance v12, LR7/E;

    sget-object v7, LB8/B;->a:LB8/B;

    move-object/from16 v8, v34

    invoke-virtual {v8, v4}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Li8/k;

    invoke-virtual {v7, v8}, LB8/B;->b(Li8/k;)LO7/D;

    move-result-object v8

    move-object/from16 v9, v21

    invoke-virtual {v9, v4}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li8/x;

    invoke-static {v7, v4}, LB8/C;->a(LB8/B;Li8/x;)LO7/u;

    move-result-object v9

    const/4 v4, 0x1

    xor-int/lit8 v17, v5, 0x1

    invoke-virtual {v1}, LR7/C;->j()LO7/b$a;

    move-result-object v20

    const/16 v21, 0x0

    sget-object v22, LO7/a0;->a:LO7/a0;

    move-object v4, v12

    move-object v5, v1

    move-object v7, v8

    move-object v8, v9

    move/from16 v9, v17

    move-object/from16 v17, v12

    move-object/from16 v12, v20

    move-object v0, v13

    move-object/from16 v13, v21

    move-object/from16 v35, v14

    move-object/from16 v14, v22

    invoke-direct/range {v4 .. v14}, LR7/E;-><init>(LO7/U;LP7/g;LO7/D;LO7/u;ZZZLO7/b$a;LO7/W;LO7/a0;)V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v27

    const/16 v32, 0x3c

    const/16 v33, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v25, v19

    move-object/from16 v26, v17

    invoke-static/range {v25 .. v33}, LB8/m;->b(LB8/m;LO7/m;Ljava/util/List;Lk8/c;Lk8/g;Lk8/h;Lk8/a;ILjava/lang/Object;)LB8/m;

    move-result-object v4

    invoke-virtual {v4}, LB8/m;->f()LB8/x;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Li8/n;->k0()Li8/u;

    move-result-object v5

    invoke-static {v5}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v4, v5, v2, v0}, LB8/x;->o(Ljava/util/List;Lp8/p;LB8/b;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/j0;

    move-object/from16 v4, v17

    invoke-virtual {v4, v0}, LR7/E;->Z0(LO7/j0;)V

    move-object v12, v4

    goto :goto_8

    :cond_9
    move-object/from16 v35, v14

    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v0

    invoke-static {v1, v6, v0}, Lr8/e;->e(LO7/U;LP7/g;LP7/g;)LR7/E;

    move-result-object v12

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_8

    :cond_a
    move-object/from16 v35, v14

    move-object/from16 v12, v16

    :goto_8
    sget-object v0, Lk8/b;->D:Lk8/b$b;

    invoke-virtual {v0, v3}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0, v15}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v0, LB8/x$d;

    move-object/from16 v3, p0

    invoke-direct {v0, v3, v2, v1}, LB8/x$d;-><init>(LB8/x;Li8/n;LD8/j;)V

    invoke-virtual {v1, v0}, LR7/N;->U0(Lx7/a;)V

    goto :goto_9

    :cond_b
    move-object/from16 v3, p0

    :goto_9
    iget-object v0, v3, LB8/x;->a:LB8/m;

    invoke-virtual {v0}, LB8/m;->e()LO7/m;

    move-result-object v0

    instance-of v4, v0, LO7/e;

    if-eqz v4, :cond_c

    check-cast v0, LO7/e;

    goto :goto_a

    :cond_c
    move-object/from16 v0, v16

    :goto_a
    if-eqz v0, :cond_d

    invoke-interface {v0}, LO7/e;->j()LO7/f;

    move-result-object v16

    :cond_d
    move-object/from16 v0, v16

    sget-object v4, LO7/f;->H:LO7/f;

    if-ne v0, v4, :cond_e

    new-instance v0, LB8/x$e;

    invoke-direct {v0, v3, v2, v1}, LB8/x$e;-><init>(LB8/x;Li8/n;LD8/j;)V

    invoke-virtual {v1, v0}, LR7/N;->U0(Lx7/a;)V

    :cond_e
    new-instance v0, LR7/o;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4}, LB8/x;->f(Li8/n;Z)LP7/g;

    move-result-object v4

    invoke-direct {v0, v4, v1}, LR7/o;-><init>(LP7/g;LO7/U;)V

    new-instance v4, LR7/o;

    const/4 v5, 0x1

    invoke-direct {v3, v2, v5}, LB8/x;->f(Li8/n;Z)LP7/g;

    move-result-object v2

    invoke-direct {v4, v2, v1}, LR7/o;-><init>(LP7/g;LO7/U;)V

    move-object/from16 v2, v35

    invoke-virtual {v1, v2, v12, v0, v4}, LR7/C;->e1(LR7/D;LO7/W;LO7/w;LO7/w;)V

    return-object v1
.end method

.method public final m(Li8/r;)LO7/e0;
    .locals 22

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v12, p1

    const-string v1, "proto"

    invoke-static {v12, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LP7/g;->d:LP7/g$a;

    invoke-virtual/range {p1 .. p1}, Li8/r;->Q()Ljava/util/List;

    move-result-object v2

    const-string v3, "getAnnotationList(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li8/b;

    iget-object v5, v0, LB8/x;->b:LB8/e;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v6, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v6}, LB8/m;->g()Lk8/c;

    move-result-object v6

    invoke-virtual {v5, v4, v6}, LB8/e;->a(Li8/b;Lk8/c;)LP7/c;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v3}, LP7/g$a;->a(Ljava/util/List;)LP7/g;

    move-result-object v4

    sget-object v1, LB8/B;->a:LB8/B;

    sget-object v2, Lk8/b;->d:Lk8/b$d;

    invoke-virtual/range {p1 .. p1}, Li8/r;->V()I

    move-result v3

    invoke-virtual {v2, v3}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li8/x;

    invoke-static {v1, v2}, LB8/C;->a(LB8/B;Li8/x;)LO7/u;

    move-result-object v6

    new-instance v15, LD8/l;

    iget-object v1, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->h()LE8/n;

    move-result-object v2

    iget-object v1, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->e()LO7/m;

    move-result-object v3

    iget-object v1, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->g()Lk8/c;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Li8/r;->W()I

    move-result v5

    invoke-static {v1, v5}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v5

    iget-object v1, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->g()Lk8/c;

    move-result-object v8

    iget-object v1, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->j()Lk8/g;

    move-result-object v9

    iget-object v1, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->k()Lk8/h;

    move-result-object v10

    iget-object v1, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v1}, LB8/m;->d()LD8/f;

    move-result-object v11

    move-object v1, v15

    move-object/from16 v7, p1

    invoke-direct/range {v1 .. v11}, LD8/l;-><init>(LE8/n;LO7/m;LP7/g;Ln8/f;LO7/u;Li8/r;Lk8/c;Lk8/g;Lk8/h;LD8/f;)V

    iget-object v13, v0, LB8/x;->a:LB8/m;

    invoke-virtual/range {p1 .. p1}, Li8/r;->Z()Ljava/util/List;

    move-result-object v1

    const-string v2, "getTypeParameterList(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v20, 0x3c

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v14, v15

    move-object v2, v15

    move-object v15, v1

    invoke-static/range {v13 .. v21}, LB8/m;->b(LB8/m;LO7/m;Ljava/util/List;Lk8/c;Lk8/g;Lk8/h;Lk8/a;ILjava/lang/Object;)LB8/m;

    move-result-object v1

    invoke-virtual {v1}, LB8/m;->i()LB8/E;

    move-result-object v3

    invoke-virtual {v3}, LB8/E;->j()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, LB8/m;->i()LB8/E;

    move-result-object v4

    iget-object v5, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v5}, LB8/m;->j()Lk8/g;

    move-result-object v5

    invoke-static {v12, v5}, Lk8/f;->r(Li8/r;Lk8/g;)Li8/q;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, LB8/E;->l(Li8/q;Z)LF8/M;

    move-result-object v4

    invoke-virtual {v1}, LB8/m;->i()LB8/E;

    move-result-object v1

    iget-object v5, v0, LB8/x;->a:LB8/m;

    invoke-virtual {v5}, LB8/m;->j()Lk8/g;

    move-result-object v5

    invoke-static {v12, v5}, Lk8/f;->e(Li8/r;Lk8/g;)Li8/q;

    move-result-object v5

    invoke-virtual {v1, v5, v6}, LB8/E;->l(Li8/q;Z)LF8/M;

    move-result-object v1

    invoke-virtual {v2, v3, v4, v1}, LD8/l;->Z0(Ljava/util/List;LF8/M;LF8/M;)V

    return-object v2
.end method
