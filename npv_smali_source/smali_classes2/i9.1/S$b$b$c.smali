.class public final Li9/S$b$b$c;
.super Li9/S$b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/S$b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final b:I

.field private final c:C


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li9/S$b$b;-><init>(Ly7/k;)V

    iput p1, p0, Li9/S$b$b$c;->b:I

    const/16 p1, 0x78

    iput-char p1, p0, Li9/S$b$b$c;->c:C

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Li9/S$b$b$c;->b:I

    return v0
.end method

.method public b()C
    .locals 1

    iget-char v0, p0, Li9/S$b$b$c;->c:C

    return v0
.end method

.method public c(Li9/o$e;)V
    .locals 4

    .prologue
    const-string v0, "builder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Li9/S$b$b$c;->a()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x3

    if-eq v0, v3, :cond_0

    const/4 v3, 0x4

    if-eq v0, v3, :cond_2

    const/4 v3, 0x5

    if-ne v0, v3, :cond_1

    :cond_0
    invoke-virtual {p0, p1, v2, v1}, Li9/S$b$b;->d(Li9/o$e;ZZ)V

    goto :goto_0

    :cond_1
    invoke-static {p0}, Li9/T;->e(Li9/S$b;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {p0, p1, v2, v2}, Li9/S$b$b;->d(Li9/o$e;ZZ)V

    :goto_0
    return-void
.end method

.method public e()Li9/b0;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li9/S$b$b$c;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Li9/b0;->D:Li9/b0;

    goto :goto_0

    :cond_0
    sget-object v0, Li9/b0;->E:Li9/b0;

    :goto_0
    return-object v0
.end method

.method public f()Li9/b0;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li9/S$b$b$c;->a()I

    move-result v0

    const/4 v1, 0x3

    if-gt v0, v1, :cond_0

    sget-object v0, Li9/b0;->C:Li9/b0;

    goto :goto_0

    :cond_0
    sget-object v0, Li9/b0;->D:Li9/b0;

    :goto_0
    return-object v0
.end method
