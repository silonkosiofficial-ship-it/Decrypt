.class public final Lf0/B$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;
.implements Lz7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf0/B;->listIterator(I)Ljava/util/ListIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:Ly7/M;

.field final synthetic D:Lf0/B;


# direct methods
.method constructor <init>(Ly7/M;Lf0/B;)V
    .locals 0

    iput-object p1, p0, Lf0/B$a;->C:Ly7/M;

    iput-object p2, p0, Lf0/B$a;->D:Lf0/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf0/B$a;->b(Ljava/lang/Object;)Ljava/lang/Void;

    return-void
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Lf0/s;->c()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public c()Ljava/lang/Void;
    .locals 1

    invoke-static {}, Lf0/s;->c()Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Void;
    .locals 0

    invoke-static {}, Lf0/s;->c()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public hasNext()Z
    .locals 3

    .prologue
    iget-object v0, p0, Lf0/B$a;->C:Ly7/M;

    iget v0, v0, Ly7/M;->C:I

    iget-object v1, p0, Lf0/B$a;->D:Lf0/B;

    invoke-virtual {v1}, Lf0/B;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public hasPrevious()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lf0/B$a;->C:Ly7/M;

    iget v0, v0, Ly7/M;->C:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lf0/B$a;->C:Ly7/M;

    iget v0, v0, Ly7/M;->C:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lf0/B$a;->D:Lf0/B;

    invoke-virtual {v1}, Lf0/B;->size()I

    move-result v1

    invoke-static {v0, v1}, Lf0/s;->d(II)V

    iget-object v1, p0, Lf0/B$a;->C:Ly7/M;

    iput v0, v1, Ly7/M;->C:I

    iget-object v1, p0, Lf0/B$a;->D:Lf0/B;

    invoke-virtual {v1, v0}, Lf0/B;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public nextIndex()I
    .locals 1

    iget-object v0, p0, Lf0/B$a;->C:Ly7/M;

    iget v0, v0, Ly7/M;->C:I

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lf0/B$a;->C:Ly7/M;

    iget v0, v0, Ly7/M;->C:I

    iget-object v1, p0, Lf0/B$a;->D:Lf0/B;

    invoke-virtual {v1}, Lf0/B;->size()I

    move-result v1

    invoke-static {v0, v1}, Lf0/s;->d(II)V

    iget-object v1, p0, Lf0/B$a;->C:Ly7/M;

    add-int/lit8 v2, v0, -0x1

    iput v2, v1, Ly7/M;->C:I

    iget-object v1, p0, Lf0/B$a;->D:Lf0/B;

    invoke-virtual {v1, v0}, Lf0/B;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public previousIndex()I
    .locals 1

    iget-object v0, p0, Lf0/B$a;->C:Ly7/M;

    iget v0, v0, Ly7/M;->C:I

    return v0
.end method

.method public bridge synthetic remove()V
    .locals 0

    invoke-virtual {p0}, Lf0/B$a;->c()Ljava/lang/Void;

    return-void
.end method

.method public bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf0/B$a;->d(Ljava/lang/Object;)Ljava/lang/Void;

    return-void
.end method
