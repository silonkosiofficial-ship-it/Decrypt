.class public final Lcom/google/android/gms/internal/ads/t50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/F50;


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/jC;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Ljava/lang/Object;)LP4/d;
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/t50;->c(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/jC;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized b()Lcom/google/android/gms/internal/ads/jC;
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t50;->a:Lcom/google/android/gms/internal/ads/jC;
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
    .locals 0

    .prologue
    monitor-enter p0

    if-eqz p3, :cond_0

    :try_start_0
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/t50;->a:Lcom/google/android/gms/internal/ads/jC;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/G50;->b:Lcom/google/android/gms/internal/ads/D50;

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/E50;->a(Lcom/google/android/gms/internal/ads/D50;)Lcom/google/android/gms/internal/ads/iC;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/iC;->g()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/jC;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t50;->a:Lcom/google/android/gms/internal/ads/jC;

    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/t50;->a:Lcom/google/android/gms/internal/ads/jC;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/jC;->b()Lcom/google/android/gms/internal/ads/LA;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/LA;->i()LP4/d;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/LA;->h(LP4/d;)LP4/d;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/t50;->b()Lcom/google/android/gms/internal/ads/jC;

    move-result-object v0

    return-object v0
.end method
