.class final Landroidx/compose/foundation/layout/e$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/e;->b(LD0/M;Ljava/util/List;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:[LD0/X;

.field final synthetic E:Ljava/util/List;

.field final synthetic F:LD0/M;

.field final synthetic G:Ly7/M;

.field final synthetic H:Ly7/M;

.field final synthetic I:Landroidx/compose/foundation/layout/e;


# direct methods
.method constructor <init>([LD0/X;Ljava/util/List;LD0/M;Ly7/M;Ly7/M;Landroidx/compose/foundation/layout/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/e$c;->D:[LD0/X;

    iput-object p2, p0, Landroidx/compose/foundation/layout/e$c;->E:Ljava/util/List;

    iput-object p3, p0, Landroidx/compose/foundation/layout/e$c;->F:LD0/M;

    iput-object p4, p0, Landroidx/compose/foundation/layout/e$c;->G:Ly7/M;

    iput-object p5, p0, Landroidx/compose/foundation/layout/e$c;->H:Ly7/M;

    iput-object p6, p0, Landroidx/compose/foundation/layout/e$c;->I:Landroidx/compose/foundation/layout/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 18

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/foundation/layout/e$c;->D:[LD0/X;

    iget-object v2, v0, Landroidx/compose/foundation/layout/e$c;->E:Ljava/util/List;

    iget-object v3, v0, Landroidx/compose/foundation/layout/e$c;->F:LD0/M;

    iget-object v4, v0, Landroidx/compose/foundation/layout/e$c;->G:Ly7/M;

    iget-object v5, v0, Landroidx/compose/foundation/layout/e$c;->H:Ly7/M;

    iget-object v6, v0, Landroidx/compose/foundation/layout/e$c;->I:Landroidx/compose/foundation/layout/e;

    array-length v7, v1

    const/4 v8, 0x0

    move v9, v8

    :goto_0
    if-ge v8, v7, :cond_0

    aget-object v11, v1, v8

    add-int/lit8 v17, v9, 0x1

    const-string v10, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable"

    invoke-static {v11, v10}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, LD0/G;

    invoke-interface {v3}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v13

    iget v14, v4, Ly7/M;->C:I

    iget v15, v5, Ly7/M;->C:I

    invoke-static {v6}, Landroidx/compose/foundation/layout/e;->d(Landroidx/compose/foundation/layout/e;)Lh0/c;

    move-result-object v16

    move-object/from16 v10, p1

    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/layout/d;->c(LD0/X$a;LD0/X;LD0/G;LY0/v;IILh0/c;)V

    add-int/lit8 v8, v8, 0x1

    move/from16 v9, v17

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/e$c;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
