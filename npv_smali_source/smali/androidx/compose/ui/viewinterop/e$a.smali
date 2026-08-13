.class final Landroidx/compose/ui/viewinterop/e$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/e;->a(Lx7/l;Landroidx/compose/ui/d;Lx7/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/l;

.field final synthetic E:Landroidx/compose/ui/d;

.field final synthetic F:Lx7/l;

.field final synthetic G:I

.field final synthetic H:I


# direct methods
.method constructor <init>(Lx7/l;Landroidx/compose/ui/d;Lx7/l;II)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/e$a;->D:Lx7/l;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/e$a;->E:Landroidx/compose/ui/d;

    iput-object p3, p0, Landroidx/compose/ui/viewinterop/e$a;->F:Lx7/l;

    iput p4, p0, Landroidx/compose/ui/viewinterop/e$a;->G:I

    iput p5, p0, Landroidx/compose/ui/viewinterop/e$a;->H:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 6

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/e$a;->D:Lx7/l;

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/e$a;->E:Landroidx/compose/ui/d;

    iget-object v2, p0, Landroidx/compose/ui/viewinterop/e$a;->F:Lx7/l;

    iget p2, p0, Landroidx/compose/ui/viewinterop/e$a;->G:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v4

    iget v5, p0, Landroidx/compose/ui/viewinterop/e$a;->H:I

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/viewinterop/e;->a(Lx7/l;Landroidx/compose/ui/d;Lx7/l;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/viewinterop/e$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
