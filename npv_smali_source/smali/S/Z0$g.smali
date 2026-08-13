.class final LS/Z0$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/Z0;->d(LS/U0;Landroidx/compose/ui/d;ZLo0/e2;JJJJJLV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/U0;

.field final synthetic E:Landroidx/compose/ui/d;

.field final synthetic F:Z

.field final synthetic G:Lo0/e2;

.field final synthetic H:J

.field final synthetic I:J

.field final synthetic J:J

.field final synthetic K:J

.field final synthetic L:J

.field final synthetic M:I

.field final synthetic N:I


# direct methods
.method constructor <init>(LS/U0;Landroidx/compose/ui/d;ZLo0/e2;JJJJJII)V
    .locals 3

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LS/Z0$g;->D:LS/U0;

    move-object v1, p2

    iput-object v1, v0, LS/Z0$g;->E:Landroidx/compose/ui/d;

    move v1, p3

    iput-boolean v1, v0, LS/Z0$g;->F:Z

    move-object v1, p4

    iput-object v1, v0, LS/Z0$g;->G:Lo0/e2;

    move-wide v1, p5

    iput-wide v1, v0, LS/Z0$g;->H:J

    move-wide v1, p7

    iput-wide v1, v0, LS/Z0$g;->I:J

    move-wide v1, p9

    iput-wide v1, v0, LS/Z0$g;->J:J

    move-wide v1, p11

    iput-wide v1, v0, LS/Z0$g;->K:J

    move-wide/from16 v1, p13

    iput-wide v1, v0, LS/Z0$g;->L:J

    move/from16 v1, p15

    iput v1, v0, LS/Z0$g;->M:I

    move/from16 v1, p16

    iput v1, v0, LS/Z0$g;->N:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    iget-object v1, v0, LS/Z0$g;->D:LS/U0;

    iget-object v2, v0, LS/Z0$g;->E:Landroidx/compose/ui/d;

    iget-boolean v3, v0, LS/Z0$g;->F:Z

    iget-object v4, v0, LS/Z0$g;->G:Lo0/e2;

    iget-wide v5, v0, LS/Z0$g;->H:J

    iget-wide v7, v0, LS/Z0$g;->I:J

    iget-wide v9, v0, LS/Z0$g;->J:J

    iget-wide v11, v0, LS/Z0$g;->K:J

    iget-wide v13, v0, LS/Z0$g;->L:J

    move-object/from16 p1, v1

    iget v1, v0, LS/Z0$g;->M:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LV/S0;->a(I)I

    move-result v16

    iget v1, v0, LS/Z0$g;->N:I

    move/from16 v17, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v17}, LS/Z0;->d(LS/U0;Landroidx/compose/ui/d;ZLo0/e2;JJJJJLV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/Z0$g;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
