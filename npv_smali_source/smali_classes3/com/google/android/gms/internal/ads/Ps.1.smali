.class final Lcom/google/android/gms/internal/ads/Ps;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Ljava/lang/String;

.field final synthetic D:Ljava/lang/String;

.field final synthetic E:I

.field final synthetic F:I

.field final synthetic G:J

.field final synthetic H:J

.field final synthetic I:Z

.field final synthetic J:I

.field final synthetic K:I

.field final synthetic L:Lcom/google/android/gms/internal/ads/Ts;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Ts;Ljava/lang/String;Ljava/lang/String;IIJJZII)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ps;->C:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Ps;->D:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/internal/ads/Ps;->E:I

    iput p5, p0, Lcom/google/android/gms/internal/ads/Ps;->F:I

    iput-wide p6, p0, Lcom/google/android/gms/internal/ads/Ps;->G:J

    iput-wide p8, p0, Lcom/google/android/gms/internal/ads/Ps;->H:J

    iput-boolean p10, p0, Lcom/google/android/gms/internal/ads/Ps;->I:Z

    iput p11, p0, Lcom/google/android/gms/internal/ads/Ps;->J:I

    iput p12, p0, Lcom/google/android/gms/internal/ads/Ps;->K:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ps;->L:Lcom/google/android/gms/internal/ads/Ts;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "event"

    const-string v2, "precacheProgress"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "src"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Ps;->C:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "cachedSrc"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Ps;->D:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/ads/Ps;->E:I

    const-string v2, "bytesLoaded"

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/ads/Ps;->F:I

    const-string v2, "totalBytes"

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/Ps;->G:J

    const-string v3, "bufferedDuration"

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/Ps;->H:J

    const-string v3, "totalDuration"

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/Ps;->I:Z

    if-eq v1, v2, :cond_0

    const-string v1, "0"

    goto :goto_0

    :cond_0
    const-string v1, "1"

    :goto_0
    const-string v2, "cacheReady"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/ads/Ps;->J:I

    const-string v2, "playerCount"

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/ads/Ps;->K:I

    const-string v2, "playerPreparedCount"

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Ps;->L:Lcom/google/android/gms/internal/ads/Ts;

    const-string v2, "onPrecacheEvent"

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/Ts;->b(Lcom/google/android/gms/internal/ads/Ts;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
