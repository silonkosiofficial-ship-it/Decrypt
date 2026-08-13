.class final Lw/a$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/a;->b(Lw/i;Lx7/a;Lx7/l;Landroidx/compose/ui/d;ZLx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lw/i;

.field final synthetic E:Lx7/a;

.field final synthetic F:Lx7/l;

.field final synthetic G:Landroidx/compose/ui/d;

.field final synthetic H:Z

.field final synthetic I:Lx7/p;

.field final synthetic J:I

.field final synthetic K:I


# direct methods
.method constructor <init>(Lw/i;Lx7/a;Lx7/l;Landroidx/compose/ui/d;ZLx7/p;II)V
    .locals 0

    iput-object p1, p0, Lw/a$c;->D:Lw/i;

    iput-object p2, p0, Lw/a$c;->E:Lx7/a;

    iput-object p3, p0, Lw/a$c;->F:Lx7/l;

    iput-object p4, p0, Lw/a$c;->G:Landroidx/compose/ui/d;

    iput-boolean p5, p0, Lw/a$c;->H:Z

    iput-object p6, p0, Lw/a$c;->I:Lx7/p;

    iput p7, p0, Lw/a$c;->J:I

    iput p8, p0, Lw/a$c;->K:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 9

    iget-object v0, p0, Lw/a$c;->D:Lw/i;

    iget-object v1, p0, Lw/a$c;->E:Lx7/a;

    iget-object v2, p0, Lw/a$c;->F:Lx7/l;

    iget-object v3, p0, Lw/a$c;->G:Landroidx/compose/ui/d;

    iget-boolean v4, p0, Lw/a$c;->H:Z

    iget-object v5, p0, Lw/a$c;->I:Lx7/p;

    iget p2, p0, Lw/a$c;->J:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v7

    iget v8, p0, Lw/a$c;->K:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, Lw/a;->b(Lw/i;Lx7/a;Lx7/l;Landroidx/compose/ui/d;ZLx7/p;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lw/a$c;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
