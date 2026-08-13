.class public final Lr3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lcom/google/android/gms/internal/ads/T9;


# instance fields
.field private final C:Ljava/util/List;

.field private final D:Ljava/util/concurrent/atomic/AtomicReference;

.field private final E:Ljava/util/concurrent/atomic/AtomicReference;

.field protected F:Z

.field private final G:Z

.field private final H:Z

.field private final I:Ljava/util/concurrent/Executor;

.field private final J:Lcom/google/android/gms/internal/ads/Vc0;

.field private K:Landroid/content/Context;

.field private final L:Landroid/content/Context;

.field private M:Lw3/a;

.field private final N:Lw3/a;

.field private final O:Z

.field final P:Ljava/util/concurrent/CountDownLatch;

.field private Q:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lw3/a;)V
    .locals 3

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lr3/k;->C:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lr3/k;->D:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lr3/k;->E:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lr3/k;->P:Ljava/util/concurrent/CountDownLatch;

    iput-object p1, p0, Lr3/k;->K:Landroid/content/Context;

    iput-object p1, p0, Lr3/k;->L:Landroid/content/Context;

    iput-object p2, p0, Lr3/k;->M:Lw3/a;

    iput-object p2, p0, Lr3/k;->N:Lw3/a;

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object p2

    iput-object p2, p0, Lr3/k;->I:Ljava/util/concurrent/Executor;

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->y2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lr3/k;->O:Z

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/ads/Vc0;->a(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Lcom/google/android/gms/internal/ads/Vc0;

    move-result-object p1

    iput-object p1, p0, Lr3/k;->J:Lcom/google/android/gms/internal/ads/Vc0;

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->v2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lr3/k;->G:Z

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->z2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lr3/k;->H:Z

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->x2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    iput p1, p0, Lr3/k;->Q:I

    goto :goto_0

    :cond_0
    iput v1, p0, Lr3/k;->Q:I

    :goto_0
    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->A3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lr3/k;->m()Z

    move-result p1

    iput-boolean p1, p0, Lr3/k;->F:Z

    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->u3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_1
    sget-object p1, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_2
    invoke-static {}, Ls3/y;->b()Lw3/g;

    invoke-static {}, Lw3/g;->w()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lr3/k;->run()V

    return-void
.end method

.method static bridge synthetic j(Lr3/k;)Lcom/google/android/gms/internal/ads/Vc0;
    .locals 0

    iget-object p0, p0, Lr3/k;->J:Lcom/google/android/gms/internal/ads/Vc0;

    return-object p0
.end method

.method private final q()Lcom/google/android/gms/internal/ads/T9;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lr3/k;->o()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lr3/k;->E:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/T9;

    return-object v0

    :cond_0
    iget-object v0, p0, Lr3/k;->D:Ljava/util/concurrent/atomic/AtomicReference;

    goto :goto_0
.end method

.method private final r()V
    .locals 7

    .prologue
    iget-object v0, p0, Lr3/k;->C:Ljava/util/List;

    invoke-direct {p0}, Lr3/k;->q()Lcom/google/android/gms/internal/ads/T9;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lr3/k;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Object;

    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v3, v5, :cond_2

    aget-object v2, v2, v4

    check-cast v2, Landroid/view/MotionEvent;

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/T9;->h(Landroid/view/MotionEvent;)V

    goto :goto_0

    :cond_2
    const/4 v6, 0x3

    if-ne v3, v6, :cond_1

    aget-object v3, v2, v4

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aget-object v4, v2, v5

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x2

    aget-object v2, v2, v5

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v1, v3, v4, v2}, Lcom/google/android/gms/internal/ads/T9;->g(III)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lr3/k;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_4
    :goto_1
    return-void
.end method

