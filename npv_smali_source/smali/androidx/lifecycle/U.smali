.class public abstract Landroidx/lifecycle/U;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Le2/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le2/e;

    invoke-direct {v0}, Le2/e;-><init>()V

    sput-object v0, Landroidx/lifecycle/U;->a:Le2/e;

    return-void
.end method

.method public static final a(Landroidx/lifecycle/T;)LW8/N;
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/U;->a:Le2/e;

    monitor-enter v0

    :try_start_0
    const-string v1, "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY"

    invoke-virtual {p0, v1}, Landroidx/lifecycle/T;->f(Ljava/lang/String;)Ljava/lang/AutoCloseable;

    move-result-object v1

    check-cast v1, Le2/a;

    if-nez v1, :cond_0

    invoke-static {}, Le2/b;->a()Le2/a;

    move-result-object v1

    const-string v2, "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY"

    invoke-virtual {p0, v2, v1}, Landroidx/lifecycle/T;->d(Ljava/lang/String;Ljava/lang/AutoCloseable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0

    throw p0
.end method
