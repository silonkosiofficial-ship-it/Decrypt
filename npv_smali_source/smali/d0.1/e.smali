.class public final Ld0/e;
.super La0/d;
.source "SourceFile"

# interfaces
.implements LV/H0;
.implements Lj$/util/Map;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld0/e$a;,
        Ld0/e$b;
    }
.end annotation


# static fields
.field public static final I:Ld0/e$b;

.field private static final J:Ld0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ld0/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld0/e$b;-><init>(Ly7/k;)V

    sput-object v0, Ld0/e;->I:Ld0/e$b;

    new-instance v0, Ld0/e;

    sget-object v1, La0/t;->e:La0/t$a;

    invoke-virtual {v1}, La0/t$a;->a()La0/t;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld0/e;-><init>(La0/t;I)V

    sput-object v0, Ld0/e;->J:Ld0/e;

    return-void
.end method

.method public constructor <init>(La0/t;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, La0/d;-><init>(La0/t;I)V

    return-void
.end method

.method public static final synthetic x()Ld0/e;
    .locals 1

    sget-object v0, Ld0/e;->J:Ld0/e;

    return-object v0
.end method


# virtual methods
.method public bridge A(LV/w;)Z
    .locals 0

    invoke-super {p0, p1}, La0/d;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge B(LV/M1;)Z
    .locals 0

    invoke-super {p0, p1}, Lj7/f;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge C(LV/w;)LV/M1;
    .locals 0

    invoke-super {p0, p1}, La0/d;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LV/M1;

    return-object p1
.end method

.method public bridge D(LV/w;LV/M1;)LV/M1;
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/Map$-CC;->$default$getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LV/M1;

    return-object p1
.end method

.method public synthetic a(LV/w;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LV/G0;->a(LV/H0;LV/w;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(LV/w;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LV/A;->b(LV/H0;LV/w;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic builder()LV/H0$a;
    .locals 1

    invoke-virtual {p0}, Ld0/e;->z()Ld0/e$a;

    move-result-object v0

    return-object v0
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

.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, LV/w;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LV/w;

    invoke-virtual {p0, p1}, Ld0/e;->A(LV/w;)Z

    move-result p1

    return p1
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, LV/M1;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LV/M1;

    invoke-virtual {p0, p1}, Ld0/e;->B(LV/M1;)Z

    move-result p1

    return p1
.end method

.method public synthetic forEach(Ljava/util/function/BiConsumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/Map$-CC;->$default$forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    return-void
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    instance-of v0, p1, LV/w;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, LV/w;

    invoke-virtual {p0, p1}, Ld0/e;->C(LV/w;)LV/M1;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    instance-of v0, p1, LV/w;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    check-cast p1, LV/w;

    check-cast p2, LV/M1;

    invoke-virtual {p0, p1, p2}, Ld0/e;->D(LV/w;LV/M1;)LV/M1;

    move-result-object p1

    return-object p1
.end method

.method public synthetic merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lj$/util/Map$-CC;->$default$merge(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public n(LV/w;LV/M1;)LV/H0;
    .locals 3

    .prologue
    invoke-virtual {p0}, La0/d;->r()La0/t;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, p2, v2}, La0/t;->P(ILjava/lang/Object;Ljava/lang/Object;I)La0/t$b;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    new-instance p2, Ld0/e;

    invoke-virtual {p1}, La0/t$b;->a()La0/t;

    move-result-object v0

    invoke-virtual {p0}, Lj7/f;->size()I

    move-result v1

    invoke-virtual {p1}, La0/t$b;->b()I

    move-result p1

    add-int/2addr v1, p1

    invoke-direct {p2, v0, v1}, Ld0/e;-><init>(La0/t;I)V

    return-object p2
.end method

.method public synthetic putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/Map$-CC;->$default$putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/Map$-CC;->$default$remove(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
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

.method public z()Ld0/e$a;
    .locals 1

    new-instance v0, Ld0/e$a;

    invoke-direct {v0, p0}, Ld0/e$a;-><init>(Ld0/e;)V

    return-object v0
.end method
