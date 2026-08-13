.class final LF8/f$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF8/f;-><init>(LE8/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF8/f;


# direct methods
.method constructor <init>(LF8/f;)V
    .locals 0

    iput-object p1, p0, LF8/f$e;->D:LF8/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF8/f$b;)V
    .locals 7

    .prologue
    const-string v0, "supertypes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/f$e;->D:LF8/f;

    invoke-virtual {v0}, LF8/f;->k()LO7/d0;

    move-result-object v0

    iget-object v1, p0, LF8/f$e;->D:LF8/f;

    invoke-virtual {p1}, LF8/f$b;->a()Ljava/util/Collection;

    move-result-object v2

    new-instance v3, LF8/f$e$c;

    iget-object v4, p0, LF8/f$e;->D:LF8/f;

    invoke-direct {v3, v4}, LF8/f$e$c;-><init>(LF8/f;)V

    new-instance v4, LF8/f$e$d;

    iget-object v5, p0, LF8/f$e;->D:LF8/f;

    invoke-direct {v4, v5}, LF8/f$e$d;-><init>(LF8/f;)V

    invoke-interface {v0, v1, v2, v3, v4}, LO7/d0;->a(LF8/e0;Ljava/util/Collection;Lx7/l;Lx7/l;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v0, p0, LF8/f$e;->D:LF8/f;

    invoke-virtual {v0}, LF8/f;->h()LF8/E;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    :cond_1
    check-cast v0, Ljava/util/Collection;

    :cond_2
    iget-object v1, p0, LF8/f$e;->D:LF8/f;

    invoke-virtual {v1}, LF8/f;->j()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, LF8/f$e;->D:LF8/f;

    invoke-virtual {v1}, LF8/f;->k()LO7/d0;

    move-result-object v1

    iget-object v3, p0, LF8/f$e;->D:LF8/f;

    new-instance v4, LF8/f$e$a;

    invoke-direct {v4, v3}, LF8/f$e$a;-><init>(LF8/f;)V

    new-instance v5, LF8/f$e$b;

    iget-object v6, p0, LF8/f$e;->D:LF8/f;

    invoke-direct {v5, v6}, LF8/f$e$b;-><init>(LF8/f;)V

    invoke-interface {v1, v3, v0, v4, v5}, LO7/d0;->a(LF8/e0;Ljava/util/Collection;Lx7/l;Lx7/l;)Ljava/util/Collection;

    :cond_3
    iget-object v1, p0, LF8/f$e;->D:LF8/f;

    instance-of v3, v0, Ljava/util/List;

    if-eqz v3, :cond_4

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    :cond_4
    if-nez v2, :cond_5

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    :cond_5
    invoke-virtual {v1, v2}, LF8/f;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, LF8/f$b;->c(Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF8/f$b;

    invoke-virtual {p0, p1}, LF8/f$e;->a(LF8/f$b;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
