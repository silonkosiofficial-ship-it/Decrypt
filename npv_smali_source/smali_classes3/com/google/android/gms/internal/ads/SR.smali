.class public final synthetic Lcom/google/android/gms/internal/ads/SR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LP4/d;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/Po;

.field public final synthetic c:LP4/d;


# direct methods
.method public synthetic constructor <init>(LP4/d;Lcom/google/android/gms/internal/ads/Po;LP4/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/SR;->a:LP4/d;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/SR;->b:Lcom/google/android/gms/internal/ads/Po;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/SR;->c:LP4/d;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SR;->a:LP4/d;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Ro;

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->k2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SR;->b:Lcom/google/android/gms/internal/ads/Po;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/Po;->O:Landroid/os/Bundle;

    if-eqz v2, :cond_0

    sget-object v3, Lcom/google/android/gms/internal/ads/MN;->O:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ro;->c()J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/Po;->O:Landroid/os/Bundle;

    sget-object v2, Lcom/google/android/gms/internal/ads/MN;->P:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ro;->b()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SR;->c:LP4/d;

    new-instance v2, Lcom/google/android/gms/internal/ads/mS;

    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    invoke-direct {v2, v1, v0}, Lcom/google/android/gms/internal/ads/mS;-><init>(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/Ro;)V

    return-object v2
.end method
