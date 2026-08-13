.class final LV/U0$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/U0;-><init>(Lm7/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/U0;


# direct methods
.method constructor <init>(LV/U0;)V
    .locals 0

    iput-object p1, p0, LV/U0$e;->D:LV/U0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .prologue
    iget-object v0, p0, LV/U0$e;->D:LV/U0;

    invoke-static {v0}, LV/U0;->G(LV/U0;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LV/U0$e;->D:LV/U0;

    monitor-enter v0

    :try_start_0
    invoke-static {v1}, LV/U0;->t(LV/U0;)LW8/l;

    move-result-object v2

    invoke-static {v1}, LV/U0;->J(LV/U0;)LZ8/y;

    move-result-object v3

    invoke-interface {v3}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LV/U0$d;

    sget-object v4, LV/U0$d;->D:LV/U0$d;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v3, :cond_1

    monitor-exit v0

    if-eqz v2, :cond_0

    sget-object v0, Li7/w;->D:Li7/w$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    :try_start_1
    const-string v2, "Recomposer shutdown; frame clock awaiter will never resume"

    invoke-static {v1}, LV/U0;->w(LV/U0;)Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {v2, v1}, LW8/o0;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v1

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LV/U0$e;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
