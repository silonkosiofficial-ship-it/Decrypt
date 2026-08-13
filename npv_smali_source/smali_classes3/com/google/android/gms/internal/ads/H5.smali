.class public final Lcom/google/android/gms/internal/ads/H5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/y5;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/d6;

.field private b:Ljava/lang/String;

.field private c:Lcom/google/android/gms/internal/ads/a1;

.field private d:Lcom/google/android/gms/internal/ads/G5;

.field private e:Z

.field private final f:[Z

.field private final g:Lcom/google/android/gms/internal/ads/R5;

.field private final h:Lcom/google/android/gms/internal/ads/R5;

.field private final i:Lcom/google/android/gms/internal/ads/R5;

.field private final j:Lcom/google/android/gms/internal/ads/R5;

.field private final k:Lcom/google/android/gms/internal/ads/R5;

.field private l:J

.field private m:J

.field private final n:Lcom/google/android/gms/internal/ads/sR;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/d6;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/H5;->a:Lcom/google/android/gms/internal/ads/d6;

    const/4 p1, 0x3

    new-array p1, p1, [Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/H5;->f:[Z

    new-instance p1, Lcom/google/android/gms/internal/ads/R5;

    const/16 v0, 0x20

    const/16 v1, 0x80

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/R5;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/H5;->g:Lcom/google/android/gms/internal/ads/R5;

    new-instance p1, Lcom/google/android/gms/internal/ads/R5;

    const/16 v0, 0x21

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/R5;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/H5;->h:Lcom/google/android/gms/internal/ads/R5;

    new-instance p1, Lcom/google/android/gms/internal/ads/R5;

    const/16 v0, 0x22

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/R5;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/H5;->i:Lcom/google/android/gms/internal/ads/R5;

    new-instance p1, Lcom/google/android/gms/internal/ads/R5;

    const/16 v0, 0x27

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/R5;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/H5;->j:Lcom/google/android/gms/internal/ads/R5;

    new-instance p1, Lcom/google/android/gms/internal/ads/R5;

    const/16 v0, 0x28

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/R5;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/H5;->k:Lcom/google/android/gms/internal/ads/R5;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/H5;->m:J

    new-instance p1, Lcom/google/android/gms/internal/ads/sR;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/sR;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/H5;->n:Lcom/google/android/gms/internal/ads/sR;

    return-void
.end method

.method private final f([BII)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->d:Lcom/google/android/gms/internal/ads/G5;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/G5;->c([BII)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/H5;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->g:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/R5;->a([BII)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->h:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/R5;->a([BII)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->i:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/R5;->a([BII)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->j:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/R5;->a([BII)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->k:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/R5;->a([BII)V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->c:Lcom/google/android/gms/internal/ads/a1;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/H5;->a:Lcom/google/android/gms/internal/ads/d6;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/d6;->c()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/H5;->d:Lcom/google/android/gms/internal/ads/G5;

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/H5;->l:J

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/G5;->a(J)V

    :cond_0
    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/sR;)V
    .locals 27

    .prologue
    move-object/from16 v0, p0

    const/4 v1, 0x3

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/H5;->c:Lcom/google/android/gms/internal/ads/a1;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    sget v2, Lcom/google/android/gms/internal/ads/EW;->a:I

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v2

    if-lez v2, :cond_a

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->t()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->u()I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v4

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/H5;->l:J

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v7

    int-to-long v7, v7

    add-long/2addr v5, v7

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/H5;->l:J

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/H5;->c:Lcom/google/android/gms/internal/ads/a1;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v6

    move-object/from16 v7, p1

    invoke-interface {v5, v7, v6}, Lcom/google/android/gms/internal/ads/a1;->a(Lcom/google/android/gms/internal/ads/sR;I)V

    :goto_0
    if-ge v2, v3, :cond_0

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/H5;->f:[Z

    invoke-static {v4, v2, v3, v5}, Lcom/google/android/gms/internal/ads/lb0;->a([BII[Z)I

    move-result v5

    if-eq v5, v3, :cond_9

    add-int/lit8 v6, v5, 0x3

    aget-byte v8, v4, v6

    and-int/lit8 v8, v8, 0x7e

    sub-int v9, v5, v2

    if-lez v9, :cond_1

    invoke-direct {v0, v4, v2, v5}, Lcom/google/android/gms/internal/ads/H5;->f([BII)V

    :cond_1
    sub-int v13, v3, v5

    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/H5;->l:J

    int-to-long v14, v13

    sub-long v11, v10, v14

    if-gez v9, :cond_2

    neg-int v5, v9

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/H5;->m:J

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/H5;->d:Lcom/google/android/gms/internal/ads/G5;

    iget-boolean v15, v0, Lcom/google/android/gms/internal/ads/H5;->e:Z

    invoke-virtual {v14, v11, v12, v13, v15}, Lcom/google/android/gms/internal/ads/G5;->b(JIZ)V

    iget-boolean v14, v0, Lcom/google/android/gms/internal/ads/H5;->e:Z

    if-nez v14, :cond_5

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/H5;->g:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v14, v5}, Lcom/google/android/gms/internal/ads/R5;->d(I)Z

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/H5;->h:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v14, v5}, Lcom/google/android/gms/internal/ads/R5;->d(I)Z

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/H5;->i:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v14, v5}, Lcom/google/android/gms/internal/ads/R5;->d(I)Z

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/H5;->g:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/R5;->e()Z

    move-result v16

    if-eqz v16, :cond_5

    iget-object v15, v0, Lcom/google/android/gms/internal/ads/H5;->h:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/R5;->e()Z

    move-result v17

    if-eqz v17, :cond_5

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/H5;->i:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/R5;->e()Z

    move-result v17

    if-eqz v17, :cond_5

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/H5;->b:Ljava/lang/String;

    move/from16 v18, v6

    iget v6, v14, Lcom/google/android/gms/internal/ads/R5;->e:I

    iget v7, v15, Lcom/google/android/gms/internal/ads/R5;->e:I

    add-int/2addr v7, v6

    move/from16 v19, v3

    iget v3, v1, Lcom/google/android/gms/internal/ads/R5;->e:I

    add-int/2addr v7, v3

    new-array v3, v7, [B

    iget-object v7, v14, Lcom/google/android/gms/internal/ads/R5;->d:[B

    move-object/from16 v20, v4

    const/4 v4, 0x0

    invoke-static {v7, v4, v3, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v6, v15, Lcom/google/android/gms/internal/ads/R5;->d:[B

    iget v7, v14, Lcom/google/android/gms/internal/ads/R5;->e:I

    move/from16 v17, v13

    iget v13, v15, Lcom/google/android/gms/internal/ads/R5;->e:I

    invoke-static {v6, v4, v3, v7, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/R5;->d:[B

    iget v7, v14, Lcom/google/android/gms/internal/ads/R5;->e:I

    iget v13, v15, Lcom/google/android/gms/internal/ads/R5;->e:I

    add-int/2addr v7, v13

    iget v1, v1, Lcom/google/android/gms/internal/ads/R5;->e:I

    invoke-static {v6, v4, v3, v7, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/R5;->d:[B

    iget v6, v15, Lcom/google/android/gms/internal/ads/R5;->e:I

    const/4 v7, 0x0

    const/4 v15, 0x3

    invoke-static {v1, v15, v6, v7}, Lcom/google/android/gms/internal/ads/lb0;->c([BIILcom/google/android/gms/internal/ads/I90;)Lcom/google/android/gms/internal/ads/f80;

    move-result-object v1

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/f80;->a:Lcom/google/android/gms/internal/ads/z50;

    if-eqz v6, :cond_3

    iget v7, v6, Lcom/google/android/gms/internal/ads/z50;->f:I

    iget-object v13, v6, Lcom/google/android/gms/internal/ads/z50;->e:[I

    iget v14, v6, Lcom/google/android/gms/internal/ads/z50;->d:I

    iget v4, v6, Lcom/google/android/gms/internal/ads/z50;->c:I

    iget-boolean v15, v6, Lcom/google/android/gms/internal/ads/z50;->b:Z

    iget v6, v6, Lcom/google/android/gms/internal/ads/z50;->a:I

    move/from16 v21, v6

    move/from16 v22, v15

    move/from16 v23, v4

    move/from16 v24, v14

    move-object/from16 v25, v13

    move/from16 v26, v7

    invoke-static/range {v21 .. v26}, Lcom/google/android/gms/internal/ads/ND;->d(IZII[II)Ljava/lang/String;

    move-result-object v7

    :cond_3
    new-instance v4, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/oK0;->m(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    const-string v2, "video/hevc"

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/oK0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v4, v7}, Lcom/google/android/gms/internal/ads/oK0;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    iget v2, v1, Lcom/google/android/gms/internal/ads/f80;->d:I

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/oK0;->G(I)Lcom/google/android/gms/internal/ads/oK0;

    iget v2, v1, Lcom/google/android/gms/internal/ads/f80;->e:I

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/oK0;->k(I)Lcom/google/android/gms/internal/ads/oK0;

    new-instance v2, Lcom/google/android/gms/internal/ads/Oz0;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/Oz0;-><init>()V

    iget v6, v1, Lcom/google/android/gms/internal/ads/f80;->h:I

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/Oz0;->c(I)Lcom/google/android/gms/internal/ads/Oz0;

    iget v6, v1, Lcom/google/android/gms/internal/ads/f80;->i:I

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/Oz0;->b(I)Lcom/google/android/gms/internal/ads/Oz0;

    iget v6, v1, Lcom/google/android/gms/internal/ads/f80;->j:I

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/Oz0;->d(I)Lcom/google/android/gms/internal/ads/Oz0;

    iget v6, v1, Lcom/google/android/gms/internal/ads/f80;->b:I

    add-int/lit8 v6, v6, 0x8

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/Oz0;->f(I)Lcom/google/android/gms/internal/ads/Oz0;

    iget v6, v1, Lcom/google/android/gms/internal/ads/f80;->c:I

    add-int/lit8 v6, v6, 0x8

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/Oz0;->a(I)Lcom/google/android/gms/internal/ads/Oz0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Oz0;->g()Lcom/google/android/gms/internal/ads/PA0;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/oK0;->b(Lcom/google/android/gms/internal/ads/PA0;)Lcom/google/android/gms/internal/ads/oK0;

    iget v2, v1, Lcom/google/android/gms/internal/ads/f80;->f:F

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/oK0;->w(F)Lcom/google/android/gms/internal/ads/oK0;

    iget v1, v1, Lcom/google/android/gms/internal/ads/f80;->g:I

    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/oK0;->s(I)Lcom/google/android/gms/internal/ads/oK0;

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/oK0;->n(Ljava/util/List;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/H5;->c:Lcom/google/android/gms/internal/ads/a1;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/a1;->c(Lcom/google/android/gms/internal/ads/D;)V

    iget v2, v1, Lcom/google/android/gms/internal/ads/D;->q:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_4

    const/4 v2, 0x1

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :goto_2
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/Ag0;->l(Z)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/H5;->a:Lcom/google/android/gms/internal/ads/d6;

    iget v1, v1, Lcom/google/android/gms/internal/ads/D;->q:I

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/d6;->e(I)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/H5;->e:Z

    goto :goto_3

    :cond_5
    move/from16 v19, v3

    move-object/from16 v20, v4

    move/from16 v18, v6

    move/from16 v17, v13

    :goto_3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/H5;->j:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/R5;->d(I)Z

    move-result v1

    const/4 v2, 0x5

    if-eqz v1, :cond_6

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/H5;->j:Lcom/google/android/gms/internal/ads/R5;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/R5;->d:[B

    iget v1, v1, Lcom/google/android/gms/internal/ads/R5;->e:I

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/ads/lb0;->b([BI)I

    move-result v1

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/H5;->n:Lcom/google/android/gms/internal/ads/sR;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/H5;->j:Lcom/google/android/gms/internal/ads/R5;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/R5;->d:[B

    invoke-virtual {v3, v4, v1}, Lcom/google/android/gms/internal/ads/sR;->j([BI)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/H5;->n:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/H5;->a:Lcom/google/android/gms/internal/ads/d6;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/H5;->n:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v1, v9, v10, v3}, Lcom/google/android/gms/internal/ads/d6;->a(JLcom/google/android/gms/internal/ads/sR;)V

    :cond_6
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/H5;->k:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/R5;->d(I)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/H5;->k:Lcom/google/android/gms/internal/ads/R5;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/R5;->d:[B

    iget v1, v1, Lcom/google/android/gms/internal/ads/R5;->e:I

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/ads/lb0;->b([BI)I

    move-result v1

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/H5;->n:Lcom/google/android/gms/internal/ads/sR;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/H5;->k:Lcom/google/android/gms/internal/ads/R5;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/R5;->d:[B

    invoke-virtual {v3, v4, v1}, Lcom/google/android/gms/internal/ads/sR;->j([BI)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/H5;->n:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/H5;->a:Lcom/google/android/gms/internal/ads/d6;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/H5;->n:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v1, v9, v10, v2}, Lcom/google/android/gms/internal/ads/d6;->a(JLcom/google/android/gms/internal/ads/sR;)V

    :cond_7
    const/4 v1, 0x1

    shr-int/lit8 v1, v8, 0x1

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/H5;->m:J

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/H5;->d:Lcom/google/android/gms/internal/ads/G5;

    iget-boolean v4, v0, Lcom/google/android/gms/internal/ads/H5;->e:Z

    move/from16 v13, v17

    move v14, v1

    const/4 v5, 0x3

    move-wide v15, v2

    move/from16 v17, v4

    invoke-virtual/range {v10 .. v17}, Lcom/google/android/gms/internal/ads/G5;->e(JIIJZ)V

    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/H5;->e:Z

    if-nez v2, :cond_8

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/H5;->g:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/R5;->c(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/H5;->h:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/R5;->c(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/H5;->i:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/R5;->c(I)V

    :cond_8
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/H5;->j:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/R5;->c(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/H5;->k:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/R5;->c(I)V

    move-object/from16 v7, p1

    move v1, v5

    move/from16 v2, v18

    move/from16 v3, v19

    move-object/from16 v4, v20

    goto/16 :goto_0

    :cond_9
    move v1, v3

    move-object v3, v4

    invoke-direct {v0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/H5;->f([BII)V

    :cond_a
    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/ads/w0;Lcom/google/android/gms/internal/ads/n6;)V
    .locals 2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->c()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->b:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->a()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->c:Lcom/google/android/gms/internal/ads/a1;

    new-instance v1, Lcom/google/android/gms/internal/ads/G5;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/G5;-><init>(Lcom/google/android/gms/internal/ads/a1;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/H5;->d:Lcom/google/android/gms/internal/ads/G5;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->a:Lcom/google/android/gms/internal/ads/d6;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/d6;->b(Lcom/google/android/gms/internal/ads/w0;Lcom/google/android/gms/internal/ads/n6;)V

    return-void
.end method

.method public final d()V
    .locals 2

    .prologue
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/H5;->l:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/H5;->m:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->f:[Z

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/lb0;->h([Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->g:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/R5;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->h:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/R5;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->i:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/R5;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->j:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/R5;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->k:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/R5;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->a:Lcom/google/android/gms/internal/ads/d6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/d6;->c()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H5;->d:Lcom/google/android/gms/internal/ads/G5;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/G5;->d()V

    :cond_0
    return-void
.end method

.method public final e(JI)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/H5;->m:J

    return-void
.end method
