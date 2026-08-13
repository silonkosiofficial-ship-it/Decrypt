.class final LV/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lz7/a;


# instance fields
.field private final C:LV/h1;

.field private final D:I

.field private E:I

.field private final F:I


# direct methods
.method public constructor <init>(LV/h1;II)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/U;->C:LV/h1;

    iput p3, p0, LV/U;->D:I

    iput p2, p0, LV/U;->E:I

    invoke-virtual {p1}, LV/h1;->R()I

    move-result p2

    iput p2, p0, LV/U;->F:I

    invoke-virtual {p1}, LV/h1;->S()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1
.end method

.method private final c()V
    .locals 2

    .prologue
    iget-object v0, p0, LV/U;->C:LV/h1;

    invoke-virtual {v0}, LV/h1;->R()I

    move-result v0

    iget v1, p0, LV/U;->F:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method


# virtual methods
.method public b()Lg0/b;
    .locals 4

    invoke-direct {p0}, LV/U;->c()V

    iget v0, p0, LV/U;->E:I

    iget-object v1, p0, LV/U;->C:LV/h1;

    invoke-virtual {v1}, LV/h1;->M()[I

    move-result-object v1

    invoke-static {v1, v0}, LV/j1;->h([II)I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, LV/U;->E:I

    new-instance v1, LV/i1;

    iget-object v2, p0, LV/U;->C:LV/h1;

    iget v3, p0, LV/U;->F:I

    invoke-direct {v1, v2, v0, v3}, LV/i1;-><init>(LV/h1;II)V

    return-object v1
.end method

.method public hasNext()Z
    .locals 2

    .prologue
    iget v0, p0, LV/U;->E:I

    iget v1, p0, LV/U;->D:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LV/U;->b()Lg0/b;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
