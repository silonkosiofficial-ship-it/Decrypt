.class public final Lcom/google/android/gms/internal/ads/ww;
.super Ls3/u0;
.source "SourceFile"


# instance fields
.field private final C:Landroid/content/Context;

.field private final D:Lw3/a;

.field private final E:Lcom/google/android/gms/internal/ads/SM;

.field private final F:Lcom/google/android/gms/internal/ads/XT;

.field private final G:Lcom/google/android/gms/internal/ads/pX;

.field private final H:Lcom/google/android/gms/internal/ads/pP;

.field private final I:Lcom/google/android/gms/internal/ads/pq;

.field private final J:Lcom/google/android/gms/internal/ads/XM;

.field private final K:Lcom/google/android/gms/internal/ads/KP;

.field private final L:Lcom/google/android/gms/internal/ads/Wg;

.field private final M:Lcom/google/android/gms/internal/ads/T90;

.field private final N:Lcom/google/android/gms/internal/ads/K70;

.field private final O:Lcom/google/android/gms/internal/ads/sB;

.field private final P:Lcom/google/android/gms/internal/ads/eO;

.field private Q:Z

.field private final R:Ljava/lang/Long;


# direct methods
.method constructor <init>(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/SM;Lcom/google/android/gms/internal/ads/XT;Lcom/google/android/gms/internal/ads/pX;Lcom/google/android/gms/internal/ads/pP;Lcom/google/android/gms/internal/ads/pq;Lcom/google/android/gms/internal/ads/XM;Lcom/google/android/gms/internal/ads/KP;Lcom/google/android/gms/internal/ads/Wg;Lcom/google/android/gms/internal/ads/T90;Lcom/google/android/gms/internal/ads/K70;Lcom/google/android/gms/internal/ads/sB;Lcom/google/android/gms/internal/ads/eO;)V
    .locals 0

    invoke-direct {p0}, Ls3/u0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ww;->C:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ww;->D:Lw3/a;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ww;->E:Lcom/google/android/gms/internal/ads/SM;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/ww;->F:Lcom/google/android/gms/internal/ads/XT;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/ww;->G:Lcom/google/android/gms/internal/ads/pX;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/ww;->H:Lcom/google/android/gms/internal/ads/pP;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/ww;->I:Lcom/google/android/gms/internal/ads/pq;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/ww;->J:Lcom/google/android/gms/internal/ads/XM;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/ww;->K:Lcom/google/android/gms/internal/ads/KP;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/ww;->L:Lcom/google/android/gms/internal/ads/Wg;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/ww;->M:Lcom/google/android/gms/internal/ads/T90;

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/ww;->N:Lcom/google/android/gms/internal/ads/K70;

    iput-object p13, p0, Lcom/google/android/gms/internal/ads/ww;->O:Lcom/google/android/gms/internal/ads/sB;

    iput-object p14, p0, Lcom/google/android/gms/internal/ads/ww;->P:Lcom/google/android/gms/internal/ads/eO;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/ww;->Q:Z

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object p1

    invoke-interface {p1}, LV3/f;->c()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ww;->R:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public final B5(Ls3/K1;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->I:Lcom/google/android/gms/internal/ads/pq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ww;->C:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/pq;->n(Landroid/content/Context;Ls3/K1;)V

    return-void
.end method

.method final synthetic C()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/qo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/qo;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ww;->L:Lcom/google/android/gms/internal/ads/Wg;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/Wg;->a(Lcom/google/android/gms/internal/ads/so;)V

    return-void
.end method

.method public final P4(Ljava/lang/String;LX3/a;)V
    .locals 11

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->C:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Af;->a(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->i4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->C:Landroid/content/Context;

    invoke-static {v0}, Lv3/E0;->V(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    const-string v1, "NonagonMobileAdsSettingManager_AppId"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_0
    const-string v0, ""

    :goto_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x1

    if-ne v2, v1, :cond_1

    move-object v6, p1

    goto :goto_2

    :cond_1
    move-object v6, v0

    :goto_2
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_5

    :cond_2
    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->b4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->a1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    or-int/2addr p1, v1

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p2}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Runnable;

    new-instance p2, Lcom/google/android/gms/internal/ads/vw;

    invoke-direct {p2, p0, p1}, Lcom/google/android/gms/internal/ads/vw;-><init>(Lcom/google/android/gms/internal/ads/ww;Ljava/lang/Runnable;)V

    :goto_3
    move-object v7, p2

    goto :goto_4

    :cond_3
    const/4 p2, 0x0

    move v2, p1

    goto :goto_3

    :goto_4
    if-eqz v2, :cond_4

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/ww;->C:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/ww;->D:Lw3/a;

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/ww;->M:Lcom/google/android/gms/internal/ads/T90;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/ww;->P:Lcom/google/android/gms/internal/ads/eO;

    iget-object v10, p0, Lcom/google/android/gms/internal/ads/ww;->R:Ljava/lang/Long;

    invoke-static {}, Lr3/v;->d()Lr3/f;

    move-result-object v3

    invoke-virtual/range {v3 .. v10}, Lr3/f;->a(Landroid/content/Context;Lw3/a;Ljava/lang/String;Ljava/lang/Runnable;Lcom/google/android/gms/internal/ads/T90;Lcom/google/android/gms/internal/ads/eO;Ljava/lang/Long;)V

    :cond_4
    :goto_5
    return-void
.end method

.method public final R0(Ljava/lang/String;)V
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->o9:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Uq;->A(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final declared-synchronized W4(Ljava/lang/String;)V
    .locals 9

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->C:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Af;->a(Landroid/content/Context;)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->b4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ww;->C:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ww;->D:Lw3/a;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/ww;->M:Lcom/google/android/gms/internal/ads/T90;

    invoke-static {}, Lr3/v;->d()Lr3/f;

    move-result-object v1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v4, p1

    invoke-virtual/range {v1 .. v8}, Lr3/f;->a(Landroid/content/Context;Lw3/a;Ljava/lang/String;Ljava/lang/Runnable;Lcom/google/android/gms/internal/ads/T90;Lcom/google/android/gms/internal/ads/eO;Ljava/lang/Long;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final Y0(Lcom/google/android/gms/internal/ads/Vl;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->N:Lcom/google/android/gms/internal/ads/K70;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/K70;->f(Lcom/google/android/gms/internal/ads/Vl;)V

    return-void
.end method

.method public final a0(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->G:Lcom/google/android/gms/internal/ads/pX;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/pX;->g(Ljava/lang/String;)V

    return-void
.end method

.method final b()V
    .locals 4

    .prologue
    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Uq;->j()Lv3/s0;

    move-result-object v0

    invoke-interface {v0}, Lv3/s0;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Uq;->j()Lv3/s0;

    move-result-object v0

    invoke-interface {v0}, Lv3/s0;->h()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ww;->C:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ww;->D:Lw3/a;

    invoke-static {}, Lr3/v;->w()Lv3/z;

    move-result-object v3

    iget-object v2, v2, Lw3/a;->C:Ljava/lang/String;

    invoke-virtual {v3, v1, v0, v2}, Lv3/z;->j(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Uq;->j()Lv3/s0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lv3/s0;->G0(Z)V

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Uq;->j()Lv3/s0;

    move-result-object v0

    const-string v1, ""

    invoke-interface {v0, v1}, Lv3/s0;->x(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final declared-synchronized d()F
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lr3/v;->v()Lv3/c;

    move-result-object v0

    invoke-virtual {v0}, Lv3/c;->a()F

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

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->D:Lw3/a;

    iget-object v0, v0, Lw3/a;->C:Ljava/lang/String;

    return-object v0
.end method

.method public final e2(Ls3/H0;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/JP;->D:Lcom/google/android/gms/internal/ads/JP;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ww;->K:Lcom/google/android/gms/internal/ads/KP;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/KP;->i(Ls3/H0;Lcom/google/android/gms/internal/ads/JP;)V

    return-void
.end method

.method final synthetic f()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->C:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/S70;->b(Landroid/content/Context;Z)V

    return-void
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->H:Lcom/google/android/gms/internal/ads/pP;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pP;->l()V

    return-void
.end method

.method public final i()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->H:Lcom/google/android/gms/internal/ads/pP;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pP;->g()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized j6(Z)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lr3/v;->v()Lv3/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lv3/c;->c(Z)V
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

.method public final declared-synchronized k()V
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ww;->Q:Z

    if-eqz v0, :cond_0

    const-string v0, "Mobile ads is initialized already."

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->C:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Af;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->C:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ww;->D:Lw3/a;

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/Uq;->v(Landroid/content/Context;Lw3/a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->O:Lcom/google/android/gms/internal/ads/sB;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sB;->c()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->C:Landroid/content/Context;

    invoke-static {}, Lr3/v;->f()Lcom/google/android/gms/internal/ads/Vc;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/Vc;->i(Landroid/content/Context;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ww;->Q:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->H:Lcom/google/android/gms/internal/ads/pP;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pP;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->G:Lcom/google/android/gms/internal/ads/pX;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pX;->e()V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->d4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->J:Lcom/google/android/gms/internal/ads/XM;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/XM;->d()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->K:Lcom/google/android/gms/internal/ads/KP;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/KP;->h()V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->d9:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/rw;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/rw;-><init>(Lcom/google/android/gms/internal/ads/ww;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Pa:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/uw;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/uw;-><init>(Lcom/google/android/gms/internal/ads/ww;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->b3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/sw;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/sw;-><init>(Lcom/google/android/gms/internal/ads/ww;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_4
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->G4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->H4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/tw;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/tw;-><init>(Lcom/google/android/gms/internal/ads/ww;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_5
    monitor-exit p0

    return-void

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final l0(Z)V
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->C:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Le0;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/Le0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Le0;->c(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    if-nez p1, :cond_1

    :try_start_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ww;->C:Landroid/content/Context;

    const-string v0, "query_info_shared_prefs"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Failed to remove query_info_shared_prefs"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v0

    const-string v1, "clearStorageOnGpidPubDisable_scar"

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catch_1
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :goto_1
    new-instance v0, Landroid/os/RemoteException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method final o6(Ljava/lang/Runnable;)V
    .locals 6

    .prologue
    const-string v0, "Adapters must be initialized on the main thread."

    invoke-static {v0}, LQ3/p;->e(Ljava/lang/String;)V

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Uq;->j()Lv3/s0;

    move-result-object v0

    invoke-interface {v0}, Lv3/s0;->i()Lcom/google/android/gms/internal/ads/Oq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Oq;->e()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    if-eqz p1, :cond_1

    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string v0, "Could not initialize rewarded ads."

    invoke-static {v0, p1}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ww;->E:Lcom/google/android/gms/internal/ads/SM;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/SM;->d()Z

    move-result p1

    if-eqz p1, :cond_8

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/Ol;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/Ol;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/Nl;

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/Nl;->b:Ljava/lang/String;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/Nl;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {p1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    if-eqz v3, :cond_4

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :try_start_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ww;->F:Lcom/google/android/gms/internal/ads/XT;

    invoke-interface {v3, v2, v0}, Lcom/google/android/gms/internal/ads/XT;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/YT;

    move-result-object v3

    if-eqz v3, :cond_7

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v4, Lcom/google/android/gms/internal/ads/M70;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/M70;->c()Z

    move-result v5

    if-nez v5, :cond_7

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/M70;->b()Z

    move-result v5

    if-eqz v5, :cond_7

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    check-cast v3, Lcom/google/android/gms/internal/ads/UU;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/ww;->C:Landroid/content/Context;

    invoke-virtual {v4, v5, v3, v1}, Lcom/google/android/gms/internal/ads/M70;->o(Landroid/content/Context;Lcom/google/android/gms/internal/ads/np;Ljava/util/List;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Initialized rewarded video mediation adapter "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lw3/p;->b(Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/u70; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to initialize rewarded video mediation adapter \""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\""

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_8
    :goto_3
    return-void
.end method

.method public final p5(LX3/a;Ljava/lang/String;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const-string p1, "Wrapped context is null. Failed to open debug menu."

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    if-nez p1, :cond_1

    const-string p1, "Context is null. Failed to open debug menu."

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v0, Lv3/v;

    invoke-direct {v0, p1}, Lv3/v;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p2}, Lv3/v;->n(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ww;->D:Lw3/a;

    iget-object p1, p1, Lw3/a;->C:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lv3/v;->o(Ljava/lang/String;)V

    invoke-virtual {v0}, Lv3/v;->r()V

    return-void
.end method

.method public final declared-synchronized v()Z
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lr3/v;->v()Lv3/c;

    move-result-object v0

    invoke-virtual {v0}, Lv3/c;->e()Z

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

.method public final declared-synchronized w0(F)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lr3/v;->v()Lv3/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lv3/c;->d(F)V
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

.method public final y2(Lcom/google/android/gms/internal/ads/hk;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ww;->H:Lcom/google/android/gms/internal/ads/pP;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/pP;->s(Lcom/google/android/gms/internal/ads/hk;)V

    return-void
.end method

.method final synthetic z()V
    .locals 3

    invoke-static {}, Lr3/v;->i()Lcom/google/android/gms/internal/ads/ag;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ww;->C:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ww;->P:Lcom/google/android/gms/internal/ads/eO;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/ag;->d(Landroid/content/Context;Lcom/google/android/gms/internal/ads/eO;)V

    return-void
.end method
