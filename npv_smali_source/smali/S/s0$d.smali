.class final LS/s0$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/s0;->a(Landroidx/compose/ui/d;Lu/Z;LV/w0;Landroidx/compose/foundation/m;Lo0/e2;JFFLv/g;Lx7/q;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS/s0$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/s0$d;

    invoke-direct {v0}, LS/s0$d;-><init>()V

    sput-object v0, LS/s0$d;->D:LS/s0$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/s0$b;LV/n;I)Lu/I;
    .locals 3

    .prologue
    const v0, -0x50ca0a2d

    invoke-interface {p2, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:396)"

    invoke-static {v0, p3, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p3, v0}, Lu/s0$b;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 p3, 0x6

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    const/16 p1, 0x1e

    :goto_0
    invoke-static {p1, v0, v1, p3, v1}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/16 p1, 0x4b

    goto :goto_0

    :goto_1
    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {}, LV/q;->P()V

    :cond_2
    invoke-interface {p2}, LV/n;->J()V

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu/s0$b;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LS/s0$d;->a(Lu/s0$b;LV/n;I)Lu/I;

    move-result-object p1

    return-object p1
.end method
