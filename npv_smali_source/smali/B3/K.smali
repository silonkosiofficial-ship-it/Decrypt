.class public final synthetic LB3/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/Po;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Po;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/K;->a:Lcom/google/android/gms/internal/ads/Po;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 4

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/BR;

    new-instance v0, LB3/N;

    new-instance v1, Landroid/util/JsonReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/BR;->b()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v2}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/BR;->a()Lcom/google/android/gms/internal/ads/Po;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LB3/N;-><init>(Landroid/util/JsonReader;Lcom/google/android/gms/internal/ads/Po;)V

    iget-object p1, p0, LB3/K;->a:Lcom/google/android/gms/internal/ads/Po;

    :try_start_0
    invoke-static {}, Ls3/y;->b()Lw3/g;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/Po;->C:Landroid/os/Bundle;

    invoke-virtual {v1, v2}, Lw3/g;->k(Landroid/os/Bundle;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, LB3/N;->b:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v1, "{}"

    iput-object v1, v0, LB3/N;->b:Ljava/lang/String;

    :goto_0
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/Po;->P:Landroid/os/Bundle;

    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    :try_start_1
    invoke-static {}, Ls3/y;->b()Lw3/g;

    move-result-object v1

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/Po;->P:Landroid/os/Bundle;

    invoke-virtual {v1, p1}, Lw3/g;->k(Landroid/os/Bundle;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, LB3/N;->c:Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method
