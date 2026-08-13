.class final Lb1/e$a;
.super LB7/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic b:Lb1/e;


# direct methods
.method public constructor <init>(Lb1/e;Lb1/r;)V
    .locals 1

    const-string v0, "initialValue"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lb1/e$a;->b:Lb1/e;

    invoke-direct {p0, p2}, LB7/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(LF7/k;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lb1/r;

    check-cast p3, Lb1/r;

    invoke-virtual {p0, p1, p2, p3}, Lb1/e$a;->e(LF7/k;Lb1/r;Lb1/r;)V

    return-void
.end method

.method protected e(LF7/k;Lb1/r;Lb1/r;)V
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oldValue"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "newValue"

    invoke-static {p3, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lb1/e$a;->b:Lb1/e;

    invoke-virtual {p2}, Lb1/e;->b()Li1/f;

    move-result-object p2

    invoke-interface {p1}, LF7/b;->getName()Ljava/lang/String;

    move-result-object p1

    check-cast p3, Lb1/s;

    invoke-virtual {p3}, Lb1/s;->a()Li1/c;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Li1/b;->k0(Ljava/lang/String;Li1/c;)V

    return-void
.end method
