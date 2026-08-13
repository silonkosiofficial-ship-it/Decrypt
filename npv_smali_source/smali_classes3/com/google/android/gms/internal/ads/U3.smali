.class final Lcom/google/android/gms/internal/ads/U3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/a4;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Z3;

.field private final b:J

.field private final c:J

.field private final d:Lcom/google/android/gms/internal/ads/f4;

.field private e:I

.field private f:J

.field private g:J

.field private h:J

.field private i:J

.field private j:J

.field private k:J

.field private l:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/f4;JJJJZ)V
    .locals 2

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    cmp-long v0, p4, p2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->d(Z)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/U3;->d:Lcom/google/android/gms/internal/ads/f4;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/U3;->b:J

    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/U3;->c:J

    sub-long/2addr p4, p2

    cmp-long p1, p6, p4

    if-eqz p1, :cond_2

    if-eqz p10, :cond_1

    goto :goto_1

    :cond_1
    iput v1, p0, Lcom/google/android/gms/internal/ads/U3;->e:I

    goto :goto_2

    :cond_2
    :goto_1
    iput-wide p8, p0, Lcom/google/android/gms/internal/ads/U3;->f:J

    const/4 p1, 0x4

    iput p1, p0, Lcom/google/android/gms/internal/ads/U3;->e:I

    :goto_2
    new-instance p1, Lcom/google/android/gms/internal/ads/Z3;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/Z3;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/U3;->a:Lcom/google/android/gms/internal/ads/Z3;

    return-void
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/U3;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/U3;->c:J

    return-wide v0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/U3;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/U3;->b:J

    return-wide v0
.end method

