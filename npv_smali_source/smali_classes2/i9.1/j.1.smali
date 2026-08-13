.class public final Li9/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/j$a;,
        Li9/j$b;
    }
.end annotation


# static fields
.field public static final k:Li9/j$a;

.field static final synthetic l:[LF7/k;


# instance fields
.field private final a:Li9/k;

.field private final b:Li9/Q;

.field private final c:Li9/Q;

.field private final d:Li9/Q;

.field private final e:Li9/Q;

.field private final f:Li9/Q;

.field private final g:Li9/Q;

.field private final h:Li9/Q;

.field private final i:Li9/Q;

.field private final j:Li9/Q;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Ly7/A;

    const-class v1, Li9/j;

    const-string v2, "monthNumber"

    const-string v3, "getMonthNumber()Ljava/lang/Integer;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v0

    new-instance v2, Ly7/A;

    const-string v3, "dayOfMonth"

    const-string v5, "getDayOfMonth()Ljava/lang/Integer;"

    invoke-direct {v2, v1, v3, v5, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v2

    new-instance v3, Ly7/A;

    const-string v5, "hour"

    const-string v6, "getHour()Ljava/lang/Integer;"

    invoke-direct {v3, v1, v5, v6, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v3

    new-instance v5, Ly7/A;

    const-string v6, "hourOfAmPm"

    const-string v7, "getHourOfAmPm()Ljava/lang/Integer;"

    invoke-direct {v5, v1, v6, v7, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v5

    new-instance v6, Ly7/A;

    const-string v7, "minute"

    const-string v8, "getMinute()Ljava/lang/Integer;"

    invoke-direct {v6, v1, v7, v8, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v6

    new-instance v7, Ly7/A;

    const-string v8, "second"

    const-string v9, "getSecond()Ljava/lang/Integer;"

    invoke-direct {v7, v1, v8, v9, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v7

    new-instance v8, Ly7/A;

    const-string v9, "offsetHours"

    const-string v10, "getOffsetHours()Ljava/lang/Integer;"

    invoke-direct {v8, v1, v9, v10, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v8

    new-instance v9, Ly7/A;

    const-string v10, "offsetMinutesOfHour"

    const-string v11, "getOffsetMinutesOfHour()Ljava/lang/Integer;"

    invoke-direct {v9, v1, v10, v11, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v9}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v9

    new-instance v10, Ly7/A;

    const-string v11, "offsetSecondsOfMinute"

    const-string v12, "getOffsetSecondsOfMinute()Ljava/lang/Integer;"

    invoke-direct {v10, v1, v11, v12, v4}, Ly7/A;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v10}, Ly7/P;->g(Ly7/z;)LF7/i;

    move-result-object v1

    const/16 v10, 0x9

    new-array v10, v10, [LF7/k;

    aput-object v0, v10, v4

    const/4 v0, 0x1

    aput-object v2, v10, v0

    const/4 v0, 0x2

    aput-object v3, v10, v0

    const/4 v0, 0x3

    aput-object v5, v10, v0

    const/4 v0, 0x4

    aput-object v6, v10, v0

    const/4 v0, 0x5

    aput-object v7, v10, v0

    const/4 v0, 0x6

    aput-object v8, v10, v0

    const/4 v0, 0x7

    aput-object v9, v10, v0

    const/16 v0, 0x8

    aput-object v1, v10, v0

    sput-object v10, Li9/j;->l:[LF7/k;

    new-instance v0, Li9/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li9/j$a;-><init>(Ly7/k;)V

    sput-object v0, Li9/j;->k:Li9/j$a;

    return-void
.end method

.method public constructor <init>(Li9/k;)V
    .locals 3

    const-string v0, "contents"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/j;->a:Li9/k;

    invoke-virtual {p1}, Li9/k;->G()Li9/v;

    new-instance v0, Li9/Q;

    new-instance v1, Li9/j$g;

    invoke-virtual {p1}, Li9/k;->G()Li9/v;

    move-result-object v2

    invoke-direct {v1, v2}, Li9/j$g;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Li9/Q;-><init>(LF7/h;)V

    iput-object v0, p0, Li9/j;->b:Li9/Q;

    new-instance v0, Li9/Q;

    new-instance v1, Li9/j$c;

    invoke-virtual {p1}, Li9/k;->G()Li9/v;

    move-result-object v2

    invoke-direct {v1, v2}, Li9/j$c;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Li9/Q;-><init>(LF7/h;)V

    iput-object v0, p0, Li9/j;->c:Li9/Q;

    new-instance v0, Li9/Q;

    new-instance v1, Li9/j$d;

    invoke-virtual {p1}, Li9/k;->I()Li9/x;

    move-result-object v2

    invoke-direct {v1, v2}, Li9/j$d;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Li9/Q;-><init>(LF7/h;)V

    iput-object v0, p0, Li9/j;->d:Li9/Q;

    new-instance v0, Li9/Q;

    new-instance v1, Li9/j$e;

    invoke-virtual {p1}, Li9/k;->I()Li9/x;

    move-result-object v2

    invoke-direct {v1, v2}, Li9/j$e;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Li9/Q;-><init>(LF7/h;)V

    iput-object v0, p0, Li9/j;->e:Li9/Q;

    invoke-virtual {p1}, Li9/k;->I()Li9/x;

    new-instance v0, Li9/Q;

    new-instance v1, Li9/j$f;

    invoke-virtual {p1}, Li9/k;->I()Li9/x;

    move-result-object v2

    invoke-direct {v1, v2}, Li9/j$f;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Li9/Q;-><init>(LF7/h;)V

    iput-object v0, p0, Li9/j;->f:Li9/Q;

    new-instance v0, Li9/Q;

    new-instance v1, Li9/j$k;

    invoke-virtual {p1}, Li9/k;->I()Li9/x;

    move-result-object v2

    invoke-direct {v1, v2}, Li9/j$k;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Li9/Q;-><init>(LF7/h;)V

    iput-object v0, p0, Li9/j;->g:Li9/Q;

    invoke-virtual {p1}, Li9/k;->H()Li9/y;

    new-instance v0, Li9/Q;

    new-instance v1, Li9/j$h;

    invoke-virtual {p1}, Li9/k;->H()Li9/y;

    move-result-object v2

    invoke-direct {v1, v2}, Li9/j$h;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Li9/Q;-><init>(LF7/h;)V

    iput-object v0, p0, Li9/j;->h:Li9/Q;

    new-instance v0, Li9/Q;

    new-instance v1, Li9/j$i;

    invoke-virtual {p1}, Li9/k;->H()Li9/y;

    move-result-object v2

    invoke-direct {v1, v2}, Li9/j$i;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Li9/Q;-><init>(LF7/h;)V

    iput-object v0, p0, Li9/j;->i:Li9/Q;

    new-instance v0, Li9/Q;

    new-instance v1, Li9/j$j;

    invoke-virtual {p1}, Li9/k;->H()Li9/y;

    move-result-object p1

    invoke-direct {v1, p1}, Li9/j$j;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Li9/Q;-><init>(LF7/h;)V

    iput-object v0, p0, Li9/j;->j:Li9/Q;

    return-void
.end method


# virtual methods
.method public final a()Li9/k;
    .locals 1

    iget-object v0, p0, Li9/j;->a:Li9/k;

    return-object v0
.end method

.method public final b()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/j;->a:Li9/k;

    invoke-virtual {v0}, Li9/k;->I()Li9/x;

    move-result-object v0

    invoke-virtual {v0}, Li9/x;->q()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/j;->a:Li9/k;

    invoke-virtual {v0}, Li9/k;->G()Li9/v;

    move-result-object v0

    invoke-virtual {v0}, Li9/v;->n()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lh9/g;
    .locals 10

    .prologue
    const-string v0, "The parsed date is outside the range representable by Instant"

    invoke-virtual {p0}, Li9/j;->f()Lh9/r;

    move-result-object v1

    invoke-virtual {p0}, Li9/j;->e()Lh9/l;

    move-result-object v2

    iget-object v3, p0, Li9/j;->a:Li9/k;

    invoke-virtual {v3}, Li9/k;->G()Li9/v;

    move-result-object v3

    invoke-virtual {v3}, Li9/v;->a()Li9/v;

    move-result-object v3

    invoke-virtual {v3}, Li9/v;->n()Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "year"

    invoke-static {v4, v5}, Li9/A;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    rem-int/lit16 v4, v4, 0x2710

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Li9/v;->t(Ljava/lang/Integer;)V

    :try_start_0
    invoke-virtual {p0}, Li9/j;->c()Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    div-int/lit16 v4, v4, 0x2710

    int-to-long v4, v4

    const-wide v6, 0x497968bd80L

    invoke-static {v4, v5, v6, v7}, Lj9/d;->b(JJ)J

    move-result-wide v4

    invoke-virtual {v3}, Li9/v;->c()Lh9/h;

    move-result-object v3

    invoke-virtual {v3}, Lh9/h;->q()I

    move-result v3

    int-to-long v6, v3

    const v3, 0x15180

    int-to-long v8, v3

    mul-long/2addr v6, v8

    invoke-virtual {v2}, Lh9/l;->q()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v6, v2

    invoke-virtual {v1}, Lh9/r;->a()I

    move-result v1

    int-to-long v1, v1

    sub-long/2addr v6, v1

    invoke-static {v4, v5, v6, v7}, Lj9/d;->a(JJ)J

    move-result-wide v1
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v3, Lh9/g;->Companion:Lh9/g$a;

    invoke-virtual {v3}, Lh9/g$a;->e()Lh9/g;

    move-result-object v4

    invoke-virtual {v4}, Lh9/g;->m()J

    move-result-wide v4

    cmp-long v4, v1, v4

    if-ltz v4, :cond_1

    invoke-virtual {v3}, Lh9/g$a;->d()Lh9/g;

    move-result-object v4

    invoke-virtual {v4}, Lh9/g;->m()J

    move-result-wide v4

    cmp-long v4, v1, v4

    if-gtz v4, :cond_1

    invoke-virtual {p0}, Li9/j;->b()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v1, v2, v0}, Lh9/g$a;->b(JI)Lh9/g;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v1, Lh9/c;

    invoke-direct {v1, v0}, Lh9/c;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_0
    move-exception v1

    new-instance v2, Lh9/c;

    invoke-direct {v2, v0, v1}, Lh9/c;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final e()Lh9/l;
    .locals 1

    iget-object v0, p0, Li9/j;->a:Li9/k;

    invoke-virtual {v0}, Li9/k;->I()Li9/x;

    move-result-object v0

    invoke-virtual {v0}, Li9/x;->k()Lh9/l;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lh9/r;
    .locals 1

    iget-object v0, p0, Li9/j;->a:Li9/k;

    invoke-virtual {v0}, Li9/k;->H()Li9/y;

    move-result-object v0

    invoke-virtual {v0}, Li9/y;->d()Lh9/r;

    move-result-object v0

    return-object v0
.end method
