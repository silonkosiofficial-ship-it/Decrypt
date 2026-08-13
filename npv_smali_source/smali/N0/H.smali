.class public final LN0/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/text/CharacterIterator;


# instance fields
.field private final C:Ljava/lang/CharSequence;

.field private final D:I

.field private final E:I

.field private F:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN0/H;->C:Ljava/lang/CharSequence;

    iput p2, p0, LN0/H;->D:I

    iput p3, p0, LN0/H;->E:I

    iput p2, p0, LN0/H;->F:I

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1

    .prologue
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public current()C
    .locals 2

    .prologue
    iget v0, p0, LN0/H;->F:I

    iget v1, p0, LN0/H;->E:I

    if-ne v0, v1, :cond_0

    const v0, 0xffff

    goto :goto_0

    :cond_0
    iget-object v1, p0, LN0/H;->C:Ljava/lang/CharSequence;

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    :goto_0
    return v0
.end method

.method public first()C
    .locals 1

    iget v0, p0, LN0/H;->D:I

    iput v0, p0, LN0/H;->F:I

    invoke-virtual {p0}, LN0/H;->current()C

    move-result v0

    return v0
.end method

.method public getBeginIndex()I
    .locals 1

    iget v0, p0, LN0/H;->D:I

    return v0
.end method

.method public getEndIndex()I
    .locals 1

    iget v0, p0, LN0/H;->E:I

    return v0
.end method

.method public getIndex()I
    .locals 1

    iget v0, p0, LN0/H;->F:I

    return v0
.end method

.method public last()C
    .locals 2

    .prologue
    iget v0, p0, LN0/H;->D:I

    iget v1, p0, LN0/H;->E:I

    if-ne v0, v1, :cond_0

    iput v1, p0, LN0/H;->F:I

    const v0, 0xffff

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, -0x1

    iput v1, p0, LN0/H;->F:I

    iget-object v0, p0, LN0/H;->C:Ljava/lang/CharSequence;

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    :goto_0
    return v0
.end method

.method public next()C
    .locals 2

    .prologue
    iget v0, p0, LN0/H;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LN0/H;->F:I

    iget v1, p0, LN0/H;->E:I

    if-lt v0, v1, :cond_0

    iput v1, p0, LN0/H;->F:I

    const v0, 0xffff

    goto :goto_0

    :cond_0
    iget-object v1, p0, LN0/H;->C:Ljava/lang/CharSequence;

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    :goto_0
    return v0
.end method

.method public previous()C
    .locals 2

    .prologue
    iget v0, p0, LN0/H;->F:I

    iget v1, p0, LN0/H;->D:I

    if-gt v0, v1, :cond_0

    const v0, 0xffff

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LN0/H;->F:I

    iget-object v1, p0, LN0/H;->C:Ljava/lang/CharSequence;

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    :goto_0
    return v0
.end method

.method public setIndex(I)C
    .locals 2

    .prologue
    iget v0, p0, LN0/H;->D:I

    iget v1, p0, LN0/H;->E:I

    if-gt p1, v1, :cond_0

    if-gt v0, p1, :cond_0

    iput p1, p0, LN0/H;->F:I

    invoke-virtual {p0}, LN0/H;->current()C

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid position"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
