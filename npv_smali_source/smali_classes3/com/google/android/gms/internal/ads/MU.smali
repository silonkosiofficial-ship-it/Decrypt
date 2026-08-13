.class public final Lcom/google/android/gms/internal/ads/MU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/VT;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/QH;

.field private final c:Ljava/util/concurrent/Executor;

.field private final d:Lcom/google/android/gms/internal/ads/Q60;

.field private final e:Lcom/google/android/gms/internal/ads/eO;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/QH;Lcom/google/android/gms/internal/ads/Q60;Lcom/google/android/gms/internal/ads/eO;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/MU;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/MU;->b:Lcom/google/android/gms/internal/ads/QH;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/MU;->c:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/MU;->d:Lcom/google/android/gms/internal/ads/Q60;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/MU;->e:Lcom/google/android/gms/internal/ads/eO;

    return-void
.end method

.method private static e(Lcom/google/android/gms/internal/ads/R60;)Ljava/lang/String;
    .locals 1

    .prologue
    :try_start_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/R60;->v:Lorg/json/JSONObject;

    const-string v0, "tab_url"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)Z
    .locals 1

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/MU;->a:Landroid/content/Context;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/cg;->g(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/MU;->e(Lcom/google/android/gms/internal/ads/R60;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)LP4/d;
    .locals 8

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Uc:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/MU;->e:Lcom/google/android/gms/internal/ads/eO;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eO;->a()Lcom/google/android/gms/internal/ads/dO;

    move-result-object v0

    const-string v1, "action"

    const-string v2, "cstm_tbs_rndr"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dO;->g()V

    :cond_0
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/MU;->e(Lcom/google/android/gms/internal/ads/R60;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    move-object v4, v0

    goto :goto_0

    :cond_1
    move-object v4, v1

    :goto_0
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/KU;

    move-object v2, v1

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/KU;-><init>(Lcom/google/android/gms/internal/ads/MU;Landroid/net/Uri;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/MU;->c:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method final synthetic c(Landroid/net/Uri;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;Ljava/lang/Object;)LP4/d;
    .locals 10

    .prologue
    :try_start_0
    new-instance p5, Landroidx/browser/customtabs/d$d;

    invoke-direct {p5}, Landroidx/browser/customtabs/d$d;-><init>()V

    invoke-virtual {p5}, Landroidx/browser/customtabs/d$d;->a()Landroidx/browser/customtabs/d;

    move-result-object p5

    iget-object v0, p5, Landroidx/browser/customtabs/d;->a:Landroid/content/Intent;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    new-instance v2, Lu3/l;

    iget-object p1, p5, Landroidx/browser/customtabs/d;->a:Landroid/content/Intent;

    const/4 p5, 0x0

    invoke-direct {v2, p1, p5}, Lu3/l;-><init>(Landroid/content/Intent;Lu3/b;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/mr;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/mr;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/MU;->b:Lcom/google/android/gms/internal/ads/QH;

    new-instance v1, Lcom/google/android/gms/internal/ads/wA;

    invoke-direct {v1, p2, p3, p5}, Lcom/google/android/gms/internal/ads/wA;-><init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/pH;

    new-instance p3, Lcom/google/android/gms/internal/ads/LU;

    invoke-direct {p3, p0, p1}, Lcom/google/android/gms/internal/ads/LU;-><init>(Lcom/google/android/gms/internal/ads/MU;Lcom/google/android/gms/internal/ads/mr;)V

    invoke-direct {p2, p3, p5}, Lcom/google/android/gms/internal/ads/pH;-><init>(Lcom/google/android/gms/internal/ads/ZH;Lcom/google/android/gms/internal/ads/Ot;)V

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/ads/QH;->c(Lcom/google/android/gms/internal/ads/wA;Lcom/google/android/gms/internal/ads/pH;)Lcom/google/android/gms/internal/ads/mH;

    move-result-object p2

    new-instance p3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/mH;->h()Lcom/google/android/gms/internal/ads/MD;

    move-result-object v4

    new-instance v6, Lw3/a;

    const/4 p5, 0x0

    invoke-direct {v6, p5, p5, p5}, Lw3/a;-><init>(IIZ)V

    iget-object v9, p4, Lcom/google/android/gms/internal/ads/U60;->b:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p3

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lu3/l;Ls3/a;Lu3/z;Lu3/d;Lw3/a;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/MG;Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/mr;->c(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/MU;->d:Lcom/google/android/gms/internal/ads/Q60;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Q60;->a()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/mH;->i()Lcom/google/android/gms/internal/ads/lH;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    const-string p2, "Error in CustomTabsAdRenderer"

    invoke-static {p2, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method final synthetic d(Lcom/google/android/gms/internal/ads/mr;ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/SC;)V
    .locals 0

    .prologue
    :try_start_0
    invoke-static {}, Lr3/v;->m()Lu3/y;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/mr;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/MU;->e:Lcom/google/android/gms/internal/ads/eO;

    const/4 p4, 0x1

    invoke-static {p3, p1, p4, p2}, Lu3/y;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;ZLcom/google/android/gms/internal/ads/eO;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
