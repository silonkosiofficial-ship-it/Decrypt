.class final LB/b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/b;->a(Landroidx/compose/ui/d;LB/D;LA/B;ZLA/b$m;Lh0/c$b;Lx/p;ZLx7/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:LB/D;

.field final synthetic F:LA/B;

.field final synthetic G:Z

.field final synthetic H:LA/b$m;

.field final synthetic I:Lh0/c$b;

.field final synthetic J:Lx/p;

.field final synthetic K:Z

.field final synthetic L:Lx7/l;

.field final synthetic M:I

.field final synthetic N:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;LB/D;LA/B;ZLA/b$m;Lh0/c$b;Lx/p;ZLx7/l;II)V
    .locals 0

    iput-object p1, p0, LB/b$a;->D:Landroidx/compose/ui/d;

    iput-object p2, p0, LB/b$a;->E:LB/D;

    iput-object p3, p0, LB/b$a;->F:LA/B;

    iput-boolean p4, p0, LB/b$a;->G:Z

    iput-object p5, p0, LB/b$a;->H:LA/b$m;

    iput-object p6, p0, LB/b$a;->I:Lh0/c$b;

    iput-object p7, p0, LB/b$a;->J:Lx/p;

    iput-boolean p8, p0, LB/b$a;->K:Z

    iput-object p9, p0, LB/b$a;->L:Lx7/l;

    iput p10, p0, LB/b$a;->M:I

    iput p11, p0, LB/b$a;->N:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 12

    iget-object v0, p0, LB/b$a;->D:Landroidx/compose/ui/d;

    iget-object v1, p0, LB/b$a;->E:LB/D;

    iget-object v2, p0, LB/b$a;->F:LA/B;

    iget-boolean v3, p0, LB/b$a;->G:Z

    iget-object v4, p0, LB/b$a;->H:LA/b$m;

    iget-object v5, p0, LB/b$a;->I:Lh0/c$b;

    iget-object v6, p0, LB/b$a;->J:Lx/p;

    iget-boolean v7, p0, LB/b$a;->K:Z

    iget-object v8, p0, LB/b$a;->L:Lx7/l;

    iget p2, p0, LB/b$a;->M:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v10

    iget v11, p0, LB/b$a;->N:I

    move-object v9, p1

    invoke-static/range {v0 .. v11}, LB/b;->a(Landroidx/compose/ui/d;LB/D;LA/B;ZLA/b$m;Lh0/c$b;Lx/p;ZLx7/l;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LB/b$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
