.class final LH/h$e$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h$e;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LH/w;

.field final synthetic E:LM0/P;

.field final synthetic F:I

.field final synthetic G:I

.field final synthetic H:LH/Q;

.field final synthetic I:LS0/V;

.field final synthetic J:LS0/g0;

.field final synthetic K:Landroidx/compose/ui/d;

.field final synthetic L:Landroidx/compose/ui/d;

.field final synthetic M:Landroidx/compose/ui/d;

.field final synthetic N:Landroidx/compose/ui/d;

.field final synthetic O:LE/b;

.field final synthetic P:LN/F;

.field final synthetic Q:Z

.field final synthetic R:Z

.field final synthetic S:Lx7/l;

.field final synthetic T:LS0/L;

.field final synthetic U:LY0/e;


# direct methods
.method constructor <init>(LH/w;LM0/P;IILH/Q;LS0/V;LS0/g0;Landroidx/compose/ui/d;Landroidx/compose/ui/d;Landroidx/compose/ui/d;Landroidx/compose/ui/d;LE/b;LN/F;ZZLx7/l;LS0/L;LY0/e;)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LH/h$e$a;->D:LH/w;

    move-object v1, p2

    iput-object v1, v0, LH/h$e$a;->E:LM0/P;

    move v1, p3

    iput v1, v0, LH/h$e$a;->F:I

    move v1, p4

    iput v1, v0, LH/h$e$a;->G:I

    move-object v1, p5

    iput-object v1, v0, LH/h$e$a;->H:LH/Q;

    move-object v1, p6

    iput-object v1, v0, LH/h$e$a;->I:LS0/V;

    move-object v1, p7

    iput-object v1, v0, LH/h$e$a;->J:LS0/g0;

    move-object v1, p8

    iput-object v1, v0, LH/h$e$a;->K:Landroidx/compose/ui/d;

    move-object v1, p9

    iput-object v1, v0, LH/h$e$a;->L:Landroidx/compose/ui/d;

    move-object v1, p10

    iput-object v1, v0, LH/h$e$a;->M:Landroidx/compose/ui/d;

    move-object v1, p11

    iput-object v1, v0, LH/h$e$a;->N:Landroidx/compose/ui/d;

    move-object v1, p12

    iput-object v1, v0, LH/h$e$a;->O:LE/b;

    move-object v1, p13

    iput-object v1, v0, LH/h$e$a;->P:LN/F;

    move/from16 v1, p14

    iput-boolean v1, v0, LH/h$e$a;->Q:Z

    move/from16 v1, p15

    iput-boolean v1, v0, LH/h$e$a;->R:Z

    move-object/from16 v1, p16

    iput-object v1, v0, LH/h$e$a;->S:Lx7/l;

    move-object/from16 v1, p17

    iput-object v1, v0, LH/h$e$a;->T:LS0/L;

    move-object/from16 v1, p18

    iput-object v1, v0, LH/h$e$a;->U:LY0/e;

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 11

    .prologue
    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LV/n;->A()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v2, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)"

    const v3, 0x7925855b

    invoke-static {v3, p2, v0, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    iget-object v0, p0, LH/h$e$a;->D:LH/w;

    invoke-virtual {v0}, LH/w;->k()F

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p2, v0, v2, v1, v3}, Landroidx/compose/foundation/layout/p;->i(Landroidx/compose/ui/d;FFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v0, p0, LH/h$e$a;->E:LM0/P;

    iget v1, p0, LH/h$e$a;->F:I

    iget v2, p0, LH/h$e$a;->G:I

    invoke-static {p2, v0, v1, v2}, LH/m;->a(Landroidx/compose/ui/d;LM0/P;II)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v0, p0, LH/h$e$a;->H:LH/Q;

    iget-object v1, p0, LH/h$e$a;->I:LS0/V;

    iget-object v2, p0, LH/h$e$a;->J:LS0/g0;

    iget-object v3, p0, LH/h$e$a;->D:LH/w;

    invoke-interface {p1, v3}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, p0, LH/h$e$a;->D:LH/w;

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_3

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_4

    :cond_3
    new-instance v5, LH/h$e$a$b;

    invoke-direct {v5, v4}, LH/h$e$a$b;-><init>(LH/w;)V

    invoke-interface {p1, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Lx7/a;

    invoke-static {p2, v0, v1, v2, v5}, LH/P;->c(Landroidx/compose/ui/d;LH/Q;LS0/V;LS0/g0;Lx7/a;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v0, p0, LH/h$e$a;->K:Landroidx/compose/ui/d;

    invoke-interface {p2, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v0, p0, LH/h$e$a;->L:Landroidx/compose/ui/d;

    invoke-interface {p2, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v0, p0, LH/h$e$a;->E:LM0/P;

    invoke-static {p2, v0}, LH/T;->a(Landroidx/compose/ui/d;LM0/P;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v0, p0, LH/h$e$a;->M:Landroidx/compose/ui/d;

    invoke-interface {p2, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v0, p0, LH/h$e$a;->N:Landroidx/compose/ui/d;

    invoke-interface {p2, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v0, p0, LH/h$e$a;->O:LE/b;

    invoke-static {p2, v0}, Landroidx/compose/foundation/relocation/b;->b(Landroidx/compose/ui/d;LE/b;)Landroidx/compose/ui/d;

    move-result-object p2

    new-instance v10, LH/h$e$a$a;

    iget-object v1, p0, LH/h$e$a;->P:LN/F;

    iget-object v2, p0, LH/h$e$a;->D:LH/w;

    iget-boolean v3, p0, LH/h$e$a;->Q:Z

    iget-boolean v4, p0, LH/h$e$a;->R:Z

    iget-object v5, p0, LH/h$e$a;->S:Lx7/l;

    iget-object v6, p0, LH/h$e$a;->I:LS0/V;

    iget-object v7, p0, LH/h$e$a;->T:LS0/L;

    iget-object v8, p0, LH/h$e$a;->U:LY0/e;

    iget v9, p0, LH/h$e$a;->G:I

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, LH/h$e$a$a;-><init>(LN/F;LH/w;ZZLx7/l;LS0/V;LS0/L;LY0/e;I)V

    const/16 v0, 0x36

    const v1, -0x15a57eaf

    const/4 v2, 0x1

    invoke-static {v1, v2, v10, p1, v0}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x0

    invoke-static {p2, v0, p1, v1, v2}, LN/C;->a(Landroidx/compose/ui/d;Lx7/p;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_5

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

    invoke-virtual {p0, p1, p2}, LH/h$e$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
