.class public final Lh9/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lh9/g$a;-><init>()V

    return-void
.end method

.method public static synthetic h(Lh9/g$a;Ljava/lang/CharSequence;Li9/n;ILjava/lang/Object;)Lh9/g;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Li9/j$b;->a:Li9/j$b;

    invoke-virtual {p2}, Li9/j$b;->a()Li9/n;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lh9/g$a;->g(Ljava/lang/CharSequence;Li9/n;)Lh9/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(J)Lh9/g;
    .locals 1

    new-instance v0, Lh9/g;

    invoke-static {p1, p2}, Lj$/time/Instant;->ofEpochMilli(J)Lj$/time/Instant;

    move-result-object p1

    const-string p2, "ofEpochMilli(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lh9/g;-><init>(Lj$/time/Instant;)V

    return-object v0
.end method

.method public final b(JI)Lh9/g;
    .locals 2

    int-to-long v0, p3

    invoke-virtual {p0, p1, p2, v0, v1}, Lh9/g$a;->c(JJ)Lh9/g;

    move-result-object p1

    return-object p1
.end method

.method public final c(JJ)Lh9/g;
    .locals 1

    .prologue
    :try_start_0
    new-instance v0, Lh9/g;

    invoke-static {p1, p2, p3, p4}, Lj$/time/Instant;->ofEpochSecond(JJ)Lj$/time/Instant;

    move-result-object p3

    const-string p4, "ofEpochSecond(...)"

    invoke-static {p3, p4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p3}, Lh9/g;-><init>(Lj$/time/Instant;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p3

    instance-of p4, p3, Ljava/lang/ArithmeticException;

    if-nez p4, :cond_1

    instance-of p4, p3, Lj$/time/DateTimeException;

    if-eqz p4, :cond_0

    goto :goto_0

    :cond_0
    throw p3

    :cond_1
    :goto_0
    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    if-lez p1, :cond_2

    invoke-virtual {p0}, Lh9/g$a;->d()Lh9/g;

    move-result-object p1

    :goto_1
    move-object v0, p1

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lh9/g$a;->e()Lh9/g;

    move-result-object p1

    goto :goto_1

    :goto_2
    return-object v0
.end method

.method public final d()Lh9/g;
    .locals 1

    invoke-static {}, Lh9/g;->e()Lh9/g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lh9/g;
    .locals 1

    invoke-static {}, Lh9/g;->g()Lh9/g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lh9/g;
    .locals 3

    new-instance v0, Lh9/g;

    invoke-static {}, Lj$/time/Clock;->systemUTC()Lj$/time/Clock;

    move-result-object v1

    invoke-virtual {v1}, Lj$/time/Clock;->instant()Lj$/time/Instant;

    move-result-object v1

    const-string v2, "instant(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lh9/g;-><init>(Lj$/time/Instant;)V

    return-object v0
.end method

.method public final g(Ljava/lang/CharSequence;Li9/n;)Lh9/g;
    .locals 3

    .prologue
    const-string v0, "input"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p2, p1}, Li9/n;->b(Ljava/lang/CharSequence;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li9/j;

    invoke-virtual {p2}, Li9/j;->d()Lh9/g;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p2

    new-instance v0, Lh9/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to parse an instant from \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x27

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lh9/c;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final serializer()Lt9/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt9/b;"
        }
    .end annotation

    sget-object v0, Ln9/b;->a:Ln9/b;

    return-object v0
.end method
