.class public abstract LG0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Ljava/util/List;)Z
    .locals 11

    .prologue
    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p0}, Lj7/v;->o(Ljava/util/List;)I

    move-result v4

    move v5, v1

    :goto_0
    if-ge v5, v4, :cond_3

    add-int/lit8 v5, v5, 0x1

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, LK0/o;

    check-cast v3, LK0/o;

    invoke-virtual {v3}, LK0/o;->i()Ln0/i;

    move-result-object v8

    invoke-virtual {v8}, Ln0/i;->g()J

    move-result-wide v8

    invoke-static {v8, v9}, Ln0/g;->m(J)F

    move-result v8

    invoke-virtual {v7}, LK0/o;->i()Ln0/i;

    move-result-object v9

    invoke-virtual {v9}, Ln0/i;->g()J

    move-result-wide v9

    invoke-static {v9, v10}, Ln0/g;->m(J)F

    move-result v9

    sub-float/2addr v8, v9

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    invoke-virtual {v3}, LK0/o;->i()Ln0/i;

    move-result-object v3

    invoke-virtual {v3}, Ln0/i;->g()J

    move-result-wide v9

    invoke-static {v9, v10}, Ln0/g;->n(J)F

    move-result v3

    invoke-virtual {v7}, LK0/o;->i()Ln0/i;

    move-result-object v7

    invoke-virtual {v7}, Ln0/i;->g()J

    move-result-wide v9

    invoke-static {v9, v10}, Ln0/g;->n(J)F

    move-result v7

    sub-float/2addr v3, v7

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    invoke-static {v8, v3}, Ln0/h;->a(FF)J

    move-result-wide v7

    invoke-static {v7, v8}, Ln0/g;->d(J)Ln0/g;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v3, v6

    goto :goto_0

    :cond_2
    :goto_1
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    :cond_3
    move-object p0, v0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result p0

    if-ne p0, v2, :cond_5

    invoke-static {v0}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    :cond_4
    check-cast p0, Ln0/g;

    invoke-virtual {p0}, Ln0/g;->v()J

    move-result-wide v3

    goto :goto_3

    :cond_5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_7

    invoke-static {v0}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0}, Lj7/v;->o(Ljava/util/List;)I

    move-result v3

    if-gt v2, v3, :cond_4

    move v4, v2

    :goto_2
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln0/g;

    invoke-virtual {v5}, Ln0/g;->v()J

    move-result-wide v5

    check-cast p0, Ln0/g;

    invoke-virtual {p0}, Ln0/g;->v()J

    move-result-wide v7

    invoke-static {v7, v8, v5, v6}, Ln0/g;->r(JJ)J

    move-result-wide v5

    invoke-static {v5, v6}, Ln0/g;->d(J)Ln0/g;

    move-result-object p0

    if-eq v4, v3, :cond_4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :goto_3
    invoke-static {v3, v4}, Ln0/g;->m(J)F

    move-result p0

    invoke-static {v3, v4}, Ln0/g;->n(J)F

    move-result v0

    cmpg-float p0, v0, p0

    if-gez p0, :cond_6

    goto :goto_4

    :cond_6
    move v2, v1

    :goto_4
    return v2

    :cond_7
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Empty collection can\'t be reduced."

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(LK0/o;)Z
    .locals 3

    .prologue
    invoke-virtual {p0}, LK0/o;->n()LK0/k;

    move-result-object v0

    sget-object v1, LK0/r;->a:LK0/r;

    invoke-virtual {v1}, LK0/r;->a()LK0/v;

    move-result-object v2

    invoke-static {v0, v2}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LK0/o;->n()LK0/k;

    move-result-object p0

    invoke-virtual {v1}, LK0/r;->z()LK0/v;

    move-result-object v0

    invoke-static {p0, v0}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object p0

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

.method private static final c(LK0/b;)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LK0/b;->b()I

    move-result v0

    if-ltz v0, :cond_1

    invoke-virtual {p0}, LK0/b;->a()I

    move-result p0

    if-gez p0, :cond_0

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

