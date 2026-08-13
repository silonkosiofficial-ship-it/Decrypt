.class final Lcom/google/android/gms/internal/ads/zz0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/android/gms/internal/ads/yz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    new-instance p1, Lcom/google/android/gms/internal/ads/xz0;

    invoke-direct {p1, p0, p2, p3}, Lcom/google/android/gms/internal/ads/xz0;-><init>(Lcom/google/android/gms/internal/ads/zz0;Landroid/os/Handler;Lcom/google/android/gms/internal/ads/yz0;)V

    return-void
.end method
