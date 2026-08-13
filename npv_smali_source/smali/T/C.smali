.class public final LT/C;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# static fields
.field public static final D:LT/C;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT/C;

    invoke-direct {v0}, LT/C;-><init>()V

    sput-object v0, LT/C;->D:LT/C;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/s0$b;LV/n;I)Lu/I;
    .locals 2

    .prologue
    const p1, 0x4c116805    # 3.8117396E7f

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:354)"

    invoke-static {p1, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    const/4 p3, 0x6

    const/16 v0, 0x96

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, p3, v1}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
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

    invoke-virtual {p0, p1, p2, p3}, LT/C;->a(Lu/s0$b;LV/n;I)Lu/I;

    move-result-object p1

    return-object p1
.end method
