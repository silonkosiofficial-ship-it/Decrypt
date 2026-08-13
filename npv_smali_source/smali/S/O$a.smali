.class final LS/O$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/O;->a(Lx7/a;Lx7/p;Landroidx/compose/ui/d;Lx7/p;Lo0/e2;FLS/M;Landroidx/compose/ui/window/i;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lo0/e2;

.field final synthetic E:LS/M;

.field final synthetic F:F

.field final synthetic G:Lx7/q;

.field final synthetic H:Lx7/p;

.field final synthetic I:Lx7/p;


# direct methods
.method constructor <init>(Lo0/e2;LS/M;FLx7/q;Lx7/p;Lx7/p;)V
    .locals 0

    iput-object p1, p0, LS/O$a;->D:Lo0/e2;

    iput-object p2, p0, LS/O$a;->E:LS/M;

    iput p3, p0, LS/O$a;->F:F

    iput-object p4, p0, LS/O$a;->G:Lx7/q;

    iput-object p5, p0, LS/O$a;->H:Lx7/p;

    iput-object p6, p0, LS/O$a;->I:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 19

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

    const-string v3, "androidx.compose.material3.DatePickerDialog.<anonymous> (DatePickerDialog.android.kt:82)"

    const v4, -0xa22256

    invoke-static {v4, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v2, LU/f;->a:LU/f;

    invoke-virtual {v2}, LU/f;->d()F

    move-result v3

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/p;->o(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-virtual {v2}, LU/f;->b()F

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v1, v4, v2, v5, v3}, Landroidx/compose/foundation/layout/p;->i(Landroidx/compose/ui/d;FFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v6

    iget-object v7, v0, LS/O$a;->D:Lo0/e2;

    iget-object v1, v0, LS/O$a;->E:LS/M;

    invoke-virtual {v1}, LS/M;->c()J

    move-result-wide v8

    iget v12, v0, LS/O$a;->F:F

    new-instance v1, LS/O$a$a;

    iget-object v2, v0, LS/O$a;->G:Lx7/q;

    iget-object v3, v0, LS/O$a;->H:Lx7/p;

    iget-object v4, v0, LS/O$a;->I:Lx7/p;

    invoke-direct {v1, v2, v3, v4}, LS/O$a$a;-><init>(Lx7/q;Lx7/p;Lx7/p;)V

    const/16 v2, 0x36

    const v3, -0x65b2947b

    move-object/from16 v4, p1

    invoke-static {v3, v5, v1, v4, v2}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v15

    const v17, 0xc00006

    const/16 v18, 0x68

    const-wide/16 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, p1

    invoke-static/range {v6 .. v18}, LS/c1;->a(Landroidx/compose/ui/d;Lo0/e2;JJFFLv/g;Lx7/p;LV/n;II)V

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

    invoke-virtual {p0, p1, p2}, LS/O$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
