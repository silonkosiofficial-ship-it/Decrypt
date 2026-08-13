.class final LM7/b$b;
.super LF8/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic d:LM7/b;


# direct methods
.method public constructor <init>(LM7/b;)V
    .locals 0

    iput-object p1, p0, LM7/b$b;->d:LM7/b;

    invoke-static {p1}, LM7/b;->Y0(LM7/b;)LE8/n;

    move-result-object p1

    invoke-direct {p0, p1}, LF8/b;-><init>(LE8/n;)V

    return-void
.end method


# virtual methods
.method protected g()Ljava/util/Collection;
    .locals 9

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x1

    iget-object v3, p0, LM7/b$b;->d:LM7/b;

    invoke-virtual {v3}, LM7/b;->d1()LM7/f;

    move-result-object v3

    sget-object v4, LM7/f$a;->e:LM7/f$a;

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    :goto_0
    invoke-static {}, LM7/b;->V0()Ln8/b;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_0
    sget-object v5, LM7/f$b;->e:LM7/f$b;

    invoke-static {v3, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {}, LM7/b;->W0()Ln8/b;

    move-result-object v3

    new-instance v5, Ln8/b;

    sget-object v6, LL7/j;->y:Ln8/c;

    iget-object v7, p0, LM7/b$b;->d:LM7/b;

    invoke-virtual {v7}, LM7/b;->Z0()I

    move-result v7

    invoke-virtual {v4, v7}, LM7/f;->c(I)Ln8/f;

    move-result-object v4

    invoke-direct {v5, v6, v4}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    new-array v1, v1, [Ln8/b;

    aput-object v3, v1, v0

    aput-object v5, v1, v2

    invoke-static {v1}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_1
    sget-object v4, LM7/f$d;->e:LM7/f$d;

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_0

    :cond_2
    sget-object v5, LM7/f$c;->e:LM7/f$c;

    invoke-static {v3, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-static {}, LM7/b;->W0()Ln8/b;

    move-result-object v3

    new-instance v5, Ln8/b;

    sget-object v6, LL7/j;->q:Ln8/c;

    iget-object v7, p0, LM7/b$b;->d:LM7/b;

    invoke-virtual {v7}, LM7/b;->Z0()I

    move-result v7

    invoke-virtual {v4, v7}, LM7/f;->c(I)Ln8/f;

    move-result-object v4

    invoke-direct {v5, v6, v4}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    new-array v1, v1, [Ln8/b;

    aput-object v3, v1, v0

    aput-object v5, v1, v2

    invoke-static {v1}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_1
    iget-object v1, p0, LM7/b$b;->d:LM7/b;

    invoke-static {v1}, LM7/b;->U0(LM7/b;)LO7/K;

    move-result-object v1

    invoke-interface {v1}, LO7/K;->b()LO7/G;

    move-result-object v1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln8/b;

    invoke-static {v1, v4}, LO7/x;->a(LO7/G;Ln8/b;)LO7/e;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {p0}, LM7/b$b;->x()Ljava/util/List;

    move-result-object v4

    invoke-interface {v5}, LO7/h;->p()LF8/e0;

    move-result-object v6

    invoke-interface {v6}, LF8/e0;->x()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v4, v6}, Lj7/v;->N0(Ljava/util/List;I)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v4, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LO7/f0;

    new-instance v8, LF8/k0;

    invoke-interface {v7}, LO7/h;->w()LF8/M;

    move-result-object v7

    invoke-direct {v8, v7}, LF8/k0;-><init>(LF8/E;)V

    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    sget-object v4, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {v4}, LF8/a0$a;->i()LF8/a0;

    move-result-object v4

    invoke-static {v4, v5, v6}, LF8/F;->g(LF8/a0;LO7/e;Ljava/util/List;)LF8/M;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Built-in class "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not found"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    invoke-static {v2}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0

    :cond_6
    const/4 v0, 0x0

    invoke-static {v0, v2, v0}, LQ8/a;->b(Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    throw v0
.end method

.method protected k()LO7/d0;
    .locals 1

    sget-object v0, LO7/d0$a;->a:LO7/d0$a;

    return-object v0
.end method

.method public bridge synthetic q()LO7/e;
    .locals 1

    invoke-virtual {p0}, LM7/b$b;->r()LM7/b;

    move-result-object v0

    return-object v0
.end method

.method public r()LM7/b;
    .locals 1

    iget-object v0, p0, LM7/b$b;->d:LM7/b;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LM7/b$b;->r()LM7/b;

    move-result-object v0

    invoke-virtual {v0}, LM7/b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic w()LO7/h;
    .locals 1

    invoke-virtual {p0}, LM7/b$b;->r()LM7/b;

    move-result-object v0

    return-object v0
.end method

.method public x()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LM7/b$b;->d:LM7/b;

    invoke-static {v0}, LM7/b;->X0(LM7/b;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public y()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
