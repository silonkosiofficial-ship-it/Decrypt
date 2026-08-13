.class public final LB8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB8/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB8/d$a;
    }
.end annotation


# instance fields
.field private final a:LA8/a;

.field private final b:LB8/e;


# direct methods
.method public constructor <init>(LO7/G;LO7/J;LA8/a;)V
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocol"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LB8/d;->a:LA8/a;

    new-instance p3, LB8/e;

    invoke-direct {p3, p1, p2}, LB8/e;-><init>(LO7/G;LO7/J;)V

    iput-object p3, p0, LB8/d;->b:LB8/e;

    return-void
.end method


# virtual methods
.method public a(Li8/s;Lk8/c;)Ljava/util/List;
    .locals 3

    .prologue
    const-string v0, "proto"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB8/d;->a:LA8/a;

    invoke-virtual {v0}, LA8/a;->p()Lp8/i$f;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp8/i$d;->u(Lp8/i$f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/b;

    iget-object v2, p0, LB8/d;->b:LB8/e;

    invoke-virtual {v2, v1, p2}, LB8/e;->a(Li8/b;Lk8/c;)LP7/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public b(LB8/A;Lp8/p;LB8/b;ILi8/u;)Ljava/util/List;
    .locals 1

    .prologue
    const-string p4, "container"

    invoke-static {p1, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "callableProto"

    invoke-static {p2, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "kind"

    invoke-static {p3, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "proto"

    invoke-static {p5, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LB8/d;->a:LA8/a;

    invoke-virtual {p2}, LA8/a;->h()Lp8/i$f;

    move-result-object p2

    invoke-virtual {p5, p2}, Lp8/i$d;->u(Lp8/i$f;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p2

    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p2, p4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Li8/b;

    iget-object p5, p0, LB8/d;->b:LB8/e;

    invoke-virtual {p1}, LB8/A;->b()Lk8/c;

    move-result-object v0

    invoke-virtual {p5, p4, v0}, LB8/e;->a(Li8/b;Lk8/c;)LP7/c;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object p3
.end method

.method public c(LB8/A;Li8/g;)Ljava/util/List;
    .locals 4

    .prologue
    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB8/d;->a:LA8/a;

    invoke-virtual {v0}, LA8/a;->d()Lp8/i$f;

    move-result-object v0

    invoke-virtual {p2, v0}, Lp8/i$d;->u(Lp8/i$f;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p2

    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/b;

    iget-object v2, p0, LB8/d;->b:LB8/e;

    invoke-virtual {p1}, LB8/A;->b()Lk8/c;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, LB8/e;->a(Li8/b;Lk8/c;)LP7/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public d(LB8/A;Li8/n;)Ljava/util/List;
    .locals 4

    .prologue
    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB8/d;->a:LA8/a;

    invoke-virtual {v0}, LA8/a;->j()Lp8/i$f;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, v0}, Lp8/i$d;->u(Lp8/i$f;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p2

    :cond_1
    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/b;

    iget-object v2, p0, LB8/d;->b:LB8/e;

    invoke-virtual {p1}, LB8/A;->b()Lk8/c;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, LB8/e;->a(Li8/b;Lk8/c;)LP7/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method public bridge synthetic e(LB8/A;Li8/n;LF8/E;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LB8/d;->m(LB8/A;Li8/n;LF8/E;)Lt8/g;

    move-result-object p1

    return-object p1
.end method

.method public f(LB8/A;Li8/n;)Ljava/util/List;
    .locals 4

    .prologue
    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB8/d;->a:LA8/a;

    invoke-virtual {v0}, LA8/a;->k()Lp8/i$f;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, v0}, Lp8/i$d;->u(Lp8/i$f;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p2

    :cond_1
    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/b;

    iget-object v2, p0, LB8/d;->b:LB8/e;

    invoke-virtual {p1}, LB8/A;->b()Lk8/c;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, LB8/e;->a(Li8/b;Lk8/c;)LP7/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method public g(Li8/q;Lk8/c;)Ljava/util/List;
    .locals 3

    .prologue
    const-string v0, "proto"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB8/d;->a:LA8/a;

    invoke-virtual {v0}, LA8/a;->o()Lp8/i$f;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp8/i$d;->u(Lp8/i$f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/b;

    iget-object v2, p0, LB8/d;->b:LB8/e;

    invoke-virtual {v2, v1, p2}, LB8/e;->a(Li8/b;Lk8/c;)LP7/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public h(LB8/A$a;)Ljava/util/List;
    .locals 5

    .prologue
    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LB8/A$a;->f()Li8/c;

    move-result-object v0

    iget-object v1, p0, LB8/d;->a:LA8/a;

    invoke-virtual {v1}, LA8/a;->a()Lp8/i$f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp8/i$d;->u(Lp8/i$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    :cond_0
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

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li8/b;

    iget-object v3, p0, LB8/d;->b:LB8/e;

    invoke-virtual {p1}, LB8/A;->b()Lk8/c;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, LB8/e;->a(Li8/b;Lk8/c;)LP7/c;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public i(LB8/A;Lp8/p;LB8/b;)Ljava/util/List;
    .locals 3

    .prologue
    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Li8/d;

    if-eqz v0, :cond_0

    check-cast p2, Li8/d;

    iget-object p3, p0, LB8/d;->a:LA8/a;

    invoke-virtual {p3}, LA8/a;->c()Lp8/i$f;

    move-result-object p3

    :goto_0
    invoke-virtual {p2, p3}, Lp8/i$d;->u(Lp8/i$f;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    goto :goto_1

    :cond_0
    instance-of v0, p2, Li8/i;

    if-eqz v0, :cond_1

    check-cast p2, Li8/i;

    iget-object p3, p0, LB8/d;->a:LA8/a;

    invoke-virtual {p3}, LA8/a;->f()Lp8/i$f;

    move-result-object p3

    goto :goto_0

    :cond_1
    instance-of v0, p2, Li8/n;

    if-eqz v0, :cond_7

    sget-object v0, LB8/d$a;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x1

    if-eq p3, v0, :cond_4

    const/4 v0, 0x2

    if-eq p3, v0, :cond_3

    const/4 v0, 0x3

    if-ne p3, v0, :cond_2

    check-cast p2, Li8/n;

    iget-object p3, p0, LB8/d;->a:LA8/a;

    invoke-virtual {p3}, LA8/a;->n()Lp8/i$f;

    move-result-object p3

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unsupported callable kind with property proto"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    check-cast p2, Li8/n;

    iget-object p3, p0, LB8/d;->a:LA8/a;

    invoke-virtual {p3}, LA8/a;->m()Lp8/i$f;

    move-result-object p3

    goto :goto_0

    :cond_4
    check-cast p2, Li8/n;

    iget-object p3, p0, LB8/d;->a:LA8/a;

    invoke-virtual {p3}, LA8/a;->i()Lp8/i$f;

    move-result-object p3

    goto :goto_0

    :goto_1
    if-nez p2, :cond_5

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p2

    :cond_5
    check-cast p2, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/b;

    iget-object v1, p0, LB8/d;->b:LB8/e;

    invoke-virtual {p1}, LB8/A;->b()Lk8/c;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, LB8/e;->a(Li8/b;Lk8/c;)LP7/c;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    return-object p3

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown message: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j(LB8/A;Lp8/p;LB8/b;)Ljava/util/List;
    .locals 3

    .prologue
    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Li8/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object p3, p0, LB8/d;->a:LA8/a;

    invoke-virtual {p3}, LA8/a;->g()Lp8/i$f;

    move-result-object p3

    if-eqz p3, :cond_3

    check-cast p2, Li8/i;

    :goto_0
    invoke-virtual {p2, p3}, Lp8/i$d;->u(Lp8/i$f;)Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Ljava/util/List;

    goto :goto_2

    :cond_0
    instance-of v0, p2, Li8/n;

    if-eqz v0, :cond_6

    sget-object v0, LB8/d$a;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-ne v0, v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unsupported callable kind with property proto for receiver annotations: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    iget-object p3, p0, LB8/d;->a:LA8/a;

    invoke-virtual {p3}, LA8/a;->l()Lp8/i$f;

    move-result-object p3

    if-eqz p3, :cond_3

    check-cast p2, Li8/n;

    goto :goto_0

    :cond_3
    :goto_2
    if-nez v1, :cond_4

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    :cond_4
    check-cast v1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    const/16 p3, 0xa

    invoke-static {v1, p3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/b;

    iget-object v1, p0, LB8/d;->b:LB8/e;

    invoke-virtual {p1}, LB8/A;->b()Lk8/c;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, LB8/e;->a(Li8/b;Lk8/c;)LP7/c;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    return-object p2

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown message: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic k(LB8/A;Li8/n;LF8/E;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LB8/d;->l(LB8/A;Li8/n;LF8/E;)Lt8/g;

    move-result-object p1

    return-object p1
.end method

.method public l(LB8/A;Li8/n;LF8/E;)Lt8/g;
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "proto"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "expectedType"

    invoke-static {p3, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public m(LB8/A;Li8/n;LF8/E;)Lt8/g;
    .locals 1

    .prologue
    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expectedType"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB8/d;->a:LA8/a;

    invoke-virtual {v0}, LA8/a;->b()Lp8/i$f;

    move-result-object v0

    invoke-static {p2, v0}, Lk8/e;->a(Lp8/i$d;Lp8/i$f;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li8/b$b$c;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, LB8/d;->b:LB8/e;

    invoke-virtual {p1}, LB8/A;->b()Lk8/c;

    move-result-object p1

    invoke-virtual {v0, p3, p2, p1}, LB8/e;->f(LF8/E;Li8/b$b$c;Lk8/c;)Lt8/g;

    move-result-object p1

    return-object p1
.end method
