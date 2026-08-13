.class public abstract synthetic Lw9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lw9/d;->a:Lw9/d$a;

    return-void
.end method

.method public static a(Lw9/d;Lv9/f;)I
    .locals 0

    const-string p0, "descriptor"

    invoke-static {p1, p0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, -0x1

    return p0
.end method

.method public static b(Lw9/d;)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic c(Lw9/d;Lv9/f;ILt9/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lw9/d;->B(Lv9/f;ILt9/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: decodeSerializableElement"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
