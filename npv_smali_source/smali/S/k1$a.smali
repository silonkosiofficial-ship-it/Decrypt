.class final LS/k1$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/k1;->a(Ljava/lang/String;Lx7/l;Landroidx/compose/ui/d;ZZLM0/P;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZLS0/g0;LH/v;LH/u;ZIILz/l;Lo0/e2;LS/i1;LV/n;IIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Z

.field final synthetic F:LS/i1;

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Lx7/l;

.field final synthetic I:Z

.field final synthetic J:Z

.field final synthetic K:LM0/P;

.field final synthetic L:LH/v;

.field final synthetic M:LH/u;

.field final synthetic N:Z

.field final synthetic O:I

.field final synthetic P:I

.field final synthetic Q:LS0/g0;

.field final synthetic R:Lz/l;

.field final synthetic S:Lx7/p;

.field final synthetic T:Lx7/p;

.field final synthetic U:Lx7/p;

.field final synthetic V:Lx7/p;

.field final synthetic W:Lx7/p;

.field final synthetic X:Lx7/p;

.field final synthetic Y:Lx7/p;

.field final synthetic Z:Lo0/e2;


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;ZLS/i1;Ljava/lang/String;Lx7/l;ZZLM0/P;LH/v;LH/u;ZIILS0/g0;Lz/l;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lo0/e2;)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LS/k1$a;->D:Landroidx/compose/ui/d;

    move v1, p2

    iput-boolean v1, v0, LS/k1$a;->E:Z

    move-object v1, p3

    iput-object v1, v0, LS/k1$a;->F:LS/i1;

    move-object v1, p4

    iput-object v1, v0, LS/k1$a;->G:Ljava/lang/String;

    move-object v1, p5

    iput-object v1, v0, LS/k1$a;->H:Lx7/l;

    move v1, p6

    iput-boolean v1, v0, LS/k1$a;->I:Z

    move v1, p7

    iput-boolean v1, v0, LS/k1$a;->J:Z

    move-object v1, p8

    iput-object v1, v0, LS/k1$a;->K:LM0/P;

    move-object v1, p9

    iput-object v1, v0, LS/k1$a;->L:LH/v;

    move-object v1, p10

    iput-object v1, v0, LS/k1$a;->M:LH/u;

    move v1, p11

    iput-boolean v1, v0, LS/k1$a;->N:Z

    move v1, p12

    iput v1, v0, LS/k1$a;->O:I

    move v1, p13

    iput v1, v0, LS/k1$a;->P:I

    move-object/from16 v1, p14

    iput-object v1, v0, LS/k1$a;->Q:LS0/g0;

    move-object/from16 v1, p15

    iput-object v1, v0, LS/k1$a;->R:Lz/l;

    move-object/from16 v1, p16

    iput-object v1, v0, LS/k1$a;->S:Lx7/p;

    move-object/from16 v1, p17

    iput-object v1, v0, LS/k1$a;->T:Lx7/p;

    move-object/from16 v1, p18

    iput-object v1, v0, LS/k1$a;->U:Lx7/p;

    move-object/from16 v1, p19

    iput-object v1, v0, LS/k1$a;->V:Lx7/p;

    move-object/from16 v1, p20

    iput-object v1, v0, LS/k1$a;->W:Lx7/p;

    move-object/from16 v1, p21

    iput-object v1, v0, LS/k1$a;->X:Lx7/p;

    move-object/from16 v1, p22

    iput-object v1, v0, LS/k1$a;->Y:Lx7/p;

    move-object/from16 v1, p23

    iput-object v1, v0, LS/k1$a;->Z:Lo0/e2;

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 44

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v13, p1

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

    const-string v3, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:231)"

    const v4, 0x6ed05103

    invoke-static {v4, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, LS/k1$a;->D:Landroidx/compose/ui/d;

    iget-boolean v2, v0, LS/k1$a;->E:Z

    sget-object v3, LT/x;->a:LT/x$a;

    sget v3, Lh0/m;->a:I

    invoke-static {v3}, LT/x;->a(I)I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v3, v13, v4}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, LT/A;->i(Landroidx/compose/ui/d;ZLjava/lang/String;)Landroidx/compose/ui/d;

    move-result-object v1

    sget-object v2, LS/j1;->a:LS/j1;

    invoke-virtual {v2}, LS/j1;->k()F

    move-result v3

    invoke-virtual {v2}, LS/j1;->j()F

    move-result v2

    invoke-static {v1, v3, v2}, Landroidx/compose/foundation/layout/p;->a(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;

    move-result-object v3

    new-instance v1, Lo0/f2;

    move-object v15, v1

    iget-object v2, v0, LS/k1$a;->F:LS/i1;

    iget-boolean v4, v0, LS/k1$a;->E:Z

    invoke-virtual {v2, v4}, LS/i1;->b(Z)J

    move-result-wide v4

    const/4 v2, 0x0

    invoke-direct {v1, v4, v5, v2}, Lo0/f2;-><init>(JLy7/k;)V

    iget-object v14, v0, LS/k1$a;->G:Ljava/lang/String;

    move-object v1, v14

    iget-object v2, v0, LS/k1$a;->H:Lx7/l;

    iget-boolean v12, v0, LS/k1$a;->I:Z

    move v4, v12

    iget-boolean v5, v0, LS/k1$a;->J:Z

    iget-object v6, v0, LS/k1$a;->K:LM0/P;

    iget-object v7, v0, LS/k1$a;->L:LH/v;

    iget-object v8, v0, LS/k1$a;->M:LH/u;

    iget-boolean v11, v0, LS/k1$a;->N:Z

    move v9, v11

    iget v10, v0, LS/k1$a;->O:I

    move/from16 v16, v11

    iget v11, v0, LS/k1$a;->P:I

    move/from16 v19, v16

    move-object/from16 p2, v1

    iget-object v1, v0, LS/k1$a;->Q:LS0/g0;

    move/from16 v18, v12

    move-object v12, v1

    move-object/from16 v32, v2

    iget-object v2, v0, LS/k1$a;->R:Lz/l;

    move-object/from16 v17, v14

    move-object v14, v2

    move-object/from16 v33, v3

    new-instance v3, LS/k1$a$a;

    move/from16 v34, v4

    iget-boolean v4, v0, LS/k1$a;->E:Z

    move/from16 v35, v5

    iget-object v5, v0, LS/k1$a;->S:Lx7/p;

    move-object/from16 v36, v6

    iget-object v6, v0, LS/k1$a;->T:Lx7/p;

    move-object/from16 v37, v7

    iget-object v7, v0, LS/k1$a;->U:Lx7/p;

    move-object/from16 v38, v8

    iget-object v8, v0, LS/k1$a;->V:Lx7/p;

    move/from16 v39, v9

    iget-object v9, v0, LS/k1$a;->W:Lx7/p;

    move/from16 v40, v10

    iget-object v10, v0, LS/k1$a;->X:Lx7/p;

    move/from16 v41, v11

    iget-object v11, v0, LS/k1$a;->Y:Lx7/p;

    move-object/from16 v42, v12

    iget-object v12, v0, LS/k1$a;->Z:Lo0/e2;

    move-object/from16 v43, v14

    iget-object v14, v0, LS/k1$a;->F:LS/i1;

    move-object/from16 v16, v3

    move-object/from16 v20, v1

    move-object/from16 v21, v2

    move/from16 v22, v4

    move-object/from16 v23, v5

    move-object/from16 v24, v6

    move-object/from16 v25, v7

    move-object/from16 v26, v8

    move-object/from16 v27, v9

    move-object/from16 v28, v10

    move-object/from16 v29, v11

    move-object/from16 v30, v12

    move-object/from16 v31, v14

    invoke-direct/range {v16 .. v31}, LS/k1$a$a;-><init>(Ljava/lang/String;ZZLS0/g0;Lz/l;ZLx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lo0/e2;LS/i1;)V

    const/16 v1, 0x36

    const v2, -0x112dc373

    const/4 v4, 0x1

    invoke-static {v2, v4, v3, v13, v1}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v16

    const/high16 v19, 0x30000

    const/16 v20, 0x1000

    const/4 v1, 0x0

    move-object v13, v1

    const/16 v18, 0x0

    move-object/from16 v17, p1

    move-object/from16 v1, p2

    move-object/from16 v2, v32

    move-object/from16 v3, v33

    move/from16 v4, v34

    move/from16 v5, v35

    move-object/from16 v6, v36

    move-object/from16 v7, v37

    move-object/from16 v8, v38

    move/from16 v9, v39

    move/from16 v10, v40

    move/from16 v11, v41

    move-object/from16 v12, v42

    move-object/from16 v14, v43

    invoke-static/range {v1 .. v20}, LH/b;->b(Ljava/lang/String;Lx7/l;Landroidx/compose/ui/d;ZZLM0/P;LH/v;LH/u;ZIILS0/g0;Lx7/l;Lz/l;Lo0/n0;Lx7/q;LV/n;III)V

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

    invoke-virtual {p0, p1, p2}, LS/k1$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
