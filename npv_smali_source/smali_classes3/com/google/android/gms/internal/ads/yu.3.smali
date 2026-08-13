.class public final Lcom/google/android/gms/internal/ads/yu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/zu;

.field private final b:Lcom/google/android/gms/internal/ads/xu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zu;Lcom/google/android/gms/internal/ads/xu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/yu;->b:Lcom/google/android/gms/internal/ads/xu;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yu;->a:Lcom/google/android/gms/internal/ads/zu;

    return-void
.end method


# virtual methods
.method final synthetic a(Ljava/lang/String;)V
    .locals 1

    .prologue
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yu;->b:Lcom/google/android/gms/internal/ads/xu;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/xu;->a:Lcom/google/android/gms/internal/ads/Ot;

    check-cast v0, Lcom/google/android/gms/internal/ads/qu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/qu;->q1()Lcom/google/android/gms/internal/ads/Zt;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p1, "Unable to pass GMSG, no AdWebViewClient for AdWebView!"

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/Ku;->D0(Landroid/net/Uri;)V

    return-void
.end method

.method public getClickSignals(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .prologue
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    const-string p1, "Click string is empty, not proceeding."

    :goto_0
    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yu;->a:Lcom/google/android/gms/internal/ads/zu;

    check-cast v0, Lcom/google/android/gms/internal/ads/Fu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Fu;->H()Lcom/google/android/gms/internal/ads/Z9;

    move-result-object v0

    if-nez v0, :cond_1

    const-string p1, "Signal utils is empty, ignoring."

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Z9;->c()Lcom/google/android/gms/internal/ads/T9;

    move-result-object v0

    if-nez v0, :cond_2

    const-string p1, "Signals object is empty, ignoring."

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/yu;->a:Lcom/google/android/gms/internal/ads/zu;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zu;->getContext()Landroid/content/Context;

    move-result-object v2

    if-nez v2, :cond_3

    const-string p1, "Context is null, ignoring."

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/yu;->a:Lcom/google/android/gms/internal/ads/zu;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zu;->getContext()Landroid/content/Context;

    move-result-object v2

    check-cast v1, Lcom/google/android/gms/internal/ads/Hu;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Hu;->N()Landroid/view/View;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/yu;->a:Lcom/google/android/gms/internal/ads/zu;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zu;->h()Landroid/app/Activity;

    move-result-object v3

    invoke-interface {v0, v2, p1, v1, v3}, Lcom/google/android/gms/internal/ads/T9;->f(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getViewSignals()Ljava/lang/String;
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yu;->a:Lcom/google/android/gms/internal/ads/zu;

    check-cast v0, Lcom/google/android/gms/internal/ads/Fu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Fu;->H()Lcom/google/android/gms/internal/ads/Z9;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    const-string v0, "Signal utils is empty, ignoring."

    :goto_0
    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    return-object v1

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Z9;->c()Lcom/google/android/gms/internal/ads/T9;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "Signals object is empty, ignoring."

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/yu;->a:Lcom/google/android/gms/internal/ads/zu;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zu;->getContext()Landroid/content/Context;

    move-result-object v2

    if-nez v2, :cond_2

    const-string v0, "Context is null, ignoring."

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/yu;->a:Lcom/google/android/gms/internal/ads/zu;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zu;->getContext()Landroid/content/Context;

    move-result-object v2

    check-cast v1, Lcom/google/android/gms/internal/ads/Hu;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Hu;->N()Landroid/view/View;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/yu;->a:Lcom/google/android/gms/internal/ads/zu;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zu;->h()Landroid/app/Activity;

    move-result-object v3

    invoke-interface {v0, v2, v1, v3}, Lcom/google/android/gms/internal/ads/T9;->i(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public notify(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .prologue
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "URL is empty, ignoring message"

    invoke-static {p1}, Lw3/p;->g(Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v1, Lcom/google/android/gms/internal/ads/wu;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/wu;-><init>(Lcom/google/android/gms/internal/ads/yu;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
