.class final LH/M$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/M;->a(Landroidx/compose/ui/d;LH/w;LN/F;LS0/V;Lx7/l;ZZLS0/L;LH/Y;I)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LH/w;

.field final synthetic E:LN/F;

.field final synthetic F:LS0/V;

.field final synthetic G:Z

.field final synthetic H:Z

.field final synthetic I:LS0/L;

.field final synthetic J:LH/Y;

.field final synthetic K:Lx7/l;

.field final synthetic L:I


# direct methods
.method constructor <init>(LH/w;LN/F;LS0/V;ZZLS0/L;LH/Y;Lx7/l;I)V
    .locals 0

    iput-object p1, p0, LH/M$a;->D:LH/w;

    iput-object p2, p0, LH/M$a;->E:LN/F;

    iput-object p3, p0, LH/M$a;->F:LS0/V;

    iput-boolean p4, p0, LH/M$a;->G:Z

    iput-boolean p5, p0, LH/M$a;->H:Z

    iput-object p6, p0, LH/M$a;->I:LS0/L;

    iput-object p7, p0, LH/M$a;->J:LH/Y;

    iput-object p8, p0, LH/M$a;->K:Lx7/l;

    iput p9, p0, LH/M$a;->L:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
    .locals 20

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const v2, 0x32c59664

    invoke-interface {v1, v2}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)"

    move/from16 v5, p3

    invoke-static {v2, v5, v3, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface/range {p2 .. p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_1

    new-instance v2, LN/I;

    invoke-direct {v2}, LN/I;-><init>()V

    invoke-interface {v1, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1
    move-object v10, v2

    check-cast v10, LN/I;

    invoke-interface/range {p2 .. p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_2

    new-instance v2, LH/i;

    invoke-direct {v2}, LH/i;-><init>()V

    invoke-interface {v1, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v13, v2

    check-cast v13, LH/i;

    new-instance v2, LH/L;

    iget-object v5, v0, LH/M$a;->D:LH/w;

    iget-object v6, v0, LH/M$a;->E:LN/F;

    iget-object v7, v0, LH/M$a;->F:LS0/V;

    iget-boolean v8, v0, LH/M$a;->G:Z

    iget-boolean v9, v0, LH/M$a;->H:Z

    iget-object v11, v0, LH/M$a;->I:LS0/L;

    iget-object v12, v0, LH/M$a;->J:LH/Y;

    iget-object v15, v0, LH/M$a;->K:Lx7/l;

    iget v14, v0, LH/M$a;->L:I

    const/16 v17, 0x200

    const/16 v18, 0x0

    const/16 v16, 0x0

    move-object v4, v2

    move/from16 v19, v14

    move-object/from16 v14, v16

    move/from16 v16, v19

    invoke-direct/range {v4 .. v18}, LH/L;-><init>(LH/w;LN/F;LS0/V;ZZLN/I;LS0/L;LH/Y;LH/i;LH/q;Lx7/l;IILy7/k;)V

    sget-object v4, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-interface {v1, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface/range {p2 .. p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_3

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v6, v3, :cond_4

    :cond_3
    new-instance v6, LH/M$a$a;

    invoke-direct {v6, v2}, LH/M$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, LF7/f;

    check-cast v6, Lx7/l;

    invoke-static {v4, v6}, Landroidx/compose/ui/input/key/a;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object v2

    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LV/n;->J()V

    return-object v2
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/d;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LH/M$a;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
