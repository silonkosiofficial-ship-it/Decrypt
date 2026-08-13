.class public Lp8/w;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lp8/n;


# instance fields
.field private final C:Lp8/n;


# direct methods
.method public constructor <init>(Lp8/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lp8/w;->C:Lp8/n;

    return-void
.end method

.method static synthetic d(Lp8/w;)Lp8/n;
    .locals 0

    iget-object p0, p0, Lp8/w;->C:Lp8/n;

    return-object p0
.end method


# virtual methods
.method public e(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp8/w;->C:Lp8/n;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lp8/w;->e(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public h()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lp8/w;->C:Lp8/n;

    invoke-interface {v0}, Lp8/n;->h()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lp8/w$b;

    invoke-direct {v0, p0}, Lp8/w$b;-><init>(Lp8/w;)V

    return-object v0
.end method

.method public l()Lp8/n;
    .locals 0

    return-object p0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Lp8/w$a;

    invoke-direct {v0, p0, p1}, Lp8/w$a;-><init>(Lp8/w;I)V

    return-object v0
.end method

.method public p(Lp8/d;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lp8/w;->C:Lp8/n;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public z(I)Lp8/d;
    .locals 1

    iget-object v0, p0, Lp8/w;->C:Lp8/n;

    invoke-interface {v0, p1}, Lp8/n;->z(I)Lp8/d;

    move-result-object p1

    return-object p1
.end method
