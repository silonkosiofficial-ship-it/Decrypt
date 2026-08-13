.class public abstract LS/T0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS/T0$b;
    }
.end annotation


# static fields
.field private static final a:LV/O0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LS/T0$a;->D:LS/T0$a;

    invoke-static {v0}, LV/y;->f(Lx7/a;)LV/O0;

    move-result-object v0

    sput-object v0, LS/T0;->a:LV/O0;

    return-void
.end method

.method public static final a(LG/a;)LG/a;
    .locals 9

    const-wide/16 v0, 0x0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v1}, LG/c;->b(F)LG/b;

    move-result-object v3

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    invoke-static {v0}, LG/c;->b(F)LG/b;

    move-result-object v4

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, LG/a;->c(LG/a;LG/b;LG/b;LG/b;LG/b;ILjava/lang/Object;)LG/a;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LG/a;)LG/a;
    .locals 9

    const-wide/16 v0, 0x0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v1}, LG/c;->b(F)LG/b;

    move-result-object v3

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    invoke-static {v0}, LG/c;->b(F)LG/b;

    move-result-object v6

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, LG/a;->c(LG/a;LG/b;LG/b;LG/b;LG/b;ILjava/lang/Object;)LG/a;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LS/S0;LU/z;)Lo0/e2;
    .locals 1

    .prologue
    sget-object v0, LS/T0$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0

    :pswitch_0
    invoke-virtual {p0}, LS/S0;->e()LG/a;

    move-result-object p0

    goto :goto_1

    :pswitch_1
    invoke-static {}, Lo0/Y1;->a()Lo0/e2;

    move-result-object p0

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0}, LS/S0;->d()LG/a;

    move-result-object p0

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0}, LS/S0;->c()LG/a;

    move-result-object p0

    :goto_0
    invoke-static {p0}, LS/T0;->g(LG/a;)LG/a;

    move-result-object p0

    goto :goto_1

    :pswitch_4
    invoke-virtual {p0}, LS/S0;->c()LG/a;

    move-result-object p0

    invoke-static {p0}, LS/T0;->b(LG/a;)LG/a;

    move-result-object p0

    goto :goto_1

    :pswitch_5
    invoke-virtual {p0}, LS/S0;->c()LG/a;

    move-result-object p0

    goto :goto_1

    :pswitch_6
    invoke-static {}, LG/g;->e()LG/f;

    move-result-object p0

    goto :goto_1

    :pswitch_7
    invoke-virtual {p0}, LS/S0;->b()LG/a;

    move-result-object p0

    goto :goto_0

    :pswitch_8
    invoke-virtual {p0}, LS/S0;->b()LG/a;

    move-result-object p0

    goto :goto_1

    :pswitch_9
    invoke-virtual {p0}, LS/S0;->a()LG/a;

    move-result-object p0

    goto :goto_0

    :pswitch_a
    invoke-virtual {p0}, LS/S0;->a()LG/a;

    move-result-object p0

    :goto_1
    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final d()LV/O0;
    .locals 1

    sget-object v0, LS/T0;->a:LV/O0;

    return-object v0
.end method

.method public static final e(LU/z;LV/n;I)Lo0/e2;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.<get-value> (Shapes.kt:191)"

    const v2, 0x611b333f

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LS/o0;->a:LS/o0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LS/o0;->b(LV/n;I)LS/S0;

    move-result-object p1

    invoke-static {p1, p0}, LS/T0;->c(LS/S0;LU/z;)Lo0/e2;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p0
.end method

.method public static final f(LG/a;)LG/a;
    .locals 9

    const-wide/16 v0, 0x0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v1}, LG/c;->b(F)LG/b;

    move-result-object v4

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    invoke-static {v0}, LG/c;->b(F)LG/b;

    move-result-object v5

    const/16 v7, 0x9

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, LG/a;->c(LG/a;LG/b;LG/b;LG/b;LG/b;ILjava/lang/Object;)LG/a;

    move-result-object p0

    return-object p0
.end method

.method public static final g(LG/a;)LG/a;
    .locals 9

    const-wide/16 v0, 0x0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v1}, LG/c;->b(F)LG/b;

    move-result-object v6

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    invoke-static {v0}, LG/c;->b(F)LG/b;

    move-result-object v5

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, LG/a;->c(LG/a;LG/b;LG/b;LG/b;LG/b;ILjava/lang/Object;)LG/a;

    move-result-object p0

    return-object p0
.end method
