.class abstract Lcom/google/android/gms/internal/ads/mk0;
.super Lcom/google/android/gms/internal/ads/rk0;
.source "SourceFile"


# static fields
.field private static final Q:Lcom/google/android/gms/internal/ads/Wk0;


# instance fields
.field private N:Lcom/google/android/gms/internal/ads/Xh0;

.field private final O:Z

.field private final P:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Wk0;

    const-class v1, Lcom/google/android/gms/internal/ads/mk0;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/Wk0;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/mk0;->Q:Lcom/google/android/gms/internal/ads/Wk0;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/ads/Xh0;ZZ)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/rk0;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/mk0;->N:Lcom/google/android/gms/internal/ads/Xh0;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/mk0;->O:Z

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/mk0;->P:Z

    return-void
.end method

.method private final L(ILjava/util/concurrent/Future;)V
    .locals 0

    .prologue
    :try_start_0
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/rl0;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/mk0;->R(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :goto_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/mk0;->N(Ljava/lang/Throwable;)V

    return-void

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/mk0;->N(Ljava/lang/Throwable;)V

    return-void
.end method

.method private final M(Lcom/google/android/gms/internal/ads/Xh0;)V
    .locals 4

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rk0;->D()I

    move-result v0

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "Less than 0 remaining futures"

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/Ag0;->m(ZLjava/lang/Object;)V

    if-nez v0, :cond_3

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Xh0;->n()Lcom/google/android/gms/internal/ads/jj0;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/ads/mk0;->L(ILjava/util/concurrent/Future;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rk0;->I()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/mk0;->S()V

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/mk0;->W(I)V

    :cond_3
    return-void
.end method

.method private final N(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/mk0;->O:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/ak0;->h(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rk0;->F()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/mk0;->Q(Ljava/util/Set;Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mk0;->O(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    :goto_0
    instance-of v0, p1, Ljava/lang/Error;

    if-eqz v0, :cond_2

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mk0;->O(Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method

.method private static O(Ljava/lang/Throwable;)V
    .locals 7

    .prologue
    const/4 v0, 0x1

    instance-of v1, p0, Ljava/lang/Error;

    if-eq v0, v1, :cond_0

    const-string v0, "Got more than one input Future failure. Logging failures after the first"

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    const-string v0, "Input Future failed with Error"

    goto :goto_0

    :goto_1
    sget-object v0, Lcom/google/android/gms/internal/ads/mk0;->Q:Lcom/google/android/gms/internal/ads/Wk0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Wk0;->a()Ljava/util/logging/Logger;

    move-result-object v1

    sget-object v2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v3, "com.google.common.util.concurrent.AggregateFuture"

    const-string v4, "log"

    move-object v6, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private final P(ILP4/d;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p2}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v1

    if-eqz v1, :cond_0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/mk0;->N:Lcom/google/android/gms/internal/ads/Xh0;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/ak0;->cancel(Z)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/mk0;->L(ILjava/util/concurrent/Future;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/mk0;->M(Lcom/google/android/gms/internal/ads/Xh0;)V

    return-void

    :goto_1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/mk0;->M(Lcom/google/android/gms/internal/ads/Xh0;)V

    throw p1
.end method

.method private static Q(Ljava/util/Set;Ljava/lang/Throwable;)Z
    .locals 1

    .prologue
    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method final J(Ljava/util/Set;)V
    .locals 1

    .prologue
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ak0;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ak0;->a()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/mk0;->Q(Ljava/util/Set;Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method abstract R(ILjava/lang/Object;)V
.end method

.method abstract S()V
.end method

.method final T()V
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mk0;->N:Lcom/google/android/gms/internal/ads/Xh0;

    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mk0;->N:Lcom/google/android/gms/internal/ads/Xh0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/mk0;->S()V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/mk0;->O:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mk0;->N:Lcom/google/android/gms/internal/ads/Xh0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Xh0;->n()Lcom/google/android/gms/internal/ads/jj0;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LP4/d;

    add-int/lit8 v3, v1, 0x1

    invoke-interface {v2}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-direct {p0, v1, v2}, Lcom/google/android/gms/internal/ads/mk0;->P(ILP4/d;)V

    goto :goto_1

    :cond_1
    new-instance v4, Lcom/google/android/gms/internal/ads/kk0;

    invoke-direct {v4, p0, v1, v2}, Lcom/google/android/gms/internal/ads/kk0;-><init>(Lcom/google/android/gms/internal/ads/mk0;ILP4/d;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/Ak0;->C:Lcom/google/android/gms/internal/ads/Ak0;

    invoke-interface {v2, v4, v1}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :goto_1
    move v1, v3

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/mk0;->P:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mk0;->N:Lcom/google/android/gms/internal/ads/Xh0;

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    new-instance v1, Lcom/google/android/gms/internal/ads/lk0;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/lk0;-><init>(Lcom/google/android/gms/internal/ads/mk0;Lcom/google/android/gms/internal/ads/Xh0;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/mk0;->N:Lcom/google/android/gms/internal/ads/Xh0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Xh0;->n()Lcom/google/android/gms/internal/ads/jj0;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LP4/d;

    invoke-interface {v3}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/mk0;->M(Lcom/google/android/gms/internal/ads/Xh0;)V

    goto :goto_3

    :cond_4
    sget-object v4, Lcom/google/android/gms/internal/ads/Ak0;->C:Lcom/google/android/gms/internal/ads/Ak0;

    invoke-interface {v3, v1, v4}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_3

    :cond_5
    return-void
.end method

.method final synthetic U(ILP4/d;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/mk0;->P(ILP4/d;)V

    return-void
.end method

.method final synthetic V(Lcom/google/android/gms/internal/ads/Xh0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/mk0;->M(Lcom/google/android/gms/internal/ads/Xh0;)V

    return-void
.end method

.method W(I)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/mk0;->N:Lcom/google/android/gms/internal/ads/Xh0;

    return-void
.end method

.method protected final c()Ljava/lang/String;
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mk0;->N:Lcom/google/android/gms/internal/ads/Xh0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "futures="

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/ak0;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final d()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mk0;->N:Lcom/google/android/gms/internal/ads/Xh0;

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/mk0;->W(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ak0;->isCancelled()Z

    move-result v2

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/2addr v1, v2

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ak0;->w()Z

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Xh0;->n()Lcom/google/android/gms/internal/ads/jj0;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Future;

    invoke-interface {v2, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_1

    :cond_1
    return-void
.end method
