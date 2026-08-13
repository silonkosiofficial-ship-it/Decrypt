.class public abstract La0/f;
.super Lj7/i;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;
.implements Lz7/e;
.implements Lj$/util/Map;


# instance fields
.field private C:La0/d;

.field private D:Lc0/e;

.field private E:La0/t;

.field private F:Ljava/lang/Object;

.field private G:I

.field private H:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(La0/d;)V
    .locals 0

    invoke-direct {p0}, Lj7/i;-><init>()V

    iput-object p1, p0, La0/f;->C:La0/d;

    new-instance p1, Lc0/e;

    invoke-direct {p1}, Lc0/e;-><init>()V

    iput-object p1, p0, La0/f;->D:Lc0/e;

    iget-object p1, p0, La0/f;->C:La0/d;

    invoke-virtual {p1}, La0/d;->r()La0/t;

    move-result-object p1

    iput-object p1, p0, La0/f;->E:La0/t;

    iget-object p1, p0, La0/f;->C:La0/d;

    invoke-virtual {p1}, Lj7/f;->size()I

    move-result p1

    iput p1, p0, La0/f;->H:I

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1

    new-instance v0, La0/h;

    invoke-direct {v0, p0}, La0/h;-><init>(La0/f;)V

    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 1

    new-instance v0, La0/j;

    invoke-direct {v0, p0}, La0/j;-><init>(La0/f;)V

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, La0/f;->H:I

    return v0
.end method

.method public clear()V
    .locals 2

    sget-object v0, La0/t;->e:La0/t$a;

    invoke-virtual {v0}, La0/t$a;->a()La0/t;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, La0/f;->E:La0/t;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, La0/f;->o(I)V

    return-void
.end method

.method public synthetic compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/Map$-CC;->$default$compute(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/Map$-CC;->$default$computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/Map$-CC;->$default$computeIfPresent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    iget-object v0, p0, La0/f;->E:La0/t;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1}, La0/t;->k(ILjava/lang/Object;I)Z

    move-result p1

    return p1
.end method

.method public d()Ljava/util/Collection;
    .locals 1

    new-instance v0, La0/l;

    invoke-direct {v0, p0}, La0/l;-><init>(La0/f;)V

    return-object v0
.end method

.method public abstract e()La0/d;
.end method

.method public final f()I
    .locals 1

    iget v0, p0, La0/f;->G:I

    return v0
.end method

.method public synthetic forEach(Ljava/util/function/BiConsumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/Map$-CC;->$default$forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    return-void
.end method

.method public final g()La0/t;
    .locals 1

    iget-object v0, p0, La0/f;->E:La0/t;

    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    iget-object v0, p0, La0/f;->E:La0/t;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1}, La0/t;->o(ILjava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h()Lc0/e;
    .locals 1

    iget-object v0, p0, La0/f;->D:Lc0/e;

    return-object v0
.end method

.method public final k(I)V
    .locals 0

    iput p1, p0, La0/f;->G:I

    return-void
.end method

.method public final l(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, La0/f;->F:Ljava/lang/Object;

    return-void
.end method

.method protected final m(Lc0/e;)V
    .locals 0

    iput-object p1, p0, La0/f;->D:Lc0/e;

    return-void
.end method

.method public synthetic merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lj$/util/Map$-CC;->$default$merge(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public o(I)V
    .locals 0

    iput p1, p0, La0/f;->H:I

    iget p1, p0, La0/f;->G:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, La0/f;->G:I

    return-void
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    const/4 v0, 0x0

    iput-object v0, p0, La0/f;->F:Ljava/lang/Object;

    iget-object v1, p0, La0/f;->E:La0/t;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    move v2, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/4 v5, 0x0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p0

    invoke-virtual/range {v1 .. v6}, La0/t;->D(ILjava/lang/Object;Ljava/lang/Object;ILa0/f;)La0/t;

    move-result-object p1

    iput-object p1, p0, La0/f;->E:La0/t;

    iget-object p1, p0, La0/f;->F:Ljava/lang/Object;

    return-object p1
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 6

    .prologue
    instance-of v0, p1, La0/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, La0/d;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_3

    instance-of v0, p1, La0/f;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, La0/f;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, La0/f;->e()La0/d;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v1

    :cond_3
    :goto_2
    if-eqz v0, :cond_4

    new-instance p1, Lc0/b;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p1, v3, v2, v1}, Lc0/b;-><init>(IILy7/k;)V

    invoke-virtual {p0}, Lj7/i;->size()I

    move-result v1

    iget-object v2, p0, La0/f;->E:La0/t;

    invoke-virtual {v0}, La0/d;->r()La0/t;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"

    invoke-static {v4, v5}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v4, v3, p1, p0}, La0/t;->E(La0/t;ILc0/b;La0/f;)La0/t;

    move-result-object v2

    iput-object v2, p0, La0/f;->E:La0/t;

    invoke-virtual {v0}, Lj7/f;->size()I

    move-result v0

    add-int/2addr v0, v1

    invoke-virtual {p1}, Lc0/b;->a()I

    move-result p1

    sub-int/2addr v0, p1

    if-eq v1, v0, :cond_5

    invoke-virtual {p0, v0}, La0/f;->o(I)V

    goto :goto_3

    :cond_4
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    :cond_5
    :goto_3
    return-void
.end method

.method public synthetic putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/Map$-CC;->$default$putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 v0, 0x0

    iput-object v0, p0, La0/f;->F:Ljava/lang/Object;

    iget-object v0, p0, La0/f;->E:La0/t;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1, p0}, La0/t;->G(ILjava/lang/Object;ILa0/f;)La0/t;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, La0/t;->e:La0/t$a;

    invoke-virtual {p1}, La0/t$a;->a()La0/t;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    iput-object p1, p0, La0/f;->E:La0/t;

    iget-object p1, p0, La0/f;->F:Ljava/lang/Object;

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 8

    .prologue
    invoke-virtual {p0}, Lj7/i;->size()I

    move-result v0

    iget-object v1, p0, La0/f;->E:La0/t;

    const/4 v7, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v7

    :goto_0
    const/4 v5, 0x0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p0

    invoke-virtual/range {v1 .. v6}, La0/t;->H(ILjava/lang/Object;Ljava/lang/Object;ILa0/f;)La0/t;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, La0/t;->e:La0/t$a;

    invoke-virtual {p1}, La0/t$a;->a()La0/t;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"

    invoke-static {p1, p2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    iput-object p1, p0, La0/f;->E:La0/t;

    invoke-virtual {p0}, Lj7/i;->size()I

    move-result p1

    if-eq v0, p1, :cond_2

    const/4 v7, 0x1

    :cond_2
    return v7
.end method

.method public synthetic replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/Map$-CC;->$default$replace(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lj$/util/Map$-CC;->$default$replace(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public synthetic replaceAll(Ljava/util/function/BiFunction;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/Map$-CC;->$default$replaceAll(Ljava/util/Map;Ljava/util/function/BiFunction;)V

    return-void
.end method
