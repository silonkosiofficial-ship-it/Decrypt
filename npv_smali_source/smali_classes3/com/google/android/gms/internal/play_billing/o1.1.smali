.class public abstract Lcom/google/android/gms/internal/play_billing/o1;
.super Lcom/google/android/gms/internal/play_billing/q1;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/x1;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/play_billing/r1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/play_billing/r1;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static b(Lcom/google/android/gms/internal/play_billing/x1;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/play_billing/x1;
    .locals 0

    .prologue
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    const-wide/16 p1, 0x6f54

    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/play_billing/J1;->C(Lcom/google/android/gms/internal/play_billing/x1;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/play_billing/x1;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lcom/google/android/gms/internal/play_billing/x1;Lcom/google/android/gms/internal/play_billing/m1;Ljava/util/concurrent/Executor;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/play_billing/n1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/play_billing/n1;-><init>(Ljava/util/concurrent/Future;Lcom/google/android/gms/internal/play_billing/m1;)V

    invoke-interface {p0, v0, p2}, Lcom/google/android/gms/internal/play_billing/x1;->g(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method
