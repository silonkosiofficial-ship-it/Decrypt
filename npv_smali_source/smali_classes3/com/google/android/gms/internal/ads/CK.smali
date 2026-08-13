.class public final Lcom/google/android/gms/internal/ads/CK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Yk0;

.field private final b:Lcom/google/android/gms/internal/ads/RK;

.field private final c:Lcom/google/android/gms/internal/ads/WK;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/RK;Lcom/google/android/gms/internal/ads/WK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/CK;->a:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/CK;->b:Lcom/google/android/gms/internal/ads/RK;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/CK;->c:Lcom/google/android/gms/internal/ads/WK;

    return-void
.end method

.method static final synthetic b(LP4/d;LP4/d;LP4/d;LP4/d;LP4/d;Lorg/json/JSONObject;LP4/d;LP4/d;LP4/d;LP4/d;LP4/d;)Lcom/google/android/gms/internal/ads/eJ;
    .locals 0

    .prologue
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/eJ;

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/eJ;->p(Ljava/util/List;)V

    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/oh;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/eJ;->m(Lcom/google/android/gms/internal/ads/oh;)V

    invoke-interface {p3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/oh;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/eJ;->q(Lcom/google/android/gms/internal/ads/oh;)V

    invoke-interface {p4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/hh;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/eJ;->j(Lcom/google/android/gms/internal/ads/hh;)V

    invoke-static {p5}, Lcom/google/android/gms/internal/ads/RK;->j(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/eJ;->s(Ljava/util/List;)V

    invoke-static {p5}, Lcom/google/android/gms/internal/ads/RK;->i(Lorg/json/JSONObject;)Ls3/q1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/eJ;->l(Ls3/q1;)V

    invoke-interface {p6}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Ot;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/eJ;->E(Lcom/google/android/gms/internal/ads/Ot;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/eJ;->D(Landroid/view/View;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->s()Lcom/google/android/gms/internal/ads/tu;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/eJ;->C(Ls3/Y0;)V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/eJ;->Q()Landroid/os/Bundle;

    move-result-object p1

    invoke-interface {p7}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Bundle;

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    invoke-interface {p8}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Ot;

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/eJ;->o(Lcom/google/android/gms/internal/ads/Ot;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/eJ;->F(Landroid/view/View;)V

    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->l5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {p5}, Lcom/google/android/gms/internal/ads/CK;->c(Lorg/json/JSONObject;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0, p9}, Lcom/google/android/gms/internal/ads/eJ;->u(LP4/d;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/mr;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/mr;-><init>()V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/eJ;->x(Lcom/google/android/gms/internal/ads/mr;)V

    goto :goto_0

    :cond_2
    invoke-interface {p9}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Ot;

    if-eqz p1, :cond_3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/eJ;->t(Lcom/google/android/gms/internal/ads/Ot;)V

    :cond_3
    :goto_0
    invoke-interface {p10}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/VK;

    iget p3, p2, Lcom/google/android/gms/internal/ads/VK;->a:I

    const/4 p4, 0x1

    if-eq p3, p4, :cond_4

    iget-object p3, p2, Lcom/google/android/gms/internal/ads/VK;->b:Ljava/lang/String;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/VK;->d:Lcom/google/android/gms/internal/ads/bh;

    invoke-virtual {p0, p3, p2}, Lcom/google/android/gms/internal/ads/eJ;->n(Ljava/lang/String;Lcom/google/android/gms/internal/ads/bh;)V

    goto :goto_1

    :cond_4
    iget-object p3, p2, Lcom/google/android/gms/internal/ads/VK;->b:Ljava/lang/String;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/VK;->c:Ljava/lang/String;

    invoke-virtual {p0, p3, p2}, Lcom/google/android/gms/internal/ads/eJ;->z(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    return-object p0
.end method

.method private static final c(Lorg/json/JSONObject;)Z
    .locals 1

    .prologue
    const-string v0, "template_id"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p0

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lorg/json/JSONObject;)LP4/d;
    .locals 16

    .prologue
    move-object/from16 v13, p0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v7, p3

    new-instance v2, Lcom/google/android/gms/internal/ads/wK;

    invoke-direct {v2, v13, v0, v1, v7}, Lcom/google/android/gms/internal/ads/wK;-><init>(Lcom/google/android/gms/internal/ads/CK;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lorg/json/JSONObject;)V

    iget-object v3, v13, Lcom/google/android/gms/internal/ads/CK;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object v2

    iget-object v3, v13, Lcom/google/android/gms/internal/ads/CK;->b:Lcom/google/android/gms/internal/ads/RK;

    const-string v4, "images"

    invoke-virtual {v3, v7, v4}, Lcom/google/android/gms/internal/ads/RK;->f(Lorg/json/JSONObject;Ljava/lang/String;)LP4/d;

    move-result-object v3

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-object v6, v13, Lcom/google/android/gms/internal/ads/CK;->b:Lcom/google/android/gms/internal/ads/RK;

    invoke-virtual {v6, v7, v4, v1, v5}, Lcom/google/android/gms/internal/ads/RK;->g(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;)LP4/d;

    move-result-object v10

    const-string v4, "secondary_image"

    invoke-virtual {v6, v7, v4}, Lcom/google/android/gms/internal/ads/RK;->e(Lorg/json/JSONObject;Ljava/lang/String;)LP4/d;

    move-result-object v5

    const-string v4, "app_icon"

    invoke-virtual {v6, v7, v4}, Lcom/google/android/gms/internal/ads/RK;->e(Lorg/json/JSONObject;Ljava/lang/String;)LP4/d;

    move-result-object v4

    const-string v8, "attribution"

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/ads/RK;->d(Lorg/json/JSONObject;Ljava/lang/String;)LP4/d;

    move-result-object v6

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-object v8, v13, Lcom/google/android/gms/internal/ads/CK;->b:Lcom/google/android/gms/internal/ads/RK;

    invoke-virtual {v8, v7, v1, v0}, Lcom/google/android/gms/internal/ads/RK;->h(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;)LP4/d;

    move-result-object v8

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Pc:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "video"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lj$/util/Optional;->ofNullable(Ljava/lang/Object;)Lj$/util/Optional;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/xK;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/xK;-><init>()V

    invoke-virtual {v0, v1}, Lj$/util/Optional;->map(Ljava/util/function/Function;)Lj$/util/Optional;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/yK;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/yK;-><init>()V

    invoke-virtual {v0, v1}, Lj$/util/Optional;->map(Ljava/util/function/Function;)Lj$/util/Optional;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zK;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zK;-><init>()V

    invoke-virtual {v0, v1}, Lj$/util/Optional;->map(Ljava/util/function/Function;)Lj$/util/Optional;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj$/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, v13, Lcom/google/android/gms/internal/ads/CK;->b:Lcom/google/android/gms/internal/ads/RK;

    new-instance v1, Lcom/google/android/gms/internal/ads/mr;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/mr;-><init>()V

    new-instance v9, Lcom/google/android/gms/internal/ads/QK;

    invoke-direct {v9, v0, v1}, Lcom/google/android/gms/internal/ads/QK;-><init>(Lcom/google/android/gms/internal/ads/RK;Lcom/google/android/gms/internal/ads/mr;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->f:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v8, v9, v0}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    move-object v9, v1

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    move-object v9, v0

    :goto_0
    iget-object v0, v13, Lcom/google/android/gms/internal/ads/CK;->c:Lcom/google/android/gms/internal/ads/WK;

    const-string v1, "custom_assets"

    invoke-virtual {v0, v7, v1}, Lcom/google/android/gms/internal/ads/WK;->a(Lorg/json/JSONObject;Ljava/lang/String;)LP4/d;

    move-result-object v12

    iget-object v0, v13, Lcom/google/android/gms/internal/ads/CK;->b:Lcom/google/android/gms/internal/ads/RK;

    const-string v1, "enable_omid"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    const/4 v11, 0x0

    if-nez v1, :cond_1

    :goto_1
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    :goto_2
    move-object v11, v0

    goto :goto_3

    :cond_1
    const-string v1, "omid_settings"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    const-string v14, "omid_html"

    invoke-virtual {v1, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v11

    new-instance v14, Lcom/google/android/gms/internal/ads/GK;

    invoke-direct {v14, v0, v1}, Lcom/google/android/gms/internal/ads/GK;-><init>(Lcom/google/android/gms/internal/ads/RK;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->f:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v11, v14, v0}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    goto :goto_2

    :goto_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->l5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v14

    invoke-virtual {v14, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static/range {p3 .. p3}, Lcom/google/android/gms/internal/ads/CK;->c(Lorg/json/JSONObject;)Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_4
    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->a(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/Lk0;

    move-result-object v14

    new-instance v15, Lcom/google/android/gms/internal/ads/AK;

    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v7, p3

    invoke-direct/range {v0 .. v12}, Lcom/google/android/gms/internal/ads/AK;-><init>(Lcom/google/android/gms/internal/ads/CK;LP4/d;LP4/d;LP4/d;LP4/d;LP4/d;Lorg/json/JSONObject;LP4/d;LP4/d;LP4/d;LP4/d;LP4/d;)V

    iget-object v0, v13, Lcom/google/android/gms/internal/ads/CK;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-virtual {v14, v15, v0}, Lcom/google/android/gms/internal/ads/Lk0;->a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    return-object v0
.end method
