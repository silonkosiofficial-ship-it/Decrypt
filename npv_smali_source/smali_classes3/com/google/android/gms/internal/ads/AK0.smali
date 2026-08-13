.class final Lcom/google/android/gms/internal/ads/AK0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/I;


# instance fields
.field final synthetic b:Lcom/google/android/gms/internal/ads/HK0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/HK0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/AK0;->b:Lcom/google/android/gms/internal/ads/HK0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/L;)V
    .locals 1

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/AK0;->b:Lcom/google/android/gms/internal/ads/HK0;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/HK0;->o1(Lcom/google/android/gms/internal/ads/HK0;)Landroid/view/Surface;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/HK0;->p1(Lcom/google/android/gms/internal/ads/HK0;)V

    :cond_0
    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/L;Lcom/google/android/gms/internal/ads/Os;)V
    .locals 0

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/ads/L;)V
    .locals 2

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/AK0;->b:Lcom/google/android/gms/internal/ads/HK0;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/HK0;->o1(Lcom/google/android/gms/internal/ads/HK0;)Landroid/view/Surface;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/HK0;->d1(II)V

    :cond_0
    return-void
.end method
