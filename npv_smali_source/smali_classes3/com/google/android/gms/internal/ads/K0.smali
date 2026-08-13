.class public final Lcom/google/android/gms/internal/ads/K0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/sR;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/sR;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/K0;->a:Lcom/google/android/gms/internal/ads/sR;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/o2;)Lcom/google/android/gms/internal/ads/Cb;
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/K0;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v3

    const/16 v4, 0xa

    invoke-interface {p1, v3, v1, v4}, Lcom/google/android/gms/internal/ads/u0;->N([BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/K0;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/K0;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->E()I

    move-result v3

    const v5, 0x494433

    if-eq v3, v5, :cond_0

    goto :goto_2

    :cond_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/K0;->a:Lcom/google/android/gms/internal/ads/sR;

    const/4 v5, 0x3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/K0;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->B()I

    move-result v3

    add-int/lit8 v5, v3, 0xa

    if-nez v0, :cond_1

    new-array v0, v5, [B

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/K0;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v6

    invoke-static {v6, v1, v0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-interface {p1, v0, v4, v3}, Lcom/google/android/gms/internal/ads/u0;->N([BII)V

    new-instance v3, Lcom/google/android/gms/internal/ads/R1;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/R1;-><init>()V

    invoke-static {v0, v5, p2, v3}, Lcom/google/android/gms/internal/ads/q2;->a([BILcom/google/android/gms/internal/ads/o2;Lcom/google/android/gms/internal/ads/R1;)Lcom/google/android/gms/internal/ads/Cb;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-interface {p1, v3}, Lcom/google/android/gms/internal/ads/u0;->D(I)V

    :goto_1
    add-int/2addr v2, v5

    goto :goto_0

    :catch_0
    :goto_2
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/ads/u0;->D(I)V

    return-object v0
.end method
