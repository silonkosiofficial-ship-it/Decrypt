.class final Lcom/google/android/gms/internal/ads/g6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/bV;

.field private final b:Lcom/google/android/gms/internal/ads/sR;

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:J

.field private g:J

.field private h:J


# direct methods
.method constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/google/android/gms/internal/ads/bV;

    const-wide/16 v0, 0x0

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/bV;-><init>(J)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/g6;->a:Lcom/google/android/gms/internal/ads/bV;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/g6;->f:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/g6;->g:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/g6;->h:J

    new-instance p1, Lcom/google/android/gms/internal/ads/sR;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/sR;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/g6;->b:Lcom/google/android/gms/internal/ads/sR;

    return-void
.end method

.method private final e(Lcom/google/android/gms/internal/ads/u0;)I
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/EW;->f:[B

    array-length v1, v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/g6;->b:Lcom/google/android/gms/internal/ads/sR;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/sR;->j([BI)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/g6;->c:Z

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    return v2
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/Q0;I)I
    .locals 11

    .prologue
    const/4 v0, 0x0

    if-gtz p3, :cond_0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/g6;->e(Lcom/google/android/gms/internal/ads/u0;)I

    return v0

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/g6;->e:Z

    const/16 v2, 0x47

    const-wide/32 v3, 0x1b8a0

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v7, 0x1

    if-nez v1, :cond_7

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->f()J

    move-result-wide v8

    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v1, v3

    int-to-long v3, v1

    sub-long/2addr v8, v3

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v3

    cmp-long v3, v3, v8

    if-eqz v3, :cond_1

    :goto_0
    iput-wide v8, p2, Lcom/google/android/gms/internal/ads/Q0;->a:J

    move v0, v7

    goto/16 :goto_8

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/g6;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ads/sR;->i(I)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/g6;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object p2

    invoke-interface {p1, p2, v0, v1}, Lcom/google/android/gms/internal/ads/u0;->N([BII)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/g6;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->t()I

    move-result p2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->u()I

    move-result v1

    add-int/lit16 v3, v1, -0xbc

    :goto_1
    if-lt v3, p2, :cond_6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v4

    const/4 v8, -0x4

    move v9, v0

    :goto_2
    const/4 v10, 0x4

    if-gt v8, v10, :cond_5

    mul-int/lit16 v10, v8, 0xbc

    add-int/2addr v10, v3

    if-lt v10, p2, :cond_2

    if-ge v10, v1, :cond_2

    aget-byte v10, v4, v10

    if-eq v10, v2, :cond_3

    :cond_2
    move v9, v0

    goto :goto_3

    :cond_3
    add-int/2addr v9, v7

    const/4 v10, 0x5

    if-ne v9, v10, :cond_4

    invoke-static {p1, v3, p3}, Lcom/google/android/gms/internal/ads/p6;->b(Lcom/google/android/gms/internal/ads/sR;II)J

    move-result-wide v8

    cmp-long v4, v8, v5

    if-eqz v4, :cond_5

    move-wide v5, v8

    goto :goto_4

    :cond_4
    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_5
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_6
    :goto_4
    iput-wide v5, p0, Lcom/google/android/gms/internal/ads/g6;->g:J

    iput-boolean v7, p0, Lcom/google/android/gms/internal/ads/g6;->e:Z

    goto :goto_8

    :cond_7
    iget-wide v8, p0, Lcom/google/android/gms/internal/ads/g6;->g:J

    cmp-long v1, v8, v5

    if-nez v1, :cond_8

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/g6;->e(Lcom/google/android/gms/internal/ads/u0;)I

    return v0

    :cond_8
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/g6;->d:Z

    if-nez v1, :cond_d

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->f()J

    move-result-wide v8

    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v1, v3

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v3

    const-wide/16 v8, 0x0

    cmp-long v3, v3, v8

    if-eqz v3, :cond_9

    goto :goto_0

    :cond_9
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/g6;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ads/sR;->i(I)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/g6;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object p2

    invoke-interface {p1, p2, v0, v1}, Lcom/google/android/gms/internal/ads/u0;->N([BII)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/g6;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->t()I

    move-result p2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->u()I

    move-result v1

    :goto_5
    if-ge p2, v1, :cond_c

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v3

    aget-byte v3, v3, p2

    if-eq v3, v2, :cond_a

    goto :goto_6

    :cond_a
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/p6;->b(Lcom/google/android/gms/internal/ads/sR;II)J

    move-result-wide v3

    cmp-long v8, v3, v5

    if-eqz v8, :cond_b

    move-wide v5, v3

    goto :goto_7

    :cond_b
    :goto_6
    add-int/lit8 p2, p2, 0x1

    goto :goto_5

    :cond_c
    :goto_7
    iput-wide v5, p0, Lcom/google/android/gms/internal/ads/g6;->f:J

    iput-boolean v7, p0, Lcom/google/android/gms/internal/ads/g6;->d:Z

    :goto_8
    return v0

    :cond_d
    iget-wide p2, p0, Lcom/google/android/gms/internal/ads/g6;->f:J

    cmp-long v1, p2, v5

    if-nez v1, :cond_e

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/g6;->e(Lcom/google/android/gms/internal/ads/u0;)I

    return v0

    :cond_e
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/g6;->a:Lcom/google/android/gms/internal/ads/bV;

    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/ads/bV;->b(J)J

    move-result-wide p2

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/g6;->g:J

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/bV;->c(J)J

    move-result-wide v1

    sub-long/2addr v1, p2

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/g6;->h:J

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/g6;->e(Lcom/google/android/gms/internal/ads/u0;)I

    return v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/g6;->h:J

    return-wide v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/bV;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/g6;->a:Lcom/google/android/gms/internal/ads/bV;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/g6;->c:Z

    return v0
.end method
