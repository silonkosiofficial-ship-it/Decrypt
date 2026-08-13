.class final Lj7/Y;
.super Lj7/h;
.source "SourceFile"


# instance fields
.field private final C:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lj7/h;-><init>()V

    iput-object p1, p0, Lj7/Y;->C:Ljava/util/List;

    return-void
.end method

.method public static final synthetic f(Lj7/Y;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lj7/Y;->C:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public add(ILjava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lj7/Y;->C:Ljava/util/List;

    invoke-static {p0, p1}, Lj7/D;->Q(Ljava/util/List;I)I

    move-result p1

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lj7/Y;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lj7/Y;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public e(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj7/Y;->C:Ljava/util/List;

    invoke-static {p0, p1}, Lj7/D;->O(Ljava/util/List;I)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj7/Y;->C:Ljava/util/List;

    invoke-static {p0, p1}, Lj7/D;->O(Ljava/util/List;I)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lj7/Y;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lj7/Y;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Lj7/Y$a;

    invoke-direct {v0, p0, p1}, Lj7/Y$a;-><init>(Lj7/Y;I)V

    return-object v0
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj7/Y;->C:Ljava/util/List;

    invoke-static {p0, p1}, Lj7/D;->O(Ljava/util/List;I)I

    move-result p1

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
