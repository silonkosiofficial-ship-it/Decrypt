.class final LS/f$i;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/f;->d(Landroidx/compose/ui/d;Lx7/p;LM0/P;ZLx7/p;Lx7/q;FLA/S;LS/w1;LS/y1;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LA/S;

.field final synthetic E:F

.field final synthetic F:LS/w1;

.field final synthetic G:Lx7/p;

.field final synthetic H:LM0/P;

.field final synthetic I:Z

.field final synthetic J:Lx7/p;

.field final synthetic K:Lx7/p;


# direct methods
.method constructor <init>(LA/S;FLS/y1;LS/w1;Lx7/p;LM0/P;ZLx7/p;Lx7/p;)V
    .locals 0

    iput-object p1, p0, LS/f$i;->D:LA/S;

    iput p2, p0, LS/f$i;->E:F

    iput-object p4, p0, LS/f$i;->F:LS/w1;

    iput-object p5, p0, LS/f$i;->G:Lx7/p;

    iput-object p6, p0, LS/f$i;->H:LM0/P;

    iput-boolean p7, p0, LS/f$i;->I:Z

    iput-object p8, p0, LS/f$i;->J:Lx7/p;

    iput-object p9, p0, LS/f$i;->K:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LS/y1;)F
    .locals 0

    invoke-static {p0}, LS/f$i;->f(LS/y1;)F

    move-result p0

    return p0
.end method

.method private static final f(LS/y1;)F
    .locals 0

    .prologue
    if-eqz p0, :cond_0

    invoke-interface {p0}, LS/y1;->getState()LS/z1;

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final e(LV/n;I)V
    .locals 21

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

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1927)"

    const v4, -0x73db1c9a

    invoke-static {v4, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    iget-object v2, v0, LS/f$i;->D:LA/S;

    invoke-static {v1, v2}, LA/V;->c(Landroidx/compose/ui/d;LA/S;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-static {v1}, Ll0/e;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    iget v2, v0, LS/f$i;->E:F

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v4, v2, v3, v5}, Landroidx/compose/foundation/layout/p;->i(Landroidx/compose/ui/d;FFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-interface {v13, v5}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p1 .. p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_4

    :cond_3
    new-instance v3, LS/g;

    invoke-direct {v3, v5}, LS/g;-><init>(LS/y1;)V

    invoke-interface {v13, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v2, v3

    check-cast v2, LS/N0;

    iget-object v3, v0, LS/f$i;->F:LS/w1;

    invoke-virtual {v3}, LS/w1;->c()J

    move-result-wide v3

    iget-object v5, v0, LS/f$i;->F:LS/w1;

    invoke-virtual {v5}, LS/w1;->d()J

    move-result-wide v5

    iget-object v7, v0, LS/f$i;->F:LS/w1;

    invoke-virtual {v7}, LS/w1;->b()J

    move-result-wide v7

    iget-object v9, v0, LS/f$i;->G:Lx7/p;

    iget-object v10, v0, LS/f$i;->H:LM0/P;

    sget-object v11, LA/b;->a:LA/b;

    invoke-virtual {v11}, LA/b;->b()LA/b$f;

    move-result-object v12

    iget-boolean v14, v0, LS/f$i;->I:Z

    if-eqz v14, :cond_5

    invoke-virtual {v11}, LA/b;->b()LA/b$f;

    move-result-object v11

    :goto_1
    move-object/from16 v18, v11

    goto :goto_2

    :cond_5
    invoke-virtual {v11}, LA/b;->f()LA/b$e;

    move-result-object v11

    goto :goto_1

    :goto_2
    iget-object v11, v0, LS/f$i;->J:Lx7/p;

    move-object/from16 v16, v11

    iget-object v11, v0, LS/f$i;->K:Lx7/p;

    move-object/from16 v17, v11

    const/high16 v19, 0x6c00000

    const/16 v20, 0xc36

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v13, v18

    move-object/from16 v18, p1

    invoke-static/range {v1 .. v20}, LS/f;->i(Landroidx/compose/ui/d;LS/N0;JJJLx7/p;LM0/P;FLA/b$m;LA/b$e;IZLx7/p;Lx7/p;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LV/q;->P()V

    :cond_6
    :goto_3
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/f$i;->e(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
