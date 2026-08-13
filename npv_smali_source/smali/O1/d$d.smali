.class final LO1/d$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO1/d;->a()LM1/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LO1/d;


# direct methods
.method constructor <init>(LO1/d;)V
    .locals 0

    iput-object p1, p0, LO1/d$d;->D:LO1/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    sget-object v0, LO1/d;->f:LO1/d$b;

    invoke-virtual {v0}, LO1/d$b;->b()LO1/h;

    move-result-object v1

    iget-object v2, p0, LO1/d$d;->D:LO1/d;

    monitor-enter v1

    :try_start_0
    invoke-virtual {v0}, LO1/d$b;->a()Ljava/util/Set;

    move-result-object v0

    invoke-static {v2}, LO1/d;->d(LO1/d;)LX9/Q;

    move-result-object v2

    invoke-virtual {v2}, LX9/Q;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LO1/d$d;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
