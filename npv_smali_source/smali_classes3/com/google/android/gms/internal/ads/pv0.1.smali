.class final Lcom/google/android/gms/internal/ads/pv0;
.super Lcom/google/android/gms/internal/ads/mv0;
.source "SourceFile"


# instance fields
.field private final h:Ljava/io/OutputStream;


# direct methods
.method constructor <init>(Ljava/io/OutputStream;I)V
    .locals 0

    .prologue
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/mv0;-><init>(I)V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pv0;->h:Ljava/io/OutputStream;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "out"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final H()V
    .locals 4

    iget v0, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pv0;->h:Ljava/io/OutputStream;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/mv0;->d:[B

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Ljava/io/OutputStream;->write([BII)V

    iput v3, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    return-void
.end method

.method private final I(I)V
    .locals 2

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/mv0;->e:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    sub-int/2addr v0, v1

    if-ge v0, p1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pv0;->H()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final A(J)V
    .locals 1

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/pv0;->I(I)V

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/mv0;->G(J)V

    return-void
.end method

.method public final J([BII)V
    .locals 3

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/mv0;->e:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    sub-int/2addr v0, v1

    if-lt v0, p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mv0;->d:[B

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    :goto_0
    iget p1, p0, Lcom/google/android/gms/internal/ads/mv0;->g:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/google/android/gms/internal/ads/mv0;->g:I

    return-void

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/mv0;->d:[B

    invoke-static {p1, p2, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/mv0;->e:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/mv0;->g:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/google/android/gms/internal/ads/mv0;->g:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pv0;->H()V

    iget v1, p0, Lcom/google/android/gms/internal/ads/mv0;->e:I

    sub-int/2addr p3, v0

    if-gt p3, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mv0;->d:[B

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput p3, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pv0;->h:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0
.end method

.method public final K(Ljava/lang/String;)V
    .locals 5

    .prologue
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/rv0;->e(I)I

    move-result v1

    add-int v2, v1, v0

    iget v3, p0, Lcom/google/android/gms/internal/ads/mv0;->e:I

    if-le v2, v3, :cond_0

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0}, Lcom/google/android/gms/internal/ads/Xw0;->d(Ljava/lang/String;[BII)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/pv0;->y(I)V

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/internal/ads/pv0;->J([BII)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_3

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    sub-int/2addr v3, v0

    if-le v2, v3, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pv0;->H()V

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/rv0;->e(I)I

    move-result v0

    iget v2, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Ww0; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v0, v1, :cond_2

    add-int v1, v2, v0

    :try_start_1
    iput v1, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/mv0;->d:[B

    iget v4, p0, Lcom/google/android/gms/internal/ads/mv0;->e:I

    sub-int/2addr v4, v1

    invoke-static {p1, v3, v1, v4}, Lcom/google/android/gms/internal/ads/Xw0;->d(Ljava/lang/String;[BII)I

    move-result v1

    iput v2, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    sub-int v3, v1, v2

    sub-int/2addr v3, v0

    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/ads/mv0;->F(I)V

    iput v1, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Xw0;->e(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/ads/mv0;->F(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mv0;->d:[B

    iget v1, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    invoke-static {p1, v0, v1, v3}, Lcom/google/android/gms/internal/ads/Xw0;->d(Ljava/lang/String;[BII)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    :goto_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/mv0;->g:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/google/android/gms/internal/ads/mv0;->g:I
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/Ww0; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :goto_1
    :try_start_2
    new-instance v1, Lcom/google/android/gms/internal/ads/ov0;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/ov0;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :goto_2
    iget v1, p0, Lcom/google/android/gms/internal/ads/mv0;->g:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    sub-int/2addr v3, v2

    sub-int/2addr v1, v3

    iput v1, p0, Lcom/google/android/gms/internal/ads/mv0;->g:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    throw v0
    :try_end_2
    .catch Lcom/google/android/gms/internal/ads/Ww0; {:try_start_2 .. :try_end_2} :catch_0

    :goto_3
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/rv0;->h(Ljava/lang/String;Lcom/google/android/gms/internal/ads/Ww0;)V

    return-void
.end method

.method public final a([BII)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/pv0;->J([BII)V

    return-void
.end method

.method public final j()V
    .locals 1

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    if-lez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pv0;->H()V

    :cond_0
    return-void
.end method

.method public final k(B)V
    .locals 2

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/mv0;->f:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/mv0;->e:I

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pv0;->H()V

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/mv0;->C(B)V

    return-void
.end method

.method public final l(IZ)V
    .locals 1

    const/16 v0, 0xb

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/pv0;->I(I)V

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/mv0;->F(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/mv0;->C(B)V

    return-void
.end method

.method public final m(ILcom/google/android/gms/internal/ads/fv0;)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/pv0;->y(I)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/fv0;->n()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/pv0;->y(I)V

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/ads/fv0;->N(Lcom/google/android/gms/internal/ads/Wu0;)V

    return-void
.end method

.method public final o(II)V
    .locals 1

    const/16 v0, 0xe

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/pv0;->I(I)V

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x5

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/mv0;->F(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/mv0;->D(I)V

    return-void
.end method

.method public final p(I)V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/pv0;->I(I)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/mv0;->D(I)V

    return-void
.end method

.method public final q(IJ)V
    .locals 1

    const/16 v0, 0x12

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/pv0;->I(I)V

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/mv0;->F(I)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/ads/mv0;->E(J)V

    return-void
.end method

.method public final r(J)V
    .locals 1

    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/pv0;->I(I)V

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/mv0;->E(J)V

    return-void
.end method

.method public final s(II)V
    .locals 1

    .prologue
    const/16 v0, 0x14

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/pv0;->I(I)V

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/mv0;->F(I)V

    if-ltz p2, :cond_0

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/mv0;->F(I)V

    return-void

    :cond_0
    int-to-long p1, p2

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/mv0;->G(J)V

    return-void
.end method

.method public final t(I)V
    .locals 2

    .prologue
    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/pv0;->y(I)V

    return-void

    :cond_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/pv0;->A(J)V

    return-void
.end method

.method final u(ILcom/google/android/gms/internal/ads/mw0;Lcom/google/android/gms/internal/ads/Ew0;)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/pv0;->y(I)V

    move-object p1, p2

    check-cast p1, Lcom/google/android/gms/internal/ads/Ou0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/Ou0;->f(Lcom/google/android/gms/internal/ads/Ew0;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/pv0;->y(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/rv0;->a:Lcom/google/android/gms/internal/ads/sv0;

    invoke-interface {p3, p2, p1}, Lcom/google/android/gms/internal/ads/Ew0;->g(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/Yw0;)V

    return-void
.end method

.method public final v(ILjava/lang/String;)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/pv0;->y(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/pv0;->K(Ljava/lang/String;)V

    return-void
.end method

.method public final w(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, p2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/pv0;->y(I)V

    return-void
.end method

.method public final x(II)V
    .locals 1

    const/16 v0, 0x14

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/pv0;->I(I)V

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/mv0;->F(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/mv0;->F(I)V

    return-void
.end method

.method public final y(I)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/pv0;->I(I)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/mv0;->F(I)V

    return-void
.end method

.method public final z(IJ)V
    .locals 1

    const/16 v0, 0x14

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/pv0;->I(I)V

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/mv0;->F(I)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/ads/mv0;->G(J)V

    return-void
.end method
