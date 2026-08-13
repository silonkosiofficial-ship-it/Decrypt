.class public final Lcom/google/android/gms/internal/ads/QQ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/concurrent/ScheduledExecutorService;

.field private final b:Lcom/google/android/gms/internal/ads/Yk0;

.field private final c:Lcom/google/android/gms/internal/ads/Yk0;

.field private final d:Lcom/google/android/gms/internal/ads/mR;

.field private final e:Lcom/google/android/gms/internal/ads/Uy0;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/mR;Lcom/google/android/gms/internal/ads/Uy0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/QQ;->a:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/QQ;->b:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/QQ;->c:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/QQ;->d:Lcom/google/android/gms/internal/ads/mR;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/QQ;->e:Lcom/google/android/gms/internal/ads/Uy0;

    return-void
.end method


# virtual methods
.method final synthetic a(Lcom/google/android/gms/internal/ads/Po;)Lcom/google/android/gms/internal/ads/BR;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/QQ;->d:Lcom/google/android/gms/internal/ads/mR;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/mR;->c(Lcom/google/android/gms/internal/ads/Po;)LP4/d;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->y5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/BR;

    return-object p1
.end method

.method final synthetic b(Lcom/google/android/gms/internal/ads/Po;ILjava/lang/Throwable;)LP4/d;
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    iget-object p3, p1, Lcom/google/android/gms/internal/ads/Po;->O:Landroid/os/Bundle;

    if-eqz p3, :cond_0

    const-string v0, "ls"

    const/4 v1, 0x1

    invoke-virtual {p3, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_0
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/QQ;->e:Lcom/google/android/gms/internal/ads/Uy0;

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/Uy0;->b()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/ads/gS;

    invoke-virtual {p3, p1, p2}, Lcom/google/android/gms/internal/ads/gS;->q6(Lcom/google/android/gms/internal/ads/Po;I)LP4/d;

    move-result-object p2

    new-instance p3, Lcom/google/android/gms/internal/ads/NQ;

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/ads/NQ;-><init>(Lcom/google/android/gms/internal/ads/Po;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/QQ;->b:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lcom/google/android/gms/internal/ads/Po;)LP4/d;
    .locals 6

    .prologue
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/Po;->F:Ljava/lang/String;

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    invoke-static {v0}, Lv3/E0;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/AR;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/AR;-><init>(I)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->n7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/QQ;->c:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/OQ;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/OQ;-><init>(Lcom/google/android/gms/internal/ads/QQ;Lcom/google/android/gms/internal/ads/Po;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/QQ;->d:Lcom/google/android/gms/internal/ads/mR;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/mR;->c(Lcom/google/android/gms/internal/ads/Po;)LP4/d;

    move-result-object v0

    :goto_0
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Dk0;->D(LP4/d;)Lcom/google/android/gms/internal/ads/Dk0;

    move-result-object v0

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->y5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/QQ;->a:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v2, v3, v5, v4}, Lcom/google/android/gms/internal/ads/Nk0;->o(LP4/d;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)LP4/d;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Dk0;

    new-instance v2, Lcom/google/android/gms/internal/ads/PQ;

    invoke-direct {v2, p0, p1, v1}, Lcom/google/android/gms/internal/ads/PQ;-><init>(Lcom/google/android/gms/internal/ads/QQ;Lcom/google/android/gms/internal/ads/Po;I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/QQ;->b:Lcom/google/android/gms/internal/ads/Yk0;

    const-class v1, Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/Nk0;->f(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Dk0;

    return-object p1
.end method
