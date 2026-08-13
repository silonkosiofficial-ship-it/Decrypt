.class public Lp8/m;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lp8/n;


# static fields
.field public static final D:Lp8/n;


# instance fields
.field private final C:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp8/m;

    invoke-direct {v0}, Lp8/m;-><init>()V

    invoke-virtual {v0}, Lp8/m;->l()Lp8/n;

    move-result-object v0

    sput-object v0, Lp8/m;->D:Lp8/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lp8/m;->C:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lp8/n;)V
    .locals 2

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lp8/m;->C:Ljava/util/List;

    invoke-virtual {p0, p1}, Lp8/m;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private static e(Ljava/lang/Object;)Lp8/d;
    .locals 1

    .prologue
    instance-of v0, p0, Lp8/d;

    if-eqz v0, :cond_0

    check-cast p0, Lp8/d;

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lp8/d;->o(Ljava/lang/String;)Lp8/d;

    move-result-object p0

    return-object p0

    :cond_1
    check-cast p0, [B

    invoke-static {p0}, Lp8/d;->g([B)Lp8/d;

    move-result-object p0

    return-object p0
.end method

.method private static f(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_0
    instance-of v0, p0, Lp8/d;

    if-eqz v0, :cond_1

    check-cast p0, Lp8/d;

    invoke-virtual {p0}, Lp8/d;->S()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    check-cast p0, [B

    invoke-static {p0}, Lp8/j;->b([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic add(ILjava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lp8/m;->d(ILjava/lang/String;)V

    return-void
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 1

    .prologue
    instance-of v0, p2, Lp8/n;

    if-eqz v0, :cond_0

    check-cast p2, Lp8/n;

    invoke-interface {p2}, Lp8/n;->h()Ljava/util/List;

    move-result-object p2

    :cond_0
    iget-object v0, p0, Lp8/m;->C:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1

    iget p2, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Ljava/util/AbstractList;->modCount:I

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1

    invoke-virtual {p0}, Lp8/m;->size()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lp8/m;->addAll(ILjava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lp8/m;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lp8/m;->C:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public g(I)Ljava/lang/String;
    .locals 2

    .prologue
    iget-object v0, p0, Lp8/m;->C:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    instance-of v1, v0, Lp8/d;

    if-eqz v1, :cond_2

    check-cast v0, Lp8/d;

    invoke-virtual {v0}, Lp8/d;->S()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lp8/d;->E()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lp8/m;->C:Ljava/util/List;

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v1

    :cond_2
    check-cast v0, [B

    invoke-static {v0}, Lp8/j;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lp8/j;->a([B)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lp8/m;->C:Ljava/util/List;

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lp8/m;->g(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public h()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lp8/m;->C:Ljava/util/List;

    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public l()Lp8/n;
    .locals 1

    new-instance v0, Lp8/w;

    invoke-direct {v0, p0}, Lp8/w;-><init>(Lp8/n;)V

    return-object v0
.end method

.method public n(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp8/m;->C:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    invoke-static {p1}, Lp8/m;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public o(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp8/m;->C:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lp8/m;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public p(Lp8/d;)V
    .locals 1

    iget-object v0, p0, Lp8/m;->C:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public bridge synthetic remove(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lp8/m;->n(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lp8/m;->o(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lp8/m;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public z(I)Lp8/d;
    .locals 2

    .prologue
    iget-object v0, p0, Lp8/m;->C:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lp8/m;->e(Ljava/lang/Object;)Lp8/d;

    move-result-object v1

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lp8/m;->C:Ljava/util/List;

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method
