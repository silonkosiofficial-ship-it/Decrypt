.class final LN/H$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/H;->c(Landroidx/compose/ui/d;LN/F;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN/F;


# direct methods
.method constructor <init>(LN/F;)V
    .locals 0

    iput-object p1, p0, LN/H$b;->D:LN/F;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method

.method public static final synthetic a(LV/w0;)J
    .locals 2

    invoke-static {p0}, LN/H$b;->g(LV/w0;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic e(LV/w0;J)V
    .locals 0

    invoke-static {p0, p1, p2}, LN/H$b;->k(LV/w0;J)V

    return-void
.end method

.method private static final g(LV/w0;)J
    .locals 2

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LY0/t;

    invoke-virtual {p0}, LY0/t;->j()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final k(LV/w0;J)V
    .locals 0

    invoke-static {p1, p2}, LY0/t;->b(J)LY0/t;

    move-result-object p1

    invoke-interface {p0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final f(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
    .locals 5

    .prologue
    const v0, 0x760d4197

    invoke-interface {p2, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:48)"

    invoke-static {v0, p3, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object p3

    invoke-interface {p2, p3}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LY0/e;

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_1

    sget-object v0, LY0/t;->b:LY0/t$a;

    invoke-virtual {v0}, LY0/t$a;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/t;->b(J)LY0/t;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    invoke-interface {p2, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, LV/w0;

    iget-object v2, p0, LN/H$b;->D:LN/F;

    invoke-interface {p2, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p0, LN/H$b;->D:LN/F;

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_2

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_3

    :cond_2
    new-instance v4, LN/H$b$a;

    invoke-direct {v4, v3, v0}, LN/H$b$a;-><init>(LN/F;LV/w0;)V

    invoke-interface {p2, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v4, Lx7/a;

    invoke-interface {p2, p3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_4

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_5

    :cond_4
    new-instance v3, LN/H$b$b;

    invoke-direct {v3, p3, v0}, LN/H$b$b;-><init>(LY0/e;LV/w0;)V

    invoke-interface {p2, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lx7/l;

    invoke-static {p1, v4, v3}, LN/y;->d(Landroidx/compose/ui/d;Lx7/a;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-static {}, LV/q;->P()V

    :cond_6
    invoke-interface {p2}, LV/n;->J()V

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/d;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LN/H$b;->f(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
