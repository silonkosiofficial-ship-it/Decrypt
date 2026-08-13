.class public final Lio/ktor/utils/io/a$a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/ktor/utils/io/a$a$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/ktor/utils/io/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final b:Lm7/e;

.field private c:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lm7/e;)V
    .locals 3

    .prologue
    const-string v0, "continuation"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/ktor/utils/io/a$a$d;->b:Lm7/e;

    invoke-static {}, Lio/ktor/utils/io/c;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ReadTask 0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/ktor/utils/io/a$a$d;->e()Lm7/e;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v2}, LS8/a;->a(I)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Li7/g;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    invoke-virtual {p0, p1}, Lio/ktor/utils/io/a$a$d;->f(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, "read"

    return-object v0
.end method

.method public b(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lio/ktor/utils/io/a$a$e$a;->b(Lio/ktor/utils/io/a$a$e;Ljava/lang/Throwable;)V

    return-void
.end method

.method public c()V
    .locals 0

    invoke-static {p0}, Lio/ktor/utils/io/a$a$e$a;->a(Lio/ktor/utils/io/a$a$e;)V

    return-void
.end method

.method public d()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/a$a$d;->c:Ljava/lang/Throwable;

    return-object v0
.end method

.method public e()Lm7/e;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/a$a$d;->b:Lm7/e;

    return-object v0
.end method

.method public f(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lio/ktor/utils/io/a$a$d;->c:Ljava/lang/Throwable;

    return-void
.end method
