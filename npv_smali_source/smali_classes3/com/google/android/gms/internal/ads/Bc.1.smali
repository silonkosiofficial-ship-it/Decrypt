.class public final Lcom/google/android/gms/internal/ads/Bc;
.super Lm3/a;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Hc;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/android/gms/internal/ads/Ec;

.field d:Lk3/l;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Hc;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lm3/a;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/Ec;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Ec;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Bc;->c:Lcom/google/android/gms/internal/ads/Ec;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Bc;->a:Lcom/google/android/gms/internal/ads/Hc;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Bc;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lk3/u;
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Bc;->a:Lcom/google/android/gms/internal/ads/Hc;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Hc;->e()Ls3/U0;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lk3/u;->e(Ls3/U0;)Lk3/u;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lk3/l;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Bc;->d:Lk3/l;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Bc;->c:Lcom/google/android/gms/internal/ads/Ec;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Ec;->o6(Lk3/l;)V

    return-void
.end method

.method public final e(Landroid/app/Activity;)V
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Bc;->a:Lcom/google/android/gms/internal/ads/Hc;

    invoke-static {p1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Bc;->c:Lcom/google/android/gms/internal/ads/Ec;

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/Hc;->M3(LX3/a;Lcom/google/android/gms/internal/ads/Oc;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
