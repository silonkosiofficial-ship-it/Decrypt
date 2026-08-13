.class public final Lcom/google/android/gms/internal/ads/ZL;
.super Lk3/w$a;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/eJ;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/eJ;)V
    .locals 0

    invoke-direct {p0}, Lk3/w$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ZL;->a:Lcom/google/android/gms/internal/ads/eJ;

    return-void
.end method

.method private static f(Lcom/google/android/gms/internal/ads/eJ;)Ls3/b1;
    .locals 1

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/eJ;->W()Ls3/Y0;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    invoke-interface {p0}, Ls3/Y0;->h()Ls3/b1;

    move-result-object p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZL;->a:Lcom/google/android/gms/internal/ads/eJ;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ZL;->f(Lcom/google/android/gms/internal/ads/eJ;)Ls3/b1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-interface {v0}, Ls3/b1;->d()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Unable to call onVideoEnd()"

    invoke-static {v1, v0}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZL;->a:Lcom/google/android/gms/internal/ads/eJ;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ZL;->f(Lcom/google/android/gms/internal/ads/eJ;)Ls3/b1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-interface {v0}, Ls3/b1;->i()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Unable to call onVideoEnd()"

    invoke-static {v1, v0}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final e()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZL;->a:Lcom/google/android/gms/internal/ads/eJ;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ZL;->f(Lcom/google/android/gms/internal/ads/eJ;)Ls3/b1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-interface {v0}, Ls3/b1;->h()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Unable to call onVideoEnd()"

    invoke-static {v1, v0}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
