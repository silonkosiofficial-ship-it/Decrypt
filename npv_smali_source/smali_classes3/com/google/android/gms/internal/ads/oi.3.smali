.class final Lcom/google/android/gms/internal/ads/oi;
.super Lcom/google/android/gms/internal/ads/Qh;
.source "SourceFile"


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/ads/si;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/si;Lcom/google/android/gms/internal/ads/qi;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/oi;->C:Lcom/google/android/gms/internal/ads/si;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Qh;-><init>()V

    return-void
.end method


# virtual methods
.method public final y3(Lcom/google/android/gms/internal/ads/Hh;Ljava/lang/String;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oi;->C:Lcom/google/android/gms/internal/ads/si;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/si;->a(Lcom/google/android/gms/internal/ads/si;)Ln3/l;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/si;->a(Lcom/google/android/gms/internal/ads/si;)Ln3/l;

    move-result-object v1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/si;->e(Lcom/google/android/gms/internal/ads/si;Lcom/google/android/gms/internal/ads/Hh;)Lcom/google/android/gms/internal/ads/Ih;

    move-result-object p1

    invoke-interface {v1, p1, p2}, Ln3/l;->a(Lcom/google/android/gms/internal/ads/Ih;Ljava/lang/String;)V

    return-void
.end method
