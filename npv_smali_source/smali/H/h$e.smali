.class final LH/h$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h;->a(LS0/V;Lx7/l;Landroidx/compose/ui/d;LM0/P;LS0/g0;Lx7/l;Lz/l;Lo0/n0;ZIILS0/s;LH/u;ZZLx7/q;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/q;

.field final synthetic E:LH/w;

.field final synthetic F:LM0/P;

.field final synthetic G:I

.field final synthetic H:I

.field final synthetic I:LH/Q;

.field final synthetic J:LS0/V;

.field final synthetic K:LS0/g0;

.field final synthetic L:Landroidx/compose/ui/d;

.field final synthetic M:Landroidx/compose/ui/d;

.field final synthetic N:Landroidx/compose/ui/d;

.field final synthetic O:Landroidx/compose/ui/d;

.field final synthetic P:LE/b;

.field final synthetic Q:LN/F;

.field final synthetic R:Z

.field final synthetic S:Z

.field final synthetic T:Lx7/l;

.field final synthetic U:LS0/L;

.field final synthetic V:LY0/e;


# direct methods
.method constructor <init>(Lx7/q;LH/w;LM0/P;IILH/Q;LS0/V;LS0/g0;Landroidx/compose/ui/d;Landroidx/compose/ui/d;Landroidx/compose/ui/d;Landroidx/compose/ui/d;LE/b;LN/F;ZZLx7/l;LS0/L;LY0/e;)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LH/h$e;->D:Lx7/q;

    move-object v1, p2

    iput-object v1, v0, LH/h$e;->E:LH/w;

    move-object v1, p3

    iput-object v1, v0, LH/h$e;->F:LM0/P;

    move v1, p4

    iput v1, v0, LH/h$e;->G:I

    move v1, p5

    iput v1, v0, LH/h$e;->H:I

    move-object v1, p6

    iput-object v1, v0, LH/h$e;->I:LH/Q;

    move-object v1, p7

    iput-object v1, v0, LH/h$e;->J:LS0/V;

    move-object v1, p8

    iput-object v1, v0, LH/h$e;->K:LS0/g0;

    move-object v1, p9

    iput-object v1, v0, LH/h$e;->L:Landroidx/compose/ui/d;

    move-object v1, p10

    iput-object v1, v0, LH/h$e;->M:Landroidx/compose/ui/d;

    move-object v1, p11

    iput-object v1, v0, LH/h$e;->N:Landroidx/compose/ui/d;

    move-object v1, p12

    iput-object v1, v0, LH/h$e;->O:Landroidx/compose/ui/d;

    move-object v1, p13

    iput-object v1, v0, LH/h$e;->P:LE/b;

    move-object/from16 v1, p14

    iput-object v1, v0, LH/h$e;->Q:LN/F;

    move/from16 v1, p15

    iput-boolean v1, v0, LH/h$e;->R:Z

    move/from16 v1, p16

    iput-boolean v1, v0, LH/h$e;->S:Z

    move-object/from16 v1, p17

    iput-object v1, v0, LH/h$e;->T:Lx7/l;

    move-object/from16 v1, p18

    iput-object v1, v0, LH/h$e;->U:LS0/L;

    move-object/from16 v1, p19

    iput-object v1, v0, LH/h$e;->V:LY0/e;

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 23

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)"

    const v5, -0x164ff220

    invoke-static {v5, v2, v3, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v2, v0, LH/h$e;->D:Lx7/q;

    new-instance v15, LH/h$e$a;

    move-object v3, v15

    iget-object v4, v0, LH/h$e;->E:LH/w;

    iget-object v5, v0, LH/h$e;->F:LM0/P;

    iget v6, v0, LH/h$e;->G:I

    iget v7, v0, LH/h$e;->H:I

    iget-object v8, v0, LH/h$e;->I:LH/Q;

    iget-object v9, v0, LH/h$e;->J:LS0/V;

    iget-object v10, v0, LH/h$e;->K:LS0/g0;

    iget-object v11, v0, LH/h$e;->L:Landroidx/compose/ui/d;

    iget-object v12, v0, LH/h$e;->M:Landroidx/compose/ui/d;

    iget-object v13, v0, LH/h$e;->N:Landroidx/compose/ui/d;

    iget-object v14, v0, LH/h$e;->O:Landroidx/compose/ui/d;

    move-object/from16 p2, v15

    iget-object v15, v0, LH/h$e;->P:LE/b;

    move-object/from16 v22, v2

    move-object/from16 v2, p2

    iget-object v1, v0, LH/h$e;->Q:LN/F;

    move-object/from16 v16, v1

    iget-boolean v1, v0, LH/h$e;->R:Z

    move/from16 v17, v1

    iget-boolean v1, v0, LH/h$e;->S:Z

    move/from16 v18, v1

    iget-object v1, v0, LH/h$e;->T:Lx7/l;

    move-object/from16 v19, v1

    iget-object v1, v0, LH/h$e;->U:LS0/L;

    move-object/from16 v20, v1

    iget-object v1, v0, LH/h$e;->V:LY0/e;

    move-object/from16 v21, v1

    invoke-direct/range {v3 .. v21}, LH/h$e$a;-><init>(LH/w;LM0/P;IILH/Q;LS0/V;LS0/g0;Landroidx/compose/ui/d;Landroidx/compose/ui/d;Landroidx/compose/ui/d;Landroidx/compose/ui/d;LE/b;LN/F;ZZLx7/l;LS0/L;LY0/e;)V

    const/16 v1, 0x36

    const v3, 0x7925855b

    const/4 v4, 0x1

    move-object/from16 v5, p1

    invoke-static {v3, v4, v2, v5, v1}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v22

    invoke-interface {v3, v1, v5, v2}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LH/h$e;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
