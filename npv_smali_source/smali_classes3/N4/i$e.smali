.class abstract LN4/i$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "e"
.end annotation


# instance fields
.field C:I

.field D:I

.field E:I

.field final synthetic F:LN4/i;


# direct methods
.method private constructor <init>(LN4/i;)V
    .locals 1

    iput-object p1, p0, LN4/i$e;->F:LN4/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LN4/i;->a(LN4/i;)I

    move-result v0

    iput v0, p0, LN4/i$e;->C:I

    invoke-virtual {p1}, LN4/i;->C()I

    move-result p1

    iput p1, p0, LN4/i$e;->D:I

    const/4 p1, -0x1

    iput p1, p0, LN4/i$e;->E:I

    return-void
.end method

.method synthetic constructor <init>(LN4/i;LN4/i$a;)V
    .locals 0

    invoke-direct {p0, p1}, LN4/i$e;-><init>(LN4/i;)V

    return-void
.end method

.method private b()V
    .locals 2

    .prologue
    iget-object v0, p0, LN4/i$e;->F:LN4/i;

    invoke-static {v0}, LN4/i;->a(LN4/i;)I

    move-result v0

    iget v1, p0, LN4/i$e;->C:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method


# virtual methods
.method abstract c(I)Ljava/lang/Object;
.end method

.method d()V
    .locals 1

    iget v0, p0, LN4/i$e;->C:I

    add-int/lit8 v0, v0, 0x20

    iput v0, p0, LN4/i$e;->C:I

    return-void
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    iget v0, p0, LN4/i$e;->D:I

    if-ltz v0, :cond_0

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
    invoke-direct {p0}, LN4/i$e;->b()V

    invoke-virtual {p0}, LN4/i$e;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LN4/i$e;->D:I

    iput v0, p0, LN4/i$e;->E:I

    invoke-virtual {p0, v0}, LN4/i$e;->c(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LN4/i$e;->F:LN4/i;

    iget v2, p0, LN4/i$e;->D:I

    invoke-virtual {v1, v2}, LN4/i;->D(I)I

    move-result v1

    iput v1, p0, LN4/i$e;->D:I

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 3

    .prologue
    invoke-direct {p0}, LN4/i$e;->b()V

    iget v0, p0, LN4/i$e;->E:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LN4/g;->c(Z)V

    invoke-virtual {p0}, LN4/i$e;->d()V

    iget-object v0, p0, LN4/i$e;->F:LN4/i;

    iget v1, p0, LN4/i$e;->E:I

    invoke-static {v0, v1}, LN4/i;->b(LN4/i;I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, LN4/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LN4/i$e;->F:LN4/i;

    iget v1, p0, LN4/i$e;->D:I

    iget v2, p0, LN4/i$e;->E:I

    invoke-virtual {v0, v1, v2}, LN4/i;->q(II)I

    move-result v0

    iput v0, p0, LN4/i$e;->D:I

    const/4 v0, -0x1

    iput v0, p0, LN4/i$e;->E:I

    return-void
.end method
