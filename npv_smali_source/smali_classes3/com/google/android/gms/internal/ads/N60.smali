.class final Lcom/google/android/gms/internal/ads/N60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE3/a;


# instance fields
.field final synthetic C:Ls3/a0;

.field final synthetic D:Lcom/google/android/gms/internal/ads/O60;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/O60;Ls3/a0;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/N60;->C:Ls3/a0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/N60;->D:Lcom/google/android/gms/internal/ads/O60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final k()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/N60;->D:Lcom/google/android/gms/internal/ads/O60;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/O60;->o6(Lcom/google/android/gms/internal/ads/O60;)Lcom/google/android/gms/internal/ads/fM;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/N60;->C:Ls3/a0;

    invoke-interface {v0}, Ls3/a0;->d()V
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
