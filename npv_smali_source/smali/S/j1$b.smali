.class final LS/j1$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/j1;->a(ZZLz/j;Landroidx/compose/ui/d;LS/i1;Lo0/e2;FFLV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/j1;

.field final synthetic E:Z

.field final synthetic F:Z

.field final synthetic G:Lz/j;

.field final synthetic H:Landroidx/compose/ui/d;

.field final synthetic I:LS/i1;

.field final synthetic J:Lo0/e2;

.field final synthetic K:F

.field final synthetic L:F

.field final synthetic M:I

.field final synthetic N:I


# direct methods
.method constructor <init>(LS/j1;ZZLz/j;Landroidx/compose/ui/d;LS/i1;Lo0/e2;FFII)V
    .locals 0

    iput-object p1, p0, LS/j1$b;->D:LS/j1;

    iput-boolean p2, p0, LS/j1$b;->E:Z

    iput-boolean p3, p0, LS/j1$b;->F:Z

    iput-object p4, p0, LS/j1$b;->G:Lz/j;

    iput-object p5, p0, LS/j1$b;->H:Landroidx/compose/ui/d;

    iput-object p6, p0, LS/j1$b;->I:LS/i1;

    iput-object p7, p0, LS/j1$b;->J:Lo0/e2;

    iput p8, p0, LS/j1$b;->K:F

    iput p9, p0, LS/j1$b;->L:F

    iput p10, p0, LS/j1$b;->M:I

    iput p11, p0, LS/j1$b;->N:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 12

    iget-object v0, p0, LS/j1$b;->D:LS/j1;

    iget-boolean v1, p0, LS/j1$b;->E:Z

    iget-boolean v2, p0, LS/j1$b;->F:Z

    iget-object v3, p0, LS/j1$b;->G:Lz/j;

    iget-object v4, p0, LS/j1$b;->H:Landroidx/compose/ui/d;

    iget-object v5, p0, LS/j1$b;->I:LS/i1;

    iget-object v6, p0, LS/j1$b;->J:Lo0/e2;

    iget v7, p0, LS/j1$b;->K:F

    iget v8, p0, LS/j1$b;->L:F

    iget p2, p0, LS/j1$b;->M:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v10

    iget v11, p0, LS/j1$b;->N:I

    move-object v9, p1

    invoke-virtual/range {v0 .. v11}, LS/j1;->a(ZZLz/j;Landroidx/compose/ui/d;LS/i1;Lo0/e2;FFLV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/j1$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
