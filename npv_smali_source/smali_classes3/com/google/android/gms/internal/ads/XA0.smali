.class public final Lcom/google/android/gms/internal/ads/XA0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:F

.field private c:J


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/XA0;->a:J

    const v2, -0x800001

    iput v2, p0, Lcom/google/android/gms/internal/ads/XA0;->b:F

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/XA0;->c:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ZA0;Lcom/google/android/gms/internal/ads/YA0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/ZA0;->a:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/XA0;->a:J

    iget p2, p1, Lcom/google/android/gms/internal/ads/ZA0;->b:F

    iput p2, p0, Lcom/google/android/gms/internal/ads/XA0;->b:F

    iget-wide p1, p1, Lcom/google/android/gms/internal/ads/ZA0;->c:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/XA0;->c:J

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/ads/XA0;)F
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/XA0;->b:F

    return p0
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/XA0;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/XA0;->c:J

    return-wide v0
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/XA0;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/XA0;->a:J

    return-wide v0
.end method


# virtual methods
.method public final d(J)Lcom/google/android/gms/internal/ads/XA0;
    .locals 4

    .prologue
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    const/4 v1, 0x1

    if-gez v0, :cond_1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p1, v2

    if-nez v0, :cond_0

    move-wide p1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/LC;->d(Z)V

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/XA0;->c:J

    return-object p0
.end method

.method public final e(J)Lcom/google/android/gms/internal/ads/XA0;
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/XA0;->a:J

    return-object p0
.end method

.method public final f(F)Lcom/google/android/gms/internal/ads/XA0;
    .locals 2

    .prologue
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    const/4 v1, 0x1

    if-gtz v0, :cond_1

    const v0, -0x800001

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/LC;->d(Z)V

    iput p1, p0, Lcom/google/android/gms/internal/ads/XA0;->b:F

    return-object p0
.end method

.method public final g()Lcom/google/android/gms/internal/ads/ZA0;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/ZA0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/ZA0;-><init>(Lcom/google/android/gms/internal/ads/XA0;Lcom/google/android/gms/internal/ads/YA0;)V

    return-object v0
.end method
