.class final LS/e$b;
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
.field final synthetic D:Z

.field final synthetic E:Lx7/a;

.field final synthetic F:Landroidx/compose/ui/d;

.field final synthetic G:J

.field final synthetic H:Landroidx/compose/foundation/m;

.field final synthetic I:Landroidx/compose/ui/window/s;

.field final synthetic J:Lo0/e2;

.field final synthetic K:J

.field final synthetic L:F

.field final synthetic M:F

.field final synthetic N:Lv/g;

.field final synthetic O:Lx7/q;

.field final synthetic P:I

.field final synthetic Q:I

.field final synthetic R:I


# direct methods
.method constructor <init>(ZLx7/a;Landroidx/compose/ui/d;JLandroidx/compose/foundation/m;Landroidx/compose/ui/window/s;Lo0/e2;JFFLv/g;Lx7/q;III)V
    .locals 3

    move-object v0, p0

    move v1, p1

    iput-boolean v1, v0, LS/e$b;->D:Z

    move-object v1, p2

    iput-object v1, v0, LS/e$b;->E:Lx7/a;

    move-object v1, p3

    iput-object v1, v0, LS/e$b;->F:Landroidx/compose/ui/d;

    move-wide v1, p4

    iput-wide v1, v0, LS/e$b;->G:J

    move-object v1, p6

    iput-object v1, v0, LS/e$b;->H:Landroidx/compose/foundation/m;

    move-object v1, p7

    iput-object v1, v0, LS/e$b;->I:Landroidx/compose/ui/window/s;

    move-object v1, p8

    iput-object v1, v0, LS/e$b;->J:Lo0/e2;

    move-wide v1, p9

    iput-wide v1, v0, LS/e$b;->K:J

    move v1, p11

    iput v1, v0, LS/e$b;->L:F

    move v1, p12

    iput v1, v0, LS/e$b;->M:F

    move-object/from16 v1, p13

    iput-object v1, v0, LS/e$b;->N:Lv/g;

    move-object/from16 v1, p14

    iput-object v1, v0, LS/e$b;->O:Lx7/q;

    move/from16 v1, p15

    iput v1, v0, LS/e$b;->P:I

    move/from16 v1, p16

    iput v1, v0, LS/e$b;->Q:I

    move/from16 v1, p17

    iput v1, v0, LS/e$b;->R:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    iget-boolean v1, v0, LS/e$b;->D:Z

    iget-object v2, v0, LS/e$b;->E:Lx7/a;

    iget-object v3, v0, LS/e$b;->F:Landroidx/compose/ui/d;

    iget-wide v4, v0, LS/e$b;->G:J

    iget-object v6, v0, LS/e$b;->H:Landroidx/compose/foundation/m;

    iget-object v7, v0, LS/e$b;->I:Landroidx/compose/ui/window/s;

    iget-object v8, v0, LS/e$b;->J:Lo0/e2;

    iget-wide v9, v0, LS/e$b;->K:J

    iget v11, v0, LS/e$b;->L:F

    iget v12, v0, LS/e$b;->M:F

    iget-object v13, v0, LS/e$b;->N:Lv/g;

    iget-object v14, v0, LS/e$b;->O:Lx7/q;

    move/from16 p1, v1

    iget v1, v0, LS/e$b;->P:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LV/S0;->a(I)I

    move-result v16

    iget v1, v0, LS/e$b;->Q:I

    invoke-static {v1}, LV/S0;->a(I)I

    move-result v17

    iget v1, v0, LS/e$b;->R:I

    move/from16 v18, v1

    move/from16 v1, p1

    invoke-static/range {v1 .. v18}, LS/e;->a(ZLx7/a;Landroidx/compose/ui/d;JLandroidx/compose/foundation/m;Landroidx/compose/ui/window/s;Lo0/e2;JFFLv/g;Lx7/q;LV/n;III)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/e$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
