.class public final Lcom/google/android/gms/internal/ads/W;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:F

.field public final l:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/util/List;IIIIIIIIIFLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/W;->a:Ljava/util/List;

    iput p2, p0, Lcom/google/android/gms/internal/ads/W;->b:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/W;->c:I

    iput p4, p0, Lcom/google/android/gms/internal/ads/W;->d:I

    iput p5, p0, Lcom/google/android/gms/internal/ads/W;->e:I

    iput p6, p0, Lcom/google/android/gms/internal/ads/W;->f:I

    iput p7, p0, Lcom/google/android/gms/internal/ads/W;->g:I

    iput p8, p0, Lcom/google/android/gms/internal/ads/W;->h:I

    iput p9, p0, Lcom/google/android/gms/internal/ads/W;->i:I

    iput p10, p0, Lcom/google/android/gms/internal/ads/W;->j:I

    iput p11, p0, Lcom/google/android/gms/internal/ads/W;->k:F

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/W;->l:Ljava/lang/String;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/sR;)Lcom/google/android/gms/internal/ads/W;
    .locals 15

    .prologue
    const/4 v0, 0x4

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result v0

    const/4 v1, 0x3

    and-int/2addr v0, v1

    add-int/lit8 v4, v0, 0x1

    if-eq v4, v1, :cond_3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result v1

    and-int/lit8 v1, v1, 0x1f

    const/4 v2, 0x0

    move v5, v2

    :goto_0
    if-ge v5, v1, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/W;->b(Lcom/google/android/gms/internal/ads/sR;)[B

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :catch_0
    move-exception p0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result v5

    move v6, v2

    :goto_1
    if-ge v6, v5, :cond_1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/W;->b(Lcom/google/android/gms/internal/ads/sR;)[B

    move-result-object v7

    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    if-lez v1, :cond_2

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    array-length p0, p0

    add-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0, p0}, Lcom/google/android/gms/internal/ads/lb0;->f([BII)Lcom/google/android/gms/internal/ads/Ka0;

    move-result-object p0

    iget v0, p0, Lcom/google/android/gms/internal/ads/Ka0;->e:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/Ka0;->f:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/Ka0;->h:I

    add-int/lit8 v2, v2, 0x8

    iget v5, p0, Lcom/google/android/gms/internal/ads/Ka0;->i:I

    add-int/lit8 v5, v5, 0x8

    iget v6, p0, Lcom/google/android/gms/internal/ads/Ka0;->j:I

    iget v7, p0, Lcom/google/android/gms/internal/ads/Ka0;->k:I

    iget v8, p0, Lcom/google/android/gms/internal/ads/Ka0;->l:I

    iget v9, p0, Lcom/google/android/gms/internal/ads/Ka0;->m:I

    iget v10, p0, Lcom/google/android/gms/internal/ads/Ka0;->g:F

    iget v11, p0, Lcom/google/android/gms/internal/ads/Ka0;->a:I

    iget v12, p0, Lcom/google/android/gms/internal/ads/Ka0;->b:I

    iget p0, p0, Lcom/google/android/gms/internal/ads/Ka0;->c:I

    invoke-static {v11, v12, p0}, Lcom/google/android/gms/internal/ads/ND;->c(III)Ljava/lang/String;

    move-result-object p0

    move-object v14, p0

    move v11, v8

    move v12, v9

    move v13, v10

    move v8, v5

    move v9, v6

    move v10, v7

    move v5, v0

    move v6, v1

    move v7, v2

    goto :goto_2

    :cond_2
    const/4 p0, -0x1

    const/16 v0, 0x10

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    move v5, p0

    move v6, v5

    move v7, v6

    move v8, v7

    move v9, v8

    move v10, v9

    move v11, v10

    move v12, v0

    move-object v14, v1

    move v13, v2

    :goto_2
    new-instance p0, Lcom/google/android/gms/internal/ads/W;

    move-object v2, p0

    invoke-direct/range {v2 .. v14}, Lcom/google/android/gms/internal/ads/W;-><init>(Ljava/util/List;IIIIIIIIIFLjava/lang/String;)V

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_3
    const-string v0, "Error parsing AVC config"

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object p0

    throw p0
.end method

.method private static b(Lcom/google/android/gms/internal/ads/sR;)[B
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sR;->G()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sR;->t()I

    move-result v1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object p0

    invoke-static {p0, v1, v0}, Lcom/google/android/gms/internal/ads/ND;->e([BII)[B

    move-result-object p0

    return-object p0
.end method
