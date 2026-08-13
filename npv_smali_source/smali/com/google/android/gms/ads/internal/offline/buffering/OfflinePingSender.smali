.class public Lcom/google/android/gms/ads/internal/offline/buffering/OfflinePingSender;
.super Landroidx/work/Worker;
.source "SourceFile"


# instance fields
.field private final I:Lcom/google/android/gms/internal/ads/En;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    invoke-static {}, Ls3/y;->a()Ls3/w;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/Rl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Rl;-><init>()V

    invoke-virtual {p2, p1, v0}, Ls3/w;->j(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Vl;)Lcom/google/android/gms/internal/ads/En;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/offline/buffering/OfflinePingSender;->I:Lcom/google/android/gms/internal/ads/En;

    return-void
.end method


# virtual methods
.method public final doWork()Landroidx/work/ListenableWorker$a;
    .locals 1

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/offline/buffering/OfflinePingSender;->I:Lcom/google/android/gms/internal/ads/En;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/En;->g()V

    invoke-static {}, Landroidx/work/ListenableWorker$a;->c()Landroidx/work/ListenableWorker$a;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    invoke-static {}, Landroidx/work/ListenableWorker$a;->a()Landroidx/work/ListenableWorker$a;

    move-result-object v0

    return-object v0
.end method
