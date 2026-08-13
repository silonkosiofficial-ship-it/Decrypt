.class public final Lcom/google/android/gms/internal/ads/iQ;
.super Ls3/P0;
.source "SourceFile"


# instance fields
.field final C:Ljava/util/Map;

.field private final D:Landroid/content/Context;

.field private final E:Ljava/lang/ref/WeakReference;

.field private final F:Lcom/google/android/gms/internal/ads/WP;

.field private final G:Lcom/google/android/gms/internal/ads/Yk0;

.field private H:Lcom/google/android/gms/internal/ads/KP;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/ref/WeakReference;Lcom/google/android/gms/internal/ads/WP;Lcom/google/android/gms/internal/ads/jQ;Lcom/google/android/gms/internal/ads/Yk0;)V
    .locals 0

    invoke-direct {p0}, Ls3/P0;-><init>()V

    new-instance p4, Ljava/util/HashMap;

    invoke-direct {p4}, Ljava/util/HashMap;-><init>()V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/iQ;->C:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/iQ;->D:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/iQ;->E:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/iQ;->F:Lcom/google/android/gms/internal/ads/WP;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/iQ;->G:Lcom/google/android/gms/internal/ads/Yk0;

    return-void
.end method

.method static bridge synthetic o6(Lcom/google/android/gms/internal/ads/iQ;)Lcom/google/android/gms/internal/ads/WP;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/iQ;->F:Lcom/google/android/gms/internal/ads/WP;

    return-object p0
.end method

