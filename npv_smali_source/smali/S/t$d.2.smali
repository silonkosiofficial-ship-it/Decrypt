.class final LS/t$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/t;->b(Lx7/a;Landroidx/compose/ui/d;ZLo0/e2;LS/q;LS/s;Lv/g;Lz/l;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/a;

.field final synthetic E:Landroidx/compose/ui/d;

.field final synthetic F:Z

.field final synthetic G:Lo0/e2;

.field final synthetic H:LS/q;

.field final synthetic I:LS/s;

.field final synthetic J:Lv/g;

.field final synthetic K:Lz/l;

.field final synthetic L:Lx7/q;

.field final synthetic M:I

.field final synthetic N:I


# direct methods
.method constructor <init>(Lx7/a;Landroidx/compose/ui/d;ZLo0/e2;LS/q;LS/s;Lv/g;Lz/l;Lx7/q;II)V
    .locals 0

    iput-object p1, p0, LS/t$d;->D:Lx7/a;

    iput-object p2, p0, LS/t$d;->E:Landroidx/compose/ui/d;

    iput-boolean p3, p0, LS/t$d;->F:Z

    iput-object p4, p0, LS/t$d;->G:Lo0/e2;

    iput-object p5, p0, LS/t$d;->H:LS/q;

    iput-object p6, p0, LS/t$d;->I:LS/s;

    iput-object p7, p0, LS/t$d;->J:Lv/g;

    iput-object p8, p0, LS/t$d;->K:Lz/l;

    iput-object p9, p0, LS/t$d;->L:Lx7/q;

    iput p10, p0, LS/t$d;->M:I

    iput p11, p0, LS/t$d;->N:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 12

    iget-object v0, p0, LS/t$d;->D:Lx7/a;

    iget-object v1, p0, LS/t$d;->E:Landroidx/compose/ui/d;

    iget-boolean v2, p0, LS/t$d;->F:Z

    iget-object v3, p0, LS/t$d;->G:Lo0/e2;

    iget-object v4, p0, LS/t$d;->H:LS/q;

    iget-object v5, p0, LS/t$d;->I:LS/s;

    iget-object v6, p0, LS/t$d;->J:Lv/g;

    iget-object v7, p0, LS/t$d;->K:Lz/l;

    iget-object v8, p0, LS/t$d;->L:Lx7/q;

    iget p2, p0, LS/t$d;->M:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v10

    iget v11, p0, LS/t$d;->N:I

    move-object v9, p1

    invoke-static/range {v0 .. v11}, LS/t;->b(Lx7/a;Landroidx/compose/ui/d;ZLo0/e2;LS/q;LS/s;Lv/g;Lz/l;Lx7/q;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/t$d;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
