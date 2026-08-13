.class public final Li9/S$b$a$r;
.super Li9/S$b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/S$b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "r"
.end annotation


# instance fields
.field private final b:I

.field private final c:C


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li9/S$b$a;-><init>(Ly7/k;)V

    iput p1, p0, Li9/S$b$a$r;->b:I

    const/16 p1, 0x75

    iput-char p1, p0, Li9/S$b$a$r;->c:C

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Li9/S$b$a$r;->b:I

    return v0
.end method

.method public b()C
    .locals 1

    iget-char v0, p0, Li9/S$b$a$r;->c:C

    return v0
.end method

.method public c(Li9/o$a;)V
    .locals 2

    .prologue
    const-string v0, "builder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Li9/S$b$a$r;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object v0, Li9/K;->D:Li9/K;

    :goto_0
    invoke-interface {p1, v0}, Li9/o$a;->b(Li9/K;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Li9/S$b$a$r;->a()I

    move-result p1

    invoke-static {p0, p1}, Li9/T;->g(Li9/S$b;I)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p0}, Li9/S$b$a$r;->a()I

    move-result p1

    invoke-static {p0, p1}, Li9/T;->g(Li9/S$b;I)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_2
    const/16 v0, 0x7d0

    invoke-interface {p1, v0}, Li9/o$a;->q(I)V

    goto :goto_1

    :cond_3
    sget-object v0, Li9/K;->C:Li9/K;

    goto :goto_0

    :goto_1
    return-void
.end method
