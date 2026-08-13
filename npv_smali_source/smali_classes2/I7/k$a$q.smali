.class final LI7/k$a$q;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/k$a;-><init>(LI7/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/k$a;

.field final synthetic E:LI7/k;


# direct methods
.method constructor <init>(LI7/k$a;LI7/k;)V
    .locals 0

    iput-object p1, p0, LI7/k$a$q;->D:LI7/k$a;

    iput-object p2, p0, LI7/k$a$q;->E:LI7/k;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 7

    .prologue
    iget-object v0, p0, LI7/k$a$q;->D:LI7/k$a;

    invoke-virtual {v0}, LI7/k$a;->k()LO7/e;

    move-result-object v0

    invoke-interface {v0}, LO7/h;->p()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->u()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getSupertypes(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/lang/Iterable;

    iget-object v2, p0, LI7/k$a$q;->D:LI7/k$a;

    iget-object v3, p0, LI7/k$a$q;->E:LI7/k;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LF8/E;

    new-instance v5, LI7/A;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance v6, LI7/k$a$q$a;

    invoke-direct {v6, v4, v2, v3}, LI7/k$a$q$a;-><init>(LF8/E;LI7/k$a;LI7/k;)V

    invoke-direct {v5, v4, v6}, LI7/A;-><init>(LF8/E;Lx7/a;)V

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, LI7/k$a$q;->D:LI7/k$a;

    invoke-virtual {v0}, LI7/k$a;->k()LO7/e;

    move-result-object v0

    invoke-static {v0}, LL7/g;->u0(LO7/e;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LI7/A;

    invoke-virtual {v2}, LI7/A;->f()LF8/E;

    move-result-object v2

    invoke-static {v2}, Lr8/f;->e(LF8/E;)LO7/e;

    move-result-object v2

    invoke-interface {v2}, LO7/e;->j()LO7/f;

    move-result-object v2

    const-string v3, "getKind(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, LO7/f;->E:LO7/f;

    if-eq v2, v3, :cond_2

    sget-object v3, LO7/f;->H:LO7/f;

    if-ne v2, v3, :cond_4

    goto :goto_1

    :cond_3
    :goto_2
    new-instance v0, LI7/A;

    iget-object v2, p0, LI7/k$a$q;->D:LI7/k$a;

    invoke-virtual {v2}, LI7/k$a;->k()LO7/e;

    move-result-object v2

    invoke-static {v2}, Lv8/c;->j(LO7/m;)LL7/g;

    move-result-object v2

    invoke-virtual {v2}, LL7/g;->i()LF8/M;

    move-result-object v2

    const-string v3, "getAnyType(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, LI7/k$a$q$b;->D:LI7/k$a$q$b;

    invoke-direct {v0, v2, v3}, LI7/A;-><init>(LF8/E;Lx7/a;)V

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-static {v1}, LP8/a;->c(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/k$a$q;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
