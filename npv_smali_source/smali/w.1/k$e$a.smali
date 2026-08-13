.class final Lw/k$e$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/k$e;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/l;

.field final synthetic E:Lw/b;


# direct methods
.method constructor <init>(Lx7/l;Lw/b;)V
    .locals 0

    iput-object p1, p0, Lw/k$e$a;->D:Lx7/l;

    iput-object p2, p0, Lw/k$e$a;->E:Lw/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LA/k;LV/n;I)V
    .locals 2

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous>.<anonymous> (ContextMenuUi.android.kt:128)"

    const v1, 0x44f1a924

    invoke-static {v1, p3, p1, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p1, p3, :cond_3

    new-instance p1, Lw/g;

    invoke-direct {p1}, Lw/g;-><init>()V

    invoke-interface {p2, p1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast p1, Lw/g;

    iget-object p3, p0, Lw/k$e$a;->D:Lx7/l;

    iget-object v0, p0, Lw/k$e$a;->E:Lw/b;

    invoke-virtual {p1}, Lw/g;->b()V

    invoke-interface {p3, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p3, 0x0

    invoke-virtual {p1, v0, p2, p3}, Lw/g;->a(Lw/b;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
    :goto_1
    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA/k;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lw/k$e$a;->a(LA/k;LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
