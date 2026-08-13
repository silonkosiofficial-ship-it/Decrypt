.class public abstract Lk7/d$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk7/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private final C:Lk7/d;

.field private D:I

.field private E:I

.field private F:I


# direct methods
.method public constructor <init>(Lk7/d;)V
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk7/d$d;->C:Lk7/d;

    const/4 v0, -0x1

    iput v0, p0, Lk7/d$d;->E:I

    invoke-static {p1}, Lk7/d;->e(Lk7/d;)I

    move-result p1

    iput p1, p0, Lk7/d$d;->F:I

    invoke-virtual {p0}, Lk7/d$d;->f()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    .prologue
    iget-object v0, p0, Lk7/d$d;->C:Lk7/d;

    invoke-static {v0}, Lk7/d;->e(Lk7/d;)I

    move-result v0

    iget v1, p0, Lk7/d$d;->F:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lk7/d$d;->D:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lk7/d$d;->E:I

    return v0
.end method

.method public final e()Lk7/d;
    .locals 1

    iget-object v0, p0, Lk7/d$d;->C:Lk7/d;

    return-object v0
.end method

.method public final f()V
    .locals 2

    .prologue
    :goto_0
    iget v0, p0, Lk7/d$d;->D:I

    iget-object v1, p0, Lk7/d$d;->C:Lk7/d;

    invoke-static {v1}, Lk7/d;->d(Lk7/d;)I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lk7/d$d;->C:Lk7/d;

    invoke-static {v0}, Lk7/d;->f(Lk7/d;)[I

    move-result-object v0

    iget v1, p0, Lk7/d$d;->D:I

    aget v0, v0, v1

    if-gez v0, :cond_0

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lk7/d$d;->D:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final h(I)V
    .locals 0

    iput p1, p0, Lk7/d$d;->D:I

    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .prologue
    iget v0, p0, Lk7/d$d;->D:I

    iget-object v1, p0, Lk7/d$d;->C:Lk7/d;

    invoke-static {v1}, Lk7/d;->d(Lk7/d;)I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final k(I)V
    .locals 0

    iput p1, p0, Lk7/d$d;->E:I

    return-void
.end method

.method public final remove()V
    .locals 3

    .prologue
    invoke-virtual {p0}, Lk7/d$d;->b()V

    iget v0, p0, Lk7/d$d;->E:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lk7/d$d;->C:Lk7/d;

    invoke-virtual {v0}, Lk7/d;->o()V

    iget-object v0, p0, Lk7/d$d;->C:Lk7/d;

    iget v2, p0, Lk7/d$d;->E:I

    invoke-static {v0, v2}, Lk7/d;->h(Lk7/d;I)V

    iput v1, p0, Lk7/d$d;->E:I

    iget-object v0, p0, Lk7/d$d;->C:Lk7/d;

    invoke-static {v0}, Lk7/d;->e(Lk7/d;)I

    move-result v0

    iput v0, p0, Lk7/d$d;->F:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call next() before removing element from the iterator."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
