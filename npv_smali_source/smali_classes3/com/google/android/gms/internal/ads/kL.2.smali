.class public final Lcom/google/android/gms/internal/ads/kL;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/n70;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Lcom/google/android/gms/internal/ads/BM;

.field private final d:Lcom/google/android/gms/internal/ads/VL;

.field private final e:Landroid/content/Context;

.field private final f:Lcom/google/android/gms/internal/ads/eO;

.field private final g:Lcom/google/android/gms/internal/ads/La0;

.field private final h:Lcom/google/android/gms/internal/ads/iT;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/n70;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/BM;Landroid/content/Context;Lcom/google/android/gms/internal/ads/eO;Lcom/google/android/gms/internal/ads/La0;Lcom/google/android/gms/internal/ads/iT;Lcom/google/android/gms/internal/ads/VL;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kL;->a:Lcom/google/android/gms/internal/ads/n70;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/kL;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/kL;->c:Lcom/google/android/gms/internal/ads/BM;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/kL;->e:Landroid/content/Context;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/kL;->f:Lcom/google/android/gms/internal/ads/eO;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/kL;->g:Lcom/google/android/gms/internal/ads/La0;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/kL;->h:Lcom/google/android/gms/internal/ads/iT;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/kL;->d:Lcom/google/android/gms/internal/ads/VL;

    return-void
.end method

