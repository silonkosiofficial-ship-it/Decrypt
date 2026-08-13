.class public final Lcom/google/android/gms/internal/ads/vn;
.super Lcom/google/android/gms/internal/ads/wn;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/gj;


# instance fields
.field private final c:Lcom/google/android/gms/internal/ads/Ot;

.field private final d:Landroid/content/Context;

.field private final e:Landroid/view/WindowManager;

.field private final f:Lcom/google/android/gms/internal/ads/hf;

.field g:Landroid/util/DisplayMetrics;

.field private h:F

.field i:I

.field j:I

.field private k:I

.field l:I

.field m:I

.field n:I

.field o:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Ot;Landroid/content/Context;Lcom/google/android/gms/internal/ads/hf;)V
    .locals 1

    const-string v0, ""

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/wn;-><init>(Lcom/google/android/gms/internal/ads/Ot;Ljava/lang/String;)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/vn;->i:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/vn;->j:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/vn;->l:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/vn;->m:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/vn;->n:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/vn;->o:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vn;->c:Lcom/google/android/gms/internal/ads/Ot;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/vn;->d:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/vn;->f:Lcom/google/android/gms/internal/ads/hf;

    const-string p1, "window"

    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vn;->e:Landroid/view/WindowManager;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 8

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/Ot;

    new-instance p1, Landroid/util/DisplayMetrics;

    invoke-direct {p1}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vn;->g:Landroid/util/DisplayMetrics;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/vn;->e:Landroid/view/WindowManager;

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/vn;->g:Landroid/util/DisplayMetrics;

    invoke-virtual {p1, p2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/vn;->g:Landroid/util/DisplayMetrics;

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    iput p2, p0, Lcom/google/android/gms/internal/ads/vn;->h:F

    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/vn;->k:I

    invoke-static {}, Ls3/y;->b()Lw3/g;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/vn;->g:Landroid/util/DisplayMetrics;

    iget p2, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {p1, p2}, Lw3/g;->x(Landroid/util/DisplayMetrics;I)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/vn;->i:I

    invoke-static {}, Ls3/y;->b()Lw3/g;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/vn;->g:Landroid/util/DisplayMetrics;

    iget p2, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {p1, p2}, Lw3/g;->x(Landroid/util/DisplayMetrics;I)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/vn;->j:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/vn;->c:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->h()Landroid/app/Activity;

    move-result-object p1

    const/4 p2, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Lr3/v;->t()Lv3/E0;

    invoke-static {p1}, Lv3/E0;->q(Landroid/app/Activity;)[I

    move-result-object p1

    invoke-static {}, Ls3/y;->b()Lw3/g;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/vn;->g:Landroid/util/DisplayMetrics;

    aget v2, p1, v0

    invoke-static {v1, v2}, Lw3/g;->x(Landroid/util/DisplayMetrics;I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/vn;->l:I

    invoke-static {}, Ls3/y;->b()Lw3/g;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/vn;->g:Landroid/util/DisplayMetrics;

    aget p1, p1, p2

    invoke-static {v1, p1}, Lw3/g;->x(Landroid/util/DisplayMetrics;I)I

    move-result p1

    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/vn;->m:I

    goto :goto_2

    :cond_1
    :goto_1
    iget p1, p0, Lcom/google/android/gms/internal/ads/vn;->i:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/vn;->l:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/vn;->j:I

    goto :goto_0

    :goto_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/vn;->c:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->I()Lcom/google/android/gms/internal/ads/Mu;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Mu;->i()Z

    move-result p1

    if-eqz p1, :cond_2

    iget p1, p0, Lcom/google/android/gms/internal/ads/vn;->i:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/vn;->n:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/vn;->j:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/vn;->o:I

    goto :goto_3

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/vn;->c:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {p1, v0, v0}, Lcom/google/android/gms/internal/ads/Ot;->measure(II)V

    :goto_3
    iget v2, p0, Lcom/google/android/gms/internal/ads/vn;->i:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/vn;->j:I

    iget v4, p0, Lcom/google/android/gms/internal/ads/vn;->l:I

    iget v5, p0, Lcom/google/android/gms/internal/ads/vn;->m:I

    iget v6, p0, Lcom/google/android/gms/internal/ads/vn;->h:F

    iget v7, p0, Lcom/google/android/gms/internal/ads/vn;->k:I

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/wn;->e(IIIIFI)V

    new-instance p1, Lcom/google/android/gms/internal/ads/un;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/un;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/vn;->f:Lcom/google/android/gms/internal/ads/hf;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.DIAL"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v3, "tel:"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/hf;->a(Landroid/content/Intent;)Z

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/un;->e(Z)Lcom/google/android/gms/internal/ads/un;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/vn;->f:Lcom/google/android/gms/internal/ads/hf;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v3, "sms:"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/hf;->a(Landroid/content/Intent;)Z

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/un;->c(Z)Lcom/google/android/gms/internal/ads/un;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/vn;->f:Lcom/google/android/gms/internal/ads/hf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/hf;->b()Z

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/un;->a(Z)Lcom/google/android/gms/internal/ads/un;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/vn;->f:Lcom/google/android/gms/internal/ads/hf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/hf;->c()Z

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/un;->d(Z)Lcom/google/android/gms/internal/ads/un;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/un;->b(Z)Lcom/google/android/gms/internal/ads/un;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/un;->h(Lcom/google/android/gms/internal/ads/un;)Z

    move-result v1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/un;->j(Lcom/google/android/gms/internal/ads/un;)Z

    move-result v2

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/un;->f(Lcom/google/android/gms/internal/ads/un;)Z

    move-result v3

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/un;->i(Lcom/google/android/gms/internal/ads/un;)Z

    move-result v4

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/un;->g(Lcom/google/android/gms/internal/ads/un;)Z

    move-result p1

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/vn;->c:Lcom/google/android/gms/internal/ads/Ot;

    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    const-string v7, "sms"

    invoke-virtual {v6, v7, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v1

    const-string v6, "tel"

    invoke-virtual {v1, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "calendar"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "storePicture"

    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "inlineVideo"

    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    const-string v1, "Error occurred while obtaining the MRAID capabilities."

    invoke-static {v1, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    :goto_4
    const-string v1, "onDeviceFeaturesReceived"

    invoke-interface {v5, v1, p1}, Lcom/google/android/gms/internal/ads/yk;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/vn;->c:Lcom/google/android/gms/internal/ads/Ot;

    const/4 v1, 0x2

    new-array v2, v1, [I

    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/ads/Ot;->getLocationOnScreen([I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/vn;->d:Landroid/content/Context;

    invoke-static {}, Ls3/y;->b()Lw3/g;

    move-result-object v3

    aget v0, v2, v0

    invoke-virtual {v3, p1, v0}, Lw3/g;->e(Landroid/content/Context;I)I

    move-result p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vn;->d:Landroid/content/Context;

    invoke-static {}, Ls3/y;->b()Lw3/g;

    move-result-object v3

    aget p2, v2, p2

    invoke-virtual {v3, v0, p2}, Lw3/g;->e(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/vn;->h(II)V

    invoke-static {v1}, Lw3/p;->j(I)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "Dispatching Ready Event."

    invoke-static {p1}, Lw3/p;->f(Ljava/lang/String;)V

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/vn;->c:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->n()Lw3/a;

    move-result-object p1

    iget-object p1, p1, Lw3/a;->C:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/wn;->d(Ljava/lang/String;)V

    return-void
.end method

.method public final h(II)V
    .locals 6

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vn;->d:Landroid/content/Context;

    instance-of v1, v0, Landroid/app/Activity;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lv3/E0;->r(Landroid/app/Activity;)[I

    move-result-object v0

    aget v0, v0, v2

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/vn;->c:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->I()Lcom/google/android/gms/internal/ads/Mu;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/vn;->c:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->I()Lcom/google/android/gms/internal/ads/Mu;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Mu;->i()Z

    move-result v1

    if-nez v1, :cond_6

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/vn;->c:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->getWidth()I

    move-result v3

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->getHeight()I

    move-result v1

    sget-object v4, Lcom/google/android/gms/internal/ads/Af;->d0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_4

    if-nez v3, :cond_3

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/vn;->c:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/Ot;->I()Lcom/google/android/gms/internal/ads/Mu;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/vn;->c:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/Ot;->I()Lcom/google/android/gms/internal/ads/Mu;

    move-result-object v3

    iget v3, v3, Lcom/google/android/gms/internal/ads/Mu;->c:I

    goto :goto_1

    :cond_2
    move v3, v2

    :cond_3
    :goto_1
    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/vn;->c:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->I()Lcom/google/android/gms/internal/ads/Mu;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/vn;->c:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->I()Lcom/google/android/gms/internal/ads/Mu;

    move-result-object v1

    iget v2, v1, Lcom/google/android/gms/internal/ads/Mu;->b:I

    goto :goto_2

    :cond_4
    move v2, v1

    :cond_5
    :goto_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/vn;->d:Landroid/content/Context;

    invoke-static {}, Ls3/y;->b()Lw3/g;

    move-result-object v4

    invoke-virtual {v4, v1, v3}, Lw3/g;->e(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/vn;->n:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/vn;->d:Landroid/content/Context;

    invoke-static {}, Ls3/y;->b()Lw3/g;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Lw3/g;->e(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/vn;->o:I

    :cond_6
    sub-int v0, p2, v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/vn;->n:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/vn;->o:I

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/wn;->b(IIII)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vn;->c:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Ku;->x(II)V

    return-void
.end method
