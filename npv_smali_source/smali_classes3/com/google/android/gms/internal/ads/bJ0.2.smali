.class public final synthetic Lcom/google/android/gms/internal/ads/bJ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/AJ0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/nJ0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:[I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/nJ0;Ljava/lang/String;[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bJ0;->a:Lcom/google/android/gms/internal/ads/nJ0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bJ0;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bJ0;->c:[I

    return-void
.end method


# virtual methods
.method public final a(ILcom/google/android/gms/internal/ads/Pm;[I)Ljava/util/List;
    .locals 19

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v10, p2

    sget v1, Lcom/google/android/gms/internal/ads/GJ0;->k:I

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/bJ0;->a:Lcom/google/android/gms/internal/ads/nJ0;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/bJ0;->c:[I

    aget v12, v1, p1

    iget v1, v11, Lcom/google/android/gms/internal/ads/fp;->i:I

    iget v2, v11, Lcom/google/android/gms/internal/ads/fp;->j:I

    iget-boolean v3, v11, Lcom/google/android/gms/internal/ads/fp;->k:Z

    const v9, 0x7fffffff

    if-eq v1, v9, :cond_7

    if-ne v2, v9, :cond_0

    move v13, v9

    goto/16 :goto_5

    :cond_0
    move v5, v9

    const/4 v4, 0x0

    :goto_0
    iget v6, v10, Lcom/google/android/gms/internal/ads/Pm;->a:I

    if-ge v4, v6, :cond_6

    invoke-virtual {v10, v4}, Lcom/google/android/gms/internal/ads/Pm;->b(I)Lcom/google/android/gms/internal/ads/D;

    move-result-object v6

    iget v7, v6, Lcom/google/android/gms/internal/ads/D;->v:I

    if-lez v7, :cond_5

    iget v8, v6, Lcom/google/android/gms/internal/ads/D;->w:I

    if-lez v8, :cond_5

    if-eqz v3, :cond_3

    if-gt v7, v8, :cond_1

    const/4 v15, 0x0

    goto :goto_1

    :cond_1
    const/4 v15, 0x1

    :goto_1
    if-gt v1, v2, :cond_2

    const/4 v9, 0x0

    goto :goto_2

    :cond_2
    const/4 v9, 0x1

    :goto_2
    if-eq v15, v9, :cond_3

    move v9, v1

    move v15, v2

    goto :goto_3

    :cond_3
    move v15, v1

    move v9, v2

    :goto_3
    mul-int v14, v7, v9

    mul-int v13, v8, v15

    if-lt v14, v13, :cond_4

    new-instance v8, Landroid/graphics/Point;

    sget v9, Lcom/google/android/gms/internal/ads/EW;->a:I

    add-int/2addr v13, v7

    const/16 v17, -0x1

    add-int/lit8 v13, v13, -0x1

    div-int/2addr v13, v7

    invoke-direct {v8, v15, v13}, Landroid/graphics/Point;-><init>(II)V

    goto :goto_4

    :cond_4
    const/16 v17, -0x1

    new-instance v7, Landroid/graphics/Point;

    sget v13, Lcom/google/android/gms/internal/ads/EW;->a:I

    add-int/2addr v14, v8

    add-int/lit8 v14, v14, -0x1

    div-int/2addr v14, v8

    invoke-direct {v7, v14, v9}, Landroid/graphics/Point;-><init>(II)V

    move-object v8, v7

    :goto_4
    iget v7, v6, Lcom/google/android/gms/internal/ads/D;->v:I

    iget v6, v6, Lcom/google/android/gms/internal/ads/D;->w:I

    mul-int v9, v7, v6

    iget v13, v8, Landroid/graphics/Point;->x:I

    int-to-float v13, v13

    const v14, 0x3f7ae148    # 0.98f

    mul-float/2addr v13, v14

    float-to-int v13, v13

    if-lt v7, v13, :cond_5

    iget v7, v8, Landroid/graphics/Point;->y:I

    int-to-float v7, v7

    mul-float/2addr v7, v14

    float-to-int v7, v7

    if-lt v6, v7, :cond_5

    if-ge v9, v5, :cond_5

    move v5, v9

    :cond_5
    const/4 v6, 0x1

    add-int/2addr v4, v6

    const v9, 0x7fffffff

    goto :goto_0

    :cond_6
    move v13, v5

    goto :goto_5

    :cond_7
    const v13, 0x7fffffff

    :goto_5
    new-instance v14, Lcom/google/android/gms/internal/ads/Zh0;

    invoke-direct {v14}, Lcom/google/android/gms/internal/ads/Zh0;-><init>()V

    const/4 v15, 0x0

    :goto_6
    iget v1, v10, Lcom/google/android/gms/internal/ads/Pm;->a:I

    if-ge v15, v1, :cond_a

    invoke-virtual {v10, v15}, Lcom/google/android/gms/internal/ads/Pm;->b(I)Lcom/google/android/gms/internal/ads/D;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/D;->a()I

    move-result v1

    const v9, 0x7fffffff

    const/4 v8, -0x1

    if-eq v13, v9, :cond_8

    if-eq v1, v8, :cond_9

    if-gt v1, v13, :cond_9

    :cond_8
    const/16 v16, 0x1

    goto :goto_7

    :cond_9
    const/16 v16, 0x0

    :goto_7
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/bJ0;->b:Ljava/lang/String;

    new-instance v6, Lcom/google/android/gms/internal/ads/EJ0;

    aget v17, p3, v15

    move-object v1, v6

    move/from16 v2, p1

    move-object/from16 v3, p2

    move v4, v15

    move-object v5, v11

    move-object v0, v6

    move/from16 v6, v17

    move/from16 v17, v8

    move v8, v12

    move/from16 v18, v9

    move/from16 v9, v16

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/ads/EJ0;-><init>(ILcom/google/android/gms/internal/ads/Pm;ILcom/google/android/gms/internal/ads/nJ0;ILjava/lang/String;IZ)V

    invoke-virtual {v14, v0}, Lcom/google/android/gms/internal/ads/Zh0;->g(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/Zh0;

    const/4 v0, 0x1

    add-int/2addr v15, v0

    move-object/from16 v0, p0

    goto :goto_6

    :cond_a
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/Zh0;->j()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    return-object v0
.end method
