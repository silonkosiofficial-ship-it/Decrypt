.class final Lcom/google/android/gms/internal/ads/Ty;
.super Lcom/google/android/gms/internal/ads/Qy;
.source "SourceFile"


# instance fields
.field private final j:Landroid/content/Context;

.field private final k:Landroid/view/View;

.field private final l:Lcom/google/android/gms/internal/ads/Ot;

.field private final m:Lcom/google/android/gms/internal/ads/S60;

.field private final n:Lcom/google/android/gms/internal/ads/dA;

.field private final o:Lcom/google/android/gms/internal/ads/pJ;

.field private final p:Lcom/google/android/gms/internal/ads/OG;

.field private final q:Lcom/google/android/gms/internal/ads/Uy0;

.field private final r:Ljava/util/concurrent/Executor;

.field private s:Ls3/c2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/eA;Landroid/content/Context;Lcom/google/android/gms/internal/ads/S60;Landroid/view/View;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/dA;Lcom/google/android/gms/internal/ads/pJ;Lcom/google/android/gms/internal/ads/OG;Lcom/google/android/gms/internal/ads/Uy0;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Qy;-><init>(Lcom/google/android/gms/internal/ads/eA;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ty;->j:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Ty;->k:Landroid/view/View;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/Ty;->l:Lcom/google/android/gms/internal/ads/Ot;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Ty;->m:Lcom/google/android/gms/internal/ads/S60;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/Ty;->n:Lcom/google/android/gms/internal/ads/dA;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/Ty;->o:Lcom/google/android/gms/internal/ads/pJ;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/Ty;->p:Lcom/google/android/gms/internal/ads/OG;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/Ty;->q:Lcom/google/android/gms/internal/ads/Uy0;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/Ty;->r:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic q(Lcom/google/android/gms/internal/ads/Ty;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ty;->o:Lcom/google/android/gms/internal/ads/pJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pJ;->e()Lcom/google/android/gms/internal/ads/Zh;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Ty;->q:Lcom/google/android/gms/internal/ads/Uy0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Uy0;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3/V;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Ty;->j:Landroid/content/Context;

    invoke-static {p0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Lcom/google/android/gms/internal/ads/Zh;->R1(Ls3/V;LX3/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string v0, "RemoteException when notifyAdLoad is called"

    invoke-static {v0, p0}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Sy;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/Sy;-><init>(Lcom/google/android/gms/internal/ads/Ty;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Ty;->r:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/fA;->b()V

    return-void
.end method

.method public final i()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fA;->a:Lcom/google/android/gms/internal/ads/e70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget v0, v0, Lcom/google/android/gms/internal/ads/U60;->d:I

    return v0
.end method

.method public final j()I
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->J7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fA;->b:Lcom/google/android/gms/internal/ads/R60;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/R60;->g0:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->K7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fA;->a:Lcom/google/android/gms/internal/ads/e70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget v0, v0, Lcom/google/android/gms/internal/ads/U60;->c:I

    return v0
.end method

.method public final k()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ty;->k:Landroid/view/View;

    return-object v0
.end method

.method public final l()Ls3/Y0;
    .locals 1

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ty;->n:Lcom/google/android/gms/internal/ads/dA;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/dA;->a()Ls3/Y0;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/u70; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final m()Lcom/google/android/gms/internal/ads/S60;
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ty;->s:Ls3/c2;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/t70;->b(Ls3/c2;)Lcom/google/android/gms/internal/ads/S60;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fA;->b:Lcom/google/android/gms/internal/ads/R60;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/R60;->c0:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/R60;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v3, "FirstParty"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ty;->k:Landroid/view/View;

    new-instance v1, Lcom/google/android/gms/internal/ads/S60;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-direct {v1, v3, v0, v2}, Lcom/google/android/gms/internal/ads/S60;-><init>(IIZ)V

    return-object v1

    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fA;->b:Lcom/google/android/gms/internal/ads/R60;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/R60;->r:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/S60;

    return-object v0
.end method

.method public final n()Lcom/google/android/gms/internal/ads/S60;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ty;->m:Lcom/google/android/gms/internal/ads/S60;

    return-object v0
.end method

.method public final o()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ty;->p:Lcom/google/android/gms/internal/ads/OG;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/OG;->a()V

    return-void
.end method

.method public final p(Landroid/view/ViewGroup;Ls3/c2;)V
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ty;->l:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Mu;->c(Ls3/c2;)Lcom/google/android/gms/internal/ads/Mu;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Ot;->l1(Lcom/google/android/gms/internal/ads/Mu;)V

    iget v0, p2, Ls3/c2;->E:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setMinimumHeight(I)V

    iget v0, p2, Ls3/c2;->H:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setMinimumWidth(I)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ty;->s:Ls3/c2;

    :cond_0
    return-void
.end method
