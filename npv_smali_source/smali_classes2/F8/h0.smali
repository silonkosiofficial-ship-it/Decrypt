.class public final LF8/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/h0$a;,
        LF8/h0$b;
    }
.end annotation


# static fields
.field public static final f:LF8/h0$a;


# instance fields
.field private final a:LF8/v;

.field private final b:LF8/g0;

.field private final c:LE8/f;

.field private final d:Li7/n;

.field private final e:LE8/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF8/h0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF8/h0$a;-><init>(Ly7/k;)V

    sput-object v0, LF8/h0;->f:LF8/h0$a;

    return-void
.end method

.method public constructor <init>(LF8/v;LF8/g0;)V
    .locals 1

    const-string v0, "projectionComputer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF8/h0;->a:LF8/v;

    iput-object p2, p0, LF8/h0;->b:LF8/g0;

    new-instance p1, LE8/f;

    const-string p2, "Type parameter upper bound erasure results"

    invoke-direct {p1, p2}, LE8/f;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LF8/h0;->c:LE8/f;

    new-instance p2, LF8/h0$c;

    invoke-direct {p2, p0}, LF8/h0$c;-><init>(LF8/h0;)V

    invoke-static {p2}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p2

    iput-object p2, p0, LF8/h0;->d:Li7/n;

    new-instance p2, LF8/h0$d;

    invoke-direct {p2, p0}, LF8/h0$d;-><init>(LF8/h0;)V

    invoke-virtual {p1, p2}, LE8/f;->b(Lx7/l;)LE8/g;

    move-result-object p1

    const-string p2, "createMemoizedFunction(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LF8/h0;->e:LE8/g;

    return-void
.end method

.method public synthetic constructor <init>(LF8/v;LF8/g0;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, LF8/g0;

    const/4 p3, 0x0

    invoke-direct {p2, p3, p3}, LF8/g0;-><init>(ZZ)V

    :cond_0
    invoke-direct {p0, p1, p2}, LF8/h0;-><init>(LF8/v;LF8/g0;)V

    return-void
.end method

.method public static final synthetic a(LF8/h0;LO7/f0;LF8/w;)LF8/E;
    .locals 0

    invoke-direct {p0, p1, p2}, LF8/h0;->d(LO7/f0;LF8/w;)LF8/E;

    move-result-object p0

    return-object p0
.end method

.method private final b(LF8/w;)LF8/E;
    .locals 0

    .prologue
    invoke-virtual {p1}, LF8/w;->a()LF8/M;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, LK8/a;->y(LF8/E;)LF8/E;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-direct {p0}, LF8/h0;->e()LH8/h;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method private final d(LO7/f0;LF8/w;)LF8/E;
    .locals 7

    .prologue
    invoke-virtual {p2}, LF8/w;->c()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LO7/f0;->a()LO7/f0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, p2}, LF8/h0;->b(LF8/w;)LF8/E;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, LO7/h;->w()LF8/M;

    move-result-object v1

    const-string v2, "getDefaultType(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, LK8/a;->g(LF8/E;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, Lj7/S;->d(I)I

    move-result v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, LE7/j;->d(II)I

    move-result v3

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO7/f0;

    if-eqz v0, :cond_2

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v3, p2}, LF8/q0;->t(LO7/f0;LF8/w;)LF8/i0;

    move-result-object v5

    const-string v6, "makeStarProjection(...)"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    :goto_1
    iget-object v5, p0, LF8/h0;->a:LF8/v;

    invoke-virtual {p2, p1}, LF8/w;->d(LO7/f0;)LF8/w;

    move-result-object v6

    invoke-virtual {p0, v3, v6}, LF8/h0;->c(LO7/f0;LF8/w;)LF8/E;

    move-result-object v6

    invoke-virtual {v5, v3, p2, p0, v6}, LF8/v;->a(LO7/f0;LF8/w;LF8/h0;LF8/E;)LF8/i0;

    move-result-object v5

    :goto_2
    invoke-interface {v3}, LO7/f0;->p()LF8/e0;

    move-result-object v3

    invoke-static {v3, v5}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v3

    invoke-virtual {v3}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    sget-object v0, LF8/f0;->c:LF8/f0$a;

    const/4 v1, 0x2

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static {v0, v4, v5, v1, v3}, LF8/f0$a;->e(LF8/f0$a;Ljava/util/Map;ZILjava/lang/Object;)LF8/f0;

    move-result-object v0

    invoke-static {v0}, LF8/n0;->g(LF8/l0;)LF8/n0;

    move-result-object v0

    const-string v1, "create(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/f0;->getUpperBounds()Ljava/util/List;

    move-result-object p1

    const-string v1, "getUpperBounds(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1, p2}, LF8/h0;->f(LF8/n0;Ljava/util/List;LF8/w;)Ljava/util/Set;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_7

    iget-object p2, p0, LF8/h0;->b:LF8/g0;

    invoke-virtual {p2}, LF8/g0;->a()Z

    move-result p2

    if-nez p2, :cond_5

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p2

    if-ne p2, v1, :cond_4

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->F0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF8/E;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Should only be one computed upper bound if no need to intersect all bounds"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/E;

    invoke-virtual {v0}, LF8/E;->Z0()LF8/t0;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-static {p2}, LG8/d;->a(Ljava/util/List;)LF8/t0;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-direct {p0, p2}, LF8/h0;->b(LF8/w;)LF8/E;

    move-result-object p1

    return-object p1
