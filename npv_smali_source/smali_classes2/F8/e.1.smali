.class public final LF8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/e$a;
    }
.end annotation


# static fields
.field public static final a:LF8/e;

.field public static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF8/e;

    invoke-direct {v0}, LF8/e;-><init>()V

    sput-object v0, LF8/e;->a:LF8/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(LF8/d0;LJ8/j;LJ8/j;)Ljava/lang/Boolean;
    .locals 3

    .prologue
    invoke-virtual {p1}, LF8/d0;->j()LJ8/o;

    move-result-object v0

    invoke-interface {v0, p2}, LJ8/o;->o0(LJ8/j;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-interface {v0, p3}, LJ8/o;->o0(LJ8/j;)Z

    move-result v1

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    invoke-static {v0, p2}, LF8/e;->d(LJ8/o;LJ8/j;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0, p3}, LF8/e;->d(LJ8/o;LJ8/j;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_1
    invoke-interface {v0, p2}, LJ8/o;->o0(LJ8/j;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, p3, v1}, LF8/e;->e(LJ8/o;LF8/d0;LJ8/j;LJ8/j;Z)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_2
    invoke-interface {v0, p3}, LJ8/o;->o0(LJ8/j;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {v0, p2}, LF8/e;->c(LJ8/o;LJ8/j;)Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x1

    invoke-static {v0, p1, p3, p2, v1}, LF8/e;->e(LJ8/o;LF8/d0;LJ8/j;LJ8/j;Z)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_4
    return-object v2
.end method

.method private static final b(LJ8/o;LJ8/j;)Z
    .locals 2

    .prologue
    instance-of v0, p1, LJ8/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LJ8/d;

    invoke-interface {p0, p1}, LJ8/o;->q0(LJ8/d;)LJ8/c;

    move-result-object p1

    invoke-interface {p0, p1}, LJ8/o;->B(LJ8/c;)LJ8/l;

    move-result-object p1

    invoke-interface {p0, p1}, LJ8/o;->E0(LJ8/l;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p0, p1}, LJ8/o;->n0(LJ8/l;)LJ8/i;

    move-result-object p1

    invoke-interface {p0, p1}, LJ8/o;->G(LJ8/i;)LJ8/j;

    move-result-object p1

    invoke-interface {p0, p1}, LJ8/o;->o0(LJ8/j;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method private static final c(LJ8/o;LJ8/j;)Z
    .locals 2

    .prologue
    invoke-interface {p0, p1}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object p1

    instance-of v0, p1, LJ8/h;

    if-eqz v0, :cond_2

    invoke-interface {p0, p1}, LJ8/o;->J(LJ8/m;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ8/i;

    invoke-interface {p0, v0}, LJ8/o;->b(LJ8/i;)LJ8/j;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p0, v0}, LJ8/o;->o0(LJ8/j;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method private static final d(LJ8/o;LJ8/j;)Z
    .locals 1

    .prologue
    invoke-interface {p0, p1}, LJ8/o;->o0(LJ8/j;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0, p1}, LF8/e;->b(LJ8/o;LJ8/j;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static final e(LJ8/o;LF8/d0;LJ8/j;LJ8/j;Z)Z
    .locals 9

    .prologue
    invoke-interface {p0, p2}, LJ8/o;->w(LJ8/j;)Ljava/util/Collection;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    instance-of v0, p2, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LJ8/i;

    invoke-interface {p0, v5}, LJ8/o;->u0(LJ8/i;)LJ8/m;

    move-result-object v0

    invoke-interface {p0, p3}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p4, :cond_1

    sget-object v2, LF8/e;->a:LF8/e;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v2 .. v8}, LF8/e;->t(LF8/e;LF8/d0;LJ8/i;LJ8/i;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_2
    const/4 v1, 0x1

    :cond_3
    :goto_0
    return v1
.end method

.method private final f(LF8/d0;LJ8/j;LJ8/j;)Ljava/lang/Boolean;
    .locals 14

    .prologue
    move-object/from16 v7, p2

    move-object/from16 v8, p3

    invoke-virtual {p1}, LF8/d0;->j()LJ8/o;

    move-result-object v9

    invoke-interface {v9, v7}, LJ8/o;->Q(LJ8/i;)Z

    move-result v0

    const/4 v10, 0x0

    if-nez v0, :cond_0

    invoke-interface {v9, v8}, LJ8/o;->Q(LJ8/i;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move-object v13, p1

    goto/16 :goto_9

    :cond_1
    invoke-interface {v9, v7}, LJ8/o;->v(LJ8/j;)Z

    move-result v0

    const/4 v11, 0x1

    if-eqz v0, :cond_4

    invoke-interface {v9, v8}, LJ8/o;->v(LJ8/j;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, LF8/e;->a:LF8/e;

    invoke-direct {v0, v9, v7, v8}, LF8/e;->p(LJ8/o;LJ8/j;LJ8/j;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, LF8/d0;->n()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    move v10, v11

    :cond_3
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_4
    invoke-interface {v9, v7}, LJ8/o;->H(LJ8/j;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-interface {v9, v8}, LJ8/o;->H(LJ8/j;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    move-object v13, p1

    goto/16 :goto_8

    :cond_6
    invoke-interface {v9, v8}, LJ8/o;->t(LJ8/j;)LJ8/e;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {v9, v0}, LJ8/o;->y0(LJ8/e;)LJ8/j;

    move-result-object v0

    if-nez v0, :cond_8

    :cond_7
    move-object v0, v8

    :cond_8
    invoke-interface {v9, v0}, LJ8/o;->d(LJ8/j;)LJ8/d;

    move-result-object v0

    const/4 v12, 0x0

    if-eqz v0, :cond_9

    invoke-interface {v9, v0}, LJ8/o;->n(LJ8/d;)LJ8/i;

    move-result-object v1

    goto :goto_0

    :cond_9
    move-object v1, v12

    :goto_0
    if-eqz v0, :cond_e

    if-eqz v1, :cond_e

    invoke-interface {v9, v8}, LJ8/o;->C0(LJ8/j;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v9, v1, v11}, LJ8/o;->M(LJ8/i;Z)LJ8/i;

    move-result-object v1

    :cond_a
    :goto_1
    move-object v13, p1

    move-object v3, v1

    goto :goto_2

    :cond_b
    invoke-interface {v9, v8}, LJ8/o;->x0(LJ8/i;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v9, v1}, LJ8/o;->m0(LJ8/i;)LJ8/i;

    move-result-object v1

    goto :goto_1

    :goto_2
    invoke-virtual {p1, v7, v0}, LF8/d0;->g(LJ8/j;LJ8/d;)LF8/d0$b;

    move-result-object v0

    sget-object v1, LF8/e$a;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v11, :cond_d

    const/4 v1, 0x2

    if-eq v0, v1, :cond_c

    goto :goto_4

    :cond_c
    sget-object v0, LF8/e;->a:LF8/e;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object/from16 v2, p2

    invoke-static/range {v0 .. v6}, LF8/e;->t(LF8/e;LF8/d0;LJ8/i;LJ8/i;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_d
    sget-object v0, LF8/e;->a:LF8/e;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object/from16 v2, p2

    invoke-static/range {v0 .. v6}, LF8/e;->t(LF8/e;LF8/d0;LJ8/i;LJ8/i;ZILjava/lang/Object;)Z

    move-result v0

    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_e
    move-object v13, p1

    :cond_f
    :goto_4
    invoke-interface {v9, v8}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v0

    invoke-interface {v9, v0}, LJ8/o;->T(LJ8/m;)Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-interface {v9, v8}, LJ8/o;->C0(LJ8/j;)Z

    invoke-interface {v9, v0}, LJ8/o;->J(LJ8/m;)Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_11

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_11

    :cond_10
    move v10, v11

    goto :goto_5

    :cond_11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_12
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LJ8/i;

    sget-object v0, LF8/e;->a:LF8/e;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object/from16 v2, p2

    invoke-static/range {v0 .. v6}, LF8/e;->t(LF8/e;LF8/d0;LJ8/i;LJ8/i;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    :goto_5
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_13
    invoke-interface {v9, v7}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v0

    instance-of v1, v7, LJ8/d;

    if-nez v1, :cond_16

    invoke-interface {v9, v0}, LJ8/o;->T(LJ8/m;)Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface {v9, v0}, LJ8/o;->J(LJ8/m;)Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_14

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_6

    :cond_14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ8/i;

    instance-of v1, v1, LJ8/d;

    if-nez v1, :cond_15

    goto :goto_7

    :cond_16
    :goto_6
    sget-object v0, LF8/e;->a:LF8/e;

    invoke-virtual {p1}, LF8/d0;->j()LJ8/o;

    move-result-object v1

    invoke-direct {v0, v1, v8, v7}, LF8/e;->m(LJ8/o;LJ8/i;LJ8/i;)LJ8/n;

    move-result-object v0

    if-eqz v0, :cond_17

    invoke-interface {v9, v8}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v1

    invoke-interface {v9, v0, v1}, LJ8/o;->F(LJ8/n;LJ8/m;)Z

    move-result v0

    if-eqz v0, :cond_17

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_17
    :goto_7
    return-object v12

    :goto_8
    invoke-virtual {p1}, LF8/d0;->n()Z

    move-result v0

    goto/16 :goto_3

    :goto_9
    invoke-virtual {p1}, LF8/d0;->m()Z

    move-result v0

    if-eqz v0, :cond_18

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_18
    invoke-interface {v9, v7}, LJ8/o;->C0(LJ8/j;)Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-interface {v9, v8}, LJ8/o;->C0(LJ8/j;)Z

    move-result v0

    if-nez v0, :cond_19

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :cond_19
    sget-object v0, LF8/d;->a:LF8/d;

    invoke-interface {v9, v7, v10}, LJ8/o;->g(LJ8/j;Z)LJ8/j;

    move-result-object v1

    invoke-interface {v9, v8, v10}, LJ8/o;->g(LJ8/j;Z)LJ8/j;

    move-result-object v2

    invoke-virtual {v0, v9, v1, v2}, LF8/d;->b(LJ8/o;LJ8/i;LJ8/i;)Z

    move-result v0

    goto/16 :goto_3
.end method

.method private final g(LF8/d0;LJ8/j;LJ8/m;)Ljava/util/List;
    .locals 15

    .prologue
    move-object/from16 v0, p2

    move-object/from16 v1, p3

    invoke-virtual/range {p1 .. p1}, LF8/d0;->j()LJ8/o;

    move-result-object v2

    invoke-interface {v2, v0, v1}, LJ8/o;->L(LJ8/j;LJ8/m;)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_0

    return-object v3

    :cond_0
    invoke-interface {v2, v1}, LJ8/o;->X(LJ8/m;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {v2, v0}, LJ8/o;->O(LJ8/j;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-interface {v2, v1}, LJ8/o;->V(LJ8/m;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2, v0}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v3

    invoke-interface {v2, v3, v1}, LJ8/o;->h0(LJ8/m;LJ8/m;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, LJ8/b;->C:LJ8/b;

    invoke-interface {v2, v0, v1}, LJ8/o;->j0(LJ8/j;LJ8/b;)LJ8/j;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_4
    new-instance v3, LP8/f;

    invoke-direct {v3}, LP8/f;-><init>()V

    invoke-virtual/range {p1 .. p1}, LF8/d0;->k()V

    invoke-virtual/range {p1 .. p1}, LF8/d0;->h()Ljava/util/ArrayDeque;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, LF8/d0;->i()Ljava/util/Set;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :goto_2
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    xor-int/lit8 v6, v6, 0x1

    if-eqz v6, :cond_c

    invoke-interface {v5}, Ljava/util/Set;->size()I

    move-result v6

    const/16 v7, 0x3e8

    if-gt v6, v7, :cond_b

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJ8/j;

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v5, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    sget-object v7, LJ8/b;->C:LJ8/b;

    invoke-interface {v2, v6, v7}, LJ8/o;->j0(LJ8/j;LJ8/b;)LJ8/j;

    move-result-object v7

    if-nez v7, :cond_5

    move-object v7, v6

    :cond_5
    invoke-interface {v2, v7}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v8

    invoke-interface {v2, v8, v1}, LJ8/o;->h0(LJ8/m;LJ8/m;)Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v7, LF8/d0$c$c;->a:LF8/d0$c$c;

    goto :goto_3

    :cond_6
    invoke-interface {v2, v7}, LJ8/o;->h(LJ8/i;)I

    move-result v8

    if-nez v8, :cond_7

    sget-object v7, LF8/d0$c$b;->a:LF8/d0$c$b;

    goto :goto_3

    :cond_7
    invoke-virtual/range {p1 .. p1}, LF8/d0;->j()LJ8/o;

    move-result-object v8

    invoke-interface {v8, v7}, LJ8/o;->l0(LJ8/j;)LF8/d0$c;

    move-result-object v7

    :goto_3
    sget-object v8, LF8/d0$c$c;->a:LF8/d0$c$c;

    invoke-static {v7, v8}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    xor-int/lit8 v8, v8, 0x1

    if-eqz v8, :cond_8

    goto :goto_4

    :cond_8
    const/4 v7, 0x0

    :goto_4
    if-nez v7, :cond_9

    goto :goto_2

    :cond_9
    invoke-virtual/range {p1 .. p1}, LF8/d0;->j()LJ8/o;

    move-result-object v8

    invoke-interface {v8, v6}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v6

    invoke-interface {v8, v6}, LJ8/o;->J(LJ8/m;)Ljava/util/Collection;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LJ8/i;

    move-object/from16 v9, p1

    invoke-virtual {v7, v9, v8}, LF8/d0$c;->a(LF8/d0;LJ8/i;)LJ8/j;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    move-object/from16 v9, p1

    goto/16 :goto_2

    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Too many supertypes for type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ". Supertypes = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v6, v5

    check-cast v6, Ljava/lang/Iterable;

    const/16 v13, 0x3f

    const/4 v14, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v6 .. v14}, Lj7/v;->r0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    move-object/from16 v9, p1

    invoke-virtual/range {p1 .. p1}, LF8/d0;->e()V

    return-object v3
.end method

.method private final h(LF8/d0;LJ8/j;LJ8/m;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LF8/e;->g(LF8/d0;LJ8/j;LJ8/m;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LF8/e;->w(LF8/d0;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final i(LF8/d0;LJ8/i;LJ8/i;Z)Z
    .locals 4

    .prologue
    invoke-virtual {p1}, LF8/d0;->j()LJ8/o;

    move-result-object v0

    invoke-virtual {p1, p2}, LF8/d0;->p(LJ8/i;)LJ8/i;

    move-result-object p2

    invoke-virtual {p1, p2}, LF8/d0;->o(LJ8/i;)LJ8/i;

    move-result-object p2

    invoke-virtual {p1, p3}, LF8/d0;->p(LJ8/i;)LJ8/i;

    move-result-object p3

    invoke-virtual {p1, p3}, LF8/d0;->o(LJ8/i;)LJ8/i;

    move-result-object p3

    sget-object v1, LF8/e;->a:LF8/e;

    invoke-interface {v0, p2}, LJ8/o;->z(LJ8/i;)LJ8/j;

    move-result-object v2

    invoke-interface {v0, p3}, LJ8/o;->G(LJ8/i;)LJ8/j;

    move-result-object v3

    invoke-direct {v1, p1, v2, v3}, LF8/e;->f(LF8/d0;LJ8/j;LJ8/j;)Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, p2, p3, p4}, LF8/d0;->c(LJ8/i;LJ8/i;Z)Ljava/lang/Boolean;

    return v0

    :cond_0
    invoke-virtual {p1, p2, p3, p4}, LF8/d0;->c(LJ8/i;LJ8/i;Z)Ljava/lang/Boolean;

    move-result-object p4

    if-eqz p4, :cond_1

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_1
    invoke-interface {v0, p2}, LJ8/o;->z(LJ8/i;)LJ8/j;

    move-result-object p2

    invoke-interface {v0, p3}, LJ8/o;->G(LJ8/i;)LJ8/j;

    move-result-object p3

    invoke-direct {v1, p1, p2, p3}, LF8/e;->u(LF8/d0;LJ8/j;LJ8/j;)Z

    move-result p1

    return p1
.end method

.method private final m(LJ8/o;LJ8/i;LJ8/i;)LJ8/n;
    .locals 7

    .prologue
    invoke-interface {p1, p2}, LJ8/o;->h(LJ8/i;)I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v0, :cond_6

    invoke-interface {p1, p2, v2}, LJ8/o;->c0(LJ8/i;I)LJ8/l;

    move-result-object v4

    invoke-interface {p1, v4}, LJ8/o;->E0(LJ8/l;)Z

    move-result v5

    const/4 v6, 0x1

    xor-int/2addr v5, v6

    if-eqz v5, :cond_0

    move-object v3, v4

    :cond_0
    if-eqz v3, :cond_5

    invoke-interface {p1, v3}, LJ8/o;->n0(LJ8/l;)LJ8/i;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_3

    :cond_1
    invoke-interface {p1, v3}, LJ8/o;->z(LJ8/i;)LJ8/j;

    move-result-object v4

    invoke-interface {p1, v4}, LJ8/o;->i(LJ8/j;)LJ8/j;

    move-result-object v4

    invoke-interface {p1, v4}, LJ8/o;->p0(LJ8/i;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1, p3}, LJ8/o;->z(LJ8/i;)LJ8/j;

    move-result-object v4

    invoke-interface {p1, v4}, LJ8/o;->i(LJ8/j;)LJ8/j;

    move-result-object v4

    invoke-interface {p1, v4}, LJ8/o;->p0(LJ8/i;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    move v6, v1

    :goto_1
    invoke-static {v3, p3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    if-eqz v6, :cond_3

    invoke-interface {p1, v3}, LJ8/o;->u0(LJ8/i;)LJ8/m;

    move-result-object v4

    invoke-interface {p1, p3}, LJ8/o;->u0(LJ8/i;)LJ8/m;

    move-result-object v5

    invoke-static {v4, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-direct {p0, p1, v3, p3}, LF8/e;->m(LJ8/o;LJ8/i;LJ8/i;)LJ8/n;

    move-result-object v3

    if-eqz v3, :cond_5

    return-object v3

    :cond_4
    :goto_2
    invoke-interface {p1, p2}, LJ8/o;->u0(LJ8/i;)LJ8/m;

    move-result-object p2

    invoke-interface {p1, p2, v2}, LJ8/o;->A0(LJ8/m;I)LJ8/n;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    return-object v3
.end method

.method private final n(LF8/d0;LJ8/j;)Z
    .locals 13

    .prologue
    invoke-virtual {p1}, LF8/d0;->j()LJ8/o;

    move-result-object v0

    invoke-interface {v0, p2}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v1

    invoke-interface {v0, v1}, LJ8/o;->X(LJ8/m;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, LJ8/o;->k0(LJ8/m;)Z

    move-result p1

    return p1

    :cond_0
    invoke-interface {v0, p2}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v1

    invoke-interface {v0, v1}, LJ8/o;->k0(LJ8/m;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    goto/16 :goto_4

    :cond_1
    invoke-virtual {p1}, LF8/d0;->k()V

    invoke-virtual {p1}, LF8/d0;->h()Ljava/util/ArrayDeque;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LF8/d0;->i()Ljava/util/Set;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, p2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v2

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    const/16 v5, 0x3e8

    if-gt v4, v5, :cond_7

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJ8/j;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v0, v4}, LJ8/o;->O(LJ8/j;)Z

    move-result v5

    if-eqz v5, :cond_3

    sget-object v5, LF8/d0$c$c;->a:LF8/d0$c$c;

    goto :goto_1

    :cond_3
    sget-object v5, LF8/d0$c$b;->a:LF8/d0$c$b;

    :goto_1
    sget-object v6, LF8/d0$c$c;->a:LF8/d0$c$c;

    invoke-static {v5, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    xor-int/2addr v6, v2

    if-eqz v6, :cond_4

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    :goto_2
    if-nez v5, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, LF8/d0;->j()LJ8/o;

    move-result-object v6

    invoke-interface {v6, v4}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v4

    invoke-interface {v6, v4}, LJ8/o;->J(LJ8/m;)Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJ8/i;

    invoke-virtual {v5, p1, v6}, LF8/d0$c;->a(LF8/d0;LJ8/i;)LJ8/j;

    move-result-object v6

    invoke-interface {v0, v6}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v7

    invoke-interface {v0, v7}, LJ8/o;->k0(LJ8/m;)Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-virtual {p1}, LF8/d0;->e()V

    goto :goto_4

    :cond_6
    invoke-virtual {v1, v6}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Too many supertypes for type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ". Supertypes = "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v4, v3

    check-cast v4, Ljava/lang/Iterable;

    const/16 v11, 0x3f

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, Lj7/v;->r0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-virtual {p1}, LF8/d0;->e()V

    const/4 v2, 0x0

    :goto_4
    return v2
.end method

.method private final o(LJ8/o;LJ8/i;)Z
    .locals 1

    .prologue
    invoke-interface {p1, p2}, LJ8/o;->u0(LJ8/i;)LJ8/m;

    move-result-object v0

    invoke-interface {p1, v0}, LJ8/o;->E(LJ8/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p2}, LJ8/o;->k(LJ8/i;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, LJ8/o;->x0(LJ8/i;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, LJ8/o;->D0(LJ8/i;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, LJ8/o;->z(LJ8/i;)LJ8/j;

    move-result-object v0

    invoke-interface {p1, v0}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v0

    invoke-interface {p1, p2}, LJ8/o;->G(LJ8/i;)LJ8/j;

    move-result-object p2

    invoke-interface {p1, p2}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final p(LJ8/o;LJ8/j;LJ8/j;)Z
    .locals 3

    .prologue
    invoke-interface {p1, p2}, LJ8/o;->t(LJ8/j;)LJ8/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, LJ8/o;->y0(LJ8/e;)LJ8/j;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p2

    :cond_1
    invoke-interface {p1, p3}, LJ8/o;->t(LJ8/j;)LJ8/e;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {p1, v1}, LJ8/o;->y0(LJ8/e;)LJ8/j;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    move-object v1, p3

    :cond_3
    invoke-interface {p1, v0}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v0

    invoke-interface {p1, v1}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_4

    return v2

    :cond_4
    invoke-interface {p1, p2}, LJ8/o;->x0(LJ8/i;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-interface {p1, p3}, LJ8/o;->x0(LJ8/i;)Z

    move-result v0

    if-eqz v0, :cond_5

    return v2

    :cond_5
    invoke-interface {p1, p2}, LJ8/o;->C0(LJ8/j;)Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1, p3}, LJ8/o;->C0(LJ8/j;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    const/4 p1, 0x1

    return p1
.end method

.method public static synthetic t(LF8/e;LF8/d0;LJ8/i;LJ8/i;ZILjava/lang/Object;)Z
    .locals 0

    .prologue
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, LF8/e;->s(LF8/d0;LJ8/i;LJ8/i;Z)Z

    move-result p0

    return p0
.end method

.method private final u(LF8/d0;LJ8/j;LJ8/j;)Z
    .locals 16

    .prologue
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual/range {p1 .. p1}, LF8/d0;->j()LJ8/o;

    move-result-object v3

    sget-boolean v4, LF8/e;->b:Z

    if-eqz v4, :cond_1

    invoke-interface {v3, v1}, LJ8/o;->f(LJ8/j;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v3, v1}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v4

    invoke-interface {v3, v4}, LJ8/o;->T(LJ8/m;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual/range {p1 .. p2}, LF8/d0;->l(LJ8/i;)Z

    move-result v4

    :cond_0
    invoke-interface {v3, v2}, LJ8/o;->f(LJ8/j;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0, v2}, LF8/d0;->l(LJ8/i;)Z

    move-result v4

    :cond_1
    sget-object v4, LF8/c;->a:LF8/c;

    invoke-virtual {v4, v0, v1, v2}, LF8/c;->d(LF8/d0;LJ8/j;LJ8/j;)Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_2

    return v5

    :cond_2
    sget-object v4, LF8/e;->a:LF8/e;

    invoke-interface {v3, v1}, LJ8/o;->z(LJ8/i;)LJ8/j;

    move-result-object v6

    invoke-interface {v3, v2}, LJ8/o;->G(LJ8/i;)LJ8/j;

    move-result-object v7

    invoke-direct {v4, v0, v6, v7}, LF8/e;->a(LF8/d0;LJ8/j;LJ8/j;)Ljava/lang/Boolean;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-static/range {v0 .. v5}, LF8/d0;->d(LF8/d0;LJ8/i;LJ8/i;ZILjava/lang/Object;)Ljava/lang/Boolean;

    return v6

    :cond_3
    invoke-interface {v3, v2}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v6

    invoke-interface {v3, v1}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v7

    invoke-interface {v3, v7, v6}, LJ8/o;->h0(LJ8/m;LJ8/m;)Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_4

    invoke-interface {v3, v6}, LJ8/o;->A(LJ8/m;)I

    move-result v7

    if-nez v7, :cond_4

    return v8

    :cond_4
    invoke-interface {v3, v2}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v7

    invoke-interface {v3, v7}, LJ8/o;->B0(LJ8/m;)Z

    move-result v7

    if-eqz v7, :cond_5

    return v8

    :cond_5
    invoke-virtual {v4, v0, v1, v6}, LF8/e;->l(LF8/d0;LJ8/j;LJ8/m;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v4, v9}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v7, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LJ8/j;

    invoke-virtual {v0, v10}, LF8/d0;->o(LJ8/i;)LJ8/i;

    move-result-object v11

    invoke-interface {v3, v11}, LJ8/o;->b(LJ8/i;)LJ8/j;

    move-result-object v11

    if-nez v11, :cond_6

    goto :goto_1

    :cond_6
    move-object v10, v11

    :goto_1
    invoke-interface {v7, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v4

    if-eqz v4, :cond_11

    if-eq v4, v8, :cond_10

    new-instance v4, LJ8/a;

    invoke-interface {v3, v6}, LJ8/o;->A(LJ8/m;)I

    move-result v10

    invoke-direct {v4, v10}, LJ8/a;-><init>(I)V

    invoke-interface {v3, v6}, LJ8/o;->A(LJ8/m;)I

    move-result v10

    move v11, v5

    move v12, v11

    :goto_2
    if-ge v11, v10, :cond_e

    if-nez v12, :cond_9

    invoke-interface {v3, v6, v11}, LJ8/o;->A0(LJ8/m;I)LJ8/n;

    move-result-object v12

    invoke-interface {v3, v12}, LJ8/o;->d0(LJ8/n;)LJ8/s;

    move-result-object v12

    sget-object v13, LJ8/s;->E:LJ8/s;

    if-eq v12, v13, :cond_8

    goto :goto_3

    :cond_8
    move v12, v5

    goto :goto_4

    :cond_9
    :goto_3
    move v12, v8

    :goto_4
    if-nez v12, :cond_d

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v7, v9}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_5
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_c

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LJ8/j;

    invoke-interface {v3, v15, v11}, LJ8/o;->Z(LJ8/j;I)LJ8/l;

    move-result-object v5

    if-eqz v5, :cond_b

    invoke-interface {v3, v5}, LJ8/o;->u(LJ8/l;)LJ8/s;

    move-result-object v9

    sget-object v8, LJ8/s;->F:LJ8/s;

    if-ne v9, v8, :cond_a

    goto :goto_6

    :cond_a
    const/4 v5, 0x0

    :goto_6
    if-eqz v5, :cond_b

    invoke-interface {v3, v5}, LJ8/o;->n0(LJ8/l;)LJ8/i;

    move-result-object v5

    if-eqz v5, :cond_b

    invoke-interface {v13, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v5, 0x0

    const/4 v8, 0x1

    const/16 v9, 0xa

    goto :goto_5

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Incorrect type: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", subType: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", superType: "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    invoke-interface {v3, v13}, LJ8/o;->I(Ljava/util/List;)LJ8/i;

    move-result-object v5

    invoke-interface {v3, v5}, LJ8/o;->y(LJ8/i;)LJ8/l;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_d
    add-int/lit8 v11, v11, 0x1

    const/4 v5, 0x0

    const/4 v8, 0x1

    const/16 v9, 0xa

    goto/16 :goto_2

    :cond_e
    if-nez v12, :cond_f

    sget-object v1, LF8/e;->a:LF8/e;

    invoke-virtual {v1, v0, v4, v2}, LF8/e;->q(LF8/d0;LJ8/k;LJ8/j;)Z

    move-result v1

    if-eqz v1, :cond_f

    const/4 v1, 0x1

    return v1

    :cond_f
    new-instance v1, LF8/e$b;

    invoke-direct {v1, v7, v0, v3, v2}, LF8/e$b;-><init>(Ljava/util/List;LF8/d0;LJ8/o;LJ8/j;)V

    invoke-virtual {v0, v1}, LF8/d0;->q(Lx7/l;)Z

    move-result v0

    return v0

    :cond_10
    sget-object v1, LF8/e;->a:LF8/e;

    invoke-static {v7}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJ8/j;

    invoke-interface {v3, v4}, LJ8/o;->j(LJ8/j;)LJ8/k;

    move-result-object v3

    invoke-virtual {v1, v0, v3, v2}, LF8/e;->q(LF8/d0;LJ8/k;LJ8/j;)Z

    move-result v0

    return v0

    :cond_11
    sget-object v2, LF8/e;->a:LF8/e;

    invoke-direct {v2, v0, v1}, LF8/e;->n(LF8/d0;LJ8/j;)Z

    move-result v0

    return v0
.end method

.method private final v(LJ8/o;LJ8/i;LJ8/i;LJ8/m;)Z
    .locals 1

    .prologue
    invoke-interface {p1, p2}, LJ8/o;->b(LJ8/i;)LJ8/j;

    move-result-object p2

    instance-of p4, p2, LJ8/d;

    const/4 v0, 0x0

    if-eqz p4, :cond_2

    check-cast p2, LJ8/d;

    invoke-interface {p1, p2}, LJ8/o;->Y(LJ8/d;)Z

    move-result p4

    if-nez p4, :cond_2

    invoke-interface {p1, p2}, LJ8/o;->q0(LJ8/d;)LJ8/c;

    move-result-object p4

    invoke-interface {p1, p4}, LJ8/o;->B(LJ8/c;)LJ8/l;

    move-result-object p4

    invoke-interface {p1, p4}, LJ8/o;->E0(LJ8/l;)Z

    move-result p4

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2}, LJ8/o;->m(LJ8/d;)LJ8/b;

    move-result-object p2

    sget-object p4, LJ8/b;->C:LJ8/b;

    if-eq p2, p4, :cond_1

    return v0

    :cond_1
    invoke-interface {p1, p3}, LJ8/o;->u0(LJ8/i;)LJ8/m;

    :cond_2
    :goto_0
    return v0
.end method

.method private final w(LF8/d0;Ljava/util/List;)Ljava/util/List;
    .locals 7

    .prologue
    invoke-virtual {p1}, LF8/d0;->j()LJ8/o;

    move-result-object p1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    return-object p2

    :cond_0
    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LJ8/j;

    invoke-interface {p1, v3}, LJ8/o;->j(LJ8/j;)LJ8/k;

    move-result-object v3

    invoke-interface {p1, v3}, LJ8/o;->s0(LJ8/k;)I

    move-result v4

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    invoke-interface {p1, v3, v5}, LJ8/o;->a0(LJ8/k;I)LJ8/l;

    move-result-object v6

    invoke-interface {p1, v6}, LJ8/o;->n0(LJ8/l;)LJ8/i;

    move-result-object v6

    invoke-interface {p1, v6}, LJ8/o;->t0(LJ8/i;)LJ8/g;

    move-result-object v6

    if-nez v6, :cond_1

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_4

    move-object p2, v1

    :cond_4
    return-object p2
.end method


# virtual methods
.method public final j(LJ8/s;LJ8/s;)LJ8/s;
    .locals 1

    .prologue
    const-string v0, "declared"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "useSite"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJ8/s;->F:LJ8/s;

    if-ne p1, v0, :cond_0

    return-object p2

    :cond_0
    if-ne p2, v0, :cond_1

    return-object p1

    :cond_1
    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final k(LF8/d0;LJ8/i;LJ8/i;)Z
    .locals 11

    .prologue
    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "a"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF8/d0;->j()LJ8/o;

    move-result-object v0

    const/4 v1, 0x1

    if-ne p2, p3, :cond_0

    return v1

    :cond_0
    sget-object v9, LF8/e;->a:LF8/e;

    invoke-direct {v9, v0, p2}, LF8/e;->o(LJ8/o;LJ8/i;)Z

    move-result v2

    const/4 v10, 0x0

    if-eqz v2, :cond_5

    invoke-direct {v9, v0, p3}, LF8/e;->o(LJ8/o;LJ8/i;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p1, p2}, LF8/d0;->p(LJ8/i;)LJ8/i;

    move-result-object v2

    invoke-virtual {p1, v2}, LF8/d0;->o(LJ8/i;)LJ8/i;

    move-result-object v2

    invoke-virtual {p1, p3}, LF8/d0;->p(LJ8/i;)LJ8/i;

    move-result-object v3

    invoke-virtual {p1, v3}, LF8/d0;->o(LJ8/i;)LJ8/i;

    move-result-object v3

    invoke-interface {v0, v2}, LJ8/o;->z(LJ8/i;)LJ8/j;

    move-result-object v4

    invoke-interface {v0, v2}, LJ8/o;->u0(LJ8/i;)LJ8/m;

    move-result-object v5

    invoke-interface {v0, v3}, LJ8/o;->u0(LJ8/i;)LJ8/m;

    move-result-object v6

    invoke-interface {v0, v5, v6}, LJ8/o;->h0(LJ8/m;LJ8/m;)Z

    move-result v5

    if-nez v5, :cond_1

    return v10

    :cond_1
    invoke-interface {v0, v4}, LJ8/o;->h(LJ8/i;)I

    move-result v5

    if-nez v5, :cond_5

    invoke-interface {v0, v2}, LJ8/o;->z0(LJ8/i;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-interface {v0, v3}, LJ8/o;->z0(LJ8/i;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v0, v4}, LJ8/o;->C0(LJ8/j;)Z

    move-result p1

    invoke-interface {v0, v3}, LJ8/o;->z(LJ8/i;)LJ8/j;

    move-result-object p2

    invoke-interface {v0, p2}, LJ8/o;->C0(LJ8/j;)Z

    move-result p2

    if-ne p1, p2, :cond_3

    goto :goto_0

    :cond_3
    move v1, v10

    :cond_4
    :goto_0
    return v1

    :cond_5
    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, v9

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v2 .. v8}, LF8/e;->t(LF8/e;LF8/d0;LJ8/i;LJ8/i;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, v9

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-static/range {v2 .. v8}, LF8/e;->t(LF8/e;LF8/d0;LJ8/i;LJ8/i;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_1

    :cond_6
    move v1, v10

    :goto_1
    return v1
.end method

.method public final l(LF8/d0;LJ8/j;LJ8/m;)Ljava/util/List;
    .locals 16

    .prologue
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "state"

    invoke-static {v0, v3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "subType"

    invoke-static {v1, v3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "superConstructor"

    invoke-static {v2, v3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LF8/d0;->j()LJ8/o;

    move-result-object v3

    invoke-interface {v3, v1}, LJ8/o;->O(LJ8/j;)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v3, LF8/e;->a:LF8/e;

    invoke-direct {v3, v0, v1, v2}, LF8/e;->h(LF8/d0;LJ8/j;LJ8/m;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v3, v2}, LJ8/o;->X(LJ8/m;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v3, v2}, LJ8/o;->f0(LJ8/m;)Z

    move-result v4

    if-nez v4, :cond_1

    sget-object v3, LF8/e;->a:LF8/e;

    invoke-direct {v3, v0, v1, v2}, LF8/e;->g(LF8/d0;LJ8/j;LJ8/m;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v4, LP8/f;

    invoke-direct {v4}, LP8/f;-><init>()V

    invoke-virtual/range {p1 .. p1}, LF8/d0;->k()V

    invoke-virtual/range {p1 .. p1}, LF8/d0;->h()Ljava/util/ArrayDeque;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, LF8/d0;->i()Ljava/util/Set;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    xor-int/lit8 v7, v7, 0x1

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Set;->size()I

    move-result v7

    const/16 v8, 0x3e8

    if-gt v7, v8, :cond_6

    invoke-virtual {v5}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LJ8/j;

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v6, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v3, v7}, LJ8/o;->O(LJ8/j;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v4, v7}, LP8/f;->add(Ljava/lang/Object;)Z

    sget-object v8, LF8/d0$c$c;->a:LF8/d0$c$c;

    goto :goto_1

    :cond_3
    sget-object v8, LF8/d0$c$b;->a:LF8/d0$c$b;

    :goto_1
    sget-object v9, LF8/d0$c$c;->a:LF8/d0$c$c;

    invoke-static {v8, v9}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    xor-int/lit8 v9, v9, 0x1

    if-eqz v9, :cond_4

    goto :goto_2

    :cond_4
    const/4 v8, 0x0

    :goto_2
    if-nez v8, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual/range {p1 .. p1}, LF8/d0;->j()LJ8/o;

    move-result-object v9

    invoke-interface {v9, v7}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v7

    invoke-interface {v9, v7}, LJ8/o;->J(LJ8/m;)Ljava/util/Collection;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LJ8/i;

    invoke-virtual {v8, v0, v9}, LF8/d0$c;->a(LF8/d0;LJ8/i;)LJ8/j;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Too many supertypes for type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Supertypes = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v7, v6

    check-cast v7, Ljava/lang/Iterable;

    const/16 v14, 0x3f

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v7 .. v15}, Lj7/v;->r0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    invoke-virtual/range {p1 .. p1}, LF8/d0;->e()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJ8/j;

    sget-object v5, LF8/e;->a:LF8/e;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {v5, v0, v4, v2}, LF8/e;->h(LF8/d0;LJ8/j;LJ8/m;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v1, v4}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_4

    :cond_8
    return-object v1
.end method

.method public final q(LF8/d0;LJ8/k;LJ8/j;)Z
    .locals 16

    .prologue
    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    const-string v0, "<this>"

    invoke-static {v7, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "capturedSubArguments"

    invoke-static {v8, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "superType"

    invoke-static {v9, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LF8/d0;->j()LJ8/o;

    move-result-object v10

    invoke-interface {v10, v9}, LJ8/o;->e(LJ8/j;)LJ8/m;

    move-result-object v11

    invoke-interface {v10, v8}, LJ8/o;->s0(LJ8/k;)I

    move-result v0

    invoke-interface {v10, v11}, LJ8/o;->A(LJ8/m;)I

    move-result v12

    const/4 v13, 0x0

    if-ne v0, v12, :cond_9

    invoke-interface {v10, v9}, LJ8/o;->h(LJ8/i;)I

    move-result v1

    if-eq v0, v1, :cond_0

    goto/16 :goto_4

    :cond_0
    move v14, v13

    :goto_0
    const/4 v0, 0x1

    if-ge v14, v12, :cond_8

    invoke-interface {v10, v9, v14}, LJ8/o;->c0(LJ8/i;I)LJ8/l;

    move-result-object v1

    invoke-interface {v10, v1}, LJ8/o;->E0(LJ8/l;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-interface {v10, v1}, LJ8/o;->n0(LJ8/l;)LJ8/i;

    move-result-object v3

    invoke-interface {v10, v8, v14}, LJ8/o;->a0(LJ8/k;I)LJ8/l;

    move-result-object v2

    invoke-interface {v10, v2}, LJ8/o;->u(LJ8/l;)LJ8/s;

    sget-object v4, LJ8/s;->F:LJ8/s;

    invoke-interface {v10, v2}, LJ8/o;->n0(LJ8/l;)LJ8/i;

    move-result-object v5

    sget-object v2, LF8/e;->a:LF8/e;

    invoke-interface {v10, v11, v14}, LJ8/o;->A0(LJ8/m;I)LJ8/n;

    move-result-object v6

    invoke-interface {v10, v6}, LJ8/o;->d0(LJ8/n;)LJ8/s;

    move-result-object v6

    invoke-interface {v10, v1}, LJ8/o;->u(LJ8/l;)LJ8/s;

    move-result-object v1

    invoke-virtual {v2, v6, v1}, LF8/e;->j(LJ8/s;LJ8/s;)LJ8/s;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual/range {p1 .. p1}, LF8/d0;->m()Z

    move-result v0

    return v0

    :cond_1
    if-ne v1, v4, :cond_2

    invoke-direct {v2, v10, v5, v3, v11}, LF8/e;->v(LJ8/o;LJ8/i;LJ8/i;LJ8/m;)Z

    move-result v4

    if-nez v4, :cond_7

    invoke-direct {v2, v10, v3, v5, v11}, LF8/e;->v(LJ8/o;LJ8/i;LJ8/i;LJ8/m;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-static/range {p1 .. p1}, LF8/d0;->a(LF8/d0;)I

    move-result v4

    const/16 v6, 0x64

    if-gt v4, v6, :cond_6

    invoke-static/range {p1 .. p1}, LF8/d0;->a(LF8/d0;)I

    move-result v4

    add-int/2addr v4, v0

    invoke-static {v7, v4}, LF8/d0;->b(LF8/d0;I)V

    sget-object v4, LF8/e$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v4, v1

    if-eq v1, v0, :cond_5

    const/4 v0, 0x2

    if-eq v1, v0, :cond_4

    const/4 v0, 0x3

    if-ne v1, v0, :cond_3

    const/16 v6, 0x8

    const/4 v15, 0x0

    const/4 v4, 0x0

    move-object v0, v2

    move-object/from16 v1, p1

    move-object v2, v3

    move-object v3, v5

    :goto_1
    move v5, v6

    move-object v6, v15

    invoke-static/range {v0 .. v6}, LF8/e;->t(LF8/e;LF8/d0;LJ8/i;LJ8/i;ZILjava/lang/Object;)Z

    move-result v0

    goto :goto_2

    :cond_3
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_4
    const/16 v6, 0x8

    const/4 v15, 0x0

    const/4 v4, 0x0

    move-object v0, v2

    move-object/from16 v1, p1

    move-object v2, v5

    goto :goto_1

    :cond_5
    invoke-virtual {v2, v7, v5, v3}, LF8/e;->k(LF8/d0;LJ8/i;LJ8/i;)Z

    move-result v0

    :goto_2
    invoke-static/range {p1 .. p1}, LF8/d0;->a(LF8/d0;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v7, v1}, LF8/d0;->b(LF8/d0;I)V

    if-nez v0, :cond_7

    return v13

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Arguments depth is too high. Some related argument: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_3
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_0

    :cond_8
    return v0

    :cond_9
    :goto_4
    return v13
.end method

.method public final r(LF8/d0;LJ8/i;LJ8/i;)Z
    .locals 8

    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subType"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "superType"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v7}, LF8/e;->t(LF8/e;LF8/d0;LJ8/i;LJ8/i;ZILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final s(LF8/d0;LJ8/i;LJ8/i;Z)Z
    .locals 1

    .prologue
    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subType"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "superType"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne p2, p3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p1, p2, p3}, LF8/d0;->f(LJ8/i;LJ8/i;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, LF8/e;->i(LF8/d0;LJ8/i;LJ8/i;Z)Z

    move-result p1

    return p1
.end method
