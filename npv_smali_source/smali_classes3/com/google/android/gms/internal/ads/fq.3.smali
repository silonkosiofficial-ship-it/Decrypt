.class public final Lcom/google/android/gms/internal/ads/fq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LV3/f;

.field private final b:Lcom/google/android/gms/internal/ads/dq;


# direct methods
.method constructor <init>(LV3/f;Lcom/google/android/gms/internal/ads/dq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fq;->a:LV3/f;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/fq;->b:Lcom/google/android/gms/internal/ads/dq;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/fq;
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/qq;->d(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/qq;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/qq;->b()Lcom/google/android/gms/internal/ads/fq;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fq;->b:Lcom/google/android/gms/internal/ads/dq;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/dq;->a(IJ)V

    return-void
.end method

.method public final c(Ls3/K1;)V
    .locals 3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/fq;->a:LV3/f;

    invoke-interface {p1}, LV3/f;->a()J

    move-result-wide v0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/fq;->b:Lcom/google/android/gms/internal/ads/dq;

    const/4 v2, -0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/android/gms/internal/ads/dq;->a(IJ)V

    return-void
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fq;->a:LV3/f;

    invoke-interface {v0}, LV3/f;->a()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/fq;->b:Lcom/google/android/gms/internal/ads/dq;

    const/4 v3, -0x1

    invoke-virtual {v2, v3, v0, v1}, Lcom/google/android/gms/internal/ads/dq;->a(IJ)V

    return-void
.end method
