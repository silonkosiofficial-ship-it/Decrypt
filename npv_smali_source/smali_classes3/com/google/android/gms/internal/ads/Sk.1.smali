.class final Lcom/google/android/gms/internal/ads/Sk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/gj;


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/google/android/gms/internal/ads/gl;

.field final synthetic c:Lcom/google/android/gms/internal/ads/Bk;

.field final synthetic d:Lcom/google/android/gms/internal/ads/hl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/hl;JLcom/google/android/gms/internal/ads/gl;Lcom/google/android/gms/internal/ads/Bk;)V
    .locals 0

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/Sk;->a:J

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Sk;->b:Lcom/google/android/gms/internal/ads/gl;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/Sk;->c:Lcom/google/android/gms/internal/ads/Bk;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Sk;->d:Lcom/google/android/gms/internal/ads/hl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 2

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/il;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object p1

    invoke-interface {p1}, LV3/f;->a()J

    move-result-wide p1

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/Sk;->a:J

    sub-long/2addr p1, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onGmsg /jsLoaded. JsLoaded latency is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " ms."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    const-string p1, "loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock"

    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Sk;->d:Lcom/google/android/gms/internal/ads/hl;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/hl;->f(Lcom/google/android/gms/internal/ads/hl;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    const-string p2, "loadJavascriptEngine > /jsLoaded handler: Lock acquired"

    invoke-static {p2}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Sk;->b:Lcom/google/android/gms/internal/ads/gl;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/tr;->a()I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Sk;->b:Lcom/google/android/gms/internal/ads/gl;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/tr;->a()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Sk;->d:Lcom/google/android/gms/internal/ads/hl;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/hl;->h(Lcom/google/android/gms/internal/ads/hl;I)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Sk;->c:Lcom/google/android/gms/internal/ads/Bk;

    const-string v0, "/log"

    sget-object v1, Lcom/google/android/gms/internal/ads/fj;->g:Lcom/google/android/gms/internal/ads/gj;

    invoke-interface {p2, v0, v1}, Lcom/google/android/gms/internal/ads/il;->W(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    const-string v0, "/result"

    sget-object v1, Lcom/google/android/gms/internal/ads/fj;->o:Lcom/google/android/gms/internal/ads/xj;

    invoke-interface {p2, v0, v1}, Lcom/google/android/gms/internal/ads/il;->W(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Sk;->b:Lcom/google/android/gms/internal/ads/gl;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sk;->c:Lcom/google/android/gms/internal/ads/Bk;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/tr;->e(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Sk;->d:Lcom/google/android/gms/internal/ads/hl;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sk;->b:Lcom/google/android/gms/internal/ads/gl;

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/hl;->g(Lcom/google/android/gms/internal/ads/hl;Lcom/google/android/gms/internal/ads/gl;)V

    const-string p2, "Successfully loaded JS Engine."

    invoke-static {p2}, Lv3/q0;->k(Ljava/lang/String;)V

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p1, "loadJavascriptEngine > /jsLoaded handler: Lock released"

    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_1
    :goto_0
    :try_start_1
    const-string p2, "loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled"

    invoke-static {p2}, Lv3/q0;->k(Ljava/lang/String;)V

    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method
