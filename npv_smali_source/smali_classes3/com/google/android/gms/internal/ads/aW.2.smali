.class public final Lcom/google/android/gms/internal/ads/aW;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/v90;

.field private final b:Lcom/google/android/gms/internal/ads/GC;

.field private final c:Lcom/google/android/gms/internal/ads/Fa0;

.field private final d:Lcom/google/android/gms/internal/ads/La0;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Ljava/util/concurrent/ScheduledExecutorService;

.field private final g:Lcom/google/android/gms/internal/ads/jA;

.field private final h:Lcom/google/android/gms/internal/ads/TV;

.field private final i:Lcom/google/android/gms/internal/ads/bU;

.field private final j:Landroid/content/Context;

.field private final k:Lcom/google/android/gms/internal/ads/Q90;

.field private final l:Lcom/google/android/gms/internal/ads/DV;

.field private final m:Lcom/google/android/gms/internal/ads/YN;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/v90;Lcom/google/android/gms/internal/ads/TV;Lcom/google/android/gms/internal/ads/GC;Lcom/google/android/gms/internal/ads/Fa0;Lcom/google/android/gms/internal/ads/La0;Lcom/google/android/gms/internal/ads/jA;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/bU;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/DV;Lcom/google/android/gms/internal/ads/YN;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aW;->j:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/aW;->a:Lcom/google/android/gms/internal/ads/v90;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/aW;->h:Lcom/google/android/gms/internal/ads/TV;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/aW;->b:Lcom/google/android/gms/internal/ads/GC;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/aW;->c:Lcom/google/android/gms/internal/ads/Fa0;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/aW;->d:Lcom/google/android/gms/internal/ads/La0;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/aW;->g:Lcom/google/android/gms/internal/ads/jA;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/aW;->e:Ljava/util/concurrent/Executor;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/aW;->f:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/aW;->i:Lcom/google/android/gms/internal/ads/bU;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/aW;->k:Lcom/google/android/gms/internal/ads/Q90;

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/aW;->l:Lcom/google/android/gms/internal/ads/DV;

    iput-object p13, p0, Lcom/google/android/gms/internal/ads/aW;->m:Lcom/google/android/gms/internal/ads/YN;

    return-void
.end method

.method static d(Lcom/google/android/gms/internal/ads/e70;)Ljava/lang/String;
    .locals 5

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->w5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v1, "No fill."

    const/4 v2, 0x1

    if-eq v2, v0, :cond_0

    const-string v0, "No ad config."

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget v2, v2, Lcom/google/android/gms/internal/ads/U60;->f:I

    if-eqz v2, :cond_3

    const/16 v3, 0xc8

    const/16 v4, 0x12c

    if-lt v2, v3, :cond_1

    if-ge v2, v4, :cond_1

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->v5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_1
    if-lt v2, v4, :cond_2

    const/16 v0, 0x190

    if-ge v2, v0, :cond_2

    const-string v1, "No location header to follow redirect or too many redirects."

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Received error HTTP response code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_3
    move-object v1, v0

    :goto_1
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/U60;->j:Lcom/google/android/gms/internal/ads/T60;

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/T60;->a()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    return-object v1
.end method


