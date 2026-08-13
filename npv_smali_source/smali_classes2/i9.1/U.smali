.class final Li9/U;
.super Li9/S$b;
.source "SourceFile"


# instance fields
.field private final b:C

.field private final c:I


# direct methods
.method public constructor <init>(CI)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li9/S$b;-><init>(Ly7/k;)V

    iput-char p1, p0, Li9/U;->b:C

    iput p2, p0, Li9/U;->c:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Li9/U;->c:I

    return v0
.end method

.method public b()C
    .locals 1

    iget-char v0, p0, Li9/U;->b:C

    return v0
.end method
