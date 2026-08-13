.class abstract Lcom/google/android/gms/internal/ads/y6;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/google/android/gms/internal/ads/u0;)Landroid/util/Pair;
    .locals 3

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/u0;->j()V

    new-instance v0, Lcom/google/android/gms/internal/ads/sR;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    const v2, 0x64617461

    invoke-static {v2, p0, v0}, Lcom/google/android/gms/internal/ads/y6;->d(ILcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/sR;)Lcom/google/android/gms/internal/ads/x6;

    move-result-object v0

    invoke-interface {p0, v1}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/x6;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p0, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lcom/google/android/gms/internal/ads/u0;)Lcom/google/android/gms/internal/ads/w6;
    .locals 13

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/ads/sR;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    const v2, 0x666d7420

    invoke-static {v2, p0, v0}, Lcom/google/android/gms/internal/ads/y6;->d(ILcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/sR;)Lcom/google/android/gms/internal/ads/x6;

    move-result-object v2

    iget-wide v3, v2, Lcom/google/android/gms/internal/ads/x6;->b:J

    const-wide/16 v5, 0x10

    cmp-long v3, v3, v5

    const/4 v4, 0x0

    if-ltz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v3

    invoke-interface {p0, v3, v4, v1}, Lcom/google/android/gms/internal/ads/u0;->N([BII)V

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->A()I

    move-result v6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->A()I

    move-result v7

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->z()I

    move-result v8

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->z()I

    move-result v9

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->A()I

    move-result v10

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->A()I

    move-result v11

    iget-wide v0, v2, Lcom/google/android/gms/internal/ads/x6;->b:J

    long-to-int v0, v0

    add-int/lit8 v0, v0, -0x10

    if-lez v0, :cond_1

    new-array v1, v0, [B

    invoke-interface {p0, v1, v4, v0}, Lcom/google/android/gms/internal/ads/u0;->N([BII)V

    move-object v12, v1

    goto :goto_1

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/EW;->f:[B

    move-object v12, v0

    :goto_1
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/u0;->d()J

    move-result-wide v0

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    invoke-interface {p0, v0}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    new-instance p0, Lcom/google/android/gms/internal/ads/w6;

    move-object v5, p0

    invoke-direct/range {v5 .. v12}, Lcom/google/android/gms/internal/ads/w6;-><init>(IIIIII[B)V

    return-object p0
.end method

.method public static c(Lcom/google/android/gms/internal/ads/u0;)Z
    .locals 4

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/ads/sR;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/x6;->a(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/sR;)Lcom/google/android/gms/internal/ads/x6;

    move-result-object v1

    iget v1, v1, Lcom/google/android/gms/internal/ads/x6;->a:I

    const v2, 0x52494646

    const/4 v3, 0x0

    if-eq v1, v2, :cond_1

    const v2, 0x52463634

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    return v3

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v1

    const/4 v2, 0x4

    invoke-interface {p0, v1, v3, v2}, Lcom/google/android/gms/internal/ads/u0;->N([BII)V

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result p0

    const v0, 0x57415645

    if-eq p0, v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported form type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "WavHeaderReader"

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/eM;->c(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method private static d(ILcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/sR;)Lcom/google/android/gms/internal/ads/x6;
    .locals 7

    .prologue
    :goto_0
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/x6;->a(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/sR;)Lcom/google/android/gms/internal/ads/x6;

    move-result-object v0

    iget v1, v0, Lcom/google/android/gms/internal/ads/x6;->a:I

    if-eq v1, p0, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Ignoring unknown WAV chunk: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "WavHeaderReader"

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/eM;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/x6;->b:J

    const-wide/16 v3, 0x1

    and-long/2addr v3, v1

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    const-wide/16 v4, 0x8

    add-long/2addr v4, v1

    if-eqz v3, :cond_0

    const-wide/16 v3, 0x9

    add-long v4, v1, v3

    :cond_0
    const-wide/32 v1, 0x7fffffff

    cmp-long v1, v4, v1

    if-gtz v1, :cond_1

    long-to-int v0, v4

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    goto :goto_0

    :cond_1
    iget p0, v0, Lcom/google/android/gms/internal/ads/x6;->a:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Chunk is too large (~2GB+) to skip; id: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/of;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/of;

    move-result-object p0

    throw p0

    :cond_2
    return-object v0
.end method
