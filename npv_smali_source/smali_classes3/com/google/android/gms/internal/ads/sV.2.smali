.class public final Lcom/google/android/gms/internal/ads/sV;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/mV;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/nI;

.field private final b:Lcom/google/android/gms/internal/ads/Yk0;

.field private final c:Lcom/google/android/gms/internal/ads/CK;

.field private final d:Lcom/google/android/gms/internal/ads/N70;

.field private final e:Lcom/google/android/gms/internal/ads/VL;

.field private final f:Lcom/google/android/gms/internal/ads/YN;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/nI;Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/CK;Lcom/google/android/gms/internal/ads/N70;Lcom/google/android/gms/internal/ads/VL;Lcom/google/android/gms/internal/ads/YN;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sV;->a:Lcom/google/android/gms/internal/ads/nI;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/sV;->b:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/sV;->c:Lcom/google/android/gms/internal/ads/CK;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/sV;->d:Lcom/google/android/gms/internal/ads/N70;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/sV;->e:Lcom/google/android/gms/internal/ads/VL;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/sV;->f:Lcom/google/android/gms/internal/ads/YN;

    return-void
.end method

.method private final g(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lorg/json/JSONObject;)LP4/d;
    .locals 9

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->m2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sV;->f:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/MN;->X:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v2

    invoke-interface {v2}, LV3/f;->a()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sV;->d:Lcom/google/android/gms/internal/ads/N70;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sV;->c:Lcom/google/android/gms/internal/ads/CK;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/N70;->a()LP4/d;

    move-result-object v5

    invoke-virtual {v1, p1, p2, p3}, Lcom/google/android/gms/internal/ads/CK;->a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lorg/json/JSONObject;)LP4/d;

    move-result-object v4

    const/4 v0, 0x2

    new-array v0, v0, [LP4/d;

    const/4 v1, 0x0

    aput-object v5, v0, v1

    const/4 v1, 0x1

    aput-object v4, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->c([LP4/d;)Lcom/google/android/gms/internal/ads/Lk0;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/nV;

    move-object v2, v1

    move-object v3, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/nV;-><init>(Lcom/google/android/gms/internal/ads/sV;LP4/d;LP4/d;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lorg/json/JSONObject;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sV;->b:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Lk0;->a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)Z
    .locals 0

    .prologue
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/R60;->s:Lcom/google/android/gms/internal/ads/W60;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/W60;->c:Lorg/json/JSONObject;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)LP4/d;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sV;->d:Lcom/google/android/gms/internal/ads/N70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/N70;->a()LP4/d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/pV;

    invoke-direct {v1, p0, p2}, Lcom/google/android/gms/internal/ads/pV;-><init>(Lcom/google/android/gms/internal/ads/sV;Lcom/google/android/gms/internal/ads/R60;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sV;->b:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/qV;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/qV;-><init>(Lcom/google/android/gms/internal/ads/sV;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sV;->b:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method final synthetic c(LP4/d;LP4/d;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/ZI;
    .locals 5

    .prologue
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/eJ;

    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/PL;

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->m2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sV;->f:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/MN;->Y:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v3

    invoke-interface {v3}, LV3/f;->a()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sV;->a:Lcom/google/android/gms/internal/ads/nI;

    new-instance v2, Lcom/google/android/gms/internal/ads/wA;

    const/4 v3, 0x0

    invoke-direct {v2, p3, p4, v3}, Lcom/google/android/gms/internal/ads/wA;-><init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;)V

    new-instance p3, Lcom/google/android/gms/internal/ads/qJ;

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/ads/qJ;-><init>(Lcom/google/android/gms/internal/ads/eJ;)V

    new-instance p4, Lcom/google/android/gms/internal/ads/BI;

    invoke-direct {p4, p5, p2}, Lcom/google/android/gms/internal/ads/BI;-><init>(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/PL;)V

    invoke-virtual {v1, v2, p3, p4}, Lcom/google/android/gms/internal/ads/nI;->c(Lcom/google/android/gms/internal/ads/wA;Lcom/google/android/gms/internal/ads/qJ;Lcom/google/android/gms/internal/ads/BI;)Lcom/google/android/gms/internal/ads/fJ;

    move-result-object p3

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p4

    invoke-virtual {p4, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object p4

    invoke-interface {p4}, LV3/f;->a()J

    move-result-wide p4

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sV;->f:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/MN;->Z:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, p4, p5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sV;->f:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/MN;->a0:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, p4, p5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_1
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/fJ;->j()Lcom/google/android/gms/internal/ads/AL;

    move-result-object p4

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/AL;->b()V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/fJ;->k()Lcom/google/android/gms/internal/ads/LL;

    move-result-object p4

    invoke-virtual {p4, p2}, Lcom/google/android/gms/internal/ads/LL;->a(Lcom/google/android/gms/internal/ads/PL;)V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/fJ;->i()Lcom/google/android/gms/internal/ads/jL;

    move-result-object p2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/eJ;->f0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object p4

    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/ads/jL;->a(Lcom/google/android/gms/internal/ads/Ot;)V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/fJ;->l()Lcom/google/android/gms/internal/ads/UL;

    move-result-object p2

    iget-object p4, p0, Lcom/google/android/gms/internal/ads/sV;->e:Lcom/google/android/gms/internal/ads/VL;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/eJ;->d0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object p1

    invoke-virtual {p2, p4, p1}, Lcom/google/android/gms/internal/ads/UL;->a(Lcom/google/android/gms/internal/ads/VL;Lcom/google/android/gms/internal/ads/Ot;)V

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sV;->f:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/ads/MN;->b0:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object p4

    invoke-interface {p4}, LV3/f;->a()J

    move-result-wide p4

    invoke-virtual {p1, p2, p4, p5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_2
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/hJ;->h()Lcom/google/android/gms/internal/ads/ZI;

    move-result-object p1

    return-object p1
.end method

.method final synthetic d(Lcom/google/android/gms/internal/ads/PL;Lorg/json/JSONObject;)LP4/d;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sV;->d:Lcom/google/android/gms/internal/ads/N70;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/N70;->b(LP4/d;)V

    const-string p1, "success"

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "json"

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string p2, "ads"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/kl;

    const-string p2, "process json failed"

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/kl;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method final synthetic e(Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/PL;)LP4/d;
    .locals 4

    .prologue
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "isNonagon"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->B8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, LV3/n;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "skipDeepLinkValidation"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/R60;->s:Lcom/google/android/gms/internal/ads/W60;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/W60;->c:Lorg/json/JSONObject;

    const-string v2, "response"

    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "sdk_params"

    invoke-virtual {v1, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "google.afma.nativeAds.preProcessJson"

    invoke-virtual {p2, p1, v1}, Lcom/google/android/gms/internal/ads/PL;->g(Ljava/lang/String;Lorg/json/JSONObject;)LP4/d;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/oV;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/oV;-><init>(Lcom/google/android/gms/internal/ads/sV;Lcom/google/android/gms/internal/ads/PL;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/sV;->b:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method final synthetic f(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lorg/json/JSONArray;)LP4/d;
    .locals 6

    .prologue
    invoke-virtual {p3}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/oQ;

    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/ads/oQ;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    goto/16 :goto_3

    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget v0, v0, Lcom/google/android/gms/internal/ads/n70;->k:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-le v0, v3, :cond_4

    invoke-virtual {p3}, Lorg/json/JSONArray;->length()I

    move-result v0

    sget-object v3, Lcom/google/android/gms/internal/ads/Af;->n2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sV;->f:Lcom/google/android/gms/internal/ads/YN;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "nsl"

    invoke-virtual {v3, v5, v4}, Lcom/google/android/gms/internal/ads/YN;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sV;->d:Lcom/google/android/gms/internal/ads/N70;

    iget-object v4, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget v4, v4, Lcom/google/android/gms/internal/ads/n70;->k:I

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/N70;->c(I)V

    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget v4, v4, Lcom/google/android/gms/internal/ads/n70;->k:I

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    iget-object v4, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget v4, v4, Lcom/google/android/gms/internal/ads/n70;->k:I

    if-ge v2, v4, :cond_3

    if-ge v2, v0, :cond_2

    invoke-virtual {p3, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    invoke-direct {p0, p1, p2, v4}, Lcom/google/android/gms/internal/ads/sV;->g(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lorg/json/JSONObject;)LP4/d;

    move-result-object v4

    :goto_1
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    new-instance v4, Lcom/google/android/gms/internal/ads/oQ;

    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/oQ;-><init>(I)V

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object v4

    goto :goto_1

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    goto :goto_3

    :cond_4
    invoke-virtual {p3, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/sV;->g(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lorg/json/JSONObject;)LP4/d;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/rV;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/rV;-><init>()V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/sV;->b:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/Nk0;->m(LP4/d;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    :goto_3
    return-object p1
.end method
