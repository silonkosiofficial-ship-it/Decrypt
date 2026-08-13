.class final LS/y0$c$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/y0$c;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS0/V;

.field final synthetic E:Z

.field final synthetic F:Z

.field final synthetic G:LS0/g0;

.field final synthetic H:Lz/l;

.field final synthetic I:Z

.field final synthetic J:Lx7/p;

.field final synthetic K:Lx7/p;

.field final synthetic L:Lx7/p;

.field final synthetic M:Lx7/p;

.field final synthetic N:Lx7/p;

.field final synthetic O:Lx7/p;

.field final synthetic P:Lx7/p;

.field final synthetic Q:LS/i1;

.field final synthetic R:Lo0/e2;


# direct methods
.method constructor <init>(LS0/V;ZZLS0/g0;Lz/l;ZLx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;LS/i1;Lo0/e2;)V
    .locals 0

    iput-object p1, p0, LS/y0$c$b;->D:LS0/V;

    iput-boolean p2, p0, LS/y0$c$b;->E:Z

    iput-boolean p3, p0, LS/y0$c$b;->F:Z

    iput-object p4, p0, LS/y0$c$b;->G:LS0/g0;

    iput-object p5, p0, LS/y0$c$b;->H:Lz/l;

    iput-boolean p6, p0, LS/y0$c$b;->I:Z

    iput-object p7, p0, LS/y0$c$b;->J:Lx7/p;

    iput-object p8, p0, LS/y0$c$b;->K:Lx7/p;

    iput-object p9, p0, LS/y0$c$b;->L:Lx7/p;

    iput-object p10, p0, LS/y0$c$b;->M:Lx7/p;

    iput-object p11, p0, LS/y0$c$b;->N:Lx7/p;

    iput-object p12, p0, LS/y0$c$b;->O:Lx7/p;

    iput-object p13, p0, LS/y0$c$b;->P:Lx7/p;

    iput-object p14, p0, LS/y0$c$b;->Q:LS/i1;

    iput-object p15, p0, LS/y0$c$b;->R:Lo0/e2;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lx7/p;LV/n;I)V
    .locals 26

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v3, p2

    and-int/lit8 v1, p3, 0x6

    move-object/from16 v15, p1

    if-nez v1, :cond_1

    invoke-interface {v3, v15}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    move v14, v1

    goto :goto_1

    :cond_1
    move/from16 v14, p3

    :goto_1
    and-int/lit8 v1, v14, 0x13

    const/16 v2, 0x12

    if-ne v1, v2, :cond_3

    invoke-interface/range {p2 .. p2}, LV/n;->u()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LV/n;->A()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:416)"

    const v4, -0x2d23ebe6

    invoke-static {v4, v14, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v1, LS/x0;->a:LS/x0;

    iget-object v2, v0, LS/y0$c$b;->D:LS0/V;

    invoke-virtual {v2}, LS0/V;->i()Ljava/lang/String;

    move-result-object v2

    iget-boolean v13, v0, LS/y0$c$b;->E:Z

    move v4, v13

    iget-boolean v5, v0, LS/y0$c$b;->F:Z

    iget-object v6, v0, LS/y0$c$b;->G:LS0/g0;

    iget-object v12, v0, LS/y0$c$b;->H:Lz/l;

    move-object v7, v12

    iget-boolean v11, v0, LS/y0$c$b;->I:Z

    move v8, v11

    iget-object v9, v0, LS/y0$c$b;->J:Lx7/p;

    iget-object v10, v0, LS/y0$c$b;->K:Lx7/p;

    move/from16 v16, v11

    iget-object v11, v0, LS/y0$c$b;->L:Lx7/p;

    move/from16 v19, v16

    move-object/from16 v16, v12

    iget-object v12, v0, LS/y0$c$b;->M:Lx7/p;

    move-object/from16 v20, v16

    move/from16 v16, v13

    iget-object v13, v0, LS/y0$c$b;->N:Lx7/p;

    move/from16 v18, v16

    move/from16 p3, v14

    iget-object v14, v0, LS/y0$c$b;->O:Lx7/p;

    move/from16 v23, p3

    iget-object v15, v0, LS/y0$c$b;->P:Lx7/p;

    move-object/from16 p3, v1

    iget-object v1, v0, LS/y0$c$b;->Q:LS/i1;

    move-object/from16 v16, v1

    move-object/from16 v24, v2

    new-instance v2, LS/y0$c$b$a;

    move/from16 v25, v4

    iget-object v4, v0, LS/y0$c$b;->R:Lo0/e2;

    move-object/from16 v17, v2

    move-object/from16 v21, v1

    move-object/from16 v22, v4

    invoke-direct/range {v17 .. v22}, LS/y0$c$b$a;-><init>(ZZLz/l;LS/i1;Lo0/e2;)V

    const/16 v1, 0x36

    const v4, 0xf3bb32d

    const/4 v0, 0x1

    invoke-static {v4, v0, v2, v3, v1}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v18

    shl-int/lit8 v0, v23, 0x3

    and-int/lit8 v20, v0, 0x70

    const/high16 v21, 0xd80000

    const v22, 0x8000

    const/16 v17, 0x0

    move-object/from16 v3, p1

    move-object/from16 v19, p2

    move-object/from16 v1, p3

    move-object/from16 v2, v24

    move/from16 v4, v25

    invoke-virtual/range {v1 .. v22}, LS/x0;->b(Ljava/lang/String;Lx7/p;ZZLS0/g0;Lz/j;ZLx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;LS/i1;LA/B;Lx7/p;LV/n;III)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    :goto_3
    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx7/p;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LS/y0$c$b;->a(Lx7/p;LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
