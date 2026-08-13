.class final Lcom/google/android/gms/internal/ads/Q50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/kY;

.field final synthetic b:Lcom/google/android/gms/internal/ads/Q90;

.field final synthetic c:Lcom/google/android/gms/internal/ads/E90;

.field final synthetic d:Lcom/google/android/gms/internal/ads/QH;

.field final synthetic e:Lcom/google/android/gms/internal/ads/R50;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/R50;Lcom/google/android/gms/internal/ads/kY;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;Lcom/google/android/gms/internal/ads/QH;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Q50;->a:Lcom/google/android/gms/internal/ads/kY;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Q50;->b:Lcom/google/android/gms/internal/ads/Q90;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Q50;->c:Lcom/google/android/gms/internal/ads/E90;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/Q50;->d:Lcom/google/android/gms/internal/ads/QH;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Q50;->e:Lcom/google/android/gms/internal/ads/R50;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 5

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->G5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Interstitial ad failed to load"

    invoke-static {v0, p1}, Lv3/q0;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q50;->d:Lcom/google/android/gms/internal/ads/QH;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/QH;->a()Lcom/google/android/gms/internal/ads/LA;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/LA;->a(Ljava/lang/Throwable;)Ls3/W0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q50;->e:Lcom/google/android/gms/internal/ads/R50;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Q50;->e:Lcom/google/android/gms/internal/ads/R50;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/R50;->g(Lcom/google/android/gms/internal/ads/R50;LP4/d;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Q50;->d:Lcom/google/android/gms/internal/ads/QH;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/QH;->b()Lcom/google/android/gms/internal/ads/GC;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/GC;->u0(Ls3/W0;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->c8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Q50;->e:Lcom/google/android/gms/internal/ads/R50;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/R50;->f(Lcom/google/android/gms/internal/ads/R50;)Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/M50;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/ads/M50;-><init>(Lcom/google/android/gms/internal/ads/Q50;Ls3/W0;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Q50;->e:Lcom/google/android/gms/internal/ads/R50;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/R50;->f(Lcom/google/android/gms/internal/ads/R50;)Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/N50;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/ads/N50;-><init>(Lcom/google/android/gms/internal/ads/Q50;Ls3/W0;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    iget v2, v0, Ls3/W0;->C:I

    const-string v3, "InterstitialAdLoader.onFailure"

    invoke-static {v2, p1, v3}, Lcom/google/android/gms/internal/ads/L70;->b(ILjava/lang/Throwable;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Q50;->a:Lcom/google/android/gms/internal/ads/kY;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/kY;->a()V

    sget-object v2, Lcom/google/android/gms/internal/ads/vg;->c:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Q50;->b:Lcom/google/android/gms/internal/ads/Q90;

    if-eqz v2, :cond_2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/Q90;->c(Ls3/W0;)Lcom/google/android/gms/internal/ads/Q90;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q50;->c:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/E90;->c(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/Q90;->a(Lcom/google/android/gms/internal/ads/E90;)Lcom/google/android/gms/internal/ads/Q90;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Q90;->h()V

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Q50;->e:Lcom/google/android/gms/internal/ads/R50;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/R50;->e(Lcom/google/android/gms/internal/ads/R50;)Lcom/google/android/gms/internal/ads/T90;

    move-result-object v2

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/Q50;->c:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v4, v0}, Lcom/google/android/gms/internal/ads/E90;->p(Ls3/W0;)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v4, p1}, Lcom/google/android/gms/internal/ads/E90;->c(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v4, v3}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/E90;->m()Lcom/google/android/gms/internal/ads/J90;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/T90;->b(Lcom/google/android/gms/internal/ads/J90;)V

    :goto_1
    monitor-exit v1

    return-void

    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 5

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/lH;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q50;->e:Lcom/google/android/gms/internal/ads/R50;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q50;->e:Lcom/google/android/gms/internal/ads/R50;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/R50;->g(Lcom/google/android/gms/internal/ads/R50;LP4/d;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->c8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->e()Lcom/google/android/gms/internal/ads/OE;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Q50;->e:Lcom/google/android/gms/internal/ads/R50;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/R50;->c(Lcom/google/android/gms/internal/ads/R50;)Lcom/google/android/gms/internal/ads/UX;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/OE;->a(Lcom/google/android/gms/internal/ads/UX;)Lcom/google/android/gms/internal/ads/OE;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Q50;->e:Lcom/google/android/gms/internal/ads/R50;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/R50;->d(Lcom/google/android/gms/internal/ads/R50;)Lcom/google/android/gms/internal/ads/t60;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/OE;->d(Lcom/google/android/gms/internal/ads/t60;)Lcom/google/android/gms/internal/ads/OE;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Q50;->a:Lcom/google/android/gms/internal/ads/kY;

    invoke-interface {v2, p1}, Lcom/google/android/gms/internal/ads/kY;->c(Ljava/lang/Object;)V

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q50;->e:Lcom/google/android/gms/internal/ads/R50;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/R50;->f(Lcom/google/android/gms/internal/ads/R50;)Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/O50;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/O50;-><init>(Lcom/google/android/gms/internal/ads/Q50;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q50;->e:Lcom/google/android/gms/internal/ads/R50;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/R50;->f(Lcom/google/android/gms/internal/ads/R50;)Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/P50;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/P50;-><init>(Lcom/google/android/gms/internal/ads/Q50;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/ads/vg;->c:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q50;->b:Lcom/google/android/gms/internal/ads/Q90;

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->g()Lcom/google/android/gms/internal/ads/e70;

    move-result-object v3

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/Q90;->g(Lcom/google/android/gms/internal/ads/c70;)Lcom/google/android/gms/internal/ads/Q90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->c()Lcom/google/android/gms/internal/ads/xC;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/xC;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/Q90;->e(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Q90;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Q50;->c:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/Q90;->a(Lcom/google/android/gms/internal/ads/E90;)Lcom/google/android/gms/internal/ads/Q90;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Q90;->h()V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q50;->e:Lcom/google/android/gms/internal/ads/R50;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/R50;->e(Lcom/google/android/gms/internal/ads/R50;)Lcom/google/android/gms/internal/ads/T90;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Q50;->c:Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->g()Lcom/google/android/gms/internal/ads/e70;

    move-result-object v4

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/E90;->a(Lcom/google/android/gms/internal/ads/c70;)Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->c()Lcom/google/android/gms/internal/ads/xC;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/xC;->i()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/ads/E90;->Z(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/E90;->m()Lcom/google/android/gms/internal/ads/J90;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/T90;->b(Lcom/google/android/gms/internal/ads/J90;)V

    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
