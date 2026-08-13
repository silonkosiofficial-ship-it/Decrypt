.class public abstract LB8/C;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB8/C$a;
    }
.end annotation


# direct methods
.method public static final a(LB8/B;Li8/x;)LO7/u;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object p0, LB8/C$a;->c:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p0, p0, p1

    :goto_0
    const-string p1, "PRIVATE"

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    sget-object p0, LO7/t;->a:LO7/u;

    :goto_1
    invoke-static {p0, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :pswitch_1
    sget-object p0, LO7/t;->f:LO7/u;

    const-string p1, "LOCAL"

    goto :goto_1

    :pswitch_2
    sget-object p0, LO7/t;->e:LO7/u;

    const-string p1, "PUBLIC"

    goto :goto_1

    :pswitch_3
    sget-object p0, LO7/t;->c:LO7/u;

    const-string p1, "PROTECTED"

    goto :goto_1

    :pswitch_4
    sget-object p0, LO7/t;->b:LO7/u;

    const-string p1, "PRIVATE_TO_THIS"

    goto :goto_1

    :pswitch_5
    sget-object p0, LO7/t;->d:LO7/u;

    const-string p1, "INTERNAL"

    goto :goto_1

    :goto_2
    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static final b(LB8/B;Li8/j;)LO7/b$a;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object p0, LB8/C$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p0, p0, p1

    :goto_0
    const/4 p1, 0x1

    if-eq p0, p1, :cond_1

    const/4 p1, 0x2

    if-eq p0, p1, :cond_4

    const/4 p1, 0x3

    if-eq p0, p1, :cond_3

    const/4 p1, 0x4

    if-eq p0, p1, :cond_2

    :cond_1
    sget-object p0, LO7/b$a;->C:LO7/b$a;

    goto :goto_1

    :cond_2
    sget-object p0, LO7/b$a;->F:LO7/b$a;

    goto :goto_1

    :cond_3
    sget-object p0, LO7/b$a;->E:LO7/b$a;

    goto :goto_1

    :cond_4
    sget-object p0, LO7/b$a;->D:LO7/b$a;

    :goto_1
    return-object p0
.end method
