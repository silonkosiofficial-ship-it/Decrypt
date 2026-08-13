.class public final Li9/S$b$b$a;
.super Li9/S$b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/S$b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final b:I

.field private final c:C


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li9/S$b$b;-><init>(Ly7/k;)V

    iput p1, p0, Li9/S$b$b$a;->b:I

    const/16 p1, 0x4f

    iput-char p1, p0, Li9/S$b$b$a;->c:C

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Li9/S$b$b$a;->b:I

    return v0
.end method

.method public b()C
    .locals 1

    iget-char v0, p0, Li9/S$b$b$a;->c:C

    return v0
.end method

.method public bridge synthetic c(Li9/o$e;)V
    .locals 0

    invoke-virtual {p0, p1}, Li9/S$b$b$a;->g(Li9/o$e;)Ljava/lang/Void;

    return-void
.end method

.method public e()Li9/b0;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Li9/T;->k(Li9/S$b;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public f()Li9/b0;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Li9/T;->k(Li9/S$b;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public g(Li9/o$e;)Ljava/lang/Void;
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0, p1}, Li9/T;->k(Li9/S$b;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method
