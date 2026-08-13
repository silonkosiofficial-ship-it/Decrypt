.class public final Lt8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lt8/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt8/h;

    invoke-direct {v0}, Lt8/h;-><init>()V

    sput-object v0, Lt8/h;->a:Lt8/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Ljava/util/List;LO7/G;LL7/h;)Lt8/b;
    .locals 4

    .prologue
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p0, v1, v3, v2, v3}, Lt8/h;->d(Lt8/h;Ljava/lang/Object;LO7/G;ILjava/lang/Object;)Lt8/g;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    new-instance p1, Lt8/v;

    invoke-interface {p2}, LO7/G;->t()LL7/g;

    move-result-object p2

    invoke-virtual {p2, p3}, LL7/g;->O(LL7/h;)LF8/M;

    move-result-object p2

    const-string p3, "getPrimitiveArrayKotlinType(...)"

    invoke-static {p2, p3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0, p2}, Lt8/v;-><init>(Ljava/util/List;LF8/E;)V

    goto :goto_1

    :cond_2
    new-instance p1, Lt8/b;

    new-instance p2, Lt8/h$a;

    invoke-direct {p2, p3}, Lt8/h$a;-><init>(LL7/h;)V

    invoke-direct {p1, v0, p2}, Lt8/b;-><init>(Ljava/util/List;Lx7/l;)V

    :goto_1
    return-object p1
.end method

.method public static synthetic d(Lt8/h;Ljava/lang/Object;LO7/G;ILjava/lang/Object;)Lt8/g;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lt8/h;->c(Ljava/lang/Object;LO7/G;)Lt8/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/util/List;LF8/E;)Lt8/b;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt8/v;

    invoke-direct {v0, p1, p2}, Lt8/v;-><init>(Ljava/util/List;LF8/E;)V

    return-object v0
.end method

.method public final c(Ljava/lang/Object;LO7/G;)Lt8/g;
    .locals 2

    .prologue
    instance-of v0, p1, Ljava/lang/Byte;

    if-eqz v0, :cond_0

    new-instance p2, Lt8/d;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    invoke-direct {p2, p1}, Lt8/d;-><init>(B)V

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Ljava/lang/Short;

    if-eqz v0, :cond_1

    new-instance p2, Lt8/t;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result p1

    invoke-direct {p2, p1}, Lt8/t;-><init>(S)V

    goto/16 :goto_1

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    new-instance p2, Lt8/m;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {p2, p1}, Lt8/m;-><init>(I)V

    goto/16 :goto_1

    :cond_2
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_3

    new-instance p2, Lt8/q;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-direct {p2, v0, v1}, Lt8/q;-><init>(J)V

    goto/16 :goto_1

    :cond_3
    instance-of v0, p1, Ljava/lang/Character;

    if-eqz v0, :cond_4

    new-instance p2, Lt8/e;

    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-direct {p2, p1}, Lt8/e;-><init>(C)V

    goto/16 :goto_1

    :cond_4
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_5

    new-instance p2, Lt8/l;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-direct {p2, p1}, Lt8/l;-><init>(F)V

    goto/16 :goto_1

    :cond_5
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_6

    new-instance p2, Lt8/i;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-direct {p2, v0, v1}, Lt8/i;-><init>(D)V

    goto/16 :goto_1

    :cond_6
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_7

    new-instance p2, Lt8/c;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-direct {p2, p1}, Lt8/c;-><init>(Z)V

    goto/16 :goto_1

    :cond_7
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_8

    new-instance p2, Lt8/u;

    check-cast p1, Ljava/lang/String;

    invoke-direct {p2, p1}, Lt8/u;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_8
    instance-of v0, p1, [B

    if-eqz v0, :cond_9

    check-cast p1, [B

    invoke-static {p1}, Lj7/n;->L0([B)Ljava/util/List;

    move-result-object p1

    sget-object v0, LL7/h;->K:LL7/h;

    :goto_0
    invoke-direct {p0, p1, p2, v0}, Lt8/h;->b(Ljava/util/List;LO7/G;LL7/h;)Lt8/b;

    move-result-object p2

    goto :goto_1

    :cond_9
    instance-of v0, p1, [S

    if-eqz v0, :cond_a

    check-cast p1, [S

    invoke-static {p1}, Lj7/n;->S0([S)Ljava/util/List;

    move-result-object p1

    sget-object v0, LL7/h;->L:LL7/h;

    goto :goto_0

    :cond_a
    instance-of v0, p1, [I

    if-eqz v0, :cond_b

    check-cast p1, [I

    invoke-static {p1}, Lj7/n;->P0([I)Ljava/util/List;

    move-result-object p1

    sget-object v0, LL7/h;->M:LL7/h;

    goto :goto_0

    :cond_b
    instance-of v0, p1, [J

    if-eqz v0, :cond_c

    check-cast p1, [J

    invoke-static {p1}, Lj7/n;->Q0([J)Ljava/util/List;

    move-result-object p1

    sget-object v0, LL7/h;->O:LL7/h;

    goto :goto_0

    :cond_c
    instance-of v0, p1, [C

    if-eqz v0, :cond_d

    check-cast p1, [C

    invoke-static {p1}, Lj7/n;->M0([C)Ljava/util/List;

    move-result-object p1

    sget-object v0, LL7/h;->J:LL7/h;

    goto :goto_0

    :cond_d
    instance-of v0, p1, [F

    if-eqz v0, :cond_e

    check-cast p1, [F

    invoke-static {p1}, Lj7/n;->O0([F)Ljava/util/List;

    move-result-object p1

    sget-object v0, LL7/h;->N:LL7/h;

    goto :goto_0

    :cond_e
    instance-of v0, p1, [D

    if-eqz v0, :cond_f

    check-cast p1, [D

    invoke-static {p1}, Lj7/n;->N0([D)Ljava/util/List;

    move-result-object p1

    sget-object v0, LL7/h;->P:LL7/h;

    goto :goto_0

    :cond_f
    instance-of v0, p1, [Z

    if-eqz v0, :cond_10

    check-cast p1, [Z

    invoke-static {p1}, Lj7/n;->T0([Z)Ljava/util/List;

    move-result-object p1

    sget-object v0, LL7/h;->I:LL7/h;

    goto :goto_0

    :cond_10
    if-nez p1, :cond_11

    new-instance p2, Lt8/r;

    invoke-direct {p2}, Lt8/r;-><init>()V

    goto :goto_1

    :cond_11
    const/4 p2, 0x0

    :goto_1
    return-object p2
.end method
