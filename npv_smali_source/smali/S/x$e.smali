.class final LS/x$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/x;->b(ZLL0/a;Landroidx/compose/ui/d;LS/v;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS/x$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/x$e;

    invoke-direct {v0}, LS/x$e;-><init>()V

    sput-object v0, LS/x$e;->D:LS/x$e;

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
    const v0, -0x4ef1fa91

    invoke-interface {p2, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:293)"

    invoke-static {v0, p3, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p1}, Lu/s0$b;->b()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, LL0/a;->D:LL0/a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-ne p3, v0, :cond_1

    const/4 p1, 0x1

    invoke-static {v1, p1, v2}, Lu/k;->h(IILjava/lang/Object;)Lu/h0;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lu/s0$b;->d()Ljava/lang/Object;

    move-result-object p1

    const/16 p3, 0x64

    if-ne p1, v0, :cond_2

    invoke-static {p3}, Lu/k;->g(I)Lu/h0;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x6

    invoke-static {p3, v1, v2, p1, v2}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object p1

    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
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

    invoke-virtual {p0, p1, p2, p3}, LS/x$e;->a(Lu/s0$b;LV/n;I)Lu/I;

    move-result-object p1

    return-object p1
.end method
