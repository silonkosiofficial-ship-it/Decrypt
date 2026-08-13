.class final LS/Z0$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/Z0;->c(Landroidx/compose/ui/d;Lx7/p;Lx7/p;ZLo0/e2;JJJJLx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Lx7/p;

.field final synthetic F:Lx7/p;

.field final synthetic G:Z

.field final synthetic H:Lo0/e2;

.field final synthetic I:J

.field final synthetic J:J

.field final synthetic K:J

.field final synthetic L:J

.field final synthetic M:Lx7/p;

.field final synthetic N:I

.field final synthetic O:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;Lx7/p;Lx7/p;ZLo0/e2;JJJJLx7/p;II)V
    .locals 3

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LS/Z0$e;->D:Landroidx/compose/ui/d;

    move-object v1, p2

    iput-object v1, v0, LS/Z0$e;->E:Lx7/p;

    move-object v1, p3

    iput-object v1, v0, LS/Z0$e;->F:Lx7/p;

    move v1, p4

    iput-boolean v1, v0, LS/Z0$e;->G:Z

    move-object v1, p5

    iput-object v1, v0, LS/Z0$e;->H:Lo0/e2;

    move-wide v1, p6

    iput-wide v1, v0, LS/Z0$e;->I:J

    move-wide v1, p8

    iput-wide v1, v0, LS/Z0$e;->J:J

    move-wide v1, p10

    iput-wide v1, v0, LS/Z0$e;->K:J

    move-wide v1, p12

    iput-wide v1, v0, LS/Z0$e;->L:J

    move-object/from16 v1, p14

    iput-object v1, v0, LS/Z0$e;->M:Lx7/p;

    move/from16 v1, p15

    iput v1, v0, LS/Z0$e;->N:I

    move/from16 v1, p16

    iput v1, v0, LS/Z0$e;->O:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    iget-object v1, v0, LS/Z0$e;->D:Landroidx/compose/ui/d;

    iget-object v2, v0, LS/Z0$e;->E:Lx7/p;

    iget-object v3, v0, LS/Z0$e;->F:Lx7/p;

    iget-boolean v4, v0, LS/Z0$e;->G:Z

    iget-object v5, v0, LS/Z0$e;->H:Lo0/e2;

    iget-wide v6, v0, LS/Z0$e;->I:J

    iget-wide v8, v0, LS/Z0$e;->J:J

    iget-wide v10, v0, LS/Z0$e;->K:J

    iget-wide v12, v0, LS/Z0$e;->L:J

    iget-object v14, v0, LS/Z0$e;->M:Lx7/p;

    move-object/from16 p1, v1

    iget v1, v0, LS/Z0$e;->N:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LV/S0;->a(I)I

    move-result v16

    iget v1, v0, LS/Z0$e;->O:I

    move/from16 v17, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v17}, LS/Z0;->c(Landroidx/compose/ui/d;Lx7/p;Lx7/p;ZLo0/e2;JJJJLx7/p;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/Z0$e;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
