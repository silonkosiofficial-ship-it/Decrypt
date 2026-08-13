.class public final Lcom/google/android/gms/internal/ads/G90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/E90;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:J

.field private c:J

.field private d:Z

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Lcom/google/android/gms/internal/ads/V90;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Z

.field private o:Z

.field private final p:I

.field private q:I

.field private r:I


# direct methods
.method constructor <init>(Landroid/content/Context;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/G90;->b:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/G90;->c:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/G90;->d:Z

    const/4 v1, 0x2

    iput v1, p0, Lcom/google/android/gms/internal/ads/G90;->q:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/G90;->r:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/G90;->e:I

    const-string v1, ""

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/G90;->f:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/G90;->g:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/G90;->h:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/G90;->i:Ljava/lang/String;

    sget-object v2, Lcom/google/android/gms/internal/ads/V90;->E:Lcom/google/android/gms/internal/ads/V90;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/G90;->j:Lcom/google/android/gms/internal/ads/V90;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/G90;->k:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/G90;->l:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/G90;->m:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/G90;->n:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/G90;->o:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/G90;->a:Landroid/content/Context;

    iput p2, p0, Lcom/google/android/gms/internal/ads/G90;->p:I

    return-void
.end method

.method static bridge synthetic B(Lcom/google/android/gms/internal/ads/G90;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/G90;->c:J

    return-wide v0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/G90;)Lcom/google/android/gms/internal/ads/V90;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/G90;->j:Lcom/google/android/gms/internal/ads/V90;

    return-object p0
.end method

.method static bridge synthetic f(Lcom/google/android/gms/internal/ads/G90;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/G90;->g:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/ads/G90;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/G90;->m:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic i(Lcom/google/android/gms/internal/ads/G90;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/G90;->f:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic n(Lcom/google/android/gms/internal/ads/G90;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/G90;->h:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic q(Lcom/google/android/gms/internal/ads/G90;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/G90;->i:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic r(Lcom/google/android/gms/internal/ads/G90;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/G90;->l:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic s(Lcom/google/android/gms/internal/ads/G90;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/G90;->k:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic t(Lcom/google/android/gms/internal/ads/G90;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/ads/G90;->d:Z

    return p0
.end method

.method static bridge synthetic v(Lcom/google/android/gms/internal/ads/G90;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/G90;->p:I

    return p0
.end method

.method static bridge synthetic w(Lcom/google/android/gms/internal/ads/G90;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/G90;->q:I

    return p0
.end method

.method static bridge synthetic x(Lcom/google/android/gms/internal/ads/G90;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/G90;->r:I

    return p0
.end method

.method static bridge synthetic y(Lcom/google/android/gms/internal/ads/G90;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/G90;->e:I

    return p0
.end method

.method static bridge synthetic z(Lcom/google/android/gms/internal/ads/G90;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/G90;->b:J

    return-wide v0
.end method


# virtual methods
.method public final bridge synthetic A(I)Lcom/google/android/gms/internal/ads/E90;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/G90;->u(I)Lcom/google/android/gms/internal/ads/G90;

    return-object p0
.end method

.method public final declared-synchronized C(Ls3/W0;)Lcom/google/android/gms/internal/ads/G90;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object p1, p1, Ls3/W0;->G:Landroid/os/IBinder;

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/ads/xC;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/xC;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/G90;->f:Ljava/lang/String;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/xC;->h()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/G90;->g:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_1
    monitor-exit p0

    return-object p0

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized D(Lcom/google/android/gms/internal/ads/c70;)Lcom/google/android/gms/internal/ads/G90;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/U60;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/U60;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/G90;->f:Ljava/lang/String;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/c70;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/R60;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/R60;->b0:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object p1, v0, Lcom/google/android/gms/internal/ads/R60;->b0:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/G90;->g:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final bridge synthetic E(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/E90;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/G90;->F(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/G90;

    return-object p0
.end method

.method public final declared-synchronized F(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/G90;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->J8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/G90;->m:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized G(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/G90;
    .locals 0

    .prologue
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/G90;->h:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized H(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/G90;
    .locals 0

    .prologue
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/G90;->i:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized I(Lcom/google/android/gms/internal/ads/V90;)Lcom/google/android/gms/internal/ads/G90;
    .locals 0

    .prologue
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/G90;->j:Lcom/google/android/gms/internal/ads/V90;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized J(Z)Lcom/google/android/gms/internal/ads/G90;
    .locals 0

    .prologue
    monitor-enter p0

    :try_start_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/G90;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized K(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/G90;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->J8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/lo;->h(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/G90;->l:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/lo;->g(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0xa

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/kg0;->c(C)Lcom/google/android/gms/internal/ads/kg0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Qg0;->b(Lcom/google/android/gms/internal/ads/kg0;)Lcom/google/android/gms/internal/ads/Qg0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Qg0;->d(Ljava/lang/CharSequence;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/G90;->k:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final bridge synthetic K0(Z)Lcom/google/android/gms/internal/ads/E90;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/G90;->J(Z)Lcom/google/android/gms/internal/ads/G90;

    return-object p0
.end method

.method public final declared-synchronized L()Lcom/google/android/gms/internal/ads/G90;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lr3/v;->u()Lv3/b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/G90;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lv3/b;->k(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/G90;->e:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/G90;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    if-ne v0, v1, :cond_2

    const/4 v1, 0x4

    goto :goto_0

    :cond_2
    const/4 v1, 0x3

    :goto_0
    iput v1, p0, Lcom/google/android/gms/internal/ads/G90;->r:I

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v0

    invoke-interface {v0}, LV3/f;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/G90;->b:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/G90;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final bridge synthetic Z(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/E90;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/G90;->G(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/G90;

    return-object p0
.end method

.method public final bridge synthetic a(Lcom/google/android/gms/internal/ads/c70;)Lcom/google/android/gms/internal/ads/E90;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/G90;->D(Lcom/google/android/gms/internal/ads/c70;)Lcom/google/android/gms/internal/ads/G90;

    return-object p0
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/internal/ads/V90;)Lcom/google/android/gms/internal/ads/E90;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/G90;->I(Lcom/google/android/gms/internal/ads/V90;)Lcom/google/android/gms/internal/ads/G90;

    return-object p0
.end method

.method public final bridge synthetic c(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/E90;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/G90;->K(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/G90;

    return-object p0
.end method

.method public final declared-synchronized d()Lcom/google/android/gms/internal/ads/G90;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v0

    invoke-interface {v0}, LV3/f;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/G90;->c:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final bridge synthetic h()Lcom/google/android/gms/internal/ads/E90;
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/G90;->L()Lcom/google/android/gms/internal/ads/G90;

    return-object p0
.end method

.method public final bridge synthetic j()Lcom/google/android/gms/internal/ads/E90;
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/G90;->d()Lcom/google/android/gms/internal/ads/G90;

    return-object p0
.end method

.method public final declared-synchronized k()Z
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/G90;->o:Z
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

.method public final l()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/G90;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final declared-synchronized m()Lcom/google/android/gms/internal/ads/J90;
    .locals 6

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/G90;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v1

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/G90;->n:Z

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/G90;->o:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/G90;->L()Lcom/google/android/gms/internal/ads/G90;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/G90;->c:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/G90;->d()Lcom/google/android/gms/internal/ads/G90;

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/ads/J90;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/J90;-><init>(Lcom/google/android/gms/internal/ads/G90;Lcom/google/android/gms/internal/ads/H90;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final bridge synthetic o(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/E90;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/G90;->H(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/G90;

    return-object p0
.end method

.method public final bridge synthetic p(Ls3/W0;)Lcom/google/android/gms/internal/ads/E90;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/G90;->C(Ls3/W0;)Lcom/google/android/gms/internal/ads/G90;

    return-object p0
.end method

.method public final declared-synchronized u(I)Lcom/google/android/gms/internal/ads/G90;
    .locals 0

    .prologue
    monitor-enter p0

    :try_start_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/G90;->q:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
