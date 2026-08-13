.class final LS/b$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/b;->a(Lx7/p;Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/p;Lo0/e2;JFJJJJLV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/p;

.field final synthetic E:Landroidx/compose/ui/d;

.field final synthetic F:Lx7/p;

.field final synthetic G:Lx7/p;

.field final synthetic H:Lx7/p;

.field final synthetic I:Lo0/e2;

.field final synthetic J:J

.field final synthetic K:F

.field final synthetic L:J

.field final synthetic M:J

.field final synthetic N:J

.field final synthetic O:J

.field final synthetic P:I

.field final synthetic Q:I

.field final synthetic R:I


# direct methods
.method constructor <init>(Lx7/p;Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/p;Lo0/e2;JFJJJJIII)V
    .locals 3

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LS/b$b;->D:Lx7/p;

    move-object v1, p2

    iput-object v1, v0, LS/b$b;->E:Landroidx/compose/ui/d;

    move-object v1, p3

    iput-object v1, v0, LS/b$b;->F:Lx7/p;

    move-object v1, p4

    iput-object v1, v0, LS/b$b;->G:Lx7/p;

    move-object v1, p5

    iput-object v1, v0, LS/b$b;->H:Lx7/p;

    move-object v1, p6

    iput-object v1, v0, LS/b$b;->I:Lo0/e2;

    move-wide v1, p7

    iput-wide v1, v0, LS/b$b;->J:J

    move v1, p9

    iput v1, v0, LS/b$b;->K:F

    move-wide v1, p10

    iput-wide v1, v0, LS/b$b;->L:J

    move-wide v1, p12

    iput-wide v1, v0, LS/b$b;->M:J

    move-wide/from16 v1, p14

    iput-wide v1, v0, LS/b$b;->N:J

    move-wide/from16 v1, p16

    iput-wide v1, v0, LS/b$b;->O:J

    move/from16 v1, p18

    iput v1, v0, LS/b$b;->P:I

    move/from16 v1, p19

    iput v1, v0, LS/b$b;->Q:I

    move/from16 v1, p20

    iput v1, v0, LS/b$b;->R:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v18, p1

    iget-object v1, v0, LS/b$b;->D:Lx7/p;

    iget-object v2, v0, LS/b$b;->E:Landroidx/compose/ui/d;

    iget-object v3, v0, LS/b$b;->F:Lx7/p;

    iget-object v4, v0, LS/b$b;->G:Lx7/p;

    iget-object v5, v0, LS/b$b;->H:Lx7/p;

    iget-object v6, v0, LS/b$b;->I:Lo0/e2;

    iget-wide v7, v0, LS/b$b;->J:J

    iget v9, v0, LS/b$b;->K:F

    iget-wide v10, v0, LS/b$b;->L:J

    iget-wide v12, v0, LS/b$b;->M:J

    iget-wide v14, v0, LS/b$b;->N:J

    move-object/from16 p1, v1

    move-object/from16 p2, v2

    iget-wide v1, v0, LS/b$b;->O:J

    move-wide/from16 v16, v1

    iget v1, v0, LS/b$b;->P:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LV/S0;->a(I)I

    move-result v19

    iget v1, v0, LS/b$b;->Q:I

    invoke-static {v1}, LV/S0;->a(I)I

    move-result v20

    iget v1, v0, LS/b$b;->R:I

    move/from16 v21, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-static/range {v1 .. v21}, LS/b;->a(Lx7/p;Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/p;Lo0/e2;JFJJJJLV/n;III)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/b$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
