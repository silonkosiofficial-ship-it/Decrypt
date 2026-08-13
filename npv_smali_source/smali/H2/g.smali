.class public abstract LH2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Landroid/content/pm/PackageInfo;
    .locals 1

    invoke-static {}, LH2/f;->a()Landroid/content/pm/PackageInfo;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/webkit/WebSettings;)Z
    .locals 0

    invoke-static {p0}, LH2/e;->a(Landroid/webkit/WebSettings;)Z

    move-result p0

    return p0
.end method

.method public static c(Landroid/webkit/WebView;)Landroid/webkit/WebChromeClient;
    .locals 0

    invoke-static {p0}, LH2/b;->a(Landroid/webkit/WebView;)Landroid/webkit/WebChromeClient;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/webkit/WebView;)Landroid/webkit/WebViewClient;
    .locals 0

    invoke-static {p0}, LH2/d;->a(Landroid/webkit/WebView;)Landroid/webkit/WebViewClient;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/webkit/WebSettings;Z)V
    .locals 0

    invoke-static {p0, p1}, LH2/c;->a(Landroid/webkit/WebSettings;Z)V

    return-void
.end method
