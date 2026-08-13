.class public final Lcom/google/android/gms/internal/ads/Ky;
.super Lcom/google/android/gms/internal/ads/fA;
.source "SourceFile"


# instance fields
.field private final j:Lcom/google/android/gms/internal/ads/Ot;

.field private final k:I

.field private final l:Landroid/content/Context;

.field private final m:Lcom/google/android/gms/internal/ads/xy;

.field private final n:Lcom/google/android/gms/internal/ads/ZH;

.field private final o:Lcom/google/android/gms/internal/ads/pG;

.field private final p:Lcom/google/android/gms/internal/ads/SC;

.field private final q:Z

.field private final r:Lcom/google/android/gms/internal/ads/Xq;

.field private s:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/eA;Landroid/content/Context;Lcom/google/android/gms/internal/ads/Ot;ILcom/google/android/gms/internal/ads/xy;Lcom/google/android/gms/internal/ads/ZH;Lcom/google/android/gms/internal/ads/pG;Lcom/google/android/gms/internal/ads/SC;Lcom/google/android/gms/internal/ads/Xq;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/fA;-><init>(Lcom/google/android/gms/internal/ads/eA;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/Ky;->s:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Ky;->j:Lcom/google/android/gms/internal/ads/Ot;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ky;->l:Landroid/content/Context;

    iput p4, p0, Lcom/google/android/gms/internal/ads/Ky;->k:I

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/Ky;->m:Lcom/google/android/gms/internal/ads/xy;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/Ky;->n:Lcom/google/android/gms/internal/ads/ZH;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/Ky;->o:Lcom/google/android/gms/internal/ads/pG;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/Ky;->p:Lcom/google/android/gms/internal/ads/SC;

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->q5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/Ky;->q:Z

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/Ky;->r:Lcom/google/android/gms/internal/ads/Xq;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/fA;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ky;->j:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->destroy()V

    :cond_0
    return-void
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Ky;->k:I

    return v0
.end method

.method public final j(Lcom/google/android/gms/internal/ads/zc;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ky;->j:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/Ot;->U0(Lcom/google/android/gms/internal/ads/zc;)V

    :cond_0
    return-void
.end method

.method public final k(Landroid/app/Activity;Lcom/google/android/gms/internal/ads/Oc;Z)V
    .locals 2

    .prologue
    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Ky;->l:Landroid/content/Context;

    :cond_0
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/Ky;->q:Z

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Ky;->o:Lcom/google/android/gms/internal/ads/pG;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/pG;->b()V

    :cond_1
    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->M0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    invoke-static {p1}, Lv3/E0;->h(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"

    invoke-static {p2}, Lw3/p;->g(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Ky;->p:Lcom/google/android/gms/internal/ads/SC;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/SC;->b()V

    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->N0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_7

    new-instance p2, Lcom/google/android/gms/internal/ads/gd0;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {}, Lr3/v;->x()Lv3/W;

    move-result-object p3

    invoke-virtual {p3}, Lv3/W;->b()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Lcom/google/android/gms/internal/ads/gd0;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/fA;->a:Lcom/google/android/gms/internal/ads/e70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/U60;->b:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/gd0;->a(Ljava/lang/String;)V

    return-void

    :cond_2
    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->Mb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Ky;->j:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz p2, :cond_4

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/Ot;->Q()Lcom/google/android/gms/internal/ads/R60;

    move-result-object p2

    if-eqz p2, :cond_4

    iget-boolean v1, p2, Lcom/google/android/gms/internal/ads/R60;->r0:Z

    if-eqz v1, :cond_4

    iget p2, p2, Lcom/google/android/gms/internal/ads/R60;->s0:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Ky;->r:Lcom/google/android/gms/internal/ads/Xq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Xq;->b()I

    move-result v1

    if-ne p2, v1, :cond_3

    goto :goto_0

    :cond_3
    const-string p1, "The app open consent form has been shown."

    invoke-static {p1}, Lw3/p;->g(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Ky;->p:Lcom/google/android/gms/internal/ads/SC;

    const/16 p2, 0xc

    const-string p3, "The consent form has already been shown."

    invoke-static {p2, p3, v0}, Lcom/google/android/gms/internal/ads/P70;->d(ILjava/lang/String;Ls3/W0;)Ls3/W0;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/SC;->p(Ls3/W0;)V

    return-void

    :cond_4
    :goto_0
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/Ky;->s:Z

    if-eqz p2, :cond_5

    const-string p2, "App open interstitial ad is already visible."

    invoke-static {p2}, Lw3/p;->g(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Ky;->p:Lcom/google/android/gms/internal/ads/SC;

    const/16 v1, 0xa

    invoke-static {v1, v0, v0}, Lcom/google/android/gms/internal/ads/P70;->d(ILjava/lang/String;Ls3/W0;)Ls3/W0;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/SC;->p(Ls3/W0;)V

    :cond_5
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/Ky;->s:Z

    if-nez p2, :cond_7

    :try_start_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Ky;->n:Lcom/google/android/gms/internal/ads/ZH;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ky;->p:Lcom/google/android/gms/internal/ads/SC;

    invoke-interface {p2, p3, p1, v0}, Lcom/google/android/gms/internal/ads/ZH;->a(ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/SC;)V

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/Ky;->q:Z

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Ky;->o:Lcom/google/android/gms/internal/ads/pG;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/pG;->a()V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/YH; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_6
    :goto_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/Ky;->s:Z

    return-void

    :goto_2
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Ky;->p:Lcom/google/android/gms/internal/ads/SC;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/SC;->F(Lcom/google/android/gms/internal/ads/YH;)V

    :cond_7
    return-void
.end method

.method public final l(JI)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ky;->m:Lcom/google/android/gms/internal/ads/xy;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/xy;->a(JI)V

    return-void
.end method
