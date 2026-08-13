.class final LS/T$x;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->i(LB/D;Ljava/lang/Long;Lx7/l;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LB/D;

.field final synthetic E:LE7/i;

.field final synthetic F:LT/f;

.field final synthetic G:LT/j;

.field final synthetic H:Lx7/l;

.field final synthetic I:LT/e;

.field final synthetic J:Ljava/lang/Long;

.field final synthetic K:LS/Q;

.field final synthetic L:LS/P0;

.field final synthetic M:LS/M;


# direct methods
.method constructor <init>(LB/D;LE7/i;LT/f;LT/j;Lx7/l;LT/e;Ljava/lang/Long;LS/Q;LS/P0;LS/M;)V
    .locals 0

    iput-object p1, p0, LS/T$x;->D:LB/D;

    iput-object p2, p0, LS/T$x;->E:LE7/i;

    iput-object p3, p0, LS/T$x;->F:LT/f;

    iput-object p4, p0, LS/T$x;->G:LT/j;

    iput-object p5, p0, LS/T$x;->H:Lx7/l;

    iput-object p6, p0, LS/T$x;->I:LT/e;

    iput-object p7, p0, LS/T$x;->J:Ljava/lang/Long;

    iput-object p8, p0, LS/T$x;->K:LS/Q;

    iput-object p9, p0, LS/T$x;->L:LS/P0;

    iput-object p10, p0, LS/T$x;->M:LS/M;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 21

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LV/n;->A()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.HorizontalMonthsList.<anonymous> (DatePicker.kt:1666)"

    const v4, 0x59a68b7a

    invoke-static {v4, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v2, LS/T$x$a;->D:LS/T$x$a;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v5, v2, v3, v4}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v7

    iget-object v8, v0, LS/T$x;->D:LB/D;

    sget-object v1, LS/N;->a:LS/N;

    const/16 v5, 0x180

    const/4 v6, 0x2

    const/4 v3, 0x0

    move-object v2, v8

    move-object/from16 v4, p1

    invoke-virtual/range {v1 .. v6}, LS/N;->k(LB/D;Lu/B;LV/n;II)Lx/p;

    move-result-object v9

    iget-object v1, v0, LS/T$x;->E:LE7/i;

    invoke-interface {v10, v1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, LS/T$x;->F:LT/f;

    invoke-interface {v10, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, LS/T$x;->G:LT/j;

    invoke-interface {v10, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, LS/T$x;->H:Lx7/l;

    invoke-interface {v10, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, LS/T$x;->I:LT/e;

    invoke-interface {v10, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, LS/T$x;->J:Ljava/lang/Long;

    invoke-interface {v10, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, LS/T$x;->K:LS/Q;

    invoke-interface {v10, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, LS/T$x;->L:LS/P0;

    invoke-interface {v10, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, LS/T$x;->M:LS/M;

    invoke-interface {v10, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v12, v0, LS/T$x;->E:LE7/i;

    iget-object v13, v0, LS/T$x;->F:LT/f;

    iget-object v14, v0, LS/T$x;->G:LT/j;

    iget-object v15, v0, LS/T$x;->H:Lx7/l;

    iget-object v2, v0, LS/T$x;->I:LT/e;

    iget-object v3, v0, LS/T$x;->J:Ljava/lang/Long;

    iget-object v4, v0, LS/T$x;->K:LS/Q;

    iget-object v5, v0, LS/T$x;->L:LS/P0;

    iget-object v6, v0, LS/T$x;->M:LS/M;

    invoke-interface/range {p1 .. p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v11

    if-nez v1, :cond_3

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v11, v1, :cond_4

    :cond_3
    new-instance v1, LS/T$x$b;

    move-object v11, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    invoke-direct/range {v11 .. v20}, LS/T$x$b;-><init>(LE7/i;LT/f;LT/j;Lx7/l;LT/e;Ljava/lang/Long;LS/Q;LS/P0;LS/M;)V

    invoke-interface {v10, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v11, Lx7/l;

    const/4 v12, 0x0

    const/16 v13, 0xbc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v14, 0x0

    move-object v1, v7

    move-object v2, v8

    move-object v7, v9

    move v8, v14

    move-object v9, v11

    move-object/from16 v10, p1

    move v11, v12

    move v12, v13

    invoke-static/range {v1 .. v12}, LB/b;->b(Landroidx/compose/ui/d;LB/D;LA/B;ZLA/b$e;Lh0/c$c;Lx/p;ZLx7/l;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/T$x;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
