.class final Landroidx/compose/foundation/k$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/k;->b(Landroidx/compose/ui/d;Landroidx/compose/foundation/m;ZLx/p;ZZ)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/foundation/m;

.field final synthetic E:Z

.field final synthetic F:Lx/p;

.field final synthetic G:Z

.field final synthetic H:Z


# direct methods
.method constructor <init>(Landroidx/compose/foundation/m;ZLx/p;ZZ)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/k$c;->D:Landroidx/compose/foundation/m;

    iput-boolean p2, p0, Landroidx/compose/foundation/k$c;->E:Z

    iput-object p3, p0, Landroidx/compose/foundation/k$c;->F:Lx/p;

    iput-boolean p4, p0, Landroidx/compose/foundation/k$c;->G:Z

    iput-boolean p5, p0, Landroidx/compose/foundation/k$c;->H:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
    .locals 14

    .prologue
    move-object v0, p0

    const v1, 0x581dd9c4

    move-object/from16 v13, p2

    invoke-interface {v13, v1}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:276)"

    move/from16 v4, p3

    invoke-static {v1, v4, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    new-instance v8, Landroidx/compose/foundation/ScrollSemanticsElement;

    iget-object v3, v0, Landroidx/compose/foundation/k$c;->D:Landroidx/compose/foundation/m;

    iget-boolean v4, v0, Landroidx/compose/foundation/k$c;->E:Z

    iget-object v5, v0, Landroidx/compose/foundation/k$c;->F:Lx/p;

    iget-boolean v6, v0, Landroidx/compose/foundation/k$c;->G:Z

    iget-boolean v7, v0, Landroidx/compose/foundation/k$c;->H:Z

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/ScrollSemanticsElement;-><init>(Landroidx/compose/foundation/m;ZLx/p;ZZ)V

    invoke-virtual {v1, v8}, Landroidx/compose/ui/d$a;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v2

    iget-object v3, v0, Landroidx/compose/foundation/k$c;->D:Landroidx/compose/foundation/m;

    iget-boolean v1, v0, Landroidx/compose/foundation/k$c;->H:Z

    if-eqz v1, :cond_1

    sget-object v1, Lx/s;->C:Lx/s;

    :goto_0
    move-object v4, v1

    goto :goto_1

    :cond_1
    sget-object v1, Lx/s;->D:Lx/s;

    goto :goto_0

    :goto_1
    iget-boolean v5, v0, Landroidx/compose/foundation/k$c;->G:Z

    iget-boolean v6, v0, Landroidx/compose/foundation/k$c;->E:Z

    iget-object v7, v0, Landroidx/compose/foundation/k$c;->F:Lx/p;

    invoke-virtual {v3}, Landroidx/compose/foundation/m;->j()Lz/l;

    move-result-object v8

    const/4 v11, 0x0

    const/16 v12, 0x40

    const/4 v9, 0x0

    move-object/from16 v10, p2

    invoke-static/range {v2 .. v12}, Lv/a0;->a(Landroidx/compose/ui/d;Lx/A;Lx/s;ZZLx/p;Lz/l;Lx/f;LV/n;II)Landroidx/compose/ui/d;

    move-result-object v1

    new-instance v2, Landroidx/compose/foundation/ScrollingLayoutElement;

    iget-object v3, v0, Landroidx/compose/foundation/k$c;->D:Landroidx/compose/foundation/m;

    iget-boolean v4, v0, Landroidx/compose/foundation/k$c;->E:Z

    iget-boolean v5, v0, Landroidx/compose/foundation/k$c;->H:Z

    invoke-direct {v2, v3, v4, v5}, Landroidx/compose/foundation/ScrollingLayoutElement;-><init>(Landroidx/compose/foundation/m;ZZ)V

    invoke-interface {v1, v2}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, LV/q;->P()V

    :cond_2
    invoke-interface/range {p2 .. p2}, LV/n;->J()V

    return-object v1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/d;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/k$c;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
