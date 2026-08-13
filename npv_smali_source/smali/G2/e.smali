.class public abstract LG2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG2/e$a;
    }
.end annotation


# static fields
.field private static final a:Landroid/net/Uri;

.field private static final b:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "*"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, LG2/e;->a:Landroid/net/Uri;

    const-string v0, ""

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, LG2/e;->b:Landroid/net/Uri;

    return-void
.end method

.method public static a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Set;LG2/e$a;)V
    .locals 1

    .prologue
    sget-object v0, LH2/w;->U:LH2/a$d;

    invoke-virtual {v0}, LH2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LG2/e;->f(Landroid/webkit/WebView;)LH2/y;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, LH2/y;->a(Ljava/lang/String;[Ljava/lang/String;LG2/e$a;)V

    return-void

    :cond_0
    invoke-static {}, LH2/w;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method private static b(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;
    .locals 1

    invoke-static {}, LG2/e;->d()LH2/z;

    move-result-object v0

    invoke-interface {v0, p0}, LH2/z;->createWebView(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    move-result-object p0

    return-object p0
.end method

.method public static c()Landroid/content/pm/PackageInfo;
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-static {}, LH2/g;->a()Landroid/content/pm/PackageInfo;

    move-result-object v0

    return-object v0

    :cond_0
    :try_start_0
    invoke-static {}, LG2/e;->e()Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static d()LH2/z;
    .locals 1

    invoke-static {}, LH2/x;->c()LH2/z;

    move-result-object v0

    return-object v0
.end method

.method private static e()Landroid/content/pm/PackageInfo;
    .locals 3

    const-string v0, "android.webkit.WebViewFactory"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getLoadedPackageInfo"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    return-object v0
.end method

.method private static f(Landroid/webkit/WebView;)LH2/y;
    .locals 1

    new-instance v0, LH2/y;

    invoke-static {p0}, LG2/e;->b(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    move-result-object p0

    invoke-direct {v0, p0}, LH2/y;-><init>(Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;)V

    return-object v0
.end method

.method public static g(Landroid/webkit/WebView;)Landroid/webkit/WebViewClient;
    .locals 2

    .prologue
    sget-object v0, LH2/w;->H:LH2/a$e;

    invoke-virtual {v0}, LH2/a$e;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, LH2/g;->d(Landroid/webkit/WebView;)Landroid/webkit/WebViewClient;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {v0}, LH2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, LG2/e;->f(Landroid/webkit/WebView;)LH2/y;

    move-result-object p0

    invoke-virtual {p0}, LH2/y;->b()Landroid/webkit/WebViewClient;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {}, LH2/w;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static h()Z
    .locals 1

    .prologue
    sget-object v0, LH2/w;->R:LH2/a$d;

    invoke-virtual {v0}, LH2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LG2/e;->d()LH2/z;

    move-result-object v0

    invoke-interface {v0}, LH2/z;->getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;->isMultiProcessEnabled()Z

    move-result v0

    return v0

    :cond_0
    invoke-static {}, LH2/w;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public static i(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .prologue
    sget-object v0, LH2/w;->U:LH2/a$d;

    invoke-virtual {v0}, LH2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LG2/e;->f(Landroid/webkit/WebView;)LH2/y;

    move-result-object p0

    invoke-virtual {p0, p1}, LH2/y;->c(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, LH2/w;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static j(Landroid/webkit/WebView;Z)V
    .locals 1

    .prologue
    sget-object v0, LH2/w;->f0:LH2/a$d;

    invoke-virtual {v0}, LH2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LG2/e;->f(Landroid/webkit/WebView;)LH2/y;

    move-result-object p0

    invoke-virtual {p0, p1}, LH2/y;->d(Z)V

    return-void

    :cond_0
    invoke-static {}, LH2/w;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method
