.class final LS/q1$A;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->q(ZLo0/e2;Lx7/a;LS/o1;Lx7/q;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Z

.field final synthetic E:Lo0/e2;

.field final synthetic F:Lx7/a;

.field final synthetic G:LS/o1;

.field final synthetic H:Lx7/q;

.field final synthetic I:I


# direct methods
.method constructor <init>(ZLo0/e2;Lx7/a;LS/o1;Lx7/q;I)V
    .locals 0

    iput-boolean p1, p0, LS/q1$A;->D:Z

    iput-object p2, p0, LS/q1$A;->E:Lo0/e2;

    iput-object p3, p0, LS/q1$A;->F:Lx7/a;

    iput-object p4, p0, LS/q1$A;->G:LS/o1;

    iput-object p5, p0, LS/q1$A;->H:Lx7/q;

    iput p6, p0, LS/q1$A;->I:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 7

    iget-boolean v0, p0, LS/q1$A;->D:Z

    iget-object v1, p0, LS/q1$A;->E:Lo0/e2;

    iget-object v2, p0, LS/q1$A;->F:Lx7/a;

    iget-object v3, p0, LS/q1$A;->G:LS/o1;

    iget-object v4, p0, LS/q1$A;->H:Lx7/q;

    iget p2, p0, LS/q1$A;->I:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v6

    move-object v5, p1

    invoke-static/range {v0 .. v6}, LS/q1;->G(ZLo0/e2;Lx7/a;LS/o1;Lx7/q;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/q1$A;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
