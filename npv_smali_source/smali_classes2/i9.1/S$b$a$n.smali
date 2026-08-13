.class public final Li9/S$b$a$n;
.super Li9/S$b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/S$b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "n"
.end annotation


# instance fields
.field private final b:I

.field private final c:C


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li9/S$b$a;-><init>(Ly7/k;)V

    iput p1, p0, Li9/S$b$a$n;->b:I

    const/16 p1, 0x71

    iput-char p1, p0, Li9/S$b$a$n;->c:C

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Li9/S$b$a$n;->b:I

    return v0
.end method

.method public b()C
    .locals 1

    iget-char v0, p0, Li9/S$b$a$n;->c:C

    return v0
.end method

.method public c(Li9/o$a;)V
    .locals 3

    .prologue
    const-string v0, "builder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Li9/S$b$a$n;->a()I

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v1, :cond_1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    invoke-static {p0}, Li9/T;->e(Li9/S$b;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_0
    invoke-static {p0, v2, v1, v2}, Li9/T;->k(Li9/S$b;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_1
    const-string p1, "standalone-quarter-of-year"

    invoke-static {p1, v2, v0, v2}, Li9/T;->o(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method
