.class public Lv3/F0;
.super Lv3/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lv3/b;-><init>(Lv3/X0;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/webkit/CookieManager;
    .locals 3

    .prologue
    invoke-static {}, Lr3/v;->t()Lv3/E0;

    invoke-static {}, Lv3/E0;->g()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    const-string v1, "Failed to obtain CookieManager."

    invoke-static {v1, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v1, "ApiLevelUtil.getCookieManager"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v2

    invoke-virtual {v2, p1, v1}, Lcom/google/android/gms/internal/ads/Uq;->w(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)Landroid/webkit/WebResourceResponse;
    .locals 8

    new-instance v7, Landroid/webkit/WebResourceResponse;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V

    return-object v7
.end method

.method public final c(Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/od;ZLcom/google/android/gms/internal/ads/tT;)Lcom/google/android/gms/internal/ads/Zt;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Bu;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/Bu;-><init>(Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/od;ZLcom/google/android/gms/internal/ads/tT;)V

    return-object v0
.end method
