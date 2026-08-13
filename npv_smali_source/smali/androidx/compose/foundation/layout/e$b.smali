.class final Landroidx/compose/foundation/layout/e$b;
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
.field final synthetic D:LD0/X;

.field final synthetic E:LD0/G;

.field final synthetic F:LD0/M;

.field final synthetic G:I

.field final synthetic H:I

.field final synthetic I:Landroidx/compose/foundation/layout/e;


# direct methods
.method constructor <init>(LD0/X;LD0/G;LD0/M;IILandroidx/compose/foundation/layout/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/e$b;->D:LD0/X;

    iput-object p2, p0, Landroidx/compose/foundation/layout/e$b;->E:LD0/G;

    iput-object p3, p0, Landroidx/compose/foundation/layout/e$b;->F:LD0/M;

    iput p4, p0, Landroidx/compose/foundation/layout/e$b;->G:I

    iput p5, p0, Landroidx/compose/foundation/layout/e$b;->H:I

    iput-object p6, p0, Landroidx/compose/foundation/layout/e$b;->I:Landroidx/compose/foundation/layout/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 7

    iget-object v1, p0, Landroidx/compose/foundation/layout/e$b;->D:LD0/X;

    iget-object v2, p0, Landroidx/compose/foundation/layout/e$b;->E:LD0/G;

    iget-object v0, p0, Landroidx/compose/foundation/layout/e$b;->F:LD0/M;

    invoke-interface {v0}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v3

    iget v4, p0, Landroidx/compose/foundation/layout/e$b;->G:I

    iget v5, p0, Landroidx/compose/foundation/layout/e$b;->H:I

    iget-object v0, p0, Landroidx/compose/foundation/layout/e$b;->I:Landroidx/compose/foundation/layout/e;

    invoke-static {v0}, Landroidx/compose/foundation/layout/e;->d(Landroidx/compose/foundation/layout/e;)Lh0/c;

    move-result-object v6

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/d;->c(LD0/X$a;LD0/X;LD0/G;LY0/v;IILh0/c;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/e$b;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
