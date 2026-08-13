.class public abstract Lk3/k;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# instance fields
.field protected final C:Ls3/i1;


# direct methods
.method protected constructor <init>(Landroid/content/Context;I)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    new-instance p1, Ls3/i1;

    invoke-direct {p1, p0, p2}, Ls3/i1;-><init>(Landroid/view/ViewGroup;I)V

    iput-object p1, p0, Lk3/k;->C:Ls3/i1;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Af;->a(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Ag;->e:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Ya:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lw3/c;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lk3/B;

    invoke-direct {v1, p0}, Lk3/B;-><init>(Lk3/k;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lk3/k;->C:Ls3/i1;

    invoke-virtual {v0}, Ls3/i1;->k()V

    return-void
.end method

.method public b(Lk3/g;)V
    .locals 2

    .prologue
    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Af;->a(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Ag;->f:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->bb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lw3/c;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lk3/D;

    invoke-direct {v1, p0, p1}, Lk3/D;-><init>(Lk3/k;Lk3/g;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lk3/k;->C:Ls3/i1;

    iget-object p1, p1, Lk3/g;->a:Ls3/f1;

    invoke-virtual {v0, p1}, Ls3/i1;->m(Ls3/f1;)V

    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Af;->a(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Ag;->g:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Za:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lw3/c;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lk3/C;

    invoke-direct {v1, p0}, Lk3/C;-><init>(Lk3/k;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lk3/k;->C:Ls3/i1;

    invoke-virtual {v0}, Ls3/i1;->n()V

    return-void
.end method

.method public d()V
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Af;->a(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Ag;->h:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Xa:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lw3/c;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lk3/A;

    invoke-direct {v1, p0}, Lk3/A;-><init>(Lk3/k;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lk3/k;->C:Ls3/i1;

    invoke-virtual {v0}, Ls3/i1;->o()V

    return-void
.end method

.method public getAdListener()Lk3/d;
    .locals 1

    iget-object v0, p0, Lk3/k;->C:Ls3/i1;

    invoke-virtual {v0}, Ls3/i1;->c()Lk3/d;

    move-result-object v0

    return-object v0
.end method

.method public getAdSize()Lk3/h;
    .locals 1

    iget-object v0, p0, Lk3/k;->C:Ls3/i1;

    invoke-virtual {v0}, Ls3/i1;->d()Lk3/h;

    move-result-object v0

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk3/k;->C:Ls3/i1;

    invoke-virtual {v0}, Ls3/i1;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOnPaidEventListener()Lk3/o;
    .locals 1

    iget-object v0, p0, Lk3/k;->C:Ls3/i1;

    invoke-virtual {v0}, Ls3/i1;->e()Lk3/o;

    const/4 v0, 0x0

    return-object v0
.end method

.method public getResponseInfo()Lk3/u;
    .locals 1

    iget-object v0, p0, Lk3/k;->C:Ls3/i1;

    invoke-virtual {v0}, Ls3/i1;->f()Lk3/u;

    move-result-object v0

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 2

    .prologue
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    sub-int/2addr p4, p2

    sub-int/2addr p4, v0

    sub-int/2addr p5, p3

    sub-int/2addr p5, v1

    div-int/lit8 p4, p4, 0x2

    div-int/lit8 p5, p5, 0x2

    add-int/2addr v0, p4

    add-int/2addr v1, p5

    invoke-virtual {p1, p4, p5, v0, v1}, Landroid/view/View;->layout(IIII)V

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_0

    invoke-virtual {p0, v1, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    goto :goto_1

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lk3/k;->getAdSize()Lk3/h;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Unable to retrieve ad size."

    invoke-static {v2, v1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1, v0}, Lk3/h;->d(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v1, v0}, Lk3/h;->b(Landroid/content/Context;)I

    move-result v0

    move v1, v0

    move v0, v2

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    move-result p1

    invoke-static {v1, p2}, Landroid/view/View;->resolveSize(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public setAdListener(Lk3/d;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lk3/k;->C:Ls3/i1;

    invoke-virtual {v0, p1}, Ls3/i1;->q(Lk3/d;)V

    if-nez p1, :cond_0

    iget-object p1, p0, Lk3/k;->C:Ls3/i1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ls3/i1;->p(Ls3/a;)V

    return-void

    :cond_0
    instance-of v0, p1, Ls3/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lk3/k;->C:Ls3/i1;

    move-object v1, p1

    check-cast v1, Ls3/a;

    invoke-virtual {v0, v1}, Ls3/i1;->p(Ls3/a;)V

    :cond_1
    instance-of v0, p1, Ll3/c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lk3/k;->C:Ls3/i1;

    check-cast p1, Ll3/c;

    invoke-virtual {v0, p1}, Ls3/i1;->u(Ll3/c;)V

    :cond_2
    return-void
.end method

.method public setAdSize(Lk3/h;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Lk3/h;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iget-object p1, p0, Lk3/k;->C:Ls3/i1;

    invoke-virtual {p1, v0}, Ls3/i1;->r([Lk3/h;)V

    return-void
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lk3/k;->C:Ls3/i1;

    invoke-virtual {v0, p1}, Ls3/i1;->t(Ljava/lang/String;)V

    return-void
.end method

.method public setOnPaidEventListener(Lk3/o;)V
    .locals 1

    iget-object v0, p0, Lk3/k;->C:Ls3/i1;

    invoke-virtual {v0, p1}, Ls3/i1;->v(Lk3/o;)V

    return-void
.end method
