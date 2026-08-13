.class final Lcom/google/android/gms/internal/ads/G1;
.super Lcom/google/android/gms/internal/ads/F1;
.source "SourceFile"


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/sR;

.field private final c:Lcom/google/android/gms/internal/ads/sR;

.field private d:I

.field private e:Z

.field private f:Z

.field private g:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/a1;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/F1;-><init>(Lcom/google/android/gms/internal/ads/a1;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/sR;

    sget-object v0, Lcom/google/android/gms/internal/ads/lb0;->a:[B

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/sR;-><init>([B)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/G1;->b:Lcom/google/android/gms/internal/ads/sR;

    new-instance p1, Lcom/google/android/gms/internal/ads/sR;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/G1;->c:Lcom/google/android/gms/internal/ads/sR;

    return-void
.end method


# virtual methods
.method protected final a(Lcom/google/android/gms/internal/ads/sR;)Z
    .locals 3

    .prologue
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result p1

    shr-int/lit8 v0, p1, 0x4

    and-int/lit8 p1, p1, 0xf

    const/4 v1, 0x7

    if-ne p1, v1, :cond_1

    iput v0, p0, Lcom/google/android/gms/internal/ads/G1;->g:I

    const/4 p1, 0x5

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/E1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Video format not supported: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/E1;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected final b(Lcom/google/android/gms/internal/ads/sR;J)Z
    .locals 15

    .prologue
    move-object v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->x()I

    move-result v3

    int-to-long v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v2, :cond_0

    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/G1;->e:Z

    if-nez v2, :cond_4

    new-instance v2, Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v3

    new-array v3, v3, [B

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/sR;-><init>([B)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v4

    invoke-virtual {v1, v3, v6, v4}, Lcom/google/android/gms/internal/ads/sR;->h([BII)V

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/W;->a(Lcom/google/android/gms/internal/ads/sR;)Lcom/google/android/gms/internal/ads/W;

    move-result-object v1

    iget v2, v1, Lcom/google/android/gms/internal/ads/W;->b:I

    iput v2, v0, Lcom/google/android/gms/internal/ads/G1;->d:I

    new-instance v2, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    const-string v3, "video/avc"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/oK0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/W;->l:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/oK0;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    iget v3, v1, Lcom/google/android/gms/internal/ads/W;->c:I

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/oK0;->G(I)Lcom/google/android/gms/internal/ads/oK0;

    iget v3, v1, Lcom/google/android/gms/internal/ads/W;->d:I

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/oK0;->k(I)Lcom/google/android/gms/internal/ads/oK0;

    iget v3, v1, Lcom/google/android/gms/internal/ads/W;->k:F

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/oK0;->w(F)Lcom/google/android/gms/internal/ads/oK0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/W;->a:Ljava/util/List;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/oK0;->n(Ljava/util/List;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/F1;->a:Lcom/google/android/gms/internal/ads/a1;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/a1;->c(Lcom/google/android/gms/internal/ads/D;)V

    iput-boolean v5, v0, Lcom/google/android/gms/internal/ads/G1;->e:Z

    return v6

    :cond_0
    if-ne v2, v5, :cond_4

    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/G1;->e:Z

    if-eqz v2, :cond_4

    iget v2, v0, Lcom/google/android/gms/internal/ads/G1;->g:I

    if-ne v2, v5, :cond_1

    move v2, v5

    goto :goto_0

    :cond_1
    move v2, v6

    :goto_0
    iget-boolean v7, v0, Lcom/google/android/gms/internal/ads/G1;->f:Z

    if-nez v7, :cond_2

    if-eqz v2, :cond_4

    move v11, v5

    goto :goto_1

    :cond_2
    move v11, v2

    :goto_1
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/G1;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v2

    aput-byte v6, v2, v6

    aput-byte v6, v2, v5

    const/4 v7, 0x2

    aput-byte v6, v2, v7

    iget v2, v0, Lcom/google/android/gms/internal/ads/G1;->d:I

    const/4 v7, 0x4

    rsub-int/lit8 v2, v2, 0x4

    move v12, v6

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v8

    if-lez v8, :cond_3

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/G1;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v8

    iget v9, v0, Lcom/google/android/gms/internal/ads/G1;->d:I

    invoke-virtual {v1, v8, v2, v9}, Lcom/google/android/gms/internal/ads/sR;->h([BII)V

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/G1;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/G1;->c:Lcom/google/android/gms/internal/ads/sR;

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/G1;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/sR;->F()I

    move-result v8

    invoke-virtual {v9, v6}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/F1;->a:Lcom/google/android/gms/internal/ads/a1;

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/G1;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-interface {v9, v10, v7}, Lcom/google/android/gms/internal/ads/a1;->a(Lcom/google/android/gms/internal/ads/sR;I)V

    add-int/lit8 v12, v12, 0x4

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/F1;->a:Lcom/google/android/gms/internal/ads/a1;

    invoke-interface {v9, v1, v8}, Lcom/google/android/gms/internal/ads/a1;->a(Lcom/google/android/gms/internal/ads/sR;I)V

    add-int/2addr v12, v8

    goto :goto_2

    :cond_3
    const-wide/16 v1, 0x3e8

    mul-long/2addr v3, v1

    add-long v9, p2, v3

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/F1;->a:Lcom/google/android/gms/internal/ads/a1;

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-interface/range {v8 .. v14}, Lcom/google/android/gms/internal/ads/a1;->b(JIIILcom/google/android/gms/internal/ads/Z0;)V

    iput-boolean v5, v0, Lcom/google/android/gms/internal/ads/G1;->f:Z

    return v5

    :cond_4
    return v6
.end method
