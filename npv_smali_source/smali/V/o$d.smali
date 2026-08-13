.class final LV/o$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/o;->I0(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/o;

.field final synthetic E:LW/a;

.field final synthetic F:LV/g1;

.field final synthetic G:LV/o0;


# direct methods
.method constructor <init>(LV/o;LW/a;LV/g1;LV/o0;)V
    .locals 0

    iput-object p1, p0, LV/o$d;->D:LV/o;

    iput-object p2, p0, LV/o$d;->E:LW/a;

    iput-object p3, p0, LV/o$d;->F:LV/g1;

    iput-object p4, p0, LV/o$d;->G:LV/o0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 12

    .prologue
    iget-object v0, p0, LV/o$d;->D:LV/o;

    invoke-static {v0}, LV/o;->V(LV/o;)LW/b;

    move-result-object v0

    iget-object v1, p0, LV/o$d;->E:LW/a;

    iget-object v2, p0, LV/o$d;->D:LV/o;

    iget-object v3, p0, LV/o$d;->F:LV/g1;

    iget-object v4, p0, LV/o$d;->G:LV/o0;

    invoke-virtual {v0}, LW/b;->n()LW/a;

    move-result-object v5

    :try_start_0
    invoke-virtual {v0, v1}, LW/b;->R(LW/a;)V

    invoke-virtual {v2}, LV/o;->G0()LV/g1;

    move-result-object v1

    invoke-static {v2}, LV/o;->X(LV/o;)[I

    move-result-object v6

    invoke-static {v2}, LV/o;->Z(LV/o;)LX/a;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v2, v8}, LV/o;->d0(LV/o;[I)V

    invoke-static {v2, v8}, LV/o;->e0(LV/o;LX/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v2, v3}, LV/o;->f1(LV/g1;)V

    invoke-static {v2}, LV/o;->V(LV/o;)LW/b;

    move-result-object v3

    invoke-virtual {v3}, LW/b;->o()Z

    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v10, 0x0

    :try_start_2
    invoke-virtual {v3, v10}, LW/b;->S(Z)V

    invoke-virtual {v4}, LV/o0;->c()LV/m0;

    invoke-virtual {v4}, LV/o0;->e()LV/H0;

    move-result-object v10

    invoke-virtual {v4}, LV/o0;->f()Ljava/lang/Object;

    move-result-object v4

    const/4 v11, 0x1

    invoke-static {v2, v8, v10, v4, v11}, LV/o;->b0(LV/o;LV/m0;LV/H0;Ljava/lang/Object;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v3, v9}, LW/b;->S(Z)V

    sget-object v3, Li7/M;->a:Li7/M;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {v2, v1}, LV/o;->f1(LV/g1;)V

    invoke-static {v2, v6}, LV/o;->d0(LV/o;[I)V

    invoke-static {v2, v7}, LV/o;->e0(LV/o;LX/a;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual {v0, v5}, LW/b;->R(LW/a;)V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :catchall_1
    move-exception v3

    goto :goto_0

    :catchall_2
    move-exception v4

    :try_start_5
    invoke-virtual {v3, v9}, LW/b;->S(Z)V

    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_0
    :try_start_6
    invoke-virtual {v2, v1}, LV/o;->f1(LV/g1;)V

    invoke-static {v2, v6}, LV/o;->d0(LV/o;[I)V

    invoke-static {v2, v7}, LV/o;->e0(LV/o;LX/a;)V

    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_1
    invoke-virtual {v0, v5}, LW/b;->R(LW/a;)V

    throw v1
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LV/o$d;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
