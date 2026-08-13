.class public final Lcom/google/android/gms/internal/ads/lH;
.super Lcom/google/android/gms/internal/ads/fA;
.source "SourceFile"


# instance fields
.field private final j:Landroid/content/Context;

.field private final k:Ljava/lang/ref/WeakReference;

.field private final l:Lcom/google/android/gms/internal/ads/pG;

.field private final m:Lcom/google/android/gms/internal/ads/ZH;

.field private final n:Lcom/google/android/gms/internal/ads/BA;

.field private final o:Lcom/google/android/gms/internal/ads/gd0;

.field private final p:Lcom/google/android/gms/internal/ads/SC;

.field private final q:Lcom/google/android/gms/internal/ads/Xq;

.field private r:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/eA;Landroid/content/Context;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/pG;Lcom/google/android/gms/internal/ads/ZH;Lcom/google/android/gms/internal/ads/BA;Lcom/google/android/gms/internal/ads/gd0;Lcom/google/android/gms/internal/ads/SC;Lcom/google/android/gms/internal/ads/Xq;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/fA;-><init>(Lcom/google/android/gms/internal/ads/eA;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/lH;->r:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/lH;->j:Landroid/content/Context;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/lH;->k:Ljava/lang/ref/WeakReference;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/lH;->l:Lcom/google/android/gms/internal/ads/pG;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/lH;->m:Lcom/google/android/gms/internal/ads/ZH;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/lH;->n:Lcom/google/android/gms/internal/ads/BA;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/lH;->o:Lcom/google/android/gms/internal/ads/gd0;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/lH;->p:Lcom/google/android/gms/internal/ads/SC;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/lH;->q:Lcom/google/android/gms/internal/ads/Xq;

    return-void
.end method


# virtual methods
.method public final finalize()V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lH;->k:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Ot;

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->A6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/lH;->r:Z

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/ads/dr;->f:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v2, Lcom/google/android/gms/internal/ads/kH;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/kH;-><init>(Lcom/google/android/gms/internal/ads/Ot;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->destroy()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void

    :goto_1
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    throw v0
.end method

.method public final i()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lH;->n:Lcom/google/android/gms/internal/ads/BA;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/BA;->a()Z

    move-result v0

    return v0
.end method

.method public final j(ZLandroid/app/Activity;)Z
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lH;->l:Lcom/google/android/gms/internal/ads/pG;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pG;->b()V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->M0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lH;->j:Landroid/content/Context;

    invoke-static {v0}, Lv3/E0;->h(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"

    invoke-static {p1}, Lw3/p;->g(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/lH;->p:Lcom/google/android/gms/internal/ads/SC;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/SC;->b()V

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->N0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/lH;->o:Lcom/google/android/gms/internal/ads/gd0;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/fA;->a:Lcom/google/android/gms/internal/ads/e70;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/U60;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/gd0;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lH;->k:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Ot;

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->Mb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->Q()Lcom/google/android/gms/internal/ads/R60;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/R60;->r0:Z

    if-eqz v2, :cond_1

    iget v0, v0, Lcom/google/android/gms/internal/ads/R60;->s0:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/lH;->q:Lcom/google/android/gms/internal/ads/Xq;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Xq;->b()I

    move-result v2

    if-eq v0, v2, :cond_1

    const-string p1, "The interstitial consent form has been shown."

    invoke-static {p1}, Lw3/p;->g(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/lH;->p:Lcom/google/android/gms/internal/ads/SC;

    const/16 p2, 0xc

    const-string v0, "The consent form has already been shown."

    invoke-static {p2, v0, v3}, Lcom/google/android/gms/internal/ads/P70;->d(ILjava/lang/String;Ls3/W0;)Ls3/W0;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/SC;->p(Ls3/W0;)V

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/lH;->r:Z

    if-eqz v0, :cond_2

    const-string v0, "The interstitial ad has been shown."

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lH;->p:Lcom/google/android/gms/internal/ads/SC;

    const/16 v2, 0xa

    invoke-static {v2, v3, v3}, Lcom/google/android/gms/internal/ads/P70;->d(ILjava/lang/String;Ls3/W0;)Ls3/W0;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/SC;->p(Ls3/W0;)V

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/lH;->r:Z

    if-nez v0, :cond_4

    if-nez p2, :cond_3

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/lH;->j:Landroid/content/Context;

    :cond_3
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lH;->m:Lcom/google/android/gms/internal/ads/ZH;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/lH;->p:Lcom/google/android/gms/internal/ads/SC;

    invoke-interface {v0, p1, p2, v2}, Lcom/google/android/gms/internal/ads/ZH;->a(ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/SC;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/lH;->l:Lcom/google/android/gms/internal/ads/pG;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/pG;->a()V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/YH; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/lH;->r:Z

    return p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/lH;->p:Lcom/google/android/gms/internal/ads/SC;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/SC;->F(Lcom/google/android/gms/internal/ads/YH;)V

    :cond_4
    :goto_0
    return v1
.end method
