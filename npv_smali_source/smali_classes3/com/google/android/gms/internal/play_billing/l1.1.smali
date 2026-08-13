.class public abstract Lcom/google/android/gms/internal/play_billing/l1;
.super Lcom/google/android/gms/internal/play_billing/j1;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/x1;


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/j1;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/l1;->n()Lcom/google/android/gms/internal/play_billing/x1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/x1;->g(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method protected abstract n()Lcom/google/android/gms/internal/play_billing/x1;
.end method
