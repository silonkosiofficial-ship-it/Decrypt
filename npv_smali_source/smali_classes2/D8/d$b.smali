.class final LD8/d$b;
.super LF8/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final d:LE8/i;

.field final synthetic e:LD8/d;


# direct methods
.method public constructor <init>(LD8/d;)V
    .locals 2

    iput-object p1, p0, LD8/d$b;->e:LD8/d;

    invoke-virtual {p1}, LD8/d;->i1()LB8/m;

    move-result-object v0

    invoke-virtual {v0}, LB8/m;->h()LE8/n;

    move-result-object v0

    invoke-direct {p0, v0}, LF8/b;-><init>(LE8/n;)V

    invoke-virtual {p1}, LD8/d;->i1()LB8/m;

    move-result-object v0

    invoke-virtual {v0}, LB8/m;->h()LE8/n;

    move-result-object v0

    new-instance v1, LD8/d$b$a;

    invoke-direct {v1, p1}, LD8/d$b$a;-><init>(LD8/d;)V

    invoke-interface {v0, v1}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LD8/d$b;->d:LE8/i;

    return-void
.end method


# virtual methods
.method protected g()Ljava/util/Collection;
    .locals 7

    .prologue
    iget-object v0, p0, LD8/d$b;->e:LD8/d;

    invoke-virtual {v0}, LD8/d;->j1()Li8/c;

    move-result-object v0

    iget-object v1, p0, LD8/d$b;->e:LD8/d;

    invoke-virtual {v1}, LD8/d;->i1()LB8/m;

    move-result-object v1

    invoke-virtual {v1}, LB8/m;->j()Lk8/g;

    move-result-object v1

    invoke-static {v0, v1}, Lk8/f;->o(Li8/c;Lk8/g;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, LD8/d$b;->e:LD8/d;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li8/q;

    invoke-virtual {v1}, LD8/d;->i1()LB8/m;

    move-result-object v5

    invoke-virtual {v5}, LB8/m;->i()LB8/E;

    move-result-object v5

    invoke-virtual {v5, v4}, LB8/E;->q(Li8/q;)LF8/E;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, LD8/d$b;->e:LD8/d;

    invoke-virtual {v0}, LD8/d;->i1()LB8/m;

    move-result-object v0

    invoke-virtual {v0}, LB8/m;->c()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->c()LQ7/a;

    move-result-object v0

    iget-object v1, p0, LD8/d$b;->e:LD8/d;

    invoke-interface {v0, v1}, LQ7/a;->e(LO7/e;)Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LF8/E;

    invoke-virtual {v4}, LF8/E;->W0()LF8/e0;

    move-result-object v4

    invoke-interface {v4}, LF8/e0;->w()LO7/h;

    move-result-object v4

    instance-of v5, v4, LO7/J$b;

    if-eqz v5, :cond_2

    check-cast v4, LO7/J$b;

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_1

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_7

    iget-object v2, p0, LD8/d$b;->e:LD8/d;

    invoke-virtual {v2}, LD8/d;->i1()LB8/m;

    move-result-object v2

    invoke-virtual {v2}, LB8/m;->c()LB8/k;

    move-result-object v2

    invoke-virtual {v2}, LB8/k;->j()LB8/r;

    move-result-object v2

    iget-object v4, p0, LD8/d$b;->e:LD8/d;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO7/J$b;

    invoke-static {v3}, Lv8/c;->k(LO7/h;)Ln8/b;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ln8/b;->b()Ln8/c;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ln8/c;->b()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_5

    :cond_4
    invoke-virtual {v3}, LR7/a;->getName()Ln8/f;

    move-result-object v3

    invoke-virtual {v3}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v6

    :cond_5
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-interface {v2, v4, v5}, LB8/r;->b(LO7/e;Ljava/util/List;)V

    :cond_7
    invoke-static {v0}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method protected k()LO7/d0;
    .locals 1

    sget-object v0, LO7/d0$a;->a:LO7/d0$a;

    return-object v0
.end method

.method public bridge synthetic q()LO7/e;
    .locals 1

    invoke-virtual {p0}, LD8/d$b;->r()LD8/d;

    move-result-object v0

    return-object v0
.end method

.method public r()LD8/d;
    .locals 1

    iget-object v0, p0, LD8/d$b;->e:LD8/d;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LD8/d$b;->e:LD8/d;

    invoke-virtual {v0}, LR7/a;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic w()LO7/h;
    .locals 1

    invoke-virtual {p0}, LD8/d$b;->r()LD8/d;

    move-result-object v0

    return-object v0
.end method

.method public x()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LD8/d$b;->d:LE8/i;

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
