.class public final Lcom/google/android/gms/internal/ads/Xx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/EC;
.implements Lcom/google/android/gms/internal/ads/uD;
.implements Lcom/google/android/gms/internal/ads/ZC;
.implements Ls3/a;
.implements Lcom/google/android/gms/internal/ads/VC;
.implements Lcom/google/android/gms/internal/ads/DG;


# instance fields
.field private final C:Landroid/content/Context;

.field private final D:Ljava/util/concurrent/Executor;

.field private final E:Ljava/util/concurrent/Executor;

.field private final F:Ljava/util/concurrent/ScheduledExecutorService;

.field private final G:Lcom/google/android/gms/internal/ads/e70;

.field private final H:Lcom/google/android/gms/internal/ads/R60;

.field private final I:Lcom/google/android/gms/internal/ads/Fa0;

.field private final J:Lcom/google/android/gms/internal/ads/z70;

.field private final K:Lcom/google/android/gms/internal/ads/Z9;

.field private final L:Lcom/google/android/gms/internal/ads/ig;

.field private final M:Ljava/lang/ref/WeakReference;

.field private final N:Ljava/lang/ref/WeakReference;

.field private final O:Lcom/google/android/gms/internal/ads/dC;

.field private P:Z

.field private final Q:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/Fa0;Lcom/google/android/gms/internal/ads/z70;Landroid/view/View;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/Z9;Lcom/google/android/gms/internal/ads/ig;Lcom/google/android/gms/internal/ads/kg;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/dC;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p13, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p13}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p13, p0, Lcom/google/android/gms/internal/ads/Xx;->Q:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Xx;->C:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Xx;->D:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Xx;->E:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Xx;->F:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/Xx;->G:Lcom/google/android/gms/internal/ads/e70;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/Xx;->I:Lcom/google/android/gms/internal/ads/Fa0;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/Xx;->J:Lcom/google/android/gms/internal/ads/z70;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/Xx;->K:Lcom/google/android/gms/internal/ads/Z9;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Xx;->M:Ljava/lang/ref/WeakReference;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Xx;->N:Ljava/lang/ref/WeakReference;

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/Xx;->L:Lcom/google/android/gms/internal/ads/ig;

    iput-object p15, p0, Lcom/google/android/gms/internal/ads/Xx;->O:Lcom/google/android/gms/internal/ads/dC;

    return-void
.end method

