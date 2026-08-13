.class public final Li9/S$b$a$e;
.super Li9/S$b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/S$b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private final b:I

.field private final c:C


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li9/S$b$a;-><init>(Ly7/k;)V

    iput p1, p0, Li9/S$b$a$e;->b:I

    const/16 p1, 0x44

    iput-char p1, p0, Li9/S$b$a$e;->c:C

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Li9/S$b$a$e;->b:I

    return v0
.end method

.method public b()C
    .locals 1

    iget-char v0, p0, Li9/S$b$a$e;->c:C

    return v0
.end method

.method public bridge synthetic c(Li9/o$a;)V
    .locals 0

    invoke-virtual {p0, p1}, Li9/S$b$a$e;->d(Li9/o$a;)Ljava/lang/Void;

    return-void
.end method

.method public d(Li9/o$a;)Ljava/lang/Void;
    .locals 2

    const-string v0, "builder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x2

    const-string v1, "day-of-year"

    invoke-static {v1, p1, v0, p1}, Li9/T;->o(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method
