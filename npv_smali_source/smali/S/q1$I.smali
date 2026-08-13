.class final LS/q1$I;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->b0(IIZLV/n;II)LS/t1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:I

.field final synthetic E:I

.field final synthetic F:Z


# direct methods
.method constructor <init>(IIZ)V
    .locals 0

    iput p1, p0, LS/q1$I;->D:I

    iput p2, p0, LS/q1$I;->E:I

    iput-boolean p3, p0, LS/q1$I;->F:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LS/u1;
    .locals 4

    new-instance v0, LS/u1;

    iget v1, p0, LS/q1$I;->D:I

    iget v2, p0, LS/q1$I;->E:I

    iget-boolean v3, p0, LS/q1$I;->F:Z

    invoke-direct {v0, v1, v2, v3}, LS/u1;-><init>(IIZ)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/q1$I;->a()LS/u1;

    move-result-object v0

    return-object v0
.end method
