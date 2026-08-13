.class public abstract LZ/b;
.super Lj7/d;
.source "SourceFile"

# interfaces
.implements LY/f;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj7/d;-><init>()V

    return-void
.end method


# virtual methods
.method public addAll(Ljava/util/Collection;)LY/f;
    .locals 1

    invoke-interface {p0}, LY/f;->builder()LY/f$a;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0}, LY/f$a;->i()LY/f;

    move-result-object p1

    return-object p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    invoke-virtual {p0, p1}, Lj7/d;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 2

    .prologue
    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LZ/b;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method

.method public g(II)LY/d;
    .locals 0

    invoke-static {p0, p1, p2}, LY/c;->a(LY/d;II)LY/d;

    move-result-object p1

    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LZ/b;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lj7/d;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)LY/f;
    .locals 1

    .prologue
    invoke-virtual {p0, p1}, Lj7/d;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    invoke-interface {p0, p1}, LY/f;->y(I)LY/f;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p0
.end method

.method public removeAll(Ljava/util/Collection;)LY/f;
    .locals 1

    new-instance v0, LZ/b$a;

    invoke-direct {v0, p1}, LZ/b$a;-><init>(Ljava/util/Collection;)V

    invoke-interface {p0, v0}, LY/f;->v(Lx7/l;)LY/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, LZ/b;->g(II)LY/d;

    move-result-object p1

    return-object p1
.end method
