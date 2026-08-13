.class final Lcom/google/android/gms/internal/ads/pE0;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/rE0;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/rE0;Lcom/google/android/gms/internal/ads/qE0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pE0;->a:Lcom/google/android/gms/internal/ads/rE0;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->isInitialStickyBroadcast()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pE0;->a:Lcom/google/android/gms/internal/ads/rE0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/rE0;->b(Lcom/google/android/gms/internal/ads/rE0;)Lcom/google/android/gms/internal/ads/vS;

    move-result-object v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/rE0;->d(Lcom/google/android/gms/internal/ads/rE0;)Lcom/google/android/gms/internal/ads/sE0;

    move-result-object v2

    invoke-static {p1, p2, v1, v2}, Lcom/google/android/gms/internal/ads/mE0;->d(Landroid/content/Context;Landroid/content/Intent;Lcom/google/android/gms/internal/ads/vS;Lcom/google/android/gms/internal/ads/sE0;)Lcom/google/android/gms/internal/ads/mE0;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/rE0;->f(Lcom/google/android/gms/internal/ads/rE0;Lcom/google/android/gms/internal/ads/mE0;)V

    :cond_0
    return-void
.end method
