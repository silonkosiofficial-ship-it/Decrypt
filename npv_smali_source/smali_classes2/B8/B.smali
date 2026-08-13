.class public final LB8/B;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB8/B$a;
    }
.end annotation


# static fields
.field public static final a:LB8/B;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LB8/B;

    invoke-direct {v0}, LB8/B;-><init>()V

    sput-object v0, LB8/B;->a:LB8/B;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Li8/c$c;)LO7/f;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, LB8/B$a;->d:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    packed-switch p1, :pswitch_data_0

    :pswitch_0
    sget-object p1, LO7/f;->D:LO7/f;

    goto :goto_1

    :pswitch_1
    sget-object p1, LO7/f;->I:LO7/f;

    goto :goto_1

    :pswitch_2
    sget-object p1, LO7/f;->H:LO7/f;

    goto :goto_1

    :pswitch_3
    sget-object p1, LO7/f;->G:LO7/f;

    goto :goto_1

    :pswitch_4
    sget-object p1, LO7/f;->F:LO7/f;

    goto :goto_1

    :pswitch_5
    sget-object p1, LO7/f;->E:LO7/f;

    :goto_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public final b(Li8/k;)LO7/D;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, LB8/B$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_4

    const/4 v0, 0x3

    if-eq p1, v0, :cond_3

    const/4 v0, 0x4

    if-eq p1, v0, :cond_2

    :cond_1
    sget-object p1, LO7/D;->D:LO7/D;

    goto :goto_1

    :cond_2
    sget-object p1, LO7/D;->E:LO7/D;

    goto :goto_1

    :cond_3
    sget-object p1, LO7/D;->G:LO7/D;

    goto :goto_1

    :cond_4
    sget-object p1, LO7/D;->F:LO7/D;

    :goto_1
    return-object p1
.end method

.method public final c(Li8/q$b$c;)LF8/u0;
    .locals 3

    .prologue
    const-string v0, "projection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LB8/B$a;->g:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Only IN, OUT and INV are supported. Actual argument: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p1, LF8/u0;->G:LF8/u0;

    goto :goto_0

    :cond_2
    sget-object p1, LF8/u0;->I:LF8/u0;

    goto :goto_0

    :cond_3
    sget-object p1, LF8/u0;->H:LF8/u0;

    :goto_0
    return-object p1
.end method

.method public final d(Li8/s$c;)LF8/u0;
    .locals 1

    .prologue
    const-string v0, "variance"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LB8/B$a;->f:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    sget-object p1, LF8/u0;->G:LF8/u0;

    goto :goto_0

    :cond_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_1
    sget-object p1, LF8/u0;->I:LF8/u0;

    goto :goto_0

    :cond_2
    sget-object p1, LF8/u0;->H:LF8/u0;

    :goto_0
    return-object p1
.end method
