.class final LV/U0$f$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/U0$f;->a(Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/U0;

.field final synthetic E:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(LV/U0;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, LV/U0$f$a;->D:LV/U0;

    iput-object p2, p0, LV/U0$f$a;->E:Ljava/lang/Throwable;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 5

    .prologue
    iget-object v0, p0, LV/U0$f$a;->D:LV/U0;

    invoke-static {v0}, LV/U0;->G(LV/U0;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LV/U0$f$a;->D:LV/U0;

    iget-object v2, p0, LV/U0$f$a;->E:Ljava/lang/Throwable;

    monitor-enter v0

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    if-eqz p1, :cond_2

    :try_start_0
    instance-of v4, p1, Ljava/util/concurrent/CancellationException;

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_2

    invoke-static {v2, p1}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    move-object v2, v3

    :cond_2
    :goto_1
    invoke-static {v1, v2}, LV/U0;->R(LV/U0;Ljava/lang/Throwable;)V

    invoke-static {v1}, LV/U0;->J(LV/U0;)LZ8/y;

    move-result-object p1

    sget-object v1, LV/U0$d;->C:LV/U0$d;

    invoke-interface {p1, v1}, LZ8/y;->setValue(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LV/U0$f$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
