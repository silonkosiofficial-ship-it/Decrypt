.class public abstract Lf4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lf4/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lf4/a;
    .locals 3

    .prologue
    const-class v0, Lf4/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lf4/a;->a:Lf4/a;

    if-nez v1, :cond_0

    new-instance v1, Lf4/j;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lf4/j;-><init>(Lf4/i;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    check-cast p0, Landroid/app/Application;

    invoke-virtual {v1, p0}, Lf4/j;->b(Landroid/app/Application;)Lf4/j;

    invoke-virtual {v1}, Lf4/j;->a()Lf4/a;

    move-result-object p0

    sput-object p0, Lf4/a;->a:Lf4/a;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, Lf4/a;->a:Lf4/a;

    monitor-exit v0

    return-object p0

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public abstract b()Lf4/c1;
.end method

.method public abstract c()Lf4/P;
.end method
