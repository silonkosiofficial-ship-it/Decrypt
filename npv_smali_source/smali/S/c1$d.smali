.class final LS/c1$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/c1;->b(ZLx7/a;Landroidx/compose/ui/d;ZLo0/e2;JJFFLv/g;Lz/l;Lx7/p;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Lo0/e2;

.field final synthetic F:J

.field final synthetic G:F

.field final synthetic H:Lv/g;

.field final synthetic I:Z

.field final synthetic J:Lz/l;

.field final synthetic K:Z

.field final synthetic L:Lx7/a;

.field final synthetic M:F

.field final synthetic N:Lx7/p;


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;Lo0/e2;JFLv/g;ZLz/l;ZLx7/a;FLx7/p;)V
    .locals 0

    iput-object p1, p0, LS/c1$d;->D:Landroidx/compose/ui/d;

    iput-object p2, p0, LS/c1$d;->E:Lo0/e2;

    iput-wide p3, p0, LS/c1$d;->F:J

    iput p5, p0, LS/c1$d;->G:F

    iput-object p6, p0, LS/c1$d;->H:Lv/g;

    iput-boolean p7, p0, LS/c1$d;->I:Z

    iput-object p8, p0, LS/c1$d;->J:Lz/l;

    iput-boolean p9, p0, LS/c1$d;->K:Z

    iput-object p10, p0, LS/c1$d;->L:Lx7/a;

    iput p11, p0, LS/c1$d;->M:F

    iput-object p12, p0, LS/c1$d;->N:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 19

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v8, p1

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

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:312)"

    const v4, -0x45699780

    invoke-static {v4, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, LS/c1$d;->D:Landroidx/compose/ui/d;

    invoke-static {v1}, LS/k0;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v2

    iget-object v3, v0, LS/c1$d;->E:Lo0/e2;

    iget-wide v4, v0, LS/c1$d;->F:J

    iget v1, v0, LS/c1$d;->G:F

    const/4 v9, 0x0

    invoke-static {v4, v5, v1, v8, v9}, LS/c1;->e(JFLV/n;I)J

    move-result-wide v4

    iget-object v6, v0, LS/c1$d;->H:Lv/g;

    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object v1

    invoke-interface {v8, v1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v1

    iget v7, v0, LS/c1$d;->M:F

    check-cast v1, LY0/e;

    invoke-interface {v1, v7}, LY0/e;->B0(F)F

    move-result v7

    invoke-static/range {v2 .. v7}, LS/c1;->d(Landroidx/compose/ui/d;Lo0/e2;JLv/g;F)Landroidx/compose/ui/d;

    move-result-object v10

    iget-boolean v11, v0, LS/c1$d;->I:Z

    iget-object v12, v0, LS/c1$d;->J:Lz/l;

    const/4 v6, 0x0

    const/4 v7, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v1 .. v7}, LS/I0;->c(ZFJLV/n;II)Lv/G;

    move-result-object v13

    iget-boolean v14, v0, LS/c1$d;->K:Z

    iget-object v1, v0, LS/c1$d;->L:Lx7/a;

    const/16 v17, 0x10

    const/16 v18, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v1

    invoke-static/range {v10 .. v18}, Landroidx/compose/foundation/selection/a;->b(Landroidx/compose/ui/d;ZLz/l;Lv/G;ZLK0/h;Lx7/a;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v1

    iget-object v2, v0, LS/c1$d;->N:Lx7/p;

    sget-object v3, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v3}, Lh0/c$a;->o()Lh0/c;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v3

    invoke-static {v8, v9}, LV/k;->a(LV/n;I)I

    move-result v4

    invoke-interface/range {p1 .. p1}, LV/n;->F()LV/z;

    move-result-object v5

    invoke-static {v8, v1}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    sget-object v6, LF0/g;->a:LF0/g$a;

    invoke-virtual {v6}, LF0/g$a;->a()Lx7/a;

    move-result-object v7

    invoke-interface/range {p1 .. p1}, LV/n;->v()LV/g;

    move-result-object v10

    instance-of v10, v10, LV/g;

    if-nez v10, :cond_3

    invoke-static {}, LV/k;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LV/n;->t()V

    invoke-interface/range {p1 .. p1}, LV/n;->o()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v8, v7}, LV/n;->B(Lx7/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LV/n;->H()V

    :goto_1
    invoke-static/range {p1 .. p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v7

    invoke-virtual {v6}, LF0/g$a;->c()Lx7/p;

    move-result-object v10

    invoke-static {v7, v3, v10}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v6}, LF0/g$a;->e()Lx7/p;

    move-result-object v3

    invoke-static {v7, v5, v3}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v6}, LF0/g$a;->b()Lx7/p;

    move-result-object v3

    invoke-interface {v7}, LV/n;->o()Z

    move-result v5

    if-nez v5, :cond_5

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, v3}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_6
    invoke-virtual {v6}, LF0/g$a;->d()Lx7/p;

    move-result-object v3

    invoke-static {v7, v1, v3}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v8, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LV/q;->P()V

    :cond_7
    :goto_2
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/c1$d;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
