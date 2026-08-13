.class final LS/g1$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/g1;->b(Landroidx/compose/ui/d;JJLx7/q;Lx7/p;Lx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:J

.field final synthetic F:J

.field final synthetic G:Lx7/q;

.field final synthetic H:Lx7/p;

.field final synthetic I:Lx7/p;

.field final synthetic J:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;JJLx7/q;Lx7/p;Lx7/p;I)V
    .locals 0

    iput-object p1, p0, LS/g1$d;->D:Landroidx/compose/ui/d;

    iput-wide p2, p0, LS/g1$d;->E:J

    iput-wide p4, p0, LS/g1$d;->F:J

    iput-object p6, p0, LS/g1$d;->G:Lx7/q;

    iput-object p7, p0, LS/g1$d;->H:Lx7/p;

    iput-object p8, p0, LS/g1$d;->I:Lx7/p;

    iput p9, p0, LS/g1$d;->J:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 10

    iget-object v0, p0, LS/g1$d;->D:Landroidx/compose/ui/d;

    iget-wide v1, p0, LS/g1$d;->E:J

    iget-wide v3, p0, LS/g1$d;->F:J

    iget-object v5, p0, LS/g1$d;->G:Lx7/q;

    iget-object v6, p0, LS/g1$d;->H:Lx7/p;

    iget-object v7, p0, LS/g1$d;->I:Lx7/p;

    iget p2, p0, LS/g1$d;->J:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v9

    move-object v8, p1

    invoke-static/range {v0 .. v9}, LS/g1;->c(Landroidx/compose/ui/d;JJLx7/q;Lx7/p;Lx7/p;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/g1$d;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
