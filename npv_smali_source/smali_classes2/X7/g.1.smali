.class public final LX7/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LX7/g;

.field private static final b:Ljava/util/Map;

.field private static final c:Ljava/util/Map;

.field private static final d:Ljava/util/Set;

.field private static final e:Ljava/util/Set;

.field private static final f:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .prologue
    new-instance v0, LX7/g;

    invoke-direct {v0}, LX7/g;-><init>()V

    sput-object v0, LX7/g;->a:LX7/g;

    sget-object v0, LL7/j$a;->s:Ln8/d;

    const-string v1, "name"

    invoke-static {v0, v1}, LX7/h;->b(Ln8/d;Ljava/lang/String;)Ln8/c;

    move-result-object v1

    sget-object v2, LL7/j;->k:Ln8/f;

    invoke-static {v1, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    const-string v2, "ordinal"

    invoke-static {v0, v2}, LX7/h;->b(Ln8/d;Ljava/lang/String;)Ln8/c;

    move-result-object v0

    invoke-static {v2}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v2

    invoke-static {v0, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    sget-object v2, LL7/j$a;->V:Ln8/c;

    const-string v3, "size"

    invoke-static {v2, v3}, LX7/h;->a(Ln8/c;Ljava/lang/String;)Ln8/c;

    move-result-object v2

    invoke-static {v3}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v4

    invoke-static {v2, v4}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    sget-object v4, LL7/j$a;->Z:Ln8/c;

    invoke-static {v4, v3}, LX7/h;->a(Ln8/c;Ljava/lang/String;)Ln8/c;

    move-result-object v5

    invoke-static {v3}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v3

    invoke-static {v5, v3}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v3

    sget-object v5, LL7/j$a;->g:Ln8/d;

    const-string v6, "length"

    invoke-static {v5, v6}, LX7/h;->b(Ln8/d;Ljava/lang/String;)Ln8/c;

    move-result-object v5

    invoke-static {v6}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v6

    invoke-static {v5, v6}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v5

    const-string v6, "keys"

    invoke-static {v4, v6}, LX7/h;->a(Ln8/c;Ljava/lang/String;)Ln8/c;

    move-result-object v6

    const-string v7, "keySet"

    invoke-static {v7}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v7

    invoke-static {v6, v7}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v6

    const-string v7, "values"

    invoke-static {v4, v7}, LX7/h;->a(Ln8/c;Ljava/lang/String;)Ln8/c;

    move-result-object v8

    invoke-static {v7}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v7

    invoke-static {v8, v7}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v7

    const-string v8, "entries"

    invoke-static {v4, v8}, LX7/h;->a(Ln8/c;Ljava/lang/String;)Ln8/c;

    move-result-object v4

    const-string v8, "entrySet"

    invoke-static {v8}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v8

    invoke-static {v4, v8}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v4

    const/16 v8, 0x8

    new-array v8, v8, [Li7/u;

    const/4 v9, 0x0

    aput-object v1, v8, v9

    const/4 v1, 0x1

    aput-object v0, v8, v1

    const/4 v0, 0x2

    aput-object v2, v8, v0

    const/4 v0, 0x3

    aput-object v3, v8, v0

    const/4 v0, 0x4

    aput-object v5, v8, v0

    const/4 v0, 0x5

    aput-object v6, v8, v0

    const/4 v0, 0x6

    aput-object v7, v8, v0

    const/4 v0, 0x7

    aput-object v4, v8, v0

    invoke-static {v8}, Lj7/S;->k([Li7/u;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LX7/g;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    new-instance v4, Li7/u;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln8/c;

    invoke-virtual {v5}, Ln8/c;->g()Ln8/f;

    move-result-object v5

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Li7/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li7/u;

    invoke-virtual {v3}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln8/f;

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    check-cast v5, Ljava/util/List;

    invoke-virtual {v3}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln8/f;

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-static {v3}, Lj7/S;->d(I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lj7/v;->b0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    sput-object v1, LX7/g;->c:Ljava/util/Map;

    sget-object v0, LX7/g;->b:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    sget-object v4, LN7/c;->a:LN7/c;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln8/c;

    invoke-virtual {v5}, Ln8/c;->e()Ln8/c;

    move-result-object v5

    invoke-virtual {v5}, Ln8/c;->j()Ln8/d;

    move-result-object v5

    const-string v6, "toUnsafe(...)"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, LN7/c;->n(Ln8/d;)Ln8/b;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ln8/b;->b()Ln8/c;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln8/f;

    invoke-virtual {v4, v3}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    sput-object v1, LX7/g;->d:Ljava/util/Set;

    sget-object v0, LX7/g;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    sput-object v0, LX7/g;->e:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln8/c;

    invoke-virtual {v2}, Ln8/c;->g()Ln8/f;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    invoke-static {v1}, Lj7/v;->Y0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LX7/g;->f:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    sget-object v0, LX7/g;->b:Ljava/util/Map;

    return-object v0
.end method

.method public final b(Ln8/f;)Ljava/util/List;
    .locals 1

    .prologue
    const-string v0, "name1"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LX7/g;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final c()Ljava/util/Set;
    .locals 1

    sget-object v0, LX7/g;->e:Ljava/util/Set;

    return-object v0
.end method

.method public final d()Ljava/util/Set;
    .locals 1

    sget-object v0, LX7/g;->f:Ljava/util/Set;

    return-object v0
.end method
