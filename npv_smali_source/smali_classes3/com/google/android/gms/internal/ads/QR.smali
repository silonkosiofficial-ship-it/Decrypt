.class public final synthetic Lcom/google/android/gms/internal/ads/QR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/p30;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/Po;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/p30;Lcom/google/android/gms/internal/ads/Po;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/QR;->a:Lcom/google/android/gms/internal/ads/p30;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/QR;->b:Lcom/google/android/gms/internal/ads/Po;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/QR;->a:Lcom/google/android/gms/internal/ads/p30;

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/p30;->b()Lcom/google/android/gms/internal/ads/O20;

    move-result-object v0

    invoke-static {}, Ls3/y;->b()Lw3/g;

    move-result-object v1

    invoke-virtual {v1, p1}, Lw3/g;->k(Landroid/os/Bundle;)Lorg/json/JSONObject;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/QR;->b:Lcom/google/android/gms/internal/ads/Po;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/Po;->O:Landroid/os/Bundle;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/O20;->a(Ljava/lang/Object;Landroid/os/Bundle;Z)LP4/d;

    move-result-object p1

    return-object p1
.end method
