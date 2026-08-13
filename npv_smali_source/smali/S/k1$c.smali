.class final LS/k1$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/k1;->b(Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/q;Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZFLx7/p;Lx7/p;LA/B;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Lx7/p;

.field final synthetic F:Lx7/p;

.field final synthetic G:Lx7/q;

.field final synthetic H:Lx7/p;

.field final synthetic I:Lx7/p;

.field final synthetic J:Lx7/p;

.field final synthetic K:Lx7/p;

.field final synthetic L:Z

.field final synthetic M:F

.field final synthetic N:Lx7/p;

.field final synthetic O:Lx7/p;

.field final synthetic P:LA/B;

.field final synthetic Q:I

.field final synthetic R:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/q;Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZFLx7/p;Lx7/p;LA/B;II)V
    .locals 0

    iput-object p1, p0, LS/k1$c;->D:Landroidx/compose/ui/d;

    iput-object p2, p0, LS/k1$c;->E:Lx7/p;

    iput-object p3, p0, LS/k1$c;->F:Lx7/p;

    iput-object p4, p0, LS/k1$c;->G:Lx7/q;

    iput-object p5, p0, LS/k1$c;->H:Lx7/p;

    iput-object p6, p0, LS/k1$c;->I:Lx7/p;

    iput-object p7, p0, LS/k1$c;->J:Lx7/p;

    iput-object p8, p0, LS/k1$c;->K:Lx7/p;

    iput-boolean p9, p0, LS/k1$c;->L:Z

    iput p10, p0, LS/k1$c;->M:F

    iput-object p11, p0, LS/k1$c;->N:Lx7/p;

    iput-object p12, p0, LS/k1$c;->O:Lx7/p;

    iput-object p13, p0, LS/k1$c;->P:LA/B;

    iput p14, p0, LS/k1$c;->Q:I

    iput p15, p0, LS/k1$c;->R:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, LS/k1$c;->D:Landroidx/compose/ui/d;

    iget-object v2, v0, LS/k1$c;->E:Lx7/p;

    iget-object v3, v0, LS/k1$c;->F:Lx7/p;

    iget-object v4, v0, LS/k1$c;->G:Lx7/q;

    iget-object v5, v0, LS/k1$c;->H:Lx7/p;

    iget-object v6, v0, LS/k1$c;->I:Lx7/p;

    iget-object v7, v0, LS/k1$c;->J:Lx7/p;

    iget-object v8, v0, LS/k1$c;->K:Lx7/p;

    iget-boolean v9, v0, LS/k1$c;->L:Z

    iget v10, v0, LS/k1$c;->M:F

    iget-object v11, v0, LS/k1$c;->N:Lx7/p;

    iget-object v12, v0, LS/k1$c;->O:Lx7/p;

    iget-object v13, v0, LS/k1$c;->P:LA/B;

    iget v14, v0, LS/k1$c;->Q:I

    or-int/lit8 v14, v14, 0x1

    invoke-static {v14}, LV/S0;->a(I)I

    move-result v15

    iget v14, v0, LS/k1$c;->R:I

    invoke-static {v14}, LV/S0;->a(I)I

    move-result v16

    move-object/from16 v14, p1

    invoke-static/range {v1 .. v16}, LS/k1;->b(Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/q;Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZFLx7/p;Lx7/p;LA/B;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/k1$c;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
