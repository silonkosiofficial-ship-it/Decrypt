.class LN4/o$c;
.super LN4/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final transient E:LN4/o;


# direct methods
.method constructor <init>(LN4/o;)V
    .locals 0

    invoke-direct {p0}, LN4/o;-><init>()V

    iput-object p1, p0, LN4/o$c;->E:LN4/o;

    return-void
.end method

.method private U(I)I
    .locals 1

    invoke-virtual {p0}, LN4/o$c;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p1

    return v0
.end method

.method private V(I)I
    .locals 1

    invoke-virtual {p0}, LN4/o$c;->size()I

    move-result v0

    sub-int/2addr v0, p1

    return v0
.end method


# virtual methods
.method public Q()LN4/o;
    .locals 1

    iget-object v0, p0, LN4/o$c;->E:LN4/o;

    return-object v0
.end method

.method public S(II)LN4/o;
    .locals 1

    invoke-virtual {p0}, LN4/o$c;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, LM4/h;->m(III)V

    iget-object v0, p0, LN4/o$c;->E:LN4/o;

    invoke-direct {p0, p2}, LN4/o$c;->V(I)I

    move-result p2

    invoke-direct {p0, p1}, LN4/o$c;->V(I)I

    move-result p1

    invoke-virtual {v0, p2, p1}, LN4/o;->S(II)LN4/o;

    move-result-object p1

    invoke-virtual {p1}, LN4/o;->Q()LN4/o;

    move-result-object p1

    return-object p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LN4/o$c;->E:LN4/o;

    invoke-virtual {v0, p1}, LN4/o;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN4/o$c;->size()I

    move-result v0

    invoke-static {p1, v0}, LM4/h;->g(II)I

    iget-object v0, p0, LN4/o$c;->E:LN4/o;

    invoke-direct {p0, p1}, LN4/o$c;->U(I)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1

    .prologue
    iget-object v0, p0, LN4/o$c;->E:LN4/o;

    invoke-virtual {v0, p1}, LN4/o;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-direct {p0, p1}, LN4/o$c;->U(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-super {p0}, LN4/o;->C()LN4/S;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .prologue
    iget-object v0, p0, LN4/o$c;->E:LN4/o;

    invoke-virtual {v0, p1}, LN4/o;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-direct {p0, p1}, LN4/o$c;->U(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    invoke-super {p0}, LN4/o;->D()LN4/T;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    invoke-super {p0, p1}, LN4/o;->E(I)LN4/T;

    move-result-object p1

    return-object p1
.end method

.method n()Z
    .locals 1

    iget-object v0, p0, LN4/o$c;->E:LN4/o;

    invoke-virtual {v0}, LN4/n;->n()Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, LN4/o$c;->E:LN4/o;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, LN4/o$c;->S(II)LN4/o;

    move-result-object p1

    return-object p1
.end method
