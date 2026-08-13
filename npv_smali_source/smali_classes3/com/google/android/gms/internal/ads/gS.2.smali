.class public final Lcom/google/android/gms/internal/ads/gS;
.super Lcom/google/android/gms/internal/ads/Bo;
.source "SourceFile"


# instance fields
.field private final C:Landroid/content/Context;

.field private final D:Lcom/google/android/gms/internal/ads/Yk0;

.field private final E:Lcom/google/android/gms/internal/ads/oS;

.field private final F:Lcom/google/android/gms/internal/ads/Ww;

.field private final G:Ljava/util/ArrayDeque;

.field private final H:Lcom/google/android/gms/internal/ads/T90;

.field private final I:Lcom/google/android/gms/internal/ads/Xo;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/Xo;Lcom/google/android/gms/internal/ads/Ww;Lcom/google/android/gms/internal/ads/oS;Ljava/util/ArrayDeque;Lcom/google/android/gms/internal/ads/lS;Lcom/google/android/gms/internal/ads/T90;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Bo;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Af;->a(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gS;->C:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/gS;->D:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/gS;->I:Lcom/google/android/gms/internal/ads/Xo;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/gS;->E:Lcom/google/android/gms/internal/ads/oS;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/gS;->F:Lcom/google/android/gms/internal/ads/Ww;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/gS;->G:Ljava/util/ArrayDeque;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/gS;->H:Lcom/google/android/gms/internal/ads/T90;

    return-void
.end method

.method private final declared-synchronized q()V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Jg;->b:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gS;->G:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    if-lt v1, v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gS;->G:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private final declared-synchronized t6(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dS;
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gS;->G:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/dS;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/dS;->c:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private static u6(LP4/d;Lcom/google/android/gms/internal/ads/v90;Lcom/google/android/gms/internal/ads/wl;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)LP4/d;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/tl;->b:Lcom/google/android/gms/internal/ads/ql;

    new-instance v1, Lcom/google/android/gms/internal/ads/XR;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/XR;-><init>()V

    const-string v2, "AFMA_getAdDictionary"

    invoke-virtual {p2, v2, v0, v1}, Lcom/google/android/gms/internal/ads/wl;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/ol;Lcom/google/android/gms/internal/ads/nl;)Lcom/google/android/gms/internal/ads/ll;

    move-result-object p2

    invoke-static {p0, p4}, Lcom/google/android/gms/internal/ads/P90;->d(LP4/d;Lcom/google/android/gms/internal/ads/E90;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/p90;->J:Lcom/google/android/gms/internal/ads/p90;

    invoke-virtual {p1, v0, p0}, Lcom/google/android/gms/internal/ads/n90;->b(Ljava/lang/Object;LP4/d;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/l90;->f(Lcom/google/android/gms/internal/ads/tk0;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/l90;->a()Lcom/google/android/gms/internal/ads/a90;

    move-result-object p0

    invoke-static {p0, p3, p4}, Lcom/google/android/gms/internal/ads/P90;->c(LP4/d;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)V

    return-object p0
.end method

.method private static v6(Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/v90;Lcom/google/android/gms/internal/ads/p30;)LP4/d;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/QR;

    invoke-direct {v0, p2, p0}, Lcom/google/android/gms/internal/ads/QR;-><init>(Lcom/google/android/gms/internal/ads/p30;Lcom/google/android/gms/internal/ads/Po;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/RR;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/RR;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/ads/p90;->H:Lcom/google/android/gms/internal/ads/p90;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Po;->C:Landroid/os/Bundle;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p0

    invoke-virtual {p1, v1, p0}, Lcom/google/android/gms/internal/ads/n90;->b(Ljava/lang/Object;LP4/d;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/l90;->f(Lcom/google/android/gms/internal/ads/tk0;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/l90;->e(Lcom/google/android/gms/internal/ads/Y80;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/l90;->a()Lcom/google/android/gms/internal/ads/a90;

    move-result-object p0

    return-object p0
.end method

.method private final declared-synchronized w6(Lcom/google/android/gms/internal/ads/dS;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/gS;->q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gS;->G:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V
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

.method private final x6(LP4/d;Lcom/google/android/gms/internal/ads/Ho;Lcom/google/android/gms/internal/ads/Po;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/YR;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/YR;-><init>(Lcom/google/android/gms/internal/ads/gS;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/cS;

    invoke-direct {v0, p0, p3, p2}, Lcom/google/android/gms/internal/ads/cS;-><init>(Lcom/google/android/gms/internal/ads/gS;Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/Ho;)V

    sget-object p2, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void
.end method


# virtual methods
.method public final A3(Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/Ho;)V
    .locals 4

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->k2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/Po;->O:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/ads/MN;->J:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v2

    invoke-interface {v2}, LV3/f;->a()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_0
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/gS;->q6(Lcom/google/android/gms/internal/ads/Po;I)LP4/d;

    move-result-object v0

    invoke-direct {p0, v0, p2, p1}, Lcom/google/android/gms/internal/ads/gS;->x6(LP4/d;Lcom/google/android/gms/internal/ads/Ho;Lcom/google/android/gms/internal/ads/Po;)V

    return-void
.end method

.method public final I2(Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/Ho;)V
    .locals 4

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->k2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/Po;->O:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/ads/MN;->J:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v2

    invoke-interface {v2}, LV3/f;->a()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_0
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/gS;->p6(Lcom/google/android/gms/internal/ads/Po;I)LP4/d;

    move-result-object v0

    invoke-direct {p0, v0, p2, p1}, Lcom/google/android/gms/internal/ads/gS;->x6(LP4/d;Lcom/google/android/gms/internal/ads/Ho;Lcom/google/android/gms/internal/ads/Po;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/Cg;->e:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/gS;->E:Lcom/google/android/gms/internal/ads/oS;

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lcom/google/android/gms/internal/ads/WR;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/WR;-><init>(Lcom/google/android/gms/internal/ads/oS;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/gS;->D:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {v0, p2, p1}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_1
    return-void
.end method

.method public final R3(Ljava/lang/String;Lcom/google/android/gms/internal/ads/Ho;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/gS;->r6(Ljava/lang/String;)LP4/d;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/gS;->x6(LP4/d;Lcom/google/android/gms/internal/ads/Ho;Lcom/google/android/gms/internal/ads/Po;)V

    return-void
.end method

.method public final j1(Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/Ho;)V
    .locals 1

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/gS;->o6(Lcom/google/android/gms/internal/ads/Po;I)LP4/d;

    move-result-object v0

    invoke-direct {p0, v0, p2, p1}, Lcom/google/android/gms/internal/ads/gS;->x6(LP4/d;Lcom/google/android/gms/internal/ads/Ho;Lcom/google/android/gms/internal/ads/Po;)V

    return-void
.end method

.method public final o6(Lcom/google/android/gms/internal/ads/Po;I)LP4/d;
    .locals 8

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Jg;->a:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Split request is disabled."

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/Po;->K:Lcom/google/android/gms/internal/ads/j80;

    if-nez v0, :cond_1

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Pool configuration missing from request."

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_1
    iget v1, v0, Lcom/google/android/gms/internal/ads/j80;->G:I

    if-eqz v1, :cond_3

    iget v0, v0, Lcom/google/android/gms/internal/ads/j80;->H:I

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gS;->C:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gS;->H:Lcom/google/android/gms/internal/ads/T90;

    invoke-static {}, Lr3/v;->j()Lcom/google/android/gms/internal/ads/ml;

    move-result-object v2

    invoke-static {}, Lw3/a;->e()Lw3/a;

    move-result-object v3

    invoke-virtual {v2, v0, v3, v1}, Lcom/google/android/gms/internal/ads/ml;->b(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/T90;)Lcom/google/android/gms/internal/ads/wl;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gS;->F:Lcom/google/android/gms/internal/ads/Ww;

    invoke-interface {v1, p1, p2}, Lcom/google/android/gms/internal/ads/Ww;->a(Lcom/google/android/gms/internal/ads/Po;I)Lcom/google/android/gms/internal/ads/p30;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/p30;->c()Lcom/google/android/gms/internal/ads/v90;

    move-result-object v1

    invoke-static {p1, v1, p2}, Lcom/google/android/gms/internal/ads/gS;->v6(Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/v90;Lcom/google/android/gms/internal/ads/p30;)LP4/d;

    move-result-object v5

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/p30;->d()Lcom/google/android/gms/internal/ads/Q90;

    move-result-object p2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/gS;->C:Landroid/content/Context;

    const/16 v3, 0x9

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/D90;->a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/E90;

    move-result-object v7

    invoke-static {v5, v1, v0, p2, v7}, Lcom/google/android/gms/internal/ads/gS;->u6(LP4/d;Lcom/google/android/gms/internal/ads/v90;Lcom/google/android/gms/internal/ads/wl;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)LP4/d;

    move-result-object v4

    sget-object p2, Lcom/google/android/gms/internal/ads/p90;->c0:Lcom/google/android/gms/internal/ads/p90;

    const/4 v0, 0x2

    new-array v0, v0, [LP4/d;

    const/4 v2, 0x0

    aput-object v5, v0, v2

    const/4 v2, 0x1

    aput-object v4, v0, v2

    invoke-virtual {v1, p2, v0}, Lcom/google/android/gms/internal/ads/n90;->a(Ljava/lang/Object;[LP4/d;)Lcom/google/android/gms/internal/ads/c90;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/VR;

    move-object v2, v0

    move-object v3, p0

    move-object v6, p1

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/VR;-><init>(Lcom/google/android/gms/internal/ads/gS;LP4/d;LP4/d;Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/E90;)V

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/c90;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/l90;->a()Lcom/google/android/gms/internal/ads/a90;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Caching is disabled."

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final p6(Lcom/google/android/gms/internal/ads/Po;I)LP4/d;
    .locals 16

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {}, Lr3/v;->j()Lcom/google/android/gms/internal/ads/ml;

    move-result-object v6

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/gS;->C:Landroid/content/Context;

    invoke-static {}, Lw3/a;->e()Lw3/a;

    move-result-object v8

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/gS;->H:Lcom/google/android/gms/internal/ads/T90;

    invoke-virtual {v6, v7, v8, v9}, Lcom/google/android/gms/internal/ads/ml;->b(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/T90;)Lcom/google/android/gms/internal/ads/wl;

    move-result-object v6

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/gS;->F:Lcom/google/android/gms/internal/ads/Ww;

    invoke-interface {v7, v1, v2}, Lcom/google/android/gms/internal/ads/Ww;->a(Lcom/google/android/gms/internal/ads/Po;I)Lcom/google/android/gms/internal/ads/p30;

    move-result-object v7

    sget-object v8, Lcom/google/android/gms/internal/ads/fS;->d:Lcom/google/android/gms/internal/ads/ol;

    sget-object v9, Lcom/google/android/gms/internal/ads/tl;->c:Lcom/google/android/gms/internal/ads/nl;

    const-string v10, "google.afma.response.normalize"

    invoke-virtual {v6, v10, v8, v9}, Lcom/google/android/gms/internal/ads/wl;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/ol;Lcom/google/android/gms/internal/ads/nl;)Lcom/google/android/gms/internal/ads/ll;

    move-result-object v8

    sget-object v9, Lcom/google/android/gms/internal/ads/Jg;->a:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-nez v9, :cond_0

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/Po;->L:Ljava/lang/String;

    const/4 v10, 0x0

    if-eqz v9, :cond_1

    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_1

    const-string v9, "Request contained a PoolKey but split request is disabled."

    :goto_0
    invoke-static {v9}, Lv3/q0;->k(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/Po;->J:Ljava/lang/String;

    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/ads/gS;->t6(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dS;

    move-result-object v10

    if-nez v10, :cond_1

    const-string v9, "Request contained a PoolKey but no matching parameters were found."

    goto :goto_0

    :cond_1
    :goto_1
    if-nez v10, :cond_2

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/gS;->C:Landroid/content/Context;

    const/16 v11, 0x9

    invoke-static {v9, v11}, Lcom/google/android/gms/internal/ads/D90;->a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/E90;

    move-result-object v9

    goto :goto_2

    :cond_2
    iget-object v9, v10, Lcom/google/android/gms/internal/ads/dS;->d:Lcom/google/android/gms/internal/ads/E90;

    :goto_2
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/p30;->d()Lcom/google/android/gms/internal/ads/Q90;

    move-result-object v11

    iget-object v12, v1, Lcom/google/android/gms/internal/ads/Po;->C:Landroid/os/Bundle;

    const-string v13, "ad_types"

    invoke-virtual {v12, v13}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v12

    invoke-virtual {v11, v12}, Lcom/google/android/gms/internal/ads/Q90;->d(Ljava/util/ArrayList;)Lcom/google/android/gms/internal/ads/Q90;

    new-instance v12, Lcom/google/android/gms/internal/ads/nS;

    iget-object v13, v1, Lcom/google/android/gms/internal/ads/Po;->I:Ljava/lang/String;

    invoke-direct {v12, v13, v11, v9}, Lcom/google/android/gms/internal/ads/nS;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)V

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/gS;->C:Landroid/content/Context;

    iget-object v14, v1, Lcom/google/android/gms/internal/ads/Po;->D:Lw3/a;

    iget-object v14, v14, Lw3/a;->C:Ljava/lang/String;

    iget-object v15, v0, Lcom/google/android/gms/internal/ads/gS;->I:Lcom/google/android/gms/internal/ads/Xo;

    new-instance v3, Lcom/google/android/gms/internal/ads/kS;

    invoke-direct {v3, v13, v14, v15, v2}, Lcom/google/android/gms/internal/ads/kS;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Xo;I)V

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/p30;->c()Lcom/google/android/gms/internal/ads/v90;

    move-result-object v2

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/gS;->C:Landroid/content/Context;

    const/16 v14, 0xb

    invoke-static {v13, v14}, Lcom/google/android/gms/internal/ads/D90;->a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/E90;

    move-result-object v13

    const/16 v14, 0xa

    if-nez v10, :cond_3

    invoke-static {v1, v2, v7}, Lcom/google/android/gms/internal/ads/gS;->v6(Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/v90;Lcom/google/android/gms/internal/ads/p30;)LP4/d;

    move-result-object v7

    invoke-static {v7, v2, v6, v11, v9}, Lcom/google/android/gms/internal/ads/gS;->u6(LP4/d;Lcom/google/android/gms/internal/ads/v90;Lcom/google/android/gms/internal/ads/wl;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)LP4/d;

    move-result-object v6

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/gS;->C:Landroid/content/Context;

    invoke-static {v9, v14}, Lcom/google/android/gms/internal/ads/D90;->a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/E90;

    move-result-object v9

    sget-object v10, Lcom/google/android/gms/internal/ads/p90;->L:Lcom/google/android/gms/internal/ads/p90;

    new-array v14, v5, [LP4/d;

    aput-object v6, v14, v4

    const/4 v15, 0x1

    aput-object v7, v14, v15

    invoke-virtual {v2, v10, v14}, Lcom/google/android/gms/internal/ads/n90;->a(Ljava/lang/Object;[LP4/d;)Lcom/google/android/gms/internal/ads/c90;

    move-result-object v10

    new-instance v14, Lcom/google/android/gms/internal/ads/SR;

    invoke-direct {v14, v6, v1, v7}, Lcom/google/android/gms/internal/ads/SR;-><init>(LP4/d;Lcom/google/android/gms/internal/ads/Po;LP4/d;)V

    invoke-virtual {v10, v14}, Lcom/google/android/gms/internal/ads/c90;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v10

    invoke-virtual {v10, v12}, Lcom/google/android/gms/internal/ads/l90;->e(Lcom/google/android/gms/internal/ads/Y80;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v10

    new-instance v12, Lcom/google/android/gms/internal/ads/L90;

    invoke-direct {v12, v9}, Lcom/google/android/gms/internal/ads/L90;-><init>(Lcom/google/android/gms/internal/ads/E90;)V

    invoke-virtual {v10, v12}, Lcom/google/android/gms/internal/ads/l90;->e(Lcom/google/android/gms/internal/ads/Y80;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v10

    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/ads/l90;->e(Lcom/google/android/gms/internal/ads/Y80;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/l90;->a()Lcom/google/android/gms/internal/ads/a90;

    move-result-object v3

    invoke-static {v3, v11, v9}, Lcom/google/android/gms/internal/ads/P90;->a(LP4/d;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)V

    invoke-static {v3, v13}, Lcom/google/android/gms/internal/ads/P90;->d(LP4/d;Lcom/google/android/gms/internal/ads/E90;)V

    sget-object v9, Lcom/google/android/gms/internal/ads/p90;->N:Lcom/google/android/gms/internal/ads/p90;

    const/4 v10, 0x3

    new-array v10, v10, [LP4/d;

    aput-object v7, v10, v4

    const/4 v4, 0x1

    aput-object v6, v10, v4

    aput-object v3, v10, v5

    invoke-virtual {v2, v9, v10}, Lcom/google/android/gms/internal/ads/n90;->a(Ljava/lang/Object;[LP4/d;)Lcom/google/android/gms/internal/ads/c90;

    move-result-object v2

    new-instance v4, Lcom/google/android/gms/internal/ads/TR;

    invoke-direct {v4, v1, v3, v7, v6}, Lcom/google/android/gms/internal/ads/TR;-><init>(Lcom/google/android/gms/internal/ads/Po;LP4/d;LP4/d;LP4/d;)V

    :goto_3
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/c90;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v1

    invoke-virtual {v1, v8}, Lcom/google/android/gms/internal/ads/l90;->f(Lcom/google/android/gms/internal/ads/tk0;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/l90;->a()Lcom/google/android/gms/internal/ads/a90;

    move-result-object v1

    goto :goto_4

    :cond_3
    new-instance v1, Lcom/google/android/gms/internal/ads/mS;

    iget-object v6, v10, Lcom/google/android/gms/internal/ads/dS;->b:Lorg/json/JSONObject;

    iget-object v7, v10, Lcom/google/android/gms/internal/ads/dS;->a:Lcom/google/android/gms/internal/ads/Ro;

    invoke-direct {v1, v6, v7}, Lcom/google/android/gms/internal/ads/mS;-><init>(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/Ro;)V

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/gS;->C:Landroid/content/Context;

    invoke-static {v6, v14}, Lcom/google/android/gms/internal/ads/D90;->a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/E90;

    move-result-object v6

    sget-object v7, Lcom/google/android/gms/internal/ads/p90;->L:Lcom/google/android/gms/internal/ads/p90;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v1

    invoke-virtual {v2, v7, v1}, Lcom/google/android/gms/internal/ads/n90;->b(Ljava/lang/Object;LP4/d;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v1

    invoke-virtual {v1, v12}, Lcom/google/android/gms/internal/ads/l90;->e(Lcom/google/android/gms/internal/ads/Y80;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v1

    new-instance v7, Lcom/google/android/gms/internal/ads/L90;

    invoke-direct {v7, v6}, Lcom/google/android/gms/internal/ads/L90;-><init>(Lcom/google/android/gms/internal/ads/E90;)V

    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/l90;->e(Lcom/google/android/gms/internal/ads/Y80;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/l90;->e(Lcom/google/android/gms/internal/ads/Y80;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/l90;->a()Lcom/google/android/gms/internal/ads/a90;

    move-result-object v1

    invoke-static {v1, v11, v6}, Lcom/google/android/gms/internal/ads/P90;->a(LP4/d;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)V

    invoke-static {v10}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v3

    invoke-static {v1, v13}, Lcom/google/android/gms/internal/ads/P90;->d(LP4/d;Lcom/google/android/gms/internal/ads/E90;)V

    sget-object v6, Lcom/google/android/gms/internal/ads/p90;->N:Lcom/google/android/gms/internal/ads/p90;

    new-array v5, v5, [LP4/d;

    aput-object v1, v5, v4

    const/4 v4, 0x1

    aput-object v3, v5, v4

    invoke-virtual {v2, v6, v5}, Lcom/google/android/gms/internal/ads/n90;->a(Ljava/lang/Object;[LP4/d;)Lcom/google/android/gms/internal/ads/c90;

    move-result-object v2

    new-instance v4, Lcom/google/android/gms/internal/ads/PR;

    invoke-direct {v4, v1, v3}, Lcom/google/android/gms/internal/ads/PR;-><init>(LP4/d;LP4/d;)V

    goto :goto_3

    :goto_4
    invoke-static {v1, v11, v13}, Lcom/google/android/gms/internal/ads/P90;->a(LP4/d;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)V

    return-object v1
.end method

.method public final q6(Lcom/google/android/gms/internal/ads/Po;I)LP4/d;
    .locals 6

    .prologue
    invoke-static {}, Lr3/v;->j()Lcom/google/android/gms/internal/ads/ml;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gS;->C:Landroid/content/Context;

    invoke-static {}, Lw3/a;->e()Lw3/a;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/gS;->H:Lcom/google/android/gms/internal/ads/T90;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/ml;->b(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/T90;)Lcom/google/android/gms/internal/ads/wl;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Og;->a:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Signal collection disabled."

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gS;->F:Lcom/google/android/gms/internal/ads/Ww;

    invoke-interface {v1, p1, p2}, Lcom/google/android/gms/internal/ads/Ww;->a(Lcom/google/android/gms/internal/ads/Po;I)Lcom/google/android/gms/internal/ads/p30;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/p30;->a()Lcom/google/android/gms/internal/ads/O20;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/tl;->b:Lcom/google/android/gms/internal/ads/ql;

    sget-object v3, Lcom/google/android/gms/internal/ads/tl;->c:Lcom/google/android/gms/internal/ads/nl;

    const-string v4, "google.afma.request.getSignals"

    invoke-virtual {v0, v4, v2, v3}, Lcom/google/android/gms/internal/ads/wl;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/ol;Lcom/google/android/gms/internal/ads/nl;)Lcom/google/android/gms/internal/ads/ll;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/gS;->C:Landroid/content/Context;

    const/16 v3, 0x16

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/D90;->a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/E90;

    move-result-object v2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/p30;->c()Lcom/google/android/gms/internal/ads/v90;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/ads/p90;->O:Lcom/google/android/gms/internal/ads/p90;

    iget-object v5, p1, Lcom/google/android/gms/internal/ads/Po;->C:Landroid/os/Bundle;

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ads/n90;->b(Ljava/lang/Object;LP4/d;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/L90;

    invoke-direct {v4, v2}, Lcom/google/android/gms/internal/ads/L90;-><init>(Lcom/google/android/gms/internal/ads/E90;)V

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/l90;->e(Lcom/google/android/gms/internal/ads/Y80;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/ZR;

    invoke-direct {v4, v1, p1}, Lcom/google/android/gms/internal/ads/ZR;-><init>(Lcom/google/android/gms/internal/ads/O20;Lcom/google/android/gms/internal/ads/Po;)V

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/l90;->f(Lcom/google/android/gms/internal/ads/tk0;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v1

    sget-object v3, Lcom/google/android/gms/internal/ads/p90;->P:Lcom/google/android/gms/internal/ads/p90;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/l90;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/l90;->f(Lcom/google/android/gms/internal/ads/tk0;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/l90;->a()Lcom/google/android/gms/internal/ads/a90;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/p30;->d()Lcom/google/android/gms/internal/ads/Q90;

    move-result-object p2

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/Po;->C:Landroid/os/Bundle;

    const-string v3, "ad_types"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ads/Q90;->d(Ljava/util/ArrayList;)Lcom/google/android/gms/internal/ads/Q90;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/Po;->C:Landroid/os/Bundle;

    const-string v1, "extras"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/Q90;->f(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/Q90;

    invoke-static {v0, p2, v2}, Lcom/google/android/gms/internal/ads/P90;->b(LP4/d;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/Cg;->f:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/gS;->E:Lcom/google/android/gms/internal/ads/oS;

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lcom/google/android/gms/internal/ads/WR;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/WR;-><init>(Lcom/google/android/gms/internal/ads/oS;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/gS;->D:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {v0, p2, p1}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_1
    return-object v0
.end method

.method public final r6(Ljava/lang/String;)LP4/d;
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Jg;->a:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/Exception;

    const-string v0, "Split request is disabled."

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/bS;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/bS;-><init>(Lcom/google/android/gms/internal/ads/gS;)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/gS;->t6(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dS;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "URL to be removed not found for cache key: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final s2(Lcom/google/android/gms/internal/ads/yo;Lcom/google/android/gms/internal/ads/Io;)V
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Qg;->a:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, ""

    invoke-virtual {p2, v0, p1}, Lcom/google/android/gms/internal/ads/Io;->d2(Ljava/lang/String;Lcom/google/android/gms/internal/ads/yo;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "Service can\'t call client"

    invoke-static {p2, p1}, Lv3/q0;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gS;->F:Lcom/google/android/gms/internal/ads/Ww;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ww;->N()Lcom/google/android/gms/internal/ads/Jq;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/yo;->C:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/aS;

    invoke-direct {v1, p0, p2, p1}, Lcom/google/android/gms/internal/ads/aS;-><init>(Lcom/google/android/gms/internal/ads/gS;Lcom/google/android/gms/internal/ads/Io;Lcom/google/android/gms/internal/ads/yo;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method final synthetic s6(LP4/d;LP4/d;Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/E90;)Ljava/io/InputStream;
    .locals 7

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Ro;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ro;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Lorg/json/JSONObject;

    iget-object v4, p3, Lcom/google/android/gms/internal/ads/Po;->J:Ljava/lang/String;

    new-instance p2, Lcom/google/android/gms/internal/ads/dS;

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/google/android/gms/internal/ads/Ro;

    move-object v1, p2

    move-object v5, v0

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/dS;-><init>(Lcom/google/android/gms/internal/ads/Ro;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/E90;)V

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/gS;->w6(Lcom/google/android/gms/internal/ads/dS;)V

    new-instance p1, Ljava/io/ByteArrayInputStream;

    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object p1
.end method
