.class final LH/a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/a;->a(LN/i;Landroidx/compose/ui/d;JLV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN/i;

.field final synthetic E:Landroidx/compose/ui/d;

.field final synthetic F:J

.field final synthetic G:I

.field final synthetic H:I


# direct methods
.method constructor <init>(LN/i;Landroidx/compose/ui/d;JII)V
    .locals 0

    iput-object p1, p0, LH/a$b;->D:LN/i;

    iput-object p2, p0, LH/a$b;->E:Landroidx/compose/ui/d;

    iput-wide p3, p0, LH/a$b;->F:J

    iput p5, p0, LH/a$b;->G:I

    iput p6, p0, LH/a$b;->H:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 7

    iget-object v0, p0, LH/a$b;->D:LN/i;

    iget-object v1, p0, LH/a$b;->E:Landroidx/compose/ui/d;

    iget-wide v2, p0, LH/a$b;->F:J

    iget p2, p0, LH/a$b;->G:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v5

    iget v6, p0, LH/a$b;->H:I

    move-object v4, p1

    invoke-static/range {v0 .. v6}, LH/a;->a(LN/i;Landroidx/compose/ui/d;JLV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LH/a$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
