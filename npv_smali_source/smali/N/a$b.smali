.class final LN/a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/a;->b(LN/i;ZLX0/i;ZJLandroidx/compose/ui/d;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/platform/A1;

.field final synthetic E:J

.field final synthetic F:Z

.field final synthetic G:Landroidx/compose/ui/d;

.field final synthetic H:LN/i;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/A1;JZLandroidx/compose/ui/d;LN/i;)V
    .locals 0

    iput-object p1, p0, LN/a$b;->D:Landroidx/compose/ui/platform/A1;

    iput-wide p2, p0, LN/a$b;->E:J

    iput-boolean p4, p0, LN/a$b;->F:Z

    iput-object p5, p0, LN/a$b;->G:Landroidx/compose/ui/d;

    iput-object p6, p0, LN/a$b;->H:LN/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 7

    .prologue
    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LV/n;->A()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:82)"

    const v2, 0x10b320d1

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, Landroidx/compose/ui/platform/p0;->r()LV/O0;

    move-result-object p2

    iget-object v0, p0, LN/a$b;->D:Landroidx/compose/ui/platform/A1;

    invoke-virtual {p2, v0}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object p2

    new-instance v6, LN/a$b$a;

    iget-wide v1, p0, LN/a$b;->E:J

    iget-boolean v3, p0, LN/a$b;->F:Z

    iget-object v4, p0, LN/a$b;->G:Landroidx/compose/ui/d;

    iget-object v5, p0, LN/a$b;->H:LN/i;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LN/a$b$a;-><init>(JZLandroidx/compose/ui/d;LN/i;)V

    const/16 v0, 0x36

    const v1, -0x5505aa6f

    const/4 v2, 0x1

    invoke-static {v1, v2, v6, p1, v0}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v0

    sget v1, LV/P0;->i:I

    or-int/lit8 v1, v1, 0x30

    invoke-static {p2, v0, p1, v1}, LV/y;->a(LV/P0;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/a$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
