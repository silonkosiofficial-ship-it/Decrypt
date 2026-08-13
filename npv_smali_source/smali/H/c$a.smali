.class final LH/c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/c;->a(Ljava/lang/String;Landroidx/compose/ui/d;LM0/P;Lx7/l;IZIILo0/B0;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/String;

.field final synthetic E:Landroidx/compose/ui/d;

.field final synthetic F:LM0/P;

.field final synthetic G:Lx7/l;

.field final synthetic H:I

.field final synthetic I:Z

.field final synthetic J:I

.field final synthetic K:I

.field final synthetic L:Lo0/B0;

.field final synthetic M:I

.field final synthetic N:I


# direct methods
.method constructor <init>(Ljava/lang/String;Landroidx/compose/ui/d;LM0/P;Lx7/l;IZIILo0/B0;II)V
    .locals 0

    iput-object p1, p0, LH/c$a;->D:Ljava/lang/String;

    iput-object p2, p0, LH/c$a;->E:Landroidx/compose/ui/d;

    iput-object p3, p0, LH/c$a;->F:LM0/P;

    iput-object p4, p0, LH/c$a;->G:Lx7/l;

    iput p5, p0, LH/c$a;->H:I

    iput-boolean p6, p0, LH/c$a;->I:Z

    iput p7, p0, LH/c$a;->J:I

    iput p8, p0, LH/c$a;->K:I

    iput-object p9, p0, LH/c$a;->L:Lo0/B0;

    iput p10, p0, LH/c$a;->M:I

    iput p11, p0, LH/c$a;->N:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 12

    iget-object v0, p0, LH/c$a;->D:Ljava/lang/String;

    iget-object v1, p0, LH/c$a;->E:Landroidx/compose/ui/d;

    iget-object v2, p0, LH/c$a;->F:LM0/P;

    iget-object v3, p0, LH/c$a;->G:Lx7/l;

    iget v4, p0, LH/c$a;->H:I

    iget-boolean v5, p0, LH/c$a;->I:Z

    iget v6, p0, LH/c$a;->J:I

    iget v7, p0, LH/c$a;->K:I

    iget-object v8, p0, LH/c$a;->L:Lo0/B0;

    iget p2, p0, LH/c$a;->M:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v10

    iget v11, p0, LH/c$a;->N:I

    move-object v9, p1

    invoke-static/range {v0 .. v11}, LH/c;->a(Ljava/lang/String;Landroidx/compose/ui/d;LM0/P;Lx7/l;IZIILo0/B0;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LH/c$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
