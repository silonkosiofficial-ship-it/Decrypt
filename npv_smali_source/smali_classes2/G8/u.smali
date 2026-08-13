.class public final LG8/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG8/u$a;
    }
.end annotation


# static fields
.field public static final a:LG8/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LG8/u;

    invoke-direct {v0}, LG8/u;-><init>()V

    sput-object v0, LG8/u;->a:LG8/u;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(LG8/u;LF8/E;LF8/E;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, LG8/u;->e(LF8/E;LF8/E;)Z

    move-result p0

    return p0
.end method

.method private final b(Ljava/util/Collection;Lx7/p;)Ljava/util/Collection;
    .locals 4

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-string v1, "iterator(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/M;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LF8/M;

    if-eq v3, v1, :cond_2

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p2, v3, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method private final d(Ljava/util/Set;)LF8/M;
    .locals 3

    .prologue
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->F0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF8/M;

    return-object p1

    :cond_0
    new-instance v0, LG8/u$b;

    invoke-direct {v0, p1}, LG8/u$b;-><init>(Ljava/util/Set;)V

    check-cast p1, Ljava/util/Collection;

    new-instance v0, LG8/u$c;

    invoke-direct {v0, p0}, LG8/u$c;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, p1, v0}, LG8/u;->b(Ljava/util/Collection;Lx7/p;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    sget-object v1, Lt8/n;->f:Lt8/n$a;

    invoke-virtual {v1, v0}, Lt8/n$a;->b(Ljava/util/Collection;)LF8/M;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    new-instance v1, LG8/u$d;

    sget-object v2, LG8/l;->b:LG8/l$a;

    invoke-virtual {v2}, LG8/l$a;->a()LG8/m;

    move-result-object v2

    invoke-direct {v1, v2}, LG8/u$d;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, v0, v1}, LG8/u;->b(Ljava/util/Collection;Lx7/p;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->F0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF8/M;

    return-object p1

    :cond_2
    new-instance v0, LF8/D;

    invoke-direct {v0, p1}, LF8/D;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, LF8/D;->c()LF8/M;

    move-result-object p1

    return-object p1
.end method

.method private final e(LF8/E;LF8/E;)Z
    .locals 2

    .prologue
    sget-object v0, LG8/l;->b:LG8/l$a;

    invoke-virtual {v0}, LG8/l$a;->a()LG8/m;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LG8/m;->d(LF8/E;LF8/E;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p2, p1}, LG8/m;->d(LF8/E;LF8/E;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public final c(Ljava/util/List;)LF8/M;
    .locals 8

    .prologue
    const-string v0, "types"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    const/16 v4, 0xa

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/M;

    invoke-virtual {v2}, LF8/E;->W0()LF8/e0;

    move-result-object v5

    instance-of v5, v5, LF8/D;

    if-eqz v5, :cond_2

    invoke-virtual {v2}, LF8/E;->W0()LF8/e0;

    move-result-object v5

    invoke-interface {v5}, LF8/e0;->u()Ljava/util/Collection;

    move-result-object v5

    const-string v6, "getSupertypes(...)"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LF8/E;

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v5}, LF8/B;->d(LF8/E;)LF8/M;

    move-result-object v5

    invoke-virtual {v2}, LF8/E;->X0()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v5, v3}, LF8/M;->d1(Z)LF8/M;

    move-result-object v5

    :cond_0
    invoke-interface {v6, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    sget-object v1, LG8/u$a;->C:LG8/u$a;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LF8/t0;

    invoke-virtual {v1, v5}, LG8/u$a;->g(LF8/t0;)LG8/u$a;

    move-result-object v1

    goto :goto_2

    :cond_4
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LF8/M;

    sget-object v6, LG8/u$a;->F:LG8/u$a;

    if-ne v1, v6, :cond_6

    instance-of v6, v5, LG8/i;

    if-eqz v6, :cond_5

    check-cast v5, LG8/i;

    invoke-static {v5}, LF8/Q;->k(LG8/i;)LG8/i;

    move-result-object v5

    :cond_5
    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v5, v6, v3, v7}, LF8/Q;->i(LF8/M;ZILjava/lang/Object;)LF8/M;

    move-result-object v5

    :cond_6
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1, v4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/M;

    invoke-virtual {v1}, LF8/E;->V0()LF8/a0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/a0;

    check-cast v0, LF8/a0;

    invoke-virtual {v0, v1}, LF8/a0;->D(LF8/a0;)LF8/a0;

    move-result-object v0

    goto :goto_5

    :cond_9
    check-cast v0, LF8/a0;

    invoke-direct {p0, v2}, LG8/u;->d(Ljava/util/Set;)LF8/M;

    move-result-object p1

    invoke-virtual {p1, v0}, LF8/M;->e1(LF8/a0;)LF8/M;

    move-result-object p1

    return-object p1

    :cond_a
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Empty collection can\'t be reduced."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