.method private final s(Z)V
    .locals 3

    iget-object v0, p0, Lr3/k;->M:Lw3/a;

    iget-object v0, v0, Lw3/a;->C:Ljava/lang/String;

    iget-object v1, p0, Lr3/k;->K:Landroid/content/Context;

    invoke-static {v1}, Lr3/k;->t(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/X7;->b0()Lcom/google/android/gms/internal/ads/V7;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/V7;->z(Z)Lcom/google/android/gms/internal/ads/V7;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/V7;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/V7;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/X7;

    new-instance v0, Lcom/google/android/gms/internal/ads/V9;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/V9;-><init>(Lcom/google/android/gms/internal/ads/X7;)V

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/X9;->y(Landroid/content/Context;Lcom/google/android/gms/internal/ads/V9;)Lcom/google/android/gms/internal/ads/X9;

    move-result-object p1

    iget-object v0, p0, Lr3/k;->D:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final t(Landroid/content/Context;)Landroid/content/Context;
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    return-object v0
.end method

.method private static final u(Landroid/content/Context;Lw3/a;ZZ)Lcom/google/android/gms/internal/ads/Q9;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/X7;->b0()Lcom/google/android/gms/internal/ads/V7;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/V7;->z(Z)Lcom/google/android/gms/internal/ads/V7;

    iget-object p1, p1, Lw3/a;->C:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/V7;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/V7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/X7;

    invoke-static {p0}, Lr3/k;->t(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, p1, p3}, Lcom/google/android/gms/internal/ads/Q9;->j(Landroid/content/Context;Lcom/google/android/gms/internal/ads/X7;Z)Lcom/google/android/gms/internal/ads/Q9;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lr3/k;->k(Landroid/content/Context;[B)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroid/view/View;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Lr3/k;->q()Lcom/google/android/gms/internal/ads/T9;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/T9;->b(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final c([Ljava/lang/StackTraceElement;)V
    .locals 4

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->U2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr3/k;->P:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->getCount()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    invoke-direct {p0}, Lr3/k;->q()Lcom/google/android/gms/internal/ads/T9;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/T9;->c([Ljava/lang/StackTraceElement;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lr3/k;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lr3/k;->q()Lcom/google/android/gms/internal/ads/T9;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/T9;->c([Ljava/lang/StackTraceElement;)V

    :cond_1
    return-void
.end method

.method public final d(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .prologue
    new-instance v0, Lr3/h;

    invoke-direct {v0, p0, p1}, Lr3/h;-><init>(Lr3/k;Landroid/content/Context;)V

    iget-object v1, p0, Lr3/k;->I:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/Nk0;->j(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->P2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    iget-object v0, p0, Lr3/k;->N:Lw3/a;

    iget-object v0, v0, Lw3/a;->C:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/M9;->a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_1
    const/16 p1, 0x11

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final e(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lr3/k;->f(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final f(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 3

    .prologue
    invoke-virtual {p0}, Lr3/k;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lr3/k;->q()Lcom/google/android/gms/internal/ads/T9;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->Aa:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {p3, v1, v2}, Lv3/E0;->k(Landroid/view/View;ILandroid/view/MotionEvent;)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-direct {p0}, Lr3/k;->r()V

    invoke-static {p1}, Lr3/k;->t(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/T9;->f(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const-string p1, ""

    return-object p1
.end method

.method public final g(III)V
    .locals 3

    .prologue
    invoke-direct {p0}, Lr3/k;->q()Lcom/google/android/gms/internal/ads/T9;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lr3/k;->r()V

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/T9;->g(III)V

    return-void

    :cond_0
    iget-object v0, p0, Lr3/k;->C:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    const/4 p1, 0x2

    aput-object p3, v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final h(Landroid/view/MotionEvent;)V
    .locals 3

    .prologue
    invoke-direct {p0}, Lr3/k;->q()Lcom/google/android/gms/internal/ads/T9;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lr3/k;->r()V

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/T9;->h(Landroid/view/MotionEvent;)V

    return-void

    :cond_0
    iget-object v0, p0, Lr3/k;->C:Ljava/util/List;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final i(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 5

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->za:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lr3/k;->n()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lr3/k;->q()Lcom/google/android/gms/internal/ads/T9;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/internal/ads/Af;->Aa:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    invoke-static {p2, v2, v1}, Lv3/E0;->k(Landroid/view/View;ILandroid/view/MotionEvent;)V

    :cond_0
    if-eqz v0, :cond_3

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/T9;->i(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-direct {p0}, Lr3/k;->q()Lcom/google/android/gms/internal/ads/T9;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/internal/ads/Af;->Aa:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    invoke-static {p2, v2, v1}, Lv3/E0;->k(Landroid/view/View;ILandroid/view/MotionEvent;)V

    :cond_2
    if-eqz v0, :cond_3

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/T9;->i(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    const-string p1, ""

    return-object p1
.end method

.method public final k(Landroid/content/Context;[B)Ljava/lang/String;
    .locals 0

    .prologue
    invoke-virtual {p0}, Lr3/k;->n()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lr3/k;->q()Lcom/google/android/gms/internal/ads/T9;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lr3/k;->r()V

    invoke-static {p1}, Lr3/k;->t(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/T9;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method final synthetic l(Z)V
    .locals 5

    .prologue
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    :try_start_0
    iget-object v2, p0, Lr3/k;->L:Landroid/content/Context;

    iget-object v3, p0, Lr3/k;->N:Lw3/a;

    iget-boolean v4, p0, Lr3/k;->O:Z

    invoke-static {v2, v3, p1, v4}, Lr3/k;->u(Landroid/content/Context;Lw3/a;ZZ)Lcom/google/android/gms/internal/ads/Q9;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Q9;->p()V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v2, p0, Lr3/k;->J:Lcom/google/android/gms/internal/ads/Vc0;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v0

    const/16 v0, 0x7eb

    invoke-virtual {v2, v0, v3, v4, p1}, Lcom/google/android/gms/internal/ads/Vc0;->c(IJLjava/lang/Exception;)Ll4/l;

    return-void
.end method

.method protected final m()Z
    .locals 6

    iget-object v0, p0, Lr3/k;->K:Landroid/content/Context;

    new-instance v1, Lr3/j;

    invoke-direct {v1, p0}, Lr3/j;-><init>(Lr3/k;)V

    iget-object v2, p0, Lr3/k;->J:Lcom/google/android/gms/internal/ads/Vc0;

    new-instance v3, Lcom/google/android/gms/internal/ads/Td0;

    iget-object v4, p0, Lr3/k;->K:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/yd0;->b(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Vc0;)I

    move-result v0

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->w2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v5

    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-direct {v3, v4, v0, v1, v2}, Lcom/google/android/gms/internal/ads/Td0;-><init>(Landroid/content/Context;ILcom/google/android/gms/internal/ads/zd0;Z)V

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/Td0;->d(I)Z

    move-result v0

    return v0
.end method

.method public final n()Z
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lr3/k;->P:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v0

    const-string v1, "Interrupted during GADSignals creation."

    invoke-static {v1, v0}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return v0
.end method

.method protected final o()I
    .locals 1

    .prologue
    iget-boolean v0, p0, Lr3/k;->G:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lr3/k;->F:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    iget v0, p0, Lr3/k;->Q:I

    return v0
.end method

.method public final p()I
    .locals 1

    iget v0, p0, Lr3/k;->Q:I

    return v0
.end method

.method public final run()V
    .locals 8

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->A3:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lr3/k;->m()Z

    move-result v1

    iput-boolean v1, p0, Lr3/k;->F:Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_2

    :cond_0
    :goto_0
    iget-object v1, p0, Lr3/k;->M:Lw3/a;

    iget-boolean v1, v1, Lw3/a;->F:Z

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->f1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_1

    if-eqz v1, :cond_1

    move v3, v4

    :cond_1
    invoke-virtual {p0}, Lr3/k;->o()I

    move-result v1

    if-ne v1, v4, :cond_2

    invoke-direct {p0, v3}, Lr3/k;->s(Z)V

    iget v1, p0, Lr3/k;->Q:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    iget-object v1, p0, Lr3/k;->I:Ljava/util/concurrent/Executor;

    new-instance v2, Lr3/i;

    invoke-direct {v2, p0, v3}, Lr3/i;-><init>(Lr3/k;Z)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v5, p0, Lr3/k;->K:Landroid/content/Context;

    iget-object v6, p0, Lr3/k;->M:Lw3/a;

    iget-boolean v7, p0, Lr3/k;->O:Z

    invoke-static {v5, v6, v3, v7}, Lr3/k;->u(Landroid/content/Context;Lw3/a;ZZ)Lcom/google/android/gms/internal/ads/Q9;

    move-result-object v5

    iget-object v6, p0, Lr3/k;->E:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v6, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-boolean v6, p0, Lr3/k;->H:Z

    if-eqz v6, :cond_3

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/Q9;->r()Z

    move-result v5

    if-nez v5, :cond_3

    iput v4, p0, Lr3/k;->Q:I

    invoke-direct {p0, v3}, Lr3/k;->s(Z)V
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v5

    :try_start_2
    iput v4, p0, Lr3/k;->Q:I

    invoke-direct {p0, v3}, Lr3/k;->s(Z)V

    iget-object v3, p0, Lr3/k;->J:Lcom/google/android/gms/internal/ads/Vc0;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v1

    const/16 v1, 0x7ef

    invoke-virtual {v3, v1, v6, v7, v5}, Lcom/google/android/gms/internal/ads/Vc0;->c(IJLjava/lang/Exception;)Ll4/l;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3
    :goto_1
    iget-object v1, p0, Lr3/k;->P:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    iput-object v0, p0, Lr3/k;->K:Landroid/content/Context;

    iput-object v0, p0, Lr3/k;->M:Lw3/a;

    return-void

    :goto_2
    iget-object v2, p0, Lr3/k;->P:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    iput-object v0, p0, Lr3/k;->K:Landroid/content/Context;

    iput-object v0, p0, Lr3/k;->M:Lw3/a;

    throw v1
.end method
