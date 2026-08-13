.class final LR0/G$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR0/G;->c(LR0/F;Lx7/l;)LV/G1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LR0/G;

.field final synthetic E:LR0/F;


# direct methods
.method constructor <init>(LR0/G;LR0/F;)V
    .locals 0

    iput-object p1, p0, LR0/G$a;->D:LR0/G;

    iput-object p2, p0, LR0/G$a;->E:LR0/F;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LR0/H;)V
    .locals 4

    .prologue
    iget-object v0, p0, LR0/G$a;->D:LR0/G;

    invoke-virtual {v0}, LR0/G;->b()LU0/r;

    move-result-object v0

    iget-object v1, p0, LR0/G$a;->D:LR0/G;

    iget-object v2, p0, LR0/G$a;->E:LR0/F;

    monitor-enter v0

    :try_start_0
    invoke-interface {p1}, LR0/H;->f()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v1}, LR0/G;->a(LR0/G;)LQ0/b;

    move-result-object v1

    invoke-virtual {v1, v2, p1}, LQ0/b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-static {v1}, LR0/G;->a(LR0/G;)LQ0/b;

    move-result-object p1

    invoke-virtual {p1, v2}, LQ0/b;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR0/H;

    invoke-virtual {p0, p1}, LR0/G$a;->a(LR0/H;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
