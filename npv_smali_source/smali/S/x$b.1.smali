.class final LS/x$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/x;->a(ZLx7/l;Landroidx/compose/ui/d;ZLS/v;Lz/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Z

.field final synthetic E:Lx7/l;

.field final synthetic F:Landroidx/compose/ui/d;

.field final synthetic G:Z

.field final synthetic H:LS/v;

.field final synthetic I:Lz/l;

.field final synthetic J:I

.field final synthetic K:I


# direct methods
.method constructor <init>(ZLx7/l;Landroidx/compose/ui/d;ZLS/v;Lz/l;II)V
    .locals 0

    iput-boolean p1, p0, LS/x$b;->D:Z

    iput-object p2, p0, LS/x$b;->E:Lx7/l;

    iput-object p3, p0, LS/x$b;->F:Landroidx/compose/ui/d;

    iput-boolean p4, p0, LS/x$b;->G:Z

    iput-object p5, p0, LS/x$b;->H:LS/v;

    iput-object p6, p0, LS/x$b;->I:Lz/l;

    iput p7, p0, LS/x$b;->J:I

    iput p8, p0, LS/x$b;->K:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 9

    iget-boolean v0, p0, LS/x$b;->D:Z

    iget-object v1, p0, LS/x$b;->E:Lx7/l;

    iget-object v2, p0, LS/x$b;->F:Landroidx/compose/ui/d;

    iget-boolean v3, p0, LS/x$b;->G:Z

    iget-object v4, p0, LS/x$b;->H:LS/v;

    iget-object v5, p0, LS/x$b;->I:Lz/l;

    iget p2, p0, LS/x$b;->J:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v7

    iget v8, p0, LS/x$b;->K:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, LS/x;->a(ZLx7/l;Landroidx/compose/ui/d;ZLS/v;Lz/l;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/x$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
