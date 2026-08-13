.class final Lcom/google/android/gms/internal/ads/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/c0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/E0;

.field private final b:I

.field private final c:Lcom/google/android/gms/internal/ads/z0;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/E0;ILcom/google/android/gms/internal/ads/y1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/x1;->a:Lcom/google/android/gms/internal/ads/E0;

    iput p2, p0, Lcom/google/android/gms/internal/ads/x1;->b:I

    new-instance p1, Lcom/google/android/gms/internal/ads/z0;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/z0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/x1;->c:Lcom/google/android/gms/internal/ads/z0;

    return-void
.end method

.method private final c(Lcom/google/android/gms/internal/ads/u0;)J
    .locals 13

    .prologue
    :goto_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->d()J

    move-result-wide v0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->f()J

    move-result-wide v2

    const-wide/16 v4, -0x6

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x1;->a:Lcom/google/android/gms/internal/ads/E0;

    iget v1, p0, Lcom/google/android/gms/internal/ads/x1;->b:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/x1;->c:Lcom/google/android/gms/internal/ads/z0;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->d()J

    move-result-wide v6

    const/4 v3, 0x2

    new-array v8, v3, [B

    const/4 v9, 0x0

    invoke-interface {p1, v8, v9, v3}, Lcom/google/android/gms/internal/ads/u0;->N([BII)V

    aget-byte v10, v8, v9

    and-int/lit16 v10, v10, 0xff

    const/4 v11, 0x1

    aget-byte v12, v8, v11

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v10, v10, 0x8

    or-int/2addr v10, v12

    if-eq v10, v1, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v0

    sub-long/2addr v6, v0

    long-to-int v0, v6

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/u0;->D(I)V

    goto :goto_1

    :cond_0
    new-instance v10, Lcom/google/android/gms/internal/ads/sR;

    const/16 v12, 0x10

    invoke-direct {v10, v12}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v12

    invoke-static {v8, v9, v12, v9, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v8

    const/16 v9, 0xe

    invoke-static {p1, v8, v3, v9}, Lcom/google/android/gms/internal/ads/x0;->a(Lcom/google/android/gms/internal/ads/u0;[BII)I

    move-result v3

    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/ads/sR;->k(I)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v8

    sub-long/2addr v6, v8

    long-to-int v3, v6

    invoke-interface {p1, v3}, Lcom/google/android/gms/internal/ads/u0;->D(I)V

    invoke-static {v10, v0, v1, v2}, Lcom/google/android/gms/internal/ads/A0;->c(Lcom/google/android/gms/internal/ads/sR;Lcom/google/android/gms/internal/ads/E0;ILcom/google/android/gms/internal/ads/z0;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    invoke-interface {p1, v11}, Lcom/google/android/gms/internal/ads/u0;->D(I)V

    goto :goto_0

    :cond_2
    :goto_2
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->d()J

    move-result-wide v0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->f()J

    move-result-wide v2

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_3

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->f()J

    move-result-wide v0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->d()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/u0;->D(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/x1;->a:Lcom/google/android/gms/internal/ads/E0;

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/E0;->j:J

    return-wide v0

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/x1;->c:Lcom/google/android/gms/internal/ads/z0;

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/z0;->a:J

    return-wide v0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/u0;J)Lcom/google/android/gms/internal/ads/b0;
    .locals 11

    .prologue
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/x1;->c(Lcom/google/android/gms/internal/ads/u0;)J

    move-result-wide v2

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->d()J

    move-result-wide v4

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/x1;->a:Lcom/google/android/gms/internal/ads/E0;

    iget v6, v6, Lcom/google/android/gms/internal/ads/E0;->c:I

    const/4 v7, 0x6

    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-interface {p1, v6}, Lcom/google/android/gms/internal/ads/u0;->D(I)V

    cmp-long v6, v2, p2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/x1;->c(Lcom/google/android/gms/internal/ads/u0;)J

    move-result-wide v7

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->d()J

    move-result-wide v9

    if-gtz v6, :cond_1

    cmp-long p1, v7, p2

    if-gtz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/b0;->e(J)Lcom/google/android/gms/internal/ads/b0;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    cmp-long p1, v7, p2

    if-gtz p1, :cond_2

    invoke-static {v7, v8, v9, v10}, Lcom/google/android/gms/internal/ads/b0;->f(JJ)Lcom/google/android/gms/internal/ads/b0;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {v2, v3, v0, v1}, Lcom/google/android/gms/internal/ads/b0;->d(JJ)Lcom/google/android/gms/internal/ads/b0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b()V
    .locals 0

    return-void
.end method
