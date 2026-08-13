.class final Lcom/google/android/gms/internal/ads/tr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Rl0;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/vq0;Lcom/google/android/gms/internal/ads/ur0;)V
    .locals 2

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/vq0;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/Up0;->b()Lcom/google/android/gms/internal/ads/Up0;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Up0;->a()Lcom/google/android/gms/internal/ads/Ep0;

    move-result-object p2

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Lp0;->a(Lcom/google/android/gms/internal/ads/vq0;)Lcom/google/android/gms/internal/ads/Ip0;

    move-result-object p1

    const-string v0, "compute"

    const-string v1, "mac"

    invoke-interface {p2, p1, v1, v0}, Lcom/google/android/gms/internal/ads/Ep0;->a(Lcom/google/android/gms/internal/ads/Ip0;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Dp0;

    const-string v0, "verify"

    invoke-interface {p2, p1, v1, v0}, Lcom/google/android/gms/internal/ads/Ep0;->a(Lcom/google/android/gms/internal/ads/Ip0;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Dp0;

    :cond_0
    return-void
.end method
