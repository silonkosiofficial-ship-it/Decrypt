.class public final LX7/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX7/l$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lr8/g$a;
    .locals 1

    sget-object v0, Lr8/g$a;->D:Lr8/g$a;

    return-object v0
.end method

.method public b(LO7/a;LO7/a;LO7/e;)Lr8/g$b;
    .locals 5

    .prologue
    const-string p3, "superDescriptor"

    invoke-static {p1, p3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "subDescriptor"

    invoke-static {p2, p3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p3, p2, LZ7/e;

    if-eqz p3, :cond_9

    move-object p3, p2

    check-cast p3, LZ7/e;

    invoke-virtual {p3}, LR7/p;->g()Ljava/util/List;

    move-result-object v0

    const-string v1, "getTypeParameters(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-static {p1, p2}, Lr8/l;->w(LO7/a;LO7/a;)Lr8/l$i;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lr8/l$i;->c()Lr8/l$i$a;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_2

    sget-object p1, Lr8/g$b;->F:Lr8/g$b;

    return-object p1

    :cond_2
    invoke-virtual {p3}, LR7/p;->n()Ljava/util/List;

    move-result-object v0

    const-string v4, "getValueParameters(...)"

    invoke-static {v0, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->Y(Ljava/lang/Iterable;)LR8/h;

    move-result-object v0

    sget-object v4, LX7/l$b;->D:LX7/l$b;

    invoke-static {v0, v4}, LR8/k;->G(LR8/h;Lx7/l;)LR8/h;

    move-result-object v0

    invoke-virtual {p3}, LR7/p;->l()LF8/E;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0, v4}, LR8/k;->J(LR8/h;Ljava/lang/Object;)LR8/h;

    move-result-object v0

    invoke-virtual {p3}, LR7/p;->v0()LO7/X;

    move-result-object p3

    if-eqz p3, :cond_3

    invoke-interface {p3}, LO7/i0;->getType()LF8/E;

    move-result-object p3

    goto :goto_1

    :cond_3
    move-object p3, v3

    :goto_1
    invoke-static {p3}, Lj7/v;->q(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-static {v0, p3}, LR8/k;->I(LR8/h;Ljava/lang/Iterable;)LR8/h;

    move-result-object p3

    invoke-interface {p3}, LR8/h;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_4
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/E;

    invoke-virtual {v0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v2

    if-eqz v4, :cond_4

    invoke-virtual {v0}, LF8/E;->Z0()LF8/t0;

    move-result-object v0

    instance-of v0, v0, Lc8/h;

    if-nez v0, :cond_4

    sget-object p1, Lr8/g$b;->F:Lr8/g$b;

    return-object p1

    :cond_5
    new-instance p3, Lc8/g;

    invoke-direct {p3, v3, v2, v3}, Lc8/g;-><init>(LF8/h0;ILy7/k;)V

    invoke-virtual {p3}, LF8/l0;->c()LF8/n0;

    move-result-object p3

    invoke-interface {p1, p3}, LO7/c0;->c(LF8/n0;)LO7/n;

    move-result-object p1

    check-cast p1, LO7/a;

    if-nez p1, :cond_6

    sget-object p1, Lr8/g$b;->F:Lr8/g$b;

    return-object p1

    :cond_6
    instance-of p3, p1, LO7/Z;

    if-eqz p3, :cond_7

    move-object p3, p1

    check-cast p3, LO7/Z;

    invoke-interface {p3}, LO7/a;->g()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v2

    if-eqz v0, :cond_7

    invoke-interface {p3}, LO7/Z;->z()LO7/y$a;

    move-result-object p1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p3

    invoke-interface {p1, p3}, LO7/y$a;->y(Ljava/util/List;)LO7/y$a;

    move-result-object p1

    invoke-interface {p1}, LO7/y$a;->i()LO7/y;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    :cond_7
    sget-object p3, Lr8/l;->f:Lr8/l;

    const/4 v0, 0x0

    invoke-virtual {p3, p1, p2, v0}, Lr8/l;->F(LO7/a;LO7/a;Z)Lr8/l$i;

    move-result-object p1

    invoke-virtual {p1}, Lr8/l$i;->c()Lr8/l$i$a;

    move-result-object p1

    const-string p2, "getResult(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, LX7/l$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    if-ne p1, v2, :cond_8

    sget-object p1, Lr8/g$b;->C:Lr8/g$b;

    goto :goto_2

    :cond_8
    sget-object p1, Lr8/g$b;->F:Lr8/g$b;

    :goto_2
    return-object p1

    :cond_9
    :goto_3
    sget-object p1, Lr8/g$b;->F:Lr8/g$b;

    return-object p1
.end method
