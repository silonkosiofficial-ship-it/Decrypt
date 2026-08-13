.class public final Lk7/f;
.super Lj7/j;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;
.implements Lz7/f;


# instance fields
.field private final C:Lk7/d;


# direct methods
.method public constructor <init>(Lk7/d;)V
    .locals 1

    const-string v0, "backing"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lj7/j;-><init>()V

    iput-object p1, p0, Lk7/f;->C:Lk7/d;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lk7/f;->C:Lk7/d;

    invoke-virtual {v0}, Lk7/d;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lk7/f;->C:Lk7/d;

    invoke-virtual {v0, p1}, Lk7/d;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lk7/f;->C:Lk7/d;

    invoke-virtual {v0}, Lk7/d;->size()I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lk7/f;->C:Lk7/d;

    invoke-virtual {v0}, Lk7/d;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lk7/f;->C:Lk7/d;

    invoke-virtual {v0}, Lk7/d;->J()Lk7/d$e;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lk7/f;->C:Lk7/d;

    invoke-virtual {v0, p1}, Lk7/d;->S(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lk7/f;->C:Lk7/d;

    invoke-virtual {v0}, Lk7/d;->o()V

    invoke-super {p0, p1}, Ljava/util/AbstractSet;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lk7/f;->C:Lk7/d;

    invoke-virtual {v0}, Lk7/d;->o()V

    invoke-super {p0, p1}, Ljava/util/AbstractSet;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method
