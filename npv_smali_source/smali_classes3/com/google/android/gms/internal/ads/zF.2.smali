.class public final synthetic Lcom/google/android/gms/internal/ads/zF;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/AF;

.field public final synthetic D:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/AF;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zF;->C:Lcom/google/android/gms/internal/ads/AF;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zF;->D:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zF;->C:Lcom/google/android/gms/internal/ads/AF;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zF;->D:Ljava/lang/Object;

    :try_start_0
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/AF;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v1, "EventEmitter.notify"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/Uq;->w(Ljava/lang/Throwable;Ljava/lang/String;)V

    const-string v1, "Event emitter exception."

    invoke-static {v1, v0}, Lv3/q0;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
