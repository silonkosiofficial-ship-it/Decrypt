.class final Lk7/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;
.implements Lz7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final C:Lk7/b;

.field private D:I

.field private E:I

.field private F:I


# direct methods
.method public constructor <init>(Lk7/b;I)V
    .locals 1

    const-string v0, "list"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk7/b$c;->C:Lk7/b;

    iput p2, p0, Lk7/b$c;->D:I

    const/4 p2, -0x1

    iput p2, p0, Lk7/b$c;->E:I

    invoke-static {p1}, Lk7/b;->C(Lk7/b;)I

    move-result p1

    iput p1, p0, Lk7/b$c;->F:I

    return-void
.end method

.method private final b()V
    .locals 2

    .prologue
    iget-object v0, p0, Lk7/b$c;->C:Lk7/b;

    invoke-static {v0}, Lk7/b;->C(Lk7/b;)I

    move-result v0

    iget v1, p0, Lk7/b$c;->F:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .locals 3

    invoke-direct {p0}, Lk7/b$c;->b()V

    iget-object v0, p0, Lk7/b$c;->C:Lk7/b;

    iget v1, p0, Lk7/b$c;->D:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lk7/b$c;->D:I

    invoke-virtual {v0, v1, p1}, Lk7/b;->add(ILjava/lang/Object;)V

    const/4 p1, -0x1

    iput p1, p0, Lk7/b$c;->E:I

    iget-object p1, p0, Lk7/b$c;->C:Lk7/b;

    invoke-static {p1}, Lk7/b;->C(Lk7/b;)I

    move-result p1

    iput p1, p0, Lk7/b$c;->F:I

    return-void
.end method

.method public hasNext()Z
    .locals 2

    .prologue
    iget v0, p0, Lk7/b$c;->D:I

    iget-object v1, p0, Lk7/b$c;->C:Lk7/b;

    invoke-static {v1}, Lk7/b;->s(Lk7/b;)I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasPrevious()Z
    .locals 1

    .prologue
    iget v0, p0, Lk7/b$c;->D:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-direct {p0}, Lk7/b$c;->b()V

    iget v0, p0, Lk7/b$c;->D:I

    iget-object v1, p0, Lk7/b$c;->C:Lk7/b;

    invoke-static {v1}, Lk7/b;->s(Lk7/b;)I

    move-result v1

    if-ge v0, v1, :cond_0

    iget v0, p0, Lk7/b$c;->D:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lk7/b$c;->D:I

    iput v0, p0, Lk7/b$c;->E:I

    iget-object v0, p0, Lk7/b$c;->C:Lk7/b;

    invoke-static {v0}, Lk7/b;->o(Lk7/b;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lk7/b$c;->E:I

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public nextIndex()I
    .locals 1

    iget v0, p0, Lk7/b$c;->D:I

    return v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-direct {p0}, Lk7/b$c;->b()V

    iget v0, p0, Lk7/b$c;->D:I

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lk7/b$c;->D:I

    iput v0, p0, Lk7/b$c;->E:I

    iget-object v0, p0, Lk7/b$c;->C:Lk7/b;

    invoke-static {v0}, Lk7/b;->o(Lk7/b;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lk7/b$c;->E:I

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public previousIndex()I
    .locals 1

    iget v0, p0, Lk7/b$c;->D:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public remove()V
    .locals 3

    .prologue
    invoke-direct {p0}, Lk7/b$c;->b()V

    iget v0, p0, Lk7/b$c;->E:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v2, p0, Lk7/b$c;->C:Lk7/b;

    invoke-virtual {v2, v0}, Lj7/h;->remove(I)Ljava/lang/Object;

    iget v0, p0, Lk7/b$c;->E:I

    iput v0, p0, Lk7/b$c;->D:I

    iput v1, p0, Lk7/b$c;->E:I

    iget-object v0, p0, Lk7/b$c;->C:Lk7/b;

    invoke-static {v0}, Lk7/b;->C(Lk7/b;)I

    move-result v0

    iput v0, p0, Lk7/b$c;->F:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call next() or previous() before removing element from the iterator."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public set(Ljava/lang/Object;)V
    .locals 2

    .prologue
    invoke-direct {p0}, Lk7/b$c;->b()V

    iget v0, p0, Lk7/b$c;->E:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lk7/b$c;->C:Lk7/b;

    invoke-virtual {v1, v0, p1}, Lk7/b;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Call next() or previous() before replacing element from the iterator."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
