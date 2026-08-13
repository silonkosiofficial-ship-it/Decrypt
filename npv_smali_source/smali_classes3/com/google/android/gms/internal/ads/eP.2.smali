.class public final synthetic Lcom/google/android/gms/internal/ads/eP;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/pP;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/hk;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/pP;Lcom/google/android/gms/internal/ads/hk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eP;->C:Lcom/google/android/gms/internal/ads/pP;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/eP;->D:Lcom/google/android/gms/internal/ads/hk;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eP;->C:Lcom/google/android/gms/internal/ads/pP;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eP;->D:Lcom/google/android/gms/internal/ads/hk;

    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pP;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/hk;->L4(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
