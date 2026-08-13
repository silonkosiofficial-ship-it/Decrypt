.class public final LF8/V;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/V$a;
    }
.end annotation


# static fields
.field public static final c:LF8/V$a;

.field private static final d:LF8/V;


# instance fields
.field private final a:LF8/X;

.field private final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LF8/V$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF8/V$a;-><init>(Ly7/k;)V

    sput-object v0, LF8/V;->c:LF8/V$a;

    new-instance v0, LF8/V;

    sget-object v1, LF8/X$a;->a:LF8/X$a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LF8/V;-><init>(LF8/X;Z)V

    sput-object v0, LF8/V;->d:LF8/V;

    return-void
.end method

.method public constructor <init>(LF8/X;Z)V
    .locals 1

    const-string v0, "reportStrategy"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF8/V;->a:LF8/X;

    iput-boolean p2, p0, LF8/V;->b:Z

    return-void
.end method

.method private final a(LP7/g;LP7/g;)V
    .locals 2

    .prologue
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP7/c;

    invoke-interface {v1}, LP7/c;->e()Ln8/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LP7/c;

    invoke-interface {p2}, LP7/c;->e()Ln8/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LF8/V;->a:LF8/X;

    invoke-interface {v1, p2}, LF8/X;->b(LP7/c;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method private final b(LF8/E;LF8/E;)V
    .locals 7

    .prologue
    invoke-static {p2}, LF8/n0;->f(LF8/E;)LF8/n0;

    move-result-object v0

    const-string v1, "create(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LF8/E;->U0()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    invoke-static {}, Lj7/v;->w()V

    :cond_0
    check-cast v2, LF8/i0;

    invoke-interface {v2}, LF8/i0;->b()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v2}, LF8/i0;->getType()LF8/E;

    move-result-object v4

    const-string v5, "getType(...)"

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, LK8/a;->d(LF8/E;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {p1}, LF8/E;->U0()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LF8/i0;

    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object v6

    invoke-interface {v6}, LF8/e0;->x()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7/f0;

    iget-boolean v6, p0, LF8/V;->b:Z

    if-eqz v6, :cond_1

    iget-object v6, p0, LF8/V;->a:LF8/X;

    invoke-interface {v4}, LF8/i0;->getType()LF8/E;

    move-result-object v4

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, LF8/i0;->getType()LF8/E;

    move-result-object v2

    invoke-static {v2, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v6, v0, v4, v2, v1}, LF8/X;->a(LF8/n0;LF8/E;LF8/E;LO7/f0;)V

    :cond_1
    move v1, v3

    goto :goto_0

    :cond_2
    return-void
.end method

.method private final c(LF8/M;LF8/a0;)LF8/M;
    .locals 2

    .prologue
    invoke-static {p1}, LF8/G;->a(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p2}, LF8/V;->g(LF8/E;LF8/a0;)LF8/a0;

    move-result-object p2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, p2, v0, v1}, LF8/m0;->f(LF8/M;Ljava/util/List;LF8/a0;ILjava/lang/Object;)LF8/M;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final d(LF8/M;LF8/E;)LF8/M;
    .locals 0

    invoke-virtual {p2}, LF8/E;->X0()Z

    move-result p2

    invoke-static {p1, p2}, LF8/q0;->r(LF8/M;Z)LF8/M;

    move-result-object p1

    const-string p2, "makeNullableIfNeeded(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final e(LF8/M;LF8/E;)LF8/M;
    .locals 0

    invoke-direct {p0, p1, p2}, LF8/V;->d(LF8/M;LF8/E;)LF8/M;

    move-result-object p1

    invoke-virtual {p2}, LF8/E;->V0()LF8/a0;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LF8/V;->c(LF8/M;LF8/a0;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method private final f(LF8/W;LF8/a0;Z)LF8/M;
    .locals 2

    invoke-virtual {p1}, LF8/W;->b()LO7/e0;

    move-result-object v0

    invoke-interface {v0}, LO7/h;->p()LF8/e0;

    move-result-object v0

    const-string v1, "getTypeConstructor(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF8/W;->a()Ljava/util/List;

    move-result-object p1

    sget-object v1, Ly8/h$b;->b:Ly8/h$b;

    invoke-static {p2, v0, p1, p3, v1}, LF8/F;->m(LF8/a0;LF8/e0;Ljava/util/List;ZLy8/h;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method private final g(LF8/E;LF8/a0;)LF8/a0;
    .locals 1

    .prologue
    invoke-static {p1}, LF8/G;->a(LF8/E;)Z

    move-result v0

    invoke-virtual {p1}, LF8/E;->V0()LF8/a0;

    move-result-object p1

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p2, p1}, LF8/a0;->s(LF8/a0;)LF8/a0;

    move-result-object p1

    return-object p1
.end method

.method private final i(LF8/i0;LF8/W;I)LF8/i0;
    .locals 11

    .prologue
    invoke-interface {p1}, LF8/i0;->getType()LF8/E;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->Z0()LF8/t0;

    move-result-object v0

    invoke-static {v0}, LF8/u;->a(LF8/E;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p1

    :cond_0
    invoke-static {v0}, LF8/m0;->a(LF8/E;)LF8/M;

    move-result-object v0

    invoke-static {v0}, LF8/G;->a(LF8/E;)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-static {v0}, LK8/a;->z(LF8/E;)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v1

    invoke-interface {v1}, LF8/e0;->w()LO7/h;

    move-result-object v2

    invoke-interface {v1}, LF8/e0;->x()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    invoke-virtual {v0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    instance-of v3, v2, LO7/f0;

    if-eqz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    instance-of v3, v2, LO7/e0;

    if-eqz v3, :cond_7

    check-cast v2, LO7/e0;

    invoke-virtual {p2, v2}, LF8/W;->d(LO7/e0;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object p1, p0, LF8/V;->a:LF8/X;

    invoke-interface {p1, v2}, LF8/X;->d(LO7/e0;)V

    new-instance p1, LF8/k0;

    sget-object p2, LF8/u0;->G:LF8/u0;

    sget-object p3, LH8/j;->U:LH8/j;

    invoke-interface {v2}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object p3

    invoke-direct {p1, p2, p3}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    return-object p1

    :cond_3
    invoke-virtual {v0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v5, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    if-gez v5, :cond_4

    invoke-static {}, Lj7/v;->w()V

    :cond_4
    check-cast v6, LF8/i0;

    invoke-interface {v1}, LF8/e0;->x()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LO7/f0;

    add-int/lit8 v8, p3, 0x1

    invoke-direct {p0, v6, p2, v5, v8}, LF8/V;->k(LF8/i0;LF8/W;LO7/f0;I)LF8/i0;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v5, v7

    goto :goto_0

    :cond_5
    sget-object v1, LF8/W;->e:LF8/W$a;

    invoke-virtual {v1, p2, v2, v4}, LF8/W$a;->a(LF8/W;LO7/e0;Ljava/util/List;)LF8/W;

    move-result-object v6

    invoke-virtual {v0}, LF8/E;->V0()LF8/a0;

    move-result-object v7

    invoke-virtual {v0}, LF8/E;->X0()Z

    move-result v8

    add-int/lit8 v9, p3, 0x1

    const/4 v10, 0x0

    move-object v5, p0

    invoke-direct/range {v5 .. v10}, LF8/V;->j(LF8/W;LF8/a0;ZIZ)LF8/M;

    move-result-object v1

    invoke-direct {p0, v0, p2, p3}, LF8/V;->l(LF8/M;LF8/W;I)LF8/M;

    move-result-object p2

    invoke-static {v1}, LF8/u;->a(LF8/E;)Z

    move-result p3

    if-eqz p3, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {v1, p2}, LF8/Q;->j(LF8/M;LF8/M;)LF8/M;

    move-result-object v1

    :goto_1
    new-instance p2, LF8/k0;

    invoke-interface {p1}, LF8/i0;->a()LF8/u0;

    move-result-object p1

    invoke-direct {p2, p1, v1}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    move-object p1, p2

    goto :goto_2

    :cond_7
    invoke-direct {p0, v0, p2, p3}, LF8/V;->l(LF8/M;LF8/W;I)LF8/M;

    move-result-object p2

    invoke-direct {p0, v0, p2}, LF8/V;->b(LF8/E;LF8/E;)V

    new-instance p3, LF8/k0;

    invoke-interface {p1}, LF8/i0;->a()LF8/u0;

    move-result-object p1

    invoke-direct {p3, p1, p2}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    move-object p1, p3

    :cond_8
    :goto_2
    return-object p1
.end method

.method private final j(LF8/W;LF8/a0;ZIZ)LF8/M;
    .locals 3

    .prologue
    new-instance v0, LF8/k0;

    sget-object v1, LF8/u0;->G:LF8/u0;

    invoke-virtual {p1}, LF8/W;->b()LO7/e0;

    move-result-object v2

    invoke-interface {v2}, LO7/e0;->o0()LF8/M;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1, p4}, LF8/V;->k(LF8/i0;LF8/W;LO7/f0;I)LF8/i0;

    move-result-object p4

    invoke-interface {p4}, LF8/i0;->getType()LF8/E;

    move-result-object v0

    const-string v1, "getType(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LF8/m0;->a(LF8/E;)LF8/M;

    move-result-object v0

    invoke-static {v0}, LF8/G;->a(LF8/E;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p4}, LF8/i0;->a()LF8/u0;

    invoke-virtual {v0}, LF8/E;->k()LP7/g;

    move-result-object p4

    invoke-static {p2}, LF8/j;->a(LF8/a0;)LP7/g;

    move-result-object v1

    invoke-direct {p0, p4, v1}, LF8/V;->a(LP7/g;LP7/g;)V

    invoke-direct {p0, v0, p2}, LF8/V;->c(LF8/M;LF8/a0;)LF8/M;

    move-result-object p4

    invoke-static {p4, p3}, LF8/q0;->r(LF8/M;Z)LF8/M;

    move-result-object p4

    const-string v0, "let(...)"

    invoke-static {p4, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p5, :cond_1

    invoke-direct {p0, p1, p2, p3}, LF8/V;->f(LF8/W;LF8/a0;Z)LF8/M;

    move-result-object p1

    invoke-static {p4, p1}, LF8/Q;->j(LF8/M;LF8/M;)LF8/M;

    move-result-object p4

    :cond_1
    return-object p4
.end method

.method private final k(LF8/i0;LF8/W;LO7/f0;I)LF8/i0;
    .locals 3

    .prologue
    sget-object v0, LF8/V;->c:LF8/V$a;

    invoke-virtual {p2}, LF8/W;->b()LO7/e0;

    move-result-object v1

    invoke-static {v0, p4, v1}, LF8/V$a;->a(LF8/V$a;ILO7/e0;)V

    invoke-interface {p1}, LF8/i0;->b()Z

    move-result v0

    const-string v1, "makeStarProjection(...)"

    if-eqz v0, :cond_0

    :goto_0
    invoke-static {p3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p3}, LF8/q0;->s(LO7/f0;)LF8/i0;

    move-result-object p1

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    invoke-interface {p1}, LF8/i0;->getType()LF8/E;

    move-result-object v0

    const-string v2, "getType(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v2

    invoke-virtual {p2, v2}, LF8/W;->c(LF8/e0;)LF8/i0;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-direct {p0, p1, p2, p4}, LF8/V;->i(LF8/i0;LF8/W;I)LF8/i0;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {v2}, LF8/i0;->b()Z

    move-result p4

    if-eqz p4, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v2}, LF8/i0;->getType()LF8/E;

    move-result-object p4

    invoke-virtual {p4}, LF8/E;->Z0()LF8/t0;

    move-result-object p4

    invoke-interface {v2}, LF8/i0;->a()LF8/u0;

    move-result-object v1

    const-string v2, "getProjectionKind(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LF8/i0;->a()LF8/u0;

    move-result-object p1

    invoke-static {p1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    sget-object v2, LF8/u0;->G:LF8/u0;

    if-ne p1, v2, :cond_4

    goto :goto_1

    :cond_4
    if-ne v1, v2, :cond_5

    move-object v1, p1

    goto :goto_1

    :cond_5
    iget-object p1, p0, LF8/V;->a:LF8/X;

    invoke-virtual {p2}, LF8/W;->b()LO7/e0;

    move-result-object v2

    invoke-interface {p1, v2, p3, p4}, LF8/X;->c(LO7/e0;LO7/f0;LF8/E;)V

    :goto_1
    if-eqz p3, :cond_6

    invoke-interface {p3}, LO7/f0;->s()LF8/u0;

    move-result-object p1

    if-nez p1, :cond_7

    :cond_6
    sget-object p1, LF8/u0;->G:LF8/u0;

    :cond_7
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    if-ne p1, v1, :cond_8

    goto :goto_2

    :cond_8
    sget-object v2, LF8/u0;->G:LF8/u0;

    if-ne p1, v2, :cond_9

    goto :goto_2

    :cond_9
    if-ne v1, v2, :cond_a

    move-object v1, v2

    goto :goto_2

    :cond_a
    iget-object p1, p0, LF8/V;->a:LF8/X;

    invoke-virtual {p2}, LF8/W;->b()LO7/e0;

    move-result-object p2

    invoke-interface {p1, p2, p3, p4}, LF8/X;->c(LO7/e0;LO7/f0;LF8/E;)V

    :goto_2
    invoke-virtual {v0}, LF8/E;->k()LP7/g;

    move-result-object p1

    invoke-virtual {p4}, LF8/E;->k()LP7/g;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LF8/V;->a(LP7/g;LP7/g;)V

    invoke-static {p4}, LF8/m0;->a(LF8/E;)LF8/M;

    move-result-object p1

    invoke-direct {p0, p1, v0}, LF8/V;->e(LF8/M;LF8/E;)LF8/M;

    move-result-object p1

    new-instance p2, LF8/k0;

    invoke-direct {p2, v1, p1}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    return-object p2
.end method

.method private final l(LF8/M;LF8/W;I)LF8/M;
    .locals 8

    .prologue
    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-virtual {p1}, LF8/E;->U0()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-gez v3, :cond_0

    invoke-static {}, Lj7/v;->w()V

    :cond_0
    check-cast v4, LF8/i0;

    invoke-interface {v0}, LF8/e0;->x()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO7/f0;

    add-int/lit8 v6, p3, 0x1

    invoke-direct {p0, v4, p2, v3, v6}, LF8/V;->k(LF8/i0;LF8/W;LO7/f0;I)LF8/i0;

    move-result-object v3

    invoke-interface {v3}, LF8/i0;->b()Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    new-instance v6, LF8/k0;

    invoke-interface {v3}, LF8/i0;->a()LF8/u0;

    move-result-object v7

    invoke-interface {v3}, LF8/i0;->getType()LF8/E;

    move-result-object v3

    invoke-interface {v4}, LF8/i0;->getType()LF8/E;

    move-result-object v4

    invoke-virtual {v4}, LF8/E;->X0()Z

    move-result v4

    invoke-static {v3, v4}, LF8/q0;->q(LF8/E;Z)LF8/E;

    move-result-object v3

    invoke-direct {v6, v7, v3}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    move-object v3, v6

    :goto_1
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v3, v5

    goto :goto_0

    :cond_2
    const/4 p2, 0x2

    const/4 p3, 0x0

    invoke-static {p1, v2, p3, p2, p3}, LF8/m0;->f(LF8/M;Ljava/util/List;LF8/a0;ILjava/lang/Object;)LF8/M;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final h(LF8/W;LF8/a0;)LF8/M;
    .locals 7

    const-string v0, "typeAliasExpansion"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, LF8/V;->j(LF8/W;LF8/a0;ZIZ)LF8/M;

    move-result-object p1

    return-object p1
.end method
