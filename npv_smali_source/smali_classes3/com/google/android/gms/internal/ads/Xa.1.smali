.class public final Lcom/google/android/gms/internal/ads/Xa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Da;

.field private final b:Lcom/google/android/gms/internal/ads/u8;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Da;Lcom/google/android/gms/internal/ads/u8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Xa;->a:Lcom/google/android/gms/internal/ads/Da;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Xa;->b:Lcom/google/android/gms/internal/ads/u8;

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xa;->a:Lcom/google/android/gms/internal/ads/Da;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Da;->l()Ljava/util/concurrent/Future;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xa;->a:Lcom/google/android/gms/internal/ads/Da;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Da;->l()Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xa;->a:Lcom/google/android/gms/internal/ads/Da;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Da;->c()Lcom/google/android/gms/internal/ads/Q8;

    move-result-object v0

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Xa;->b:Lcom/google/android/gms/internal/ads/u8;

    monitor-enter v1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Vv0; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xa;->b:Lcom/google/android/gms/internal/ads/u8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ou0;->l()[B

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/xv0;->a()Lcom/google/android/gms/internal/ads/xv0;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/internal/ads/Nu0;->e([BLcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Nu0;

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Lcom/google/android/gms/internal/ads/Vv0; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
