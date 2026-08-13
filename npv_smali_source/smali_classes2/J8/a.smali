.class public final LJ8/a;
.super Ljava/util/ArrayList;
.source "SourceFile"

# interfaces
.implements LJ8/k;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge C(LJ8/l;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, LJ8/l;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LJ8/l;

    invoke-virtual {p0, p1}, LJ8/a;->d(LJ8/l;)Z

    move-result p1

    return p1
.end method

.method public bridge d(LJ8/l;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge e()I
    .locals 1

    invoke-super {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    .prologue
    instance-of v0, p1, LJ8/l;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, LJ8/l;

    invoke-virtual {p0, p1}, LJ8/a;->n(LJ8/l;)I

    move-result p1

    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .prologue
    instance-of v0, p1, LJ8/l;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, LJ8/l;

    invoke-virtual {p0, p1}, LJ8/a;->w(LJ8/l;)I

    move-result p1

    return p1
.end method

.method public bridge n(LJ8/l;)I
    .locals 0

    invoke-super {p0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, LJ8/l;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LJ8/l;

    invoke-virtual {p0, p1}, LJ8/a;->C(LJ8/l;)Z

    move-result p1

    return p1
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, LJ8/a;->e()I

    move-result v0

    return v0
.end method

.method public bridge w(LJ8/l;)I
    .locals 0

    invoke-super {p0, p1}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
