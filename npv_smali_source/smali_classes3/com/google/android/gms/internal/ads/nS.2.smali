.class public final Lcom/google/android/gms/internal/ads/nS;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Y80;


# static fields
.field private static final d:Ljava/util/regex/Pattern;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/google/android/gms/internal/ads/E90;

.field private final c:Lcom/google/android/gms/internal/ads/Q90;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "([^;]+=[^;]+)(;\\s|$)"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/nS;->d:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nS;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/nS;->c:Lcom/google/android/gms/internal/ads/Q90;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/nS;->b:Lcom/google/android/gms/internal/ads/E90;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/mS;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mS;->b(Lcom/google/android/gms/internal/ads/mS;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "http_timeout_millis"

    const v2, 0xea60

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mS;->a(Lcom/google/android/gms/internal/ads/mS;)Lcom/google/android/gms/internal/ads/Ro;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ro;->a()I

    move-result v1

    const/4 v2, -0x2

    const/4 v3, 0x1

    const-string v4, ""

    if-ne v1, v2, :cond_c

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mS;->a(Lcom/google/android/gms/internal/ads/mS;)Lcom/google/android/gms/internal/ads/Ro;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ro;->j()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nS;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Z0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v1, "Cookie"

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nS;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v4

    goto :goto_1

    :cond_0
    sget-object v2, Lcom/google/android/gms/internal/ads/nS;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    move-object v2, v4

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "id="

    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_2

    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "ide="

    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    :cond_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_3

    const-string v8, "; "

    invoke-virtual {v2, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_3
    invoke-virtual {v2, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_4
    :goto_1
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-interface {v6, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nS;->a:Ljava/lang/String;

    invoke-interface {v6, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    :goto_2
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mS;->a(Lcom/google/android/gms/internal/ads/mS;)Lcom/google/android/gms/internal/ads/Ro;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ro;->k()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mS;->b(Lcom/google/android/gms/internal/ads/mS;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_7

    goto :goto_3

    :cond_7
    const-string v1, "pii"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_9

    const-string v1, "doritos"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "x-afma-drt-cookie"

    invoke-interface {v6, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    const-string v1, "doritos_v2"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_a

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "x-afma-drt-v2-cookie"

    invoke-interface {v6, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_9
    const-string v0, "DSID signal does not exist."

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    :cond_a
    :goto_3
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mS;->a(Lcom/google/android/gms/internal/ads/mS;)Lcom/google/android/gms/internal/ads/Ro;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mS;->a(Lcom/google/android/gms/internal/ads/mS;)Lcom/google/android/gms/internal/ads/Ro;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ro;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mS;->a(Lcom/google/android/gms/internal/ads/mS;)Lcom/google/android/gms/internal/ads/Ro;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ro;->f()Ljava/lang/String;

    move-result-object v4

    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nS;->c:Lcom/google/android/gms/internal/ads/Q90;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/nS;->b:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Q90;->a(Lcom/google/android/gms/internal/ads/E90;)Lcom/google/android/gms/internal/ads/Q90;

    new-instance v0, Lcom/google/android/gms/internal/ads/iS;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mS;->a(Lcom/google/android/gms/internal/ads/mS;)Lcom/google/android/gms/internal/ads/Ro;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Ro;->g()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v4, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v7

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mS;->a(Lcom/google/android/gms/internal/ads/mS;)Lcom/google/android/gms/internal/ads/Ro;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ro;->k()Z

    move-result v9

    const-string v8, ""

    move-object v3, v0

    move-object v4, v1

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/iS;-><init>(Ljava/lang/String;ILjava/util/Map;[BLjava/lang/String;Z)V

    return-object v0

    :cond_c
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ro;->a()I

    move-result p1

    if-ne p1, v3, :cond_e

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ro;->h()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ro;->h()Ljava/util/List;

    move-result-object p1

    const-string v0, ", "

    invoke-static {v0, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lw3/p;->d(Ljava/lang/String;)V

    :cond_d
    new-instance p1, Lcom/google/android/gms/internal/ads/oQ;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Error building request URL: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p1, v1, v0}, Lcom/google/android/gms/internal/ads/oQ;-><init>(ILjava/lang/String;)V

    goto :goto_4

    :cond_e
    new-instance p1, Lcom/google/android/gms/internal/ads/oQ;

    invoke-direct {p1, v3}, Lcom/google/android/gms/internal/ads/oQ;-><init>(I)V

    :goto_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nS;->c:Lcom/google/android/gms/internal/ads/Q90;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/nS;->b:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/E90;->c(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/E90;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Q90;->a(Lcom/google/android/gms/internal/ads/E90;)Lcom/google/android/gms/internal/ads/Q90;

    throw p1
.end method
