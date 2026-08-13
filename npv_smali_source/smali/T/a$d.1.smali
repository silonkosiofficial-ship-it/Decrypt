.class final LT/a$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/a;->a(Landroidx/lifecycle/r;Lx7/l;Lx7/a;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/lifecycle/r;

.field final synthetic E:Lx7/l;

.field final synthetic F:Lx7/a;

.field final synthetic G:I

.field final synthetic H:I


# direct methods
.method constructor <init>(Landroidx/lifecycle/r;Lx7/l;Lx7/a;II)V
    .locals 0

    iput-object p1, p0, LT/a$d;->D:Landroidx/lifecycle/r;

    iput-object p2, p0, LT/a$d;->E:Lx7/l;

    iput-object p3, p0, LT/a$d;->F:Lx7/a;

    iput p4, p0, LT/a$d;->G:I

    iput p5, p0, LT/a$d;->H:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 6

    iget-object v0, p0, LT/a$d;->D:Landroidx/lifecycle/r;

    iget-object v1, p0, LT/a$d;->E:Lx7/l;

    iget-object v2, p0, LT/a$d;->F:Lx7/a;

    iget p2, p0, LT/a$d;->G:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v4

    iget v5, p0, LT/a$d;->H:I

    move-object v3, p1

    invoke-static/range {v0 .. v5}, LT/a;->b(Landroidx/lifecycle/r;Lx7/l;Lx7/a;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LT/a$d;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