# virtual methods
.method final synthetic a(Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/VT;Ljava/lang/Throwable;)LP4/d;
    .locals 4

    iget-object p4, p0, Lcom/google/android/gms/internal/ads/aW;->j:Landroid/content/Context;

    const/16 v0, 0xc

    invoke-static {p4, v0}, Lcom/google/android/gms/internal/ads/D90;->a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/E90;

    move-result-object p4

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/R60;->E:Ljava/lang/String;

    invoke-interface {p4, v0}, Lcom/google/android/gms/internal/ads/E90;->Z(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {p4}, Lcom/google/android/gms/internal/ads/E90;->h()Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {p3, p2, p1}, Lcom/google/android/gms/internal/ads/VT;->b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)LP4/d;

    move-result-object p3

    iget v0, p1, Lcom/google/android/gms/internal/ads/R60;->R:I

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/aW;->f:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {p3, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/Nk0;->o(LP4/d;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)LP4/d;

    move-result-object p3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aW;->c:Lcom/google/android/gms/internal/ads/Fa0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aW;->h:Lcom/google/android/gms/internal/ads/TV;

    invoke-virtual {v1, p2, p1, p3, v0}, Lcom/google/android/gms/internal/ads/TV;->f(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;LP4/d;Lcom/google/android/gms/internal/ads/Fa0;)LP4/d;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/aW;->k:Lcom/google/android/gms/internal/ads/Q90;

    invoke-static {p3, p1, p4}, Lcom/google/android/gms/internal/ads/P90;->a(LP4/d;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)V

    return-object p3
.end method

.method public final synthetic b(Ljava/lang/Object;)LP4/d;
    .locals 8

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/e70;

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->k2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/c70;->d:Lcom/google/android/gms/internal/ads/Po;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Po;->O:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aW;->m:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->l2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aW;->m:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/MN;->V:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v2

    invoke-interface {v2}, LV3/f;->a()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/aW;->d(Lcom/google/android/gms/internal/ads/e70;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aW;->i:Lcom/google/android/gms/internal/ads/bU;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/bU;->i(Lcom/google/android/gms/internal/ads/U60;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->i8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x3

    if-eqz v1, :cond_3

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget v1, v1, Lcom/google/android/gms/internal/ads/U60;->f:I

    if-eqz v1, :cond_3

    const/16 v3, 0xc8

    if-lt v1, v3, :cond_2

    const/16 v3, 0x12c

    if-lt v1, v3, :cond_3

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/XV;

    invoke-direct {p1, v2, v0}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    goto/16 :goto_3

    :cond_3
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->H3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/U60;->q:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aW;->i:Lcom/google/android/gms/internal/ads/bU;

    iget-object v4, p1, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/c70;->a:Ljava/util/List;

    invoke-virtual {v1, v0, v4}, Lcom/google/android/gms/internal/ads/bU;->h(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_1

    :cond_4
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/c70;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/R60;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/aW;->i:Lcom/google/android/gms/internal/ads/bU;

    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/bU;->d(Lcom/google/android/gms/internal/ads/R60;)V

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/R60;->a:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/aW;->g:Lcom/google/android/gms/internal/ads/jA;

    iget v7, v1, Lcom/google/android/gms/internal/ads/R60;->b:I

    invoke-interface {v6, v7, v5}, Lcom/google/android/gms/internal/ads/jA;->f(ILjava/lang/String;)Lcom/google/android/gms/internal/ads/VT;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-interface {v5, p1, v1}, Lcom/google/android/gms/internal/ads/VT;->a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_0

    :cond_6
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/aW;->i:Lcom/google/android/gms/internal/ads/bU;

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    invoke-static {v3, v7, v7}, Lcom/google/android/gms/internal/ads/P70;->d(ILjava/lang/String;Ls3/W0;)Ls3/W0;

    move-result-object v7

    invoke-virtual {v4, v1, v5, v6, v7}, Lcom/google/android/gms/internal/ads/bU;->f(Lcom/google/android/gms/internal/ads/R60;JLs3/W0;)V

    goto :goto_0

    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aW;->b:Lcom/google/android/gms/internal/ads/GC;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aW;->d:Lcom/google/android/gms/internal/ads/La0;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/aW;->c:Lcom/google/android/gms/internal/ads/Fa0;

    new-instance v5, Lcom/google/android/gms/internal/ads/Px;

    invoke-direct {v5, p1, v1, v4}, Lcom/google/android/gms/internal/ads/Px;-><init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/La0;Lcom/google/android/gms/internal/ads/Fa0;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aW;->e:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v5, v1}, Lcom/google/android/gms/internal/ads/BF;->F0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget v0, v0, Lcom/google/android/gms/internal/ads/U60;->r:I

    if-le v0, v3, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aW;->l:Lcom/google/android/gms/internal/ads/DV;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/DV;->b(Lcom/google/android/gms/internal/ads/e70;)LP4/d;

    move-result-object p1

    goto/16 :goto_3

    :cond_8
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/aW;->d(Lcom/google/android/gms/internal/ads/e70;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aW;->a:Lcom/google/android/gms/internal/ads/v90;

    sget-object v3, Lcom/google/android/gms/internal/ads/p90;->Q:Lcom/google/android/gms/internal/ads/p90;

    new-instance v4, Lcom/google/android/gms/internal/ads/XV;

    invoke-direct {v4, v2, v0}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object v0

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/internal/ads/e90;->c(LP4/d;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/l90;->a()Lcom/google/android/gms/internal/ads/a90;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aW;->h:Lcom/google/android/gms/internal/ads/TV;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/TV;->l()V

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/c70;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/R60;

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/R60;->a:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/aW;->g:Lcom/google/android/gms/internal/ads/jA;

    iget v7, v3, Lcom/google/android/gms/internal/ads/R60;->b:I

    invoke-interface {v6, v7, v5}, Lcom/google/android/gms/internal/ads/jA;->f(ILjava/lang/String;)Lcom/google/android/gms/internal/ads/VT;

    move-result-object v6

    if-eqz v6, :cond_9

    invoke-interface {v6, p1, v3}, Lcom/google/android/gms/internal/ads/VT;->a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)Z

    move-result v7

    if-eqz v7, :cond_9

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/aW;->a:Lcom/google/android/gms/internal/ads/v90;

    sget-object v7, Lcom/google/android/gms/internal/ads/p90;->R:Lcom/google/android/gms/internal/ads/p90;

    invoke-virtual {v4, v7, v0}, Lcom/google/android/gms/internal/ads/n90;->b(Ljava/lang/Object;LP4/d;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "render-config-"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "-"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/l90;->h(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v0

    new-instance v4, Lcom/google/android/gms/internal/ads/YV;

    invoke-direct {v4, p0, v3, p1, v6}, Lcom/google/android/gms/internal/ads/YV;-><init>(Lcom/google/android/gms/internal/ads/aW;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/VT;)V

    const-class v3, Ljava/lang/Throwable;

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/ads/l90;->c(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/l90;->a()Lcom/google/android/gms/internal/ads/a90;

    move-result-object v0

    :cond_a
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_b
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/aW;->h:Lcom/google/android/gms/internal/ads/TV;

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/ads/ZV;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/ZV;-><init>(Lcom/google/android/gms/internal/ads/TV;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/aW;->e:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1, p1}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    move-object p1, v0

    :goto_3
    return-object p1
.end method
