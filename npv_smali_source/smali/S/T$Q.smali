.class final LS/T$Q;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->p(Lx7/a;ZLandroidx/compose/ui/d;Lx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/p;

.field final synthetic E:Z


# direct methods
.method constructor <init>(Lx7/p;Z)V
    .locals 0

    iput-object p1, p0, LS/T$Q;->D:Lx7/p;

    iput-boolean p2, p0, LS/T$Q;->E:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LA/L;LV/n;I)V
    .locals 9

    .prologue
    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LV/n;->u()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LV/n;->A()V

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:2216)"

    const v1, 0x71309fb5

    invoke-static {v1, p3, p1, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, LS/T$Q;->D:Lx7/p;

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v0, LS/l;->a:LS/l;

    invoke-virtual {v0}, LS/l;->h()F

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/foundation/layout/p;->p(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p2, v1}, LA/N;->a(Landroidx/compose/ui/d;LV/n;I)V

    sget-object v0, LO/b$a;->a:LO/b$a;

    invoke-static {v0}, LQ/c;->a(LO/b$a;)Lu0/d;

    move-result-object v1

    iget-boolean v0, p0, LS/T$Q;->E:Z

    if-eqz v0, :cond_3

    const v0, -0x511090f5

    invoke-interface {p2, v0}, LV/n;->T(I)V

    sget-object v0, LT/x;->a:LT/x$a;

    sget v0, LS/C0;->p:I

    :goto_1
    invoke-static {v0}, LT/x;->a(I)I

    move-result v0

    invoke-static {v0, p2, p3}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2}, LV/n;->J()V

    move-object v2, p3

    goto :goto_2

    :cond_3
    const v0, -0x510f20b6

    invoke-interface {p2, v0}, LV/n;->T(I)V

    sget-object v0, LT/x;->a:LT/x$a;

    sget v0, LS/C0;->t:I

    goto :goto_1

    :goto_2
    iget-boolean p3, p0, LS/T$Q;->E:Z

    if-eqz p3, :cond_4

    const/high16 p3, 0x43340000    # 180.0f

    goto :goto_3

    :cond_4
    const/4 p3, 0x0

    :goto_3
    invoke-static {p1, p3}, Ll0/j;->a(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object v3

    const/4 v7, 0x0

    const/16 v8, 0x8

    const-wide/16 v4, 0x0

    move-object v6, p2

    invoke-static/range {v1 .. v8}, LS/i0;->b(Lu0/d;Ljava/lang/String;Landroidx/compose/ui/d;JLV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    :goto_4
    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA/L;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LS/T$Q;->a(LA/L;LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
