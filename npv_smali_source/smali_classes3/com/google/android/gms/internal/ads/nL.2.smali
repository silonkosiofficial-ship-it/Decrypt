.class public final synthetic Lcom/google/android/gms/internal/ads/nL;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/pL;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/pL;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nL;->C:Lcom/google/android/gms/internal/ads/pL;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nL;->C:Lcom/google/android/gms/internal/ads/pL;

    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pL;->f()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
