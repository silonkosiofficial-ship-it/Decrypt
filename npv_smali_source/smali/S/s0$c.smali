.class final LS/s0$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/s0;->a(Landroidx/compose/ui/d;Lu/Z;LV/w0;Landroidx/compose/foundation/m;Lo0/e2;JFFLv/g;Lx7/q;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Lu/Z;

.field final synthetic F:LV/w0;

.field final synthetic G:Landroidx/compose/foundation/m;

.field final synthetic H:Lo0/e2;

.field final synthetic I:J

.field final synthetic J:F

.field final synthetic K:F

.field final synthetic L:Lv/g;

.field final synthetic M:Lx7/q;

.field final synthetic N:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;Lu/Z;LV/w0;Landroidx/compose/foundation/m;Lo0/e2;JFFLv/g;Lx7/q;I)V
    .locals 0

    iput-object p1, p0, LS/s0$c;->D:Landroidx/compose/ui/d;

    iput-object p2, p0, LS/s0$c;->E:Lu/Z;

    iput-object p3, p0, LS/s0$c;->F:LV/w0;

    iput-object p4, p0, LS/s0$c;->G:Landroidx/compose/foundation/m;

    iput-object p5, p0, LS/s0$c;->H:Lo0/e2;

    iput-wide p6, p0, LS/s0$c;->I:J

    iput p8, p0, LS/s0$c;->J:F

    iput p9, p0, LS/s0$c;->K:F

    iput-object p10, p0, LS/s0$c;->L:Lv/g;

    iput-object p11, p0, LS/s0$c;->M:Lx7/q;

    iput p12, p0, LS/s0$c;->N:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 13

    iget-object v0, p0, LS/s0$c;->D:Landroidx/compose/ui/d;

    iget-object v1, p0, LS/s0$c;->E:Lu/Z;

    iget-object v2, p0, LS/s0$c;->F:LV/w0;

    iget-object v3, p0, LS/s0$c;->G:Landroidx/compose/foundation/m;

    iget-object v4, p0, LS/s0$c;->H:Lo0/e2;

    iget-wide v5, p0, LS/s0$c;->I:J

    iget v7, p0, LS/s0$c;->J:F

    iget v8, p0, LS/s0$c;->K:F

    iget-object v9, p0, LS/s0$c;->L:Lv/g;

    iget-object v10, p0, LS/s0$c;->M:Lx7/q;

    iget p2, p0, LS/s0$c;->N:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v12

    move-object v11, p1

    invoke-static/range {v0 .. v12}, LS/s0;->a(Landroidx/compose/ui/d;Lu/Z;LV/w0;Landroidx/compose/foundation/m;Lo0/e2;JFFLv/g;Lx7/q;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/s0$c;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
