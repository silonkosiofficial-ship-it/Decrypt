.class final LS/T$x$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T$x$b;->a(LB/A;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LT/f;

.field final synthetic E:LT/j;

.field final synthetic F:Lx7/l;

.field final synthetic G:LT/e;

.field final synthetic H:Ljava/lang/Long;

.field final synthetic I:LS/Q;

.field final synthetic J:LS/P0;

.field final synthetic K:LS/M;


# direct methods
.method constructor <init>(LT/f;LT/j;Lx7/l;LT/e;Ljava/lang/Long;LS/Q;LS/P0;LS/M;)V
    .locals 0

    iput-object p1, p0, LS/T$x$b$a;->D:LT/f;

    iput-object p2, p0, LS/T$x$b$a;->E:LT/j;

    iput-object p3, p0, LS/T$x$b$a;->F:Lx7/l;

    iput-object p4, p0, LS/T$x$b$a;->G:LT/e;

    iput-object p5, p0, LS/T$x$b$a;->H:Ljava/lang/Long;

    iput-object p6, p0, LS/T$x$b$a;->I:LS/Q;

    iput-object p7, p0, LS/T$x$b$a;->J:LS/P0;

    iput-object p8, p0, LS/T$x$b$a;->K:LS/M;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LB/d;ILV/n;I)V
    .locals 16

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v13, p3

    and-int/lit8 v3, p4, 0x6

    if-nez v3, :cond_1

    invoke-interface {v13, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p4, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p4

    :goto_1
    and-int/lit8 v4, p4, 0x30

    if-nez v4, :cond_3

    invoke-interface {v13, v2}, LV/n;->i(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit16 v4, v3, 0x93

    const/16 v5, 0x92

    if-ne v4, v5, :cond_5

    invoke-interface/range {p3 .. p3}, LV/n;->u()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface/range {p3 .. p3}, LV/n;->A()V

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LV/q;->H()Z

    move-result v4

    if-eqz v4, :cond_6

    const/4 v4, -0x1

    const-string v5, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1678)"

    const v6, 0x43cde265

    invoke-static {v6, v3, v4, v5}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_6
    iget-object v3, v0, LS/T$x$b$a;->D:LT/f;

    iget-object v4, v0, LS/T$x$b$a;->E:LT/j;

    invoke-virtual {v3, v4, v2}, LT/f;->l(LT/j;I)LT/j;

    move-result-object v2

    sget-object v3, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v1, v3, v6, v4, v5}, LB/c;->a(LB/d;Landroidx/compose/ui/d;FILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v1

    iget-object v3, v0, LS/T$x$b$a;->F:Lx7/l;

    iget-object v4, v0, LS/T$x$b$a;->G:LT/e;

    iget-object v5, v0, LS/T$x$b$a;->H:Ljava/lang/Long;

    iget-object v8, v0, LS/T$x$b$a;->I:LS/Q;

    iget-object v9, v0, LS/T$x$b$a;->J:LS/P0;

    iget-object v10, v0, LS/T$x$b$a;->K:LS/M;

    sget-object v6, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v6}, Lh0/c$a;->o()Lh0/c;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v6

    invoke-static {v13, v7}, LV/k;->a(LV/n;I)I

    move-result v7

    invoke-interface/range {p3 .. p3}, LV/n;->F()LV/z;

    move-result-object v11

    invoke-static {v13, v1}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    sget-object v12, LF0/g;->a:LF0/g$a;

    invoke-virtual {v12}, LF0/g$a;->a()Lx7/a;

    move-result-object v14

    invoke-interface/range {p3 .. p3}, LV/n;->v()LV/g;

    move-result-object v15

    instance-of v15, v15, LV/g;

    if-nez v15, :cond_7

    invoke-static {}, LV/k;->c()V

    :cond_7
    invoke-interface/range {p3 .. p3}, LV/n;->t()V

    invoke-interface/range {p3 .. p3}, LV/n;->o()Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-interface {v13, v14}, LV/n;->B(Lx7/a;)V

    goto :goto_4

    :cond_8
    invoke-interface/range {p3 .. p3}, LV/n;->H()V

    :goto_4
    invoke-static/range {p3 .. p3}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v14

    invoke-virtual {v12}, LF0/g$a;->c()Lx7/p;

    move-result-object v15

    invoke-static {v14, v6, v15}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v12}, LF0/g$a;->e()Lx7/p;

    move-result-object v6

    invoke-static {v14, v11, v6}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v12}, LF0/g$a;->b()Lx7/p;

    move-result-object v6

    invoke-interface {v14}, LV/n;->o()Z

    move-result v11

    if-nez v11, :cond_9

    invoke-interface {v14}, LV/n;->g()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v11, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_a

    :cond_9
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v14, v11}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v14, v7, v6}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_a
    invoke-virtual {v12}, LF0/g$a;->d()Lx7/p;

    move-result-object v6

    invoke-static {v14, v1, v6}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-virtual {v4}, LT/e;->i()J

    move-result-wide v6

    const/4 v11, 0x0

    const v12, 0x36000

    const/4 v14, 0x0

    move-object v1, v2

    move-object v2, v3

    move-wide v3, v6

    move-object v6, v14

    move-object v7, v11

    move-object/from16 v11, p3

    invoke-static/range {v1 .. v12}, LS/T;->j(LT/j;Lx7/l;JLjava/lang/Long;Ljava/lang/Long;LS/Q0;LS/Q;LS/P0;LS/M;LV/n;I)V

    invoke-interface/range {p3 .. p3}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {}, LV/q;->P()V

    :cond_b
    :goto_5
    return-void
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LB/d;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, LV/n;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LS/T$x$b$a;->a(LB/d;ILV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
