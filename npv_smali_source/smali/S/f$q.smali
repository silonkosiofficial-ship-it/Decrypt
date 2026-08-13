.class final LS/f$q;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/f;->g(Landroidx/compose/ui/d;LS/N0;JJJLx7/p;LM0/P;FLA/b$m;LA/b$e;IZLx7/p;Lx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:LS/N0;

.field final synthetic F:J

.field final synthetic G:J

.field final synthetic H:J

.field final synthetic I:Lx7/p;

.field final synthetic J:LM0/P;

.field final synthetic K:F

.field final synthetic L:LA/b$m;

.field final synthetic M:LA/b$e;

.field final synthetic N:I

.field final synthetic O:Z

.field final synthetic P:Lx7/p;

.field final synthetic Q:Lx7/p;

.field final synthetic R:I

.field final synthetic S:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;LS/N0;JJJLx7/p;LM0/P;FLA/b$m;LA/b$e;IZLx7/p;Lx7/p;II)V
    .locals 3

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LS/f$q;->D:Landroidx/compose/ui/d;

    move-object v1, p2

    iput-object v1, v0, LS/f$q;->E:LS/N0;

    move-wide v1, p3

    iput-wide v1, v0, LS/f$q;->F:J

    move-wide v1, p5

    iput-wide v1, v0, LS/f$q;->G:J

    move-wide v1, p7

    iput-wide v1, v0, LS/f$q;->H:J

    move-object v1, p9

    iput-object v1, v0, LS/f$q;->I:Lx7/p;

    move-object v1, p10

    iput-object v1, v0, LS/f$q;->J:LM0/P;

    move v1, p11

    iput v1, v0, LS/f$q;->K:F

    move-object v1, p12

    iput-object v1, v0, LS/f$q;->L:LA/b$m;

    move-object/from16 v1, p13

    iput-object v1, v0, LS/f$q;->M:LA/b$e;

    move/from16 v1, p14

    iput v1, v0, LS/f$q;->N:I

    move/from16 v1, p15

    iput-boolean v1, v0, LS/f$q;->O:Z

    move-object/from16 v1, p16

    iput-object v1, v0, LS/f$q;->P:Lx7/p;

    move-object/from16 v1, p17

    iput-object v1, v0, LS/f$q;->Q:Lx7/p;

    move/from16 v1, p18

    iput v1, v0, LS/f$q;->R:I

    move/from16 v1, p19

    iput v1, v0, LS/f$q;->S:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v18, p1

    iget-object v1, v0, LS/f$q;->D:Landroidx/compose/ui/d;

    iget-object v2, v0, LS/f$q;->E:LS/N0;

    iget-wide v3, v0, LS/f$q;->F:J

    iget-wide v5, v0, LS/f$q;->G:J

    iget-wide v7, v0, LS/f$q;->H:J

    iget-object v9, v0, LS/f$q;->I:Lx7/p;

    iget-object v10, v0, LS/f$q;->J:LM0/P;

    iget v11, v0, LS/f$q;->K:F

    iget-object v12, v0, LS/f$q;->L:LA/b$m;

    iget-object v13, v0, LS/f$q;->M:LA/b$e;

    iget v14, v0, LS/f$q;->N:I

    iget-boolean v15, v0, LS/f$q;->O:Z

    move-object/from16 p1, v1

    iget-object v1, v0, LS/f$q;->P:Lx7/p;

    move-object/from16 v16, v1

    iget-object v1, v0, LS/f$q;->Q:Lx7/p;

    move-object/from16 v17, v1

    iget v1, v0, LS/f$q;->R:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LV/S0;->a(I)I

    move-result v19

    iget v1, v0, LS/f$q;->S:I

    invoke-static {v1}, LV/S0;->a(I)I

    move-result v20

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v20}, LS/f;->i(Landroidx/compose/ui/d;LS/N0;JJJLx7/p;LM0/P;FLA/b$m;LA/b$e;IZLx7/p;Lx7/p;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/f$q;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
