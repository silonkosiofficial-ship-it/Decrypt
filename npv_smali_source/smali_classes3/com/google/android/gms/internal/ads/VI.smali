.class final Lcom/google/android/gms/internal/ads/VI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Nb;


# instance fields
.field final synthetic C:Ljava/lang/String;

.field final synthetic D:Lcom/google/android/gms/internal/ads/ZI;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ZI;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/VI;->C:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/VI;->D:Lcom/google/android/gms/internal/ads/ZI;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final L(Lcom/google/android/gms/internal/ads/Mb;)V
    .locals 4

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->R1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    monitor-enter p0

    :try_start_0
    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/Mb;->j:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/VI;->D:Lcom/google/android/gms/internal/ads/ZI;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ZI;->S(Lcom/google/android/gms/internal/ads/ZI;)Lcom/google/android/gms/internal/ads/eK;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ZI;->V(Lcom/google/android/gms/internal/ads/ZI;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/VI;->C:Ljava/lang/String;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/VI;->D:Lcom/google/android/gms/internal/ads/ZI;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ZI;->S(Lcom/google/android/gms/internal/ads/ZI;)Lcom/google/android/gms/internal/ads/eK;

    move-result-object v0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ZI;->S(Lcom/google/android/gms/internal/ads/ZI;)Lcom/google/android/gms/internal/ads/eK;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eK;->e()Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/VI;->D:Lcom/google/android/gms/internal/ads/ZI;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/ZI;->S(Lcom/google/android/gms/internal/ads/ZI;)Lcom/google/android/gms/internal/ads/eK;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/eK;->l()Ljava/util/Map;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/VI;->D:Lcom/google/android/gms/internal/ads/ZI;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/ZI;->S(Lcom/google/android/gms/internal/ads/ZI;)Lcom/google/android/gms/internal/ads/eK;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/eK;->m()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {p1, v0, v2, v3, v1}, Lcom/google/android/gms/internal/ads/ZI;->j(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Z)V

    :cond_1
    monitor-exit p0

    return-void

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/Mb;->j:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/VI;->D:Lcom/google/android/gms/internal/ads/ZI;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ZI;->S(Lcom/google/android/gms/internal/ads/ZI;)Lcom/google/android/gms/internal/ads/eK;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ZI;->V(Lcom/google/android/gms/internal/ads/ZI;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/VI;->C:Ljava/lang/String;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/VI;->D:Lcom/google/android/gms/internal/ads/ZI;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ZI;->S(Lcom/google/android/gms/internal/ads/ZI;)Lcom/google/android/gms/internal/ads/eK;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ZI;->S(Lcom/google/android/gms/internal/ads/ZI;)Lcom/google/android/gms/internal/ads/eK;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eK;->e()Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/VI;->D:Lcom/google/android/gms/internal/ads/ZI;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/ZI;->S(Lcom/google/android/gms/internal/ads/ZI;)Lcom/google/android/gms/internal/ads/eK;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/eK;->l()Ljava/util/Map;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/VI;->D:Lcom/google/android/gms/internal/ads/ZI;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/ZI;->S(Lcom/google/android/gms/internal/ads/ZI;)Lcom/google/android/gms/internal/ads/eK;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/eK;->m()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {p1, v0, v2, v3, v1}, Lcom/google/android/gms/internal/ads/ZI;->j(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Z)V

    :cond_4
    :goto_1
    return-void
.end method
