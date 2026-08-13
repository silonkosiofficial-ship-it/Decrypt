.class public final Lcom/google/android/gms/internal/ads/Gc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/hc0;


# static fields
.field private static final i:Lcom/google/android/gms/internal/ads/Gc0;

.field private static final j:Landroid/os/Handler;

.field private static k:Landroid/os/Handler;

.field private static final l:Ljava/lang/Runnable;

.field private static final m:Ljava/lang/Runnable;


# instance fields
.field private final a:Ljava/util/List;

.field private b:I

.field private c:Z

.field private final d:Ljava/util/List;

.field private final e:Lcom/google/android/gms/internal/ads/jc0;

.field private final f:Lcom/google/android/gms/internal/ads/Bc0;

.field private final g:Lcom/google/android/gms/internal/ads/Cc0;

.field private h:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Gc0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Gc0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Gc0;->i:Lcom/google/android/gms/internal/ads/Gc0;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Gc0;->j:Landroid/os/Handler;

    const/4 v0, 0x0

    sput-object v0, Lcom/google/android/gms/internal/ads/Gc0;->k:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/internal/ads/Ec0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Ec0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Gc0;->l:Ljava/lang/Runnable;

    new-instance v0, Lcom/google/android/gms/internal/ads/Fc0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Fc0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Gc0;->m:Ljava/lang/Runnable;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Gc0;->a:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/Gc0;->c:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Gc0;->d:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/internal/ads/Bc0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Bc0;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Gc0;->f:Lcom/google/android/gms/internal/ads/Bc0;

    new-instance v0, Lcom/google/android/gms/internal/ads/jc0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/jc0;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Gc0;->e:Lcom/google/android/gms/internal/ads/jc0;

    new-instance v0, Lcom/google/android/gms/internal/ads/Cc0;

    new-instance v1, Lcom/google/android/gms/internal/ads/Jc0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/Jc0;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/Cc0;-><init>(Lcom/google/android/gms/internal/ads/Jc0;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Gc0;->g:Lcom/google/android/gms/internal/ads/Cc0;

    return-void
.end method

.method static bridge synthetic b()Landroid/os/Handler;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Gc0;->k:Landroid/os/Handler;

    return-object v0
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/Gc0;)Lcom/google/android/gms/internal/ads/Cc0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Gc0;->g:Lcom/google/android/gms/internal/ads/Cc0;

    return-object p0
.end method

.method public static d()Lcom/google/android/gms/internal/ads/Gc0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Gc0;->i:Lcom/google/android/gms/internal/ads/Gc0;

    return-object v0
.end method

.method static bridge synthetic e()Ljava/lang/Runnable;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Gc0;->m:Ljava/lang/Runnable;

    return-object v0
.end method

