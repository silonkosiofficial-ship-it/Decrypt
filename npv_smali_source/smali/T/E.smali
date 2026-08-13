.class public final LT/E;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# static fields
.field public static final D:LT/E;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT/E;

    invoke-direct {v0}, LT/E;-><init>()V

    sput-object v0, LT/E;->D:LT/E;

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
    .locals 4

    .prologue
    const v0, -0x44d2bf44

    invoke-interface {p2, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:367)"

    invoke-static {v0, p3, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p3, LT/p;->C:LT/p;

    sget-object v0, LT/p;->D:LT/p;

    invoke-interface {p1, p3, v0}, Lu/s0$b;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v2, 0x43

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-static {}, Lu/H;->e()Lu/F;

    move-result-object p1

    const/4 p3, 0x2

    const/4 v0, 0x0

    invoke-static {v2, v0, p1, p3, v3}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-interface {p1, v0, p3}, Lu/s0$b;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_3

    sget-object p3, LT/p;->E:LT/p;

    invoke-interface {p1, p3, v0}, Lu/s0$b;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x7

    const/4 p3, 0x0

    invoke-static {p3, p3, v3, p1, v3}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p1

    goto :goto_1

    :cond_3
    :goto_0
    const/16 p1, 0x53

    invoke-static {}, Lu/H;->e()Lu/F;

    move-result-object p3

    invoke-static {p1, v2, p3}, Lu/k;->k(IILu/F;)Lu/w0;

    move-result-object p1

    :goto_1
    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
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

    invoke-virtual {p0, p1, p2, p3}, LT/E;->a(Lu/s0$b;LV/n;I)Lu/I;

    move-result-object p1

    return-object p1
.end method
