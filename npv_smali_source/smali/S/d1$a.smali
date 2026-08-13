.class final LS/d1$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/d1;->b(ZLx7/a;Landroidx/compose/ui/d;ZLx7/p;Lx7/p;JJLz/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/p;

.field final synthetic E:Lx7/p;


# direct methods
.method constructor <init>(Lx7/p;Lx7/p;)V
    .locals 0

    iput-object p1, p0, LS/d1$a;->D:Lx7/p;

    iput-object p2, p0, LS/d1$a;->E:Lx7/p;

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

    const-string v0, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:122)"

    const v1, 0x5bd9bbc6

    invoke-static {v1, p3, p1, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, LS/d1$a;->D:Lx7/p;

    iget-object p3, p0, LS/d1$a;->E:Lx7/p;

    const/4 v0, 0x0

    invoke-static {p1, p3, p2, v0}, LS/d1;->f(Lx7/p;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
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

    invoke-virtual {p0, p1, p2, p3}, LS/d1$a;->a(LA/k;LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
