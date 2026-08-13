.class final LT/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LT/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT/n;

    invoke-direct {v0}, LT/n;-><init>()V

    sput-object v0, LT/n;->a:LT/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/i;)Lu/j;
    .locals 1

    .prologue
    instance-of v0, p1, Lz/n$b;

    if-eqz v0, :cond_0

    :goto_0
    invoke-static {}, LT/o;->a()Lu/w0;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lz/b;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lz/g;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    instance-of p1, p1, Lz/d;

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method public final b(Lz/i;)Lu/j;
    .locals 1

    .prologue
    instance-of v0, p1, Lz/n$b;

    if-eqz v0, :cond_0

    :goto_0
    invoke-static {}, LT/o;->b()Lu/w0;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lz/b;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lz/g;

    if-eqz v0, :cond_2

    invoke-static {}, LT/o;->c()Lu/w0;

    move-result-object p1

    goto :goto_1

    :cond_2
    instance-of p1, p1, Lz/d;

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method
