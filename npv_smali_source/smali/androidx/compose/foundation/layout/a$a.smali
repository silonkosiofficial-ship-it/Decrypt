.class final Landroidx/compose/foundation/layout/a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/a;->c(LD0/M;LD0/a;FFLD0/G;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/a;

.field final synthetic E:F

.field final synthetic F:I

.field final synthetic G:I

.field final synthetic H:I

.field final synthetic I:LD0/X;

.field final synthetic J:I


# direct methods
.method constructor <init>(LD0/a;FIIILD0/X;I)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/a$a;->D:LD0/a;

    iput p2, p0, Landroidx/compose/foundation/layout/a$a;->E:F

    iput p3, p0, Landroidx/compose/foundation/layout/a$a;->F:I

    iput p4, p0, Landroidx/compose/foundation/layout/a$a;->G:I

    iput p5, p0, Landroidx/compose/foundation/layout/a$a;->H:I

    iput-object p6, p0, Landroidx/compose/foundation/layout/a$a;->I:LD0/X;

    iput p7, p0, Landroidx/compose/foundation/layout/a$a;->J:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 9

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/layout/a$a;->D:LD0/a;

    invoke-static {v0}, Landroidx/compose/foundation/layout/a;->b(LD0/a;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v4, v1

    goto :goto_1

    :cond_0
    iget v0, p0, Landroidx/compose/foundation/layout/a$a;->E:F

    sget-object v2, LY0/i;->D:LY0/i$a;

    invoke-virtual {v2}, LY0/i$a;->c()F

    move-result v2

    invoke-static {v0, v2}, LY0/i;->s(FF)Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Landroidx/compose/foundation/layout/a$a;->F:I

    :goto_0
    move v4, v0

    goto :goto_1

    :cond_1
    iget v0, p0, Landroidx/compose/foundation/layout/a$a;->G:I

    iget v2, p0, Landroidx/compose/foundation/layout/a$a;->H:I

    sub-int/2addr v0, v2

    iget-object v2, p0, Landroidx/compose/foundation/layout/a$a;->I:LD0/X;

    invoke-virtual {v2}, LD0/X;->I0()I

    move-result v2

    sub-int/2addr v0, v2

    goto :goto_0

    :goto_1
    iget-object v0, p0, Landroidx/compose/foundation/layout/a$a;->D:LD0/a;

    invoke-static {v0}, Landroidx/compose/foundation/layout/a;->b(LD0/a;)Z

    move-result v0

    if-nez v0, :cond_2

    :goto_2
    move v5, v1

    goto :goto_3

    :cond_2
    iget v0, p0, Landroidx/compose/foundation/layout/a$a;->E:F

    sget-object v1, LY0/i;->D:LY0/i$a;

    invoke-virtual {v1}, LY0/i$a;->c()F

    move-result v1

    invoke-static {v0, v1}, LY0/i;->s(FF)Z

    move-result v0

    if-nez v0, :cond_3

    iget v1, p0, Landroidx/compose/foundation/layout/a$a;->F:I

    goto :goto_2

    :cond_3
    iget v0, p0, Landroidx/compose/foundation/layout/a$a;->J:I

    iget v1, p0, Landroidx/compose/foundation/layout/a$a;->H:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Landroidx/compose/foundation/layout/a$a;->I:LD0/X;

    invoke-virtual {v1}, LD0/X;->w0()I

    move-result v1

    sub-int v1, v0, v1

    goto :goto_2

    :goto_3
    iget-object v3, p0, Landroidx/compose/foundation/layout/a$a;->I:LD0/X;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/a$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
