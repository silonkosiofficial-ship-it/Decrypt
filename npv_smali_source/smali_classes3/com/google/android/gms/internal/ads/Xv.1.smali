.class final Lcom/google/android/gms/internal/ads/Xv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:[S

.field private j:[S

.field private k:I

.field private l:[S

.field private m:I

.field private n:[S

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:D


# direct methods
.method public constructor <init>(IIFFI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/Xv;->a:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/Xv;->c:F

    iput p4, p0, Lcom/google/android/gms/internal/ads/Xv;->d:F

    int-to-float p3, p1

    int-to-float p4, p5

    div-float/2addr p3, p4

    iput p3, p0, Lcom/google/android/gms/internal/ads/Xv;->e:F

    div-int/lit16 p3, p1, 0x190

    iput p3, p0, Lcom/google/android/gms/internal/ads/Xv;->f:I

    div-int/lit8 p1, p1, 0x41

    iput p1, p0, Lcom/google/android/gms/internal/ads/Xv;->g:I

    add-int/2addr p1, p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/Xv;->h:I

    new-array p3, p1, [S

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Xv;->i:[S

    mul-int/2addr p1, p2

    new-array p2, p1, [S

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Xv;->j:[S

    new-array p2, p1, [S

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Xv;->l:[S

    new-array p1, p1, [S

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Xv;->n:[S

    return-void
.end method

.method private final g([SIII)I
    .locals 9

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    const/16 v2, 0xff

    move v3, v0

    move v4, v3

    :goto_0
    if-gt p3, p4, :cond_5

    move v5, v0

    move v6, v5

    :goto_1
    if-ge v5, p3, :cond_0

    iget v7, p0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    mul-int/2addr v7, p2

    add-int v8, v7, v5

    aget-short v8, p1, v8

    add-int/2addr v7, p3

    add-int/2addr v7, v5

    aget-short v7, p1, v7

    sub-int/2addr v8, v7

    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v7

    add-int/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    mul-int v5, v6, v3

    mul-int v7, v1, p3

    if-ge v5, v7, :cond_1

    move v1, v6

    :cond_1
    if-ge v5, v7, :cond_2

    move v3, p3

    :cond_2
    mul-int v5, v6, v2

    mul-int v7, v4, p3

    if-le v5, v7, :cond_3

    move v4, v6

    :cond_3
    if-le v5, v7, :cond_4

    move v2, p3

    :cond_4
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_5
    div-int/2addr v1, v3

    iput v1, p0, Lcom/google/android/gms/internal/ads/Xv;->u:I

    div-int/2addr v4, v2

    iput v4, p0, Lcom/google/android/gms/internal/ads/Xv;->v:I

    return v3
.end method

.method private final h([SII)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xv;->l:[S

    iget v1, p0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    invoke-direct {p0, v0, v1, p3}, Lcom/google/android/gms/internal/ads/Xv;->l([SII)[S

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Xv;->l:[S

    iget v1, p0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    mul-int/2addr v1, v2

    mul-int v3, p3, v2

    mul-int/2addr p2, v2

    invoke-static {p1, p2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    return-void
.end method

.method private final i([SII)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lcom/google/android/gms/internal/ads/Xv;->h:I

    div-int/2addr v2, p3

    if-ge v1, v2, :cond_1

    move v2, v0

    move v3, v2

    :goto_1
    iget v4, p0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    mul-int v5, v4, p3

    if-ge v2, v5, :cond_0

    mul-int/2addr v4, p2

    mul-int/2addr v5, v1

    add-int/2addr v4, v5

    add-int/2addr v4, v2

    aget-short v4, p1, v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    div-int/2addr v3, v5

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xv;->i:[S

    int-to-short v3, v3

    aput-short v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static j(II[SI[SI[SI)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p1, :cond_1

    mul-int v2, p3, p1

    mul-int v3, p7, p1

    mul-int v4, p5, p1

    add-int/2addr v4, v1

    add-int/2addr v3, v1

    add-int/2addr v2, v1

    move v5, v0

    :goto_1
    if-ge v5, p0, :cond_0

    aget-short v6, p4, v4

    sub-int v7, p0, v5

    mul-int/2addr v6, v7

    aget-short v7, p6, v3

    mul-int/2addr v7, v5

    add-int/2addr v6, v7

    div-int/2addr v6, p0

    int-to-short v6, v6

    aput-short v6, p2, v2

    add-int/2addr v2, p1

    add-int/2addr v4, p1

    add-int/2addr v3, p1

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final k()V
    .locals 22

    .prologue
    move-object/from16 v0, p0

    iget v1, v0, Lcom/google/android/gms/internal/ads/Xv;->c:F

    iget v2, v0, Lcom/google/android/gms/internal/ads/Xv;->d:F

    div-float/2addr v1, v2

    float-to-double v1, v1

    const-wide v3, 0x3ff0000a7c5ac472L    # 1.00001

    cmpl-double v3, v1, v3

    iget v4, v0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-gtz v3, :cond_1

    const-wide v7, 0x3fefffeb074a771dL    # 0.99999

    cmpg-double v3, v1, v7

    if-gez v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/Xv;->j:[S

    iget v2, v0, Lcom/google/android/gms/internal/ads/Xv;->k:I

    invoke-direct {v0, v1, v5, v2}, Lcom/google/android/gms/internal/ads/Xv;->h([SII)V

    iput v5, v0, Lcom/google/android/gms/internal/ads/Xv;->k:I

    goto/16 :goto_9

    :cond_1
    :goto_0
    iget v3, v0, Lcom/google/android/gms/internal/ads/Xv;->k:I

    iget v7, v0, Lcom/google/android/gms/internal/ads/Xv;->h:I

    if-ge v3, v7, :cond_2

    goto/16 :goto_9

    :cond_2
    move v7, v5

    :goto_1
    iget v8, v0, Lcom/google/android/gms/internal/ads/Xv;->r:I

    if-lez v8, :cond_3

    iget v9, v0, Lcom/google/android/gms/internal/ads/Xv;->h:I

    invoke-static {v9, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/Xv;->j:[S

    invoke-direct {v0, v9, v7, v8}, Lcom/google/android/gms/internal/ads/Xv;->h([SII)V

    iget v9, v0, Lcom/google/android/gms/internal/ads/Xv;->r:I

    sub-int/2addr v9, v8

    iput v9, v0, Lcom/google/android/gms/internal/ads/Xv;->r:I

    add-int/2addr v7, v8

    goto/16 :goto_8

    :cond_3
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/Xv;->j:[S

    iget v9, v0, Lcom/google/android/gms/internal/ads/Xv;->a:I

    const/16 v10, 0xfa0

    if-le v9, v10, :cond_4

    div-int/lit16 v9, v9, 0xfa0

    goto :goto_2

    :cond_4
    move v9, v6

    :goto_2
    iget v10, v0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    if-ne v10, v6, :cond_5

    if-ne v9, v6, :cond_5

    iget v9, v0, Lcom/google/android/gms/internal/ads/Xv;->f:I

    iget v10, v0, Lcom/google/android/gms/internal/ads/Xv;->g:I

    invoke-direct {v0, v8, v7, v9, v10}, Lcom/google/android/gms/internal/ads/Xv;->g([SIII)I

    move-result v8

    goto :goto_3

    :cond_5
    invoke-direct {v0, v8, v7, v9}, Lcom/google/android/gms/internal/ads/Xv;->i([SII)V

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/Xv;->i:[S

    iget v11, v0, Lcom/google/android/gms/internal/ads/Xv;->f:I

    iget v12, v0, Lcom/google/android/gms/internal/ads/Xv;->g:I

    div-int/2addr v12, v9

    div-int/2addr v11, v9

    invoke-direct {v0, v10, v5, v11, v12}, Lcom/google/android/gms/internal/ads/Xv;->g([SIII)I

    move-result v10

    if-eq v9, v6, :cond_9

    mul-int/2addr v10, v9

    mul-int/lit8 v9, v9, 0x4

    iget v11, v0, Lcom/google/android/gms/internal/ads/Xv;->f:I

    sub-int v12, v10, v9

    if-lt v12, v11, :cond_6

    move v11, v12

    :cond_6
    add-int/2addr v10, v9

    iget v9, v0, Lcom/google/android/gms/internal/ads/Xv;->g:I

    if-le v10, v9, :cond_7

    move v10, v9

    :cond_7
    iget v9, v0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    if-ne v9, v6, :cond_8

    invoke-direct {v0, v8, v7, v11, v10}, Lcom/google/android/gms/internal/ads/Xv;->g([SIII)I

    move-result v8

    goto :goto_3

    :cond_8
    invoke-direct {v0, v8, v7, v6}, Lcom/google/android/gms/internal/ads/Xv;->i([SII)V

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/Xv;->i:[S

    invoke-direct {v0, v8, v5, v11, v10}, Lcom/google/android/gms/internal/ads/Xv;->g([SIII)I

    move-result v8

    goto :goto_3

    :cond_9
    move v8, v10

    :goto_3
    iget v9, v0, Lcom/google/android/gms/internal/ads/Xv;->u:I

    iget v10, v0, Lcom/google/android/gms/internal/ads/Xv;->v:I

    if-eqz v9, :cond_d

    iget v11, v0, Lcom/google/android/gms/internal/ads/Xv;->s:I

    if-nez v11, :cond_a

    goto :goto_4

    :cond_a
    mul-int/lit8 v12, v9, 0x3

    if-le v10, v12, :cond_b

    goto :goto_4

    :cond_b
    add-int v10, v9, v9

    iget v12, v0, Lcom/google/android/gms/internal/ads/Xv;->t:I

    mul-int/lit8 v12, v12, 0x3

    if-gt v10, v12, :cond_c

    goto :goto_4

    :cond_c
    move v15, v11

    goto :goto_5

    :cond_d
    :goto_4
    move v15, v8

    :goto_5
    add-int v16, v7, v15

    iput v9, v0, Lcom/google/android/gms/internal/ads/Xv;->t:I

    iput v8, v0, Lcom/google/android/gms/internal/ads/Xv;->s:I

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    cmpl-double v10, v1, v8

    int-to-double v11, v15

    const-wide/high16 v13, -0x4010000000000000L    # -1.0

    if-lez v10, :cond_f

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/Xv;->j:[S

    add-double/2addr v13, v1

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    cmpl-double v17, v1, v8

    if-ltz v17, :cond_e

    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/Xv;->w:D

    div-double/2addr v11, v13

    add-double/2addr v11, v8

    invoke-static {v11, v12}, Ljava/lang/Math;->round(D)J

    move-result-wide v8

    long-to-int v8, v8

    int-to-double v13, v8

    sub-double/2addr v11, v13

    iput-wide v11, v0, Lcom/google/android/gms/internal/ads/Xv;->w:D

    move v5, v8

    goto :goto_6

    :cond_e
    sub-double/2addr v8, v1

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/Xv;->w:D

    mul-double/2addr v11, v8

    div-double/2addr v11, v13

    add-double/2addr v11, v5

    invoke-static {v11, v12}, Ljava/lang/Math;->round(D)J

    move-result-wide v5

    long-to-int v5, v5

    iput v5, v0, Lcom/google/android/gms/internal/ads/Xv;->r:I

    int-to-double v5, v5

    sub-double/2addr v11, v5

    iput-wide v11, v0, Lcom/google/android/gms/internal/ads/Xv;->w:D

    move v5, v15

    :goto_6
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/Xv;->l:[S

    iget v8, v0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    invoke-direct {v0, v6, v8, v5}, Lcom/google/android/gms/internal/ads/Xv;->l([SII)[S

    move-result-object v6

    iput-object v6, v0, Lcom/google/android/gms/internal/ads/Xv;->l:[S

    iget v9, v0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    iget v11, v0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    move v8, v5

    move-object v14, v10

    move-object v10, v6

    move-object v12, v14

    move v13, v7

    move v6, v15

    move/from16 v15, v16

    invoke-static/range {v8 .. v15}, Lcom/google/android/gms/internal/ads/Xv;->j(II[SI[SI[SI)V

    iget v8, v0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    add-int/2addr v8, v5

    iput v8, v0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    add-int v15, v6, v5

    add-int/2addr v7, v15

    goto :goto_8

    :cond_f
    move v6, v15

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/Xv;->j:[S

    sub-double/2addr v8, v1

    const-wide/high16 v18, 0x3fe0000000000000L    # 0.5

    cmpg-double v10, v1, v18

    if-gez v10, :cond_10

    mul-double/2addr v11, v1

    iget-wide v13, v0, Lcom/google/android/gms/internal/ads/Xv;->w:D

    div-double/2addr v11, v8

    add-double/2addr v11, v13

    invoke-static {v11, v12}, Ljava/lang/Math;->round(D)J

    move-result-wide v8

    long-to-int v15, v8

    int-to-double v8, v15

    sub-double/2addr v11, v8

    iput-wide v11, v0, Lcom/google/android/gms/internal/ads/Xv;->w:D

    move/from16 v18, v15

    goto :goto_7

    :cond_10
    add-double v18, v1, v1

    add-double v18, v18, v13

    iget-wide v13, v0, Lcom/google/android/gms/internal/ads/Xv;->w:D

    mul-double v11, v11, v18

    div-double/2addr v11, v8

    add-double/2addr v11, v13

    invoke-static {v11, v12}, Ljava/lang/Math;->round(D)J

    move-result-wide v8

    long-to-int v8, v8

    iput v8, v0, Lcom/google/android/gms/internal/ads/Xv;->r:I

    int-to-double v8, v8

    sub-double/2addr v11, v8

    iput-wide v11, v0, Lcom/google/android/gms/internal/ads/Xv;->w:D

    move/from16 v18, v6

    :goto_7
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/Xv;->l:[S

    iget v9, v0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    add-int v15, v6, v18

    invoke-direct {v0, v8, v9, v15}, Lcom/google/android/gms/internal/ads/Xv;->l([SII)[S

    move-result-object v8

    iput-object v8, v0, Lcom/google/android/gms/internal/ads/Xv;->l:[S

    iget v9, v0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    mul-int v10, v7, v9

    iget v11, v0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    mul-int/2addr v11, v9

    mul-int/2addr v9, v6

    invoke-static {v5, v10, v8, v11, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v9, v0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/Xv;->l:[S

    iget v8, v0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    add-int v11, v8, v6

    move/from16 v8, v18

    move-object v12, v5

    move/from16 v13, v16

    move-object v14, v5

    move v5, v15

    move v15, v7

    invoke-static/range {v8 .. v15}, Lcom/google/android/gms/internal/ads/Xv;->j(II[SI[SI[SI)V

    iget v6, v0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    add-int/2addr v6, v5

    iput v6, v0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    add-int v7, v7, v18

    :goto_8
    iget v5, v0, Lcom/google/android/gms/internal/ads/Xv;->h:I

    add-int/2addr v5, v7

    if-le v5, v3, :cond_19

    iget v1, v0, Lcom/google/android/gms/internal/ads/Xv;->k:I

    sub-int/2addr v1, v7

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/Xv;->j:[S

    iget v3, v0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    mul-int/2addr v7, v3

    mul-int/2addr v3, v1

    const/4 v5, 0x0

    invoke-static {v2, v7, v2, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v1, v0, Lcom/google/android/gms/internal/ads/Xv;->k:I

    :goto_9
    iget v1, v0, Lcom/google/android/gms/internal/ads/Xv;->d:F

    iget v2, v0, Lcom/google/android/gms/internal/ads/Xv;->e:F

    mul-float/2addr v2, v1

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, v2, v1

    if-eqz v1, :cond_18

    iget v1, v0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    if-ne v1, v4, :cond_11

    goto/16 :goto_f

    :cond_11
    iget v1, v0, Lcom/google/android/gms/internal/ads/Xv;->a:I

    int-to-float v3, v1

    div-float/2addr v3, v2

    int-to-long v1, v1

    float-to-long v5, v3

    :goto_a
    const-wide/16 v7, 0x0

    cmp-long v3, v5, v7

    if-eqz v3, :cond_12

    cmp-long v3, v1, v7

    if-eqz v3, :cond_12

    const-wide/16 v9, 0x2

    rem-long v11, v5, v9

    cmp-long v3, v11, v7

    if-nez v3, :cond_12

    rem-long v11, v1, v9

    cmp-long v3, v11, v7

    if-nez v3, :cond_12

    div-long/2addr v5, v9

    div-long/2addr v1, v9

    goto :goto_a

    :cond_12
    iget v3, v0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    sub-int/2addr v3, v4

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/Xv;->n:[S

    iget v8, v0, Lcom/google/android/gms/internal/ads/Xv;->o:I

    invoke-direct {v0, v7, v8, v3}, Lcom/google/android/gms/internal/ads/Xv;->l([SII)[S

    move-result-object v7

    iput-object v7, v0, Lcom/google/android/gms/internal/ads/Xv;->n:[S

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/Xv;->l:[S

    iget v9, v0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    mul-int v10, v4, v9

    iget v11, v0, Lcom/google/android/gms/internal/ads/Xv;->o:I

    mul-int/2addr v11, v9

    mul-int/2addr v9, v3

    invoke-static {v8, v10, v7, v11, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v4, v0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    iget v4, v0, Lcom/google/android/gms/internal/ads/Xv;->o:I

    add-int/2addr v4, v3

    iput v4, v0, Lcom/google/android/gms/internal/ads/Xv;->o:I

    const/4 v3, 0x0

    :goto_b
    iget v4, v0, Lcom/google/android/gms/internal/ads/Xv;->o:I

    add-int/lit8 v7, v4, -0x1

    if-ge v3, v7, :cond_17

    :goto_c
    iget v4, v0, Lcom/google/android/gms/internal/ads/Xv;->p:I

    const/4 v7, 0x1

    add-int/2addr v4, v7

    int-to-long v8, v4

    mul-long v10, v8, v5

    iget v12, v0, Lcom/google/android/gms/internal/ads/Xv;->q:I

    int-to-long v12, v12

    mul-long v14, v12, v1

    cmp-long v10, v10, v14

    if-lez v10, :cond_14

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/Xv;->l:[S

    iget v8, v0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    invoke-direct {v0, v4, v8, v7}, Lcom/google/android/gms/internal/ads/Xv;->l([SII)[S

    move-result-object v4

    iput-object v4, v0, Lcom/google/android/gms/internal/ads/Xv;->l:[S

    const/4 v4, 0x0

    :goto_d
    iget v7, v0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    if-ge v4, v7, :cond_13

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/Xv;->l:[S

    iget v9, v0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    mul-int/2addr v9, v7

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/Xv;->n:[S

    mul-int v11, v3, v7

    add-int/2addr v11, v4

    aget-short v12, v10, v11

    add-int/2addr v11, v7

    aget-short v7, v10, v11

    iget v10, v0, Lcom/google/android/gms/internal/ads/Xv;->q:I

    int-to-long v10, v10

    mul-long/2addr v10, v1

    iget v13, v0, Lcom/google/android/gms/internal/ads/Xv;->p:I

    int-to-long v14, v13

    mul-long/2addr v14, v5

    const/16 v16, 0x1

    add-int/lit8 v13, v13, 0x1

    move-wide/from16 v18, v1

    int-to-long v1, v13

    mul-long/2addr v1, v5

    int-to-long v12, v12

    move-wide/from16 v20, v5

    int-to-long v5, v7

    sub-long v14, v1, v14

    sub-long/2addr v1, v10

    sub-long v10, v14, v1

    mul-long/2addr v1, v12

    mul-long/2addr v10, v5

    add-long/2addr v1, v10

    div-long/2addr v1, v14

    long-to-int v1, v1

    add-int/2addr v9, v4

    int-to-short v1, v1

    aput-short v1, v8, v9

    add-int/lit8 v4, v4, 0x1

    move-wide/from16 v1, v18

    move-wide/from16 v5, v20

    goto :goto_d

    :cond_13
    move-wide/from16 v18, v1

    move-wide/from16 v20, v5

    iget v1, v0, Lcom/google/android/gms/internal/ads/Xv;->q:I

    const/4 v5, 0x1

    add-int/2addr v1, v5

    iput v1, v0, Lcom/google/android/gms/internal/ads/Xv;->q:I

    iget v1, v0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    add-int/2addr v1, v5

    iput v1, v0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    move-wide/from16 v1, v18

    move-wide/from16 v5, v20

    goto :goto_c

    :cond_14
    move-wide/from16 v18, v1

    move-wide/from16 v20, v5

    move v5, v7

    iput v4, v0, Lcom/google/android/gms/internal/ads/Xv;->p:I

    cmp-long v1, v8, v18

    if-nez v1, :cond_16

    const/4 v1, 0x0

    iput v1, v0, Lcom/google/android/gms/internal/ads/Xv;->p:I

    cmp-long v2, v12, v20

    if-nez v2, :cond_15

    move/from16 v17, v5

    goto :goto_e

    :cond_15
    move/from16 v17, v1

    :goto_e
    invoke-static/range {v17 .. v17}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iput v1, v0, Lcom/google/android/gms/internal/ads/Xv;->q:I

    :cond_16
    add-int/lit8 v3, v3, 0x1

    move-wide/from16 v1, v18

    move-wide/from16 v5, v20

    goto/16 :goto_b

    :cond_17
    if-eqz v7, :cond_18

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/Xv;->n:[S

    iget v2, v0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    sub-int/2addr v4, v7

    mul-int v3, v7, v2

    mul-int/2addr v4, v2

    const/4 v6, 0x0

    invoke-static {v1, v3, v1, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, v0, Lcom/google/android/gms/internal/ads/Xv;->o:I

    sub-int/2addr v1, v7

    iput v1, v0, Lcom/google/android/gms/internal/ads/Xv;->o:I

    :cond_18
    :goto_f
    return-void

    :cond_19
    const/4 v5, 0x0

    const/4 v6, 0x1

    goto/16 :goto_1
.end method

.method private final l([SII)[S
    .locals 2

    .prologue
    array-length v0, p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    div-int/2addr v0, v1

    add-int/2addr p2, p3

    if-gt p2, v0, :cond_0

    return-object p1

    :cond_0
    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p3

    mul-int/2addr v0, v1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([SI)[S

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final a()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    mul-int/2addr v0, v1

    add-int/2addr v0, v0

    return v0
.end method

.method public final b()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/Xv;->k:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    mul-int/2addr v0, v1

    add-int/2addr v0, v0

    return v0
.end method

.method public final c()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/Xv;->k:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Xv;->o:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Xv;->p:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Xv;->q:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Xv;->r:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Xv;->s:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Xv;->t:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Xv;->u:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Xv;->v:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/Xv;->w:D

    return-void
.end method

.method public final d(Ljava/nio/ShortBuffer;)V
    .locals 4

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    div-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    mul-int/2addr v1, v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xv;->l:[S

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3, v1}, Ljava/nio/ShortBuffer;->put([SII)Ljava/nio/ShortBuffer;

    iget p1, p0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xv;->l:[S

    mul-int/2addr p1, v1

    invoke-static {v2, v0, v2, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final e()V
    .locals 10

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/Xv;->k:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/Xv;->r:I

    sub-int v2, v0, v1

    int-to-double v3, v1

    int-to-double v1, v2

    iget v5, p0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    iget v6, p0, Lcom/google/android/gms/internal/ads/Xv;->c:F

    iget v7, p0, Lcom/google/android/gms/internal/ads/Xv;->d:F

    div-float/2addr v6, v7

    float-to-double v8, v6

    div-double/2addr v1, v8

    add-double/2addr v1, v3

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/Xv;->w:D

    add-double/2addr v1, v3

    iget v3, p0, Lcom/google/android/gms/internal/ads/Xv;->o:I

    int-to-double v3, v3

    add-double/2addr v1, v3

    iget v3, p0, Lcom/google/android/gms/internal/ads/Xv;->e:F

    mul-float/2addr v3, v7

    float-to-double v3, v3

    div-double/2addr v1, v3

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    add-int/2addr v5, v1

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/Xv;->w:D

    iget v1, p0, Lcom/google/android/gms/internal/ads/Xv;->h:I

    add-int/2addr v1, v1

    add-int/2addr v1, v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xv;->j:[S

    invoke-direct {p0, v2, v0, v1}, Lcom/google/android/gms/internal/ads/Xv;->l([SII)[S

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/Xv;->j:[S

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget v3, p0, Lcom/google/android/gms/internal/ads/Xv;->h:I

    iget v4, p0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    add-int/2addr v3, v3

    mul-int v6, v3, v4

    if-ge v2, v6, :cond_0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Xv;->j:[S

    mul-int/2addr v4, v0

    add-int/2addr v4, v2

    aput-short v1, v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/Xv;->k:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/google/android/gms/internal/ads/Xv;->k:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Xv;->k()V

    iget v0, p0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    if-le v0, v5, :cond_1

    iput v5, p0, Lcom/google/android/gms/internal/ads/Xv;->m:I

    :cond_1
    iput v1, p0, Lcom/google/android/gms/internal/ads/Xv;->k:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/Xv;->r:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/Xv;->o:I

    return-void
.end method

.method public final f(Ljava/nio/ShortBuffer;)V
    .locals 5

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    div-int/2addr v0, v1

    mul-int/2addr v1, v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xv;->j:[S

    iget v3, p0, Lcom/google/android/gms/internal/ads/Xv;->k:I

    invoke-direct {p0, v2, v3, v0}, Lcom/google/android/gms/internal/ads/Xv;->l([SII)[S

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/Xv;->j:[S

    iget v3, p0, Lcom/google/android/gms/internal/ads/Xv;->k:I

    iget v4, p0, Lcom/google/android/gms/internal/ads/Xv;->b:I

    mul-int/2addr v3, v4

    add-int/2addr v1, v1

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p1, v2, v3, v1}, Ljava/nio/ShortBuffer;->get([SII)Ljava/nio/ShortBuffer;

    iget p1, p0, Lcom/google/android/gms/internal/ads/Xv;->k:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Xv;->k:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Xv;->k()V

    return-void
.end method
