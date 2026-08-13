.class public final LR7/J$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR7/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LR7/J$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LR7/J$a;LO7/e0;)LF8/n0;
    .locals 0

    invoke-direct {p0, p1}, LR7/J$a;->c(LO7/e0;)LF8/n0;

    move-result-object p0

    return-object p0
.end method

.method private final c(LO7/e0;)LF8/n0;
    .locals 1

    .prologue
    invoke-interface {p1}, LO7/e0;->v()LO7/e;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, LO7/e0;->c0()LF8/M;

    move-result-object p1

    invoke-static {p1}, LF8/n0;->f(LF8/E;)LF8/n0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final b(LE8/n;LO7/e0;LO7/d;)LR7/I;
    .locals 16

    .prologue
    move-object/from16 v9, p2

    move-object/from16 v10, p3

    const-string v0, "storageManager"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAliasDescriptor"

    invoke-static {v9, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {v10, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p0

    invoke-direct {v11, v9}, LR7/J$a;->c(LO7/e0;)LF8/n0;

    move-result-object v12

    const/4 v13, 0x0

    if-nez v12, :cond_0

    return-object v13

    :cond_0
    invoke-interface {v10, v12}, LO7/d;->c(LF8/n0;)LO7/d;

    move-result-object v14

    if-nez v14, :cond_1

    return-object v13

    :cond_1
    new-instance v15, LR7/J;

    invoke-interface/range {p3 .. p3}, LP7/a;->k()LP7/g;

    move-result-object v5

    invoke-interface/range {p3 .. p3}, LO7/b;->j()LO7/b$a;

    move-result-object v6

    const-string v0, "getKind(...)"

    invoke-static {v6, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p2 .. p2}, LO7/p;->o()LO7/a0;

    move-result-object v7

    const-string v0, "getSource(...)"

    invoke-static {v7, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    const/4 v4, 0x0

    move-object v0, v15

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object v3, v14

    invoke-direct/range {v0 .. v8}, LR7/J;-><init>(LE8/n;LO7/e0;LO7/d;LR7/I;LP7/g;LO7/b$a;LO7/a0;Ly7/k;)V

    invoke-interface/range {p3 .. p3}, LO7/a;->n()Ljava/util/List;

    move-result-object v0

    invoke-static {v15, v0, v12}, LR7/p;->X0(LO7/y;Ljava/util/List;LF8/n0;)Ljava/util/List;

    move-result-object v5

    if-nez v5, :cond_2

    return-object v13

    :cond_2
    invoke-interface {v14}, LO7/l;->l()LF8/E;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->Z0()LF8/t0;

    move-result-object v0

    invoke-static {v0}, LF8/B;->c(LF8/E;)LF8/M;

    move-result-object v0

    invoke-interface/range {p2 .. p2}, LO7/h;->w()LF8/M;

    move-result-object v1

    const-string v2, "getDefaultType(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, LF8/Q;->j(LF8/M;LF8/M;)LF8/M;

    move-result-object v6

    invoke-interface/range {p3 .. p3}, LO7/a;->m0()LO7/X;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, LO7/i0;->getType()LF8/E;

    move-result-object v0

    sget-object v1, LF8/u0;->G:LF8/u0;

    invoke-virtual {v12, v0, v1}, LF8/n0;->n(LF8/E;LF8/u0;)LF8/E;

    move-result-object v0

    sget-object v1, LP7/g;->d:LP7/g$a;

    invoke-virtual {v1}, LP7/g$a;->b()LP7/g;

    move-result-object v1

    invoke-static {v15, v0, v1}, Lr8/e;->i(LO7/a;LF8/E;LP7/g;)LO7/X;

    move-result-object v13

    :cond_3
    move-object v1, v13

    invoke-interface/range {p2 .. p2}, LO7/e0;->v()LO7/e;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface/range {p3 .. p3}, LO7/a;->A0()Ljava/util/List;

    move-result-object v2

    const-string v3, "getContextReceiverParameters(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v4, 0x1

    if-gez v4, :cond_4

    invoke-static {}, Lj7/v;->w()V

    :cond_4
    check-cast v7, LO7/X;

    invoke-interface {v7}, LO7/i0;->getType()LF8/E;

    move-result-object v10

    sget-object v13, LF8/u0;->G:LF8/u0;

    invoke-virtual {v12, v10, v13}, LF8/n0;->n(LF8/E;LF8/u0;)LF8/E;

    move-result-object v10

    invoke-interface {v7}, LO7/X;->getValue()Lz8/g;

    move-result-object v7

    const-string v13, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver"

    invoke-static {v7, v13}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lz8/f;

    invoke-interface {v7}, Lz8/f;->a()Ln8/f;

    move-result-object v7

    sget-object v13, LP7/g;->d:LP7/g$a;

    invoke-virtual {v13}, LP7/g$a;->b()LP7/g;

    move-result-object v13

    invoke-static {v0, v10, v7, v13, v4}, Lr8/e;->c(LO7/e;LF8/E;Ln8/f;LP7/g;I)LO7/X;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v4, v8

    goto :goto_0

    :cond_5
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    move-object v3, v0

    :cond_6
    invoke-interface/range {p2 .. p2}, LO7/i;->A()Ljava/util/List;

    move-result-object v4

    sget-object v7, LO7/D;->D:LO7/D;

    invoke-interface/range {p2 .. p2}, LO7/C;->h()LO7/u;

    move-result-object v8

    const/4 v2, 0x0

    move-object v0, v15

    invoke-virtual/range {v0 .. v8}, LR7/p;->a1(LO7/X;LO7/X;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LO7/D;LO7/u;)LR7/p;

    return-object v15
.end method
