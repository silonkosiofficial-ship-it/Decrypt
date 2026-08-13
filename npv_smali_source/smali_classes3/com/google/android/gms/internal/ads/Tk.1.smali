.class final Lcom/google/android/gms/internal/ads/Tk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/gj;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/Bk;

.field final synthetic b:Lv3/b0;

.field final synthetic c:Lcom/google/android/gms/internal/ads/hl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/hl;Lcom/google/android/gms/internal/ads/Z9;Lcom/google/android/gms/internal/ads/Bk;Lv3/b0;)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Tk;->a:Lcom/google/android/gms/internal/ads/Bk;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Tk;->b:Lv3/b0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Tk;->c:Lcom/google/android/gms/internal/ads/hl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 2

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/il;

    const-string p1, "loadJavascriptEngine > /requestReload handler: Trying to acquire lock"

    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Tk;->c:Lcom/google/android/gms/internal/ads/hl;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/hl;->f(Lcom/google/android/gms/internal/ads/hl;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    const-string p2, "loadJavascriptEngine > /requestReload handler: Lock acquired"

    invoke-static {p2}, Lv3/q0;->k(Ljava/lang/String;)V

    const-string p2, "JS Engine is requesting an update"

    invoke-static {p2}, Lw3/p;->f(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Tk;->c:Lcom/google/android/gms/internal/ads/hl;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/hl;->a(Lcom/google/android/gms/internal/ads/hl;)I

    move-result p2

    if-nez p2, :cond_0

    const-string p2, "Starting reload."

    invoke-static {p2}, Lw3/p;->f(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Tk;->c:Lcom/google/android/gms/internal/ads/hl;

    const/4 v0, 0x2

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/hl;->h(Lcom/google/android/gms/internal/ads/hl;I)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Tk;->c:Lcom/google/android/gms/internal/ads/hl;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/hl;->d(Lcom/google/android/gms/internal/ads/Z9;)Lcom/google/android/gms/internal/ads/gl;

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Tk;->a:Lcom/google/android/gms/internal/ads/Bk;

    const-string v0, "/requestReload"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Tk;->b:Lv3/b0;

    invoke-virtual {v1}, Lv3/b0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/gj;

    invoke-interface {p2, v0, v1}, Lcom/google/android/gms/internal/ads/il;->q0(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p1, "loadJavascriptEngine > /requestReload handler: Lock released"

    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method
