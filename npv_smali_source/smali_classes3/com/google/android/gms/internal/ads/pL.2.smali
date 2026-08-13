.class public final Lcom/google/android/gms/internal/ads/pL;
.super Lcom/google/android/gms/internal/ads/pk;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;
.implements Lcom/google/android/gms/internal/ads/ah;


# instance fields
.field private C:Landroid/view/View;

.field private D:Ls3/Y0;

.field private E:Lcom/google/android/gms/internal/ads/ZI;

.field private F:Z

.field private G:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ZI;Lcom/google/android/gms/internal/ads/eJ;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pk;-><init>()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/eJ;->S()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/pL;->C:Landroid/view/View;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/eJ;->W()Ls3/Y0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/pL;->D:Ls3/Y0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pL;->E:Lcom/google/android/gms/internal/ads/ZI;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/pL;->F:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/pL;->G:Z

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/eJ;->f0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/eJ;->f0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/Ot;->Q0(Lcom/google/android/gms/internal/ads/ah;)V

    :cond_0
    return-void
.end method

.method private final g()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pL;->C:Landroid/view/View;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pL;->C:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final i()V
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pL;->E:Lcom/google/android/gms/internal/ads/ZI;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pL;->C:Landroid/view/View;

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v2

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/pL;->C:Landroid/view/View;

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/ZI;->H(Landroid/view/View;)Z

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/ZI;->j(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Z)V

    :cond_0
    return-void
.end method

.method private static final o6(Lcom/google/android/gms/internal/ads/tk;I)V
    .locals 0

    .prologue
    :try_start_0
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/tk;->F(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string p1, "#007 Could not call remote method."

    invoke-static {p1, p0}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final b()Ls3/Y0;
    .locals 1

    .prologue
    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/pL;->F:Z

    if-eqz v0, :cond_0

    const-string v0, "getVideoController: Instream ad should not be used after destroyed"

    invoke-static {v0}, Lw3/p;->d(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pL;->D:Ls3/Y0;

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/lh;
    .locals 3

    .prologue
    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/pL;->F:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "getVideoController: Instream ad should not be used after destroyed"

    invoke-static {v0}, Lw3/p;->d(Ljava/lang/String;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pL;->E:Lcom/google/android/gms/internal/ads/ZI;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ZI;->Q()Lcom/google/android/gms/internal/ads/bJ;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ZI;->Q()Lcom/google/android/gms/internal/ads/bJ;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bJ;->a()Lcom/google/android/gms/internal/ads/lh;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1
.end method

.method public final f()V
    .locals 1

    .prologue
    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pL;->g()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pL;->E:Lcom/google/android/gms/internal/ads/ZI;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->a()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/pL;->E:Lcom/google/android/gms/internal/ads/ZI;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/pL;->C:Landroid/view/View;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/pL;->D:Ls3/Y0;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/pL;->F:Z

    return-void
.end method

.method public final h3(LX3/a;Lcom/google/android/gms/internal/ads/tk;)V
    .locals 3

    .prologue
    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/pL;->F:Z

    if-eqz v0, :cond_0

    const-string p1, "Instream ad can not be shown after destroy()."

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    const/4 p1, 0x2

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/pL;->o6(Lcom/google/android/gms/internal/ads/tk;I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pL;->C:Landroid/view/View;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pL;->D:Ls3/Y0;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/pL;->G:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    const-string p1, "Instream ad should not be used again."

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    invoke-static {p2, v1}, Lcom/google/android/gms/internal/ads/pL;->o6(Lcom/google/android/gms/internal/ads/tk;I)V

    return-void

    :cond_2
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/pL;->G:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pL;->g()V

    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pL;->C:Landroid/view/View;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {}, Lr3/v;->B()Lcom/google/android/gms/internal/ads/ur;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/pL;->C:Landroid/view/View;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/ur;->a(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-static {}, Lr3/v;->B()Lcom/google/android/gms/internal/ads/ur;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/pL;->C:Landroid/view/View;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/ur;->b(Landroid/view/View;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pL;->i()V

    :try_start_0
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/tk;->e()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "#007 Could not call remote method."

    invoke-static {p2, p1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_3
    :goto_0
    if-nez v0, :cond_4

    const-string p1, "can not get video view."

    goto :goto_1

    :cond_4
    const-string p1, "can not get video controller."

    :goto_1
    const-string v0, "Instream internal error: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/pL;->o6(Lcom/google/android/gms/internal/ads/tk;I)V

    return-void
.end method

.method public final onGlobalLayout()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pL;->i()V

    return-void
.end method

.method public final onScrollChanged()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/pL;->i()V

    return-void
.end method

.method public final zze(LX3/a;)V
    .locals 1

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/oL;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/oL;-><init>(Lcom/google/android/gms/internal/ads/pL;)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/pL;->h3(LX3/a;Lcom/google/android/gms/internal/ads/tk;)V

    return-void
.end method
