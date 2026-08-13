.class public final synthetic Lcom/google/android/gms/internal/ads/eC;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/gC;

.field public final synthetic b:LP4/d;

.field public final synthetic c:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/gC;LP4/d;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eC;->a:Lcom/google/android/gms/internal/ads/gC;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/eC;->b:LP4/d;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/eC;->c:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eC;->a:Lcom/google/android/gms/internal/ads/gC;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eC;->b:LP4/d;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/eC;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/gC;->a(LP4/d;Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/Po;

    move-result-object v0

    return-object v0
.end method
