.class final LD/r$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/r;->a(LD/s;Ljava/lang/Object;ILjava/lang/Object;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD/s;

.field final synthetic E:Ljava/lang/Object;

.field final synthetic F:I

.field final synthetic G:Ljava/lang/Object;

.field final synthetic H:I


# direct methods
.method constructor <init>(LD/s;Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    iput-object p1, p0, LD/r$b;->D:LD/s;

    iput-object p2, p0, LD/r$b;->E:Ljava/lang/Object;

    iput p3, p0, LD/r$b;->F:I

    iput-object p4, p0, LD/r$b;->G:Ljava/lang/Object;

    iput p5, p0, LD/r$b;->H:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 6

    iget-object v0, p0, LD/r$b;->D:LD/s;

    iget-object v1, p0, LD/r$b;->E:Ljava/lang/Object;

    iget v2, p0, LD/r$b;->F:I

    iget-object v3, p0, LD/r$b;->G:Ljava/lang/Object;

    iget p2, p0, LD/r$b;->H:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v5

    move-object v4, p1

    invoke-static/range {v0 .. v5}, LD/r;->b(LD/s;Ljava/lang/Object;ILjava/lang/Object;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LD/r$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
