.class public final Lcom/google/android/gms/internal/ads/Ta0;
.super Lcom/google/android/gms/internal/ads/tb0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILcom/google/android/gms/internal/ads/Vl;Ls3/I1;Ls3/c0;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/Ra0;LV3/f;)V
    .locals 0

    invoke-direct/range {p0 .. p9}, Lcom/google/android/gms/internal/ads/tb0;-><init>(Lcom/google/android/gms/ads/internal/ClientApi;Landroid/content/Context;ILcom/google/android/gms/internal/ads/Vl;Ls3/I1;Ls3/c0;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/Ra0;LV3/f;)V

    return-void
.end method


# virtual methods
.method protected final e()LP4/d;
    .locals 8

    .prologue
    invoke-static {}, Lcom/google/android/gms/internal/ads/il0;->D()Lcom/google/android/gms/internal/ads/il0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tb0;->b:Landroid/content/Context;

    invoke-static {v1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v3

    new-instance v4, Ls3/c2;

    invoke-direct {v4}, Ls3/c2;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tb0;->e:Ls3/I1;

    iget-object v5, v1, Ls3/I1;->C:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/tb0;->d:Lcom/google/android/gms/internal/ads/Vl;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/tb0;->a:Lcom/google/android/gms/ads/internal/ClientApi;

    iget v7, p0, Lcom/google/android/gms/internal/ads/tb0;->c:I

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/ads/internal/ClientApi;->v5(LX3/a;Ls3/c2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;I)Ls3/V;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/tb0;->e:Ls3/I1;

    iget-object v3, v3, Ls3/I1;->E:Ls3/X1;

    new-instance v4, Lcom/google/android/gms/internal/ads/Sa0;

    invoke-direct {v4, p0, v0, v1}, Lcom/google/android/gms/internal/ads/Sa0;-><init>(Lcom/google/android/gms/internal/ads/Ta0;Lcom/google/android/gms/internal/ads/il0;Ls3/V;)V

    invoke-interface {v1, v3, v4}, Ls3/V;->o3(Ls3/X1;Ls3/K;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    const-string v3, "Failed to load interstitial ad."

    invoke-static {v3, v1}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/Na0;

    const-string v3, "remote exception"

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Na0;-><init>(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/il0;->h(Ljava/lang/Throwable;)Z

    goto :goto_1

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/Na0;

    const-string v3, "Failed to create an interstitial ad manager."

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Na0;-><init>(ILjava/lang/String;)V

    goto :goto_0

    :goto_1
    return-object v0
.end method

.method protected final bridge synthetic f(Ljava/lang/Object;)Lj$/util/Optional;
    .locals 1

    .prologue
    check-cast p1, Ls3/V;

    :try_start_0
    invoke-interface {p1}, Ls3/V;->k()Ls3/U0;

    move-result-object p1

    invoke-static {p1}, Lj$/util/Optional;->ofNullable(Ljava/lang/Object;)Lj$/util/Optional;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to get response info for  the interstitial ad."

    invoke-static {v0, p1}, Lw3/p;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lj$/util/Optional;->empty()Lj$/util/Optional;

    move-result-object p1

    :goto_0
    return-object p1
.end method
