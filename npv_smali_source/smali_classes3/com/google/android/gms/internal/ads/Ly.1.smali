.class public final Lcom/google/android/gms/internal/ads/Ly;
.super Lcom/google/android/gms/internal/ads/Gc;
.source "SourceFile"


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/Ky;

.field private final D:Ls3/V;

.field private final E:Lcom/google/android/gms/internal/ads/K40;

.field private F:Z

.field private final G:Lcom/google/android/gms/internal/ads/eO;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Ky;Ls3/V;Lcom/google/android/gms/internal/ads/K40;Lcom/google/android/gms/internal/ads/eO;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Gc;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->R0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/Ly;->F:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ly;->C:Lcom/google/android/gms/internal/ads/Ky;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ly;->D:Ls3/V;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Ly;->E:Lcom/google/android/gms/internal/ads/K40;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Ly;->G:Lcom/google/android/gms/internal/ads/eO;

    return-void
.end method


# virtual methods
.method public final K0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/Ly;->F:Z

    return-void
.end method

.method public final M3(LX3/a;Lcom/google/android/gms/internal/ads/Oc;)V
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ly;->E:Lcom/google/android/gms/internal/ads/K40;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/K40;->q(Lcom/google/android/gms/internal/ads/Oc;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ly;->C:Lcom/google/android/gms/internal/ads/Ky;

    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/Ly;->F:Z

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/Ky;->k(Landroid/app/Activity;Lcom/google/android/gms/internal/ads/Oc;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "#007 Could not call remote method."

    invoke-static {p2, p1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final d()Ls3/V;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ly;->D:Ls3/V;

    return-object v0
.end method

.method public final e()Ls3/U0;
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->C6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ly;->C:Lcom/google/android/gms/internal/ads/Ky;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->c()Lcom/google/android/gms/internal/ads/xC;

    move-result-object v0

    return-object v0
.end method

.method public final z1(Ls3/N0;)V
    .locals 2

    .prologue
    const-string v0, "setOnPaidEventListener must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ly;->E:Lcom/google/android/gms/internal/ads/K40;

    if-eqz v0, :cond_1

    :try_start_0
    invoke-interface {p1}, Ls3/N0;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ly;->G:Lcom/google/android/gms/internal/ads/eO;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eO;->e()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Error in making CSI ping for reporting paid event callback"

    invoke-static {v1, v0}, Lw3/p;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ly;->E:Lcom/google/android/gms/internal/ads/K40;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/K40;->k(Ls3/N0;)V

    :cond_1
    return-void
.end method
