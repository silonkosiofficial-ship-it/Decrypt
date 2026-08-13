.class public abstract LS/B1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS/B1$b;
    }
.end annotation


# static fields
.field private static final a:LV/O0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LS/B1$a;->D:LS/B1$a;

    invoke-static {v0}, LV/y;->f(Lx7/a;)LV/O0;

    move-result-object v0

    sput-object v0, LS/B1;->a:LV/O0;

    return-void
.end method

.method private static final a(LS/A1;LU/L;)LM0/P;
    .locals 1

    .prologue
    sget-object v0, LS/B1$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0

    :pswitch_0
    invoke-virtual {p0}, LS/A1;->l()LM0/P;

    move-result-object p0

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, LS/A1;->k()LM0/P;

    move-result-object p0

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0}, LS/A1;->j()LM0/P;

    move-result-object p0

    goto :goto_0

    :pswitch_3
    invoke-virtual {p0}, LS/A1;->c()LM0/P;

    move-result-object p0

    goto :goto_0

    :pswitch_4
    invoke-virtual {p0}, LS/A1;->b()LM0/P;

    move-result-object p0

    goto :goto_0

    :pswitch_5
    invoke-virtual {p0}, LS/A1;->a()LM0/P;

    move-result-object p0

    goto :goto_0

    :pswitch_6
    invoke-virtual {p0}, LS/A1;->o()LM0/P;

    move-result-object p0

    goto :goto_0

    :pswitch_7
    invoke-virtual {p0}, LS/A1;->n()LM0/P;

    move-result-object p0

    goto :goto_0

    :pswitch_8
    invoke-virtual {p0}, LS/A1;->m()LM0/P;

    move-result-object p0

    goto :goto_0

    :pswitch_9
    invoke-virtual {p0}, LS/A1;->i()LM0/P;

    move-result-object p0

    goto :goto_0

    :pswitch_a
    invoke-virtual {p0}, LS/A1;->h()LM0/P;

    move-result-object p0

    goto :goto_0

    :pswitch_b
    invoke-virtual {p0}, LS/A1;->g()LM0/P;

    move-result-object p0

    goto :goto_0

    :pswitch_c
    invoke-virtual {p0}, LS/A1;->f()LM0/P;

    move-result-object p0

    goto :goto_0

    :pswitch_d
    invoke-virtual {p0}, LS/A1;->e()LM0/P;

    move-result-object p0

    goto :goto_0

    :pswitch_e
    invoke-virtual {p0}, LS/A1;->d()LM0/P;

    move-result-object p0

    :goto_0
    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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

.method public static final b()LV/O0;
    .locals 1

    sget-object v0, LS/B1;->a:LV/O0;

    return-object v0
.end method

.method public static final c(LU/L;LV/n;I)LM0/P;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.<get-value> (Typography.kt:209)"

    const v2, -0x3e879211

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LS/o0;->a:LS/o0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LS/o0;->c(LV/n;I)LS/A1;

    move-result-object p1

    invoke-static {p1, p0}, LS/B1;->a(LS/A1;LU/L;)LM0/P;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p0
.end method
