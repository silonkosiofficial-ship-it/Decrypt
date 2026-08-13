.class public final LY4/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LY4/k;

.field private final b:LZ4/a;

.field private volatile c:Z

.field private volatile d:I

.field private volatile e:J

.field private volatile f:Z


# direct methods
.method constructor <init>(Landroid/content/Context;LY4/h;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    invoke-static {p1}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    new-instance v0, LY4/k;

    invoke-static {p2}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LY4/h;

    invoke-direct {v0, p2, p3, p4}, LY4/k;-><init>(LY4/h;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    new-instance p2, LZ4/a$a;

    invoke-direct {p2}, LZ4/a$a;-><init>()V

    invoke-direct {p0, p1, v0, p2}, LY4/q;-><init>(Landroid/content/Context;LY4/k;LZ4/a;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;LY4/k;LZ4/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LY4/q;->a:LY4/k;

    iput-object p3, p0, LY4/q;->b:LZ4/a;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LY4/q;->e:J

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/a;->c(Landroid/app/Application;)V

    invoke-static {}, Lcom/google/android/gms/common/api/internal/a;->b()Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    new-instance v0, LY4/q$a;

    invoke-direct {v0, p0, p2, p3}, LY4/q$a;-><init>(LY4/q;LY4/k;LZ4/a;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/a;->a(Lcom/google/android/gms/common/api/internal/a$a;)V

    return-void
.end method

.method static synthetic a(LY4/q;Z)Z
    .locals 0

    iput-boolean p1, p0, LY4/q;->c:Z

    return p1
.end method

.method static synthetic b(LY4/q;)Z
    .locals 0

    invoke-direct {p0}, LY4/q;->f()Z

    move-result p0

    return p0
.end method

.method static synthetic c(LY4/q;)J
    .locals 2

    iget-wide v0, p0, LY4/q;->e:J

    return-wide v0
.end method

.method private f()Z
    .locals 4

    .prologue
    iget-boolean v0, p0, LY4/q;->f:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LY4/q;->c:Z

    if-nez v0, :cond_0

    iget v0, p0, LY4/q;->d:I

    if-lez v0, :cond_0

    iget-wide v0, p0, LY4/q;->e:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public d(LV4/c;)V
    .locals 6

    .prologue
    instance-of v0, p1, LY4/b;

    if-eqz v0, :cond_0

    check-cast p1, LY4/b;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LV4/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LY4/b;->d(Ljava/lang/String;)LY4/b;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, LY4/b;->h()J

    move-result-wide v0

    invoke-virtual {p1}, LY4/b;->f()J

    move-result-wide v2

    long-to-double v2, v2

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v2, v4

    double-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/32 v2, 0x493e0

    add-long/2addr v0, v2

    iput-wide v0, p0, LY4/q;->e:J

    iget-wide v0, p0, LY4/q;->e:J

    invoke-virtual {p1}, LY4/b;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    invoke-virtual {p1}, LY4/b;->a()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    sub-long/2addr v0, v2

    iput-wide v0, p0, LY4/q;->e:J

    :cond_1
    invoke-direct {p0}, LY4/q;->f()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LY4/q;->a:LY4/k;

    iget-wide v0, p0, LY4/q;->e:J

    iget-object v2, p0, LY4/q;->b:LZ4/a;

    invoke-interface {v2}, LZ4/a;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, LY4/k;->g(J)V

    :cond_2
    return-void
.end method

.method public e(Z)V
    .locals 0

    iput-boolean p1, p0, LY4/q;->f:Z

    return-void
.end method
