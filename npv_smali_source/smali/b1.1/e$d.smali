.class public final Lb1/e$d;
.super LB7/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb1/e;-><init>(Ljava/lang/Object;Li1/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lb1/e;


# direct methods
.method constructor <init>(Lb1/e;Lb1/C;)V
    .locals 0

    iput-object p1, p0, Lb1/e$d;->b:Lb1/e;

    invoke-direct {p0, p2}, LB7/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(LF7/k;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lb1/C;

    check-cast p3, Lb1/C;

    invoke-virtual {p0, p1, p2, p3}, Lb1/e$d;->e(LF7/k;Lb1/C;Lb1/C;)V

    return-void
.end method

.method protected e(LF7/k;Lb1/C;Lb1/C;)V
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oldValue"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "newValue"

    invoke-static {p3, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lb1/e$d;->b:Lb1/e;

    invoke-virtual {p2}, Lb1/e;->b()Li1/f;

    move-result-object p2

    invoke-interface {p1}, LF7/b;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Lb1/C;->b()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Li1/b;->m0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
