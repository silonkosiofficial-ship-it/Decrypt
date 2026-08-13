.class public final Lcom/google/android/gms/internal/ads/vA;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/util/concurrent/ScheduledExecutorService;

.field private final c:LP4/d;

.field private volatile d:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;LP4/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/vA;->d:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vA;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/vA;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/vA;->c:LP4/d;

    return-void
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/vA;Ljava/util/List;Lcom/google/android/gms/internal/ads/Jk0;)V
    .locals 5

    .prologue
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP4/d;

    new-instance v2, Lcom/google/android/gms/internal/ads/rA;

    invoke-direct {v2, p2}, Lcom/google/android/gms/internal/ads/rA;-><init>(Lcom/google/android/gms/internal/ads/Jk0;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/vA;->a:Ljava/util/concurrent/Executor;

    const-class v4, Ljava/lang/Throwable;

    invoke-static {v0, v4, v2, v3}, Lcom/google/android/gms/internal/ads/Nk0;->f(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/ads/sA;

    invoke-direct {v2, p0, p2, v1}, Lcom/google/android/gms/internal/ads/sA;-><init>(Lcom/google/android/gms/internal/ads/vA;Lcom/google/android/gms/internal/ads/Jk0;LP4/d;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/vA;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v2, v1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/uA;

    invoke-direct {p1, p0, p2}, Lcom/google/android/gms/internal/ads/uA;-><init>(Lcom/google/android/gms/internal/ads/vA;Lcom/google/android/gms/internal/ads/Jk0;)V

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/vA;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, p1, p0}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_2
    :goto_1
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/vA;->a:Ljava/util/concurrent/Executor;

    new-instance p1, Lcom/google/android/gms/internal/ads/qA;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/qA;-><init>(Lcom/google/android/gms/internal/ads/Jk0;)V

    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/vA;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->f:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/pA;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/pA;-><init>(Lcom/google/android/gms/internal/ads/vA;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method final synthetic a(Lcom/google/android/gms/internal/ads/Jk0;LP4/d;Lcom/google/android/gms/internal/ads/fA;)LP4/d;
    .locals 2

    .prologue
    if-eqz p3, :cond_0

    invoke-interface {p1, p3}, Lcom/google/android/gms/internal/ads/Jk0;->c(Ljava/lang/Object;)V

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/Pg;->a:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/vA;->b:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p2, v0, v1, p3, p1}, Lcom/google/android/gms/internal/ads/Nk0;->o(LP4/d;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method final synthetic d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/vA;->d:Z

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/ads/Jk0;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/tA;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/tA;-><init>(Lcom/google/android/gms/internal/ads/vA;Lcom/google/android/gms/internal/ads/Jk0;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/vA;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/vA;->c:LP4/d;

    invoke-static {v1, v0, p1}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/vA;->d:Z

    return v0
.end method
