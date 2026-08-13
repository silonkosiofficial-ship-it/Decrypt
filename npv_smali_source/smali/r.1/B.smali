.class public final Lr/B;
.super Lr/l;
.source "SourceFile"


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lr/l;-><init>(ILy7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(IILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x10

    :cond_0
    invoke-direct {p0, p1}, Lr/B;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final f(II)V
    .locals 3

    .prologue
    if-ltz p1, :cond_1

    iget v0, p0, Lr/l;->b:I

    if-gt p1, v0, :cond_1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lr/B;->i(I)V

    iget-object v0, p0, Lr/l;->a:[I

    iget v1, p0, Lr/l;->b:I

    if-eq p1, v1, :cond_0

    add-int/lit8 v2, p1, 0x1

    invoke-static {v0, v0, v2, p1, v1}, Lj7/n;->j([I[IIII)[I

    :cond_0
    aput p2, v0, p1

    iget p1, p0, Lr/l;->b:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lr/l;->b:I

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in 0.."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lr/l;->b:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final g(I)Z
    .locals 3

    iget v0, p0, Lr/l;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lr/B;->i(I)V

    iget-object v0, p0, Lr/l;->a:[I

    iget v2, p0, Lr/l;->b:I

    aput p1, v0, v2

    add-int/2addr v2, v1

    iput v2, p0, Lr/l;->b:I

    return v1
.end method

.method public final h(I[I)Z
    .locals 8

    .prologue
    const-string v0, "elements"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p1, :cond_2

    iget v0, p0, Lr/l;->b:I

    if-gt p1, v0, :cond_2

    array-length v1, p2

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    array-length v1, p2

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lr/B;->i(I)V

    iget-object v2, p0, Lr/l;->a:[I

    iget v0, p0, Lr/l;->b:I

    if-eq p1, v0, :cond_1

    array-length v1, p2

    add-int/2addr v1, p1

    invoke-static {v2, v2, v1, p1, v0}, Lj7/n;->j([I[IIII)[I

    :cond_1
    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p2

    move v3, p1

    invoke-static/range {v1 .. v7}, Lj7/n;->o([I[IIIIILjava/lang/Object;)[I

    iget p1, p0, Lr/l;->b:I

    array-length p2, p2

    add-int/2addr p1, p2

    iput p1, p0, Lr/l;->b:I

    const/4 p1, 0x1

    return p1

    :cond_2
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in 0.."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lr/l;->b:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final i(I)V
    .locals 2

    .prologue
    iget-object v0, p0, Lr/l;->a:[I

    array-length v1, v0

    if-ge v1, p1, :cond_0

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x3

    div-int/lit8 v1, v1, 0x2

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    const-string v0, "copyOf(this, newSize)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lr/l;->a:[I

    :cond_0
    return-void
.end method

.method public final j([I)V
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lr/l;->b:I

    invoke-virtual {p0, v0, p1}, Lr/B;->h(I[I)Z

    return-void
.end method

.method public final k(I)Z
    .locals 0

    .prologue
    invoke-virtual {p0, p1}, Lr/l;->c(I)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lr/B;->l(I)I

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final l(I)I
    .locals 4

    .prologue
    if-ltz p1, :cond_1

    iget v0, p0, Lr/l;->b:I

    if-ge p1, v0, :cond_1

    iget-object v1, p0, Lr/l;->a:[I

    aget v2, v1, p1

    add-int/lit8 v3, v0, -0x1

    if-eq p1, v3, :cond_0

    add-int/lit8 v3, p1, 0x1

    invoke-static {v1, v1, p1, v3, v0}, Lj7/n;->j([I[IIII)[I

    :cond_0
    iget p1, p0, Lr/l;->b:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lr/l;->b:I

    return v2

    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in 0.."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lr/l;->b:I

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m(II)I
    .locals 2

    .prologue
    if-ltz p1, :cond_0

    iget v0, p0, Lr/l;->b:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lr/l;->a:[I

    aget v1, v0, p1

    aput p2, v0, p1

    return v1

    :cond_0
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "set index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be between 0 .. "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lr/l;->b:I

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final n()V
    .locals 3

    .prologue
    iget v0, p0, Lr/l;->b:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lr/l;->a:[I

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lj7/n;->H([III)V

    return-void
.end method
