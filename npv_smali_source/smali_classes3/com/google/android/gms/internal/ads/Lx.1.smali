.class public final Lcom/google/android/gms/internal/ads/Lx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lv3/s0;

.field private final c:Lcom/google/android/gms/internal/ads/RT;

.field private final d:Lcom/google/android/gms/internal/ads/HM;

.field private final e:Lcom/google/android/gms/internal/ads/Yk0;

.field private final f:Ljava/util/concurrent/Executor;

.field private final g:Ljava/util/concurrent/ScheduledExecutorService;

.field h:Lcom/google/android/gms/internal/ads/no;

.field i:Lcom/google/android/gms/internal/ads/no;


# direct methods
.method constructor <init>(Landroid/content/Context;Lv3/s0;Lcom/google/android/gms/internal/ads/RT;Lcom/google/android/gms/internal/ads/HM;Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/Yk0;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Lx;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Lx;->b:Lv3/s0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Lx;->c:Lcom/google/android/gms/internal/ads/RT;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Lx;->d:Lcom/google/android/gms/internal/ads/HM;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/Lx;->e:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/Lx;->f:Ljava/util/concurrent/Executor;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/Lx;->g:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/ads/Lx;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Lx;->a:Landroid/content/Context;

    return-object p0
.end method

.method static bridge synthetic f(Lcom/google/android/gms/internal/ads/Lx;)Lcom/google/android/gms/internal/ads/Yk0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Lx;->e:Lcom/google/android/gms/internal/ads/Yk0;

    return-object p0
.end method

.method public static j(Ljava/lang/String;)Z
    .locals 2

    .prologue
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->ba:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method

.method private final k(Ljava/lang/String;Landroid/view/InputEvent;Ljava/util/Random;)LP4/d;
    .locals 4

    .prologue
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->ba:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Lx;->b:Lv3/s0;

    invoke-interface {v0}, Lv3/s0;->M()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const v1, 0x7fffffff

    invoke-virtual {p3, v1}, Ljava/util/Random;->nextInt(I)I

    move-result p3

    int-to-long v1, p3

    sget-object p3, Lcom/google/android/gms/internal/ads/Af;->ca:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, p3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p3, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    if-nez p2, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->da:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string p2, "11"

    invoke-virtual {v0, p1, p2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/Lx;->c:Lcom/google/android/gms/internal/ads/RT;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/RT;->a()LP4/d;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/Dk0;->D(LP4/d;)Lcom/google/android/gms/internal/ads/Dk0;

    move-result-object p3

    new-instance v1, Lcom/google/android/gms/internal/ads/Fx;

    invoke-direct {v1, p0, v0, p1, p2}, Lcom/google/android/gms/internal/ads/Fx;-><init>(Lcom/google/android/gms/internal/ads/Lx;Landroid/net/Uri$Builder;Ljava/lang/String;Landroid/view/InputEvent;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Lx;->f:Ljava/util/concurrent/Executor;

    invoke-static {p3, v1, p1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Dk0;

    const-class p2, Ljava/lang/Throwable;

    new-instance p3, Lcom/google/android/gms/internal/ads/Gx;

    invoke-direct {p3, p0, v0}, Lcom/google/android/gms/internal/ads/Gx;-><init>(Lcom/google/android/gms/internal/ads/Lx;Landroid/net/Uri$Builder;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Lx;->e:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/Nk0;->f(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Dk0;

    return-object p1

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/util/Random;)LP4/d;
    .locals 2

    .prologue
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Lx;->d:Lcom/google/android/gms/internal/ads/HM;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/HM;->a()Landroid/view/InputEvent;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/internal/ads/Lx;->k(Ljava/lang/String;Landroid/view/InputEvent;Ljava/util/Random;)LP4/d;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/Cx;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/Cx;-><init>(Lcom/google/android/gms/internal/ads/Lx;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Lx;->e:Lcom/google/android/gms/internal/ads/Yk0;

    const-class v1, Ljava/lang/Throwable;

    invoke-static {p2, v1, v0, p1}, Lcom/google/android/gms/internal/ads/Nk0;->f(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method final synthetic c(Ljava/lang/String;Ljava/lang/Throwable;)LP4/d;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Ex;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/Ex;-><init>(Lcom/google/android/gms/internal/ads/Lx;Ljava/lang/Throwable;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Lx;->e:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/Yk0;->r(Ljava/lang/Runnable;)LP4/d;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method final synthetic d(Landroid/net/Uri$Builder;Ljava/lang/String;Landroid/view/InputEvent;Ljava/lang/Integer;)LP4/d;
    .locals 2

    .prologue
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    const/4 v0, 0x1

    if-ne p4, v0, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p4

    invoke-virtual {p4}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p4

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->ea:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "1"

    invoke-virtual {p4, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->da:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "12"

    invoke-virtual {p4, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->fa:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->ga:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p4, p2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Lx;->c:Lcom/google/android/gms/internal/ads/RT;

    invoke-virtual {p4}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p4

    invoke-virtual {p2, p4, p3}, Lcom/google/android/gms/internal/ads/RT;->b(Landroid/net/Uri;Landroid/view/InputEvent;)LP4/d;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Dk0;->D(LP4/d;)Lcom/google/android/gms/internal/ads/Dk0;

    move-result-object p2

    new-instance p3, Lcom/google/android/gms/internal/ads/Hx;

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/ads/Hx;-><init>(Landroid/net/Uri$Builder;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Lx;->f:Ljava/util/concurrent/Executor;

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Dk0;

    goto :goto_0

    :cond_1
    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->da:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const-string p3, "10"

    invoke-virtual {p1, p2, p3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method final synthetic e(Landroid/net/Uri$Builder;Ljava/lang/Throwable;)LP4/d;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Dx;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/Dx;-><init>(Lcom/google/android/gms/internal/ads/Lx;Ljava/lang/Throwable;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Lx;->e:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/Yk0;->r(Ljava/lang/Runnable;)LP4/d;

    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->da:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const-string v0, "9"

    invoke-virtual {p1, p2, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method final synthetic g(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->ia:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Lx;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/lo;->e(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/no;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Lx;->i:Lcom/google/android/gms/internal/ads/no;

    const-string v1, "AttributionReporting.getUpdatedUrlAndRegisterSource"

    :goto_0
    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/no;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Lx;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/lo;->c(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/no;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Lx;->h:Lcom/google/android/gms/internal/ads/no;

    const-string v1, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource"

    goto :goto_0
.end method

.method final synthetic h(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->ia:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Lx;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/lo;->e(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/no;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Lx;->i:Lcom/google/android/gms/internal/ads/no;

    const-string v1, "AttributionReporting"

    :goto_0
    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/no;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Lx;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/lo;->c(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/no;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Lx;->h:Lcom/google/android/gms/internal/ads/no;

    const-string v1, "AttributionReportingSampled"

    goto :goto_0
.end method

.method public final i(Ljava/lang/String;Lcom/google/android/gms/internal/ads/La0;Ljava/util/Random;Lw3/w;)V
    .locals 4

    .prologue
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Lx;->d:Lcom/google/android/gms/internal/ads/HM;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/HM;->a()Landroid/view/InputEvent;

    move-result-object v0

    invoke-direct {p0, p1, v0, p3}, Lcom/google/android/gms/internal/ads/Lx;->k(Ljava/lang/String;Landroid/view/InputEvent;Ljava/util/Random;)LP4/d;

    move-result-object p3

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->ha:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Lx;->g:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p3, v0, v1, v3, v2}, Lcom/google/android/gms/internal/ads/Nk0;->o(LP4/d;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)LP4/d;

    move-result-object p3

    new-instance v0, Lcom/google/android/gms/internal/ads/Kx;

    invoke-direct {v0, p0, p2, p1, p4}, Lcom/google/android/gms/internal/ads/Kx;-><init>(Lcom/google/android/gms/internal/ads/Lx;Lcom/google/android/gms/internal/ads/La0;Ljava/lang/String;Lw3/w;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Lx;->e:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p3, v0, p1}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void
.end method
