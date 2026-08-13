.class final Lt8/h$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt8/h;->b(Ljava/util/List;LO7/G;LL7/h;)Lt8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LL7/h;


# direct methods
.method constructor <init>(LL7/h;)V
    .locals 0

    iput-object p1, p0, Lt8/h$a;->D:LL7/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/G;)LF8/E;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/G;->t()LL7/g;

    move-result-object p1

    iget-object v0, p0, Lt8/h$a;->D:LL7/h;

    invoke-virtual {p1, v0}, LL7/g;->O(LL7/h;)LF8/M;

    move-result-object p1

    const-string v0, "getPrimitiveArrayKotlinType(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/G;

    invoke-virtual {p0, p1}, Lt8/h$a;->a(LO7/G;)LF8/E;

    move-result-object p1

    return-object p1
.end method
