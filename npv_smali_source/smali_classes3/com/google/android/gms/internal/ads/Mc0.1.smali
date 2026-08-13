.class final Lcom/google/android/gms/internal/ads/Mc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/sR;

.field private D:J

.field private E:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/Mc0;->D:J

    new-instance v0, Lcom/google/android/gms/internal/ads/sR;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/sR;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Mc0;->C:Lcom/google/android/gms/internal/ads/sR;

    return-void
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/Mc0;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/Mc0;->D:J

    return-wide v0
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/ads/Mc0;)Lcom/google/android/gms/internal/ads/sR;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Mc0;->C:Lcom/google/android/gms/internal/ads/sR;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 4

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/Mc0;

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/Mc0;->D:J

    iget-wide v2, p1, Lcom/google/android/gms/internal/ads/Mc0;->D:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/Mc0;->E:J

    iget-wide v2, p1, Lcom/google/android/gms/internal/ads/Mc0;->E:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1
.end method

.method public final i(JJLcom/google/android/gms/internal/ads/sR;)V
    .locals 2

    .prologue
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p1, v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/Mc0;->D:J

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/Mc0;->E:J

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Mc0;->C:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p5}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/sR;->i(I)V

    invoke-virtual {p5}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object p1

    invoke-virtual {p5}, Lcom/google/android/gms/internal/ads/sR;->t()I

    move-result p2

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/Mc0;->C:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object p3

    invoke-virtual {p5}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result p4

    invoke-static {p1, p2, p3, v1, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method
