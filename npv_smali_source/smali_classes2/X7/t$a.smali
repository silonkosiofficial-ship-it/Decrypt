.class public final LX7/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX7/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LX7/t$a;-><init>()V

    return-void
.end method

.method private final b(LO7/y;)Z
    .locals 5

    .prologue
    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, LO7/y;->b()LO7/m;

    move-result-object v0

    instance-of v3, v0, LO7/e;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    check-cast v0, LO7/e;

    goto :goto_0

    :cond_1
    move-object v0, v4

    :goto_0
    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object p1

    const-string v3, "getValueParameters(...)"

    invoke-static {p1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/j0;

    invoke-interface {p1}, LO7/i0;->getType()LF8/E;

    move-result-object p1

    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object p1

    invoke-interface {p1}, LF8/e0;->w()LO7/h;

    move-result-object p1

    instance-of v3, p1, LO7/e;

    if-eqz v3, :cond_3

    move-object v4, p1

    check-cast v4, LO7/e;

    :cond_3
    if-nez v4, :cond_4

    return v1

    :cond_4
    invoke-static {v0}, LL7/g;->r0(LO7/e;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {v0}, Lv8/c;->l(LO7/m;)Ln8/c;

    move-result-object p1

    invoke-static {v4}, Lv8/c;->l(LO7/m;)Ln8/c;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    move v1, v2

    :cond_5
    return v1
.end method

.method private final c(LO7/y;LO7/j0;)Lg8/o;
    .locals 2

    .prologue
    invoke-static {p1}, Lg8/y;->e(LO7/a;)Z

    move-result v0

    const-string v1, "getType(...)"

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, LX7/t$a;->b(LO7/y;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p2}, LO7/i0;->getType()LF8/E;

    move-result-object p1

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-static {p1}, Lg8/y;->g(LF8/E;)Lg8/o;

    move-result-object p1

    goto :goto_2

    :cond_1
    :goto_1
    invoke-interface {p2}, LO7/i0;->getType()LF8/E;

    move-result-object p1

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LK8/a;->w(LF8/E;)LF8/E;

    move-result-object p1

    goto :goto_0

    :goto_2
    return-object p1
.end method


# virtual methods
.method public final a(LO7/a;LO7/a;)Z
    .locals 5

    .prologue
    const-string v0, "superDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subDescriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, LZ7/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    instance-of v0, p1, LO7/y;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p2

    check-cast v0, LZ7/e;

    invoke-virtual {v0}, LR7/p;->n()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    check-cast p1, LO7/y;

    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    invoke-virtual {v0}, LR7/G;->v1()LO7/Z;

    move-result-object v0

    invoke-interface {v0}, LO7/a;->n()Ljava/util/List;

    move-result-object v0

    const-string v2, "getValueParameters(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {p1}, LO7/y;->a()LO7/y;

    move-result-object v3

    invoke-interface {v3}, LO7/a;->n()Ljava/util/List;

    move-result-object v3

    invoke-static {v3, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v0, v3}, Lj7/v;->c1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li7/u;

    invoke-virtual {v2}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO7/j0;

    invoke-virtual {v2}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/j0;

    move-object v4, p2

    check-cast v4, LO7/y;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, v4, v3}, LX7/t$a;->c(LO7/y;LO7/j0;)Lg8/o;

    move-result-object v3

    instance-of v3, v3, Lg8/o$d;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, p1, v2}, LX7/t$a;->c(LO7/y;LO7/j0;)Lg8/o;

    move-result-object v2

    instance-of v2, v2, Lg8/o$d;

    if-eq v3, v2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v1
.end method
