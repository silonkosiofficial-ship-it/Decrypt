.class public final Lh2/q;
.super Lj7/d;
.source "SourceFile"


# instance fields
.field private final D:I

.field private final E:I

.field private final F:Ljava/util/List;


# direct methods
.method public constructor <init>(IILjava/util/List;)V
    .locals 1

    const-string v0, "items"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lj7/d;-><init>()V

    iput p1, p0, Lh2/q;->D:I

    iput p2, p0, Lh2/q;->E:I

    iput-object p3, p0, Lh2/q;->F:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public e()I
    .locals 2

    iget v0, p0, Lh2/q;->D:I

    iget-object v1, p0, Lh2/q;->F:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lh2/q;->E:I

    add-int/2addr v0, v1

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 v0, 0x0

    if-ltz p1, :cond_0

    iget v1, p0, Lh2/q;->D:I

    if-ge p1, v1, :cond_0

    goto :goto_0

    :cond_0
    iget v1, p0, Lh2/q;->D:I

    iget-object v2, p0, Lh2/q;->F:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v2, v1

    if-ge p1, v2, :cond_1

    if-gt v1, p1, :cond_1

    iget-object v0, p0, Lh2/q;->F:Ljava/util/List;

    iget v1, p0, Lh2/q;->D:I

    sub-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget v1, p0, Lh2/q;->D:I

    iget-object v2, p0, Lh2/q;->F:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0}, Lj7/b;->size()I

    move-result v2

    if-ge p1, v2, :cond_2

    if-gt v1, p1, :cond_2

    :goto_0
    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal attempt to access index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " in ItemSnapshotList of size "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lj7/b;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
