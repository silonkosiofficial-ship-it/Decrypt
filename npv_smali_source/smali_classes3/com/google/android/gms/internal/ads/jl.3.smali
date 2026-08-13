.class public final Lcom/google/android/gms/internal/ads/jl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Ak;
.implements Lcom/google/android/gms/internal/ads/il;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/il;

.field private final D:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/il;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jl;->C:Lcom/google/android/gms/internal/ads/il;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jl;->D:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final synthetic G0(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zk;->d(Lcom/google/android/gms/internal/ads/Ak;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final synthetic O(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zk;->a(Lcom/google/android/gms/internal/ads/Ak;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final W(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jl;->C:Lcom/google/android/gms/internal/ads/il;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/il;->W(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    new-instance v0, Ljava/util/AbstractMap$SimpleEntry;

    invoke-direct {v0, p1, p2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/jl;->D:Ljava/util/HashSet;

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final synthetic a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zk;->b(Lcom/google/android/gms/internal/ads/Ak;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final c()V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jl;->D:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/AbstractMap$SimpleEntry;

    invoke-virtual {v1}, Ljava/util/AbstractMap$SimpleEntry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/gj;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Unregistering eventhandler: "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/jl;->C:Lcom/google/android/gms/internal/ads/il;

    invoke-virtual {v1}, Ljava/util/AbstractMap$SimpleEntry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/util/AbstractMap$SimpleEntry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/gj;

    invoke-interface {v2, v3, v1}, Lcom/google/android/gms/internal/ads/il;->q0(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jl;->D:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    return-void
.end method

.method public final o(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jl;->C:Lcom/google/android/gms/internal/ads/il;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/Kk;->o(Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic q(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zk;->c(Lcom/google/android/gms/internal/ads/Ak;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final q0(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jl;->C:Lcom/google/android/gms/internal/ads/il;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/il;->q0(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    new-instance v0, Ljava/util/AbstractMap$SimpleEntry;

    invoke-direct {v0, p1, p2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/jl;->D:Ljava/util/HashSet;

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method
