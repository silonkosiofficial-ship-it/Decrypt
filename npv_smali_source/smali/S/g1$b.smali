.class final LS/g1$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/g1;->a(ILandroidx/compose/ui/d;JJLx7/q;Lx7/p;Lx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:I

.field final synthetic E:Landroidx/compose/ui/d;

.field final synthetic F:J

.field final synthetic G:J

.field final synthetic H:Lx7/q;

.field final synthetic I:Lx7/p;

.field final synthetic J:Lx7/p;

.field final synthetic K:I

.field final synthetic L:I


# direct methods
.method constructor <init>(ILandroidx/compose/ui/d;JJLx7/q;Lx7/p;Lx7/p;II)V
    .locals 0

    iput p1, p0, LS/g1$b;->D:I

    iput-object p2, p0, LS/g1$b;->E:Landroidx/compose/ui/d;

    iput-wide p3, p0, LS/g1$b;->F:J

    iput-wide p5, p0, LS/g1$b;->G:J

    iput-object p7, p0, LS/g1$b;->H:Lx7/q;

    iput-object p8, p0, LS/g1$b;->I:Lx7/p;

    iput-object p9, p0, LS/g1$b;->J:Lx7/p;

    iput p10, p0, LS/g1$b;->K:I

    iput p11, p0, LS/g1$b;->L:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 12

    iget v0, p0, LS/g1$b;->D:I

    iget-object v1, p0, LS/g1$b;->E:Landroidx/compose/ui/d;

    iget-wide v2, p0, LS/g1$b;->F:J

    iget-wide v4, p0, LS/g1$b;->G:J

    iget-object v6, p0, LS/g1$b;->H:Lx7/q;

    iget-object v7, p0, LS/g1$b;->I:Lx7/p;

    iget-object v8, p0, LS/g1$b;->J:Lx7/p;

    iget p2, p0, LS/g1$b;->K:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v10

    iget v11, p0, LS/g1$b;->L:I

    move-object v9, p1

    invoke-static/range {v0 .. v11}, LS/g1;->a(ILandroidx/compose/ui/d;JJLx7/q;Lx7/p;Lx7/p;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/g1$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
