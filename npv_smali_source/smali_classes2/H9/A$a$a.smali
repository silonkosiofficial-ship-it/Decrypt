.class public final LH9/A$a$a;
.super LH9/A;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH9/A$a;->a([BLH9/w;II)LH9/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:LH9/w;

.field final synthetic c:I

.field final synthetic d:[B

.field final synthetic e:I


# direct methods
.method constructor <init>(LH9/w;I[BI)V
    .locals 0

    iput-object p1, p0, LH9/A$a$a;->b:LH9/w;

    iput p2, p0, LH9/A$a$a;->c:I

    iput-object p3, p0, LH9/A$a$a;->d:[B

    iput p4, p0, LH9/A$a$a;->e:I

    invoke-direct {p0}, LH9/A;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget v0, p0, LH9/A$a$a;->c:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public b()LH9/w;
    .locals 1

    iget-object v0, p0, LH9/A$a$a;->b:LH9/w;

    return-object v0
.end method

.method public e(LX9/e;)V
    .locals 3

    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LH9/A$a$a;->d:[B

    iget v1, p0, LH9/A$a$a;->e:I

    iget v2, p0, LH9/A$a$a;->c:I

    invoke-interface {p1, v0, v1, v2}, LX9/e;->write([BII)LX9/e;

    return-void
.end method
