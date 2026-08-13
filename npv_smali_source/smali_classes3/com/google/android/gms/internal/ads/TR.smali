.class public final synthetic Lcom/google/android/gms/internal/ads/TR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/Po;

.field public final synthetic b:LP4/d;

.field public final synthetic c:LP4/d;

.field public final synthetic d:LP4/d;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Po;LP4/d;LP4/d;LP4/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/TR;->a:Lcom/google/android/gms/internal/ads/Po;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/TR;->b:LP4/d;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/TR;->c:LP4/d;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/TR;->d:LP4/d;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->k2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TR;->a:Lcom/google/android/gms/internal/ads/Po;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Po;->O:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/ads/MN;->Q:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v2

    invoke-interface {v2}, LV3/f;->a()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TR;->d:LP4/d;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/TR;->c:LP4/d;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/TR;->b:LP4/d;

    new-instance v3, Lcom/google/android/gms/internal/ads/fS;

    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/jS;

    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Ro;

    invoke-direct {v3, v2, v1, v0}, Lcom/google/android/gms/internal/ads/fS;-><init>(Lcom/google/android/gms/internal/ads/jS;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/Ro;)V

    return-object v3
.end method
