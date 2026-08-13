.class public final Lcom/google/android/gms/internal/ads/dR;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final l:Ljava/util/regex/Pattern;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Su;

.field private final b:Landroid/content/Context;

.field private final c:Lw3/a;

.field private final d:Lcom/google/android/gms/internal/ads/n70;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Ljava/util/concurrent/ScheduledExecutorService;

.field private final g:Ljava/lang/String;

.field private final h:Lcom/google/android/gms/internal/ads/Q90;

.field private final i:Lcom/google/android/gms/internal/ads/YN;

.field private final j:Ljava/lang/Object;

.field private final k:Lcom/google/android/gms/internal/ads/Xo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "\\?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/dR;->l:Ljava/util/regex/Pattern;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/ads/Su;Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/n70;Ljava/util/concurrent/Executor;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/YN;Lcom/google/android/gms/internal/ads/Xo;Lcom/google/android/gms/internal/ads/lS;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p10, Ljava/lang/Object;

    invoke-direct {p10}, Ljava/lang/Object;-><init>()V

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/dR;->j:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dR;->a:Lcom/google/android/gms/internal/ads/Su;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dR;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/dR;->c:Lw3/a;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/dR;->d:Lcom/google/android/gms/internal/ads/n70;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/dR;->e:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/dR;->g:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/dR;->h:Lcom/google/android/gms/internal/ads/Q90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Su;->D()Lcom/google/android/gms/internal/ads/C70;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/dR;->i:Lcom/google/android/gms/internal/ads/YN;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/dR;->k:Lcom/google/android/gms/internal/ads/Xo;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/dR;->f:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method private final d(Ljava/lang/String;Ljava/lang/String;)LP4/d;
    .locals 11

    .prologue
    const-string v0, ""

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/XV;

    const/16 p2, 0xf

    const-string v0, "Invalid ad string."

    invoke-direct {p1, p2, v0}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dR;->b:Landroid/content/Context;

    const/16 v2, 0xb

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/D90;->a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/E90;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/E90;->h()Lcom/google/android/gms/internal/ads/E90;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dR;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/dR;->c:Lw3/a;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/dR;->a:Lcom/google/android/gms/internal/ads/Su;

    invoke-static {}, Lr3/v;->j()Lcom/google/android/gms/internal/ads/ml;

    move-result-object v5

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/Su;->F()Lcom/google/android/gms/internal/ads/T90;

    move-result-object v4

    invoke-virtual {v5, v2, v3, v4}, Lcom/google/android/gms/internal/ads/ml;->a(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/T90;)Lcom/google/android/gms/internal/ads/wl;

    move-result-object v2

    const-string v3, "google.afma.response.normalize"

    sget-object v4, Lcom/google/android/gms/internal/ads/tl;->b:Lcom/google/android/gms/internal/ads/ql;

    invoke-virtual {v2, v3, v4, v4}, Lcom/google/android/gms/internal/ads/wl;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/ol;Lcom/google/android/gms/internal/ads/nl;)Lcom/google/android/gms/internal/ads/ll;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/ads/Af;->S6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const-string v4, "1"

    const-string v5, "sst"

    if-eqz v3, :cond_3

    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v6, "fetch_url"

    invoke-virtual {v3, v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :catch_0
    move-object v3, v0

    :goto_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/dR;->i:Lcom/google/android/gms/internal/ads/YN;

    const-string v4, "2"

    invoke-virtual {p1, v5, v4}, Lcom/google/android/gms/internal/ads/YN;->c(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->U6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    move-object v9, p1

    check-cast v9, Ljava/lang/String;

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->T6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lcom/google/android/gms/internal/ads/dR;->l:Ljava/util/regex/Pattern;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Qg0;->c(Ljava/util/regex/Pattern;)Lcom/google/android/gms/internal/ads/Qg0;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/Qg0;->f(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-ge v0, v4, :cond_1

    new-instance p1, Lcom/google/android/gms/internal/ads/XV;

    const-string v0, "Invalid fetch URL."

    invoke-direct {p1, v5, v0}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    goto/16 :goto_1

    :cond_1
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Landroid/net/Uri$Builder;->query(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_2
    move-object v5, v3

    new-instance p1, Lcom/google/android/gms/internal/ads/iS;

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v8

    const/4 v10, 0x0

    const v6, 0xea60

    move-object v4, p1

    invoke-direct/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/iS;-><init>(Ljava/lang/String;ILjava/util/Map;[BLjava/lang/String;Z)V

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v3, Lcom/google/android/gms/internal/ads/bR;

    invoke-direct {v3, p0, p1}, Lcom/google/android/gms/internal/ads/bR;-><init>(Lcom/google/android/gms/internal/ads/dR;Lcom/google/android/gms/internal/ads/iS;)V

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Dk0;->D(LP4/d;)Lcom/google/android/gms/internal/ads/Dk0;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->V6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v3, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dR;->f:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, v3, v4, v5, v0}, Lcom/google/android/gms/internal/ads/Nk0;->o(LP4/d;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)LP4/d;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Dk0;

    new-instance v0, Lcom/google/android/gms/internal/ads/cR;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/cR;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/dR;->e:Ljava/util/concurrent/Executor;

    const-class v4, Ljava/lang/Exception;

    invoke-static {p1, v4, v0, v3}, Lcom/google/android/gms/internal/ads/Nk0;->f(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Dk0;

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dR;->i:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0, v5, v4}, Lcom/google/android/gms/internal/ads/YN;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    new-instance v0, Lcom/google/android/gms/internal/ads/YQ;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/YQ;-><init>(Lcom/google/android/gms/internal/ads/dR;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/dR;->e:Ljava/util/concurrent/Executor;

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/ZQ;

    invoke-direct {p2, v2}, Lcom/google/android/gms/internal/ads/ZQ;-><init>(Lcom/google/android/gms/internal/ads/ll;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dR;->e:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/aR;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/aR;-><init>(Lcom/google/android/gms/internal/ads/dR;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dR;->e:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/dR;->h:Lcom/google/android/gms/internal/ads/Q90;

    invoke-static {p1, p2, v1}, Lcom/google/android/gms/internal/ads/P90;->a(LP4/d;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)V

    return-object p1
.end method

.method private final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    const-string v0, "ad_types"

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "unknown"

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/dR;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_1
    const-string v1, "Failed to update the ad types for rendering. "

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    return-object p1
.end method

.method private final f(Lcom/google/android/gms/internal/ads/MN;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dR;->i:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->X6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v1

    invoke-interface {v1}, LV3/f;->a()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_0
    return-void
.end method

.method private static final g(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    const-string v0, ""

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const-string p0, "request_id"

    invoke-virtual {v1, p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catch_0
    return-object v0
.end method


# virtual methods
.method public final a()LP4/d;
    .locals 13

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dR;->d:Lcom/google/android/gms/internal/ads/n70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    iget-object v0, v0, Ls3/X1;->Z:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_11

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/dR;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->R6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const/4 v4, -0x1

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v1, "&request_id="

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v4, :cond_0

    add-int/lit8 v1, v1, 0xc

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :cond_1
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/ads/XV;

    const/16 v1, 0xf

    const-string v2, "Invalid ad string."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object v0

    return-object v0

    :cond_2
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/dR;->j:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/dR;->a:Lcom/google/android/gms/internal/ads/Su;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/Su;->v()LB3/s0;

    move-result-object v5

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/dR;->i:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v5, v1, v6}, LB3/s0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/YN;)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v7

    invoke-virtual {v7, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dR;->i:Lcom/google/android/gms/internal/ads/YN;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v9, :cond_8

    :try_start_1
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v10, "is_gbid"

    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "true"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_b

    :catch_0
    :cond_3
    :try_start_2
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_1
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-nez v9, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v9, "&"

    invoke-virtual {v0, v9}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v9

    if-eq v9, v4, :cond_5

    invoke-virtual {v0, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_5
    move-object v4, v7

    :goto_2
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v9, :cond_6

    goto :goto_6

    :cond_6
    const/16 v9, 0xb

    :try_start_3
    invoke-static {v4, v9}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v4

    const-string v9, "UTF-8"

    invoke-virtual {v1, v9}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v9

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10
    :try_end_3
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v10, :cond_7

    :goto_3
    move-object v10, v7

    goto :goto_4

    :cond_7
    :try_start_4
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v11, "arek"

    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_4

    :catch_1
    move-exception v2

    goto :goto_5

    :catch_2
    move-exception v10

    :try_start_5
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v12, "Failed to get key from QueryJSONMap"

    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lv3/q0;->k(Ljava/lang/String;)V

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v11

    const-string v12, "CryptoUtils.getKeyFromQueryJsonMap"

    invoke-virtual {v11, v10, v12}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_3

    :goto_4
    invoke-static {v4, v9, v10, v2}, Lcom/google/android/gms/internal/ads/C70;->b([B[BLjava/lang/String;Lcom/google/android/gms/internal/ads/YN;)Ljava/lang/String;

    move-result-object v0
    :try_end_5
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_6

    :goto_5
    :try_start_6
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v9, "Failed to decode the adResponse. "

    invoke-virtual {v9, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lv3/q0;->k(Ljava/lang/String;)V

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v4

    const-string v9, "PreloadedLoader.decryptAdResponseIfNecessary"

    invoke-virtual {v4, v2, v9}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_8
    :goto_6
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_9

    :catch_3
    const-string v2, ""
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_7

    :cond_9
    :try_start_7
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    const-string v4, "render_id"

    const-string v9, ""

    invoke-virtual {v2, v4, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_7
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_b

    const-string v4, ""
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    new-instance v9, Ljava/lang/String;

    invoke-static {v2, v8}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v10

    sget-object v11, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v9, v10, v11}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_9
    .catch Ljava/lang/IllegalArgumentException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    move-object v4, v9

    goto :goto_8

    :catch_4
    move-exception v9

    :try_start_a
    const-string v10, "Ad grouping: Has render_id, but not base64 encoded: "

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lv3/q0;->k(Ljava/lang/String;)V

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v10

    const-string v11, "PreloadedLoader.decodeRenderId"

    invoke-virtual {v10, v9, v11}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_8
    const/16 v9, 0x3a

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/kg0;->c(C)Lcom/google/android/gms/internal/ads/kg0;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/Qg0;->b(Lcom/google/android/gms/internal/ads/kg0;)Lcom/google/android/gms/internal/ads/Qg0;

    move-result-object v9

    invoke-virtual {v9, v4}, Lcom/google/android/gms/internal/ads/Qg0;->f(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x2

    if-ne v9, v10, :cond_a

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    goto :goto_9

    :cond_a
    const-string v4, "Ad grouping: Has render_id, but invalid format: "

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lv3/q0;->k(Ljava/lang/String;)V

    :cond_b
    move v2, v8

    :goto_9
    if-eqz v7, :cond_c

    new-instance v4, Landroid/util/Pair;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v4, v7, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_a

    :cond_c
    new-instance v4, Landroid/util/Pair;

    const-string v2, ""

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {v4, v2, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_a
    iget-object v2, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_e

    if-lez v4, :cond_e

    invoke-virtual {v5, v1, v2}, LB3/s0;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_d

    new-instance v0, Lcom/google/android/gms/internal/ads/XV;

    const-string v1, "The ad has already been shown."

    const/16 v2, 0xa

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object v0

    monitor-exit v3

    return-object v0

    :cond_d
    invoke-virtual {v5, v1, v2, v4}, LB3/s0;->g(Ljava/lang/String;Ljava/lang/String;I)Z

    move-result v2

    if-nez v2, :cond_f

    :cond_e
    invoke-virtual {v5, v1}, LB3/s0;->f(Ljava/lang/String;)V

    :cond_f
    monitor-exit v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_c

    :cond_10
    invoke-direct {p0, v6}, Lcom/google/android/gms/internal/ads/dR;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/dR;->d(Ljava/lang/String;Ljava/lang/String;)LP4/d;

    move-result-object v0

    return-object v0

    :goto_b
    :try_start_b
    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    throw v0

    :cond_11
    :goto_c
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dR;->d:Lcom/google/android/gms/internal/ads/n70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    iget-object v0, v0, Ls3/X1;->U:Ls3/X;

    if-eqz v0, :cond_14

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->J6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_12

    goto :goto_d

    :cond_12
    iget-object v1, v0, Ls3/X;->C:Ljava/lang/String;

    iget-object v2, v0, Ls3/X;->D:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/dR;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/dR;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_13

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dR;->a:Lcom/google/android/gms/internal/ads/Su;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Su;->v()LB3/s0;

    move-result-object v2

    invoke-virtual {v2, v1}, LB3/s0;->f(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dR;->i:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object v2

    const-string v3, "request_id"

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_d
    iget-object v1, v0, Ls3/X;->C:Ljava/lang/String;

    iget-object v0, v0, Ls3/X;->D:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/dR;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/ads/dR;->d(Ljava/lang/String;Ljava/lang/String;)LP4/d;

    move-result-object v0

    return-object v0

    :cond_13
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dR;->i:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object v0

    const-string v1, "ridmm"

    const-string v2, "true"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_14
    new-instance v0, Lcom/google/android/gms/internal/ads/XV;

    const/16 v1, 0xe

    const-string v2, "Mismatch request IDs."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object v0

    return-object v0
.end method

.method final synthetic b(Lorg/json/JSONObject;)LP4/d;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/e70;

    new-instance v1, Lcom/google/android/gms/internal/ads/a70;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dR;->d:Lcom/google/android/gms/internal/ads/n70;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/a70;-><init>(Lcom/google/android/gms/internal/ads/n70;)V

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/io/StringReader;

    invoke-direct {v2, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {v2, p1}, Lcom/google/android/gms/internal/ads/c70;->a(Ljava/io/Reader;Lcom/google/android/gms/internal/ads/Po;)Lcom/google/android/gms/internal/ads/c70;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/e70;-><init>(Lcom/google/android/gms/internal/ads/a70;Lcom/google/android/gms/internal/ads/c70;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method final synthetic c(Lcom/google/android/gms/internal/ads/iS;)Ljava/lang/String;
    .locals 7

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/MN;->e0:Lcom/google/android/gms/internal/ads/MN;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/dR;->f(Lcom/google/android/gms/internal/ads/MN;)V

    const/4 v0, 0x0

    const/4 v1, -0x1

    :goto_0
    const/4 v2, 0x1

    :try_start_0
    sget-object v3, Lcom/google/android/gms/internal/ads/Af;->W6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ge v0, v3, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dR;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/dR;->c:Lw3/a;

    iget-object v3, v3, Lw3/a;->C:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/dR;->k:Lcom/google/android/gms/internal/ads/Xo;

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v5

    new-instance v6, Lcom/google/android/gms/internal/ads/kS;

    invoke-direct {v6, v1, v3, v4, v5}, Lcom/google/android/gms/internal/ads/kS;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Xo;I)V

    invoke-virtual {v6, p1}, Lcom/google/android/gms/internal/ads/kS;->a(Lcom/google/android/gms/internal/ads/iS;)Lcom/google/android/gms/internal/ads/jS;

    move-result-object v1

    iget v3, v1, Lcom/google/android/gms/internal/ads/jS;->a:I

    sget-object v4, Lcom/google/android/gms/internal/ads/Af;->X6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/dR;->i:Lcom/google/android/gms/internal/ads/YN;

    const-string v5, "fr"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/ads/YN;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_1
    const/16 v4, 0xc8

    if-ne v3, v4, :cond_1

    sget-object p1, Lcom/google/android/gms/internal/ads/MN;->f0:Lcom/google/android/gms/internal/ads/MN;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/dR;->f(Lcom/google/android/gms/internal/ads/MN;)V

    iget-object p1, v1, Lcom/google/android/gms/internal/ads/jS;->c:Ljava/lang/String;

    return-object p1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    move v1, v3

    goto :goto_0

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/XV;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Received HTTP error code from ad server: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v2, v0}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    new-instance v0, Lcom/google/android/gms/internal/ads/XV;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    const-string v1, "Fetch failed."

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    :goto_3
    invoke-direct {v0, v2, v1, p1}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
