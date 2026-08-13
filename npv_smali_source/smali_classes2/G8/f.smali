.class public abstract LG8/f;
.super LF8/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG8/f$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LF8/g;-><init>()V

    return-void
.end method

.method private final c(LF8/M;)LF8/M;
    .locals 14

    .prologue
    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    instance-of v1, v0, Ls8/c;

    const/16 v2, 0xa

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    check-cast v0, Ls8/c;

    invoke-virtual {v0}, Ls8/c;->a()LF8/i0;

    move-result-object v1

    invoke-interface {v1}, LF8/i0;->a()LF8/u0;

    move-result-object v4

    sget-object v5, LF8/u0;->H:LF8/u0;

    if-ne v4, v5, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_1

    invoke-interface {v1}, LF8/i0;->getType()LF8/E;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LF8/E;->Z0()LF8/t0;

    move-result-object v3

    :cond_1
    move-object v7, v3

    invoke-virtual {v0}, Ls8/c;->c()LG8/j;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Ls8/c;->a()LF8/i0;

    move-result-object v9

    invoke-virtual {v0}, Ls8/c;->u()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/E;

    invoke-virtual {v2}, LF8/E;->Z0()LF8/t0;

    move-result-object v2

    invoke-interface {v10, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v1, LG8/j;

    const/4 v11, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v8, v1

    invoke-direct/range {v8 .. v13}, LG8/j;-><init>(LF8/i0;Ljava/util/List;LG8/j;ILy7/k;)V

    invoke-virtual {v0, v1}, Ls8/c;->e(LG8/j;)V

    :cond_3
    new-instance v1, LG8/i;

    sget-object v5, LJ8/b;->C:LJ8/b;

    invoke-virtual {v0}, Ls8/c;->c()LG8/j;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LF8/E;->V0()LF8/a0;

    move-result-object v8

    invoke-virtual {p1}, LF8/E;->X0()Z

    move-result v9

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v12}, LG8/i;-><init>(LJ8/b;LG8/j;LF8/t0;LF8/a0;ZZILy7/k;)V

    return-object v1

    :cond_4
    instance-of v1, v0, LF8/D;

    if-eqz v1, :cond_9

    invoke-virtual {p1}, LF8/E;->X0()Z

    move-result v1

    if-eqz v1, :cond_9

    check-cast v0, LF8/D;

    invoke-virtual {v0}, LF8/D;->u()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/E;

    invoke-static {v2}, LK8/a;->w(LF8/E;)LF8/E;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    goto :goto_2

    :cond_5
    if-nez v2, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v0}, LF8/D;->d()LF8/E;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {p1}, LK8/a;->w(LF8/E;)LF8/E;

    move-result-object v3

    :cond_7
    new-instance p1, LF8/D;

    invoke-direct {p1, v1}, LF8/D;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1, v3}, LF8/D;->h(LF8/E;)LF8/D;

    move-result-object v3

    :goto_3
    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    move-object v0, v3

    :goto_4
    invoke-virtual {v0}, LF8/D;->c()LF8/M;

    move-result-object p1

    :cond_9
    return-object p1
.end method


# virtual methods
.method public bridge synthetic a(LJ8/i;)LJ8/i;
    .locals 0

    invoke-virtual {p0, p1}, LG8/f;->b(LJ8/i;)LF8/t0;

    move-result-object p1

    return-object p1
.end method

.method public b(LJ8/i;)LF8/t0;
    .locals 4

    .prologue
    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LF8/E;

    if-eqz v0, :cond_4

    check-cast p1, LF8/E;

    invoke-virtual {p1}, LF8/E;->Z0()LF8/t0;

    move-result-object p1

    instance-of v0, p1, LF8/M;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LF8/M;

    invoke-direct {p0, v0}, LG8/f;->c(LF8/M;)LF8/M;

    move-result-object v0

    goto :goto_1

    :cond_0
    instance-of v0, p1, LF8/y;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, LF8/y;

    invoke-virtual {v0}, LF8/y;->e1()LF8/M;

    move-result-object v1

    invoke-direct {p0, v1}, LG8/f;->c(LF8/M;)LF8/M;

    move-result-object v1

    invoke-virtual {v0}, LF8/y;->f1()LF8/M;

    move-result-object v2

    invoke-direct {p0, v2}, LG8/f;->c(LF8/M;)LF8/M;

    move-result-object v2

    invoke-virtual {v0}, LF8/y;->e1()LF8/M;

    move-result-object v3

    if-ne v1, v3, :cond_2

    invoke-virtual {v0}, LF8/y;->f1()LF8/M;

    move-result-object v0

    if-eq v2, v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p1

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {v1, v2}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object v0

    :goto_1
    new-instance v1, LG8/f$b;

    invoke-direct {v1, p0}, LG8/f$b;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, p1, v1}, LF8/s0;->c(LF8/t0;LF8/E;Lx7/l;)LF8/t0;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
