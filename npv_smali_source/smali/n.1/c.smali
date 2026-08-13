.class public Ln/c;
.super Ln/e;
.source "SourceFile"


# static fields
.field private static volatile c:Ln/c;

.field private static final d:Ljava/util/concurrent/Executor;

.field private static final e:Ljava/util/concurrent/Executor;


# instance fields
.field private a:Ln/e;

.field private final b:Ln/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln/a;

    invoke-direct {v0}, Ln/a;-><init>()V

    sput-object v0, Ln/c;->d:Ljava/util/concurrent/Executor;

    new-instance v0, Ln/b;

    invoke-direct {v0}, Ln/b;-><init>()V

    sput-object v0, Ln/c;->e:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ln/e;-><init>()V

    new-instance v0, Ln/d;

    invoke-direct {v0}, Ln/d;-><init>()V

    iput-object v0, p0, Ln/c;->b:Ln/e;

    iput-object v0, p0, Ln/c;->a:Ln/e;

    return-void
.end method

.method public static synthetic d(Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0}, Ln/c;->h(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic e(Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0}, Ln/c;->i(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static f()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Ln/c;->e:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static g()Ln/c;
    .locals 2

    .prologue
    sget-object v0, Ln/c;->c:Ln/c;

    if-eqz v0, :cond_0

    sget-object v0, Ln/c;->c:Ln/c;

    return-object v0

    :cond_0
    const-class v0, Ln/c;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ln/c;->c:Ln/c;

    if-nez v1, :cond_1

    new-instance v1, Ln/c;

    invoke-direct {v1}, Ln/c;-><init>()V

    sput-object v1, Ln/c;->c:Ln/c;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Ln/c;->c:Ln/c;

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private static synthetic h(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Ln/c;->g()Ln/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Ln/c;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static synthetic i(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Ln/c;->g()Ln/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Ln/c;->a(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Ln/c;->a:Ln/e;

    invoke-virtual {v0, p1}, Ln/e;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Ln/c;->a:Ln/e;

    invoke-virtual {v0}, Ln/e;->b()Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Ln/c;->a:Ln/e;

    invoke-virtual {v0, p1}, Ln/e;->c(Ljava/lang/Runnable;)V

    return-void
.end method
