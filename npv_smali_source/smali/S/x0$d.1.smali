.class final LS/x0$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/x0;->b(Ljava/lang/String;Lx7/p;ZZLS0/g0;Lz/j;ZLx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;LS/i1;LA/B;Lx7/p;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/x0;

.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Lx7/p;

.field final synthetic G:Z

.field final synthetic H:Z

.field final synthetic I:LS0/g0;

.field final synthetic J:Lz/j;

.field final synthetic K:Z

.field final synthetic L:Lx7/p;

.field final synthetic M:Lx7/p;

.field final synthetic N:Lx7/p;

.field final synthetic O:Lx7/p;

.field final synthetic P:Lx7/p;

.field final synthetic Q:Lx7/p;

.field final synthetic R:Lx7/p;

.field final synthetic S:LS/i1;

.field final synthetic T:LA/B;

.field final synthetic U:Lx7/p;

.field final synthetic V:I

.field final synthetic W:I

.field final synthetic X:I


# direct methods
.method constructor <init>(LS/x0;Ljava/lang/String;Lx7/p;ZZLS0/g0;Lz/j;ZLx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;LS/i1;LA/B;Lx7/p;III)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LS/x0$d;->D:LS/x0;

    move-object v1, p2

    iput-object v1, v0, LS/x0$d;->E:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, LS/x0$d;->F:Lx7/p;

    move v1, p4

    iput-boolean v1, v0, LS/x0$d;->G:Z

    move v1, p5

    iput-boolean v1, v0, LS/x0$d;->H:Z

    move-object v1, p6

    iput-object v1, v0, LS/x0$d;->I:LS0/g0;

    move-object v1, p7

    iput-object v1, v0, LS/x0$d;->J:Lz/j;

    move v1, p8

    iput-boolean v1, v0, LS/x0$d;->K:Z

    move-object v1, p9

    iput-object v1, v0, LS/x0$d;->L:Lx7/p;

    move-object v1, p10

    iput-object v1, v0, LS/x0$d;->M:Lx7/p;

    move-object v1, p11

    iput-object v1, v0, LS/x0$d;->N:Lx7/p;

    move-object v1, p12

    iput-object v1, v0, LS/x0$d;->O:Lx7/p;

    move-object v1, p13

    iput-object v1, v0, LS/x0$d;->P:Lx7/p;

    move-object/from16 v1, p14

    iput-object v1, v0, LS/x0$d;->Q:Lx7/p;

    move-object/from16 v1, p15

    iput-object v1, v0, LS/x0$d;->R:Lx7/p;

    move-object/from16 v1, p16

    iput-object v1, v0, LS/x0$d;->S:LS/i1;

    move-object/from16 v1, p17

    iput-object v1, v0, LS/x0$d;->T:LA/B;

    move-object/from16 v1, p18

    iput-object v1, v0, LS/x0$d;->U:Lx7/p;

    move/from16 v1, p19

    iput v1, v0, LS/x0$d;->V:I

    move/from16 v1, p20

    iput v1, v0, LS/x0$d;->W:I

    move/from16 v1, p21

    iput v1, v0, LS/x0$d;->X:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v19, p1

    iget-object v1, v0, LS/x0$d;->D:LS/x0;

    iget-object v2, v0, LS/x0$d;->E:Ljava/lang/String;

    iget-object v3, v0, LS/x0$d;->F:Lx7/p;

    iget-boolean v4, v0, LS/x0$d;->G:Z

    iget-boolean v5, v0, LS/x0$d;->H:Z

    iget-object v6, v0, LS/x0$d;->I:LS0/g0;

    iget-object v7, v0, LS/x0$d;->J:Lz/j;

    iget-boolean v8, v0, LS/x0$d;->K:Z

    iget-object v9, v0, LS/x0$d;->L:Lx7/p;

    iget-object v10, v0, LS/x0$d;->M:Lx7/p;

    iget-object v11, v0, LS/x0$d;->N:Lx7/p;

    iget-object v12, v0, LS/x0$d;->O:Lx7/p;

    iget-object v13, v0, LS/x0$d;->P:Lx7/p;

    iget-object v14, v0, LS/x0$d;->Q:Lx7/p;

    iget-object v15, v0, LS/x0$d;->R:Lx7/p;

    move-object/from16 p1, v1

    iget-object v1, v0, LS/x0$d;->S:LS/i1;

    move-object/from16 v16, v1

    iget-object v1, v0, LS/x0$d;->T:LA/B;

    move-object/from16 v17, v1

    iget-object v1, v0, LS/x0$d;->U:Lx7/p;

    move-object/from16 v18, v1

    iget v1, v0, LS/x0$d;->V:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LV/S0;->a(I)I

    move-result v20

    iget v1, v0, LS/x0$d;->W:I

    invoke-static {v1}, LV/S0;->a(I)I

    move-result v21

    iget v1, v0, LS/x0$d;->X:I

    move/from16 v22, v1

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v22}, LS/x0;->b(Ljava/lang/String;Lx7/p;ZZLS0/g0;Lz/j;ZLx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;LS/i1;LA/B;Lx7/p;LV/n;III)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/x0$d;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
