.class final LS/q1$x;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->p(Landroidx/compose/ui/d;ILS/t1;ILS/o1;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:I

.field final synthetic E:LS/t1;

.field final synthetic F:I

.field final synthetic G:J


# direct methods
.method constructor <init>(ILS/t1;IJ)V
    .locals 0

    iput p1, p0, LS/q1$x;->D:I

    iput-object p2, p0, LS/q1$x;->E:LS/t1;

    iput p3, p0, LS/q1$x;->F:I

    iput-wide p4, p0, LS/q1$x;->G:J

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 28

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    invoke-interface/range {p1 .. p1}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LV/n;->A()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v4, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1376)"

    const v5, -0x580d8aa7

    invoke-static {v5, v1, v2, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget v1, v0, LS/q1$x;->D:I

    iget-object v2, v0, LS/q1$x;->E:LS/t1;

    invoke-interface {v2}, LS/t1;->h()Z

    move-result v2

    iget v4, v0, LS/q1$x;->F:I

    const/4 v5, 0x0

    invoke-static {v1, v2, v4, v3, v5}, LS/q1;->Z(IZILV/n;I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v2}, Lh0/c$a;->e()Lh0/c;

    move-result-object v2

    iget v6, v0, LS/q1$x;->F:I

    iget-wide v14, v0, LS/q1$x;->G:J

    sget-object v4, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v2

    invoke-static {v3, v5}, LV/k;->a(LV/n;I)I

    move-result v7

    invoke-interface/range {p1 .. p1}, LV/n;->F()LV/z;

    move-result-object v8

    invoke-static {v3, v4}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v9

    sget-object v10, LF0/g;->a:LF0/g$a;

    invoke-virtual {v10}, LF0/g$a;->a()Lx7/a;

    move-result-object v11

    invoke-interface/range {p1 .. p1}, LV/n;->v()LV/g;

    move-result-object v12

    instance-of v12, v12, LV/g;

    if-nez v12, :cond_3

    invoke-static {}, LV/k;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LV/n;->t()V

    invoke-interface/range {p1 .. p1}, LV/n;->o()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {v3, v11}, LV/n;->B(Lx7/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LV/n;->H()V

    :goto_1
    invoke-static/range {p1 .. p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v11

    invoke-virtual {v10}, LF0/g$a;->c()Lx7/p;

    move-result-object v12

    invoke-static {v11, v2, v12}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v10}, LF0/g$a;->e()Lx7/p;

    move-result-object v2

    invoke-static {v11, v8, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v10}, LF0/g$a;->b()Lx7/p;

    move-result-object v2

    invoke-interface {v11}, LV/n;->o()Z

    move-result v8

    if-nez v8, :cond_5

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    :cond_5
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v11, v8}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v11, v7, v2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_6
    invoke-virtual {v10}, LF0/g$a;->d()Lx7/p;

    move-result-object v2

    invoke-static {v11, v9, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-interface {v3, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p1 .. p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_7

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v7, v2, :cond_8

    :cond_7
    new-instance v7, LS/q1$x$a;

    invoke-direct {v7, v1}, LS/q1$x$a;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v7}, LV/n;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v7, Lx7/l;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v4, v5, v7, v1, v2}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, LS/p;->c(IIIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v24, 0x0

    const v25, 0x1fff8

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    move-wide/from16 v26, v14

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-wide/from16 v3, v26

    move-object/from16 v22, p1

    invoke-static/range {v1 .. v25}, LS/m1;->b(Ljava/lang/String;Landroidx/compose/ui/d;JJLR0/o;LR0/q;LR0/h;JLX0/k;LX0/j;JIZIILx7/l;LM0/P;LV/n;III)V

    invoke-interface/range {p1 .. p1}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    :goto_2
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/q1$x;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
