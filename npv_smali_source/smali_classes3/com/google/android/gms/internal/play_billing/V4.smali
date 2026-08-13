.class final Lcom/google/android/gms/internal/play_billing/V4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/x1;


# instance fields
.field final C:Ljava/lang/ref/WeakReference;

.field private final D:Lcom/google/android/gms/internal/play_billing/R4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/play_billing/S4;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/play_billing/U4;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/play_billing/U4;-><init>(Lcom/google/android/gms/internal/play_billing/V4;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/V4;->D:Lcom/google/android/gms/internal/play_billing/R4;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/V4;->C:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method final a(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/V4;->D:Lcom/google/android/gms/internal/play_billing/R4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/R4;->c(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method final b(Ljava/lang/Throwable;)Z
    .locals 3

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/play_billing/W2;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/play_billing/W2;-><init>(Ljava/lang/Throwable;)V

    sget-object p1, Lcom/google/android/gms/internal/play_billing/R4;->H:Lcom/google/android/gms/internal/play_billing/D1;

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/V4;->D:Lcom/google/android/gms/internal/play_billing/R4;

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/D1;->d(Lcom/google/android/gms/internal/play_billing/R4;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/R4;->b(Lcom/google/android/gms/internal/play_billing/R4;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final cancel(Z)Z
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/V4;->C:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/S4;

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/V4;->D:Lcom/google/android/gms/internal/play_billing/R4;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/play_billing/R4;->cancel(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/S4;->a()V

    const/4 p1, 0x1

    :cond_0
    return p1
.end method

.method public final g(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/V4;->D:Lcom/google/android/gms/internal/play_billing/R4;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/R4;->g(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/V4;->D:Lcom/google/android/gms/internal/play_billing/R4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/R4;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/V4;->D:Lcom/google/android/gms/internal/play_billing/R4;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/R4;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final isCancelled()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/V4;->D:Lcom/google/android/gms/internal/play_billing/R4;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/R4;->C:Ljava/lang/Object;

    instance-of v0, v0, Lcom/google/android/gms/internal/play_billing/d2;

    return v0
.end method

.method public final isDone()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/V4;->D:Lcom/google/android/gms/internal/play_billing/R4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/R4;->isDone()Z

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/V4;->D:Lcom/google/android/gms/internal/play_billing/R4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/R4;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
