.class public abstract Lf8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final B(Lf8/i;Lf8/i;)Lf8/i;
    .locals 2

    .prologue
    if-nez p1, :cond_0

    return-object p2

    :cond_0
    if-nez p2, :cond_1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lf8/i;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lf8/i;->d()Z

    move-result v0

    if-nez v0, :cond_2

    return-object p2

    :cond_2
    invoke-virtual {p1}, Lf8/i;->d()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p2}, Lf8/i;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    return-object p1

    :cond_3
    invoke-virtual {p1}, Lf8/i;->c()Lf8/h;

    move-result-object v0

    invoke-virtual {p2}, Lf8/i;->c()Lf8/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_4

    return-object p2

    :cond_4
    invoke-virtual {p1}, Lf8/i;->c()Lf8/h;

    move-result-object v0

    invoke-virtual {p2}, Lf8/i;->c()Lf8/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-lez v0, :cond_5

    return-object p1

    :cond_5
    return-object p2
.end method

.method private final C(LJ8/i;)Ljava/util/List;
    .locals 4

    invoke-virtual {p0}, Lf8/a;->v()LJ8/o;

    move-result-object v0

    new-instance v1, Lf8/a$a;

    invoke-virtual {p0}, Lf8/a;->n()LX7/y;

    move-result-object v2

    invoke-direct {p0, p1, v2}, Lf8/a;->c(LJ8/i;LX7/y;)LX7/y;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lf8/a$a;-><init>(LJ8/i;LX7/y;LJ8/n;)V

    new-instance p1, Lf8/a$d;

    invoke-direct {p1, p0, v0}, Lf8/a$d;-><init>(Lf8/a;LJ8/o;)V

    invoke-direct {p0, v1, p1}, Lf8/a;->f(Ljava/lang/Object;Lx7/l;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic a(Lf8/a;LJ8/i;LX7/y;)LX7/y;
    .locals 0

    invoke-direct {p0, p1, p2}, Lf8/a;->c(LJ8/i;LX7/y;)LX7/y;

    move-result-object p0

    return-object p0
.end method

.method private final c(LJ8/i;LX7/y;)LX7/y;
    .locals 1

    invoke-virtual {p0}, Lf8/a;->i()LX7/a;

    move-result-object v0

    invoke-virtual {p0, p1}, Lf8/a;->j(LJ8/i;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, LX7/a;->c(LX7/y;Ljava/lang/Iterable;)LX7/y;

    move-result-object p1

    return-object p1
.end method

.method private final d(LJ8/i;)Lf8/e;
    .locals 6

    .prologue
    invoke-direct {p0, p1}, Lf8/a;->t(LJ8/i;)Lf8/h;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lf8/a;->q(LJ8/i;)LJ8/i;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v2}, Lf8/a;->t(LJ8/i;)Lf8/h;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    invoke-virtual {p0}, Lf8/a;->v()LJ8/o;

    move-result-object v3

    sget-object v4, LN7/c;->a:LN7/c;

    invoke-interface {v3, p1}, LJ8/o;->z(LJ8/i;)LJ8/j;

    move-result-object v5

    invoke-virtual {p0, v5}, Lf8/a;->s(LJ8/i;)Ln8/d;

    move-result-object v5

    invoke-virtual {v4, v5}, LN7/c;->l(Ln8/d;)Z

    move-result v5

    if-eqz v5, :cond_2

    sget-object v1, Lf8/f;->C:Lf8/f;

    goto :goto_1

    :cond_2
    invoke-interface {v3, p1}, LJ8/o;->G(LJ8/i;)LJ8/j;

    move-result-object v3

    invoke-virtual {p0, v3}, Lf8/a;->s(LJ8/i;)Ln8/d;

    move-result-object v3

    invoke-virtual {v4, v3}, LN7/c;->k(Ln8/d;)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v1, Lf8/f;->D:Lf8/f;

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lf8/a;->v()LJ8/o;

    move-result-object v3

    invoke-interface {v3, p1}, LJ8/o;->x0(LJ8/i;)Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_5

    invoke-virtual {p0, p1}, Lf8/a;->A(LJ8/i;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    move p1, v5

    goto :goto_3

    :cond_5
    :goto_2
    move p1, v4

    :goto_3
    new-instance v3, Lf8/e;

    if-eq v2, v0, :cond_6

    goto :goto_4

    :cond_6
    move v4, v5

    :goto_4
    invoke-direct {v3, v2, v1, p1, v4}, Lf8/e;-><init>(Lf8/h;Lf8/f;ZZ)V

    return-object v3
.end method

.method private final e(Lf8/a$a;)Lf8/e;
    .locals 11

    .prologue
    invoke-virtual {p1}, Lf8/a$a;->b()LJ8/i;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lf8/a;->v()LJ8/o;

    move-result-object v0

    invoke-virtual {p1}, Lf8/a$a;->c()LJ8/n;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, LJ8/o;->d0(LJ8/n;)LJ8/s;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sget-object v2, LJ8/s;->D:LJ8/s;

    if-ne v0, v2, :cond_1

    sget-object p1, Lf8/e;->e:Lf8/e$a;

    invoke-virtual {p1}, Lf8/e$a;->a()Lf8/e;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lf8/a$a;->c()LJ8/n;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    invoke-virtual {p1}, Lf8/a$a;->b()LJ8/i;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {p0, v4}, Lf8/a;->j(LJ8/i;)Ljava/lang/Iterable;

    move-result-object v4

    if-nez v4, :cond_4

    :cond_3
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    :cond_4
    invoke-virtual {p0}, Lf8/a;->v()LJ8/o;

    move-result-object v5

    invoke-virtual {p1}, Lf8/a$a;->b()LJ8/i;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-interface {v5, v6}, LJ8/o;->u0(LJ8/i;)LJ8/m;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-interface {v5, v6}, LJ8/o;->i0(LJ8/m;)LJ8/n;

    move-result-object v5

    goto :goto_2

    :cond_5
    move-object v5, v1

    :goto_2
    invoke-virtual {p0}, Lf8/a;->m()LX7/b;

    move-result-object v6

    sget-object v7, LX7/b;->H:LX7/b;

    if-ne v6, v7, :cond_6

    move v6, v3

    goto :goto_3

    :cond_6
    move v6, v2

    :goto_3
    if-nez v0, :cond_7

    goto :goto_6

    :cond_7
    if-nez v6, :cond_a

    invoke-virtual {p0}, Lf8/a;->p()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-virtual {p1}, Lf8/a$a;->b()LJ8/i;

    move-result-object v7

    if-eqz v7, :cond_a

    invoke-virtual {p0, v7}, Lf8/a;->w(LJ8/i;)Z

    move-result v7

    if-ne v7, v3, :cond_a

    invoke-virtual {p0}, Lf8/a;->l()Ljava/lang/Iterable;

    move-result-object v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_8
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {p0}, Lf8/a;->i()LX7/a;

    move-result-object v10

    invoke-virtual {v10, v9}, LX7/a;->m(Ljava/lang/Object;)Z

    move-result v10

    xor-int/2addr v10, v3

    if-eqz v10, :cond_8

    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    invoke-static {v8, v4}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    :goto_5
    check-cast v4, Ljava/lang/Iterable;

    goto :goto_6

    :cond_a
    invoke-virtual {p0}, Lf8/a;->l()Ljava/lang/Iterable;

    move-result-object v7

    invoke-static {v7, v4}, Lj7/v;->A0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    goto :goto_5

    :goto_6
    invoke-virtual {p0}, Lf8/a;->i()LX7/a;

    move-result-object v7

    invoke-virtual {v7, v4}, LX7/a;->e(Ljava/lang/Iterable;)Lf8/f;

    move-result-object v7

    invoke-virtual {p0}, Lf8/a;->i()LX7/a;

    move-result-object v8

    new-instance v9, Lf8/a$c;

    invoke-direct {v9, p0, p1}, Lf8/a$c;-><init>(Lf8/a;Lf8/a$a;)V

    invoke-virtual {v8, v4, v9}, LX7/a;->f(Ljava/lang/Iterable;Lx7/l;)Lf8/i;

    move-result-object v4

    if-eqz v4, :cond_c

    new-instance p1, Lf8/e;

    invoke-virtual {v4}, Lf8/i;->c()Lf8/h;

    move-result-object v0

    invoke-virtual {v4}, Lf8/i;->c()Lf8/h;

    move-result-object v1

    sget-object v6, Lf8/h;->E:Lf8/h;

    if-ne v1, v6, :cond_b

    if-eqz v5, :cond_b

    move v2, v3

    :cond_b
    invoke-virtual {v4}, Lf8/i;->d()Z

    move-result v1

    invoke-direct {p1, v0, v7, v2, v1}, Lf8/e;-><init>(Lf8/h;Lf8/f;ZZ)V

    return-object p1

    :cond_c
    if-nez v0, :cond_e

    if-eqz v6, :cond_d

    goto :goto_7

    :cond_d
    sget-object v0, LX7/b;->G:LX7/b;

    goto :goto_8

    :cond_e
    :goto_7
    invoke-virtual {p0}, Lf8/a;->m()LX7/b;

    move-result-object v0

    :goto_8
    invoke-virtual {p1}, Lf8/a$a;->a()LX7/y;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-virtual {v4, v0}, LX7/y;->a(LX7/b;)LX7/r;

    move-result-object v0

    goto :goto_9

    :cond_f
    move-object v0, v1

    :goto_9
    if-eqz v5, :cond_10

    invoke-direct {p0, v5}, Lf8/a;->k(LJ8/n;)Lf8/i;

    move-result-object v4

    goto :goto_a

    :cond_10
    move-object v4, v1

    :goto_a
    const/4 v6, 0x2

    if-eqz v4, :cond_11

    sget-object v8, Lf8/h;->E:Lf8/h;

    invoke-static {v4, v8, v2, v6, v1}, Lf8/i;->b(Lf8/i;Lf8/h;ZILjava/lang/Object;)Lf8/i;

    move-result-object v8

    if-nez v8, :cond_13

    :cond_11
    if-eqz v0, :cond_12

    invoke-virtual {v0}, LX7/r;->d()Lf8/i;

    move-result-object v8

    goto :goto_b

    :cond_12
    move-object v8, v1

    :cond_13
    :goto_b
    if-eqz v4, :cond_14

    invoke-virtual {v4}, Lf8/i;->c()Lf8/h;

    move-result-object v4

    goto :goto_c

    :cond_14
    move-object v4, v1

    :goto_c
    sget-object v9, Lf8/h;->E:Lf8/h;

    if-eq v4, v9, :cond_16

    if-eqz v5, :cond_15

    if-eqz v0, :cond_15

    invoke-virtual {v0}, LX7/r;->c()Z

    move-result v0

    if-ne v0, v3, :cond_15

    goto :goto_d

    :cond_15
    move v0, v2

    goto :goto_e

    :cond_16
    :goto_d
    move v0, v3

    :goto_e
    invoke-virtual {p1}, Lf8/a$a;->c()LJ8/n;

    move-result-object p1

    if-eqz p1, :cond_17

    invoke-direct {p0, p1}, Lf8/a;->k(LJ8/n;)Lf8/i;

    move-result-object p1

    if-eqz p1, :cond_17

    invoke-virtual {p1}, Lf8/i;->c()Lf8/h;

    move-result-object v4

    sget-object v5, Lf8/h;->D:Lf8/h;

    if-ne v4, v5, :cond_18

    sget-object v4, Lf8/h;->C:Lf8/h;

    invoke-static {p1, v4, v2, v6, v1}, Lf8/i;->b(Lf8/i;Lf8/h;ZILjava/lang/Object;)Lf8/i;

    move-result-object p1

    goto :goto_f

    :cond_17
    move-object p1, v1

    :cond_18
    :goto_f
    invoke-direct {p0, p1, v8}, Lf8/a;->B(Lf8/i;Lf8/i;)Lf8/i;

    move-result-object p1

    new-instance v4, Lf8/e;

    if-eqz p1, :cond_19

    invoke-virtual {p1}, Lf8/i;->c()Lf8/h;

    move-result-object v1

    :cond_19
    if-eqz p1, :cond_1a

    invoke-virtual {p1}, Lf8/i;->d()Z

    move-result p1

    if-ne p1, v3, :cond_1a

    move v2, v3

    :cond_1a
    invoke-direct {v4, v1, v7, v0, v2}, Lf8/e;-><init>(Lf8/h;Lf8/f;ZZ)V

    return-object v4
.end method

.method private final f(Ljava/lang/Object;Lx7/l;)Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p0, p1, v0, p2}, Lf8/a;->g(Ljava/lang/Object;Ljava/util/List;Lx7/l;)V

    return-object v0
.end method

.method private final g(Ljava/lang/Object;Ljava/util/List;Lx7/l;)V
    .locals 1

    .prologue
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p3, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, Lf8/a;->g(Ljava/lang/Object;Ljava/util/List;Lx7/l;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final k(LJ8/n;)Lf8/i;
    .locals 6

    .prologue
    invoke-virtual {p0}, Lf8/a;->v()LJ8/o;

    move-result-object v0

    invoke-virtual {p0, p1}, Lf8/a;->z(LJ8/n;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    invoke-interface {v0, p1}, LJ8/o;->x(LJ8/n;)Ljava/util/List;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_1

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_6

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJ8/i;

    invoke-interface {v0, v5}, LJ8/o;->Q(LJ8/i;)Z

    move-result v5

    if-nez v5, :cond_2

    if-eqz v3, :cond_3

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJ8/i;

    invoke-direct {p0, v5}, Lf8/a;->t(LJ8/i;)Lf8/h;

    move-result-object v5

    if-eqz v5, :cond_4

    move-object v2, p1

    goto :goto_2

    :cond_5
    :goto_0
    if-eqz v3, :cond_6

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_6

    goto/16 :goto_6

    :cond_6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJ8/i;

    invoke-virtual {p0, v4}, Lf8/a;->q(LJ8/i;)LJ8/i;

    move-result-object v4

    if-eqz v4, :cond_7

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJ8/i;

    invoke-virtual {p0, v3}, Lf8/a;->q(LJ8/i;)LJ8/i;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_9
    :goto_2
    move-object v1, v2

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_a

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_3

    :cond_a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJ8/i;

    invoke-interface {v0, v3}, LJ8/o;->p(LJ8/i;)Z

    move-result v3

    if-nez v3, :cond_b

    sget-object v0, Lf8/h;->E:Lf8/h;

    goto :goto_4

    :cond_c
    :goto_3
    sget-object v0, Lf8/h;->D:Lf8/h;

    :goto_4
    new-instance v1, Lf8/i;

    if-eq v2, p1, :cond_d

    const/4 p1, 0x1

    goto :goto_5

    :cond_d
    const/4 p1, 0x0

    :goto_5
    invoke-direct {v1, v0, p1}, Lf8/i;-><init>(Lf8/h;Z)V

    return-object v1

    :cond_e
    :goto_6
    return-object v2
.end method

.method private final t(LJ8/i;)Lf8/h;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lf8/a;->v()LJ8/o;

    move-result-object v0

    invoke-interface {v0, p1}, LJ8/o;->z(LJ8/i;)LJ8/j;

    move-result-object v1

    invoke-interface {v0, v1}, LJ8/o;->C0(LJ8/j;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Lf8/h;->D:Lf8/h;

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, LJ8/o;->G(LJ8/i;)LJ8/j;

    move-result-object p1

    invoke-interface {v0, p1}, LJ8/o;->C0(LJ8/j;)Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Lf8/h;->E:Lf8/h;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public abstract A(LJ8/i;)Z
.end method

.method public final b(LJ8/i;Ljava/lang/Iterable;Lf8/q;Z)Lx7/l;
    .locals 9

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overrides"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lf8/a;->C(LJ8/i;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p2, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJ8/i;

    invoke-direct {p0, v3}, Lf8/a;->C(LJ8/i;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lf8/a;->r()Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_4

    invoke-virtual {p0}, Lf8/a;->x()Z

    move-result v2

    if-eqz v2, :cond_3

    instance-of v2, p2, Ljava/util/Collection;

    if-eqz v2, :cond_1

    move-object v2, p2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJ8/i;

    invoke-virtual {p0, p1, v2}, Lf8/a;->y(LJ8/i;LJ8/i;)Z

    move-result v2

    xor-int/2addr v2, v3

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    goto :goto_3

    :cond_4
    :goto_2
    move p1, v3

    :goto_3
    new-array p2, p1, [Lf8/e;

    const/4 v2, 0x0

    move v4, v2

    :goto_4
    if-ge v4, p1, :cond_a

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf8/a$a;

    invoke-direct {p0, v5}, Lf8/a;->e(Lf8/a$a;)Lf8/e;

    move-result-object v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_5
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v8, v4}, Lj7/v;->l0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lf8/a$a;

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Lf8/a$a;->b()LJ8/i;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-direct {p0, v8}, Lf8/a;->d(LJ8/i;)Lf8/e;

    move-result-object v8

    goto :goto_6

    :cond_6
    const/4 v8, 0x0

    :goto_6
    if-eqz v8, :cond_5

    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_7
    if-nez v4, :cond_8

    invoke-virtual {p0}, Lf8/a;->x()Z

    move-result v7

    if-eqz v7, :cond_8

    move v7, v3

    goto :goto_7

    :cond_8
    move v7, v2

    :goto_7
    if-nez v4, :cond_9

    invoke-virtual {p0}, Lf8/a;->o()Z

    move-result v8

    if-eqz v8, :cond_9

    move v8, v3

    goto :goto_8

    :cond_9
    move v8, v2

    :goto_8
    invoke-static {v5, v6, v7, v8, p4}, Lf8/s;->a(Lf8/e;Ljava/util/Collection;ZZZ)Lf8/e;

    move-result-object v5

    aput-object v5, p2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_a
    new-instance p1, Lf8/a$b;

    invoke-direct {p1, p3, p2}, Lf8/a$b;-><init>(Lf8/q;[Lf8/e;)V

    return-object p1
.end method

.method public abstract h(Ljava/lang/Object;LJ8/i;)Z
.end method

.method public abstract i()LX7/a;
.end method

.method public abstract j(LJ8/i;)Ljava/lang/Iterable;
.end method

.method public abstract l()Ljava/lang/Iterable;
.end method

.method public abstract m()LX7/b;
.end method

.method public abstract n()LX7/y;
.end method

.method public abstract o()Z
.end method

.method public abstract p()Z
.end method

.method public abstract q(LJ8/i;)LJ8/i;
.end method

.method public r()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract s(LJ8/i;)Ln8/d;
.end method

.method public abstract u()Z
.end method

.method public abstract v()LJ8/o;
.end method

.method public abstract w(LJ8/i;)Z
.end method

.method public abstract x()Z
.end method

.method public abstract y(LJ8/i;LJ8/i;)Z
.end method

.method public abstract z(LJ8/n;)Z
.end method