.method static bridge synthetic p6(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/iQ;->x6(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic q6(Lcom/google/android/gms/internal/ads/iQ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/iQ;->y6(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final v6()Landroid/content/Context;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iQ;->E:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iQ;->D:Landroid/content/Context;

    :cond_0
    return-object v0
.end method

.method private static w6()Lk3/g;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "request_origin"

    const-string v2, "inspector_ooct"

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lk3/g$a;

    invoke-direct {v1}, Lk3/g$a;-><init>()V

    const-class v2, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual {v1, v2, v0}, Lk3/a;->b(Ljava/lang/Class;Landroid/os/Bundle;)Lk3/a;

    move-result-object v0

    check-cast v0, Lk3/g$a;

    invoke-virtual {v0}, Lk3/g$a;->g()Lk3/g;

    move-result-object v0

    return-object v0
.end method

.method private static x6(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    instance-of v0, p0, Lk3/m;

    if-eqz v0, :cond_0

    check-cast p0, Lk3/m;

    invoke-virtual {p0}, Lk3/m;->f()Lk3/u;

    move-result-object p0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lm3/a;

    if-eqz v0, :cond_1

    check-cast p0, Lm3/a;

    invoke-virtual {p0}, Lm3/a;->a()Lk3/u;

    move-result-object p0

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lx3/a;

    if-eqz v0, :cond_2

    check-cast p0, Lx3/a;

    invoke-virtual {p0}, Lx3/a;->a()Lk3/u;

    move-result-object p0

    goto :goto_0

    :cond_2
    instance-of v0, p0, LE3/c;

    if-eqz v0, :cond_3

    check-cast p0, LE3/c;

    invoke-virtual {p0}, LE3/c;->a()Lk3/u;

    move-result-object p0

    goto :goto_0

    :cond_3
    instance-of v0, p0, LF3/a;

    if-eqz v0, :cond_4

    check-cast p0, LF3/a;

    invoke-virtual {p0}, LF3/a;->a()Lk3/u;

    move-result-object p0

    goto :goto_0

    :cond_4
    instance-of v0, p0, Lk3/i;

    if-eqz v0, :cond_5

    check-cast p0, Lk3/i;

    invoke-virtual {p0}, Lk3/k;->getResponseInfo()Lk3/u;

    move-result-object p0

    goto :goto_0

    :cond_5
    instance-of v0, p0, Lcom/google/android/gms/ads/nativead/NativeAd;

    if-eqz v0, :cond_7

    check-cast p0, Lcom/google/android/gms/ads/nativead/NativeAd;

    invoke-virtual {p0}, Lcom/google/android/gms/ads/nativead/NativeAd;->c()Lk3/u;

    move-result-object p0

    :goto_0
    if-nez p0, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, Lk3/u;->f()Ls3/U0;

    move-result-object p0

    if-eqz p0, :cond_7

    :try_start_0
    invoke-interface {p0}, Ls3/U0;->g()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_7
    :goto_1
    const-string p0, ""

    return-object p0
.end method

.method private final declared-synchronized y6(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iQ;->H:Lcom/google/android/gms/internal/ads/KP;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/KP;->c(Ljava/lang/String;)LP4/d;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v0, Lcom/google/android/gms/internal/ads/gQ;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/gQ;-><init>(Lcom/google/android/gms/internal/ads/iQ;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/iQ;->G:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    const-string v0, "OutOfContextTester.setAdAsOutOfContext"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/iQ;->F:Lcom/google/android/gms/internal/ads/WP;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/WP;->f(Ljava/lang/String;)V
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

.method private final declared-synchronized z6(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iQ;->H:Lcom/google/android/gms/internal/ads/KP;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/KP;->c(Ljava/lang/String;)LP4/d;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v0, Lcom/google/android/gms/internal/ads/hQ;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/hQ;-><init>(Lcom/google/android/gms/internal/ads/iQ;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/iQ;->G:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    const-string v0, "OutOfContextTester.setAdAsShown"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/iQ;->F:Lcom/google/android/gms/internal/ads/WP;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/WP;->f(Ljava/lang/String;)V
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


# virtual methods
.method public final r6(Lcom/google/android/gms/internal/ads/KP;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/iQ;->H:Lcom/google/android/gms/internal/ads/KP;

    return-void
.end method

.method public final s5(Ljava/lang/String;LX3/a;LX3/a;)V
    .locals 2

    .prologue
    invoke-static {p2}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    invoke-static {p3}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/view/ViewGroup;

    if-eqz p2, :cond_3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iQ;->C:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/iQ;->C:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    instance-of p1, v0, Lk3/i;

    if-eqz p1, :cond_2

    check-cast v0, Lk3/i;

    invoke-static {p2, p3, v0}, Lcom/google/android/gms/internal/ads/jQ;->a(Landroid/content/Context;Landroid/view/ViewGroup;Lk3/i;)V

    return-void

    :cond_2
    instance-of p1, v0, Lcom/google/android/gms/ads/nativead/NativeAd;

    if-eqz p1, :cond_3

    check-cast v0, Lcom/google/android/gms/ads/nativead/NativeAd;

    invoke-static {p2, p3, v0}, Lcom/google/android/gms/internal/ads/jQ;->b(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/google/android/gms/ads/nativead/NativeAd;)V

    :cond_3
    :goto_0
    return-void
.end method

.method protected final declared-synchronized s6(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iQ;->C:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/iQ;->x6(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/ads/iQ;->y6(Ljava/lang/String;Ljava/lang/String;)V
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

.method public final declared-synchronized t6(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x4

    const/4 v4, 0x5

    const/4 v5, 0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "BANNER"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v5

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :sswitch_1
    const-string v0, "REWARDED_INTERSTITIAL"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v4

    goto :goto_1

    :sswitch_2
    const-string v0, "REWARDED"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v3

    goto :goto_1

    :sswitch_3
    const-string v0, "APP_OPEN_AD"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_1

    :sswitch_4
    const-string v0, "INTERSTITIAL"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v2

    goto :goto_1

    :sswitch_5
    const-string v0, "NATIVE"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_0

    move p2, v1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p2, -0x1

    :goto_1
    if-eqz p2, :cond_6

    if-eq p2, v5, :cond_5

    if-eq p2, v2, :cond_4

    if-eq p2, v1, :cond_3

    if-eq p2, v3, :cond_2

    if-eq p2, v4, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/iQ;->v6()Landroid/content/Context;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/ads/iQ;->w6()Lk3/g;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/eQ;

    invoke-direct {v1, p0, p1, p3}, Lcom/google/android/gms/internal/ads/eQ;-><init>(Lcom/google/android/gms/internal/ads/iQ;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2, p1, v0, v1}, LF3/a;->b(Landroid/content/Context;Ljava/lang/String;Lk3/g;LF3/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    :try_start_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/iQ;->v6()Landroid/content/Context;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/ads/iQ;->w6()Lk3/g;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/dQ;

    invoke-direct {v1, p0, p1, p3}, Lcom/google/android/gms/internal/ads/dQ;-><init>(Lcom/google/android/gms/internal/ads/iQ;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2, p1, v0, v1}, LE3/c;->b(Landroid/content/Context;Ljava/lang/String;Lk3/g;LE3/d;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :cond_3
    :try_start_3
    new-instance p2, Lk3/f$a;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/iQ;->v6()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lk3/f$a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/XP;

    invoke-direct {v0, p0, p1, p3}, Lcom/google/android/gms/internal/ads/XP;-><init>(Lcom/google/android/gms/internal/ads/iQ;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lk3/f$a;->b(Lcom/google/android/gms/ads/nativead/NativeAd$c;)Lk3/f$a;

    new-instance p1, Lcom/google/android/gms/internal/ads/fQ;

    invoke-direct {p1, p0, p3}, Lcom/google/android/gms/internal/ads/fQ;-><init>(Lcom/google/android/gms/internal/ads/iQ;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lk3/f$a;->c(Lk3/d;)Lk3/f$a;

    invoke-virtual {p2}, Lk3/f$a;->a()Lk3/f;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/ads/iQ;->w6()Lk3/g;

    move-result-object p2

    invoke-virtual {p1, p2}, Lk3/f;->a(Lk3/g;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :cond_4
    :try_start_4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/iQ;->v6()Landroid/content/Context;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/ads/iQ;->w6()Lk3/g;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/cQ;

    invoke-direct {v1, p0, p1, p3}, Lcom/google/android/gms/internal/ads/cQ;-><init>(Lcom/google/android/gms/internal/ads/iQ;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2, p1, v0, v1}, Lx3/a;->b(Landroid/content/Context;Ljava/lang/String;Lk3/g;Lx3/b;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-void

    :cond_5
    :try_start_5
    new-instance p2, Lk3/i;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/iQ;->v6()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Lk3/i;-><init>(Landroid/content/Context;)V

    sget-object v0, Lk3/h;->i:Lk3/h;

    invoke-virtual {p2, v0}, Lk3/k;->setAdSize(Lk3/h;)V

    invoke-virtual {p2, p1}, Lk3/k;->setAdUnitId(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/bQ;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/bQ;-><init>(Lcom/google/android/gms/internal/ads/iQ;Ljava/lang/String;Lk3/i;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lk3/k;->setAdListener(Lk3/d;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/iQ;->w6()Lk3/g;

    move-result-object p1

    invoke-virtual {p2, p1}, Lk3/k;->b(Lk3/g;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return-void

    :cond_6
    :try_start_6
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/iQ;->v6()Landroid/content/Context;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/ads/iQ;->w6()Lk3/g;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/aQ;

    invoke-direct {v1, p0, p1, p3}, Lcom/google/android/gms/internal/ads/aQ;-><init>(Lcom/google/android/gms/internal/ads/iQ;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2, p1, v0, v5, v1}, Lm3/a;->b(Landroid/content/Context;Ljava/lang/String;Lk3/g;ILm3/a$a;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p1

    :sswitch_data_0
    .sparse-switch
        -0x772abbe9 -> :sswitch_5
        -0x51d5b0d4 -> :sswitch_4
        -0x1987ba06 -> :sswitch_3
        0x205e3c0e -> :sswitch_2
        0x6e8e03bd -> :sswitch_1
        0x7458732c -> :sswitch_0
    .end sparse-switch
.end method

.method public final declared-synchronized u6(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/iQ;->F:Lcom/google/android/gms/internal/ads/WP;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/WP;->b()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/iQ;->C:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_8

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->n9:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1

    instance-of v3, v1, Lm3/a;

    if-nez v3, :cond_1

    instance-of v3, v1, Lx3/a;

    if-nez v3, :cond_1

    instance-of v3, v1, LE3/c;

    if-nez v3, :cond_1

    instance-of v3, v1, LF3/a;

    if-eqz v3, :cond_2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_1
    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/iQ;->C:Ljava/util/Map;

    invoke-interface {v3, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/iQ;->x6(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3, p2}, Lcom/google/android/gms/internal/ads/iQ;->z6(Ljava/lang/String;Ljava/lang/String;)V

    instance-of p2, v1, Lm3/a;

    if-eqz p2, :cond_3

    check-cast v1, Lm3/a;

    invoke-virtual {v1, v0}, Lm3/a;->e(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_3
    :try_start_1
    instance-of p2, v1, Lx3/a;

    if-eqz p2, :cond_4

    check-cast v1, Lx3/a;

    invoke-virtual {v1, v0}, Lx3/a;->e(Landroid/app/Activity;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_4
    :try_start_2
    instance-of p2, v1, LE3/c;

    if-eqz p2, :cond_5

    check-cast v1, LE3/c;

    new-instance p1, Lcom/google/android/gms/internal/ads/YP;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/YP;-><init>()V

    invoke-virtual {v1, v0, p1}, LE3/c;->c(Landroid/app/Activity;Lk3/p;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :cond_5
    :try_start_3
    instance-of p2, v1, LF3/a;

    if-eqz p2, :cond_6

    check-cast v1, LF3/a;

    new-instance p1, Lcom/google/android/gms/internal/ads/ZP;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/ZP;-><init>()V

    invoke-virtual {v1, v0, p1}, LF3/a;->c(Landroid/app/Activity;Lk3/p;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :cond_6
    :try_start_4
    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_8

    instance-of p2, v1, Lk3/i;

    if-nez p2, :cond_7

    instance-of p2, v1, Lcom/google/android/gms/ads/nativead/NativeAd;

    if-eqz p2, :cond_8

    :cond_7
    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/iQ;->v6()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.google.android.gms.ads.OutOfContextTestingActivity"

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "adUnit"

    invoke-virtual {p2, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    invoke-static {v0, p2}, Lv3/E0;->t(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-void

    :cond_8
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method
