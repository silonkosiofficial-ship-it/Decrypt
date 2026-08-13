.class final Lcom/google/android/gms/internal/ads/Lb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/e$a;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/Nb0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Nb0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Lb0;->a:Lcom/google/android/gms/internal/ads/Nb0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/webkit/WebView;LG2/c;Landroid/net/Uri;ZLG2/a;)V
    .locals 0

    .prologue
    invoke-virtual {p2}, LG2/c;->b()Ljava/lang/String;

    move-result-object p1

    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "method"

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "data"

    invoke-virtual {p2, p3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    const-string p3, "adSessionId"

    invoke-virtual {p2, p3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "startSession"

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    const-string p3, "finishSession"

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/yb0;->a:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Lb0;->a:Lcom/google/android/gms/internal/ads/Nb0;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/Nb0;->c(Lcom/google/android/gms/internal/ads/Nb0;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Lb0;->a:Lcom/google/android/gms/internal/ads/Nb0;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/Nb0;->e(Lcom/google/android/gms/internal/ads/Nb0;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    const-string p2, "Error parsing JS message in JavaScriptSessionService."

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/uc0;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method
