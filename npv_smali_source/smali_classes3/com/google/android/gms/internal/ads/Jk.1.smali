.class public final Lcom/google/android/gms/internal/ads/Jk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Bk;
.implements Lcom/google/android/gms/internal/ads/Ak;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/Ot;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/Z9;Lr3/a;)V
    .locals 16

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lr3/v;->a()Lcom/google/android/gms/internal/ads/eu;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Mu;->a()Lcom/google/android/gms/internal/ads/Mu;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/od;->a()Lcom/google/android/gms/internal/ads/od;

    move-result-object v11

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v0, p1

    move-object/from16 v7, p2

    invoke-static/range {v0 .. v15}, Lcom/google/android/gms/internal/ads/eu;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Mu;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/Z9;Lcom/google/android/gms/internal/ads/ig;Lw3/a;Lcom/google/android/gms/internal/ads/Qf;Lr3/n;Lr3/a;Lcom/google/android/gms/internal/ads/od;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;Lcom/google/android/gms/internal/ads/tT;Lcom/google/android/gms/internal/ads/r70;)Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/google/android/gms/internal/ads/Jk;->C:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/view/View;->setWillNotDraw(Z)V

    return-void
.end method

.method private static final w(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    invoke-static {}, Ls3/y;->b()Lw3/g;

    invoke-static {}, Lw3/g;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "runOnUiThread > the UI thread is the main thread, the runnable will be run now"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    const-string v0, "runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result p0

    if-nez p0, :cond_1

    const-string p0, "runOnUiThread > the runnable could not be placed to the message queue"

    invoke-static {p0}, Lw3/p;->g(Ljava/lang/String;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final G(Ljava/lang/String;)V
    .locals 1

    const-string v0, "loadHtml on adWebView from html"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/Gk;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/Gk;-><init>(Lcom/google/android/gms/internal/ads/Jk;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Jk;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic G0(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zk;->d(Lcom/google/android/gms/internal/ads/Ak;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final synthetic O(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zk;->a(Lcom/google/android/gms/internal/ads/Ak;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final S(Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "loadHtmlWrapper on adWebView from path: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/Dk;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/Dk;-><init>(Lcom/google/android/gms/internal/ads/Jk;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Jk;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final W(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Ik;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/Ik;-><init>(Lcom/google/android/gms/internal/ads/Jk;Lcom/google/android/gms/internal/ads/gj;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Jk;->C:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {p2, p1, v0}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    return-void
.end method

.method public final synthetic a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zk;->b(Lcom/google/android/gms/internal/ads/Ak;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final a0(Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "loadJavascript on adWebView from path: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/Hk;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/Hk;-><init>(Lcom/google/android/gms/internal/ads/Jk;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Jk;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method final synthetic b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jk;->C:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/Kk;->o(Ljava/lang/String;)V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jk;->C:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->destroy()V

    return-void
.end method

.method public final c0(Lcom/google/android/gms/internal/ads/Mk;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jk;->C:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v0

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/ads/Ek;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/Ek;-><init>(Lcom/google/android/gms/internal/ads/Mk;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Ku;->K(Lcom/google/android/gms/internal/ads/Ju;)V

    return-void
.end method

.method final synthetic d(Ljava/lang/String;)V
    .locals 3

    const-string v0, "UTF-8"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Jk;->C:Lcom/google/android/gms/internal/ads/Ot;

    const-string v2, "text/html"

    invoke-interface {v1, p1, v2, v0}, Lcom/google/android/gms/internal/ads/Ot;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method final synthetic f(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jk;->C:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/Ot;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jk;->C:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->L0()Z

    move-result v0

    return v0
.end method

.method public final j()Lcom/google/android/gms/internal/ads/jl;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/jl;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/jl;-><init>(Lcom/google/android/gms/internal/ads/il;)V

    return-object v0
.end method

.method final synthetic l(Ljava/lang/String;)V
    .locals 3

    const-string v0, "UTF-8"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Jk;->C:Lcom/google/android/gms/internal/ads/Ot;

    const-string v2, "text/html"

    invoke-interface {v1, p1, v2, v0}, Lcom/google/android/gms/internal/ads/Ot;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final o(Ljava/lang/String;)V
    .locals 1

    const-string v0, "invokeJavascript on adWebView from js"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/Fk;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/Fk;-><init>(Lcom/google/android/gms/internal/ads/Jk;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Jk;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic q(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zk;->c(Lcom/google/android/gms/internal/ads/Ak;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final q0(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Ck;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/Ck;-><init>(Lcom/google/android/gms/internal/ads/gj;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Jk;->C:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {p2, p1, v0}, Lcom/google/android/gms/internal/ads/Ot;->V0(Ljava/lang/String;LV3/o;)V

    return-void
.end method
