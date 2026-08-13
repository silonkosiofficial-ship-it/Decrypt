.class public abstract Lcom/google/android/gms/internal/ads/sH0;
.super Lcom/google/android/gms/internal/ads/kH0;
.source "SourceFile"


# instance fields
.field private final h:Ljava/util/HashMap;

.field private i:Landroid/os/Handler;

.field private j:Lcom/google/android/gms/internal/ads/Pv0;


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/kH0;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/sH0;->h:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method protected A(Ljava/lang/Object;I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected B(Ljava/lang/Object;JLcom/google/android/gms/internal/ads/LH0;)J
    .locals 0

    return-wide p2
.end method

.method protected abstract C(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/LH0;
.end method

.method public J()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sH0;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/rH0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/rH0;->a:Lcom/google/android/gms/internal/ads/NH0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/NH0;->J()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected final r()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sH0;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/rH0;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/rH0;->a:Lcom/google/android/gms/internal/ads/NH0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/rH0;->b:Lcom/google/android/gms/internal/ads/MH0;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/NH0;->f(Lcom/google/android/gms/internal/ads/MH0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected final s()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sH0;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/rH0;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/rH0;->a:Lcom/google/android/gms/internal/ads/NH0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/rH0;->b:Lcom/google/android/gms/internal/ads/MH0;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/NH0;->i(Lcom/google/android/gms/internal/ads/MH0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected t(Lcom/google/android/gms/internal/ads/Pv0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sH0;->j:Lcom/google/android/gms/internal/ads/Pv0;

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/EW;->Q(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sH0;->i:Landroid/os/Handler;

    return-void
.end method

.method protected w()V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sH0;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/rH0;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/rH0;->a:Lcom/google/android/gms/internal/ads/NH0;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/rH0;->b:Lcom/google/android/gms/internal/ads/MH0;

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/NH0;->a(Lcom/google/android/gms/internal/ads/MH0;)V

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/rH0;->a:Lcom/google/android/gms/internal/ads/NH0;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/rH0;->c:Lcom/google/android/gms/internal/ads/qH0;

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/NH0;->h(Lcom/google/android/gms/internal/ads/WH0;)V

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/rH0;->a:Lcom/google/android/gms/internal/ads/NH0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/rH0;->c:Lcom/google/android/gms/internal/ads/qH0;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/NH0;->k(Lcom/google/android/gms/internal/ads/TF0;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sH0;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method protected abstract y(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/NH0;Lcom/google/android/gms/internal/ads/qm;)V
.end method

.method protected final z(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/NH0;)V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sH0;->h:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->d(Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/pH0;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/pH0;-><init>(Lcom/google/android/gms/internal/ads/sH0;Ljava/lang/Object;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/qH0;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/qH0;-><init>(Lcom/google/android/gms/internal/ads/sH0;Ljava/lang/Object;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/rH0;

    invoke-direct {v2, p2, v0, v1}, Lcom/google/android/gms/internal/ads/rH0;-><init>(Lcom/google/android/gms/internal/ads/NH0;Lcom/google/android/gms/internal/ads/MH0;Lcom/google/android/gms/internal/ads/qH0;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sH0;->h:Ljava/util/HashMap;

    invoke-virtual {v3, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sH0;->i:Landroid/os/Handler;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p2, p1, v1}, Lcom/google/android/gms/internal/ads/NH0;->l(Landroid/os/Handler;Lcom/google/android/gms/internal/ads/WH0;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sH0;->i:Landroid/os/Handler;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p2, p1, v1}, Lcom/google/android/gms/internal/ads/NH0;->j(Landroid/os/Handler;Lcom/google/android/gms/internal/ads/TF0;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sH0;->j:Lcom/google/android/gms/internal/ads/Pv0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/kH0;->m()Lcom/google/android/gms/internal/ads/bE0;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lcom/google/android/gms/internal/ads/NH0;->g(Lcom/google/android/gms/internal/ads/MH0;Lcom/google/android/gms/internal/ads/Pv0;Lcom/google/android/gms/internal/ads/bE0;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/kH0;->x()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/NH0;->f(Lcom/google/android/gms/internal/ads/MH0;)V

    :cond_0
    return-void
.end method
