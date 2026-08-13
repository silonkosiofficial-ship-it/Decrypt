.class final LS/t$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/t;->a(Landroidx/compose/ui/d;Lo0/e2;LS/q;LS/s;Lv/g;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Lo0/e2;

.field final synthetic F:LS/q;

.field final synthetic G:LS/s;

.field final synthetic H:Lv/g;

.field final synthetic I:Lx7/q;

.field final synthetic J:I

.field final synthetic K:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;Lo0/e2;LS/q;LS/s;Lv/g;Lx7/q;II)V
    .locals 0

    iput-object p1, p0, LS/t$b;->D:Landroidx/compose/ui/d;

    iput-object p2, p0, LS/t$b;->E:Lo0/e2;

    iput-object p3, p0, LS/t$b;->F:LS/q;

    iput-object p4, p0, LS/t$b;->G:LS/s;

    iput-object p5, p0, LS/t$b;->H:Lv/g;

    iput-object p6, p0, LS/t$b;->I:Lx7/q;

    iput p7, p0, LS/t$b;->J:I

    iput p8, p0, LS/t$b;->K:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 9

    iget-object v0, p0, LS/t$b;->D:Landroidx/compose/ui/d;

    iget-object v1, p0, LS/t$b;->E:Lo0/e2;

    iget-object v2, p0, LS/t$b;->F:LS/q;

    iget-object v3, p0, LS/t$b;->G:LS/s;

    iget-object v4, p0, LS/t$b;->H:Lv/g;

    iget-object v5, p0, LS/t$b;->I:Lx7/q;

    iget p2, p0, LS/t$b;->J:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v7

    iget v8, p0, LS/t$b;->K:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, LS/t;->a(Landroidx/compose/ui/d;Lo0/e2;LS/q;LS/s;Lv/g;Lx7/q;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/t$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
