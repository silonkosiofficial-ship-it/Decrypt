.class public abstract Lr/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lz7/a;


# instance fields
.field private C:I

.field private D:I

.field private E:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lr/j;->C:I

    return-void
.end method


# virtual methods
.method protected abstract b(I)Ljava/lang/Object;
.end method

.method protected abstract c(I)V
.end method

.method public hasNext()Z
    .locals 2

    .prologue
    iget v0, p0, Lr/j;->D:I

    iget v1, p0, Lr/j;->C:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-virtual {p0}, Lr/j;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lr/j;->D:I

    invoke-virtual {p0, v0}, Lr/j;->b(I)Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lr/j;->D:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lr/j;->D:I

    iput-boolean v2, p0, Lr/j;->E:Z

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lr/j;->E:Z

    if-nez v0, :cond_0

    const-string v0, "Call next() before removing an element."

    invoke-static {v0}, Ls/d;->b(Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Lr/j;->D:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lr/j;->D:I

    invoke-virtual {p0, v0}, Lr/j;->c(I)V

    iget v0, p0, Lr/j;->C:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lr/j;->C:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lr/j;->E:Z

    return-void
.end method
