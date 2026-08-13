.class final Lcom/google/android/gms/internal/ads/Xk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/or;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/gl;

.field final synthetic b:Lcom/google/android/gms/internal/ads/E90;

.field final synthetic c:Lcom/google/android/gms/internal/ads/hl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/hl;Lcom/google/android/gms/internal/ads/gl;Lcom/google/android/gms/internal/ads/E90;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Xk;->a:Lcom/google/android/gms/internal/ads/gl;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Xk;->b:Lcom/google/android/gms/internal/ads/E90;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Xk;->c:Lcom/google/android/gms/internal/ads/hl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    const-string v0, "loadNewJavascriptEngine (failure): Trying to acquire lock"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xk;->c:Lcom/google/android/gms/internal/ads/hl;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/hl;->f(Lcom/google/android/gms/internal/ads/hl;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    const-string v1, "loadNewJavascriptEngine (failure): Lock acquired"

    invoke-static {v1}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Xk;->c:Lcom/google/android/gms/internal/ads/hl;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/hl;->h(Lcom/google/android/gms/internal/ads/hl;I)V

    const-string v1, "Failed loading new engine. Marking new engine destroyable."

    invoke-static {v1}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Xk;->a:Lcom/google/android/gms/internal/ads/gl;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/gl;->h()V

    sget-object v1, Lcom/google/android/gms/internal/ads/vg;->d:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Xk;->c:Lcom/google/android/gms/internal/ads/hl;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/hl;->e(Lcom/google/android/gms/internal/ads/hl;)Lcom/google/android/gms/internal/ads/T90;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/hl;->e(Lcom/google/android/gms/internal/ads/hl;)Lcom/google/android/gms/internal/ads/T90;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xk;->b:Lcom/google/android/gms/internal/ads/E90;

    const-string v3, "Failed loading new engine"

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/E90;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/E90;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/E90;->m()Lcom/google/android/gms/internal/ads/J90;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/T90;->b(Lcom/google/android/gms/internal/ads/J90;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "loadNewJavascriptEngine (failure): Lock released"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
