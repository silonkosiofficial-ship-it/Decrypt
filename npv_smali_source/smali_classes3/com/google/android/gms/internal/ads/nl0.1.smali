.class final Lcom/google/android/gms/internal/ads/nl0;
.super Lcom/google/android/gms/internal/ads/Vk0;
.source "SourceFile"


# instance fields
.field private final E:Lcom/google/android/gms/internal/ads/sk0;

.field final synthetic F:Lcom/google/android/gms/internal/ads/pl0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/pl0;Lcom/google/android/gms/internal/ads/sk0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nl0;->F:Lcom/google/android/gms/internal/ads/pl0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Vk0;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/nl0;->E:Lcom/google/android/gms/internal/ads/sk0;

    return-void
.end method


# virtual methods
.method final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nl0;->E:Lcom/google/android/gms/internal/ads/sk0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/sk0;->a()LP4/d;

    move-result-object v1

    const-string v2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/Ag0;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nl0;->E:Lcom/google/android/gms/internal/ads/sk0;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final d(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nl0;->F:Lcom/google/android/gms/internal/ads/pl0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ak0;->h(Ljava/lang/Throwable;)Z

    return-void
.end method

.method final synthetic e(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nl0;->F:Lcom/google/android/gms/internal/ads/pl0;

    check-cast p1, LP4/d;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ak0;->v(LP4/d;)Z

    return-void
.end method

.method final f()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nl0;->F:Lcom/google/android/gms/internal/ads/pl0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ak0;->isDone()Z

    move-result v0

    return v0
.end method
