.class final LR7/J$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/J;-><init>(LE8/n;LO7/e0;LO7/d;LR7/I;LP7/g;LO7/b$a;LO7/a0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LR7/J;

.field final synthetic E:LO7/d;


# direct methods
.method constructor <init>(LR7/J;LO7/d;)V
    .locals 0

    iput-object p1, p0, LR7/J$b;->D:LR7/J;

    iput-object p2, p0, LR7/J$b;->E:LO7/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LR7/J;
    .locals 11

    .prologue
    new-instance v9, LR7/J;

    iget-object v0, p0, LR7/J$b;->D:LR7/J;

    invoke-virtual {v0}, LR7/J;->p0()LE8/n;

    move-result-object v1

    iget-object v0, p0, LR7/J$b;->D:LR7/J;

    invoke-virtual {v0}, LR7/J;->x1()LO7/e0;

    move-result-object v2

    iget-object v3, p0, LR7/J$b;->E:LO7/d;

    iget-object v4, p0, LR7/J$b;->D:LR7/J;

    invoke-interface {v3}, LP7/a;->k()LP7/g;

    move-result-object v5

    iget-object v0, p0, LR7/J$b;->E:LO7/d;

    invoke-interface {v0}, LO7/b;->j()LO7/b$a;

    move-result-object v6

    const-string v0, "getKind(...)"

    invoke-static {v6, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LR7/J$b;->D:LR7/J;

    invoke-virtual {v0}, LR7/J;->x1()LO7/e0;

    move-result-object v0

    invoke-interface {v0}, LO7/p;->o()LO7/a0;

    move-result-object v7

    const-string v0, "getSource(...)"

    invoke-static {v7, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, LR7/J;-><init>(LE8/n;LO7/e0;LO7/d;LR7/I;LP7/g;LO7/b$a;LO7/a0;Ly7/k;)V

    iget-object v0, p0, LR7/J$b;->D:LR7/J;

    iget-object v1, p0, LR7/J$b;->E:LO7/d;

    sget-object v2, LR7/J;->k0:LR7/J$a;

    invoke-virtual {v0}, LR7/J;->x1()LO7/e0;

    move-result-object v3

    invoke-static {v2, v3}, LR7/J$a;->a(LR7/J$a;LO7/e0;)LF8/n0;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return-object v3

    :cond_0
    invoke-interface {v1}, LO7/a;->m0()LO7/X;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-interface {v4, v2}, LO7/X;->c(LF8/n0;)LO7/X;

    move-result-object v3

    :cond_1
    invoke-interface {v1}, LO7/a;->A0()Ljava/util/List;

    move-result-object v1

    const-string v4, "getContextReceiverParameters(...)"

    invoke-static {v1, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LO7/X;

    invoke-interface {v5, v2}, LO7/X;->c(LF8/n0;)LO7/X;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, LR7/J;->x1()LO7/e0;

    move-result-object v1

    invoke-interface {v1}, LO7/i;->A()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v0}, LR7/p;->n()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v0}, LR7/J;->l()LF8/E;

    move-result-object v7

    sget-object v8, LO7/D;->D:LO7/D;

    invoke-virtual {v0}, LR7/J;->x1()LO7/e0;

    move-result-object v0

    invoke-interface {v0}, LO7/C;->h()LO7/u;

    move-result-object v10

    const/4 v1, 0x0

    move-object v0, v9

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v10

    invoke-virtual/range {v0 .. v8}, LR7/p;->a1(LO7/X;LO7/X;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LO7/D;LO7/u;)LR7/p;

    return-object v9
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR7/J$b;->a()LR7/J;

    move-result-object v0

    return-object v0
.end method
