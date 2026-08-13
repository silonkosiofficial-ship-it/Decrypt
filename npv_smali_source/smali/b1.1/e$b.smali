.class final Lb1/e$b;
.super LB7/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final b:Ljava/lang/String;

.field final synthetic c:Lb1/e;


# direct methods
.method private constructor <init>(Lb1/e;FLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lb1/e$b;->c:Lb1/e;

    invoke-static {p2}, LY0/i;->m(F)LY0/i;

    move-result-object p1

    invoke-direct {p0, p1}, LB7/b;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lb1/e$b;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lb1/e;FLjava/lang/String;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x2

    const/4 p5, 0x0

    if-eqz p4, :cond_0

    move-object p3, p5

    :cond_0
    invoke-direct {p0, p1, p2, p3, p5}, Lb1/e$b;-><init>(Lb1/e;FLjava/lang/String;Ly7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(Lb1/e;FLjava/lang/String;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lb1/e$b;-><init>(Lb1/e;FLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(LF7/k;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LY0/i;

    invoke-virtual {p2}, LY0/i;->v()F

    move-result p2

    check-cast p3, LY0/i;

    invoke-virtual {p3}, LY0/i;->v()F

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lb1/e$b;->e(LF7/k;FF)V

    return-void
.end method

.method protected e(LF7/k;FF)V
    .locals 1

    .prologue
    const-string p2, "property"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lb1/e$b;->c:Lb1/e;

    invoke-virtual {p2}, Lb1/e;->b()Li1/f;

    move-result-object p2

    iget-object v0, p0, Lb1/e$b;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-interface {p1}, LF7/b;->getName()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {p2, v0, p3}, Li1/b;->l0(Ljava/lang/String;F)V

    :cond_1
    return-void
.end method
