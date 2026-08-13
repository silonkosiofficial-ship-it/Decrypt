.class final LS/f$j;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/f;->d(Landroidx/compose/ui/d;Lx7/p;LM0/P;ZLx7/p;Lx7/q;FLA/S;LS/w1;LS/y1;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Lx7/p;

.field final synthetic F:LM0/P;

.field final synthetic G:Z

.field final synthetic H:Lx7/p;

.field final synthetic I:Lx7/q;

.field final synthetic J:F

.field final synthetic K:LA/S;

.field final synthetic L:LS/w1;

.field final synthetic M:I

.field final synthetic N:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;Lx7/p;LM0/P;ZLx7/p;Lx7/q;FLA/S;LS/w1;LS/y1;II)V
    .locals 0

    iput-object p1, p0, LS/f$j;->D:Landroidx/compose/ui/d;

    iput-object p2, p0, LS/f$j;->E:Lx7/p;

    iput-object p3, p0, LS/f$j;->F:LM0/P;

    iput-boolean p4, p0, LS/f$j;->G:Z

    iput-object p5, p0, LS/f$j;->H:Lx7/p;

    iput-object p6, p0, LS/f$j;->I:Lx7/q;

    iput p7, p0, LS/f$j;->J:F

    iput-object p8, p0, LS/f$j;->K:LA/S;

    iput-object p9, p0, LS/f$j;->L:LS/w1;

    iput p11, p0, LS/f$j;->M:I

    iput p12, p0, LS/f$j;->N:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 13

    iget-object v0, p0, LS/f$j;->D:Landroidx/compose/ui/d;

    iget-object v1, p0, LS/f$j;->E:Lx7/p;

    iget-object v2, p0, LS/f$j;->F:LM0/P;

    iget-boolean v3, p0, LS/f$j;->G:Z

    iget-object v4, p0, LS/f$j;->H:Lx7/p;

    iget-object v5, p0, LS/f$j;->I:Lx7/q;

    iget v6, p0, LS/f$j;->J:F

    iget-object v7, p0, LS/f$j;->K:LA/S;

    iget-object v8, p0, LS/f$j;->L:LS/w1;

    iget p2, p0, LS/f$j;->M:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v11

    iget v12, p0, LS/f$j;->N:I

    const/4 v9, 0x0

    move-object v10, p1

    invoke-static/range {v0 .. v12}, LS/f;->h(Landroidx/compose/ui/d;Lx7/p;LM0/P;ZLx7/p;Lx7/q;FLA/S;LS/w1;LS/y1;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/f$j;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
