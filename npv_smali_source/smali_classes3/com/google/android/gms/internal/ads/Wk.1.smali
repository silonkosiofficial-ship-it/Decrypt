.class final Lcom/google/android/gms/internal/ads/Wk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/qr;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/gl;

.field final synthetic b:Lcom/google/android/gms/internal/ads/E90;

.field final synthetic c:Lcom/google/android/gms/internal/ads/hl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/hl;Lcom/google/android/gms/internal/ads/gl;Lcom/google/android/gms/internal/ads/E90;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Wk;->a:Lcom/google/android/gms/internal/ads/gl;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Wk;->b:Lcom/google/android/gms/internal/ads/E90;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Wk;->c:Lcom/google/android/gms/internal/ads/hl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 3

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/Bk;

    const-string p1, "loadNewJavascriptEngine (success): Trying to acquire lock"

    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Wk;->c:Lcom/google/android/gms/internal/ads/hl;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/hl;->f(Lcom/google/android/gms/internal/ads/hl;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    const-string v0, "loadNewJavascriptEngine (success): Lock acquired"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Wk;->c:Lcom/google/android/gms/internal/ads/hl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/hl;->h(Lcom/google/android/gms/internal/ads/hl;I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Wk;->c:Lcom/google/android/gms/internal/ads/hl;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/hl;->c(Lcom/google/android/gms/internal/ads/hl;)Lcom/google/android/gms/internal/ads/gl;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Wk;->a:Lcom/google/android/gms/internal/ads/gl;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/hl;->c(Lcom/google/android/gms/internal/ads/hl;)Lcom/google/android/gms/internal/ads/gl;

    move-result-object v0

    if-eq v1, v0, :cond_0

    const-string v0, "New JS engine is loaded, marking previous one as destroyable."

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Wk;->c:Lcom/google/android/gms/internal/ads/hl;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/hl;->c(Lcom/google/android/gms/internal/ads/hl;)Lcom/google/android/gms/internal/ads/gl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gl;->h()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Wk;->c:Lcom/google/android/gms/internal/ads/hl;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Wk;->a:Lcom/google/android/gms/internal/ads/gl;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/hl;->g(Lcom/google/android/gms/internal/ads/hl;Lcom/google/android/gms/internal/ads/gl;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/vg;->d:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Wk;->c:Lcom/google/android/gms/internal/ads/hl;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/hl;->e(Lcom/google/android/gms/internal/ads/hl;)Lcom/google/android/gms/internal/ads/T90;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/hl;->e(Lcom/google/android/gms/internal/ads/hl;)Lcom/google/android/gms/internal/ads/T90;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Wk;->b:Lcom/google/android/gms/internal/ads/E90;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/E90;->m()Lcom/google/android/gms/internal/ads/J90;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/T90;->b(Lcom/google/android/gms/internal/ads/J90;)V

    :cond_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p1, "loadNewJavascriptEngine (success): Lock released"

    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