.method private final h(Lcom/google/android/gms/internal/ads/Ot;)V
    .locals 8

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/kL;->j(Lcom/google/android/gms/internal/ads/Ot;)V

    const-string v0, "/video"

    sget-object v1, Lcom/google/android/gms/internal/ads/fj;->l:Lcom/google/android/gms/internal/ads/gj;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    const-string v0, "/videoMeta"

    sget-object v1, Lcom/google/android/gms/internal/ads/fj;->m:Lcom/google/android/gms/internal/ads/gj;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/Us;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Us;-><init>()V

    const-string v1, "/precache"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    const-string v0, "/delayPageLoaded"

    sget-object v1, Lcom/google/android/gms/internal/ads/fj;->p:Lcom/google/android/gms/internal/ads/gj;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    const-string v0, "/instrument"

    sget-object v1, Lcom/google/android/gms/internal/ads/fj;->n:Lcom/google/android/gms/internal/ads/gj;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    const-string v0, "/log"

    sget-object v1, Lcom/google/android/gms/internal/ads/fj;->g:Lcom/google/android/gms/internal/ads/gj;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/Di;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/google/android/gms/internal/ads/Di;-><init>(Lcom/google/android/gms/internal/ads/MG;Lcom/google/android/gms/internal/ads/Lx;)V

    const-string v1, "/click"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kL;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->b:Lcom/google/android/gms/internal/ads/mk;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Ku;->A0(Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/tj;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/tj;-><init>(Lr3/b;Lcom/google/android/gms/internal/ads/qn;Lcom/google/android/gms/internal/ads/iT;Lcom/google/android/gms/internal/ads/eO;Lcom/google/android/gms/internal/ads/Lx;)V

    const-string v1, "/open"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Ku;->A0(Z)V

    :goto_0
    invoke-static {}, Lr3/v;->r()Lcom/google/android/gms/internal/ads/pq;

    move-result-object v0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/pq;->p(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->Q()Lcom/google/android/gms/internal/ads/R60;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->Q()Lcom/google/android/gms/internal/ads/R60;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/R60;->w0:Ljava/util/Map;

    :cond_1
    new-instance v1, Lcom/google/android/gms/internal/ads/mj;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/ads/mj;-><init>(Landroid/content/Context;Ljava/util/Map;)V

    const-string v0, "/logScionEvent"

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    :cond_2
    return-void
.end method

.method private final i(Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/lr;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kL;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->a:Ls3/Q1;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->s()Lcom/google/android/gms/internal/ads/tu;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->s()Lcom/google/android/gms/internal/ads/tu;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kL;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->a:Ls3/Q1;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/tu;->s6(Ls3/Q1;)V

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/lr;->h()V

    return-void
.end method

.method private static final j(Lcom/google/android/gms/internal/ads/Ot;)V
    .locals 2

    const-string v0, "/videoClicked"

    sget-object v1, Lcom/google/android/gms/internal/ads/fj;->h:Lcom/google/android/gms/internal/ads/gj;

    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Ku;->U(Z)V

    const-string v0, "/getNativeAdViewSignals"

    sget-object v1, Lcom/google/android/gms/internal/ads/fj;->s:Lcom/google/android/gms/internal/ads/gj;

    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    const-string v0, "/getNativeClickMeta"

    sget-object v1, Lcom/google/android/gms/internal/ads/fj;->t:Lcom/google/android/gms/internal/ads/gj;

    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/internal/ads/Ot;->g1(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)LP4/d;
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/aL;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/aL;-><init>(Lcom/google/android/gms/internal/ads/kL;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kL;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/ZK;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/ZK;-><init>(Lcom/google/android/gms/internal/ads/kL;Lorg/json/JSONObject;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/kL;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;Ls3/c2;)LP4/d;
    .locals 9

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    new-instance v8, Lcom/google/android/gms/internal/ads/YK;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p5

    move-object v4, p3

    move-object v5, p4

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/YK;-><init>(Lcom/google/android/gms/internal/ads/kL;Ls3/c2;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/kL;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v8, p1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method final synthetic c(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/Ot;)LP4/d;
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kL;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->b:Lcom/google/android/gms/internal/ads/mk;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/lr;->f(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lr;

    move-result-object v1

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/Mu;->d()Lcom/google/android/gms/internal/ads/Mu;

    move-result-object v0

    :goto_0
    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/Ot;->l1(Lcom/google/android/gms/internal/ads/Mu;)V

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/Mu;->e()Lcom/google/android/gms/internal/ads/Mu;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/ads/dL;

    invoke-direct {v2, p0, p2, v1}, Lcom/google/android/gms/internal/ads/dL;-><init>(Lcom/google/android/gms/internal/ads/kL;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/lr;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/Ku;->D(Lcom/google/android/gms/internal/ads/Iu;)V

    const-string v0, "google.afma.nativeAds.renderVideo"

    invoke-interface {p2, v0, p1}, Lcom/google/android/gms/internal/ads/Kk;->G0(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-object v1
.end method

.method final synthetic d(Ls3/c2;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)LP4/d;
    .locals 25

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/kL;->c:Lcom/google/android/gms/internal/ads/BM;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/BM;->a(Ls3/c2;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;)Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/lr;->f(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lr;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/kL;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/n70;->b:Lcom/google/android/gms/internal/ads/mk;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/kL;->h(Lcom/google/android/gms/internal/ads/Ot;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Mu;->d()Lcom/google/android/gms/internal/ads/Mu;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/Ot;->l1(Lcom/google/android/gms/internal/ads/Mu;)V

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/kL;->d:Lcom/google/android/gms/internal/ads/VL;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/VL;->b()Lcom/google/android/gms/internal/ads/SL;

    move-result-object v10

    move-object v6, v10

    move-object v8, v10

    move-object/from16 v20, v10

    move-object v9, v10

    move-object v7, v10

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v5

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/kL;->e:Landroid/content/Context;

    new-instance v11, Lr3/b;

    move-object v13, v11

    invoke-direct {v11, v3, v4, v4}, Lr3/b;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/aq;Lcom/google/android/gms/internal/ads/wo;)V

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/kL;->h:Lcom/google/android/gms/internal/ads/iT;

    move-object/from16 v16, v3

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/kL;->g:Lcom/google/android/gms/internal/ads/La0;

    move-object/from16 v17, v3

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/kL;->f:Lcom/google/android/gms/internal/ads/eO;

    move-object/from16 v18, v3

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-interface/range {v5 .. v24}, Lcom/google/android/gms/internal/ads/Ku;->V(Ls3/a;Lcom/google/android/gms/internal/ads/vi;Lu3/z;Lcom/google/android/gms/internal/ads/xi;Lu3/d;ZLcom/google/android/gms/internal/ads/jj;Lr3/b;Lcom/google/android/gms/internal/ads/xn;Lcom/google/android/gms/internal/ads/aq;Lcom/google/android/gms/internal/ads/iT;Lcom/google/android/gms/internal/ads/La0;Lcom/google/android/gms/internal/ads/eO;Lcom/google/android/gms/internal/ads/Bj;Lcom/google/android/gms/internal/ads/MG;Lcom/google/android/gms/internal/ads/Aj;Lcom/google/android/gms/internal/ads/uj;Lcom/google/android/gms/internal/ads/hj;Lcom/google/android/gms/internal/ads/Lx;)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/kL;->j(Lcom/google/android/gms/internal/ads/Ot;)V

    :goto_0
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v3

    new-instance v5, Lcom/google/android/gms/internal/ads/eL;

    invoke-direct {v5, v0, v1, v2}, Lcom/google/android/gms/internal/ads/eL;-><init>(Lcom/google/android/gms/internal/ads/kL;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/lr;)V

    invoke-interface {v3, v5}, Lcom/google/android/gms/internal/ads/Ku;->D(Lcom/google/android/gms/internal/ads/Iu;)V

    move-object/from16 v3, p4

    move-object/from16 v5, p5

    invoke-interface {v1, v3, v5, v4}, Lcom/google/android/gms/internal/ads/Ot;->d1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method final synthetic e(Ljava/lang/Object;)LP4/d;
    .locals 3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/kL;->c:Lcom/google/android/gms/internal/ads/BM;

    invoke-static {}, Ls3/c2;->s()Ls3/c2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v1}, Lcom/google/android/gms/internal/ads/BM;->a(Ls3/c2;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;)Lcom/google/android/gms/internal/ads/Ot;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/lr;->f(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lr;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/kL;->h(Lcom/google/android/gms/internal/ads/Ot;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/bL;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/bL;-><init>(Lcom/google/android/gms/internal/ads/lr;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/Ku;->K(Lcom/google/android/gms/internal/ads/Ju;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->R3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/Ot;->loadUrl(Ljava/lang/String;)V

    return-object v0
.end method

.method final synthetic f(Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/lr;ZILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Z3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p3, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/kL;->i(Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/lr;)V

    return-void

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/XV;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Native Video WebView failed to load. Error code: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, ", Description: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", Failing URL: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const/4 p4, 0x1

    invoke-direct {p1, p4, p3}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    return-void

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/kL;->i(Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/lr;)V

    return-void
.end method

.method final synthetic g(Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/lr;ZILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/kL;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/n70;->a:Ls3/Q1;

    if-eqz p3, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->s()Lcom/google/android/gms/internal/ads/tu;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->s()Lcom/google/android/gms/internal/ads/tu;

    move-result-object p1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/kL;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/n70;->a:Ls3/Q1;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/tu;->s6(Ls3/Q1;)V

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/lr;->h()V

    return-void

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/XV;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Html video Web View failed to load. Error code: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, ", Description: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", Failing URL: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const/4 p4, 0x1

    invoke-direct {p1, p4, p3}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    return-void
.end method
