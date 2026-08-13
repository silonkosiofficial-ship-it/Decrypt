.class final Lcom/google/android/gms/internal/ads/rY;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/kY;

.field final synthetic b:Lcom/google/android/gms/internal/ads/Q90;

.field final synthetic c:Lcom/google/android/gms/internal/ads/E90;

.field final synthetic d:Lcom/google/android/gms/internal/ads/nI;

.field final synthetic e:Lcom/google/android/gms/internal/ads/sY;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/sY;Lcom/google/android/gms/internal/ads/kY;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;Lcom/google/android/gms/internal/ads/nI;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/rY;->a:Lcom/google/android/gms/internal/ads/kY;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/rY;->b:Lcom/google/android/gms/internal/ads/Q90;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/rY;->c:Lcom/google/android/gms/internal/ads/E90;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/rY;->d:Lcom/google/android/gms/internal/ads/nI;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rY;->e:Lcom/google/android/gms/internal/ads/sY;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 4

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

    const-string v0, "Native ad failed to load"

    invoke-static {v0, p1}, Lv3/q0;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rY;->d:Lcom/google/android/gms/internal/ads/nI;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nI;->a()Lcom/google/android/gms/internal/ads/LA;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/LA;->a(Ljava/lang/Throwable;)Ls3/W0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rY;->d:Lcom/google/android/gms/internal/ads/nI;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/nI;->b()Lcom/google/android/gms/internal/ads/GC;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/GC;->u0(Ls3/W0;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rY;->e:Lcom/google/android/gms/internal/ads/sY;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/sY;->c(Lcom/google/android/gms/internal/ads/sY;)Lcom/google/android/gms/internal/ads/Su;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Su;->d()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/qY;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ads/qY;-><init>(Lcom/google/android/gms/internal/ads/rY;Ls3/W0;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget v1, v0, Ls3/W0;->C:I

    const-string v2, "NativeAdLoader.onFailure"

    invoke-static {v1, p1, v2}, Lcom/google/android/gms/internal/ads/L70;->b(ILjava/lang/Throwable;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rY;->a:Lcom/google/android/gms/internal/ads/kY;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/kY;->a()V

    sget-object v1, Lcom/google/android/gms/internal/ads/vg;->c:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rY;->b:Lcom/google/android/gms/internal/ads/Q90;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/Q90;->c(Ls3/W0;)Lcom/google/android/gms/internal/ads/Q90;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rY;->c:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/E90;->c(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/Q90;->a(Lcom/google/android/gms/internal/ads/E90;)Lcom/google/android/gms/internal/ads/Q90;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Q90;->h()V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rY;->e:Lcom/google/android/gms/internal/ads/sY;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/rY;->c:Lcom/google/android/gms/internal/ads/E90;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/sY;->e(Lcom/google/android/gms/internal/ads/sY;)Lcom/google/android/gms/internal/ads/T90;

    move-result-object v1

    invoke-interface {v3, v0}, Lcom/google/android/gms/internal/ads/E90;->p(Ls3/W0;)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/ads/E90;->c(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/E90;->m()Lcom/google/android/gms/internal/ads/J90;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/T90;->b(Lcom/google/android/gms/internal/ads/J90;)V

    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rY;->e:Lcom/google/android/gms/internal/ads/sY;

    check-cast p1, Lcom/google/android/gms/internal/ads/fA;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->e()Lcom/google/android/gms/internal/ads/OE;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/rY;->e:Lcom/google/android/gms/internal/ads/sY;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/sY;->d(Lcom/google/android/gms/internal/ads/sY;)Lcom/google/android/gms/internal/ads/iY;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/iY;->d()Lcom/google/android/gms/internal/ads/UX;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/OE;->a(Lcom/google/android/gms/internal/ads/UX;)Lcom/google/android/gms/internal/ads/OE;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rY;->a:Lcom/google/android/gms/internal/ads/kY;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/kY;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rY;->e:Lcom/google/android/gms/internal/ads/sY;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/sY;->c(Lcom/google/android/gms/internal/ads/sY;)Lcom/google/android/gms/internal/ads/Su;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Su;->d()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/pY;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/pY;-><init>(Lcom/google/android/gms/internal/ads/rY;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/vg;->c:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rY;->b:Lcom/google/android/gms/internal/ads/Q90;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->g()Lcom/google/android/gms/internal/ads/e70;

    move-result-object v3

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/Q90;->g(Lcom/google/android/gms/internal/ads/c70;)Lcom/google/android/gms/internal/ads/Q90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->c()Lcom/google/android/gms/internal/ads/xC;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/xC;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/Q90;->e(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Q90;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/rY;->c:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/Q90;->a(Lcom/google/android/gms/internal/ads/E90;)Lcom/google/android/gms/internal/ads/Q90;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Q90;->h()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/rY;->e:Lcom/google/android/gms/internal/ads/sY;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/sY;->e(Lcom/google/android/gms/internal/ads/sY;)Lcom/google/android/gms/internal/ads/T90;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/rY;->c:Lcom/google/android/gms/internal/ads/E90;

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

    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
