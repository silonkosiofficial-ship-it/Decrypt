.class public final Lb8/l;
.super Lb8/m;
.source "SourceFile"


# instance fields
.field private final n:Le8/g;

.field private final o:LZ7/c;


# direct methods
.method public constructor <init>(La8/g;Le8/g;LZ7/c;)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jClass"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownerDescriptor"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lb8/m;-><init>(La8/g;)V

    iput-object p2, p0, Lb8/l;->n:Le8/g;

    iput-object p3, p0, Lb8/l;->o:LZ7/c;

    return-void
.end method

.method static synthetic M(LO7/e;)Ljava/lang/Iterable;
    .locals 0

    invoke-static {p0}, Lb8/l;->P(LO7/e;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method private final O(LO7/e;Ljava/util/Set;Lx7/l;)Ljava/util/Set;
    .locals 3

    invoke-static {p1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    sget-object v1, Lb8/k;->a:Lb8/k;

    new-instance v2, Lb8/l$e;

    invoke-direct {v2, p1, p2, p3}, Lb8/l$e;-><init>(LO7/e;Ljava/util/Set;Lx7/l;)V

    invoke-static {v0, v1, v2}, LP8/b;->b(Ljava/util/Collection;LP8/b$c;LP8/b$d;)Ljava/lang/Object;

    return-object p2
.end method

.method private static final P(LO7/e;)Ljava/lang/Iterable;
    .locals 1

    invoke-interface {p0}, LO7/h;->p()LF8/e0;

    move-result-object p0

    invoke-interface {p0}, LF8/e0;->u()Ljava/util/Collection;

    move-result-object p0

    const-string v0, "getSupertypes(...)"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lj7/v;->Y(Ljava/lang/Iterable;)LR8/h;

    move-result-object p0

    sget-object v0, Lb8/l$d;->D:Lb8/l$d;

    invoke-static {p0, v0}, LR8/k;->H(LR8/h;Lx7/l;)LR8/h;

    move-result-object p0

    invoke-static {p0}, LR8/k;->t(LR8/h;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method private final R(LO7/U;)LO7/U;
    .locals 2

    .prologue
    invoke-interface {p1}, LO7/b;->j()LO7/b$a;

    move-result-object v0

    invoke-virtual {v0}, LO7/b$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-interface {p1}, LO7/U;->f()Ljava/util/Collection;

    move-result-object p1

    const-string v0, "getOverriddenDescriptors(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

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

    check-cast v1, LO7/U;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, v1}, Lb8/l;->R(LO7/U;)LO7/U;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lj7/v;->b0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lj7/v;->G0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/U;

    return-object p1
.end method

.method private final S(Ln8/f;LO7/e;)Ljava/util/Set;
    .locals 1

    .prologue
    invoke-static {p2}, LZ7/h;->b(LO7/e;)Lb8/l;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, LW7/d;->Q:LW7/d;

    invoke-virtual {p2, p1, v0}, Lb8/j;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->Y0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public bridge synthetic C()LO7/m;
    .locals 1

    invoke-virtual {p0}, Lb8/l;->Q()LZ7/c;

    move-result-object v0

    return-object v0
.end method

.method protected N()Lb8/a;
    .locals 3

    new-instance v0, Lb8/a;

    iget-object v1, p0, Lb8/l;->n:Le8/g;

    sget-object v2, Lb8/l$a;->D:Lb8/l$a;

    invoke-direct {v0, v1, v2}, Lb8/a;-><init>(Le8/g;Lx7/l;)V

    return-object v0
.end method

.method protected Q()LZ7/c;
    .locals 1

    iget-object v0, p0, Lb8/l;->o:LZ7/c;

    return-object v0
.end method

.method public g(Ln8/f;LW7/b;)LO7/h;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "location"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected l(Ly8/d;Lx7/l;)Ljava/util/Set;
    .locals 0

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method protected n(Ly8/d;Lx7/l;)Ljava/util/Set;
    .locals 2

    .prologue
    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lb8/j;->y()LE8/i;

    move-result-object p1

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb8/b;

    invoke-interface {p1}, Lb8/b;->a()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->X0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p0}, Lb8/l;->Q()LZ7/c;

    move-result-object p2

    invoke-static {p2}, LZ7/h;->b(LO7/e;)Lb8/l;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lb8/j;->a()Ljava/util/Set;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p2

    :cond_1
    check-cast p2, Ljava/util/Collection;

    invoke-interface {p1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object p2, p0, Lb8/l;->n:Le8/g;

    invoke-interface {p2}, Le8/g;->F()Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 p2, 0x2

    new-array p2, p2, [Ln8/f;

    sget-object v0, LL7/j;->f:Ln8/f;

    const/4 v1, 0x0

    aput-object v0, p2, v1

    sget-object v0, LL7/j;->d:Ln8/f;

    const/4 v1, 0x1

    aput-object v0, p2, v1

    invoke-static {p2}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_2
    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object p2

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->w()Lw8/f;

    move-result-object v0

    invoke-virtual {p0}, Lb8/l;->Q()LZ7/c;

    move-result-object v1

    invoke-interface {v0, p2, v1}, Lw8/f;->c(La8/g;LO7/e;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object p1
.end method

.method protected o(Ljava/util/Collection;Ln8/f;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v1

    invoke-virtual {v1}, La8/g;->a()La8/b;

    move-result-object v1

    invoke-virtual {v1}, La8/b;->w()Lw8/f;

    move-result-object v1

    invoke-virtual {p0}, Lb8/l;->Q()LZ7/c;

    move-result-object v2

    invoke-interface {v1, v0, v2, p2, p1}, Lw8/f;->b(La8/g;LO7/e;Ln8/f;Ljava/util/Collection;)V

    return-void
.end method

.method public bridge synthetic p()Lb8/b;
    .locals 1

    invoke-virtual {p0}, Lb8/l;->N()Lb8/a;

    move-result-object v0

    return-object v0
.end method

.method protected r(Ljava/util/Collection;Ln8/f;)V
    .locals 7

    .prologue
    const-string v0, "result"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lb8/l;->Q()LZ7/c;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Lb8/l;->S(Ln8/f;LO7/e;)Ljava/util/Set;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {p0}, Lb8/l;->Q()LZ7/c;

    move-result-object v4

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->c()LB8/r;

    move-result-object v5

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->k()LG8/l;

    move-result-object v0

    invoke-interface {v0}, LG8/l;->a()Lr8/l;

    move-result-object v6

    move-object v1, p2

    move-object v3, p1

    invoke-static/range {v1 .. v6}, LY7/a;->e(Ln8/f;Ljava/util/Collection;Ljava/util/Collection;LO7/e;LB8/r;Lr8/l;)Ljava/util/Collection;

    move-result-object v0

    const-string v1, "resolveOverridesForStaticMembers(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lb8/l;->n:Le8/g;

    invoke-interface {v0}, Le8/g;->F()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LL7/j;->f:Ln8/f;

    invoke-static {p2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb8/l;->Q()LZ7/c;

    move-result-object p2

    invoke-static {p2}, Lr8/e;->g(LO7/e;)LO7/Z;

    move-result-object p2

    const-string v0, "createEnumValueOfMethod(...)"

    :goto_0
    invoke-static {p2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    sget-object v0, LL7/j;->d:Ln8/f;

    invoke-static {p2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lb8/l;->Q()LZ7/c;

    move-result-object p2

    invoke-static {p2}, Lr8/e;->h(LO7/e;)LO7/Z;

    move-result-object p2

    const-string v0, "createEnumValuesMethod(...)"

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method protected s(Ln8/f;Ljava/util/Collection;)V
    .locals 10

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lb8/l;->Q()LZ7/c;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v2, Lb8/l$b;

    invoke-direct {v2, p1}, Lb8/l$b;-><init>(Ln8/f;)V

    invoke-direct {p0, v0, v1, v2}, Lb8/l;->O(LO7/e;Ljava/util/Set;Lx7/l;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    const-string v2, "resolveOverridesForStaticMembers(...)"

    if-eqz v1, :cond_1

    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-virtual {p0}, Lb8/l;->Q()LZ7/c;

    move-result-object v6

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->c()LB8/r;

    move-result-object v7

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->k()LG8/l;

    move-result-object v0

    invoke-interface {v0}, LG8/l;->a()Lr8/l;

    move-result-object v8

    move-object v3, p1

    move-object v5, p2

    invoke-static/range {v3 .. v8}, LY7/a;->e(Ln8/f;Ljava/util/Collection;Ljava/util/Collection;LO7/e;LB8/r;Lr8/l;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-interface {p2, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_2

    :cond_1
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LO7/U;

    invoke-direct {p0, v4}, Lb8/l;->R(LO7/U;)LO7/U;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_2

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    check-cast v5, Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/util/Collection;

    invoke-virtual {p0}, Lb8/l;->Q()LZ7/c;

    move-result-object v7

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v3

    invoke-virtual {v3}, La8/g;->a()La8/b;

    move-result-object v3

    invoke-virtual {v3}, La8/b;->c()LB8/r;

    move-result-object v8

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v3

    invoke-virtual {v3}, La8/g;->a()La8/b;

    move-result-object v3

    invoke-virtual {v3}, La8/b;->k()LG8/l;

    move-result-object v3

    invoke-interface {v3}, LG8/l;->a()Lr8/l;

    move-result-object v9

    move-object v4, p1

    move-object v6, p2

    invoke-static/range {v4 .. v9}, LY7/a;->e(Ln8/f;Ljava/util/Collection;Ljava/util/Collection;LO7/e;LB8/r;Lr8/l;)Ljava/util/Collection;

    move-result-object v3

    invoke-static {v3, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v0, v3}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_1

    :goto_2
    iget-object v0, p0, Lb8/l;->n:Le8/g;

    invoke-interface {v0}, Le8/g;->F()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, LL7/j;->e:Ln8/f;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lb8/l;->Q()LZ7/c;

    move-result-object p1

    invoke-static {p1}, Lr8/e;->f(LO7/e;)LO7/U;

    move-result-object p1

    invoke-static {p2, p1}, LP8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    :cond_4
    return-void
.end method

.method protected t(Ly8/d;Lx7/l;)Ljava/util/Set;
    .locals 1

    .prologue
    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lb8/j;->y()LE8/i;

    move-result-object p1

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb8/b;

    invoke-interface {p1}, Lb8/b;->f()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->X0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p0}, Lb8/l;->Q()LZ7/c;

    move-result-object p2

    sget-object v0, Lb8/l$c;->D:Lb8/l$c;

    invoke-direct {p0, p2, p1, v0}, Lb8/l;->O(LO7/e;Ljava/util/Set;Lx7/l;)Ljava/util/Set;

    iget-object p2, p0, Lb8/l;->n:Le8/g;

    invoke-interface {p2}, Le8/g;->F()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, LL7/j;->e:Ln8/f;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p1
.end method
