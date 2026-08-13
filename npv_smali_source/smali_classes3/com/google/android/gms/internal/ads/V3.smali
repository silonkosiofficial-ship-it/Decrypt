.class final Lcom/google/android/gms/internal/ads/V3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/a4;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/E0;

.field private final b:Lcom/google/android/gms/internal/ads/D0;

.field private c:J

.field private d:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/E0;Lcom/google/android/gms/internal/ads/D0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/V3;->a:Lcom/google/android/gms/internal/ads/E0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/V3;->b:Lcom/google/android/gms/internal/ads/D0;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/V3;->c:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/V3;->d:J

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/u0;)J
    .locals 6

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/V3;->d:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    const-wide/16 v2, -0x1

    if-ltz p1, :cond_0

    const-wide/16 v4, 0x2

    add-long/2addr v0, v4

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/V3;->d:J

    neg-long v0, v0

    return-wide v0

    :cond_0
    return-wide v2
.end method

.method public final b(J)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/V3;->b:Lcom/google/android/gms/internal/ads/D0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/D0;->a:[J

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1, v1}, Lcom/google/android/gms/internal/ads/EW;->v([JJZZ)I

    move-result p1

    aget-wide p1, v0, p1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/V3;->d:J

    return-void
.end method

.method public final c(J)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/V3;->c:J

    return-void
.end method

.method public final d()Lcom/google/android/gms/internal/ads/T0;
    .locals 4

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/V3;->c:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/C0;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/V3;->c:J

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/V3;->a:Lcom/google/android/gms/internal/ads/E0;

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/C0;-><init>(Lcom/google/android/gms/internal/ads/E0;J)V

    return-object v0
.end method
