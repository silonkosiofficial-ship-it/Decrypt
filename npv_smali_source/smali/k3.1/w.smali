.class public final Lk3/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk3/w$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Ls3/Y0;

.field private c:Lk3/w$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lk3/w;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lk3/w$a;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lk3/w;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lk3/w;->c:Lk3/w$a;

    iget-object v1, p0, Lk3/w;->b:Ls3/Y0;

    if-nez v1, :cond_0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    :try_start_1
    new-instance v2, Ls3/O1;

    invoke-direct {v2, p1}, Ls3/O1;-><init>(Lk3/w$a;)V

    move-object p1, v2

    :goto_0
    invoke-interface {v1, p1}, Ls3/Y0;->b4(Ls3/b1;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_2
    const-string v1, "Unable to call setVideoLifecycleCallbacks on video controller."

    invoke-static {v1, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final b()Ls3/Y0;
    .locals 2

    .prologue
    iget-object v0, p0, Lk3/w;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lk3/w;->b:Ls3/Y0;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final c(Ls3/Y0;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lk3/w;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lk3/w;->b:Ls3/Y0;

    iget-object p1, p0, Lk3/w;->c:Lk3/w$a;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lk3/w;->a(Lk3/w$a;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
