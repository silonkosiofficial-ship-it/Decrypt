.class public abstract LA/I;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LD0/I;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LA/J;

    sget-object v1, LA/b;->a:LA/b;

    invoke-virtual {v1}, LA/b;->f()LA/b$e;

    move-result-object v1

    sget-object v2, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v2}, Lh0/c$a;->l()Lh0/c$c;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LA/J;-><init>(LA/b$e;Lh0/c$c;)V

    sput-object v0, LA/I;->a:LD0/I;

    return-void
.end method

.method public static final a(ZIIII)J
    .locals 0

    .prologue
    if-nez p0, :cond_0

    invoke-static {p1, p3, p2, p4}, LY0/c;->a(IIII)J

    move-result-wide p0

    goto :goto_0

    :cond_0
    sget-object p0, LY0/b;->b:LY0/b$a;

    invoke-virtual {p0, p1, p3, p2, p4}, LY0/b$a;->b(IIII)J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method public static final b(LA/b$e;Lh0/c$c;LV/n;I)LD0/I;
    .locals 5

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:122)"

    const v2, -0x31efee4e

    invoke-static {v2, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, LA/b;->a:LA/b;

    invoke-virtual {v0}, LA/b;->f()LA/b$e;

    move-result-object v0

    invoke-static {p0, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v0}, Lh0/c$a;->l()Lh0/c$c;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const p0, -0x329bf545    # -2.3911928E8f

    invoke-interface {p2, p0}, LV/n;->T(I)V

    invoke-interface {p2}, LV/n;->J()V

    sget-object p0, LA/I;->a:LD0/I;

    goto :goto_1

    :cond_1
    const v0, -0x329b2e8e

    invoke-interface {p2, v0}, LV/n;->T(I)V

    and-int/lit8 v0, p3, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x4

    if-le v0, v3, :cond_2

    invoke-interface {p2, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    and-int/lit8 v0, p3, 0x6

    if-ne v0, v3, :cond_4

    :cond_3
    move v0, v2

    goto :goto_0

    :cond_4
    move v0, v1

    :goto_0
    and-int/lit8 v3, p3, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/16 v4, 0x20

    if-le v3, v4, :cond_5

    invoke-interface {p2, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    and-int/lit8 p3, p3, 0x30

    if-ne p3, v4, :cond_7

    :cond_6
    move v1, v2

    :cond_7
    or-int p3, v0, v1

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_8

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_9

    :cond_8
    new-instance v0, LA/J;

    invoke-direct {v0, p0, p1}, LA/J;-><init>(LA/b$e;Lh0/c$c;)V

    invoke-interface {p2, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_9
    move-object p0, v0

    check-cast p0, LA/J;

    invoke-interface {p2}, LV/n;->J()V

    :goto_1
    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, LV/q;->P()V

    :cond_a
    return-object p0
.end method