.method static bridge synthetic f()Ljava/lang/Runnable;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Gc0;->l:Ljava/lang/Runnable;

    return-object v0
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/ads/Gc0;)V
    .locals 10

    .prologue
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/Gc0;->b:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Gc0;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/Gc0;->c:Z

    invoke-static {}, Lcom/google/android/gms/internal/ads/Wb0;->a()Lcom/google/android/gms/internal/ads/Wb0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Wb0;->b()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/Fb0;

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/Gc0;->h:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Gc0;->f:Lcom/google/android/gms/internal/ads/Bc0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Bc0;->i()V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Gc0;->e:Lcom/google/android/gms/internal/ads/jc0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/jc0;->a()Lcom/google/android/gms/internal/ads/ic0;

    move-result-object v5

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Gc0;->f:Lcom/google/android/gms/internal/ads/Bc0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Bc0;->e()Ljava/util/HashSet;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    move-result v2

    const/4 v9, 0x0

    if-lez v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Gc0;->f:Lcom/google/android/gms/internal/ads/Bc0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Bc0;->e()Ljava/util/HashSet;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v5, v9}, Lcom/google/android/gms/internal/ads/ic0;->a(Landroid/view/View;)Lorg/json/JSONObject;

    move-result-object v4

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/Gc0;->f:Lcom/google/android/gms/internal/ads/Bc0;

    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/ads/Bc0;->a(Ljava/lang/String;)Landroid/view/View;

    move-result-object v6

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/Gc0;->e:Lcom/google/android/gms/internal/ads/jc0;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/jc0;->b()Lcom/google/android/gms/internal/ads/ic0;

    move-result-object v7

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/Gc0;->f:Lcom/google/android/gms/internal/ads/Bc0;

    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/ads/Bc0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-interface {v7, v6}, Lcom/google/android/gms/internal/ads/ic0;->a(Landroid/view/View;)Lorg/json/JSONObject;

    move-result-object v6

    invoke-static {v6, v3}, Lcom/google/android/gms/internal/ads/tc0;->b(Lorg/json/JSONObject;Ljava/lang/String;)V

    :try_start_0
    const-string v7, "notVisibleReason"

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v7

    const-string v8, "Error with setting not visible reason"

    invoke-static {v8, v7}, Lcom/google/android/gms/internal/ads/uc0;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_2
    invoke-static {v4, v6}, Lcom/google/android/gms/internal/ads/tc0;->c(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    :cond_1
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/tc0;->f(Lorg/json/JSONObject;)V

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v6, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Gc0;->g:Lcom/google/android/gms/internal/ads/Cc0;

    invoke-virtual {v3, v4, v6, v0, v1}, Lcom/google/android/gms/internal/ads/Cc0;->c(Lorg/json/JSONObject;Ljava/util/HashSet;J)V

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Gc0;->f:Lcom/google/android/gms/internal/ads/Bc0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Bc0;->f()Ljava/util/HashSet;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    move-result v2

    if-lez v2, :cond_3

    invoke-interface {v5, v9}, Lcom/google/android/gms/internal/ads/ic0;->a(Landroid/view/View;)Lorg/json/JSONObject;

    move-result-object v2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v4, 0x0

    move-object v3, p0

    move-object v6, v2

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/ads/Gc0;->k(Landroid/view/View;Lcom/google/android/gms/internal/ads/ic0;Lorg/json/JSONObject;IZ)V

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/tc0;->f(Lorg/json/JSONObject;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Gc0;->g:Lcom/google/android/gms/internal/ads/Cc0;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/Gc0;->f:Lcom/google/android/gms/internal/ads/Bc0;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/Bc0;->f()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v3, v2, v4, v0, v1}, Lcom/google/android/gms/internal/ads/Cc0;->d(Lorg/json/JSONObject;Ljava/util/HashSet;J)V

    goto :goto_3

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Gc0;->g:Lcom/google/android/gms/internal/ads/Cc0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Cc0;->b()V

    :goto_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Gc0;->f:Lcom/google/android/gms/internal/ads/Bc0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Bc0;->g()V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/Gc0;->h:J

    sub-long/2addr v0, v2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Gc0;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_5

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Gc0;->a:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    sget-object p0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    throw v9

    :cond_5
    :goto_4
    invoke-static {}, Lcom/google/android/gms/internal/ads/gc0;->a()Lcom/google/android/gms/internal/ads/gc0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/gc0;->c()V

    return-void
.end method

.method private final k(Landroid/view/View;Lcom/google/android/gms/internal/ads/ic0;Lorg/json/JSONObject;IZ)V
    .locals 7

    .prologue
    const/4 v0, 0x1

    if-ne p4, v0, :cond_0

    :goto_0
    move v5, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    move-object v1, p2

    move-object v2, p1

    move-object v3, p3

    move-object v4, p0

    move v6, p5

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/ic0;->b(Landroid/view/View;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/hc0;ZZ)V

    return-void
.end method

.method private static final l()V
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Gc0;->k:Landroid/os/Handler;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/ads/Gc0;->m:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    sput-object v0, Lcom/google/android/gms/internal/ads/Gc0;->k:Landroid/os/Handler;

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Lcom/google/android/gms/internal/ads/ic0;Lorg/json/JSONObject;Z)V
    .locals 9

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yc0;->a(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Gc0;->f:Lcom/google/android/gms/internal/ads/Bc0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Bc0;->l(Landroid/view/View;)I

    move-result v5

    const/4 v0, 0x3

    if-ne v5, v0, :cond_0

    goto/16 :goto_7

    :cond_0
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/ic0;->a(Landroid/view/View;)Lorg/json/JSONObject;

    move-result-object v4

    invoke-static {p3, v4}, Lcom/google/android/gms/internal/ads/tc0;->c(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/Gc0;->f:Lcom/google/android/gms/internal/ads/Bc0;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/Bc0;->d(Landroid/view/View;)Ljava/lang/String;

    move-result-object p3

    const/4 v0, 0x1

    if-eqz p3, :cond_2

    invoke-static {v4, p3}, Lcom/google/android/gms/internal/ads/tc0;->b(Lorg/json/JSONObject;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Gc0;->f:Lcom/google/android/gms/internal/ads/Bc0;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/Bc0;->k(Landroid/view/View;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    :try_start_0
    const-string p2, "hasWindowFocus"

    invoke-virtual {v4, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Error with setting has window focus"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/uc0;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Gc0;->f:Lcom/google/android/gms/internal/ads/Bc0;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/Bc0;->j(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    if-eqz p1, :cond_1

    :try_start_1
    const-string p1, "isPipActive"

    invoke-virtual {v4, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    const-string p2, "Error with setting is picture-in-picture active"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/uc0;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_1
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Gc0;->f:Lcom/google/android/gms/internal/ads/Bc0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Bc0;->h()V

    goto :goto_6

    :cond_2
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/Gc0;->f:Lcom/google/android/gms/internal/ads/Bc0;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/Bc0;->b(Landroid/view/View;)Lcom/google/android/gms/internal/ads/zc0;

    move-result-object p3

    const/4 v1, 0x0

    if-eqz p3, :cond_4

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zc0;->a()Lcom/google/android/gms/internal/ads/Zb0;

    move-result-object v2

    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zc0;->b()Ljava/util/ArrayList;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v6

    move v7, v1

    :goto_2
    if-ge v7, v6, :cond_3

    invoke-interface {p3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v3, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_3
    :try_start_2
    const-string p3, "isFriendlyObstructionFor"

    invoke-virtual {v4, p3, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p3, "friendlyObstructionClass"

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Zb0;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, p3, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p3, "friendlyObstructionPurpose"

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Zb0;->a()Lcom/google/android/gms/internal/ads/Ib0;

    move-result-object v3

    invoke-virtual {v4, p3, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p3, "friendlyObstructionReason"

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Zb0;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, p3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    :goto_3
    move p3, v0

    goto :goto_4

    :catch_2
    move-exception p3

    const-string v2, "Error with setting friendly obstruction"

    invoke-static {v2, p3}, Lcom/google/android/gms/internal/ads/uc0;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_3

    :cond_4
    move p3, v1

    :goto_4
    if-nez p4, :cond_5

    if-eqz p3, :cond_6

    :cond_5
    move v6, v0

    goto :goto_5

    :cond_6
    move v6, v1

    :goto_5
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/Gc0;->k(Landroid/view/View;Lcom/google/android/gms/internal/ads/ic0;Lorg/json/JSONObject;IZ)V

    :goto_6
    iget p1, p0, Lcom/google/android/gms/internal/ads/Gc0;->b:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Gc0;->b:I

    :cond_7
    :goto_7
    return-void
.end method

.method public final h()V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/ads/Gc0;->l()V

    return-void
.end method

.method public final i()V
    .locals 4

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Gc0;->k:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Gc0;->k:Landroid/os/Handler;

    sget-object v1, Lcom/google/android/gms/internal/ads/Gc0;->l:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object v0, Lcom/google/android/gms/internal/ads/Gc0;->k:Landroid/os/Handler;

    sget-object v1, Lcom/google/android/gms/internal/ads/Gc0;->m:Ljava/lang/Runnable;

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public final j()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/ads/Gc0;->l()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Gc0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    sget-object v0, Lcom/google/android/gms/internal/ads/Gc0;->j:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/ads/Dc0;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/Dc0;-><init>(Lcom/google/android/gms/internal/ads/Gc0;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
