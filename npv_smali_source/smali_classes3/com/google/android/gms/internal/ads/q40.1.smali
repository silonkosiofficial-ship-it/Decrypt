.class final Lcom/google/android/gms/internal/ads/q40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/kY;

.field final synthetic b:Lcom/google/android/gms/internal/ads/Q90;

.field final synthetic c:Lcom/google/android/gms/internal/ads/E90;

.field final synthetic d:Lcom/google/android/gms/internal/ads/r40;

.field final synthetic e:Lcom/google/android/gms/internal/ads/t40;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/t40;Lcom/google/android/gms/internal/ads/kY;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;Lcom/google/android/gms/internal/ads/r40;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/q40;->a:Lcom/google/android/gms/internal/ads/kY;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/q40;->b:Lcom/google/android/gms/internal/ads/Q90;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/q40;->c:Lcom/google/android/gms/internal/ads/E90;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/q40;->d:Lcom/google/android/gms/internal/ads/r40;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/q40;->e:Lcom/google/android/gms/internal/ads/t40;

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

    const-string v0, "App open ad failed to load"

    invoke-static {v0, p1}, Lv3/q0;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q40;->e:Lcom/google/android/gms/internal/ads/t40;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/t40;->g(Lcom/google/android/gms/internal/ads/t40;)Lcom/google/android/gms/internal/ads/F50;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/F50;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zy;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/P70;->b(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/bU;)Ls3/W0;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/jC;->b()Lcom/google/android/gms/internal/ads/LA;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/LA;->a(Ljava/lang/Throwable;)Ls3/W0;

    move-result-object v2

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/q40;->e:Lcom/google/android/gms/internal/ads/t40;

    monitor-enter v3

    :try_start_0
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/q40;->e:Lcom/google/android/gms/internal/ads/t40;

    invoke-static {v4, v1}, Lcom/google/android/gms/internal/ads/t40;->j(Lcom/google/android/gms/internal/ads/t40;LP4/d;)V

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zy;->c()Lcom/google/android/gms/internal/ads/GC;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/GC;->u0(Ls3/W0;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->b8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q40;->e:Lcom/google/android/gms/internal/ads/t40;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/t40;->i(Lcom/google/android/gms/internal/ads/t40;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/p40;

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/ads/p40;-><init>(Lcom/google/android/gms/internal/ads/q40;Ls3/W0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q40;->e:Lcom/google/android/gms/internal/ads/t40;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/t40;->f(Lcom/google/android/gms/internal/ads/t40;)Lcom/google/android/gms/internal/ads/K40;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/K40;->u0(Ls3/W0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q40;->e:Lcom/google/android/gms/internal/ads/t40;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/q40;->d:Lcom/google/android/gms/internal/ads/r40;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/t40;->d(Lcom/google/android/gms/internal/ads/t40;Lcom/google/android/gms/internal/ads/D50;)Lcom/google/android/gms/internal/ads/iC;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/iC;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/jC;->b()Lcom/google/android/gms/internal/ads/LA;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/LA;->c()Lcom/google/android/gms/internal/ads/sF;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sF;->g()V

    :cond_3
    :goto_1
    iget v0, v2, Ls3/W0;->C:I

    const-string v1, "AppOpenAdLoader.onFailure"

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/internal/ads/L70;->b(ILjava/lang/Throwable;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q40;->a:Lcom/google/android/gms/internal/ads/kY;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/kY;->a()V

    sget-object v0, Lcom/google/android/gms/internal/ads/vg;->c:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q40;->b:Lcom/google/android/gms/internal/ads/Q90;

    if-eqz v0, :cond_4

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/Q90;->c(Ls3/W0;)Lcom/google/android/gms/internal/ads/Q90;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/q40;->c:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v2, p1}, Lcom/google/android/gms/internal/ads/E90;->c(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/Q90;->a(Lcom/google/android/gms/internal/ads/E90;)Lcom/google/android/gms/internal/ads/Q90;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Q90;->h()V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q40;->e:Lcom/google/android/gms/internal/ads/t40;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/t40;->h(Lcom/google/android/gms/internal/ads/t40;)Lcom/google/android/gms/internal/ads/T90;

    move-result-object v0

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/q40;->c:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v4, v2}, Lcom/google/android/gms/internal/ads/E90;->p(Ls3/W0;)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v4, p1}, Lcom/google/android/gms/internal/ads/E90;->c(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v4, v1}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/E90;->m()Lcom/google/android/gms/internal/ads/J90;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/T90;->b(Lcom/google/android/gms/internal/ads/J90;)V

    :goto_2
    monitor-exit v3

    return-void

    :goto_3
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 5

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/fA;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q40;->e:Lcom/google/android/gms/internal/ads/t40;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/q40;->e:Lcom/google/android/gms/internal/ads/t40;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/t40;->j(Lcom/google/android/gms/internal/ads/t40;LP4/d;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->b8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->e()Lcom/google/android/gms/internal/ads/OE;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/q40;->e:Lcom/google/android/gms/internal/ads/t40;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/t40;->f(Lcom/google/android/gms/internal/ads/t40;)Lcom/google/android/gms/internal/ads/K40;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/OE;->b(Lcom/google/android/gms/internal/ads/K40;)Lcom/google/android/gms/internal/ads/OE;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/q40;->a:Lcom/google/android/gms/internal/ads/kY;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/kY;->c(Ljava/lang/Object;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/vg;->c:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/q40;->b:Lcom/google/android/gms/internal/ads/Q90;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->g()Lcom/google/android/gms/internal/ads/e70;

    move-result-object v3

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/Q90;->g(Lcom/google/android/gms/internal/ads/c70;)Lcom/google/android/gms/internal/ads/Q90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->c()Lcom/google/android/gms/internal/ads/xC;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/xC;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/Q90;->e(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Q90;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/q40;->c:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/Q90;->a(Lcom/google/android/gms/internal/ads/E90;)Lcom/google/android/gms/internal/ads/Q90;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Q90;->h()V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/q40;->e:Lcom/google/android/gms/internal/ads/t40;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/t40;->h(Lcom/google/android/gms/internal/ads/t40;)Lcom/google/android/gms/internal/ads/T90;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/q40;->c:Lcom/google/android/gms/internal/ads/E90;

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
