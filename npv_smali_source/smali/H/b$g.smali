.class final LH/b$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/b;->b(Ljava/lang/String;Lx7/l;Landroidx/compose/ui/d;ZZLM0/P;LH/v;LH/u;ZIILS0/g0;Lx7/l;Lz/l;Lo0/n0;Lx7/q;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/String;

.field final synthetic E:Lx7/l;

.field final synthetic F:Landroidx/compose/ui/d;

.field final synthetic G:Z

.field final synthetic H:Z

.field final synthetic I:LM0/P;

.field final synthetic J:LH/v;

.field final synthetic K:LH/u;

.field final synthetic L:Z

.field final synthetic M:I

.field final synthetic N:I

.field final synthetic O:LS0/g0;

.field final synthetic P:Lx7/l;

.field final synthetic Q:Lz/l;

.field final synthetic R:Lo0/n0;

.field final synthetic S:Lx7/q;

.field final synthetic T:I

.field final synthetic U:I

.field final synthetic V:I


# direct methods
.method constructor <init>(Ljava/lang/String;Lx7/l;Landroidx/compose/ui/d;ZZLM0/P;LH/v;LH/u;ZIILS0/g0;Lx7/l;Lz/l;Lo0/n0;Lx7/q;III)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LH/b$g;->D:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, LH/b$g;->E:Lx7/l;

    move-object v1, p3

    iput-object v1, v0, LH/b$g;->F:Landroidx/compose/ui/d;

    move v1, p4

    iput-boolean v1, v0, LH/b$g;->G:Z

    move v1, p5

    iput-boolean v1, v0, LH/b$g;->H:Z

    move-object v1, p6

    iput-object v1, v0, LH/b$g;->I:LM0/P;

    move-object v1, p7

    iput-object v1, v0, LH/b$g;->J:LH/v;

    move-object v1, p8

    iput-object v1, v0, LH/b$g;->K:LH/u;

    move v1, p9

    iput-boolean v1, v0, LH/b$g;->L:Z

    move v1, p10

    iput v1, v0, LH/b$g;->M:I

    move v1, p11

    iput v1, v0, LH/b$g;->N:I

    move-object v1, p12

    iput-object v1, v0, LH/b$g;->O:LS0/g0;

    move-object v1, p13

    iput-object v1, v0, LH/b$g;->P:Lx7/l;

    move-object/from16 v1, p14

    iput-object v1, v0, LH/b$g;->Q:Lz/l;

    move-object/from16 v1, p15

    iput-object v1, v0, LH/b$g;->R:Lo0/n0;

    move-object/from16 v1, p16

    iput-object v1, v0, LH/b$g;->S:Lx7/q;

    move/from16 v1, p17

    iput v1, v0, LH/b$g;->T:I

    move/from16 v1, p18

    iput v1, v0, LH/b$g;->U:I

    move/from16 v1, p19

    iput v1, v0, LH/b$g;->V:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v17, p1

    iget-object v1, v0, LH/b$g;->D:Ljava/lang/String;

    iget-object v2, v0, LH/b$g;->E:Lx7/l;

    iget-object v3, v0, LH/b$g;->F:Landroidx/compose/ui/d;

    iget-boolean v4, v0, LH/b$g;->G:Z

    iget-boolean v5, v0, LH/b$g;->H:Z

    iget-object v6, v0, LH/b$g;->I:LM0/P;

    iget-object v7, v0, LH/b$g;->J:LH/v;

    iget-object v8, v0, LH/b$g;->K:LH/u;

    iget-boolean v9, v0, LH/b$g;->L:Z

    iget v10, v0, LH/b$g;->M:I

    iget v11, v0, LH/b$g;->N:I

    iget-object v12, v0, LH/b$g;->O:LS0/g0;

    iget-object v13, v0, LH/b$g;->P:Lx7/l;

    iget-object v14, v0, LH/b$g;->Q:Lz/l;

    iget-object v15, v0, LH/b$g;->R:Lo0/n0;

    move-object/from16 p1, v1

    iget-object v1, v0, LH/b$g;->S:Lx7/q;

    move-object/from16 v16, v1

    iget v1, v0, LH/b$g;->T:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LV/S0;->a(I)I

    move-result v18

    iget v1, v0, LH/b$g;->U:I

    invoke-static {v1}, LV/S0;->a(I)I

    move-result v19

    iget v1, v0, LH/b$g;->V:I

    move/from16 v20, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v20}, LH/b;->b(Ljava/lang/String;Lx7/l;Landroidx/compose/ui/d;ZZLM0/P;LH/v;LH/u;ZIILS0/g0;Lx7/l;Lz/l;Lo0/n0;Lx7/q;LV/n;III)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LH/b$g;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
