.class public final Lcom/google/android/gms/internal/ads/T90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final L:Ljava/lang/Object;

.field private static final M:Ljava/lang/Object;

.field private static final N:Ljava/lang/Object;

.field public static O:Ljava/lang/Boolean;


# instance fields
.field private final C:Landroid/content/Context;

.field private final D:Lw3/a;

.field private final E:Lcom/google/android/gms/internal/ads/Y90;

.field private F:Ljava/lang/String;

.field private G:I

.field private final H:Lcom/google/android/gms/internal/ads/PM;

.field private final I:Ljava/util/List;

.field private J:Z

.field private final K:Lcom/google/android/gms/internal/ads/Xo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/T90;->L:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/T90;->M:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/T90;->N:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/PM;Lcom/google/android/gms/internal/ads/lS;Lcom/google/android/gms/internal/ads/Xo;)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/ca0;->c0()Lcom/google/android/gms/internal/ads/Y90;

    move-result-object p4

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/T90;->E:Lcom/google/android/gms/internal/ads/Y90;

    const-string p4, ""

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/T90;->F:Ljava/lang/String;

    const/4 p4, 0x0

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/T90;->J:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/T90;->C:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/T90;->D:Lw3/a;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/T90;->H:Lcom/google/android/gms/internal/ads/PM;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/T90;->K:Lcom/google/android/gms/internal/ads/Xo;

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->K8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lv3/E0;->I()Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/T90;->I:Ljava/util/List;

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p1

    goto :goto_0
.end method

