.class public final Lcom/google/android/gms/internal/ads/ZI;
.super Lcom/google/android/gms/internal/ads/fA;
.source "SourceFile"


# static fields
.field public static final synthetic G:I


# instance fields
.field private final A:Lw3/a;

.field private final B:Landroid/content/Context;

.field private final C:Lcom/google/android/gms/internal/ads/bJ;

.field private final D:Lcom/google/android/gms/internal/ads/XX;

.field private final E:Ljava/util/Map;

.field private final F:Ljava/util/List;

.field private final j:Ljava/util/concurrent/Executor;

.field private final k:Lcom/google/android/gms/internal/ads/eJ;

.field private final l:Lcom/google/android/gms/internal/ads/mJ;

.field private final m:Lcom/google/android/gms/internal/ads/FJ;

.field private final n:Lcom/google/android/gms/internal/ads/jJ;

.field private final o:Lcom/google/android/gms/internal/ads/pJ;

.field private final p:Lcom/google/android/gms/internal/ads/Uy0;

.field private final q:Lcom/google/android/gms/internal/ads/Uy0;

.field private final r:Lcom/google/android/gms/internal/ads/Uy0;

.field private final s:Lcom/google/android/gms/internal/ads/Uy0;

.field private final t:Lcom/google/android/gms/internal/ads/Uy0;

.field private u:Lcom/google/android/gms/internal/ads/eK;

.field private v:Z

.field private w:Z

.field private x:Z

.field private final y:Lcom/google/android/gms/internal/ads/lq;

.field private final z:Lcom/google/android/gms/internal/ads/Z9;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-string v4, "2011"

    const-string v5, "2007"

    const-string v0, "3010"

    const-string v1, "3008"

    const-string v2, "1005"

    const-string v3, "1009"

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/ci0;->T(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ci0;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/eA;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/eJ;Lcom/google/android/gms/internal/ads/mJ;Lcom/google/android/gms/internal/ads/FJ;Lcom/google/android/gms/internal/ads/jJ;Lcom/google/android/gms/internal/ads/pJ;Lcom/google/android/gms/internal/ads/Uy0;Lcom/google/android/gms/internal/ads/Uy0;Lcom/google/android/gms/internal/ads/Uy0;Lcom/google/android/gms/internal/ads/Uy0;Lcom/google/android/gms/internal/ads/Uy0;Lcom/google/android/gms/internal/ads/lq;Lcom/google/android/gms/internal/ads/Z9;Lw3/a;Landroid/content/Context;Lcom/google/android/gms/internal/ads/bJ;Lcom/google/android/gms/internal/ads/XX;Lcom/google/android/gms/internal/ads/Pb;)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/fA;-><init>(Lcom/google/android/gms/internal/ads/eA;)V

    move-object v1, p2

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->j:Ljava/util/concurrent/Executor;

    move-object v1, p3

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->k:Lcom/google/android/gms/internal/ads/eJ;

    move-object v1, p4

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    move-object v1, p5

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->m:Lcom/google/android/gms/internal/ads/FJ;

    move-object v1, p6

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->n:Lcom/google/android/gms/internal/ads/jJ;

    move-object v1, p7

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->o:Lcom/google/android/gms/internal/ads/pJ;

    move-object v1, p8

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->p:Lcom/google/android/gms/internal/ads/Uy0;

    move-object v1, p9

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->q:Lcom/google/android/gms/internal/ads/Uy0;

    move-object v1, p10

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->r:Lcom/google/android/gms/internal/ads/Uy0;

    move-object v1, p11

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->s:Lcom/google/android/gms/internal/ads/Uy0;

    move-object v1, p12

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->t:Lcom/google/android/gms/internal/ads/Uy0;

    move-object v1, p13

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->y:Lcom/google/android/gms/internal/ads/lq;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->z:Lcom/google/android/gms/internal/ads/Z9;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->A:Lw3/a;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->B:Landroid/content/Context;

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->C:Lcom/google/android/gms/internal/ads/bJ;

    move-object/from16 v1, p18

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->D:Lcom/google/android/gms/internal/ads/XX;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->E:Ljava/util/Map;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->F:Ljava/util/List;

    return-void
.end method