.method public static synthetic A(Lcom/google/android/gms/internal/ads/Xx;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Xx;->F()V

    return-void
.end method

.method private final E()Ljava/util/List;
    .locals 6

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->mb:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->C:Landroid/content/Context;

    invoke-static {v0}, Lv3/E0;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->C:Landroid/content/Context;

    invoke-static {v0}, Lv3/E0;->Y(Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x14

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/R60;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "dspct"

    invoke-virtual {v3, v5, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/R60;->d:Ljava/util/List;

    return-object v0
.end method

.method private final F()V
    .locals 9

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/R60;->d:Ljava/util/List;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->E3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->K:Lcom/google/android/gms/internal/ads/Z9;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xx;->C:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Xx;->M:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Z9;->c()Lcom/google/android/gms/internal/ads/T9;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-interface {v0, v2, v3, v1}, Lcom/google/android/gms/internal/ads/T9;->i(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    :cond_1
    move-object v6, v1

    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->B0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->G:Lcom/google/android/gms/internal/ads/e70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/U60;->h:Z

    if-nez v0, :cond_3

    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/ads/Bg;->h:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->J:Lcom/google/android/gms/internal/ads/z70;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xx;->I:Lcom/google/android/gms/internal/ads/Fa0;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Xx;->G:Lcom/google/android/gms/internal/ads/e70;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    const/4 v7, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Xx;->E()Ljava/util/List;

    move-result-object v8

    const/4 v5, 0x0

    invoke-virtual/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/Fa0;->d(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/z70;->a(Ljava/util/List;)V

    return-void

    :cond_4
    sget-object v0, Lcom/google/android/gms/internal/ads/Bg;->g:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    iget v0, v0, Lcom/google/android/gms/internal/ads/R60;->b:I

    const/4 v2, 0x1

    if-eq v0, v2, :cond_5

    const/4 v2, 0x2

    if-eq v0, v2, :cond_5

    const/4 v2, 0x5

    if-ne v0, v2, :cond_6

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->N:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Ot;

    :cond_6
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Dk0;->D(LP4/d;)Lcom/google/android/gms/internal/ads/Dk0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->e1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Xx;->F:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2, v4, v3}, Lcom/google/android/gms/internal/ads/Nk0;->o(LP4/d;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)LP4/d;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Dk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/Wx;

    invoke-direct {v1, p0, v6}, Lcom/google/android/gms/internal/ads/Wx;-><init>(Lcom/google/android/gms/internal/ads/Xx;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xx;->D:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    :cond_7
    :goto_1
    return-void
.end method

.method private final G(II)V
    .locals 3

    .prologue
    if-lez p1, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->M:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->F:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/google/android/gms/internal/ads/Tx;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/Tx;-><init>(Lcom/google/android/gms/internal/ads/Xx;II)V

    int-to-long p1, p2

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, p1, p2, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void

    :cond_2
    :goto_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Xx;->F()V

    return-void
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/ads/Xx;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Xx;->C:Landroid/content/Context;

    return-object p0
.end method

.method static bridge synthetic i(Lcom/google/android/gms/internal/ads/Xx;)Lcom/google/android/gms/internal/ads/R60;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    return-object p0
.end method

.method static bridge synthetic k(Lcom/google/android/gms/internal/ads/Xx;)Lcom/google/android/gms/internal/ads/e70;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Xx;->G:Lcom/google/android/gms/internal/ads/e70;

    return-object p0
.end method

.method static bridge synthetic o(Lcom/google/android/gms/internal/ads/Xx;)Lcom/google/android/gms/internal/ads/z70;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Xx;->J:Lcom/google/android/gms/internal/ads/z70;

    return-object p0
.end method

.method static bridge synthetic r(Lcom/google/android/gms/internal/ads/Xx;)Lcom/google/android/gms/internal/ads/Fa0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Xx;->I:Lcom/google/android/gms/internal/ads/Fa0;

    return-object p0
.end method

.method static bridge synthetic z(Lcom/google/android/gms/internal/ads/Xx;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Xx;->E()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method final synthetic B(II)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Ux;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/Ux;-><init>(Lcom/google/android/gms/internal/ads/Xx;II)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Xx;->D:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method final synthetic C(II)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/Xx;->G(II)V

    return-void
.end method

.method public final a()V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final d()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->J:Lcom/google/android/gms/internal/ads/z70;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Xx;->I:Lcom/google/android/gms/internal/ads/Fa0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xx;->G:Lcom/google/android/gms/internal/ads/e70;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/R60;->i:Ljava/util/List;

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/Fa0;->c(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/z70;->a(Ljava/util/List;)V

    return-void
.end method

.method public final e()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->J:Lcom/google/android/gms/internal/ads/z70;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Xx;->I:Lcom/google/android/gms/internal/ads/Fa0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xx;->G:Lcom/google/android/gms/internal/ads/e70;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/R60;->g:Ljava/util/List;

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/Fa0;->c(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/z70;->a(Ljava/util/List;)V

    return-void
.end method

.method public final e0()V
    .locals 6

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->B0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->G:Lcom/google/android/gms/internal/ads/e70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/U60;->h:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Bg;->d:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->L:Lcom/google/android/gms/internal/ads/ig;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ig;->a()LP4/d;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Dk0;->D(LP4/d;)Lcom/google/android/gms/internal/ads/Dk0;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/Rx;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/Rx;-><init>()V

    sget-object v2, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    const-class v3, Ljava/lang/Throwable;

    invoke-static {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->e(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Dk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/Vx;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/Vx;-><init>(Lcom/google/android/gms/internal/ads/Xx;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xx;->D:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->J:Lcom/google/android/gms/internal/ads/z70;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Xx;->I:Lcom/google/android/gms/internal/ads/Fa0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xx;->G:Lcom/google/android/gms/internal/ads/e70;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/Xx;->C:Landroid/content/Context;

    iget-object v5, v3, Lcom/google/android/gms/internal/ads/R60;->c:Ljava/util/List;

    invoke-virtual {v1, v2, v3, v5}, Lcom/google/android/gms/internal/ads/Fa0;->c(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/Uq;->a(Landroid/content/Context;)Z

    move-result v2

    const/4 v3, 0x1

    if-eq v3, v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x2

    :goto_1
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/ads/z70;->c(Ljava/util/List;I)V

    return-void
.end method

.method final synthetic n()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Sx;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/Sx;-><init>(Lcom/google/android/gms/internal/ads/Xx;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Xx;->D:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final p(Ls3/W0;)V
    .locals 4

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->D1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget p1, p1, Ls3/W0;->C:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/R60;->o:Ljava/util/List;

    const/4 v1, 0x2

    invoke-static {v1, p1, v0}, Lcom/google/android/gms/internal/ads/Fa0;->f(IILjava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->J:Lcom/google/android/gms/internal/ads/z70;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Xx;->I:Lcom/google/android/gms/internal/ads/Fa0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xx;->G:Lcom/google/android/gms/internal/ads/e70;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    invoke-virtual {v1, v2, v3, p1}, Lcom/google/android/gms/internal/ads/Fa0;->c(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/z70;->a(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public final q(Lcom/google/android/gms/internal/ads/bp;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Xx;->J:Lcom/google/android/gms/internal/ads/z70;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/Xx;->I:Lcom/google/android/gms/internal/ads/Fa0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/R60;->h:Ljava/util/List;

    invoke-virtual {p3, v0, v1, p1}, Lcom/google/android/gms/internal/ads/Fa0;->e(Lcom/google/android/gms/internal/ads/R60;Ljava/util/List;Lcom/google/android/gms/internal/ads/bp;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/z70;->a(Ljava/util/List;)V

    return-void
.end method

.method public final t()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->Q:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->N3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->O3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/Xx;->G(II)V

    return-void

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->M3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->E:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/Qx;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/Qx;-><init>(Lcom/google/android/gms/internal/ads/Xx;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Xx;->F()V

    return-void
.end method

.method public final declared-synchronized u()V
    .locals 8

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/Xx;->P:Z

    if-eqz v0, :cond_0

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Xx;->E()Ljava/util/List;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/R60;->f:Ljava/util/List;

    invoke-interface {v7, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->J:Lcom/google/android/gms/internal/ads/z70;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Xx;->I:Lcom/google/android/gms/internal/ads/Fa0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xx;->G:Lcom/google/android/gms/internal/ads/e70;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x1

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/Fa0;->d(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/z70;->a(Ljava/util/List;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->J:Lcom/google/android/gms/internal/ads/z70;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Xx;->I:Lcom/google/android/gms/internal/ads/Fa0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xx;->G:Lcom/google/android/gms/internal/ads/e70;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/R60;->m:Ljava/util/List;

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/Fa0;->c(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/z70;->a(Ljava/util/List;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->J3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->O:Lcom/google/android/gms/internal/ads/dC;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dC;->b()Lcom/google/android/gms/internal/ads/R60;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/R60;->m:Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dC;->a()Lcom/google/android/gms/internal/ads/TV;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/TV;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/Fa0;->g(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Xx;->O:Lcom/google/android/gms/internal/ads/dC;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/dC;->a()Lcom/google/android/gms/internal/ads/TV;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/TV;->a()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Fa0;->h(Ljava/util/List;J)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Xx;->J:Lcom/google/android/gms/internal/ads/z70;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xx;->I:Lcom/google/android/gms/internal/ads/Fa0;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Xx;->O:Lcom/google/android/gms/internal/ads/dC;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/dC;->c()Lcom/google/android/gms/internal/ads/e70;

    move-result-object v4

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/dC;->b()Lcom/google/android/gms/internal/ads/R60;

    move-result-object v3

    invoke-virtual {v2, v4, v3, v0}, Lcom/google/android/gms/internal/ads/Fa0;->c(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/z70;->a(Ljava/util/List;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->J:Lcom/google/android/gms/internal/ads/z70;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Xx;->I:Lcom/google/android/gms/internal/ads/Fa0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xx;->G:Lcom/google/android/gms/internal/ads/e70;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/R60;->f:Ljava/util/List;

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/Fa0;->c(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :goto_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/Xx;->P:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final w()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xx;->J:Lcom/google/android/gms/internal/ads/z70;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Xx;->I:Lcom/google/android/gms/internal/ads/Fa0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Xx;->G:Lcom/google/android/gms/internal/ads/e70;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Xx;->H:Lcom/google/android/gms/internal/ads/R60;

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/R60;->u0:Ljava/util/List;

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/Fa0;->c(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/z70;->a(Ljava/util/List;)V

    return-void
.end method
