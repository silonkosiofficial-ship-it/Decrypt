.class final LD/C$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/C;->a(Ljava/lang/Object;ILD/D;Lx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/Object;

.field final synthetic E:I

.field final synthetic F:LD/D;

.field final synthetic G:Lx7/p;

.field final synthetic H:I


# direct methods
.method constructor <init>(Ljava/lang/Object;ILD/D;Lx7/p;I)V
    .locals 0

    iput-object p1, p0, LD/C$b;->D:Ljava/lang/Object;

    iput p2, p0, LD/C$b;->E:I

    iput-object p3, p0, LD/C$b;->F:LD/D;

    iput-object p4, p0, LD/C$b;->G:Lx7/p;

    iput p5, p0, LD/C$b;->H:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 6

    iget-object v0, p0, LD/C$b;->D:Ljava/lang/Object;

    iget v1, p0, LD/C$b;->E:I

    iget-object v2, p0, LD/C$b;->F:LD/D;

    iget-object v3, p0, LD/C$b;->G:Lx7/p;

    iget p2, p0, LD/C$b;->H:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v5

    move-object v4, p1

    invoke-static/range {v0 .. v5}, LD/C;->a(Ljava/lang/Object;ILD/D;Lx7/p;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LD/C$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
