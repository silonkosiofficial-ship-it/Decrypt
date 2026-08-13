.class final LD0/C$h;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD0/C;->L(LF0/J;LD0/C$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/C$a;

.field final synthetic E:Lx7/p;


# direct methods
.method constructor <init>(LD0/C$a;Lx7/p;)V
    .locals 0

    iput-object p1, p0, LD0/C$h;->D:LD0/C$a;

    iput-object p2, p0, LD0/C$h;->E:Lx7/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 3

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

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:493)"

    const v2, -0x68551fe9

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LD0/C$h;->D:LD0/C$a;

    invoke-virtual {p2}, LD0/C$a;->a()Z

    move-result p2

    iget-object v0, p0, LD0/C$h;->E:Lx7/p;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0xcf

    invoke-interface {p1, v2, v1}, LV/n;->w(ILjava/lang/Object;)V

    invoke-interface {p1, p2}, LV/n;->d(Z)Z

    move-result v1

    const v2, -0x33d6b053    # -4.4383924E7f

    invoke-interface {p1, v2}, LV/n;->T(I)V

    if-eqz p2, :cond_3

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-interface {p1, v1}, LV/n;->p(Z)V

    :goto_1
    invoke-interface {p1}, LV/n;->J()V

    invoke-interface {p1}, LV/n;->e()V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
    :goto_2
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LD0/C$h;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
