.class public final Lcom/google/android/gms/internal/ads/u50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/F50;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/F50;

.field private b:Lcom/google/android/gms/internal/ads/jC;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/F50;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/u50;->a:Lcom/google/android/gms/internal/ads/F50;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Ljava/lang/Object;)LP4/d;
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/u50;->c(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/jC;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized b()Lcom/google/android/gms/internal/ads/jC;
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u50;->b:Lcom/google/android/gms/internal/ads/jC;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized c(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/jC;)LP4/d;
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/u50;->b:Lcom/google/android/gms/internal/ads/jC;

    if-eqz p3, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/G50;->a:Lcom/google/android/gms/internal/ads/Po;

    if-eqz v0, :cond_0

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/jC;->b()Lcom/google/android/gms/internal/ads/LA;

    move-result-object p1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/LA;->j(LP4/d;)LP4/d;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/LA;->h(LP4/d;)LP4/d;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u50;->a:Lcom/google/android/gms/internal/ads/F50;

    check-cast v0, Lcom/google/android/gms/internal/ads/t50;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/t50;->c(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/jC;)LP4/d;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/u50;->b()Lcom/google/android/gms/internal/ads/jC;

    move-result-object v0

    return-object v0
.end method