.method public static final d(LK0/o;LC1/B;)V
    .locals 7

    .prologue
    invoke-virtual {p0}, LK0/o;->n()LK0/k;

    move-result-object v0

    sget-object v1, LK0/r;->a:LK0/r;

    invoke-virtual {v1}, LK0/r;->a()LK0/v;

    move-result-object v2

    invoke-static {v0, v2}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK0/b;

    if-eqz v0, :cond_0

    invoke-static {v0}, LG0/a;->f(LK0/b;)LC1/B$e;

    move-result-object p0

    invoke-virtual {p1, p0}, LC1/B;->o0(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, LK0/o;->n()LK0/k;

    move-result-object v2

    invoke-virtual {v1}, LK0/r;->z()LK0/v;

    move-result-object v1

    invoke-static {v2, v1}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LK0/o;->t()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LK0/o;

    invoke-virtual {v4}, LK0/o;->n()LK0/k;

    move-result-object v5

    sget-object v6, LK0/r;->a:LK0/r;

    invoke-virtual {v6}, LK0/r;->A()LK0/v;

    move-result-object v6

    invoke-virtual {v5, v6}, LK0/k;->f(LK0/v;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    const/4 v1, 0x1

    xor-int/2addr p0, v1

    if-eqz p0, :cond_5

    invoke-static {v0}, LG0/a;->a(Ljava/util/List;)Z

    move-result p0

    if-eqz p0, :cond_3

    move v3, v1

    goto :goto_1

    :cond_3
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v3

    :goto_1
    if-eqz p0, :cond_4

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    :cond_4
    invoke-static {v3, v1, v2, v2}, LC1/B$e;->a(IIZI)LC1/B$e;

    move-result-object p0

    invoke-virtual {p1, p0}, LC1/B;->o0(Ljava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public static final e(LK0/o;LC1/B;)V
    .locals 12

    .prologue
    invoke-virtual {p0}, LK0/o;->n()LK0/k;

    move-result-object v0

    sget-object v1, LK0/r;->a:LK0/r;

    invoke-virtual {v1}, LK0/r;->b()LK0/v;

    move-result-object v2

    invoke-static {v0, v2}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-virtual {p0}, LK0/o;->r()LK0/o;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, LK0/o;->n()LK0/k;

    move-result-object v2

    invoke-virtual {v1}, LK0/r;->z()LK0/v;

    move-result-object v3

    invoke-static {v2, v3}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v0}, LK0/o;->n()LK0/k;

    move-result-object v2

    invoke-virtual {v1}, LK0/r;->a()LK0/v;

    move-result-object v3

    invoke-static {v2, v3}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LK0/b;

    if-eqz v2, :cond_1

    invoke-static {v2}, LG0/a;->c(LK0/b;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, LK0/o;->n()LK0/k;

    move-result-object v2

    invoke-virtual {v1}, LK0/r;->A()LK0/v;

    move-result-object v1

    invoke-virtual {v2, v1}, LK0/k;->f(LK0/v;)Z

    move-result v1

    if-nez v1, :cond_2

    return-void

    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, LK0/o;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v4, v2, :cond_4

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LK0/o;

    invoke-virtual {v6}, LK0/o;->n()LK0/k;

    move-result-object v7

    sget-object v8, LK0/r;->a:LK0/r;

    invoke-virtual {v8}, LK0/r;->A()LK0/v;

    move-result-object v8

    invoke-virtual {v7, v8}, LK0/k;->f(LK0/v;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, LK0/o;->q()LF0/J;

    move-result-object v6

    invoke-virtual {v6}, LF0/J;->p0()I

    move-result v6

    invoke-virtual {p0}, LK0/o;->q()LF0/J;

    move-result-object v7

    invoke-virtual {v7}, LF0/J;->p0()I

    move-result v7

    if-ge v6, v7, :cond_3

    add-int/lit8 v5, v5, 0x1

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_7

    invoke-static {v1}, LG0/a;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_5

    move v6, v3

    goto :goto_1

    :cond_5
    move v6, v5

    :goto_1
    if-eqz v0, :cond_6

    move v8, v5

    goto :goto_2

    :cond_6
    move v8, v3

    :goto_2
    invoke-virtual {p0}, LK0/o;->n()LK0/k;

    move-result-object p0

    sget-object v0, LK0/r;->a:LK0/r;

    invoke-virtual {v0}, LK0/r;->A()LK0/v;

    move-result-object v0

    sget-object v1, LG0/a$a;->D:LG0/a$a;

    invoke-virtual {p0, v0, v1}, LK0/k;->C(LK0/v;Lx7/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    const/4 v7, 0x1

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-static/range {v6 .. v11}, LC1/B$f;->a(IIIIZZ)LC1/B$f;

    move-result-object p0

    if-eqz p0, :cond_7

    invoke-virtual {p1, p0}, LC1/B;->p0(Ljava/lang/Object;)V

    :cond_7
    return-void
.end method

.method private static final f(LK0/b;)LC1/B$e;
    .locals 2

    invoke-virtual {p0}, LK0/b;->b()I

    move-result v0

    invoke-virtual {p0}, LK0/b;->a()I

    move-result p0

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, v1}, LC1/B$e;->a(IIZI)LC1/B$e;

    move-result-object p0

    return-object p0
.end method
