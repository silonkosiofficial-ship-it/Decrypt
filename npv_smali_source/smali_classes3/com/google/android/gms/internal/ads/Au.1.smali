.class public abstract Lcom/google/android/gms/internal/ads/Au;
.super Lcom/google/android/gms/internal/ads/Zt;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/od;ZLcom/google/android/gms/internal/ads/tT;)V
    .locals 7

    new-instance v4, Lcom/google/android/gms/internal/ads/vn;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->r0()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/hf;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/hf;-><init>(Landroid/content/Context;)V

    invoke-direct {v4, p1, v0, v1}, Lcom/google/android/gms/internal/ads/vn;-><init>(Lcom/google/android/gms/internal/ads/Ot;Landroid/content/Context;Lcom/google/android/gms/internal/ads/hf;)V

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/Zt;-><init>(Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/od;ZLcom/google/android/gms/internal/ads/vn;Lcom/google/android/gms/internal/ads/qn;Lcom/google/android/gms/internal/ads/tT;)V

    return-void
.end method


# virtual methods
.method protected final E0(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Map;)Landroid/webkit/WebResourceResponse;
    .locals 2

    .prologue
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/Ot;

    if-nez v0, :cond_0

    const-string p1, "Tried to intercept request from a WebView that wasn\'t an AdWebView."

    invoke-static {p1}, Lw3/p;->g(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/ads/Ot;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zt;->a0:Lcom/google/android/gms/internal/ads/aq;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    invoke-interface {v0, p2, p3, v1}, Lcom/google/android/gms/internal/ads/aq;->b(Ljava/lang/String;Ljava/util/Map;I)V

    :cond_1
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/google/android/gms/internal/ads/je0;->a()Lcom/google/android/gms/internal/ads/le0;

    sget-object v1, Lcom/google/android/gms/internal/ads/qe0;->a:Lcom/google/android/gms/internal/ads/qe0;

    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mraid.js"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    if-nez p3, :cond_2

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p3

    :cond_2
    invoke-super {p0, p2, p3}, Lcom/google/android/gms/internal/ads/Zt;->G(Ljava/lang/String;Ljava/util/Map;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object p2

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/Ku;->T()V

    :cond_4
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->I()Lcom/google/android/gms/internal/ads/Mu;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Mu;->i()Z

    move-result p2

    if-eqz p2, :cond_5

    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->a0:Lcom/google/android/gms/internal/ads/rf;

    :goto_0
    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_1

    :cond_5
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->R0()Z

    move-result p2

    if-eqz p2, :cond_6

    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->Z:Lcom/google/android/gms/internal/ads/rf;

    goto :goto_0

    :cond_6
    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->Y:Lcom/google/android/gms/internal/ads/rf;

    goto :goto_0

    :goto_1
    invoke-static {}, Lr3/v;->t()Lv3/E0;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->n()Lw3/a;

    move-result-object p1

    iget-object p1, p1, Lw3/a;->C:Ljava/lang/String;

    invoke-static {p3, p1, p2}, Lv3/E0;->d0(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method
