.class Lcom/android/billingclient/api/b;
.super Lcom/android/billingclient/api/a;
.source "SourceFile"


# instance fields
.field private A:Z

.field private B:Lcom/android/billingclient/api/e;

.field private C:Z

.field private D:Ljava/util/concurrent/ExecutorService;

.field private volatile E:Lcom/google/android/gms/internal/play_billing/y1;

.field private final F:Ljava/lang/Long;

.field private final a:Ljava/lang/Object;

.field private volatile b:I

.field private final c:Ljava/lang/String;

.field private final d:Landroid/os/Handler;

.field private volatile e:Lcom/android/billingclient/api/I;

.field private f:Landroid/content/Context;

.field private g:Lcom/android/billingclient/api/y;

.field private volatile h:Lcom/google/android/gms/internal/play_billing/d;

.field private volatile i:Lcom/android/billingclient/api/n;

.field private j:Z

.field private k:Z

.field private l:I

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Lcom/android/billingclient/api/y;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    invoke-direct {p0}, Lcom/android/billingclient/api/a;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lcom/android/billingclient/api/b;->b:I

    new-instance p3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-direct {p3, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p3, p0, Lcom/android/billingclient/api/b;->d:Landroid/os/Handler;

    iput p1, p0, Lcom/android/billingclient/api/b;->l:I

    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/b;->F:Ljava/lang/Long;

    invoke-static {}, Lcom/android/billingclient/api/b;->H()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/j4;->F()Lcom/google/android/gms/internal/play_billing/h4;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/play_billing/h4;->u(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/h4;

    iget-object p3, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/play_billing/h4;->t(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/h4;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    invoke-virtual {p2, p3, p4}, Lcom/google/android/gms/internal/play_billing/h4;->r(J)Lcom/google/android/gms/internal/play_billing/h4;

    iget-object p1, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/J2;->l()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/j4;

    new-instance p3, Lcom/android/billingclient/api/A;

    invoke-direct {p3, p1, p2}, Lcom/android/billingclient/api/A;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/j4;)V

    iput-object p3, p0, Lcom/android/billingclient/api/b;->g:Lcom/android/billingclient/api/y;

    iget-object p1, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/android/billingclient/api/e;Landroid/content/Context;LT2/e;LT2/k;Lcom/android/billingclient/api/y;Ljava/util/concurrent/ExecutorService;)V
    .locals 7

    invoke-static {}, Lcom/android/billingclient/api/b;->H()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0}, Lcom/android/billingclient/api/a;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lcom/android/billingclient/api/b;->b:I

    new-instance p5, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p6

    invoke-direct {p5, p6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p5, p0, Lcom/android/billingclient/api/b;->d:Landroid/os/Handler;

    iput p1, p0, Lcom/android/billingclient/api/b;->l:I

    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    move-result-wide p5

    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/b;->F:Ljava/lang/Long;

    iput-object v5, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p3

    move-object v2, p4

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Lcom/android/billingclient/api/b;->h(Landroid/content/Context;LT2/e;Lcom/android/billingclient/api/e;LT2/k;Ljava/lang/String;Lcom/android/billingclient/api/y;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/android/billingclient/api/e;Landroid/content/Context;LT2/u;Lcom/android/billingclient/api/y;Ljava/util/concurrent/ExecutorService;)V
    .locals 7

    invoke-direct {p0}, Lcom/android/billingclient/api/a;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lcom/android/billingclient/api/b;->b:I

    new-instance p4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    invoke-direct {p4, p5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p4, p0, Lcom/android/billingclient/api/b;->d:Landroid/os/Handler;

    iput p1, p0, Lcom/android/billingclient/api/b;->l:I

    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    move-result-wide p4

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/b;->F:Ljava/lang/Long;

    invoke-static {}, Lcom/android/billingclient/api/b;->H()Ljava/lang/String;

    move-result-object p4

    iput-object p4, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    iput-object p3, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/j4;->F()Lcom/google/android/gms/internal/play_billing/h4;

    move-result-object p3

    invoke-static {}, Lcom/android/billingclient/api/b;->H()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/play_billing/h4;->u(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/h4;

    iget-object p4, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {p4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/play_billing/h4;->t(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/h4;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p4

    invoke-virtual {p3, p4, p5}, Lcom/google/android/gms/internal/play_billing/h4;->r(J)Lcom/google/android/gms/internal/play_billing/h4;

    iget-object p1, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/play_billing/J2;->l()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/play_billing/j4;

    new-instance p4, Lcom/android/billingclient/api/A;

    invoke-direct {p4, p1, p3}, Lcom/android/billingclient/api/A;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/j4;)V

    iput-object p4, p0, Lcom/android/billingclient/api/b;->g:Lcom/android/billingclient/api/y;

    const-string p1, "BillingClient"

    const-string p3, "Billing client should have a valid listener but the provided is null."

    invoke-static {p1, p3}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/android/billingclient/api/I;

    iget-object v1, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/android/billingclient/api/b;->g:Lcom/android/billingclient/api/y;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Lcom/android/billingclient/api/I;-><init>(Landroid/content/Context;LT2/e;LT2/u;LT2/k;LT2/h;Lcom/android/billingclient/api/y;)V

    iput-object p1, p0, Lcom/android/billingclient/api/b;->e:Lcom/android/billingclient/api/I;

    iput-object p2, p0, Lcom/android/billingclient/api/b;->B:Lcom/android/billingclient/api/e;

    iget-object p1, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic A(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->o:Z

    return-void
.end method

.method static bridge synthetic B(Lcom/android/billingclient/api/b;Lcom/google/android/gms/internal/play_billing/d;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/b;->h:Lcom/google/android/gms/internal/play_billing/d;

    return-void
.end method

.method static bridge synthetic B0(Lcom/android/billingclient/api/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic C(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->k:Z

    return-void
.end method

.method static bridge synthetic D(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->j:Z

    return-void
.end method

.method static bridge synthetic E(Lcom/android/billingclient/api/b;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/billingclient/api/b;->M(I)V

    return-void
.end method

.method static bridge synthetic F(Lcom/android/billingclient/api/b;)I
    .locals 0

    iget p0, p0, Lcom/android/billingclient/api/b;->b:I

    return p0
.end method

.method private final G()Lcom/android/billingclient/api/d;
    .locals 5

    .prologue
    const/4 v0, 0x3

    const/4 v1, 0x0

    filled-new-array {v1, v0}, [I

    move-result-object v0

    iget-object v2, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v2

    :goto_0
    const/4 v3, 0x2

    if-ge v1, v3, :cond_1

    :try_start_0
    aget v3, v0, v1

    iget v4, p0, Lcom/android/billingclient/api/b;->b:I

    if-ne v4, v3, :cond_0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object v0, Lcom/android/billingclient/api/z;->k:Lcom/android/billingclient/api/d;

    :goto_1
    return-object v0

    :goto_2
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method private static H()Ljava/lang/String;
    .locals 2

    .prologue
    :try_start_0
    const-string v0, "com.android.billingclient.ktx.BuildConfig"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "VERSION_NAME"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, "7.1.1"

    return-object v0
.end method

.method private final declared-synchronized I()Ljava/util/concurrent/ExecutorService;
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->D:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    sget v0, Lcom/google/android/gms/internal/play_billing/c1;->a:I

    new-instance v1, Lcom/android/billingclient/api/j;

    invoke-direct {v1, p0}, Lcom/android/billingclient/api/j;-><init>(Lcom/android/billingclient/api/b;)V

    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/android/billingclient/api/b;->D:Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->D:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private final J(Lcom/google/android/gms/internal/play_billing/N3;)V
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->g:Lcom/android/billingclient/api/y;

    iget v1, p0, Lcom/android/billingclient/api/b;->l:I

    invoke-interface {v0, p1, v1}, Lcom/android/billingclient/api/y;->e(Lcom/google/android/gms/internal/play_billing/N3;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingClient"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private final K(Lcom/google/android/gms/internal/play_billing/S3;)V
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->g:Lcom/android/billingclient/api/y;

    iget v1, p0, Lcom/android/billingclient/api/b;->l:I

    invoke-interface {v0, p1, v1}, Lcom/android/billingclient/api/y;->f(Lcom/google/android/gms/internal/play_billing/S3;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingClient"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private final L(Ljava/lang/String;LT2/d;)V
    .locals 8

    .prologue
    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->i()Z

    move-result v0

    const/16 v1, 0x9

    if-nez v0, :cond_0

    sget-object p1, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    const/4 v0, 0x2

    :goto_0
    invoke-direct {p0, v0, v1, p1}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/e0;->E()Lcom/google/android/gms/internal/play_billing/e0;

    move-result-object v0

    invoke-interface {p2, p1, v0}, LT2/d;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void

    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "BillingClient"

    const-string v0, "Please provide a valid product type."

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/z;->h:Lcom/android/billingclient/api/d;

    const/16 v0, 0x32

    goto :goto_0

    :cond_1
    new-instance v2, Lcom/android/billingclient/api/k;

    invoke-direct {v2, p0, p1, p2}, Lcom/android/billingclient/api/k;-><init>(Lcom/android/billingclient/api/b;Ljava/lang/String;LT2/d;)V

    new-instance v5, Lcom/android/billingclient/api/h;

    invoke-direct {v5, p0, p2}, Lcom/android/billingclient/api/h;-><init>(Lcom/android/billingclient/api/b;LT2/d;)V

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->g0()Landroid/os/Handler;

    move-result-object v6

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->I()Ljava/util/concurrent/ExecutorService;

    move-result-object v7

    const-wide/16 v3, 0x7530

    invoke-static/range {v2 .. v7}, Lcom/android/billingclient/api/b;->k(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->G()Lcom/android/billingclient/api/d;

    move-result-object p1

    const/16 v0, 0x19

    goto :goto_0

    :cond_2
    return-void
.end method

.method private final M(I)V
    .locals 6

    .prologue
    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/android/billingclient/api/b;->b:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const-string v1, "BillingClient"

    iget v2, p0, Lcom/android/billingclient/api/b;->b:I

    invoke-static {v2}, Lcom/android/billingclient/api/b;->Q(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lcom/android/billingclient/api/b;->Q(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Setting clientState from "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/c1;->i(Ljava/lang/String;Ljava/lang/String;)V

    iput p1, p0, Lcom/android/billingclient/api/b;->b:I

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private final declared-synchronized N()V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->D:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/android/billingclient/api/b;->D:Ljava/util/concurrent/ExecutorService;

    iput-object v0, p0, Lcom/android/billingclient/api/b;->E:Lcom/google/android/gms/internal/play_billing/y1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private final O()V
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/android/billingclient/api/b;->i:Lcom/android/billingclient/api/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    :try_start_1
    iget-object v2, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    iget-object v3, p0, Lcom/android/billingclient/api/b;->i:Lcom/android/billingclient/api/n;

    invoke-virtual {v2, v3}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iput-object v1, p0, Lcom/android/billingclient/api/b;->h:Lcom/google/android/gms/internal/play_billing/d;

    :goto_0
    iput-object v1, p0, Lcom/android/billingclient/api/b;->i:Lcom/android/billingclient/api/n;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :catchall_1
    move-exception v2

    :try_start_3
    const-string v3, "BillingClient"

    const-string v4, "There was an exception while unbinding service!"

    invoke-static {v3, v4, v2}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    iput-object v1, p0, Lcom/android/billingclient/api/b;->h:Lcom/google/android/gms/internal/play_billing/d;

    goto :goto_0

    :catchall_2
    move-exception v2

    iput-object v1, p0, Lcom/android/billingclient/api/b;->h:Lcom/google/android/gms/internal/play_billing/d;

    iput-object v1, p0, Lcom/android/billingclient/api/b;->i:Lcom/android/billingclient/api/n;

    throw v2

    :cond_0
    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1
.end method

.method private final P()Z
    .locals 1

    .prologue
    iget-boolean v0, p0, Lcom/android/billingclient/api/b;->w:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/b;->B:Lcom/android/billingclient/api/e;

    invoke-virtual {v0}, Lcom/android/billingclient/api/e;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static final Q(I)Ljava/lang/String;
    .locals 1

    .prologue
    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const-string p0, "CLOSED"

    return-object p0

    :cond_0
    const-string p0, "CONNECTED"

    return-object p0

    :cond_1
    const-string p0, "CONNECTING"

    return-object p0

    :cond_2
    const-string p0, "DISCONNECTED"

    return-object p0
.end method

.method private final R(ILcom/android/billingclient/api/d;ILjava/lang/String;Ljava/lang/Exception;)LT2/w;
    .locals 1

    const/16 p1, 0x9

    invoke-static {p5}, Lcom/android/billingclient/api/x;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p3, p1, p2, v0}, Lcom/android/billingclient/api/b;->k0(IILcom/android/billingclient/api/d;Ljava/lang/String;)V

    const-string p1, "BillingClient"

    invoke-static {p1, p4, p5}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, LT2/w;

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, LT2/w;-><init>(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-object p1
.end method

.method private final S(Ljava/lang/String;I)LT2/w;
    .locals 16

    .prologue
    move-object/from16 v7, p0

    const-string v0, "Querying owned items, item type: "

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "BillingClient"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/c1;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v8, v7, Lcom/android/billingclient/api/b;->o:Z

    iget-boolean v9, v7, Lcom/android/billingclient/api/b;->w:Z

    iget-object v1, v7, Lcom/android/billingclient/api/b;->B:Lcom/android/billingclient/api/e;

    invoke-virtual {v1}, Lcom/android/billingclient/api/e;->a()Z

    move-result v10

    iget-object v1, v7, Lcom/android/billingclient/api/b;->B:Lcom/android/billingclient/api/e;

    invoke-virtual {v1}, Lcom/android/billingclient/api/e;->b()Z

    move-result v11

    iget-object v1, v7, Lcom/android/billingclient/api/b;->F:Ljava/lang/Long;

    iget-object v12, v7, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    invoke-static/range {v8 .. v14}, Lcom/google/android/gms/internal/play_billing/c1;->d(ZZZZLjava/lang/String;J)Landroid/os/Bundle;

    move-result-object v8

    const/4 v1, 0x0

    move-object v5, v1

    :cond_0
    :try_start_0
    iget-object v1, v7, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, v7, Lcom/android/billingclient/api/b;->h:Lcom/google/android/gms/internal/play_billing/d;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_1

    :try_start_2
    sget-object v3, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    const-string v5, "Service has been reset to null"

    const/4 v6, 0x0

    const/16 v2, 0x9

    const/16 v4, 0x77

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/android/billingclient/api/b;->R(ILcom/android/billingclient/api/d;ILjava/lang/String;Ljava/lang/Exception;)LT2/w;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    move-object v6, v0

    goto/16 :goto_4

    :catch_1
    move-exception v0

    move-object v6, v0

    goto/16 :goto_6

    :cond_1
    iget-boolean v1, v7, Lcom/android/billingclient/api/b;->o:Z

    const/16 v9, 0x9

    const/4 v10, 0x1

    if-eqz v1, :cond_3

    iget-boolean v1, v7, Lcom/android/billingclient/api/b;->w:Z

    if-eq v10, v1, :cond_2

    move v3, v9

    goto :goto_0

    :cond_2
    const/16 v1, 0x13

    move v3, v1

    :goto_0
    iget-object v1, v7, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    move-object v1, v2

    move v2, v3

    move-object v3, v4

    move-object/from16 v4, p1

    move-object v6, v8

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/d;->A5(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v1

    move-object/from16 v4, p1

    goto :goto_1

    :cond_3
    iget-object v1, v7, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x3

    move-object/from16 v4, p1

    invoke-interface {v2, v3, v1, v4, v5}, Lcom/google/android/gms/internal/play_billing/d;->D2(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_1
    const-string v2, "BillingClient"

    const-string v3, "getPurchase()"

    invoke-static {v1, v2, v3}, Lcom/android/billingclient/api/F;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Lcom/android/billingclient/api/E;

    move-result-object v2

    invoke-virtual {v2}, Lcom/android/billingclient/api/E;->a()Lcom/android/billingclient/api/d;

    move-result-object v3

    sget-object v5, Lcom/android/billingclient/api/z;->l:Lcom/android/billingclient/api/d;

    if-eq v3, v5, :cond_4

    invoke-virtual {v2}, Lcom/android/billingclient/api/E;->b()I

    move-result v4

    const-string v5, "Purchase bundle invalid"

    const/4 v6, 0x0

    :goto_2
    const/16 v2, 0x9

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/android/billingclient/api/b;->R(ILcom/android/billingclient/api/d;ILjava/lang/String;Ljava/lang/Exception;)LT2/w;

    move-result-object v0

    return-object v0

    :cond_4
    const-string v2, "INAPP_PURCHASE_ITEM_LIST"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    const-string v3, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    const-string v5, "INAPP_DATA_SIGNATURE_LIST"

    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    const/4 v6, 0x0

    move v11, v6

    :goto_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v6, v12, :cond_6

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    const-string v15, "Sku is owned: "

    const-string v10, "BillingClient"

    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v10, v14}, Lcom/google/android/gms/internal/play_billing/c1;->i(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_3
    new-instance v10, Lcom/android/billingclient/api/Purchase;

    invoke-direct {v10, v12, v13}, Lcom/android/billingclient/api/Purchase;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    invoke-virtual {v10}, Lcom/android/billingclient/api/Purchase;->d()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_5

    const-string v11, "BillingClient"

    const-string v12, "BUG: empty/null token!"

    invoke-static {v11, v12}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v11, 0x1

    :cond_5
    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    const/4 v10, 0x1

    goto :goto_3

    :catch_2
    move-exception v0

    move-object v6, v0

    const-string v5, "Got an exception trying to decode the purchase!"

    sget-object v3, Lcom/android/billingclient/api/z;->k:Lcom/android/billingclient/api/d;

    const/16 v4, 0x33

    goto :goto_2

    :cond_6
    if-eqz v11, :cond_7

    const/16 v2, 0x1a

    sget-object v3, Lcom/android/billingclient/api/z;->k:Lcom/android/billingclient/api/d;

    invoke-direct {v7, v2, v9, v3}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    :cond_7
    const-string v2, "INAPP_CONTINUATION_TOKEN"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Continuation token: "

    const-string v3, "BillingClient"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/play_billing/c1;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, LT2/w;

    sget-object v2, Lcom/android/billingclient/api/z;->l:Lcom/android/billingclient/api/d;

    invoke-direct {v1, v2, v0}, LT2/w;-><init>(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-object v1

    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catch Landroid/os/DeadObjectException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :goto_4
    const-string v5, "Got exception trying to get purchases try to reconnect"

    sget-object v3, Lcom/android/billingclient/api/z;->k:Lcom/android/billingclient/api/d;

    :goto_5
    const/16 v4, 0x34

    goto/16 :goto_2

    :goto_6
    const-string v5, "Got exception trying to get purchases try to reconnect"

    sget-object v3, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    goto :goto_5
.end method

.method private final T(Lcom/android/billingclient/api/d;ILjava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/G;
    .locals 1

    const-string v0, "BillingClient"

    invoke-static {v0, p3, p4}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/16 p3, 0x8

    invoke-static {p4}, Lcom/android/billingclient/api/x;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p4

    invoke-direct {p0, p2, p3, p1, p4}, Lcom/android/billingclient/api/b;->k0(IILcom/android/billingclient/api/d;Ljava/lang/String;)V

    new-instance p2, Lcom/android/billingclient/api/G;

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->b()I

    move-result p3

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->a()Ljava/lang/String;

    move-result-object p1

    const/4 p4, 0x0

    invoke-direct {p2, p3, p1, p4}, Lcom/android/billingclient/api/G;-><init>(ILjava/lang/String;Ljava/util/List;)V

    return-object p2
.end method

.method private final U(LT2/b;Lcom/android/billingclient/api/d;ILjava/lang/Exception;)V
    .locals 2

    const-string v0, "BillingClient"

    const-string v1, "Error in acknowledge purchase!"

    invoke-static {v0, v1, p4}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x3

    invoke-static {p4}, Lcom/android/billingclient/api/x;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p4

    invoke-direct {p0, p3, v0, p2, p4}, Lcom/android/billingclient/api/b;->k0(IILcom/android/billingclient/api/d;Ljava/lang/String;)V

    invoke-interface {p1, p2}, LT2/b;->a(Lcom/android/billingclient/api/d;)V

    return-void
.end method

.method static bridge synthetic V(Lcom/android/billingclient/api/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->O()V

    return-void
.end method

.method static bridge synthetic a0(Lcom/android/billingclient/api/b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/android/billingclient/api/b;->y:Z

    return p0
.end method

.method static bridge synthetic b0(Lcom/android/billingclient/api/b;)Z
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget p0, p0, Lcom/android/billingclient/api/b;->b:I

    const/4 v1, 0x1

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method static bridge synthetic c0(Lcom/android/billingclient/api/b;Ljava/lang/String;I)LT2/w;
    .locals 0

    const/16 p2, 0x9

    invoke-direct {p0, p1, p2}, Lcom/android/billingclient/api/b;->S(Ljava/lang/String;I)LT2/w;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic d0(Lcom/android/billingclient/api/b;IILcom/android/billingclient/api/d;)V
    .locals 0

    const/4 p2, 0x6

    invoke-direct {p0, p1, p2, p3}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    return-void
.end method

.method static bridge synthetic e0(Lcom/android/billingclient/api/b;IILcom/android/billingclient/api/d;Ljava/lang/String;)V
    .locals 0

    const/4 p2, 0x6

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/billingclient/api/b;->k0(IILcom/android/billingclient/api/d;Ljava/lang/String;)V

    return-void
.end method

.method static bridge synthetic f0(Lcom/android/billingclient/api/b;I)V
    .locals 0

    const/4 p1, 0x6

    invoke-direct {p0, p1}, Lcom/android/billingclient/api/b;->l0(I)V

    return-void
.end method

.method private final g0()Landroid/os/Handler;
    .locals 2

    .prologue
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/b;->d:Landroid/os/Handler;

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    :goto_0
    return-object v0
.end method

.method private h(Landroid/content/Context;LT2/e;Lcom/android/billingclient/api/e;LT2/k;Ljava/lang/String;Lcom/android/billingclient/api/y;)V
    .locals 7

    .prologue
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/j4;->F()Lcom/google/android/gms/internal/play_billing/h4;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/play_billing/h4;->u(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/h4;

    iget-object p5, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {p5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/play_billing/h4;->t(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/h4;

    iget-object p5, p0, Lcom/android/billingclient/api/b;->F:Ljava/lang/Long;

    invoke-virtual {p5}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/h4;->r(J)Lcom/google/android/gms/internal/play_billing/h4;

    if-eqz p6, :cond_0

    :goto_0
    iput-object p6, p0, Lcom/android/billingclient/api/b;->g:Lcom/android/billingclient/api/y;

    goto :goto_1

    :cond_0
    iget-object p5, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/J2;->l()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/j4;

    new-instance p6, Lcom/android/billingclient/api/A;

    invoke-direct {p6, p5, p1}, Lcom/android/billingclient/api/A;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/j4;)V

    goto :goto_0

    :goto_1
    if-nez p2, :cond_1

    const-string p1, "BillingClient"

    const-string p5, "Billing client should have a valid listener but the provided is null."

    invoke-static {p1, p5}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    new-instance p1, Lcom/android/billingclient/api/I;

    iget-object v1, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/android/billingclient/api/b;->g:Lcom/android/billingclient/api/y;

    const/4 v3, 0x0

    move-object v0, p1

    move-object v2, p2

    move-object v4, p4

    invoke-direct/range {v0 .. v6}, Lcom/android/billingclient/api/I;-><init>(Landroid/content/Context;LT2/e;LT2/u;LT2/k;LT2/h;Lcom/android/billingclient/api/y;)V

    iput-object p1, p0, Lcom/android/billingclient/api/b;->e:Lcom/android/billingclient/api/I;

    iput-object p3, p0, Lcom/android/billingclient/api/b;->B:Lcom/android/billingclient/api/e;

    if-eqz p4, :cond_2

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->C:Z

    iget-object p1, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    return-void
.end method

.method private final h0()Lcom/android/billingclient/api/d;
    .locals 3

    const-string v0, "BillingClient"

    const-string v1, "Service connection is valid. No need to re-initialize."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/c1;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/S3;->D()Lcom/google/android/gms/internal/play_billing/Q3;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/Q3;->r(I)Lcom/google/android/gms/internal/play_billing/Q3;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/N4;->C()Lcom/google/android/gms/internal/play_billing/L4;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/L4;->q(Z)Lcom/google/android/gms/internal/play_billing/L4;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/Q3;->q(Lcom/google/android/gms/internal/play_billing/L4;)Lcom/google/android/gms/internal/play_billing/Q3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/J2;->l()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/S3;

    invoke-direct {p0, v0}, Lcom/android/billingclient/api/b;->K(Lcom/google/android/gms/internal/play_billing/S3;)V

    sget-object v0, Lcom/android/billingclient/api/z;->l:Lcom/android/billingclient/api/d;

    return-object v0
.end method

.method static bridge synthetic i0(Lcom/android/billingclient/api/b;)I
    .locals 0

    iget p0, p0, Lcom/android/billingclient/api/b;->l:I

    return p0
.end method

.method static synthetic j(Lcom/android/billingclient/api/b;Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;
    .locals 6

    const-wide/16 v1, 0x7530

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->I()Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    move-object v0, p1

    move-object v3, p4

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lcom/android/billingclient/api/b;->k(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method private j0(IILcom/android/billingclient/api/d;)V
    .locals 0

    .prologue
    :try_start_0
    invoke-static {p1, p2, p3}, Lcom/android/billingclient/api/x;->b(IILcom/android/billingclient/api/d;)Lcom/google/android/gms/internal/play_billing/N3;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/billingclient/api/b;->J(Lcom/google/android/gms/internal/play_billing/N3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "BillingClient"

    const-string p3, "Unable to log."

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method static k(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;
    .locals 2

    .prologue
    :try_start_0
    invoke-interface {p5, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    long-to-double p1, p1

    new-instance p5, LT2/j;

    invoke-direct {p5, p0, p3}, LT2/j;-><init>(Ljava/util/concurrent/Future;Ljava/lang/Runnable;)V

    const-wide v0, 0x3fee666666666666L    # 0.95

    mul-double/2addr p1, v0

    double-to-long p1, p1

    invoke-virtual {p4, p5, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-object p0

    :catch_0
    move-exception p0

    const-string p1, "BillingClient"

    const-string p2, "Async task throws exception!"

    invoke-static {p1, p2, p0}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private final k0(IILcom/android/billingclient/api/d;Ljava/lang/String;)V
    .locals 0

    .prologue
    :try_start_0
    invoke-static {p1, p2, p3, p4}, Lcom/android/billingclient/api/x;->c(IILcom/android/billingclient/api/d;Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/N3;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/billingclient/api/b;->J(Lcom/google/android/gms/internal/play_billing/N3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "BillingClient"

    const-string p3, "Unable to log."

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method static bridge synthetic l(Lcom/android/billingclient/api/b;I)V
    .locals 0

    iput p1, p0, Lcom/android/billingclient/api/b;->l:I

    return-void
.end method

.method private l0(I)V
    .locals 2

    .prologue
    :try_start_0
    invoke-static {p1}, Lcom/android/billingclient/api/x;->d(I)Lcom/google/android/gms/internal/play_billing/S3;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/billingclient/api/b;->K(Lcom/google/android/gms/internal/play_billing/S3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingClient"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method static bridge synthetic m(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->p:Z

    return-void
.end method

.method static bridge synthetic m0(Lcom/android/billingclient/api/b;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    return-object p0
.end method

.method static bridge synthetic n(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->q:Z

    return-void
.end method

.method static bridge synthetic o(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->r:Z

    return-void
.end method

.method static bridge synthetic p(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->s:Z

    return-void
.end method

.method static bridge synthetic p0(Lcom/android/billingclient/api/b;)Landroid/os/Handler;
    .locals 0

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->g0()Landroid/os/Handler;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic q(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->t:Z

    return-void
.end method

.method static bridge synthetic q0(Lcom/android/billingclient/api/b;)Lcom/android/billingclient/api/I;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->e:Lcom/android/billingclient/api/I;

    return-object p0
.end method

.method static bridge synthetic r(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->u:Z

    return-void
.end method

.method static bridge synthetic r0(Lcom/android/billingclient/api/b;)Lcom/android/billingclient/api/y;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->g:Lcom/android/billingclient/api/y;

    return-object p0
.end method

.method static bridge synthetic s(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->v:Z

    return-void
.end method

.method static bridge synthetic t(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->w:Z

    return-void
.end method

.method static bridge synthetic t0(Lcom/android/billingclient/api/b;)Lcom/android/billingclient/api/d;
    .locals 0

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->G()Lcom/android/billingclient/api/d;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic u(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->x:Z

    return-void
.end method

.method static bridge synthetic v(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->y:Z

    return-void
.end method

.method static bridge synthetic w(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->z:Z

    return-void
.end method

.method static bridge synthetic w0(Lcom/android/billingclient/api/b;)Lcom/google/android/gms/internal/play_billing/d;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->h:Lcom/google/android/gms/internal/play_billing/d;

    return-object p0
.end method

.method static bridge synthetic x(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->A:Z

    return-void
.end method

.method static bridge synthetic y(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->m:Z

    return-void
.end method

.method static bridge synthetic y0(Lcom/android/billingclient/api/b;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->F:Ljava/lang/Long;

    return-object p0
.end method

.method static bridge synthetic z(Lcom/android/billingclient/api/b;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/b;->n:Z

    return-void
.end method

.method static bridge synthetic z0(Lcom/android/billingclient/api/b;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method final synthetic A0(LT2/b;LT2/a;)Ljava/lang/Object;
    .locals 8

    .prologue
    const/16 v0, 0x1c

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v3, p0, Lcom/android/billingclient/api/b;->h:Lcom/google/android/gms/internal/play_billing/d;

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v3, :cond_0

    :try_start_2
    sget-object p2, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    const/16 v2, 0x77

    invoke-direct {p0, p1, p2, v2, v1}, Lcom/android/billingclient/api/b;->U(LT2/b;Lcom/android/billingclient/api/d;ILjava/lang/Exception;)V

    return-object v1

    :catch_0
    move-exception p2

    goto :goto_0

    :catch_1
    move-exception p2

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, LT2/a;->a()Ljava/lang/String;

    move-result-object p2

    iget-object v4, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    iget-object v5, p0, Lcom/android/billingclient/api/b;->F:Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    invoke-static {v7, v4, v5, v6}, Lcom/google/android/gms/internal/play_billing/c1;->c(Landroid/os/Bundle;Ljava/lang/String;J)Landroid/os/Bundle;

    const/16 v4, 0x9

    invoke-interface {v3, v4, v2, p2, v7}, Lcom/google/android/gms/internal/play_billing/d;->a6(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p2
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const-string v0, "BillingClient"

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/play_billing/c1;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v0

    const-string v2, "BillingClient"

    invoke-static {p2, v2}, Lcom/google/android/gms/internal/play_billing/c1;->f(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/android/billingclient/api/z;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object p2

    invoke-interface {p1, p2}, LT2/b;->a(Lcom/android/billingclient/api/d;)V

    return-object v1

    :catchall_0
    move-exception p2

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p2
    :try_end_4
    .catch Landroid/os/DeadObjectException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :goto_0
    sget-object v2, Lcom/android/billingclient/api/z;->k:Lcom/android/billingclient/api/d;

    invoke-direct {p0, p1, v2, v0, p2}, Lcom/android/billingclient/api/b;->U(LT2/b;Lcom/android/billingclient/api/d;ILjava/lang/Exception;)V

    return-object v1

    :goto_1
    sget-object v2, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    invoke-direct {p0, p1, v2, v0, p2}, Lcom/android/billingclient/api/b;->U(LT2/b;Lcom/android/billingclient/api/d;ILjava/lang/Exception;)V

    return-object v1
.end method

.method final synthetic W(LT2/b;)V
    .locals 3

    sget-object v0, Lcom/android/billingclient/api/z;->n:Lcom/android/billingclient/api/d;

    const/16 v1, 0x18

    const/4 v2, 0x3

    invoke-direct {p0, v1, v2, v0}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    invoke-interface {p1, v0}, LT2/b;->a(Lcom/android/billingclient/api/d;)V

    return-void
.end method

.method final synthetic X(Lcom/android/billingclient/api/d;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/android/billingclient/api/b;->e:Lcom/android/billingclient/api/I;

    invoke-virtual {v0}, Lcom/android/billingclient/api/I;->d()LT2/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/b;->e:Lcom/android/billingclient/api/I;

    invoke-virtual {v0}, Lcom/android/billingclient/api/I;->d()LT2/e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, LT2/e;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void

    :cond_0
    const-string p1, "BillingClient"

    const-string v0, "No valid listener is set in BroadcastManager"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method final synthetic Y(LT2/d;)V
    .locals 3

    sget-object v0, Lcom/android/billingclient/api/z;->n:Lcom/android/billingclient/api/d;

    const/16 v1, 0x18

    const/16 v2, 0x9

    invoke-direct {p0, v1, v2, v0}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/e0;->E()Lcom/google/android/gms/internal/play_billing/e0;

    move-result-object v1

    invoke-interface {p1, v0, v1}, LT2/d;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void
.end method

.method final synthetic Z(LT2/g;)V
    .locals 3

    sget-object v0, Lcom/android/billingclient/api/z;->n:Lcom/android/billingclient/api/d;

    const/16 v1, 0x18

    const/16 v2, 0x8

    invoke-direct {p0, v1, v2, v0}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, LT2/g;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void
.end method

.method public a(LT2/a;LT2/b;)V
    .locals 8

    .prologue
    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->i()Z

    move-result v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    sget-object p1, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    const/4 v0, 0x2

    :goto_0
    invoke-direct {p0, v0, v1, p1}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    invoke-interface {p2, p1}, LT2/b;->a(Lcom/android/billingclient/api/d;)V

    return-void

    :cond_0
    invoke-virtual {p1}, LT2/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "BillingClient"

    const-string v0, "Please provide a valid purchase token."

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/z;->j:Lcom/android/billingclient/api/d;

    const/16 v0, 0x1a

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/android/billingclient/api/b;->o:Z

    if-nez v0, :cond_2

    sget-object p1, Lcom/android/billingclient/api/z;->b:Lcom/android/billingclient/api/d;

    const/16 v0, 0x1b

    goto :goto_0

    :cond_2
    new-instance v2, Lcom/android/billingclient/api/L;

    invoke-direct {v2, p0, p2, p1}, Lcom/android/billingclient/api/L;-><init>(Lcom/android/billingclient/api/b;LT2/b;LT2/a;)V

    new-instance v5, Lcom/android/billingclient/api/M;

    invoke-direct {v5, p0, p2}, Lcom/android/billingclient/api/M;-><init>(Lcom/android/billingclient/api/b;LT2/b;)V

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->g0()Landroid/os/Handler;

    move-result-object v6

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->I()Ljava/util/concurrent/ExecutorService;

    move-result-object v7

    const-wide/16 v3, 0x7530

    invoke-static/range {v2 .. v7}, Lcom/android/billingclient/api/b;->k(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->G()Lcom/android/billingclient/api/d;

    move-result-object p1

    const/16 v0, 0x19

    goto :goto_0

    :cond_3
    return-void
.end method

.method public b()V
    .locals 5

    .prologue
    const/16 v0, 0xc

    invoke-direct {p0, v0}, Lcom/android/billingclient/api/b;->l0(I)V

    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/android/billingclient/api/b;->e:Lcom/android/billingclient/api/I;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/android/billingclient/api/b;->e:Lcom/android/billingclient/api/I;

    invoke-virtual {v1}, Lcom/android/billingclient/api/I;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_1
    const-string v2, "BillingClient"

    const-string v3, "There was an exception while shutting down broadcast manager while ending connection!"

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :cond_0
    :goto_0
    :try_start_2
    const-string v1, "BillingClient"

    const-string v2, "Unbinding from service."

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/c1;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->O()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_3
    const-string v2, "BillingClient"

    const-string v3, "There was an exception while unbinding from the service while ending connection!"

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_1
    const/4 v1, 0x3

    :try_start_4
    invoke-direct {p0}, Lcom/android/billingclient/api/b;->N()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :goto_2
    :try_start_5
    invoke-direct {p0, v1}, Lcom/android/billingclient/api/b;->M(I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v1

    goto :goto_4

    :catchall_3
    move-exception v2

    :try_start_6
    const-string v3, "BillingClient"

    const-string v4, "There was an exception while shutting down the executor service while ending connection!"

    invoke-static {v3, v4, v2}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_2

    :goto_3
    :try_start_7
    monitor-exit v0

    return-void

    :catchall_4
    move-exception v2

    invoke-direct {p0, v1}, Lcom/android/billingclient/api/b;->M(I)V

    throw v2

    :goto_4
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw v1
.end method

.method public c(Landroid/app/Activity;Lcom/android/billingclient/api/c;)Lcom/android/billingclient/api/d;
    .locals 30

    .prologue
    move-object/from16 v8, p0

    move-object/from16 v0, p1

    const-string v9, "BUY_INTENT"

    const-string v1, "proxyPackageVersion"

    iget-object v2, v8, Lcom/android/billingclient/api/b;->e:Lcom/android/billingclient/api/I;

    const/4 v10, 0x2

    if-eqz v2, :cond_36

    iget-object v2, v8, Lcom/android/billingclient/api/b;->e:Lcom/android/billingclient/api/I;

    invoke-virtual {v2}, Lcom/android/billingclient/api/I;->d()LT2/e;

    move-result-object v2

    if-eqz v2, :cond_36

    invoke-virtual/range {p0 .. p0}, Lcom/android/billingclient/api/b;->i()Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v0, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    invoke-direct {v8, v10, v10, v0}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    invoke-virtual {v8, v0}, Lcom/android/billingclient/api/b;->u0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v0

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->h()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->i()Ljava/util/List;

    move-result-object v3

    const/4 v11, 0x0

    invoke-static {v2, v11}, Lcom/google/android/gms/internal/play_billing/n0;->a(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/android/billingclient/api/SkuDetails;

    invoke-static {v3, v11}, Lcom/google/android/gms/internal/play_billing/n0;->a(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Lcom/android/billingclient/api/SkuDetails;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lcom/android/billingclient/api/SkuDetails;->d()Ljava/lang/String;

    move-result-object v6

    const-string v7, "subs"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const/16 v12, 0x9

    const-string v13, "BillingClient"

    if-eqz v7, :cond_2

    iget-boolean v7, v8, Lcom/android/billingclient/api/b;->j:Z

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "Current client doesn\'t support subscriptions."

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/z;->o:Lcom/android/billingclient/api/d;

    invoke-direct {v8, v12, v10, v0}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    invoke-virtual {v8, v0}, Lcom/android/billingclient/api/b;->u0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v0

    :cond_2
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->r()Z

    move-result v7

    if-eqz v7, :cond_4

    iget-boolean v7, v8, Lcom/android/billingclient/api/b;->m:Z

    if-eqz v7, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "Current client doesn\'t support extra params for buy intent."

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/z;->i:Lcom/android/billingclient/api/d;

    const/16 v1, 0x12

    invoke-direct {v8, v1, v10, v0}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    invoke-virtual {v8, v0}, Lcom/android/billingclient/api/b;->u0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v0

    :cond_4
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v14, 0x1

    if-le v7, v14, :cond_6

    iget-boolean v7, v8, Lcom/android/billingclient/api/b;->t:Z

    if-eqz v7, :cond_5

    goto :goto_2

    :cond_5
    const-string v0, "Current client doesn\'t support multi-item purchases."

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/z;->t:Lcom/android/billingclient/api/d;

    const/16 v1, 0x13

    invoke-direct {v8, v1, v10, v0}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    invoke-virtual {v8, v0}, Lcom/android/billingclient/api/b;->u0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v0

    :cond_6
    :goto_2
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_8

    iget-boolean v7, v8, Lcom/android/billingclient/api/b;->u:Z

    if-eqz v7, :cond_7

    goto :goto_3

    :cond_7
    const-string v0, "Current client doesn\'t support purchases with ProductDetails."

    invoke-static {v13, v0}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/z;->v:Lcom/android/billingclient/api/d;

    const/16 v1, 0x14

    invoke-direct {v8, v1, v10, v0}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    invoke-virtual {v8, v0}, Lcom/android/billingclient/api/b;->u0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v0

    :cond_8
    :goto_3
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->c()Lcom/android/billingclient/api/d;

    move-result-object v7

    sget-object v15, Lcom/android/billingclient/api/z;->l:Lcom/android/billingclient/api/d;

    if-eq v7, v15, :cond_9

    const/16 v0, 0x78

    invoke-direct {v8, v0, v10, v7}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    invoke-virtual {v8, v7}, Lcom/android/billingclient/api/b;->u0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v7

    :cond_9
    iget-boolean v7, v8, Lcom/android/billingclient/api/b;->m:Z

    if-eqz v7, :cond_2e

    iget-boolean v7, v8, Lcom/android/billingclient/api/b;->o:Z

    iget-boolean v15, v8, Lcom/android/billingclient/api/b;->w:Z

    iget-object v12, v8, Lcom/android/billingclient/api/b;->B:Lcom/android/billingclient/api/e;

    invoke-virtual {v12}, Lcom/android/billingclient/api/e;->a()Z

    move-result v12

    iget-object v10, v8, Lcom/android/billingclient/api/b;->B:Lcom/android/billingclient/api/e;

    invoke-virtual {v10}, Lcom/android/billingclient/api/e;->b()Z

    move-result v10

    iget-boolean v11, v8, Lcom/android/billingclient/api/b;->C:Z

    iget-object v14, v8, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    move-object/from16 v17, v9

    iget-object v9, v8, Lcom/android/billingclient/api/b;->F:Ljava/lang/Long;

    move-object/from16 v18, v5

    move-object/from16 v19, v6

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v9, v8, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-static {v0, v14, v5, v6}, Lcom/google/android/gms/internal/play_billing/c1;->c(Landroid/os/Bundle;Ljava/lang/String;J)Landroid/os/Bundle;

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->b()I

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->b()I

    move-result v5

    const-string v6, "prorationMode"

    invoke-virtual {v0, v6, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_a
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->d()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_b

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->d()Ljava/lang/String;

    move-result-object v5

    const-string v6, "accountId"

    invoke-virtual {v0, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_b
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->e()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_c

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->e()Ljava/lang/String;

    move-result-object v5

    const-string v6, "obfuscatedProfileId"

    invoke-virtual {v0, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->q()Z

    move-result v5

    if-eqz v5, :cond_d

    const-string v5, "isOfferPersonalizedByDeveloper"

    const/4 v6, 0x1

    invoke-virtual {v0, v5, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_d
    const/4 v5, 0x0

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_e

    new-instance v6, Ljava/util/ArrayList;

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v5, "skusToReplace"

    invoke-virtual {v0, v5, v6}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_e
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->f()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_f

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->f()Ljava/lang/String;

    move-result-object v5

    const-string v6, "oldSkuPurchaseToken"

    invoke-virtual {v0, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_f
    const/4 v5, 0x0

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_10

    const-string v6, "oldSkuPurchaseId"

    invoke-virtual {v0, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_10
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->g()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_11

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->g()Ljava/lang/String;

    move-result-object v6

    const-string v14, "originalExternalTransactionId"

    invoke-virtual {v0, v14, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_11
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_12

    const-string v6, "paymentsPurchaseParams"

    invoke-virtual {v0, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_12
    if-eqz v7, :cond_13

    if-eqz v12, :cond_13

    const-string v5, "enablePendingPurchases"

    const/4 v6, 0x1

    invoke-virtual {v0, v5, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_4

    :cond_13
    const/4 v6, 0x1

    :goto_4
    if-eqz v15, :cond_14

    if-eqz v10, :cond_14

    const-string v5, "enablePendingPurchaseForSubscriptions"

    invoke-virtual {v0, v5, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_14
    if-eqz v11, :cond_15

    const-string v5, "enableAlternativeBilling"

    invoke-virtual {v0, v5, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_15
    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->i()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lj$/util/Collection$-EL;->stream(Ljava/util/Collection;)Lj$/util/stream/Stream;

    move-result-object v5

    new-instance v6, Lcom/google/android/gms/internal/play_billing/a;

    invoke-direct {v6}, Lcom/google/android/gms/internal/play_billing/a;-><init>()V

    invoke-interface {v5, v6}, Lj$/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/R1;->A()Lcom/google/android/gms/internal/play_billing/Q1;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Lcom/android/billingclient/api/c;->i()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lj$/util/Collection$-EL;->stream(Ljava/util/Collection;)Lj$/util/stream/Stream;

    move-result-object v6

    new-instance v7, Lcom/google/android/gms/internal/play_billing/o;

    invoke-direct {v7}, Lcom/google/android/gms/internal/play_billing/o;-><init>()V

    invoke-interface {v6, v7}, Lj$/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Lj$/util/stream/Stream;

    move-result-object v6

    new-instance v7, Lcom/google/android/gms/internal/play_billing/P;

    invoke-direct {v7, v9}, Lcom/google/android/gms/internal/play_billing/P;-><init>(Ljava/lang/String;)V

    invoke-interface {v6, v7}, Lj$/util/stream/Stream;->map(Ljava/util/function/Function;)Lj$/util/stream/Stream;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/e0;->O()Lj$/util/stream/Collector;

    move-result-object v7

    invoke-interface {v6, v7}, Lj$/util/stream/Stream;->collect(Lj$/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/play_billing/Q1;->q(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/play_billing/Q1;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/play_billing/J2;->l()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/play_billing/R1;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/play_billing/Z1;->d()[B

    move-result-object v5

    const-string v6, "subscriptionProductReplacementParamsList"

    invoke-virtual {v0, v6, v5}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    :cond_16
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    const-string v6, "additionalSkuTypes"

    const-string v7, "additionalSkus"

    const-string v9, "SKU_SERIALIZED_DOCID_LIST"

    const-string v10, "skuDetailsTokens"

    const-string v11, "SKU_OFFER_ID_TOKEN_LIST"

    if-nez v5, :cond_20

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v20, v1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v21

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    :goto_5
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v26

    if-eqz v26, :cond_19

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v26

    check-cast v26, Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->j()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v27 .. v27}, Ljava/lang/String;->isEmpty()Z

    move-result v27

    if-nez v27, :cond_17

    move-object/from16 v27, v13

    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->j()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_17
    move-object/from16 v27, v13

    :goto_6
    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->g()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v28, v4

    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->e()I

    move-result v29

    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->i()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    const/16 v16, 0x1

    xor-int/lit8 v13, v13, 0x1

    or-int v22, v22, v13

    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    or-int v23, v23, v4

    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v29, :cond_18

    move/from16 v4, v16

    goto :goto_7

    :cond_18
    const/4 v4, 0x0

    :goto_7
    or-int v24, v24, v4

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    or-int v25, v25, v4

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v8, p0

    move-object/from16 v13, v27

    move-object/from16 v4, v28

    goto :goto_5

    :cond_19
    move-object/from16 v28, v4

    move-object/from16 v27, v13

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1a

    invoke-virtual {v0, v10, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_1a
    if-eqz v22, :cond_1b

    invoke-virtual {v0, v11, v14}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_1b
    if-eqz v23, :cond_1c

    const-string v4, "SKU_OFFER_ID_LIST"

    invoke-virtual {v0, v4, v15}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_1c
    if-eqz v24, :cond_1d

    const-string v4, "SKU_OFFER_TYPE_LIST"

    invoke-virtual {v0, v4, v12}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_1d
    if-eqz v25, :cond_1e

    invoke-virtual {v0, v9, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_1e
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v4, 0x1

    if-le v1, v4, :cond_23

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x1

    :goto_8
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8

    if-ge v5, v8, :cond_1f

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {v8}, Lcom/android/billingclient/api/SkuDetails;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {v8}, Lcom/android/billingclient/api/SkuDetails;->d()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_1f
    invoke-virtual {v0, v7, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v6, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_9

    :cond_20
    move-object/from16 v20, v1

    move-object/from16 v28, v4

    move-object/from16 v27, v13

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v13

    if-gtz v13, :cond_2d

    invoke-virtual {v0, v11, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v5, "AUTO_PAY_BALANCE_THRESHOLD_LIST"

    invoke-virtual {v0, v5, v12}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_21

    invoke-virtual {v0, v10, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_21
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_22

    invoke-virtual {v0, v9, v8}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_22
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_23

    invoke-virtual {v0, v7, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v6, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_23
    :goto_9
    invoke-virtual {v0, v11}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    move-object/from16 v8, p0

    if-eqz v1, :cond_25

    iget-boolean v1, v8, Lcom/android/billingclient/api/b;->r:Z

    if-eqz v1, :cond_24

    goto :goto_a

    :cond_24
    sget-object v0, Lcom/android/billingclient/api/z;->u:Lcom/android/billingclient/api/d;

    const/16 v1, 0x15

    const/4 v2, 0x2

    invoke-direct {v8, v1, v2, v0}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    invoke-virtual {v8, v0}, Lcom/android/billingclient/api/b;->u0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v0

    :cond_25
    :goto_a
    if-eqz v28, :cond_26

    invoke-virtual/range {v28 .. v28}, Lcom/android/billingclient/api/SkuDetails;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_26

    invoke-virtual/range {v28 .. v28}, Lcom/android/billingclient/api/SkuDetails;->h()Ljava/lang/String;

    move-result-object v1

    const-string v2, "skuPackageName"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v6, 0x1

    goto :goto_b

    :cond_26
    const/4 v1, 0x0

    const/4 v6, 0x0

    :goto_b
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_27

    const-string v2, "accountName"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_27
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    if-nez v1, :cond_28

    const-string v1, "Activity\'s intent is null."

    move-object/from16 v9, v27

    invoke-static {v9, v1}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_c

    :cond_28
    move-object/from16 v9, v27

    const-string v2, "PROXY_PACKAGE"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_29

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "proxyPackage"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v2, v8, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v2, v1, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v2, v20

    :try_start_1
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_c

    :catch_0
    move-object/from16 v2, v20

    :catch_1
    const-string v1, "package not found"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_29
    :goto_c
    iget-boolean v1, v8, Lcom/android/billingclient/api/b;->u:Z

    if-eqz v1, :cond_2a

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2a

    const/16 v1, 0x11

    :goto_d
    move v3, v1

    goto :goto_e

    :cond_2a
    iget-boolean v1, v8, Lcom/android/billingclient/api/b;->s:Z

    if-eqz v1, :cond_2b

    if-eqz v6, :cond_2b

    const/16 v1, 0xf

    goto :goto_d

    :cond_2b
    iget-boolean v1, v8, Lcom/android/billingclient/api/b;->o:Z

    if-eqz v1, :cond_2c

    const/16 v3, 0x9

    goto :goto_e

    :cond_2c
    const/4 v1, 0x6

    goto :goto_d

    :goto_e
    new-instance v10, Lcom/android/billingclient/api/i;

    move-object v1, v10

    move-object/from16 v2, p0

    move-object/from16 v4, v18

    move-object/from16 v5, v19

    move-object/from16 v6, p2

    move-object v7, v0

    invoke-direct/range {v1 .. v7}, Lcom/android/billingclient/api/i;-><init>(Lcom/android/billingclient/api/b;ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/c;Landroid/os/Bundle;)V

    iget-object v14, v8, Lcom/android/billingclient/api/b;->d:Landroid/os/Handler;

    invoke-direct/range {p0 .. p0}, Lcom/android/billingclient/api/b;->I()Ljava/util/concurrent/ExecutorService;

    move-result-object v15

    const-wide/16 v11, 0x1388

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/android/billingclient/api/b;->k(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    move-result-object v0

    const/4 v1, 0x0

    goto :goto_f

    :cond_2d
    move-object/from16 v8, p0

    const/4 v0, 0x0

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 v1, 0x0

    throw v1

    :cond_2e
    move-object/from16 v18, v5

    move-object/from16 v19, v6

    move-object/from16 v17, v9

    move-object v1, v11

    move-object v9, v13

    new-instance v2, Lcom/android/billingclient/api/K;

    move-object/from16 v0, v18

    move-object/from16 v3, v19

    invoke-direct {v2, v8, v0, v3}, Lcom/android/billingclient/api/K;-><init>(Lcom/android/billingclient/api/b;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v6, v8, Lcom/android/billingclient/api/b;->d:Landroid/os/Handler;

    invoke-direct/range {p0 .. p0}, Lcom/android/billingclient/api/b;->I()Ljava/util/concurrent/ExecutorService;

    move-result-object v7

    const-wide/16 v3, 0x1388

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/android/billingclient/api/b;->k(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    move-result-object v0

    :goto_f
    if-nez v0, :cond_2f

    :try_start_2
    sget-object v0, Lcom/android/billingclient/api/z;->d:Lcom/android/billingclient/api/d;

    const/16 v1, 0x19

    const/4 v2, 0x2

    invoke-direct {v8, v1, v2, v0}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    invoke-virtual {v8, v0}, Lcom/android/billingclient/api/b;->u0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v0

    :catch_2
    move-exception v0

    goto/16 :goto_16

    :catch_3
    move-exception v0

    goto/16 :goto_18

    :catch_4
    move-exception v0

    goto/16 :goto_18

    :cond_2f
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1388

    invoke-interface {v0, v3, v4, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/Bundle;

    invoke-static {v2, v9}, Lcom/google/android/gms/internal/play_billing/c1;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v0

    invoke-static {v2, v9}, Lcom/google/android/gms/internal/play_billing/c1;->f(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v0, :cond_35

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unable to buy item, Error response code: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v9, v4}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v3}, Lcom/android/billingclient/api/z;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v3
    :try_end_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-nez v2, :cond_30

    :goto_10
    const/4 v4, 0x1

    const/4 v6, 0x1

    goto :goto_12

    :cond_30
    :try_start_3
    const-string v0, "LOG_REASON"

    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_31

    goto :goto_10

    :cond_31
    instance-of v4, v0, Ljava/lang/Integer;

    if-eqz v4, :cond_32

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/V3;->a(I)I

    move-result v6

    const/4 v4, 0x1

    goto :goto_12

    :catchall_0
    move-exception v0

    goto :goto_11

    :cond_32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unexpected type for bundle log reason: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_10

    :goto_11
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v4, "Failed to get log reason from bundle: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_10

    :goto_12
    if-ne v6, v4, :cond_33

    const/16 v6, 0x17

    :cond_33
    if-nez v2, :cond_34

    :goto_13
    move-object v11, v1

    :goto_14
    const/4 v1, 0x2

    goto :goto_15

    :cond_34
    :try_start_5
    const-string v0, "ADDITIONAL_LOG_DETAILS"

    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_14

    :catchall_1
    move-exception v0

    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Failed to get additional log details from bundle: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_13

    :goto_15
    invoke-direct {v8, v6, v1, v3, v11}, Lcom/android/billingclient/api/b;->k0(IILcom/android/billingclient/api/d;Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Lcom/android/billingclient/api/b;->u0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v3

    :cond_35
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/android/billingclient/api/ProxyBillingActivity;

    move-object/from16 v3, p1

    invoke-direct {v0, v3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object/from16 v1, v17

    invoke-virtual {v2, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/app/PendingIntent;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {v3, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_6
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    sget-object v0, Lcom/android/billingclient/api/z;->l:Lcom/android/billingclient/api/d;

    return-object v0

    :goto_16
    const-string v1, "Exception while launching billing flow. Try to reconnect"

    invoke-static {v9, v1, v0}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v1, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    invoke-static {v0}, Lcom/android/billingclient/api/x;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x5

    :goto_17
    const/4 v3, 0x2

    invoke-direct {v8, v2, v3, v1, v0}, Lcom/android/billingclient/api/b;->k0(IILcom/android/billingclient/api/d;Ljava/lang/String;)V

    invoke-virtual {v8, v1}, Lcom/android/billingclient/api/b;->u0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;

    return-object v1

    :goto_18
    const-string v1, "Time out while launching billing flow. Try to reconnect"

    invoke-static {v9, v1, v0}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v1, Lcom/android/billingclient/api/z;->n:Lcom/android/billingclient/api/d;

    invoke-static {v0}, Lcom/android/billingclient/api/x;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x4

    goto :goto_17

    :cond_36
    move v3, v10

    sget-object v0, Lcom/android/billingclient/api/z;->F:Lcom/android/billingclient/api/d;

    const/16 v1, 0xc

    invoke-direct {v8, v1, v3, v0}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    return-object v0
.end method

.method public final e(LT2/f;LT2/d;)V
    .locals 0

    invoke-virtual {p1}, LT2/f;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/android/billingclient/api/b;->L(Ljava/lang/String;LT2/d;)V

    return-void
.end method

.method public f(Lcom/android/billingclient/api/f;LT2/g;)V
    .locals 9

    .prologue
    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->i()Z

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-nez v0, :cond_0

    sget-object p1, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    const/4 v0, 0x2

    :goto_0
    invoke-direct {p0, v0, v2, p1}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    invoke-interface {p2, p1, v1}, LT2/g;->a(Lcom/android/billingclient/api/d;Ljava/util/List;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/f;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/android/billingclient/api/f;->b()Ljava/util/List;

    move-result-object v6

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const-string v0, "BillingClient"

    if-eqz p1, :cond_1

    const-string p1, "Please fix the input params. SKU type can\'t be empty."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/z;->g:Lcom/android/billingclient/api/d;

    const/16 v0, 0x31

    goto :goto_0

    :cond_1
    if-nez v6, :cond_2

    const-string p1, "Please fix the input params. The list of SKUs can\'t be empty."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/z;->f:Lcom/android/billingclient/api/d;

    const/16 v0, 0x30

    goto :goto_0

    :cond_2
    new-instance p1, Lcom/android/billingclient/api/N;

    const/4 v7, 0x0

    move-object v3, p1

    move-object v4, p0

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, Lcom/android/billingclient/api/N;-><init>(Lcom/android/billingclient/api/b;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;LT2/g;)V

    new-instance v6, Lcom/android/billingclient/api/g;

    invoke-direct {v6, p0, p2}, Lcom/android/billingclient/api/g;-><init>(Lcom/android/billingclient/api/b;LT2/g;)V

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->g0()Landroid/os/Handler;

    move-result-object v7

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->I()Ljava/util/concurrent/ExecutorService;

    move-result-object v8

    const-wide/16 v4, 0x7530

    invoke-static/range {v3 .. v8}, Lcom/android/billingclient/api/b;->k(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->G()Lcom/android/billingclient/api/d;

    move-result-object p1

    const/16 v0, 0x19

    goto :goto_0

    :cond_3
    return-void
.end method

.method public g(LT2/c;)V
    .locals 9

    .prologue
    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lcom/android/billingclient/api/b;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->h0()Lcom/android/billingclient/api/d;

    move-result-object v1

    :goto_0
    monitor-exit v0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    iget v1, p0, Lcom/android/billingclient/api/b;->b:I

    const/4 v2, 0x6

    const/4 v3, 0x1

    if-ne v1, v3, :cond_1

    const-string v1, "BillingClient"

    const-string v3, "Client is already in the process of connecting to billing service."

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/android/billingclient/api/z;->e:Lcom/android/billingclient/api/d;

    const/16 v3, 0x25

    invoke-direct {p0, v3, v2, v1}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    goto :goto_0

    :cond_1
    iget v1, p0, Lcom/android/billingclient/api/b;->b:I

    const/4 v4, 0x3

    if-ne v1, v4, :cond_2

    const-string v1, "BillingClient"

    const-string v3, "Client was already closed and can\'t be reused. Please create another instance."

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    const/16 v3, 0x26

    invoke-direct {p0, v3, v2, v1}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    goto :goto_0

    :cond_2
    invoke-direct {p0, v3}, Lcom/android/billingclient/api/b;->M(I)V

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->O()V

    const-string v1, "BillingClient"

    const-string v4, "Starting in-app billing setup."

    invoke-static {v1, v4}, Lcom/google/android/gms/internal/play_billing/c1;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/android/billingclient/api/n;

    const/4 v4, 0x0

    invoke-direct {v1, p0, p1, v4}, Lcom/android/billingclient/api/n;-><init>(Lcom/android/billingclient/api/b;LT2/c;LT2/l;)V

    iput-object v1, p0, Lcom/android/billingclient/api/b;->i:Lcom/android/billingclient/api/n;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v5, 0x0

    invoke-virtual {v1, v0, v5}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    const/16 v6, 0x29

    if-eqz v1, :cond_7

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_7

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ResolveInfo;

    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    const/16 v6, 0x28

    if-eqz v1, :cond_6

    iget-object v7, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    const-string v8, "com.android.vending"

    invoke-static {v7, v8}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    if-eqz v1, :cond_6

    new-instance v6, Landroid/content/ComponentName;

    invoke-direct {v6, v7, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    invoke-virtual {v1, v6}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    const-string v6, "playBillingLibraryVersion"

    invoke-virtual {v1, v6, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget v6, p0, Lcom/android/billingclient/api/b;->b:I

    const/4 v7, 0x2

    if-ne v6, v7, :cond_3

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->h0()Lcom/android/billingclient/api/d;

    move-result-object v1

    :goto_1
    monitor-exit v0

    goto :goto_4

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_3
    iget v6, p0, Lcom/android/billingclient/api/b;->b:I

    if-eq v6, v3, :cond_4

    const-string v1, "BillingClient"

    const-string v3, "Client state no longer CONNECTING, returning service disconnected."

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    const/16 v3, 0x75

    invoke-direct {p0, v3, v2, v1}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    goto :goto_1

    :cond_4
    iget-object v6, p0, Lcom/android/billingclient/api/b;->i:Lcom/android/billingclient/api/n;

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object v0, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {v0, v1, v6, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "BillingClient"

    const-string v1, "Service was bonded successfully."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/c1;->i(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v4

    goto :goto_4

    :cond_5
    const-string v0, "BillingClient"

    const-string v1, "Connection to Billing service is blocked."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v6, 0x27

    goto :goto_3

    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_6
    const-string v0, "BillingClient"

    const-string v1, "The device doesn\'t have valid Play Store."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    :goto_3
    invoke-direct {p0, v5}, Lcom/android/billingclient/api/b;->M(I)V

    const-string v0, "BillingClient"

    const-string v1, "Billing service unavailable on device."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/c1;->i(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/android/billingclient/api/z;->c:Lcom/android/billingclient/api/d;

    invoke-direct {p0, v6, v2, v1}, Lcom/android/billingclient/api/b;->j0(IILcom/android/billingclient/api/d;)V

    :goto_4
    if-eqz v1, :cond_8

    invoke-interface {p1, v1}, LT2/c;->b(Lcom/android/billingclient/api/d;)V

    :cond_8
    return-void

    :goto_5
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final i()Z
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/android/billingclient/api/b;->b:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/android/billingclient/api/b;->h:Lcom/google/android/gms/internal/play_billing/d;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/android/billingclient/api/b;->i:Lcom/android/billingclient/api/n;

    if-eqz v1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return v3

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method final synthetic n0(ILjava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/c;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 8

    .prologue
    const/4 p4, 0x5

    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, p0, Lcom/android/billingclient/api/b;->h:Lcom/google/android/gms/internal/play_billing/d;

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_0

    :try_start_2
    sget-object p1, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    const/16 p2, 0x77

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/c1;->l(Lcom/android/billingclient/api/d;I)Landroid/os/Bundle;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    move v2, p1

    move-object v4, p2

    move-object v5, p3

    move-object v7, p5

    invoke-interface/range {v1 .. v7}, Lcom/google/android/gms/internal/play_billing/d;->o4(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catch Landroid/os/DeadObjectException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :goto_0
    sget-object p2, Lcom/android/billingclient/api/z;->k:Lcom/android/billingclient/api/d;

    :goto_1
    invoke-static {p1}, Lcom/android/billingclient/api/x;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p4, p1}, Lcom/google/android/gms/internal/play_billing/c1;->m(Lcom/android/billingclient/api/d;ILjava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1

    :goto_2
    sget-object p2, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    goto :goto_1
.end method

.method final synthetic o0(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 8

    .prologue
    const/4 v0, 0x5

    :try_start_0
    iget-object v1, p0, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, p0, Lcom/android/billingclient/api/b;->h:Lcom/google/android/gms/internal/play_billing/d;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_0

    :try_start_2
    sget-object p1, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    const/16 p2, 0x77

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/c1;->l(Lcom/android/billingclient/api/d;I)Landroid/os/Bundle;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_0
    iget-object v1, p0, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    const/4 v3, 0x3

    move-object v5, p1

    move-object v6, p2

    invoke-interface/range {v2 .. v7}, Lcom/google/android/gms/internal/play_billing/d;->Q2(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catch Landroid/os/DeadObjectException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :goto_0
    sget-object p2, Lcom/android/billingclient/api/z;->k:Lcom/android/billingclient/api/d;

    :goto_1
    invoke-static {p1}, Lcom/android/billingclient/api/x;->a(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/play_billing/c1;->m(Lcom/android/billingclient/api/d;ILjava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1

    :goto_2
    sget-object p2, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    goto :goto_1
.end method

.method final s0()Lcom/android/billingclient/api/y;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/b;->g:Lcom/android/billingclient/api/y;

    return-object v0
.end method

.method final u0(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/d;
    .locals 2

    .prologue
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->d:Landroid/os/Handler;

    new-instance v1, Lcom/android/billingclient/api/J;

    invoke-direct {v1, p0, p1}, Lcom/android/billingclient/api/J;-><init>(Lcom/android/billingclient/api/b;Lcom/android/billingclient/api/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object p1
.end method

.method final v0(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/android/billingclient/api/G;
    .locals 16

    .prologue
    move-object/from16 v1, p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_b

    add-int/lit8 v5, v4, 0x14

    if-le v5, v2, :cond_0

    move v6, v2

    goto :goto_1

    :cond_0
    move v6, v5

    :goto_1
    new-instance v7, Ljava/util/ArrayList;

    move-object/from16 v8, p2

    invoke-interface {v8, v4, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v13, Landroid/os/Bundle;

    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    const-string v4, "ITEM_ID_LIST"

    invoke-virtual {v13, v4, v7}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    iget-object v4, v1, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    const-string v6, "playBillingLibraryVersion"

    invoke-virtual {v13, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v6, v1, Lcom/android/billingclient/api/b;->a:Ljava/lang/Object;

    monitor-enter v6
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v9, v1, Lcom/android/billingclient/api/b;->h:Lcom/google/android/gms/internal/play_billing/d;

    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v6, 0x0

    if-nez v9, :cond_1

    :try_start_2
    sget-object v0, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    const-string v2, "Service has been reset to null."

    const/16 v3, 0x77

    invoke-direct {v1, v0, v3, v2, v6}, Lcom/android/billingclient/api/b;->T(Lcom/android/billingclient/api/d;ILjava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/G;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    goto/16 :goto_4

    :catch_1
    move-exception v0

    const/16 v4, 0x2b

    goto/16 :goto_5

    :cond_1
    iget-boolean v7, v1, Lcom/android/billingclient/api/b;->p:Z

    if-eqz v7, :cond_5

    iget-object v7, v1, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v11

    iget v7, v1, Lcom/android/billingclient/api/b;->l:I

    iget-object v10, v1, Lcom/android/billingclient/api/b;->B:Lcom/android/billingclient/api/e;

    invoke-virtual {v10}, Lcom/android/billingclient/api/e;->a()Z

    move-result v10

    invoke-direct/range {p0 .. p0}, Lcom/android/billingclient/api/b;->P()Z

    move-result v12

    iget-object v14, v1, Lcom/android/billingclient/api/b;->c:Ljava/lang/String;

    iget-object v15, v1, Lcom/android/billingclient/api/b;->F:Ljava/lang/Long;

    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    new-instance v15, Landroid/os/Bundle;

    invoke-direct {v15}, Landroid/os/Bundle;-><init>()V

    const/16 v6, 0x9

    if-lt v7, v6, :cond_2

    invoke-static {v15, v14, v3, v4}, Lcom/google/android/gms/internal/play_billing/c1;->c(Landroid/os/Bundle;Ljava/lang/String;J)Landroid/os/Bundle;

    :cond_2
    const/4 v3, 0x1

    if-lt v7, v6, :cond_3

    if-eqz v10, :cond_3

    const-string v4, "enablePendingPurchases"

    invoke-virtual {v15, v4, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_3
    if-eqz v12, :cond_4

    const-string v4, "enablePendingPurchaseForSubscriptions"

    invoke-virtual {v15, v4, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_4
    const/16 v10, 0xa

    move-object/from16 v12, p1

    move-object v14, v15

    invoke-interface/range {v9 .. v14}, Lcom/google/android/gms/internal/play_billing/d;->e1(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v3

    move-object/from16 v6, p1

    goto :goto_2

    :cond_5
    iget-object v3, v1, Lcom/android/billingclient/api/b;->f:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    move-object/from16 v6, p1

    invoke-interface {v9, v4, v3, v6, v13}, Lcom/google/android/gms/internal/play_billing/d;->t4(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v3
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_2
    if-nez v3, :cond_6

    const-string v0, "querySkuDetailsAsync got null sku details list"

    sget-object v2, Lcom/android/billingclient/api/z;->C:Lcom/android/billingclient/api/d;

    const/16 v3, 0x2c

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/android/billingclient/api/b;->T(Lcom/android/billingclient/api/d;ILjava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/G;

    move-result-object v0

    return-object v0

    :cond_6
    const-string v4, "DETAILS_LIST"

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    const/4 v7, 0x6

    if-nez v4, :cond_8

    const-string v0, "BillingClient"

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/play_billing/c1;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v0

    const-string v2, "BillingClient"

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/play_billing/c1;->f(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_7

    invoke-static {v0, v2}, Lcom/android/billingclient/api/z;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getSkuDetails() failed. Response code: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x17

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/android/billingclient/api/b;->T(Lcom/android/billingclient/api/d;ILjava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/G;

    move-result-object v0

    return-object v0

    :cond_7
    const/4 v4, 0x0

    invoke-static {v7, v2}, Lcom/android/billingclient/api/z;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v0

    const/16 v2, 0x2d

    const-string v3, "getSkuDetails() returned a bundle with neither an error nor a detail list."

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/android/billingclient/api/b;->T(Lcom/android/billingclient/api/d;ILjava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/G;

    move-result-object v0

    return-object v0

    :cond_8
    const-string v4, "DETAILS_LIST"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    if-eqz v3, :cond_a

    const/4 v4, 0x0

    :goto_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v4, v9, :cond_9

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    :try_start_3
    new-instance v10, Lcom/android/billingclient/api/SkuDetails;

    invoke-direct {v10, v9}, Lcom/android/billingclient/api/SkuDetails;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v11, "Got sku details: "

    invoke-virtual {v11, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v11, "BillingClient"

    invoke-static {v11, v9}, Lcom/google/android/gms/internal/play_billing/c1;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :catch_2
    move-exception v0

    const-string v2, "Error trying to decode SkuDetails."

    invoke-static {v7, v2}, Lcom/android/billingclient/api/z;->a(ILjava/lang/String;)Lcom/android/billingclient/api/d;

    move-result-object v2

    const/16 v3, 0x2f

    const-string v4, "Got a JSON exception trying to decode SkuDetails."

    invoke-direct {v1, v2, v3, v4, v0}, Lcom/android/billingclient/api/b;->T(Lcom/android/billingclient/api/d;ILjava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/G;

    move-result-object v0

    return-object v0

    :cond_9
    move v4, v5

    goto/16 :goto_0

    :cond_a
    const-string v0, "querySkuDetailsAsync got null response list"

    sget-object v2, Lcom/android/billingclient/api/z;->C:Lcom/android/billingclient/api/d;

    const/16 v3, 0x2e

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/android/billingclient/api/b;->T(Lcom/android/billingclient/api/d;ILjava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/G;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catch Landroid/os/DeadObjectException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :goto_4
    const-string v2, "querySkuDetailsAsync got a remote exception (try to reconnect)."

    sget-object v3, Lcom/android/billingclient/api/z;->k:Lcom/android/billingclient/api/d;

    const/16 v4, 0x2b

    invoke-direct {v1, v3, v4, v2, v0}, Lcom/android/billingclient/api/b;->T(Lcom/android/billingclient/api/d;ILjava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/G;

    move-result-object v0

    return-object v0

    :goto_5
    const-string v2, "querySkuDetailsAsync got a remote exception (try to reconnect)."

    sget-object v3, Lcom/android/billingclient/api/z;->m:Lcom/android/billingclient/api/d;

    invoke-direct {v1, v3, v4, v2, v0}, Lcom/android/billingclient/api/b;->T(Lcom/android/billingclient/api/d;ILjava/lang/String;Ljava/lang/Exception;)Lcom/android/billingclient/api/G;

    move-result-object v0

    return-object v0

    :cond_b
    const-string v2, ""

    new-instance v3, Lcom/android/billingclient/api/G;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v2, v0}, Lcom/android/billingclient/api/G;-><init>(ILjava/lang/String;Ljava/util/List;)V

    return-object v3
.end method

.method final declared-synchronized x0()Lcom/google/android/gms/internal/play_billing/y1;
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->E:Lcom/google/android/gms/internal/play_billing/y1;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/android/billingclient/api/b;->I()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/F1;->a(Ljava/util/concurrent/ExecutorService;)Lcom/google/android/gms/internal/play_billing/y1;

    move-result-object v0

    iput-object v0, p0, Lcom/android/billingclient/api/b;->E:Lcom/google/android/gms/internal/play_billing/y1;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/android/billingclient/api/b;->E:Lcom/google/android/gms/internal/play_billing/y1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
