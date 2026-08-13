.class final LS/q1$l;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->i(Landroidx/compose/ui/d;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;I)V
    .locals 0

    iput-object p1, p0, LS/q1$l;->D:Landroidx/compose/ui/d;

    iput p2, p0, LS/q1$l;->E:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 1

    iget-object p2, p0, LS/q1$l;->D:Landroidx/compose/ui/d;

    iget v0, p0, LS/q1$l;->E:I

    or-int/lit8 v0, v0, 0x1

    invoke-static {v0}, LV/S0;->a(I)I

    move-result v0

    invoke-static {p2, p1, v0}, LS/q1;->B(Landroidx/compose/ui/d;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/q1$l;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
