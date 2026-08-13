.class public final Lt8/k$b;
.super Lt8/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt8/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt8/k;-><init>()V

    iput-object p1, p0, Lt8/k$b;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LO7/G;)LF8/E;
    .locals 0

    invoke-virtual {p0, p1}, Lt8/k$b;->d(LO7/G;)LH8/h;

    move-result-object p1

    return-object p1
.end method

.method public d(LO7/G;)LH8/h;
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LH8/j;->L0:LH8/j;

    iget-object v0, p0, Lt8/k$b;->c:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lt8/k$b;->c:Ljava/lang/String;

    return-object v0
.end method
