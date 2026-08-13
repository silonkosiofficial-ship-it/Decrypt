.class final Lcom/google/android/gms/internal/ads/uK0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/vK0;


# instance fields
.field final synthetic C:Ljava/util/concurrent/Executor;

.field final synthetic D:Lcom/google/android/gms/internal/ads/rF;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/rF;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uK0;->C:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uK0;->D:Lcom/google/android/gms/internal/ads/rF;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uK0;->D:Lcom/google/android/gms/internal/ads/rF;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/uK0;->C:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/rF;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uK0;->C:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