.end method

.method private final e()LH8/h;
    .locals 1

    iget-object v0, p0, LF8/h0;->d:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH8/h;

    return-object v0
.end method

.method private final f(LF8/n0;Ljava/util/List;LF8/w;)Ljava/util/Set;
    .locals 5

    .prologue
    invoke-static {}, Lj7/Z;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/E;

    invoke-virtual {v1}, LF8/E;->W0()LF8/e0;

    move-result-object v2

    invoke-interface {v2}, LF8/e0;->w()LO7/h;

    move-result-object v2

    instance-of v3, v2, LO7/e;

    if-eqz v3, :cond_1

    sget-object v2, LF8/h0;->f:LF8/h0$a;

    invoke-virtual {p3}, LF8/w;->c()Ljava/util/Set;

    move-result-object v3

    iget-object v4, p0, LF8/h0;->b:LF8/g0;

    invoke-virtual {v4}, LF8/g0;->b()Z

    move-result v4

    invoke-virtual {v2, v1, p1, v3, v4}, LF8/h0$a;->a(LF8/E;LF8/n0;Ljava/util/Set;Z)LF8/E;

    move-result-object v1

    :goto_0
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    instance-of v1, v2, LO7/f0;

    if-eqz v1, :cond_3

    invoke-virtual {p3}, LF8/w;->c()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    invoke-direct {p0, p3}, LF8/h0;->b(LF8/w;)LF8/E;

    move-result-object v1

    goto :goto_0

    :cond_2
    check-cast v2, LO7/f0;

    invoke-interface {v2}, LO7/f0;->getUpperBounds()Ljava/util/List;

    move-result-object v1

    const-string v2, "getUpperBounds(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, v1, p3}, LF8/h0;->f(LF8/n0;Ljava/util/List;LF8/w;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_3
    :goto_1
    iget-object v1, p0, LF8/h0;->b:LF8/g0;

    invoke-virtual {v1}, LF8/g0;->a()Z

    move-result v1

    if-nez v1, :cond_0

    :cond_4
    invoke-static {v0}, Lj7/Z;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final c(LO7/f0;LF8/w;)LF8/E;
    .locals 2

    const-string v0, "typeParameter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAttr"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/h0;->e:LE8/g;

    new-instance v1, LF8/h0$b;

    invoke-direct {v1, p1, p2}, LF8/h0$b;-><init>(LO7/f0;LF8/w;)V

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "invoke(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/E;

    return-object p1
.end method
