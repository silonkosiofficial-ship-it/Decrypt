.class final Lw/k$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/k;->c(Landroidx/compose/ui/window/r;Lx7/a;Landroidx/compose/ui/d;Lw/b;Lx7/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/window/r;

.field final synthetic E:Lx7/a;

.field final synthetic F:Landroidx/compose/ui/d;

.field final synthetic G:Lw/b;

.field final synthetic H:Lx7/l;

.field final synthetic I:I

.field final synthetic J:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/r;Lx7/a;Landroidx/compose/ui/d;Lw/b;Lx7/l;II)V
    .locals 0

    iput-object p1, p0, Lw/k$f;->D:Landroidx/compose/ui/window/r;

    iput-object p2, p0, Lw/k$f;->E:Lx7/a;

    iput-object p3, p0, Lw/k$f;->F:Landroidx/compose/ui/d;

    iput-object p4, p0, Lw/k$f;->G:Lw/b;

    iput-object p5, p0, Lw/k$f;->H:Lx7/l;

    iput p6, p0, Lw/k$f;->I:I

    iput p7, p0, Lw/k$f;->J:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 8

    iget-object v0, p0, Lw/k$f;->D:Landroidx/compose/ui/window/r;

    iget-object v1, p0, Lw/k$f;->E:Lx7/a;

    iget-object v2, p0, Lw/k$f;->F:Landroidx/compose/ui/d;

    iget-object v3, p0, Lw/k$f;->G:Lw/b;

    iget-object v4, p0, Lw/k$f;->H:Lx7/l;

    iget p2, p0, Lw/k$f;->I:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v6

    iget v7, p0, Lw/k$f;->J:I

    move-object v5, p1

    invoke-static/range {v0 .. v7}, Lw/k;->c(Landroidx/compose/ui/window/r;Lx7/a;Landroidx/compose/ui/d;Lw/b;Lx7/l;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lw/k$f;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
