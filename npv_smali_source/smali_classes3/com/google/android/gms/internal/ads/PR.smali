.class public final synthetic Lcom/google/android/gms/internal/ads/PR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LP4/d;

.field public final synthetic b:LP4/d;


# direct methods
.method public synthetic constructor <init>(LP4/d;LP4/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/PR;->a:LP4/d;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/PR;->b:LP4/d;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/PR;->a:LP4/d;

    new-instance v1, Lcom/google/android/gms/internal/ads/fS;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/jS;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/PR;->b:LP4/d;

    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/dS;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/dS;->b:Lorg/json/JSONObject;

    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/dS;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/dS;->a:Lcom/google/android/gms/internal/ads/Ro;

    invoke-direct {v1, v0, v3, v2}, Lcom/google/android/gms/internal/ads/fS;-><init>(Lcom/google/android/gms/internal/ads/jS;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/Ro;)V

    return-object v1
.end method
