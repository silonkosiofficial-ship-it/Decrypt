.class final Lcom/google/android/gms/internal/ads/BV;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/R60;

.field final synthetic b:Lcom/google/android/gms/internal/ads/DV;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/DV;Lcom/google/android/gms/internal/ads/R60;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/BV;->a:Lcom/google/android/gms/internal/ads/R60;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/BV;->b:Lcom/google/android/gms/internal/ads/DV;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/BV;->b:Lcom/google/android/gms/internal/ads/DV;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/BV;->b:Lcom/google/android/gms/internal/ads/DV;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/DV;->a(Lcom/google/android/gms/internal/ads/DV;)Lcom/google/android/gms/internal/ads/EV;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/BV;->a:Lcom/google/android/gms/internal/ads/R60;

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/ads/EV;->b(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/R60;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/BV;->b:Lcom/google/android/gms/internal/ads/DV;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/DV;->a(Lcom/google/android/gms/internal/ads/DV;)Lcom/google/android/gms/internal/ads/EV;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/EV;->a()Lcom/google/android/gms/internal/ads/R60;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/BV;->a:Lcom/google/android/gms/internal/ads/R60;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/ads/R60;->v0:Z

    if-eqz v1, :cond_0

    :goto_0
    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/BV;->b:Lcom/google/android/gms/internal/ads/DV;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/DV;->c(Lcom/google/android/gms/internal/ads/DV;Lcom/google/android/gms/internal/ads/R60;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/BV;->b:Lcom/google/android/gms/internal/ads/DV;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/DV;->a(Lcom/google/android/gms/internal/ads/DV;)Lcom/google/android/gms/internal/ads/EV;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/EV;->a()Lcom/google/android/gms/internal/ads/R60;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/BV;->b:Lcom/google/android/gms/internal/ads/DV;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/DV;->c(Lcom/google/android/gms/internal/ads/DV;Lcom/google/android/gms/internal/ads/R60;)V

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/BV;->b:Lcom/google/android/gms/internal/ads/DV;

    check-cast p1, Lcom/google/android/gms/internal/ads/UV;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/BV;->b:Lcom/google/android/gms/internal/ads/DV;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/DV;->a(Lcom/google/android/gms/internal/ads/DV;)Lcom/google/android/gms/internal/ads/EV;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/BV;->a:Lcom/google/android/gms/internal/ads/R60;

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/ads/EV;->c(Lcom/google/android/gms/internal/ads/UV;Lcom/google/android/gms/internal/ads/R60;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/BV;->b:Lcom/google/android/gms/internal/ads/DV;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/DV;->a(Lcom/google/android/gms/internal/ads/DV;)Lcom/google/android/gms/internal/ads/EV;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/EV;->a()Lcom/google/android/gms/internal/ads/R60;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/BV;->b:Lcom/google/android/gms/internal/ads/DV;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/DV;->c(Lcom/google/android/gms/internal/ads/DV;Lcom/google/android/gms/internal/ads/R60;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
