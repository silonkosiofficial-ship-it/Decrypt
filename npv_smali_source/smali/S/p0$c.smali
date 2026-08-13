.class final LS/p0$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/p0;->a(LS/z;LS/S0;LS/A1;Lx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/z;

.field final synthetic E:LS/S0;

.field final synthetic F:LS/A1;

.field final synthetic G:Lx7/p;

.field final synthetic H:I

.field final synthetic I:I


# direct methods
.method constructor <init>(LS/z;LS/S0;LS/A1;Lx7/p;II)V
    .locals 0

    iput-object p1, p0, LS/p0$c;->D:LS/z;

    iput-object p2, p0, LS/p0$c;->E:LS/S0;

    iput-object p3, p0, LS/p0$c;->F:LS/A1;

    iput-object p4, p0, LS/p0$c;->G:Lx7/p;

    iput p5, p0, LS/p0$c;->H:I

    iput p6, p0, LS/p0$c;->I:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 7

    iget-object v0, p0, LS/p0$c;->D:LS/z;

    iget-object v1, p0, LS/p0$c;->E:LS/S0;

    iget-object v2, p0, LS/p0$c;->F:LS/A1;

    iget-object v3, p0, LS/p0$c;->G:Lx7/p;

    iget p2, p0, LS/p0$c;->H:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v5

    iget v6, p0, LS/p0$c;->I:I

    move-object v4, p1

    invoke-static/range {v0 .. v6}, LS/p0;->a(LS/z;LS/S0;LS/A1;Lx7/p;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/p0$c;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
