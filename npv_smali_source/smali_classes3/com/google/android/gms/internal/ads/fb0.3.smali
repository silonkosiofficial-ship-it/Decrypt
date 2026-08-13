.class final Lcom/google/android/gms/internal/ads/fb0;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/gb0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gb0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fb0;->a:Lcom/google/android/gms/internal/ads/gb0;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAvailable(Landroid/net/Network;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/fb0;->a:Lcom/google/android/gms/internal/ads/gb0;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/gb0;->f(Lcom/google/android/gms/internal/ads/gb0;Z)V

    return-void
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/fb0;->a:Lcom/google/android/gms/internal/ads/gb0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/gb0;->f(Lcom/google/android/gms/internal/ads/gb0;Z)V

    return-void
.end method