.method static bridge synthetic f(Lcom/google/android/gms/internal/ads/U3;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/U3;->f:J

    return-wide v0
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/ads/U3;)Lcom/google/android/gms/internal/ads/f4;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/U3;->d:Lcom/google/android/gms/internal/ads/f4;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/u0;)J
    .locals 22

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lcom/google/android/gms/internal/ads/U3;->e:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x4

    const-wide/16 v6, -0x1

    if-eqz v2, :cond_b

    if-eq v2, v4, :cond_c

    const/4 v4, 0x2

    const/4 v10, 0x3

    if-eq v2, v4, :cond_0

    if-eq v2, v10, :cond_9

    return-wide v6

    :cond_0
    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/U3;->i:J

    iget-wide v13, v0, Lcom/google/android/gms/internal/ads/U3;->j:J

    cmp-long v2, v11, v13

    if-nez v2, :cond_1

    :goto_0
    move-wide v13, v6

    goto/16 :goto_3

    :cond_1
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v11

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/U3;->a:Lcom/google/android/gms/internal/ads/Z3;

    invoke-virtual {v2, v1, v13, v14}, Lcom/google/android/gms/internal/ads/Z3;->c(Lcom/google/android/gms/internal/ads/u0;J)Z

    move-result v2

    if-nez v2, :cond_3

    iget-wide v13, v0, Lcom/google/android/gms/internal/ads/U3;->i:J

    cmp-long v2, v13, v11

    if-eqz v2, :cond_2

    goto/16 :goto_3

    :cond_2
    new-instance v1, Ljava/io/IOException;

    const-string v2, "No ogg page can be found."

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/U3;->a:Lcom/google/android/gms/internal/ads/Z3;

    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/internal/ads/Z3;->b(Lcom/google/android/gms/internal/ads/u0;Z)Z

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    iget-wide v13, v0, Lcom/google/android/gms/internal/ads/U3;->h:J

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/U3;->a:Lcom/google/android/gms/internal/ads/Z3;

    iget-wide v8, v2, Lcom/google/android/gms/internal/ads/Z3;->b:J

    sub-long/2addr v13, v8

    iget v4, v2, Lcom/google/android/gms/internal/ads/Z3;->d:I

    iget v2, v2, Lcom/google/android/gms/internal/ads/Z3;->e:I

    add-int/2addr v4, v2

    const-wide/16 v15, 0x0

    cmp-long v2, v13, v15

    if-ltz v2, :cond_4

    const-wide/32 v15, 0x11940

    cmp-long v15, v13, v15

    if-gez v15, :cond_4

    goto :goto_0

    :cond_4
    if-gez v2, :cond_5

    iput-wide v11, v0, Lcom/google/android/gms/internal/ads/U3;->j:J

    iput-wide v8, v0, Lcom/google/android/gms/internal/ads/U3;->l:J

    goto :goto_1

    :cond_5
    int-to-long v11, v4

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v15

    add-long/2addr v11, v15

    iput-wide v11, v0, Lcom/google/android/gms/internal/ads/U3;->i:J

    iput-wide v8, v0, Lcom/google/android/gms/internal/ads/U3;->k:J

    :goto_1
    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/U3;->j:J

    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/U3;->i:J

    sub-long v15, v8, v11

    const-wide/32 v17, 0x186a0

    cmp-long v17, v15, v17

    if-gez v17, :cond_6

    iput-wide v11, v0, Lcom/google/android/gms/internal/ads/U3;->j:J

    move-wide v13, v11

    goto :goto_3

    :cond_6
    int-to-long v3, v4

    if-gtz v2, :cond_7

    const-wide/16 v18, 0x2

    goto :goto_2

    :cond_7
    const-wide/16 v18, 0x1

    :goto_2
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v20

    mul-long v3, v3, v18

    sub-long v20, v20, v3

    mul-long/2addr v13, v15

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/U3;->l:J

    move-wide v15, v11

    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/U3;->k:J

    sub-long/2addr v2, v10

    div-long/2addr v13, v2

    add-long v2, v20, v13

    add-long/2addr v8, v6

    invoke-static {v2, v3, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    move-wide v8, v15

    invoke-static {v8, v9, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v13

    :goto_3
    cmp-long v2, v13, v6

    if-eqz v2, :cond_8

    return-wide v13

    :cond_8
    const/4 v2, 0x3

    iput v2, v0, Lcom/google/android/gms/internal/ads/U3;->e:I

    :cond_9
    :goto_4
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/U3;->a:Lcom/google/android/gms/internal/ads/Z3;

    invoke-virtual {v2, v1, v6, v7}, Lcom/google/android/gms/internal/ads/Z3;->c(Lcom/google/android/gms/internal/ads/u0;J)Z

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/U3;->a:Lcom/google/android/gms/internal/ads/Z3;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/internal/ads/Z3;->b(Lcom/google/android/gms/internal/ads/u0;Z)Z

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/U3;->a:Lcom/google/android/gms/internal/ads/Z3;

    iget-wide v3, v2, Lcom/google/android/gms/internal/ads/Z3;->b:J

    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/U3;->h:J

    cmp-long v3, v3, v8

    if-lez v3, :cond_a

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    iput v5, v0, Lcom/google/android/gms/internal/ads/U3;->e:I

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/U3;->k:J

    const-wide/16 v8, 0x2

    add-long/2addr v1, v8

    neg-long v1, v1

    return-wide v1

    :cond_a
    const-wide/16 v8, 0x2

    iget v3, v2, Lcom/google/android/gms/internal/ads/Z3;->d:I

    iget v2, v2, Lcom/google/android/gms/internal/ads/Z3;->e:I

    add-int/2addr v3, v2

    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/U3;->i:J

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/U3;->a:Lcom/google/android/gms/internal/ads/Z3;

    iget-wide v2, v2, Lcom/google/android/gms/internal/ads/Z3;->b:J

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/U3;->k:J

    goto :goto_4

    :cond_b
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/U3;->g:J

    iput v4, v0, Lcom/google/android/gms/internal/ads/U3;->e:I

    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/U3;->c:J

    const-wide/32 v10, -0xff1b

    add-long/2addr v8, v10

    cmp-long v2, v8, v2

    if-lez v2, :cond_c

    return-wide v8

    :cond_c
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/U3;->a:Lcom/google/android/gms/internal/ads/Z3;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Z3;->a()V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/U3;->a:Lcom/google/android/gms/internal/ads/Z3;

    invoke-virtual {v2, v1, v6, v7}, Lcom/google/android/gms/internal/ads/Z3;->c(Lcom/google/android/gms/internal/ads/u0;J)Z

    move-result v2

    if-eqz v2, :cond_f

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/U3;->a:Lcom/google/android/gms/internal/ads/Z3;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/internal/ads/Z3;->b(Lcom/google/android/gms/internal/ads/u0;Z)Z

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/U3;->a:Lcom/google/android/gms/internal/ads/Z3;

    iget v3, v2, Lcom/google/android/gms/internal/ads/Z3;->d:I

    iget v2, v2, Lcom/google/android/gms/internal/ads/Z3;->e:I

    add-int/2addr v3, v2

    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    :cond_d
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/U3;->a:Lcom/google/android/gms/internal/ads/Z3;

    iget-wide v2, v2, Lcom/google/android/gms/internal/ads/Z3;->b:J

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/U3;->a:Lcom/google/android/gms/internal/ads/Z3;

    iget v9, v8, Lcom/google/android/gms/internal/ads/Z3;->a:I

    and-int/2addr v9, v5

    if-eq v9, v5, :cond_e

    invoke-virtual {v8, v1, v6, v7}, Lcom/google/android/gms/internal/ads/Z3;->c(Lcom/google/android/gms/internal/ads/u0;J)Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v8

    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/U3;->c:J

    cmp-long v8, v8, v10

    if-gez v8, :cond_e

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/U3;->a:Lcom/google/android/gms/internal/ads/Z3;

    invoke-virtual {v8, v1, v4}, Lcom/google/android/gms/internal/ads/Z3;->b(Lcom/google/android/gms/internal/ads/u0;Z)Z

    move-result v8

    if-eqz v8, :cond_e

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/U3;->a:Lcom/google/android/gms/internal/ads/Z3;

    iget v9, v8, Lcom/google/android/gms/internal/ads/Z3;->d:I

    iget v8, v8, Lcom/google/android/gms/internal/ads/Z3;->e:I

    add-int/2addr v9, v8

    invoke-static {v1, v9}, Lcom/google/android/gms/internal/ads/x0;->e(Lcom/google/android/gms/internal/ads/u0;I)Z

    move-result v8

    if-nez v8, :cond_d

    :cond_e
    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/U3;->f:J

    iput v5, v0, Lcom/google/android/gms/internal/ads/U3;->e:I

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/U3;->g:J

    return-wide v1

    :cond_f
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1
.end method

.method public final b(J)V
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/U3;->f:J

    const-wide/16 v2, -0x1

    add-long/2addr v0, v2

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/U3;->h:J

    const/4 p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/ads/U3;->e:I

    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/U3;->b:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/U3;->i:J

    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/U3;->c:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/U3;->j:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/U3;->k:J

    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/U3;->f:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/U3;->l:J

    return-void
.end method

.method public final bridge synthetic d()Lcom/google/android/gms/internal/ads/T0;
    .locals 4

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/U3;->f:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/S3;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/S3;-><init>(Lcom/google/android/gms/internal/ads/U3;Lcom/google/android/gms/internal/ads/T3;)V

    return-object v0

    :cond_0
    return-object v1
.end method
