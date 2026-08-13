.class public Lcom/google/android/gms/ads/AdService;
.super Landroid/app/IntentService;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "AdService"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final onHandleIntent(Landroid/content/Intent;)V
    .locals 2

    .prologue
    :try_start_0
    invoke-static {}, Ls3/y;->a()Ls3/w;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/Rl;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/Rl;-><init>()V

    invoke-virtual {v0, p0, v1}, Ls3/w;->j(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Vl;)Lcom/google/android/gms/internal/ads/En;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/En;->M0(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "RemoteException calling handleNotificationIntent: "

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    return-void
.end method
