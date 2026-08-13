.class public final LD8/m;
.super LR7/b;
.source "SourceFile"


# instance fields
.field private final M:LB8/m;

.field private final N:Li8/s;

.field private final O:LD8/a;


# direct methods
.method public constructor <init>(LB8/m;Li8/s;I)V
    .locals 11

    const-string v0, "c"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LB8/m;->h()LE8/n;

    move-result-object v2

    invoke-virtual {p1}, LB8/m;->e()LO7/m;

    move-result-object v3

    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v4

    invoke-virtual {p1}, LB8/m;->g()Lk8/c;

    move-result-object v0

    invoke-virtual {p2}, Li8/s;->N()I

    move-result v1

    invoke-static {v0, v1}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v5

    sget-object v0, LB8/B;->a:LB8/B;

    invoke-virtual {p2}, Li8/s;->T()Li8/s$c;

    move-result-object v1

    const-string v6, "getVariance(...)"

    invoke-static {v1, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LB8/B;->d(Li8/s$c;)LF8/u0;

    move-result-object v6

    invoke-virtual {p2}, Li8/s;->O()Z

    move-result v7

    sget-object v9, LO7/a0;->a:LO7/a0;

    sget-object v10, LO7/d0$a;->a:LO7/d0$a;

    move-object v1, p0

    move v8, p3

    invoke-direct/range {v1 .. v10}, LR7/b;-><init>(LE8/n;LO7/m;LP7/g;Ln8/f;LF8/u0;ZILO7/a0;LO7/d0;)V

    iput-object p1, p0, LD8/m;->M:LB8/m;

    iput-object p2, p0, LD8/m;->N:Li8/s;

    new-instance p2, LD8/a;

    invoke-virtual {p1}, LB8/m;->h()LE8/n;

    move-result-object p1

    new-instance p3, LD8/m$a;

    invoke-direct {p3, p0}, LD8/m$a;-><init>(LD8/m;)V

    invoke-direct {p2, p1, p3}, LD8/a;-><init>(LE8/n;Lx7/a;)V

    iput-object p2, p0, LD8/m;->O:LD8/a;

    return-void
.end method

.method public static final synthetic V0(LD8/m;)LB8/m;
    .locals 0

    iget-object p0, p0, LD8/m;->M:LB8/m;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic T0(LF8/E;)V
    .locals 0

    invoke-virtual {p0, p1}, LD8/m;->Y0(LF8/E;)Ljava/lang/Void;

    return-void
.end method

.method protected U0()Ljava/util/List;
    .locals 4

    .prologue
    iget-object v0, p0, LD8/m;->N:Li8/s;

    iget-object v1, p0, LD8/m;->M:LB8/m;

    invoke-virtual {v1}, LB8/m;->j()Lk8/g;

    move-result-object v1

    invoke-static {v0, v1}, Lk8/f;->s(Li8/s;Lk8/g;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Lv8/c;->j(LO7/m;)LL7/g;

    move-result-object v0

    invoke-virtual {v0}, LL7/g;->y()LF8/M;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, LD8/m;->M:LB8/m;

    invoke-virtual {v1}, LB8/m;->i()LB8/E;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li8/q;

    invoke-virtual {v1, v3}, LB8/E;->q(Li8/q;)LF8/E;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method public W0()LD8/a;
    .locals 1

    iget-object v0, p0, LD8/m;->O:LD8/a;

    return-object v0
.end method

.method public final X0()Li8/s;
    .locals 1

    iget-object v0, p0, LD8/m;->N:Li8/s;

    return-object v0
.end method

.method protected Y0(LF8/E;)Ljava/lang/Void;
    .locals 2

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "There should be no cycles for deserialized type parameters, but found for: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic k()LP7/g;
    .locals 1

    invoke-virtual {p0}, LD8/m;->W0()LD8/a;

    move-result-object v0

    return-object v0
.end method
