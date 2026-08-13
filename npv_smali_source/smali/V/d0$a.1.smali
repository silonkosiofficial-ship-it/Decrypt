.class final LV/d0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/d0;->c(Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/d0;

.field final synthetic E:LW8/l;


# direct methods
.method constructor <init>(LV/d0;LW8/l;)V
    .locals 0

    iput-object p1, p0, LV/d0$a;->D:LV/d0;

    iput-object p2, p0, LV/d0$a;->E:LW8/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    iget-object p1, p0, LV/d0$a;->D:LV/d0;

    invoke-static {p1}, LV/d0;->b(LV/d0;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LV/d0$a;->D:LV/d0;

    iget-object v1, p0, LV/d0$a;->E:LW8/l;

    monitor-enter p1

    :try_start_0
    invoke-static {v0}, LV/d0;->a(LV/d0;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LV/d0$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
