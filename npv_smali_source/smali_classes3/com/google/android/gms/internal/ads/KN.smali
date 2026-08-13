.class public final Lcom/google/android/gms/internal/ads/KN;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/eE;
.implements Lcom/google/android/gms/internal/ads/uD;
.implements Lcom/google/android/gms/internal/ads/HC;
.implements Lcom/google/android/gms/internal/ads/ZG;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/YN;

.field private final D:Lcom/google/android/gms/internal/ads/kO;

.field private final E:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/YN;Lcom/google/android/gms/internal/ads/kO;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/KN;->D:Lcom/google/android/gms/internal/ads/kO;

    iput p3, p0, Lcom/google/android/gms/internal/ads/KN;->E:I

    return-void
.end method

.method private final b(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-ltz v4, :cond_1

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Lcom/google/android/gms/internal/ads/YN;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private final c(Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/ci0;)V
    .locals 13

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->k2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_7

    if-nez p1, :cond_0

    goto/16 :goto_2

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/MN;->W:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v1

    invoke-interface {v1}, LV3/f;->a()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "ls"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "1"

    const-string v3, "0"

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v5

    if-eq v4, v5, :cond_1

    move-object v5, v3

    goto :goto_0

    :cond_1
    move-object v5, v2

    :goto_0
    invoke-virtual {v1, v0, v5}, Lcom/google/android/gms/internal/ads/YN;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_4

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/NN;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/NN;->a()Lcom/google/android/gms/internal/ads/MN;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v6

    const-wide/16 v7, -0x1

    invoke-virtual {p1, v6, v7, v8}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v9

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/NN;->b()Lcom/google/android/gms/internal/ads/MN;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6, v7, v8}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    const-wide/16 v11, 0x0

    cmp-long v8, v9, v11

    if-lez v8, :cond_3

    cmp-long v8, v6, v11

    if-lez v8, :cond_3

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/NN;->c()Ljava/lang/String;

    move-result-object v5

    sub-long/2addr v6, v9

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v5, v6}, Lcom/google/android/gms/internal/ads/YN;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    const-string p2, "client_sig_latency_key"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/KN;->b(Landroid/os/Bundle;)V

    const-string p2, "gms_sig_latency_key"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/KN;->b(Landroid/os/Bundle;)V

    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->q7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_7

    const-string p2, "sod_h"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eq v4, v1, :cond_5

    move-object v2, v3

    :cond_5
    invoke-virtual {v0, p2, v2}, Lcom/google/android/gms/internal/ads/YN;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    const-string p2, "cmr"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/ads/YN;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    :goto_2
    return-void
.end method


# virtual methods
.method public final B(Lcom/google/android/gms/internal/ads/Po;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/Po;->C:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/YN;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public final G(Ljava/lang/String;)V
    .locals 3

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->M6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->q7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    iget v1, p0, Lcom/google/android/gms/internal/ads/KN;->E:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object v0

    const-string v2, "sgw"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object v0

    const-string v1, "action"

    const-string v2, "sgf"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    const-string v1, "sgf_reason"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/YN;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KN;->D:Lcom/google/android/gms/internal/ads/kO;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/oO;->g(Ljava/util/Map;)V

    return-void
.end method

.method public final a(LB3/N;)V
    .locals 4

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->M6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->q7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    iget v1, p0, Lcom/google/android/gms/internal/ads/KN;->E:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object v0

    const-string v2, "sgw"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const-string v0, "sgs"

    const-string v1, "action"

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object p1

    const-string v0, "request_id"

    const-string v1, "-1"

    :goto_0
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KN;->D:Lcom/google/android/gms/internal/ads/kO;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/oO;->g(Ljava/util/Map;)V

    return-void

    :cond_3
    iget-object v2, p1, LB3/N;->d:Lcom/google/android/gms/internal/ads/Po;

    iget-object v3, p1, LB3/N;->e:Landroid/os/Bundle;

    if-eqz v2, :cond_4

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/Po;->O:Landroid/os/Bundle;

    sget-object v3, Lcom/google/android/gms/internal/ads/NN;->d:Lcom/google/android/gms/internal/ads/ci0;

    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/ads/KN;->c(Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/ci0;)V

    goto :goto_2

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    sget-object v2, Lcom/google/android/gms/internal/ads/NN;->d:Lcom/google/android/gms/internal/ads/ci0;

    invoke-direct {p0, v3, v2}, Lcom/google/android/gms/internal/ads/KN;->c(Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/ci0;)V

    :cond_5
    :goto_2
    :try_start_0
    iget-object v2, p1, LB3/N;->c:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p1, LB3/N;->b:Ljava/lang/String;

    goto :goto_3

    :cond_6
    iget-object v2, p1, LB3/N;->c:Ljava/lang/String;

    :goto_3
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->A9:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_8

    :try_start_1
    const-string v1, "extras"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "accept_3p_cookie"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "1"

    goto :goto_5

    :catch_0
    move-exception v1

    goto :goto_4

    :cond_7
    const-string v1, "0"
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    :goto_4
    const-string v2, "Error retrieving JSONObject from the requestJson, "

    invoke-static {v2, v1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    const-string v1, "na"

    :goto_5
    const-string v2, "tpc"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, LB3/N;->d:Lcom/google/android/gms/internal/ads/Po;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/Po;->C:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/YN;->e(Landroid/os/Bundle;)V

    goto/16 :goto_1

    :catch_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object p1

    const-string v0, "sgf"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object p1

    const-string v0, "sgf_reason"

    const-string v1, "request_invalid"

    goto/16 :goto_0
.end method

.method public final u()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object v0

    const-string v1, "action"

    const-string v2, "loaded"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/NN;->e:Lcom/google/android/gms/internal/ads/ci0;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/KN;->c(Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/ci0;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->xc:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    const-string v1, "MUTE_AUDIO"

    invoke-static {v1}, LG2/f;->a(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eq v2, v1, :cond_0

    const-string v1, "0"

    goto :goto_0

    :cond_0
    const-string v1, "1"

    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object v0

    const-string v2, "mafe"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->D:Lcom/google/android/gms/internal/ads/kO;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/oO;->g(Ljava/util/Map;)V

    return-void
.end method

.method public final u0(Ls3/W0;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object v0

    const-string v1, "action"

    const-string v2, "ftl"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p1, Ls3/W0;->C:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ads/YN;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    const-string v1, "ed"

    iget-object v2, p1, Ls3/W0;->E:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/YN;->c(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Y6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    iget-object p1, p1, Ls3/W0;->D:Ljava/lang/String;

    const-string v1, "emsg"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/YN;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KN;->D:Lcom/google/android/gms/internal/ads/kO;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->b()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/oO;->g(Ljava/util/Map;)V

    return-void
.end method

.method public final w0(Lcom/google/android/gms/internal/ads/e70;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KN;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/YN;->d(Lcom/google/android/gms/internal/ads/e70;)V

    return-void
.end method
