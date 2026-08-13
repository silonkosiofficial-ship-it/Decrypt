.class final Lcom/google/android/gms/internal/ads/Lb;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/Ob;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Ob;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Lb;->a:Lcom/google/android/gms/internal/ads/Ob;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Lb;->a:Lcom/google/android/gms/internal/ads/Ob;

    const/4 p2, 0x3

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/Ob;->b(Lcom/google/android/gms/internal/ads/Ob;I)V

    return-void
.end method
