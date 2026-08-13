.class public final Lcom/google/android/gms/internal/ads/IN;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/eF;
.implements Ls3/a;
.implements Lcom/google/android/gms/internal/ads/ZC;
.implements Lcom/google/android/gms/internal/ads/IC;


# instance fields
.field private final C:Landroid/content/Context;

.field private final D:Lcom/google/android/gms/internal/ads/G70;

.field private final E:Lcom/google/android/gms/internal/ads/eO;

.field private final F:Lcom/google/android/gms/internal/ads/e70;

.field private final G:Lcom/google/android/gms/internal/ads/R60;

.field private final H:Lcom/google/android/gms/internal/ads/iT;

.field private final I:Ljava/lang/String;

.field private J:Ljava/lang/Boolean;

.field private final K:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/G70;Lcom/google/android/gms/internal/ads/eO;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/iT;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/IN;->C:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/IN;->D:Lcom/google/android/gms/internal/ads/G70;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/IN;->E:Lcom/google/android/gms/internal/ads/eO;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/IN;->F:Lcom/google/android/gms/internal/ads/e70;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/IN;->G:Lcom/google/android/gms/internal/ads/R60;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/IN;->H:Lcom/google/android/gms/internal/ads/iT;

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->F6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/IN;->K:Z

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/IN;->I:Ljava/lang/String;

    return-void
.end method

.method private final a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/IN;->F:Lcom/google/android/gms/internal/ads/e70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/IN;->E:Lcom/google/android/gms/internal/ads/eO;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eO;->a()Lcom/google/android/gms/internal/ads/dO;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/dO;->d(Lcom/google/android/gms/internal/ads/U60;)Lcom/google/android/gms/internal/ads/dO;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/IN;->G:Lcom/google/android/gms/internal/ads/R60;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/dO;->c(Lcom/google/android/gms/internal/ads/R60;)Lcom/google/android/gms/internal/ads/dO;

    const-string v0, "action"

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/IN;->I:Ljava/lang/String;

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "ad_format"

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/IN;->G:Lcom/google/android/gms/internal/ads/R60;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/R60;->t:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/IN;->G:Lcom/google/android/gms/internal/ads/R60;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/R60;->t:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v2, "ancn"

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/IN;->G:Lcom/google/android/gms/internal/ads/R60;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/R60;->b()Z

    move-result p1

    const/4 v2, 0x1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/IN;->C:Landroid/content/Context;

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/ads/Uq;->a(Landroid/content/Context;)Z

    move-result p1

    if-eq v2, p1, :cond_1

    const-string p1, "offline"

    goto :goto_0

    :cond_1
    const-string p1, "online"

    :goto_0
    const-string v3, "device_connectivity"

    invoke-virtual {v1, v3, p1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object p1

    invoke-interface {p1}, LV3/f;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    const-string v3, "event_timestamp"

    invoke-virtual {v1, v3, p1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    const-string p1, "offline_ad"

    const-string v3, "1"

    invoke-virtual {v1, p1, v3}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    :cond_2
    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->M6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/IN;->F:Lcom/google/android/gms/internal/ads/e70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    invoke-static {p1}, LB3/c;->f(Lcom/google/android/gms/internal/ads/n70;)I

    move-result p1

    if-eq p1, v2, :cond_3

    move v0, v2

    :cond_3
    const-string p1, "scar"

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    if-eqz v0, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/IN;->F:Lcom/google/android/gms/internal/ads/e70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    iget-object v0, p1, Ls3/X1;->R:Ljava/lang/String;

    const-string v2, "ragent"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    invoke-static {p1}, LB3/c;->c(Ls3/X1;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LB3/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "rtype"

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    :cond_4
    return-object v1
.end method

.method private final c(Lcom/google/android/gms/internal/ads/dO;)V
    .locals 7

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/IN;->G:Lcom/google/android/gms/internal/ads/R60;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/R60;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dO;->e()Ljava/lang/String;

    move-result-object v5

    new-instance p1, Lcom/google/android/gms/internal/ads/kT;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v0

    invoke-interface {v0}, LV3/f;->a()J

    move-result-wide v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/IN;->F:Lcom/google/android/gms/internal/ads/e70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/U60;->b:Ljava/lang/String;

    const/4 v6, 0x2

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/kT;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/IN;->H:Lcom/google/android/gms/internal/ads/iT;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/iT;->i(Lcom/google/android/gms/internal/ads/kT;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/dO;->g()V

    return-void
.end method

.method private final e()Z
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/IN;->J:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/IN;->J:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->B1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/IN;->C:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {v1}, Lv3/E0;->V(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    :try_start_2
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catch_1
    move-exception v0

    :try_start_3
    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v1

    const-string v3, "CsiActionsListener.isPatternMatched"

    invoke-virtual {v1, v0, v3}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_1
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/IN;->J:Ljava/lang/Boolean;

    :cond_2
    monitor-exit p0

    goto :goto_3

    :goto_2
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_3
    :goto_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/IN;->J:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final F(Lcom/google/android/gms/internal/ads/YH;)V
    .locals 3

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/IN;->K:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ifts"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/IN;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    move-result-object v0

    const-string v1, "reason"

    const-string v2, "exception"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v1, "msg"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dO;->g()V

    return-void
.end method

.method public final b()V
    .locals 3

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/IN;->K:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ifts"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/IN;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    move-result-object v0

    const-string v1, "reason"

    const-string v2, "blocked"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dO;->g()V

    return-void
.end method

.method public final e0()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/IN;->G:Lcom/google/android/gms/internal/ads/R60;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/R60;->b()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "click"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/IN;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/IN;->c(Lcom/google/android/gms/internal/ads/dO;)V

    return-void
.end method

.method public final h()V
    .locals 1

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/IN;->e()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "adapter_shown"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/IN;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dO;->g()V

    return-void
.end method

.method public final j()V
    .locals 1

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/IN;->e()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "adapter_impression"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/IN;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dO;->g()V

    return-void
.end method

.method public final p(Ls3/W0;)V
    .locals 5

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/IN;->K:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ifts"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/IN;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    move-result-object v0

    const-string v1, "reason"

    const-string v2, "adapter"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    iget v1, p1, Ls3/W0;->C:I

    iget-object v2, p1, Ls3/W0;->D:Ljava/lang/String;

    iget-object v3, p1, Ls3/W0;->E:Ljava/lang/String;

    const-string v4, "com.google.android.gms.ads"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p1, Ls3/W0;->F:Ls3/W0;

    if-eqz v3, :cond_1

    iget-object v3, v3, Ls3/W0;->E:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object p1, p1, Ls3/W0;->F:Ls3/W0;

    iget v1, p1, Ls3/W0;->C:I

    iget-object v2, p1, Ls3/W0;->D:Ljava/lang/String;

    :cond_1
    if-ltz v1, :cond_2

    const-string p1, "arec"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/IN;->D:Lcom/google/android/gms/internal/ads/G70;

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/G70;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string v1, "areec"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    :cond_3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dO;->g()V

    return-void
.end method

.method public final t()V
    .locals 1

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/IN;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/IN;->G:Lcom/google/android/gms/internal/ads/R60;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/R60;->b()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "impression"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/IN;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/IN;->c(Lcom/google/android/gms/internal/ads/dO;)V

    return-void
.end method
