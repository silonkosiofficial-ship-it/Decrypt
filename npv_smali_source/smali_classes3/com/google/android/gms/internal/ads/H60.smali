.class final Lcom/google/android/gms/internal/ads/H60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/kY;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/I60;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/I60;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/H60;->a:Lcom/google/android/gms/internal/ads/I60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H60;->a:Lcom/google/android/gms/internal/ads/I60;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/H60;->a:Lcom/google/android/gms/internal/ads/I60;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/I60;->r6(Lcom/google/android/gms/internal/ads/I60;Lcom/google/android/gms/internal/ads/fM;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 3

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/fM;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/H60;->a:Lcom/google/android/gms/internal/ads/I60;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/H60;->a:Lcom/google/android/gms/internal/ads/I60;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/I60;->r6(Lcom/google/android/gms/internal/ads/I60;Lcom/google/android/gms/internal/ads/fM;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->F3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fM;->k()Lcom/google/android/gms/internal/ads/g70;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/H60;->a:Lcom/google/android/gms/internal/ads/I60;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/I60;->q6(Lcom/google/android/gms/internal/ads/I60;)Lcom/google/android/gms/internal/ads/f70;

    move-result-object v1

    iput-object v1, p1, Lcom/google/android/gms/internal/ads/g70;->a:Lcom/google/android/gms/internal/ads/f70;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/H60;->a:Lcom/google/android/gms/internal/ads/I60;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/I60;->p6(Lcom/google/android/gms/internal/ads/I60;)Lcom/google/android/gms/internal/ads/fM;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->b()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
