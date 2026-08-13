.class public abstract LO7/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LO7/h0;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Ln8/f;)Z
.end method

.method public abstract b()Ljava/util/List;
.end method

.method public final c(Lx7/l;)LO7/h0;
    .locals 4

    .prologue
    const-string v0, "transform"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LO7/z;

    if-eqz v0, :cond_0

    new-instance v0, LO7/z;

    move-object v1, p0

    check-cast v1, LO7/z;

    invoke-virtual {v1}, LO7/z;->d()Ln8/f;

    move-result-object v2

    invoke-virtual {v1}, LO7/z;->e()LJ8/j;

    move-result-object v1

    invoke-interface {p1, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LJ8/j;

    invoke-direct {v0, v2, p1}, LO7/z;-><init>(Ln8/f;LJ8/j;)V

    goto :goto_1

    :cond_0
    instance-of v0, p0, LO7/H;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LO7/h0;->b()Ljava/util/List;

    move-result-object v0

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

    check-cast v2, Li7/u;

    invoke-virtual {v2}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln8/f;

    invoke-virtual {v2}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJ8/j;

    invoke-interface {p1, v2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, LO7/H;

    invoke-direct {v0, v1}, LO7/H;-><init>(Ljava/util/List;)V

    :goto_1
    return-object v0

    :cond_2
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1
.end method
