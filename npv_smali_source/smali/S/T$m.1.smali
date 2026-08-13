.class final LS/T$m;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->c(Ljava/lang/Long;JLx7/l;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:J

.field final synthetic E:LV/w0;

.field final synthetic F:LW8/N;

.field final synthetic G:LB/D;

.field final synthetic H:LE7/i;

.field final synthetic I:LT/j;

.field final synthetic J:LS/P0;

.field final synthetic K:LT/f;

.field final synthetic L:LS/M;


# direct methods
.method constructor <init>(JLV/w0;LW8/N;LB/D;LE7/i;LT/j;LS/P0;LT/f;LS/M;)V
    .locals 0

    iput-wide p1, p0, LS/T$m;->D:J

    iput-object p3, p0, LS/T$m;->E:LV/w0;

    iput-object p4, p0, LS/T$m;->F:LW8/N;

    iput-object p5, p0, LS/T$m;->G:LB/D;

    iput-object p6, p0, LS/T$m;->H:LE7/i;

    iput-object p7, p0, LS/T$m;->I:LT/j;

    iput-object p8, p0, LS/T$m;->J:LS/P0;

    iput-object p9, p0, LS/T$m;->K:LT/f;

    iput-object p10, p0, LS/T$m;->L:LS/M;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lt/e;LV/n;I)V
    .locals 18

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v11, p2

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1576)"

    const v3, 0x4726a972

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v1, LT/x;->a:LT/x$a;

    sget v1, LS/C0;->w:I

    invoke-static {v1}, LT/x;->a(I)I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v11, v2}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-interface {v11, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface/range {p2 .. p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_1

    sget-object v4, LV/n;->a:LV/n$a;

    invoke-virtual {v4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_2

    :cond_1
    new-instance v5, LS/T$m$a;

    invoke-direct {v5, v1}, LS/T$m$a;-><init>(Ljava/lang/String;)V

    invoke-interface {v11, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v5, Lx7/l;

    const/4 v1, 0x1

    const/4 v4, 0x0

    invoke-static {v3, v2, v5, v1, v4}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v1

    iget-wide v5, v0, LS/T$m;->D:J

    iget-object v14, v0, LS/T$m;->E:LV/w0;

    iget-object v13, v0, LS/T$m;->F:LW8/N;

    iget-object v15, v0, LS/T$m;->G:LB/D;

    iget-object v7, v0, LS/T$m;->H:LE7/i;

    iget-object v8, v0, LS/T$m;->I:LT/j;

    iget-object v9, v0, LS/T$m;->J:LS/P0;

    iget-object v10, v0, LS/T$m;->K:LT/f;

    iget-object v12, v0, LS/T$m;->L:LS/M;

    sget-object v16, LA/b;->a:LA/b;

    invoke-virtual/range {v16 .. v16}, LA/b;->g()LA/b$m;

    move-result-object v4

    sget-object v16, Lh0/c;->a:Lh0/c$a;

    invoke-virtual/range {v16 .. v16}, Lh0/c$a;->k()Lh0/c$b;

    move-result-object v0

    invoke-static {v4, v0, v11, v2}, LA/i;->a(LA/b$m;Lh0/c$b;LV/n;I)LD0/I;

    move-result-object v0

    invoke-static {v11, v2}, LV/k;->a(LV/n;I)I

    move-result v2

    invoke-interface/range {p2 .. p2}, LV/n;->F()LV/z;

    move-result-object v4

    invoke-static {v11, v1}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    sget-object v16, LF0/g;->a:LF0/g$a;

    move-object/from16 v17, v12

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->a()Lx7/a;

    move-result-object v12

    move-object/from16 p3, v10

    invoke-interface/range {p2 .. p2}, LV/n;->v()LV/g;

    move-result-object v10

    instance-of v10, v10, LV/g;

    if-nez v10, :cond_3

    invoke-static {}, LV/k;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LV/n;->t()V

    invoke-interface/range {p2 .. p2}, LV/n;->o()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v11, v12}, LV/n;->B(Lx7/a;)V

    goto :goto_0

    :cond_4
    invoke-interface/range {p2 .. p2}, LV/n;->H()V

    :goto_0
    invoke-static/range {p2 .. p2}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v10

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->c()Lx7/p;

    move-result-object v12

    invoke-static {v10, v0, v12}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->e()Lx7/p;

    move-result-object v0

    invoke-static {v10, v4, v0}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->b()Lx7/p;

    move-result-object v0

    invoke-interface {v10}, LV/n;->o()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {v10}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v4, v12}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v10, v4}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v10, v2, v0}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_6
    invoke-virtual/range {v16 .. v16}, LF0/g$a;->d()Lx7/p;

    move-result-object v0

    invoke-static {v10, v1, v0}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v0, LA/l;->a:LA/l;

    invoke-static {}, LS/T;->I()F

    move-result v0

    const/4 v1, 0x7

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sget-object v1, LS/Z;->a:LS/Z;

    invoke-virtual {v1}, LS/Z;->b()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/p;->j(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-static {}, LS/T;->G()F

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/compose/foundation/layout/m;->k(Landroidx/compose/ui/d;FFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-interface {v11, v14}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v11, v13}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-interface {v11, v15}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-interface {v11, v7}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-interface {v11, v8}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-interface/range {p2 .. p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_8

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_7

    goto :goto_1

    :cond_7
    move-object/from16 v0, v17

    goto :goto_2

    :cond_8
    :goto_1
    new-instance v2, LS/T$m$b;

    move-object/from16 v0, v17

    move-object v12, v2

    move-object/from16 v16, v7

    move-object/from16 v17, v8

    invoke-direct/range {v12 .. v17}, LS/T$m$b;-><init>(LW8/N;LV/w0;LB/D;LE7/i;LT/j;)V

    invoke-interface {v11, v2}, LV/n;->K(Ljava/lang/Object;)V

    :goto_2
    move-object v4, v2

    check-cast v4, Lx7/l;

    const/4 v10, 0x6

    move-wide v2, v5

    move-object v5, v9

    move-object/from16 v6, p3

    move-object v8, v0

    move-object/from16 v9, p2

    invoke-static/range {v1 .. v10}, LS/T;->y(Landroidx/compose/ui/d;JLx7/l;LS/P0;LT/f;LE7/i;LS/M;LV/n;I)V

    invoke-virtual {v0}, LS/M;->e()J

    move-result-wide v3

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v5, p2

    invoke-static/range {v1 .. v7}, LS/a0;->a(Landroidx/compose/ui/d;FJLV/n;II)V

    invoke-interface/range {p2 .. p2}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lt/e;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LS/T$m;->a(Lt/e;LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
