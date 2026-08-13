.class public final Lcom/google/android/gms/internal/ads/xQ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Yk0;

.field private final b:Lcom/google/android/gms/internal/ads/Yk0;

.field private final c:Lcom/google/android/gms/internal/ads/gR;

.field private final d:Lcom/google/android/gms/internal/ads/Uy0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/gR;Lcom/google/android/gms/internal/ads/Uy0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xQ;->a:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/xQ;->b:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/xQ;->c:Lcom/google/android/gms/internal/ads/gR;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/xQ;->d:Lcom/google/android/gms/internal/ads/Uy0;

    return-void
.end method


# virtual methods
.method final synthetic a(Lcom/google/android/gms/internal/ads/Po;)Lcom/google/android/gms/internal/ads/BR;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xQ;->c:Lcom/google/android/gms/internal/ads/gR;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/gR;->c(Lcom/google/android/gms/internal/ads/Po;)LP4/d;

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

.method final synthetic b(Lcom/google/android/gms/internal/ads/Po;ILcom/google/android/gms/internal/ads/AR;)LP4/d;
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    iget-object p3, p1, Lcom/google/android/gms/internal/ads/Po;->O:Landroid/os/Bundle;

    if-eqz p3, :cond_0

    const-string v0, "ls"

    const/4 v1, 0x1

    invoke-virtual {p3, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_0
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/xQ;->d:Lcom/google/android/gms/internal/ads/Uy0;

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/Uy0;->b()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/ads/gS;

    invoke-virtual {p3, p1, p2}, Lcom/google/android/gms/internal/ads/gS;->p6(Lcom/google/android/gms/internal/ads/Po;I)LP4/d;

    move-result-object p2

    new-instance p3, Lcom/google/android/gms/internal/ads/tQ;

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/ads/tQ;-><init>(Lcom/google/android/gms/internal/ads/Po;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/xQ;->b:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lcom/google/android/gms/internal/ads/Po;)LP4/d;
    .locals 4

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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xQ;->a:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/uQ;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/uQ;-><init>(Lcom/google/android/gms/internal/ads/xQ;Lcom/google/android/gms/internal/ads/Po;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/vQ;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/vQ;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/xQ;->b:Lcom/google/android/gms/internal/ads/Yk0;

    const-class v3, Ljava/util/concurrent/ExecutionException;

    invoke-static {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->f(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    :goto_0
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    new-instance v2, Lcom/google/android/gms/internal/ads/wQ;

    invoke-direct {v2, p0, p1, v1}, Lcom/google/android/gms/internal/ads/wQ;-><init>(Lcom/google/android/gms/internal/ads/xQ;Lcom/google/android/gms/internal/ads/Po;I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/xQ;->b:Lcom/google/android/gms/internal/ads/Yk0;

    const-class v1, Lcom/google/android/gms/internal/ads/AR;

    invoke-static {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/Nk0;->f(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1
.end method
