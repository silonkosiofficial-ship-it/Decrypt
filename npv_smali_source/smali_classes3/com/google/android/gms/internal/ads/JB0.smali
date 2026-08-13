.class public final Lcom/google/android/gms/internal/ads/JB0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/aB0;


# instance fields
.field private a:Z

.field private b:J

.field private c:J

.field private d:Lcom/google/android/gms/internal/ads/qg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/mD;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Lcom/google/android/gms/internal/ads/qg;->d:Lcom/google/android/gms/internal/ads/qg;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/JB0;->d:Lcom/google/android/gms/internal/ads/qg;

    return-void
.end method


# virtual methods
.method public final Q(Lcom/google/android/gms/internal/ads/qg;)V
    .locals 2

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/JB0;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/JB0;->a()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/JB0;->b(J)V

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/JB0;->d:Lcom/google/android/gms/internal/ads/qg;

    return-void
.end method

.method public final a()J
    .locals 7

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/JB0;->b:J

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/JB0;->a:Z

    if-eqz v2, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/JB0;->c:J

    sub-long/2addr v2, v4

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/JB0;->d:Lcom/google/android/gms/internal/ads/qg;

    iget v5, v4, Lcom/google/android/gms/internal/ads/qg;->a:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v5, v5, v6

    if-nez v5, :cond_0

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/EW;->K(J)J

    move-result-wide v2

    :goto_0
    add-long/2addr v0, v2

    goto :goto_1

    :cond_0
    invoke-virtual {v4, v2, v3}, Lcom/google/android/gms/internal/ads/qg;->a(J)J

    move-result-wide v2

    goto :goto_0

    :cond_1
    :goto_1
    return-wide v0
.end method

.method public final b(J)V
    .locals 0

    .prologue
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/JB0;->b:J

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/JB0;->a:Z

    if-eqz p1, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/JB0;->c:J

    :cond_0
    return-void
.end method

.method public final c()Lcom/google/android/gms/internal/ads/qg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/JB0;->d:Lcom/google/android/gms/internal/ads/qg;

    return-object v0
.end method

.method public final d()V
    .locals 2

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/JB0;->a:Z

    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/JB0;->c:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/JB0;->a:Z

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 2

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/JB0;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/JB0;->a()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/JB0;->b(J)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/JB0;->a:Z

    :cond_0
    return-void
.end method

.method public final synthetic j()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
