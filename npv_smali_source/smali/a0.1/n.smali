.class public final La0/n;
.super Lj7/k;
.source "SourceFile"

# interfaces
.implements LY/e;


# instance fields
.field private final D:La0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(La0/d;)V
    .locals 0

    invoke-direct {p0}, Lj7/k;-><init>()V

    iput-object p1, p0, La0/n;->D:La0/d;

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

    invoke-virtual {p0, p1}, La0/n;->g(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, La0/n;->D:La0/d;

    invoke-virtual {v0}, Lj7/f;->size()I

    move-result v0

    return v0
.end method

.method public g(Ljava/util/Map$Entry;)Z
    .locals 3

    .prologue
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, La0/n;->D:La0/d;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, La0/d;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, La0/n;->D:La0/d;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, La0/d;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    :goto_0
    return v1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, La0/o;

    iget-object v1, p0, La0/n;->D:La0/d;

    invoke-virtual {v1}, La0/d;->r()La0/t;

    move-result-object v1

    invoke-direct {v0, v1}, La0/o;-><init>(La0/t;)V

    return-object v0
.end method
