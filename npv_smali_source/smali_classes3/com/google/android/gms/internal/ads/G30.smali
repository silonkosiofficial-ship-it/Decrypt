.class final Lcom/google/android/gms/internal/ads/G30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field private final a:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lw3/a;->e()Lw3/a;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/Lo;->c(Landroid/content/Context;Lw3/a;)Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/G30;->a:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0x2e

    return v0
.end method

.method public final b()LP4/d;
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Pb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/E30;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/E30;-><init>()V

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/F30;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/F30;-><init>(Lcom/google/android/gms/internal/ads/G30;)V

    goto :goto_0
.end method

.method final synthetic c(Lorg/json/JSONObject;)V
    .locals 2

    .prologue
    :try_start_0
    const-string v0, "gms_sdk_env"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/G30;->a:Lorg/json/JSONObject;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "Failed putting version constants."

    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    return-void
.end method
