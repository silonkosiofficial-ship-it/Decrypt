.class final LS/X0$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/X0;->b(LS/Y0;Landroidx/compose/ui/d;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/Y0;

.field final synthetic E:Landroidx/compose/ui/d;

.field final synthetic F:Lx7/q;

.field final synthetic G:I

.field final synthetic H:I


# direct methods
.method constructor <init>(LS/Y0;Landroidx/compose/ui/d;Lx7/q;II)V
    .locals 0

    iput-object p1, p0, LS/X0$e;->D:LS/Y0;

    iput-object p2, p0, LS/X0$e;->E:Landroidx/compose/ui/d;

    iput-object p3, p0, LS/X0$e;->F:Lx7/q;

    iput p4, p0, LS/X0$e;->G:I

    iput p5, p0, LS/X0$e;->H:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 6

    iget-object v0, p0, LS/X0$e;->D:LS/Y0;

    iget-object v1, p0, LS/X0$e;->E:Landroidx/compose/ui/d;

    iget-object v2, p0, LS/X0$e;->F:Lx7/q;

    iget p2, p0, LS/X0$e;->G:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v4

    iget v5, p0, LS/X0$e;->H:I

    move-object v3, p1

    invoke-static/range {v0 .. v5}, LS/X0;->b(LS/Y0;Landroidx/compose/ui/d;Lx7/q;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/X0$e;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
