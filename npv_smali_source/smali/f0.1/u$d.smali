.class final Lf0/u$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf0/u;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lf0/u;


# direct methods
.method constructor <init>(Lf0/u;)V
    .locals 0

    iput-object p1, p0, Lf0/u$d;->D:Lf0/u;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .prologue
    const/4 v0, 0x1

    :cond_0
    iget-object v1, p0, Lf0/u$d;->D:Lf0/u;

    invoke-static {v1}, Lf0/u;->d(Lf0/u;)LX/b;

    move-result-object v1

    iget-object v2, p0, Lf0/u$d;->D:Lf0/u;

    monitor-enter v1

    :try_start_0
    invoke-static {v2}, Lf0/u;->e(Lf0/u;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-static {v2, v0}, Lf0/u;->h(Lf0/u;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v3, 0x0

    :try_start_1
    invoke-static {v2}, Lf0/u;->d(Lf0/u;)LX/b;

    move-result-object v4

    invoke-virtual {v4}, LX/b;->t()I

    move-result v5

    if-lez v5, :cond_2

    invoke-virtual {v4}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v4

    move v6, v3

    :cond_1
    aget-object v7, v4, v6

    check-cast v7, Lf0/u$a;

    invoke-virtual {v7}, Lf0/u$a;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/2addr v6, v0

    if-lt v6, v5, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_2
    :goto_0
    :try_start_2
    invoke-static {v2, v3}, Lf0/u;->h(Lf0/u;Z)V

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_3

    :goto_1
    invoke-static {v2, v3}, Lf0/u;->h(Lf0/u;Z)V

    throw v0

    :cond_3
    :goto_2
    sget-object v2, Li7/M;->a:Li7/M;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v1

    iget-object v1, p0, Lf0/u$d;->D:Lf0/u;

    invoke-static {v1}, Lf0/u;->b(Lf0/u;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :goto_3
    monitor-exit v1

    throw v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf0/u$d;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
