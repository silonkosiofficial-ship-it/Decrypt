.class public final LU6/f;
.super LU6/b$a;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LT6/h;

.field private final c:LT6/C;

.field private final d:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;LT6/h;LT6/C;)V
    .locals 1

    .prologue
    const-string v0, "text"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentType"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LU6/b$a;-><init>()V

    iput-object p1, p0, LU6/f;->a:Ljava/lang/String;

    iput-object p2, p0, LU6/f;->b:LT6/h;

    iput-object p3, p0, LU6/f;->c:LT6/C;

    invoke-virtual {p0}, LU6/f;->b()LT6/h;

    move-result-object p2

    invoke-static {p2}, LT6/i;->a(LT6/n;)Ljava/nio/charset/Charset;

    move-result-object p2

    if-nez p2, :cond_0

    sget-object p2, LS8/d;->b:Ljava/nio/charset/Charset;

    :cond_0
    invoke-static {p1, p2}, Ld7/e;->c(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p1

    iput-object p1, p0, LU6/f;->d:[B

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;LT6/h;LT6/C;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, LU6/f;-><init>(Ljava/lang/String;LT6/h;LT6/C;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Long;
    .locals 2

    iget-object v0, p0, LU6/f;->d:[B

    array-length v0, v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public b()LT6/h;
    .locals 1

    iget-object v0, p0, LU6/f;->b:LT6/h;

    return-object v0
.end method

.method public d()[B
    .locals 1

    iget-object v0, p0, LU6/f;->d:[B

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TextContent["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LU6/f;->b()LT6/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LU6/f;->a:Ljava/lang/String;

    const/16 v2, 0x1e

    invoke-static {v1, v2}, LS8/r;->B1(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
