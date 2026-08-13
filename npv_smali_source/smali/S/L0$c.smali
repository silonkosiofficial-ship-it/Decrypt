.class final LS/L0$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/L0;->a(Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/p;Lx7/p;IJJLA/S;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Lx7/p;

.field final synthetic F:Lx7/p;

.field final synthetic G:Lx7/p;

.field final synthetic H:Lx7/p;

.field final synthetic I:I

.field final synthetic J:J

.field final synthetic K:J

.field final synthetic L:LA/S;

.field final synthetic M:Lx7/q;

.field final synthetic N:I

.field final synthetic O:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/p;Lx7/p;IJJLA/S;Lx7/q;II)V
    .locals 0

    iput-object p1, p0, LS/L0$c;->D:Landroidx/compose/ui/d;

    iput-object p2, p0, LS/L0$c;->E:Lx7/p;

    iput-object p3, p0, LS/L0$c;->F:Lx7/p;

    iput-object p4, p0, LS/L0$c;->G:Lx7/p;

    iput-object p5, p0, LS/L0$c;->H:Lx7/p;

    iput p6, p0, LS/L0$c;->I:I

    iput-wide p7, p0, LS/L0$c;->J:J

    iput-wide p9, p0, LS/L0$c;->K:J

    iput-object p11, p0, LS/L0$c;->L:LA/S;

    iput-object p12, p0, LS/L0$c;->M:Lx7/q;

    iput p13, p0, LS/L0$c;->N:I

    iput p14, p0, LS/L0$c;->O:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, LS/L0$c;->D:Landroidx/compose/ui/d;

    iget-object v2, v0, LS/L0$c;->E:Lx7/p;

    iget-object v3, v0, LS/L0$c;->F:Lx7/p;

    iget-object v4, v0, LS/L0$c;->G:Lx7/p;

    iget-object v5, v0, LS/L0$c;->H:Lx7/p;

    iget v6, v0, LS/L0$c;->I:I

    iget-wide v7, v0, LS/L0$c;->J:J

    iget-wide v9, v0, LS/L0$c;->K:J

    iget-object v11, v0, LS/L0$c;->L:LA/S;

    iget-object v12, v0, LS/L0$c;->M:Lx7/q;

    iget v13, v0, LS/L0$c;->N:I

    or-int/lit8 v13, v13, 0x1

    invoke-static {v13}, LV/S0;->a(I)I

    move-result v14

    iget v15, v0, LS/L0$c;->O:I

    move-object/from16 v13, p1

    invoke-static/range {v1 .. v15}, LS/L0;->a(Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/p;Lx7/p;IJJLA/S;Lx7/q;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/L0$c;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
