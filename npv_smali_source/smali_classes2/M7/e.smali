.class public final LM7/e;
.super LR7/G;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM7/e$a;
    }
.end annotation


# static fields
.field public static final g0:LM7/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LM7/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM7/e$a;-><init>(Ly7/k;)V

    sput-object v0, LM7/e;->g0:LM7/e$a;

    return-void
.end method

.method private constructor <init>(LO7/m;LM7/e;LO7/b$a;Z)V
    .locals 8

    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v4

    sget-object v5, LM8/q;->i:Ln8/f;

    sget-object v7, LO7/a0;->a:LO7/a0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v7}, LR7/G;-><init>(LO7/m;LO7/Z;LP7/g;Ln8/f;LO7/b$a;LO7/a0;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, LR7/p;->o1(Z)V

    invoke-virtual {p0, p4}, LR7/p;->q1(Z)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LR7/p;->h1(Z)V

    return-void
.end method

.method public synthetic constructor <init>(LO7/m;LM7/e;LO7/b$a;ZLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LM7/e;-><init>(LO7/m;LM7/e;LO7/b$a;Z)V

    return-void
.end method

.method private final y1(Ljava/util/List;)LO7/y;
    .locals 8

    .prologue
    invoke-virtual {p0}, LR7/p;->n()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x1

    const-string v2, "getValueParameters(...)"

    if-nez v0, :cond_3

    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    invoke-virtual {p0}, LR7/p;->n()Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v3, v4}, Lj7/v;->c1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    instance-of v4, v3, Ljava/util/Collection;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li7/u;

    invoke-virtual {v4}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln8/f;

    invoke-virtual {v4}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO7/j0;

    invoke-interface {v4}, LO7/I;->getName()Ln8/f;

    move-result-object v4

    invoke-static {v5, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    return-object p0

    :cond_3
    :goto_1
    invoke-virtual {p0}, LR7/p;->n()Ljava/util/List;

    move-result-object v3

    invoke-static {v3, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO7/j0;

    invoke-interface {v4}, LO7/I;->getName()Ln8/f;

    move-result-object v5

    const-string v6, "getName(...)"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4}, LO7/j0;->getIndex()I

    move-result v6

    sub-int v7, v6, v0

    if-ltz v7, :cond_4

    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ln8/f;

    if-eqz v7, :cond_4

    move-object v5, v7

    :cond_4
    invoke-interface {v4, p0, v5, v6}, LO7/j0;->g0(LO7/a;Ln8/f;I)LO7/j0;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    sget-object v0, LF8/n0;->b:LF8/n0;

    invoke-virtual {p0, v0}, LR7/p;->b1(LF8/n0;)LR7/p$c;

    move-result-object v0

    check-cast p1, Ljava/lang/Iterable;

    instance-of v3, p1, Ljava/util/Collection;

    const/4 v4, 0x0

    if-eqz v3, :cond_7

    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    move v1, v4

    goto :goto_3

    :cond_7
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln8/f;

    if-nez v3, :cond_8

    :goto_3
    invoke-virtual {v0, v1}, LR7/p$c;->H(Z)LR7/p$c;

    move-result-object p1

    invoke-virtual {p1, v2}, LR7/p$c;->V(Ljava/util/List;)LR7/p$c;

    move-result-object p1

    invoke-virtual {p0}, LR7/G;->v1()LO7/Z;

    move-result-object v0

    invoke-virtual {p1, v0}, LR7/p$c;->O(LO7/b;)LR7/p$c;

    move-result-object p1

    const-string v0, "setOriginal(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LR7/p;->V0(LR7/p$c;)LO7/y;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object p1
.end method


# virtual methods
.method public C()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected U0(LO7/m;LO7/y;LO7/b$a;Ln8/f;LP7/g;LO7/a0;)LR7/p;
    .locals 0

    const-string p4, "newOwner"

    invoke-static {p1, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "kind"

    invoke-static {p3, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "annotations"

    invoke-static {p5, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "source"

    invoke-static {p6, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p4, LM7/e;

    check-cast p2, LM7/e;

    invoke-virtual {p0}, LR7/p;->y()Z

    move-result p5

    invoke-direct {p4, p1, p2, p3, p5}, LM7/e;-><init>(LO7/m;LM7/e;LO7/b$a;Z)V

    return-object p4
.end method

.method public V()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected V0(LR7/p$c;)LO7/y;
    .locals 4

    .prologue
    const-string v0, "configuration"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LR7/p;->V0(LR7/p$c;)LO7/y;

    move-result-object p1

    check-cast p1, LM7/e;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, LR7/p;->n()Ljava/util/List;

    move-result-object v0

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/j0;

    invoke-interface {v2}, LO7/i0;->getType()LF8/E;

    move-result-object v2

    const-string v3, "getType(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, LL7/f;->d(LF8/E;)Ln8/f;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, LR7/p;->n()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

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

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/j0;

    invoke-interface {v2}, LO7/i0;->getType()LF8/E;

    move-result-object v2

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, LL7/f;->d(LF8/E;)Ln8/f;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-direct {p1, v1}, LM7/e;->y1(Ljava/util/List;)LO7/y;

    move-result-object p1

    :cond_4
    :goto_1
    return-object p1
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
