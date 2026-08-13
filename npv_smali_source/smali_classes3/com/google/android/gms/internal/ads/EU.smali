.class public final synthetic Lcom/google/android/gms/internal/ads/EU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/dA;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/YT;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/YT;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/EU;->a:Lcom/google/android/gms/internal/ads/YT;

    return-void
.end method


# virtual methods
.method public final a()Ls3/Y0;
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/EU;->a:Lcom/google/android/gms/internal/ads/YT;

    :try_start_0
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/Tm;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Tm;->d()Ls3/Y0;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/ads/u70;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/u70;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
