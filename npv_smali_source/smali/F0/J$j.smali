.class final LF0/J$j;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/J;->I()LK0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF0/J;

.field final synthetic E:Ly7/O;


# direct methods
.method constructor <init>(LF0/J;Ly7/O;)V
    .locals 0

    iput-object p1, p0, LF0/J$j;->D:LF0/J;

    iput-object p2, p0, LF0/J$j;->E:Ly7/O;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 11

    .prologue
    iget-object v0, p0, LF0/J$j;->D:LF0/J;

    invoke-virtual {v0}, LF0/J;->k0()LF0/b0;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    iget-object v2, p0, LF0/J$j;->E:Ly7/O;

    invoke-static {v0}, LF0/b0;->c(LF0/b0;)I

    move-result v3

    and-int/2addr v3, v1

    if-eqz v3, :cond_a

    invoke-virtual {v0}, LF0/b0;->o()Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v3

    and-int/2addr v3, v1

    if-eqz v3, :cond_9

    const/4 v3, 0x0

    move-object v4, v0

    move-object v5, v3

    :goto_1
    if-eqz v4, :cond_9

    instance-of v6, v4, LF0/z0;

    const/4 v7, 0x1

    if-eqz v6, :cond_2

    check-cast v4, LF0/z0;

    invoke-interface {v4}, LF0/z0;->h0()Z

    move-result v6

    if-eqz v6, :cond_0

    new-instance v6, LK0/k;

    invoke-direct {v6}, LK0/k;-><init>()V

    iput-object v6, v2, Ly7/O;->C:Ljava/lang/Object;

    invoke-virtual {v6, v7}, LK0/k;->O(Z)V

    :cond_0
    invoke-interface {v4}, LF0/z0;->k1()Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v6, v2, Ly7/O;->C:Ljava/lang/Object;

    check-cast v6, LK0/k;

    invoke-virtual {v6, v7}, LK0/k;->P(Z)V

    :cond_1
    iget-object v6, v2, Ly7/O;->C:Ljava/lang/Object;

    check-cast v6, LK0/k;

    invoke-interface {v4, v6}, LF0/z0;->M0(LK0/w;)V

    goto :goto_4

    :cond_2
    invoke-virtual {v4}, Landroidx/compose/ui/d$c;->v1()I

    move-result v6

    and-int/2addr v6, v1

    if-eqz v6, :cond_8

    instance-of v6, v4, LF0/m;

    if-eqz v6, :cond_8

    move-object v6, v4

    check-cast v6, LF0/m;

    invoke-virtual {v6}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v6

    const/4 v8, 0x0

    move v9, v8

    :goto_2
    if-eqz v6, :cond_7

    invoke-virtual {v6}, Landroidx/compose/ui/d$c;->v1()I

    move-result v10

    and-int/2addr v10, v1

    if-eqz v10, :cond_6

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v7, :cond_3

    move-object v4, v6

    goto :goto_3

    :cond_3
    if-nez v5, :cond_4

    new-instance v5, LX/b;

    const/16 v10, 0x10

    new-array v10, v10, [Landroidx/compose/ui/d$c;

    invoke-direct {v5, v10, v8}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v5, v4}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v4, v3

    :cond_5
    invoke-virtual {v5, v6}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_6
    :goto_3
    invoke-virtual {v6}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v6

    goto :goto_2

    :cond_7
    if-ne v9, v7, :cond_8

    goto :goto_1

    :cond_8
    :goto_4
    invoke-static {v5}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v4

    goto :goto_1

    :cond_9
    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->x1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF0/J$j;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
