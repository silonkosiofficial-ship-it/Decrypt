.class public final LJ7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ7/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ7/j$a;,
        LJ7/j$b;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:LJ7/e;

.field private final c:Ljava/lang/reflect/Member;

.field private final d:LJ7/j$a;

.field private final e:[LE7/i;

.field private final f:Z


# direct methods
.method public constructor <init>(LO7/b;LJ7/e;Z)V
    .locals 10

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oldCaller"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p3, p0, LJ7/j;->a:Z

    instance-of p3, p2, LJ7/f$h$c;

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p3, :cond_3

    invoke-interface {p1}, LO7/a;->v0()LO7/X;

    move-result-object p3

    if-nez p3, :cond_0

    invoke-interface {p1}, LO7/a;->m0()LO7/X;

    move-result-object p3

    :cond_0
    if-eqz p3, :cond_1

    invoke-interface {p3}, LO7/i0;->getType()LF8/E;

    move-result-object p3

    goto :goto_0

    :cond_1
    move-object p3, v0

    :goto_0
    if-eqz p3, :cond_3

    invoke-static {p3}, Lr8/h;->i(LF8/E;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p3}, LF8/m0;->a(LF8/E;)LF8/M;

    move-result-object p3

    invoke-static {p3}, LJ7/k;->m(LF8/M;)Ljava/util/List;

    move-result-object p3

    invoke-static {p3}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p3, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p3, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Method;

    move-object v4, p2

    check-cast v4, LJ7/f$h$c;

    invoke-virtual {v4}, LJ7/f$h$c;->e()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-array p3, v1, [Ljava/lang/Object;

    invoke-interface {v2, p3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    new-instance v2, LJ7/f$h$d;

    check-cast p2, LJ7/f$h$c;

    invoke-virtual {p2}, LJ7/f;->n()Ljava/lang/reflect/Member;

    move-result-object p2

    check-cast p2, Ljava/lang/reflect/Method;

    invoke-direct {v2, p2, p3}, LJ7/f$h$d;-><init>(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    move-object p2, v2

    :cond_3
    iput-object p2, p0, LJ7/j;->b:LJ7/e;

    invoke-interface {p2}, LJ7/e;->n()Ljava/lang/reflect/Member;

    move-result-object p3

    iput-object p3, p0, LJ7/j;->c:Ljava/lang/reflect/Member;

    invoke-interface {p1}, LO7/a;->l()LF8/E;

    move-result-object p3

    invoke-static {p3}, Ly7/t;->c(Ljava/lang/Object;)V

    instance-of v2, p1, LO7/y;

    const/4 v3, 0x1

    if-eqz v2, :cond_5

    move-object v4, p1

    check-cast v4, LO7/y;

    invoke-interface {v4}, LO7/y;->y()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {p3}, Lr8/h;->j(LF8/E;)LF8/E;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-static {v4}, LL7/g;->s0(LF8/E;)Z

    move-result v4

    if-ne v4, v3, :cond_5

    :cond_4
    move-object p3, v0

    goto :goto_2

    :cond_5
    invoke-static {p3}, LJ7/k;->e(LF8/E;)Ljava/lang/Class;

    move-result-object p3

    if-eqz p3, :cond_4

    invoke-static {p3, p1}, LJ7/k;->b(Ljava/lang/Class;LO7/b;)Ljava/lang/reflect/Method;

    move-result-object p3

    :goto_2
    invoke-static {p1}, Lr8/h;->a(LO7/a;)Z

    move-result v4

    if-eqz v4, :cond_6

    new-instance p1, LJ7/j$a;

    sget-object p2, LE7/i;->G:LE7/i$a;

    invoke-virtual {p2}, LE7/i$a;->a()LE7/i;

    move-result-object p2

    new-array v0, v1, [Ljava/util/List;

    invoke-direct {p1, p2, v0, p3}, LJ7/j$a;-><init>(LE7/i;[Ljava/util/List;Ljava/lang/reflect/Method;)V

    goto/16 :goto_c

    :cond_6
    instance-of v4, p2, LJ7/f$h$c;

    const/4 v5, -0x1

    if-nez v4, :cond_b

    instance-of v4, p2, LJ7/f$h$d;

    if-eqz v4, :cond_7

    goto :goto_4

    :cond_7
    instance-of v4, p1, LO7/l;

    if-eqz v4, :cond_9

    instance-of v4, p2, LJ7/d;

    if-eqz v4, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    move v5, v1

    goto :goto_4

    :cond_9
    invoke-interface {p1}, LO7/a;->m0()LO7/X;

    move-result-object v4

    if-eqz v4, :cond_8

    instance-of v4, p2, LJ7/d;

    if-nez v4, :cond_8

    invoke-interface {p1}, LO7/n;->b()LO7/m;

    move-result-object v4

    const-string v5, "getContainingDeclaration(...)"

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lr8/h;->g(LO7/m;)Z

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_3

    :cond_a
    move v5, v3

    :cond_b
    :goto_4
    instance-of v4, p2, LJ7/f$h$d;

    if-eqz v4, :cond_c

    check-cast p2, LJ7/f$h$d;

    invoke-virtual {p2}, LJ7/f$h$d;->f()I

    move-result p2

    neg-int p2, p2

    goto :goto_5

    :cond_c
    move p2, v5

    :goto_5
    sget-object v4, LJ7/j$c;->D:LJ7/j$c;

    invoke-static {p1, v4}, LJ7/k;->d(LO7/b;Lx7/l;)Ljava/util/List;

    move-result-object v4

    iget-boolean v6, p0, LJ7/j;->a:Z

    if-eqz v6, :cond_e

    move-object v6, v4

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v7, v1

    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LF8/E;

    invoke-static {v8}, LJ7/j;->a(LF8/E;)I

    move-result v8

    add-int/2addr v7, v8

    goto :goto_6

    :cond_d
    add-int/lit8 v7, v7, 0x1f

    div-int/lit8 v7, v7, 0x20

    add-int/2addr v7, v3

    goto :goto_7

    :cond_e
    move v7, v1

    :goto_7
    if-eqz v2, :cond_f

    move-object v2, p1

    check-cast v2, LO7/y;

    invoke-interface {v2}, LO7/y;->y()Z

    move-result v2

    if-eqz v2, :cond_f

    move v2, v3

    goto :goto_8

    :cond_f
    move v2, v1

    :goto_8
    add-int/2addr v7, v2

    move-object v2, v4

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v6, v1

    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LF8/E;

    invoke-static {v8}, LJ7/j;->a(LF8/E;)I

    move-result v8

    add-int/2addr v6, v8

    goto :goto_9

    :cond_10
    add-int/2addr v6, p2

    add-int/2addr v6, v7

    iget-boolean p2, p0, LJ7/j;->a:Z

    invoke-static {p0, v6, p1, p2}, LJ7/k;->a(LJ7/e;ILO7/b;Z)V

    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v2, v5

    invoke-static {p2, v2}, LE7/j;->q(II)LE7/i;

    move-result-object p2

    new-array v2, v6, [Ljava/util/List;

    move v7, v1

    :goto_a
    if-ge v7, v6, :cond_12

    invoke-virtual {p2}, LE7/g;->f()I

    move-result v8

    invoke-virtual {p2}, LE7/g;->g()I

    move-result v9

    if-gt v7, v9, :cond_11

    if-gt v8, v7, :cond_11

    sub-int v8, v7, v5

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LF8/E;

    invoke-static {v8}, LF8/m0;->a(LF8/E;)LF8/M;

    move-result-object v8

    invoke-static {v8, p1}, LJ7/k;->c(LF8/M;LO7/b;)Ljava/util/List;

    move-result-object v8

    goto :goto_b

    :cond_11
    move-object v8, v0

    :goto_b
    aput-object v8, v2, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_a

    :cond_12
    new-instance p1, LJ7/j$a;

    invoke-direct {p1, p2, v2, p3}, LJ7/j$a;-><init>(LE7/i;[Ljava/util/List;Ljava/lang/reflect/Method;)V

    :goto_c
    iput-object p1, p0, LJ7/j;->d:LJ7/j$a;

    invoke-static {}, Lj7/v;->c()Ljava/util/List;

    move-result-object p2

    iget-object p3, p0, LJ7/j;->b:LJ7/e;

    instance-of v0, p3, LJ7/f$h$d;

    if-eqz v0, :cond_13

    check-cast p3, LJ7/f$h$d;

    invoke-virtual {p3}, LJ7/f$h$d;->e()[Ljava/lang/Object;

    move-result-object p3

    array-length p3, p3

    goto :goto_d

    :cond_13
    instance-of p3, p3, LJ7/f$h$c;

    if-eqz p3, :cond_14

    move p3, v3

    goto :goto_d

    :cond_14
    move p3, v1

    :goto_d
    if-lez p3, :cond_15

    invoke-static {v1, p3}, LE7/j;->q(II)LE7/i;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_15
    invoke-virtual {p1}, LJ7/j$a;->c()[Ljava/util/List;

    move-result-object p1

    array-length v0, p1

    move v2, v1

    :goto_e
    if-ge v2, v0, :cond_17

    aget-object v4, p1, v2

    if-eqz v4, :cond_16

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    goto :goto_f

    :cond_16
    move v4, v3

    :goto_f
    add-int/2addr v4, p3

    invoke-static {p3, v4}, LE7/j;->q(II)LE7/i;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    move p3, v4

    goto :goto_e

    :cond_17
    invoke-static {p2}, Lj7/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    new-array p2, v1, [LE7/i;

    invoke-interface {p1, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LE7/i;

    iput-object p1, p0, LJ7/j;->e:[LE7/i;

    iget-object p1, p0, LJ7/j;->d:LJ7/j$a;

    invoke-virtual {p1}, LJ7/j$a;->a()LE7/i;

    move-result-object p1

    instance-of p2, p1, Ljava/util/Collection;

    if-eqz p2, :cond_18

    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_18

    goto :goto_11

    :cond_18
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_19
    :goto_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1b

    move-object p2, p1

    check-cast p2, Lj7/O;

    invoke-virtual {p2}, Lj7/O;->b()I

    move-result p2

    iget-object p3, p0, LJ7/j;->d:LJ7/j$a;

    invoke-virtual {p3}, LJ7/j$a;->c()[Ljava/util/List;

    move-result-object p3

    aget-object p2, p3, p2

    if-nez p2, :cond_1a

    goto :goto_10

    :cond_1a
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-le p2, v3, :cond_19

    move v1, v3

    :cond_1b
    :goto_11
    iput-boolean v1, p0, LJ7/j;->f:Z

    return-void
.end method

.method private static final a(LF8/E;)I
    .locals 0

    .prologue
    invoke-static {p0}, LF8/m0;->a(LF8/E;)LF8/M;

    move-result-object p0

    invoke-static {p0}, LJ7/k;->m(LF8/M;)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method


# virtual methods
.method public final b(I)LE7/i;
    .locals 2

    .prologue
    if-ltz p1, :cond_0

    iget-object v0, p0, LJ7/j;->e:[LE7/i;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-object p1, v0, p1

    goto :goto_1

    :cond_0
    iget-object v0, p0, LJ7/j;->e:[LE7/i;

    array-length v1, v0

    if-nez v1, :cond_1

    new-instance v0, LE7/i;

    invoke-direct {v0, p1, p1}, LE7/i;-><init>(II)V

    :goto_0
    move-object p1, v0

    goto :goto_1

    :cond_1
    array-length v1, v0

    sub-int/2addr p1, v1

    invoke-static {v0}, Lj7/n;->x0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LE7/i;

    invoke-virtual {v0}, LE7/g;->g()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    add-int/2addr p1, v0

    new-instance v0, LE7/i;

    invoke-direct {v0, p1, p1}, LE7/i;-><init>(II)V

    goto :goto_0

    :goto_1
    return-object p1
.end method

.method public l()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, LJ7/j;->b:LJ7/e;

    invoke-interface {v0}, LJ7/e;->l()Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0
.end method

.method public m()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LJ7/j;->b:LJ7/e;

    invoke-interface {v0}, LJ7/e;->m()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public n()Ljava/lang/reflect/Member;
    .locals 1

    iget-object v0, p0, LJ7/j;->c:Ljava/lang/reflect/Member;

    return-object v0
.end method

.method public z([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string v2, "args"

    invoke-static {p1, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LJ7/j;->d:LJ7/j$a;

    invoke-virtual {v2}, LJ7/j$a;->a()LE7/i;

    move-result-object v2

    iget-object v3, p0, LJ7/j;->d:LJ7/j$a;

    invoke-virtual {v3}, LJ7/j$a;->c()[Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, LJ7/j;->d:LJ7/j$a;

    invoke-virtual {v4}, LJ7/j$a;->b()Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v2}, LE7/i;->isEmpty()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    goto/16 :goto_9

    :cond_0
    iget-boolean v5, p0, LJ7/j;->f:Z

    const-string v7, "getReturnType(...)"

    if-eqz v5, :cond_7

    array-length v5, p1

    invoke-static {v5}, Lj7/v;->d(I)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v2}, LE7/g;->f()I

    move-result v8

    move v9, v0

    :goto_0
    if-ge v9, v8, :cond_1

    aget-object v10, p1, v9

    invoke-interface {v5, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v9, v1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, LE7/g;->f()I

    move-result v8

    invoke-virtual {v2}, LE7/g;->g()I

    move-result v9

    if-gt v8, v9, :cond_5

    :goto_1
    aget-object v10, v3, v8

    aget-object v11, p1, v8

    if-eqz v10, :cond_4

    check-cast v10, Ljava/lang/Iterable;

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v5

    check-cast v13, Ljava/util/Collection;

    check-cast v12, Ljava/lang/reflect/Method;

    if-eqz v11, :cond_2

    invoke-virtual {v12, v11, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    goto :goto_3

    :cond_2
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v12

    invoke-static {v12, v7}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v12}, LI7/M;->g(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v12

    :goto_3
    invoke-interface {v13, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    move-object v10, v5

    check-cast v10, Ljava/util/Collection;

    goto :goto_4

    :cond_4
    invoke-interface {v5, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_4
    if-eq v8, v9, :cond_5

    add-int/2addr v8, v1

    goto :goto_1

    :cond_5
    invoke-virtual {v2}, LE7/g;->g()I

    move-result v2

    add-int/2addr v2, v1

    invoke-static {p1}, Lj7/n;->e0([Ljava/lang/Object;)I

    move-result v3

    if-gt v2, v3, :cond_6

    :goto_5
    aget-object v7, p1, v2

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v2, v3, :cond_6

    add-int/2addr v2, v1

    goto :goto_5

    :cond_6
    invoke-static {v5}, Lj7/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    new-array v2, v0, [Ljava/lang/Object;

    invoke-interface {p1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    goto :goto_9

    :cond_7
    array-length v5, p1

    new-array v8, v5, [Ljava/lang/Object;

    move v9, v0

    :goto_6
    if-ge v9, v5, :cond_c

    invoke-virtual {v2}, LE7/g;->f()I

    move-result v10

    invoke-virtual {v2}, LE7/g;->g()I

    move-result v11

    if-gt v9, v11, :cond_b

    if-gt v10, v9, :cond_b

    aget-object v10, v3, v9

    if-eqz v10, :cond_8

    invoke-static {v10}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/reflect/Method;

    goto :goto_7

    :cond_8
    move-object v10, v6

    :goto_7
    aget-object v11, p1, v9

    if-nez v10, :cond_9

    goto :goto_8

    :cond_9
    if-eqz v11, :cond_a

    invoke-virtual {v10, v11, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    goto :goto_8

    :cond_a
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v10

    invoke-static {v10, v7}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10}, LI7/M;->g(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v11

    goto :goto_8

    :cond_b
    aget-object v11, p1, v9

    :goto_8
    aput-object v11, v8, v9

    add-int/2addr v9, v1

    goto :goto_6

    :cond_c
    move-object p1, v8

    :goto_9
    iget-object v2, p0, LJ7/j;->b:LJ7/e;

    invoke-interface {v2, p1}, LJ7/e;->z([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_d

    return-object p1

    :cond_d
    if-eqz v4, :cond_f

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    invoke-virtual {v4, v6, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_e

    goto :goto_a

    :cond_e
    move-object p1, v0

    :cond_f
    :goto_a
    return-object p1
.end method