.method public static H(Landroid/view/View;)Z
    .locals 7

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->xa:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    invoke-static {p0}, Lv3/E0;->c0(Landroid/view/View;)J

    move-result-wide v3

    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    new-instance v5, Landroid/graphics/Point;

    invoke-direct {v5}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {p0, v0, v5}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/ads/Af;->ya:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    int-to-long v5, p0

    cmp-long p0, v3, v5

    if-ltz p0, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {p0, v0, v3}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    move-result p0

    if-eqz p0, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method private final declared-synchronized K()Landroid/widget/ImageView$ScaleType;
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->u:Lcom/google/android/gms/internal/ads/eK;

    if-nez v0, :cond_0

    const-string v0, "Ad should be associated with an ad view before calling getMediaviewScaleType()"

    invoke-static {v0}, Lw3/p;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eK;->j()LX3/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView$ScaleType;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_1
    :try_start_2
    sget-object v0, Lcom/google/android/gms/internal/ads/FJ;->k:Landroid/widget/ImageView$ScaleType;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method private final L(Ljava/lang/String;Z)V
    .locals 2

    .prologue
    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->l5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 p2, 0x1

    const-string v0, "Google"

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ZI;->k:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/eJ;->j0()LP4/d;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/WI;

    invoke-direct {v1, p0, v0, p2}, Lcom/google/android/gms/internal/ads/WI;-><init>(Lcom/google/android/gms/internal/ads/ZI;Ljava/lang/String;Z)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/ZI;->j:Ljava/util/concurrent/Executor;

    invoke-static {p1, v1, p2}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/ads/ZI;->T(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/QT;

    return-void
.end method

.method private final declared-synchronized M(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->m:Lcom/google/android/gms/internal/ads/FJ;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZI;->u:Lcom/google/android/gms/internal/ads/eK;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/FJ;->d(Lcom/google/android/gms/internal/ads/eK;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ZI;->K()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v1, p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/mJ;->b(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/widget/ImageView$ScaleType;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/ZI;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private final N(Landroid/view/View;Lcom/google/android/gms/internal/ads/QT;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->k:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->e0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZI;->n:Lcom/google/android/gms/internal/ads/jJ;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/jJ;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz p2, :cond_0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/QT;->a()Lcom/google/android/gms/internal/ads/Bb0;

    move-result-object p2

    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/ads/LT;->c(Lcom/google/android/gms/internal/ads/Bb0;Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private final declared-synchronized O(Lcom/google/android/gms/internal/ads/eK;)V
    .locals 7

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ZI;->v:Z

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ZI;->u:Lcom/google/android/gms/internal/ads/eK;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->m:Lcom/google/android/gms/internal/ads/FJ;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/FJ;->e(Lcom/google/android/gms/internal/ads/eK;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/eK;->e()Landroid/view/View;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/eK;->m()Ljava/util/Map;

    move-result-object v3

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/eK;->n()Ljava/util/Map;

    move-result-object v4

    move-object v5, p1

    move-object v6, p1

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/mJ;->f(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/view/View$OnTouchListener;Landroid/view/View$OnClickListener;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->K2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->z:Lcom/google/android/gms/internal/ads/Z9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Z9;->c()Lcom/google/android/gms/internal/ads/T9;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/eK;->e()Landroid/view/View;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/T9;->b(Landroid/view/View;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_1
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->S1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fA;->b:Lcom/google/android/gms/internal/ads/R60;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/R60;->k0:Z

    if-nez v1, :cond_2

    goto :goto_3

    :cond_2
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/R60;->j0:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    if-eqz v0, :cond_5

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ZI;->u:Lcom/google/android/gms/internal/ads/eK;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_2

    :cond_4
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/eK;->l()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    :goto_2
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ZI;->E:Ljava/util/Map;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_3

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ZI;->B:Landroid/content/Context;

    new-instance v4, Lcom/google/android/gms/internal/ads/Ob;

    invoke-direct {v4, v3, v2}, Lcom/google/android/gms/internal/ads/Ob;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ZI;->F:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/internal/ads/VI;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/ads/VI;-><init>(Lcom/google/android/gms/internal/ads/ZI;Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/Ob;->c(Lcom/google/android/gms/internal/ads/Nb;)V

    goto :goto_1

    :cond_5
    :goto_3
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/eK;->h()Lcom/google/android/gms/internal/ads/Ob;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/eK;->h()Lcom/google/android/gms/internal/ads/Ob;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->y:Lcom/google/android/gms/internal/ads/lq;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/Ob;->c(Lcom/google/android/gms/internal/ads/Nb;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_6
    :goto_4
    monitor-exit p0

    return-void

    :goto_5
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private final P(Lcom/google/android/gms/internal/ads/eK;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/eK;->e()Landroid/view/View;

    move-result-object v1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/eK;->l()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/mJ;->l(Landroid/view/View;Ljava/util/Map;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/eK;->g()Landroid/widget/FrameLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/eK;->g()Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/eK;->g()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/eK;->h()Lcom/google/android/gms/internal/ads/Ob;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/eK;->h()Lcom/google/android/gms/internal/ads/Ob;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->y:Lcom/google/android/gms/internal/ads/lq;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/Ob;->e(Lcom/google/android/gms/internal/ads/Nb;)V

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ZI;->u:Lcom/google/android/gms/internal/ads/eK;

    return-void
.end method

.method static bridge synthetic R(Lcom/google/android/gms/internal/ads/ZI;)Lcom/google/android/gms/internal/ads/eJ;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ZI;->k:Lcom/google/android/gms/internal/ads/eJ;

    return-object p0
.end method

.method static bridge synthetic S(Lcom/google/android/gms/internal/ads/ZI;)Lcom/google/android/gms/internal/ads/eK;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ZI;->u:Lcom/google/android/gms/internal/ads/eK;

    return-object p0
.end method

.method static bridge synthetic V(Lcom/google/android/gms/internal/ads/ZI;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ZI;->E:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic Y(Lcom/google/android/gms/internal/ads/ZI;)V
    .locals 5

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->k:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->P()I

    move-result v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "Google"

    const/4 v3, 0x1

    if-eq v1, v3, :cond_5

    const/4 v4, 0x2

    if-eq v1, v4, :cond_4

    const/4 v4, 0x3

    if-eq v1, v4, :cond_2

    const/4 v0, 0x6

    if-eq v1, v0, :cond_1

    const/4 v0, 0x7

    if-eq v1, v0, :cond_0

    :try_start_1
    const-string p0, "Wrong native template id!"

    invoke-static {p0}, Lw3/p;->d(Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception p0

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->o:Lcom/google/android/gms/internal/ads/pJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pJ;->g()Lcom/google/android/gms/internal/ads/wk;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ZI;->s:Lcom/google/android/gms/internal/ads/Uy0;

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/Uy0;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/qk;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/wk;->r1(Lcom/google/android/gms/internal/ads/qk;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->o:Lcom/google/android/gms/internal/ads/pJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pJ;->f()Lcom/google/android/gms/internal/ads/ci;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/ads/ZI;->L(Ljava/lang/String;Z)V

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ZI;->r:Lcom/google/android/gms/internal/ads/Uy0;

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/Uy0;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/ki;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/ci;->N3(Lcom/google/android/gms/internal/ads/ki;)V

    return-void

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZI;->o:Lcom/google/android/gms/internal/ads/pJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/pJ;->d(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Vh;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZI;->k:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eJ;->f0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, v2, v3}, Lcom/google/android/gms/internal/ads/ZI;->T(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/QT;

    :cond_3
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ZI;->t:Lcom/google/android/gms/internal/ads/Uy0;

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/Uy0;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/Hh;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/Vh;->J3(Lcom/google/android/gms/internal/ads/Hh;)V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->o:Lcom/google/android/gms/internal/ads/pJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pJ;->a()Lcom/google/android/gms/internal/ads/Lh;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/ads/ZI;->L(Ljava/lang/String;Z)V

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ZI;->q:Lcom/google/android/gms/internal/ads/Uy0;

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/Uy0;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/Ch;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/Lh;->v1(Lcom/google/android/gms/internal/ads/Ch;)V

    return-void

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->o:Lcom/google/android/gms/internal/ads/pJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pJ;->b()Lcom/google/android/gms/internal/ads/Oh;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/ads/ZI;->L(Ljava/lang/String;Z)V

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/ZI;->p:Lcom/google/android/gms/internal/ads/Uy0;

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/Uy0;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/Eh;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/Oh;->Q5(Lcom/google/android/gms/internal/ads/Eh;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_6
    return-void

    :goto_0
    const-string v0, "RemoteException when notifyAdLoad is called"

    invoke-static {v0, p0}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method static bridge synthetic Z(Lcom/google/android/gms/internal/ads/ZI;Landroid/view/View;Lcom/google/android/gms/internal/ads/QT;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/ZI;->N(Landroid/view/View;Lcom/google/android/gms/internal/ads/QT;)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized A(Lcom/google/android/gms/internal/ads/hi;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/mJ;->p(Lcom/google/android/gms/internal/ads/hi;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized B(Lcom/google/android/gms/internal/ads/eK;)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Q1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v1, Lcom/google/android/gms/internal/ads/NI;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/NI;-><init>(Lcom/google/android/gms/internal/ads/ZI;Lcom/google/android/gms/internal/ads/eK;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/ZI;->O(Lcom/google/android/gms/internal/ads/eK;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized C(Lcom/google/android/gms/internal/ads/eK;)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Q1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v1, Lcom/google/android/gms/internal/ads/OI;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/OI;-><init>(Lcom/google/android/gms/internal/ads/ZI;Lcom/google/android/gms/internal/ads/eK;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/ZI;->P(Lcom/google/android/gms/internal/ads/eK;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final D()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->n:Lcom/google/android/gms/internal/ads/jJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/jJ;->e()Z

    move-result v0

    return v0
.end method

.method public final declared-synchronized E()Z
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/mJ;->Y()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized F()Z
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/mJ;->r()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final G()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->n:Lcom/google/android/gms/internal/ads/jJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/jJ;->d()Z

    move-result v0

    return v0
.end method

.method public final declared-synchronized I(Landroid/os/Bundle;)Z
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ZI;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/mJ;->e(Landroid/os/Bundle;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/ZI;->w:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized J()I
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/mJ;->a()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final Q()Lcom/google/android/gms/internal/ads/bJ;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->C:Lcom/google/android/gms/internal/ads/bJ;

    return-object v0
.end method

.method public final T(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/QT;
    .locals 18

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->n:Lcom/google/android/gms/internal/ads/jJ;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/jJ;->d()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_15

    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_9

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/ZI;->k:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eJ;->e0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eJ;->f0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v1

    if-nez v3, :cond_2

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "Omid display and video webview are null. Skipping initialization."

    :goto_0
    invoke-static {v1}, Lw3/p;->g(Ljava/lang/String;)V

    return-object v2

    :cond_2
    :goto_1
    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_3

    move v6, v5

    goto :goto_2

    :cond_3
    move v6, v4

    :goto_2
    if-eqz v1, :cond_4

    move v7, v5

    goto :goto_3

    :cond_4
    move v7, v4

    :goto_3
    sget-object v8, Lcom/google/android/gms/internal/ads/Af;->j5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v9

    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_b

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ZI;->n:Lcom/google/android/gms/internal/ads/jJ;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/jJ;->a()Lcom/google/android/gms/internal/ads/q70;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/ZI;->n:Lcom/google/android/gms/internal/ads/jJ;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/jJ;->a()Lcom/google/android/gms/internal/ads/q70;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/q70;->c()I

    move-result v6

    add-int/lit8 v7, v6, -0x1

    if-eqz v7, :cond_9

    if-eq v7, v5, :cond_7

    if-eq v6, v5, :cond_6

    const/4 v1, 0x2

    if-eq v6, v1, :cond_5

    const-string v1, "UNKNOWN"

    goto :goto_4

    :cond_5
    const-string v1, "DISPLAY"

    goto :goto_4

    :cond_6
    const-string v1, "VIDEO"

    :goto_4
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unknown omid media type: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Not initializing Omid."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_7
    if-eqz v3, :cond_8

    move v7, v4

    move v4, v5

    goto :goto_5

    :cond_8
    const-string v1, "Omid media type was display but there was no display webview."

    goto :goto_0

    :cond_9
    if-eqz v1, :cond_a

    move v7, v5

    goto :goto_5

    :cond_a
    const-string v1, "Omid media type was video but there was no video webview."

    goto :goto_0

    :cond_b
    move v4, v6

    :goto_5
    if-eqz v4, :cond_c

    move-object v13, v2

    goto :goto_6

    :cond_c
    const-string v3, "javascript"

    move-object v13, v3

    move-object v3, v1

    :goto_6
    if-eqz v3, :cond_14

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/ZI;->B:Landroid/content/Context;

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v6

    invoke-interface {v6, v4}, Lcom/google/android/gms/internal/ads/LT;->f(Landroid/content/Context;)Z

    move-result v4

    if-nez v4, :cond_d

    const-string v1, "Failed to initialize omid in InternalNativeAd"

    goto/16 :goto_0

    :cond_d
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/ZI;->A:Lw3/a;

    iget v6, v4, Lw3/a;->D:I

    iget v4, v4, Lw3/a;->E:I

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "."

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    if-eqz v7, :cond_e

    sget-object v4, Lcom/google/android/gms/internal/ads/MT;->F:Lcom/google/android/gms/internal/ads/MT;

    sget-object v6, Lcom/google/android/gms/internal/ads/NT;->E:Lcom/google/android/gms/internal/ads/NT;

    move-object/from16 v16, v4

    move-object v15, v6

    goto :goto_8

    :cond_e
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/ZI;->k:Lcom/google/android/gms/internal/ads/eJ;

    sget-object v6, Lcom/google/android/gms/internal/ads/MT;->E:Lcom/google/android/gms/internal/ads/MT;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/eJ;->P()I

    move-result v4

    const/4 v8, 0x3

    if-ne v4, v8, :cond_f

    sget-object v4, Lcom/google/android/gms/internal/ads/NT;->G:Lcom/google/android/gms/internal/ads/NT;

    :goto_7
    move-object v15, v4

    move-object/from16 v16, v6

    goto :goto_8

    :cond_f
    sget-object v4, Lcom/google/android/gms/internal/ads/NT;->F:Lcom/google/android/gms/internal/ads/NT;

    goto :goto_7

    :goto_8
    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v8

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/Ot;->i0()Landroid/webkit/WebView;

    move-result-object v10

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/fA;->b:Lcom/google/android/gms/internal/ads/R60;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/R60;->l0:Ljava/lang/String;

    const-string v11, ""

    const-string v12, "javascript"

    move-object/from16 v14, p1

    move-object/from16 v17, v4

    invoke-interface/range {v8 .. v17}, Lcom/google/android/gms/internal/ads/LT;->g(Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/NT;Lcom/google/android/gms/internal/ads/MT;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/QT;

    move-result-object v4

    if-nez v4, :cond_10

    const-string v1, "Failed to create omid session in InternalNativeAd"

    goto/16 :goto_0

    :cond_10
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/ZI;->k:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/eJ;->w(Lcom/google/android/gms/internal/ads/QT;)V

    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/Ot;->n1(Lcom/google/android/gms/internal/ads/QT;)V

    if-eqz v7, :cond_12

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/QT;->a()Lcom/google/android/gms/internal/ads/Bb0;

    move-result-object v2

    if-eqz v1, :cond_11

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v1

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v6

    invoke-interface {v6, v2, v1}, Lcom/google/android/gms/internal/ads/LT;->c(Lcom/google/android/gms/internal/ads/Bb0;Landroid/view/View;)V

    :cond_11
    iput-boolean v5, v0, Lcom/google/android/gms/internal/ads/ZI;->x:Z

    :cond_12
    if-eqz p2, :cond_13

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v1

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/QT;->a()Lcom/google/android/gms/internal/ads/Bb0;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/LT;->e(Lcom/google/android/gms/internal/ads/Bb0;)V

    new-instance v1, Lr/a;

    invoke-direct {v1}, Lr/a;-><init>()V

    const-string v2, "onSdkLoaded"

    invoke-interface {v3, v2, v1}, Lcom/google/android/gms/internal/ads/yk;->O(Ljava/lang/String;Ljava/util/Map;)V

    :cond_13
    return-object v4

    :cond_14
    const-string v1, "Webview is null in InternalNativeAd"

    goto/16 :goto_0

    :cond_15
    :goto_9
    return-object v2
.end method

.method public final U()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->n:Lcom/google/android/gms/internal/ads/jJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/jJ;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized W(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)Lorg/json/JSONObject;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ZI;->K()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v1, p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/mJ;->q(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/widget/ImageView$ScaleType;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized X(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)Lorg/json/JSONObject;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ZI;->K()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v1, p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/mJ;->v(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/widget/ImageView$ScaleType;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized a()V
    .locals 2

    .prologue
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ZI;->v:Z

    new-instance v0, Lcom/google/android/gms/internal/ads/TI;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/TI;-><init>(Lcom/google/android/gms/internal/ads/ZI;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZI;->j:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/fA;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final a0(Landroid/view/View;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->k:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->h0()Lcom/google/android/gms/internal/ads/QT;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZI;->n:Lcom/google/android/gms/internal/ads/jJ;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/jJ;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/QT;->a()Lcom/google/android/gms/internal/ads/Bb0;

    move-result-object v0

    invoke-interface {v1, v0, p1}, Lcom/google/android/gms/internal/ads/LT;->d(Lcom/google/android/gms/internal/ads/Bb0;Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 3

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/ads/PI;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/PI;-><init>(Lcom/google/android/gms/internal/ads/ZI;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZI;->j:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->k:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->P()I

    move-result v0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->j:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-static {v1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ads/QI;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/ads/QI;-><init>(Lcom/google/android/gms/internal/ads/mJ;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/fA;->b()V

    return-void
.end method

.method public final declared-synchronized b0()V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/mJ;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method final synthetic c0()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/mJ;->j()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->k:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->i()V

    return-void
.end method

.method final synthetic d0(Landroid/view/View;ZI)V
    .locals 8

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->u:Lcom/google/android/gms/internal/ads/eK;

    if-nez v0, :cond_0

    const-string p1, "Ad should be associated with an ad view before calling performClickForCustomGesture()"

    invoke-static {p1}, Lw3/p;->b(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eK;->e()Landroid/view/View;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->u:Lcom/google/android/gms/internal/ads/eK;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eK;->l()Ljava/util/Map;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->u:Lcom/google/android/gms/internal/ads/eK;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eK;->m()Ljava/util/Map;

    move-result-object v4

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ZI;->K()Landroid/widget/ImageView$ScaleType;

    move-result-object v6

    move-object v0, v1

    move-object v1, p1

    move v5, p2

    move v7, p3

    invoke-interface/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/mJ;->o(Landroid/view/View;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;ZLandroid/widget/ImageView$ScaleType;I)V

    return-void
.end method

.method final synthetic e0(Z)V
    .locals 8

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->u:Lcom/google/android/gms/internal/ads/eK;

    if-nez v0, :cond_0

    const-string p1, "Ad should be associated with an ad view before calling recordCustomClickGesture()"

    invoke-static {p1}, Lw3/p;->b(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eK;->e()Landroid/view/View;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->u:Lcom/google/android/gms/internal/ads/eK;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eK;->l()Ljava/util/Map;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->u:Lcom/google/android/gms/internal/ads/eK;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/eK;->m()Ljava/util/Map;

    move-result-object v4

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ZI;->K()Landroid/widget/ImageView$ScaleType;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v0, v1

    move-object v1, v5

    move v5, p1

    invoke-interface/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/mJ;->o(Landroid/view/View;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;ZLandroid/widget/ImageView$ScaleType;I)V

    return-void
.end method

.method final synthetic f0(Lcom/google/android/gms/internal/ads/eK;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/ZI;->O(Lcom/google/android/gms/internal/ads/eK;)V

    return-void
.end method

.method final synthetic i(Lcom/google/android/gms/internal/ads/eK;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/ZI;->P(Lcom/google/android/gms/internal/ads/eK;)V

    return-void
.end method

.method public final declared-synchronized j(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Z)V
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ZI;->w:Z

    if-eqz v0, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->S1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fA;->b:Lcom/google/android/gms/internal/ads/R60;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/R60;->k0:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->E:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ZI;->E:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    if-nez p4, :cond_5

    sget-object p4, Lcom/google/android/gms/internal/ads/Af;->X3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-eqz p4, :cond_4

    if-eqz p2, :cond_4

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_3
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ZI;->H(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/ZI;->M(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_4
    :goto_0
    monitor-exit p0

    return-void

    :cond_5
    :try_start_1
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/ZI;->M(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized k(Ls3/D0;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/mJ;->c(Ls3/D0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized l(Landroid/view/View;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Z)V
    .locals 9

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->m:Lcom/google/android/gms/internal/ads/FJ;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZI;->u:Lcom/google/android/gms/internal/ads/eK;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/FJ;->c(Lcom/google/android/gms/internal/ads/eK;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ZI;->K()Landroid/widget/ImageView$ScaleType;

    move-result-object v8

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-interface/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/mJ;->i(Landroid/view/View;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;ZLandroid/widget/ImageView$ScaleType;)V

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/ZI;->x:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ZI;->k:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/eJ;->f0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/eJ;->f0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p2, Lr/a;

    invoke-direct {p2}, Lr/a;-><init>()V

    const-string p3, "onSdkAdUserInteractionClick"

    invoke-interface {p1, p3, p2}, Lcom/google/android/gms/internal/ads/yk;->O(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized m(Landroid/view/View;I)V
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->tb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->u:Lcom/google/android/gms/internal/ads/eK;

    if-nez v0, :cond_1

    const-string p1, "Ad should be associated with an ad view before calling performClickForCustomGesture()"

    invoke-static {p1}, Lw3/p;->b(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZI;->j:Ljava/util/concurrent/Executor;

    instance-of v0, v0, Lcom/google/android/gms/internal/ads/yJ;

    new-instance v2, Lcom/google/android/gms/internal/ads/SI;

    invoke-direct {v2, p0, p1, v0, p2}, Lcom/google/android/gms/internal/ads/SI;-><init>(Lcom/google/android/gms/internal/ads/ZI;Landroid/view/View;ZI)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final declared-synchronized n(Ljava/lang/String;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/mJ;->u0(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized o(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/mJ;->k(Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized p()V
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->u:Lcom/google/android/gms/internal/ads/eK;

    if-nez v0, :cond_0

    const-string v0, "Ad should be associated with an ad view before calling recordCustomClickGesture()"

    invoke-static {v0}, Lw3/p;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZI;->j:Ljava/util/concurrent/Executor;

    instance-of v0, v0, Lcom/google/android/gms/internal/ads/yJ;

    new-instance v2, Lcom/google/android/gms/internal/ads/UI;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ads/UI;-><init>(Lcom/google/android/gms/internal/ads/ZI;Z)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final q(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->k:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->f0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p1, "Video webview is null"

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ZI;->j:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/android/gms/internal/ads/RI;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/RI;-><init>(Lcom/google/android/gms/internal/ads/Ot;Lorg/json/JSONObject;)V

    invoke-interface {p1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    const-string v0, "Error reading event signals"

    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final declared-synchronized r()V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ZI;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/mJ;->u()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final s(Landroid/view/View;)V
    .locals 3

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->l5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->k:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->P()I

    move-result v1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->c0()Lcom/google/android/gms/internal/ads/mr;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/XI;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/XI;-><init>(Lcom/google/android/gms/internal/ads/ZI;Landroid/view/View;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ZI;->j:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->k:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->h0()Lcom/google/android/gms/internal/ads/QT;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/ZI;->N(Landroid/view/View;Lcom/google/android/gms/internal/ads/QT;)V

    return-void
.end method

.method public final declared-synchronized u(Landroid/view/View;Landroid/view/MotionEvent;Landroid/view/View;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/mJ;->n(Landroid/view/View;Landroid/view/MotionEvent;Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized v(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/mJ;->m(Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized w(Landroid/view/View;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/mJ;->d(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized x()V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/mJ;->z()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized y(Ls3/A0;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->l:Lcom/google/android/gms/internal/ads/mJ;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/mJ;->t(Ls3/A0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized z(Ls3/N0;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ZI;->D:Lcom/google/android/gms/internal/ads/XX;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/XX;->a(Ls3/N0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
