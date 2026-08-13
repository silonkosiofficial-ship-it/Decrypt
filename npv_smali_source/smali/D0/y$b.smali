.class final LD0/y$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD0/y;->a(Landroidx/compose/ui/d;Lx7/p;LD0/I;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Lx7/p;

.field final synthetic F:LD0/I;

.field final synthetic G:I

.field final synthetic H:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;Lx7/p;LD0/I;II)V
    .locals 0

    iput-object p1, p0, LD0/y$b;->D:Landroidx/compose/ui/d;

    iput-object p2, p0, LD0/y$b;->E:Lx7/p;

    iput-object p3, p0, LD0/y$b;->F:LD0/I;

    iput p4, p0, LD0/y$b;->G:I

    iput p5, p0, LD0/y$b;->H:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 6

    iget-object v0, p0, LD0/y$b;->D:Landroidx/compose/ui/d;

    iget-object v1, p0, LD0/y$b;->E:Lx7/p;

    iget-object v2, p0, LD0/y$b;->F:LD0/I;

    iget p2, p0, LD0/y$b;->G:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v4

    iget v5, p0, LD0/y$b;->H:I

    move-object v3, p1

    invoke-static/range {v0 .. v5}, LD0/y;->a(Landroidx/compose/ui/d;Lx7/p;LD0/I;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LD0/y$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
