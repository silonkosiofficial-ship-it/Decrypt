.class public final LN4/o$a;
.super LN4/n$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, LN4/o$a;-><init>(I)V

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, LN4/n$a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public varargs e([Ljava/lang/Object;)LN4/o$a;
    .locals 0

    invoke-super {p0, p1}, LN4/n$a;->b([Ljava/lang/Object;)LN4/n$b;

    return-object p0
.end method

.method public f()LN4/o;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LN4/n$a;->c:Z

    iget-object v0, p0, LN4/n$a;->a:[Ljava/lang/Object;

    iget v1, p0, LN4/n$a;->b:I

    invoke-static {v0, v1}, LN4/o;->s([Ljava/lang/Object;I)LN4/o;

    move-result-object v0

    return-object v0
.end method
