.class final Lw/k$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/k;->b(Ljava/lang/String;ZLw/b;Landroidx/compose/ui/d;Lx7/q;Lx7/a;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/String;

.field final synthetic E:Z

.field final synthetic F:Lw/b;

.field final synthetic G:Landroidx/compose/ui/d;

.field final synthetic H:Lx7/q;

.field final synthetic I:Lx7/a;

.field final synthetic J:I

.field final synthetic K:I


# direct methods
.method constructor <init>(Ljava/lang/String;ZLw/b;Landroidx/compose/ui/d;Lx7/q;Lx7/a;II)V
    .locals 0

    iput-object p1, p0, Lw/k$c;->D:Ljava/lang/String;

    iput-boolean p2, p0, Lw/k$c;->E:Z

    iput-object p3, p0, Lw/k$c;->F:Lw/b;

    iput-object p4, p0, Lw/k$c;->G:Landroidx/compose/ui/d;

    iput-object p5, p0, Lw/k$c;->H:Lx7/q;

    iput-object p6, p0, Lw/k$c;->I:Lx7/a;

    iput p7, p0, Lw/k$c;->J:I

    iput p8, p0, Lw/k$c;->K:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 9

    iget-object v0, p0, Lw/k$c;->D:Ljava/lang/String;

    iget-boolean v1, p0, Lw/k$c;->E:Z

    iget-object v2, p0, Lw/k$c;->F:Lw/b;

    iget-object v3, p0, Lw/k$c;->G:Landroidx/compose/ui/d;

    iget-object v4, p0, Lw/k$c;->H:Lx7/q;

    iget-object v5, p0, Lw/k$c;->I:Lx7/a;

    iget p2, p0, Lw/k$c;->J:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v7

    iget v8, p0, Lw/k$c;->K:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, Lw/k;->b(Ljava/lang/String;ZLw/b;Landroidx/compose/ui/d;Lx7/q;Lx7/a;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lw/k$c;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
