.class public LO5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lcom/google/firebase/remoteconfig/internal/f;

.field b:Lcom/google/firebase/remoteconfig/internal/f;


# direct methods
.method constructor <init>(Lcom/google/firebase/remoteconfig/internal/f;Lcom/google/firebase/remoteconfig/internal/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO5/a;->a:Lcom/google/firebase/remoteconfig/internal/f;

    iput-object p2, p0, LO5/a;->b:Lcom/google/firebase/remoteconfig/internal/f;

    return-void
.end method

.method public static a(Lcom/google/firebase/remoteconfig/internal/f;Lcom/google/firebase/remoteconfig/internal/f;)LO5/a;
    .locals 1

    new-instance v0, LO5/a;

    invoke-direct {v0, p0, p1}, LO5/a;-><init>(Lcom/google/firebase/remoteconfig/internal/f;Lcom/google/firebase/remoteconfig/internal/f;)V

    return-object v0
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    iget-object v0, p0, LO5/a;->a:Lcom/google/firebase/remoteconfig/internal/f;

    invoke-static {v0, p1}, LO5/a;->d(Lcom/google/firebase/remoteconfig/internal/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LO5/a;->b:Lcom/google/firebase/remoteconfig/internal/f;

    invoke-static {v0, p1}, LO5/a;->d(Lcom/google/firebase/remoteconfig/internal/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    const-string p1, ""

    return-object p1
.end method

.method private static d(Lcom/google/firebase/remoteconfig/internal/f;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/f;->f()Lcom/google/firebase/remoteconfig/internal/g;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/g;->g()Lorg/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method


# virtual methods
.method b(Lcom/google/firebase/remoteconfig/internal/g;)LQ5/e;
    .locals 12

    .prologue
    const/4 v0, 0x1

    invoke-virtual {p1}, Lcom/google/firebase/remoteconfig/internal/g;->j()Lorg/json/JSONArray;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/firebase/remoteconfig/internal/g;->k()J

    move-result-wide v2

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v5, v6, :cond_1

    :try_start_0
    invoke-virtual {v1, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    const-string v7, "rolloutId"

    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "affectedParameterKeys"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-le v9, v0, :cond_0

    const-string v9, "FirebaseRemoteConfig"

    const-string v10, "Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s"

    const/4 v11, 0x2

    new-array v11, v11, [Ljava/lang/Object;

    aput-object v7, v11, v4

    aput-object v8, v11, v0

    invoke-static {v10, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    nop

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_1
    const-string v9, ""

    invoke-virtual {v8, v4, v9}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {p0, v8}, LO5/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {}, LQ5/d;->a()LQ5/d$a;

    move-result-object v10

    invoke-virtual {v10, v7}, LQ5/d$a;->d(Ljava/lang/String;)LQ5/d$a;

    move-result-object v7

    const-string v10, "variantId"

    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, LQ5/d$a;->f(Ljava/lang/String;)LQ5/d$a;

    move-result-object v6

    invoke-virtual {v6, v8}, LQ5/d$a;->b(Ljava/lang/String;)LQ5/d$a;

    move-result-object v6

    invoke-virtual {v6, v9}, LQ5/d$a;->c(Ljava/lang/String;)LQ5/d$a;

    move-result-object v6

    invoke-virtual {v6, v2, v3}, LQ5/d$a;->e(J)LQ5/d$a;

    move-result-object v6

    invoke-virtual {v6}, LQ5/d$a;->a()LQ5/d;

    move-result-object v6

    invoke-interface {p1, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v5, v0

    goto :goto_0

    :goto_2
    new-instance v0, LN5/j;

    const-string v1, "Exception parsing rollouts metadata to create RolloutsState."

    invoke-direct {v0, v1, p1}, LN5/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    invoke-static {p1}, LQ5/e;->a(Ljava/util/Set;)LQ5/e;

    move-result-object p1

    return-object p1
.end method
