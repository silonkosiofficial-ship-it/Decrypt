.class abstract Lp8/u;
.super Ljava/util/AbstractMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp8/u$b;,
        Lp8/u$d;,
        Lp8/u$e;,
        Lp8/u$c;
    }
.end annotation


# instance fields
.field private final C:I

.field private D:Ljava/util/List;

.field private E:Ljava/util/Map;

.field private F:Z

.field private volatile G:Lp8/u$e;


# direct methods
.method private constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    iput p1, p0, Lp8/u;->C:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lp8/u;->D:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lp8/u;->E:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(ILp8/u$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lp8/u;-><init>(I)V

    return-void
.end method

.method static synthetic a(Lp8/u;)V
    .locals 0

    invoke-direct {p0}, Lp8/u;->f()V

    return-void
.end method

.method static synthetic b(Lp8/u;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lp8/u;->D:Ljava/util/List;

    return-object p0
.end method

.method static synthetic c(Lp8/u;I)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lp8/u;->r(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(Lp8/u;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lp8/u;->E:Ljava/util/Map;

    return-object p0
.end method

.method private e(Ljava/lang/Comparable;)I
    .locals 4

    .prologue
    iget-object v0, p0, Lp8/u;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    if-ltz v1, :cond_1

    iget-object v2, p0, Lp8/u;->D:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp8/u$c;

    invoke-virtual {v2}, Lp8/u$c;->i()Ljava/lang/Comparable;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v2

    if-lez v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    :goto_0
    neg-int p1, v0

    return p1

    :cond_0
    if-nez v2, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-gt v0, v1, :cond_4

    add-int v2, v0, v1

    div-int/lit8 v2, v2, 0x2

    iget-object v3, p0, Lp8/u;->D:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/u$c;

    invoke-virtual {v3}, Lp8/u$c;->i()Ljava/lang/Comparable;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v3

    if-gez v3, :cond_2

    add-int/lit8 v2, v2, -0x1

    move v1, v2

    goto :goto_1

    :cond_2
    if-lez v3, :cond_3

    add-int/lit8 v2, v2, 0x1

    move v0, v2

    goto :goto_1

    :cond_3
    return v2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private f()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lp8/u;->F:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method private g()V
    .locals 2

    .prologue
    invoke-direct {p0}, Lp8/u;->f()V

    iget-object v0, p0, Lp8/u;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp8/u;->D:Ljava/util/List;

    instance-of v0, v0, Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Lp8/u;->C:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lp8/u;->D:Ljava/util/List;

    :cond_0
    return-void
.end method

.method private l()Ljava/util/SortedMap;
    .locals 1

    .prologue
    invoke-direct {p0}, Lp8/u;->f()V

    iget-object v0, p0, Lp8/u;->E:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp8/u;->E:Ljava/util/Map;

    instance-of v0, v0, Ljava/util/TreeMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lp8/u;->E:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, Lp8/u;->E:Ljava/util/Map;

    check-cast v0, Ljava/util/SortedMap;

    return-object v0
.end method

.method static p(I)Lp8/u;
    .locals 1

    new-instance v0, Lp8/u$a;

    invoke-direct {v0, p0}, Lp8/u$a;-><init>(I)V

    return-object v0
.end method

.method private r(I)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-direct {p0}, Lp8/u;->f()V

    iget-object v0, p0, Lp8/u;->D:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp8/u$c;

    invoke-virtual {p1}, Lp8/u$c;->getValue()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lp8/u;->E:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lp8/u;->l()Ljava/util/SortedMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iget-object v1, p0, Lp8/u;->D:Ljava/util/List;

    new-instance v2, Lp8/u$c;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-direct {v2, p0, v3}, Lp8/u$c;-><init>(Lp8/u;Ljava/util/Map$Entry;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    :cond_0
    return-object p1
.end method


# virtual methods
.method public clear()V
    .locals 1

    .prologue
    invoke-direct {p0}, Lp8/u;->f()V

    iget-object v0, p0, Lp8/u;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lp8/u;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_0
    iget-object v0, p0, Lp8/u;->E:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lp8/u;->E:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    :cond_1
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    check-cast p1, Ljava/lang/Comparable;

    invoke-direct {p0, p1}, Lp8/u;->e(Ljava/lang/Comparable;)I

    move-result v0

    if-gez v0, :cond_1

    iget-object v0, p0, Lp8/u;->E:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public entrySet()Ljava/util/Set;
    .locals 2

    .prologue
    iget-object v0, p0, Lp8/u;->G:Lp8/u$e;

    if-nez v0, :cond_0

    new-instance v0, Lp8/u$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lp8/u$e;-><init>(Lp8/u;Lp8/u$a;)V

    iput-object v0, p0, Lp8/u;->G:Lp8/u$e;

    :cond_0
    iget-object v0, p0, Lp8/u;->G:Lp8/u$e;

    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    check-cast p1, Ljava/lang/Comparable;

    invoke-direct {p0, p1}, Lp8/u;->e(Ljava/lang/Comparable;)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object p1, p0, Lp8/u;->D:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp8/u$c;

    invoke-virtual {p1}, Lp8/u$c;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lp8/u;->E:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h(I)Ljava/util/Map$Entry;
    .locals 1

    iget-object v0, p0, Lp8/u;->D:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    return-object p1
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, Lp8/u;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public k()Ljava/lang/Iterable;
    .locals 1

    .prologue
    iget-object v0, p0, Lp8/u;->E:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lp8/u$b;->b()Ljava/lang/Iterable;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp8/u;->E:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lp8/u;->F:Z

    return v0
.end method

.method public o()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lp8/u;->F:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lp8/u;->E:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp8/u;->E:Ljava/util/Map;

    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lp8/u;->E:Ljava/util/Map;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp8/u;->F:Z

    :cond_1
    return-void
.end method

.method public q(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-direct {p0}, Lp8/u;->f()V

    invoke-direct {p0, p1}, Lp8/u;->e(Ljava/lang/Comparable;)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object p1, p0, Lp8/u;->D:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp8/u$c;

    invoke-virtual {p1, p2}, Lp8/u$c;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0}, Lp8/u;->g()V

    add-int/lit8 v0, v0, 0x1

    neg-int v0, v0

    iget v1, p0, Lp8/u;->C:I

    if-lt v0, v1, :cond_1

    invoke-direct {p0}, Lp8/u;->l()Ljava/util/SortedMap;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v1, p0, Lp8/u;->D:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lp8/u;->C:I

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lp8/u;->D:Ljava/util/List;

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp8/u$c;

    invoke-direct {p0}, Lp8/u;->l()Ljava/util/SortedMap;

    move-result-object v2

    invoke-virtual {v1}, Lp8/u$c;->i()Ljava/lang/Comparable;

    move-result-object v3

    invoke-virtual {v1}, Lp8/u$c;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, Lp8/u;->D:Ljava/util/List;

    new-instance v2, Lp8/u$c;

    invoke-direct {v2, p0, p1, p2}, Lp8/u$c;-><init>(Lp8/u;Ljava/lang/Comparable;Ljava/lang/Object;)V

    invoke-interface {v1, v0, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-direct {p0}, Lp8/u;->f()V

    check-cast p1, Ljava/lang/Comparable;

    invoke-direct {p0, p1}, Lp8/u;->e(Ljava/lang/Comparable;)I

    move-result v0

    if-ltz v0, :cond_0

    invoke-direct {p0, v0}, Lp8/u;->r(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lp8/u;->E:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    iget-object v0, p0, Lp8/u;->E:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 2

    iget-object v0, p0, Lp8/u;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lp8/u;->E:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
