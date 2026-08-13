.class final LG8/u$a$d;
.super LG8/u$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG8/u$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LG8/u$a;-><init>(Ljava/lang/String;ILy7/k;)V

    return-void
.end method


# virtual methods
.method public g(LF8/t0;)LG8/u$a;
    .locals 1

    .prologue
    const-string v0, "nextType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LG8/u$a;->i(LF8/t0;)LG8/u$a;

    move-result-object p1

    sget-object v0, LG8/u$a;->D:LG8/u$a;

    if-ne p1, v0, :cond_0

    move-object p1, p0

    :cond_0
    return-object p1
.end method
