.class public LN5/m;
.super LN5/k;
.source "SourceFile"


# instance fields
.field private final D:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p2}, LN5/k;-><init>(Ljava/lang/String;)V

    iput p1, p0, LN5/m;->D:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;LN5/k$a;)V
    .locals 0

    invoke-direct {p0, p2, p3}, LN5/k;-><init>(Ljava/lang/String;LN5/k$a;)V

    iput p1, p0, LN5/m;->D:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p2, p3}, LN5/k;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput p1, p0, LN5/m;->D:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LN5/k$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LN5/k;-><init>(Ljava/lang/String;LN5/k$a;)V

    const/4 p1, -0x1

    iput p1, p0, LN5/m;->D:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LN5/m;->D:I

    return v0
.end method
