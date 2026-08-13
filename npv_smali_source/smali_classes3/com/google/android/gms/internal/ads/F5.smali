.class public final Lcom/google/android/gms/internal/ads/F5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/y5;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/d6;

.field private final b:Lcom/google/android/gms/internal/ads/R5;

.field private final c:Lcom/google/android/gms/internal/ads/R5;

.field private final d:Lcom/google/android/gms/internal/ads/R5;

.field private e:J

.field private final f:[Z

.field private g:Ljava/lang/String;

.field private h:Lcom/google/android/gms/internal/ads/a1;

.field private i:Lcom/google/android/gms/internal/ads/E5;

.field private j:Z

.field private k:J

.field private l:Z

.field private final m:Lcom/google/android/gms/internal/ads/sR;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/d6;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/F5;->a:Lcom/google/android/gms/internal/ads/d6;

    const/4 p1, 0x3

    new-array p1, p1, [Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/F5;->f:[Z

    new-instance p1, Lcom/google/android/gms/internal/ads/R5;

    const/4 p2, 0x7

    const/16 p3, 0x80

    invoke-direct {p1, p2, p3}, Lcom/google/android/gms/internal/ads/R5;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/F5;->b:Lcom/google/android/gms/internal/ads/R5;

    new-instance p1, Lcom/google/android/gms/internal/ads/R5;

    const/16 p2, 0x8

    invoke-direct {p1, p2, p3}, Lcom/google/android/gms/internal/ads/R5;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/F5;->c:Lcom/google/android/gms/internal/ads/R5;

    new-instance p1, Lcom/google/android/gms/internal/ads/R5;

    const/4 p2, 0x6

    invoke-direct {p1, p2, p3}, Lcom/google/android/gms/internal/ads/R5;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/F5;->d:Lcom/google/android/gms/internal/ads/R5;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/F5;->k:J

    new-instance p1, Lcom/google/android/gms/internal/ads/sR;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/sR;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/F5;->m:Lcom/google/android/gms/internal/ads/sR;

    return-void
.end method

.method private final f([BII)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/F5;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/F5;->b:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/R5;->a([BII)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/F5;->c:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/R5;->a([BII)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/F5;->d:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/R5;->a([BII)V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/F5;->h:Lcom/google/android/gms/internal/ads/a1;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/F5;->a:Lcom/google/android/gms/internal/ads/d6;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/d6;->c()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/F5;->i:Lcom/google/android/gms/internal/ads/E5;

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/F5;->e:J

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/E5;->a(J)V

    :cond_0
    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/sR;)V
    .locals 18

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/F5;->h:Lcom/google/android/gms/internal/ads/a1;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    sget v1, Lcom/google/android/gms/internal/ads/EW;->a:I

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->t()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->u()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v3

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/F5;->e:J

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v4, v6

    iput-wide v4, v0, Lcom/google/android/gms/internal/ads/F5;->e:J

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/F5;->h:Lcom/google/android/gms/internal/ads/a1;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v5

    move-object/from16 v6, p1

    invoke-interface {v4, v6, v5}, Lcom/google/android/gms/internal/ads/a1;->a(Lcom/google/android/gms/internal/ads/sR;I)V

    :goto_0
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/F5;->f:[Z

    invoke-static {v3, v1, v2, v4}, Lcom/google/android/gms/internal/ads/lb0;->a([BII[Z)I

    move-result v4

    if-eq v4, v2, :cond_a

    add-int/lit8 v5, v4, 0x3

    aget-byte v6, v3, v5

    and-int/lit8 v10, v6, 0x1f

    sub-int v6, v4, v1

    if-lez v6, :cond_0

    invoke-direct {v0, v3, v1, v4}, Lcom/google/android/gms/internal/ads/F5;->f([BII)V

    :cond_0
    sub-int v1, v2, v4

    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/F5;->e:J

    int-to-long v11, v1

    sub-long v8, v7, v11

    if-gez v6, :cond_1

    neg-int v6, v6

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/F5;->k:J

    iget-boolean v7, v0, Lcom/google/android/gms/internal/ads/F5;->j:Z

    const/4 v13, 0x4

    if-eqz v7, :cond_3

    :cond_2
    move/from16 v17, v2

    move/from16 v16, v5

    goto/16 :goto_4

    :cond_3
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/F5;->b:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/R5;->d(I)Z

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/F5;->c:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/R5;->d(I)Z

    iget-boolean v7, v0, Lcom/google/android/gms/internal/ads/F5;->j:Z

    if-nez v7, :cond_4

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/F5;->b:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/R5;->e()Z

    move-result v7

    if-eqz v7, :cond_2

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/F5;->c:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/R5;->e()Z

    move-result v7

    if-eqz v7, :cond_2

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/F5;->b:Lcom/google/android/gms/internal/ads/R5;

    iget-object v15, v14, Lcom/google/android/gms/internal/ads/R5;->d:[B

    iget v14, v14, Lcom/google/android/gms/internal/ads/R5;->e:I

    invoke-static {v15, v14}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v14

    invoke-interface {v7, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/F5;->c:Lcom/google/android/gms/internal/ads/R5;

    iget-object v15, v14, Lcom/google/android/gms/internal/ads/R5;->d:[B

    iget v14, v14, Lcom/google/android/gms/internal/ads/R5;->e:I

    invoke-static {v15, v14}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v14

    invoke-interface {v7, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/F5;->b:Lcom/google/android/gms/internal/ads/R5;

    iget-object v15, v14, Lcom/google/android/gms/internal/ads/R5;->d:[B

    iget v14, v14, Lcom/google/android/gms/internal/ads/R5;->e:I

    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/ads/lb0;->f([BII)Lcom/google/android/gms/internal/ads/Ka0;

    move-result-object v14

    iget-object v15, v0, Lcom/google/android/gms/internal/ads/F5;->c:Lcom/google/android/gms/internal/ads/R5;

    iget-object v4, v15, Lcom/google/android/gms/internal/ads/R5;->d:[B

    iget v15, v15, Lcom/google/android/gms/internal/ads/R5;->e:I

    invoke-static {v4, v13, v15}, Lcom/google/android/gms/internal/ads/lb0;->e([BII)Lcom/google/android/gms/internal/ads/ja0;

    move-result-object v4

    iget v15, v14, Lcom/google/android/gms/internal/ads/Ka0;->a:I

    iget v13, v14, Lcom/google/android/gms/internal/ads/Ka0;->b:I

    move/from16 v16, v5

    iget v5, v14, Lcom/google/android/gms/internal/ads/Ka0;->c:I

    invoke-static {v15, v13, v5}, Lcom/google/android/gms/internal/ads/ND;->c(III)Ljava/lang/String;

    move-result-object v5

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/F5;->h:Lcom/google/android/gms/internal/ads/a1;

    new-instance v15, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {v15}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    move/from16 v17, v2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/F5;->g:Ljava/lang/String;

    invoke-virtual {v15, v2}, Lcom/google/android/gms/internal/ads/oK0;->m(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    const-string v2, "video/avc"

    invoke-virtual {v15, v2}, Lcom/google/android/gms/internal/ads/oK0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v15, v5}, Lcom/google/android/gms/internal/ads/oK0;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    iget v2, v14, Lcom/google/android/gms/internal/ads/Ka0;->e:I

    invoke-virtual {v15, v2}, Lcom/google/android/gms/internal/ads/oK0;->G(I)Lcom/google/android/gms/internal/ads/oK0;

    iget v2, v14, Lcom/google/android/gms/internal/ads/Ka0;->f:I

    invoke-virtual {v15, v2}, Lcom/google/android/gms/internal/ads/oK0;->k(I)Lcom/google/android/gms/internal/ads/oK0;

    new-instance v2, Lcom/google/android/gms/internal/ads/Oz0;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/Oz0;-><init>()V

    iget v5, v14, Lcom/google/android/gms/internal/ads/Ka0;->j:I

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/Oz0;->c(I)Lcom/google/android/gms/internal/ads/Oz0;

    iget v5, v14, Lcom/google/android/gms/internal/ads/Ka0;->k:I

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/Oz0;->b(I)Lcom/google/android/gms/internal/ads/Oz0;

    iget v5, v14, Lcom/google/android/gms/internal/ads/Ka0;->l:I

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/Oz0;->d(I)Lcom/google/android/gms/internal/ads/Oz0;

    iget v5, v14, Lcom/google/android/gms/internal/ads/Ka0;->h:I

    add-int/lit8 v5, v5, 0x8

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/Oz0;->f(I)Lcom/google/android/gms/internal/ads/Oz0;

    iget v5, v14, Lcom/google/android/gms/internal/ads/Ka0;->i:I

    add-int/lit8 v5, v5, 0x8

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/Oz0;->a(I)Lcom/google/android/gms/internal/ads/Oz0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Oz0;->g()Lcom/google/android/gms/internal/ads/PA0;

    move-result-object v2

    invoke-virtual {v15, v2}, Lcom/google/android/gms/internal/ads/oK0;->b(Lcom/google/android/gms/internal/ads/PA0;)Lcom/google/android/gms/internal/ads/oK0;

    iget v2, v14, Lcom/google/android/gms/internal/ads/Ka0;->g:F

    invoke-virtual {v15, v2}, Lcom/google/android/gms/internal/ads/oK0;->w(F)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v15, v7}, Lcom/google/android/gms/internal/ads/oK0;->n(Ljava/util/List;)Lcom/google/android/gms/internal/ads/oK0;

    iget v2, v14, Lcom/google/android/gms/internal/ads/Ka0;->m:I

    invoke-virtual {v15, v2}, Lcom/google/android/gms/internal/ads/oK0;->s(I)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v2

    invoke-interface {v13, v2}, Lcom/google/android/gms/internal/ads/a1;->c(Lcom/google/android/gms/internal/ads/D;)V

    const/4 v2, 0x1

    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/F5;->j:Z

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/F5;->i:Lcom/google/android/gms/internal/ads/E5;

    invoke-virtual {v2, v14}, Lcom/google/android/gms/internal/ads/E5;->c(Lcom/google/android/gms/internal/ads/Ka0;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/F5;->i:Lcom/google/android/gms/internal/ads/E5;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/E5;->b(Lcom/google/android/gms/internal/ads/ja0;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/F5;->b:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/R5;->b()V

    :goto_2
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/F5;->c:Lcom/google/android/gms/internal/ads/R5;

    :goto_3
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/R5;->b()V

    goto :goto_4

    :cond_4
    move/from16 v17, v2

    move/from16 v16, v5

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/F5;->b:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/R5;->e()Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/R5;->d:[B

    iget v2, v2, Lcom/google/android/gms/internal/ads/R5;->e:I

    const/4 v5, 0x4

    invoke-static {v4, v5, v2}, Lcom/google/android/gms/internal/ads/lb0;->f([BII)Lcom/google/android/gms/internal/ads/Ka0;

    move-result-object v2

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/F5;->a:Lcom/google/android/gms/internal/ads/d6;

    iget v5, v2, Lcom/google/android/gms/internal/ads/Ka0;->m:I

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/d6;->e(I)V

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/F5;->i:Lcom/google/android/gms/internal/ads/E5;

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/E5;->c(Lcom/google/android/gms/internal/ads/Ka0;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/F5;->b:Lcom/google/android/gms/internal/ads/R5;

    goto :goto_3

    :cond_5
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/F5;->c:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/R5;->e()Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/R5;->d:[B

    iget v2, v2, Lcom/google/android/gms/internal/ads/R5;->e:I

    const/4 v5, 0x4

    invoke-static {v4, v5, v2}, Lcom/google/android/gms/internal/ads/lb0;->e([BII)Lcom/google/android/gms/internal/ads/ja0;

    move-result-object v2

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/F5;->i:Lcom/google/android/gms/internal/ads/E5;

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/E5;->b(Lcom/google/android/gms/internal/ads/ja0;)V

    goto :goto_2

    :cond_6
    :goto_4
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/F5;->d:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/R5;->d(I)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/F5;->d:Lcom/google/android/gms/internal/ads/R5;

    iget-object v4, v2, Lcom/google/android/gms/internal/ads/R5;->d:[B

    iget v2, v2, Lcom/google/android/gms/internal/ads/R5;->e:I

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/ads/lb0;->b([BI)I

    move-result v2

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/F5;->m:Lcom/google/android/gms/internal/ads/sR;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/F5;->d:Lcom/google/android/gms/internal/ads/R5;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/R5;->d:[B

    invoke-virtual {v4, v5, v2}, Lcom/google/android/gms/internal/ads/sR;->j([BI)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/F5;->m:Lcom/google/android/gms/internal/ads/sR;

    const/4 v4, 0x4

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/F5;->a:Lcom/google/android/gms/internal/ads/d6;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/F5;->m:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2, v11, v12, v4}, Lcom/google/android/gms/internal/ads/d6;->a(JLcom/google/android/gms/internal/ads/sR;)V

    :cond_7
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/F5;->i:Lcom/google/android/gms/internal/ads/E5;

    iget-boolean v4, v0, Lcom/google/android/gms/internal/ads/F5;->j:Z

    invoke-virtual {v2, v8, v9, v1, v4}, Lcom/google/android/gms/internal/ads/E5;->f(JIZ)Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/F5;->l:Z

    :cond_8
    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/F5;->k:J

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/F5;->j:Z

    if-nez v1, :cond_9

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/F5;->b:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/ads/R5;->c(I)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/F5;->c:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/ads/R5;->c(I)V

    :cond_9
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/F5;->d:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/ads/R5;->c(I)V

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/F5;->i:Lcom/google/android/gms/internal/ads/E5;

    iget-boolean v13, v0, Lcom/google/android/gms/internal/ads/F5;->l:Z

    invoke-virtual/range {v7 .. v13}, Lcom/google/android/gms/internal/ads/E5;->e(JIJZ)V

    move/from16 v1, v16

    move/from16 v2, v17

    goto/16 :goto_0

    :cond_a
    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/F5;->f([BII)V

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/ads/w0;Lcom/google/android/gms/internal/ads/n6;)V
    .locals 3

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->c()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/F5;->g:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/n6;->a()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/F5;->h:Lcom/google/android/gms/internal/ads/a1;

    new-instance v1, Lcom/google/android/gms/internal/ads/E5;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2, v2}, Lcom/google/android/gms/internal/ads/E5;-><init>(Lcom/google/android/gms/internal/ads/a1;ZZ)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/F5;->i:Lcom/google/android/gms/internal/ads/E5;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/F5;->a:Lcom/google/android/gms/internal/ads/d6;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/d6;->b(Lcom/google/android/gms/internal/ads/w0;Lcom/google/android/gms/internal/ads/n6;)V

    return-void
.end method

.method public final d()V
    .locals 2

    .prologue
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/F5;->e:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/F5;->l:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/F5;->k:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/F5;->f:[Z

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/lb0;->h([Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/F5;->b:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/R5;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/F5;->c:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/R5;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/F5;->d:Lcom/google/android/gms/internal/ads/R5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/R5;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/F5;->a:Lcom/google/android/gms/internal/ads/d6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/d6;->c()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/F5;->i:Lcom/google/android/gms/internal/ads/E5;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/E5;->d()V

    :cond_0
    return-void
.end method

.method public final e(JI)V
    .locals 0

    .prologue
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/F5;->k:J

    and-int/lit8 p1, p3, 0x2

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/F5;->l:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    or-int/2addr p1, p2

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/F5;->l:Z

    return-void
.end method
