.class public final Lcom/google/android/gms/internal/ads/RK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/uK;

.field private final c:Lcom/google/android/gms/internal/ads/Z9;

.field private final d:Lw3/a;

.field private final e:Lr3/a;

.field private final f:Lcom/google/android/gms/internal/ads/od;

.field private final g:Ljava/util/concurrent/Executor;

.field private final h:Lcom/google/android/gms/internal/ads/dh;

.field private final i:Lcom/google/android/gms/internal/ads/kL;

.field private final j:Lcom/google/android/gms/internal/ads/BM;

.field private final k:Ljava/util/concurrent/ScheduledExecutorService;

.field private final l:Lcom/google/android/gms/internal/ads/VL;

.field private final m:Lcom/google/android/gms/internal/ads/eO;

.field private final n:Lcom/google/android/gms/internal/ads/La0;

.field private final o:Lcom/google/android/gms/internal/ads/iT;

.field private final p:Lcom/google/android/gms/internal/ads/tT;

.field private final q:Lcom/google/android/gms/internal/ads/r70;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/uK;Lcom/google/android/gms/internal/ads/Z9;Lw3/a;Lr3/a;Lcom/google/android/gms/internal/ads/od;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/n70;Lcom/google/android/gms/internal/ads/kL;Lcom/google/android/gms/internal/ads/BM;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/eO;Lcom/google/android/gms/internal/ads/La0;Lcom/google/android/gms/internal/ads/iT;Lcom/google/android/gms/internal/ads/VL;Lcom/google/android/gms/internal/ads/tT;Lcom/google/android/gms/internal/ads/r70;)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->a:Landroid/content/Context;

    move-object v1, p2

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->b:Lcom/google/android/gms/internal/ads/uK;

    move-object v1, p3

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->c:Lcom/google/android/gms/internal/ads/Z9;

    move-object v1, p4

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->d:Lw3/a;

    move-object v1, p5

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->e:Lr3/a;

    move-object v1, p6

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->f:Lcom/google/android/gms/internal/ads/od;

    move-object v1, p7

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->g:Ljava/util/concurrent/Executor;

    move-object v1, p8

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/n70;->i:Lcom/google/android/gms/internal/ads/dh;

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->h:Lcom/google/android/gms/internal/ads/dh;

    move-object v1, p9

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->i:Lcom/google/android/gms/internal/ads/kL;

    move-object v1, p10

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->j:Lcom/google/android/gms/internal/ads/BM;

    move-object v1, p11

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->k:Ljava/util/concurrent/ScheduledExecutorService;

    move-object v1, p12

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->m:Lcom/google/android/gms/internal/ads/eO;

    move-object v1, p13

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->n:Lcom/google/android/gms/internal/ads/La0;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->o:Lcom/google/android/gms/internal/ads/iT;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->l:Lcom/google/android/gms/internal/ads/VL;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->p:Lcom/google/android/gms/internal/ads/tT;

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->q:Lcom/google/android/gms/internal/ads/r70;

    return-void
.end method

