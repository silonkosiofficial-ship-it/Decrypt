.class public abstract LP6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string v2, "\r\n"

    invoke-static {v2, v0, v1, v0}, Ld7/e;->d(Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)[B

    move-result-object v0

    sput-object v0, LP6/b;->a:[B

    return-void
.end method

.method public static final synthetic a(Lo9/q;Lio/ktor/utils/io/g;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LP6/b;->d(Lo9/q;Lio/ktor/utils/io/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Ljava/lang/String;
    .locals 1

    invoke-static {}, LP6/b;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic c()[B
    .locals 1

    sget-object v0, LP6/b;->a:[B

    return-object v0
.end method

.method private static final d(Lo9/q;Lio/ktor/utils/io/g;Lm7/e;)Ljava/lang/Object;
    .locals 0

    .prologue
    invoke-static {p1, p0, p2}, Lio/ktor/utils/io/k;->j(Lio/ktor/utils/io/g;Lo9/q;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final e()Ljava/lang/String;
    .locals 5

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    :goto_0
    const-string v2, "toString(...)"

    const/16 v3, 0x20

    if-ge v1, v3, :cond_0

    sget-object v3, LC7/c;->C:LC7/c$a;

    invoke-virtual {v3}, LC7/c$a;->b()I

    move-result v3

    const/16 v4, 0x10

    invoke-static {v4}, LS8/a;->a(I)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x46

    invoke-static {v0, v1}, LS8/r;->B1(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
