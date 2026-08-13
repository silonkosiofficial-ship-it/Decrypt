.class public final Lcom/google/android/gms/internal/ads/uX;
.super Ls3/U;
.source "SourceFile"


# instance fields
.field private final C:Landroid/content/Context;

.field private final D:Ls3/H;

.field private final E:Lcom/google/android/gms/internal/ads/n70;

.field private final F:Lcom/google/android/gms/internal/ads/Qy;

.field private final G:Landroid/view/ViewGroup;

.field private final H:Lcom/google/android/gms/internal/ads/eO;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ls3/H;Lcom/google/android/gms/internal/ads/n70;Lcom/google/android/gms/internal/ads/Qy;Lcom/google/android/gms/internal/ads/eO;)V
    .locals 0

    invoke-direct {p0}, Ls3/U;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uX;->C:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uX;->D:Ls3/H;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/uX;->E:Lcom/google/android/gms/internal/ads/n70;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/uX;->F:Lcom/google/android/gms/internal/ads/Qy;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/uX;->H:Lcom/google/android/gms/internal/ads/eO;

    new-instance p2, Landroid/widget/FrameLayout;

    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/Qy;->k()Landroid/view/View;

    move-result-object p1

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    new-instance p3, Landroid/view/ViewGroup$LayoutParams;

    const/4 p4, -0x1

    invoke-direct {p3, p4, p4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p1, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/uX;->i()Ls3/c2;

    move-result-object p1

    iget p1, p1, Ls3/c2;->E:I

    invoke-virtual {p2, p1}, Landroid/view/View;->setMinimumHeight(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/uX;->i()Ls3/c2;

    move-result-object p1

    iget p1, p1, Ls3/c2;->H:I

    invoke-virtual {p2, p1}, Landroid/view/View;->setMinimumWidth(I)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uX;->G:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public final C()V
    .locals 1

    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->F:Lcom/google/android/gms/internal/ads/Qy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->a()V

    return-void
.end method

.method public final F1(Ls3/p0;)V
    .locals 0

    return-void
.end method

.method public final F2(Lcom/google/android/gms/internal/ads/Wf;)V
    .locals 0

    const-string p1, "setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {p1}, Lw3/p;->f(Ljava/lang/String;)V

    return-void
.end method

.method public final H0()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->F:Lcom/google/android/gms/internal/ads/Qy;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final I5(Lcom/google/android/gms/internal/ads/Kc;)V
    .locals 0

    return-void
.end method

.method public final J()V
    .locals 2

    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->F:Lcom/google/android/gms/internal/ads/Qy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->d()Lcom/google/android/gms/internal/ads/eD;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/eD;->r1(Landroid/content/Context;)V

    return-void
.end method

.method public final K3(Ls3/X1;)Z
    .locals 0

    const-string p1, "loadAd is not supported for an Ad Manager AdView returned from AdLoader."

    invoke-static {p1}, Lw3/p;->f(Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final P5()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final T1(Ls3/c2;)V
    .locals 2

    .prologue
    const-string v0, "setAdSize must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->F:Lcom/google/android/gms/internal/ads/Qy;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uX;->G:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Qy;->p(Landroid/view/ViewGroup;Ls3/c2;)V

    :cond_0
    return-void
.end method

.method public final V0(Ls3/i2;)V
    .locals 0

    return-void
.end method

.method public final V5(Ls3/E;)V
    .locals 0

    const-string p1, "setAdClickListener is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {p1}, Lw3/p;->f(Ljava/lang/String;)V

    return-void
.end method

.method public final W0(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final W2(Lcom/google/android/gms/internal/ads/Vn;)V
    .locals 0

    return-void
.end method

.method public final X()V
    .locals 0

    return-void
.end method

.method public final X1(Lcom/google/android/gms/internal/ads/Yn;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final Y()V
    .locals 2

    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->F:Lcom/google/android/gms/internal/ads/Qy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->d()Lcom/google/android/gms/internal/ads/eD;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/eD;->s1(Landroid/content/Context;)V

    return-void
.end method

.method public final Y1(Lcom/google/android/gms/internal/ads/ip;)V
    .locals 0

    return-void
.end method

.method public final Y4(Z)V
    .locals 0

    return-void
.end method

.method public final e6(Z)V
    .locals 0

    const-string p1, "setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {p1}, Lw3/p;->f(Ljava/lang/String;)V

    return-void
.end method

.method public final f()Landroid/os/Bundle;
    .locals 1

    const-string v0, "getAdMetadata is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {v0}, Lw3/p;->f(Ljava/lang/String;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final f0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final g3(Ls3/c1;)V
    .locals 0

    return-void
.end method

.method public final h()Ls3/H;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->D:Ls3/H;

    return-object v0
.end method

.method public final h0()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->F:Lcom/google/android/gms/internal/ads/Qy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Qy;->o()V

    return-void
.end method

.method public final i()Ls3/c2;
    .locals 2

    const-string v0, "getAdSize must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->F:Lcom/google/android/gms/internal/ads/Qy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Qy;->m()Lcom/google/android/gms/internal/ads/S60;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uX;->C:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/t70;->a(Landroid/content/Context;Ljava/util/List;)Ls3/c2;

    move-result-object v0

    return-object v0
.end method

.method public final i2(Ls3/i0;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->E:Lcom/google/android/gms/internal/ads/n70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->c:Lcom/google/android/gms/internal/ads/UX;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/UX;->C(Ls3/i0;)V

    :cond_0
    return-void
.end method

.method public final j()Ls3/i0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->E:Lcom/google/android/gms/internal/ads/n70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->n:Ls3/i0;

    return-object v0
.end method

.method public final j4(Ls3/Q1;)V
    .locals 0

    const-string p1, "setVideoOptions is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {p1}, Lw3/p;->f(Ljava/lang/String;)V

    return-void
.end method

.method public final k()Ls3/U0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->F:Lcom/google/android/gms/internal/ads/Qy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->c()Lcom/google/android/gms/internal/ads/xC;

    move-result-object v0

    return-object v0
.end method

.method public final l()Ls3/Y0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->F:Lcom/google/android/gms/internal/ads/Qy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Qy;->l()Ls3/Y0;

    move-result-object v0

    return-object v0
.end method

.method public final l1(Ls3/N0;)V
    .locals 3

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->ub:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->E:Lcom/google/android/gms/internal/ads/n70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->c:Lcom/google/android/gms/internal/ads/UX;

    if-eqz v0, :cond_1

    :try_start_0
    invoke-interface {p1}, Ls3/N0;->e()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uX;->H:Lcom/google/android/gms/internal/ads/eO;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eO;->e()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Error in making CSI ping for reporting paid event callback"

    invoke-static {v2, v1}, Lw3/p;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/UX;->z(Ls3/N0;)V

    :cond_1
    return-void

    :cond_2
    const-string p1, "setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {p1}, Lw3/p;->f(Ljava/lang/String;)V

    return-void
.end method

.method public final m6(LX3/a;)V
    .locals 0

    return-void
.end method

.method public final n()LX3/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->G:Landroid/view/ViewGroup;

    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v0

    return-object v0
.end method

.method public final o3(Ls3/X1;Ls3/K;)V
    .locals 0

    return-void
.end method

.method public final r2(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->E:Lcom/google/android/gms/internal/ads/n70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final u()Ljava/lang/String;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->F:Lcom/google/android/gms/internal/ads/Qy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->c()Lcom/google/android/gms/internal/ads/xC;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->F:Lcom/google/android/gms/internal/ads/Qy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->c()Lcom/google/android/gms/internal/ads/xC;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xC;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final u3(Ls3/H;)V
    .locals 0

    const-string p1, "setAdListener is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {p1}, Lw3/p;->f(Ljava/lang/String;)V

    return-void
.end method

.method public final v3(Ls3/m0;)V
    .locals 0

    const-string p1, "setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {p1}, Lw3/p;->f(Ljava/lang/String;)V

    return-void
.end method

.method public final w()Ljava/lang/String;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->F:Lcom/google/android/gms/internal/ads/Qy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->c()Lcom/google/android/gms/internal/ads/xC;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uX;->F:Lcom/google/android/gms/internal/ads/Qy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->c()Lcom/google/android/gms/internal/ads/xC;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xC;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final x4(Ls3/a0;)V
    .locals 0

    const-string p1, "setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader."

    invoke-static {p1}, Lw3/p;->f(Ljava/lang/String;)V

    return-void
.end method
