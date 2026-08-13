.class final LS/m1$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/m1;->b(Ljava/lang/String;Landroidx/compose/ui/d;JJLR0/o;LR0/q;LR0/h;JLX0/k;LX0/j;JIZIILx7/l;LM0/P;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/String;

.field final synthetic E:Landroidx/compose/ui/d;

.field final synthetic F:J

.field final synthetic G:J

.field final synthetic H:LR0/o;

.field final synthetic I:LR0/q;

.field final synthetic J:LR0/h;

.field final synthetic K:J

.field final synthetic L:LX0/k;

.field final synthetic M:LX0/j;

.field final synthetic N:J

.field final synthetic O:I

.field final synthetic P:Z

.field final synthetic Q:I

.field final synthetic R:I

.field final synthetic S:Lx7/l;

.field final synthetic T:LM0/P;

.field final synthetic U:I

.field final synthetic V:I

.field final synthetic W:I


# direct methods
.method constructor <init>(Ljava/lang/String;Landroidx/compose/ui/d;JJLR0/o;LR0/q;LR0/h;JLX0/k;LX0/j;JIZIILx7/l;LM0/P;III)V
    .locals 3

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LS/m1$c;->D:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, LS/m1$c;->E:Landroidx/compose/ui/d;

    move-wide v1, p3

    iput-wide v1, v0, LS/m1$c;->F:J

    move-wide v1, p5

    iput-wide v1, v0, LS/m1$c;->G:J

    move-object v1, p7

    iput-object v1, v0, LS/m1$c;->H:LR0/o;

    move-object v1, p8

    iput-object v1, v0, LS/m1$c;->I:LR0/q;

    move-object v1, p9

    iput-object v1, v0, LS/m1$c;->J:LR0/h;

    move-wide v1, p10

    iput-wide v1, v0, LS/m1$c;->K:J

    move-object v1, p12

    iput-object v1, v0, LS/m1$c;->L:LX0/k;

    move-object/from16 v1, p13

    iput-object v1, v0, LS/m1$c;->M:LX0/j;

    move-wide/from16 v1, p14

    iput-wide v1, v0, LS/m1$c;->N:J

    move/from16 v1, p16

    iput v1, v0, LS/m1$c;->O:I

    move/from16 v1, p17

    iput-boolean v1, v0, LS/m1$c;->P:Z

    move/from16 v1, p18

    iput v1, v0, LS/m1$c;->Q:I

    move/from16 v1, p19

    iput v1, v0, LS/m1$c;->R:I

    move-object/from16 v1, p20

    iput-object v1, v0, LS/m1$c;->S:Lx7/l;

    move-object/from16 v1, p21

    iput-object v1, v0, LS/m1$c;->T:LM0/P;

    move/from16 v1, p22

    iput v1, v0, LS/m1$c;->U:I

    move/from16 v1, p23

    iput v1, v0, LS/m1$c;->V:I

    move/from16 v1, p24

    iput v1, v0, LS/m1$c;->W:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v22, p1

    iget-object v1, v0, LS/m1$c;->D:Ljava/lang/String;

    iget-object v2, v0, LS/m1$c;->E:Landroidx/compose/ui/d;

    iget-wide v3, v0, LS/m1$c;->F:J

    iget-wide v5, v0, LS/m1$c;->G:J

    iget-object v7, v0, LS/m1$c;->H:LR0/o;

    iget-object v8, v0, LS/m1$c;->I:LR0/q;

    iget-object v9, v0, LS/m1$c;->J:LR0/h;

    iget-wide v10, v0, LS/m1$c;->K:J

    iget-object v12, v0, LS/m1$c;->L:LX0/k;

    iget-object v13, v0, LS/m1$c;->M:LX0/j;

    iget-wide v14, v0, LS/m1$c;->N:J

    move-object/from16 p1, v1

    iget v1, v0, LS/m1$c;->O:I

    move/from16 v16, v1

    iget-boolean v1, v0, LS/m1$c;->P:Z

    move/from16 v17, v1

    iget v1, v0, LS/m1$c;->Q:I

    move/from16 v18, v1

    iget v1, v0, LS/m1$c;->R:I

    move/from16 v19, v1

    iget-object v1, v0, LS/m1$c;->S:Lx7/l;

    move-object/from16 v20, v1

    iget-object v1, v0, LS/m1$c;->T:LM0/P;

    move-object/from16 v21, v1

    iget v1, v0, LS/m1$c;->U:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LV/S0;->a(I)I

    move-result v23

    iget v1, v0, LS/m1$c;->V:I

    invoke-static {v1}, LV/S0;->a(I)I

    move-result v24

    iget v1, v0, LS/m1$c;->W:I

    move/from16 v25, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v25}, LS/m1;->b(Ljava/lang/String;Landroidx/compose/ui/d;JJLR0/o;LR0/q;LR0/h;JLX0/k;LX0/j;JIZIILx7/l;LM0/P;LV/n;III)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/m1$c;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
