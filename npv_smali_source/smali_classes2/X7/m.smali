.class public final LX7/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LX7/m;

.field private static final b:Ljava/util/Map;

.field private static final c:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    new-instance v0, LX7/m;

    invoke-direct {v0}, LX7/m;-><init>()V

    sput-object v0, LX7/m;->a:LX7/m;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v1, LX7/m;->b:Ljava/util/Map;

    sget-object v2, Ln8/i;->a:Ln8/i;

    invoke-virtual {v2}, Ln8/i;->l()Ln8/b;

    move-result-object v3

    const-string v4, "java.util.ArrayList"

    const-string v5, "java.util.LinkedList"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, LX7/m;->a([Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v0, v3, v4}, LX7/m;->c(Ln8/b;Ljava/util/List;)V

    invoke-virtual {v2}, Ln8/i;->n()Ln8/b;

    move-result-object v3

    const-string v4, "java.util.TreeSet"

    const-string v5, "java.util.LinkedHashSet"

    const-string v6, "java.util.HashSet"

    filled-new-array {v6, v4, v5}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, LX7/m;->a([Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v0, v3, v4}, LX7/m;->c(Ln8/b;Ljava/util/List;)V

    invoke-virtual {v2}, Ln8/i;->m()Ln8/b;

    move-result-object v2

    const-string v3, "java.util.concurrent.ConcurrentHashMap"

    const-string v4, "java.util.concurrent.ConcurrentSkipListMap"

    const-string v5, "java.util.HashMap"

    const-string v6, "java.util.TreeMap"

    const-string v7, "java.util.LinkedHashMap"

    filled-new-array {v5, v6, v7, v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, LX7/m;->a([Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v2, v3}, LX7/m;->c(Ln8/b;Ljava/util/List;)V

    new-instance v2, Ln8/c;

    const-string v3, "java.util.function.Function"

    invoke-direct {v2, v3}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v2

    const-string v3, "topLevel(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "java.util.function.UnaryOperator"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, LX7/m;->a([Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v0, v2, v4}, LX7/m;->c(Ln8/b;Ljava/util/List;)V

    new-instance v2, Ln8/c;

    const-string v4, "java.util.function.BiFunction"

    invoke-direct {v2, v4}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v2

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "java.util.function.BinaryOperator"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, LX7/m;->a([Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v2, v3}, LX7/m;->c(Ln8/b;Ljava/util/List;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln8/b;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln8/b;

    invoke-virtual {v3}, Ln8/b;->b()Ln8/c;

    move-result-object v3

    invoke-virtual {v2}, Ln8/b;->b()Ln8/c;

    move-result-object v2

    invoke-static {v3, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lj7/S;->q(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LX7/m;->c:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final varargs a([Ljava/lang/String;)Ljava/util/List;
    .locals 5

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    new-instance v4, Ln8/c;

    invoke-direct {v4, v3}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final c(Ln8/b;Ljava/util/List;)V
    .locals 3

    .prologue
    check-cast p2, Ljava/lang/Iterable;

    sget-object v0, LX7/m;->b:Ljava/util/Map;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ln8/b;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Ln8/c;)Ln8/c;
    .locals 1

    const-string v0, "classFqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LX7/m;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln8/c;

    return-object p1
.end method
