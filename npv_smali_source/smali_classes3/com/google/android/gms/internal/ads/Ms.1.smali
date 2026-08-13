.class final Lcom/google/android/gms/internal/ads/Ms;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Ljava/lang/String;

.field final synthetic D:Ljava/lang/String;

.field final synthetic E:I

.field final synthetic F:I

.field final synthetic G:Lcom/google/android/gms/internal/ads/Ts;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Ts;Ljava/lang/String;Ljava/lang/String;IIZ)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ms;->C:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Ms;->D:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/internal/ads/Ms;->E:I

    iput p5, p0, Lcom/google/android/gms/internal/ads/Ms;->F:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ms;->G:Lcom/google/android/gms/internal/ads/Ts;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "event"

    const-string v2, "precacheProgress"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "src"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Ms;->C:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "cachedSrc"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Ms;->D:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/ads/Ms;->E:I

    const-string v2, "bytesLoaded"

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/ads/Ms;->F:I

    const-string v2, "totalBytes"

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "cacheReady"

    const-string v2, "0"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Ms;->G:Lcom/google/android/gms/internal/ads/Ts;

    const-string v2, "onPrecacheEvent"

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/Ts;->b(Lcom/google/android/gms/internal/ads/Ts;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
