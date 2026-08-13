.class public abstract La0/a;
.super Lj7/j;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj7/j;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, La0/a;->e(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method

.method public final e(Ljava/util/Map$Entry;)Z
    .locals 1

    .prologue
    instance-of v0, p1, Ljava/lang/Object;

    if-eqz v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    instance-of v0, v0, Ljava/util/Map$Entry;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p0, p1}, La0/a;->f(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method

.method public abstract f(Ljava/util/Map$Entry;)Z
.end method

.method public final g(Ljava/util/Map$Entry;)Z
    .locals 1

    .prologue
    instance-of v0, p1, Ljava/lang/Object;

    if-eqz v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    instance-of v0, v0, Ljava/util/Map$Entry;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p0, p1}, La0/a;->o(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method

.method public abstract o(Ljava/util/Map$Entry;)Z
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, La0/a;->g(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method
