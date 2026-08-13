.class public final LX7/d;
.super LX7/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(LX7/x;)V
    .locals 1

    const-string v0, "javaTypeEnhancementState"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LX7/a;-><init>(LX7/x;)V

    return-void
.end method

.method private final y(Lt8/g;)Ljava/util/List;
    .locals 2

    .prologue
    instance-of v0, p1, Lt8/b;

    if-eqz v0, :cond_0

    check-cast p1, Lt8/b;

    invoke-virtual {p1}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt8/g;

    invoke-direct {p0, v1}, LX7/d;->y(Lt8/g;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lt8/j;

    if-eqz v0, :cond_1

    check-cast p1, Lt8/j;

    invoke-virtual {p1}, Lt8/j;->c()Ln8/f;

    move-result-object p1

    invoke-virtual {p1}, Ln8/f;->m()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    :cond_2
    :goto_1
    return-object v0
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Z)Ljava/lang/Iterable;
    .locals 0

    check-cast p1, LP7/c;

    invoke-virtual {p0, p1, p2}, LX7/d;->u(LP7/c;Z)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ln8/c;
    .locals 0

    check-cast p1, LP7/c;

    invoke-virtual {p0, p1}, LX7/d;->v(LP7/c;)Ln8/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LP7/c;

    invoke-virtual {p0, p1}, LX7/d;->w(LP7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 0

    check-cast p1, LP7/c;

    invoke-virtual {p0, p1}, LX7/d;->x(LP7/c;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method

.method protected u(LP7/c;Z)Ljava/lang/Iterable;
    .locals 4

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LP7/c;->a()Ljava/util/Map;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln8/f;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt8/g;

    if-eqz p2, :cond_1

    sget-object v3, LX7/B;->c:Ln8/f;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    goto :goto_2

    :cond_1
    :goto_1
    invoke-direct {p0, v1}, LX7/d;->y(Lt8/g;)Ljava/util/List;

    move-result-object v1

    :goto_2
    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method protected v(LP7/c;)Ln8/c;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LP7/c;->e()Ln8/c;

    move-result-object p1

    return-object p1
.end method

.method protected w(LP7/c;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lv8/c;->i(LP7/c;)LO7/e;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object p1
.end method

.method protected x(LP7/c;)Ljava/lang/Iterable;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lv8/c;->i(LP7/c;)LO7/e;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, LP7/a;->k()LP7/g;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    :goto_0
    return-object p1
.end method
