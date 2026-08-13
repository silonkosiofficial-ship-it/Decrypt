.class final LS/e$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/e;->a(ZLx7/a;Landroidx/compose/ui/d;JLandroidx/compose/foundation/m;Landroidx/compose/ui/window/s;Lo0/e2;JFFLv/g;Lx7/q;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Lu/Z;

.field final synthetic F:LV/w0;

.field final synthetic G:Landroidx/compose/foundation/m;

.field final synthetic H:Lo0/e2;

.field final synthetic I:J

.field final synthetic J:F

.field final synthetic K:F

.field final synthetic L:Lv/g;

.field final synthetic M:Lx7/q;


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;Lu/Z;LV/w0;Landroidx/compose/foundation/m;Lo0/e2;JFFLv/g;Lx7/q;)V
    .locals 0

    iput-object p1, p0, LS/e$a;->D:Landroidx/compose/ui/d;

    iput-object p2, p0, LS/e$a;->E:Lu/Z;

    iput-object p3, p0, LS/e$a;->F:LV/w0;

    iput-object p4, p0, LS/e$a;->G:Landroidx/compose/foundation/m;

    iput-object p5, p0, LS/e$a;->H:Lo0/e2;

    iput-wide p6, p0, LS/e$a;->I:J

    iput p8, p0, LS/e$a;->J:F

    iput p9, p0, LS/e$a;->K:F

    iput-object p10, p0, LS/e$a;->L:Lv/g;

    iput-object p11, p0, LS/e$a;->M:Lx7/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 18

    .prologue
    move-object/from16 v0, p0

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:73)"

    const v4, 0x7ec6f865

    invoke-static {v4, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v5, v0, LS/e$a;->D:Landroidx/compose/ui/d;

    iget-object v6, v0, LS/e$a;->E:Lu/Z;

    iget-object v7, v0, LS/e$a;->F:LV/w0;

    iget-object v8, v0, LS/e$a;->G:Landroidx/compose/foundation/m;

    iget-object v9, v0, LS/e$a;->H:Lo0/e2;

    iget-wide v10, v0, LS/e$a;->I:J

    iget v12, v0, LS/e$a;->J:F

    iget v13, v0, LS/e$a;->K:F

    iget-object v14, v0, LS/e$a;->L:Lv/g;

    iget-object v15, v0, LS/e$a;->M:Lx7/q;

    sget v1, Lu/Z;->d:I

    shl-int/lit8 v1, v1, 0x3

    or-int/lit16 v1, v1, 0x180

    move-object/from16 v16, p1

    move/from16 v17, v1

    invoke-static/range {v5 .. v17}, LS/s0;->a(Landroidx/compose/ui/d;Lu/Z;LV/w0;Landroidx/compose/foundation/m;Lo0/e2;JFFLv/g;Lx7/q;LV/n;I)V

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

    invoke-virtual {p0, p1, p2}, LS/e$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
