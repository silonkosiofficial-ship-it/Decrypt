.class public final Lh9/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh9/j;
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

    invoke-direct {p0}, Lh9/j$a;-><init>()V

    return-void
.end method

.method public static synthetic c(Lh9/j$a;Ljava/lang/CharSequence;Li9/n;ILjava/lang/Object;)Lh9/j;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, Lh9/k;->b()Li9/n;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lh9/j$a;->b(Ljava/lang/CharSequence;Li9/n;)Lh9/j;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lx7/l;)Li9/n;
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li9/B;->b:Li9/B$b;

    invoke-virtual {v0, p1}, Li9/B$b;->a(Lx7/l;)Li9/B;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/CharSequence;Li9/n;)Lh9/j;
    .locals 1

    .prologue
    const-string v0, "input"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh9/j$b;->a:Lh9/j$b;

    invoke-virtual {v0}, Lh9/j$b;->a()Li9/n;

    move-result-object v0

    if-ne p2, v0, :cond_0

    :try_start_0
    invoke-static {p1}, Lj$/time/LocalDateTime;->parse(Ljava/lang/CharSequence;)Lj$/time/LocalDateTime;

    move-result-object p1

    new-instance p2, Lh9/j;

    invoke-direct {p2, p1}, Lh9/j;-><init>(Lj$/time/LocalDateTime;)V
    :try_end_0
    .catch Lj$/time/format/DateTimeParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Lh9/c;

    invoke-direct {p2, p1}, Lh9/c;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    invoke-interface {p2, p1}, Li9/n;->b(Ljava/lang/CharSequence;)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Lh9/j;

    :goto_0
    return-object p2
.end method

.method public final serializer()Lt9/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt9/b;"
        }
    .end annotation

    sget-object v0, Ln9/d;->a:Ln9/d;

    return-object v0
.end method
