.class public abstract Lcom/google/android/gms/internal/ads/Ik0;
.super Lcom/google/android/gms/internal/ads/Gk0;
.source "SourceFile"

# interfaces
.implements LP4/d;


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Gk0;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Ik0;->q()LP4/d;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method protected abstract q()LP4/d;
.end method
