.class public final synthetic Ls3/F1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Cp;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Cp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/F1;->C:Lcom/google/android/gms/internal/ads/Cp;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    iget-object v0, p0, Ls3/F1;->C:Lcom/google/android/gms/internal/ads/Cp;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :try_start_0
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Cp;->F(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
