.class public LO2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:LO2/h;


# instance fields
.field private a:LO2/a;

.field private b:LO2/b;

.field private c:LO2/f;

.field private d:LO2/g;


# direct methods
.method private constructor <init>(Landroid/content/Context;LS2/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, LO2/a;

    invoke-direct {v0, p1, p2}, LO2/a;-><init>(Landroid/content/Context;LS2/a;)V

    iput-object v0, p0, LO2/h;->a:LO2/a;

    new-instance v0, LO2/b;

    invoke-direct {v0, p1, p2}, LO2/b;-><init>(Landroid/content/Context;LS2/a;)V

    iput-object v0, p0, LO2/h;->b:LO2/b;

    new-instance v0, LO2/f;

    invoke-direct {v0, p1, p2}, LO2/f;-><init>(Landroid/content/Context;LS2/a;)V

    iput-object v0, p0, LO2/h;->c:LO2/f;

    new-instance v0, LO2/g;

    invoke-direct {v0, p1, p2}, LO2/g;-><init>(Landroid/content/Context;LS2/a;)V

    iput-object v0, p0, LO2/h;->d:LO2/g;

    return-void
.end method

.method public static declared-synchronized c(Landroid/content/Context;LS2/a;)LO2/h;
    .locals 2

    .prologue
    const-class v0, LO2/h;

    monitor-enter v0

    :try_start_0
    sget-object v1, LO2/h;->e:LO2/h;

    if-nez v1, :cond_0

    new-instance v1, LO2/h;

    invoke-direct {v1, p0, p1}, LO2/h;-><init>(Landroid/content/Context;LS2/a;)V

    sput-object v1, LO2/h;->e:LO2/h;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, LO2/h;->e:LO2/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public a()LO2/a;
    .locals 1

    iget-object v0, p0, LO2/h;->a:LO2/a;

    return-object v0
.end method

.method public b()LO2/b;
    .locals 1

    iget-object v0, p0, LO2/h;->b:LO2/b;

    return-object v0
.end method

.method public d()LO2/f;
    .locals 1

    iget-object v0, p0, LO2/h;->c:LO2/f;

    return-object v0
.end method

.method public e()LO2/g;
    .locals 1

    iget-object v0, p0, LO2/h;->d:LO2/g;

    return-object v0
.end method
