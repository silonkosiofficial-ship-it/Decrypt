.class final LS/s0$f$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/s0$f;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LA/L;

.field final synthetic E:Lx7/p;

.field final synthetic F:Lx7/p;

.field final synthetic G:Lx7/p;


# direct methods
.method constructor <init>(LA/L;Lx7/p;Lx7/p;Lx7/p;)V
    .locals 0

    iput-object p1, p0, LS/s0$f$b;->D:LA/L;

    iput-object p2, p0, LS/s0$f$b;->E:Lx7/p;

    iput-object p3, p0, LS/s0$f$b;->F:Lx7/p;

    iput-object p4, p0, LS/s0$f$b;->G:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 19

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    invoke-interface/range {p1 .. p1}, LV/n;->u()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LV/n;->A()V

    goto/16 :goto_6

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:483)"

    const v5, -0x670cd454

    invoke-static {v5, v2, v3, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v6, v0, LS/s0$f$b;->D:LA/L;

    sget-object v7, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, LA/K;->a(LA/L;Landroidx/compose/ui/d;FZILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v12

    iget-object v2, v0, LS/s0$f$b;->E:Lx7/p;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-static {}, LS/s0;->g()F

    move-result v2

    :goto_1
    move v13, v2

    goto :goto_2

    :cond_3
    int-to-float v2, v3

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v2

    goto :goto_1

    :goto_2
    iget-object v2, v0, LS/s0$f$b;->F:Lx7/p;

    if-eqz v2, :cond_4

    invoke-static {}, LS/s0;->g()F

    move-result v2

    :goto_3
    move v15, v2

    goto :goto_4

    :cond_4
    int-to-float v2, v3

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v2

    goto :goto_3

    :goto_4
    const/16 v17, 0xa

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/layout/m;->m(Landroidx/compose/ui/d;FFFFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    iget-object v4, v0, LS/s0$f$b;->G:Lx7/p;

    sget-object v5, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v5}, Lh0/c$a;->o()Lh0/c;

    move-result-object v5

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v5

    invoke-static {v1, v3}, LV/k;->a(LV/n;I)I

    move-result v6

    invoke-interface/range {p1 .. p1}, LV/n;->F()LV/z;

    move-result-object v7

    invoke-static {v1, v2}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v2

    sget-object v8, LF0/g;->a:LF0/g$a;

    invoke-virtual {v8}, LF0/g$a;->a()Lx7/a;

    move-result-object v9

    invoke-interface/range {p1 .. p1}, LV/n;->v()LV/g;

    move-result-object v10

    instance-of v10, v10, LV/g;

    if-nez v10, :cond_5

    invoke-static {}, LV/k;->c()V

    :cond_5
    invoke-interface/range {p1 .. p1}, LV/n;->t()V

    invoke-interface/range {p1 .. p1}, LV/n;->o()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v1, v9}, LV/n;->B(Lx7/a;)V

    goto :goto_5

    :cond_6
    invoke-interface/range {p1 .. p1}, LV/n;->H()V

    :goto_5
    invoke-static/range {p1 .. p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v9

    invoke-virtual {v8}, LF0/g$a;->c()Lx7/p;

    move-result-object v10

    invoke-static {v9, v5, v10}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v8}, LF0/g$a;->e()Lx7/p;

    move-result-object v5

    invoke-static {v9, v7, v5}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v8}, LF0/g$a;->b()Lx7/p;

    move-result-object v5

    invoke-interface {v9}, LV/n;->o()Z

    move-result v7

    if-nez v7, :cond_7

    invoke-interface {v9}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    :cond_7
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6, v5}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_8
    invoke-virtual {v8}, LF0/g$a;->d()Lx7/p;

    move-result-object v5

    invoke-static {v9, v2, v5}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v1, v2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    :goto_6
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/s0$f$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
