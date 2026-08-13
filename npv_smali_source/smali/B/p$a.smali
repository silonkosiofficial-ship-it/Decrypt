.class final LB/p$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/p;->a(Landroidx/compose/ui/d;LB/D;LA/B;ZZLx/p;ZILh0/c$b;LA/b$m;Lh0/c$c;LA/b$e;Lx7/l;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:LB/D;

.field final synthetic F:LA/B;

.field final synthetic G:Z

.field final synthetic H:Z

.field final synthetic I:Lx/p;

.field final synthetic J:Z

.field final synthetic K:I

.field final synthetic L:Lh0/c$b;

.field final synthetic M:LA/b$m;

.field final synthetic N:Lh0/c$c;

.field final synthetic O:LA/b$e;

.field final synthetic P:Lx7/l;

.field final synthetic Q:I

.field final synthetic R:I

.field final synthetic S:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;LB/D;LA/B;ZZLx/p;ZILh0/c$b;LA/b$m;Lh0/c$c;LA/b$e;Lx7/l;III)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LB/p$a;->D:Landroidx/compose/ui/d;

    move-object v1, p2

    iput-object v1, v0, LB/p$a;->E:LB/D;

    move-object v1, p3

    iput-object v1, v0, LB/p$a;->F:LA/B;

    move v1, p4

    iput-boolean v1, v0, LB/p$a;->G:Z

    move v1, p5

    iput-boolean v1, v0, LB/p$a;->H:Z

    move-object v1, p6

    iput-object v1, v0, LB/p$a;->I:Lx/p;

    move v1, p7

    iput-boolean v1, v0, LB/p$a;->J:Z

    move v1, p8

    iput v1, v0, LB/p$a;->K:I

    move-object v1, p9

    iput-object v1, v0, LB/p$a;->L:Lh0/c$b;

    move-object v1, p10

    iput-object v1, v0, LB/p$a;->M:LA/b$m;

    move-object v1, p11

    iput-object v1, v0, LB/p$a;->N:Lh0/c$c;

    move-object v1, p12

    iput-object v1, v0, LB/p$a;->O:LA/b$e;

    move-object v1, p13

    iput-object v1, v0, LB/p$a;->P:Lx7/l;

    move/from16 v1, p14

    iput v1, v0, LB/p$a;->Q:I

    move/from16 v1, p15

    iput v1, v0, LB/p$a;->R:I

    move/from16 v1, p16

    iput v1, v0, LB/p$a;->S:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    iget-object v1, v0, LB/p$a;->D:Landroidx/compose/ui/d;

    iget-object v2, v0, LB/p$a;->E:LB/D;

    iget-object v3, v0, LB/p$a;->F:LA/B;

    iget-boolean v4, v0, LB/p$a;->G:Z

    iget-boolean v5, v0, LB/p$a;->H:Z

    iget-object v6, v0, LB/p$a;->I:Lx/p;

    iget-boolean v7, v0, LB/p$a;->J:Z

    iget v8, v0, LB/p$a;->K:I

    iget-object v9, v0, LB/p$a;->L:Lh0/c$b;

    iget-object v10, v0, LB/p$a;->M:LA/b$m;

    iget-object v11, v0, LB/p$a;->N:Lh0/c$c;

    iget-object v12, v0, LB/p$a;->O:LA/b$e;

    iget-object v13, v0, LB/p$a;->P:Lx7/l;

    iget v15, v0, LB/p$a;->Q:I

    or-int/lit8 v15, v15, 0x1

    invoke-static {v15}, LV/S0;->a(I)I

    move-result v15

    move-object/from16 p1, v1

    iget v1, v0, LB/p$a;->R:I

    invoke-static {v1}, LV/S0;->a(I)I

    move-result v16

    iget v1, v0, LB/p$a;->S:I

    move/from16 v17, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v17}, LB/p;->a(Landroidx/compose/ui/d;LB/D;LA/B;ZZLx/p;ZILh0/c$b;LA/b$m;Lh0/c$c;LA/b$e;Lx7/l;LV/n;III)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LB/p$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
