.class final LS/t$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/t;->d(Lx7/a;Landroidx/compose/ui/d;ZLo0/e2;LS/q;LS/s;Lz/l;Lx7/q;LV/n;II)V
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

.field final synthetic J:Lz/l;

.field final synthetic K:Lx7/q;

.field final synthetic L:I

.field final synthetic M:I


# direct methods
.method constructor <init>(Lx7/a;Landroidx/compose/ui/d;ZLo0/e2;LS/q;LS/s;Lz/l;Lx7/q;II)V
    .locals 0

    iput-object p1, p0, LS/t$f;->D:Lx7/a;

    iput-object p2, p0, LS/t$f;->E:Landroidx/compose/ui/d;

    iput-boolean p3, p0, LS/t$f;->F:Z

    iput-object p4, p0, LS/t$f;->G:Lo0/e2;

    iput-object p5, p0, LS/t$f;->H:LS/q;

    iput-object p6, p0, LS/t$f;->I:LS/s;

    iput-object p7, p0, LS/t$f;->J:Lz/l;

    iput-object p8, p0, LS/t$f;->K:Lx7/q;

    iput p9, p0, LS/t$f;->L:I

    iput p10, p0, LS/t$f;->M:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 11

    iget-object v0, p0, LS/t$f;->D:Lx7/a;

    iget-object v1, p0, LS/t$f;->E:Landroidx/compose/ui/d;

    iget-boolean v2, p0, LS/t$f;->F:Z

    iget-object v3, p0, LS/t$f;->G:Lo0/e2;

    iget-object v4, p0, LS/t$f;->H:LS/q;

    iget-object v5, p0, LS/t$f;->I:LS/s;

    iget-object v6, p0, LS/t$f;->J:Lz/l;

    iget-object v7, p0, LS/t$f;->K:Lx7/q;

    iget p2, p0, LS/t$f;->L:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v9

    iget v10, p0, LS/t$f;->M:I

    move-object v8, p1

    invoke-static/range {v0 .. v10}, LS/t;->d(Lx7/a;Landroidx/compose/ui/d;ZLo0/e2;LS/q;LS/s;Lz/l;Lx7/q;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/t$f;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
