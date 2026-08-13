.class public final LB3/g0;
.super Lcom/google/android/gms/internal/ads/Fj;
.source "SourceFile"


# instance fields
.field private final a:Landroid/webkit/WebView;

.field private final b:LB3/c0;

.field private final c:Ljava/util/concurrent/Executor;

.field private d:Landroid/webkit/WebViewClient;


# direct methods
.method public constructor <init>(Landroid/webkit/WebView;LB3/c0;Lcom/google/android/gms/internal/ads/Yk0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Fj;-><init>()V

    iput-object p1, p0, LB3/g0;->a:Landroid/webkit/WebView;

    iput-object p2, p0, LB3/g0;->b:LB3/c0;

    iput-object p3, p0, LB3/g0;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private final d()V
    .locals 5

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->G9:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, LB3/g0;->b:LB3/c0;

    invoke-virtual {v2}, LB3/c0;->a()Lorg/json/JSONObject;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-static {v0, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LB3/g0;->a:Landroid/webkit/WebView;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method


# virtual methods
.method protected final a()Landroid/webkit/WebViewClient;
    .locals 1

    iget-object v0, p0, LB3/g0;->d:Landroid/webkit/WebViewClient;

    return-object v0
.end method

.method final synthetic b()V
    .locals 3

    .prologue
    :try_start_0
    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v0, p0, LB3/g0;->a:Landroid/webkit/WebView;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    invoke-static {v0}, LH2/d;->a(Landroid/webkit/WebView;)Landroid/webkit/WebViewClient;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v1, "GET_WEB_VIEW_CLIENT"

    invoke-static {v1}, LG2/f;->a(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v1, :cond_3

    :try_start_1
    invoke-static {v0}, LG2/e;->g(Landroid/webkit/WebView;)Landroid/webkit/WebViewClient;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    if-ne v0, p0, :cond_1

    return-void

    :cond_1
    if-eqz v0, :cond_2

    iput-object v0, p0, LB3/g0;->d:Landroid/webkit/WebViewClient;

    :cond_2
    iget-object v0, p0, LB3/g0;->a:Landroid/webkit/WebView;

    invoke-virtual {v0, p0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    invoke-direct {p0}, LB3/g0;->d()V

    return-void

    :catch_0
    move-exception v0

    :try_start_2
    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v1

    const-string v2, "AdUtil.getWebViewClient"

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getWebViewClient not supported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    return-void
.end method

.method public final c()V
    .locals 2

    new-instance v0, LB3/e0;

    invoke-direct {v0, p0}, LB3/e0;-><init>(LB3/g0;)V

    iget-object v1, p0, LB3/g0;->c:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, LB3/g0;->d()V

    invoke-super {p0, p1, p2}, Lcom/google/android/gms/internal/ads/Fj;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0}, LB3/g0;->d()V

    invoke-super {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/Fj;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method
