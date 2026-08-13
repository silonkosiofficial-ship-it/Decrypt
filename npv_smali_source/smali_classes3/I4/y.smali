.class abstract LI4/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:LI4/v;


# direct methods
.method static declared-synchronized a(Landroid/content/Context;)LI4/v;
    .locals 3

    .prologue
    const-class v0, LI4/y;

    monitor-enter v0

    :try_start_0
    sget-object v1, LI4/y;->a:LI4/v;

    if-nez v1, :cond_0

    new-instance v1, LI4/t;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LI4/t;-><init>(LI4/s;)V

    invoke-static {p0}, LK4/f;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v1, p0}, LI4/t;->b(Landroid/content/Context;)LI4/t;

    invoke-interface {v1}, LI4/w;->a()LI4/v;

    move-result-object p0

    sput-object p0, LI4/y;->a:LI4/v;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, LI4/y;->a:LI4/v;
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