.method public static final i(Lorg/json/JSONObject;)Ls3/q1;
    .locals 1

    .prologue
    const-string v0, "mute"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "default_reason"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/RK;->r(Lorg/json/JSONObject;)Ls3/q1;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final j(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 3

    .prologue
    const-string v0, "mute"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "reasons"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-gtz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_3

    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/RK;->r(Lorg/json/JSONObject;)Ls3/q1;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ci0;->M(Ljava/util/Collection;)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p0

    return-object p0
.end method

.method private final k(II)Ls3/c2;
    .locals 3

    .prologue
    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {}, Ls3/c2;->s()Ls3/c2;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/RK;->a:Landroid/content/Context;

    new-instance v1, Ls3/c2;

    new-instance v2, Lk3/h;

    invoke-direct {v2, p1, p2}, Lk3/h;-><init>(II)V

    invoke-direct {v1, v0, v2}, Ls3/c2;-><init>(Landroid/content/Context;Lk3/h;)V

    return-object v1
.end method

.method private static l(LP4/d;Ljava/lang/Object;)LP4/d;
    .locals 2

    new-instance p1, Lcom/google/android/gms/internal/ads/MK;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/MK;-><init>(Ljava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    const-class v1, Ljava/lang/Exception;

    invoke-static {p0, v1, p1, v0}, Lcom/google/android/gms/internal/ads/Nk0;->f(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p0

    return-object p0
.end method

.method private static m(ZLP4/d;Ljava/lang/Object;)LP4/d;
    .locals 0

    .prologue
    if-eqz p0, :cond_0

    new-instance p0, Lcom/google/android/gms/internal/ads/NK;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/NK;-><init>(LP4/d;)V

    sget-object p2, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p1, p0, p2}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/RK;->l(LP4/d;Ljava/lang/Object;)LP4/d;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private final n(Lorg/json/JSONObject;Z)LP4/d;
    .locals 13

    .prologue
    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v1, "url"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v1, "scale"

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    invoke-virtual {p1, v1, v4, v5}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v9

    const-string v1, "is_transparent"

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    const-string v2, "width"

    const/4 v4, -0x1

    invoke-virtual {p1, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v11

    const-string v2, "height"

    invoke-virtual {p1, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v12

    if-eqz p2, :cond_2

    new-instance p1, Lcom/google/android/gms/internal/ads/bh;

    const/4 v7, 0x0

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    move-object v6, p1

    invoke-direct/range {v6 .. v12}, Lcom/google/android/gms/internal/ads/bh;-><init>(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;DII)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/RK;->b:Lcom/google/android/gms/internal/ads/uK;

    invoke-virtual {p2, v3, v9, v10, v1}, Lcom/google/android/gms/internal/ads/uK;->b(Ljava/lang/String;DZ)LP4/d;

    move-result-object p2

    new-instance v1, Lcom/google/android/gms/internal/ads/FK;

    move-object v2, v1

    move-wide v4, v9

    move v6, v11

    move v7, v12

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/FK;-><init>(Ljava/lang/String;DII)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/RK;->g:Ljava/util/concurrent/Executor;

    invoke-static {p2, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->m(LP4/d;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p2

    const-string v1, "require"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/ads/RK;->m(ZLP4/d;Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method private final o(Lorg/json/JSONArray;ZZ)LP4/d;
    .locals 3

    .prologue
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result p3

    goto :goto_0

    :cond_1
    const/4 p3, 0x1

    :goto_0
    const/4 v1, 0x0

    :goto_1
    if-ge v1, p3, :cond_2

    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    invoke-direct {p0, v2, p2}, Lcom/google/android/gms/internal/ads/RK;->n(Lorg/json/JSONObject;Z)LP4/d;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->d(Ljava/lang/Iterable;)LP4/d;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/KK;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/KK;-><init>()V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/RK;->g:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/Nk0;->m(LP4/d;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method private final p(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;)LP4/d;
    .locals 7

    const-string v0, "base_url"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "html"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "width"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    const-string v4, "height"

    invoke-virtual {p1, v4, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ads/RK;->k(II)Ls3/c2;

    move-result-object v6

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/RK;->i:Lcom/google/android/gms/internal/ads/kL;

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/kL;->b(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;Ls3/c2;)LP4/d;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/HK;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/HK;-><init>(LP4/d;)V

    sget-object p3, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method private static q(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 2

    .prologue
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const-string p1, "r"

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    const-string v0, "g"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "b"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p1, v0, p0}, Landroid/graphics/Color;->rgb(III)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final r(Lorg/json/JSONObject;)Ls3/q1;
    .locals 2

    .prologue
    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "reason"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ping_url"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ls3/q1;

    invoke-direct {v1, v0, p0}, Ls3/q1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method final synthetic a(Lorg/json/JSONObject;Ljava/util/List;)Lcom/google/android/gms/internal/ads/Yg;
    .locals 12

    .prologue
    const/4 v0, 0x0

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "text"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v1, "bg_color"

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/RK;->q(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    const-string v1, "text_color"

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/RK;->q(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    const-string v1, "text_size"

    const/4 v2, -0x1

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    const-string v2, "allow_pub_rendering"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v10

    const-string v2, "animation_ms"

    const/16 v4, 0x3e8

    invoke-virtual {p1, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    const-string v4, "presentation_ms"

    const/16 v7, 0xfa0

    invoke-virtual {p1, v4, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    new-instance v11, Lcom/google/android/gms/internal/ads/Yg;

    if-lez v1, :cond_1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_1
    move-object v7, v0

    add-int v8, p1, v2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/RK;->h:Lcom/google/android/gms/internal/ads/dh;

    iget v9, p1, Lcom/google/android/gms/internal/ads/dh;->G:I

    move-object v2, v11

    move-object v4, p2

    invoke-direct/range {v2 .. v10}, Lcom/google/android/gms/internal/ads/Yg;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZ)V

    move-object v0, v11

    :cond_2
    :goto_0
    return-object v0
.end method

.method final synthetic b(Ls3/c2;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)LP4/d;
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->j:Lcom/google/android/gms/internal/ads/BM;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/BM;->a(Ls3/c2;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;)Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/lr;->f(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lr;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/RK;->l:Lcom/google/android/gms/internal/ads/VL;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/VL;->b()Lcom/google/android/gms/internal/ads/SL;

    move-result-object v9

    move-object v5, v9

    move-object v7, v9

    move-object/from16 v19, v9

    move-object v8, v9

    move-object v6, v9

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v4

    new-instance v3, Lr3/b;

    move-object v12, v3

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/RK;->a:Landroid/content/Context;

    const/4 v14, 0x0

    invoke-direct {v3, v10, v14, v14}, Lr3/b;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/aq;Lcom/google/android/gms/internal/ads/wo;)V

    iget-object v15, v0, Lcom/google/android/gms/internal/ads/RK;->o:Lcom/google/android/gms/internal/ads/iT;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/RK;->n:Lcom/google/android/gms/internal/ads/La0;

    move-object/from16 v16, v3

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/RK;->m:Lcom/google/android/gms/internal/ads/eO;

    move-object/from16 v17, v3

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v3, 0x0

    move-object v14, v3

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-interface/range {v4 .. v23}, Lcom/google/android/gms/internal/ads/Ku;->V(Ls3/a;Lcom/google/android/gms/internal/ads/vi;Lu3/z;Lcom/google/android/gms/internal/ads/xi;Lu3/d;ZLcom/google/android/gms/internal/ads/jj;Lr3/b;Lcom/google/android/gms/internal/ads/xn;Lcom/google/android/gms/internal/ads/aq;Lcom/google/android/gms/internal/ads/iT;Lcom/google/android/gms/internal/ads/La0;Lcom/google/android/gms/internal/ads/eO;Lcom/google/android/gms/internal/ads/Bj;Lcom/google/android/gms/internal/ads/MG;Lcom/google/android/gms/internal/ads/Aj;Lcom/google/android/gms/internal/ads/uj;Lcom/google/android/gms/internal/ads/hj;Lcom/google/android/gms/internal/ads/Lx;)V

    const-string v3, "/getNativeAdViewSignals"

    sget-object v4, Lcom/google/android/gms/internal/ads/fj;->s:Lcom/google/android/gms/internal/ads/gj;

    invoke-interface {v1, v3, v4}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    const-string v3, "/getNativeClickMeta"

    sget-object v4, Lcom/google/android/gms/internal/ads/fj;->t:Lcom/google/android/gms/internal/ads/gj;

    invoke-interface {v1, v3, v4}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v3

    const/4 v4, 0x1

    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/Ku;->s0(Z)V

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/OK;

    invoke-direct {v4, v2}, Lcom/google/android/gms/internal/ads/OK;-><init>(Lcom/google/android/gms/internal/ads/lr;)V

    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/Ku;->D(Lcom/google/android/gms/internal/ads/Iu;)V

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    const/4 v5, 0x0

    invoke-interface {v1, v3, v4, v5}, Lcom/google/android/gms/internal/ads/Ot;->d1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method final synthetic c(Ljava/lang/String;Ljava/lang/Object;)LP4/d;
    .locals 18

    .prologue
    move-object/from16 v0, p0

    invoke-static {}, Lr3/v;->a()Lcom/google/android/gms/internal/ads/eu;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/RK;->a:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Mu;->a()Lcom/google/android/gms/internal/ads/Mu;

    move-result-object v2

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/RK;->c:Lcom/google/android/gms/internal/ads/Z9;

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/RK;->e:Lr3/a;

    iget-object v15, v0, Lcom/google/android/gms/internal/ads/RK;->p:Lcom/google/android/gms/internal/ads/tT;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/RK;->d:Lw3/a;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/RK;->f:Lcom/google/android/gms/internal/ads/od;

    const/4 v14, 0x0

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/RK;->q:Lcom/google/android/gms/internal/ads/r70;

    const-string v3, "native-omid"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v13

    move-object/from16 v13, v16

    move-object/from16 v16, v17

    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/internal/ads/eu;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Mu;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/Z9;Lcom/google/android/gms/internal/ads/ig;Lw3/a;Lcom/google/android/gms/internal/ads/Qf;Lr3/n;Lr3/a;Lcom/google/android/gms/internal/ads/od;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;Lcom/google/android/gms/internal/ads/tT;Lcom/google/android/gms/internal/ads/r70;)Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/lr;->f(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lr;

    move-result-object v2

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/EK;

    invoke-direct {v4, v2}, Lcom/google/android/gms/internal/ads/EK;-><init>(Lcom/google/android/gms/internal/ads/lr;)V

    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/Ku;->D(Lcom/google/android/gms/internal/ads/Iu;)V

    sget-object v3, Lcom/google/android/gms/internal/ads/Af;->i5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const-string v4, "text/html"

    if-eqz v3, :cond_0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    const/4 v5, 0x1

    invoke-static {v3, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v3

    const-string v5, "base64"

    invoke-interface {v1, v3, v4, v5}, Lcom/google/android/gms/internal/ads/Ot;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v3, "UTF-8"

    move-object/from16 v5, p1

    invoke-interface {v1, v5, v4, v3}, Lcom/google/android/gms/internal/ads/Ot;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v2
.end method

.method public final d(Lorg/json/JSONObject;Ljava/lang/String;)LP4/d;
    .locals 3

    .prologue
    const-string p2, "attribution"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "images"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    const-string v1, "image"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v0, :cond_1

    if-eqz v1, :cond_1

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :cond_1
    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/internal/ads/RK;->o(Lorg/json/JSONArray;ZZ)LP4/d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/LK;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/LK;-><init>(Lcom/google/android/gms/internal/ads/RK;Lorg/json/JSONObject;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/RK;->g:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->m(LP4/d;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    const-string v1, "require"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/RK;->m(ZLP4/d;Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lorg/json/JSONObject;Ljava/lang/String;)LP4/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/RK;->h:Lcom/google/android/gms/internal/ads/dh;

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    iget-boolean p2, v0, Lcom/google/android/gms/internal/ads/dh;->D:Z

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/RK;->n(Lorg/json/JSONObject;Z)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lorg/json/JSONObject;Ljava/lang/String;)LP4/d;
    .locals 1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/RK;->h:Lcom/google/android/gms/internal/ads/dh;

    const-string v0, "images"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    iget-boolean v0, p2, Lcom/google/android/gms/internal/ads/dh;->D:Z

    iget-boolean p2, p2, Lcom/google/android/gms/internal/ads/dh;->F:Z

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/internal/ads/RK;->o(Lorg/json/JSONArray;ZZ)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;)LP4/d;
    .locals 9

    .prologue
    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->T9:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p2, "images"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result p2

    if-gtz p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_2
    const-string v1, "base_url"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v1, "html"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v1, "width"

    invoke-virtual {p1, v1, p2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    const-string v2, "height"

    invoke-virtual {p1, v2, p2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    invoke-direct {p0, v1, p1}, Lcom/google/android/gms/internal/ads/RK;->k(II)Ls3/c2;

    move-result-object v4

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/IK;

    move-object v2, p2

    move-object v3, p0

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/IK;-><init>(Lcom/google/android/gms/internal/ads/RK;Ls3/c2;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p3, Lcom/google/android/gms/internal/ads/dr;->f:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/JK;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/JK;-><init>(LP4/d;)V

    sget-object p3, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;)LP4/d;
    .locals 4

    .prologue
    const-string v0, "html_containers"

    const-string v1, "instream"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lv3/V;->h(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_4

    const-string v0, "video"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    goto :goto_2

    :cond_0
    const-string v1, "vast_xml"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->S9:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    const-string v2, "html"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    :cond_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    if-nez v3, :cond_3

    const-string p1, "Required field \'vast_xml\' or \'html\' is missing"

    invoke-static {p1}, Lw3/p;->g(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    if-nez v3, :cond_3

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/RK;->i:Lcom/google/android/gms/internal/ads/kL;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/kL;->a(Lorg/json/JSONObject;)LP4/d;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/RK;->p(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;)LP4/d;

    move-result-object p1

    :goto_1
    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->S3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-long p2, p2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/RK;->k:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, p2, p3, v2, v1}, Lcom/google/android/gms/internal/ads/Nk0;->o(LP4/d;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)LP4/d;

    move-result-object p1

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/RK;->l(LP4/d;Ljava/lang/Object;)LP4/d;

    move-result-object p1

    :goto_2
    return-object p1

    :cond_4
    invoke-direct {p0, v0, p2, p3}, Lcom/google/android/gms/internal/ads/RK;->p(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;)LP4/d;

    move-result-object p1

    return-object p1
.end method