.method public static a()Z
    .locals 5

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/T90;->L:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/T90;->O:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    sget-object v1, Lcom/google/android/gms/internal/ads/vg;->b:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    sput-object v1, Lcom/google/android/gms/internal/ads/T90;->O:Ljava/lang/Boolean;

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/vg;->a:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v3

    cmpg-double v1, v3, v1

    if-gez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_0

    :cond_2
    :goto_2
    sget-object v1, Lcom/google/android/gms/internal/ads/T90;->O:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    monitor-exit v0

    return v1

    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/internal/ads/J90;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/S90;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/S90;-><init>(Lcom/google/android/gms/internal/ads/T90;Lcom/google/android/gms/internal/ads/J90;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Yk0;->r(Ljava/lang/Runnable;)LP4/d;

    return-void
.end method

.method final synthetic c(Lcom/google/android/gms/internal/ads/J90;)V
    .locals 10

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/T90;->N:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/T90;->J:Z

    if-eqz v1, :cond_0

    :goto_0
    monitor-exit v0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/T90;->J:Z

    invoke-static {}, Lcom/google/android/gms/internal/ads/T90;->a()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    :try_start_1
    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/T90;->C:Landroid/content/Context;

    invoke-static {v1}, Lv3/E0;->V(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/T90;->F:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    :goto_1
    :try_start_2
    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v2

    const-string v3, "CuiMonitor.gettingAppIdFromManifest"

    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_2
    invoke-static {}, LN3/h;->f()LN3/h;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/T90;->C:Landroid/content/Context;

    invoke-virtual {v1, v2}, LN3/h;->a(Landroid/content/Context;)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/T90;->G:I

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->F8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->Lb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v3, Lcom/google/android/gms/internal/ads/dr;->d:Ljava/util/concurrent/ScheduledExecutorService;

    int-to-long v7, v1

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v4, p0

    move-wide v5, v7

    invoke-interface/range {v3 .. v9}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    goto :goto_0

    :cond_2
    sget-object v2, Lcom/google/android/gms/internal/ads/dr;->d:Ljava/util/concurrent/ScheduledExecutorService;

    int-to-long v5, v1

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v1, v2

    move-object v2, p0

    move-wide v3, v5

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :goto_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/T90;->a()Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_5

    :cond_3
    if-eqz p1, :cond_6

    sget-object v0, Lcom/google/android/gms/internal/ads/T90;->M:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/T90;->E:Lcom/google/android/gms/internal/ads/Y90;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Y90;->z()I

    move-result v1

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->G8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lt v1, v2, :cond_4

    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    goto/16 :goto_4

    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/ads/X90;->b0()Lcom/google/android/gms/internal/ads/U90;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/J90;->m()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->W(I)Lcom/google/android/gms/internal/ads/U90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/J90;->l()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->S(Z)Lcom/google/android/gms/internal/ads/U90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/J90;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/U90;->G(J)Lcom/google/android/gms/internal/ads/U90;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->Y(I)Lcom/google/android/gms/internal/ads/U90;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/T90;->D:Lw3/a;

    iget-object v2, v2, Lw3/a;->C:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->O(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/U90;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/T90;->F:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/U90;

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->K(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/U90;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->T(I)Lcom/google/android/gms/internal/ads/U90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/J90;->o()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->X(I)Lcom/google/android/gms/internal/ads/U90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/J90;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->J(I)Lcom/google/android/gms/internal/ads/U90;

    iget v2, p0, Lcom/google/android/gms/internal/ads/T90;->G:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/U90;->E(J)Lcom/google/android/gms/internal/ads/U90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/J90;->n()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->V(I)Lcom/google/android/gms/internal/ads/U90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/J90;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/U90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/J90;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->F(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/U90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/J90;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->H(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/U90;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/T90;->H:Lcom/google/android/gms/internal/ads/PM;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/J90;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/PM;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->I(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/U90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/J90;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->L(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/U90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/J90;->d()Lcom/google/android/gms/internal/ads/V90;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->M(Lcom/google/android/gms/internal/ads/V90;)Lcom/google/android/gms/internal/ads/U90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/J90;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->C(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/U90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/J90;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->U(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/U90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/J90;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/U90;->P(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/U90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/J90;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/U90;->Q(J)Lcom/google/android/gms/internal/ads/U90;

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->K8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/T90;->I:Ljava/util/List;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/U90;->z(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/U90;

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/T90;->E:Lcom/google/android/gms/internal/ads/Y90;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aa0;->b0()Lcom/google/android/gms/internal/ads/Z90;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/Z90;->z(Lcom/google/android/gms/internal/ads/U90;)Lcom/google/android/gms/internal/ads/Z90;

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/Y90;->A(Lcom/google/android/gms/internal/ads/Z90;)Lcom/google/android/gms/internal/ads/Y90;

    monitor-exit v0

    return-void

    :goto_4
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :cond_6
    :goto_5
    return-void

    :goto_6
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final run()V
    .locals 9

    .prologue
    invoke-static {}, Lcom/google/android/gms/internal/ads/T90;->a()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/T90;->M:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/T90;->E:Lcom/google/android/gms/internal/ads/Y90;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Y90;->z()I

    move-result v1

    if-nez v1, :cond_1

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-enter v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/T90;->E:Lcom/google/android/gms/internal/ads/Y90;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/ca0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Ou0;->l()[B

    move-result-object v6

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/T90;->E:Lcom/google/android/gms/internal/ads/Y90;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Y90;->B()Lcom/google/android/gms/internal/ads/Y90;

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    new-instance v0, Lcom/google/android/gms/internal/ads/iS;

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->E8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string v7, "application/x-protobuf"

    const/4 v8, 0x0

    const v4, 0xea60

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/iS;-><init>(Ljava/lang/String;ILjava/util/Map;[BLjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/T90;->C:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/T90;->D:Lw3/a;

    iget-object v2, v2, Lw3/a;->C:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/T90;->K:Lcom/google/android/gms/internal/ads/Xo;

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v4

    new-instance v5, Lcom/google/android/gms/internal/ads/kS;

    invoke-direct {v5, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/kS;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Xo;I)V

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/ads/kS;->a(Lcom/google/android/gms/internal/ads/iS;)Lcom/google/android/gms/internal/ads/jS;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    throw v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :goto_0
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/oQ;

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/ads/oQ;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/oQ;->a()I

    move-result v1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    return-void

    :cond_3
    :goto_2
    const-string v1, "CuiMonitor.sendCuiPing"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/Uq;->w(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void

    :goto_3
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v1
.end method
