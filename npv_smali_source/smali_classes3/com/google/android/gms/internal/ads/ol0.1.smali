.class final Lcom/google/android/gms/internal/ads/ol0;
.super Lcom/google/android/gms/internal/ads/Vk0;
.source "SourceFile"


# instance fields
.field private final E:Ljava/util/concurrent/Callable;

.field final synthetic F:Lcom/google/android/gms/internal/ads/pl0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/pl0;Ljava/util/concurrent/Callable;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ol0;->F:Lcom/google/android/gms/internal/ads/pl0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Vk0;-><init>()V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ol0;->E:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ol0;->E:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ol0;->E:Ljava/util/concurrent/Callable;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final d(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ol0;->F:Lcom/google/android/gms/internal/ads/pl0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ak0;->h(Ljava/lang/Throwable;)Z

    return-void
.end method

.method final e(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ol0;->F:Lcom/google/android/gms/internal/ads/pl0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ak0;->f(Ljava/lang/Object;)Z

    return-void
.end method

.method final f()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ol0;->F:Lcom/google/android/gms/internal/ads/pl0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ak0;->isDone()Z

    move-result v0

    return v0
.end method
