.class public final Lcom/google/android/gms/internal/ads/L0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/T0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/FM;

.field private final b:Lcom/google/android/gms/internal/ads/FM;

.field private c:J


# direct methods
.method public constructor <init>([J[JJ)V
    .locals 8

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    array-length v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->d(Z)V

    if-lez v1, :cond_1

    aget-wide v4, p2, v2

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_1

    add-int/2addr v1, v3

    new-instance v0, Lcom/google/android/gms/internal/ads/FM;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/FM;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/L0;->a:Lcom/google/android/gms/internal/ads/FM;

    new-instance v2, Lcom/google/android/gms/internal/ads/FM;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/ads/FM;-><init>(I)V

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/L0;->b:Lcom/google/android/gms/internal/ads/FM;

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/internal/ads/FM;->c(J)V

    invoke-virtual {v2, v6, v7}, Lcom/google/android/gms/internal/ads/FM;->c(J)V

    goto :goto_1

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/FM;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/FM;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/L0;->a:Lcom/google/android/gms/internal/ads/FM;

    new-instance v0, Lcom/google/android/gms/internal/ads/FM;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/FM;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/L0;->b:Lcom/google/android/gms/internal/ads/FM;

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/L0;->a:Lcom/google/android/gms/internal/ads/FM;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/FM;->d([J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/L0;->b:Lcom/google/android/gms/internal/ads/FM;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/FM;->d([J)V

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/L0;->c:J

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/L0;->c:J

    return-wide v0
.end method

.method public final b(J)Lcom/google/android/gms/internal/ads/R0;
    .locals 8

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/L0;->b:Lcom/google/android/gms/internal/ads/FM;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/FM;->a()I

    move-result v1

    if-nez v1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/R0;

    sget-object p2, Lcom/google/android/gms/internal/ads/U0;->c:Lcom/google/android/gms/internal/ads/U0;

    invoke-direct {p1, p2, p2}, Lcom/google/android/gms/internal/ads/R0;-><init>(Lcom/google/android/gms/internal/ads/U0;Lcom/google/android/gms/internal/ads/U0;)V

    return-object p1

    :cond_0
    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1, v1}, Lcom/google/android/gms/internal/ads/EW;->t(Lcom/google/android/gms/internal/ads/FM;JZZ)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/L0;->b:Lcom/google/android/gms/internal/ads/FM;

    new-instance v3, Lcom/google/android/gms/internal/ads/U0;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/FM;->b(I)J

    move-result-wide v4

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/L0;->a:Lcom/google/android/gms/internal/ads/FM;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/FM;->b(I)J

    move-result-wide v6

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/google/android/gms/internal/ads/U0;-><init>(JJ)V

    iget-wide v4, v3, Lcom/google/android/gms/internal/ads/U0;->a:J

    cmp-long p1, v4, p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/L0;->b:Lcom/google/android/gms/internal/ads/FM;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/FM;->a()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    if-ne v0, p2, :cond_1

    goto :goto_0

    :cond_1
    add-int/2addr v0, v1

    new-instance p2, Lcom/google/android/gms/internal/ads/U0;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/FM;->b(I)J

    move-result-wide v1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/L0;->a:Lcom/google/android/gms/internal/ads/FM;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/FM;->b(I)J

    move-result-wide v4

    invoke-direct {p2, v1, v2, v4, v5}, Lcom/google/android/gms/internal/ads/U0;-><init>(JJ)V

    new-instance p1, Lcom/google/android/gms/internal/ads/R0;

    invoke-direct {p1, v3, p2}, Lcom/google/android/gms/internal/ads/R0;-><init>(Lcom/google/android/gms/internal/ads/U0;Lcom/google/android/gms/internal/ads/U0;)V

    return-object p1

    :cond_2
    :goto_0
    new-instance p1, Lcom/google/android/gms/internal/ads/R0;

    invoke-direct {p1, v3, v3}, Lcom/google/android/gms/internal/ads/R0;-><init>(Lcom/google/android/gms/internal/ads/U0;Lcom/google/android/gms/internal/ads/U0;)V

    return-object p1
.end method

.method public final g()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/L0;->b:Lcom/google/android/gms/internal/ads/FM;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/FM;->a()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
