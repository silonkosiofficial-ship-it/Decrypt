.class public final Lh9/r$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh9/r;
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

    invoke-direct {p0}, Lh9/r$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lh9/r$a;Ljava/lang/CharSequence;Li9/n;ILjava/lang/Object;)Lh9/r;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, Lh9/u;->b()Li9/n;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lh9/r$a;->a(Ljava/lang/CharSequence;Li9/n;)Lh9/r;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;Li9/n;)Lh9/r;
    .locals 2

    .prologue
    const-string v0, "input"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh9/r$b;->a:Lh9/r$b;

    invoke-virtual {v0}, Lh9/r$b;->b()Li9/n;

    move-result-object v1

    if-ne p2, v1, :cond_0

    invoke-static {}, Lh9/t;->d()Lj$/time/format/DateTimeFormatter;

    move-result-object p2

    const-string v0, "access$getIsoFormat(...)"

    :goto_0
    invoke-static {p2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lh9/t;->e(Ljava/lang/CharSequence;Lj$/time/format/DateTimeFormatter;)Lh9/r;

    move-result-object p1

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lh9/r$b;->c()Li9/n;

    move-result-object v1

    if-ne p2, v1, :cond_1

    invoke-static {}, Lh9/t;->c()Lj$/time/format/DateTimeFormatter;

    move-result-object p2

    const-string v0, "access$getIsoBasicFormat(...)"

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lh9/r$b;->a()Li9/n;

    move-result-object v0

    if-ne p2, v0, :cond_2

    invoke-static {}, Lh9/t;->b()Lj$/time/format/DateTimeFormatter;

    move-result-object p2

    const-string v0, "access$getFourDigitsFormat(...)"

    goto :goto_0

    :cond_2
    invoke-interface {p2, p1}, Li9/n;->b(Ljava/lang/CharSequence;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh9/r;

    :goto_1
    return-object p1
.end method

.method public final serializer()Lt9/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt9/b;"
        }
    .end annotation

    sget-object v0, Ln9/g;->a:Ln9/g;

    return-object v0
.end method
