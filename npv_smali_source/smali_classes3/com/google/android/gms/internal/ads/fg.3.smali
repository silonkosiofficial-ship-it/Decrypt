.class final Lcom/google/android/gms/internal/ads/fg;
.super LD3/b;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/internal/ads/gg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gg;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/fg;->a:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fg;->b:Lcom/google/android/gms/internal/ads/gg;

    invoke-direct {p0}, LD3/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Failed to generate query info for Custom Tab error: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fg;->b:Lcom/google/android/gms/internal/ads/gg;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/gg;->a(Lcom/google/android/gms/internal/ads/gg;)Landroidx/browser/customtabs/f;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/fg;->a:Ljava/lang/String;

    invoke-virtual {v0, v2, p1}, Lcom/google/android/gms/internal/ads/gg;->c(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {v1, p1, v0}, Landroidx/browser/customtabs/f;->g(Ljava/lang/String;Landroid/os/Bundle;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Error creating PACT Error Response JSON: "

    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(LD3/a;)V
    .locals 3

    .prologue
    invoke-virtual {p1}, LD3/a;->b()Ljava/lang/String;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fg;->b:Lcom/google/android/gms/internal/ads/gg;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/gg;->a(Lcom/google/android/gms/internal/ads/gg;)Landroidx/browser/customtabs/f;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/fg;->a:Ljava/lang/String;

    invoke-virtual {v0, v2, p1}, Lcom/google/android/gms/internal/ads/gg;->d(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {v1, p1, v0}, Landroidx/browser/customtabs/f;->g(Ljava/lang/String;Landroid/os/Bundle;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Error creating PACT Signal Response JSON: "

    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
