.class public abstract Lo7/l;
.super Lo7/d;
.source "SourceFile"

# interfaces
.implements Ly7/o;


# instance fields
.field private final F:I


# direct methods
.method public constructor <init>(ILm7/e;)V
    .locals 0

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    iput p1, p0, Lo7/l;->F:I

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, Lo7/l;->F:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lo7/a;->z()Lm7/e;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Ly7/P;->l(Ly7/o;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "renderLambdaToString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lo7/a;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
